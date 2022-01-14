
class Main inherits IO {
     maxs : Int <- 0; --max element 
     temp : Int <-0;
     i : Int <-0;
     n: Int <- 0;

  main(): Object {
  	  {
	  	  out_string("Maximum element among N positive numbers entered\n");
	      out_string("Enter N:\n");
	      n <- in_int();
	      if n < 0 then
	        out_string("Invalid input\n")
	      else {
	      	out_string("Enter the ");
	      	out_int(n);
	      	out_string(" elements:-\n");
	      	let j : Int <- 0 in  
		    	(while j < n loop
		    	  {
		    	      out_string("Enter element number ");
		    	      out_int(j+1);
		    	      out_string(" :\n");
		    	      temp <- in_int();

		    	      if maxs < temp then maxs<-temp else i<-i+1 fi; --comparison

		    	      j <- j + 1;
		    	  }
		    	  pool
		    	);
		    	out_string("The maximum of entered elements is ").out_int(maxs);
		    	out_string("\n");
		   	}
		    fi;
    }
  };
};