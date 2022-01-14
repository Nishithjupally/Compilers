class Main inherits IO {
	k : String <-- "This is not OK\n";
                          -- first '-' is considered with '<' to form assignment operator
	main() : SELF_TYPE {
		out_string(k)
	};
};