Readme File for assignment 3 - OS

Teammembers:CS18BTECH11018,CS18BTECH11033.

This file contains information regarding files submitted and how to compile them.

Number of files submitted:4
1.mykmod_main.c
2.memutil.cpp
3.readme.txt
4.report.pdf

This files are zipped into a file CS18BTECH11018,CS18BTECH11033.tar.xz file and submitted.

To compile:
Go to 99_devmmap_paging directory i.e.
[root@cs3523 ~]# cd 99_devmmap_paging

Then enter 'make' to compile .
[root@cs3523 99_devmmap_paging]# make

To check a case:

[root@cs3523 99_devmmap_paging]# ./util/memutil [options] <devname>

Options:
--operation <optype> : Where optype can be mapread, mapwrite
--message <message> : Message to be written/read-compare to/from the device memory
--paging <ptype>
: Where ptype can be prefetch or demand
--help
: Show this help 

For instance:
[root@cs3523 99_devmmap_paging]# insmod kernel/mykmod.ko
[root@cs3523 99_devmmap_paging]# grep mykmod /proc/devices
243 mykmod
[root@cs3523 99_devmmap_paging]# mknod /tmp/mydev_pR6 c 243 10
[root@cs3523 99_devmmap_paging]# ./util/memutil /tmp/mydev_pR6 --pt prefetch --op mapread
[root@cs3523 99_devmmap_paging]# dmesg | grep -e mykmod_vm_open -e mykmod_vm_close
[272795.747208] mykmod_vm_open: vma=ffff8bff8ddfe0d8 npagefaults:0
[272795.747698] mykmod_vm_close: vma=ffff8bff8ddfe0d8 npagefaults:256

To run the test script:
[root@cs3523 99_devmmap_paging]# bash runtest.sh

Output:
[root@cs3523 99_devmmap_paging]# bash runtest.sh
PASS - Test 0 : Module loaded with majorno: 243
PASS - Test 1 : Single process reading using mapping
PASS - Test 2 : Single process writing using mapping
PASS - Test 3 : Multiple process reading using mapping
PASS - Test 4 : Multiple process writing using mapping
PASS - Test 5 : One process writing using mapping and other process reading using mapping
PASS - Test 6 : One process writing to one dev and other process reading from another dev


