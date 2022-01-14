class Main inherits IO {
	id: Str ing <- "Hello"; --there shouldn't be whitespaces between keywords

    main() : Object {
		{
		    out_string(id);
		    out_string("\n");
		}
    };
};

--"incorrect5.cl", line 2: syntax error at or near OBJECTID = ing
--Compilation halted due to lex and parse error
