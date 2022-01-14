class Main inherits IO {
	id: String <- 'Hello'; --string shoud be in double quotes
	str: String <- "Hello2
	                    newline"; --non escape new line is not not allowed

    main() : Object {
		{
		    out_string(id);
		    out_string("\n");
		}
    };
};

--"incorrect2.cl", line 2: syntax error at or near ERROR = '
--"incorrect2.cl", line 4: syntax error at or near ERROR = Unterminated string constant
--Compilation halted due to lex and parse errors
