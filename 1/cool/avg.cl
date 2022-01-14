
class Main inherits IO {
  main(): Object {{
  	out_string("Maximum element among entered N positive numbers\n");
    out_string("Enter N:\n");
    let average: Int <- 0 in -- stores the average of numbers
    let total : Int <- 0 in  -- stores the sum of numbers
    let maxs : Int <- 0 in
    let temp : Int <-0 in
    let i : Int <-0 in
    let n: Int <- in_int() in -- number of elements
      if n < 0 then
        out_string("Invalid input\n")
      else {
      	out_string("Enter the elements :\n");
      	let loopVar : Int <- 0 in  
	    	(while loopVar < n loop
	    	  {
	    	      out_string("Enter element number ").out_int(loopVar+1);
	    	      out_string("\n");
	    	      temp <- in_int();

	    	      if maxs < temp then maxs<-temp else i<-i+1 fi;

	    	      loopVar <- loopVar + 1;
	    	  }
	    	  pool
	    	);
	    	out_string("The maximum of entered elements is ").out_int(maxs);
	    	out_string("\n");
	   	}
	    fi;
  }};
};