lexer grammar CoolLexer;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
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
	public void reportError(String errorString){ //function to report errors
		setText(errorString);
		setType(ERROR);
	}

	public void processString() { //function which processes strings
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		StringBuilder buf = new StringBuilder(0);
		//write your code to test strings here
		for(int i = 1; i < text.length()-1; ++i) {
			if (text.charAt(i) == '\u0000') // null char error
			{
			reportError("String contains null character.");
				return;
			}
			if(text.charAt(i) == '\\') {
				if(text.charAt(i+1) == '\u0000')  // esacped null char error
			{
				reportError("String contains escaped null character.");
				return;
			}

				if(text.charAt(i+1) == 'n')
					buf.append('\n');
				else if(text.charAt(i+1) == 'f')
					buf.append('\f');
				else if(text.charAt(i+1) == 't')
					buf.append('\t');
				else if(text.charAt(i+1) == 'b')
					buf.append('\b');
				else if(text.charAt(i+1) == '\"')
					buf.append('\"');
				else if(text.charAt(i+1) == '\\')
					buf.append('\\');
				else
					buf.append(text.charAt(i+1));
				i++;
			}
			else {
				buf.append(text.charAt(i));
			}
		}
		String ntext = buf.toString();
		if(ntext.length() > 1024) {
			reportError("String constant too long");
			return;
		}
		setText(ntext);
		return;
	}

	public void unmatched(){ //for unmatched element
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		reportError(text);
	}

	public void processUnterm() { //function which processes strings
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		StringBuilder buf = new StringBuilder(0);
		//write your code to test strings here
		for(int i = 1; i < text.length()-1; ++i) {
			if(text.charAt(i) == '\\') {
				if(text.charAt(i+1) == 'n')
					buf.append('\n');
				else if(text.charAt(i+1) == 'f')
					buf.append('\f');
				else if(text.charAt(i+1) == 't')
					buf.append('\t');
				else if(text.charAt(i+1) == 'b')
					buf.append('\b');
				else if(text.charAt(i+1) == '\"')
					buf.append('\"');
				else if(text.charAt(i+1) == '\\')
					buf.append('\\');
				else
					buf.append(text.charAt(i+1));
				i++;
			}
			else {
				buf.append(text.charAt(i));
			}
		}
		String ntext = buf.toString();
		if(ntext.length() > 1024) {
			reportError("String constant too long");
			return;
		}
		else
		{
			reportError("Unterminated string constant");
			return;

		}
	}

	public void processStringforEOF() { //precedence for string length error than eof
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		StringBuilder buf = new StringBuilder(0);
		//write your code to test strings here
		for(int i = 1; i < text.length()-1; ++i) {
			if(text.charAt(i) == '\\') {
				if(text.charAt(i+1) == 'n')
					buf.append('\n');
				else if(text.charAt(i+1) == 'f')
					buf.append('\f');
				else if(text.charAt(i+1) == 't')
					buf.append('\t');
				else if(text.charAt(i+1) == 'b')
					buf.append('\t');
				else if(text.charAt(i+1) == '\"')
					buf.append('\"');
				else if(text.charAt(i+1) == '\\')
					buf.append('\\');
				else
					buf.append(text.charAt(i+1));
				i++;
			}
			else {
				buf.append(text.charAt(i));
			}
		}
		String ntext = buf.toString();
		if(ntext.length() > 1024) {
			reportError("String constant too long");
			return;
		}
		else
		{
			reportError("EOF in string constant");
			return;
		}
	}
}


/*
	WRITE ALL LEXER RULES BELOW
*/

//operators
SEMICOLON   : ';';
DARROW      : '=>';
TILDE	    : '~';
LT	        : '<';
LE	        : '<=';
EQUALS	    : '=';
LBRACE	    : '{';
RBRACE	    : '}';
DOT	        : '.';
ASSIGN	    : '<-';
ATSYM	    : '@';
COLON	    : ':';
COMMA	    : ',';
PLUS	    : '+';
MINUS	    : '-';
STAR	    : '*';
SLASH	    : '/';
LPAREN	    : '(';
RPAREN	    : ')';

//keywords
NEW		    : ('n'|'N')('e'|'E')('w'|'W');
CLASS		: ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
LOOP		: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL		: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
IF		    : ('i'|'I')('f'|'F');
FI		    : ('f'|'F')('i'|'I');
IN		    : ('i'|'I')('n'|'N');
ELSE		: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
INHERITS	: ('i'|'I')('n'|'N')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
THEN		: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
WHILE		: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
CASE		: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC		: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
LET		    : ('l'|'L')('e'|'E')('t'|'T');
OF		    : ('o'|'O')('f'|'F');
ISVOID		: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');
NOT		    : ('n'|'N')('o'|'O')('t'|'T');

//constants
fragment DIGIT	: '0'..'9';
fragment LETTER	: ('a'..'z'|'A'..'Z');
fragment ESC_SEQUENCE : '\\'.;
BOOL_CONST	: 't'('r'|'R')('u'|'U')('e'|'E') | 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
INT_CONST	: DIGIT+;
STR_CONST   : '"'(ESC_SEQUENCE | ~('\\'|'"'|'\n'))*'"'{processString();};

//identifiers
TYPEID		: ('A'..'Z')('_'|LETTER|DIGIT)*;
OBJECTID	: ('a'..'z')('_'|LETTER|DIGIT)*;


WRONGCOMMENT	: '*)'EOF? {reportError("Unmatched *)");};
WHITESPACE	: [ \t\r\n\f\b\u000b]+ -> skip ;

EOFSTR1 : '"'(EOF){reportError("EOF in string constant");}-> mode(DEFAULT_MODE) ; 
STRINGSTART	: '"' -> skip, pushMode(STRINGMODE);

ONELINECOMMENT			: '--' .*? ('\n'| (EOF) )-> skip; //single line comment
BEGINNESTEDCOMMENT1		: '(*' -> pushMode(MULTILINECOMMENT), skip;

OTHER		: . {unmatched();}; 

mode STRINGMODE; //string mode

STRINGEND	: '"' {processString();} -> popMode;
NULLC1 : .* '\\''\u0000'.*?('\n' | (EOF)){reportError("String contains escaped null character.");} -> mode(DEFAULT_MODE) ;
NULLC : .* '\u0000' .*?('\n' | (EOF)) {reportError("String contains null character.");} -> mode(DEFAULT_MODE) ;
NEWLINE		: '\n' {processUnterm();} -> mode(DEFAULT_MODE) ;
SLASH3 : '\\"'.*[\n]{reportError("Unterminated string constant");} -> mode(DEFAULT_MODE) ;
NEWLINE2		: ~["\n(EOF)]*('\n') {reportError("Unterminated string constant");} -> mode(DEFAULT_MODE) ;
SLASHLINE2		: ~[\n]* '\\'(EOF) {reportError("backslash at end of file");} -> mode(DEFAULT_MODE) ;
EOFSTR	    : ~[\n]* (EOF) {processStringforEOF();}->  mode(DEFAULT_MODE);
EOFSTR2 : (~[\n]* ('\\')[\n]~[\n]*)*(EOF){reportError("EOF in string constant");}-> mode(DEFAULT_MODE) ; 
STRINGMORE: (~('\u0000'|'\u000b'| [EOF] |  '"' | '\n')('\\''\n')?('\\''\"')?)+ -> more;

mode MULTILINECOMMENT; //comment mode
EOFERRB1		: ('(*')*(EOF) { reportError("EOF in comment"); }-> mode(DEFAULT_MODE);
EOFERR							: .?(EOF) { reportError("EOF in comment"); };
NESTEDCOMMENT2		: '(*' -> pushMode(MULTILINECOMMENT2), skip;
ENDNESTEDCOMMENT1			: '*)' -> popMode, skip;
MULTICOMMENT1			: . -> skip;

mode MULTILINECOMMENT2; //ncommentmode2
ERRB		: ('(*')*(EOF) { reportError("EOF in comment"); }-> mode(DEFAULT_MODE);
EOFERR2						: .?(EOF) { reportError("EOF in comment"); };
NESTEDCOMMENT3		: '(*' -> pushMode(MULTILINECOMMENT2), skip;
EOFERR3						: '*)' EOF { reportError("EOF in comment"); };
ENDNESTEDCOMMENT2			: '*)' -> popMode, skip;
MNESTEDCOMMENT2			: . -> skip;


