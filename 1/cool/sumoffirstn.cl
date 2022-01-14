class Main inherits IO {
	input: Int <- 0;
    sumn(x : Int) : Int {
    	if(x=1) then 1
    	else x*x+sumn(x-1)
    	fi
    };

    main() : Object {
		{
		    out_string("Sum of first N numbers\n");
		    out_string("Enter a N :");
		    input <- in_int();
		    out_string("Sum  = ");
		  	out_int(sumn(input));
		    out_string("\n");
		}
    };
};