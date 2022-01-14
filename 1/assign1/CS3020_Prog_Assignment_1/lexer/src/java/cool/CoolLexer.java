// Generated from CoolLexer.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WRONGCOMMENT=43, WHITESPACE=44, 
		EOFSTR1=45, STRINGSTART=46, ONELINECOMMENT=47, BEGINNESTEDCOMMENT1=48, 
		OTHER=49, STRINGEND=50, NULLC1=51, NULLC=52, NEWLINE=53, SLASH3=54, NEWLINE2=55, 
		SLASHLINE2=56, EOFSTR=57, EOFSTR2=58, EOFERRB1=59, EOFERR=60, NESTEDCOMMENT2=61, 
		ENDNESTEDCOMMENT1=62, MULTICOMMENT1=63, ERRB=64, EOFERR2=65, NESTEDCOMMENT3=66, 
		EOFERR3=67, ENDNESTEDCOMMENT2=68, MNESTEDCOMMENT2=69;
	public static final int STRINGMODE = 1;
	public static final int MULTILINECOMMENT = 2;
	public static final int MULTILINECOMMENT2 = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRINGMODE", "MULTILINECOMMENT", "MULTILINECOMMENT2"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", 
		"DOT", "ASSIGN", "ATSYM", "COLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", 
		"LPAREN", "RPAREN", "NEW", "CLASS", "LOOP", "POOL", "IF", "FI", "IN", 
		"ELSE", "INHERITS", "THEN", "WHILE", "CASE", "ESAC", "LET", "OF", "ISVOID", 
		"NOT", "DIGIT", "LETTER", "ESC_SEQUENCE", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"TYPEID", "OBJECTID", "WRONGCOMMENT", "WHITESPACE", "EOFSTR1", "STRINGSTART", 
		"ONELINECOMMENT", "BEGINNESTEDCOMMENT1", "OTHER", "STRINGEND", "NULLC1", 
		"NULLC", "NEWLINE", "SLASH3", "NEWLINE2", "SLASHLINE2", "EOFSTR", "EOFSTR2", 
		"STRINGMORE", "EOFERRB1", "EOFERR", "NESTEDCOMMENT2", "ENDNESTEDCOMMENT1", 
		"MULTICOMMENT1", "ERRB", "EOFERR2", "NESTEDCOMMENT3", "EOFERR3", "ENDNESTEDCOMMENT2", 
		"MNESTEDCOMMENT2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "WRONGCOMMENT", "WHITESPACE", "EOFSTR1", "STRINGSTART", "ONELINECOMMENT", 
		"BEGINNESTEDCOMMENT1", "OTHER", "STRINGEND", "NULLC1", "NULLC", "NEWLINE", 
		"SLASH3", "NEWLINE2", "SLASHLINE2", "EOFSTR", "EOFSTR2", "EOFERRB1", "EOFERR", 
		"NESTEDCOMMENT2", "ENDNESTEDCOMMENT1", "MULTICOMMENT1", "ERRB", "EOFERR2", 
		"NESTEDCOMMENT3", "EOFERR3", "ENDNESTEDCOMMENT2", "MNESTEDCOMMENT2"
	};
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 41:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			WRONGCOMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			EOFSTR1_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			STRINGEND_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			NULLC1_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			NULLC_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			SLASH3_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			NEWLINE2_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			SLASHLINE2_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			EOFSTR_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			EOFSTR2_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			EOFERRB1_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			EOFERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			ERRB_action((RuleContext)_localctx, actionIndex);
			break;
		case 67:
			EOFERR2_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			EOFERR3_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			processString();
			break;
		}
	}
	private void WRONGCOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("Unmatched *)");
			break;
		}
	}
	private void EOFSTR1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			reportError("EOF in string constant");
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			unmatched();
			break;
		}
	}
	private void STRINGEND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			processString();
			break;
		}
	}
	private void NULLC1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			reportError("String contains escaped null character.");
			break;
		}
	}
	private void NULLC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("String contains null character.");
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			processUnterm();
			break;
		}
	}
	private void SLASH3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void NEWLINE2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void SLASHLINE2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			reportError("backslash at end of file");
			break;
		}
	}
	private void EOFSTR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			processStringforEOF();
			break;
		}
	}
	private void EOFSTR2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			reportError("EOF in string constant");
			break;
		}
	}
	private void EOFERRB1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void EOFERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERRB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void EOFERR2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void EOFERR3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			 reportError("EOF in comment"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u024a\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0122\n)\3*\6*\u0125"+
		"\n*\r*\16*\u0126\3+\3+\3+\7+\u012c\n+\f+\16+\u012f\13+\3+\3+\3+\3,\3,"+
		"\3,\3,\7,\u0138\n,\f,\16,\u013b\13,\3-\3-\3-\3-\7-\u0141\n-\f-\16-\u0144"+
		"\13-\3.\3.\3.\3.\5.\u014a\n.\3.\3.\3/\6/\u014f\n/\r/\16/\u0150\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\7\62\u0164\n\62\f\62\16\62\u0167\13\62\3\62\5\62\u016a\n\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\7\66\u017d\n\66\f\66\16\66\u0180\13\66\3\66\3\66\3\66\7\66\u0185"+
		"\n\66\f\66\16\66\u0188\13\66\3\66\5\66\u018b\n\66\3\66\3\66\3\66\3\66"+
		"\3\67\7\67\u0192\n\67\f\67\16\67\u0195\13\67\3\67\3\67\7\67\u0199\n\67"+
		"\f\67\16\67\u019c\13\67\3\67\5\67\u019f\n\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\39\39\39\39\79\u01ae\n9\f9\169\u01b1\139\39\39\39\39\39\3:"+
		"\7:\u01b9\n:\f:\16:\u01bc\13:\3:\3:\3:\3:\3:\3;\7;\u01c4\n;\f;\16;\u01c7"+
		"\13;\3;\3;\3;\3;\3;\3;\3<\7<\u01d0\n<\f<\16<\u01d3\13<\3<\3<\3<\3<\3<"+
		"\3=\7=\u01db\n=\f=\16=\u01de\13=\3=\3=\3=\7=\u01e3\n=\f=\16=\u01e6\13"+
		"=\7=\u01e8\n=\f=\16=\u01eb\13=\3=\3=\3=\3=\3=\3>\3>\3>\5>\u01f5\n>\3>"+
		"\3>\5>\u01f9\n>\6>\u01fb\n>\r>\16>\u01fc\3>\3>\3?\3?\7?\u0203\n?\f?\16"+
		"?\u0206\13?\3?\3?\3?\3?\3?\3@\5@\u020e\n@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3"+
		"B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\7D\u0225\nD\fD\16D\u0228\13D\3D\3D"+
		"\3D\3D\3D\3E\5E\u0230\nE\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\5\u0165\u0186\u019a\2J\6\r\b\31\n\23\f"+
		"\24\16\32\20\25\22\26\24\27\26\30\30\33\32\f\34\13\36\16 \17\"\20$\21"+
		"&\22(\t*\n,*.\34\60#\62$\64\37\66\368 :\35<!>%@&B\'D(F\"H)J+L,N\2P\2R"+
		"\2T\6V\7X\bZ\4\\\5^-`.b/d\60f\61h\62j\63l\64n\65p\66r\67t8v9x:z;|<~\2"+
		"\u0080=\u0082>\u0084?\u0086@\u0088A\u008aB\u008cC\u008eD\u0090E\u0092"+
		"F\u0094G\6\2\3\4\5\32\4\2PPpp\4\2GGgg\4\2YYyy\4\2EEee\4\2NNnn\4\2CCcc"+
		"\4\2UUuu\4\2QQqq\4\2RRrr\4\2KKkk\4\2HHhh\4\2JJjj\4\2TTtt\4\2VVvv\4\2X"+
		"Xxx\4\2FFff\4\2C\\c|\4\2WWww\5\2\f\f$$^^\4\2\n\17\"\"\3\3\f\f\3\2\f\f"+
		"\7\2\f\f$$*+GHQQ\7\2\2\2\f\r$$GHQQ\u0262\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3"+
		"\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2"+
		"\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3"+
		"\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2"+
		"\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\2"+
		"8\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3"+
		"\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2T\3\2\2\2\2V\3\2\2"+
		"\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2"+
		"\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\3l\3\2\2\2\3n\3\2\2\2\3p"+
		"\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\3x\3\2\2\2\3z\3\2\2\2\3|\3\2"+
		"\2\2\3~\3\2\2\2\4\u0080\3\2\2\2\4\u0082\3\2\2\2\4\u0084\3\2\2\2\4\u0086"+
		"\3\2\2\2\4\u0088\3\2\2\2\5\u008a\3\2\2\2\5\u008c\3\2\2\2\5\u008e\3\2\2"+
		"\2\5\u0090\3\2\2\2\5\u0092\3\2\2\2\5\u0094\3\2\2\2\6\u0096\3\2\2\2\b\u0098"+
		"\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2\16\u009f\3\2\2\2\20\u00a2\3\2"+
		"\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8\3\2\2\2\30\u00aa\3\2\2"+
		"\2\32\u00ad\3\2\2\2\34\u00af\3\2\2\2\36\u00b1\3\2\2\2 \u00b3\3\2\2\2\""+
		"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00bb\3\2\2\2*\u00bd\3\2"+
		"\2\2,\u00bf\3\2\2\2.\u00c3\3\2\2\2\60\u00c9\3\2\2\2\62\u00ce\3\2\2\2\64"+
		"\u00d3\3\2\2\2\66\u00d6\3\2\2\28\u00d9\3\2\2\2:\u00dc\3\2\2\2<\u00e1\3"+
		"\2\2\2>\u00ea\3\2\2\2@\u00ef\3\2\2\2B\u00f5\3\2\2\2D\u00fa\3\2\2\2F\u00ff"+
		"\3\2\2\2H\u0103\3\2\2\2J\u0106\3\2\2\2L\u010d\3\2\2\2N\u0111\3\2\2\2P"+
		"\u0113\3\2\2\2R\u0115\3\2\2\2T\u0121\3\2\2\2V\u0124\3\2\2\2X\u0128\3\2"+
		"\2\2Z\u0133\3\2\2\2\\\u013c\3\2\2\2^\u0145\3\2\2\2`\u014e\3\2\2\2b\u0154"+
		"\3\2\2\2d\u015a\3\2\2\2f\u015f\3\2\2\2h\u016d\3\2\2\2j\u0173\3\2\2\2l"+
		"\u0176\3\2\2\2n\u017e\3\2\2\2p\u0193\3\2\2\2r\u01a4\3\2\2\2t\u01a9\3\2"+
		"\2\2v\u01ba\3\2\2\2x\u01c5\3\2\2\2z\u01d1\3\2\2\2|\u01e9\3\2\2\2~\u01fa"+
		"\3\2\2\2\u0080\u0204\3\2\2\2\u0082\u020d\3\2\2\2\u0084\u0212\3\2\2\2\u0086"+
		"\u0218\3\2\2\2\u0088\u021e\3\2\2\2\u008a\u0226\3\2\2\2\u008c\u022f\3\2"+
		"\2\2\u008e\u0234\3\2\2\2\u0090\u023a\3\2\2\2\u0092\u0240\3\2\2\2\u0094"+
		"\u0246\3\2\2\2\u0096\u0097\7=\2\2\u0097\7\3\2\2\2\u0098\u0099\7?\2\2\u0099"+
		"\u009a\7@\2\2\u009a\t\3\2\2\2\u009b\u009c\7\u0080\2\2\u009c\13\3\2\2\2"+
		"\u009d\u009e\7>\2\2\u009e\r\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7?"+
		"\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\21\3\2\2\2\u00a4\u00a5"+
		"\7}\2\2\u00a5\23\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\25\3\2\2\2\u00a8"+
		"\u00a9\7\60\2\2\u00a9\27\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7/\2\2"+
		"\u00ac\31\3\2\2\2\u00ad\u00ae\7B\2\2\u00ae\33\3\2\2\2\u00af\u00b0\7<\2"+
		"\2\u00b0\35\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\37\3\2\2\2\u00b3\u00b4\7"+
		"-\2\2\u00b4!\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6#\3\2\2\2\u00b7\u00b8\7,"+
		"\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\7"+
		"*\2\2\u00bc)\3\2\2\2\u00bd\u00be\7+\2\2\u00be+\3\2\2\2\u00bf\u00c0\t\2"+
		"\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00c2\t\4\2\2\u00c2-\3\2\2\2\u00c3\u00c4"+
		"\t\5\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00c6\t\7\2\2\u00c6\u00c7\t\b\2\2\u00c7"+
		"\u00c8\t\b\2\2\u00c8/\3\2\2\2\u00c9\u00ca\t\6\2\2\u00ca\u00cb\t\t\2\2"+
		"\u00cb\u00cc\t\t\2\2\u00cc\u00cd\t\n\2\2\u00cd\61\3\2\2\2\u00ce\u00cf"+
		"\t\n\2\2\u00cf\u00d0\t\t\2\2\u00d0\u00d1\t\t\2\2\u00d1\u00d2\t\6\2\2\u00d2"+
		"\63\3\2\2\2\u00d3\u00d4\t\13\2\2\u00d4\u00d5\t\f\2\2\u00d5\65\3\2\2\2"+
		"\u00d6\u00d7\t\f\2\2\u00d7\u00d8\t\13\2\2\u00d8\67\3\2\2\2\u00d9\u00da"+
		"\t\13\2\2\u00da\u00db\t\2\2\2\u00db9\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd"+
		"\u00de\t\6\2\2\u00de\u00df\t\b\2\2\u00df\u00e0\t\3\2\2\u00e0;\3\2\2\2"+
		"\u00e1\u00e2\t\13\2\2\u00e2\u00e3\t\2\2\2\u00e3\u00e4\t\r\2\2\u00e4\u00e5"+
		"\t\3\2\2\u00e5\u00e6\t\16\2\2\u00e6\u00e7\t\13\2\2\u00e7\u00e8\t\17\2"+
		"\2\u00e8\u00e9\t\b\2\2\u00e9=\3\2\2\2\u00ea\u00eb\t\17\2\2\u00eb\u00ec"+
		"\t\r\2\2\u00ec\u00ed\t\3\2\2\u00ed\u00ee\t\2\2\2\u00ee?\3\2\2\2\u00ef"+
		"\u00f0\t\4\2\2\u00f0\u00f1\t\r\2\2\u00f1\u00f2\t\13\2\2\u00f2\u00f3\t"+
		"\6\2\2\u00f3\u00f4\t\3\2\2\u00f4A\3\2\2\2\u00f5\u00f6\t\5\2\2\u00f6\u00f7"+
		"\t\7\2\2\u00f7\u00f8\t\b\2\2\u00f8\u00f9\t\3\2\2\u00f9C\3\2\2\2\u00fa"+
		"\u00fb\t\3\2\2\u00fb\u00fc\t\b\2\2\u00fc\u00fd\t\7\2\2\u00fd\u00fe\t\5"+
		"\2\2\u00feE\3\2\2\2\u00ff\u0100\t\6\2\2\u0100\u0101\t\3\2\2\u0101\u0102"+
		"\t\17\2\2\u0102G\3\2\2\2\u0103\u0104\t\t\2\2\u0104\u0105\t\f\2\2\u0105"+
		"I\3\2\2\2\u0106\u0107\t\13\2\2\u0107\u0108\t\b\2\2\u0108\u0109\t\20\2"+
		"\2\u0109\u010a\t\t\2\2\u010a\u010b\t\13\2\2\u010b\u010c\t\21\2\2\u010c"+
		"K\3\2\2\2\u010d\u010e\t\2\2\2\u010e\u010f\t\t\2\2\u010f\u0110\t\17\2\2"+
		"\u0110M\3\2\2\2\u0111\u0112\4\62;\2\u0112O\3\2\2\2\u0113\u0114\t\22\2"+
		"\2\u0114Q\3\2\2\2\u0115\u0116\7^\2\2\u0116\u0117\13\2\2\2\u0117S\3\2\2"+
		"\2\u0118\u0119\7v\2\2\u0119\u011a\t\16\2\2\u011a\u011b\t\23\2\2\u011b"+
		"\u0122\t\3\2\2\u011c\u011d\7h\2\2\u011d\u011e\t\7\2\2\u011e\u011f\t\6"+
		"\2\2\u011f\u0120\t\b\2\2\u0120\u0122\t\3\2\2\u0121\u0118\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0122U\3\2\2\2\u0123\u0125\5N&\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127W\3\2\2\2"+
		"\u0128\u012d\7$\2\2\u0129\u012c\5R(\2\u012a\u012c\n\24\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7$"+
		"\2\2\u0131\u0132\b+\2\2\u0132Y\3\2\2\2\u0133\u0139\4C\\\2\u0134\u0138"+
		"\7a\2\2\u0135\u0138\5P\'\2\u0136\u0138\5N&\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a[\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0142"+
		"\4c|\2\u013d\u0141\7a\2\2\u013e\u0141\5P\'\2\u013f\u0141\5N&\2\u0140\u013d"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143]\3\2\2\2\u0144\u0142\3\2\2\2"+
		"\u0145\u0146\7,\2\2\u0146\u0147\7+\2\2\u0147\u0149\3\2\2\2\u0148\u014a"+
		"\7\2\2\3\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\b.\3\2\u014c_\3\2\2\2\u014d\u014f\t\25\2\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0153\b/\4\2\u0153a\3\2\2\2\u0154\u0155\7$\2\2\u0155\u0156"+
		"\7\2\2\3\u0156\u0157\b\60\5\2\u0157\u0158\3\2\2\2\u0158\u0159\b\60\6\2"+
		"\u0159c\3\2\2\2\u015a\u015b\7$\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b\61"+
		"\4\2\u015d\u015e\b\61\7\2\u015ee\3\2\2\2\u015f\u0160\7/\2\2\u0160\u0161"+
		"\7/\2\2\u0161\u0165\3\2\2\2\u0162\u0164\13\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016a\t\26\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\b\62\4\2\u016cg\3\2\2\2\u016d\u016e\7*\2\2"+
		"\u016e\u016f\7,\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b\63\b\2\u0171\u0172"+
		"\b\63\4\2\u0172i\3\2\2\2\u0173\u0174\13\2\2\2\u0174\u0175\b\64\t\2\u0175"+
		"k\3\2\2\2\u0176\u0177\7$\2\2\u0177\u0178\b\65\n\2\u0178\u0179\3\2\2\2"+
		"\u0179\u017a\b\65\13\2\u017am\3\2\2\2\u017b\u017d\13\2\2\2\u017c\u017b"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7^\2\2\u0182\u0186\7\2"+
		"\2\2\u0183\u0185\13\2\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u018b\t\26\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\b\66\f\2\u018d\u018e\3\2\2\2\u018e\u018f\b\66\6\2\u018fo\3\2\2"+
		"\2\u0190\u0192\13\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u019a\7\2\2\2\u0197\u0199\13\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u019f\t\26\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\b\67\r\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b"+
		"\67\6\2\u01a3q\3\2\2\2\u01a4\u01a5\7\f\2\2\u01a5\u01a6\b8\16\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a8\b8\6\2\u01a8s\3\2\2\2\u01a9\u01aa\7^\2\2\u01aa\u01ab"+
		"\7$\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\t\27\2\2\u01b3\u01b4\b9\17\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\b9\6\2\u01b6u\3\2\2\2\u01b7\u01b9\n\30\2\2"+
		"\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7\f\2\2\u01be"+
		"\u01bf\b:\20\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\b:\6\2\u01c1w\3\2\2\2\u01c2"+
		"\u01c4\n\27\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3"+
		"\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\7^\2\2\u01c9\u01ca\7\2\2\3\u01ca\u01cb\b;\21\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\b;\6\2\u01cdy\3\2\2\2\u01ce\u01d0\n\27\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\2\2\3\u01d5\u01d6\b<"+
		"\22\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\b<\6\2\u01d8{\3\2\2\2\u01d9\u01db"+
		"\n\27\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2"+
		"\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0"+
		"\7^\2\2\u01e0\u01e4\t\27\2\2\u01e1\u01e3\n\27\2\2\u01e2\u01e1\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01dc\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ed\7\2\2\3\u01ed\u01ee\b=\23\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\b=\6\2\u01f0}\3\2\2\2\u01f1\u01f4\n\31\2\2\u01f2\u01f3\7^\2\2\u01f3"+
		"\u01f5\7\f\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2"+
		"\2\2\u01f6\u01f7\7^\2\2\u01f7\u01f9\7$\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\b>"+
		"\24\2\u01ff\177\3\2\2\2\u0200\u0201\7*\2\2\u0201\u0203\7,\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\2\2\3\u0208\u0209\b?"+
		"\25\2\u0209\u020a\3\2\2\2\u020a\u020b\b?\6\2\u020b\u0081\3\2\2\2\u020c"+
		"\u020e\13\2\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3"+
		"\2\2\2\u020f\u0210\7\2\2\3\u0210\u0211\b@\26\2\u0211\u0083\3\2\2\2\u0212"+
		"\u0213\7*\2\2\u0213\u0214\7,\2\2\u0214\u0215\3\2\2\2\u0215\u0216\bA\27"+
		"\2\u0216\u0217\bA\4\2\u0217\u0085\3\2\2\2\u0218\u0219\7,\2\2\u0219\u021a"+
		"\7+\2\2\u021a\u021b\3\2\2\2\u021b\u021c\bB\13\2\u021c\u021d\bB\4\2\u021d"+
		"\u0087\3\2\2\2\u021e\u021f\13\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\b"+
		"C\4\2\u0221\u0089\3\2\2\2\u0222\u0223\7*\2\2\u0223\u0225\7,\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7\2\2\3\u022a"+
		"\u022b\bD\30\2\u022b\u022c\3\2\2\2\u022c\u022d\bD\6\2\u022d\u008b\3\2"+
		"\2\2\u022e\u0230\13\2\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\7\2\2\3\u0232\u0233\bE\31\2\u0233\u008d\3\2"+
		"\2\2\u0234\u0235\7*\2\2\u0235\u0236\7,\2\2\u0236\u0237\3\2\2\2\u0237\u0238"+
		"\bF\27\2\u0238\u0239\bF\4\2\u0239\u008f\3\2\2\2\u023a\u023b\7,\2\2\u023b"+
		"\u023c\7+\2\2\u023c\u023d\3\2\2\2\u023d\u023e\7\2\2\3\u023e\u023f\bG\32"+
		"\2\u023f\u0091\3\2\2\2\u0240\u0241\7,\2\2\u0241\u0242\7+\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0244\bH\13\2\u0244\u0245\bH\4\2\u0245\u0093\3\2\2\2\u0246"+
		"\u0247\13\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\bI\4\2\u0249\u0095\3\2"+
		"\2\2&\2\3\4\5\u0121\u0126\u012b\u012d\u0137\u0139\u0140\u0142\u0149\u0150"+
		"\u0165\u0169\u017e\u0186\u018a\u0193\u019a\u019e\u01af\u01ba\u01c5\u01d1"+
		"\u01dc\u01e4\u01e9\u01f4\u01f8\u01fc\u0204\u020d\u0226\u022f\33\3+\2\3"+
		".\3\b\2\2\3\60\4\4\2\2\7\3\2\7\4\2\3\64\5\3\65\6\6\2\2\3\66\7\3\67\b\3"+
		"8\t\39\n\3:\13\3;\f\3<\r\3=\16\5\2\2\3?\17\3@\20\7\5\2\3D\21\3E\22\3G"+
		"\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}