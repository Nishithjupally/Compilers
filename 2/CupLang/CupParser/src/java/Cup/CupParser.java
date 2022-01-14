// Generated from CupParser.g4 by ANTLR 4.8
package Cup;

    import java.util.List;

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
		RULE_program = 0, RULE_text = 1, RULE_functionOrDeclaration = 2, RULE_functionDefinition = 3, 
		RULE_declaration = 4, RULE_templateDeclaration = 5, RULE_templateDeclaration1 = 6, 
		RULE_dsArgs = 7, RULE_dataStructureName = 8, RULE_initDeclaratorList = 9, 
		RULE_initDeclarator = 10, RULE_declarator = 11, RULE_pointer = 12, RULE_typeQualifierList = 13, 
		RULE_typeQualifier = 14, RULE_directDeclarator = 15, RULE_array_params = 16, 
		RULE_initializer = 17, RULE_initializerList = 18, RULE_assignmentExpression = 19, 
		RULE_assignmentOperator = 20, RULE_conditionalExpression = 21, RULE_unaryExpression = 22, 
		RULE_unaryOperator = 23, RULE_postfixExpression = 24, RULE_expression = 25, 
		RULE_primaryExpression = 26, RULE_constant = 27, RULE_argumentExpressionList = 28, 
		RULE_logicalOrExpression = 29, RULE_logicalAndExpression = 30, RULE_exclusiveOrExpression = 31, 
		RULE_inclusiveOrExpression = 32, RULE_andExpression = 33, RULE_equalityExpression = 34, 
		RULE_relationalExpression = 35, RULE_shiftExpression = 36, RULE_multiplicativeExpression = 37, 
		RULE_additiveExpression = 38, RULE_castExpression = 39, RULE_typeSpecifier = 40, 
		RULE_parameterTypeList = 41, RULE_functionParameterList = 42, RULE_blockItemList = 43, 
		RULE_blockItem = 44, RULE_functionCall = 45, RULE_identifierList = 46, 
		RULE_statement = 47, RULE_labeledStatement = 48, RULE_compoundStatement = 49, 
		RULE_constantExpression = 50, RULE_expressionStatement = 51, RULE_ifStatement = 52, 
		RULE_switchStatement = 53, RULE_whileStatement = 54, RULE_forStatement = 55, 
		RULE_forCondition = 56, RULE_forDeclaration = 57, RULE_forExpression = 58, 
		RULE_jumpStatement = 59, RULE_functionReturn = 60, RULE_declarationSpecifier = 61, 
		RULE_storageClassSpecifier = 62, RULE_declarationList = 63, RULE_structDefintion = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "text", "functionOrDeclaration", "functionDefinition", "declaration", 
			"templateDeclaration", "templateDeclaration1", "dsArgs", "dataStructureName", 
			"initDeclaratorList", "initDeclarator", "declarator", "pointer", "typeQualifierList", 
			"typeQualifier", "directDeclarator", "array_params", "initializer", "initializerList", 
			"assignmentExpression", "assignmentOperator", "conditionalExpression", 
			"unaryExpression", "unaryOperator", "postfixExpression", "expression", 
			"primaryExpression", "constant", "argumentExpressionList", "logicalOrExpression", 
			"logicalAndExpression", "exclusiveOrExpression", "inclusiveOrExpression", 
			"andExpression", "equalityExpression", "relationalExpression", "shiftExpression", 
			"multiplicativeExpression", "additiveExpression", "castExpression", "typeSpecifier", 
			"parameterTypeList", "functionParameterList", "blockItemList", "blockItem", 
			"functionCall", "identifierList", "statement", "labeledStatement", "compoundStatement", 
			"constantExpression", "expressionStatement", "ifStatement", "switchStatement", 
			"whileStatement", "forStatement", "forCondition", "forDeclaration", "forExpression", 
			"jumpStatement", "functionReturn", "declarationSpecifier", "storageClassSpecifier", 
			"declarationList", "structDefintion"
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

	/*
	    DO NOT EDIT THE FILE ABOVE THIS LINE
	    Add member functions, variables below.
	*/


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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << IDENTIFIER) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR) | (1L << LPAREN) | (1L << STAR))) != 0)) {
				{
				setState(130);
				((ProgramContext)_localctx).t = text(0);
				}
			}

			setState(133);
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
		public FunctionOrDeclarationContext functionOrDeclaration() {
			return getRuleContext(FunctionOrDeclarationContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		return text(0);
	}

	private TextContext text(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TextContext _localctx = new TextContext(_ctx, _parentState);
		TextContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_text, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			functionOrDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_text);
					setState(138);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(139);
					functionOrDeclaration();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class FunctionOrDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StructDefintionContext structDefintion() {
			return getRuleContext(StructDefintionContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CupParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public FunctionOrDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOrDeclaration; }
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				structDefintion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				declarator();
				setState(149);
				match(EQUAL);
				setState(150);
				initializer();
				setState(151);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeSpecifierContext t;
		public ParameterTypeListContext pl;
		public CompoundStatementContext cs;
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((FunctionDefinitionContext)_localctx).t = typeSpecifier();
			setState(156);
			match(IDENTIFIER);
			setState(157);
			((FunctionDefinitionContext)_localctx).pl = parameterTypeList();
			setState(158);
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
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					declarationSpecifier();
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
				setState(165);
				initDeclaratorList(0);
				setState(166);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				templateDeclaration();
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

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TemplateDeclaration1Context templateDeclaration1() {
			return getRuleContext(TemplateDeclaration1Context.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			templateDeclaration1();
			setState(172);
			initDeclaratorList(0);
			setState(173);
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

	public static class TemplateDeclaration1Context extends ParserRuleContext {
		public DataStructureNameContext dataStructureName() {
			return getRuleContext(DataStructureNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public DsArgsContext dsArgs() {
			return getRuleContext(DsArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TemplateDeclaration1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTemplateDeclaration1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclaration1Context templateDeclaration1() throws RecognitionException {
		TemplateDeclaration1Context _localctx = new TemplateDeclaration1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_templateDeclaration1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			dataStructureName();
			setState(176);
			match(LPAREN);
			setState(177);
			dsArgs();
			setState(178);
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TemplateDeclaration1Context templateDeclaration1() {
			return getRuleContext(TemplateDeclaration1Context.class,0);
		}
		public DsArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsArgs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDsArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsArgsContext dsArgs() throws RecognitionException {
		DsArgsContext _localctx = new DsArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dsArgs);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				typeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				templateDeclaration1();
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

	public static class DataStructureNameContext extends ParserRuleContext {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDataStructureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureNameContext dataStructureName() throws RecognitionException {
		DataStructureNameContext _localctx = new DataStructureNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataStructureName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0)) ) {
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CupParser.COMMA, 0); }
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(187);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(189);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(190);
					match(COMMA);
					setState(191);
					initDeclarator();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initDeclarator);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				declarator();
				setState(199);
				match(EQUAL);
				setState(200);
				initializer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(204);
				pointer();
				}
			}

			setState(207);
			directDeclarator(0);
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
		public TerminalNode STAR() { return getToken(CupParser.STAR, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pointer);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(STAR);
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(210);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(STAR);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST || _la==RESTRICT) {
					{
					setState(214);
					typeQualifierList(0);
					}
				}

				setState(217);
				pointer();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(224);
					typeQualifier();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CupParser.CONST, 0); }
		public TerminalNode RESTRICT() { return getToken(CupParser.RESTRICT, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==RESTRICT) ) {
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LSQR() { return getToken(CupParser.LSQR, 0); }
		public Array_paramsContext array_params() {
			return getRuleContext(Array_paramsContext.class,0);
		}
		public TerminalNode RSQR() { return getToken(CupParser.RSQR, 0); }
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_directDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(233);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				{
				setState(234);
				match(LPAREN);
				setState(235);
				declarator();
				setState(236);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
					setState(240);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(241);
					match(LSQR);
					setState(242);
					array_params();
					setState(243);
					match(RSQR);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode INTEGER_CONST() { return getToken(CupParser.INTEGER_CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public Array_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_params; }
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
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(INTEGER_CONST);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(IDENTIFIER);
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CupParser.LBRACE, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CupParser.RBRACE, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
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
			setState(260);
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
				setState(255);
				assignmentExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(LBRACE);
				setState(257);
				initializerList(0);
				setState(258);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CupParser.COMMA, 0); }
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_initializerList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(263);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(265);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(266);
					match(COMMA);
					setState(267);
					initializer();
					}
					} 
				}
				setState(272);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentExpression);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				unaryExpression();
				setState(275);
				assignmentOperator();
				setState(276);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				functionReturn();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(CupParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CupParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			logicalOrExpression(0);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(285);
				match(QUESTION);
				setState(286);
				expression(0);
				setState(287);
				match(COLON);
				setState(288);
				conditionalExpression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode AMPAMP() { return getToken(CupParser.AMPAMP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryExpression);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(PLUSPLUS);
				setState(294);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(MINUSMINUS);
				setState(296);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				unaryOperator();
				setState(298);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(SIZEOF);
				setState(301);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				match(SIZEOF);
				setState(303);
				match(LPAREN);
				setState(304);
				typeSpecifier();
				setState(305);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				match(AMPAMP);
				setState(308);
				match(IDENTIFIER);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode LSQR() { return getToken(CupParser.LSQR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQR() { return getToken(CupParser.RSQR, 0); }
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(316);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(317);
						match(LPAREN);
						setState(319);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
							{
							setState(318);
							argumentExpressionList(0);
							}
						}

						setState(321);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(323);
						match(LSQR);
						setState(324);
						expression(0);
						setState(325);
						match(RSQR);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(327);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(328);
						match(DOT);
						setState(329);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(330);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(331);
						match(ARROW);
						setState(332);
						match(IDENTIFIER);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(333);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(334);
						match(PLUSPLUS);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(335);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(336);
						match(MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(341);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CupParser.COMMA, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(343);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(345);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(346);
					match(COMMA);
					setState(347);
					assignmentExpression();
					}
					} 
				}
				setState(352);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CupParser.STRING_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExpression);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(LPAREN);
				setState(357);
				expression(0);
				setState(358);
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

	public static class ConstantContext extends ParserRuleContext {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST))) != 0)) ) {
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CupParser.COMMA, 0); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(365);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(367);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(368);
					match(COMMA);
					setState(369);
					assignmentExpression();
					}
					} 
				}
				setState(374);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(376);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(378);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(379);
					match(PIPEPIPE);
					setState(380);
					logicalAndExpression(0);
					}
					} 
				}
				setState(385);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(387);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(389);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(390);
					match(AMPAMP);
					setState(391);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(400);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(401);
					match(CARET);
					setState(402);
					andExpression(0);
					}
					} 
				}
				setState(407);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(411);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(412);
					match(PIPE);
					setState(413);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(422);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(423);
					match(AMP);
					setState(424);
					equalityExpression(0);
					}
					} 
				}
				setState(429);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(433);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(434);
						match(EQUALEQUAL);
						setState(435);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(436);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(437);
						match(EXCLAIMEQUAL);
						setState(438);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(443);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(447);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(448);
						match(LESS);
						setState(449);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(450);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(451);
						match(GREATER);
						setState(452);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(453);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(454);
						match(LESSEQUAL);
						setState(455);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(456);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(457);
						match(GREATEREQUAL);
						setState(458);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(463);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(465);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(467);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(468);
						match(LESSLESS);
						setState(469);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(470);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(471);
						match(GREATERGREATER);
						setState(472);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(477);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(479);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(481);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(482);
						match(STAR);
						setState(483);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(484);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(485);
						match(SLASH);
						setState(486);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(487);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(488);
						match(PERCENT);
						setState(489);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(496);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(498);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(499);
						match(PLUS);
						setState(500);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(501);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(502);
						match(MINUS);
						setState(503);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_castExpression);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(LPAREN);
				setState(510);
				typeSpecifier();
				setState(511);
				match(RPAREN);
				setState(512);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				constant();
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
		public TemplateDeclaration1Context templateDeclaration1() {
			return getRuleContext(TemplateDeclaration1Context.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeSpecifier);
		try {
			int _alt;
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(VOID);
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(519);
						pointer();
						}
						} 
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(BOOL);
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(526);
						pointer();
						}
						} 
					}
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				match(CHAR);
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						pointer();
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				match(INT);
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(540);
						pointer();
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				match(FLOAT);
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						pointer();
						}
						} 
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(553);
				match(DOUBLE);
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						pointer();
						}
						} 
					}
					setState(559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				match(LONG);
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(561);
						pointer();
						}
						} 
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(567);
				match(STRING);
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(568);
						pointer();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(574);
				match(STRUCT);
				setState(575);
				match(IDENTIFIER);
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(576);
						pointer();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
				setState(582);
				templateDeclaration1();
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
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CupParser.VOID, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterTypeList);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(LPAREN);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0)) {
					{
					setState(586);
					functionParameterList();
					}
				}

				setState(589);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(LPAREN);
				setState(591);
				match(VOID);
				setState(592);
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
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<DirectDeclaratorContext> directDeclarator() {
			return getRuleContexts(DirectDeclaratorContext.class);
		}
		public DirectDeclaratorContext directDeclarator(int i) {
			return getRuleContext(DirectDeclaratorContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			typeSpecifier();
			setState(596);
			directDeclarator(0);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(597);
				match(COMMA);
				setState(598);
				typeSpecifier();
				setState(599);
				directDeclarator(0);
				}
				}
				setState(605);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(607);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(609);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(610);
					blockItem();
					}
					} 
				}
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class BlockItemContext extends ParserRuleContext {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blockItem);
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				functionCall();
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
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(IDENTIFIER);
			setState(622);
			match(LPAREN);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
				{
				setState(623);
				identifierList();
				}
			}

			setState(626);
			match(RPAREN);
			setState(627);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifierList);
		int _la;
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				expression(0);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(630);
					match(COMMA);
					setState(631);
					expression(0);
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				functionReturn();
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
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
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(645);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(646);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(647);
				jumpStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CupParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CASE() { return getToken(CupParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CupParser.DEFAULT, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_labeledStatement);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(IDENTIFIER);
				setState(651);
				match(COLON);
				setState(652);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(CASE);
				setState(654);
				constantExpression();
				setState(655);
				match(COLON);
				setState(656);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(DEFAULT);
				setState(659);
				match(COLON);
				setState(660);
				statement();
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
		public TerminalNode LBRACE() { return getToken(CupParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CupParser.RBRACE, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LBRACE);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << CONTINUE) | (1L << RETURN) | (1L << BREAK) | (1L << TYPEDEF) | (1L << SIZEOF) | (1L << EXTERN) | (1L << STATIC) | (1L << IDENTIFIER) | (1L << STRING) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR) | (1L << LPAREN) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (IF - 76)) | (1L << (DO - 76)) | (1L << (WHILE - 76)) | (1L << (CASE - 76)) | (1L << (SWITCH - 76)) | (1L << (DEFAULT - 76)) | (1L << (FOR - 76)))) != 0)) {
				{
				setState(664);
				blockItemList(0);
				}
			}

			setState(667);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			conditionalExpression();
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
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
				{
				setState(671);
				expression(0);
				}
			}

			setState(674);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(CupParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CupParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CupParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CupParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CupParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CupParser.RPAREN, i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(IF);
			setState(677);
			match(LPAREN);
			setState(678);
			expression(0);
			setState(679);
			match(RPAREN);
			setState(680);
			statement();
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(681);
					match(ELSE);
					setState(682);
					match(IF);
					setState(683);
					match(LPAREN);
					setState(684);
					expression(0);
					setState(685);
					match(RPAREN);
					setState(686);
					statement();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(693);
				match(ELSE);
				setState(694);
				statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CupParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(SWITCH);
			setState(698);
			match(LPAREN);
			setState(699);
			expression(0);
			setState(700);
			match(RPAREN);
			setState(701);
			statement();
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
		public TerminalNode WHILE() { return getToken(CupParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(CupParser.DO, 0); }
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_whileStatement);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(WHILE);
				setState(704);
				match(LPAREN);
				setState(705);
				expression(0);
				setState(706);
				match(RPAREN);
				setState(707);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(DO);
				setState(710);
				statement();
				setState(711);
				match(WHILE);
				setState(712);
				match(LPAREN);
				setState(713);
				expression(0);
				setState(714);
				match(RPAREN);
				setState(715);
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
		public TerminalNode FOR() { return getToken(CupParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(FOR);
			setState(720);
			match(LPAREN);
			setState(721);
			forCondition();
			setState(722);
			match(RPAREN);
			setState(723);
			statement();
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
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CupParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CupParser.SEMICOLON, i);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forCondition);
		int _la;
		try {
			setState(745);
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
			case RESTRICT:
			case TYPEDEF:
			case EXTERN:
			case STATIC:
			case STRING:
			case STRUCT:
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				forDeclaration();
				setState(726);
				match(SEMICOLON);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
					{
					setState(727);
					forExpression(0);
					}
				}

				setState(730);
				match(SEMICOLON);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
					{
					setState(731);
					forExpression(0);
					}
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
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
					{
					setState(734);
					expression(0);
					}
				}

				setState(737);
				match(SEMICOLON);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
					{
					setState(738);
					forExpression(0);
					}
				}

				setState(741);
				match(SEMICOLON);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
					{
					setState(742);
					forExpression(0);
					}
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forDeclaration);
		int _la;
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(747);
					declarationSpecifier();
					}
					}
					setState(750); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
				setState(752);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(754);
					declarationSpecifier();
					}
					}
					setState(757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
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

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CupParser.COMMA, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(762);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(764);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(765);
					match(COMMA);
					setState(766);
					assignmentExpression();
					}
					} 
				}
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CupParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(CupParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(CupParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jumpStatement);
		int _la;
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(CONTINUE);
				setState(773);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				match(BREAK);
				setState(775);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				match(RETURN);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
					{
					setState(777);
					expression(0);
					}
				}

				setState(780);
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

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(IDENTIFIER);
			setState(784);
			match(LPAREN);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << IDENTIFIER) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0)) {
				{
				setState(785);
				argumentExpressionList(0);
				}
			}

			setState(788);
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
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declarationSpecifier);
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEF:
			case EXTERN:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				storageClassSpecifier();
				}
				break;
			case VOID:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case LONG:
			case STRING:
			case STRUCT:
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				typeSpecifier();
				}
				break;
			case CONST:
			case RESTRICT:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				typeQualifier();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(CupParser.TYPEDEF, 0); }
		public TerminalNode EXTERN() { return getToken(CupParser.EXTERN, 0); }
		public TerminalNode STATIC() { return getToken(CupParser.STATIC, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC))) != 0)) ) {
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(798);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(800);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(801);
					declaration();
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class StructDefintionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CupParser.STRUCT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CupParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CupParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(CupParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CupParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CupParser.SEMICOLON, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CupParser.COMMA, i);
		}
		public StructDefintionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefintion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CupParserVisitor ) return ((CupParserVisitor<? extends T>)visitor).visitStructDefintion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefintionContext structDefintion() throws RecognitionException {
		StructDefintionContext _localctx = new StructDefintionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_structDefintion);
		int _la;
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(STRUCT);
				setState(808);
				match(IDENTIFIER);
				setState(809);
				match(LBRACE);
				setState(811); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(810);
					declaration();
					}
					}
					setState(813); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
				setState(815);
				match(RBRACE);
				setState(816);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(STRUCT);
				setState(819);
				match(IDENTIFIER);
				setState(820);
				match(LBRACE);
				setState(822); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(821);
					declaration();
					}
					}
					setState(824); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << RESTRICT) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
				setState(826);
				match(RBRACE);
				setState(827);
				match(IDENTIFIER);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(828);
					match(COMMA);
					setState(829);
					match(IDENTIFIER);
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(835);
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
		case 1:
			return text_sempred((TextContext)_localctx, predIndex);
		case 9:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 13:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 15:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 18:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 24:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 25:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 28:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 29:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 30:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 31:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 32:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 33:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 34:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 35:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 36:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 37:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 38:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 43:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 58:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 63:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean text_sempred(TextContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 3);
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u034a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\5\2\u0086\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u009c\n\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6\u00a4\n\6\r\6\16\6\u00a5"+
		"\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\5\t\u00b9\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c3\n"+
		"\13\f\13\16\13\u00c6\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\5\r\u00d0"+
		"\n\r\3\r\3\r\3\16\3\16\5\16\u00d6\n\16\3\16\3\16\5\16\u00da\n\16\3\16"+
		"\5\16\u00dd\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00e4\n\17\f\17\16\17\u00e7"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f1\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00f8\n\21\f\21\16\21\u00fb\13\21\3\22\3\22\3"+
		"\22\5\22\u0100\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0107\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u010f\n\24\f\24\16\24\u0112\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u011b\n\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0125\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0138\n\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0142\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0154\n\32\f\32"+
		"\16\32\u0157\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u015f\n\33\f\33"+
		"\16\33\u0162\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016b\n\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0175\n\36\f\36\16\36\u0178"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0180\n\37\f\37\16\37\u0183"+
		"\13\37\3 \3 \3 \3 \3 \3 \7 \u018b\n \f \16 \u018e\13 \3!\3!\3!\3!\3!\3"+
		"!\7!\u0196\n!\f!\16!\u0199\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01a1\n\"\f"+
		"\"\16\"\u01a4\13\"\3#\3#\3#\3#\3#\3#\7#\u01ac\n#\f#\16#\u01af\13#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\7$\u01ba\n$\f$\16$\u01bd\13$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01ce\n%\f%\16%\u01d1\13%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\7&\u01dc\n&\f&\16&\u01df\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u01ed\n\'\f\'\16\'\u01f0\13\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\7(\u01fb\n(\f(\16(\u01fe\13(\3)\3)\3)\3)\3)\3)\3)\5)\u0207"+
		"\n)\3*\3*\7*\u020b\n*\f*\16*\u020e\13*\3*\3*\7*\u0212\n*\f*\16*\u0215"+
		"\13*\3*\3*\7*\u0219\n*\f*\16*\u021c\13*\3*\3*\7*\u0220\n*\f*\16*\u0223"+
		"\13*\3*\3*\7*\u0227\n*\f*\16*\u022a\13*\3*\3*\7*\u022e\n*\f*\16*\u0231"+
		"\13*\3*\3*\7*\u0235\n*\f*\16*\u0238\13*\3*\3*\7*\u023c\n*\f*\16*\u023f"+
		"\13*\3*\3*\3*\7*\u0244\n*\f*\16*\u0247\13*\3*\5*\u024a\n*\3+\3+\5+\u024e"+
		"\n+\3+\3+\3+\3+\5+\u0254\n+\3,\3,\3,\3,\3,\3,\7,\u025c\n,\f,\16,\u025f"+
		"\13,\3-\3-\3-\3-\3-\7-\u0266\n-\f-\16-\u0269\13-\3.\3.\3.\5.\u026e\n."+
		"\3/\3/\3/\5/\u0273\n/\3/\3/\3/\3\60\3\60\3\60\7\60\u027b\n\60\f\60\16"+
		"\60\u027e\13\60\3\60\5\60\u0281\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u028b\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0298\n\62\3\63\3\63\5\63\u029c\n\63\3\63\3\63\3\64\3\64\3"+
		"\65\5\65\u02a3\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u02b3\n\66\f\66\16\66\u02b6\13\66\3\66\3\66"+
		"\5\66\u02ba\n\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\58\u02d0\n8\39\39\39\39\39\39\3:\3:\3:\5:\u02db\n"+
		":\3:\3:\5:\u02df\n:\3:\5:\u02e2\n:\3:\3:\5:\u02e6\n:\3:\3:\5:\u02ea\n"+
		":\5:\u02ec\n:\3;\6;\u02ef\n;\r;\16;\u02f0\3;\3;\3;\6;\u02f6\n;\r;\16;"+
		"\u02f7\5;\u02fa\n;\3<\3<\3<\3<\3<\3<\7<\u0302\n<\f<\16<\u0305\13<\3=\3"+
		"=\3=\3=\3=\3=\5=\u030d\n=\3=\5=\u0310\n=\3>\3>\3>\5>\u0315\n>\3>\3>\3"+
		"?\3?\3?\5?\u031c\n?\3@\3@\3A\3A\3A\3A\3A\7A\u0325\nA\fA\16A\u0328\13A"+
		"\3B\3B\3B\3B\6B\u032e\nB\rB\16B\u032f\3B\3B\3B\3B\3B\3B\3B\6B\u0339\n"+
		"B\rB\16B\u033a\3B\3B\3B\3B\7B\u0341\nB\fB\16B\u0344\13B\3B\3B\5B\u0348"+
		"\nB\3B\2\27\4\24\34 &\62\64:<>@BDFHJLNXv\u0080C\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\2\b\3\2\34 \3\2\n\13\5\2?CEEIM\5\2-/\64\64\678\3\2\26"+
		"\32\4\2\17\17\21\22\2\u0385\2\u0085\3\2\2\2\4\u0089\3\2\2\2\6\u009b\3"+
		"\2\2\2\b\u009d\3\2\2\2\n\u00ab\3\2\2\2\f\u00ad\3\2\2\2\16\u00b1\3\2\2"+
		"\2\20\u00b8\3\2\2\2\22\u00ba\3\2\2\2\24\u00bc\3\2\2\2\26\u00cc\3\2\2\2"+
		"\30\u00cf\3\2\2\2\32\u00dc\3\2\2\2\34\u00de\3\2\2\2\36\u00e8\3\2\2\2 "+
		"\u00f0\3\2\2\2\"\u00ff\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u011a\3"+
		"\2\2\2*\u011c\3\2\2\2,\u011e\3\2\2\2.\u0137\3\2\2\2\60\u0139\3\2\2\2\62"+
		"\u013b\3\2\2\2\64\u0158\3\2\2\2\66\u016a\3\2\2\28\u016c\3\2\2\2:\u016e"+
		"\3\2\2\2<\u0179\3\2\2\2>\u0184\3\2\2\2@\u018f\3\2\2\2B\u019a\3\2\2\2D"+
		"\u01a5\3\2\2\2F\u01b0\3\2\2\2H\u01be\3\2\2\2J\u01d2\3\2\2\2L\u01e0\3\2"+
		"\2\2N\u01f1\3\2\2\2P\u0206\3\2\2\2R\u0249\3\2\2\2T\u0253\3\2\2\2V\u0255"+
		"\3\2\2\2X\u0260\3\2\2\2Z\u026d\3\2\2\2\\\u026f\3\2\2\2^\u0280\3\2\2\2"+
		"`\u028a\3\2\2\2b\u0297\3\2\2\2d\u0299\3\2\2\2f\u029f\3\2\2\2h\u02a2\3"+
		"\2\2\2j\u02a6\3\2\2\2l\u02bb\3\2\2\2n\u02cf\3\2\2\2p\u02d1\3\2\2\2r\u02eb"+
		"\3\2\2\2t\u02f9\3\2\2\2v\u02fb\3\2\2\2x\u030f\3\2\2\2z\u0311\3\2\2\2|"+
		"\u031b\3\2\2\2~\u031d\3\2\2\2\u0080\u031f\3\2\2\2\u0082\u0347\3\2\2\2"+
		"\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008a\b\3\1\2\u008a"+
		"\u008b\5\6\4\2\u008b\u0090\3\2\2\2\u008c\u008d\f\3\2\2\u008d\u008f\5\6"+
		"\4\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\5\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u009c\5\b\5\2"+
		"\u0094\u009c\5\n\6\2\u0095\u009c\5\u0082B\2\u0096\u0097\5\30\r\2\u0097"+
		"\u0098\7E\2\2\u0098\u0099\5$\23\2\u0099\u009a\7%\2\2\u009a\u009c\3\2\2"+
		"\2\u009b\u0093\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096"+
		"\3\2\2\2\u009c\7\3\2\2\2\u009d\u009e\5R*\2\u009e\u009f\7\24\2\2\u009f"+
		"\u00a0\5T+\2\u00a0\u00a1\5d\63\2\u00a1\t\3\2\2\2\u00a2\u00a4\5|?\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7%\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\5\f\7\2\u00ab\u00a3\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\5\24\13\2\u00af"+
		"\u00b0\7%\2\2\u00b0\r\3\2\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\7\"\2\2"+
		"\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7#\2\2\u00b5\17\3\2\2\2\u00b6\u00b9"+
		"\5R*\2\u00b7\u00b9\5\16\b\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\21\3\2\2\2\u00ba\u00bb\t\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bd\b\13\1\2"+
		"\u00bd\u00be\5\26\f\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\f\3\2\2\u00c0\u00c1"+
		"\7&\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00cd\5\30\r\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7E\2\2\u00ca"+
		"\u00cb\5$\23\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2"+
		"\2\2\u00cd\27\3\2\2\2\u00ce\u00d0\5\32\16\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5 \21\2\u00d2\31\3\2\2"+
		"\2\u00d3\u00d5\7/\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00dd\3\2\2\2\u00d7\u00d9\7/\2\2\u00d8\u00da\5\34"+
		"\17\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\5\32\16\2\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\33\3\2"+
		"\2\2\u00de\u00df\b\17\1\2\u00df\u00e0\5\36\20\2\u00e0\u00e5\3\2\2\2\u00e1"+
		"\u00e2\f\3\2\2\u00e2\u00e4\5\36\20\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\35\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\b\21\1"+
		"\2\u00eb\u00f1\7\24\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\5\30\r\2\u00ee"+
		"\u00ef\7#\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec\3\2"+
		"\2\2\u00f1\u00f9\3\2\2\2\u00f2\u00f3\f\3\2\2\u00f3\u00f4\7\'\2\2\u00f4"+
		"\u00f5\5\"\22\2\u00f5\u00f6\7(\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f2\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"!\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0100\7\30\2\2\u00fd\u0100\7\24\2"+
		"\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100#\3\2\2\2\u0101\u0107\5(\25\2\u0102\u0103\7)\2\2\u0103\u0104"+
		"\5&\24\2\u0104\u0105\7*\2\2\u0105\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0107%\3\2\2\2\u0108\u0109\b\24\1\2\u0109\u010a\5$\23\2"+
		"\u010a\u0110\3\2\2\2\u010b\u010c\f\3\2\2\u010c\u010d\7&\2\2\u010d\u010f"+
		"\5$\23\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\'\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u011b\5,\27\2"+
		"\u0114\u0115\5.\30\2\u0115\u0116\5*\26\2\u0116\u0117\5(\25\2\u0117\u011b"+
		"\3\2\2\2\u0118\u011b\58\35\2\u0119\u011b\5z>\2\u011a\u0113\3\2\2\2\u011a"+
		"\u0114\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b)\3\2\2\2"+
		"\u011c\u011d\t\4\2\2\u011d+\3\2\2\2\u011e\u0124\5<\37\2\u011f\u0120\7"+
		"!\2\2\u0120\u0121\5\64\33\2\u0121\u0122\7$\2\2\u0122\u0123\5,\27\2\u0123"+
		"\u0125\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0125\3\2\2\2\u0125-\3\2\2\2"+
		"\u0126\u0138\5\62\32\2\u0127\u0128\79\2\2\u0128\u0138\5.\30\2\u0129\u012a"+
		"\7:\2\2\u012a\u0138\5.\30\2\u012b\u012c\5\60\31\2\u012c\u012d\5P)\2\u012d"+
		"\u0138\3\2\2\2\u012e\u012f\7\20\2\2\u012f\u0138\5.\30\2\u0130\u0131\7"+
		"\20\2\2\u0131\u0132\7\"\2\2\u0132\u0133\5R*\2\u0133\u0134\7#\2\2\u0134"+
		"\u0138\3\2\2\2\u0135\u0136\7=\2\2\u0136\u0138\7\24\2\2\u0137\u0126\3\2"+
		"\2\2\u0137\u0127\3\2\2\2\u0137\u0129\3\2\2\2\u0137\u012b\3\2\2\2\u0137"+
		"\u012e\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0135\3\2\2\2\u0138/\3\2\2\2"+
		"\u0139\u013a\t\5\2\2\u013a\61\3\2\2\2\u013b\u013c\b\32\1\2\u013c\u013d"+
		"\5\66\34\2\u013d\u0155\3\2\2\2\u013e\u013f\f\b\2\2\u013f\u0141\7\"\2\2"+
		"\u0140\u0142\5:\36\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0154\7#\2\2\u0144\u0145\f\7\2\2\u0145\u0146\7\'\2\2\u0146"+
		"\u0147\5\64\33\2\u0147\u0148\7(\2\2\u0148\u0154\3\2\2\2\u0149\u014a\f"+
		"\6\2\2\u014a\u014b\7+\2\2\u014b\u0154\7\24\2\2\u014c\u014d\f\5\2\2\u014d"+
		"\u014e\7,\2\2\u014e\u0154\7\24\2\2\u014f\u0150\f\4\2\2\u0150\u0154\79"+
		"\2\2\u0151\u0152\f\3\2\2\u0152\u0154\7:\2\2\u0153\u013e\3\2\2\2\u0153"+
		"\u0144\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014f\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\63\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\b\33\1"+
		"\2\u0159\u015a\5(\25\2\u015a\u0160\3\2\2\2\u015b\u015c\f\3\2\2\u015c\u015d"+
		"\7&\2\2\u015d\u015f\5(\25\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\65\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0163\u016b\7\24\2\2\u0164\u016b\58\35\2\u0165\u016b\7\27\2\2\u0166"+
		"\u0167\7\"\2\2\u0167\u0168\5\64\33\2\u0168\u0169\7#\2\2\u0169\u016b\3"+
		"\2\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0165\3\2\2\2\u016a"+
		"\u0166\3\2\2\2\u016b\67\3\2\2\2\u016c\u016d\t\6\2\2\u016d9\3\2\2\2\u016e"+
		"\u016f\b\36\1\2\u016f\u0170\5(\25\2\u0170\u0176\3\2\2\2\u0171\u0172\f"+
		"\3\2\2\u0172\u0173\7&\2\2\u0173\u0175\5(\25\2\u0174\u0171\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177;\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0179\u017a\b\37\1\2\u017a\u017b\5> \2\u017b\u0181"+
		"\3\2\2\2\u017c\u017d\f\3\2\2\u017d\u017e\7>\2\2\u017e\u0180\5> \2\u017f"+
		"\u017c\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182=\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\b \1\2\u0185\u0186"+
		"\5B\"\2\u0186\u018c\3\2\2\2\u0187\u0188\f\3\2\2\u0188\u0189\7=\2\2\u0189"+
		"\u018b\5B\"\2\u018a\u0187\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d?\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190"+
		"\b!\1\2\u0190\u0191\5D#\2\u0191\u0197\3\2\2\2\u0192\u0193\f\3\2\2\u0193"+
		"\u0194\7\66\2\2\u0194\u0196\5D#\2\u0195\u0192\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198A\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019b\b\"\1\2\u019b\u019c\5@!\2\u019c\u01a2\3\2\2\2\u019d"+
		"\u019e\f\3\2\2\u019e\u019f\7\65\2\2\u019f\u01a1\5@!\2\u01a0\u019d\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"C\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\b#\1\2\u01a6\u01a7\5F$\2\u01a7"+
		"\u01ad\3\2\2\2\u01a8\u01a9\f\3\2\2\u01a9\u01aa\7\64\2\2\u01aa\u01ac\5"+
		"F$\2\u01ab\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01aeE\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\b$\1\2\u01b1"+
		"\u01b2\5H%\2\u01b2\u01bb\3\2\2\2\u01b3\u01b4\f\4\2\2\u01b4\u01b5\7D\2"+
		"\2\u01b5\u01ba\5H%\2\u01b6\u01b7\f\3\2\2\u01b7\u01b8\7F\2\2\u01b8\u01ba"+
		"\5H%\2\u01b9\u01b3\3\2\2\2\u01b9\u01b6\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcG\3\2\2\2\u01bd\u01bb\3\2\2\2"+
		"\u01be\u01bf\b%\1\2\u01bf\u01c0\5J&\2\u01c0\u01cf\3\2\2\2\u01c1\u01c2"+
		"\f\6\2\2\u01c2\u01c3\7\62\2\2\u01c3\u01ce\5J&\2\u01c4\u01c5\f\5\2\2\u01c5"+
		"\u01c6\7\63\2\2\u01c6\u01ce\5J&\2\u01c7\u01c8\f\4\2\2\u01c8\u01c9\7G\2"+
		"\2\u01c9\u01ce\5J&\2\u01ca\u01cb\f\3\2\2\u01cb\u01cc\7H\2\2\u01cc\u01ce"+
		"\5J&\2\u01cd\u01c1\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd"+
		"\u01ca\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0I\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\b&\1\2\u01d3\u01d4"+
		"\5N(\2\u01d4\u01dd\3\2\2\2\u01d5\u01d6\f\4\2\2\u01d6\u01d7\7;\2\2\u01d7"+
		"\u01dc\5N(\2\u01d8\u01d9\f\3\2\2\u01d9\u01da\7<\2\2\u01da\u01dc\5N(\2"+
		"\u01db\u01d5\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01deK\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e1\b\'\1\2\u01e1\u01e2\5P)\2\u01e2\u01ee\3\2\2\2\u01e3\u01e4\f\5\2"+
		"\2\u01e4\u01e5\7/\2\2\u01e5\u01ed\5P)\2\u01e6\u01e7\f\4\2\2\u01e7\u01e8"+
		"\7\60\2\2\u01e8\u01ed\5P)\2\u01e9\u01ea\f\3\2\2\u01ea\u01eb\7\61\2\2\u01eb"+
		"\u01ed\5P)\2\u01ec\u01e3\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01e9\3\2\2"+
		"\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efM"+
		"\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\b(\1\2\u01f2\u01f3\5L\'\2\u01f3"+
		"\u01fc\3\2\2\2\u01f4\u01f5\f\4\2\2\u01f5\u01f6\7-\2\2\u01f6\u01fb\5L\'"+
		"\2\u01f7\u01f8\f\3\2\2\u01f8\u01f9\7.\2\2\u01f9\u01fb\5L\'\2\u01fa\u01f4"+
		"\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fdO\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\"\2\2"+
		"\u0200\u0201\5R*\2\u0201\u0202\7#\2\2\u0202\u0203\5P)\2\u0203\u0207\3"+
		"\2\2\2\u0204\u0207\5.\30\2\u0205\u0207\58\35\2\u0206\u01ff\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207Q\3\2\2\2\u0208\u020c\7\3\2\2"+
		"\u0209\u020b\5\32\16\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u024a\3\2\2\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0213\7\b\2\2\u0210\u0212\5\32\16\2\u0211\u0210\3\2\2\2\u0212\u0215\3"+
		"\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u024a\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\u021a\7\7\2\2\u0217\u0219\5\32\16\2\u0218\u0217\3"+
		"\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u024a\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0221\7\4\2\2\u021e\u0220\5\32"+
		"\16\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u024a\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0228\7\5"+
		"\2\2\u0225\u0227\5\32\16\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u024a\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022b\u022f\7\6\2\2\u022c\u022e\5\32\16\2\u022d\u022c\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u024a\3\2"+
		"\2\2\u0231\u022f\3\2\2\2\u0232\u0236\7\t\2\2\u0233\u0235\5\32\16\2\u0234"+
		"\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u024a\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023d\7\25\2\2\u023a"+
		"\u023c\5\32\16\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u024a\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0241\7\33\2\2\u0241\u0245\7\24\2\2\u0242\u0244\5\32\16\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u024a\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\5\16\b\2\u0249\u0208\3"+
		"\2\2\2\u0249\u020f\3\2\2\2\u0249\u0216\3\2\2\2\u0249\u021d\3\2\2\2\u0249"+
		"\u0224\3\2\2\2\u0249\u022b\3\2\2\2\u0249\u0232\3\2\2\2\u0249\u0239\3\2"+
		"\2\2\u0249\u0240\3\2\2\2\u0249\u0248\3\2\2\2\u024aS\3\2\2\2\u024b\u024d"+
		"\7\"\2\2\u024c\u024e\5V,\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0254\7#\2\2\u0250\u0251\7\"\2\2\u0251\u0252\7\3"+
		"\2\2\u0252\u0254\7#\2\2\u0253\u024b\3\2\2\2\u0253\u0250\3\2\2\2\u0254"+
		"U\3\2\2\2\u0255\u0256\5R*\2\u0256\u025d\5 \21\2\u0257\u0258\7&\2\2\u0258"+
		"\u0259\5R*\2\u0259\u025a\5 \21\2\u025a\u025c\3\2\2\2\u025b\u0257\3\2\2"+
		"\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025eW"+
		"\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\b-\1\2\u0261\u0262\5Z.\2\u0262"+
		"\u0267\3\2\2\2\u0263\u0264\f\3\2\2\u0264\u0266\5Z.\2\u0265\u0263\3\2\2"+
		"\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268Y"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026e\5`\61\2\u026b\u026e\5\n\6\2\u026c"+
		"\u026e\5\\/\2\u026d\u026a\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2"+
		"\2\2\u026e[\3\2\2\2\u026f\u0270\7\24\2\2\u0270\u0272\7\"\2\2\u0271\u0273"+
		"\5^\60\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\7#\2\2\u0275\u0276\7%\2\2\u0276]\3\2\2\2\u0277\u027c\5\64\33\2"+
		"\u0278\u0279\7&\2\2\u0279\u027b\5\64\33\2\u027a\u0278\3\2\2\2\u027b\u027e"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027f\u0281\5z>\2\u0280\u0277\3\2\2\2\u0280\u027f\3\2\2"+
		"\2\u0281_\3\2\2\2\u0282\u028b\5b\62\2\u0283\u028b\5d\63\2\u0284\u028b"+
		"\5h\65\2\u0285\u028b\5n8\2\u0286\u028b\5p9\2\u0287\u028b\5j\66\2\u0288"+
		"\u028b\5l\67\2\u0289\u028b\5x=\2\u028a\u0282\3\2\2\2\u028a\u0283\3\2\2"+
		"\2\u028a\u0284\3\2\2\2\u028a\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028ba\3\2\2\2\u028c"+
		"\u028d\7\24\2\2\u028d\u028e\7$\2\2\u028e\u0298\5`\61\2\u028f\u0290\7R"+
		"\2\2\u0290\u0291\5f\64\2\u0291\u0292\7$\2\2\u0292\u0293\5`\61\2\u0293"+
		"\u0298\3\2\2\2\u0294\u0295\7T\2\2\u0295\u0296\7$\2\2\u0296\u0298\5`\61"+
		"\2\u0297\u028c\3\2\2\2\u0297\u028f\3\2\2\2\u0297\u0294\3\2\2\2\u0298c"+
		"\3\2\2\2\u0299\u029b\7)\2\2\u029a\u029c\5X-\2\u029b\u029a\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7*\2\2\u029ee\3\2\2\2\u029f"+
		"\u02a0\5,\27\2\u02a0g\3\2\2\2\u02a1\u02a3\5\64\33\2\u02a2\u02a1\3\2\2"+
		"\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7%\2\2\u02a5i\3"+
		"\2\2\2\u02a6\u02a7\7N\2\2\u02a7\u02a8\7\"\2\2\u02a8\u02a9\5\64\33\2\u02a9"+
		"\u02aa\7#\2\2\u02aa\u02b4\5`\61\2\u02ab\u02ac\7O\2\2\u02ac\u02ad\7N\2"+
		"\2\u02ad\u02ae\7\"\2\2\u02ae\u02af\5\64\33\2\u02af\u02b0\7#\2\2\u02b0"+
		"\u02b1\5`\61\2\u02b1\u02b3\3\2\2\2\u02b2\u02ab\3\2\2\2\u02b3\u02b6\3\2"+
		"\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b9\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b7\u02b8\7O\2\2\u02b8\u02ba\5`\61\2\u02b9\u02b7\3\2"+
		"\2\2\u02b9\u02ba\3\2\2\2\u02bak\3\2\2\2\u02bb\u02bc\7S\2\2\u02bc\u02bd"+
		"\7\"\2\2\u02bd\u02be\5\64\33\2\u02be\u02bf\7#\2\2\u02bf\u02c0\5`\61\2"+
		"\u02c0m\3\2\2\2\u02c1\u02c2\7Q\2\2\u02c2\u02c3\7\"\2\2\u02c3\u02c4\5\64"+
		"\33\2\u02c4\u02c5\7#\2\2\u02c5\u02c6\5`\61\2\u02c6\u02d0\3\2\2\2\u02c7"+
		"\u02c8\7P\2\2\u02c8\u02c9\5`\61\2\u02c9\u02ca\7Q\2\2\u02ca\u02cb\7\"\2"+
		"\2\u02cb\u02cc\5\64\33\2\u02cc\u02cd\7#\2\2\u02cd\u02ce\7%\2\2\u02ce\u02d0"+
		"\3\2\2\2\u02cf\u02c1\3\2\2\2\u02cf\u02c7\3\2\2\2\u02d0o\3\2\2\2\u02d1"+
		"\u02d2\7U\2\2\u02d2\u02d3\7\"\2\2\u02d3\u02d4\5r:\2\u02d4\u02d5\7#\2\2"+
		"\u02d5\u02d6\5`\61\2\u02d6q\3\2\2\2\u02d7\u02d8\5t;\2\u02d8\u02da\7%\2"+
		"\2\u02d9\u02db\5v<\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02de\7%\2\2\u02dd\u02df\5v<\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02ec\3\2\2\2\u02e0\u02e2\5\64\33\2\u02e1\u02e0\3"+
		"\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\7%\2\2\u02e4"+
		"\u02e6\5v<\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2"+
		"\2\u02e7\u02e9\7%\2\2\u02e8\u02ea\5v<\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02d7\3\2\2\2\u02eb\u02e1\3\2\2\2\u02ec"+
		"s\3\2\2\2\u02ed\u02ef\5|?\2\u02ee\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\5\24"+
		"\13\2\u02f3\u02fa\3\2\2\2\u02f4\u02f6\5|?\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2"+
		"\2\2\u02f9\u02ee\3\2\2\2\u02f9\u02f5\3\2\2\2\u02fau\3\2\2\2\u02fb\u02fc"+
		"\b<\1\2\u02fc\u02fd\5(\25\2\u02fd\u0303\3\2\2\2\u02fe\u02ff\f\3\2\2\u02ff"+
		"\u0300\7&\2\2\u0300\u0302\5(\25\2\u0301\u02fe\3\2\2\2\u0302\u0305\3\2"+
		"\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304w\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0306\u0307\7\f\2\2\u0307\u0310\7%\2\2\u0308\u0309\7\16\2\2\u0309"+
		"\u0310\7%\2\2\u030a\u030c\7\r\2\2\u030b\u030d\5\64\33\2\u030c\u030b\3"+
		"\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\7%\2\2\u030f"+
		"\u0306\3\2\2\2\u030f\u0308\3\2\2\2\u030f\u030a\3\2\2\2\u0310y\3\2\2\2"+
		"\u0311\u0312\7\24\2\2\u0312\u0314\7\"\2\2\u0313\u0315\5:\36\2\u0314\u0313"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7#\2\2\u0317"+
		"{\3\2\2\2\u0318\u031c\5~@\2\u0319\u031c\5R*\2\u031a\u031c\5\36\20\2\u031b"+
		"\u0318\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c}\3\2\2\2"+
		"\u031d\u031e\t\7\2\2\u031e\177\3\2\2\2\u031f\u0320\bA\1\2\u0320\u0321"+
		"\5\n\6\2\u0321\u0326\3\2\2\2\u0322\u0323\f\3\2\2\u0323\u0325\5\n\6\2\u0324"+
		"\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u0081\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7\33\2\2\u032a"+
		"\u032b\7\24\2\2\u032b\u032d\7)\2\2\u032c\u032e\5\n\6\2\u032d\u032c\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0332\7*\2\2\u0332\u0333\7%\2\2\u0333\u0348\3\2\2"+
		"\2\u0334\u0335\7\33\2\2\u0335\u0336\7\24\2\2\u0336\u0338\7)\2\2\u0337"+
		"\u0339\5\n\6\2\u0338\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7*\2\2\u033d"+
		"\u0342\7\24\2\2\u033e\u033f\7&\2\2\u033f\u0341\7\24\2\2\u0340\u033e\3"+
		"\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346\7%\2\2\u0346\u0348\3\2"+
		"\2\2\u0347\u0329\3\2\2\2\u0347\u0334\3\2\2\2\u0348\u0083\3\2\2\2Y\u0085"+
		"\u0090\u009b\u00a5\u00ab\u00b8\u00c4\u00cc\u00cf\u00d5\u00d9\u00dc\u00e5"+
		"\u00f0\u00f9\u00ff\u0106\u0110\u011a\u0124\u0137\u0141\u0153\u0155\u0160"+
		"\u016a\u0176\u0181\u018c\u0197\u01a2\u01ad\u01b9\u01bb\u01cd\u01cf\u01db"+
		"\u01dd\u01ec\u01ee\u01fa\u01fc\u0206\u020c\u0213\u021a\u0221\u0228\u022f"+
		"\u0236\u023d\u0245\u0249\u024d\u0253\u025d\u0267\u026d\u0272\u027c\u0280"+
		"\u028a\u0297\u029b\u02a2\u02b4\u02b9\u02cf\u02da\u02de\u02e1\u02e5\u02e9"+
		"\u02eb\u02f0\u02f7\u02f9\u0303\u030c\u030f\u0314\u031b\u0326\u032f\u033a"+
		"\u0342\u0347";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}