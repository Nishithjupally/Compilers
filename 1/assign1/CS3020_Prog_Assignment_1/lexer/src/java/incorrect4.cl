class Main inherits IO {
	id: Bool <- true;
	id1: Bool <- True; --true/false are case sensitive 
	i: Int <-0;

    main() : Object {
		{
		    if id then i<-1 else i<-2 fi;

		    if id1 then i<-3 else i<-4 fi;
		}
    };
};


--"incorrect4.cl", line 3: syntax error at or near TYPEID = True
--Compilation halted due to lex and parse errors
