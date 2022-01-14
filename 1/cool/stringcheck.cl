class Main inherits IO {
	a : Int <-0;
	b : Int <-0;
	n : Int <-0;
	i : Int <-0;
	r : Int <-0;
	s : String <- "1 ";
	s1 : String <- "2";
	--s3 : String <- "";

	modf(i:Int ,j:Int):Int{
    	i-(i/j)*j
    };

    powers(x:Int ,y:Int):Int{
    	if(y=0) then 1
    	else x*powers(x,y-1)
    	fi
    };

    binary(x : Int, y: Int):Int{{
    	while(r<x) loop{
    		b <- modf(x,10);
    		x <- x/10;
    		y <- y + b*powers(2,i);
    		i <- i+1;

    	}
    	pool;
    	y;

    }};

    main() : Object {
		{
            --out_string(s.concat(s1));
		    out_string("1.Binary to decimal conversion \n");
            out_string("2.Decimal to binary conversion \n");

		    out_string("Enter the binary numeber :");
		    n <- in_int();
		    out_string("Decimal equivalent number = ");
		  	out_int(binary(n,0));
		    out_string("\n");
		}
    };
 };   