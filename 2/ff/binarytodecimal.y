%{
#include<stdio.h>
#include<stdlib.h>
void yyerror(char *s);
%}

%union{
	double val;
}
%token ZERO ONE DOT
%type <val> L B R N
%%
N: L DOT R  {$$=$1+$3;printf("%lf\n",$$);}
| L {printf("%lf\n",$$);};
L: L B {$$=$1*2+$2;}
| B {$$=$1;};
R : B R{$$=$1/2+$2/2;} 
| B{$$=$1/2;}
B:ZERO {$$=0;}
|ONE {$$=1;};
%%
int main()
{
while(yyparse());
}
yyerror(char *s)
{
fprintf(stdout,"\n%s",s);
}