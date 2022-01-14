class Main inherits IO {
	a : Int <-0;
	b : Int <-0;

	powers(x:Int ,y:Int):Int{
    	if(y=0) then 1
    	else x*powers(x,y-1)
    	fi
    };

    main() : Object {
		{
		    out_string("Calculate a to the power of b \n");
		    out_string("Enter a :");
		    a <- in_int();
		    out_string("Enter b :");
		    b <- in_int();
		    out_string("a to the power of b = ");
		  	out_int(powers(a,b));
		    out_string("\n");
		}
    };
 };   