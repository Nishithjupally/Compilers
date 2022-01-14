class Main inherits IO {

	Str : String <- " Incorrect part - 1\n";
			-- In the above the Identifier should not start with a capital letter
			-- Unless it's a keyword
	Num : Int <- 0
			--Same explaination as the above

	main() : Object {
		{
		out_string(Str);    
		out_int(Num);
		}
	};
};