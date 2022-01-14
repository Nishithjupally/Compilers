// Generated from cup_lexer.g4 by ANTLR 4.8
package cup;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cup_lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, CONST=2, DEFAULT=3, QUESTION=4, RESTRICT=5, CONTINUE=6, RETURN=7, 
		BREAK=8, TYPEDEF=9, EXTERN=10, STATIC=11, INT=12, FLOAT=13, DOUBLE=14, 
		CHAR=15, BOOL=16, LONG=17, ERROR=18, IDENTIFIER=19, STRING=20, BOOL_CONST=21, 
		STRING_LITERAL=22, INTEGER_CONST=23, FLOAT_CONST=24, CHAR_CONST=25, STACK=26, 
		QUEUE=27, VECTOR=28, UNQ_PTR=29, SHARED_PTR=30, LPAREN=31, RPAREN=32, 
		COLON=33, SEMICOLON=34, COMMA=35, PLUS=36, MINUS=37, STAR=38, SLASH=39, 
		PERCENT=40, PERCENTEQUAL=41, PLUSPLUS=42, MINUSMINUS=43, PLUSEQUAL=44, 
		MINUSEQUAL=45, SLASHEQUAL=46, STAREQUAL=47, TILDE=48, LESS=49, GREATER=50, 
		LESSLESS=51, GREATERGREATER=52, LESSLESSEQUAL=53, GREATERGREATEREQUAL=54, 
		LESSEQUAL=55, GREATEREQUAL=56, EQUAL=57, EQUALEQUAL=58, EXCLAIMEQUAL=59, 
		EXCLAIM=60, LSQR=61, RSQR=62, LBRACE=63, RBRACE=64, DOT=65, ELSE=66, IF=67, 
		DO=68, WHILE=69, CASE=70, SWITCH=71, FOR=72, UNKNOWN=73, AMP=74, PIPE=75, 
		CARET=76, AMPAMP=77, PIPEPIPE=78, AMPEQUAL=79, PIPEEQUAL=80, CARETEQUAL=81, 
		STRUCT=82, ARROW=83, DEFINE_IGNORE=84, INCLUDE_IGNORE=85, WHITESPACE=86, 
		STR_UNT_NO_TEXT=87, STR_EOF_NO_TEXT=88, STR_CHECK=89, SL_COMMENT=90, COMMENT=91, 
		STR_END=92, END_SLASH=93, ESC_NULL_IN_STR=94, NULL_IN_STR=95, UNT_STR=96, 
		EOF_STR=97, EOF_in_commment=98, NEW_COMMENT=99, END_COMMENT=100, MATTER=101, 
		EOF_in_nested_comment=102, THIS_NEW_COMMENT=103, END_BEFORE_EMPTY_STACK=104, 
		END_THIS_COMMENT=105;
	public static final int
		STRING_MODE=1, INCOMMENT=2, NESTED_COMMENT=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE", "INCOMMENT", "NESTED_COMMENT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARROW", "SEMICOLON", "LPAREN", "RPAREN", "COLON", "COMMA", "PERCENTEQUAL", 
			"PLUSEQUAL", "MINUSEQUAL", "SLASHEQUAL", "STAREQUAL", "PLUSPLUS", "MINUSMINUS", 
			"PERCENT", "PLUS", "MINUS", "STAR", "SLASH", "LESSLESSEQUAL", "GREATERGREATEREQUAL", 
			"LESSLESS", "GREATERGREATER", "LESS", "GREATER", "EQUAL", "EQUALEQUAL", 
			"LBRACE", "RBRACE", "DOT", "LESSEQUAL", "GREATEREQUAL", "EXCLAIM", "EXCLAIMEQUAL", 
			"LSQR", "RSQR", "AMPEQUAL", "PIPEEQUAL", "CARETEQUAL", "AMP", "PIPE", 
			"CARET", "TILDE", "AMPAMP", "PIPEPIPE", "ELSE", "IF", "WHILE", "CASE", 
			"SWITCH", "FOR", "DO", "STRUCT", "VOID", "INT", "STRING", "FLOAT", "DOUBLE", 
			"BOOL", "CHAR", "LONG", "CONST", "DEFAULT", "QUESTION", "RESTRICT", "CONTINUE", 
			"RETURN", "BREAK", "TYPEDEF", "EXTERN", "STATIC", "STACK", "QUEUE", "VECTOR", 
			"UNQ_PTR", "SHARED_PTR", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", 
			"FALSE", "BOOL_CONST", "INTEGER_CONST", "CHAR_CONST", "FLOAT_CONST", 
			"IDENTIFIER", "DEFINE_IGNORE", "INCLUDE_IGNORE", "WHITESPACE", "STR_UNT_NO_TEXT", 
			"STR_EOF_NO_TEXT", "STR_CHECK", "ESC", "SL_COMMENT", "COMMENT", "UNKNOWN", 
			"STR_END", "END_SLASH", "STRING_LITERAL", "ESC_NULL_IN_STR", "NULL_IN_STR", 
			"UNT_STR", "EOF_STR", "EOF_in_commment", "NEW_COMMENT", "END_COMMENT", 
			"MATTER", "EOF_in_nested_comment", "THIS_NEW_COMMENT", "END_BEFORE_EMPTY_STACK", 
			"END_THIS_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'const'", "'default'", "'?'", "'restrict'", "'continue'", 
			"'return'", "'break'", "'typedef'", "'extern'", "'static'", "'int'", 
			"'float'", "'double'", "'char'", "'bool'", null, null, null, "'string'", 
			null, null, null, null, null, "'stack'", "'queue'", "'vector'", "'unq_ptr'", 
			"'shared_ptr'", "'('", "')'", "':'", "';'", "','", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'%='", "'++'", "'--'", "'+='", "'-='", "'/='", "'*='", 
			"'~'", "'<'", "'>'", "'<<'", "'>>'", "'<<='", "'>>='", "'<='", "'>='", 
			"'='", "'=='", "'!='", "'!'", "'['", "']'", "'{'", "'}'", "'.'", "'else'", 
			"'if'", "'do'", "'while'", "'case'", "'switch'", "'for'", null, "'&'", 
			"'|'", "'^'", "'&&'", "'||'", "'&='", "'|='", "'^='", "'struct'", "'->'", 
			null, null, null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "CONST", "DEFAULT", "QUESTION", "RESTRICT", "CONTINUE", 
			"RETURN", "BREAK", "TYPEDEF", "EXTERN", "STATIC", "INT", "FLOAT", "DOUBLE", 
			"CHAR", "BOOL", "LONG", "ERROR", "IDENTIFIER", "STRING", "BOOL_CONST", 
			"STRING_LITERAL", "INTEGER_CONST", "FLOAT_CONST", "CHAR_CONST", "STACK", 
			"QUEUE", "VECTOR", "UNQ_PTR", "SHARED_PTR", "LPAREN", "RPAREN", "COLON", 
			"SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "PERCENTEQUAL", 
			"PLUSPLUS", "MINUSMINUS", "PLUSEQUAL", "MINUSEQUAL", "SLASHEQUAL", "STAREQUAL", 
			"TILDE", "LESS", "GREATER", "LESSLESS", "GREATERGREATER", "LESSLESSEQUAL", 
			"GREATERGREATEREQUAL", "LESSEQUAL", "GREATEREQUAL", "EQUAL", "EQUALEQUAL", 
			"EXCLAIMEQUAL", "EXCLAIM", "LSQR", "RSQR", "LBRACE", "RBRACE", "DOT", 
			"ELSE", "IF", "DO", "WHILE", "CASE", "SWITCH", "FOR", "UNKNOWN", "AMP", 
			"PIPE", "CARET", "AMPAMP", "PIPEPIPE", "AMPEQUAL", "PIPEEQUAL", "CARETEQUAL", 
			"STRUCT", "ARROW", "DEFINE_IGNORE", "INCLUDE_IGNORE", "WHITESPACE", "STR_UNT_NO_TEXT", 
			"STR_EOF_NO_TEXT", "STR_CHECK", "SL_COMMENT", "COMMENT", "STR_END", "END_SLASH", 
			"ESC_NULL_IN_STR", "NULL_IN_STR", "UNT_STR", "EOF_STR", "EOF_in_commment", 
			"NEW_COMMENT", "END_COMMENT", "MATTER", "EOF_in_nested_comment", "THIS_NEW_COMMENT", 
			"END_BEFORE_EMPTY_STACK", "END_THIS_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



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



	public cup_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cup_lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 89:
			STR_UNT_NO_TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
			STR_EOF_NO_TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 95:
			UNKNOWN_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			STR_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			END_SLASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 99:
			ESC_NULL_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 100:
			NULL_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 101:
			UNT_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 102:
			EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 103:
			EOF_in_commment_action((RuleContext)_localctx, actionIndex);
			break;
		case 107:
			EOF_in_nested_comment_action((RuleContext)_localctx, actionIndex);
			break;
		case 109:
			END_BEFORE_EMPTY_STACK_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STR_UNT_NO_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void STR_EOF_NO_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("EOF in string constant");
			break;
		}
	}
	private void UNKNOWN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 notFound(); 
			break;
		}
	}
	private void STR_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			processString();
			break;
		}
	}
	private void END_SLASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			reportError("backslash at end of file");
			break;
		}
	}
	private void ESC_NULL_IN_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			reportError("String contains escaped null character.");
			break;
		}
	}
	private void NULL_IN_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("String contains null character.");
			break;
		}
	}
	private void UNT_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			processStringUnt();
			break;
		}
	}
	private void EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			processStringEof();
			break;
		}
	}
	private void EOF_in_commment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			reportError("Unterminated /* comment");
			break;
		}
	}
	private void EOF_in_nested_comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			reportError("Unterminated /* comment");
			break;
		}
	}
	private void END_BEFORE_EMPTY_STACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			reportError("Unterminated /* comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2k\u033d\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR"+
		"\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4"+
		"^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\t"+
		"i\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\5P\u021b\nP\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\5S\u022a\n"+
		"S\3T\5T\u022d\nT\3T\6T\u0230\nT\rT\16T\u0231\3U\3U\3U\3U\3V\5V\u0239\n"+
		"V\3V\7V\u023c\nV\fV\16V\u023f\13V\3V\3V\6V\u0243\nV\rV\16V\u0244\3W\3"+
		"W\5W\u0249\nW\3W\3W\3W\7W\u024e\nW\fW\16W\u0251\13W\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\6X\u025c\nX\rX\16X\u025d\3X\3X\5X\u0262\nX\3X\3X\3X\7X\u0267"+
		"\nX\fX\16X\u026a\13X\3X\6X\u026d\nX\rX\16X\u026e\3X\6X\u0272\nX\rX\16"+
		"X\u0273\3X\3X\3X\3X\3Y\3Y\7Y\u027c\nY\fY\16Y\u027f\13Y\3Y\3Y\3Y\3Y\3Z"+
		"\6Z\u0286\nZ\rZ\16Z\u0287\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3"+
		"]\3]\3^\3^\3^\3_\3_\3_\3_\7_\u02a0\n_\f_\16_\u02a3\13_\3_\3_\3_\3_\3_"+
		"\7_\u02aa\n_\f_\16_\u02ad\13_\3_\5_\u02b0\n_\3_\3_\3`\3`\3`\3`\3`\3`\3"+
		"a\3a\3a\3b\3b\3b\3b\3b\3c\3c\7c\u02c4\nc\fc\16c\u02c7\13c\3c\3c\3c\3c"+
		"\3c\3c\3d\3d\6d\u02d1\nd\rd\16d\u02d2\3d\3d\3e\7e\u02d8\ne\fe\16e\u02db"+
		"\13e\3e\3e\3e\7e\u02e0\ne\fe\16e\u02e3\13e\3e\3e\3e\3e\3e\3e\3f\7f\u02ec"+
		"\nf\ff\16f\u02ef\13f\3f\3f\7f\u02f3\nf\ff\16f\u02f6\13f\3f\3f\3f\3f\3"+
		"f\3f\3g\7g\u02ff\ng\fg\16g\u0302\13g\3g\3g\3g\3g\3g\3h\7h\u030a\nh\fh"+
		"\16h\u030d\13h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3"+
		"k\3k\3k\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3"+
		"p\3p\3p\3p\3p\3p\6\u02a1\u02ab\u02e1\u02f4\2q\6U\b$\n!\f\"\16#\20%\22"+
		"+\24.\26/\30\60\32\61\34,\36- *\"&$\'&(()*\67,8.\65\60\66\62\63\64\64"+
		"\66;8<:A<B>C@9B:D>F=H?J@LQNRPSRLTMVNX\62ZO\\P^D`EbGdHfIhJjFlTn\3p\16r"+
		"\26t\17v\20x\22z\21|\23~\4\u0080\5\u0082\6\u0084\7\u0086\b\u0088\t\u008a"+
		"\n\u008c\13\u008e\f\u0090\r\u0092\34\u0094\35\u0096\36\u0098\37\u009a"+
		" \u009c\2\u009e\2\u00a0\2\u00a2\2\u00a4\2\u00a6\2\u00a8\27\u00aa\31\u00ac"+
		"\33\u00ae\32\u00b0\25\u00b2V\u00b4W\u00b6X\u00b8Y\u00baZ\u00bc[\u00be"+
		"\2\u00c0\\\u00c2]\u00c4K\u00c6^\u00c8_\u00ca\30\u00cc`\u00cea\u00d0b\u00d2"+
		"c\u00d4d\u00d6e\u00d8f\u00dag\u00dch\u00dei\u00e0j\u00e2k\6\2\3\4\5\n"+
		"\4\2--//\3\2\60\60\5\2\13\13\r\17\"\"\4\2\f\f\17\17\4\2\13\17\"\"\4\2"+
		"$$^^\5\2\f\f$$^^\4\2\f\f$$\2\u0353\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2"+
		"\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2"+
		"\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2"+
		"\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2"+
		"x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0082\3\2"+
		"\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a\3\2\2\2\2"+
		"\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2\2\2\u0094"+
		"\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2\2\2\u009a\3\2\2\2\2\u00a8\3\2\2"+
		"\2\2\u00aa\3\2\2\2\2\u00ac\3\2\2\2\2\u00ae\3\2\2\2\2\u00b0\3\2\2\2\2\u00b2"+
		"\3\2\2\2\2\u00b4\3\2\2\2\2\u00b6\3\2\2\2\2\u00b8\3\2\2\2\2\u00ba\3\2\2"+
		"\2\2\u00bc\3\2\2\2\2\u00c0\3\2\2\2\2\u00c2\3\2\2\2\2\u00c4\3\2\2\2\3\u00c6"+
		"\3\2\2\2\3\u00c8\3\2\2\2\3\u00ca\3\2\2\2\3\u00cc\3\2\2\2\3\u00ce\3\2\2"+
		"\2\3\u00d0\3\2\2\2\3\u00d2\3\2\2\2\4\u00d4\3\2\2\2\4\u00d6\3\2\2\2\4\u00d8"+
		"\3\2\2\2\4\u00da\3\2\2\2\5\u00dc\3\2\2\2\5\u00de\3\2\2\2\5\u00e0\3\2\2"+
		"\2\5\u00e2\3\2\2\2\6\u00e4\3\2\2\2\b\u00e7\3\2\2\2\n\u00e9\3\2\2\2\f\u00eb"+
		"\3\2\2\2\16\u00ed\3\2\2\2\20\u00ef\3\2\2\2\22\u00f1\3\2\2\2\24\u00f4\3"+
		"\2\2\2\26\u00f7\3\2\2\2\30\u00fa\3\2\2\2\32\u00fd\3\2\2\2\34\u0100\3\2"+
		"\2\2\36\u0103\3\2\2\2 \u0106\3\2\2\2\"\u0108\3\2\2\2$\u010a\3\2\2\2&\u010c"+
		"\3\2\2\2(\u010e\3\2\2\2*\u0110\3\2\2\2,\u0114\3\2\2\2.\u0118\3\2\2\2\60"+
		"\u011b\3\2\2\2\62\u011e\3\2\2\2\64\u0120\3\2\2\2\66\u0122\3\2\2\28\u0124"+
		"\3\2\2\2:\u0127\3\2\2\2<\u0129\3\2\2\2>\u012b\3\2\2\2@\u012d\3\2\2\2B"+
		"\u0130\3\2\2\2D\u0133\3\2\2\2F\u0135\3\2\2\2H\u0138\3\2\2\2J\u013a\3\2"+
		"\2\2L\u013c\3\2\2\2N\u013f\3\2\2\2P\u0142\3\2\2\2R\u0145\3\2\2\2T\u0147"+
		"\3\2\2\2V\u0149\3\2\2\2X\u014b\3\2\2\2Z\u014d\3\2\2\2\\\u0150\3\2\2\2"+
		"^\u0153\3\2\2\2`\u0158\3\2\2\2b\u015b\3\2\2\2d\u0161\3\2\2\2f\u0166\3"+
		"\2\2\2h\u016d\3\2\2\2j\u0171\3\2\2\2l\u0174\3\2\2\2n\u017b\3\2\2\2p\u0180"+
		"\3\2\2\2r\u0184\3\2\2\2t\u018b\3\2\2\2v\u0191\3\2\2\2x\u0198\3\2\2\2z"+
		"\u019d\3\2\2\2|\u01a2\3\2\2\2~\u01a7\3\2\2\2\u0080\u01ad\3\2\2\2\u0082"+
		"\u01b5\3\2\2\2\u0084\u01b7\3\2\2\2\u0086\u01c0\3\2\2\2\u0088\u01c9\3\2"+
		"\2\2\u008a\u01d0\3\2\2\2\u008c\u01d6\3\2\2\2\u008e\u01de\3\2\2\2\u0090"+
		"\u01e5\3\2\2\2\u0092\u01ec\3\2\2\2\u0094\u01f2\3\2\2\2\u0096\u01f8\3\2"+
		"\2\2\u0098\u01ff\3\2\2\2\u009a\u0207\3\2\2\2\u009c\u0212\3\2\2\2\u009e"+
		"\u0214\3\2\2\2\u00a0\u0216\3\2\2\2\u00a2\u021a\3\2\2\2\u00a4\u021c\3\2"+
		"\2\2\u00a6\u0221\3\2\2\2\u00a8\u0229\3\2\2\2\u00aa\u022c\3\2\2\2\u00ac"+
		"\u0233\3\2\2\2\u00ae\u0238\3\2\2\2\u00b0\u0248\3\2\2\2\u00b2\u0252\3\2"+
		"\2\2\u00b4\u0279\3\2\2\2\u00b6\u0285\3\2\2\2\u00b8\u028b\3\2\2\2\u00ba"+
		"\u028f\3\2\2\2\u00bc\u0293\3\2\2\2\u00be\u0298\3\2\2\2\u00c0\u02af\3\2"+
		"\2\2\u00c2\u02b3\3\2\2\2\u00c4\u02b9\3\2\2\2\u00c6\u02bc\3\2\2\2\u00c8"+
		"\u02c5\3\2\2\2\u00ca\u02d0\3\2\2\2\u00cc\u02d9\3\2\2\2\u00ce\u02ed\3\2"+
		"\2\2\u00d0\u0300\3\2\2\2\u00d2\u030b\3\2\2\2\u00d4\u0313\3\2\2\2\u00d6"+
		"\u0317\3\2\2\2\u00d8\u031d\3\2\2\2\u00da\u0323\3\2\2\2\u00dc\u0327\3\2"+
		"\2\2\u00de\u032b\3\2\2\2\u00e0\u0331\3\2\2\2\u00e2\u0337\3\2\2\2\u00e4"+
		"\u00e5\7/\2\2\u00e5\u00e6\7@\2\2\u00e6\7\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8"+
		"\t\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\13\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec"+
		"\r\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee\17\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0"+
		"\21\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2\u00f3\7?\2\2\u00f3\23\3\2\2\2\u00f4"+
		"\u00f5\7-\2\2\u00f5\u00f6\7?\2\2\u00f6\25\3\2\2\2\u00f7\u00f8\7/\2\2\u00f8"+
		"\u00f9\7?\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7?\2\2"+
		"\u00fc\31\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7?\2\2\u00ff\33\3\2\2"+
		"\2\u0100\u0101\7-\2\2\u0101\u0102\7-\2\2\u0102\35\3\2\2\2\u0103\u0104"+
		"\7/\2\2\u0104\u0105\7/\2\2\u0105\37\3\2\2\2\u0106\u0107\7\'\2\2\u0107"+
		"!\3\2\2\2\u0108\u0109\7-\2\2\u0109#\3\2\2\2\u010a\u010b\7/\2\2\u010b%"+
		"\3\2\2\2\u010c\u010d\7,\2\2\u010d\'\3\2\2\2\u010e\u010f\7\61\2\2\u010f"+
		")\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113"+
		"+\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\7@\2\2\u0116\u0117\7?\2\2\u0117"+
		"-\3\2\2\2\u0118\u0119\7>\2\2\u0119\u011a\7>\2\2\u011a/\3\2\2\2\u011b\u011c"+
		"\7@\2\2\u011c\u011d\7@\2\2\u011d\61\3\2\2\2\u011e\u011f\7>\2\2\u011f\63"+
		"\3\2\2\2\u0120\u0121\7@\2\2\u0121\65\3\2\2\2\u0122\u0123\7?\2\2\u0123"+
		"\67\3\2\2\2\u0124\u0125\7?\2\2\u0125\u0126\7?\2\2\u01269\3\2\2\2\u0127"+
		"\u0128\7}\2\2\u0128;\3\2\2\2\u0129\u012a\7\177\2\2\u012a=\3\2\2\2\u012b"+
		"\u012c\7\60\2\2\u012c?\3\2\2\2\u012d\u012e\7>\2\2\u012e\u012f\7?\2\2\u012f"+
		"A\3\2\2\2\u0130\u0131\7@\2\2\u0131\u0132\7?\2\2\u0132C\3\2\2\2\u0133\u0134"+
		"\7#\2\2\u0134E\3\2\2\2\u0135\u0136\7#\2\2\u0136\u0137\7?\2\2\u0137G\3"+
		"\2\2\2\u0138\u0139\7]\2\2\u0139I\3\2\2\2\u013a\u013b\7_\2\2\u013bK\3\2"+
		"\2\2\u013c\u013d\7(\2\2\u013d\u013e\7?\2\2\u013eM\3\2\2\2\u013f\u0140"+
		"\7~\2\2\u0140\u0141\7?\2\2\u0141O\3\2\2\2\u0142\u0143\7`\2\2\u0143\u0144"+
		"\7?\2\2\u0144Q\3\2\2\2\u0145\u0146\7(\2\2\u0146S\3\2\2\2\u0147\u0148\7"+
		"~\2\2\u0148U\3\2\2\2\u0149\u014a\7`\2\2\u014aW\3\2\2\2\u014b\u014c\7\u0080"+
		"\2\2\u014cY\3\2\2\2\u014d\u014e\7(\2\2\u014e\u014f\7(\2\2\u014f[\3\2\2"+
		"\2\u0150\u0151\7~\2\2\u0151\u0152\7~\2\2\u0152]\3\2\2\2\u0153\u0154\7"+
		"g\2\2\u0154\u0155\7n\2\2\u0155\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157_"+
		"\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7h\2\2\u015aa\3\2\2\2\u015b\u015c"+
		"\7y\2\2\u015c\u015d\7j\2\2\u015d\u015e\7k\2\2\u015e\u015f\7n\2\2\u015f"+
		"\u0160\7g\2\2\u0160c\3\2\2\2\u0161\u0162\7e\2\2\u0162\u0163\7c\2\2\u0163"+
		"\u0164\7u\2\2\u0164\u0165\7g\2\2\u0165e\3\2\2\2\u0166\u0167\7u\2\2\u0167"+
		"\u0168\7y\2\2\u0168\u0169\7k\2\2\u0169\u016a\7v\2\2\u016a\u016b\7e\2\2"+
		"\u016b\u016c\7j\2\2\u016cg\3\2\2\2\u016d\u016e\7h\2\2\u016e\u016f\7q\2"+
		"\2\u016f\u0170\7t\2\2\u0170i\3\2\2\2\u0171\u0172\7f\2\2\u0172\u0173\7"+
		"q\2\2\u0173k\3\2\2\2\u0174\u0175\7u\2\2\u0175\u0176\7v\2\2\u0176\u0177"+
		"\7t\2\2\u0177\u0178\7w\2\2\u0178\u0179\7e\2\2\u0179\u017a\7v\2\2\u017a"+
		"m\3\2\2\2\u017b\u017c\7x\2\2\u017c\u017d\7q\2\2\u017d\u017e\7k\2\2\u017e"+
		"\u017f\7f\2\2\u017fo\3\2\2\2\u0180\u0181\7k\2\2\u0181\u0182\7p\2\2\u0182"+
		"\u0183\7v\2\2\u0183q\3\2\2\2\u0184\u0185\7u\2\2\u0185\u0186\7v\2\2\u0186"+
		"\u0187\7t\2\2\u0187\u0188\7k\2\2\u0188\u0189\7p\2\2\u0189\u018a\7i\2\2"+
		"\u018as\3\2\2\2\u018b\u018c\7h\2\2\u018c\u018d\7n\2\2\u018d\u018e\7q\2"+
		"\2\u018e\u018f\7c\2\2\u018f\u0190\7v\2\2\u0190u\3\2\2\2\u0191\u0192\7"+
		"f\2\2\u0192\u0193\7q\2\2\u0193\u0194\7w\2\2\u0194\u0195\7d\2\2\u0195\u0196"+
		"\7n\2\2\u0196\u0197\7g\2\2\u0197w\3\2\2\2\u0198\u0199\7d\2\2\u0199\u019a"+
		"\7q\2\2\u019a\u019b\7q\2\2\u019b\u019c\7n\2\2\u019cy\3\2\2\2\u019d\u019e"+
		"\7e\2\2\u019e\u019f\7j\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7t\2\2\u01a1"+
		"{\3\2\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5\7p\2\2\u01a5"+
		"\u01a6\7i\2\2\u01a6}\3\2\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7q\2\2\u01a9"+
		"\u01aa\7p\2\2\u01aa\u01ab\7u\2\2\u01ab\u01ac\7v\2\2\u01ac\177\3\2\2\2"+
		"\u01ad\u01ae\7f\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1"+
		"\7c\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7v\2\2\u01b4"+
		"\u0081\3\2\2\2\u01b5\u01b6\7A\2\2\u01b6\u0083\3\2\2\2\u01b7\u01b8\7t\2"+
		"\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc"+
		"\7t\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7e\2\2\u01be\u01bf\7v\2\2\u01bf"+
		"\u0085\3\2\2\2\u01c0\u01c1\7e\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7p\2"+
		"\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7"+
		"\7w\2\2\u01c7\u01c8\7g\2\2\u01c8\u0087\3\2\2\2\u01c9\u01ca\7t\2\2\u01ca"+
		"\u01cb\7g\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7w\2\2\u01cd\u01ce\7t\2\2"+
		"\u01ce\u01cf\7p\2\2\u01cf\u0089\3\2\2\2\u01d0\u01d1\7d\2\2\u01d1\u01d2"+
		"\7t\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7m\2\2\u01d5"+
		"\u008b\3\2\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7{\2\2\u01d8\u01d9\7r\2"+
		"\2\u01d9\u01da\7g\2\2\u01da\u01db\7f\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd"+
		"\7h\2\2\u01dd\u008d\3\2\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7z\2\2\u01e0"+
		"\u01e1\7v\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7p\2\2"+
		"\u01e4\u008f\3\2\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8"+
		"\7c\2\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7e\2\2\u01eb"+
		"\u0091\3\2\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7c\2"+
		"\2\u01ef\u01f0\7e\2\2\u01f0\u01f1\7m\2\2\u01f1\u0093\3\2\2\2\u01f2\u01f3"+
		"\7s\2\2\u01f3\u01f4\7w\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7w\2\2\u01f6"+
		"\u01f7\7g\2\2\u01f7\u0095\3\2\2\2\u01f8\u01f9\7x\2\2\u01f9\u01fa\7g\2"+
		"\2\u01fa\u01fb\7e\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe"+
		"\7t\2\2\u01fe\u0097\3\2\2\2\u01ff\u0200\7w\2\2\u0200\u0201\7p\2\2\u0201"+
		"\u0202\7s\2\2\u0202\u0203\7a\2\2\u0203\u0204\7r\2\2\u0204\u0205\7v\2\2"+
		"\u0205\u0206\7t\2\2\u0206\u0099\3\2\2\2\u0207\u0208\7u\2\2\u0208\u0209"+
		"\7j\2\2\u0209\u020a\7c\2\2\u020a\u020b\7t\2\2\u020b\u020c\7g\2\2\u020c"+
		"\u020d\7f\2\2\u020d\u020e\7a\2\2\u020e\u020f\7r\2\2\u020f\u0210\7v\2\2"+
		"\u0210\u0211\7t\2\2\u0211\u009b\3\2\2\2\u0212\u0213\4\62;\2\u0213\u009d"+
		"\3\2\2\2\u0214\u0215\4c|\2\u0215\u009f\3\2\2\2\u0216\u0217\4C\\\2\u0217"+
		"\u00a1\3\2\2\2\u0218\u021b\5\u009eN\2\u0219\u021b\5\u00a0O\2\u021a\u0218"+
		"\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u00a3\3\2\2\2\u021c\u021d\7v\2\2\u021d"+
		"\u021e\7t\2\2\u021e\u021f\7w\2\2\u021f\u0220\7g\2\2\u0220\u00a5\3\2\2"+
		"\2\u0221\u0222\7h\2\2\u0222\u0223\7c\2\2\u0223\u0224\7n\2\2\u0224\u0225"+
		"\7u\2\2\u0225\u0226\7g\2\2\u0226\u00a7\3\2\2\2\u0227\u022a\5\u00a4Q\2"+
		"\u0228\u022a\5\u00a6R\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a"+
		"\u00a9\3\2\2\2\u022b\u022d\t\2\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022f\3\2\2\2\u022e\u0230\5\u009cM\2\u022f\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u00ab\3\2"+
		"\2\2\u0233\u0234\7)\2\2\u0234\u0235\t\3\2\2\u0235\u0236\7)\2\2\u0236\u00ad"+
		"\3\2\2\2\u0237\u0239\t\2\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023d\3\2\2\2\u023a\u023c\5\u009cM\2\u023b\u023a\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0242\7\60\2\2\u0241\u0243\5\u009cM\2\u0242\u0241"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u00af\3\2\2\2\u0246\u0249\5\u00a2P\2\u0247\u0249\7a\2\2\u0248\u0246\3"+
		"\2\2\2\u0248\u0247\3\2\2\2\u0249\u024f\3\2\2\2\u024a\u024e\7a\2\2\u024b"+
		"\u024e\5\u00a2P\2\u024c\u024e\5\u009cM\2\u024d\u024a\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u00b1\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\7%"+
		"\2\2\u0253\u0254\7f\2\2\u0254\u0255\7g\2\2\u0255\u0256\7h\2\2\u0256\u0257"+
		"\7k\2\2\u0257\u0258\7p\2\2\u0258\u0259\7g\2\2\u0259\u025b\3\2\2\2\u025a"+
		"\u025c\t\4\2\2\u025b\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u0262\5\u00a2P\2\u0260"+
		"\u0262\7a\2\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u0268\3\2"+
		"\2\2\u0263\u0267\7a\2\2\u0264\u0267\5\u00a2P\2\u0265\u0267\5\u009cM\2"+
		"\u0266\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u026a"+
		"\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026d\t\4\2\2\u026c\u026b\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3\2\2\2\u0270"+
		"\u0272\n\5\2\2\u0271\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0271\3\2"+
		"\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\7\f\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\bX\2\2\u0278\u00b3\3\2\2\2\u0279\u027d\7%\2"+
		"\2\u027a\u027c\13\2\2\2\u027b\u027a\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0281\7\f\2\2\u0281\u0282\3\2\2\2\u0282\u0283\bY\2\2\u0283"+
		"\u00b5\3\2\2\2\u0284\u0286\t\6\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\bZ\2\2\u028a\u00b7\3\2\2\2\u028b\u028c\7$\2\2\u028c\u028d\7\f\2"+
		"\2\u028d\u028e\b[\3\2\u028e\u00b9\3\2\2\2\u028f\u0290\7$\2\2\u0290\u0291"+
		"\7\2\2\3\u0291\u0292\b\\\4\2\u0292\u00bb\3\2\2\2\u0293\u0294\7$\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0296\b]\2\2\u0296\u0297\b]\5\2\u0297\u00bd\3\2\2"+
		"\2\u0298\u0299\7^\2\2\u0299\u029a\13\2\2\2\u029a\u00bf\3\2\2\2\u029b\u029c"+
		"\7\61\2\2\u029c\u029d\7\61\2\2\u029d\u02a1\3\2\2\2\u029e\u02a0\13\2\2"+
		"\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a1\u029f"+
		"\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02b0\7\f\2\2\u02a5"+
		"\u02a6\7\61\2\2\u02a6\u02a7\7\61\2\2\u02a7\u02ab\3\2\2\2\u02a8\u02aa\13"+
		"\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\7\2"+
		"\2\3\u02af\u029b\3\2\2\2\u02af\u02a5\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\b_\2\2\u02b2\u00c1\3\2\2\2\u02b3\u02b4\7\61\2\2\u02b4\u02b5\7,"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\b`\6\2\u02b7\u02b8\b`\2\2\u02b8\u00c3"+
		"\3\2\2\2\u02b9\u02ba\13\2\2\2\u02ba\u02bb\ba\7\2\u02bb\u00c5\3\2\2\2\u02bc"+
		"\u02bd\7$\2\2\u02bd\u02be\bb\b\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\bb\t"+
		"\2\u02c0\u00c7\3\2\2\2\u02c1\u02c4\n\7\2\2\u02c2\u02c4\5\u00be^\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02c9\7^\2\2\u02c9\u02ca\7\2\2\3\u02ca\u02cb\bc\n\2\u02cb\u02cc\3\2\2"+
		"\2\u02cc\u02cd\bc\13\2\u02cd\u00c9\3\2\2\2\u02ce\u02d1\5\u00be^\2\u02cf"+
		"\u02d1\n\b\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\bd\f\2\u02d5\u00cb\3\2\2\2\u02d6\u02d8\13\2\2\2\u02d7\u02d6\3\2"+
		"\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\7^\2\2\u02dd\u02e1\7\2"+
		"\2\2\u02de\u02e0\13\2\2\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e4\u02e5\7\f\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\be\r\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\be\13\2\u02e9\u00cd\3\2\2\2\u02ea\u02ec\13"+
		"\2\2\2\u02eb\u02ea\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f4\7\2"+
		"\2\2\u02f1\u02f3\13\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f7\u02f8\7\f\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\bf\16\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\bf\13\2\u02fc\u00cf\3\2\2\2\u02fd\u02ff\n\t"+
		"\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7\f"+
		"\2\2\u0304\u0305\bg\17\2\u0305\u0306\3\2\2\2\u0306\u0307\bg\13\2\u0307"+
		"\u00d1\3\2\2\2\u0308\u030a\n\t\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2"+
		"\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030e\u030f\7\2\2\3\u030f\u0310\bh\20\2\u0310\u0311\3\2"+
		"\2\2\u0311\u0312\bh\13\2\u0312\u00d3\3\2\2\2\u0313\u0314\13\2\2\2\u0314"+
		"\u0315\7\2\2\3\u0315\u0316\bi\21\2\u0316\u00d5\3\2\2\2\u0317\u0318\7\61"+
		"\2\2\u0318\u0319\7,\2\2\u0319\u031a\3\2\2\2\u031a\u031b\bj\22\2\u031b"+
		"\u031c\bj\2\2\u031c\u00d7\3\2\2\2\u031d\u031e\7,\2\2\u031e\u031f\7\61"+
		"\2\2\u031f\u0320\3\2\2\2\u0320\u0321\bk\t\2\u0321\u0322\bk\2\2\u0322\u00d9"+
		"\3\2\2\2\u0323\u0324\13\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\bl\2\2\u0326"+
		"\u00db\3\2\2\2\u0327\u0328\13\2\2\2\u0328\u0329\7\2\2\3\u0329\u032a\b"+
		"m\23\2\u032a\u00dd\3\2\2\2\u032b\u032c\7\61\2\2\u032c\u032d\7,\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u032f\bn\22\2\u032f\u0330\bn\2\2\u0330\u00df\3\2"+
		"\2\2\u0331\u0332\7,\2\2\u0332\u0333\7\61\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0335\7\2\2\3\u0335\u0336\bo\24\2\u0336\u00e1\3\2\2\2\u0337\u0338\7,"+
		"\2\2\u0338\u0339\7\61\2\2\u0339\u033a\3\2\2\2\u033a\u033b\bp\t\2\u033b"+
		"\u033c\bp\2\2\u033c\u00e3\3\2\2\2%\2\3\4\5\u021a\u0229\u022c\u0231\u0238"+
		"\u023d\u0244\u0248\u024d\u024f\u025d\u0261\u0266\u0268\u026e\u0273\u027d"+
		"\u0287\u02a1\u02ab\u02af\u02c3\u02c5\u02d0\u02d2\u02d9\u02e1\u02ed\u02f4"+
		"\u0300\u030b\25\b\2\2\3[\2\3\\\3\7\3\2\7\4\2\3a\4\3b\5\6\2\2\3c\6\4\2"+
		"\2\5\2\2\3e\7\3f\b\3g\t\3h\n\3i\13\7\5\2\3m\f\3o\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}