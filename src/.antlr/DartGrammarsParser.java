// Generated from c:\Users\User\Desktop\compiler\compiler\src\DartGrammars.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DartGrammarsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		IF=25, ELSE=26, SWITCH=27, CASE=28, DEFAULT=29, BREAK=30, CONTINUE=31, 
		WHILE=32, DO=33, FOR=34, FOREACH=35, FINAL=36, CONST=37, VAR=38, DYNAMIC=39, 
		VOID=40, INT=41, DOUBLE=42, STRING=43, LIST=44, BOOL=45, TRUE=46, FALSE=47, 
		OBJECT=48, FUNCTION=49, RETURN=50, LATE=51, REQUIRED=52, ASYNC=53, AWAIT=54, 
		CLASS=55, EXTENDS=56, INTERFACE=57, IMPLEMENTS=58, ABSTRACT=59, OVERRIDE=60, 
		THIS=61, STATIC=62, NEW=63, WS=64, COMMENT=65, MULTILINE_COMMENT=66, MATERIAL_APP=67, 
		TITLE=68, HOME=69, SCAFFOLD=70, BODY=71, BACKGROUND_COLOR=72, COLUMN=73, 
		ROW=74, MAIN_AXIS_ALIGNMENT=75, CROSS_AXIS_ALIGNMENT=76, TEXT=77, COLOR=78, 
		SIZE=79, STYLE=80, CONTAINER=81, SIZEDBOX=82, WIDTH=83, HEIGHT=84, MARGIN=85, 
		INK_WELL=86, IMAGE=87, FIT=88, BOX_FIT=89, STACK=90, STACK_FIT=91, BUTTON=92, 
		SCROLL_VIEW=93, SCROLL_DIRECTION=94, PADDING=95, VALUES=96, ZERO=97, ALL=98, 
		SYMMETRIC=99, COSTUME=100, LEFT=101, RIGHT=102, TOP=103, BOTTOM=104, CHILD=105, 
		CHILDREN=106, ON_TAP=107, COLORS=108, STYLES=109, ALIGNMENT=110, HORIZONTAL=111, 
		VERTICAL=112, COMMA=113, SEMICOLON=114, INT_NUM=115, DOUBLE_NUM=116, CHARACTERS=117, 
		ID=118;
	public static final int
		RULE_start = 0, RULE_number = 1, RULE_positive = 2, RULE_negative = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_condition = 6, RULE_comparison = 7, 
		RULE_ifStatement = 8, RULE_elseIf = 9, RULE_else = 10, RULE_switchStatement = 11, 
		RULE_switchBody = 12, RULE_case = 13, RULE_defaultCase = 14, RULE_caseBody = 15, 
		RULE_whileStatement = 16, RULE_doWhileStatement = 17, RULE_forStatement = 18, 
		RULE_initialCondition = 19, RULE_increment = 20, RULE_foreachStatement = 21, 
		RULE_type = 22, RULE_varOrType = 23, RULE_declaration = 24, RULE_initialization = 25, 
		RULE_assignment = 26, RULE_list = 27, RULE_listElement = 28, RULE_voidOrType = 29, 
		RULE_signature = 30, RULE_function = 31, RULE_unnamedFunction = 32, RULE_arguments = 33, 
		RULE_positionalNamedArguments = 34, RULE_positionalArguments = 35, RULE_namedArguments = 36, 
		RULE_arg = 37, RULE_functionBody = 38, RULE_returnStatement = 39, RULE_class = 40, 
		RULE_classBody = 41, RULE_attribute = 42, RULE_method = 43, RULE_methodBody = 44, 
		RULE_thisStatement = 45, RULE_defaultConstructer = 46, RULE_namedConstructer = 47, 
		RULE_consArguments = 48, RULE_consPositionalNamedArguments = 49, RULE_consPositionalArguments = 50, 
		RULE_consNamedArguments = 51, RULE_consArg = 52, RULE_functionCall = 53, 
		RULE_object = 54, RULE_parameters = 55, RULE_positionalNamedParameters = 56, 
		RULE_positionalParameters = 57, RULE_namedParameters = 58, RULE_parameter = 59, 
		RULE_expression = 60, RULE_component = 61, RULE_materialApp = 62, RULE_materialAppAtts = 63, 
		RULE_materialTitle = 64, RULE_materialHome = 65, RULE_scaffold = 66, RULE_scaffoldAtts = 67, 
		RULE_scaffoldBackground = 68, RULE_scaffoldBody = 69, RULE_column = 70, 
		RULE_row = 71, RULE_column_rowAtts = 72, RULE_mainAxis = 73, RULE_crossAxis = 74, 
		RULE_children = 75, RULE_stack = 76, RULE_stackAtts = 77, RULE_stackFit = 78, 
		RULE_text = 79, RULE_textAtts = 80, RULE_color = 81, RULE_textSize = 82, 
		RULE_textStyle = 83, RULE_container = 84, RULE_containerAtts = 85, RULE_width = 86, 
		RULE_height = 87, RULE_child = 88, RULE_sizedBox = 89, RULE_sizedBoxAtts = 90, 
		RULE_padding = 91, RULE_paddingAtts = 92, RULE_values = 93, RULE_horizontalOrVertical = 94, 
		RULE_costumeValues = 95, RULE_inkWell = 96, RULE_inkWellAtts = 97, RULE_onTap = 98, 
		RULE_image = 99, RULE_imageAtts = 100, RULE_imageFit = 101, RULE_button = 102, 
		RULE_buttonAtts = 103, RULE_scrollView = 104, RULE_scrollViewAtts = 105, 
		RULE_scrollDirection = 106;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "number", "positive", "negative", "block", "statement", "condition", 
			"comparison", "ifStatement", "elseIf", "else", "switchStatement", "switchBody", 
			"case", "defaultCase", "caseBody", "whileStatement", "doWhileStatement", 
			"forStatement", "initialCondition", "increment", "foreachStatement", 
			"type", "varOrType", "declaration", "initialization", "assignment", "list", 
			"listElement", "voidOrType", "signature", "function", "unnamedFunction", 
			"arguments", "positionalNamedArguments", "positionalArguments", "namedArguments", 
			"arg", "functionBody", "returnStatement", "class", "classBody", "attribute", 
			"method", "methodBody", "thisStatement", "defaultConstructer", "namedConstructer", 
			"consArguments", "consPositionalNamedArguments", "consPositionalArguments", 
			"consNamedArguments", "consArg", "functionCall", "object", "parameters", 
			"positionalNamedParameters", "positionalParameters", "namedParameters", 
			"parameter", "expression", "component", "materialApp", "materialAppAtts", 
			"materialTitle", "materialHome", "scaffold", "scaffoldAtts", "scaffoldBackground", 
			"scaffoldBody", "column", "row", "column_rowAtts", "mainAxis", "crossAxis", 
			"children", "stack", "stackAtts", "stackFit", "text", "textAtts", "color", 
			"textSize", "textStyle", "container", "containerAtts", "width", "height", 
			"child", "sizedBox", "sizedBoxAtts", "padding", "paddingAtts", "values", 
			"horizontalOrVertical", "costumeValues", "inkWell", "inkWellAtts", "onTap", 
			"image", "imageAtts", "imageFit", "button", "buttonAtts", "scrollView", 
			"scrollViewAtts", "scrollDirection"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'('", "')'", "':'", "'='", "'+='", "'-='", "'*='", "'/='", "'in'", "'.'", 
			"'['", "']'", "'*'", "'/'", "'+'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'break'", "'continue'", "'while'", "'do'", "'for'", "'foreach'", 
			"'final'", "'const'", "'var'", "'dynamic'", "'void'", "'int'", "'double'", 
			"'String'", "'List'", "'bool'", "'true'", "'false'", "'Object'", "'Function'", 
			"'return'", "'late'", "'required'", "'async'", "'await'", "'class'", 
			"'extends'", "'interface'", "'implements'", "'abstract'", "'@override'", 
			"'this'", "'static'", "'new'", null, null, null, "'MaterialApp'", "'title'", 
			"'home'", "'Scaffold'", "'body'", "'backgroundColor'", "'Column'", "'Row'", 
			"'mainAxisAlignment'", "'crossAxisAlignment'", "'Text'", "'color'", "'size'", 
			"'style'", "'Container'", "'SizedBox'", "'width'", "'height'", "'margin'", 
			"'InkWell'", "'Image'", "'fit'", null, "'Stack'", null, "'Button'", "'ScrollView'", 
			"'scrollDirection'", "'Padding'", "'values'", "'Values.zero'", "'Values.all'", 
			"'Values.symmetric'", "'Values.costume'", "'left'", "'right'", "'top'", 
			"'bottom'", "'child'", "'children'", "'onTap'", null, null, null, "'horizontal'", 
			"'vertical'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"WHILE", "DO", "FOR", "FOREACH", "FINAL", "CONST", "VAR", "DYNAMIC", 
			"VOID", "INT", "DOUBLE", "STRING", "LIST", "BOOL", "TRUE", "FALSE", "OBJECT", 
			"FUNCTION", "RETURN", "LATE", "REQUIRED", "ASYNC", "AWAIT", "CLASS", 
			"EXTENDS", "INTERFACE", "IMPLEMENTS", "ABSTRACT", "OVERRIDE", "THIS", 
			"STATIC", "NEW", "WS", "COMMENT", "MULTILINE_COMMENT", "MATERIAL_APP", 
			"TITLE", "HOME", "SCAFFOLD", "BODY", "BACKGROUND_COLOR", "COLUMN", "ROW", 
			"MAIN_AXIS_ALIGNMENT", "CROSS_AXIS_ALIGNMENT", "TEXT", "COLOR", "SIZE", 
			"STYLE", "CONTAINER", "SIZEDBOX", "WIDTH", "HEIGHT", "MARGIN", "INK_WELL", 
			"IMAGE", "FIT", "BOX_FIT", "STACK", "STACK_FIT", "BUTTON", "SCROLL_VIEW", 
			"SCROLL_DIRECTION", "PADDING", "VALUES", "ZERO", "ALL", "SYMMETRIC", 
			"COSTUME", "LEFT", "RIGHT", "TOP", "BOTTOM", "CHILD", "CHILDREN", "ON_TAP", 
			"COLORS", "STYLES", "ALIGNMENT", "HORIZONTAL", "VERTICAL", "COMMA", "SEMICOLON", 
			"INT_NUM", "DOUBLE_NUM", "CHARACTERS", "ID"
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
	public String getGrammarFileName() { return "DartGrammars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DartGrammarsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DartGrammarsParser.EOF, 0); }
		public List<ClassContext> class() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
				case ABSTRACT:
					{
					setState(214);
					class();
					}
					break;
				case DYNAMIC:
				case VOID:
				case INT:
				case DOUBLE:
				case STRING:
				case LIST:
				case BOOL:
				case OBJECT:
				case FUNCTION:
				case ID:
					{
					setState(215);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << CLASS) | (1L << ABSTRACT))) != 0) || _la==ID );
			setState(220);
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

	public static class NumberContext extends ParserRuleContext {
		public PositiveContext positive() {
			return getRuleContext(PositiveContext.class,0);
		}
		public NegativeContext negative() {
			return getRuleContext(NegativeContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUM:
			case DOUBLE_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				positive();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				negative();
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

	public static class PositiveContext extends ParserRuleContext {
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode DOUBLE_NUM() { return getToken(DartGrammarsParser.DOUBLE_NUM, 0); }
		public PositiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive; }
	}

	public final PositiveContext positive() throws RecognitionException {
		PositiveContext _localctx = new PositiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_positive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==INT_NUM || _la==DOUBLE_NUM) ) {
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

	public static class NegativeContext extends ParserRuleContext {
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode DOUBLE_NUM() { return getToken(DartGrammarsParser.DOUBLE_NUM, 0); }
		public NegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative; }
	}

	public final NegativeContext negative() throws RecognitionException {
		NegativeContext _localctx = new NegativeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_negative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__0);
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==INT_NUM || _la==DOUBLE_NUM) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__1);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << FOREACH) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << LATE) | (1L << AWAIT) | (1L << NEW))) != 0) || _la==ID) {
				{
				{
				setState(232);
				statement();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(T__2);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				doWhileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				foreachStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				declaration();
				setState(247);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				assignment();
				setState(250);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(253);
				functionCall();
				setState(254);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				object();
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

	public static class ConditionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(ID);
				setState(262);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(ID);
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(ID);
				setState(268);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				match(CHARACTERS);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DartGrammarsParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseContext else() {
			return getRuleContext(ElseContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IF);
			setState(273);
			match(T__9);
			setState(274);
			condition();
			setState(275);
			match(T__10);
			setState(276);
			block();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						elseIf();
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(283);
				else();
				}
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

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DartGrammarsParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(DartGrammarsParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ELSE);
			setState(287);
			match(IF);
			setState(288);
			match(T__9);
			setState(289);
			condition();
			setState(290);
			match(T__10);
			setState(291);
			block();
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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DartGrammarsParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ELSE);
			setState(294);
			block();
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
		public TerminalNode SWITCH() { return getToken(DartGrammarsParser.SWITCH, 0); }
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(SWITCH);
			setState(297);
			match(T__9);
			setState(298);
			match(ID);
			setState(299);
			match(T__10);
			setState(300);
			switchBody();
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

	public static class SwitchBodyContext extends ParserRuleContext {
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public List<CaseContext> case() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__1);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				case();
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(308);
			defaultCase();
			setState(309);
			match(T__2);
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

	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(DartGrammarsParser.CASE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CaseBodyContext caseBody() {
			return getRuleContext(CaseBodyContext.class,0);
		}
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_case);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(CASE);
				setState(312);
				number();
				setState(313);
				match(T__11);
				setState(314);
				caseBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(CASE);
				setState(317);
				match(CHARACTERS);
				setState(318);
				match(T__11);
				setState(319);
				caseBody();
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

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(DartGrammarsParser.DEFAULT, 0); }
		public CaseBodyContext caseBody() {
			return getRuleContext(CaseBodyContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(DEFAULT);
			setState(323);
			match(T__11);
			setState(324);
			caseBody();
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

	public static class CaseBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(DartGrammarsParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public CaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBody; }
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << FOREACH) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << LATE) | (1L << AWAIT) | (1L << NEW))) != 0) || _la==ID) {
				{
				{
				setState(326);
				statement();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(332);
				match(BREAK);
				setState(333);
				match(SEMICOLON);
				}
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
		public TerminalNode WHILE() { return getToken(DartGrammarsParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(WHILE);
			setState(337);
			match(T__9);
			setState(338);
			condition();
			setState(339);
			match(T__10);
			setState(340);
			block();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(DartGrammarsParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DartGrammarsParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(DO);
			setState(343);
			block();
			setState(344);
			match(WHILE);
			setState(345);
			match(T__9);
			setState(346);
			condition();
			setState(347);
			match(T__10);
			setState(348);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DartGrammarsParser.FOR, 0); }
		public InitialConditionContext initialCondition() {
			return getRuleContext(InitialConditionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DartGrammarsParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DartGrammarsParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(FOR);
			setState(351);
			match(T__9);
			setState(352);
			initialCondition();
			setState(353);
			match(SEMICOLON);
			setState(354);
			condition();
			setState(355);
			match(SEMICOLON);
			setState(356);
			increment();
			setState(357);
			match(T__10);
			setState(358);
			block();
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

	public static class InitialConditionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(DartGrammarsParser.VAR, 0); }
		public TerminalNode DOUBLE() { return getToken(DartGrammarsParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(DartGrammarsParser.INT, 0); }
		public InitialConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialCondition; }
	}

	public final InitialConditionContext initialCondition() throws RecognitionException {
		InitialConditionContext _localctx = new InitialConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initialCondition);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				match(ID);
				setState(362);
				match(T__12);
				setState(363);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(ID);
				setState(365);
				match(T__12);
				setState(366);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(ID);
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(372);
			expression(0);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(DartGrammarsParser.FOREACH, 0); }
		public VarOrTypeContext varOrType() {
			return getRuleContext(VarOrTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(FOREACH);
			setState(375);
			match(T__9);
			setState(376);
			varOrType();
			setState(377);
			match(ID);
			setState(378);
			match(T__17);
			setState(379);
			match(ID);
			setState(380);
			match(T__10);
			setState(381);
			block();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DartGrammarsParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(DartGrammarsParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(DartGrammarsParser.STRING, 0); }
		public TerminalNode LIST() { return getToken(DartGrammarsParser.LIST, 0); }
		public TerminalNode DYNAMIC() { return getToken(DartGrammarsParser.DYNAMIC, 0); }
		public TerminalNode BOOL() { return getToken(DartGrammarsParser.BOOL, 0); }
		public TerminalNode OBJECT() { return getToken(DartGrammarsParser.OBJECT, 0); }
		public TerminalNode FUNCTION() { return getToken(DartGrammarsParser.FUNCTION, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0)) ) {
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

	public static class VarOrTypeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DartGrammarsParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrType; }
	}

	public final VarOrTypeContext varOrType() throws RecognitionException {
		VarOrTypeContext _localctx = new VarOrTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varOrType);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(VAR);
				}
				break;
			case DYNAMIC:
			case INT:
			case DOUBLE:
			case STRING:
			case LIST:
			case BOOL:
			case OBJECT:
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				type();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(DartGrammarsParser.FINAL, 0); }
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TerminalNode LATE() { return getToken(DartGrammarsParser.LATE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public TerminalNode CONST() { return getToken(DartGrammarsParser.CONST, 0); }
		public VarOrTypeContext varOrType() {
			return getRuleContext(VarOrTypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaration);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE) {
					{
					setState(389);
					match(LATE);
					}
				}

				setState(392);
				match(FINAL);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0)) {
					{
					setState(393);
					type();
					}
				}

				setState(396);
				match(ID);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(397);
					initialization();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(CONST);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0)) {
					{
					setState(401);
					type();
					}
				}

				setState(404);
				match(ID);
				setState(405);
				initialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE) {
					{
					setState(406);
					match(LATE);
					}
				}

				setState(409);
				varOrType();
				setState(410);
				match(ID);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(411);
					initialization();
					}
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

	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__12);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(417);
				match(ID);
				}
				break;
			case 2:
				{
				setState(418);
				match(CHARACTERS);
				}
				break;
			case 3:
				{
				setState(419);
				unnamedFunction();
				}
				break;
			case 4:
				{
				setState(420);
				functionCall();
				}
				break;
			case 5:
				{
				setState(421);
				object();
				}
				break;
			case 6:
				{
				setState(422);
				expression(0);
				}
				break;
			case 7:
				{
				setState(423);
				list();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(ID);
				setState(427);
				match(T__12);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(428);
					match(ID);
					}
					break;
				case 2:
					{
					setState(429);
					match(CHARACTERS);
					}
					break;
				case 3:
					{
					setState(430);
					unnamedFunction();
					}
					break;
				case 4:
					{
					setState(431);
					functionCall();
					}
					break;
				case 5:
					{
					setState(432);
					object();
					}
					break;
				case 6:
					{
					setState(433);
					expression(0);
					}
					break;
				case 7:
					{
					setState(434);
					list();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(ID);
				setState(438);
				match(T__18);
				setState(439);
				match(ID);
				setState(440);
				match(T__12);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(441);
					match(ID);
					}
					break;
				case 2:
					{
					setState(442);
					match(CHARACTERS);
					}
					break;
				case 3:
					{
					setState(443);
					unnamedFunction();
					}
					break;
				case 4:
					{
					setState(444);
					functionCall();
					}
					break;
				case 5:
					{
					setState(445);
					object();
					}
					break;
				case 6:
					{
					setState(446);
					expression(0);
					}
					break;
				case 7:
					{
					setState(447);
					list();
					}
					break;
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

	public static class ListContext extends ParserRuleContext {
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__19);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__19) | (1L << AWAIT) | (1L << NEW))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (INT_NUM - 115)) | (1L << (DOUBLE_NUM - 115)) | (1L << (CHARACTERS - 115)) | (1L << (ID - 115)))) != 0)) {
				{
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(453);
						listElement();
						setState(454);
						match(COMMA);
						}
						} 
					}
					setState(460);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(461);
				listElement();
				}
			}

			setState(464);
			match(T__20);
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

	public static class ListElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listElement);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(CHARACTERS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(472);
				unnamedFunction();
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

	public static class VoidOrTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(DartGrammarsParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VoidOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidOrType; }
	}

	public final VoidOrTypeContext voidOrType() throws RecognitionException {
		VoidOrTypeContext _localctx = new VoidOrTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_voidOrType);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(VOID);
				}
				break;
			case DYNAMIC:
			case INT:
			case DOUBLE:
			case STRING:
			case LIST:
			case BOOL:
			case OBJECT:
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				type();
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public VoidOrTypeContext voidOrType() {
			return getRuleContext(VoidOrTypeContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0)) {
				{
				setState(479);
				voidOrType();
				}
			}

			setState(482);
			match(ID);
			setState(483);
			arguments();
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

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(DartGrammarsParser.ASYNC, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			signature();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(486);
				match(ASYNC);
				}
			}

			setState(489);
			functionBody();
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

	public static class UnnamedFunctionContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(DartGrammarsParser.ASYNC, 0); }
		public UnnamedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedFunction; }
	}

	public final UnnamedFunctionContext unnamedFunction() throws RecognitionException {
		UnnamedFunctionContext _localctx = new UnnamedFunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unnamedFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			arguments();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(492);
				match(ASYNC);
				}
			}

			setState(495);
			functionBody();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public PositionalNamedArgumentsContext positionalNamedArguments() {
			return getRuleContext(PositionalNamedArgumentsContext.class,0);
		}
		public PositionalArgumentsContext positionalArguments() {
			return getRuleContext(PositionalArgumentsContext.class,0);
		}
		public NamedArgumentsContext namedArguments() {
			return getRuleContext(NamedArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arguments);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(T__9);
				setState(498);
				positionalNamedArguments();
				setState(499);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(T__9);
				setState(502);
				positionalArguments();
				setState(503);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(T__9);
				setState(506);
				namedArguments();
				setState(507);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				match(T__9);
				setState(510);
				match(T__10);
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

	public static class PositionalNamedArgumentsContext extends ParserRuleContext {
		public List<PositionalArgumentsContext> positionalArguments() {
			return getRuleContexts(PositionalArgumentsContext.class);
		}
		public PositionalArgumentsContext positionalArguments(int i) {
			return getRuleContext(PositionalArgumentsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public List<NamedArgumentsContext> namedArguments() {
			return getRuleContexts(NamedArgumentsContext.class);
		}
		public NamedArgumentsContext namedArguments(int i) {
			return getRuleContext(NamedArgumentsContext.class,i);
		}
		public PositionalNamedArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalNamedArguments; }
	}

	public final PositionalNamedArgumentsContext positionalNamedArguments() throws RecognitionException {
		PositionalNamedArgumentsContext _localctx = new PositionalNamedArgumentsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_positionalNamedArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				positionalArguments();
				setState(514);
				match(COMMA);
				}
				}
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0) || _la==ID );
			setState(521); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				namedArguments();
				}
				}
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class PositionalArgumentsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public PositionalArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArguments; }
	}

	public final PositionalArgumentsContext positionalArguments() throws RecognitionException {
		PositionalArgumentsContext _localctx = new PositionalArgumentsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_positionalArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					arg();
					setState(526);
					match(COMMA);
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(533);
			arg();
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

	public static class NamedArgumentsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public List<TerminalNode> REQUIRED() { return getTokens(DartGrammarsParser.REQUIRED); }
		public TerminalNode REQUIRED(int i) {
			return getToken(DartGrammarsParser.REQUIRED, i);
		}
		public NamedArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArguments; }
	}

	public final NamedArgumentsContext namedArguments() throws RecognitionException {
		NamedArgumentsContext _localctx = new NamedArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_namedArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T__1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==REQUIRED) {
						{
						setState(536);
						match(REQUIRED);
						}
					}

					setState(539);
					arg();
					setState(540);
					match(COMMA);
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRED) {
				{
				setState(547);
				match(REQUIRED);
				}
			}

			setState(550);
			arg();
			setState(551);
			match(T__2);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0)) {
				{
				setState(553);
				type();
				}
			}

			setState(556);
			match(ID);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__1);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << FOREACH) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << LATE) | (1L << AWAIT) | (1L << NEW))) != 0) || _la==ID) {
				{
				{
				setState(559);
				statement();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(565);
				returnStatement();
				}
			}

			setState(568);
			match(T__2);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DartGrammarsParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(RETURN);
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(571);
				match(ID);
				}
				break;
			case 2:
				{
				setState(572);
				match(CHARACTERS);
				}
				break;
			case 3:
				{
				setState(573);
				expression(0);
				}
				break;
			case 4:
				{
				setState(574);
				object();
				}
				break;
			case 5:
				{
				setState(575);
				list();
				}
				break;
			case 6:
				{
				setState(576);
				functionCall();
				}
				break;
			case 7:
				{
				setState(577);
				unnamedFunction();
				}
				break;
			case 8:
				{
				setState(578);
				condition();
				}
				break;
			}
			setState(581);
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DartGrammarsParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(DartGrammarsParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(DartGrammarsParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(DartGrammarsParser.IMPLEMENTS, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	}

	public final ClassContext class() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(583);
				match(ABSTRACT);
				}
			}

			setState(586);
			match(CLASS);
			setState(587);
			match(ID);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(588);
				match(EXTENDS);
				setState(589);
				match(ID);
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(592);
				match(IMPLEMENTS);
				setState(593);
				match(ID);
				}
			}

			setState(596);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public DefaultConstructerContext defaultConstructer() {
			return getRuleContext(DefaultConstructerContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(599);
						attribute();
						}
						break;
					case 2:
						{
						setState(600);
						method();
						}
						break;
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(606);
				defaultConstructer();
				}
				break;
			}
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << LATE) | (1L << OVERRIDE) | (1L << STATIC))) != 0) || _la==ID) {
				{
				setState(611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(609);
					attribute();
					}
					break;
				case 2:
					{
					setState(610);
					method();
					}
					break;
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			match(T__2);
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

	public static class AttributeContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public TerminalNode STATIC() { return getToken(DartGrammarsParser.STATIC, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(618);
				match(STATIC);
				}
			}

			setState(621);
			declaration();
			setState(622);
			match(SEMICOLON);
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

	public static class MethodContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(DartGrammarsParser.OVERRIDE, 0); }
		public TerminalNode ASYNC() { return getToken(DartGrammarsParser.ASYNC, 0); }
		public TerminalNode STATIC() { return getToken(DartGrammarsParser.STATIC, 0); }
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public NamedConstructerContext namedConstructer() {
			return getRuleContext(NamedConstructerContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_method);
		int _la;
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERRIDE) {
					{
					setState(624);
					match(OVERRIDE);
					}
				}

				setState(627);
				signature();
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(628);
					match(ASYNC);
					}
				}

				setState(631);
				methodBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(STATIC);
				setState(634);
				signature();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(635);
					match(ASYNC);
					}
				}

				setState(638);
				methodBody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				signature();
				setState(641);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				namedConstructer();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<ThisStatementContext> thisStatement() {
			return getRuleContexts(ThisStatementContext.class);
		}
		public ThisStatementContext thisStatement(int i) {
			return getRuleContext(ThisStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DartGrammarsParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DartGrammarsParser.SEMICOLON, i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T__1);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << FOREACH) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << DYNAMIC) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << LATE) | (1L << AWAIT) | (1L << THIS) | (1L << NEW))) != 0) || _la==ID) {
				{
				setState(651);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case SWITCH:
				case WHILE:
				case DO:
				case FOR:
				case FOREACH:
				case FINAL:
				case CONST:
				case VAR:
				case DYNAMIC:
				case VOID:
				case INT:
				case DOUBLE:
				case STRING:
				case LIST:
				case BOOL:
				case OBJECT:
				case FUNCTION:
				case LATE:
				case AWAIT:
				case NEW:
				case ID:
					{
					setState(647);
					statement();
					}
					break;
				case THIS:
					{
					{
					setState(648);
					thisStatement();
					setState(649);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(656);
				returnStatement();
				}
			}

			setState(659);
			match(T__2);
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

	public static class ThisStatementContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(DartGrammarsParser.THIS, 0); }
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public ThisStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisStatement; }
	}

	public final ThisStatementContext thisStatement() throws RecognitionException {
		ThisStatementContext _localctx = new ThisStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_thisStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(THIS);
			setState(662);
			match(T__18);
			setState(663);
			match(ID);
			setState(664);
			match(T__12);
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(665);
				match(ID);
				}
				break;
			case 2:
				{
				setState(666);
				match(CHARACTERS);
				}
				break;
			case 3:
				{
				setState(667);
				expression(0);
				}
				break;
			case 4:
				{
				setState(668);
				object();
				}
				break;
			case 5:
				{
				setState(669);
				list();
				}
				break;
			case 6:
				{
				setState(670);
				functionCall();
				}
				break;
			case 7:
				{
				setState(671);
				unnamedFunction();
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

	public static class DefaultConstructerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public ConsArgumentsContext consArguments() {
			return getRuleContext(ConsArgumentsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public DefaultConstructerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultConstructer; }
	}

	public final DefaultConstructerContext defaultConstructer() throws RecognitionException {
		DefaultConstructerContext _localctx = new DefaultConstructerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_defaultConstructer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(ID);
			setState(675);
			match(T__9);
			setState(676);
			consArguments();
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				{
				setState(677);
				match(T__10);
				setState(678);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				{
				{
				setState(679);
				match(T__10);
				setState(680);
				methodBody();
				}
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

	public static class NamedConstructerContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public ConsArgumentsContext consArguments() {
			return getRuleContext(ConsArgumentsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartGrammarsParser.SEMICOLON, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public NamedConstructerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedConstructer; }
	}

	public final NamedConstructerContext namedConstructer() throws RecognitionException {
		NamedConstructerContext _localctx = new NamedConstructerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_namedConstructer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(ID);
			setState(684);
			match(T__18);
			setState(685);
			match(ID);
			setState(686);
			match(T__9);
			setState(687);
			consArguments();
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				{
				setState(688);
				match(T__10);
				setState(689);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				{
				{
				setState(690);
				match(T__10);
				setState(691);
				methodBody();
				}
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

	public static class ConsArgumentsContext extends ParserRuleContext {
		public ConsPositionalNamedArgumentsContext consPositionalNamedArguments() {
			return getRuleContext(ConsPositionalNamedArgumentsContext.class,0);
		}
		public ConsPositionalArgumentsContext consPositionalArguments() {
			return getRuleContext(ConsPositionalArgumentsContext.class,0);
		}
		public ConsNamedArgumentsContext consNamedArguments() {
			return getRuleContext(ConsNamedArgumentsContext.class,0);
		}
		public ConsArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consArguments; }
	}

	public final ConsArgumentsContext consArguments() throws RecognitionException {
		ConsArgumentsContext _localctx = new ConsArgumentsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_consArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(694);
				consPositionalNamedArguments();
				}
				break;
			case 2:
				{
				setState(695);
				consPositionalArguments();
				}
				break;
			case 3:
				{
				setState(696);
				consNamedArguments();
				}
				break;
			case 4:
				{
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

	public static class ConsPositionalNamedArgumentsContext extends ParserRuleContext {
		public List<ConsPositionalArgumentsContext> consPositionalArguments() {
			return getRuleContexts(ConsPositionalArgumentsContext.class);
		}
		public ConsPositionalArgumentsContext consPositionalArguments(int i) {
			return getRuleContext(ConsPositionalArgumentsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public List<ConsNamedArgumentsContext> consNamedArguments() {
			return getRuleContexts(ConsNamedArgumentsContext.class);
		}
		public ConsNamedArgumentsContext consNamedArguments(int i) {
			return getRuleContext(ConsNamedArgumentsContext.class,i);
		}
		public ConsPositionalNamedArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consPositionalNamedArguments; }
	}

	public final ConsPositionalNamedArgumentsContext consPositionalNamedArguments() throws RecognitionException {
		ConsPositionalNamedArgumentsContext _localctx = new ConsPositionalNamedArgumentsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_consPositionalNamedArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(700);
				consPositionalArguments();
				setState(701);
				match(COMMA);
				}
				}
				setState(705); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION) | (1L << THIS))) != 0) || _la==ID );
			setState(708); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(707);
				consNamedArguments();
				}
				}
				setState(710); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class ConsPositionalArgumentsContext extends ParserRuleContext {
		public List<ConsArgContext> consArg() {
			return getRuleContexts(ConsArgContext.class);
		}
		public ConsArgContext consArg(int i) {
			return getRuleContext(ConsArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public ConsPositionalArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consPositionalArguments; }
	}

	public final ConsPositionalArgumentsContext consPositionalArguments() throws RecognitionException {
		ConsPositionalArgumentsContext _localctx = new ConsPositionalArgumentsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_consPositionalArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					consArg();
					setState(713);
					match(COMMA);
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(720);
			consArg();
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

	public static class ConsNamedArgumentsContext extends ParserRuleContext {
		public List<ConsArgContext> consArg() {
			return getRuleContexts(ConsArgContext.class);
		}
		public ConsArgContext consArg(int i) {
			return getRuleContext(ConsArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public List<TerminalNode> REQUIRED() { return getTokens(DartGrammarsParser.REQUIRED); }
		public TerminalNode REQUIRED(int i) {
			return getToken(DartGrammarsParser.REQUIRED, i);
		}
		public ConsNamedArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consNamedArguments; }
	}

	public final ConsNamedArgumentsContext consNamedArguments() throws RecognitionException {
		ConsNamedArgumentsContext _localctx = new ConsNamedArgumentsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_consNamedArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(T__1);
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==REQUIRED) {
						{
						setState(723);
						match(REQUIRED);
						}
					}

					setState(726);
					consArg();
					setState(727);
					match(COMMA);
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRED) {
				{
				setState(734);
				match(REQUIRED);
				}
			}

			setState(737);
			consArg();
			setState(738);
			match(T__2);
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

	public static class ConsArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(DartGrammarsParser.THIS, 0); }
		public ConsArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consArg; }
	}

	public final ConsArgContext consArg() throws RecognitionException {
		ConsArgContext _localctx = new ConsArgContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_consArg);
		int _la;
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DYNAMIC:
			case INT:
			case DOUBLE:
			case STRING:
			case LIST:
			case BOOL:
			case OBJECT:
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << LIST) | (1L << BOOL) | (1L << OBJECT) | (1L << FUNCTION))) != 0)) {
					{
					setState(740);
					type();
					}
				}

				setState(743);
				match(ID);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(744);
				match(THIS);
				setState(745);
				match(T__18);
				setState(746);
				match(ID);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(DartGrammarsParser.AWAIT, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionCall);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(749);
					match(AWAIT);
					}
				}

				setState(752);
				match(ID);
				setState(753);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(754);
					match(AWAIT);
					}
				}

				setState(757);
				match(ID);
				setState(758);
				match(T__18);
				setState(759);
				match(ID);
				setState(760);
				parameters();
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_object);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				match(NEW);
				setState(764);
				match(ID);
				setState(765);
				match(T__9);
				setState(766);
				parameters();
				setState(767);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				component();
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

	public static class ParametersContext extends ParserRuleContext {
		public PositionalNamedParametersContext positionalNamedParameters() {
			return getRuleContext(PositionalNamedParametersContext.class,0);
		}
		public PositionalParametersContext positionalParameters() {
			return getRuleContext(PositionalParametersContext.class,0);
		}
		public NamedParametersContext namedParameters() {
			return getRuleContext(NamedParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parameters);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(T__9);
				setState(773);
				positionalNamedParameters();
				setState(774);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(T__9);
				setState(777);
				positionalParameters();
				setState(778);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				match(T__9);
				setState(781);
				namedParameters();
				setState(782);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(784);
				match(T__9);
				setState(785);
				match(T__10);
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

	public static class PositionalNamedParametersContext extends ParserRuleContext {
		public List<PositionalParametersContext> positionalParameters() {
			return getRuleContexts(PositionalParametersContext.class);
		}
		public PositionalParametersContext positionalParameters(int i) {
			return getRuleContext(PositionalParametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public List<NamedParametersContext> namedParameters() {
			return getRuleContexts(NamedParametersContext.class);
		}
		public NamedParametersContext namedParameters(int i) {
			return getRuleContext(NamedParametersContext.class,i);
		}
		public PositionalNamedParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalNamedParameters; }
	}

	public final PositionalNamedParametersContext positionalNamedParameters() throws RecognitionException {
		PositionalNamedParametersContext _localctx = new PositionalNamedParametersContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_positionalNamedParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(788);
					positionalParameters();
					setState(789);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(793); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(796); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(795);
				namedParameters();
				}
				}
				setState(798); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class PositionalParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public PositionalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalParameters; }
	}

	public final PositionalParametersContext positionalParameters() throws RecognitionException {
		PositionalParametersContext _localctx = new PositionalParametersContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_positionalParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(800);
					parameter();
					setState(801);
					match(COMMA);
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(808);
			parameter();
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(809);
				match(COMMA);
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

	public static class NamedParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DartGrammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartGrammarsParser.ID, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartGrammarsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartGrammarsParser.COMMA, i);
		}
		public NamedParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParameters; }
	}

	public final NamedParametersContext namedParameters() throws RecognitionException {
		NamedParametersContext _localctx = new NamedParametersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_namedParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812);
					match(ID);
					setState(813);
					match(T__11);
					setState(814);
					parameter();
					setState(815);
					match(COMMA);
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(822);
			match(ID);
			setState(823);
			match(T__11);
			setState(824);
			parameter();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(825);
				match(COMMA);
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameter);
		try {
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(CHARACTERS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(831);
				object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(832);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(834);
				unnamedFunction();
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

	public static class ExpressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(DartGrammarsParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case INT_NUM:
			case DOUBLE_NUM:
				{
				setState(838);
				number();
				}
				break;
			case ID:
				{
				setState(839);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(842);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(843);
						match(T__21);
						setState(844);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(845);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(846);
						match(T__22);
						setState(847);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(848);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(849);
						match(T__23);
						setState(850);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(851);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(852);
						match(T__0);
						setState(853);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class ComponentContext extends ParserRuleContext {
		public MaterialAppContext materialApp() {
			return getRuleContext(MaterialAppContext.class,0);
		}
		public ScrollViewContext scrollView() {
			return getRuleContext(ScrollViewContext.class,0);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public SizedBoxContext sizedBox() {
			return getRuleContext(SizedBoxContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public InkWellContext inkWell() {
			return getRuleContext(InkWellContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_component);
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				materialApp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				scrollView();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				scaffold();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				column();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
				row();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				stack();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
				text();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(866);
				container();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(867);
				sizedBox();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(868);
				padding();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(869);
				inkWell();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(870);
				image();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(871);
				button();
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

	public static class MaterialAppContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode MATERIAL_APP() { return getToken(DartGrammarsParser.MATERIAL_APP, 0); }
		public List<MaterialAppAttsContext> materialAppAtts() {
			return getRuleContexts(MaterialAppAttsContext.class);
		}
		public MaterialAppAttsContext materialAppAtts(int i) {
			return getRuleContext(MaterialAppAttsContext.class,i);
		}
		public MaterialAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialApp; }
	}

	public final MaterialAppContext materialApp() throws RecognitionException {
		MaterialAppContext _localctx = new MaterialAppContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_materialApp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(NEW);
			setState(875);
			match(MATERIAL_APP);
			setState(876);
			match(T__9);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TITLE || _la==HOME) {
				{
				{
				setState(877);
				materialAppAtts();
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			match(T__10);
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

	public static class MaterialAppAttsContext extends ParserRuleContext {
		public MaterialTitleContext materialTitle() {
			return getRuleContext(MaterialTitleContext.class,0);
		}
		public MaterialHomeContext materialHome() {
			return getRuleContext(MaterialHomeContext.class,0);
		}
		public MaterialAppAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialAppAtts; }
	}

	public final MaterialAppAttsContext materialAppAtts() throws RecognitionException {
		MaterialAppAttsContext _localctx = new MaterialAppAttsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_materialAppAtts);
		try {
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				materialTitle();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				materialHome();
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

	public static class MaterialTitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(DartGrammarsParser.TITLE, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public MaterialTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialTitle; }
	}

	public final MaterialTitleContext materialTitle() throws RecognitionException {
		MaterialTitleContext _localctx = new MaterialTitleContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_materialTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(TITLE);
			setState(890);
			match(T__11);
			setState(891);
			match(CHARACTERS);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(892);
				match(COMMA);
				}
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

	public static class MaterialHomeContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(DartGrammarsParser.HOME, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public MaterialHomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialHome; }
	}

	public final MaterialHomeContext materialHome() throws RecognitionException {
		MaterialHomeContext _localctx = new MaterialHomeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_materialHome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(HOME);
			setState(896);
			match(T__11);
			setState(897);
			object();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(898);
				match(COMMA);
				}
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

	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode SCAFFOLD() { return getToken(DartGrammarsParser.SCAFFOLD, 0); }
		public List<ScaffoldAttsContext> scaffoldAtts() {
			return getRuleContexts(ScaffoldAttsContext.class);
		}
		public ScaffoldAttsContext scaffoldAtts(int i) {
			return getRuleContext(ScaffoldAttsContext.class,i);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(NEW);
			setState(902);
			match(SCAFFOLD);
			setState(903);
			match(T__9);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BODY || _la==BACKGROUND_COLOR) {
				{
				{
				setState(904);
				scaffoldAtts();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
			match(T__10);
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

	public static class ScaffoldAttsContext extends ParserRuleContext {
		public ScaffoldBackgroundContext scaffoldBackground() {
			return getRuleContext(ScaffoldBackgroundContext.class,0);
		}
		public ScaffoldBodyContext scaffoldBody() {
			return getRuleContext(ScaffoldBodyContext.class,0);
		}
		public ScaffoldAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAtts; }
	}

	public final ScaffoldAttsContext scaffoldAtts() throws RecognitionException {
		ScaffoldAttsContext _localctx = new ScaffoldAttsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_scaffoldAtts);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				scaffoldBackground();
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				scaffoldBody();
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

	public static class ScaffoldBackgroundContext extends ParserRuleContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(DartGrammarsParser.BACKGROUND_COLOR, 0); }
		public TerminalNode COLORS() { return getToken(DartGrammarsParser.COLORS, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ScaffoldBackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldBackground; }
	}

	public final ScaffoldBackgroundContext scaffoldBackground() throws RecognitionException {
		ScaffoldBackgroundContext _localctx = new ScaffoldBackgroundContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_scaffoldBackground);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(BACKGROUND_COLOR);
			setState(917);
			match(T__11);
			setState(918);
			match(COLORS);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(919);
				match(COMMA);
				}
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

	public static class ScaffoldBodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(DartGrammarsParser.BODY, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ScaffoldBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldBody; }
	}

	public final ScaffoldBodyContext scaffoldBody() throws RecognitionException {
		ScaffoldBodyContext _localctx = new ScaffoldBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_scaffoldBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(BODY);
			setState(923);
			match(T__11);
			setState(924);
			object();
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(925);
				match(COMMA);
				}
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode COLUMN() { return getToken(DartGrammarsParser.COLUMN, 0); }
		public List<Column_rowAttsContext> column_rowAtts() {
			return getRuleContexts(Column_rowAttsContext.class);
		}
		public Column_rowAttsContext column_rowAtts(int i) {
			return getRuleContext(Column_rowAttsContext.class,i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(NEW);
			setState(929);
			match(COLUMN);
			setState(930);
			match(T__9);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (MAIN_AXIS_ALIGNMENT - 75)) | (1L << (CROSS_AXIS_ALIGNMENT - 75)) | (1L << (CHILDREN - 75)))) != 0)) {
				{
				{
				setState(931);
				column_rowAtts();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
			match(T__10);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode ROW() { return getToken(DartGrammarsParser.ROW, 0); }
		public List<Column_rowAttsContext> column_rowAtts() {
			return getRuleContexts(Column_rowAttsContext.class);
		}
		public Column_rowAttsContext column_rowAtts(int i) {
			return getRuleContext(Column_rowAttsContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(NEW);
			setState(940);
			match(ROW);
			setState(941);
			match(T__9);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (MAIN_AXIS_ALIGNMENT - 75)) | (1L << (CROSS_AXIS_ALIGNMENT - 75)) | (1L << (CHILDREN - 75)))) != 0)) {
				{
				{
				setState(942);
				column_rowAtts();
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			match(T__10);
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

	public static class Column_rowAttsContext extends ParserRuleContext {
		public MainAxisContext mainAxis() {
			return getRuleContext(MainAxisContext.class,0);
		}
		public CrossAxisContext crossAxis() {
			return getRuleContext(CrossAxisContext.class,0);
		}
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public Column_rowAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_rowAtts; }
	}

	public final Column_rowAttsContext column_rowAtts() throws RecognitionException {
		Column_rowAttsContext _localctx = new Column_rowAttsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_column_rowAtts);
		try {
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				crossAxis();
				}
				break;
			case CHILDREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				children();
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

	public static class MainAxisContext extends ParserRuleContext {
		public TerminalNode MAIN_AXIS_ALIGNMENT() { return getToken(DartGrammarsParser.MAIN_AXIS_ALIGNMENT, 0); }
		public TerminalNode ALIGNMENT() { return getToken(DartGrammarsParser.ALIGNMENT, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public MainAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxis; }
	}

	public final MainAxisContext mainAxis() throws RecognitionException {
		MainAxisContext _localctx = new MainAxisContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_mainAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(MAIN_AXIS_ALIGNMENT);
			setState(956);
			match(T__11);
			setState(957);
			match(ALIGNMENT);
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(958);
				match(COMMA);
				}
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

	public static class CrossAxisContext extends ParserRuleContext {
		public TerminalNode CROSS_AXIS_ALIGNMENT() { return getToken(DartGrammarsParser.CROSS_AXIS_ALIGNMENT, 0); }
		public TerminalNode ALIGNMENT() { return getToken(DartGrammarsParser.ALIGNMENT, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public CrossAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxis; }
	}

	public final CrossAxisContext crossAxis() throws RecognitionException {
		CrossAxisContext _localctx = new CrossAxisContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_crossAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(CROSS_AXIS_ALIGNMENT);
			setState(962);
			match(T__11);
			setState(963);
			match(ALIGNMENT);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(964);
				match(COMMA);
				}
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

	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(DartGrammarsParser.CHILDREN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(CHILDREN);
			setState(968);
			match(T__11);
			setState(969);
			list();
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(970);
				match(COMMA);
				}
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

	public static class StackContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode STACK() { return getToken(DartGrammarsParser.STACK, 0); }
		public List<StackAttsContext> stackAtts() {
			return getRuleContexts(StackAttsContext.class);
		}
		public StackAttsContext stackAtts(int i) {
			return getRuleContext(StackAttsContext.class,i);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(NEW);
			setState(974);
			match(STACK);
			setState(975);
			match(T__9);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIT || _la==CHILDREN) {
				{
				{
				setState(976);
				stackAtts();
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			match(T__10);
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

	public static class StackAttsContext extends ParserRuleContext {
		public StackFitContext stackFit() {
			return getRuleContext(StackFitContext.class,0);
		}
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public StackAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackAtts; }
	}

	public final StackAttsContext stackAtts() throws RecognitionException {
		StackAttsContext _localctx = new StackAttsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_stackAtts);
		try {
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				stackFit();
				}
				break;
			case CHILDREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				children();
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

	public static class StackFitContext extends ParserRuleContext {
		public TerminalNode FIT() { return getToken(DartGrammarsParser.FIT, 0); }
		public TerminalNode STACK_FIT() { return getToken(DartGrammarsParser.STACK_FIT, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public StackFitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackFit; }
	}

	public final StackFitContext stackFit() throws RecognitionException {
		StackFitContext _localctx = new StackFitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_stackFit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(FIT);
			setState(989);
			match(T__11);
			setState(990);
			match(STACK_FIT);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(991);
				match(COMMA);
				}
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode TEXT() { return getToken(DartGrammarsParser.TEXT, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public List<TextAttsContext> textAtts() {
			return getRuleContexts(TextAttsContext.class);
		}
		public TextAttsContext textAtts(int i) {
			return getRuleContext(TextAttsContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(NEW);
			setState(995);
			match(TEXT);
			setState(996);
			match(T__9);
			setState(997);
			match(CHARACTERS);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(998);
				match(COMMA);
				}
			}

			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (COLOR - 78)) | (1L << (SIZE - 78)) | (1L << (STYLE - 78)))) != 0)) {
				{
				{
				setState(1001);
				textAtts();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007);
			match(T__10);
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

	public static class TextAttsContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TextSizeContext textSize() {
			return getRuleContext(TextSizeContext.class,0);
		}
		public TextStyleContext textStyle() {
			return getRuleContext(TextStyleContext.class,0);
		}
		public TextAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textAtts; }
	}

	public final TextAttsContext textAtts() throws RecognitionException {
		TextAttsContext _localctx = new TextAttsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_textAtts);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				color();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
				textSize();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1011);
				textStyle();
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DartGrammarsParser.COLOR, 0); }
		public TerminalNode COLORS() { return getToken(DartGrammarsParser.COLORS, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(COLOR);
			setState(1015);
			match(T__11);
			setState(1016);
			match(COLORS);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1017);
				match(COMMA);
				}
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

	public static class TextSizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(DartGrammarsParser.SIZE, 0); }
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public TextSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textSize; }
	}

	public final TextSizeContext textSize() throws RecognitionException {
		TextSizeContext _localctx = new TextSizeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_textSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(SIZE);
			setState(1021);
			match(T__11);
			setState(1022);
			match(INT_NUM);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1023);
				match(COMMA);
				}
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

	public static class TextStyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(DartGrammarsParser.STYLE, 0); }
		public TerminalNode STYLES() { return getToken(DartGrammarsParser.STYLES, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public TextStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyle; }
	}

	public final TextStyleContext textStyle() throws RecognitionException {
		TextStyleContext _localctx = new TextStyleContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_textStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(STYLE);
			setState(1027);
			match(T__11);
			setState(1028);
			match(STYLES);
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1029);
				match(COMMA);
				}
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

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode CONTAINER() { return getToken(DartGrammarsParser.CONTAINER, 0); }
		public List<ContainerAttsContext> containerAtts() {
			return getRuleContexts(ContainerAttsContext.class);
		}
		public ContainerAttsContext containerAtts(int i) {
			return getRuleContext(ContainerAttsContext.class,i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(NEW);
			setState(1033);
			match(CONTAINER);
			setState(1034);
			match(T__9);
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (COLOR - 78)) | (1L << (WIDTH - 78)) | (1L << (HEIGHT - 78)) | (1L << (CHILD - 78)))) != 0)) {
				{
				{
				setState(1035);
				containerAtts();
				}
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1041);
			match(T__10);
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

	public static class ContainerAttsContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ContainerAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerAtts; }
	}

	public final ContainerAttsContext containerAtts() throws RecognitionException {
		ContainerAttsContext _localctx = new ContainerAttsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_containerAtts);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				height();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				child();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				color();
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

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(DartGrammarsParser.WIDTH, 0); }
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(WIDTH);
			setState(1050);
			match(T__11);
			setState(1051);
			match(INT_NUM);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1052);
				match(COMMA);
				}
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

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(DartGrammarsParser.HEIGHT, 0); }
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(HEIGHT);
			setState(1056);
			match(T__11);
			setState(1057);
			match(INT_NUM);
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1058);
				match(COMMA);
				}
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

	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(DartGrammarsParser.CHILD, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_child);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(CHILD);
			setState(1062);
			match(T__11);
			setState(1063);
			object();
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1064);
				match(COMMA);
				}
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

	public static class SizedBoxContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode SIZEDBOX() { return getToken(DartGrammarsParser.SIZEDBOX, 0); }
		public List<SizedBoxAttsContext> sizedBoxAtts() {
			return getRuleContexts(SizedBoxAttsContext.class);
		}
		public SizedBoxAttsContext sizedBoxAtts(int i) {
			return getRuleContext(SizedBoxAttsContext.class,i);
		}
		public SizedBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBox; }
	}

	public final SizedBoxContext sizedBox() throws RecognitionException {
		SizedBoxContext _localctx = new SizedBoxContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_sizedBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(NEW);
			setState(1068);
			match(SIZEDBOX);
			setState(1069);
			match(T__9);
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (WIDTH - 83)) | (1L << (HEIGHT - 83)) | (1L << (CHILD - 83)))) != 0)) {
				{
				{
				setState(1070);
				sizedBoxAtts();
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
			match(T__10);
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

	public static class SizedBoxAttsContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public SizedBoxAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBoxAtts; }
	}

	public final SizedBoxAttsContext sizedBoxAtts() throws RecognitionException {
		SizedBoxAttsContext _localctx = new SizedBoxAttsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sizedBoxAtts);
		try {
			setState(1081);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				height();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				child();
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

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode PADDING() { return getToken(DartGrammarsParser.PADDING, 0); }
		public List<PaddingAttsContext> paddingAtts() {
			return getRuleContexts(PaddingAttsContext.class);
		}
		public PaddingAttsContext paddingAtts(int i) {
			return getRuleContext(PaddingAttsContext.class,i);
		}
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(NEW);
			setState(1084);
			match(PADDING);
			setState(1085);
			match(T__9);
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUES || _la==CHILD) {
				{
				{
				setState(1086);
				paddingAtts();
				}
				}
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1092);
			match(T__10);
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

	public static class PaddingAttsContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(DartGrammarsParser.VALUES, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public PaddingAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingAtts; }
	}

	public final PaddingAttsContext paddingAtts() throws RecognitionException {
		PaddingAttsContext _localctx = new PaddingAttsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_paddingAtts);
		int _la;
		try {
			setState(1101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				match(VALUES);
				setState(1095);
				match(T__11);
				setState(1096);
				values();
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1097);
					match(COMMA);
					}
				}

				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				child();
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

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(DartGrammarsParser.ZERO, 0); }
		public TerminalNode ALL() { return getToken(DartGrammarsParser.ALL, 0); }
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode SYMMETRIC() { return getToken(DartGrammarsParser.SYMMETRIC, 0); }
		public List<HorizontalOrVerticalContext> horizontalOrVertical() {
			return getRuleContexts(HorizontalOrVerticalContext.class);
		}
		public HorizontalOrVerticalContext horizontalOrVertical(int i) {
			return getRuleContext(HorizontalOrVerticalContext.class,i);
		}
		public TerminalNode COSTUME() { return getToken(DartGrammarsParser.COSTUME, 0); }
		public List<CostumeValuesContext> costumeValues() {
			return getRuleContexts(CostumeValuesContext.class);
		}
		public CostumeValuesContext costumeValues(int i) {
			return getRuleContext(CostumeValuesContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_values);
		int _la;
		try {
			setState(1126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				match(ZERO);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				match(ALL);
				setState(1105);
				match(T__9);
				setState(1106);
				match(INT_NUM);
				setState(1107);
				match(T__10);
				}
				break;
			case SYMMETRIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				match(SYMMETRIC);
				setState(1109);
				match(T__9);
				setState(1111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1110);
					horizontalOrVertical();
					}
					}
					setState(1113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HORIZONTAL || _la==VERTICAL );
				setState(1115);
				match(T__10);
				}
				break;
			case COSTUME:
				enterOuterAlt(_localctx, 4);
				{
				setState(1117);
				match(COSTUME);
				setState(1118);
				match(T__9);
				setState(1120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1119);
					costumeValues();
					}
					}
					setState(1122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LEFT - 101)) | (1L << (RIGHT - 101)) | (1L << (TOP - 101)) | (1L << (BOTTOM - 101)))) != 0) );
				setState(1124);
				match(T__10);
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

	public static class HorizontalOrVerticalContext extends ParserRuleContext {
		public TerminalNode HORIZONTAL() { return getToken(DartGrammarsParser.HORIZONTAL, 0); }
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public TerminalNode VERTICAL() { return getToken(DartGrammarsParser.VERTICAL, 0); }
		public HorizontalOrVerticalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_horizontalOrVertical; }
	}

	public final HorizontalOrVerticalContext horizontalOrVertical() throws RecognitionException {
		HorizontalOrVerticalContext _localctx = new HorizontalOrVerticalContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_horizontalOrVertical);
		int _la;
		try {
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				match(HORIZONTAL);
				setState(1129);
				match(T__11);
				setState(1130);
				match(INT_NUM);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1131);
					match(COMMA);
					}
				}

				}
				break;
			case VERTICAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				match(VERTICAL);
				setState(1135);
				match(T__11);
				setState(1136);
				match(INT_NUM);
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1137);
					match(COMMA);
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

	public static class CostumeValuesContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(DartGrammarsParser.LEFT, 0); }
		public TerminalNode INT_NUM() { return getToken(DartGrammarsParser.INT_NUM, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public TerminalNode TOP() { return getToken(DartGrammarsParser.TOP, 0); }
		public TerminalNode RIGHT() { return getToken(DartGrammarsParser.RIGHT, 0); }
		public TerminalNode BOTTOM() { return getToken(DartGrammarsParser.BOTTOM, 0); }
		public CostumeValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costumeValues; }
	}

	public final CostumeValuesContext costumeValues() throws RecognitionException {
		CostumeValuesContext _localctx = new CostumeValuesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_costumeValues);
		int _la;
		try {
			setState(1166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				match(LEFT);
				setState(1143);
				match(T__11);
				setState(1144);
				match(INT_NUM);
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1145);
					match(COMMA);
					}
				}

				}
				break;
			case TOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				match(TOP);
				setState(1149);
				match(T__11);
				setState(1150);
				match(INT_NUM);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1151);
					match(COMMA);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				match(RIGHT);
				setState(1155);
				match(T__11);
				setState(1156);
				match(INT_NUM);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1157);
					match(COMMA);
					}
				}

				}
				break;
			case BOTTOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1160);
				match(BOTTOM);
				setState(1161);
				match(T__11);
				setState(1162);
				match(INT_NUM);
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1163);
					match(COMMA);
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

	public static class InkWellContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode INK_WELL() { return getToken(DartGrammarsParser.INK_WELL, 0); }
		public List<InkWellAttsContext> inkWellAtts() {
			return getRuleContexts(InkWellAttsContext.class);
		}
		public InkWellAttsContext inkWellAtts(int i) {
			return getRuleContext(InkWellAttsContext.class,i);
		}
		public InkWellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inkWell; }
	}

	public final InkWellContext inkWell() throws RecognitionException {
		InkWellContext _localctx = new InkWellContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_inkWell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(NEW);
			setState(1169);
			match(INK_WELL);
			setState(1170);
			match(T__9);
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==ON_TAP) {
				{
				{
				setState(1171);
				inkWellAtts();
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1177);
			match(T__10);
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

	public static class InkWellAttsContext extends ParserRuleContext {
		public OnTapContext onTap() {
			return getRuleContext(OnTapContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public InkWellAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inkWellAtts; }
	}

	public final InkWellAttsContext inkWellAtts() throws RecognitionException {
		InkWellAttsContext _localctx = new InkWellAttsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_inkWellAtts);
		try {
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_TAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				onTap();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				child();
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

	public static class OnTapContext extends ParserRuleContext {
		public TerminalNode ON_TAP() { return getToken(DartGrammarsParser.ON_TAP, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UnnamedFunctionContext unnamedFunction() {
			return getRuleContext(UnnamedFunctionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public OnTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onTap; }
	}

	public final OnTapContext onTap() throws RecognitionException {
		OnTapContext _localctx = new OnTapContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_onTap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(ON_TAP);
			setState(1184);
			match(T__11);
			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case ID:
				{
				setState(1185);
				functionCall();
				}
				break;
			case T__9:
				{
				setState(1186);
				unnamedFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1189);
				match(COMMA);
				}
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode IMAGE() { return getToken(DartGrammarsParser.IMAGE, 0); }
		public TerminalNode CHARACTERS() { return getToken(DartGrammarsParser.CHARACTERS, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public List<ImageAttsContext> imageAtts() {
			return getRuleContexts(ImageAttsContext.class);
		}
		public ImageAttsContext imageAtts(int i) {
			return getRuleContext(ImageAttsContext.class,i);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(NEW);
			setState(1193);
			match(IMAGE);
			setState(1194);
			match(T__9);
			setState(1195);
			match(CHARACTERS);
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1196);
				match(COMMA);
				}
			}

			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (WIDTH - 83)) | (1L << (HEIGHT - 83)) | (1L << (FIT - 83)))) != 0)) {
				{
				{
				setState(1199);
				imageAtts();
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1205);
			match(T__10);
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

	public static class ImageAttsContext extends ParserRuleContext {
		public ImageFitContext imageFit() {
			return getRuleContext(ImageFitContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ImageAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageAtts; }
	}

	public final ImageAttsContext imageAtts() throws RecognitionException {
		ImageAttsContext _localctx = new ImageAttsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_imageAtts);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				imageFit();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
				height();
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

	public static class ImageFitContext extends ParserRuleContext {
		public TerminalNode FIT() { return getToken(DartGrammarsParser.FIT, 0); }
		public TerminalNode BOX_FIT() { return getToken(DartGrammarsParser.BOX_FIT, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ImageFitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageFit; }
	}

	public final ImageFitContext imageFit() throws RecognitionException {
		ImageFitContext _localctx = new ImageFitContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_imageFit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(FIT);
			setState(1213);
			match(T__11);
			setState(1214);
			match(BOX_FIT);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1215);
				match(COMMA);
				}
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

	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode BUTTON() { return getToken(DartGrammarsParser.BUTTON, 0); }
		public List<ButtonAttsContext> buttonAtts() {
			return getRuleContexts(ButtonAttsContext.class);
		}
		public ButtonAttsContext buttonAtts(int i) {
			return getRuleContext(ButtonAttsContext.class,i);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_button);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(NEW);
			setState(1219);
			match(BUTTON);
			setState(1220);
			match(T__9);
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (COLOR - 78)) | (1L << (CHILD - 78)) | (1L << (ON_TAP - 78)))) != 0)) {
				{
				{
				setState(1221);
				buttonAtts();
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1227);
			match(T__10);
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

	public static class ButtonAttsContext extends ParserRuleContext {
		public OnTapContext onTap() {
			return getRuleContext(OnTapContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ButtonAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonAtts; }
	}

	public final ButtonAttsContext buttonAtts() throws RecognitionException {
		ButtonAttsContext _localctx = new ButtonAttsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_buttonAtts);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_TAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				onTap();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				child();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				color();
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

	public static class ScrollViewContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(DartGrammarsParser.NEW, 0); }
		public TerminalNode SCROLL_VIEW() { return getToken(DartGrammarsParser.SCROLL_VIEW, 0); }
		public List<ScrollViewAttsContext> scrollViewAtts() {
			return getRuleContexts(ScrollViewAttsContext.class);
		}
		public ScrollViewAttsContext scrollViewAtts(int i) {
			return getRuleContext(ScrollViewAttsContext.class,i);
		}
		public ScrollViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrollView; }
	}

	public final ScrollViewContext scrollView() throws RecognitionException {
		ScrollViewContext _localctx = new ScrollViewContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_scrollView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(NEW);
			setState(1235);
			match(SCROLL_VIEW);
			setState(1236);
			match(T__9);
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCROLL_DIRECTION || _la==CHILD) {
				{
				{
				setState(1237);
				scrollViewAtts();
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
			match(T__10);
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

	public static class ScrollViewAttsContext extends ParserRuleContext {
		public ScrollDirectionContext scrollDirection() {
			return getRuleContext(ScrollDirectionContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ScrollViewAttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrollViewAtts; }
	}

	public final ScrollViewAttsContext scrollViewAtts() throws RecognitionException {
		ScrollViewAttsContext _localctx = new ScrollViewAttsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_scrollViewAtts);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCROLL_DIRECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				scrollDirection();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				child();
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

	public static class ScrollDirectionContext extends ParserRuleContext {
		public TerminalNode SCROLL_DIRECTION() { return getToken(DartGrammarsParser.SCROLL_DIRECTION, 0); }
		public TerminalNode HORIZONTAL() { return getToken(DartGrammarsParser.HORIZONTAL, 0); }
		public TerminalNode VERTICAL() { return getToken(DartGrammarsParser.VERTICAL, 0); }
		public TerminalNode COMMA() { return getToken(DartGrammarsParser.COMMA, 0); }
		public ScrollDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrollDirection; }
	}

	public final ScrollDirectionContext scrollDirection() throws RecognitionException {
		ScrollDirectionContext _localctx = new ScrollDirectionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_scrollDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(SCROLL_DIRECTION);
			setState(1250);
			match(T__11);
			setState(1251);
			_la = _input.LA(1);
			if ( !(_la==HORIZONTAL || _la==VERTICAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1252);
				match(COMMA);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3x\u04ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\3\2\6\2\u00db\n\2\r\2\16\2\u00dc\3\2\3\2\3\3\3\3\5\3\u00e3"+
		"\n\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6\u00ec\n\6\f\6\16\6\u00ef\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0104\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0111"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0119\n\n\f\n\16\n\u011c\13\n\3\n\5\n"+
		"\u011f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\6\16\u0133\n\16\r\16\16\16\u0134\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0143\n\17\3\20\3\20"+
		"\3\20\3\20\3\21\7\21\u014a\n\21\f\21\16\21\u014d\13\21\3\21\3\21\5\21"+
		"\u0151\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0173\n\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0186"+
		"\n\31\3\32\5\32\u0189\n\32\3\32\3\32\5\32\u018d\n\32\3\32\3\32\5\32\u0191"+
		"\n\32\3\32\3\32\5\32\u0195\n\32\3\32\3\32\3\32\5\32\u019a\n\32\3\32\3"+
		"\32\3\32\5\32\u019f\n\32\5\32\u01a1\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u01ab\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01b6\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01c3\n\34\5\34\u01c5\n\34\3\35\3\35\3\35\3\35\7\35\u01cb\n\35\f"+
		"\35\16\35\u01ce\13\35\3\35\5\35\u01d1\n\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u01dc\n\36\3\37\3\37\5\37\u01e0\n\37\3 \5 \u01e3"+
		"\n \3 \3 \3 \3!\3!\5!\u01ea\n!\3!\3!\3\"\3\"\5\"\u01f0\n\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0202\n#\3$\3$\3$\6$\u0207"+
		"\n$\r$\16$\u0208\3$\6$\u020c\n$\r$\16$\u020d\3%\3%\3%\7%\u0213\n%\f%\16"+
		"%\u0216\13%\3%\3%\3&\3&\5&\u021c\n&\3&\3&\3&\7&\u0221\n&\f&\16&\u0224"+
		"\13&\3&\5&\u0227\n&\3&\3&\3&\3\'\5\'\u022d\n\'\3\'\3\'\3(\3(\7(\u0233"+
		"\n(\f(\16(\u0236\13(\3(\5(\u0239\n(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5"+
		")\u0246\n)\3)\3)\3*\5*\u024b\n*\3*\3*\3*\3*\5*\u0251\n*\3*\3*\5*\u0255"+
		"\n*\3*\3*\3+\3+\3+\7+\u025c\n+\f+\16+\u025f\13+\3+\5+\u0262\n+\3+\3+\7"+
		"+\u0266\n+\f+\16+\u0269\13+\3+\3+\3,\5,\u026e\n,\3,\3,\3,\3-\5-\u0274"+
		"\n-\3-\3-\5-\u0278\n-\3-\3-\3-\3-\3-\5-\u027f\n-\3-\3-\3-\3-\3-\3-\5-"+
		"\u0287\n-\3.\3.\3.\3.\3.\7.\u028e\n.\f.\16.\u0291\13.\3.\5.\u0294\n.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02a3\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u02ac\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u02b7\n\61\3\62\3\62\3\62\3\62\5\62\u02bd\n\62\3\63\3\63\3"+
		"\63\6\63\u02c2\n\63\r\63\16\63\u02c3\3\63\6\63\u02c7\n\63\r\63\16\63\u02c8"+
		"\3\64\3\64\3\64\7\64\u02ce\n\64\f\64\16\64\u02d1\13\64\3\64\3\64\3\65"+
		"\3\65\5\65\u02d7\n\65\3\65\3\65\3\65\7\65\u02dc\n\65\f\65\16\65\u02df"+
		"\13\65\3\65\5\65\u02e2\n\65\3\65\3\65\3\65\3\66\5\66\u02e8\n\66\3\66\3"+
		"\66\3\66\3\66\5\66\u02ee\n\66\3\67\5\67\u02f1\n\67\3\67\3\67\3\67\5\67"+
		"\u02f6\n\67\3\67\3\67\3\67\3\67\5\67\u02fc\n\67\38\38\38\38\38\38\38\5"+
		"8\u0305\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0315\n9\3:\3"+
		":\3:\6:\u031a\n:\r:\16:\u031b\3:\6:\u031f\n:\r:\16:\u0320\3;\3;\3;\7;"+
		"\u0326\n;\f;\16;\u0329\13;\3;\3;\5;\u032d\n;\3<\3<\3<\3<\3<\7<\u0334\n"+
		"<\f<\16<\u0337\13<\3<\3<\3<\3<\5<\u033d\n<\3=\3=\3=\3=\3=\3=\3=\5=\u0346"+
		"\n=\3>\3>\3>\5>\u034b\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u0359"+
		"\n>\f>\16>\u035c\13>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u036b\n"+
		"?\3@\3@\3@\3@\7@\u0371\n@\f@\16@\u0374\13@\3@\3@\3A\3A\5A\u037a\nA\3B"+
		"\3B\3B\3B\5B\u0380\nB\3C\3C\3C\3C\5C\u0386\nC\3D\3D\3D\3D\7D\u038c\nD"+
		"\fD\16D\u038f\13D\3D\3D\3E\3E\5E\u0395\nE\3F\3F\3F\3F\5F\u039b\nF\3G\3"+
		"G\3G\3G\5G\u03a1\nG\3H\3H\3H\3H\7H\u03a7\nH\fH\16H\u03aa\13H\3H\3H\3I"+
		"\3I\3I\3I\7I\u03b2\nI\fI\16I\u03b5\13I\3I\3I\3J\3J\3J\5J\u03bc\nJ\3K\3"+
		"K\3K\3K\5K\u03c2\nK\3L\3L\3L\3L\5L\u03c8\nL\3M\3M\3M\3M\5M\u03ce\nM\3"+
		"N\3N\3N\3N\7N\u03d4\nN\fN\16N\u03d7\13N\3N\3N\3O\3O\5O\u03dd\nO\3P\3P"+
		"\3P\3P\5P\u03e3\nP\3Q\3Q\3Q\3Q\3Q\5Q\u03ea\nQ\3Q\7Q\u03ed\nQ\fQ\16Q\u03f0"+
		"\13Q\3Q\3Q\3R\3R\3R\5R\u03f7\nR\3S\3S\3S\3S\5S\u03fd\nS\3T\3T\3T\3T\5"+
		"T\u0403\nT\3U\3U\3U\3U\5U\u0409\nU\3V\3V\3V\3V\7V\u040f\nV\fV\16V\u0412"+
		"\13V\3V\3V\3W\3W\3W\3W\5W\u041a\nW\3X\3X\3X\3X\5X\u0420\nX\3Y\3Y\3Y\3"+
		"Y\5Y\u0426\nY\3Z\3Z\3Z\3Z\5Z\u042c\nZ\3[\3[\3[\3[\7[\u0432\n[\f[\16[\u0435"+
		"\13[\3[\3[\3\\\3\\\3\\\5\\\u043c\n\\\3]\3]\3]\3]\7]\u0442\n]\f]\16]\u0445"+
		"\13]\3]\3]\3^\3^\3^\3^\5^\u044d\n^\3^\5^\u0450\n^\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\6_\u045a\n_\r_\16_\u045b\3_\3_\3_\3_\3_\6_\u0463\n_\r_\16_\u0464"+
		"\3_\3_\5_\u0469\n_\3`\3`\3`\3`\5`\u046f\n`\3`\3`\3`\3`\5`\u0475\n`\5`"+
		"\u0477\n`\3a\3a\3a\3a\5a\u047d\na\3a\3a\3a\3a\5a\u0483\na\3a\3a\3a\3a"+
		"\5a\u0489\na\3a\3a\3a\3a\5a\u048f\na\5a\u0491\na\3b\3b\3b\3b\7b\u0497"+
		"\nb\fb\16b\u049a\13b\3b\3b\3c\3c\5c\u04a0\nc\3d\3d\3d\3d\5d\u04a6\nd\3"+
		"d\5d\u04a9\nd\3e\3e\3e\3e\3e\5e\u04b0\ne\3e\7e\u04b3\ne\fe\16e\u04b6\13"+
		"e\3e\3e\3f\3f\3f\5f\u04bd\nf\3g\3g\3g\3g\5g\u04c3\ng\3h\3h\3h\3h\7h\u04c9"+
		"\nh\fh\16h\u04cc\13h\3h\3h\3i\3i\3i\5i\u04d3\ni\3j\3j\3j\3j\7j\u04d9\n"+
		"j\fj\16j\u04dc\13j\3j\3j\3k\3k\5k\u04e2\nk\3l\3l\3l\3l\5l\u04e8\nl\3l"+
		"\2\3zm\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\2\t\3\2uv\3\2\6\13\3\2\n\13\4\2((+,\3\2\20\23\5\2))+/\62"+
		"\63\3\2qr\2\u055f\2\u00da\3\2\2\2\4\u00e2\3\2\2\2\6\u00e4\3\2\2\2\b\u00e6"+
		"\3\2\2\2\n\u00e9\3\2\2\2\f\u0103\3\2\2\2\16\u0105\3\2\2\2\20\u0110\3\2"+
		"\2\2\22\u0112\3\2\2\2\24\u0120\3\2\2\2\26\u0127\3\2\2\2\30\u012a\3\2\2"+
		"\2\32\u0130\3\2\2\2\34\u0142\3\2\2\2\36\u0144\3\2\2\2 \u014b\3\2\2\2\""+
		"\u0152\3\2\2\2$\u0158\3\2\2\2&\u0160\3\2\2\2(\u0172\3\2\2\2*\u0174\3\2"+
		"\2\2,\u0178\3\2\2\2.\u0181\3\2\2\2\60\u0185\3\2\2\2\62\u01a0\3\2\2\2\64"+
		"\u01a2\3\2\2\2\66\u01c4\3\2\2\28\u01c6\3\2\2\2:\u01db\3\2\2\2<\u01df\3"+
		"\2\2\2>\u01e2\3\2\2\2@\u01e7\3\2\2\2B\u01ed\3\2\2\2D\u0201\3\2\2\2F\u0206"+
		"\3\2\2\2H\u0214\3\2\2\2J\u0219\3\2\2\2L\u022c\3\2\2\2N\u0230\3\2\2\2P"+
		"\u023c\3\2\2\2R\u024a\3\2\2\2T\u0258\3\2\2\2V\u026d\3\2\2\2X\u0286\3\2"+
		"\2\2Z\u0288\3\2\2\2\\\u0297\3\2\2\2^\u02a4\3\2\2\2`\u02ad\3\2\2\2b\u02bc"+
		"\3\2\2\2d\u02c1\3\2\2\2f\u02cf\3\2\2\2h\u02d4\3\2\2\2j\u02ed\3\2\2\2l"+
		"\u02fb\3\2\2\2n\u0304\3\2\2\2p\u0314\3\2\2\2r\u0319\3\2\2\2t\u0327\3\2"+
		"\2\2v\u0335\3\2\2\2x\u0345\3\2\2\2z\u034a\3\2\2\2|\u036a\3\2\2\2~\u036c"+
		"\3\2\2\2\u0080\u0379\3\2\2\2\u0082\u037b\3\2\2\2\u0084\u0381\3\2\2\2\u0086"+
		"\u0387\3\2\2\2\u0088\u0394\3\2\2\2\u008a\u0396\3\2\2\2\u008c\u039c\3\2"+
		"\2\2\u008e\u03a2\3\2\2\2\u0090\u03ad\3\2\2\2\u0092\u03bb\3\2\2\2\u0094"+
		"\u03bd\3\2\2\2\u0096\u03c3\3\2\2\2\u0098\u03c9\3\2\2\2\u009a\u03cf\3\2"+
		"\2\2\u009c\u03dc\3\2\2\2\u009e\u03de\3\2\2\2\u00a0\u03e4\3\2\2\2\u00a2"+
		"\u03f6\3\2\2\2\u00a4\u03f8\3\2\2\2\u00a6\u03fe\3\2\2\2\u00a8\u0404\3\2"+
		"\2\2\u00aa\u040a\3\2\2\2\u00ac\u0419\3\2\2\2\u00ae\u041b\3\2\2\2\u00b0"+
		"\u0421\3\2\2\2\u00b2\u0427\3\2\2\2\u00b4\u042d\3\2\2\2\u00b6\u043b\3\2"+
		"\2\2\u00b8\u043d\3\2\2\2\u00ba\u044f\3\2\2\2\u00bc\u0468\3\2\2\2\u00be"+
		"\u0476\3\2\2\2\u00c0\u0490\3\2\2\2\u00c2\u0492\3\2\2\2\u00c4\u049f\3\2"+
		"\2\2\u00c6\u04a1\3\2\2\2\u00c8\u04aa\3\2\2\2\u00ca\u04bc\3\2\2\2\u00cc"+
		"\u04be\3\2\2\2\u00ce\u04c4\3\2\2\2\u00d0\u04d2\3\2\2\2\u00d2\u04d4\3\2"+
		"\2\2\u00d4\u04e1\3\2\2\2\u00d6\u04e3\3\2\2\2\u00d8\u00db\5R*\2\u00d9\u00db"+
		"\5@!\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\2"+
		"\2\3\u00df\3\3\2\2\2\u00e0\u00e3\5\6\4\2\u00e1\u00e3\5\b\5\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\5\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5"+
		"\7\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\t\2\2\2\u00e8\t\3\2\2\2\u00e9"+
		"\u00ed\7\4\2\2\u00ea\u00ec\5\f\7\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f1\7\5\2\2\u00f1\13\3\2\2\2\u00f2\u0104\5\22\n"+
		"\2\u00f3\u0104\5\30\r\2\u00f4\u0104\5\"\22\2\u00f5\u0104\5$\23\2\u00f6"+
		"\u0104\5&\24\2\u00f7\u0104\5,\27\2\u00f8\u00f9\5\62\32\2\u00f9\u00fa\7"+
		"t\2\2\u00fa\u0104\3\2\2\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\7t\2\2\u00fd"+
		"\u0104\3\2\2\2\u00fe\u0104\5@!\2\u00ff\u0100\5l\67\2\u0100\u0101\7t\2"+
		"\2\u0101\u0104\3\2\2\2\u0102\u0104\5n8\2\u0103\u00f2\3\2\2\2\u0103\u00f3"+
		"\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f5\3\2\2\2\u0103\u00f6\3\2\2\2\u0103"+
		"\u00f7\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fe\3\2"+
		"\2\2\u0103\u00ff\3\2\2\2\u0103\u0102\3\2\2\2\u0104\r\3\2\2\2\u0105\u0106"+
		"\5\20\t\2\u0106\17\3\2\2\2\u0107\u0108\7x\2\2\u0108\u0109\t\3\2\2\u0109"+
		"\u0111\7x\2\2\u010a\u010b\7x\2\2\u010b\u010c\t\3\2\2\u010c\u0111\5z>\2"+
		"\u010d\u010e\7x\2\2\u010e\u010f\t\4\2\2\u010f\u0111\7w\2\2\u0110\u0107"+
		"\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111\21\3\2\2\2\u0112"+
		"\u0113\7\33\2\2\u0113\u0114\7\f\2\2\u0114\u0115\5\16\b\2\u0115\u0116\7"+
		"\r\2\2\u0116\u011e\5\n\6\2\u0117\u0119\5\24\13\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011f\5\26\f\2\u011e\u011a\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\23\3\2\2\2\u0120\u0121\7\34\2\2\u0121\u0122\7\33"+
		"\2\2\u0122\u0123\7\f\2\2\u0123\u0124\5\16\b\2\u0124\u0125\7\r\2\2\u0125"+
		"\u0126\5\n\6\2\u0126\25\3\2\2\2\u0127\u0128\7\34\2\2\u0128\u0129\5\n\6"+
		"\2\u0129\27\3\2\2\2\u012a\u012b\7\35\2\2\u012b\u012c\7\f\2\2\u012c\u012d"+
		"\7x\2\2\u012d\u012e\7\r\2\2\u012e\u012f\5\32\16\2\u012f\31\3\2\2\2\u0130"+
		"\u0132\7\4\2\2\u0131\u0133\5\34\17\2\u0132\u0131\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\5\36\20\2\u0137\u0138\7\5\2\2\u0138\33\3\2\2\2\u0139\u013a\7\36"+
		"\2\2\u013a\u013b\5\4\3\2\u013b\u013c\7\16\2\2\u013c\u013d\5 \21\2\u013d"+
		"\u0143\3\2\2\2\u013e\u013f\7\36\2\2\u013f\u0140\7w\2\2\u0140\u0141\7\16"+
		"\2\2\u0141\u0143\5 \21\2\u0142\u0139\3\2\2\2\u0142\u013e\3\2\2\2\u0143"+
		"\35\3\2\2\2\u0144\u0145\7\37\2\2\u0145\u0146\7\16\2\2\u0146\u0147\5 \21"+
		"\2\u0147\37\3\2\2\2\u0148\u014a\5\f\7\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7 \2\2\u014f\u0151\7t\2\2\u0150\u014e\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151!\3\2\2\2\u0152\u0153\7\"\2\2\u0153\u0154"+
		"\7\f\2\2\u0154\u0155\5\16\b\2\u0155\u0156\7\r\2\2\u0156\u0157\5\n\6\2"+
		"\u0157#\3\2\2\2\u0158\u0159\7#\2\2\u0159\u015a\5\n\6\2\u015a\u015b\7\""+
		"\2\2\u015b\u015c\7\f\2\2\u015c\u015d\5\16\b\2\u015d\u015e\7\r\2\2\u015e"+
		"\u015f\7t\2\2\u015f%\3\2\2\2\u0160\u0161\7$\2\2\u0161\u0162\7\f\2\2\u0162"+
		"\u0163\5(\25\2\u0163\u0164\7t\2\2\u0164\u0165\5\16\b\2\u0165\u0166\7t"+
		"\2\2\u0166\u0167\5*\26\2\u0167\u0168\7\r\2\2\u0168\u0169\5\n\6\2\u0169"+
		"\'\3\2\2\2\u016a\u016b\t\5\2\2\u016b\u016c\7x\2\2\u016c\u016d\7\17\2\2"+
		"\u016d\u0173\5z>\2\u016e\u016f\7x\2\2\u016f\u0170\7\17\2\2\u0170\u0173"+
		"\5z>\2\u0171\u0173\7x\2\2\u0172\u016a\3\2\2\2\u0172\u016e\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173)\3\2\2\2\u0174\u0175\7x\2\2\u0175\u0176\t\6\2\2\u0176"+
		"\u0177\5z>\2\u0177+\3\2\2\2\u0178\u0179\7%\2\2\u0179\u017a\7\f\2\2\u017a"+
		"\u017b\5\60\31\2\u017b\u017c\7x\2\2\u017c\u017d\7\24\2\2\u017d\u017e\7"+
		"x\2\2\u017e\u017f\7\r\2\2\u017f\u0180\5\n\6\2\u0180-\3\2\2\2\u0181\u0182"+
		"\t\7\2\2\u0182/\3\2\2\2\u0183\u0186\7(\2\2\u0184\u0186\5.\30\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0184\3\2\2\2\u0186\61\3\2\2\2\u0187\u0189\7\65\2\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\7&"+
		"\2\2\u018b\u018d\5.\30\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\7x\2\2\u018f\u0191\5\64\33\2\u0190\u018f\3"+
		"\2\2\2\u0190\u0191\3\2\2\2\u0191\u01a1\3\2\2\2\u0192\u0194\7\'\2\2\u0193"+
		"\u0195\5.\30\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\7x\2\2\u0197\u01a1\5\64\33\2\u0198\u019a\7\65\2\2\u0199"+
		"\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\5\60"+
		"\31\2\u019c\u019e\7x\2\2\u019d\u019f\5\64\33\2\u019e\u019d\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u0188\3\2\2\2\u01a0\u0192\3\2"+
		"\2\2\u01a0\u0199\3\2\2\2\u01a1\63\3\2\2\2\u01a2\u01aa\7\17\2\2\u01a3\u01ab"+
		"\7x\2\2\u01a4\u01ab\7w\2\2\u01a5\u01ab\5B\"\2\u01a6\u01ab\5l\67\2\u01a7"+
		"\u01ab\5n8\2\u01a8\u01ab\5z>\2\u01a9\u01ab\58\35\2\u01aa\u01a3\3\2\2\2"+
		"\u01aa\u01a4\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a7"+
		"\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\65\3\2\2\2\u01ac"+
		"\u01ad\7x\2\2\u01ad\u01b5\7\17\2\2\u01ae\u01b6\7x\2\2\u01af\u01b6\7w\2"+
		"\2\u01b0\u01b6\5B\"\2\u01b1\u01b6\5l\67\2\u01b2\u01b6\5n8\2\u01b3\u01b6"+
		"\5z>\2\u01b4\u01b6\58\35\2\u01b5\u01ae\3\2\2\2\u01b5\u01af\3\2\2\2\u01b5"+
		"\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01c5\3\2\2\2\u01b7\u01b8\7x\2\2\u01b8"+
		"\u01b9\7\25\2\2\u01b9\u01ba\7x\2\2\u01ba\u01c2\7\17\2\2\u01bb\u01c3\7"+
		"x\2\2\u01bc\u01c3\7w\2\2\u01bd\u01c3\5B\"\2\u01be\u01c3\5l\67\2\u01bf"+
		"\u01c3\5n8\2\u01c0\u01c3\5z>\2\u01c1\u01c3\58\35\2\u01c2\u01bb\3\2\2\2"+
		"\u01c2\u01bc\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01be\3\2\2\2\u01c2\u01bf"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01ac\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c5\67\3\2\2\2\u01c6\u01d0\7\26\2"+
		"\2\u01c7\u01c8\5:\36\2\u01c8\u01c9\7s\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c7"+
		"\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\5:\36\2\u01d0\u01cc\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7\27\2\2\u01d3"+
		"9\3\2\2\2\u01d4\u01dc\7x\2\2\u01d5\u01dc\7w\2\2\u01d6\u01dc\5z>\2\u01d7"+
		"\u01dc\5n8\2\u01d8\u01dc\58\35\2\u01d9\u01dc\5l\67\2\u01da\u01dc\5B\""+
		"\2\u01db\u01d4\3\2\2\2\u01db\u01d5\3\2\2\2\u01db\u01d6\3\2\2\2\u01db\u01d7"+
		"\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc"+
		";\3\2\2\2\u01dd\u01e0\7*\2\2\u01de\u01e0\5.\30\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0=\3\2\2\2\u01e1\u01e3\5<\37\2\u01e2\u01e1\3\2\2\2"+
		"\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7x\2\2\u01e5\u01e6"+
		"\5D#\2\u01e6?\3\2\2\2\u01e7\u01e9\5> \2\u01e8\u01ea\7\67\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5N(\2\u01ec"+
		"A\3\2\2\2\u01ed\u01ef\5D#\2\u01ee\u01f0\7\67\2\2\u01ef\u01ee\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5N(\2\u01f2C\3\2\2\2\u01f3"+
		"\u01f4\7\f\2\2\u01f4\u01f5\5F$\2\u01f5\u01f6\7\r\2\2\u01f6\u0202\3\2\2"+
		"\2\u01f7\u01f8\7\f\2\2\u01f8\u01f9\5H%\2\u01f9\u01fa\7\r\2\2\u01fa\u0202"+
		"\3\2\2\2\u01fb\u01fc\7\f\2\2\u01fc\u01fd\5J&\2\u01fd\u01fe\7\r\2\2\u01fe"+
		"\u0202\3\2\2\2\u01ff\u0200\7\f\2\2\u0200\u0202\7\r\2\2\u0201\u01f3\3\2"+
		"\2\2\u0201\u01f7\3\2\2\2\u0201\u01fb\3\2\2\2\u0201\u01ff\3\2\2\2\u0202"+
		"E\3\2\2\2\u0203\u0204\5H%\2\u0204\u0205\7s\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0203\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209\u020b\3\2\2\2\u020a\u020c\5J&\2\u020b\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eG\3\2\2\2\u020f"+
		"\u0210\5L\'\2\u0210\u0211\7s\2\2\u0211\u0213\3\2\2\2\u0212\u020f\3\2\2"+
		"\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217"+
		"\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\5L\'\2\u0218I\3\2\2\2\u0219\u0222"+
		"\7\4\2\2\u021a\u021c\7\66\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2"+
		"\u021c\u021d\3\2\2\2\u021d\u021e\5L\'\2\u021e\u021f\7s\2\2\u021f\u0221"+
		"\3\2\2\2\u0220\u021b\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\7\66"+
		"\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\5L\'\2\u0229\u022a\7\5\2\2\u022aK\3\2\2\2\u022b\u022d\5.\30\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7x"+
		"\2\2\u022fM\3\2\2\2\u0230\u0234\7\4\2\2\u0231\u0233\5\f\7\2\u0232\u0231"+
		"\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0239\5P)\2\u0238\u0237\3\2\2"+
		"\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7\5\2\2\u023bO"+
		"\3\2\2\2\u023c\u0245\7\64\2\2\u023d\u0246\7x\2\2\u023e\u0246\7w\2\2\u023f"+
		"\u0246\5z>\2\u0240\u0246\5n8\2\u0241\u0246\58\35\2\u0242\u0246\5l\67\2"+
		"\u0243\u0246\5B\"\2\u0244\u0246\5\16\b\2\u0245\u023d\3\2\2\2\u0245\u023e"+
		"\3\2\2\2\u0245\u023f\3\2\2\2\u0245\u0240\3\2\2\2\u0245\u0241\3\2\2\2\u0245"+
		"\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7t\2\2\u0248Q\3\2\2\2\u0249\u024b"+
		"\7=\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024d\79\2\2\u024d\u0250\7x\2\2\u024e\u024f\7:\2\2\u024f\u0251\7x\2\2"+
		"\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0253"+
		"\7<\2\2\u0253\u0255\7x\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0257\5T+\2\u0257S\3\2\2\2\u0258\u025d\7\4\2\2\u0259"+
		"\u025c\5V,\2\u025a\u025c\5X-\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2"+
		"\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0261"+
		"\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\5^\60\2\u0261\u0260\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0267\3\2\2\2\u0263\u0266\5V,\2\u0264\u0266\5X-\2"+
		"\u0265\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026b\7\5\2\2\u026bU\3\2\2\2\u026c\u026e\7@\2\2\u026d\u026c\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5\62\32\2\u0270\u0271\7"+
		"t\2\2\u0271W\3\2\2\2\u0272\u0274\7>\2\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\5> \2\u0276\u0278\7\67\2\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5Z"+
		".\2\u027a\u0287\3\2\2\2\u027b\u027c\7@\2\2\u027c\u027e\5> \2\u027d\u027f"+
		"\7\67\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2"+
		"\u0280\u0281\5Z.\2\u0281\u0287\3\2\2\2\u0282\u0283\5> \2\u0283\u0284\7"+
		"t\2\2\u0284\u0287\3\2\2\2\u0285\u0287\5`\61\2\u0286\u0273\3\2\2\2\u0286"+
		"\u027b\3\2\2\2\u0286\u0282\3\2\2\2\u0286\u0285\3\2\2\2\u0287Y\3\2\2\2"+
		"\u0288\u028f\7\4\2\2\u0289\u028e\5\f\7\2\u028a\u028b\5\\/\2\u028b\u028c"+
		"\7t\2\2\u028c\u028e\3\2\2\2\u028d\u0289\3\2\2\2\u028d\u028a\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0292\u0294\5P)\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\5\2\2\u0296[\3\2\2\2\u0297"+
		"\u0298\7?\2\2\u0298\u0299\7\25\2\2\u0299\u029a\7x\2\2\u029a\u02a2\7\17"+
		"\2\2\u029b\u02a3\7x\2\2\u029c\u02a3\7w\2\2\u029d\u02a3\5z>\2\u029e\u02a3"+
		"\5n8\2\u029f\u02a3\58\35\2\u02a0\u02a3\5l\67\2\u02a1\u02a3\5B\"\2\u02a2"+
		"\u029b\3\2\2\2\u02a2\u029c\3\2\2\2\u02a2\u029d\3\2\2\2\u02a2\u029e\3\2"+
		"\2\2\u02a2\u029f\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3"+
		"]\3\2\2\2\u02a4\u02a5\7x\2\2\u02a5\u02a6\7\f\2\2\u02a6\u02ab\5b\62\2\u02a7"+
		"\u02a8\7\r\2\2\u02a8\u02ac\7t\2\2\u02a9\u02aa\7\r\2\2\u02aa\u02ac\5Z."+
		"\2\u02ab\u02a7\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac_\3\2\2\2\u02ad\u02ae"+
		"\7x\2\2\u02ae\u02af\7\25\2\2\u02af\u02b0\7x\2\2\u02b0\u02b1\7\f\2\2\u02b1"+
		"\u02b6\5b\62\2\u02b2\u02b3\7\r\2\2\u02b3\u02b7\7t\2\2\u02b4\u02b5\7\r"+
		"\2\2\u02b5\u02b7\5Z.\2\u02b6\u02b2\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7a"+
		"\3\2\2\2\u02b8\u02bd\5d\63\2\u02b9\u02bd\5f\64\2\u02ba\u02bd\5h\65\2\u02bb"+
		"\u02bd\3\2\2\2\u02bc\u02b8\3\2\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02ba\3\2"+
		"\2\2\u02bc\u02bb\3\2\2\2\u02bdc\3\2\2\2\u02be\u02bf\5f\64\2\u02bf\u02c0"+
		"\7s\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02be\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c7\5h"+
		"\65\2\u02c6\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9e\3\2\2\2\u02ca\u02cb\5j\66\2\u02cb\u02cc\7s\2\2\u02cc"+
		"\u02ce\3\2\2\2\u02cd\u02ca\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2"+
		"\u02d3\5j\66\2\u02d3g\3\2\2\2\u02d4\u02dd\7\4\2\2\u02d5\u02d7\7\66\2\2"+
		"\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9"+
		"\5j\66\2\u02d9\u02da\7s\2\2\u02da\u02dc\3\2\2\2\u02db\u02d6\3\2\2\2\u02dc"+
		"\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e1\3\2"+
		"\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\7\66\2\2\u02e1\u02e0\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\5j\66\2\u02e4\u02e5\7\5"+
		"\2\2\u02e5i\3\2\2\2\u02e6\u02e8\5.\30\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ee\7x\2\2\u02ea\u02eb\7?\2\2\u02eb"+
		"\u02ec\7\25\2\2\u02ec\u02ee\7x\2\2\u02ed\u02e7\3\2\2\2\u02ed\u02ea\3\2"+
		"\2\2\u02eek\3\2\2\2\u02ef\u02f1\78\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7x\2\2\u02f3\u02fc\5p9\2\u02f4"+
		"\u02f6\78\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f8\7x\2\2\u02f8\u02f9\7\25\2\2\u02f9\u02fa\7x\2\2\u02fa"+
		"\u02fc\5p9\2\u02fb\u02f0\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fcm\3\2\2\2\u02fd"+
		"\u02fe\7A\2\2\u02fe\u02ff\7x\2\2\u02ff\u0300\7\f\2\2\u0300\u0301\5p9\2"+
		"\u0301\u0302\7\r\2\2\u0302\u0305\3\2\2\2\u0303\u0305\5|?\2\u0304\u02fd"+
		"\3\2\2\2\u0304\u0303\3\2\2\2\u0305o\3\2\2\2\u0306\u0307\7\f\2\2\u0307"+
		"\u0308\5r:\2\u0308\u0309\7\r\2\2\u0309\u0315\3\2\2\2\u030a\u030b\7\f\2"+
		"\2\u030b\u030c\5t;\2\u030c\u030d\7\r\2\2\u030d\u0315\3\2\2\2\u030e\u030f"+
		"\7\f\2\2\u030f\u0310\5v<\2\u0310\u0311\7\r\2\2\u0311\u0315\3\2\2\2\u0312"+
		"\u0313\7\f\2\2\u0313\u0315\7\r\2\2\u0314\u0306\3\2\2\2\u0314\u030a\3\2"+
		"\2\2\u0314\u030e\3\2\2\2\u0314\u0312\3\2\2\2\u0315q\3\2\2\2\u0316\u0317"+
		"\5t;\2\u0317\u0318\7s\2\2\u0318\u031a\3\2\2\2\u0319\u0316\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2"+
		"\2\2\u031d\u031f\5v<\2\u031e\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u031e"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321s\3\2\2\2\u0322\u0323\5x=\2\u0323\u0324"+
		"\7s\2\2\u0324\u0326\3\2\2\2\u0325\u0322\3\2\2\2\u0326\u0329\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2"+
		"\2\2\u032a\u032c\5x=\2\u032b\u032d\7s\2\2\u032c\u032b\3\2\2\2\u032c\u032d"+
		"\3\2\2\2\u032du\3\2\2\2\u032e\u032f\7x\2\2\u032f\u0330\7\16\2\2\u0330"+
		"\u0331\5x=\2\u0331\u0332\7s\2\2\u0332\u0334\3\2\2\2\u0333\u032e\3\2\2"+
		"\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338"+
		"\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7x\2\2\u0339\u033a\7\16\2\2\u033a"+
		"\u033c\5x=\2\u033b\u033d\7s\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2"+
		"\2\u033dw\3\2\2\2\u033e\u0346\7x\2\2\u033f\u0346\7w\2\2\u0340\u0346\5"+
		"z>\2\u0341\u0346\5n8\2\u0342\u0346\58\35\2\u0343\u0346\5l\67\2\u0344\u0346"+
		"\5B\"\2\u0345\u033e\3\2\2\2\u0345\u033f\3\2\2\2\u0345\u0340\3\2\2\2\u0345"+
		"\u0341\3\2\2\2\u0345\u0342\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0344\3\2"+
		"\2\2\u0346y\3\2\2\2\u0347\u0348\b>\1\2\u0348\u034b\5\4\3\2\u0349\u034b"+
		"\7x\2\2\u034a\u0347\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u035a\3\2\2\2\u034c"+
		"\u034d\f\b\2\2\u034d\u034e\7\30\2\2\u034e\u0359\5z>\t\u034f\u0350\f\7"+
		"\2\2\u0350\u0351\7\31\2\2\u0351\u0359\5z>\b\u0352\u0353\f\6\2\2\u0353"+
		"\u0354\7\32\2\2\u0354\u0359\5z>\7\u0355\u0356\f\5\2\2\u0356\u0357\7\3"+
		"\2\2\u0357\u0359\5z>\6\u0358\u034c\3\2\2\2\u0358\u034f\3\2\2\2\u0358\u0352"+
		"\3\2\2\2\u0358\u0355\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b{\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u036b\5~@\2\u035e"+
		"\u036b\5\u00d2j\2\u035f\u036b\5\u0086D\2\u0360\u036b\5\u008eH\2\u0361"+
		"\u036b\5\u0090I\2\u0362\u036b\5\u009aN\2\u0363\u036b\5\u00a0Q\2\u0364"+
		"\u036b\5\u00aaV\2\u0365\u036b\5\u00b4[\2\u0366\u036b\5\u00b8]\2\u0367"+
		"\u036b\5\u00c2b\2\u0368\u036b\5\u00c8e\2\u0369\u036b\5\u00ceh\2\u036a"+
		"\u035d\3\2\2\2\u036a\u035e\3\2\2\2\u036a\u035f\3\2\2\2\u036a\u0360\3\2"+
		"\2\2\u036a\u0361\3\2\2\2\u036a\u0362\3\2\2\2\u036a\u0363\3\2\2\2\u036a"+
		"\u0364\3\2\2\2\u036a\u0365\3\2\2\2\u036a\u0366\3\2\2\2\u036a\u0367\3\2"+
		"\2\2\u036a\u0368\3\2\2\2\u036a\u0369\3\2\2\2\u036b}\3\2\2\2\u036c\u036d"+
		"\7A\2\2\u036d\u036e\7E\2\2\u036e\u0372\7\f\2\2\u036f\u0371\5\u0080A\2"+
		"\u0370\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373"+
		"\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0376\7\r\2\2\u0376"+
		"\177\3\2\2\2\u0377\u037a\5\u0082B\2\u0378\u037a\5\u0084C\2\u0379\u0377"+
		"\3\2\2\2\u0379\u0378\3\2\2\2\u037a\u0081\3\2\2\2\u037b\u037c\7F\2\2\u037c"+
		"\u037d\7\16\2\2\u037d\u037f\7w\2\2\u037e\u0380\7s\2\2\u037f\u037e\3\2"+
		"\2\2\u037f\u0380\3\2\2\2\u0380\u0083\3\2\2\2\u0381\u0382\7G\2\2\u0382"+
		"\u0383\7\16\2\2\u0383\u0385\5n8\2\u0384\u0386\7s\2\2\u0385\u0384\3\2\2"+
		"\2\u0385\u0386\3\2\2\2\u0386\u0085\3\2\2\2\u0387\u0388\7A\2\2\u0388\u0389"+
		"\7H\2\2\u0389\u038d\7\f\2\2\u038a\u038c\5\u0088E\2\u038b\u038a\3\2\2\2"+
		"\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390"+
		"\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7\r\2\2\u0391\u0087\3\2\2\2\u0392"+
		"\u0395\5\u008aF\2\u0393\u0395\5\u008cG\2\u0394\u0392\3\2\2\2\u0394\u0393"+
		"\3\2\2\2\u0395\u0089\3\2\2\2\u0396\u0397\7J\2\2\u0397\u0398\7\16\2\2\u0398"+
		"\u039a\7n\2\2\u0399\u039b\7s\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2"+
		"\2\u039b\u008b\3\2\2\2\u039c\u039d\7I\2\2\u039d\u039e\7\16\2\2\u039e\u03a0"+
		"\5n8\2\u039f\u03a1\7s\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u008d\3\2\2\2\u03a2\u03a3\7A\2\2\u03a3\u03a4\7K\2\2\u03a4\u03a8\7\f\2"+
		"\2\u03a5\u03a7\5\u0092J\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2"+
		"\2\2\u03ab\u03ac\7\r\2\2\u03ac\u008f\3\2\2\2\u03ad\u03ae\7A\2\2\u03ae"+
		"\u03af\7L\2\2\u03af\u03b3\7\f\2\2\u03b0\u03b2\5\u0092J\2\u03b1\u03b0\3"+
		"\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b6\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\7\r\2\2\u03b7\u0091\3\2"+
		"\2\2\u03b8\u03bc\5\u0094K\2\u03b9\u03bc\5\u0096L\2\u03ba\u03bc\5\u0098"+
		"M\2\u03bb\u03b8\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc"+
		"\u0093\3\2\2\2\u03bd\u03be\7M\2\2\u03be\u03bf\7\16\2\2\u03bf\u03c1\7p"+
		"\2\2\u03c0\u03c2\7s\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u0095\3\2\2\2\u03c3\u03c4\7N\2\2\u03c4\u03c5\7\16\2\2\u03c5\u03c7\7p"+
		"\2\2\u03c6\u03c8\7s\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u0097\3\2\2\2\u03c9\u03ca\7l\2\2\u03ca\u03cb\7\16\2\2\u03cb\u03cd\58"+
		"\35\2\u03cc\u03ce\7s\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u0099\3\2\2\2\u03cf\u03d0\7A\2\2\u03d0\u03d1\7\\\2\2\u03d1\u03d5\7\f"+
		"\2\2\u03d2\u03d4\5\u009cO\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d8\u03d9\7\r\2\2\u03d9\u009b\3\2\2\2\u03da\u03dd\5\u009eP\2\u03db"+
		"\u03dd\5\u0098M\2\u03dc\u03da\3\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u009d"+
		"\3\2\2\2\u03de\u03df\7Z\2\2\u03df\u03e0\7\16\2\2\u03e0\u03e2\7]\2\2\u03e1"+
		"\u03e3\7s\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u009f\3\2"+
		"\2\2\u03e4\u03e5\7A\2\2\u03e5\u03e6\7O\2\2\u03e6\u03e7\7\f\2\2\u03e7\u03e9"+
		"\7w\2\2\u03e8\u03ea\7s\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u03ee\3\2\2\2\u03eb\u03ed\5\u00a2R\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0"+
		"\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0"+
		"\u03ee\3\2\2\2\u03f1\u03f2\7\r\2\2\u03f2\u00a1\3\2\2\2\u03f3\u03f7\5\u00a4"+
		"S\2\u03f4\u03f7\5\u00a6T\2\u03f5\u03f7\5\u00a8U\2\u03f6\u03f3\3\2\2\2"+
		"\u03f6\u03f4\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7\u00a3\3\2\2\2\u03f8\u03f9"+
		"\7P\2\2\u03f9\u03fa\7\16\2\2\u03fa\u03fc\7n\2\2\u03fb\u03fd\7s\2\2\u03fc"+
		"\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u00a5\3\2\2\2\u03fe\u03ff\7Q"+
		"\2\2\u03ff\u0400\7\16\2\2\u0400\u0402\7u\2\2\u0401\u0403\7s\2\2\u0402"+
		"\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u00a7\3\2\2\2\u0404\u0405\7R"+
		"\2\2\u0405\u0406\7\16\2\2\u0406\u0408\7o\2\2\u0407\u0409\7s\2\2\u0408"+
		"\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u00a9\3\2\2\2\u040a\u040b\7A"+
		"\2\2\u040b\u040c\7S\2\2\u040c\u0410\7\f\2\2\u040d\u040f\5\u00acW\2\u040e"+
		"\u040d\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2"+
		"\2\2\u0411\u0413\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0414\7\r\2\2\u0414"+
		"\u00ab\3\2\2\2\u0415\u041a\5\u00aeX\2\u0416\u041a\5\u00b0Y\2\u0417\u041a"+
		"\5\u00b2Z\2\u0418\u041a\5\u00a4S\2\u0419\u0415\3\2\2\2\u0419\u0416\3\2"+
		"\2\2\u0419\u0417\3\2\2\2\u0419\u0418\3\2\2\2\u041a\u00ad\3\2\2\2\u041b"+
		"\u041c\7U\2\2\u041c\u041d\7\16\2\2\u041d\u041f\7u\2\2\u041e\u0420\7s\2"+
		"\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u00af\3\2\2\2\u0421\u0422"+
		"\7V\2\2\u0422\u0423\7\16\2\2\u0423\u0425\7u\2\2\u0424\u0426\7s\2\2\u0425"+
		"\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u00b1\3\2\2\2\u0427\u0428\7k"+
		"\2\2\u0428\u0429\7\16\2\2\u0429\u042b\5n8\2\u042a\u042c\7s\2\2\u042b\u042a"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u00b3\3\2\2\2\u042d\u042e\7A\2\2\u042e"+
		"\u042f\7T\2\2\u042f\u0433\7\f\2\2\u0430\u0432\5\u00b6\\\2\u0431\u0430"+
		"\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0436\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\7\r\2\2\u0437\u00b5\3\2"+
		"\2\2\u0438\u043c\5\u00aeX\2\u0439\u043c\5\u00b0Y\2\u043a\u043c\5\u00b2"+
		"Z\2\u043b\u0438\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043a\3\2\2\2\u043c"+
		"\u00b7\3\2\2\2\u043d\u043e\7A\2\2\u043e\u043f\7a\2\2\u043f\u0443\7\f\2"+
		"\2\u0440\u0442\5\u00ba^\2\u0441\u0440\3\2\2\2\u0442\u0445\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446\3\2\2\2\u0445\u0443\3\2"+
		"\2\2\u0446\u0447\7\r\2\2\u0447\u00b9\3\2\2\2\u0448\u0449\7b\2\2\u0449"+
		"\u044a\7\16\2\2\u044a\u044c\5\u00bc_\2\u044b\u044d\7s\2\2\u044c\u044b"+
		"\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u0450\5\u00b2Z"+
		"\2\u044f\u0448\3\2\2\2\u044f\u044e\3\2\2\2\u0450\u00bb\3\2\2\2\u0451\u0469"+
		"\7c\2\2\u0452\u0453\7d\2\2\u0453\u0454\7\f\2\2\u0454\u0455\7u\2\2\u0455"+
		"\u0469\7\r\2\2\u0456\u0457\7e\2\2\u0457\u0459\7\f\2\2\u0458\u045a\5\u00be"+
		"`\2\u0459\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7\r\2\2\u045e\u0469\3\2"+
		"\2\2\u045f\u0460\7f\2\2\u0460\u0462\7\f\2\2\u0461\u0463\5\u00c0a\2\u0462"+
		"\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2"+
		"\2\2\u0465\u0466\3\2\2\2\u0466\u0467\7\r\2\2\u0467\u0469\3\2\2\2\u0468"+
		"\u0451\3\2\2\2\u0468\u0452\3\2\2\2\u0468\u0456\3\2\2\2\u0468\u045f\3\2"+
		"\2\2\u0469\u00bd\3\2\2\2\u046a\u046b\7q\2\2\u046b\u046c\7\16\2\2\u046c"+
		"\u046e\7u\2\2\u046d\u046f\7s\2\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2"+
		"\2\u046f\u0477\3\2\2\2\u0470\u0471\7r\2\2\u0471\u0472\7\16\2\2\u0472\u0474"+
		"\7u\2\2\u0473\u0475\7s\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0477\3\2\2\2\u0476\u046a\3\2\2\2\u0476\u0470\3\2\2\2\u0477\u00bf\3\2"+
		"\2\2\u0478\u0479\7g\2\2\u0479\u047a\7\16\2\2\u047a\u047c\7u\2\2\u047b"+
		"\u047d\7s\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u0491\3\2"+
		"\2\2\u047e\u047f\7i\2\2\u047f\u0480\7\16\2\2\u0480\u0482\7u\2\2\u0481"+
		"\u0483\7s\2\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0491\3\2"+
		"\2\2\u0484\u0485\7h\2\2\u0485\u0486\7\16\2\2\u0486\u0488\7u\2\2\u0487"+
		"\u0489\7s\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u0491\3\2"+
		"\2\2\u048a\u048b\7j\2\2\u048b\u048c\7\16\2\2\u048c\u048e\7u\2\2\u048d"+
		"\u048f\7s\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2"+
		"\2\2\u0490\u0478\3\2\2\2\u0490\u047e\3\2\2\2\u0490\u0484\3\2\2\2\u0490"+
		"\u048a\3\2\2\2\u0491\u00c1\3\2\2\2\u0492\u0493\7A\2\2\u0493\u0494\7X\2"+
		"\2\u0494\u0498\7\f\2\2\u0495\u0497\5\u00c4c\2\u0496\u0495\3\2\2\2\u0497"+
		"\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2"+
		"\2\2\u049a\u0498\3\2\2\2\u049b\u049c\7\r\2\2\u049c\u00c3\3\2\2\2\u049d"+
		"\u04a0\5\u00c6d\2\u049e\u04a0\5\u00b2Z\2\u049f\u049d\3\2\2\2\u049f\u049e"+
		"\3\2\2\2\u04a0\u00c5\3\2\2\2\u04a1\u04a2\7m\2\2\u04a2\u04a5\7\16\2\2\u04a3"+
		"\u04a6\5l\67\2\u04a4\u04a6\5B\"\2\u04a5\u04a3\3\2\2\2\u04a5\u04a4\3\2"+
		"\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a9\7s\2\2\u04a8\u04a7\3\2\2\2\u04a8"+
		"\u04a9\3\2\2\2\u04a9\u00c7\3\2\2\2\u04aa\u04ab\7A\2\2\u04ab\u04ac\7Y\2"+
		"\2\u04ac\u04ad\7\f\2\2\u04ad\u04af\7w\2\2\u04ae\u04b0\7s\2\2\u04af\u04ae"+
		"\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b4\3\2\2\2\u04b1\u04b3\5\u00caf"+
		"\2\u04b2\u04b1\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5"+
		"\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b8\7\r\2\2\u04b8"+
		"\u00c9\3\2\2\2\u04b9\u04bd\5\u00ccg\2\u04ba\u04bd\5\u00aeX\2\u04bb\u04bd"+
		"\5\u00b0Y\2\u04bc\u04b9\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2"+
		"\2\u04bd\u00cb\3\2\2\2\u04be\u04bf\7Z\2\2\u04bf\u04c0\7\16\2\2\u04c0\u04c2"+
		"\7[\2\2\u04c1\u04c3\7s\2\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u00cd\3\2\2\2\u04c4\u04c5\7A\2\2\u04c5\u04c6\7^\2\2\u04c6\u04ca\7\f\2"+
		"\2\u04c7\u04c9\5\u00d0i\2\u04c8\u04c7\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca"+
		"\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ca\3\2"+
		"\2\2\u04cd\u04ce\7\r\2\2\u04ce\u00cf\3\2\2\2\u04cf\u04d3\5\u00c6d\2\u04d0"+
		"\u04d3\5\u00b2Z\2\u04d1\u04d3\5\u00a4S\2\u04d2\u04cf\3\2\2\2\u04d2\u04d0"+
		"\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u00d1\3\2\2\2\u04d4\u04d5\7A\2\2\u04d5"+
		"\u04d6\7_\2\2\u04d6\u04da\7\f\2\2\u04d7\u04d9\5\u00d4k\2\u04d8\u04d7\3"+
		"\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04dd\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04de\7\r\2\2\u04de\u00d3\3\2"+
		"\2\2\u04df\u04e2\5\u00d6l\2\u04e0\u04e2\5\u00b2Z\2\u04e1\u04df\3\2\2\2"+
		"\u04e1\u04e0\3\2\2\2\u04e2\u00d5\3\2\2\2\u04e3\u04e4\7`\2\2\u04e4\u04e5"+
		"\7\16\2\2\u04e5\u04e7\t\b\2\2\u04e6\u04e8\7s\2\2\u04e7\u04e6\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u00d7\3\2\2\2\u0092\u00da\u00dc\u00e2\u00ed\u0103"+
		"\u0110\u011a\u011e\u0134\u0142\u014b\u0150\u0172\u0185\u0188\u018c\u0190"+
		"\u0194\u0199\u019e\u01a0\u01aa\u01b5\u01c2\u01c4\u01cc\u01d0\u01db\u01df"+
		"\u01e2\u01e9\u01ef\u0201\u0208\u020d\u0214\u021b\u0222\u0226\u022c\u0234"+
		"\u0238\u0245\u024a\u0250\u0254\u025b\u025d\u0261\u0265\u0267\u026d\u0273"+
		"\u0277\u027e\u0286\u028d\u028f\u0293\u02a2\u02ab\u02b6\u02bc\u02c3\u02c8"+
		"\u02cf\u02d6\u02dd\u02e1\u02e7\u02ed\u02f0\u02f5\u02fb\u0304\u0314\u031b"+
		"\u0320\u0327\u032c\u0335\u033c\u0345\u034a\u0358\u035a\u036a\u0372\u0379"+
		"\u037f\u0385\u038d\u0394\u039a\u03a0\u03a8\u03b3\u03bb\u03c1\u03c7\u03cd"+
		"\u03d5\u03dc\u03e2\u03e9\u03ee\u03f6\u03fc\u0402\u0408\u0410\u0419\u041f"+
		"\u0425\u042b\u0433\u043b\u0443\u044c\u044f\u045b\u0464\u0468\u046e\u0474"+
		"\u0476\u047c\u0482\u0488\u048e\u0490\u0498\u049f\u04a5\u04a8\u04af\u04b4"+
		"\u04bc\u04c2\u04ca\u04d2\u04da\u04e1\u04e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}