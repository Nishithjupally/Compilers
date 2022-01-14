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
		public AST.program value;
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << IDENTIFIER) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0)) {
				{
				setState(120);
				((ProgramContext)_localctx).t = text();
				}
			}

			setState(123);
			match(EOF);

			        ((ProgramContext)_localctx).value =  new AST.program(((ProgramContext)_localctx).t.value, ((ProgramContext)_localctx).t.value.get(0).lineNo,filename);
			    
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
		public ArrayList<AST.functionOrDeclaration> value;
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

				((TextContext)_localctx).value =  new ArrayList<AST.functionOrDeclaration>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				((TextContext)_localctx).f = functionOrDeclaration();
				_localctx.value.add(((TextContext)_localctx).f.value);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << IDENTIFIER) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
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
		public AST.functionOrDeclaration value;
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((FunctionOrDeclarationContext)_localctx).fd = functionDefinition();

				        ((FunctionOrDeclarationContext)_localctx).value =  ((FunctionOrDeclarationContext)_localctx).fd.value;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((FunctionOrDeclarationContext)_localctx).dec = declaration();

				        ((FunctionOrDeclarationContext)_localctx).value =  ((FunctionOrDeclarationContext)_localctx).dec.value;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((FunctionOrDeclarationContext)_localctx).sd = structDefinition();

				        ((FunctionOrDeclarationContext)_localctx).value =  ((FunctionOrDeclarationContext)_localctx).sd.value;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((FunctionOrDeclarationContext)_localctx).gdec = globalDeclaration();
				  
				        ((FunctionOrDeclarationContext)_localctx).value =  ((FunctionOrDeclarationContext)_localctx).gdec.value;
				    
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
		public AST.globalDeclaration value;
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
			setState(147);
			((GlobalDeclarationContext)_localctx).dec = declarator(0);
			setState(148);
			((GlobalDeclarationContext)_localctx).eq = match(EQUAL);
			setState(149);
			((GlobalDeclarationContext)_localctx).in = initializer();
			setState(150);
			match(SEMICOLON);

			        ((GlobalDeclarationContext)_localctx).value =  new AST.globalDeclaration(filename,((GlobalDeclarationContext)_localctx).dec.value ,((GlobalDeclarationContext)_localctx).in.value, ((GlobalDeclarationContext)_localctx).eq.getLine());
			    
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
		public AST.functionDefinition value;
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
			setState(153);
			((FunctionDefinitionContext)_localctx).t = typeSpecifier();
			setState(154);
			((FunctionDefinitionContext)_localctx).fname = match(IDENTIFIER);
			setState(155);
			((FunctionDefinitionContext)_localctx).pl = parameterTypeList();
			setState(156);
			((FunctionDefinitionContext)_localctx).cs = compoundStatement();

			        ((FunctionDefinitionContext)_localctx).value =  new AST.functionDefinition(filename, ((FunctionDefinitionContext)_localctx).fname.getText(), ((FunctionDefinitionContext)_localctx).pl.value, ((FunctionDefinitionContext)_localctx).t.value, ((FunctionDefinitionContext)_localctx).cs.value, ((FunctionDefinitionContext)_localctx).fname.getLine() )  ;     
			    
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
		public AST.declaration value;
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((DeclarationContext)_localctx).sd = simpleDeclaration();

				        ((DeclarationContext)_localctx).value =  ((DeclarationContext)_localctx).sd.value;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((DeclarationContext)_localctx).td = templateDeclaration();

				        ((DeclarationContext)_localctx).value =  ((DeclarationContext)_localctx).td.value;
				    
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
		public AST.simpleDeclaration value;
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
			setState(167);
			((SimpleDeclarationContext)_localctx).d = declarationSpecifier();
			setState(168);
			((SimpleDeclarationContext)_localctx).in = initDeclaratorList();
			setState(169);
			((SimpleDeclarationContext)_localctx).sc = match(SEMICOLON);

			        ((SimpleDeclarationContext)_localctx).value =  new AST.simpleDeclaration(((SimpleDeclarationContext)_localctx).d.value, ((SimpleDeclarationContext)_localctx).in.value,((SimpleDeclarationContext)_localctx).sc.getLine() );
			    
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
		public AST.templateDeclaration value;
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
			setState(172);
			((TemplateDeclarationContext)_localctx).d = dsDec();
			setState(173);
			((TemplateDeclarationContext)_localctx).in = initDeclaratorList();
			setState(174);
			((TemplateDeclarationContext)_localctx).sc = match(SEMICOLON);

			        ((TemplateDeclarationContext)_localctx).value =  new AST.templateDeclaration(((TemplateDeclarationContext)_localctx).d.value, ((TemplateDeclarationContext)_localctx).in.value, ((TemplateDeclarationContext)_localctx).sc.getLine());
			    
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
		public AST.dsDec value;
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
			setState(177);
			((DsDecContext)_localctx).ds = dataStructureName();
			setState(178);
			match(LPAREN);
			setState(179);
			((DsDecContext)_localctx).da = dsArgs();
			setState(180);
			match(RPAREN);

			        ((DsDecContext)_localctx).value =  new AST.dsDec(((DsDecContext)_localctx).ds.value, ((DsDecContext)_localctx).da.value);
			    
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
		public String value;
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
			setState(183);
			((DsArgsContext)_localctx).ts = typeSpecifier();
			((DsArgsContext)_localctx).value =  ((DsArgsContext)_localctx).ts.value;
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
		public String value;
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((DataStructureNameContext)_localctx).s = match(STACK);
				((DataStructureNameContext)_localctx).value =  ((DataStructureNameContext)_localctx).s.getText();
				}
				break;
			case QUEUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((DataStructureNameContext)_localctx).q = match(QUEUE);
				((DataStructureNameContext)_localctx).value =  ((DataStructureNameContext)_localctx).q.getText();
				}
				break;
			case UNQ_PTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				((DataStructureNameContext)_localctx).up = match(UNQ_PTR);
				((DataStructureNameContext)_localctx).value =  ((DataStructureNameContext)_localctx).up.getText();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				((DataStructureNameContext)_localctx).v = match(VECTOR);
				((DataStructureNameContext)_localctx).value =  ((DataStructureNameContext)_localctx).v.getText();
				}
				break;
			case SHARED_PTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				((DataStructureNameContext)_localctx).sp = match(SHARED_PTR);
				((DataStructureNameContext)_localctx).value =  ((DataStructureNameContext)_localctx).sp.getText();
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
		public ArrayList<AST.initDeclarator> value;
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

		        ((InitDeclaratorListContext)_localctx).value =  new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((InitDeclaratorListContext)_localctx).i1 = initDeclarator();
			_localctx.value.add(((InitDeclaratorListContext)_localctx).i1.value);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				((InitDeclaratorListContext)_localctx).i2 = initDeclarator();
				_localctx.value.add(((InitDeclaratorListContext)_localctx).i2.value);
				}
				}
				setState(208);
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
		public AST.initDeclarator value;
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((InitDeclaratorContext)_localctx).d = declarator(0);

				        ((InitDeclaratorContext)_localctx).value =  new AST.initDeclarator(((InitDeclaratorContext)_localctx).d.value);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((InitDeclaratorContext)_localctx).d = declarator(0);
				setState(213);
				match(EQUAL);
				setState(214);
				((InitDeclaratorContext)_localctx).in = initializer();

				        ((InitDeclaratorContext)_localctx).value =  new AST.initDeclarator(((InitDeclaratorContext)_localctx).d.value,((InitDeclaratorContext)_localctx).in.value);
				    
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
		public String value;
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(STAR);
				((PointerContext)_localctx).value =  "*";
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(221);
					((PointerContext)_localctx).t = typeQualifier();
					_localctx.value+=(((PointerContext)_localctx).t.value);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(STAR);
				((PointerContext)_localctx).value =  "*";
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(228);
					((PointerContext)_localctx).t = typeQualifier();
					_localctx.value+=(((PointerContext)_localctx).t.value);
					}
				}

				{
				setState(233);
				((PointerContext)_localctx).p = pointer();
				_localctx.value+=((PointerContext)_localctx).p.value;
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
		public String value;
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
			setState(238);
			((TypeQualifierContext)_localctx).cns = match(CONST);
			((TypeQualifierContext)_localctx).value =  ((TypeQualifierContext)_localctx).cns.getText();
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
		public AST.declarator value;
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
			setState(242);
			((DeclaratorContext)_localctx).id = match(IDENTIFIER);

			        ((DeclaratorContext)_localctx).value =  new AST.declarator(false,((DeclaratorContext)_localctx).id.getText(),"");
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
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
					setState(245);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(246);
					match(LSQR);
					setState(247);
					((DeclaratorContext)_localctx).ap = array_params();
					setState(248);
					match(RSQR);

					                  ((DeclaratorContext)_localctx).value =  new AST.declarator(true,((DeclaratorContext)_localctx).de.value.varName,((DeclaratorContext)_localctx).ap.value);
					              
					}
					} 
				}
				setState(255);
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
		public String value;
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((Array_paramsContext)_localctx).ic = match(INTEGER_CONST);
				((Array_paramsContext)_localctx).value =  ((Array_paramsContext)_localctx).ic.getText();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((Array_paramsContext)_localctx).id = match(IDENTIFIER);
				((Array_paramsContext)_localctx).value =  ((Array_paramsContext)_localctx).id.getText();
				}
				break;
			case RSQR:
				enterOuterAlt(_localctx, 3);
				{
				((Array_paramsContext)_localctx).value =  "";
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
		public AST.initializer value;
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

		        ((InitializerContext)_localctx).value =  new AST.initializer();
		    
		try {
			setState(271);
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
				setState(263);
				((InitializerContext)_localctx).ae = assignmentExpression();

				        _localctx.value.aeList.add(((InitializerContext)_localctx).ae.value);
				    
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(LBRACE);
				setState(267);
				((InitializerContext)_localctx).e = expression();
				setState(268);
				match(RBRACE);

				        _localctx.value.aeList = ((InitializerContext)_localctx).e.value;
				    
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
		public AST.assignmentExpression value;
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((AssignmentExpressionContext)_localctx).ce = conditionalExpression();

				        ((AssignmentExpressionContext)_localctx).value =  new AST.assignmentExpression(((AssignmentExpressionContext)_localctx).ce.value,((AssignmentExpressionContext)_localctx).ce.value.lineNo);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((AssignmentExpressionContext)_localctx).ue = unaryExpression();
				setState(277);
				((AssignmentExpressionContext)_localctx).ao = assignmentOperator();
				setState(278);
				((AssignmentExpressionContext)_localctx).ae = assignmentExpression();

				        ((AssignmentExpressionContext)_localctx).value =  new AST.assignmentExpression(((AssignmentExpressionContext)_localctx).ue.value, ((AssignmentExpressionContext)_localctx).ae.value, ((AssignmentExpressionContext)_localctx).ao.value,((AssignmentExpressionContext)_localctx).ue.value.lineNo);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				((AssignmentExpressionContext)_localctx).c = constant();

				        ((AssignmentExpressionContext)_localctx).value =  new AST.assignmentExpression(((AssignmentExpressionContext)_localctx).c.value,((AssignmentExpressionContext)_localctx).c.value.lineNo);
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				((AssignmentExpressionContext)_localctx).fr = functionReturn();

				        ((AssignmentExpressionContext)_localctx).value =  new AST.assignmentExpression(((AssignmentExpressionContext)_localctx).fr.value,((AssignmentExpressionContext)_localctx).fr.value.lineNo);
				    
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
		public String value;
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
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(EQUAL);
				((AssignmentOperatorContext)_localctx).value =  "=";
				}
				break;
			case STAREQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(STAREQUAL);
				((AssignmentOperatorContext)_localctx).value =  "*=";
				}
				break;
			case SLASHEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(SLASHEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "/=";
				}
				break;
			case PERCENTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(PERCENTEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "%=";
				}
				break;
			case PLUSEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(PLUSEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "+=";
				}
				break;
			case MINUSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				match(MINUSEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "-=";
				}
				break;
			case LESSLESSEQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				match(LESSLESSEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "<<=";
				}
				break;
			case GREATERGREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				match(GREATERGREATEREQUAL);
				((AssignmentOperatorContext)_localctx).value =  ">>=";
				}
				break;
			case AMPEQUAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				match(AMPEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "&=";
				}
				break;
			case CARETEQUAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(307);
				match(CARETEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "^=";
				}
				break;
			case PIPEEQUAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(309);
				match(PIPEEQUAL);
				((AssignmentOperatorContext)_localctx).value =  "|=";
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(313);
			((ConditionalExpressionContext)_localctx).le = logicalOrExpression(0);

			        ((ConditionalExpressionContext)_localctx).value =  ((ConditionalExpressionContext)_localctx).le.value;
			    
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
		public AST.someexpression value;
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((UnaryExpressionContext)_localctx).p = postfixExpression(0);
				((UnaryExpressionContext)_localctx).value =  ((UnaryExpressionContext)_localctx).p.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				((UnaryExpressionContext)_localctx).pl = match(PLUSPLUS);
				setState(320);
				((UnaryExpressionContext)_localctx).u1 = unaryExpression();

				        ((UnaryExpressionContext)_localctx).value =  new AST.unaryExpression("++", ((UnaryExpressionContext)_localctx).u1.value,((UnaryExpressionContext)_localctx).pl.getLine());
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				((UnaryExpressionContext)_localctx).m = match(MINUSMINUS);
				setState(324);
				((UnaryExpressionContext)_localctx).u2 = unaryExpression();

				        ((UnaryExpressionContext)_localctx).value =  new AST.unaryExpression("--", ((UnaryExpressionContext)_localctx).u2.value,((UnaryExpressionContext)_localctx).m.getLine());
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				((UnaryExpressionContext)_localctx).uo = unaryOperator();
				setState(328);
				((UnaryExpressionContext)_localctx).ce = castExpression();

				        ((UnaryExpressionContext)_localctx).value =  new AST.unaryExpression(((UnaryExpressionContext)_localctx).uo.value, ((UnaryExpressionContext)_localctx).ce.value,((UnaryExpressionContext)_localctx).ce.value.lineNo);
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				((UnaryExpressionContext)_localctx).s = match(SIZEOF);
				setState(332);
				((UnaryExpressionContext)_localctx).u3 = unaryExpression();

				        ((UnaryExpressionContext)_localctx).value =  new AST.unaryExpression("sizeof", ((UnaryExpressionContext)_localctx).u3.value,((UnaryExpressionContext)_localctx).s.getLine()); 
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				((UnaryExpressionContext)_localctx).s = match(SIZEOF);
				setState(336);
				match(LPAREN);
				setState(337);
				((UnaryExpressionContext)_localctx).t = typeSpecifier();
				setState(338);
				match(RPAREN);

				        ((UnaryExpressionContext)_localctx).value =  new AST.unaryExpression("sizeof", ((UnaryExpressionContext)_localctx).t.value,((UnaryExpressionContext)_localctx).s.getLine());
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				((UnaryExpressionContext)_localctx).amp = match(AMPAMP);
				setState(342);
				((UnaryExpressionContext)_localctx).id = match(IDENTIFIER);

				        ((UnaryExpressionContext)_localctx).value =  new AST.unaryExpression("&&", ((UnaryExpressionContext)_localctx).id.getText(),((UnaryExpressionContext)_localctx).amp.getLine());
				    
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
		public String value;
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
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(AMP);
				((UnaryOperatorContext)_localctx).value =  "&";
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(STAR);
				((UnaryOperatorContext)_localctx).value =  "*";
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(PLUS);
				((UnaryOperatorContext)_localctx).value =  "+";
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(MINUS);
				((UnaryOperatorContext)_localctx).value =  "-";
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				match(TILDE);
				((UnaryOperatorContext)_localctx).value =  "~";
				}
				break;
			case EXCLAIM:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				match(EXCLAIM);
				((UnaryOperatorContext)_localctx).value =  "!";
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(361);
				((PostfixExpressionContext)_localctx).p = primaryExpression();
				((PostfixExpressionContext)_localctx).value =  ((PostfixExpressionContext)_localctx).p.value;_localctx.value.lineNo = ((PostfixExpressionContext)_localctx).p.value.lineNo;
				}
				break;
			case 2:
				{
				setState(364);
				((PostfixExpressionContext)_localctx).f = functionReturn();
				((PostfixExpressionContext)_localctx).value =  ((PostfixExpressionContext)_localctx).f.value;_localctx.value.lineNo = ((PostfixExpressionContext)_localctx).f.value.lineNo;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p1 = _prevctx;
						_localctx.p1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(369);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(370);
						match(LSQR);
						setState(371);
						((PostfixExpressionContext)_localctx).e = assignmentExpression();
						setState(372);
						match(RSQR);

						                  ((PostfixExpressionContext)_localctx).value =  new AST.postfixExpression(((PostfixExpressionContext)_localctx).p1.value, ((PostfixExpressionContext)_localctx).e.value,((PostfixExpressionContext)_localctx).e.value.lineNo);
						              
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p2 = _prevctx;
						_localctx.p2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(375);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(376);
						match(DOT);
						setState(377);
						((PostfixExpressionContext)_localctx).id = match(IDENTIFIER);

						                  ((PostfixExpressionContext)_localctx).value =  new AST.postfixExpression(((PostfixExpressionContext)_localctx).p2.value,".",((PostfixExpressionContext)_localctx).id.getText(),((PostfixExpressionContext)_localctx).p2.value.lineNo);
						              
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p3 = _prevctx;
						_localctx.p3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(379);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(380);
						match(ARROW);
						setState(381);
						((PostfixExpressionContext)_localctx).id1 = match(IDENTIFIER);

						                  ((PostfixExpressionContext)_localctx).value =  new AST.postfixExpression(((PostfixExpressionContext)_localctx).p3.value,"->", ((PostfixExpressionContext)_localctx).id1.getText(),((PostfixExpressionContext)_localctx).p3.value.lineNo);
						              
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p4 = _prevctx;
						_localctx.p4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(383);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(384);
						match(PLUSPLUS);

						                  ((PostfixExpressionContext)_localctx).value =  new AST.postfixExpression(((PostfixExpressionContext)_localctx).p4.value,"++",((PostfixExpressionContext)_localctx).p4.value.lineNo);
						              
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.p5 = _prevctx;
						_localctx.p5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(386);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(387);
						match(MINUSMINUS);

						                  ((PostfixExpressionContext)_localctx).value =  new AST.postfixExpression(((PostfixExpressionContext)_localctx).p5.value,"--",((PostfixExpressionContext)_localctx).p5.value.lineNo);
						              
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public ArrayList<AST.assignmentExpression> value;
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

		        ((ExpressionContext)_localctx).value =  new ArrayList<>();
		    
		int _la;
		try {
			setState(406);
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
				setState(395);
				((ExpressionContext)_localctx).a1 = assignmentExpression();
				_localctx.value.add(((ExpressionContext)_localctx).a1.value);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397);
					match(COMMA);
					setState(398);
					((ExpressionContext)_localctx).a2 = assignmentExpression();
					_localctx.value.add(((ExpressionContext)_localctx).a2.value);
					}
					}
					setState(405);
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
		public AST.someexpression value;
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
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				((PrimaryExpressionContext)_localctx).id = match(IDENTIFIER);

				        ((PrimaryExpressionContext)_localctx).value =  new AST.varname(((PrimaryExpressionContext)_localctx).id.getText(),((PrimaryExpressionContext)_localctx).id.getLine());
				    
				}
				break;
			case BOOL_CONST:
			case STRING_LITERAL:
			case INTEGER_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				((PrimaryExpressionContext)_localctx).c = constant();

				        ((PrimaryExpressionContext)_localctx).value =  ((PrimaryExpressionContext)_localctx).c.value;
				    
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(LPAREN);
				setState(414);
				((PrimaryExpressionContext)_localctx).e = assignmentExpression();
				setState(415);
				match(RPAREN);

				        ((PrimaryExpressionContext)_localctx).value =  ((PrimaryExpressionContext)_localctx).e.value;
				    
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
		public AST.someexpression value;
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
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((ConstantContext)_localctx).i = match(INTEGER_CONST);

				        ((ConstantContext)_localctx).value =  new AST.int_const(Integer.parseInt(((ConstantContext)_localctx).i.getText()),"int",((ConstantContext)_localctx).i.getLine());
				    
				}
				break;
			case FLOAT_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				((ConstantContext)_localctx).f = match(FLOAT_CONST);

				        ((ConstantContext)_localctx).value =  new AST.float_const(Float.parseFloat(((ConstantContext)_localctx).f.getText()),"float",((ConstantContext)_localctx).f.getLine());
				    
				}
				break;
			case CHAR_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				((ConstantContext)_localctx).c = match(CHAR_CONST);

				        ((ConstantContext)_localctx).value =  new AST.char_const(((ConstantContext)_localctx).c.getText().charAt(0),"char",((ConstantContext)_localctx).c.getLine());
				    
				}
				break;
			case BOOL_CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				((ConstantContext)_localctx).b = match(BOOL_CONST);

				        ((ConstantContext)_localctx).value =  new AST.bool_const(Boolean.parseBoolean(((ConstantContext)_localctx).b.getText()),"bool",((ConstantContext)_localctx).b.getLine());
				    
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				((ConstantContext)_localctx).s = match(STRING_LITERAL);

				        ((ConstantContext)_localctx).value =  new AST.string_const(((ConstantContext)_localctx).s.getText(),"string",((ConstantContext)_localctx).s.getLine());
				    
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
		public ArrayList<AST.assignmentExpression> value;
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
			setState(432);
			((ArgumentExpressionListContext)_localctx).e1 = assignmentExpression();
			_localctx.value.add(((ArgumentExpressionListContext)_localctx).e1.value);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434);
				match(COMMA);
				setState(435);
				((ArgumentExpressionListContext)_localctx).e2 = assignmentExpression();
				_localctx.value.add(((ArgumentExpressionListContext)_localctx).e2.value);
				}
				}
				setState(442);
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
		public AST.someexpression value;
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
			setState(444);
			((LogicalOrExpressionContext)_localctx).and = logicalAndExpression(0);

			        ((LogicalOrExpressionContext)_localctx).value =  ((LogicalOrExpressionContext)_localctx).and.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
					setState(447);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(448);
					((LogicalOrExpressionContext)_localctx).orr = match(PIPEPIPE);
					setState(449);
					((LogicalOrExpressionContext)_localctx).and = logicalAndExpression(0);

					                  ((LogicalOrExpressionContext)_localctx).value =  new AST.logicalOrExpression(((LogicalOrExpressionContext)_localctx).or.value, ((LogicalOrExpressionContext)_localctx).and.value, ((LogicalOrExpressionContext)_localctx).orr.getLine());
					              
					}
					} 
				}
				setState(456);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(458);
			((LogicalAndExpressionContext)_localctx).inor = inclusiveOrExpression(0);

			        ((LogicalAndExpressionContext)_localctx).value =  ((LogicalAndExpressionContext)_localctx).inor.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
					setState(461);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(462);
					((LogicalAndExpressionContext)_localctx).andd = match(AMPAMP);
					setState(463);
					((LogicalAndExpressionContext)_localctx).inor = inclusiveOrExpression(0);

					                  ((LogicalAndExpressionContext)_localctx).value =  new AST.logicalAndExpression(((LogicalAndExpressionContext)_localctx).and.value, ((LogicalAndExpressionContext)_localctx).inor.value, ((LogicalAndExpressionContext)_localctx).andd.getLine());
					              
					}
					} 
				}
				setState(470);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(472);
			((ExclusiveOrExpressionContext)_localctx).bitand = andExpression(0);

			        ((ExclusiveOrExpressionContext)_localctx).value =  ((ExclusiveOrExpressionContext)_localctx).bitand.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
					setState(475);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(476);
					((ExclusiveOrExpressionContext)_localctx).xxor = match(CARET);
					setState(477);
					((ExclusiveOrExpressionContext)_localctx).bitand = andExpression(0);

					                  ((ExclusiveOrExpressionContext)_localctx).value =  new AST.exclusiveOrExpression(((ExclusiveOrExpressionContext)_localctx).xor.value, ((ExclusiveOrExpressionContext)_localctx).bitand.value, ((ExclusiveOrExpressionContext)_localctx).xxor.getLine());
					              
					}
					} 
				}
				setState(484);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(486);
			((InclusiveOrExpressionContext)_localctx).xor = exclusiveOrExpression(0);

			        ((InclusiveOrExpressionContext)_localctx).value =  ((InclusiveOrExpressionContext)_localctx).xor.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
					setState(489);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(490);
					((InclusiveOrExpressionContext)_localctx).inorr = match(PIPE);
					setState(491);
					((InclusiveOrExpressionContext)_localctx).xor = exclusiveOrExpression(0);

					                  ((InclusiveOrExpressionContext)_localctx).value =  new AST.inclusiveOrExpression(((InclusiveOrExpressionContext)_localctx).inor.value, ((InclusiveOrExpressionContext)_localctx).xor.value, ((InclusiveOrExpressionContext)_localctx).inorr.getLine());
					              
					}
					} 
				}
				setState(498);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(500);
			((AndExpressionContext)_localctx).eq = equalityExpression(0);

			        ((AndExpressionContext)_localctx).value =  ((AndExpressionContext)_localctx).eq.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
					setState(503);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(504);
					((AndExpressionContext)_localctx).f = match(AMP);
					setState(505);
					((AndExpressionContext)_localctx).eq = equalityExpression(0);

					                  ((AndExpressionContext)_localctx).value =  new AST.andExpression(((AndExpressionContext)_localctx).bitand.value, ((AndExpressionContext)_localctx).eq.value, ((AndExpressionContext)_localctx).f.getLine());
					              
					}
					} 
				}
				setState(512);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(514);
			((EqualityExpressionContext)_localctx).rel = relationalExpression(0);

			        ((EqualityExpressionContext)_localctx).value =  ((EqualityExpressionContext)_localctx).rel.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.eq = _prevctx;
						_localctx.eq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(517);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(518);
						((EqualityExpressionContext)_localctx).eqq = match(EQUALEQUAL);
						setState(519);
						((EqualityExpressionContext)_localctx).rel = relationalExpression(0);

						                  ((EqualityExpressionContext)_localctx).value =  new AST.equalityExpression(((EqualityExpressionContext)_localctx).eq.value, ((EqualityExpressionContext)_localctx).rel.value, "==", ((EqualityExpressionContext)_localctx).eqq.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.eq = _prevctx;
						_localctx.eq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(522);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(523);
						((EqualityExpressionContext)_localctx).neq = match(EXCLAIMEQUAL);
						setState(524);
						((EqualityExpressionContext)_localctx).rel = relationalExpression(0);

						                  ((EqualityExpressionContext)_localctx).value =  new AST.equalityExpression(((EqualityExpressionContext)_localctx).eq.value, ((EqualityExpressionContext)_localctx).rel.value, "!=", ((EqualityExpressionContext)_localctx).neq.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(531);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(533);
			((RelationalExpressionContext)_localctx).sh = shiftExpression(0);

			        ((RelationalExpressionContext)_localctx).value =  ((RelationalExpressionContext)_localctx).sh.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(556);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(536);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(537);
						((RelationalExpressionContext)_localctx).lt = match(LESS);
						setState(538);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);

						                  ((RelationalExpressionContext)_localctx).value =  new AST.relationalExpression(((RelationalExpressionContext)_localctx).rel.value, ((RelationalExpressionContext)_localctx).sh.value, "<", ((RelationalExpressionContext)_localctx).lt.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(541);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(542);
						((RelationalExpressionContext)_localctx).gt = match(GREATER);
						setState(543);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);

						                  ((RelationalExpressionContext)_localctx).value =  new AST.relationalExpression(((RelationalExpressionContext)_localctx).rel.value, ((RelationalExpressionContext)_localctx).sh.value, ">", ((RelationalExpressionContext)_localctx).gt.getLine());
						              
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(546);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(547);
						((RelationalExpressionContext)_localctx).lte = match(LESSEQUAL);
						setState(548);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);

						                  ((RelationalExpressionContext)_localctx).value =  new AST.relationalExpression(((RelationalExpressionContext)_localctx).rel.value, ((RelationalExpressionContext)_localctx).sh.value, "<=", ((RelationalExpressionContext)_localctx).lte.getLine());
						              
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.rel = _prevctx;
						_localctx.rel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(551);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(552);
						((RelationalExpressionContext)_localctx).gte = match(GREATEREQUAL);
						setState(553);
						((RelationalExpressionContext)_localctx).sh = shiftExpression(0);

						                  ((RelationalExpressionContext)_localctx).value =  new AST.relationalExpression(((RelationalExpressionContext)_localctx).rel.value, ((RelationalExpressionContext)_localctx).sh.value, ">=", ((RelationalExpressionContext)_localctx).gte.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(560);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(562);
			((ShiftExpressionContext)_localctx).ad = additiveExpression(0);

			        ((ShiftExpressionContext)_localctx).value =  ((ShiftExpressionContext)_localctx).ad.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(575);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.sh = _prevctx;
						_localctx.sh = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(565);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(566);
						((ShiftExpressionContext)_localctx).ssh = match(LESSLESS);
						setState(567);
						((ShiftExpressionContext)_localctx).ad = additiveExpression(0);

						                  ((ShiftExpressionContext)_localctx).value =  new AST.shiftExpression(((ShiftExpressionContext)_localctx).sh.value, ((ShiftExpressionContext)_localctx).ad.value, "<<", ((ShiftExpressionContext)_localctx).ssh.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.sh = _prevctx;
						_localctx.sh = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(570);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(571);
						((ShiftExpressionContext)_localctx).ssh = match(GREATERGREATER);
						setState(572);
						((ShiftExpressionContext)_localctx).ad = additiveExpression(0);

						                  ((ShiftExpressionContext)_localctx).value =  new AST.shiftExpression(((ShiftExpressionContext)_localctx).sh.value, ((ShiftExpressionContext)_localctx).ad.value, ">>", ((ShiftExpressionContext)_localctx).ssh.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(579);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(581);
			((MultiplicativeExpressionContext)_localctx).ce = castExpression();

			        ((MultiplicativeExpressionContext)_localctx).value =  ((MultiplicativeExpressionContext)_localctx).ce.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(599);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.me = _prevctx;
						_localctx.me = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(584);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(585);
						((MultiplicativeExpressionContext)_localctx).mul = match(STAR);
						setState(586);
						((MultiplicativeExpressionContext)_localctx).ce = castExpression();

						                  ((MultiplicativeExpressionContext)_localctx).value =  new AST.multiplicativeExpression(((MultiplicativeExpressionContext)_localctx).me.value, ((MultiplicativeExpressionContext)_localctx).ce.value, "*", ((MultiplicativeExpressionContext)_localctx).mul.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.me = _prevctx;
						_localctx.me = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(589);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(590);
						((MultiplicativeExpressionContext)_localctx).div = match(SLASH);
						setState(591);
						((MultiplicativeExpressionContext)_localctx).ce = castExpression();

						                  ((MultiplicativeExpressionContext)_localctx).value =  new AST.multiplicativeExpression(((MultiplicativeExpressionContext)_localctx).me.value, ((MultiplicativeExpressionContext)_localctx).ce.value, "/", ((MultiplicativeExpressionContext)_localctx).div.getLine());
						              
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.me = _prevctx;
						_localctx.me = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(594);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(595);
						((MultiplicativeExpressionContext)_localctx).mod = match(PERCENT);
						setState(596);
						((MultiplicativeExpressionContext)_localctx).ce = castExpression();

						                  ((MultiplicativeExpressionContext)_localctx).value =  new AST.multiplicativeExpression(((MultiplicativeExpressionContext)_localctx).me.value, ((MultiplicativeExpressionContext)_localctx).ce.value, "%", ((MultiplicativeExpressionContext)_localctx).mod.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(603);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(605);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression(0);

			        ((AdditiveExpressionContext)_localctx).value =  ((AdditiveExpressionContext)_localctx).me.value;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.ad = _prevctx;
						_localctx.ad = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(608);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(609);
						((AdditiveExpressionContext)_localctx).p = match(PLUS);
						setState(610);
						((AdditiveExpressionContext)_localctx).me = multiplicativeExpression(0);

						                  ((AdditiveExpressionContext)_localctx).value =  new AST.additiveExpression(((AdditiveExpressionContext)_localctx).ad.value, ((AdditiveExpressionContext)_localctx).me.value, "+", ((AdditiveExpressionContext)_localctx).p.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.ad = _prevctx;
						_localctx.ad = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(613);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(614);
						((AdditiveExpressionContext)_localctx).s = match(MINUS);
						setState(615);
						((AdditiveExpressionContext)_localctx).me = multiplicativeExpression(0);

						                  ((AdditiveExpressionContext)_localctx).value =  new AST.additiveExpression(((AdditiveExpressionContext)_localctx).ad.value, ((AdditiveExpressionContext)_localctx).me.value, "-", ((AdditiveExpressionContext)_localctx).s.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(622);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public AST.someexpression value;
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
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(LPAREN);
				setState(624);
				((CastExpressionContext)_localctx).t = typeSpecifier();
				setState(625);
				match(RPAREN);
				setState(626);
				((CastExpressionContext)_localctx).ce = castExpression();
				((CastExpressionContext)_localctx).value =  new AST.castExpression(((CastExpressionContext)_localctx).t.value, ((CastExpressionContext)_localctx).ce.value,((CastExpressionContext)_localctx).ce.value.lineNo);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				((CastExpressionContext)_localctx).ue = unaryExpression();
				((CastExpressionContext)_localctx).value =  ((CastExpressionContext)_localctx).ue.value;_localctx.value.lineNo = ((CastExpressionContext)_localctx).ue.value.lineNo;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				((CastExpressionContext)_localctx).c = constant();
				((CastExpressionContext)_localctx).value =  ((CastExpressionContext)_localctx).c.value;_localctx.value.lineNo = ((CastExpressionContext)_localctx).c.value.lineNo;
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
		public String value;
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
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				((TypeSpecifierContext)_localctx).v = match(VOID);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).v.getText();
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(639);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				((TypeSpecifierContext)_localctx).b = match(BOOL);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).b.getText();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(649);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				((TypeSpecifierContext)_localctx).c = match(CHAR);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).c.getText();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(659);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				((TypeSpecifierContext)_localctx).i = match(INT);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).i.getText();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(669);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				((TypeSpecifierContext)_localctx).f = match(FLOAT);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).f.getText();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(679);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(687);
				((TypeSpecifierContext)_localctx).d = match(DOUBLE);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).d.getText();
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(689);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 7);
				{
				setState(697);
				((TypeSpecifierContext)_localctx).l = match(LONG);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).l.getText();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(699);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(707);
				((TypeSpecifierContext)_localctx).str = match(STRING);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).str.getText();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(709);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				((TypeSpecifierContext)_localctx).st = match(STRUCT);
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).st.getText();
				setState(719);
				((TypeSpecifierContext)_localctx).id = match(IDENTIFIER);
				_localctx.value += ((TypeSpecifierContext)_localctx).id.getText();
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(721);
					((TypeSpecifierContext)_localctx).p = pointer();
					_localctx.value += ((TypeSpecifierContext)_localctx).p.value;
					}
					}
					setState(728);
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
				setState(729);
				((TypeSpecifierContext)_localctx).td = dsDec();
				((TypeSpecifierContext)_localctx).value =  ((TypeSpecifierContext)_localctx).td.value.dsName+"("+((TypeSpecifierContext)_localctx).td.value.basicType+")";
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
		public AST.parameterTypeList value;
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
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				((ParameterTypeListContext)_localctx).par = match(LPAREN);
				setState(735);
				((ParameterTypeListContext)_localctx).fpl = functionParameterList();
				setState(736);
				match(RPAREN);
				((ParameterTypeListContext)_localctx).value =  new AST.parameterTypeList(((ParameterTypeListContext)_localctx).fpl.value,((ParameterTypeListContext)_localctx).par.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				((ParameterTypeListContext)_localctx).par = match(LPAREN);
				setState(740);
				match(RPAREN);
				((ParameterTypeListContext)_localctx).value =  new AST.parameterTypeList("",((ParameterTypeListContext)_localctx).par.getLine());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				((ParameterTypeListContext)_localctx).par = match(LPAREN);
				setState(743);
				((ParameterTypeListContext)_localctx).v = match(VOID);
				setState(744);
				match(RPAREN);
				((ParameterTypeListContext)_localctx).value =  new AST.parameterTypeList(((ParameterTypeListContext)_localctx).v.getText(),((ParameterTypeListContext)_localctx).par.getLine());
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
		public ArrayList<AST.formal> value;
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

		        ((FunctionParameterListContext)_localctx).value =  new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			((FunctionParameterListContext)_localctx).f1 = formal();
			_localctx.value.add(((FunctionParameterListContext)_localctx).f1.value);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750);
				match(COMMA);
				setState(751);
				((FunctionParameterListContext)_localctx).f2 = formal();
				_localctx.value.add(((FunctionParameterListContext)_localctx).f2.value);
				}
				}
				setState(758);
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
		public AST.formal value;
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
			setState(759);
			((FormalContext)_localctx).t1 = typeSpecifier();
			setState(760);
			((FormalContext)_localctx).d1 = declarator(0);

			        ((FormalContext)_localctx).value =  new AST.formal(((FormalContext)_localctx).d1.value, ((FormalContext)_localctx).t1.value);
			    
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
		public ArrayList<AST.blockItem> value;
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

		        ((BlockItemListContext)_localctx).value =  new ArrayList<>();
		    
		int _la;
		try {
			setState(771);
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
			case STATIC:
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
				setState(767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(764);
					((BlockItemListContext)_localctx).b = blockItem();
					_localctx.value.add(((BlockItemListContext)_localctx).b.value);
					}
					}
					setState(769); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << CONTINUE) | (1L << RETURN) | (1L << BREAK) | (1L << TYPEDEF) | (1L << SIZEOF) | (1L << EXTERN) | (1L << STATIC) | (1L << IDENTIFIER) | (1L << STRING) | (1L << BOOL_CONST) | (1L << STRING_LITERAL) | (1L << INTEGER_CONST) | (1L << FLOAT_CONST) | (1L << CHAR_CONST) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR) | (1L << LPAREN) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << AMP) | (1L << TILDE) | (1L << EXCLAIM) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << AMPAMP))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (IF - 76)) | (1L << (DO - 76)) | (1L << (WHILE - 76)) | (1L << (FOR - 76)))) != 0) );
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
		public AST.blockItem value;
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
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				((BlockItemContext)_localctx).st = statement();

				        ((BlockItemContext)_localctx).value =  ((BlockItemContext)_localctx).st.value;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				((BlockItemContext)_localctx).dec = declaration();

				        ((BlockItemContext)_localctx).value =  ((BlockItemContext)_localctx).dec.value;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				((BlockItemContext)_localctx).fc = functionCall();

				        ((BlockItemContext)_localctx).value =  ((BlockItemContext)_localctx).fc.value;
				    
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
		public AST.functionCall value;
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

		        ((FunctionCallContext)_localctx).value =  new AST.functionCall();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			((FunctionCallContext)_localctx).id = match(IDENTIFIER);
			_localctx.value.functionName = ((FunctionCallContext)_localctx).id.getText();_localctx.value.lineNo = ((FunctionCallContext)_localctx).id.getLine();
			setState(786);
			match(LPAREN);
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(787);
				((FunctionCallContext)_localctx).e = expression();
				_localctx.value.params = ((FunctionCallContext)_localctx).e.value;
				}
				break;
			}
			setState(792);
			match(RPAREN);
			setState(793);
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
		public AST.statement value;
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
			setState(813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				((StatementContext)_localctx).cs = compoundStatement();

				        ((StatementContext)_localctx).value =  ((StatementContext)_localctx).cs.value;
				    
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
				setState(798);
				((StatementContext)_localctx).es = expressionStatement();

				        ((StatementContext)_localctx).value =  ((StatementContext)_localctx).es.value;
				    
				}
				break;
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				((StatementContext)_localctx).ws = whileStatement();

				        ((StatementContext)_localctx).value =  ((StatementContext)_localctx).ws.value;
				    
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				((StatementContext)_localctx).fs = forStatement();

				        ((StatementContext)_localctx).value =  ((StatementContext)_localctx).fs.value;
				    
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				((StatementContext)_localctx).is = ifStatement();

				        ((StatementContext)_localctx).value =  ((StatementContext)_localctx).is.value;
				    
				}
				break;
			case CONTINUE:
			case RETURN:
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(810);
				((StatementContext)_localctx).js = jumpStatement();

				        ((StatementContext)_localctx).value =  ((StatementContext)_localctx).js.value;
				    
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
		public AST.compoundStatement value;
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
			setState(815);
			((CompoundStatementContext)_localctx).pr = match(LBRACE);
			setState(816);
			((CompoundStatementContext)_localctx).b = blockItemList();
			setState(817);
			match(RBRACE);

			        ((CompoundStatementContext)_localctx).value =  new AST.compoundStatement(((CompoundStatementContext)_localctx).b.value, ((CompoundStatementContext)_localctx).pr.getLine());
			    
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
		public AST.expressionStatement value;
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
			setState(820);
			((ExpressionStatementContext)_localctx).e = assignmentExpression();
			}
			setState(821);
			((ExpressionStatementContext)_localctx).sc = match(SEMICOLON);
			((ExpressionStatementContext)_localctx).value =  new AST.expressionStatement(((ExpressionStatementContext)_localctx).e.value, ((ExpressionStatementContext)_localctx).sc.getLine());
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
		public AST.ifStatement value;
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

		        ((IfStatementContext)_localctx).value =  new AST.ifStatement();
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(IF);
			setState(825);
			match(LPAREN);
			setState(826);
			((IfStatementContext)_localctx).e1 = assignmentExpression();
			setState(827);
			match(RPAREN);
			setState(828);
			((IfStatementContext)_localctx).s1 = statement();

			        _localctx.value.aeList.add(((IfStatementContext)_localctx).e1.value);
			        _localctx.value.stmtList.add(((IfStatementContext)_localctx).s1.value);
			        _localctx.value.lineNo = ((IfStatementContext)_localctx).e1.value.lineNo;
			    
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					match(ELSE);
					setState(831);
					match(IF);
					setState(832);
					match(LPAREN);
					setState(833);
					((IfStatementContext)_localctx).e2 = assignmentExpression();
					setState(834);
					match(RPAREN);
					setState(835);
					((IfStatementContext)_localctx).s2 = statement();
					_localctx.value.aeList.add(((IfStatementContext)_localctx).e2.value);_localctx.value.stmtList.add(((IfStatementContext)_localctx).s2.value);
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(843);
				match(ELSE);
				setState(844);
				((IfStatementContext)_localctx).s3 = statement();
				_localctx.value.stmtList.add(((IfStatementContext)_localctx).s3.value);
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
		public AST.whileStatement value;
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
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				((WhileStatementContext)_localctx).w = match(WHILE);
				setState(850);
				match(LPAREN);
				setState(851);
				((WhileStatementContext)_localctx).e = assignmentExpression();
				setState(852);
				match(RPAREN);
				setState(853);
				((WhileStatementContext)_localctx).st = statement();

				        ((WhileStatementContext)_localctx).value =  new AST.whileStatement(false, ((WhileStatementContext)_localctx).e.value, ((WhileStatementContext)_localctx).st.value,((WhileStatementContext)_localctx).w.getLine());
				    
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				((WhileStatementContext)_localctx).du = match(DO);
				setState(857);
				((WhileStatementContext)_localctx).st = statement();
				setState(858);
				match(WHILE);
				setState(859);
				match(LPAREN);
				setState(860);
				((WhileStatementContext)_localctx).e = assignmentExpression();
				setState(861);
				match(RPAREN);
				setState(862);
				match(SEMICOLON);

				        ((WhileStatementContext)_localctx).value =  new AST.whileStatement(true, ((WhileStatementContext)_localctx).e.value, ((WhileStatementContext)_localctx).st.value,((WhileStatementContext)_localctx).du.getLine());
				    
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
		public AST.forStatement value;
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
			setState(867);
			((ForStatementContext)_localctx).f = match(FOR);
			setState(868);
			match(LPAREN);
			setState(869);
			((ForStatementContext)_localctx).fc = forCondition();
			setState(870);
			match(RPAREN);
			setState(871);
			((ForStatementContext)_localctx).st = statement();

			        ((ForStatementContext)_localctx).value =  new AST.forStatement(((ForStatementContext)_localctx).fc.value,((ForStatementContext)_localctx).st.value,((ForStatementContext)_localctx).f.getLine());
			    
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
		public AST.forCondition value;
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
			setState(896);
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
				setState(874);
				((ForConditionContext)_localctx).dec = declaration();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(875);
					((ForConditionContext)_localctx).e1 = expression();
					}
					break;
				}
				setState(878);
				((ForConditionContext)_localctx).sc = match(SEMICOLON);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(879);
					((ForConditionContext)_localctx).e2 = expression();
					}
					break;
				}

				        ((ForConditionContext)_localctx).value =  new AST.forCondition(((ForConditionContext)_localctx).dec.value, ((ForConditionContext)_localctx).e1.value, ((ForConditionContext)_localctx).e2.value, ((ForConditionContext)_localctx).sc.getLine());
				    
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
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(884);
					((ForConditionContext)_localctx).e1 = expression();
					}
					break;
				}
				setState(887);
				((ForConditionContext)_localctx).sc = match(SEMICOLON);
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(888);
					((ForConditionContext)_localctx).e2 = expression();
					}
					break;
				}
				setState(891);
				match(SEMICOLON);
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(892);
					((ForConditionContext)_localctx).e3 = expression();
					}
					break;
				}

				        ((ForConditionContext)_localctx).value =  new AST.forCondition(((ForConditionContext)_localctx).e1.value, ((ForConditionContext)_localctx).e2.value, ((ForConditionContext)_localctx).e3.value, ((ForConditionContext)_localctx).sc.getLine());
				    
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
		public AST.jumpStatement value;
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
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				((JumpStatementContext)_localctx).cn = match(CONTINUE);
				setState(899);
				match(SEMICOLON);

				        ((JumpStatementContext)_localctx).value =  new AST.jumpStatement(((JumpStatementContext)_localctx).cn.getText(),((JumpStatementContext)_localctx).cn.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				((JumpStatementContext)_localctx).br = match(BREAK);
				setState(902);
				match(SEMICOLON);

				        ((JumpStatementContext)_localctx).value =  new AST.jumpStatement(((JumpStatementContext)_localctx).br.getText(),((JumpStatementContext)_localctx).br.getLine());
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				((JumpStatementContext)_localctx).re = match(RETURN);
				setState(905);
				match(SEMICOLON);

				        ((JumpStatementContext)_localctx).value =  new AST.jumpStatement(((JumpStatementContext)_localctx).re.getText(),((JumpStatementContext)_localctx).re.getLine());
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				((JumpStatementContext)_localctx).re = match(RETURN);
				setState(908);
				((JumpStatementContext)_localctx).ae = assignmentExpression();
				setState(909);
				match(SEMICOLON);

				        ((JumpStatementContext)_localctx).value =  new AST.jumpStatement(((JumpStatementContext)_localctx).re.getText(), ((JumpStatementContext)_localctx).ae.value,((JumpStatementContext)_localctx).re.getLine() );
				    
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
		public AST.functionReturn value;
		public Token id;
		public ExpressionContext e;
		public TerminalNode LPAREN() { return getToken(CupParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CupParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CupParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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

		        ((FunctionReturnContext)_localctx).value =  new AST.functionReturn();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			((FunctionReturnContext)_localctx).id = match(IDENTIFIER);
			_localctx.value.name = ((FunctionReturnContext)_localctx).id.getText();
			setState(916);
			match(LPAREN);
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(917);
				((FunctionReturnContext)_localctx).e = expression();
				_localctx.value.arguments = ((FunctionReturnContext)_localctx).e.value;
				}
				break;
			}
			setState(922);
			match(RPAREN);
			_localctx.value.lineNo = ((FunctionReturnContext)_localctx).id.getLine();
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
		public AST.declarationSpecifier value;
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

		        ((DeclarationSpecifierContext)_localctx).value =  new AST.declarationSpecifier();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC))) != 0)) {
				{
				setState(925);
				((DeclarationSpecifierContext)_localctx).scs = storageClassSpecifier();
				_localctx.value.fullType+=((DeclarationSpecifierContext)_localctx).scs.value; _localctx.value.fullType+=" ";
				}
			}

			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(930);
				((DeclarationSpecifierContext)_localctx).tq = typeQualifier();
				_localctx.value.fullType+=((DeclarationSpecifierContext)_localctx).tq.value; _localctx.value.fullType+=" ";
				}
			}

			setState(935);
			((DeclarationSpecifierContext)_localctx).ts = typeSpecifier();
			_localctx.value.fullType+=((DeclarationSpecifierContext)_localctx).ts.value; _localctx.value.basicType = ((DeclarationSpecifierContext)_localctx).ts.value;
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
		public String value;
		public Token td;
		public Token ex;
		public Token st;
		public TerminalNode TYPEDEF() { return getToken(CupParser.TYPEDEF, 0); }
		public TerminalNode EXTERN() { return getToken(CupParser.EXTERN, 0); }
		public TerminalNode STATIC() { return getToken(CupParser.STATIC, 0); }
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
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				((StorageClassSpecifierContext)_localctx).td = match(TYPEDEF);
				((StorageClassSpecifierContext)_localctx).value =  ((StorageClassSpecifierContext)_localctx).td.getText();
				}
				break;
			case EXTERN:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				((StorageClassSpecifierContext)_localctx).ex = match(EXTERN);
				((StorageClassSpecifierContext)_localctx).value =  ((StorageClassSpecifierContext)_localctx).ex.getText();
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				((StorageClassSpecifierContext)_localctx).st = match(STATIC);
				((StorageClassSpecifierContext)_localctx).value =  ((StorageClassSpecifierContext)_localctx).st.getText();
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
		public ArrayList<AST.declaration> value;
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

				((DeclarationListContext)_localctx).value =  new ArrayList<>();
			
		int _la;
		try {
			setState(954);
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
			case STATIC:
			case STRING:
			case STRUCT:
			case STACK:
			case QUEUE:
			case VECTOR:
			case UNQ_PTR:
			case SHARED_PTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(950); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(947);
					((DeclarationListContext)_localctx).d = declaration();
					_localctx.value.add(((DeclarationListContext)_localctx).d.value);
					}
					}
					setState(952); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << LONG) | (1L << CONST) | (1L << TYPEDEF) | (1L << EXTERN) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT) | (1L << STACK) | (1L << QUEUE) | (1L << VECTOR) | (1L << UNQ_PTR) | (1L << SHARED_PTR))) != 0) );
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
		public ArrayList<String> value;
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

				((NameListContext)_localctx).value =  new ArrayList<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			((NameListContext)_localctx).i1 = match(IDENTIFIER);
			_localctx.value.add(((NameListContext)_localctx).i1.getText());
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(958);
				match(COMMA);
				setState(959);
				((NameListContext)_localctx).i2 = match(IDENTIFIER);
				 _localctx.value.add(((NameListContext)_localctx).i2.getText());
				}
				}
				setState(965);
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
		public AST.structDefinition value;
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
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				((StructDefinitionContext)_localctx).st = match(STRUCT);
				setState(967);
				((StructDefinitionContext)_localctx).id = match(IDENTIFIER);
				setState(968);
				match(LBRACE);
				setState(969);
				((StructDefinitionContext)_localctx).dl = declarationList();
				setState(970);
				match(RBRACE);
				setState(971);
				match(SEMICOLON);

				        ((StructDefinitionContext)_localctx).value =  new AST.structDefinition(filename, ((StructDefinitionContext)_localctx).id.getText(), ((StructDefinitionContext)_localctx).dl.value, ((StructDefinitionContext)_localctx).st.getLine()  );
				        // _localctx.value.name = ((StructDefinitionContext)_localctx).id.getText();
				        // _localctx.value.declist = ((StructDefinitionContext)_localctx).dl.value;
				        // _localctx.value.lineNo = ((StructDefinitionContext)_localctx).st.getLine();
				        // _localctx.value.fileNmae = filename;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				((StructDefinitionContext)_localctx).st = match(STRUCT);
				setState(975);
				((StructDefinitionContext)_localctx).id = match(IDENTIFIER);
				setState(976);
				match(LBRACE);
				setState(977);
				((StructDefinitionContext)_localctx).dl = declarationList();
				setState(978);
				match(RBRACE);
				setState(979);
				((StructDefinitionContext)_localctx).nl = nameList();
				setState(980);
				match(SEMICOLON);

				        ((StructDefinitionContext)_localctx).value =  new AST.structDefinition(filename, ((StructDefinitionContext)_localctx).id.getText(), ((StructDefinitionContext)_localctx).nl.value, ((StructDefinitionContext)_localctx).dl.value, ((StructDefinitionContext)_localctx).st.getLine()  );
				        // _localctx.value.name = ((StructDefinitionContext)_localctx).id.getText();
				        // _localctx.value.declist = ((StructDefinitionContext)_localctx).dl.value;
				        // _localctx.value.lineNo = ((StructDefinitionContext)_localctx).st.getLine();
				        // _localctx.value.fileNmae = filename;
				    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u03dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\5\2|\n\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3\u0084\n\3\r\3\16\3\u0085\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a8"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c7\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00e3\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\17\3\17\3\17\5"+
		"\17\u00ef\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00fe\n\21\f\21\16\21\u0101\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0108\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0112"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0122\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013a"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u015b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0169\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0172\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0188\n\31\f\31"+
		"\16\31\u018b\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0194\n\32"+
		"\f\32\16\32\u0197\13\32\5\32\u0199\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01a5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01b1\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01b9"+
		"\n\35\f\35\16\35\u01bc\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u01c7\n\36\f\36\16\36\u01ca\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u01d5\n\37\f\37\16\37\u01d8\13\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \7 \u01e3\n \f \16 \u01e6\13 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\7!\u01f1\n!\f!\16!\u01f4\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u01ff\n\"\f\"\16\"\u0202\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\7#\u0212\n#\f#\16#\u0215\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u022f\n$\f$\16$\u0232\13$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0242\n%\f%\16%\u0245\13%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u025a\n&\f&\16"+
		"&\u025d\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7"+
		"\'\u026d\n\'\f\'\16\'\u0270\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5"+
		"(\u027e\n(\3)\3)\3)\3)\3)\7)\u0285\n)\f)\16)\u0288\13)\3)\3)\3)\3)\3)"+
		"\7)\u028f\n)\f)\16)\u0292\13)\3)\3)\3)\3)\3)\7)\u0299\n)\f)\16)\u029c"+
		"\13)\3)\3)\3)\3)\3)\7)\u02a3\n)\f)\16)\u02a6\13)\3)\3)\3)\3)\3)\7)\u02ad"+
		"\n)\f)\16)\u02b0\13)\3)\3)\3)\3)\3)\7)\u02b7\n)\f)\16)\u02ba\13)\3)\3"+
		")\3)\3)\3)\7)\u02c1\n)\f)\16)\u02c4\13)\3)\3)\3)\3)\3)\7)\u02cb\n)\f)"+
		"\16)\u02ce\13)\3)\3)\3)\3)\3)\3)\3)\7)\u02d7\n)\f)\16)\u02da\13)\3)\3"+
		")\3)\5)\u02df\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02ed\n*\3+\3"+
		"+\3+\3+\3+\3+\7+\u02f5\n+\f+\16+\u02f8\13+\3,\3,\3,\3,\3-\3-\3-\3-\6-"+
		"\u0302\n-\r-\16-\u0303\5-\u0306\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0311"+
		"\n.\3/\3/\3/\3/\3/\3/\5/\u0319\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0330"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0349\n\63\f\63"+
		"\16\63\u034c\13\63\3\63\3\63\3\63\3\63\5\63\u0352\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0364\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u036f\n"+
		"\66\3\66\3\66\5\66\u0373\n\66\3\66\3\66\3\66\5\66\u0378\n\66\3\66\3\66"+
		"\5\66\u037c\n\66\3\66\3\66\5\66\u0380\n\66\3\66\5\66\u0383\n\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0393"+
		"\n\67\38\38\38\38\38\38\58\u039b\n8\38\38\38\39\39\39\59\u03a3\n9\39\3"+
		"9\39\59\u03a8\n9\39\39\39\3:\3:\3:\3:\3:\3:\5:\u03b3\n:\3;\3;\3;\3;\6"+
		";\u03b9\n;\r;\16;\u03ba\5;\u03bd\n;\3<\3<\3<\3<\3<\7<\u03c4\n<\f<\16<"+
		"\u03c7\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03da"+
		"\n=\3=\2\16 \60:<>@BDFHJL>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\2\2\u0421\2{\3\2"+
		"\2\2\4\u0083\3\2\2\2\6\u0093\3\2\2\2\b\u0095\3\2\2\2\n\u009b\3\2\2\2\f"+
		"\u00a7\3\2\2\2\16\u00a9\3\2\2\2\20\u00ae\3\2\2\2\22\u00b3\3\2\2\2\24\u00b9"+
		"\3\2\2\2\26\u00c6\3\2\2\2\30\u00c8\3\2\2\2\32\u00db\3\2\2\2\34\u00ee\3"+
		"\2\2\2\36\u00f0\3\2\2\2 \u00f3\3\2\2\2\"\u0107\3\2\2\2$\u0111\3\2\2\2"+
		"&\u0121\3\2\2\2(\u0139\3\2\2\2*\u013b\3\2\2\2,\u015a\3\2\2\2.\u0168\3"+
		"\2\2\2\60\u0171\3\2\2\2\62\u0198\3\2\2\2\64\u01a4\3\2\2\2\66\u01b0\3\2"+
		"\2\28\u01b2\3\2\2\2:\u01bd\3\2\2\2<\u01cb\3\2\2\2>\u01d9\3\2\2\2@\u01e7"+
		"\3\2\2\2B\u01f5\3\2\2\2D\u0203\3\2\2\2F\u0216\3\2\2\2H\u0233\3\2\2\2J"+
		"\u0246\3\2\2\2L\u025e\3\2\2\2N\u027d\3\2\2\2P\u02de\3\2\2\2R\u02ec\3\2"+
		"\2\2T\u02ee\3\2\2\2V\u02f9\3\2\2\2X\u0305\3\2\2\2Z\u0310\3\2\2\2\\\u0312"+
		"\3\2\2\2^\u032f\3\2\2\2`\u0331\3\2\2\2b\u0336\3\2\2\2d\u033a\3\2\2\2f"+
		"\u0363\3\2\2\2h\u0365\3\2\2\2j\u0382\3\2\2\2l\u0392\3\2\2\2n\u0394\3\2"+
		"\2\2p\u03a2\3\2\2\2r\u03b2\3\2\2\2t\u03bc\3\2\2\2v\u03be\3\2\2\2x\u03d9"+
		"\3\2\2\2z|\5\4\3\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\2\2\3~\177\b\2\1"+
		"\2\177\3\3\2\2\2\u0080\u0081\5\6\4\2\u0081\u0082\b\3\1\2\u0082\u0084\3"+
		"\2\2\2\u0083\u0080\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\5\3\2\2\2\u0087\u0088\5\n\6\2\u0088\u0089\b\4\1\2"+
		"\u0089\u0094\3\2\2\2\u008a\u008b\5\f\7\2\u008b\u008c\b\4\1\2\u008c\u0094"+
		"\3\2\2\2\u008d\u008e\5x=\2\u008e\u008f\b\4\1\2\u008f\u0094\3\2\2\2\u0090"+
		"\u0091\5\b\5\2\u0091\u0092\b\4\1\2\u0092\u0094\3\2\2\2\u0093\u0087\3\2"+
		"\2\2\u0093\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094"+
		"\7\3\2\2\2\u0095\u0096\5 \21\2\u0096\u0097\7E\2\2\u0097\u0098\5$\23\2"+
		"\u0098\u0099\7%\2\2\u0099\u009a\b\5\1\2\u009a\t\3\2\2\2\u009b\u009c\5"+
		"P)\2\u009c\u009d\7\24\2\2\u009d\u009e\5R*\2\u009e\u009f\5`\61\2\u009f"+
		"\u00a0\b\6\1\2\u00a0\13\3\2\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\b\7\1"+
		"\2\u00a3\u00a8\3\2\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\b\7\1\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\r\3\2\2\2"+
		"\u00a9\u00aa\5p9\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7%\2\2\u00ac\u00ad"+
		"\b\b\1\2\u00ad\17\3\2\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\5\30\r\2\u00b0"+
		"\u00b1\7%\2\2\u00b1\u00b2\b\t\1\2\u00b2\21\3\2\2\2\u00b3\u00b4\5\26\f"+
		"\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7#\2\2\u00b7"+
		"\u00b8\b\n\1\2\u00b8\23\3\2\2\2\u00b9\u00ba\5P)\2\u00ba\u00bb\b\13\1\2"+
		"\u00bb\25\3\2\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00c7\b\f\1\2\u00be\u00bf"+
		"\7\35\2\2\u00bf\u00c7\b\f\1\2\u00c0\u00c1\7\37\2\2\u00c1\u00c7\b\f\1\2"+
		"\u00c2\u00c3\7\36\2\2\u00c3\u00c7\b\f\1\2\u00c4\u00c5\7 \2\2\u00c5\u00c7"+
		"\b\f\1\2\u00c6\u00bc\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\5\32\16"+
		"\2\u00c9\u00d0\b\r\1\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\5\32\16\2\u00cc"+
		"\u00cd\b\r\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\16\1\2\u00d5\u00dc\3\2\2\2"+
		"\u00d6\u00d7\5 \21\2\u00d7\u00d8\7E\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da"+
		"\b\16\1\2\u00da\u00dc\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d6\3\2\2\2"+
		"\u00dc\33\3\2\2\2\u00dd\u00de\7/\2\2\u00de\u00e2\b\17\1\2\u00df\u00e0"+
		"\5\36\20\2\u00e0\u00e1\b\17\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2"+
		"\2\u00e2\u00e3\3\2\2\2\u00e3\u00ef\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5\u00e9"+
		"\b\17\1\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\b\17\1\2\u00e8\u00ea\3\2\2"+
		"\2\u00e9\u00e6\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\5\34\17\2\u00ec\u00ed\b\17\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00dd\3\2\2"+
		"\2\u00ee\u00e4\3\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1\u00f2"+
		"\b\20\1\2\u00f2\37\3\2\2\2\u00f3\u00f4\b\21\1\2\u00f4\u00f5\7\24\2\2\u00f5"+
		"\u00f6\b\21\1\2\u00f6\u00ff\3\2\2\2\u00f7\u00f8\f\3\2\2\u00f8\u00f9\7"+
		"\'\2\2\u00f9\u00fa\5\"\22\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\b\21\1\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100!\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103"+
		"\7\30\2\2\u0103\u0108\b\22\1\2\u0104\u0105\7\24\2\2\u0105\u0108\b\22\1"+
		"\2\u0106\u0108\b\22\1\2\u0107\u0102\3\2\2\2\u0107\u0104\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108#\3\2\2\2\u0109\u010a\5&\24\2\u010a\u010b\b\23\1\2"+
		"\u010b\u0112\3\2\2\2\u010c\u010d\7)\2\2\u010d\u010e\5\62\32\2\u010e\u010f"+
		"\7*\2\2\u010f\u0110\b\23\1\2\u0110\u0112\3\2\2\2\u0111\u0109\3\2\2\2\u0111"+
		"\u010c\3\2\2\2\u0112%\3\2\2\2\u0113\u0114\5*\26\2\u0114\u0115\b\24\1\2"+
		"\u0115\u0122\3\2\2\2\u0116\u0117\5,\27\2\u0117\u0118\5(\25\2\u0118\u0119"+
		"\5&\24\2\u0119\u011a\b\24\1\2\u011a\u0122\3\2\2\2\u011b\u011c\5\66\34"+
		"\2\u011c\u011d\b\24\1\2\u011d\u0122\3\2\2\2\u011e\u011f\5n8\2\u011f\u0120"+
		"\b\24\1\2\u0120\u0122\3\2\2\2\u0121\u0113\3\2\2\2\u0121\u0116\3\2\2\2"+
		"\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122\'\3\2\2\2\u0123\u0124\7"+
		"E\2\2\u0124\u013a\b\25\1\2\u0125\u0126\7C\2\2\u0126\u013a\b\25\1\2\u0127"+
		"\u0128\7B\2\2\u0128\u013a\b\25\1\2\u0129\u012a\7?\2\2\u012a\u013a\b\25"+
		"\1\2\u012b\u012c\7@\2\2\u012c\u013a\b\25\1\2\u012d\u012e\7A\2\2\u012e"+
		"\u013a\b\25\1\2\u012f\u0130\7M\2\2\u0130\u013a\b\25\1\2\u0131\u0132\7"+
		"L\2\2\u0132\u013a\b\25\1\2\u0133\u0134\7I\2\2\u0134\u013a\b\25\1\2\u0135"+
		"\u0136\7K\2\2\u0136\u013a\b\25\1\2\u0137\u0138\7J\2\2\u0138\u013a\b\25"+
		"\1\2\u0139\u0123\3\2\2\2\u0139\u0125\3\2\2\2\u0139\u0127\3\2\2\2\u0139"+
		"\u0129\3\2\2\2\u0139\u012b\3\2\2\2\u0139\u012d\3\2\2\2\u0139\u012f\3\2"+
		"\2\2\u0139\u0131\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0135\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a)\3\2\2\2\u013b\u013c\5:\36\2\u013c\u013d\b\26\1\2"+
		"\u013d+\3\2\2\2\u013e\u013f\5\60\31\2\u013f\u0140\b\27\1\2\u0140\u015b"+
		"\3\2\2\2\u0141\u0142\79\2\2\u0142\u0143\5,\27\2\u0143\u0144\b\27\1\2\u0144"+
		"\u015b\3\2\2\2\u0145\u0146\7:\2\2\u0146\u0147\5,\27\2\u0147\u0148\b\27"+
		"\1\2\u0148\u015b\3\2\2\2\u0149\u014a\5.\30\2\u014a\u014b\5N(\2\u014b\u014c"+
		"\b\27\1\2\u014c\u015b\3\2\2\2\u014d\u014e\7\20\2\2\u014e\u014f\5,\27\2"+
		"\u014f\u0150\b\27\1\2\u0150\u015b\3\2\2\2\u0151\u0152\7\20\2\2\u0152\u0153"+
		"\7\"\2\2\u0153\u0154\5P)\2\u0154\u0155\7#\2\2\u0155\u0156\b\27\1\2\u0156"+
		"\u015b\3\2\2\2\u0157\u0158\7=\2\2\u0158\u0159\7\24\2\2\u0159\u015b\b\27"+
		"\1\2\u015a\u013e\3\2\2\2\u015a\u0141\3\2\2\2\u015a\u0145\3\2\2\2\u015a"+
		"\u0149\3\2\2\2\u015a\u014d\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0157\3\2"+
		"\2\2\u015b-\3\2\2\2\u015c\u015d\7\64\2\2\u015d\u0169\b\30\1\2\u015e\u015f"+
		"\7/\2\2\u015f\u0169\b\30\1\2\u0160\u0161\7-\2\2\u0161\u0169\b\30\1\2\u0162"+
		"\u0163\7.\2\2\u0163\u0169\b\30\1\2\u0164\u0165\7\67\2\2\u0165\u0169\b"+
		"\30\1\2\u0166\u0167\78\2\2\u0167\u0169\b\30\1\2\u0168\u015c\3\2\2\2\u0168"+
		"\u015e\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0164\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169/\3\2\2\2\u016a\u016b\b\31\1\2\u016b\u016c"+
		"\5\64\33\2\u016c\u016d\b\31\1\2\u016d\u0172\3\2\2\2\u016e\u016f\5n8\2"+
		"\u016f\u0170\b\31\1\2\u0170\u0172\3\2\2\2\u0171\u016a\3\2\2\2\u0171\u016e"+
		"\3\2\2\2\u0172\u0189\3\2\2\2\u0173\u0174\f\7\2\2\u0174\u0175\7\'\2\2\u0175"+
		"\u0176\5&\24\2\u0176\u0177\7(\2\2\u0177\u0178\b\31\1\2\u0178\u0188\3\2"+
		"\2\2\u0179\u017a\f\6\2\2\u017a\u017b\7+\2\2\u017b\u017c\7\24\2\2\u017c"+
		"\u0188\b\31\1\2\u017d\u017e\f\5\2\2\u017e\u017f\7,\2\2\u017f\u0180\7\24"+
		"\2\2\u0180\u0188\b\31\1\2\u0181\u0182\f\4\2\2\u0182\u0183\79\2\2\u0183"+
		"\u0188\b\31\1\2\u0184\u0185\f\3\2\2\u0185\u0186\7:\2\2\u0186\u0188\b\31"+
		"\1\2\u0187\u0173\3\2\2\2\u0187\u0179\3\2\2\2\u0187\u017d\3\2\2\2\u0187"+
		"\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\61\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0199"+
		"\3\2\2\2\u018d\u018e\5&\24\2\u018e\u0195\b\32\1\2\u018f\u0190\7&\2\2\u0190"+
		"\u0191\5&\24\2\u0191\u0192\b\32\1\2\u0192\u0194\3\2\2\2\u0193\u018f\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u018d\3\2"+
		"\2\2\u0199\63\3\2\2\2\u019a\u019b\7\24\2\2\u019b\u01a5\b\33\1\2\u019c"+
		"\u019d\5\66\34\2\u019d\u019e\b\33\1\2\u019e\u01a5\3\2\2\2\u019f\u01a0"+
		"\7\"\2\2\u01a0\u01a1\5&\24\2\u01a1\u01a2\7#\2\2\u01a2\u01a3\b\33\1\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u019a\3\2\2\2\u01a4\u019c\3\2\2\2\u01a4\u019f\3\2"+
		"\2\2\u01a5\65\3\2\2\2\u01a6\u01a7\7\30\2\2\u01a7\u01b1\b\34\1\2\u01a8"+
		"\u01a9\7\31\2\2\u01a9\u01b1\b\34\1\2\u01aa\u01ab\7\32\2\2\u01ab\u01b1"+
		"\b\34\1\2\u01ac\u01ad\7\26\2\2\u01ad\u01b1\b\34\1\2\u01ae\u01af\7\27\2"+
		"\2\u01af\u01b1\b\34\1\2\u01b0\u01a6\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0"+
		"\u01aa\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\67\3\2\2"+
		"\2\u01b2\u01b3\5&\24\2\u01b3\u01ba\b\35\1\2\u01b4\u01b5\7&\2\2\u01b5\u01b6"+
		"\5&\24\2\u01b6\u01b7\b\35\1\2\u01b7\u01b9\3\2\2\2\u01b8\u01b4\3\2\2\2"+
		"\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb9\3"+
		"\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\b\36\1\2\u01be\u01bf\5<\37\2\u01bf"+
		"\u01c0\b\36\1\2\u01c0\u01c8\3\2\2\2\u01c1\u01c2\f\3\2\2\u01c2\u01c3\7"+
		">\2\2\u01c3\u01c4\5<\37\2\u01c4\u01c5\b\36\1\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c1\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9;\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\b\37\1\2\u01cc\u01cd"+
		"\5@!\2\u01cd\u01ce\b\37\1\2\u01ce\u01d6\3\2\2\2\u01cf\u01d0\f\3\2\2\u01d0"+
		"\u01d1\7=\2\2\u01d1\u01d2\5@!\2\u01d2\u01d3\b\37\1\2\u01d3\u01d5\3\2\2"+
		"\2\u01d4\u01cf\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7=\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\b \1\2\u01da\u01db"+
		"\5B\"\2\u01db\u01dc\b \1\2\u01dc\u01e4\3\2\2\2\u01dd\u01de\f\3\2\2\u01de"+
		"\u01df\7\66\2\2\u01df\u01e0\5B\"\2\u01e0\u01e1\b \1\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01dd\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5?\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\b!\1\2\u01e8"+
		"\u01e9\5> \2\u01e9\u01ea\b!\1\2\u01ea\u01f2\3\2\2\2\u01eb\u01ec\f\3\2"+
		"\2\u01ec\u01ed\7\65\2\2\u01ed\u01ee\5> \2\u01ee\u01ef\b!\1\2\u01ef\u01f1"+
		"\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3A\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\b\"\1\2"+
		"\u01f6\u01f7\5D#\2\u01f7\u01f8\b\"\1\2\u01f8\u0200\3\2\2\2\u01f9\u01fa"+
		"\f\3\2\2\u01fa\u01fb\7\64\2\2\u01fb\u01fc\5D#\2\u01fc\u01fd\b\"\1\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201C\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204"+
		"\b#\1\2\u0204\u0205\5F$\2\u0205\u0206\b#\1\2\u0206\u0213\3\2\2\2\u0207"+
		"\u0208\f\4\2\2\u0208\u0209\7D\2\2\u0209\u020a\5F$\2\u020a\u020b\b#\1\2"+
		"\u020b\u0212\3\2\2\2\u020c\u020d\f\3\2\2\u020d\u020e\7F\2\2\u020e\u020f"+
		"\5F$\2\u020f\u0210\b#\1\2\u0210\u0212\3\2\2\2\u0211\u0207\3\2\2\2\u0211"+
		"\u020c\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214E\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\b$\1\2\u0217\u0218"+
		"\5H%\2\u0218\u0219\b$\1\2\u0219\u0230\3\2\2\2\u021a\u021b\f\6\2\2\u021b"+
		"\u021c\7\62\2\2\u021c\u021d\5H%\2\u021d\u021e\b$\1\2\u021e\u022f\3\2\2"+
		"\2\u021f\u0220\f\5\2\2\u0220\u0221\7\63\2\2\u0221\u0222\5H%\2\u0222\u0223"+
		"\b$\1\2\u0223\u022f\3\2\2\2\u0224\u0225\f\4\2\2\u0225\u0226\7G\2\2\u0226"+
		"\u0227\5H%\2\u0227\u0228\b$\1\2\u0228\u022f\3\2\2\2\u0229\u022a\f\3\2"+
		"\2\u022a\u022b\7H\2\2\u022b\u022c\5H%\2\u022c\u022d\b$\1\2\u022d\u022f"+
		"\3\2\2\2\u022e\u021a\3\2\2\2\u022e\u021f\3\2\2\2\u022e\u0224\3\2\2\2\u022e"+
		"\u0229\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231G\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\b%\1\2\u0234\u0235"+
		"\5L\'\2\u0235\u0236\b%\1\2\u0236\u0243\3\2\2\2\u0237\u0238\f\4\2\2\u0238"+
		"\u0239\7;\2\2\u0239\u023a\5L\'\2\u023a\u023b\b%\1\2\u023b\u0242\3\2\2"+
		"\2\u023c\u023d\f\3\2\2\u023d\u023e\7<\2\2\u023e\u023f\5L\'\2\u023f\u0240"+
		"\b%\1\2\u0240\u0242\3\2\2\2\u0241\u0237\3\2\2\2\u0241\u023c\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244I\3\2\2\2"+
		"\u0245\u0243\3\2\2\2\u0246\u0247\b&\1\2\u0247\u0248\5N(\2\u0248\u0249"+
		"\b&\1\2\u0249\u025b\3\2\2\2\u024a\u024b\f\5\2\2\u024b\u024c\7/\2\2\u024c"+
		"\u024d\5N(\2\u024d\u024e\b&\1\2\u024e\u025a\3\2\2\2\u024f\u0250\f\4\2"+
		"\2\u0250\u0251\7\60\2\2\u0251\u0252\5N(\2\u0252\u0253\b&\1\2\u0253\u025a"+
		"\3\2\2\2\u0254\u0255\f\3\2\2\u0255\u0256\7\61\2\2\u0256\u0257\5N(\2\u0257"+
		"\u0258\b&\1\2\u0258\u025a\3\2\2\2\u0259\u024a\3\2\2\2\u0259\u024f\3\2"+
		"\2\2\u0259\u0254\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025cK\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\b\'\1\2"+
		"\u025f\u0260\5J&\2\u0260\u0261\b\'\1\2\u0261\u026e\3\2\2\2\u0262\u0263"+
		"\f\4\2\2\u0263\u0264\7-\2\2\u0264\u0265\5J&\2\u0265\u0266\b\'\1\2\u0266"+
		"\u026d\3\2\2\2\u0267\u0268\f\3\2\2\u0268\u0269\7.\2\2\u0269\u026a\5J&"+
		"\2\u026a\u026b\b\'\1\2\u026b\u026d\3\2\2\2\u026c\u0262\3\2\2\2\u026c\u0267"+
		"\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"M\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\7\"\2\2\u0272\u0273\5P)\2\u0273"+
		"\u0274\7#\2\2\u0274\u0275\5N(\2\u0275\u0276\b(\1\2\u0276\u027e\3\2\2\2"+
		"\u0277\u0278\5,\27\2\u0278\u0279\b(\1\2\u0279\u027e\3\2\2\2\u027a\u027b"+
		"\5\66\34\2\u027b\u027c\b(\1\2\u027c\u027e\3\2\2\2\u027d\u0271\3\2\2\2"+
		"\u027d\u0277\3\2\2\2\u027d\u027a\3\2\2\2\u027eO\3\2\2\2\u027f\u0280\7"+
		"\3\2\2\u0280\u0286\b)\1\2\u0281\u0282\5\34\17\2\u0282\u0283\b)\1\2\u0283"+
		"\u0285\3\2\2\2\u0284\u0281\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u02df\3\2\2\2\u0288\u0286\3\2\2\2\u0289"+
		"\u028a\7\b\2\2\u028a\u0290\b)\1\2\u028b\u028c\5\34\17\2\u028c\u028d\b"+
		")\1\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u02df\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0294\7\7\2\2\u0294\u029a\b)\1\2\u0295\u0296\5\34\17\2\u0296"+
		"\u0297\b)\1\2\u0297\u0299\3\2\2\2\u0298\u0295\3\2\2\2\u0299\u029c\3\2"+
		"\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02df\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d\u029e\7\4\2\2\u029e\u02a4\b)\1\2\u029f\u02a0\5\34"+
		"\17\2\u02a0\u02a1\b)\1\2\u02a1\u02a3\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02df\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\7\5\2\2\u02a8\u02ae\b)\1\2\u02a9"+
		"\u02aa\5\34\17\2\u02aa\u02ab\b)\1\2\u02ab\u02ad\3\2\2\2\u02ac\u02a9\3"+
		"\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02df\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\7\6\2\2\u02b2\u02b8\b)"+
		"\1\2\u02b3\u02b4\5\34\17\2\u02b4\u02b5\b)\1\2\u02b5\u02b7\3\2\2\2\u02b6"+
		"\u02b3\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02df\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7\t\2\2\u02bc"+
		"\u02c2\b)\1\2\u02bd\u02be\5\34\17\2\u02be\u02bf\b)\1\2\u02bf\u02c1\3\2"+
		"\2\2\u02c0\u02bd\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02df\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\7\25"+
		"\2\2\u02c6\u02cc\b)\1\2\u02c7\u02c8\5\34\17\2\u02c8\u02c9\b)\1\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02c7\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02df\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02d0\7\33\2\2\u02d0\u02d1\b)\1\2\u02d1\u02d2\7\24\2\2\u02d2\u02d8\b"+
		")\1\2\u02d3\u02d4\5\34\17\2\u02d4\u02d5\b)\1\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02d3\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02df\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\5\22\n\2\u02dc"+
		"\u02dd\b)\1\2\u02dd\u02df\3\2\2\2\u02de\u027f\3\2\2\2\u02de\u0289\3\2"+
		"\2\2\u02de\u0293\3\2\2\2\u02de\u029d\3\2\2\2\u02de\u02a7\3\2\2\2\u02de"+
		"\u02b1\3\2\2\2\u02de\u02bb\3\2\2\2\u02de\u02c5\3\2\2\2\u02de\u02cf\3\2"+
		"\2\2\u02de\u02db\3\2\2\2\u02dfQ\3\2\2\2\u02e0\u02e1\7\"\2\2\u02e1\u02e2"+
		"\5T+\2\u02e2\u02e3\7#\2\2\u02e3\u02e4\b*\1\2\u02e4\u02ed\3\2\2\2\u02e5"+
		"\u02e6\7\"\2\2\u02e6\u02e7\7#\2\2\u02e7\u02ed\b*\1\2\u02e8\u02e9\7\"\2"+
		"\2\u02e9\u02ea\7\3\2\2\u02ea\u02eb\7#\2\2\u02eb\u02ed\b*\1\2\u02ec\u02e0"+
		"\3\2\2\2\u02ec\u02e5\3\2\2\2\u02ec\u02e8\3\2\2\2\u02edS\3\2\2\2\u02ee"+
		"\u02ef\5V,\2\u02ef\u02f6\b+\1\2\u02f0\u02f1\7&\2\2\u02f1\u02f2\5V,\2\u02f2"+
		"\u02f3\b+\1\2\u02f3\u02f5\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f5\u02f8\3\2"+
		"\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7U\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f9\u02fa\5P)\2\u02fa\u02fb\5 \21\2\u02fb\u02fc\b,\1\2\u02fc"+
		"W\3\2\2\2\u02fd\u0306\3\2\2\2\u02fe\u02ff\5Z.\2\u02ff\u0300\b-\1\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02fe\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0301\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u02fd\3\2\2\2\u0305"+
		"\u0301\3\2\2\2\u0306Y\3\2\2\2\u0307\u0308\5^\60\2\u0308\u0309\b.\1\2\u0309"+
		"\u0311\3\2\2\2\u030a\u030b\5\f\7\2\u030b\u030c\b.\1\2\u030c\u0311\3\2"+
		"\2\2\u030d\u030e\5\\/\2\u030e\u030f\b.\1\2\u030f\u0311\3\2\2\2\u0310\u0307"+
		"\3\2\2\2\u0310\u030a\3\2\2\2\u0310\u030d\3\2\2\2\u0311[\3\2\2\2\u0312"+
		"\u0313\7\24\2\2\u0313\u0314\b/\1\2\u0314\u0318\7\"\2\2\u0315\u0316\5\62"+
		"\32\2\u0316\u0317\b/\1\2\u0317\u0319\3\2\2\2\u0318\u0315\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\7#\2\2\u031b\u031c\7%\2"+
		"\2\u031c]\3\2\2\2\u031d\u031e\5`\61\2\u031e\u031f\b\60\1\2\u031f\u0330"+
		"\3\2\2\2\u0320\u0321\5b\62\2\u0321\u0322\b\60\1\2\u0322\u0330\3\2\2\2"+
		"\u0323\u0324\5f\64\2\u0324\u0325\b\60\1\2\u0325\u0330\3\2\2\2\u0326\u0327"+
		"\5h\65\2\u0327\u0328\b\60\1\2\u0328\u0330\3\2\2\2\u0329\u032a\5d\63\2"+
		"\u032a\u032b\b\60\1\2\u032b\u0330\3\2\2\2\u032c\u032d\5l\67\2\u032d\u032e"+
		"\b\60\1\2\u032e\u0330\3\2\2\2\u032f\u031d\3\2\2\2\u032f\u0320\3\2\2\2"+
		"\u032f\u0323\3\2\2\2\u032f\u0326\3\2\2\2\u032f\u0329\3\2\2\2\u032f\u032c"+
		"\3\2\2\2\u0330_\3\2\2\2\u0331\u0332\7)\2\2\u0332\u0333\5X-\2\u0333\u0334"+
		"\7*\2\2\u0334\u0335\b\61\1\2\u0335a\3\2\2\2\u0336\u0337\5&\24\2\u0337"+
		"\u0338\7%\2\2\u0338\u0339\b\62\1\2\u0339c\3\2\2\2\u033a\u033b\7N\2\2\u033b"+
		"\u033c\7\"\2\2\u033c\u033d\5&\24\2\u033d\u033e\7#\2\2\u033e\u033f\5^\60"+
		"\2\u033f\u034a\b\63\1\2\u0340\u0341\7O\2\2\u0341\u0342\7N\2\2\u0342\u0343"+
		"\7\"\2\2\u0343\u0344\5&\24\2\u0344\u0345\7#\2\2\u0345\u0346\5^\60\2\u0346"+
		"\u0347\b\63\1\2\u0347\u0349\3\2\2\2\u0348\u0340\3\2\2\2\u0349\u034c\3"+
		"\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0351\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034d\u034e\7O\2\2\u034e\u034f\5^\60\2\u034f\u0350\b\63"+
		"\1\2\u0350\u0352\3\2\2\2\u0351\u034d\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"e\3\2\2\2\u0353\u0354\7Q\2\2\u0354\u0355\7\"\2\2\u0355\u0356\5&\24\2\u0356"+
		"\u0357\7#\2\2\u0357\u0358\5^\60\2\u0358\u0359\b\64\1\2\u0359\u0364\3\2"+
		"\2\2\u035a\u035b\7P\2\2\u035b\u035c\5^\60\2\u035c\u035d\7Q\2\2\u035d\u035e"+
		"\7\"\2\2\u035e\u035f\5&\24\2\u035f\u0360\7#\2\2\u0360\u0361\7%\2\2\u0361"+
		"\u0362\b\64\1\2\u0362\u0364\3\2\2\2\u0363\u0353\3\2\2\2\u0363\u035a\3"+
		"\2\2\2\u0364g\3\2\2\2\u0365\u0366\7U\2\2\u0366\u0367\7\"\2\2\u0367\u0368"+
		"\5j\66\2\u0368\u0369\7#\2\2\u0369\u036a\5^\60\2\u036a\u036b\b\65\1\2\u036b"+
		"i\3\2\2\2\u036c\u036e\5\f\7\2\u036d\u036f\5\62\32\2\u036e\u036d\3\2\2"+
		"\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\7%\2\2\u0371\u0373"+
		"\5\62\32\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2"+
		"\u0374\u0375\b\66\1\2\u0375\u0383\3\2\2\2\u0376\u0378\5\62\32\2\u0377"+
		"\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\7%"+
		"\2\2\u037a\u037c\5\62\32\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u037f\7%\2\2\u037e\u0380\5\62\32\2\u037f\u037e\3"+
		"\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\b\66\1\2\u0382"+
		"\u036c\3\2\2\2\u0382\u0377\3\2\2\2\u0383k\3\2\2\2\u0384\u0385\7\f\2\2"+
		"\u0385\u0386\7%\2\2\u0386\u0393\b\67\1\2\u0387\u0388\7\16\2\2\u0388\u0389"+
		"\7%\2\2\u0389\u0393\b\67\1\2\u038a\u038b\7\r\2\2\u038b\u038c\7%\2\2\u038c"+
		"\u0393\b\67\1\2\u038d\u038e\7\r\2\2\u038e\u038f\5&\24\2\u038f\u0390\7"+
		"%\2\2\u0390\u0391\b\67\1\2\u0391\u0393\3\2\2\2\u0392\u0384\3\2\2\2\u0392"+
		"\u0387\3\2\2\2\u0392\u038a\3\2\2\2\u0392\u038d\3\2\2\2\u0393m\3\2\2\2"+
		"\u0394\u0395\7\24\2\2\u0395\u0396\b8\1\2\u0396\u039a\7\"\2\2\u0397\u0398"+
		"\5\62\32\2\u0398\u0399\b8\1\2\u0399\u039b\3\2\2\2\u039a\u0397\3\2\2\2"+
		"\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\7#\2\2\u039d\u039e"+
		"\b8\1\2\u039eo\3\2\2\2\u039f\u03a0\5r:\2\u03a0\u03a1\b9\1\2\u03a1\u03a3"+
		"\3\2\2\2\u03a2\u039f\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a7\3\2\2\2\u03a4"+
		"\u03a5\5\36\20\2\u03a5\u03a6\b9\1\2\u03a6\u03a8\3\2\2\2\u03a7\u03a4\3"+
		"\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\5P)\2\u03aa"+
		"\u03ab\b9\1\2\u03abq\3\2\2\2\u03ac\u03ad\7\17\2\2\u03ad\u03b3\b:\1\2\u03ae"+
		"\u03af\7\21\2\2\u03af\u03b3\b:\1\2\u03b0\u03b1\7\22\2\2\u03b1\u03b3\b"+
		":\1\2\u03b2\u03ac\3\2\2\2\u03b2\u03ae\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3"+
		"s\3\2\2\2\u03b4\u03bd\3\2\2\2\u03b5\u03b6\5\f\7\2\u03b6\u03b7\b;\1\2\u03b7"+
		"\u03b9\3\2\2\2\u03b8\u03b5\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03b8\3\2"+
		"\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03b4\3\2\2\2\u03bc"+
		"\u03b8\3\2\2\2\u03bdu\3\2\2\2\u03be\u03bf\7\24\2\2\u03bf\u03c5\b<\1\2"+
		"\u03c0\u03c1\7&\2\2\u03c1\u03c2\7\24\2\2\u03c2\u03c4\b<\1\2\u03c3\u03c0"+
		"\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"w\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\7\33\2\2\u03c9\u03ca\7\24\2"+
		"\2\u03ca\u03cb\7)\2\2\u03cb\u03cc\5t;\2\u03cc\u03cd\7*\2\2\u03cd\u03ce"+
		"\7%\2\2\u03ce\u03cf\b=\1\2\u03cf\u03da\3\2\2\2\u03d0\u03d1\7\33\2\2\u03d1"+
		"\u03d2\7\24\2\2\u03d2\u03d3\7)\2\2\u03d3\u03d4\5t;\2\u03d4\u03d5\7*\2"+
		"\2\u03d5\u03d6\5v<\2\u03d6\u03d7\7%\2\2\u03d7\u03d8\b=\1\2\u03d8\u03da"+
		"\3\2\2\2\u03d9\u03c8\3\2\2\2\u03d9\u03d0\3\2\2\2\u03day\3\2\2\2N{\u0085"+
		"\u0093\u00a7\u00c6\u00d0\u00db\u00e2\u00e9\u00ee\u00ff\u0107\u0111\u0121"+
		"\u0139\u015a\u0168\u0171\u0187\u0189\u0195\u0198\u01a4\u01b0\u01ba\u01c8"+
		"\u01d6\u01e4\u01f2\u0200\u0211\u0213\u022e\u0230\u0241\u0243\u0259\u025b"+
		"\u026c\u026e\u027d\u0286\u0290\u029a\u02a4\u02ae\u02b8\u02c2\u02cc\u02d8"+
		"\u02de\u02ec\u02f6\u0303\u0305\u0310\u0318\u032f\u034a\u0351\u0363\u036e"+
		"\u0372\u0377\u037b\u037f\u0382\u0392\u039a\u03a2\u03a7\u03b2\u03ba\u03bc"+
		"\u03c5\u03d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}