lexer grammar cup_lexer;

tokens{
	VOID,
	CONST,
	DEFAULT,
	QUESTION,
	RESTRICT,
	CONTINUE,
	RETURN,
	BREAK,
	TYPEDEF,
	EXTERN,
	STATIC,
	INT,
	FLOAT,
	DOUBLE,
	CHAR,
	BOOL,
	LONG,
	ERROR,
	IDENTIFIER,
	STRING,

	BOOL_CONST,
	STRING_LITERAL,
	INTEGER_CONST,
	FLOAT_CONST,
	CHAR_CONST,

	STACK,
	QUEUE,
	VECTOR,	

	UNQ_PTR,
	SHARED_PTR,
	
	LPAREN,
	RPAREN,
	COLON,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	PERCENT,
	PERCENTEQUAL,
	PLUSPLUS,
	MINUSMINUS,
	PLUSEQUAL,
	MINUSEQUAL,
	SLASHEQUAL,
	STAREQUAL,
	TILDE,
	LESS,
	GREATER,
	LESSLESS,
	GREATERGREATER,
	LESSLESSEQUAL,
	GREATERGREATEREQUAL,
	LESSEQUAL,
	GREATEREQUAL,
	EQUAL,
	EQUALEQUAL,
	EXCLAIMEQUAL,
	EXCLAIM,
	LSQR,
	RSQR,
	LBRACE,
	RBRACE,
	DOT,
	ELSE,
	IF,
	DO,
	WHILE,
	CASE,
	SWITCH,
	FOR,
	UNKNOWN,
	AMP,
	PIPE,
	CARET,
	AMPAMP,
	PIPEPIPE,
	AMPEQUAL,
	PIPEEQUAL,
	CARETEQUAL,
	STRUCT,
	ARROW
}


/*
  DO NOT EDIT CODE ABOVE THIS LINE
*/

@members{

	/*
		YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
	*/

	/**
	* Function to report errors.
	* Use this function whenever your lexer encounters any erroneous input
	* DO NOT EDIT THIS FUNCTION
	*/
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}

	public void notFound() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		reportError(text);
	}
	/**
	* Function to check if a string constant with a closing " is valid
	**/
	public void processString() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		//write your code to test strings here

		text = text.substring(0, text.length() -1); 						//extracting text
		StringBuilder xs = new StringBuilder(0);

		for(int i=0;i < text.length();i++){ 

			if(text.charAt(i) == '\u0000'){ 							    //null character in string
				 reportError("String contains null character.");
				 return;
			}
			if(text.charAt(i) == '\\'){
				char iplus1 = text.charAt(i+1);
				if(iplus1 == '\u0000'){
					reportError("String contains escaped null character."); //escaped null character in string
					return;
				}
				if(iplus1 == 'n')
					xs = xs.append("\n");
				else if(iplus1 == 't')
					xs = xs.append("\t");
				else if(iplus1 == 'f')
					xs = xs.append("\f");
				else if(iplus1 == 'b')
					xs = xs.append("\b");
				else if(iplus1 == '\"')
					xs = xs.append('\"');
				else if(iplus1 == '\\')
					xs = xs.append('\\');
				else
					xs = xs.append(iplus1);
				i++;
			}
			else{
				xs = xs.append(text.charAt(i));
			}
		}
		String printstring = xs.toString();
		setText(printstring);
		setType(STRING_LITERAL);
		return;
	}

	/**
	* Function to check if a string constant containing EOF contains null characters
	**/
public void processStringEof() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		//write your code to test strings here

		text = text.substring(0, text.length() -1);
		StringBuilder xs = new StringBuilder(0);

		for(int i=0;i < text.length()-1;i++){

			if(text.charAt(i) == '\u0000'){									//null character in string
				 reportError("String contains null character.");
				 return;
			}
			if(text.charAt(i) == '\\'){
				char iplus1 = text.charAt(i+1);
				if(iplus1 == '\u0000'){										//escaped null character in string
					reportError("String contains escaped null character.");
					return;
				}
				if(iplus1 == 'n')
					xs = xs.append("\n");
				else if(iplus1 == 't')
					xs = xs.append("\t");
				else if(iplus1 == 'f')
					xs = xs.append("\f");
				else if(iplus1 == 'b')
					xs = xs.append("\b");
				else if(iplus1 == '\"')
					xs = xs.append('\"');
				else if(iplus1 == '\\')
					xs = xs.append('\\');
				else
					xs = xs.append(iplus1);
				i++;
			}
			else{
				xs = xs.append(text.charAt(i));
			}
		}
		String printstring = xs.toString();
		if(printstring.length() > 1024){												//string length checking
			reportError("String constant too long");
			return;
		}
		reportError("EOF in string constant");
		return;
	}

	/**
	* Function to check if an unteerminated string constant containing EOF contains null characters
	**/
	public void processStringUnt() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		//write your code to test strings here

		text = text.substring(0, text.length() -1);
		StringBuilder xs = new StringBuilder(0);

		for(int i=0;i < text.length()-1;i++){

			if(text.charAt(i) == '\u0000'){
				 reportError("String contains null character."); 			//null character in string
				 return;
			}
			if(text.charAt(i) == '\\'){
				char iplus1 = text.charAt(i+1);
				if(iplus1 == '\u0000'){
					reportError("String contains escaped null character."); //escaped null character in string
					return;
				}
				if(iplus1 == 'n')
					xs = xs.append("\n");
				else if(iplus1 == 't')
					xs = xs.append("\t");
				else if(iplus1 == 'f')
					xs = xs.append("\f");
				else if(iplus1 == 'b')
					xs = xs.append("\b");
				else if(iplus1 == '\"')
					xs = xs.append('\"');
				else if(iplus1 == '\\')
					xs = xs.append('\\');
				else
					xs = xs.append(iplus1);
				i++;
			}
			else{
				xs = xs.append(text.charAt(i));
			}
		}
		String printstring = xs.toString();
		reportError("Unterminated string constant");
		return;
	}

}


/*
	WRITE ALL LEXER RULES BELOW
*/

ARROW		:'->';
SEMICOLON   : ';';
LPAREN		: '(';
RPAREN		: ')';
COLON		: ':';
COMMA		: ',';
PERCENTEQUAL: '%=';
PLUSEQUAL	: '+=';
MINUSEQUAL  : '-=';
SLASHEQUAL	: '/=';
STAREQUAL   : '*=';
PLUSPLUS	: '++';
MINUSMINUS  : '--';
PERCENT		: '%';
PLUS		: '+';
MINUS		: '-';
STAR 		: '*';
SLASH		: '/';
LESSLESSEQUAL :	'<<=';
GREATERGREATEREQUAL	: '>>=';
LESSLESS            : '<<';
GREATERGREATER    : '>>';
LESS 			: '<';
GREATER			: '>';
EQUAL		: '=';
EQUALEQUAL  : '==';
LBRACE		: '{';
RBRACE		: '}';
DOT			: '.';
LESSEQUAL 	: '<=';
GREATEREQUAL: '>=';
EXCLAIM 	: '!';
EXCLAIMEQUAL    : '!=';
LSQR        : '[';
RSQR        : ']';
AMPEQUAL    : '&=';
PIPEEQUAL   : '|=';
CARETEQUAL  : '^=';
AMP 		: '&';
PIPE 		: '|';
CARET	 	: '^';
TILDE		: '~';
AMPAMP		: '&&';
PIPEPIPE 	: '||';
ELSE			: 'else';
IF 				: 'if';
WHILE 			: 'while';
CASE 			: 'case';
SWITCH          : 'switch';
FOR             : 'for';
DO              : 'do';
STRUCT 			: 'struct';
VOID   : 'void';
INT	   : 'int';
STRING : 'string';
FLOAT  : 'float';
DOUBLE : 'double';
BOOL	: 'bool';
CHAR 	: 'char';
LONG 	: ('long');

CONST   : 'const';
DEFAULT : 'default';
QUESTION   : '?';
RESTRICT   : 'restrict';
CONTINUE : 'continue';
RETURN   : 'return';
BREAK   : 'break';
TYPEDEF : 'typedef';
EXTERN  : 'extern';
STATIC  : 'static';

STACK : 'stack';
QUEUE : 'queue';
VECTOR : 'vector';
UNQ_PTR : 'unq_ptr';
SHARED_PTR : 'shared_ptr';

fragment DIGIT	: '0'..'9';
fragment LLETTER: 'a'..'z';
fragment ULETTER: 'A'..'Z';
fragment LETTER : (LLETTER|ULETTER);
fragment TRUE	: 'true';
fragment FALSE  : 'false';
//fragment ONLYSPACES : [ \t\r\f\u000b]+;

BOOL_CONST		: (TRUE|FALSE);
INTEGER_CONST	: ('+'|'-')?DIGIT+;
CHAR_CONST		: '\''[.]'\'';
FLOAT_CONST		: ('+'|'-')?(DIGIT*)'.'(DIGIT+);
IDENTIFIER		: (LETTER|'_')('_'|LETTER|DIGIT)*;

DEFINE_IGNORE : '#define' [ \t\r\f\u000b]+ (LETTER|'_')('_'|LETTER|DIGIT)* [ \t\r\f\u000b]+ ~[\r\n]+  '\n' -> skip ;
INCLUDE_IGNORE : '#'~[\n]*\n' -> skip;



WHITESPACE 		: [ \t\r\f\n\u000b]+ -> skip;								//whitespaces
STR_UNT_NO_TEXT : ('"')('\n') {reportError("Unterminated string constant");};  //opening of string and newline
STR_EOF_NO_TEXT : ('"')(EOF)  {reportError("EOF in string constant");};        //opening of string and end of file							
STR_CHECK		: '"' -> skip, pushMode(STRING_MODE); 						//opening " of a string
fragment ESC 	: '\\'. ; 													//escape characters



SL_COMMENT 			: (('//'.*?'\n')|(('//'.*?(EOF)))) -> skip;         	//single line comment
COMMENT 			: '/*' -> pushMode(INCOMMENT), skip; 					//start of multiple line comment

UNKNOWN	: .{ notFound(); } ;


//string checking
mode STRING_MODE;
STR_END 		: '"' {processString();} -> popMode;
END_SLASH 		: (~('\\'|'"')|ESC)*'\\'(EOF){reportError("backslash at end of file");} -> mode(DEFAULT_MODE);									//string ends with backslash
STRING_LITERAL 	: (ESC|~('"' |'\n'|'\\'))+ -> more; 																			//possibly valid string
ESC_NULL_IN_STR : ((.*'\\''\u0000'.*?'\n')) {reportError("String contains escaped null character.");} -> mode(DEFAULT_MODE);    // escaped null in unterminated string constant
NULL_IN_STR 	: ((.*'\u0000'.*?'\n')) {reportError("String contains null character.");} -> mode(DEFAULT_MODE) ;				//null in unterminated string constant
UNT_STR			: ~["\n]*('\n'){processStringUnt();} -> mode(DEFAULT_MODE) ; 													//unterminated string constant
EOF_STR 		: ~[\n"]*(EOF){processStringEof();} -> mode(DEFAULT_MODE) ;														//eof in string


//multiline and nested commments
mode INCOMMENT;
EOF_in_commment		: .(EOF) {reportError("Unterminated /* comment");};
NEW_COMMENT			: '/*' -> pushMode(NESTED_COMMENT),skip;
END_COMMENT 		: '*/' -> popMode, skip;
MATTER 				: . -> skip;

mode NESTED_COMMENT;
EOF_in_nested_comment 	: .(EOF) {reportError("Unterminated /* comment");};
THIS_NEW_COMMENT	  	: '/*' -> pushMode(NESTED_COMMENT), skip;
END_BEFORE_EMPTY_STACK	: '*/'(EOF) {reportError("Unterminated /* comment");};
END_THIS_COMMENT		: '*/' -> popMode , skip;


