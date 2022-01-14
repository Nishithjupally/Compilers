class Main inherits IO {
	n: Int <- 0;
	
    factorial(x : Int) : Int {
    	if(x=0) then 1
    	else x*factorial(x-1)
    	fi
    };

    main() : Object {
		{
		    out_string("Factorial of a number\n");
		    out_string("Enter a number :\n");
		    n <- in_int();
		    out_string("Factorial of ");
		    out_int(n);
		    out_string(" is ");
		  	out_int(factorial(n));
		    out_string("\n");
		}
    };
};