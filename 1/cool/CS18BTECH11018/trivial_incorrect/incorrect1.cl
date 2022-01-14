class Main inherits IO {
	Id: String <- "Hello"; --object identifier Id starts with capitals

    main() : Object {
		{
		    out_string(Id);
		    out_string("\n");
		}
    };
};

--"incorrect1.cl", line 2: syntax error at or near TYPEID = Id
--"incorrect1.cl", line 6: syntax error at or near TYPEID = Id
--Compilation halted due to lex and parse errors
