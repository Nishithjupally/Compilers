class Main inherits IO {
	a11 : Int <-0;
	a12 : Int <-0;
	a13 : Int <-0;
	a21 : Int <-0;
	a22 : Int <-0;
	a23 : Int <-0;
	a31 : Int <-0;
	a32 : Int <-0;
	a33 : Int <-0;
	b11 : Int <-0;
	b12 : Int <-0;
	b13 : Int <-0;
	b21 : Int <-0;
	b22 : Int <-0;
	b23 : Int <-0;
	b31 : Int <-0;
	b32 : Int <-0;
	b33 : Int <-0;
    c11 : Int <-0;
	c12 : Int <-0;
	c13 : Int <-0;
	c21 : Int <-0;
	c22 : Int <-0;
	c23 : Int <-0;
	c31 : Int <-0;
	c32 : Int <-0;
	c33 : Int <-0;

    main() : Object {
		{
		    out_string("Multiplication of 3*3 matrices\n");
		    out_string("Matrix 1 :\n");
		    out_string("Enter row 1 :(3 elements)\n");
		    a11 <- in_int();
		    a12 <- in_int();
		    a13 <- in_int();
		    out_string("Enter row 2 :(3 elements)\n");
		    a21 <- in_int();
		    a22 <- in_int();
		    a23 <- in_int();
		    out_string("Enter row 3 :(3 elements)\n");
		    a31 <- in_int();
		    a32 <- in_int();
		    a33 <- in_int();
		    out_string("Matrix 2 :\n");
		    out_string("Enter row 1 :(3 elements)\n");
		    b11 <- in_int();
		    b12 <- in_int();
		    b13 <- in_int();
		    out_string("Enter row 2 :(3 elements)\n");
		    b21 <- in_int();
		    b22 <- in_int();
		    b23 <- in_int();
		    out_string("Enter row 3 :(3 elements)\n");
		    b31 <- in_int();
		    b32 <- in_int();
		    b33 <- in_int();

		   

			c11 <- a11*b11 + a12*b21 + a13*b31;
			c12 <- a11*b12 + a12*b22 + a13*b32;
			c13 <- a11*b13 + a12*b23 + a13*b33;
			c21 <- a21*b11 + a22*b21 + a23*b31;
			c22 <- a21*b12 + a22*b22 + a23*b32;
			c23 <- a21*b23 + a22*b23 + a23*b33;
			c31 <- a31*b11 + a32*b21 + a33*b31;
			c32 <- a31*b12 + a32*b22 + a33*b32;
			c33 <- a31*b13 + a32*b23 + a33*b33;

			out_string("Product matrix :\n");
			out_int(c11);
			out_string(" ");
			out_int(c12);
			out_string(" ");
			out_int(c13);
			out_string("\n");
			out_int(c21);
			out_string(" ");
			out_int(c22);
			out_string(" ");
			out_int(c23);
			out_string("\n");
			out_int(c31);
			out_string(" ");
			out_int(c32);
			out_string(" ");
			out_int(c33);
			out_string("\n");
		}
    };
 };   