// Generated from CupParser.g4 by ANTLR 4.8
package Cup;

    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CupParser extends Parser {
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
		RULE_program = 0, RULE_text = 1, RULE_functionOrDeclaration = 2, RULE_globalDeclaration = 3, 
		RULE_functionDefinition = 4, RULE_declaration = 5, RULE_simpleDeclaration = 6, 
		RULE_templateDeclaration = 7, RULE_dsDec = 8, RULE_dsArgs = 9, RULE_dataStructureName = 10, 
		RULE_initDeclaratorList = 11, RULE_initDeclarator = 12, RULE_pointer = 13, 
		RULE_typeQualifier = 14, RULE_declarator = 15, RULE_array_params = 16, 
		RULE_initializer = 17, RULE_assignmentExpression = 18, RULE_assignmentOperator = 19, 
		RULE_conditionalExpression = 20, RULE_unaryExpression = 21, RULE_unaryOperator = 22, 
		RULE_postfixExpression = 23, RULE_expression = 24, RULE_primaryExpression = 25, 
		RULE_constant = 26, RULE_argumentExpressionList = 27, RULE_logicalOrExpression = 28, 
		RULE_logicalAndExpression = 29, RULE_exclusiveOrExpression = 30, RULE_inclusiveOrExpression = 31, 
		RULE_andExpression = 32, RULE_equalityExpression = 33, RULE_relationalExpression = 34, 
		RULE_shiftExpression = 35, RULE_multiplicativeExpression = 36, RULE_additiveExpression = 37, 
		RULE_castExpression = 38, RULE_typeSpecifier = 39, RULE_parameterTypeList = 40, 
		RULE_functionParameterList = 41, RULE_formal = 42, RULE_blockItemList = 43, 
		RULE_blockItem = 44, RULE_functionCall = 45, RULE_statement = 46, RULE_compoundStatement = 47, 
		RULE_expressionStatement = 48, RULE_ifStatement = 49, RULE_whileStatement = 50, 
		RULE_forStatement = 51, RULE_forCondition = 52, RULE_jumpStatement = 53, 
		RULE_functionReturn = 54, RULE_declarationSpecifier = 55, RULE_storageClassSpecifier = 56, 
		RULE_declarationList = 57, RULE_nameList = 58, RULE_structDefinition = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "text", "functionOrDeclaration", "globalDeclaration", "functionDefinition", 
			"declaration", "simpleDeclaration", "templateDeclaration", "dsDec", "dsArgs", 
			"dataStructureName", "initDeclaratorList", "initDeclarator", "pointer", 
			"typeQualifier", "declarator", "array_params", "initializer", "assignmentExpression", 
			"assignmentOperator", "conditionalExpression", "unaryExpression", "unaryOperator", 
			"postfixExpression", "expression", "primaryExpression", "constant", "argumentExpressionList", 
			"logicalOrExpression", "logicalAndExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"shiftExpression", "multiplicativeExpression", "additiveExpression", 
			"castExpression", "typeSpecifier", "parameterTypeList", "functionParameterList", 
			"formal", "blockItemList", "blockItem", "functionCall", "statement", 
			"compoundStatement", "expressionStatement", "ifStatement", "whileStatement", 
			"forStatement", "forCondition", "jumpStatement", "functionReturn", "declarationSpecifier", 
			"storageClassSpecifier", "declarationList", "nameList", "structDefinition"
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

	@Override
	public String getGrammarFileName() { return "CupParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    String filename;
	    public void setFilename(String f){
	        filename = f;
	    }


	public CupParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TextContext t;
		public TerminalNode EOF() { return getToken(CupParser.EOF, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << IDENTIFIER) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0)) {
				{
				setState(120);
				((ProgramContext)_localctx).t = text();
				}
			}

			setState(123);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public FunctionOrDeclarationContext f;
		public List<FunctionOrDeclarationContext> functionOrDeclaration() {
			return getRuleContexts(FunctionOrDeclarationContext.class);
		}
		public FunctionOrDeclarationContext functionOrDeclaration(int i) {
			return getRuleContext(FunctionOrDeclarationContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				((TextContext)_localctx).f = functionOrDeclaration();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << IDENTIFIER) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionOrDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext fd;
		public DeclarationContext dec;
		public StructDefinitionContext sd;
		public GlobalDeclarationContext gdec;
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public GlobalDeclarationContext globalDeclaration() {
			return getRuleContext(GlobalDeclarationContext.class,0);
		}
		public FunctionOrDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOrDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterFunctionOrDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitFunctionOrDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionOrDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionOrDeclarationContext functionOrDeclaration() throws RecognitionException {
		FunctionOrDeclarationContext _localctx = new FunctionOrDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionOrDeclaration);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((FunctionOrDeclarationContext)_localctx).fd = functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((FunctionOrDeclarationContext)_localctx).dec = declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((FunctionOrDeclarationContext)_localctx).sd = structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				((FunctionOrDeclarationContext)_localctx).gdec = globalDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclarationContext extends ParserRuleContext {
		public DeclaratorContext dec;
		public Token eq;
		public InitializerContext in;
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CupParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public GlobalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclarationContext globalDeclaration() throws RecognitionException {
		GlobalDeclarationContext _localctx = new GlobalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((GlobalDeclarationContext)_localctx).dec = declarator(0);
			setState(137);
			((GlobalDeclarationContext)_localctx).eq = match(EQUAL);
			setState(138);
			((GlobalDeclarationContext)_localctx).in = initializer();
			setState(139);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeSpecifierContext t;
		public Token fname;
		public ParameterTypeListContext pl;
		public CompoundStatementContext cs;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((FunctionDefinitionContext)_localctx).t = typeSpecifier();
			setState(142);
			((FunctionDefinitionContext)_localctx).fname = match(IDENTIFIER);
			setState(143);
			((FunctionDefinitionContext)_localctx).pl = parameterTypeList();
			setState(144);
			((FunctionDefinitionContext)_localctx).cs = compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext sd;
		public TemplateDeclarationContext td;
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((DeclarationContext)_localctx).sd = simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				((DeclarationContext)_localctx).td = templateDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifierContext d;
		public InitDeclaratorListContext in;
		public Token sc;
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((SimpleDeclarationContext)_localctx).d = declarationSpecifier();
			setState(151);
			((SimpleDeclarationContext)_localctx).in = initDeclaratorList();
			setState(152);
			((SimpleDeclarationContext)_localctx).sc = match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public DsDecContext d;
		public InitDeclaratorListContext in;
		public Token sc;
		public DsDecContext dsDec() {
			return getRuleContext(DsDecContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((TemplateDeclarationContext)_localctx).d = dsDec();
			setState(155);
			((TemplateDeclarationContext)_localctx).in = initDeclaratorList();
			setState(156);
			((TemplateDeclarationContext)_localctx).sc = match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DsDecContext extends ParserRuleContext {
		public DataStructureNameContext ds;
		public DsArgsContext da;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public DataStructureNameContext dataStructureName() {
			return getRuleContext(DataStructureNameContext.class,0);
		}
		public DsArgsContext dsArgs() {
			return getRuleContext(DsArgsContext.class,0);
		}
		public DsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsDecContext dsDec() throws RecognitionException {
		DsDecContext _localctx = new DsDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dsDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((DsDecContext)_localctx).ds = dataStructureName();
			setState(159);
			match(LPAREN);
			setState(160);
			((DsDecContext)_localctx).da = dsArgs();
			setState(161);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DsArgsContext extends ParserRuleContext {
		public TypeSpecifierContext ts;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DsArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDsArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDsArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDsArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsArgsContext dsArgs() throws RecognitionException {
		DsArgsContext _localctx = new DsArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dsArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((DsArgsContext)_localctx).ts = typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataStructureNameContext extends ParserRuleContext {
		public Token s;
		public Token q;
		public Token up;
		public Token v;
		public Token sp;
		public TerminalNode STACK() { return getToken(CupParser.STACK, 0); }
		public TerminalNode QUEUE() { return getToken(CupParser.QUEUE, 0); }
		public TerminalNode UNQ_PTR() { return getToken(CupParser.UNQ_PTR, 0); }
		public TerminalNode VECTOR() { return getToken(CupParser.VECTOR, 0); }
		public TerminalNode SHARED_PTR() { return getToken(CupParser.SHARED_PTR, 0); }
		public DataStructureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStructureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDataStructureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDataStructureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDataStructureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureNameContext dataStructureName() throws RecognitionException {
		DataStructureNameContext _localctx = new DataStructureNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataStructureName);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((DataStructureNameContext)_localctx).s = match(STACK);
				}
				break;
			case QUEUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				((DataStructureNameContext)_localctx).q = match(QUEUE);
				}
				break;
			case UNQ_PTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				((DataStructureNameContext)_localctx).up = match(UNQ_PTR);
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				((DataStructureNameContext)_localctx).v = match(VECTOR);
				}
				break;
			case SHARED_PTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				((DataStructureNameContext)_localctx).sp = match(SHARED_PTR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext i1;
		public InitDeclaratorContext i2;
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((InitDeclaratorListContext)_localctx).i1 = initDeclarator();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				((InitDeclaratorListContext)_localctx).i2 = initDeclarator();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext d;
		public InitializerContext in;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CupParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initDeclarator);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((InitDeclaratorContext)_localctx).d = declarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((InitDeclaratorContext)_localctx).d = declarator(0);
				setState(182);
				match(EQUAL);
				setState(183);
				((InitDeclaratorContext)_localctx).in = initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierContext t;
		public PointerContext p;
		public TerminalNode STAR() { return getToken(CupParser.STAR, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pointer);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(STAR);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(188);
					((PointerContext)_localctx).t = typeQualifier();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(STAR);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(192);
					((PointerContext)_localctx).t = typeQualifier();
					}
				}

				{
				setState(195);
				((PointerContext)_localctx).p = pointer();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public Token cns;
		public TerminalNode CONST() { return getToken(CupParser.CONST, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((TypeQualifierContext)_localctx).cns = match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DeclaratorContext de;
		public Token id;
		public Array_paramsContext ap;
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TerminalNode LSQR() { return getToken(CupParser.LSQR, 0); }
		public TerminalNode RSQR() { return getToken(CupParser.RSQR, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Array_paramsContext array_params() {
			return getRuleContext(Array_paramsContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		return declarator(0);
	}

	private DeclaratorContext declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, _parentState);
		DeclaratorContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_declarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			((DeclaratorContext)_localctx).id = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclaratorContext(_parentctx, _parentState);
					_localctx.de = _prevctx;
					_localctx.de = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarator);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					match(LSQR);
					setState(205);
					((DeclaratorContext)_localctx).ap = array_params();
					setState(206);
					match(RSQR);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Array_paramsContext extends ParserRuleContext {
		public Token ic;
		public Token id;
		public TerminalNode INTEGER_CONST() { return getToken(CupParser.INTEGER_CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public Array_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterArray_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitArray_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitArray_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_paramsContext array_params() throws RecognitionException {
		Array_paramsContext _localctx = new Array_paramsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_params);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((Array_paramsContext)_localctx).ic = match(INTEGER_CONST);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((Array_paramsContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case RSQR:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext ae;
		public ExpressionContext e;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CupParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CupParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initializer);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case IDENTIFIER:
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case LPAREN:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case TILDE:
			case EXCLAIM:
			case PLUSPLUS:
			case MINUSMINUS:
			case AMPAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				((InitializerContext)_localctx).ae = assignmentExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(LBRACE);
				setState(220);
				((InitializerContext)_localctx).e = expression();
				setState(221);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext ce;
		public UnaryExpressionContext ue;
		public AssignmentOperatorContext ao;
		public AssignmentExpressionContext ae;
		public ConstantContext c;
		public FunctionReturnContext fr;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignmentExpression);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((AssignmentExpressionContext)_localctx).ce = conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((AssignmentExpressionContext)_localctx).ue = unaryExpression();
				setState(227);
				((AssignmentExpressionContext)_localctx).ao = assignmentOperator();
				setState(228);
				((AssignmentExpressionContext)_localctx).ae = assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				((AssignmentExpressionContext)_localctx).c = constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				((AssignmentExpressionContext)_localctx).fr = functionReturn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(CupParser.EQUAL, 0); }
		public TerminalNode STAREQUAL() { return getToken(CupParser.STAREQUAL, 0); }
		public TerminalNode SLASHEQUAL() { return getToken(CupParser.SLASHEQUAL, 0); }
		public TerminalNode PERCENTEQUAL() { return getToken(CupParser.PERCENTEQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(CupParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(CupParser.MINUSEQUAL, 0); }
		public TerminalNode LESSLESSEQUAL() { return getToken(CupParser.LESSLESSEQUAL, 0); }
		public TerminalNode GREATERGREATEREQUAL() { return getToken(CupParser.GREATERGREATEREQUAL, 0); }
		public TerminalNode AMPEQUAL() { return getToken(CupParser.AMPEQUAL, 0); }
		public TerminalNode CARETEQUAL() { return getToken(CupParser.CARETEQUAL, 0); }
		public TerminalNode PIPEEQUAL() { return getToken(CupParser.PIPEEQUAL, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (PERCENTEQUAL - 61)) | (1L << (PLUSEQUAL - 61)) | (1L << (MINUSEQUAL - 61)) | (1L << (SLASHEQUAL - 61)) | (1L << (STAREQUAL - 61)) | (1L << (EQUAL - 61)) | (1L << (AMPEQUAL - 61)) | (1L << (PIPEEQUAL - 61)) | (1L << (CARETEQUAL - 61)) | (1L << (GREATERGREATEREQUAL - 61)) | (1L << (LESSLESSEQUAL - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext le;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((ConditionalExpressionContext)_localctx).le = logicalOrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext p;
		public Token pl;
		public UnaryExpressionContext u1;
		public Token m;
		public UnaryExpressionContext u2;
		public UnaryOperatorContext uo;
		public CastExpressionContext ce;
		public Token s;
		public UnaryExpressionContext u3;
		public TypeSpecifierContext t;
		public Token amp;
		public Token id;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(CupParser.PLUSPLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(CupParser.MINUSMINUS, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(CupParser.SIZEOF, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode AMPAMP() { return getToken(CupParser.AMPAMP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpression);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((UnaryExpressionContext)_localctx).p = postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((UnaryExpressionContext)_localctx).pl = match(PLUSPLUS);
				setState(240);
				((UnaryExpressionContext)_localctx).u1 = unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				((UnaryExpressionContext)_localctx).m = match(MINUSMINUS);
				setState(242);
				((UnaryExpressionContext)_localctx).u2 = unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				((UnaryExpressionContext)_localctx).uo = unaryOperator();
				setState(244);
				((UnaryExpressionContext)_localctx).ce = castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				((UnaryExpressionContext)_localctx).s = match(SIZEOF);
				setState(247);
				((UnaryExpressionContext)_localctx).u3 = unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				((UnaryExpressionContext)_localctx).s = match(SIZEOF);
				setState(249);
				match(LPAREN);
				setState(250);
				((UnaryExpressionContext)_localctx).t = typeSpecifier();
				setState(251);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				((UnaryExpressionContext)_localctx).amp = match(AMPAMP);
				setState(254);
				((UnaryExpressionContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode AMP() { return getToken(CupParser.AMP, 0); }
		public TerminalNode STAR() { return getToken(CupParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(CupParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CupParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(CupParser.TILDE, 0); }
		public TerminalNode EXCLAIM() { return getToken(CupParser.EXCLAIM, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext p1;
		public PostfixExpressionContext p2;
		public PostfixExpressionContext p3;
		public PostfixExpressionContext p4;
		public PostfixExpressionContext p5;
		public PrimaryExpressionContext p;
		public FunctionReturnContext f;
		public AssignmentExpressionContext e;
		public Token id;
		public Token id1;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public TerminalNode LSQR() { return getToken(CupParser.LSQR, 0); }
		public TerminalNode RSQR() { return getToken(CupParser.RSQR, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CupParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TerminalNode ARROW() { return getToken(CupParser.ARROW, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CupParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(CupParser.MINUSMINUS, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(260);
				((PostfixExpressionContext)_localctx).p = primaryExpression();
				}
				break;
			case 2:
				{
				setState(261);
				((PostfixExpressionContext)_localctx).f = functionReturn();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p1 = _prevctx;
						_localctx.p1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(264);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(265);
						match(LSQR);
						setState(266);
						((PostfixExpressionContext)_localctx).e = assignmentExpression();
						setState(267);
						match(RSQR);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p2 = _prevctx;
						_localctx.p2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(269);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(270);
						match(DOT);
						setState(271);
						((PostfixExpressionContext)_localctx).id = match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p3 = _prevctx;
						_localctx.p3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(272);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(273);
						match(ARROW);
						setState(274);
						((PostfixExpressionContext)_localctx).id1 = match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p4 = _prevctx;
						_localctx.p4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						match(PLUSPLUS);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p5 = _prevctx;
						_localctx.p5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(277);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(278);
						match(MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext a1;
		public AssignmentExpressionContext a2;
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case SEMICOLON:
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case SIZEOF:
			case IDENTIFIER:
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case LPAREN:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case TILDE:
			case EXCLAIM:
			case PLUSPLUS:
			case MINUSMINUS:
			case AMPAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				((ExpressionContext)_localctx).a1 = assignmentExpression();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(286);
					match(COMMA);
					setState(287);
					((ExpressionContext)_localctx).a2 = assignmentExpression();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Token id;
		public ConstantContext c;
		public AssignmentExpressionContext e;
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primaryExpression);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				((PrimaryExpressionContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((PrimaryExpressionContext)_localctx).c = constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(LPAREN);
				setState(298);
				((PrimaryExpressionContext)_localctx).e = assignmentExpression();
				setState(299);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token i;
		public Token f;
		public Token c;
		public Token b;
		public Token s;
		public TerminalNode INTEGER_CONST() { return getToken(CupParser.INTEGER_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(CupParser.FLOAT_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(CupParser.CHAR_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(CupParser.BOOL_CONST, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CupParser.STRING_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((ConstantContext)_localctx).i = match(INTEGER_CONST);
				}
				break;
			case FLOAT_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				((ConstantContext)_localctx).f = match(FLOAT_CONST);
				}
				break;
			case CHAR_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				((ConstantContext)_localctx).c = match(CHAR_CONST);
				}
				break;
			case BOOL_CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				((ConstantContext)_localctx).b = match(BOOL_CONST);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				((ConstantContext)_localctx).s = match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext e1;
		public AssignmentExpressionContext e2;
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((ArgumentExpressionListContext)_localctx).e1 = assignmentExpression();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311);
				match(COMMA);
				setState(312);
				((ArgumentExpressionListContext)_localctx).e2 = assignmentExpression();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext or;
		public LogicalAndExpressionContext and;
		public Token orr;
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode PIPEPIPE() { return getToken(CupParser.PIPEPIPE, 0); }
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			((LogicalOrExpressionContext)_localctx).and = logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					_localctx.or = _prevctx;
					_localctx.or = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(321);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(322);
					((LogicalOrExpressionContext)_localctx).orr = match(PIPEPIPE);
					setState(323);
					((LogicalOrExpressionContext)_localctx).and = logicalAndExpression(0);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext and;
		public InclusiveOrExpressionContext inor;
		public Token andd;
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AMPAMP() { return getToken(CupParser.AMPAMP, 0); }
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330);
			((LogicalAndExpressionContext)_localctx).inor = inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					_localctx.and = _prevctx;
					_localctx.and = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(332);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(333);
					((LogicalAndExpressionContext)_localctx).andd = match(AMPAMP);
					setState(334);
					((LogicalAndExpressionContext)_localctx).inor = inclusiveOrExpression(0);
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext xor;
		public AndExpressionContext bitand;
		public Token xxor;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(CupParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			((ExclusiveOrExpressionContext)_localctx).bitand = andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					_localctx.xor = _prevctx;
					_localctx.xor = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(344);
					((ExclusiveOrExpressionContext)_localctx).xxor = match(CARET);
					setState(345);
					((ExclusiveOrExpressionContext)_localctx).bitand = andExpression(0);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inor;
		public ExclusiveOrExpressionContext xor;
		public Token inorr;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(CupParser.PIPE, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(352);
			((InclusiveOrExpressionContext)_localctx).xor = exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					_localctx.inor = _prevctx;
					_localctx.inor = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(354);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(355);
					((InclusiveOrExpressionContext)_localctx).inorr = match(PIPE);
					setState(356);
					((InclusiveOrExpressionContext)_localctx).xor = exclusiveOrExpression(0);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext bitand;
		public EqualityExpressionContext eq;
		public Token f;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AMP() { return getToken(CupParser.AMP, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(363);
			((AndExpressionContext)_localctx).eq = equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					_localctx.bitand = _prevctx;
					_localctx.bitand = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(365);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(366);
					((AndExpressionContext)_localctx).f = match(AMP);
					setState(367);
					((AndExpressionContext)_localctx).eq = equalityExpression(0);
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext eq;
		public RelationalExpressionContext rel;
		public Token eqq;
		public Token neq;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUALEQUAL() { return getToken(CupParser.EQUALEQUAL, 0); }
		public TerminalNode EXCLAIMEQUAL() { return getToken(CupParser.EXCLAIMEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			((EqualityExpressionContext)_localctx).rel = relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.eq = _prevctx;
						_localctx.eq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						((EqualityExpressionContext)_localctx).eqq = match(EQUALEQUAL);
						setState(378);
						((EqualityExpressionContext)_localctx).rel = relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.eq = _prevctx;
						_localctx.eq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(379);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(380);
						((EqualityExpressionContext)_localctx).neq = match(EXCLAIMEQUAL);
						setState(381);
						((EqualityExpressionContext)_localctx).rel = relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext rel;
		public ShiftExpressionContext sh;
		public Token lt;
		public Token gt;
		public Token lte;
		public Token gte;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LESS() { return getToken(CupParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CupParser.GREATER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(CupParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(CupParser.GREATEREQUAL, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			((RelationalExpressionContext)_localctx).sh = shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(390);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(391);
						((RelationalExpressionContext)_localctx).lt = match(LESS);
						setState(392);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(393);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(394);
						((RelationalExpressionContext)_localctx).gt = match(GREATER);
						setState(395);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(396);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(397);
						((RelationalExpressionContext)_localctx).lte = match(LESSEQUAL);
						setState(398);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(399);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(400);
						((RelationalExpressionContext)_localctx).gte = match(GREATEREQUAL);
						setState(401);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext sh;
		public AdditiveExpressionContext ad;
		public Token ssh;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LESSLESS() { return getToken(CupParser.LESSLESS, 0); }
		public TerminalNode GREATERGREATER() { return getToken(CupParser.GREATERGREATER, 0); }
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			((ShiftExpressionContext)_localctx).ad = additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.sh = _prevctx;
						_localctx.sh = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						((ShiftExpressionContext)_localctx).ssh = match(LESSLESS);
						setState(412);
						((ShiftExpressionContext)_localctx).ad = additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.sh = _prevctx;
						_localctx.sh = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(413);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(414);
						((ShiftExpressionContext)_localctx).ssh = match(GREATERGREATER);
						setState(415);
						((ShiftExpressionContext)_localctx).ad = additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext me;
		public CastExpressionContext ce;
		public Token mul;
		public Token div;
		public Token mod;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(CupParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CupParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(CupParser.PERCENT, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(422);
			((MultiplicativeExpressionContext)_localctx).ce = castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.me = _prevctx;
						_localctx.me = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(424);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(425);
						((MultiplicativeExpressionContext)_localctx).mul = match(STAR);
						setState(426);
						((MultiplicativeExpressionContext)_localctx).ce = castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.me = _prevctx;
						_localctx.me = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(427);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(428);
						((MultiplicativeExpressionContext)_localctx).div = match(SLASH);
						setState(429);
						((MultiplicativeExpressionContext)_localctx).ce = castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.me = _prevctx;
						_localctx.me = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(430);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(431);
						((MultiplicativeExpressionContext)_localctx).mod = match(PERCENT);
						setState(432);
						((MultiplicativeExpressionContext)_localctx).ce = castExpression();
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext ad;
		public MultiplicativeExpressionContext me;
		public Token p;
		public Token s;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CupParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CupParser.MINUS, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(439);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.ad = _prevctx;
						_localctx.ad = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(441);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(442);
						((AdditiveExpressionContext)_localctx).p = match(PLUS);
						setState(443);
						((AdditiveExpressionContext)_localctx).me = multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.ad = _prevctx;
						_localctx.ad = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(444);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(445);
						((AdditiveExpressionContext)_localctx).s = match(MINUS);
						setState(446);
						((AdditiveExpressionContext)_localctx).me = multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TypeSpecifierContext t;
		public CastExpressionContext ce;
		public UnaryExpressionContext ue;
		public ConstantContext c;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_castExpression);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(LPAREN);
				setState(453);
				((CastExpressionContext)_localctx).t = typeSpecifier();
				setState(454);
				match(RPAREN);
				setState(455);
				((CastExpressionContext)_localctx).ce = castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				((CastExpressionContext)_localctx).ue = unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				((CastExpressionContext)_localctx).c = constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public Token v;
		public PointerContext p;
		public Token b;
		public Token c;
		public Token i;
		public Token f;
		public Token d;
		public Token l;
		public Token str;
		public Token st;
		public Token id;
		public DsDecContext td;
		public TerminalNode VOID() { return getToken(CupParser.VOID, 0); }
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(CupParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(CupParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(CupParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CupParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CupParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(CupParser.LONG, 0); }
		public TerminalNode STRING() { return getToken(CupParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(CupParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public DsDecContext dsDec() {
			return getRuleContext(DsDecContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeSpecifier);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				((TypeSpecifierContext)_localctx).v = match(VOID);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(462);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				((TypeSpecifierContext)_localctx).b = match(BOOL);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(469);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				((TypeSpecifierContext)_localctx).c = match(CHAR);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(476);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				((TypeSpecifierContext)_localctx).i = match(INT);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(483);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				((TypeSpecifierContext)_localctx).f = match(FLOAT);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(490);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(496);
				((TypeSpecifierContext)_localctx).d = match(DOUBLE);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(497);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				((TypeSpecifierContext)_localctx).l = match(LONG);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(504);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(510);
				((TypeSpecifierContext)_localctx).str = match(STRING);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(511);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(517);
				((TypeSpecifierContext)_localctx).st = match(STRUCT);
				setState(518);
				((TypeSpecifierContext)_localctx).id = match(IDENTIFIER);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(519);
					((TypeSpecifierContext)_localctx).p = pointer();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
				enterOuterAlt(_localctx, 10);
				{
				setState(525);
				((TypeSpecifierContext)_localctx).td = dsDec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public Token par;
		public FunctionParameterListContext fpl;
		public Token v;
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CupParser.VOID, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitParameterTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameterTypeList);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				((ParameterTypeListContext)_localctx).par = match(LPAREN);
				setState(529);
				((ParameterTypeListContext)_localctx).fpl = functionParameterList();
				setState(530);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				((ParameterTypeListContext)_localctx).par = match(LPAREN);
				setState(533);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				((ParameterTypeListContext)_localctx).par = match(LPAREN);
				setState(535);
				((ParameterTypeListContext)_localctx).v = match(VOID);
				setState(536);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterListContext extends ParserRuleContext {
		public FormalContext f1;
		public FormalContext f2;
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public FunctionParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterFunctionParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitFunctionParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			((FunctionParameterListContext)_localctx).f1 = formal();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(540);
				match(COMMA);
				setState(541);
				((FunctionParameterListContext)_localctx).f2 = formal();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TypeSpecifierContext t1;
		public DeclaratorContext d1;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			((FormalContext)_localctx).t1 = typeSpecifier();
			setState(548);
			((FormalContext)_localctx).d1 = declarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext b;
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_blockItemList);
		int _la;
		try {
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case VOID:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case LONG:
			case CONST:
			case CONTINUE:
			case RETURN:
			case BREAK:
			case TYPEDEF:
			case SIZEOF:
			case EXTERN:
			case IDENTIFIER:
			case STRING:
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case STRUCT:
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
			case LPAREN:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case TILDE:
			case EXCLAIM:
			case PLUSPLUS:
			case MINUSMINUS:
			case AMPAMP:
			case IF:
			case DO:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(551);
					((BlockItemListContext)_localctx).b = blockItem();
					}
					}
					setState(554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << CONTINUE) | (1L << RETURN) | (1L << BREAK) | (1L << TYPEDEF) | (1L << SIZEOF) | (1L << EXTERN) | (1L << IDENTIFIER) | (1L << STRING) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR) | (1L << LPAREN) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (IF - 76)) | (1L << (DO - 76)) | (1L << (WHILE - 76)) | (1L << (FOR - 76)))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext st;
		public DeclarationContext dec;
		public FunctionCallContext fc;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blockItem);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				((BlockItemContext)_localctx).st = statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				((BlockItemContext)_localctx).dec = declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				((BlockItemContext)_localctx).fc = functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public Token id;
		public ExpressionContext e;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			((FunctionCallContext)_localctx).id = match(IDENTIFIER);
			setState(564);
			match(LPAREN);
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(565);
				((FunctionCallContext)_localctx).e = expression();
				}
				break;
			}
			setState(568);
			match(RPAREN);
			setState(569);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext cs;
		public ExpressionStatementContext es;
		public WhileStatementContext ws;
		public ForStatementContext fs;
		public IfStatementContext is;
		public JumpStatementContext js;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				((StatementContext)_localctx).cs = compoundStatement();
				}
				break;
			case SIZEOF:
			case IDENTIFIER:
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case LPAREN:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case TILDE:
			case EXCLAIM:
			case PLUSPLUS:
			case MINUSMINUS:
			case AMPAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				((StatementContext)_localctx).es = expressionStatement();
				}
				break;
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				((StatementContext)_localctx).ws = whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				((StatementContext)_localctx).fs = forStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
				((StatementContext)_localctx).is = ifStatement();
				}
				break;
			case CONTINUE:
			case RETURN:
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(576);
				((StatementContext)_localctx).js = jumpStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public Token pr;
		public BlockItemListContext b;
		public TerminalNode RBRACE() { return getToken(CupParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(CupParser.LBRACE, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			((CompoundStatementContext)_localctx).pr = match(LBRACE);
			setState(580);
			((CompoundStatementContext)_localctx).b = blockItemList();
			setState(581);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public AssignmentExpressionContext e;
		public Token sc;
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(583);
			((ExpressionStatementContext)_localctx).e = assignmentExpression();
			}
			setState(584);
			((ExpressionStatementContext)_localctx).sc = match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public AssignmentExpressionContext e1;
		public StatementContext s1;
		public AssignmentExpressionContext e2;
		public StatementContext s2;
		public StatementContext s3;
		public List<TerminalNode> IF() { return getTokens(CupParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CupParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CupParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CupParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CupParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CupParser.RPAREN, i);
		}
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CupParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CupParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(IF);
			setState(587);
			match(LPAREN);
			setState(588);
			((IfStatementContext)_localctx).e1 = assignmentExpression();
			setState(589);
			match(RPAREN);
			setState(590);
			((IfStatementContext)_localctx).s1 = statement();
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					match(ELSE);
					setState(592);
					match(IF);
					setState(593);
					match(LPAREN);
					setState(594);
					((IfStatementContext)_localctx).e2 = assignmentExpression();
					setState(595);
					match(RPAREN);
					setState(596);
					((IfStatementContext)_localctx).s2 = statement();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(603);
				match(ELSE);
				setState(604);
				((IfStatementContext)_localctx).s3 = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public Token w;
		public AssignmentExpressionContext e;
		public StatementContext st;
		public Token du;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(CupParser.WHILE, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public TerminalNode DO() { return getToken(CupParser.DO, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_whileStatement);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				((WhileStatementContext)_localctx).w = match(WHILE);
				setState(608);
				match(LPAREN);
				setState(609);
				((WhileStatementContext)_localctx).e = assignmentExpression();
				setState(610);
				match(RPAREN);
				setState(611);
				((WhileStatementContext)_localctx).st = statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				((WhileStatementContext)_localctx).du = match(DO);
				setState(614);
				((WhileStatementContext)_localctx).st = statement();
				setState(615);
				match(WHILE);
				setState(616);
				match(LPAREN);
				setState(617);
				((WhileStatementContext)_localctx).e = assignmentExpression();
				setState(618);
				match(RPAREN);
				setState(619);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public Token f;
		public ForConditionContext fc;
		public StatementContext st;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(CupParser.FOR, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			((ForStatementContext)_localctx).f = match(FOR);
			setState(624);
			match(LPAREN);
			setState(625);
			((ForStatementContext)_localctx).fc = forCondition();
			setState(626);
			match(RPAREN);
			setState(627);
			((ForStatementContext)_localctx).st = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public DeclarationContext dec;
		public ExpressionContext e1;
		public Token sc;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CupParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CupParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forCondition);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case LONG:
			case CONST:
			case TYPEDEF:
			case EXTERN:
			case STRING:
			case STRUCT:
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				((ForConditionContext)_localctx).dec = declaration();
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(630);
					((ForConditionContext)_localctx).e1 = expression();
					}
					break;
				}
				setState(633);
				((ForConditionContext)_localctx).sc = match(SEMICOLON);
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(634);
					((ForConditionContext)_localctx).e2 = expression();
					}
					break;
				}
				}
				break;
			case SIZEOF:
			case IDENTIFIER:
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case LPAREN:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case TILDE:
			case EXCLAIM:
			case PLUSPLUS:
			case MINUSMINUS:
			case AMPAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(637);
					((ForConditionContext)_localctx).e1 = expression();
					}
					break;
				}
				setState(640);
				match(SEMICOLON);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(641);
					((ForConditionContext)_localctx).e2 = expression();
					}
					break;
				}
				setState(644);
				((ForConditionContext)_localctx).sc = match(SEMICOLON);
				setState(646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(645);
					((ForConditionContext)_localctx).e3 = expression();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public Token cn;
		public Token br;
		public Token re;
		public AssignmentExpressionContext ae;
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(CupParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(CupParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(CupParser.RETURN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jumpStatement);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				((JumpStatementContext)_localctx).cn = match(CONTINUE);
				setState(651);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				((JumpStatementContext)_localctx).br = match(BREAK);
				setState(653);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				((JumpStatementContext)_localctx).re = match(RETURN);
				setState(655);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				((JumpStatementContext)_localctx).re = match(RETURN);
				setState(657);
				((JumpStatementContext)_localctx).ae = assignmentExpression();
				setState(658);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionReturnContext extends ParserRuleContext {
		public Token id;
		public ArgumentExpressionListContext ael;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			((FunctionReturnContext)_localctx).id = match(IDENTIFIER);
			setState(663);
			match(LPAREN);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
				{
				setState(664);
				((FunctionReturnContext)_localctx).ael = argumentExpressionList();
				}
			}

			setState(667);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext scs;
		public TypeQualifierContext tq;
		public TypeSpecifierContext ts;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_declarationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEDEF || _la==EXTERN) {
				{
				setState(669);
				((DeclarationSpecifierContext)_localctx).scs = storageClassSpecifier();
				}
			}

			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(672);
				((DeclarationSpecifierContext)_localctx).tq = typeQualifier();
				}
			}

			setState(675);
			((DeclarationSpecifierContext)_localctx).ts = typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public Token td;
		public Token ex;
		public TerminalNode TYPEDEF() { return getToken(CupParser.TYPEDEF, 0); }
		public TerminalNode EXTERN() { return getToken(CupParser.EXTERN, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_storageClassSpecifier);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				((StorageClassSpecifierContext)_localctx).td = match(TYPEDEF);
				}
				break;
			case EXTERN:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				((StorageClassSpecifierContext)_localctx).ex = match(EXTERN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext d;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declarationList);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case VOID:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case LONG:
			case CONST:
			case TYPEDEF:
			case EXTERN:
			case STRING:
			case STRUCT:
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(683); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(682);
					((DeclarationListContext)_localctx).d = declaration();
					}
					}
					setState(685); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameListContext extends ParserRuleContext {
		public Token i1;
		public Token i2;
		public List<TerminalNode> IDENTIFIER() { return getTokens(CupParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CupParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			((NameListContext)_localctx).i1 = match(IDENTIFIER);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(691);
				((NameListContext)_localctx).i2 = match(IDENTIFIER);
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public Token st;
		public Token id;
		public DeclarationListContext dl;
		public NameListContext nl;
		public TerminalNode LBRACE() { return getToken(CupParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CupParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public TerminalNode STRUCT() { return getToken(CupParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CupParserListener ) ((CupParserListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_structDefinition);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				((StructDefinitionContext)_localctx).st = match(STRUCT);
				setState(698);
				((StructDefinitionContext)_localctx).id = match(IDENTIFIER);
				setState(699);
				match(LBRACE);
				setState(700);
				((StructDefinitionContext)_localctx).dl = declarationList();
				setState(701);
				match(RBRACE);
				setState(702);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				((StructDefinitionContext)_localctx).st = match(STRUCT);
				setState(705);
				((StructDefinitionContext)_localctx).id = match(IDENTIFIER);
				setState(706);
				match(LBRACE);
				setState(707);
				((StructDefinitionContext)_localctx).dl = declarationList();
				setState(708);
				match(RBRACE);
				setState(709);
				((StructDefinitionContext)_localctx).nl = nameList();
				setState(710);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return declarator_sempred((DeclaratorContext)_localctx, predIndex);
		case 23:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 28:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 29:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 30:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 31:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 32:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 33:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 34:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 35:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 36:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 37:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarator_sempred(DeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u02cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\5\2|\n\2\3\2\3\2\3\3\6\3\u0081\n\3\r\3\16\3\u0082\3\4\3\4\3\4\3\4"+
		"\5\4\u0089\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0097"+
		"\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\7\r\u00b2\n\r\f\r\16\r\u00b5"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\17\3\17\5\17\u00c0\n"+
		"\17\3\17\3\17\5\17\u00c4\n\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21"+
		"\3\22\3\22\3\22\5\22\u00db\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e2\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0102\n\27\3\30\3\30\3\31\3\31\3\31\5\31\u0109"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u011a\n\31\f\31\16\31\u011d\13\31\3\32\3\32\3\32\3\32"+
		"\7\32\u0123\n\32\f\32\16\32\u0126\13\32\5\32\u0128\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0130\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0137\n"+
		"\34\3\35\3\35\3\35\7\35\u013c\n\35\f\35\16\35\u013f\13\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\7\36\u0147\n\36\f\36\16\36\u014a\13\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u0152\n\37\f\37\16\37\u0155\13\37\3 \3 \3 \3 "+
		"\3 \3 \7 \u015d\n \f \16 \u0160\13 \3!\3!\3!\3!\3!\3!\7!\u0168\n!\f!\16"+
		"!\u016b\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0173\n\"\f\"\16\"\u0176\13\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0181\n#\f#\16#\u0184\13#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0195\n$\f$\16$\u0198\13$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u01a3\n%\f%\16%\u01a6\13%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\7&\u01b4\n&\f&\16&\u01b7\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\7\'\u01c2\n\'\f\'\16\'\u01c5\13\'\3(\3(\3(\3(\3(\3(\3(\5(\u01ce"+
		"\n(\3)\3)\7)\u01d2\n)\f)\16)\u01d5\13)\3)\3)\7)\u01d9\n)\f)\16)\u01dc"+
		"\13)\3)\3)\7)\u01e0\n)\f)\16)\u01e3\13)\3)\3)\7)\u01e7\n)\f)\16)\u01ea"+
		"\13)\3)\3)\7)\u01ee\n)\f)\16)\u01f1\13)\3)\3)\7)\u01f5\n)\f)\16)\u01f8"+
		"\13)\3)\3)\7)\u01fc\n)\f)\16)\u01ff\13)\3)\3)\7)\u0203\n)\f)\16)\u0206"+
		"\13)\3)\3)\3)\7)\u020b\n)\f)\16)\u020e\13)\3)\5)\u0211\n)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\5*\u021c\n*\3+\3+\3+\7+\u0221\n+\f+\16+\u0224\13+\3,\3"+
		",\3,\3-\3-\6-\u022b\n-\r-\16-\u022c\5-\u022f\n-\3.\3.\3.\5.\u0234\n.\3"+
		"/\3/\3/\5/\u0239\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0244"+
		"\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0259\n\63\f\63\16\63\u025c\13\63"+
		"\3\63\3\63\5\63\u0260\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u0270\n\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\5\66\u027a\n\66\3\66\3\66\5\66\u027e\n\66\3\66\5\66\u0281\n"+
		"\66\3\66\3\66\5\66\u0285\n\66\3\66\3\66\5\66\u0289\n\66\5\66\u028b\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0297\n\67\38"+
		"\38\38\58\u029c\n8\38\38\39\59\u02a1\n9\39\59\u02a4\n9\39\39\3:\3:\5:"+
		"\u02aa\n:\3;\3;\6;\u02ae\n;\r;\16;\u02af\5;\u02b2\n;\3<\3<\3<\7<\u02b7"+
		"\n<\f<\16<\u02ba\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02cb"+
		"\n=\3=\2\16 \60:<>@BDFHJL>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\4\5\2?CEEIM\5\2"+
		"-/\64\64\678\2\u0302\2{\3\2\2\2\4\u0080\3\2\2\2\6\u0088\3\2\2\2\b\u008a"+
		"\3\2\2\2\n\u008f\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u009c\3\2"+
		"\2\2\22\u00a0\3\2\2\2\24\u00a5\3\2\2\2\26\u00ac\3\2\2\2\30\u00ae\3\2\2"+
		"\2\32\u00bb\3\2\2\2\34\u00c6\3\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\""+
		"\u00da\3\2\2\2$\u00e1\3\2\2\2&\u00ea\3\2\2\2(\u00ec\3\2\2\2*\u00ee\3\2"+
		"\2\2,\u0101\3\2\2\2.\u0103\3\2\2\2\60\u0108\3\2\2\2\62\u0127\3\2\2\2\64"+
		"\u012f\3\2\2\2\66\u0136\3\2\2\28\u0138\3\2\2\2:\u0140\3\2\2\2<\u014b\3"+
		"\2\2\2>\u0156\3\2\2\2@\u0161\3\2\2\2B\u016c\3\2\2\2D\u0177\3\2\2\2F\u0185"+
		"\3\2\2\2H\u0199\3\2\2\2J\u01a7\3\2\2\2L\u01b8\3\2\2\2N\u01cd\3\2\2\2P"+
		"\u0210\3\2\2\2R\u021b\3\2\2\2T\u021d\3\2\2\2V\u0225\3\2\2\2X\u022e\3\2"+
		"\2\2Z\u0233\3\2\2\2\\\u0235\3\2\2\2^\u0243\3\2\2\2`\u0245\3\2\2\2b\u0249"+
		"\3\2\2\2d\u024c\3\2\2\2f\u026f\3\2\2\2h\u0271\3\2\2\2j\u028a\3\2\2\2l"+
		"\u0296\3\2\2\2n\u0298\3\2\2\2p\u02a0\3\2\2\2r\u02a9\3\2\2\2t\u02b1\3\2"+
		"\2\2v\u02b3\3\2\2\2x\u02ca\3\2\2\2z|\5\4\3\2{z\3\2\2\2{|\3\2\2\2|}\3\2"+
		"\2\2}~\7\2\2\3~\3\3\2\2\2\177\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\5\3\2\2\2\u0084"+
		"\u0089\5\n\6\2\u0085\u0089\5\f\7\2\u0086\u0089\5x=\2\u0087\u0089\5\b\5"+
		"\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\7\3\2\2\2\u008a\u008b\5 \21\2\u008b\u008c\7E\2\2\u008c"+
		"\u008d\5$\23\2\u008d\u008e\7%\2\2\u008e\t\3\2\2\2\u008f\u0090\5P)\2\u0090"+
		"\u0091\7\24\2\2\u0091\u0092\5R*\2\u0092\u0093\5`\61\2\u0093\13\3\2\2\2"+
		"\u0094\u0097\5\16\b\2\u0095\u0097\5\20\t\2\u0096\u0094\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\5p9\2\u0099\u009a\5\30\r\2\u009a"+
		"\u009b\7%\2\2\u009b\17\3\2\2\2\u009c\u009d\5\22\n\2\u009d\u009e\5\30\r"+
		"\2\u009e\u009f\7%\2\2\u009f\21\3\2\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2"+
		"\7\"\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7#\2\2\u00a4\23\3\2\2\2\u00a5"+
		"\u00a6\5P)\2\u00a6\25\3\2\2\2\u00a7\u00ad\7\34\2\2\u00a8\u00ad\7\35\2"+
		"\2\u00a9\u00ad\7\37\2\2\u00aa\u00ad\7\36\2\2\u00ab\u00ad\7 \2\2\u00ac"+
		"\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00b3\5\32\16\2\u00af"+
		"\u00b0\7&\2\2\u00b0\u00b2\5\32\16\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\31\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00bc\5 \21\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\7E"+
		"\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00bf\7/\2\2\u00be\u00c0\5\36\20"+
		"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c7\3\2\2\2\u00c1\u00c3"+
		"\7/\2\2\u00c2\u00c4\5\36\20\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c7\5\34\17\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1"+
		"\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\37\3\2\2\2\u00ca\u00cb"+
		"\b\21\1\2\u00cb\u00cc\7\24\2\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\f\3\2\2"+
		"\u00ce\u00cf\7\'\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\7(\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5!\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00db\7\30\2\2"+
		"\u00d8\u00db\7\24\2\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db#\3\2\2\2\u00dc\u00e2\5&\24\2\u00dd"+
		"\u00de\7)\2\2\u00de\u00df\5\62\32\2\u00df\u00e0\7*\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2%\3\2\2\2\u00e3\u00eb"+
		"\5*\26\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\5&\24\2\u00e7"+
		"\u00eb\3\2\2\2\u00e8\u00eb\5\66\34\2\u00e9\u00eb\5n8\2\u00ea\u00e3\3\2"+
		"\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\'\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed)\3\2\2\2\u00ee\u00ef\5:\36\2\u00ef"+
		"+\3\2\2\2\u00f0\u0102\5\60\31\2\u00f1\u00f2\79\2\2\u00f2\u0102\5,\27\2"+
		"\u00f3\u00f4\7:\2\2\u00f4\u0102\5,\27\2\u00f5\u00f6\5.\30\2\u00f6\u00f7"+
		"\5N(\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\7\20\2\2\u00f9\u0102\5,\27\2\u00fa"+
		"\u00fb\7\20\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\5P)\2\u00fd\u00fe\7#\2"+
		"\2\u00fe\u0102\3\2\2\2\u00ff\u0100\7=\2\2\u0100\u0102\7\24\2\2\u0101\u00f0"+
		"\3\2\2\2\u0101\u00f1\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00f5\3\2\2\2\u0101"+
		"\u00f8\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00ff\3\2\2\2\u0102-\3\2\2\2"+
		"\u0103\u0104\t\3\2\2\u0104/\3\2\2\2\u0105\u0106\b\31\1\2\u0106\u0109\5"+
		"\64\33\2\u0107\u0109\5n8\2\u0108\u0105\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u011b\3\2\2\2\u010a\u010b\f\7\2\2\u010b\u010c\7\'\2\2\u010c\u010d\5&"+
		"\24\2\u010d\u010e\7(\2\2\u010e\u011a\3\2\2\2\u010f\u0110\f\6\2\2\u0110"+
		"\u0111\7+\2\2\u0111\u011a\7\24\2\2\u0112\u0113\f\5\2\2\u0113\u0114\7,"+
		"\2\2\u0114\u011a\7\24\2\2\u0115\u0116\f\4\2\2\u0116\u011a\79\2\2\u0117"+
		"\u0118\f\3\2\2\u0118\u011a\7:\2\2\u0119\u010a\3\2\2\2\u0119\u010f\3\2"+
		"\2\2\u0119\u0112\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\61\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011e\u0128\3\2\2\2\u011f\u0124\5&\24\2\u0120\u0121"+
		"\7&\2\2\u0121\u0123\5&\24\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u011e\3\2\2\2\u0127\u011f\3\2\2\2\u0128\63\3\2\2\2\u0129\u0130"+
		"\7\24\2\2\u012a\u0130\5\66\34\2\u012b\u012c\7\"\2\2\u012c\u012d\5&\24"+
		"\2\u012d\u012e\7#\2\2\u012e\u0130\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012a"+
		"\3\2\2\2\u012f\u012b\3\2\2\2\u0130\65\3\2\2\2\u0131\u0137\7\30\2\2\u0132"+
		"\u0137\7\31\2\2\u0133\u0137\7\32\2\2\u0134\u0137\7\26\2\2\u0135\u0137"+
		"\7\27\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\67\3\2\2\2\u0138\u013d"+
		"\5&\24\2\u0139\u013a\7&\2\2\u013a\u013c\5&\24\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e9\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0141\b\36\1\2\u0141\u0142\5<\37\2\u0142\u0148"+
		"\3\2\2\2\u0143\u0144\f\3\2\2\u0144\u0145\7>\2\2\u0145\u0147\5<\37\2\u0146"+
		"\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149;\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\b\37\1\2\u014c\u014d"+
		"\5@!\2\u014d\u0153\3\2\2\2\u014e\u014f\f\3\2\2\u014f\u0150\7=\2\2\u0150"+
		"\u0152\5@!\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154=\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157"+
		"\b \1\2\u0157\u0158\5B\"\2\u0158\u015e\3\2\2\2\u0159\u015a\f\3\2\2\u015a"+
		"\u015b\7\66\2\2\u015b\u015d\5B\"\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f?\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0162\b!\1\2\u0162\u0163\5> \2\u0163\u0169\3\2\2\2\u0164"+
		"\u0165\f\3\2\2\u0165\u0166\7\65\2\2\u0166\u0168\5> \2\u0167\u0164\3\2"+
		"\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"A\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\b\"\1\2\u016d\u016e\5D#\2\u016e"+
		"\u0174\3\2\2\2\u016f\u0170\f\3\2\2\u0170\u0171\7\64\2\2\u0171\u0173\5"+
		"D#\2\u0172\u016f\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175C\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\b#\1\2\u0178"+
		"\u0179\5F$\2\u0179\u0182\3\2\2\2\u017a\u017b\f\4\2\2\u017b\u017c\7D\2"+
		"\2\u017c\u0181\5F$\2\u017d\u017e\f\3\2\2\u017e\u017f\7F\2\2\u017f\u0181"+
		"\5F$\2\u0180\u017a\3\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183E\3\2\2\2\u0184\u0182\3\2\2\2"+
		"\u0185\u0186\b$\1\2\u0186\u0187\5H%\2\u0187\u0196\3\2\2\2\u0188\u0189"+
		"\f\6\2\2\u0189\u018a\7\62\2\2\u018a\u0195\5H%\2\u018b\u018c\f\5\2\2\u018c"+
		"\u018d\7\63\2\2\u018d\u0195\5H%\2\u018e\u018f\f\4\2\2\u018f\u0190\7G\2"+
		"\2\u0190\u0195\5H%\2\u0191\u0192\f\3\2\2\u0192\u0193\7H\2\2\u0193\u0195"+
		"\5H%\2\u0194\u0188\3\2\2\2\u0194\u018b\3\2\2\2\u0194\u018e\3\2\2\2\u0194"+
		"\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197G\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\b%\1\2\u019a\u019b"+
		"\5L\'\2\u019b\u01a4\3\2\2\2\u019c\u019d\f\4\2\2\u019d\u019e\7;\2\2\u019e"+
		"\u01a3\5L\'\2\u019f\u01a0\f\3\2\2\u01a0\u01a1\7<\2\2\u01a1\u01a3\5L\'"+
		"\2\u01a2\u019c\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5I\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\b&\1\2\u01a8\u01a9\5N(\2\u01a9\u01b5\3\2\2\2\u01aa\u01ab\f\5\2"+
		"\2\u01ab\u01ac\7/\2\2\u01ac\u01b4\5N(\2\u01ad\u01ae\f\4\2\2\u01ae\u01af"+
		"\7\60\2\2\u01af\u01b4\5N(\2\u01b0\u01b1\f\3\2\2\u01b1\u01b2\7\61\2\2\u01b2"+
		"\u01b4\5N(\2\u01b3\u01aa\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01b0\3\2\2"+
		"\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6K"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\'\1\2\u01b9\u01ba\5J&\2\u01ba"+
		"\u01c3\3\2\2\2\u01bb\u01bc\f\4\2\2\u01bc\u01bd\7-\2\2\u01bd\u01c2\5J&"+
		"\2\u01be\u01bf\f\3\2\2\u01bf\u01c0\7.\2\2\u01c0\u01c2\5J&\2\u01c1\u01bb"+
		"\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4M\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\7\"\2\2"+
		"\u01c7\u01c8\5P)\2\u01c8\u01c9\7#\2\2\u01c9\u01ca\5N(\2\u01ca\u01ce\3"+
		"\2\2\2\u01cb\u01ce\5,\27\2\u01cc\u01ce\5\66\34\2\u01cd\u01c6\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceO\3\2\2\2\u01cf\u01d3\7\3\2\2"+
		"\u01d0\u01d2\5\34\17\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u0211\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01da\7\b\2\2\u01d7\u01d9\5\34\17\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3"+
		"\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u0211\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01e1\7\7\2\2\u01de\u01e0\5\34\17\2\u01df\u01de\3"+
		"\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u0211\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e8\7\4\2\2\u01e5\u01e7\5\34"+
		"\17\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u0211\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ef\7\5"+
		"\2\2\u01ec\u01ee\5\34\17\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u0211\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f6\7\6\2\2\u01f3\u01f5\5\34\17\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0211\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fd\7\t\2\2\u01fa\u01fc\5\34\17\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0211\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0204\7\25\2\2\u0201"+
		"\u0203\5\34\17\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3"+
		"\2\2\2\u0204\u0205\3\2\2\2\u0205\u0211\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"\u0208\7\33\2\2\u0208\u020c\7\24\2\2\u0209\u020b\5\34\17\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0211\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\22\n\2\u0210\u01cf\3"+
		"\2\2\2\u0210\u01d6\3\2\2\2\u0210\u01dd\3\2\2\2\u0210\u01e4\3\2\2\2\u0210"+
		"\u01eb\3\2\2\2\u0210\u01f2\3\2\2\2\u0210\u01f9\3\2\2\2\u0210\u0200\3\2"+
		"\2\2\u0210\u0207\3\2\2\2\u0210\u020f\3\2\2\2\u0211Q\3\2\2\2\u0212\u0213"+
		"\7\"\2\2\u0213\u0214\5T+\2\u0214\u0215\7#\2\2\u0215\u021c\3\2\2\2\u0216"+
		"\u0217\7\"\2\2\u0217\u021c\7#\2\2\u0218\u0219\7\"\2\2\u0219\u021a\7\3"+
		"\2\2\u021a\u021c\7#\2\2\u021b\u0212\3\2\2\2\u021b\u0216\3\2\2\2\u021b"+
		"\u0218\3\2\2\2\u021cS\3\2\2\2\u021d\u0222\5V,\2\u021e\u021f\7&\2\2\u021f"+
		"\u0221\5V,\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2"+
		"\2\u0222\u0223\3\2\2\2\u0223U\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226"+
		"\5P)\2\u0226\u0227\5 \21\2\u0227W\3\2\2\2\u0228\u022f\3\2\2\2\u0229\u022b"+
		"\5Z.\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0228\3\2\2\2\u022e\u022a\3\2"+
		"\2\2\u022fY\3\2\2\2\u0230\u0234\5^\60\2\u0231\u0234\5\f\7\2\u0232\u0234"+
		"\5\\/\2\u0233\u0230\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234"+
		"[\3\2\2\2\u0235\u0236\7\24\2\2\u0236\u0238\7\"\2\2\u0237\u0239\5\62\32"+
		"\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b"+
		"\7#\2\2\u023b\u023c\7%\2\2\u023c]\3\2\2\2\u023d\u0244\5`\61\2\u023e\u0244"+
		"\5b\62\2\u023f\u0244\5f\64\2\u0240\u0244\5h\65\2\u0241\u0244\5d\63\2\u0242"+
		"\u0244\5l\67\2\u0243\u023d\3\2\2\2\u0243\u023e\3\2\2\2\u0243\u023f\3\2"+
		"\2\2\u0243\u0240\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"_\3\2\2\2\u0245\u0246\7)\2\2\u0246\u0247\5X-\2\u0247\u0248\7*\2\2\u0248"+
		"a\3\2\2\2\u0249\u024a\5&\24\2\u024a\u024b\7%\2\2\u024bc\3\2\2\2\u024c"+
		"\u024d\7N\2\2\u024d\u024e\7\"\2\2\u024e\u024f\5&\24\2\u024f\u0250\7#\2"+
		"\2\u0250\u025a\5^\60\2\u0251\u0252\7O\2\2\u0252\u0253\7N\2\2\u0253\u0254"+
		"\7\"\2\2\u0254\u0255\5&\24\2\u0255\u0256\7#\2\2\u0256\u0257\5^\60\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0251\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025f\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u025e\7O\2\2\u025e\u0260\5^\60\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260e\3\2\2\2\u0261\u0262\7Q\2\2\u0262\u0263\7\"\2\2\u0263\u0264"+
		"\5&\24\2\u0264\u0265\7#\2\2\u0265\u0266\5^\60\2\u0266\u0270\3\2\2\2\u0267"+
		"\u0268\7P\2\2\u0268\u0269\5^\60\2\u0269\u026a\7Q\2\2\u026a\u026b\7\"\2"+
		"\2\u026b\u026c\5&\24\2\u026c\u026d\7#\2\2\u026d\u026e\7%\2\2\u026e\u0270"+
		"\3\2\2\2\u026f\u0261\3\2\2\2\u026f\u0267\3\2\2\2\u0270g\3\2\2\2\u0271"+
		"\u0272\7U\2\2\u0272\u0273\7\"\2\2\u0273\u0274\5j\66\2\u0274\u0275\7#\2"+
		"\2\u0275\u0276\5^\60\2\u0276i\3\2\2\2\u0277\u0279\5\f\7\2\u0278\u027a"+
		"\5\62\32\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2"+
		"\u027b\u027d\7%\2\2\u027c\u027e\5\62\32\2\u027d\u027c\3\2\2\2\u027d\u027e"+
		"\3\2\2\2\u027e\u028b\3\2\2\2\u027f\u0281\5\62\32\2\u0280\u027f\3\2\2\2"+
		"\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\7%\2\2\u0283\u0285"+
		"\5\62\32\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2"+
		"\u0286\u0288\7%\2\2\u0287\u0289\5\62\32\2\u0288\u0287\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0277\3\2\2\2\u028a\u0280\3\2\2\2\u028b"+
		"k\3\2\2\2\u028c\u028d\7\f\2\2\u028d\u0297\7%\2\2\u028e\u028f\7\16\2\2"+
		"\u028f\u0297\7%\2\2\u0290\u0291\7\r\2\2\u0291\u0297\7%\2\2\u0292\u0293"+
		"\7\r\2\2\u0293\u0294\5&\24\2\u0294\u0295\7%\2\2\u0295\u0297\3\2\2\2\u0296"+
		"\u028c\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u0290\3\2\2\2\u0296\u0292\3\2"+
		"\2\2\u0297m\3\2\2\2\u0298\u0299\7\24\2\2\u0299\u029b\7\"\2\2\u029a\u029c"+
		"\58\35\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\7#\2\2\u029eo\3\2\2\2\u029f\u02a1\5r:\2\u02a0\u029f\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a4\5\36\20\2\u02a3\u02a2\3"+
		"\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\5P)\2\u02a6"+
		"q\3\2\2\2\u02a7\u02aa\7\17\2\2\u02a8\u02aa\7\21\2\2\u02a9\u02a7\3\2\2"+
		"\2\u02a9\u02a8\3\2\2\2\u02aas\3\2\2\2\u02ab\u02b2\3\2\2\2\u02ac\u02ae"+
		"\5\f\7\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ab\3\2\2\2\u02b1\u02ad\3\2"+
		"\2\2\u02b2u\3\2\2\2\u02b3\u02b8\7\24\2\2\u02b4\u02b5\7&\2\2\u02b5\u02b7"+
		"\7\24\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2"+
		"\u02b8\u02b9\3\2\2\2\u02b9w\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7"+
		"\33\2\2\u02bc\u02bd\7\24\2\2\u02bd\u02be\7)\2\2\u02be\u02bf\5t;\2\u02bf"+
		"\u02c0\7*\2\2\u02c0\u02c1\7%\2\2\u02c1\u02cb\3\2\2\2\u02c2\u02c3\7\33"+
		"\2\2\u02c3\u02c4\7\24\2\2\u02c4\u02c5\7)\2\2\u02c5\u02c6\5t;\2\u02c6\u02c7"+
		"\7*\2\2\u02c7\u02c8\5v<\2\u02c8\u02c9\7%\2\2\u02c9\u02cb\3\2\2\2\u02ca"+
		"\u02bb\3\2\2\2\u02ca\u02c2\3\2\2\2\u02cby\3\2\2\2L{\u0082\u0088\u0096"+
		"\u00ac\u00b3\u00bb\u00bf\u00c3\u00c6\u00d4\u00da\u00e1\u00ea\u0101\u0108"+
		"\u0119\u011b\u0124\u0127\u012f\u0136\u013d\u0148\u0153\u015e\u0169\u0174"+
		"\u0180\u0182\u0194\u0196\u01a2\u01a4\u01b3\u01b5\u01c1\u01c3\u01cd\u01d3"+
		"\u01da\u01e1\u01e8\u01ef\u01f6\u01fd\u0204\u020c\u0210\u021b\u0222\u022c"+
		"\u022e\u0233\u0238\u0243\u025a\u025f\u026f\u0279\u027d\u0280\u0284\u0288"+
		"\u028a\u0296\u029b\u02a0\u02a3\u02a9\u02af\u02b1\u02b8\u02ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}