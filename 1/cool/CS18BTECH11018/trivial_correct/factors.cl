class Main inherits IO {
	a : Int <-0;
	b : Int <-1;

	modf(i:Int ,j:Int):Int{ --computes modulus
    	i-(i/j)*j
    };

    main() : Object {
		{
		    out_string("Determine factors of N \n");
		    out_string("Enter N :");
		    a <- in_int();
		    out_string("Factors of N = ");
		  	while(b <=a) loop{
		  		if(modf(a,b)=0) then{ --check all numbers less than a
		  			out_int(b);
		  			out_string(" ");
		  			b<-b+1;
		  		}
		  		else {
		  		b <- b+1;
		    	}
		  		fi;
		  	}
		  	pool;
		    out_string("\n");
		}
    };
 };   