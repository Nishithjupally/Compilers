class Main inherits IO {
	id: String <- "Hello"; 

    main() : Object {
		{
		    - out_string(id); --requires 2 dashes for comment
		   -- out_string("\n");
		}
    };
};


--"incorrect3.cl", line 6: syntax error at or near '-'
-- Compilation halted due to lex and parse errors
