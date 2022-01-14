class Main inherits IO {
	n: Int <- 0;
	
    sumnsq(x : Int) : Int { --computes sum of squares of 1st num
    	if(x=1) then 1
    	else x*x+sumnsq(x-1)
    	fi
    };

    main() : Object { --input
		{
		    out_string("Sum of squares first N numbers\n");
		    out_string("Enter a N :");
		    n <- in_int();
		    out_string("Sum of squares of natural numbers upto ");
		    out_int(n);
		    out_string(" is ");
		  	out_int(sumnsq(n));
		    out_string("\n");
		}
    };
};