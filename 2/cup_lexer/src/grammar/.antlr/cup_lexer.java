// Generated from /home/srikar34/cup_lexer/src/grammar/cup_lexer.g4 by ANTLR 4.8
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
		VOID=1, INT=2, FLOAT=3, DOUBLE=4, CHAR=5, BOOL=6, LONG=7, ERROR=8, IDENTIFIER=9, 
		BOOL_CONST=10, NUMERIC_CONST=11, STRING_LITERAL=12, LPAREN=13, RPAREN=14, 
		COLON=15, SEMICOLON=16, COMMA=17, PLUS=18, MINUS=19, STAR=20, SLASH=21, 
		PERCENT=22, PERCENTEQUAL=23, PLUSPLUS=24, MINUSMINUS=25, PLUSEQUAL=26, 
		MINUSEQUAL=27, SLASHEQUAL=28, STAREQUAL=29, TILDE=30, LESS=31, GREATER=32, 
		LESSLESS=33, GREATERGREATER=34, LESSLESSEQUAL=35, GREATERGREATEREQUAL=36, 
		LESSEQUAL=37, GREATEREQUAL=38, EQUAL=39, EQUALEQUAL=40, EXCLAIMEQUAL=41, 
		EXCLAIM=42, LSQR=43, RSQR=44, LBRACE=45, RBRACE=46, DOT=47, ELSE=48, IF=49, 
		DO=50, WHILE=51, CASE=52, SWITCH=53, FOR=54, UNKNOWN=55, AMP=56, PIPE=57, 
		CARET=58, AMPAMP=59, PIPEPIPE=60, AMPEQUAL=61, PIPEEQUAL=62, CARETEQUAL=63, 
		STRUCT=64, ARROW=65, WHITESPACE=66, STR_UNT_NO_TEXT=67, STR_EOF_NO_TEXT=68, 
		STR_CHECK=69, SL_COMMENT=70, COMMENT=71, STR_END=72, END_SLASH=73, ESC_NULL_IN_STR=74, 
		NULL_IN_STR=75, UNT_STR=76, EOF_STR=77, EOF_in_commment=78, NEW_COMMENT=79, 
		END_COMMENT=80, MATTER=81, EOF_in_nested_comment=82, THIS_NEW_COMMENT=83, 
		END_BEFORE_EMPTY_STACK=84, END_THIS_COMMENT=85;
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
			"SWITCH", "FOR", "DO", "STRUCT", "VOID", "INT", "FLOAT", "DOUBLE", "BOOL", 
			"CHAR", "LONG", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", "FALSE", 
			"BOOL_CONST", "NUMERIC_CONST", "IDENTIFIER", "WHITESPACE", "STR_UNT_NO_TEXT", 
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
			null, "'void'", "'int'", "'float'", "'double'", "'char'", "'bool'", null, 
			null, null, null, null, null, "'('", "')'", "':'", "';'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'%='", "'++'", "'--'", "'+='", "'-='", "'/='", 
			"'*='", "'~'", "'<'", "'>'", "'<<'", "'>>'", "'<<='", "'>>='", "'<='", 
			"'>='", "'='", "'=='", "'!='", "'!'", "'['", "']'", "'{'", "'}'", "'.'", 
			"'else'", "'if'", "'do'", "'while'", "'case'", "'switch'", "'for'", null, 
			"'&'", "'|'", "'^'", "'&&'", "'||'", "'&='", "'|='", "'^='", "'struct'", 
			"'->'", null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "INT", "FLOAT", "DOUBLE", "CHAR", "BOOL", "LONG", "ERROR", 
			"IDENTIFIER", "BOOL_CONST", "NUMERIC_CONST", "STRING_LITERAL", "LPAREN", 
			"RPAREN", "COLON", "SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "PERCENTEQUAL", "PLUSPLUS", "MINUSMINUS", "PLUSEQUAL", "MINUSEQUAL", 
			"SLASHEQUAL", "STAREQUAL", "TILDE", "LESS", "GREATER", "LESSLESS", "GREATERGREATER", 
			"LESSLESSEQUAL", "GREATERGREATEREQUAL", "LESSEQUAL", "GREATEREQUAL", 
			"EQUAL", "EQUALEQUAL", "EXCLAIMEQUAL", "EXCLAIM", "LSQR", "RSQR", "LBRACE", 
			"RBRACE", "DOT", "ELSE", "IF", "DO", "WHILE", "CASE", "SWITCH", "FOR", 
			"UNKNOWN", "AMP", "PIPE", "CARET", "AMPAMP", "PIPEPIPE", "AMPEQUAL", 
			"PIPEEQUAL", "CARETEQUAL", "STRUCT", "ARROW", "WHITESPACE", "STR_UNT_NO_TEXT", 
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
			if(printstring.length() > 1024){
				reportError("String constant too long"); 						//string length checking
				return;
			}
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
			if(printstring.length() > 1024){												//string length checking
				reportError("String constant too long");
				return;
			}
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
		case 69:
			STR_UNT_NO_TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			STR_EOF_NO_TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 75:
			UNKNOWN_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
			STR_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			END_SLASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			ESC_NULL_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			NULL_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			UNT_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			EOF_in_commment_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
			EOF_in_nested_comment_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2W\u025b\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR"+
		"\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\5@\u0181\n@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3"+
		"B\3C\3C\5C\u0190\nC\3D\6D\u0193\nD\rD\16D\u0194\3E\3E\5E\u0199\nE\3E\3"+
		"E\3E\7E\u019e\nE\fE\16E\u01a1\13E\3F\6F\u01a4\nF\rF\16F\u01a5\3F\3F\3"+
		"G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K\7K\u01be\n"+
		"K\fK\16K\u01c1\13K\3K\3K\3K\3K\3K\7K\u01c8\nK\fK\16K\u01cb\13K\3K\5K\u01ce"+
		"\nK\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\7O\u01e2\nO"+
		"\fO\16O\u01e5\13O\3O\3O\3O\3O\3O\3O\3P\3P\6P\u01ef\nP\rP\16P\u01f0\3P"+
		"\3P\3Q\7Q\u01f6\nQ\fQ\16Q\u01f9\13Q\3Q\3Q\3Q\7Q\u01fe\nQ\fQ\16Q\u0201"+
		"\13Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\7R\u020a\nR\fR\16R\u020d\13R\3R\3R\7R\u0211"+
		"\nR\fR\16R\u0214\13R\3R\3R\3R\3R\3R\3R\3S\7S\u021d\nS\fS\16S\u0220\13"+
		"S\3S\3S\3S\3S\3S\3T\7T\u0228\nT\fT\16T\u022b\13T\3T\3T\3T\3T\3T\3U\3U"+
		"\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\6\u01bf\u01c9"+
		"\u01ff\u0212\2]\6C\b\22\n\17\f\20\16\21\20\23\22\31\24\34\26\35\30\36"+
		"\32\37\34\32\36\33 \30\"\24$\25&\26(\27*%,&.#\60$\62!\64\"\66)8*:/<\60"+
		">\61@\'B(D,F+H-J.L?N@PAR:T;V<X Z=\\>^\62`\63b\65d\66f\67h8j\64lBn\3p\4"+
		"r\5t\6v\bx\7z\t|\2~\2\u0080\2\u0082\2\u0084\2\u0086\2\u0088\f\u008a\r"+
		"\u008c\13\u008eD\u0090E\u0092F\u0094G\u0096\2\u0098H\u009aI\u009c9\u009e"+
		"J\u00a0K\u00a2\16\u00a4L\u00a6M\u00a8N\u00aaO\u00acP\u00aeQ\u00b0R\u00b2"+
		"S\u00b4T\u00b6U\u00b8V\u00baW\6\2\3\4\5\6\4\2\13\17\"\"\4\2$$^^\5\2\f"+
		"\f$$^^\4\2\f\f$$\2\u0265\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2"+
		"\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2"+
		"\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2"+
		"\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2"+
		"\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2"+
		"\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2"+
		"\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T"+
		"\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3"+
		"\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2"+
		"\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2"+
		"z\3\2\2\2\2\u0088\3\2\2\2\2\u008a\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2"+
		"\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2\2\2\u0094\3\2\2\2\2\u0098\3\2\2\2\2"+
		"\u009a\3\2\2\2\2\u009c\3\2\2\2\3\u009e\3\2\2\2\3\u00a0\3\2\2\2\3\u00a2"+
		"\3\2\2\2\3\u00a4\3\2\2\2\3\u00a6\3\2\2\2\3\u00a8\3\2\2\2\3\u00aa\3\2\2"+
		"\2\4\u00ac\3\2\2\2\4\u00ae\3\2\2\2\4\u00b0\3\2\2\2\4\u00b2\3\2\2\2\5\u00b4"+
		"\3\2\2\2\5\u00b6\3\2\2\2\5\u00b8\3\2\2\2\5\u00ba\3\2\2\2\6\u00bc\3\2\2"+
		"\2\b\u00bf\3\2\2\2\n\u00c1\3\2\2\2\f\u00c3\3\2\2\2\16\u00c5\3\2\2\2\20"+
		"\u00c7\3\2\2\2\22\u00c9\3\2\2\2\24\u00cc\3\2\2\2\26\u00cf\3\2\2\2\30\u00d2"+
		"\3\2\2\2\32\u00d5\3\2\2\2\34\u00d8\3\2\2\2\36\u00db\3\2\2\2 \u00de\3\2"+
		"\2\2\"\u00e0\3\2\2\2$\u00e2\3\2\2\2&\u00e4\3\2\2\2(\u00e6\3\2\2\2*\u00e8"+
		"\3\2\2\2,\u00ec\3\2\2\2.\u00f0\3\2\2\2\60\u00f3\3\2\2\2\62\u00f6\3\2\2"+
		"\2\64\u00f8\3\2\2\2\66\u00fa\3\2\2\28\u00fc\3\2\2\2:\u00ff\3\2\2\2<\u0101"+
		"\3\2\2\2>\u0103\3\2\2\2@\u0105\3\2\2\2B\u0108\3\2\2\2D\u010b\3\2\2\2F"+
		"\u010d\3\2\2\2H\u0110\3\2\2\2J\u0112\3\2\2\2L\u0114\3\2\2\2N\u0117\3\2"+
		"\2\2P\u011a\3\2\2\2R\u011d\3\2\2\2T\u011f\3\2\2\2V\u0121\3\2\2\2X\u0123"+
		"\3\2\2\2Z\u0125\3\2\2\2\\\u0128\3\2\2\2^\u012b\3\2\2\2`\u0130\3\2\2\2"+
		"b\u0133\3\2\2\2d\u0139\3\2\2\2f\u013e\3\2\2\2h\u0145\3\2\2\2j\u0149\3"+
		"\2\2\2l\u014c\3\2\2\2n\u0153\3\2\2\2p\u0158\3\2\2\2r\u015c\3\2\2\2t\u0162"+
		"\3\2\2\2v\u0169\3\2\2\2x\u016e\3\2\2\2z\u0173\3\2\2\2|\u0178\3\2\2\2~"+
		"\u017a\3\2\2\2\u0080\u017c\3\2\2\2\u0082\u0180\3\2\2\2\u0084\u0182\3\2"+
		"\2\2\u0086\u0187\3\2\2\2\u0088\u018f\3\2\2\2\u008a\u0192\3\2\2\2\u008c"+
		"\u0198\3\2\2\2\u008e\u01a3\3\2\2\2\u0090\u01a9\3\2\2\2\u0092\u01ad\3\2"+
		"\2\2\u0094\u01b1\3\2\2\2\u0096\u01b6\3\2\2\2\u0098\u01cd\3\2\2\2\u009a"+
		"\u01d1\3\2\2\2\u009c\u01d7\3\2\2\2\u009e\u01da\3\2\2\2\u00a0\u01e3\3\2"+
		"\2\2\u00a2\u01ee\3\2\2\2\u00a4\u01f7\3\2\2\2\u00a6\u020b\3\2\2\2\u00a8"+
		"\u021e\3\2\2\2\u00aa\u0229\3\2\2\2\u00ac\u0231\3\2\2\2\u00ae\u0235\3\2"+
		"\2\2\u00b0\u023b\3\2\2\2\u00b2\u0241\3\2\2\2\u00b4\u0245\3\2\2\2\u00b6"+
		"\u0249\3\2\2\2\u00b8\u024f\3\2\2\2\u00ba\u0255\3\2\2\2\u00bc\u00bd\7/"+
		"\2\2\u00bd\u00be\7@\2\2\u00be\7\3\2\2\2\u00bf\u00c0\7=\2\2\u00c0\t\3\2"+
		"\2\2\u00c1\u00c2\7*\2\2\u00c2\13\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4\r\3"+
		"\2\2\2\u00c5\u00c6\7<\2\2\u00c6\17\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8\21"+
		"\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cb\7?\2\2\u00cb\23\3\2\2\2\u00cc"+
		"\u00cd\7-\2\2\u00cd\u00ce\7?\2\2\u00ce\25\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7?\2\2"+
		"\u00d4\31\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\7?\2\2\u00d7\33\3\2\2"+
		"\2\u00d8\u00d9\7-\2\2\u00d9\u00da\7-\2\2\u00da\35\3\2\2\2\u00db\u00dc"+
		"\7/\2\2\u00dc\u00dd\7/\2\2\u00dd\37\3\2\2\2\u00de\u00df\7\'\2\2\u00df"+
		"!\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3%"+
		"\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7"+
		")\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7?\2\2\u00eb"+
		"+\3\2\2\2\u00ec\u00ed\7@\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7?\2\2\u00ef"+
		"-\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7>\2\2\u00f2/\3\2\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4\u00f5\7@\2\2\u00f5\61\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\63"+
		"\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9\65\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"\67\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\u00fe\7?\2\2\u00fe9\3\2\2\2\u00ff"+
		"\u0100\7}\2\2\u0100;\3\2\2\2\u0101\u0102\7\177\2\2\u0102=\3\2\2\2\u0103"+
		"\u0104\7\60\2\2\u0104?\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107\7?\2\2\u0107"+
		"A\3\2\2\2\u0108\u0109\7@\2\2\u0109\u010a\7?\2\2\u010aC\3\2\2\2\u010b\u010c"+
		"\7#\2\2\u010cE\3\2\2\2\u010d\u010e\7#\2\2\u010e\u010f\7?\2\2\u010fG\3"+
		"\2\2\2\u0110\u0111\7]\2\2\u0111I\3\2\2\2\u0112\u0113\7_\2\2\u0113K\3\2"+
		"\2\2\u0114\u0115\7(\2\2\u0115\u0116\7?\2\2\u0116M\3\2\2\2\u0117\u0118"+
		"\7~\2\2\u0118\u0119\7?\2\2\u0119O\3\2\2\2\u011a\u011b\7`\2\2\u011b\u011c"+
		"\7?\2\2\u011cQ\3\2\2\2\u011d\u011e\7(\2\2\u011eS\3\2\2\2\u011f\u0120\7"+
		"~\2\2\u0120U\3\2\2\2\u0121\u0122\7`\2\2\u0122W\3\2\2\2\u0123\u0124\7\u0080"+
		"\2\2\u0124Y\3\2\2\2\u0125\u0126\7(\2\2\u0126\u0127\7(\2\2\u0127[\3\2\2"+
		"\2\u0128\u0129\7~\2\2\u0129\u012a\7~\2\2\u012a]\3\2\2\2\u012b\u012c\7"+
		"g\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e\u012f\7g\2\2\u012f_"+
		"\3\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7h\2\2\u0132a\3\2\2\2\u0133\u0134"+
		"\7y\2\2\u0134\u0135\7j\2\2\u0135\u0136\7k\2\2\u0136\u0137\7n\2\2\u0137"+
		"\u0138\7g\2\2\u0138c\3\2\2\2\u0139\u013a\7e\2\2\u013a\u013b\7c\2\2\u013b"+
		"\u013c\7u\2\2\u013c\u013d\7g\2\2\u013de\3\2\2\2\u013e\u013f\7u\2\2\u013f"+
		"\u0140\7y\2\2\u0140\u0141\7k\2\2\u0141\u0142\7v\2\2\u0142\u0143\7e\2\2"+
		"\u0143\u0144\7j\2\2\u0144g\3\2\2\2\u0145\u0146\7h\2\2\u0146\u0147\7q\2"+
		"\2\u0147\u0148\7t\2\2\u0148i\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b\7"+
		"q\2\2\u014bk\3\2\2\2\u014c\u014d\7u\2\2\u014d\u014e\7v\2\2\u014e\u014f"+
		"\7t\2\2\u014f\u0150\7w\2\2\u0150\u0151\7e\2\2\u0151\u0152\7v\2\2\u0152"+
		"m\3\2\2\2\u0153\u0154\7x\2\2\u0154\u0155\7q\2\2\u0155\u0156\7k\2\2\u0156"+
		"\u0157\7f\2\2\u0157o\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a"+
		"\u015b\7v\2\2\u015bq\3\2\2\2\u015c\u015d\7h\2\2\u015d\u015e\7n\2\2\u015e"+
		"\u015f\7q\2\2\u015f\u0160\7c\2\2\u0160\u0161\7v\2\2\u0161s\3\2\2\2\u0162"+
		"\u0163\7f\2\2\u0163\u0164\7q\2\2\u0164\u0165\7w\2\2\u0165\u0166\7d\2\2"+
		"\u0166\u0167\7n\2\2\u0167\u0168\7g\2\2\u0168u\3\2\2\2\u0169\u016a\7d\2"+
		"\2\u016a\u016b\7q\2\2\u016b\u016c\7q\2\2\u016c\u016d\7n\2\2\u016dw\3\2"+
		"\2\2\u016e\u016f\7e\2\2\u016f\u0170\7j\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7t\2\2\u0172y\3\2\2\2\u0173\u0174\7n\2\2\u0174\u0175\7q\2\2\u0175\u0176"+
		"\7p\2\2\u0176\u0177\7i\2\2\u0177{\3\2\2\2\u0178\u0179\4\62;\2\u0179}\3"+
		"\2\2\2\u017a\u017b\4c|\2\u017b\177\3\2\2\2\u017c\u017d\4C\\\2\u017d\u0081"+
		"\3\2\2\2\u017e\u0181\5~>\2\u017f\u0181\5\u0080?\2\u0180\u017e\3\2\2\2"+
		"\u0180\u017f\3\2\2\2\u0181\u0083\3\2\2\2\u0182\u0183\7v\2\2\u0183\u0184"+
		"\7t\2\2\u0184\u0185\7w\2\2\u0185\u0186\7g\2\2\u0186\u0085\3\2\2\2\u0187"+
		"\u0188\7h\2\2\u0188\u0189\7c\2\2\u0189\u018a\7n\2\2\u018a\u018b\7u\2\2"+
		"\u018b\u018c\7g\2\2\u018c\u0087\3\2\2\2\u018d\u0190\5\u0084A\2\u018e\u0190"+
		"\5\u0086B\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0089\3\2\2"+
		"\2\u0191\u0193\5|=\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u008b\3\2\2\2\u0196\u0199\5\u0082@"+
		"\2\u0197\u0199\7a\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019f"+
		"\3\2\2\2\u019a\u019e\7a\2\2\u019b\u019e\5\u0082@\2\u019c\u019e\5|=\2\u019d"+
		"\u019a\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u008d\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a4\t\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\bF\2\2\u01a8\u008f\3\2\2\2\u01a9\u01aa\7$\2\2\u01aa\u01ab\7\f\2"+
		"\2\u01ab\u01ac\bG\3\2\u01ac\u0091\3\2\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af"+
		"\7\2\2\3\u01af\u01b0\bH\4\2\u01b0\u0093\3\2\2\2\u01b1\u01b2\7$\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\bI\2\2\u01b4\u01b5\bI\5\2\u01b5\u0095\3\2\2"+
		"\2\u01b6\u01b7\7^\2\2\u01b7\u01b8\13\2\2\2\u01b8\u0097\3\2\2\2\u01b9\u01ba"+
		"\7\61\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01be\13\2\2"+
		"\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c0\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01ce\7\f\2\2\u01c3"+
		"\u01c4\7\61\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c8\13"+
		"\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01ca\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\7\2"+
		"\2\3\u01cd\u01b9\3\2\2\2\u01cd\u01c3\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\bK\2\2\u01d0\u0099\3\2\2\2\u01d1\u01d2\7\61\2\2\u01d2\u01d3\7,"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\bL\6\2\u01d5\u01d6\bL\2\2\u01d6\u009b"+
		"\3\2\2\2\u01d7\u01d8\13\2\2\2\u01d8\u01d9\bM\7\2\u01d9\u009d\3\2\2\2\u01da"+
		"\u01db\7$\2\2\u01db\u01dc\bN\b\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\bN\t"+
		"\2\u01de\u009f\3\2\2\2\u01df\u01e2\n\3\2\2\u01e0\u01e2\5\u0096J\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e7\7^\2\2\u01e7\u01e8\7\2\2\3\u01e8\u01e9\bO\n\2\u01e9\u01ea\3\2\2"+
		"\2\u01ea\u01eb\bO\13\2\u01eb\u00a1\3\2\2\2\u01ec\u01ef\5\u0096J\2\u01ed"+
		"\u01ef\n\4\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\bP\f\2\u01f3\u00a3\3\2\2\2\u01f4\u01f6\13\2\2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7^\2\2\u01fb\u01ff\7\2"+
		"\2\2\u01fc\u01fe\13\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0202\u0203\7\f\2\2\u0203\u0204\3\2\2\2\u0204\u0205\bQ\r\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\bQ\13\2\u0207\u00a5\3\2\2\2\u0208\u020a\13"+
		"\2\2\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0212\7\2"+
		"\2\2\u020f\u0211\13\2\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u0216\7\f\2\2\u0216\u0217\3\2\2\2\u0217\u0218\bR\16\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\bR\13\2\u021a\u00a7\3\2\2\2\u021b\u021d\n\5"+
		"\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7\f"+
		"\2\2\u0222\u0223\bS\17\2\u0223\u0224\3\2\2\2\u0224\u0225\bS\13\2\u0225"+
		"\u00a9\3\2\2\2\u0226\u0228\n\5\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\7\2\2\3\u022d\u022e\bT\20\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0230\bT\13\2\u0230\u00ab\3\2\2\2\u0231\u0232\13\2\2\2\u0232"+
		"\u0233\7\2\2\3\u0233\u0234\bU\21\2\u0234\u00ad\3\2\2\2\u0235\u0236\7\61"+
		"\2\2\u0236\u0237\7,\2\2\u0237\u0238\3\2\2\2\u0238\u0239\bV\22\2\u0239"+
		"\u023a\bV\2\2\u023a\u00af\3\2\2\2\u023b\u023c\7,\2\2\u023c\u023d\7\61"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u023f\bW\t\2\u023f\u0240\bW\2\2\u0240\u00b1"+
		"\3\2\2\2\u0241\u0242\13\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\bX\2\2\u0244"+
		"\u00b3\3\2\2\2\u0245\u0246\13\2\2\2\u0246\u0247\7\2\2\3\u0247\u0248\b"+
		"Y\23\2\u0248\u00b5\3\2\2\2\u0249\u024a\7\61\2\2\u024a\u024b\7,\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\bZ\22\2\u024d\u024e\bZ\2\2\u024e\u00b7\3\2"+
		"\2\2\u024f\u0250\7,\2\2\u0250\u0251\7\61\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\7\2\2\3\u0253\u0254\b[\24\2\u0254\u00b9\3\2\2\2\u0255\u0256\7,"+
		"\2\2\u0256\u0257\7\61\2\2\u0257\u0258\3\2\2\2\u0258\u0259\b\\\t\2\u0259"+
		"\u025a\b\\\2\2\u025a\u00bb\3\2\2\2\32\2\3\4\5\u0180\u018f\u0194\u0198"+
		"\u019d\u019f\u01a5\u01bf\u01c9\u01cd\u01e1\u01e3\u01ee\u01f0\u01f7\u01ff"+
		"\u020b\u0212\u021e\u0229\25\b\2\2\3G\2\3H\3\7\3\2\7\4\2\3M\4\3N\5\6\2"+
		"\2\3O\6\4\2\2\5\2\2\3Q\7\3R\b\3S\t\3T\n\3U\13\7\5\2\3Y\f\3[\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}