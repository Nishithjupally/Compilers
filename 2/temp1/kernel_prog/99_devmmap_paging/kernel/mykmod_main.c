#include <linux/uaccess.h>
#include <linux/fs.h>
#include <linux/module.h>
#include <linux/slab.h>
#include <linux/mm.h>
#include <mydev.h>

MODULE_DESCRIPTION("My kernel module - mykmod");
MODULE_AUTHOR("maruthisi.inukonda [at] gmail.com");
MODULE_LICENSE("GPL");

// Dynamically allocate major no
#define MYKMOD_MAX_DEVS 256
#define MYKMOD_DEV_MAJOR 0

static int mykmod_init_module(void);
static void mykmod_cleanup_module(void);

static int mykmod_open(struct inode *inode, struct file *filp);
static int mykmod_close(struct inode *inode, struct file *filp);
static int mykmod_mmap(struct file *filp, struct vm_area_struct *vma);

module_init(mykmod_init_module);
module_exit(mykmod_cleanup_module);

static struct file_operations mykmod_fops = {
	.owner = THIS_MODULE,	/* owner (struct module *) */
	.open = mykmod_open,	/* open */
	.release = mykmod_close,	/* release */
	.mmap = mykmod_mmap,	/* mmap */
};

static void mykmod_vm_open(struct vm_area_struct *vma);
static void mykmod_vm_close(struct vm_area_struct *vma);
static int mykmod_vm_fault(struct vm_area_struct *vma, struct vm_fault *vmf);

// TODO Data-structure to keep per device info 
struct mykmod_dev_info {
	char *data;
	size_t size;
	unsigned long *pageindex;
};

// TODO Device table data-structure to keep all devices
static struct mykmod_device_table {
	unsigned long int device_count;
	unsigned long int *devices;
};

struct mykmod_device_table *device_table;

// TODO Data-structure to keep per VMA info 
struct mykmod_virt_data {
	unsigned long int npagefaults;
	struct mykmod_dev_info *device;
};

static const struct vm_operations_struct mykmod_vm_ops = {
	.open = mykmod_vm_open,
	.close = mykmod_vm_close,
	.fault = mykmod_vm_fault
};

int mykmod_major;

static int mykmod_init_module(void)
{
	printk("mykmod loaded\n");
	printk("mykmod initialized at=%p\n", init_module);

	if ((mykmod_major =
	     register_chrdev(MYKMOD_DEV_MAJOR, "mykmod", &mykmod_fops)) < 0) {
		printk(KERN_WARNING "Failed to register character device\n");
		return 1;
	} else {
		printk("register character device %d\n", mykmod_major);
	}
	// TODO initialize device table
	device_table = (struct mykmod_device_table *)
	    kmalloc(sizeof(struct mykmod_device_table), GFP_KERNEL);
	device_table->devices =
	    (unsigned long int *)kzalloc(sizeof(unsigned long int) * 256,
					 GFP_KERNEL);
	device_table->device_count = 0;

	return 0;
}

static void mykmod_cleanup_module(void)
{
	printk("mykmod unloaded\n");
	unregister_chrdev(mykmod_major, "mykmod");
	// TODO free device info structures from device table
	kfree(device_table->devices);
	kfree(device_table);

	return;
}

static int mykmod_open(struct inode *inodep, struct file *filep)
{
	printk("mykmod_open: filep=%p f->private_data=%p "
	       "inodep=%p i_private=%p i_rdev=%x maj:%d min:%d\n",
	       filep, filep->private_data,
	       inodep, inodep->i_private, inodep->i_rdev, MAJOR(inodep->i_rdev),
	       MINOR(inodep->i_rdev));
	// TODO: Allocate memory for devinfo and store in device table and i_private.
	if (inodep->i_private == NULL) {
		struct mykmod_dev_info *info;
		info = (struct mykmod_dev_info *)
		    kmalloc(sizeof(struct mykmod_dev_info), GFP_KERNEL);
		info->data = (char *)kmalloc(MYDEV_LEN, GFP_KERNEL);
		info->size = MYDEV_LEN;
		inodep->i_private = info;
		*((device_table->devices) + (device_table->device_count)) =
		    (unsigned long int)info;
		device_table->device_count = device_table->device_count + 1;
	}
	// Store device info in file's private_data aswell
	filep->private_data = inodep->i_private;
	return 0;
}

static int mykmod_close(struct inode *inodep, struct file *filep)
{
	// TODO: Release memory allocated for data-structures.
	printk("mykmod_close: inodep=%p filep=%p\n", inodep, filep);
	return 0;
}

static int mykmod_mmap(struct file *filp, struct vm_area_struct *vma)
{
	size_t size;
	struct mykmod_virt_data *vm_dev;
	printk("mykmod_mmap: filp=%p vma=%p flags=%lx\n", filp, vma,
	       vma->vm_flags);
	//TODO setup vma's flags, save private data (devinfo, npagefaults) in vm_private_data
	vma->vm_ops = &mykmod_vm_ops;
	vma->vm_flags |= VM_DONTEXPAND | VM_DONTDUMP;
	vm_dev = kmalloc(sizeof(struct mykmod_virt_data), GFP_KERNEL);
	size = vma->vm_end - vma->vm_start;
	vm_dev->npagefaults = 0;
	vm_dev->device = (struct mykmod_dev_info *)(filp->private_data);
	vma->vm_private_data = vm_dev;
	mykmod_vm_open(vma);
	// Remove this once mmap is implemented.
	return 0;
}

static void mykmod_vm_open(struct vm_area_struct *vma)
{
	struct mykmod_virt_data *vm_dev;
	vm_dev = (struct mykmod_virt_data *)vma->vm_private_data;
	vm_dev->npagefaults = 0;
	printk("mykmod_vm_open: vma=%p npagefaults:%lu\n", vma,
	       vm_dev->npagefaults);
}

static void mykmod_vm_close(struct vm_area_struct *vma)
{
	struct mykmod_virt_data *vm_dev;
	vm_dev = (struct mykmod_virt_data *)vma->vm_private_data;
	printk("mykmod_vm_close: vma=%p npagefaults:%lu\n", vma,
	       vm_dev->npagefaults);
	vm_dev->npagefaults = 0;
	kfree(vm_dev);
}

static int mykmod_vm_fault(struct vm_area_struct *vma, struct vm_fault *vmf)
{
	struct page *pg;
	struct mykmod_virt_data *vm_dev;
	struct mykmod_dev_info *info;
	unsigned long address;
	unsigned long offset;
	unsigned long vm_address;
	int *pgflt;
	printk("mykmod_vm_fault: vma=%p vmf=%p pgoff=%lu page=%p\n", vma, vmf,
	       vmf->pgoff, vmf->page);
	vm_dev = (struct mykmod_virt_data *)vma->vm_private_data;
	info = (struct mykmod_dev_info *)vm_dev->device;
	pgflt = (int *)(&vm_dev->npagefaults);
	vm_address = (unsigned long)(info->data);
	offset = (unsigned long)(vmf->pgoff << PAGE_SHIFT);
	address = vm_address + offset;
	pg = virt_to_page(address);
	get_page(pg);
	vmf->page = pg;
	*pgflt = *pgflt + 1;
	return 0;
}
