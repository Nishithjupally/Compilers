class Main inherits IO {
	a : Int <-0;
	b : Int <-0;

	modf(i:Int ,j:Int):Int{ --modulus function
    	i-(i/j)*j
    };

	gcdf(x:Int ,y:Int):Int{ --gcd function
    	if(y=0) then x
    	else gcdf(y,modf(x,y))
    	fi
    };

    main() : Object {
		{
		    out_string("Calculate GCD of a and b \n");
		    out_string("Enter a :");
		    a <- in_int();
		    out_string("Enter b :");
		    b <- in_int();
		    out_string("GCD of a and b = ");
		  	out_int(gcdf(a,b));
		    out_string("\n");
		}
    };
 };   