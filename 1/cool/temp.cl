class Main inherits IO {
    a : Int <-0;
    b : Int <-0;
    n : Int <-0;
    i2 : Int <-0;
    i1 : Int <-1;
    r : Int <-0;
    flag : Int<-0;
    b1 : Int<-0;
    str1 : String <- " ";
    temp : Int <- 0;

    modf(i:Int ,j:Int):Int{
        i-(i/j)*j
    };

    powers(x:Int ,y:Int):Int{
        if(y=0) then 1
        else x*powers(x,y-1)
        fi
    };

    binary(x : Int, y: Int):Int{{
        while(r<x) loop{
            b <- modf(x,10);
            x <- x/10;
            y <- y + b*powers(2,i2);
            i2 <- i2+1;

        }
        pool;
        y;

    }};

    decimal(p : Int,q:Int):Int{{
        while(r<p) loop{
            b1 <- modf(p,2);
            p <- p/2;
            q <- q + b1*i1;
            i1 <- i1*10;

        }
        pool;
        q;
    }};  

    hexa(p1:Int,q1: String):String{{
        while(r<p1) loop{
            b1 <- modf(p1,16);
            p1 <- p1/16;
            if(b1 = 0) then{
                q1 <- "0".concat(q1);
            }
            else if(b1 = 1) then{
                q1 <- "1".concat(q1);
            }
            else if(b1 = 2) then{
                q1 <- "2".concat(q1);
            }
            else if(b1 = 3) then{
                q1 <- "3".concat(q1);
            }
            else if(b1 = 4) then{
                q1 <- "4".concat(q1);
            }
            else if(b1 = 5) then{
                q1 <- "5".concat(q1);
            }
            else if(b1 = 6) then{
                q1 <- "6".concat(q1);
            }
            else if(b1 = 7) then{
                q1 <- "7".concat(q1);
            }
            else if(b1 = 8) then{
                q1 <-"8".concat(q1);
            }
            else if(b1 = 9) then{
                q1 <- "9".concat(q1);
            }
            else if(b1 = 10) then{
                q1 <- "A".concat(q1);
            }
            else if(b1 = 11) then{
                q1 <- "B".concat(q1);
            }
            else if(b1 = 12) then{
                q1 <- "C".concat(q1);
            }
            else if(b1 = 13) then{
                q1 <- "D".concat(q1);
            }
            else if(b1 = 14) then{
                q1 <- "E".concat(q1);
            }
            else {
                q1 <- "F".concat(q1);
            }
            fi fi fi fi fi fi fi fi fi fi fi fi fi fi fi;
            
        }
        pool;
        q1;

        }};

    hexadeci(s : String, ans : Int):Int{{
        temp <- s.length()-1;
        while(r<=temp) loop{
            if(s.substr(i2,1)="0") then{
                ans <- ans + 0*powers(16,temp);
            }
            else if(s.substr(i2,1)="1") then{
                ans <- ans + 1*powers(16,temp);
            }
            else if(s.substr(i2,1)="2") then{
                ans <- ans + 2*powers(16,temp);
            }
            else if(s.substr(i2,1)="3") then{
                ans <- ans + 3*powers(16,temp);
            }
            else if(s.substr(i2,1)="4") then{
                ans <- ans + 4*powers(16,temp);
            }
            else if(s.substr(i2,1)="5") then{
                ans <- ans + 5*powers(16,temp);
            }
            else if(s.substr(i2,1)="6") then{
                ans <- ans + 6*powers(16,temp);
            }
            else if(s.substr(i2,1)="7") then{
                ans <- ans + 7*powers(16,temp);
            }
            else if(s.substr(i2,1)="8") then{
                ans <- ans + 8*powers(16,temp);
            }
            else if(s.substr(i2,1)="9") then{
                ans <- ans + 9*powers(16,temp);
            }
            else if(s.substr(i2,1)="A") then{
                ans <- ans + 10*powers(16,temp);
            }
            else if(s.substr(i2,1)="B") then{
                ans <- ans + 11*powers(16,temp);
            }
            else if(s.substr(i2,1)="C") then{
                ans <- ans + 12*powers(16,temp);
            }
            else if(s.substr(i2,1)="D") then{
                ans <- ans + 13*powers(16,temp);
            }
            else if(s.substr(i2,1)="E") then{
                ans <- ans + 14*powers(16,temp);
            }
            else{
                ans <- ans + 15*powers(16,temp);
            }
            fi fi fi fi fi fi fi fi fi fi fi fi fi fi fi;

            temp <- temp -1;
            i2 <- i2 + 1;
        }
        pool;
        ans;


        }};

    main() : Object {
        {
            out_string("Choose an operation(Choose the number)\n");
            out_string("1.Binary to decimal conversion \n");
            out_string("2.Decimal to binary conversion \n");
            out_string("3.Decimal to Hexa-decimal conversion \n");
            out_string("4.Hexa-Decimal to Decimal conversion \n");
            flag <- in_int();
            if(flag = 1) then{
                out_string("Binary to decimal conversion \n");
                out_string("Enter the binary number :");
                n <- in_int();
                out_string("Equivalent decimal number = ");
                out_int(binary(n,0));
                out_string("\n");
            }
            else if(flag =2) then{
                out_string("Decimal to binary conversion \n");
                out_string("Enter the decimal number :");
                n <- in_int();
                out_string("Equivalent binary number = ");
                out_int(decimal(n,0));
                out_string("\n");
            }
            else if(flag = 3)then{
                out_string("Decimal to Hexa-decimal conversion \n");
                out_string("Enter the decimal number :");
                n <- in_int();
                out_string("Equivalent hexadecimal number = ");
                out_string(hexa(n," "));
                out_string("\n");

            }
            else{
                out_string("Hexa-Decimal to Decimal conversion \n");
                out_string("Enter the Hexa-decimal number :");
                str1 <- in_string();
                out_string("Equivalent decimal number = ");
                out_int(hexadeci(str1,0));
                out_string("\n");


            }
            fi fi fi;

            
        }
    };
 };   