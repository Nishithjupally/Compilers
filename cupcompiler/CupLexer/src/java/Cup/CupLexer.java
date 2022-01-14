// Generated from CupLexer.g4 by ANTLR 4.8
package Cup;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CupLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, INT=2, FLOAT=3, DOUBLE=4, CHAR=5, BOOL=6, LONG=7, CONST=8, RESTRICT=9, 
		CONTINUE=10, RETURN=11, BREAK=12, TYPEDEF=13, SIZEOF=14, EXTERN=15, STATIC=16, 
		ERROR=17, IDENTIFIER=18, STRING=19, BOOL_CONST=20, STRING_LITERAL=21, 
		INTEGER_CONST=22, FLOAT_CONST=23, CHAR_CONST=24, STRUCT=25, STACK=26, 
		QUEUE=27, VECTOR=28, UNQ_PTR=29, SHARED_PTR=30, QUESTION=31, LPAREN=32, 
		RPAREN=33, COLON=34, SEMICOLON=35, COMMA=36, LSQR=37, RSQR=38, LBRACE=39, 
		RBRACE=40, DOT=41, ARROW=42, PLUS=43, MINUS=44, STAR=45, SLASH=46, PERCENT=47, 
		LESS=48, GREATER=49, AMP=50, PIPE=51, CARET=52, TILDE=53, EXCLAIM=54, 
		PLUSPLUS=55, MINUSMINUS=56, LESSLESS=57, GREATERGREATER=58, AMPAMP=59, 
		PIPEPIPE=60, PERCENTEQUAL=61, PLUSEQUAL=62, MINUSEQUAL=63, SLASHEQUAL=64, 
		STAREQUAL=65, EQUALEQUAL=66, EQUAL=67, EXCLAIMEQUAL=68, LESSEQUAL=69, 
		GREATEREQUAL=70, AMPEQUAL=71, PIPEEQUAL=72, CARETEQUAL=73, GREATERGREATEREQUAL=74, 
		LESSLESSEQUAL=75, IF=76, ELSE=77, DO=78, WHILE=79, CASE=80, SWITCH=81, 
		DEFAULT=82, FOR=83, UNKNOWN=84, WHITESPACE=85, STR_UNT_NO_TEXT=86, STR_EOF_NO_TEXT=87, 
		STR_CHECK=88, DEFINE_IGNORE=89, INCLUDE_IGNORE=90, SL_COMMENT=91, COMMENT=92, 
		STR_END=93, END_SLASH=94, ESC_NULL_IN_STR=95, NULL_IN_STR=96, UNT_STR=97, 
		EOF_STR=98, EOF_in_commment=99, NEW_COMMENT=100, END_COMMENT=101, MATTER=102, 
		EOF_in_nested_comment=103, THIS_NEW_COMMENT=104, END_BEFORE_EMPTY_STACK=105, 
		END_THIS_COMMENT=106;
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
			"BOOL", "CHAR", "LONG", "SIZEOF", "CONST", "DEFAULT", "QUESTION", "RESTRICT", 
			"CONTINUE", "RETURN", "BREAK", "TYPEDEF", "EXTERN", "STATIC", "STACK", 
			"QUEUE", "VECTOR", "UNQ_PTR", "SHARED_PTR", "DIGIT", "LLETTER", "ULETTER", 
			"LETTER", "TRUE", "FALSE", "BOOL_CONST", "INTEGER_CONST", "CHAR_CONST", 
			"FLOAT_CONST", "IDENTIFIER", "WHITESPACE", "STR_UNT_NO_TEXT", "STR_EOF_NO_TEXT", 
			"STR_CHECK", "ESC", "DEFINE_IGNORE", "INCLUDE_IGNORE", "SL_COMMENT", 
			"COMMENT", "UNKNOWN", "STR_END", "END_SLASH", "STRING_LITERAL", "ESC_NULL_IN_STR", 
			"NULL_IN_STR", "UNT_STR", "EOF_STR", "EOF_in_commment", "NEW_COMMENT", 
			"END_COMMENT", "MATTER", "EOF_in_nested_comment", "THIS_NEW_COMMENT", 
			"END_BEFORE_EMPTY_STACK", "END_THIS_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'float'", "'double'", "'char'", "'bool'", null, 
			"'const'", "'restrict'", "'continue'", "'return'", "'break'", "'typedef'", 
			"'sizeof'", "'extern'", "'static'", null, null, "'string'", null, null, 
			null, null, null, "'struct'", "'stack'", "'queue'", "'vector'", "'unq_ptr'", 
			"'shared_ptr'", "'?'", "'('", "')'", "':'", "';'", "','", "'['", "']'", 
			"'{'", "'}'", "'.'", "'->'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
			"'>'", "'&'", "'|'", "'^'", "'~'", "'!'", "'++'", "'--'", "'<<'", "'>>'", 
			"'&&'", "'||'", "'%='", "'+='", "'-='", "'/='", "'*='", "'=='", "'='", 
			"'!='", "'<='", "'>='", "'&='", "'|='", "'^='", "'>>='", "'<<='", "'if'", 
			"'else'", "'do'", "'while'", "'case'", "'switch'", "'default'", "'for'", 
			null, null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "INT", "FLOAT", "DOUBLE", "CHAR", "BOOL", "LONG", "CONST", 
			"RESTRICT", "CONTINUE", "RETURN", "BREAK", "TYPEDEF", "SIZEOF", "EXTERN", 
			"STATIC", "ERROR", "IDENTIFIER", "STRING", "BOOL_CONST", "STRING_LITERAL", 
			"INTEGER_CONST", "FLOAT_CONST", "CHAR_CONST", "STRUCT", "STACK", "QUEUE", 
			"VECTOR", "UNQ_PTR", "SHARED_PTR", "QUESTION", "LPAREN", "RPAREN", "COLON", 
			"SEMICOLON", "COMMA", "LSQR", "RSQR", "LBRACE", "RBRACE", "DOT", "ARROW", 
			"PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "LESS", "GREATER", "AMP", 
			"PIPE", "CARET", "TILDE", "EXCLAIM", "PLUSPLUS", "MINUSMINUS", "LESSLESS", 
			"GREATERGREATER", "AMPAMP", "PIPEPIPE", "PERCENTEQUAL", "PLUSEQUAL", 
			"MINUSEQUAL", "SLASHEQUAL", "STAREQUAL", "EQUALEQUAL", "EQUAL", "EXCLAIMEQUAL", 
			"LESSEQUAL", "GREATEREQUAL", "AMPEQUAL", "PIPEEQUAL", "CARETEQUAL", "GREATERGREATEREQUAL", 
			"LESSLESSEQUAL", "IF", "ELSE", "DO", "WHILE", "CASE", "SWITCH", "DEFAULT", 
			"FOR", "UNKNOWN", "WHITESPACE", "STR_UNT_NO_TEXT", "STR_EOF_NO_TEXT", 
			"STR_CHECK", "DEFINE_IGNORE", "INCLUDE_IGNORE", "SL_COMMENT", "COMMENT", 
			"STR_END", "END_SLASH", "ESC_NULL_IN_STR", "NULL_IN_STR", "UNT_STR", 
			"EOF_STR", "EOF_in_commment", "NEW_COMMENT", "END_COMMENT", "MATTER", 
			"EOF_in_nested_comment", "THIS_NEW_COMMENT", "END_BEFORE_EMPTY_STACK", 
			"END_THIS_COMMENT"
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




		/**
		* Function to report errors.
		* Use this function whenever your lexer encounters any erroneous input
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



	public CupLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CupLexer.g4"; }

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
		case 88:
			STR_UNT_NO_TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
			STR_EOF_NO_TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			UNKNOWN_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			STR_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 98:
			END_SLASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 100:
			ESC_NULL_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 101:
			NULL_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 102:
			UNT_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 103:
			EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 104:
			EOF_in_commment_action((RuleContext)_localctx, actionIndex);
			break;
		case 108:
			EOF_in_nested_comment_action((RuleContext)_localctx, actionIndex);
			break;
		case 110:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2l\u035f\b\1\b\1\b"+
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
		"i\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39"+
		"\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G"+
		"\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J"+
		"\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\5Q\u0224\nQ\3R\3R\3R\3R\3R\3S\3S\3S"+
		"\3S\3S\3S\3T\3T\5T\u0233\nT\3U\6U\u0236\nU\rU\16U\u0237\3V\3V\3V\3V\3"+
		"W\7W\u023f\nW\fW\16W\u0242\13W\3W\3W\6W\u0246\nW\rW\16W\u0247\3X\3X\5"+
		"X\u024c\nX\3X\3X\3X\7X\u0251\nX\fX\16X\u0254\13X\3Y\6Y\u0257\nY\rY\16"+
		"Y\u0258\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3^"+
		"\3^\7^\u026f\n^\f^\16^\u0272\13^\3^\3^\3^\3^\3^\3^\3^\3^\6^\u027c\n^\r"+
		"^\16^\u027d\3^\7^\u0281\n^\f^\16^\u0284\13^\3^\6^\u0287\n^\r^\16^\u0288"+
		"\3^\7^\u028c\n^\f^\16^\u028f\13^\5^\u0291\n^\3^\3^\3_\3_\7_\u0297\n_\f"+
		"_\16_\u029a\13_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u02a5\n_\f_\16_\u02a8\13"+
		"_\3_\3_\7_\u02ac\n_\f_\16_\u02af\13_\3_\3_\3_\7_\u02b4\n_\f_\16_\u02b7"+
		"\13_\3_\5_\u02ba\n_\3_\3_\3`\3`\3`\3`\7`\u02c2\n`\f`\16`\u02c5\13`\3`"+
		"\3`\3`\3`\3`\7`\u02cc\n`\f`\16`\u02cf\13`\3`\5`\u02d2\n`\3`\3`\3a\3a\3"+
		"a\3a\3a\3a\3b\3b\3b\3c\3c\3c\3c\3c\3d\3d\7d\u02e6\nd\fd\16d\u02e9\13d"+
		"\3d\3d\3d\3d\3d\3d\3e\3e\6e\u02f3\ne\re\16e\u02f4\3e\3e\3f\7f\u02fa\n"+
		"f\ff\16f\u02fd\13f\3f\3f\3f\7f\u0302\nf\ff\16f\u0305\13f\3f\3f\3f\3f\3"+
		"f\3f\3g\7g\u030e\ng\fg\16g\u0311\13g\3g\3g\7g\u0315\ng\fg\16g\u0318\13"+
		"g\3g\3g\3g\3g\3g\3g\3h\7h\u0321\nh\fh\16h\u0324\13h\3h\3h\3h\3h\3h\3i"+
		"\7i\u032c\ni\fi\16i\u032f\13i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3"+
		"k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3p\3"+
		"p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\6\u02c3\u02cd\u0303\u0316\2r\6,\b%\n\""+
		"\f#\16$\20&\22?\24@\26A\30B\32C\349\36: \61\"-$.&/(\60*M,L.;\60<\62\62"+
		"\64\63\66E8D:)<*>+@GBHD8FFH\'J(LINJPKR\64T\65V\66X\67Z=\\>^O`NbQdRfSh"+
		"UjPl\33n\3p\4r\25t\5v\6x\bz\7|\t~\20\u0080\n\u0082T\u0084!\u0086\13\u0088"+
		"\f\u008a\r\u008c\16\u008e\17\u0090\21\u0092\22\u0094\34\u0096\35\u0098"+
		"\36\u009a\37\u009c \u009e\2\u00a0\2\u00a2\2\u00a4\2\u00a6\2\u00a8\2\u00aa"+
		"\26\u00ac\30\u00ae\32\u00b0\31\u00b2\24\u00b4W\u00b6X\u00b8Y\u00baZ\u00bc"+
		"\2\u00be[\u00c0\\\u00c2]\u00c4^\u00c6V\u00c8_\u00ca`\u00cc\27\u00cea\u00d0"+
		"b\u00d2c\u00d4d\u00d6e\u00d8f\u00dag\u00dch\u00dei\u00e0j\u00e2k\u00e4"+
		"l\6\2\3\4\5\n\4\2\13\17\"\"\5\2\13\13\r\17\"\"\4\2\f\f%%\3\2\f\f\4\2\f"+
		"\f\17\17\4\2$$^^\5\2\f\f$$^^\4\2\f\f$$\2\u0376\2\6\3\2\2\2\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3"+
		"\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2"+
		"\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2"+
		"\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2"+
		"\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2"+
		"\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P"+
		"\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3"+
		"\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2"+
		"\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2"+
		"v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2"+
		"\2\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a"+
		"\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2"+
		"\2\2\u0094\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2\2\2\u009a\3\2\2\2\2\u009c"+
		"\3\2\2\2\2\u00aa\3\2\2\2\2\u00ac\3\2\2\2\2\u00ae\3\2\2\2\2\u00b0\3\2\2"+
		"\2\2\u00b2\3\2\2\2\2\u00b4\3\2\2\2\2\u00b6\3\2\2\2\2\u00b8\3\2\2\2\2\u00ba"+
		"\3\2\2\2\2\u00be\3\2\2\2\2\u00c0\3\2\2\2\2\u00c2\3\2\2\2\2\u00c4\3\2\2"+
		"\2\2\u00c6\3\2\2\2\3\u00c8\3\2\2\2\3\u00ca\3\2\2\2\3\u00cc\3\2\2\2\3\u00ce"+
		"\3\2\2\2\3\u00d0\3\2\2\2\3\u00d2\3\2\2\2\3\u00d4\3\2\2\2\4\u00d6\3\2\2"+
		"\2\4\u00d8\3\2\2\2\4\u00da\3\2\2\2\4\u00dc\3\2\2\2\5\u00de\3\2\2\2\5\u00e0"+
		"\3\2\2\2\5\u00e2\3\2\2\2\5\u00e4\3\2\2\2\6\u00e6\3\2\2\2\b\u00e9\3\2\2"+
		"\2\n\u00eb\3\2\2\2\f\u00ed\3\2\2\2\16\u00ef\3\2\2\2\20\u00f1\3\2\2\2\22"+
		"\u00f3\3\2\2\2\24\u00f6\3\2\2\2\26\u00f9\3\2\2\2\30\u00fc\3\2\2\2\32\u00ff"+
		"\3\2\2\2\34\u0102\3\2\2\2\36\u0105\3\2\2\2 \u0108\3\2\2\2\"\u010a\3\2"+
		"\2\2$\u010c\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2*\u0112\3\2\2\2,\u0116"+
		"\3\2\2\2.\u011a\3\2\2\2\60\u011d\3\2\2\2\62\u0120\3\2\2\2\64\u0122\3\2"+
		"\2\2\66\u0124\3\2\2\28\u0126\3\2\2\2:\u0129\3\2\2\2<\u012b\3\2\2\2>\u012d"+
		"\3\2\2\2@\u012f\3\2\2\2B\u0132\3\2\2\2D\u0135\3\2\2\2F\u0137\3\2\2\2H"+
		"\u013a\3\2\2\2J\u013c\3\2\2\2L\u013e\3\2\2\2N\u0141\3\2\2\2P\u0144\3\2"+
		"\2\2R\u0147\3\2\2\2T\u0149\3\2\2\2V\u014b\3\2\2\2X\u014d\3\2\2\2Z\u014f"+
		"\3\2\2\2\\\u0152\3\2\2\2^\u0155\3\2\2\2`\u015a\3\2\2\2b\u015d\3\2\2\2"+
		"d\u0163\3\2\2\2f\u0168\3\2\2\2h\u016f\3\2\2\2j\u0173\3\2\2\2l\u0176\3"+
		"\2\2\2n\u017d\3\2\2\2p\u0182\3\2\2\2r\u0186\3\2\2\2t\u018d\3\2\2\2v\u0193"+
		"\3\2\2\2x\u019a\3\2\2\2z\u019f\3\2\2\2|\u01a4\3\2\2\2~\u01a9\3\2\2\2\u0080"+
		"\u01b0\3\2\2\2\u0082\u01b6\3\2\2\2\u0084\u01be\3\2\2\2\u0086\u01c0\3\2"+
		"\2\2\u0088\u01c9\3\2\2\2\u008a\u01d2\3\2\2\2\u008c\u01d9\3\2\2\2\u008e"+
		"\u01df\3\2\2\2\u0090\u01e7\3\2\2\2\u0092\u01ee\3\2\2\2\u0094\u01f5\3\2"+
		"\2\2\u0096\u01fb\3\2\2\2\u0098\u0201\3\2\2\2\u009a\u0208\3\2\2\2\u009c"+
		"\u0210\3\2\2\2\u009e\u021b\3\2\2\2\u00a0\u021d\3\2\2\2\u00a2\u021f\3\2"+
		"\2\2\u00a4\u0223\3\2\2\2\u00a6\u0225\3\2\2\2\u00a8\u022a\3\2\2\2\u00aa"+
		"\u0232\3\2\2\2\u00ac\u0235\3\2\2\2\u00ae\u0239\3\2\2\2\u00b0\u0240\3\2"+
		"\2\2\u00b2\u024b\3\2\2\2\u00b4\u0256\3\2\2\2\u00b6\u025c\3\2\2\2\u00b8"+
		"\u0260\3\2\2\2\u00ba\u0264\3\2\2\2\u00bc\u0269\3\2\2\2\u00be\u026c\3\2"+
		"\2\2\u00c0\u0294\3\2\2\2\u00c2\u02d1\3\2\2\2\u00c4\u02d5\3\2\2\2\u00c6"+
		"\u02db\3\2\2\2\u00c8\u02de\3\2\2\2\u00ca\u02e7\3\2\2\2\u00cc\u02f2\3\2"+
		"\2\2\u00ce\u02fb\3\2\2\2\u00d0\u030f\3\2\2\2\u00d2\u0322\3\2\2\2\u00d4"+
		"\u032d\3\2\2\2\u00d6\u0335\3\2\2\2\u00d8\u0339\3\2\2\2\u00da\u033f\3\2"+
		"\2\2\u00dc\u0345\3\2\2\2\u00de\u0349\3\2\2\2\u00e0\u034d\3\2\2\2\u00e2"+
		"\u0353\3\2\2\2\u00e4\u0359\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\u00e8\7@\2"+
		"\2\u00e8\7\3\2\2\2\u00e9\u00ea\7=\2\2\u00ea\t\3\2\2\2\u00eb\u00ec\7*\2"+
		"\2\u00ec\13\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee\r\3\2\2\2\u00ef\u00f0\7<"+
		"\2\2\u00f0\17\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2\21\3\2\2\2\u00f3\u00f4"+
		"\7\'\2\2\u00f4\u00f5\7?\2\2\u00f5\23\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7"+
		"\u00f8\7?\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"\27\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7?\2\2\u00fe\31\3\2\2\2\u00ff"+
		"\u0100\7,\2\2\u0100\u0101\7?\2\2\u0101\33\3\2\2\2\u0102\u0103\7-\2\2\u0103"+
		"\u0104\7-\2\2\u0104\35\3\2\2\2\u0105\u0106\7/\2\2\u0106\u0107\7/\2\2\u0107"+
		"\37\3\2\2\2\u0108\u0109\7\'\2\2\u0109!\3\2\2\2\u010a\u010b\7-\2\2\u010b"+
		"#\3\2\2\2\u010c\u010d\7/\2\2\u010d%\3\2\2\2\u010e\u010f\7,\2\2\u010f\'"+
		"\3\2\2\2\u0110\u0111\7\61\2\2\u0111)\3\2\2\2\u0112\u0113\7>\2\2\u0113"+
		"\u0114\7>\2\2\u0114\u0115\7?\2\2\u0115+\3\2\2\2\u0116\u0117\7@\2\2\u0117"+
		"\u0118\7@\2\2\u0118\u0119\7?\2\2\u0119-\3\2\2\2\u011a\u011b\7>\2\2\u011b"+
		"\u011c\7>\2\2\u011c/\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f\7@\2\2\u011f"+
		"\61\3\2\2\2\u0120\u0121\7>\2\2\u0121\63\3\2\2\2\u0122\u0123\7@\2\2\u0123"+
		"\65\3\2\2\2\u0124\u0125\7?\2\2\u0125\67\3\2\2\2\u0126\u0127\7?\2\2\u0127"+
		"\u0128\7?\2\2\u01289\3\2\2\2\u0129\u012a\7}\2\2\u012a;\3\2\2\2\u012b\u012c"+
		"\7\177\2\2\u012c=\3\2\2\2\u012d\u012e\7\60\2\2\u012e?\3\2\2\2\u012f\u0130"+
		"\7>\2\2\u0130\u0131\7?\2\2\u0131A\3\2\2\2\u0132\u0133\7@\2\2\u0133\u0134"+
		"\7?\2\2\u0134C\3\2\2\2\u0135\u0136\7#\2\2\u0136E\3\2\2\2\u0137\u0138\7"+
		"#\2\2\u0138\u0139\7?\2\2\u0139G\3\2\2\2\u013a\u013b\7]\2\2\u013bI\3\2"+
		"\2\2\u013c\u013d\7_\2\2\u013dK\3\2\2\2\u013e\u013f\7(\2\2\u013f\u0140"+
		"\7?\2\2\u0140M\3\2\2\2\u0141\u0142\7~\2\2\u0142\u0143\7?\2\2\u0143O\3"+
		"\2\2\2\u0144\u0145\7`\2\2\u0145\u0146\7?\2\2\u0146Q\3\2\2\2\u0147\u0148"+
		"\7(\2\2\u0148S\3\2\2\2\u0149\u014a\7~\2\2\u014aU\3\2\2\2\u014b\u014c\7"+
		"`\2\2\u014cW\3\2\2\2\u014d\u014e\7\u0080\2\2\u014eY\3\2\2\2\u014f\u0150"+
		"\7(\2\2\u0150\u0151\7(\2\2\u0151[\3\2\2\2\u0152\u0153\7~\2\2\u0153\u0154"+
		"\7~\2\2\u0154]\3\2\2\2\u0155\u0156\7g\2\2\u0156\u0157\7n\2\2\u0157\u0158"+
		"\7u\2\2\u0158\u0159\7g\2\2\u0159_\3\2\2\2\u015a\u015b\7k\2\2\u015b\u015c"+
		"\7h\2\2\u015ca\3\2\2\2\u015d\u015e\7y\2\2\u015e\u015f\7j\2\2\u015f\u0160"+
		"\7k\2\2\u0160\u0161\7n\2\2\u0161\u0162\7g\2\2\u0162c\3\2\2\2\u0163\u0164"+
		"\7e\2\2\u0164\u0165\7c\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2\u0167"+
		"e\3\2\2\2\u0168\u0169\7u\2\2\u0169\u016a\7y\2\2\u016a\u016b\7k\2\2\u016b"+
		"\u016c\7v\2\2\u016c\u016d\7e\2\2\u016d\u016e\7j\2\2\u016eg\3\2\2\2\u016f"+
		"\u0170\7h\2\2\u0170\u0171\7q\2\2\u0171\u0172\7t\2\2\u0172i\3\2\2\2\u0173"+
		"\u0174\7f\2\2\u0174\u0175\7q\2\2\u0175k\3\2\2\2\u0176\u0177\7u\2\2\u0177"+
		"\u0178\7v\2\2\u0178\u0179\7t\2\2\u0179\u017a\7w\2\2\u017a\u017b\7e\2\2"+
		"\u017b\u017c\7v\2\2\u017cm\3\2\2\2\u017d\u017e\7x\2\2\u017e\u017f\7q\2"+
		"\2\u017f\u0180\7k\2\2\u0180\u0181\7f\2\2\u0181o\3\2\2\2\u0182\u0183\7"+
		"k\2\2\u0183\u0184\7p\2\2\u0184\u0185\7v\2\2\u0185q\3\2\2\2\u0186\u0187"+
		"\7u\2\2\u0187\u0188\7v\2\2\u0188\u0189\7t\2\2\u0189\u018a\7k\2\2\u018a"+
		"\u018b\7p\2\2\u018b\u018c\7i\2\2\u018cs\3\2\2\2\u018d\u018e\7h\2\2\u018e"+
		"\u018f\7n\2\2\u018f\u0190\7q\2\2\u0190\u0191\7c\2\2\u0191\u0192\7v\2\2"+
		"\u0192u\3\2\2\2\u0193\u0194\7f\2\2\u0194\u0195\7q\2\2\u0195\u0196\7w\2"+
		"\2\u0196\u0197\7d\2\2\u0197\u0198\7n\2\2\u0198\u0199\7g\2\2\u0199w\3\2"+
		"\2\2\u019a\u019b\7d\2\2\u019b\u019c\7q\2\2\u019c\u019d\7q\2\2\u019d\u019e"+
		"\7n\2\2\u019ey\3\2\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7j\2\2\u01a1\u01a2"+
		"\7c\2\2\u01a2\u01a3\7t\2\2\u01a3{\3\2\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6"+
		"\7q\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7i\2\2\u01a8}\3\2\2\2\u01a9\u01aa"+
		"\7u\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7|\2\2\u01ac\u01ad\7g\2\2\u01ad"+
		"\u01ae\7q\2\2\u01ae\u01af\7h\2\2\u01af\177\3\2\2\2\u01b0\u01b1\7e\2\2"+
		"\u01b1\u01b2\7q\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5"+
		"\7v\2\2\u01b5\u0081\3\2\2\2\u01b6\u01b7\7f\2\2\u01b7\u01b8\7g\2\2\u01b8"+
		"\u01b9\7h\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc\7n\2\2"+
		"\u01bc\u01bd\7v\2\2\u01bd\u0083\3\2\2\2\u01be\u01bf\7A\2\2\u01bf\u0085"+
		"\3\2\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7u\2\2\u01c3"+
		"\u01c4\7v\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7e\2\2"+
		"\u01c7\u01c8\7v\2\2\u01c8\u0087\3\2\2\2\u01c9\u01ca\7e\2\2\u01ca\u01cb"+
		"\7q\2\2\u01cb\u01cc\7p\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7k\2\2\u01ce"+
		"\u01cf\7p\2\2\u01cf\u01d0\7w\2\2\u01d0\u01d1\7g\2\2\u01d1\u0089\3\2\2"+
		"\2\u01d2\u01d3\7t\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6"+
		"\7w\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7p\2\2\u01d8\u008b\3\2\2\2\u01d9"+
		"\u01da\7d\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7c\2\2"+
		"\u01dd\u01de\7m\2\2\u01de\u008d\3\2\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1"+
		"\7{\2\2\u01e1\u01e2\7r\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7f\2\2\u01e4"+
		"\u01e5\7g\2\2\u01e5\u01e6\7h\2\2\u01e6\u008f\3\2\2\2\u01e7\u01e8\7g\2"+
		"\2\u01e8\u01e9\7z\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec"+
		"\7t\2\2\u01ec\u01ed\7p\2\2\u01ed\u0091\3\2\2\2\u01ee\u01ef\7u\2\2\u01ef"+
		"\u01f0\7v\2\2\u01f0\u01f1\7c\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7k\2\2"+
		"\u01f3\u01f4\7e\2\2\u01f4\u0093\3\2\2\2\u01f5\u01f6\7u\2\2\u01f6\u01f7"+
		"\7v\2\2\u01f7\u01f8\7c\2\2\u01f8\u01f9\7e\2\2\u01f9\u01fa\7m\2\2\u01fa"+
		"\u0095\3\2\2\2\u01fb\u01fc\7s\2\2\u01fc\u01fd\7w\2\2\u01fd\u01fe\7g\2"+
		"\2\u01fe\u01ff\7w\2\2\u01ff\u0200\7g\2\2\u0200\u0097\3\2\2\2\u0201\u0202"+
		"\7x\2\2\u0202\u0203\7g\2\2\u0203\u0204\7e\2\2\u0204\u0205\7v\2\2\u0205"+
		"\u0206\7q\2\2\u0206\u0207\7t\2\2\u0207\u0099\3\2\2\2\u0208\u0209\7w\2"+
		"\2\u0209\u020a\7p\2\2\u020a\u020b\7s\2\2\u020b\u020c\7a\2\2\u020c\u020d"+
		"\7r\2\2\u020d\u020e\7v\2\2\u020e\u020f\7t\2\2\u020f\u009b\3\2\2\2\u0210"+
		"\u0211\7u\2\2\u0211\u0212\7j\2\2\u0212\u0213\7c\2\2\u0213\u0214\7t\2\2"+
		"\u0214\u0215\7g\2\2\u0215\u0216\7f\2\2\u0216\u0217\7a\2\2\u0217\u0218"+
		"\7r\2\2\u0218\u0219\7v\2\2\u0219\u021a\7t\2\2\u021a\u009d\3\2\2\2\u021b"+
		"\u021c\4\62;\2\u021c\u009f\3\2\2\2\u021d\u021e\4c|\2\u021e\u00a1\3\2\2"+
		"\2\u021f\u0220\4C\\\2\u0220\u00a3\3\2\2\2\u0221\u0224\5\u00a0O\2\u0222"+
		"\u0224\5\u00a2P\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u00a5"+
		"\3\2\2\2\u0225\u0226\7v\2\2\u0226\u0227\7t\2\2\u0227\u0228\7w\2\2\u0228"+
		"\u0229\7g\2\2\u0229\u00a7\3\2\2\2\u022a\u022b\7h\2\2\u022b\u022c\7c\2"+
		"\2\u022c\u022d\7n\2\2\u022d\u022e\7u\2\2\u022e\u022f\7g\2\2\u022f\u00a9"+
		"\3\2\2\2\u0230\u0233\5\u00a6R\2\u0231\u0233\5\u00a8S\2\u0232\u0230\3\2"+
		"\2\2\u0232\u0231\3\2\2\2\u0233\u00ab\3\2\2\2\u0234\u0236\5\u009eN\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u00ad\3\2\2\2\u0239\u023a\7)\2\2\u023a\u023b\13\2\2\2\u023b"+
		"\u023c\7)\2\2\u023c\u00af\3\2\2\2\u023d\u023f\5\u009eN\2\u023e\u023d\3"+
		"\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0245\7\60\2\2\u0244\u0246\5"+
		"\u009eN\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245\3\2\2\2"+
		"\u0247\u0248\3\2\2\2\u0248\u00b1\3\2\2\2\u0249\u024c\5\u00a4Q\2\u024a"+
		"\u024c\7a\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u0252\3\2"+
		"\2\2\u024d\u0251\7a\2\2\u024e\u0251\5\u00a4Q\2\u024f\u0251\5\u009eN\2"+
		"\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u00b3\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0257\t\2\2\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025b\bY\2\2\u025b\u00b5\3\2\2\2\u025c\u025d\7$\2\2\u025d\u025e\7\f\2"+
		"\2\u025e\u025f\bZ\3\2\u025f\u00b7\3\2\2\2\u0260\u0261\7$\2\2\u0261\u0262"+
		"\7\2\2\3\u0262\u0263\b[\4\2\u0263\u00b9\3\2\2\2\u0264\u0265\7$\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\b\\\2\2\u0267\u0268\b\\\5\2\u0268\u00bb\3\2"+
		"\2\2\u0269\u026a\7^\2\2\u026a\u026b\13\2\2\2\u026b\u00bd\3\2\2\2\u026c"+
		"\u0270\7%\2\2\u026d\u026f\t\3\2\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2"+
		"\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0274\7f\2\2\u0274\u0275\7g\2\2\u0275\u0276\7h\2"+
		"\2\u0276\u0277\7k\2\2\u0277\u0278\7p\2\2\u0278\u0279\7g\2\2\u0279\u027b"+
		"\3\2\2\2\u027a\u027c\t\3\2\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0282\3\2\2\2\u027f\u0281\n\4"+
		"\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0290\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0287\t\3"+
		"\2\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\u028d\3\2\2\2\u028a\u028c\n\5\2\2\u028b\u028a\3\2"+
		"\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0286\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\u0293\b^\2\2\u0293\u00bf\3\2\2\2\u0294"+
		"\u0298\7%\2\2\u0295\u0297\t\3\2\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029b\u029c\7k\2\2\u029c\u029d\7p\2\2\u029d\u029e\7e\2"+
		"\2\u029e\u029f\7n\2\2\u029f\u02a0\7w\2\2\u02a0\u02a1\7f\2\2\u02a1\u02a2"+
		"\7g\2\2\u02a2\u02a6\3\2\2\2\u02a3\u02a5\t\3\2\2\u02a4\u02a3\3\2\2\2\u02a5"+
		"\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02b9\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ad\7$\2\2\u02aa\u02ac\n\6\2\2\u02ab"+
		"\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02ba\7$\2\2\u02b1"+
		"\u02b5\7>\2\2\u02b2\u02b4\n\6\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02ba\7@\2\2\u02b9\u02a9\3\2\2\2\u02b9\u02b1\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\b_\2\2\u02bc\u00c1\3\2\2\2\u02bd"+
		"\u02be\7\61\2\2\u02be\u02bf\7\61\2\2\u02bf\u02c3\3\2\2\2\u02c0\u02c2\13"+
		"\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02d2\7\f"+
		"\2\2\u02c7\u02c8\7\61\2\2\u02c8\u02c9\7\61\2\2\u02c9\u02cd\3\2\2\2\u02ca"+
		"\u02cc\13\2\2\2\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02ce\3"+
		"\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d2\7\2\2\3\u02d1\u02bd\3\2\2\2\u02d1\u02c7\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d4\b`\2\2\u02d4\u00c3\3\2\2\2\u02d5\u02d6\7\61\2\2\u02d6"+
		"\u02d7\7,\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\ba\6\2\u02d9\u02da\ba\2"+
		"\2\u02da\u00c5\3\2\2\2\u02db\u02dc\13\2\2\2\u02dc\u02dd\bb\7\2\u02dd\u00c7"+
		"\3\2\2\2\u02de\u02df\7$\2\2\u02df\u02e0\bc\b\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e2\bc\t\2\u02e2\u00c9\3\2\2\2\u02e3\u02e6\n\7\2\2\u02e4\u02e6\5\u00bc"+
		"]\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7"+
		"\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02ea\u02eb\7^\2\2\u02eb\u02ec\7\2\2\3\u02ec\u02ed\bd\n\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\bd\13\2\u02ef\u00cb\3\2\2\2\u02f0\u02f3\5\u00bc]"+
		"\2\u02f1\u02f3\n\b\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f7\be\f\2\u02f7\u00cd\3\2\2\2\u02f8\u02fa\13\2\2\2\u02f9\u02f8\3\2"+
		"\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fe\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\7^\2\2\u02ff\u0303\7\2"+
		"\2\2\u0300\u0302\13\2\2\2\u0301\u0300\3\2\2\2\u0302\u0305\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0306\u0307\7\f\2\2\u0307\u0308\3\2\2\2\u0308\u0309\bf\r\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\bf\13\2\u030b\u00cf\3\2\2\2\u030c\u030e\13"+
		"\2\2\2\u030d\u030c\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0316\7\2"+
		"\2\2\u0313\u0315\13\2\2\2\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2"+
		"\2\2\u0319\u031a\7\f\2\2\u031a\u031b\3\2\2\2\u031b\u031c\bg\16\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031e\bg\13\2\u031e\u00d1\3\2\2\2\u031f\u0321\n\t"+
		"\2\2\u0320\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0326\7\f"+
		"\2\2\u0326\u0327\bh\17\2\u0327\u0328\3\2\2\2\u0328\u0329\bh\13\2\u0329"+
		"\u00d3\3\2\2\2\u032a\u032c\n\t\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2"+
		"\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u0330\u0331\7\2\2\3\u0331\u0332\bi\20\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0334\bi\13\2\u0334\u00d5\3\2\2\2\u0335\u0336\13\2\2\2\u0336"+
		"\u0337\7\2\2\3\u0337\u0338\bj\21\2\u0338\u00d7\3\2\2\2\u0339\u033a\7\61"+
		"\2\2\u033a\u033b\7,\2\2\u033b\u033c\3\2\2\2\u033c\u033d\bk\22\2\u033d"+
		"\u033e\bk\2\2\u033e\u00d9\3\2\2\2\u033f\u0340\7,\2\2\u0340\u0341\7\61"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0343\bl\t\2\u0343\u0344\bl\2\2\u0344\u00db"+
		"\3\2\2\2\u0345\u0346\13\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\bm\2\2\u0348"+
		"\u00dd\3\2\2\2\u0349\u034a\13\2\2\2\u034a\u034b\7\2\2\3\u034b\u034c\b"+
		"n\23\2\u034c\u00df\3\2\2\2\u034d\u034e\7\61\2\2\u034e\u034f\7,\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0351\bo\22\2\u0351\u0352\bo\2\2\u0352\u00e1\3\2"+
		"\2\2\u0353\u0354\7,\2\2\u0354\u0355\7\61\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0357\7\2\2\3\u0357\u0358\bp\24\2\u0358\u00e3\3\2\2\2\u0359\u035a\7,"+
		"\2\2\u035a\u035b\7\61\2\2\u035b\u035c\3\2\2\2\u035c\u035d\bq\t\2\u035d"+
		"\u035e\bq\2\2\u035e\u00e5\3\2\2\2\'\2\3\4\5\u0223\u0232\u0237\u0240\u0247"+
		"\u024b\u0250\u0252\u0258\u0270\u027d\u0282\u0288\u028d\u0290\u0298\u02a6"+
		"\u02ad\u02b5\u02b9\u02c3\u02cd\u02d1\u02e5\u02e7\u02f2\u02f4\u02fb\u0303"+
		"\u030f\u0316\u0322\u032d\25\b\2\2\3Z\2\3[\3\7\3\2\7\4\2\3b\4\3c\5\6\2"+
		"\2\3d\6\4\2\2\5\2\2\3f\7\3g\b\3h\t\3i\n\3j\13\7\5\2\3n\f\3p\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}