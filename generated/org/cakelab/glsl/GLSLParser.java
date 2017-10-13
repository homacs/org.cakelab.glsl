// Generated from grammar/GLSL.g4 by ANTLR 4.7
package org.cakelab.glsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_OP=1, RIGHT_OP=2, INC_OP=3, DEC_OP=4, LE_OP=5, GE_OP=6, EQ_OP=7, 
		NE_OP=8, AND_OP=9, OR_OP=10, XOR_OP=11, MUL_ASSIGN=12, DIV_ASSIGN=13, 
		ADD_ASSIGN=14, MOD_ASSIGN=15, LEFT_ASSIGN=16, RIGHT_ASSIGN=17, AND_ASSIGN=18, 
		XOR_ASSIGN=19, OR_ASSIGN=20, SUB_ASSIGN=21, LEFT_PAREN=22, RIGHT_PAREN=23, 
		LEFT_BRACKET=24, RIGHT_BRACKET=25, LEFT_BRACE=26, RIGHT_BRACE=27, DOT=28, 
		COMMA=29, COLON=30, EQUAL=31, SEMICOLON=32, BANG=33, DASH=34, TILDE=35, 
		PLUS=36, STAR=37, SLASH=38, PERCENT=39, LEFT_ANGLE=40, RIGHT_ANGLE=41, 
		VERTICAL_BAR=42, CARET=43, AMPERSAND=44, QUESTION=45, IDENTIFIER=46, VOID=47, 
		BOOLCONSTANT=48, INTCONSTANT=49, UINTCONSTANT=50, FLOATCONSTANT=51, DOUBLECONSTANT=52, 
		ATTRIBUTE=53, CONST=54, UNIFORM=55, VARYING=56, BUFFER=57, SHARED=58, 
		COHERENT=59, VOLATILE=60, RESTRICT=61, READONLY=62, WRITEONLY=63, LAYOUT=64, 
		CENTROID=65, FLAT=66, SMOOTH=67, NOPERSPECTIVE=68, PATCH=69, SAMPLE=70, 
		BREAK=71, CONTINUE=72, DO=73, FOR=74, WHILE=75, SWITCH=76, CASE=77, DEFAULT=78, 
		IF=79, ELSE=80, SUBROUTINE=81, IN=82, OUT=83, INOUT=84, INVARIANT=85, 
		PRECISE=86, DISCARD=87, RETURN=88, LOWP=89, MEDIUMP=90, HIGHP=91, PRECISION=92, 
		STRUCT=93;
	public static final int
		RULE_glsl = 0, RULE_glslDeclaration = 1, RULE_glslDeclarationStatement = 2, 
		RULE_glslTypePrecisionDeclaration = 3, RULE_glslVariableDeclarations = 4, 
		RULE_glslInterfaceBlockStructure = 5, RULE_glslFunctionPrototype = 6, 
		RULE_glslFunctionParameters = 7, RULE_glslParameterDeclaration = 8, RULE_glslVariableDeclarator = 9, 
		RULE_glslFullySpecifiedType = 10, RULE_glslInitializer = 11, RULE_glslStatement = 12, 
		RULE_glslSimpleStatement = 13, RULE_glslCompoundStatement = 14, RULE_glslExpressionStatement = 15, 
		RULE_glslIfStatement = 16, RULE_glslNonIfStatement = 17, RULE_glslSwitchStatement = 18, 
		RULE_glslSwitchSubStatement = 19, RULE_glslCondition = 20, RULE_glslWhileStatement = 21, 
		RULE_glslDoWhileStatement = 22, RULE_glslForStatement = 23, RULE_glslForInitExpression = 24, 
		RULE_glslJumpStatement = 25, RULE_glslTranslationUnit = 26, RULE_glslExternalDeclaration = 27, 
		RULE_glslFunctionDefinition = 28, RULE_glslFieldSelection = 29, RULE_glslIdentifier = 30, 
		RULE_glslTypeName = 31, RULE_glslVariableIdentifier = 32, RULE_glslFunctionName = 33, 
		RULE_glslBoolConstant = 34, RULE_glslIntegerConstant = 35, RULE_glslUnsignedIntegerConstant = 36, 
		RULE_glslFloatConstant = 37, RULE_glslDoubleConstant = 38, RULE_glslPrimaryExpression = 39, 
		RULE_glslPostfixExpression = 40, RULE_glslCallArguments = 41, RULE_glslIntegerExpression = 42, 
		RULE_glslUnaryExpression = 43, RULE_glslUnaryOperator = 44, RULE_glslMultiplicativeExpression = 45, 
		RULE_glslAdditiveExpression = 46, RULE_glslShiftExpression = 47, RULE_glslRelationalExpression = 48, 
		RULE_glslEqualityExpression = 49, RULE_glslAndExpression = 50, RULE_glslExclusiveOrExpression = 51, 
		RULE_glslInclusiveOrExpression = 52, RULE_glslLogicalAndExpression = 53, 
		RULE_glslLogicalXorExpression = 54, RULE_glslLogicalOrExpression = 55, 
		RULE_glslConditionalExpression = 56, RULE_glslAssignmentExpression = 57, 
		RULE_glslAssignmentOperator = 58, RULE_glslExpression = 59, RULE_glslConstantExpression = 60, 
		RULE_glslFunctionNameList = 61, RULE_glslTypeSpecifier = 62, RULE_glslArrayDimension = 63, 
		RULE_glslTypeSpecifierNonarray = 64, RULE_glslStructSpecifier = 65, RULE_glslStructBody = 66, 
		RULE_glslStructMemberGroup = 67, RULE_glslStructMemberDeclaratorList = 68, 
		RULE_glslStructMemberDeclarator = 69, RULE_glslTypeQualifier = 70, RULE_glslSingleTypeQualifier = 71, 
		RULE_glslInvariantQualifier = 72, RULE_glslInterpolationQualifier = 73, 
		RULE_glslLayoutQualifier = 74, RULE_glslLayoutQualifierIdList = 75, RULE_glslLayoutQualifierId = 76, 
		RULE_glslPreciseQualifier = 77, RULE_glslStorageQualifier = 78, RULE_glslPrecisionQualifier = 79;
	public static final String[] ruleNames = {
		"glsl", "glslDeclaration", "glslDeclarationStatement", "glslTypePrecisionDeclaration", 
		"glslVariableDeclarations", "glslInterfaceBlockStructure", "glslFunctionPrototype", 
		"glslFunctionParameters", "glslParameterDeclaration", "glslVariableDeclarator", 
		"glslFullySpecifiedType", "glslInitializer", "glslStatement", "glslSimpleStatement", 
		"glslCompoundStatement", "glslExpressionStatement", "glslIfStatement", 
		"glslNonIfStatement", "glslSwitchStatement", "glslSwitchSubStatement", 
		"glslCondition", "glslWhileStatement", "glslDoWhileStatement", "glslForStatement", 
		"glslForInitExpression", "glslJumpStatement", "glslTranslationUnit", "glslExternalDeclaration", 
		"glslFunctionDefinition", "glslFieldSelection", "glslIdentifier", "glslTypeName", 
		"glslVariableIdentifier", "glslFunctionName", "glslBoolConstant", "glslIntegerConstant", 
		"glslUnsignedIntegerConstant", "glslFloatConstant", "glslDoubleConstant", 
		"glslPrimaryExpression", "glslPostfixExpression", "glslCallArguments", 
		"glslIntegerExpression", "glslUnaryExpression", "glslUnaryOperator", "glslMultiplicativeExpression", 
		"glslAdditiveExpression", "glslShiftExpression", "glslRelationalExpression", 
		"glslEqualityExpression", "glslAndExpression", "glslExclusiveOrExpression", 
		"glslInclusiveOrExpression", "glslLogicalAndExpression", "glslLogicalXorExpression", 
		"glslLogicalOrExpression", "glslConditionalExpression", "glslAssignmentExpression", 
		"glslAssignmentOperator", "glslExpression", "glslConstantExpression", 
		"glslFunctionNameList", "glslTypeSpecifier", "glslArrayDimension", "glslTypeSpecifierNonarray", 
		"glslStructSpecifier", "glslStructBody", "glslStructMemberGroup", "glslStructMemberDeclaratorList", 
		"glslStructMemberDeclarator", "glslTypeQualifier", "glslSingleTypeQualifier", 
		"glslInvariantQualifier", "glslInterpolationQualifier", "glslLayoutQualifier", 
		"glslLayoutQualifierIdList", "glslLayoutQualifierId", "glslPreciseQualifier", 
		"glslStorageQualifier", "glslPrecisionQualifier"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_OP", "RIGHT_OP", "INC_OP", "DEC_OP", "LE_OP", "GE_OP", "EQ_OP", 
		"NE_OP", "AND_OP", "OR_OP", "XOR_OP", "MUL_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", 
		"MOD_ASSIGN", "LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", 
		"OR_ASSIGN", "SUB_ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "DOT", "COMMA", "COLON", 
		"EQUAL", "SEMICOLON", "BANG", "DASH", "TILDE", "PLUS", "STAR", "SLASH", 
		"PERCENT", "LEFT_ANGLE", "RIGHT_ANGLE", "VERTICAL_BAR", "CARET", "AMPERSAND", 
		"QUESTION", "IDENTIFIER", "VOID", "BOOLCONSTANT", "INTCONSTANT", "UINTCONSTANT", 
		"FLOATCONSTANT", "DOUBLECONSTANT", "ATTRIBUTE", "CONST", "UNIFORM", "VARYING", 
		"BUFFER", "SHARED", "COHERENT", "VOLATILE", "RESTRICT", "READONLY", "WRITEONLY", 
		"LAYOUT", "CENTROID", "FLAT", "SMOOTH", "NOPERSPECTIVE", "PATCH", "SAMPLE", 
		"BREAK", "CONTINUE", "DO", "FOR", "WHILE", "SWITCH", "CASE", "DEFAULT", 
		"IF", "ELSE", "SUBROUTINE", "IN", "OUT", "INOUT", "INVARIANT", "PRECISE", 
		"DISCARD", "RETURN", "LOWP", "MEDIUMP", "HIGHP", "PRECISION", "STRUCT"
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

	@Override
	public String getGrammarFileName() { return "GLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GLSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GlslContext extends ParserRuleContext {
		public GlslTranslationUnitContext glslTranslationUnit() {
			return getRuleContext(GlslTranslationUnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GLSLParser.EOF, 0); }
		public GlslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslContext glsl() throws RecognitionException {
		GlslContext _localctx = new GlslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_glsl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			glslTranslationUnit();
			setState(161);
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

	public static class GlslDeclarationContext extends ParserRuleContext {
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslTypePrecisionDeclarationContext glslTypePrecisionDeclaration() {
			return getRuleContext(GlslTypePrecisionDeclarationContext.class,0);
		}
		public GlslIdentifierContext glslIdentifier() {
			return getRuleContext(GlslIdentifierContext.class,0);
		}
		public List<GlslVariableIdentifierContext> glslVariableIdentifier() {
			return getRuleContexts(GlslVariableIdentifierContext.class);
		}
		public GlslVariableIdentifierContext glslVariableIdentifier(int i) {
			return getRuleContext(GlslVariableIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslTypeNameContext glslTypeName() {
			return getRuleContext(GlslTypeNameContext.class,0);
		}
		public GlslVariableDeclarationsContext glslVariableDeclarations() {
			return getRuleContext(GlslVariableDeclarationsContext.class,0);
		}
		public List<GlslArrayDimensionContext> glslArrayDimension() {
			return getRuleContexts(GlslArrayDimensionContext.class);
		}
		public GlslArrayDimensionContext glslArrayDimension(int i) {
			return getRuleContext(GlslArrayDimensionContext.class,i);
		}
		public GlslStructSpecifierContext glslStructSpecifier() {
			return getRuleContext(GlslStructSpecifierContext.class,0);
		}
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslInterfaceBlockStructureContext glslInterfaceBlockStructure() {
			return getRuleContext(GlslInterfaceBlockStructureContext.class,0);
		}
		public GlslFunctionPrototypeContext glslFunctionPrototype() {
			return getRuleContext(GlslFunctionPrototypeContext.class,0);
		}
		public GlslDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslDeclarationContext glslDeclaration() throws RecognitionException {
		GlslDeclarationContext _localctx = new GlslDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_glslDeclaration);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				glslTypeQualifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				glslTypePrecisionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				glslTypeQualifier();
				setState(166);
				glslIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				glslTypeQualifier();
				setState(169);
				glslVariableIdentifier();
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					match(COMMA);
					setState(171);
					glslVariableIdentifier();
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				glslTypeQualifier();
				setState(177);
				glslTypeName();
				setState(178);
				glslVariableDeclarations();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				glslTypeQualifier();
				setState(181);
				glslTypeName();
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					glslArrayDimension();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LEFT_BRACKET );
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(187);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				glslTypeQualifier();
				setState(191);
				glslStructSpecifier();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(192);
					glslArrayDimension();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(198);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				glslTypeSpecifier();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(202);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				glslInterfaceBlockStructure();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(206);
					glslVariableIdentifier();
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LEFT_BRACKET) {
						{
						{
						setState(207);
						glslArrayDimension();
						}
						}
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(215);
				glslFunctionPrototype();
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

	public static class GlslDeclarationStatementContext extends ParserRuleContext {
		public GlslDeclarationContext glslDeclaration() {
			return getRuleContext(GlslDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslDeclarationStatementContext glslDeclarationStatement() throws RecognitionException {
		GlslDeclarationStatementContext _localctx = new GlslDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_glslDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			glslDeclaration();
			setState(219);
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

	public static class GlslTypePrecisionDeclarationContext extends ParserRuleContext {
		public TerminalNode PRECISION() { return getToken(GLSLParser.PRECISION, 0); }
		public GlslPrecisionQualifierContext glslPrecisionQualifier() {
			return getRuleContext(GlslPrecisionQualifierContext.class,0);
		}
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslTypePrecisionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypePrecisionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTypePrecisionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTypePrecisionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTypePrecisionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypePrecisionDeclarationContext glslTypePrecisionDeclaration() throws RecognitionException {
		GlslTypePrecisionDeclarationContext _localctx = new GlslTypePrecisionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_glslTypePrecisionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PRECISION);
			setState(222);
			glslPrecisionQualifier();
			setState(223);
			glslTypeSpecifier();
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

	public static class GlslVariableDeclarationsContext extends ParserRuleContext {
		public List<GlslVariableDeclaratorContext> glslVariableDeclarator() {
			return getRuleContexts(GlslVariableDeclaratorContext.class);
		}
		public GlslVariableDeclaratorContext glslVariableDeclarator(int i) {
			return getRuleContext(GlslVariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslVariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslVariableDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslVariableDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslVariableDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslVariableDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslVariableDeclarationsContext glslVariableDeclarations() throws RecognitionException {
		GlslVariableDeclarationsContext _localctx = new GlslVariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_glslVariableDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			glslVariableDeclarator();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				glslVariableDeclarator();
				}
				}
				setState(232);
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

	public static class GlslInterfaceBlockStructureContext extends ParserRuleContext {
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslStructBodyContext glslStructBody() {
			return getRuleContext(GlslStructBodyContext.class,0);
		}
		public GlslInterfaceBlockStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInterfaceBlockStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInterfaceBlockStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInterfaceBlockStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInterfaceBlockStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInterfaceBlockStructureContext glslInterfaceBlockStructure() throws RecognitionException {
		GlslInterfaceBlockStructureContext _localctx = new GlslInterfaceBlockStructureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_glslInterfaceBlockStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			glslTypeQualifier();
			setState(234);
			match(IDENTIFIER);
			setState(235);
			glslStructBody();
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

	public static class GlslFunctionPrototypeContext extends ParserRuleContext {
		public GlslFullySpecifiedTypeContext glslFullySpecifiedType() {
			return getRuleContext(GlslFullySpecifiedTypeContext.class,0);
		}
		public GlslFunctionNameContext glslFunctionName() {
			return getRuleContext(GlslFunctionNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslFunctionParametersContext glslFunctionParameters() {
			return getRuleContext(GlslFunctionParametersContext.class,0);
		}
		public GlslFunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionPrototypeContext glslFunctionPrototype() throws RecognitionException {
		GlslFunctionPrototypeContext _localctx = new GlslFunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_glslFunctionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			glslFullySpecifiedType();
			setState(238);
			glslFunctionName();
			setState(239);
			match(LEFT_PAREN);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (IDENTIFIER - 46)) | (1L << (VOID - 46)) | (1L << (ATTRIBUTE - 46)) | (1L << (CONST - 46)) | (1L << (UNIFORM - 46)) | (1L << (VARYING - 46)) | (1L << (BUFFER - 46)) | (1L << (SHARED - 46)) | (1L << (COHERENT - 46)) | (1L << (VOLATILE - 46)) | (1L << (RESTRICT - 46)) | (1L << (READONLY - 46)) | (1L << (WRITEONLY - 46)) | (1L << (LAYOUT - 46)) | (1L << (CENTROID - 46)) | (1L << (FLAT - 46)) | (1L << (SMOOTH - 46)) | (1L << (NOPERSPECTIVE - 46)) | (1L << (PATCH - 46)) | (1L << (SAMPLE - 46)) | (1L << (SUBROUTINE - 46)) | (1L << (IN - 46)) | (1L << (OUT - 46)) | (1L << (INOUT - 46)) | (1L << (INVARIANT - 46)) | (1L << (PRECISE - 46)) | (1L << (LOWP - 46)) | (1L << (MEDIUMP - 46)) | (1L << (HIGHP - 46)) | (1L << (STRUCT - 46)))) != 0)) {
				{
				setState(240);
				glslFunctionParameters();
				}
			}

			setState(243);
			match(RIGHT_PAREN);
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

	public static class GlslFunctionParametersContext extends ParserRuleContext {
		public List<GlslParameterDeclarationContext> glslParameterDeclaration() {
			return getRuleContexts(GlslParameterDeclarationContext.class);
		}
		public GlslParameterDeclarationContext glslParameterDeclaration(int i) {
			return getRuleContext(GlslParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionParametersContext glslFunctionParameters() throws RecognitionException {
		GlslFunctionParametersContext _localctx = new GlslFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_glslFunctionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			glslParameterDeclaration();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246);
				match(COMMA);
				setState(247);
				glslParameterDeclaration();
				}
				}
				setState(252);
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

	public static class GlslParameterDeclarationContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslVariableIdentifierContext glslVariableIdentifier() {
			return getRuleContext(GlslVariableIdentifierContext.class,0);
		}
		public List<GlslArrayDimensionContext> glslArrayDimension() {
			return getRuleContexts(GlslArrayDimensionContext.class);
		}
		public GlslArrayDimensionContext glslArrayDimension(int i) {
			return getRuleContext(GlslArrayDimensionContext.class,i);
		}
		public GlslParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslParameterDeclarationContext glslParameterDeclaration() throws RecognitionException {
		GlslParameterDeclarationContext _localctx = new GlslParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_glslParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (ATTRIBUTE - 53)) | (1L << (CONST - 53)) | (1L << (UNIFORM - 53)) | (1L << (VARYING - 53)) | (1L << (BUFFER - 53)) | (1L << (SHARED - 53)) | (1L << (COHERENT - 53)) | (1L << (VOLATILE - 53)) | (1L << (RESTRICT - 53)) | (1L << (READONLY - 53)) | (1L << (WRITEONLY - 53)) | (1L << (LAYOUT - 53)) | (1L << (CENTROID - 53)) | (1L << (FLAT - 53)) | (1L << (SMOOTH - 53)) | (1L << (NOPERSPECTIVE - 53)) | (1L << (PATCH - 53)) | (1L << (SAMPLE - 53)) | (1L << (SUBROUTINE - 53)) | (1L << (IN - 53)) | (1L << (OUT - 53)) | (1L << (INOUT - 53)) | (1L << (INVARIANT - 53)) | (1L << (PRECISE - 53)) | (1L << (LOWP - 53)) | (1L << (MEDIUMP - 53)) | (1L << (HIGHP - 53)))) != 0)) {
				{
				setState(253);
				glslTypeQualifier();
				}
			}

			setState(256);
			glslTypeSpecifier();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(257);
				glslVariableIdentifier();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(258);
					glslArrayDimension();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class GlslVariableDeclaratorContext extends ParserRuleContext {
		public GlslVariableIdentifierContext glslVariableIdentifier() {
			return getRuleContext(GlslVariableIdentifierContext.class,0);
		}
		public List<GlslArrayDimensionContext> glslArrayDimension() {
			return getRuleContexts(GlslArrayDimensionContext.class);
		}
		public GlslArrayDimensionContext glslArrayDimension(int i) {
			return getRuleContext(GlslArrayDimensionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslVariableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslVariableDeclaratorContext glslVariableDeclarator() throws RecognitionException {
		GlslVariableDeclaratorContext _localctx = new GlslVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_glslVariableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			glslVariableIdentifier();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(267);
				glslArrayDimension();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(273);
				match(EQUAL);
				setState(274);
				glslInitializer();
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

	public static class GlslFullySpecifiedTypeContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslFullySpecifiedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFullySpecifiedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFullySpecifiedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFullySpecifiedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFullySpecifiedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFullySpecifiedTypeContext glslFullySpecifiedType() throws RecognitionException {
		GlslFullySpecifiedTypeContext _localctx = new GlslFullySpecifiedTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_glslFullySpecifiedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (ATTRIBUTE - 53)) | (1L << (CONST - 53)) | (1L << (UNIFORM - 53)) | (1L << (VARYING - 53)) | (1L << (BUFFER - 53)) | (1L << (SHARED - 53)) | (1L << (COHERENT - 53)) | (1L << (VOLATILE - 53)) | (1L << (RESTRICT - 53)) | (1L << (READONLY - 53)) | (1L << (WRITEONLY - 53)) | (1L << (LAYOUT - 53)) | (1L << (CENTROID - 53)) | (1L << (FLAT - 53)) | (1L << (SMOOTH - 53)) | (1L << (NOPERSPECTIVE - 53)) | (1L << (PATCH - 53)) | (1L << (SAMPLE - 53)) | (1L << (SUBROUTINE - 53)) | (1L << (IN - 53)) | (1L << (OUT - 53)) | (1L << (INOUT - 53)) | (1L << (INVARIANT - 53)) | (1L << (PRECISE - 53)) | (1L << (LOWP - 53)) | (1L << (MEDIUMP - 53)) | (1L << (HIGHP - 53)))) != 0)) {
				{
				setState(277);
				glslTypeQualifier();
				}
			}

			setState(280);
			glslTypeSpecifier();
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

	public static class GlslInitializerContext extends ParserRuleContext {
		public GlslAssignmentExpressionContext glslAssignmentExpression() {
			return getRuleContext(GlslAssignmentExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public List<GlslInitializerContext> glslInitializer() {
			return getRuleContexts(GlslInitializerContext.class);
		}
		public GlslInitializerContext glslInitializer(int i) {
			return getRuleContext(GlslInitializerContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInitializerContext glslInitializer() throws RecognitionException {
		GlslInitializerContext _localctx = new GlslInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_glslInitializer);
		int _la;
		try {
			int _alt;
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC_OP:
			case DEC_OP:
			case LEFT_PAREN:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
			case IDENTIFIER:
			case BOOLCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				glslAssignmentExpression();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(LEFT_BRACE);
				setState(284);
				glslInitializer();
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(285);
						match(COMMA);
						setState(286);
						glslInitializer();
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(292);
					match(COMMA);
					}
				}

				setState(295);
				match(RIGHT_BRACE);
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

	public static class GlslStatementContext extends ParserRuleContext {
		public GlslCompoundStatementContext glslCompoundStatement() {
			return getRuleContext(GlslCompoundStatementContext.class,0);
		}
		public GlslSimpleStatementContext glslSimpleStatement() {
			return getRuleContext(GlslSimpleStatementContext.class,0);
		}
		public GlslStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStatementContext glslStatement() throws RecognitionException {
		GlslStatementContext _localctx = new GlslStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_glslStatement);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				glslCompoundStatement();
				}
				break;
			case INC_OP:
			case DEC_OP:
			case LEFT_PAREN:
			case SEMICOLON:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
			case IDENTIFIER:
			case VOID:
			case BOOLCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case ATTRIBUTE:
			case CONST:
			case UNIFORM:
			case VARYING:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case LAYOUT:
			case CENTROID:
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
			case PATCH:
			case SAMPLE:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case WHILE:
			case SWITCH:
			case IF:
			case SUBROUTINE:
			case IN:
			case OUT:
			case INOUT:
			case INVARIANT:
			case PRECISE:
			case DISCARD:
			case RETURN:
			case LOWP:
			case MEDIUMP:
			case HIGHP:
			case PRECISION:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				glslSimpleStatement();
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

	public static class GlslSimpleStatementContext extends ParserRuleContext {
		public GlslDeclarationStatementContext glslDeclarationStatement() {
			return getRuleContext(GlslDeclarationStatementContext.class,0);
		}
		public GlslExpressionStatementContext glslExpressionStatement() {
			return getRuleContext(GlslExpressionStatementContext.class,0);
		}
		public GlslIfStatementContext glslIfStatement() {
			return getRuleContext(GlslIfStatementContext.class,0);
		}
		public GlslSwitchStatementContext glslSwitchStatement() {
			return getRuleContext(GlslSwitchStatementContext.class,0);
		}
		public GlslWhileStatementContext glslWhileStatement() {
			return getRuleContext(GlslWhileStatementContext.class,0);
		}
		public GlslDoWhileStatementContext glslDoWhileStatement() {
			return getRuleContext(GlslDoWhileStatementContext.class,0);
		}
		public GlslForStatementContext glslForStatement() {
			return getRuleContext(GlslForStatementContext.class,0);
		}
		public GlslJumpStatementContext glslJumpStatement() {
			return getRuleContext(GlslJumpStatementContext.class,0);
		}
		public GlslSimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSimpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSimpleStatementContext glslSimpleStatement() throws RecognitionException {
		GlslSimpleStatementContext _localctx = new GlslSimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_glslSimpleStatement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				glslDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				glslExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				glslIfStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				glslWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				glslDoWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				glslForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(310);
				glslJumpStatement();
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

	public static class GlslCompoundStatementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public List<GlslStatementContext> glslStatement() {
			return getRuleContexts(GlslStatementContext.class);
		}
		public GlslStatementContext glslStatement(int i) {
			return getRuleContext(GlslStatementContext.class,i);
		}
		public GlslCompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslCompoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslCompoundStatementContext glslCompoundStatement() throws RecognitionException {
		GlslCompoundStatementContext _localctx = new GlslCompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_glslCompoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(LEFT_BRACE);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << SEMICOLON) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << VOID) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LAYOUT - 64)) | (1L << (CENTROID - 64)) | (1L << (FLAT - 64)) | (1L << (SMOOTH - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (PATCH - 64)) | (1L << (SAMPLE - 64)) | (1L << (BREAK - 64)) | (1L << (CONTINUE - 64)) | (1L << (DO - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (SWITCH - 64)) | (1L << (IF - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (INOUT - 64)) | (1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (LOWP - 64)) | (1L << (MEDIUMP - 64)) | (1L << (HIGHP - 64)) | (1L << (PRECISION - 64)) | (1L << (STRUCT - 64)))) != 0)) {
				{
				{
				setState(314);
				glslStatement();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(RIGHT_BRACE);
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

	public static class GlslExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslExpressionStatementContext glslExpressionStatement() throws RecognitionException {
		GlslExpressionStatementContext _localctx = new GlslExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_glslExpressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT))) != 0) || _la==STRUCT) {
				{
				setState(322);
				glslExpression();
				}
			}

			setState(325);
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

	public static class GlslIfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GLSLParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslConditionContext glslCondition() {
			return getRuleContext(GlslConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public GlslNonIfStatementContext glslNonIfStatement() {
			return getRuleContext(GlslNonIfStatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GLSLParser.ELSE, 0); }
		public GlslIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIfStatementContext glslIfStatement() throws RecognitionException {
		GlslIfStatementContext _localctx = new GlslIfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_glslIfStatement);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(IF);
				setState(328);
				match(LEFT_PAREN);
				setState(329);
				glslCondition();
				setState(330);
				match(RIGHT_PAREN);
				setState(331);
				glslStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(IF);
				setState(334);
				match(LEFT_PAREN);
				setState(335);
				glslCondition();
				setState(336);
				match(RIGHT_PAREN);
				setState(337);
				glslNonIfStatement();
				setState(338);
				match(ELSE);
				setState(339);
				glslStatement();
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

	public static class GlslNonIfStatementContext extends ParserRuleContext {
		public GlslCompoundStatementContext glslCompoundStatement() {
			return getRuleContext(GlslCompoundStatementContext.class,0);
		}
		public GlslDeclarationStatementContext glslDeclarationStatement() {
			return getRuleContext(GlslDeclarationStatementContext.class,0);
		}
		public GlslExpressionStatementContext glslExpressionStatement() {
			return getRuleContext(GlslExpressionStatementContext.class,0);
		}
		public GlslSwitchStatementContext glslSwitchStatement() {
			return getRuleContext(GlslSwitchStatementContext.class,0);
		}
		public GlslWhileStatementContext glslWhileStatement() {
			return getRuleContext(GlslWhileStatementContext.class,0);
		}
		public GlslDoWhileStatementContext glslDoWhileStatement() {
			return getRuleContext(GlslDoWhileStatementContext.class,0);
		}
		public GlslForStatementContext glslForStatement() {
			return getRuleContext(GlslForStatementContext.class,0);
		}
		public GlslJumpStatementContext glslJumpStatement() {
			return getRuleContext(GlslJumpStatementContext.class,0);
		}
		public GlslNonIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslNonIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslNonIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslNonIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslNonIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslNonIfStatementContext glslNonIfStatement() throws RecognitionException {
		GlslNonIfStatementContext _localctx = new GlslNonIfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_glslNonIfStatement);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				glslCompoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				glslDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				glslExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				glslWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				glslDoWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(349);
				glslForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(350);
				glslJumpStatement();
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

	public static class GlslSwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GLSLParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslConditionContext glslCondition() {
			return getRuleContext(GlslConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public List<GlslSwitchSubStatementContext> glslSwitchSubStatement() {
			return getRuleContexts(GlslSwitchSubStatementContext.class);
		}
		public GlslSwitchSubStatementContext glslSwitchSubStatement(int i) {
			return getRuleContext(GlslSwitchSubStatementContext.class,i);
		}
		public GlslSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSwitchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSwitchStatementContext glslSwitchStatement() throws RecognitionException {
		GlslSwitchStatementContext _localctx = new GlslSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_glslSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(SWITCH);
			setState(354);
			match(LEFT_PAREN);
			setState(355);
			glslCondition();
			setState(356);
			match(RIGHT_PAREN);
			setState(357);
			match(LEFT_BRACE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << SEMICOLON) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << VOID) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LAYOUT - 64)) | (1L << (CENTROID - 64)) | (1L << (FLAT - 64)) | (1L << (SMOOTH - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (PATCH - 64)) | (1L << (SAMPLE - 64)) | (1L << (BREAK - 64)) | (1L << (CONTINUE - 64)) | (1L << (DO - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (SWITCH - 64)) | (1L << (CASE - 64)) | (1L << (DEFAULT - 64)) | (1L << (IF - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (INOUT - 64)) | (1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (LOWP - 64)) | (1L << (MEDIUMP - 64)) | (1L << (HIGHP - 64)) | (1L << (PRECISION - 64)) | (1L << (STRUCT - 64)))) != 0)) {
				{
				{
				setState(358);
				glslSwitchSubStatement();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(RIGHT_BRACE);
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

	public static class GlslSwitchSubStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GLSLParser.CASE, 0); }
		public GlslIntegerExpressionContext glslIntegerExpression() {
			return getRuleContext(GlslIntegerExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(GLSLParser.DEFAULT, 0); }
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public GlslSwitchSubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSwitchSubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSwitchSubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSwitchSubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSwitchSubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSwitchSubStatementContext glslSwitchSubStatement() throws RecognitionException {
		GlslSwitchSubStatementContext _localctx = new GlslSwitchSubStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_glslSwitchSubStatement);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(CASE);
				setState(367);
				glslIntegerExpression();
				setState(368);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(DEFAULT);
				setState(371);
				match(COLON);
				}
				break;
			case INC_OP:
			case DEC_OP:
			case LEFT_PAREN:
			case LEFT_BRACE:
			case SEMICOLON:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
			case IDENTIFIER:
			case VOID:
			case BOOLCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case ATTRIBUTE:
			case CONST:
			case UNIFORM:
			case VARYING:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case LAYOUT:
			case CENTROID:
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
			case PATCH:
			case SAMPLE:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case WHILE:
			case SWITCH:
			case IF:
			case SUBROUTINE:
			case IN:
			case OUT:
			case INOUT:
			case INVARIANT:
			case PRECISE:
			case DISCARD:
			case RETURN:
			case LOWP:
			case MEDIUMP:
			case HIGHP:
			case PRECISION:
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				glslStatement();
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

	public static class GlslConditionContext extends ParserRuleContext {
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslFullySpecifiedTypeContext glslFullySpecifiedType() {
			return getRuleContext(GlslFullySpecifiedTypeContext.class,0);
		}
		public GlslVariableIdentifierContext glslVariableIdentifier() {
			return getRuleContext(GlslVariableIdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConditionContext glslCondition() throws RecognitionException {
		GlslConditionContext _localctx = new GlslConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_glslCondition);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				glslExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				glslFullySpecifiedType();
				setState(377);
				glslVariableIdentifier();
				setState(378);
				match(EQUAL);
				setState(379);
				glslInitializer();
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

	public static class GlslWhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GLSLParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslConditionContext glslCondition() {
			return getRuleContext(GlslConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public GlslWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslWhileStatementContext glslWhileStatement() throws RecognitionException {
		GlslWhileStatementContext _localctx = new GlslWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_glslWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(WHILE);
			setState(384);
			match(LEFT_PAREN);
			setState(385);
			glslCondition();
			setState(386);
			match(RIGHT_PAREN);
			setState(387);
			glslStatement();
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

	public static class GlslDoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(GLSLParser.DO, 0); }
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GLSLParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslDoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslDoWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslDoWhileStatementContext glslDoWhileStatement() throws RecognitionException {
		GlslDoWhileStatementContext _localctx = new GlslDoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_glslDoWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(DO);
			setState(390);
			glslStatement();
			setState(391);
			match(WHILE);
			setState(392);
			match(LEFT_PAREN);
			setState(393);
			glslExpression();
			setState(394);
			match(RIGHT_PAREN);
			setState(395);
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

	public static class GlslForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GLSLParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GLSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GLSLParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public GlslForInitExpressionContext glslForInitExpression() {
			return getRuleContext(GlslForInitExpressionContext.class,0);
		}
		public GlslConditionContext glslCondition() {
			return getRuleContext(GlslConditionContext.class,0);
		}
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslForStatementContext glslForStatement() throws RecognitionException {
		GlslForStatementContext _localctx = new GlslForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_glslForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(FOR);
			setState(398);
			match(LEFT_PAREN);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << VOID) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LAYOUT - 64)) | (1L << (CENTROID - 64)) | (1L << (FLAT - 64)) | (1L << (SMOOTH - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (PATCH - 64)) | (1L << (SAMPLE - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (INOUT - 64)) | (1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (LOWP - 64)) | (1L << (MEDIUMP - 64)) | (1L << (HIGHP - 64)) | (1L << (PRECISION - 64)) | (1L << (STRUCT - 64)))) != 0)) {
				{
				setState(399);
				glslForInitExpression();
				}
			}

			setState(402);
			match(SEMICOLON);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << VOID) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LAYOUT - 64)) | (1L << (CENTROID - 64)) | (1L << (FLAT - 64)) | (1L << (SMOOTH - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (PATCH - 64)) | (1L << (SAMPLE - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (INOUT - 64)) | (1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (LOWP - 64)) | (1L << (MEDIUMP - 64)) | (1L << (HIGHP - 64)) | (1L << (STRUCT - 64)))) != 0)) {
				{
				setState(403);
				glslCondition();
				}
			}

			setState(406);
			match(SEMICOLON);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT))) != 0) || _la==STRUCT) {
				{
				setState(407);
				glslExpression();
				}
			}

			setState(410);
			match(RIGHT_PAREN);
			setState(411);
			glslStatement();
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

	public static class GlslForInitExpressionContext extends ParserRuleContext {
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslDeclarationContext glslDeclaration() {
			return getRuleContext(GlslDeclarationContext.class,0);
		}
		public GlslForInitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslForInitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslForInitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslForInitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslForInitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslForInitExpressionContext glslForInitExpression() throws RecognitionException {
		GlslForInitExpressionContext _localctx = new GlslForInitExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_glslForInitExpression);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				glslExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				glslDeclaration();
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

	public static class GlslJumpStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GLSLParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(GLSLParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(GLSLParser.RETURN, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode DISCARD() { return getToken(GLSLParser.DISCARD, 0); }
		public GlslJumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslJumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslJumpStatementContext glslJumpStatement() throws RecognitionException {
		GlslJumpStatementContext _localctx = new GlslJumpStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_glslJumpStatement);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(CONTINUE);
				setState(418);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(BREAK);
				setState(420);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(RETURN);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT))) != 0) || _la==STRUCT) {
					{
					setState(422);
					glslExpression();
					}
				}

				setState(425);
				match(SEMICOLON);
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				match(DISCARD);
				setState(427);
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

	public static class GlslTranslationUnitContext extends ParserRuleContext {
		public List<GlslExternalDeclarationContext> glslExternalDeclaration() {
			return getRuleContexts(GlslExternalDeclarationContext.class);
		}
		public GlslExternalDeclarationContext glslExternalDeclaration(int i) {
			return getRuleContext(GlslExternalDeclarationContext.class,i);
		}
		public GlslTranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTranslationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTranslationUnitContext glslTranslationUnit() throws RecognitionException {
		GlslTranslationUnitContext _localctx = new GlslTranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_glslTranslationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (IDENTIFIER - 46)) | (1L << (VOID - 46)) | (1L << (ATTRIBUTE - 46)) | (1L << (CONST - 46)) | (1L << (UNIFORM - 46)) | (1L << (VARYING - 46)) | (1L << (BUFFER - 46)) | (1L << (SHARED - 46)) | (1L << (COHERENT - 46)) | (1L << (VOLATILE - 46)) | (1L << (RESTRICT - 46)) | (1L << (READONLY - 46)) | (1L << (WRITEONLY - 46)) | (1L << (LAYOUT - 46)) | (1L << (CENTROID - 46)) | (1L << (FLAT - 46)) | (1L << (SMOOTH - 46)) | (1L << (NOPERSPECTIVE - 46)) | (1L << (PATCH - 46)) | (1L << (SAMPLE - 46)) | (1L << (SUBROUTINE - 46)) | (1L << (IN - 46)) | (1L << (OUT - 46)) | (1L << (INOUT - 46)) | (1L << (INVARIANT - 46)) | (1L << (PRECISE - 46)) | (1L << (LOWP - 46)) | (1L << (MEDIUMP - 46)) | (1L << (HIGHP - 46)) | (1L << (PRECISION - 46)) | (1L << (STRUCT - 46)))) != 0)) {
				{
				{
				setState(430);
				glslExternalDeclaration();
				}
				}
				setState(435);
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

	public static class GlslExternalDeclarationContext extends ParserRuleContext {
		public GlslFunctionDefinitionContext glslFunctionDefinition() {
			return getRuleContext(GlslFunctionDefinitionContext.class,0);
		}
		public GlslDeclarationStatementContext glslDeclarationStatement() {
			return getRuleContext(GlslDeclarationStatementContext.class,0);
		}
		public GlslExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslExternalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslExternalDeclarationContext glslExternalDeclaration() throws RecognitionException {
		GlslExternalDeclarationContext _localctx = new GlslExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_glslExternalDeclaration);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				glslFunctionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				glslDeclarationStatement();
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

	public static class GlslFunctionDefinitionContext extends ParserRuleContext {
		public GlslFunctionPrototypeContext glslFunctionPrototype() {
			return getRuleContext(GlslFunctionPrototypeContext.class,0);
		}
		public GlslCompoundStatementContext glslCompoundStatement() {
			return getRuleContext(GlslCompoundStatementContext.class,0);
		}
		public GlslFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionDefinitionContext glslFunctionDefinition() throws RecognitionException {
		GlslFunctionDefinitionContext _localctx = new GlslFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_glslFunctionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			glslFunctionPrototype();
			setState(441);
			glslCompoundStatement();
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

	public static class GlslFieldSelectionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslFieldSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFieldSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFieldSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFieldSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFieldSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFieldSelectionContext glslFieldSelection() throws RecognitionException {
		GlslFieldSelectionContext _localctx = new GlslFieldSelectionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_glslFieldSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(IDENTIFIER);
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

	public static class GlslIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIdentifierContext glslIdentifier() throws RecognitionException {
		GlslIdentifierContext _localctx = new GlslIdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_glslIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(IDENTIFIER);
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

	public static class GlslTypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeNameContext glslTypeName() throws RecognitionException {
		GlslTypeNameContext _localctx = new GlslTypeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_glslTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(IDENTIFIER);
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

	public static class GlslVariableIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslVariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslVariableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslVariableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslVariableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslVariableIdentifierContext glslVariableIdentifier() throws RecognitionException {
		GlslVariableIdentifierContext _localctx = new GlslVariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_glslVariableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(IDENTIFIER);
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

	public static class GlslFunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionNameContext glslFunctionName() throws RecognitionException {
		GlslFunctionNameContext _localctx = new GlslFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_glslFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(IDENTIFIER);
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

	public static class GlslBoolConstantContext extends ParserRuleContext {
		public TerminalNode BOOLCONSTANT() { return getToken(GLSLParser.BOOLCONSTANT, 0); }
		public GlslBoolConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslBoolConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslBoolConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslBoolConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslBoolConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslBoolConstantContext glslBoolConstant() throws RecognitionException {
		GlslBoolConstantContext _localctx = new GlslBoolConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_glslBoolConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(BOOLCONSTANT);
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

	public static class GlslIntegerConstantContext extends ParserRuleContext {
		public TerminalNode INTCONSTANT() { return getToken(GLSLParser.INTCONSTANT, 0); }
		public GlslIntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIntegerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIntegerConstantContext glslIntegerConstant() throws RecognitionException {
		GlslIntegerConstantContext _localctx = new GlslIntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_glslIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(INTCONSTANT);
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

	public static class GlslUnsignedIntegerConstantContext extends ParserRuleContext {
		public TerminalNode UINTCONSTANT() { return getToken(GLSLParser.UINTCONSTANT, 0); }
		public GlslUnsignedIntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslUnsignedIntegerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslUnsignedIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslUnsignedIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslUnsignedIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslUnsignedIntegerConstantContext glslUnsignedIntegerConstant() throws RecognitionException {
		GlslUnsignedIntegerConstantContext _localctx = new GlslUnsignedIntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_glslUnsignedIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(UINTCONSTANT);
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

	public static class GlslFloatConstantContext extends ParserRuleContext {
		public TerminalNode FLOATCONSTANT() { return getToken(GLSLParser.FLOATCONSTANT, 0); }
		public GlslFloatConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFloatConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFloatConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFloatConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFloatConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFloatConstantContext glslFloatConstant() throws RecognitionException {
		GlslFloatConstantContext _localctx = new GlslFloatConstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_glslFloatConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(FLOATCONSTANT);
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

	public static class GlslDoubleConstantContext extends ParserRuleContext {
		public TerminalNode DOUBLECONSTANT() { return getToken(GLSLParser.DOUBLECONSTANT, 0); }
		public GlslDoubleConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslDoubleConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslDoubleConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslDoubleConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslDoubleConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslDoubleConstantContext glslDoubleConstant() throws RecognitionException {
		GlslDoubleConstantContext _localctx = new GlslDoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_glslDoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(DOUBLECONSTANT);
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

	public static class GlslPrimaryExpressionContext extends ParserRuleContext {
		public GlslIdentifierContext glslIdentifier() {
			return getRuleContext(GlslIdentifierContext.class,0);
		}
		public GlslStructSpecifierContext glslStructSpecifier() {
			return getRuleContext(GlslStructSpecifierContext.class,0);
		}
		public GlslFloatConstantContext glslFloatConstant() {
			return getRuleContext(GlslFloatConstantContext.class,0);
		}
		public GlslDoubleConstantContext glslDoubleConstant() {
			return getRuleContext(GlslDoubleConstantContext.class,0);
		}
		public GlslIntegerConstantContext glslIntegerConstant() {
			return getRuleContext(GlslIntegerConstantContext.class,0);
		}
		public GlslUnsignedIntegerConstantContext glslUnsignedIntegerConstant() {
			return getRuleContext(GlslUnsignedIntegerConstantContext.class,0);
		}
		public GlslBoolConstantContext glslBoolConstant() {
			return getRuleContext(GlslBoolConstantContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPrimaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPrimaryExpressionContext glslPrimaryExpression() throws RecognitionException {
		GlslPrimaryExpressionContext _localctx = new GlslPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_glslPrimaryExpression);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				glslIdentifier();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				glslStructSpecifier();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				glslDoubleConstant();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				glslUnsignedIntegerConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				glslBoolConstant();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(470);
				match(LEFT_PAREN);
				setState(471);
				glslExpression();
				setState(472);
				match(RIGHT_PAREN);
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

	public static class GlslPostfixExpressionContext extends ParserRuleContext {
		public GlslPrimaryExpressionContext glslPrimaryExpression() {
			return getRuleContext(GlslPrimaryExpressionContext.class,0);
		}
		public GlslPostfixExpressionContext glslPostfixExpression() {
			return getRuleContext(GlslPostfixExpressionContext.class,0);
		}
		public GlslCallArgumentsContext glslCallArguments() {
			return getRuleContext(GlslCallArgumentsContext.class,0);
		}
		public GlslArrayDimensionContext glslArrayDimension() {
			return getRuleContext(GlslArrayDimensionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public GlslFieldSelectionContext glslFieldSelection() {
			return getRuleContext(GlslFieldSelectionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public GlslPostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPostfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPostfixExpressionContext glslPostfixExpression() throws RecognitionException {
		return glslPostfixExpression(0);
	}

	private GlslPostfixExpressionContext glslPostfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslPostfixExpressionContext _localctx = new GlslPostfixExpressionContext(_ctx, _parentState);
		GlslPostfixExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_glslPostfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(477);
			glslPrimaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(479);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(480);
						glslCallArguments();
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(481);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(482);
						glslArrayDimension();
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(483);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(484);
						match(DOT);
						setState(485);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(486);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(487);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(488);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(489);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class GlslCallArgumentsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public List<GlslAssignmentExpressionContext> glslAssignmentExpression() {
			return getRuleContexts(GlslAssignmentExpressionContext.class);
		}
		public GlslAssignmentExpressionContext glslAssignmentExpression(int i) {
			return getRuleContext(GlslAssignmentExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public TerminalNode VOID() { return getToken(GLSLParser.VOID, 0); }
		public GlslCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslCallArgumentsContext glslCallArguments() throws RecognitionException {
		GlslCallArgumentsContext _localctx = new GlslCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_glslCallArguments);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(LEFT_PAREN);
				setState(496);
				glslAssignmentExpression();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(497);
					match(COMMA);
					setState(498);
					glslAssignmentExpression();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(LEFT_PAREN);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(507);
					match(VOID);
					}
				}

				setState(510);
				match(RIGHT_PAREN);
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

	public static class GlslIntegerExpressionContext extends ParserRuleContext {
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslIntegerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIntegerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIntegerExpressionContext glslIntegerExpression() throws RecognitionException {
		GlslIntegerExpressionContext _localctx = new GlslIntegerExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_glslIntegerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			glslExpression();
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

	public static class GlslUnaryExpressionContext extends ParserRuleContext {
		public GlslPostfixExpressionContext glslPostfixExpression() {
			return getRuleContext(GlslPostfixExpressionContext.class,0);
		}
		public GlslUnaryOperatorContext glslUnaryOperator() {
			return getRuleContext(GlslUnaryOperatorContext.class,0);
		}
		public GlslUnaryExpressionContext glslUnaryExpression() {
			return getRuleContext(GlslUnaryExpressionContext.class,0);
		}
		public GlslUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslUnaryExpressionContext glslUnaryExpression() throws RecognitionException {
		GlslUnaryExpressionContext _localctx = new GlslUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_glslUnaryExpression);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case IDENTIFIER:
			case BOOLCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				glslPostfixExpression(0);
				}
				break;
			case INC_OP:
			case DEC_OP:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				glslUnaryOperator();
				setState(517);
				glslUnaryExpression();
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

	public static class GlslUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public TerminalNode PLUS() { return getToken(GLSLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLParser.DASH, 0); }
		public TerminalNode BANG() { return getToken(GLSLParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(GLSLParser.TILDE, 0); }
		public GlslUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslUnaryOperatorContext glslUnaryOperator() throws RecognitionException {
		GlslUnaryOperatorContext _localctx = new GlslUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_glslUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS))) != 0)) ) {
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

	public static class GlslMultiplicativeExpressionContext extends ParserRuleContext {
		public GlslUnaryExpressionContext glslUnaryExpression() {
			return getRuleContext(GlslUnaryExpressionContext.class,0);
		}
		public GlslMultiplicativeExpressionContext glslMultiplicativeExpression() {
			return getRuleContext(GlslMultiplicativeExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(GLSLParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(GLSLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GLSLParser.PERCENT, 0); }
		public GlslMultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslMultiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslMultiplicativeExpressionContext glslMultiplicativeExpression() throws RecognitionException {
		return glslMultiplicativeExpression(0);
	}

	private GlslMultiplicativeExpressionContext glslMultiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslMultiplicativeExpressionContext _localctx = new GlslMultiplicativeExpressionContext(_ctx, _parentState);
		GlslMultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_glslMultiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(524);
			glslUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(526);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(527);
						match(STAR);
						setState(528);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(529);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(530);
						match(SLASH);
						setState(531);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(532);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(533);
						match(PERCENT);
						setState(534);
						glslUnaryExpression();
						}
						break;
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class GlslAdditiveExpressionContext extends ParserRuleContext {
		public GlslMultiplicativeExpressionContext glslMultiplicativeExpression() {
			return getRuleContext(GlslMultiplicativeExpressionContext.class,0);
		}
		public GlslAdditiveExpressionContext glslAdditiveExpression() {
			return getRuleContext(GlslAdditiveExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GLSLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLParser.DASH, 0); }
		public GlslAdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAdditiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslAdditiveExpressionContext glslAdditiveExpression() throws RecognitionException {
		return glslAdditiveExpression(0);
	}

	private GlslAdditiveExpressionContext glslAdditiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslAdditiveExpressionContext _localctx = new GlslAdditiveExpressionContext(_ctx, _parentState);
		GlslAdditiveExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_glslAdditiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(541);
			glslMultiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(543);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(544);
						match(PLUS);
						setState(545);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(546);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(547);
						match(DASH);
						setState(548);
						glslMultiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class GlslShiftExpressionContext extends ParserRuleContext {
		public GlslAdditiveExpressionContext glslAdditiveExpression() {
			return getRuleContext(GlslAdditiveExpressionContext.class,0);
		}
		public GlslShiftExpressionContext glslShiftExpression() {
			return getRuleContext(GlslShiftExpressionContext.class,0);
		}
		public TerminalNode LEFT_OP() { return getToken(GLSLParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLParser.RIGHT_OP, 0); }
		public GlslShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslShiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslShiftExpressionContext glslShiftExpression() throws RecognitionException {
		return glslShiftExpression(0);
	}

	private GlslShiftExpressionContext glslShiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslShiftExpressionContext _localctx = new GlslShiftExpressionContext(_ctx, _parentState);
		GlslShiftExpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_glslShiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(555);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(563);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(557);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(558);
						match(LEFT_OP);
						setState(559);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(560);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(561);
						match(RIGHT_OP);
						setState(562);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class GlslRelationalExpressionContext extends ParserRuleContext {
		public GlslShiftExpressionContext glslShiftExpression() {
			return getRuleContext(GlslShiftExpressionContext.class,0);
		}
		public GlslRelationalExpressionContext glslRelationalExpression() {
			return getRuleContext(GlslRelationalExpressionContext.class,0);
		}
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(GLSLParser.RIGHT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLParser.GE_OP, 0); }
		public GlslRelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslRelationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslRelationalExpressionContext glslRelationalExpression() throws RecognitionException {
		return glslRelationalExpression(0);
	}

	private GlslRelationalExpressionContext glslRelationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslRelationalExpressionContext _localctx = new GlslRelationalExpressionContext(_ctx, _parentState);
		GlslRelationalExpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_glslRelationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			glslShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(583);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(571);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(572);
						match(LEFT_ANGLE);
						setState(573);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(574);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(575);
						match(RIGHT_ANGLE);
						setState(576);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(577);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(578);
						match(LE_OP);
						setState(579);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(580);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(581);
						match(GE_OP);
						setState(582);
						glslShiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class GlslEqualityExpressionContext extends ParserRuleContext {
		public GlslRelationalExpressionContext glslRelationalExpression() {
			return getRuleContext(GlslRelationalExpressionContext.class,0);
		}
		public GlslEqualityExpressionContext glslEqualityExpression() {
			return getRuleContext(GlslEqualityExpressionContext.class,0);
		}
		public TerminalNode EQ_OP() { return getToken(GLSLParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLParser.NE_OP, 0); }
		public GlslEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslEqualityExpressionContext glslEqualityExpression() throws RecognitionException {
		return glslEqualityExpression(0);
	}

	private GlslEqualityExpressionContext glslEqualityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslEqualityExpressionContext _localctx = new GlslEqualityExpressionContext(_ctx, _parentState);
		GlslEqualityExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_glslEqualityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(589);
			glslRelationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(591);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(592);
						match(EQ_OP);
						setState(593);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(594);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(595);
						match(NE_OP);
						setState(596);
						glslRelationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class GlslAndExpressionContext extends ParserRuleContext {
		public GlslEqualityExpressionContext glslEqualityExpression() {
			return getRuleContext(GlslEqualityExpressionContext.class,0);
		}
		public GlslAndExpressionContext glslAndExpression() {
			return getRuleContext(GlslAndExpressionContext.class,0);
		}
		public TerminalNode AMPERSAND() { return getToken(GLSLParser.AMPERSAND, 0); }
		public GlslAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslAndExpressionContext glslAndExpression() throws RecognitionException {
		return glslAndExpression(0);
	}

	private GlslAndExpressionContext glslAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslAndExpressionContext _localctx = new GlslAndExpressionContext(_ctx, _parentState);
		GlslAndExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_glslAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(603);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(605);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(606);
					match(AMPERSAND);
					setState(607);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class GlslExclusiveOrExpressionContext extends ParserRuleContext {
		public GlslAndExpressionContext glslAndExpression() {
			return getRuleContext(GlslAndExpressionContext.class,0);
		}
		public GlslExclusiveOrExpressionContext glslExclusiveOrExpression() {
			return getRuleContext(GlslExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(GLSLParser.CARET, 0); }
		public GlslExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslExclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslExclusiveOrExpressionContext glslExclusiveOrExpression() throws RecognitionException {
		return glslExclusiveOrExpression(0);
	}

	private GlslExclusiveOrExpressionContext glslExclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslExclusiveOrExpressionContext _localctx = new GlslExclusiveOrExpressionContext(_ctx, _parentState);
		GlslExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_glslExclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(614);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(616);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(617);
					match(CARET);
					setState(618);
					glslAndExpression(0);
					}
					} 
				}
				setState(623);
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

	public static class GlslInclusiveOrExpressionContext extends ParserRuleContext {
		public GlslExclusiveOrExpressionContext glslExclusiveOrExpression() {
			return getRuleContext(GlslExclusiveOrExpressionContext.class,0);
		}
		public GlslInclusiveOrExpressionContext glslInclusiveOrExpression() {
			return getRuleContext(GlslInclusiveOrExpressionContext.class,0);
		}
		public TerminalNode VERTICAL_BAR() { return getToken(GLSLParser.VERTICAL_BAR, 0); }
		public GlslInclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInclusiveOrExpressionContext glslInclusiveOrExpression() throws RecognitionException {
		return glslInclusiveOrExpression(0);
	}

	private GlslInclusiveOrExpressionContext glslInclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslInclusiveOrExpressionContext _localctx = new GlslInclusiveOrExpressionContext(_ctx, _parentState);
		GlslInclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_glslInclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(625);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(627);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(628);
					match(VERTICAL_BAR);
					setState(629);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class GlslLogicalAndExpressionContext extends ParserRuleContext {
		public GlslInclusiveOrExpressionContext glslInclusiveOrExpression() {
			return getRuleContext(GlslInclusiveOrExpressionContext.class,0);
		}
		public GlslLogicalAndExpressionContext glslLogicalAndExpression() {
			return getRuleContext(GlslLogicalAndExpressionContext.class,0);
		}
		public TerminalNode AND_OP() { return getToken(GLSLParser.AND_OP, 0); }
		public GlslLogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLogicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLogicalAndExpressionContext glslLogicalAndExpression() throws RecognitionException {
		return glslLogicalAndExpression(0);
	}

	private GlslLogicalAndExpressionContext glslLogicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslLogicalAndExpressionContext _localctx = new GlslLogicalAndExpressionContext(_ctx, _parentState);
		GlslLogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_glslLogicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(636);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(639);
					match(AND_OP);
					setState(640);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class GlslLogicalXorExpressionContext extends ParserRuleContext {
		public GlslLogicalAndExpressionContext glslLogicalAndExpression() {
			return getRuleContext(GlslLogicalAndExpressionContext.class,0);
		}
		public GlslLogicalXorExpressionContext glslLogicalXorExpression() {
			return getRuleContext(GlslLogicalXorExpressionContext.class,0);
		}
		public TerminalNode XOR_OP() { return getToken(GLSLParser.XOR_OP, 0); }
		public GlslLogicalXorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLogicalXorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslLogicalXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslLogicalXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslLogicalXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLogicalXorExpressionContext glslLogicalXorExpression() throws RecognitionException {
		return glslLogicalXorExpression(0);
	}

	private GlslLogicalXorExpressionContext glslLogicalXorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslLogicalXorExpressionContext _localctx = new GlslLogicalXorExpressionContext(_ctx, _parentState);
		GlslLogicalXorExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_glslLogicalXorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(647);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(649);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(650);
					match(XOR_OP);
					setState(651);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class GlslLogicalOrExpressionContext extends ParserRuleContext {
		public GlslLogicalXorExpressionContext glslLogicalXorExpression() {
			return getRuleContext(GlslLogicalXorExpressionContext.class,0);
		}
		public GlslLogicalOrExpressionContext glslLogicalOrExpression() {
			return getRuleContext(GlslLogicalOrExpressionContext.class,0);
		}
		public TerminalNode OR_OP() { return getToken(GLSLParser.OR_OP, 0); }
		public GlslLogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLogicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLogicalOrExpressionContext glslLogicalOrExpression() throws RecognitionException {
		return glslLogicalOrExpression(0);
	}

	private GlslLogicalOrExpressionContext glslLogicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslLogicalOrExpressionContext _localctx = new GlslLogicalOrExpressionContext(_ctx, _parentState);
		GlslLogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_glslLogicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(658);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(660);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(661);
					match(OR_OP);
					setState(662);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class GlslConditionalExpressionContext extends ParserRuleContext {
		public GlslLogicalOrExpressionContext glslLogicalOrExpression() {
			return getRuleContext(GlslLogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(GLSLParser.QUESTION, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public GlslAssignmentExpressionContext glslAssignmentExpression() {
			return getRuleContext(GlslAssignmentExpressionContext.class,0);
		}
		public GlslConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslConditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConditionalExpressionContext glslConditionalExpression() throws RecognitionException {
		GlslConditionalExpressionContext _localctx = new GlslConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_glslConditionalExpression);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				glslLogicalOrExpression(0);
				setState(670);
				match(QUESTION);
				setState(671);
				glslExpression();
				setState(672);
				match(COLON);
				setState(673);
				glslAssignmentExpression();
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

	public static class GlslAssignmentExpressionContext extends ParserRuleContext {
		public GlslConditionalExpressionContext glslConditionalExpression() {
			return getRuleContext(GlslConditionalExpressionContext.class,0);
		}
		public GlslUnaryExpressionContext glslUnaryExpression() {
			return getRuleContext(GlslUnaryExpressionContext.class,0);
		}
		public GlslAssignmentOperatorContext glslAssignmentOperator() {
			return getRuleContext(GlslAssignmentOperatorContext.class,0);
		}
		public GlslAssignmentExpressionContext glslAssignmentExpression() {
			return getRuleContext(GlslAssignmentExpressionContext.class,0);
		}
		public GlslAssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAssignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslAssignmentExpressionContext glslAssignmentExpression() throws RecognitionException {
		GlslAssignmentExpressionContext _localctx = new GlslAssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_glslAssignmentExpression);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				glslUnaryExpression();
				setState(679);
				glslAssignmentOperator();
				setState(680);
				glslAssignmentExpression();
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

	public static class GlslAssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GLSLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GLSLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GLSLParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GLSLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GLSLParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(GLSLParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(GLSLParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GLSLParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GLSLParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GLSLParser.OR_ASSIGN, 0); }
		public GlslAssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAssignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslAssignmentOperatorContext glslAssignmentOperator() throws RecognitionException {
		GlslAssignmentOperatorContext _localctx = new GlslAssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_glslAssignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << ADD_ASSIGN) | (1L << MOD_ASSIGN) | (1L << LEFT_ASSIGN) | (1L << RIGHT_ASSIGN) | (1L << AND_ASSIGN) | (1L << XOR_ASSIGN) | (1L << OR_ASSIGN) | (1L << SUB_ASSIGN) | (1L << EQUAL))) != 0)) ) {
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

	public static class GlslExpressionContext extends ParserRuleContext {
		public List<GlslAssignmentExpressionContext> glslAssignmentExpression() {
			return getRuleContexts(GlslAssignmentExpressionContext.class);
		}
		public GlslAssignmentExpressionContext glslAssignmentExpression(int i) {
			return getRuleContext(GlslAssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslExpressionContext glslExpression() throws RecognitionException {
		GlslExpressionContext _localctx = new GlslExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_glslExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			glslAssignmentExpression();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(687);
				match(COMMA);
				setState(688);
				glslAssignmentExpression();
				}
				}
				setState(693);
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

	public static class GlslConstantExpressionContext extends ParserRuleContext {
		public GlslConditionalExpressionContext glslConditionalExpression() {
			return getRuleContext(GlslConditionalExpressionContext.class,0);
		}
		public GlslConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslConstantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConstantExpressionContext glslConstantExpression() throws RecognitionException {
		GlslConstantExpressionContext _localctx = new GlslConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_glslConstantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			glslConditionalExpression();
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

	public static class GlslFunctionNameListContext extends ParserRuleContext {
		public List<GlslFunctionNameContext> glslFunctionName() {
			return getRuleContexts(GlslFunctionNameContext.class);
		}
		public GlslFunctionNameContext glslFunctionName(int i) {
			return getRuleContext(GlslFunctionNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslFunctionNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionNameListContext glslFunctionNameList() throws RecognitionException {
		GlslFunctionNameListContext _localctx = new GlslFunctionNameListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_glslFunctionNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			glslFunctionName();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(697);
				match(COMMA);
				setState(698);
				glslFunctionName();
				}
				}
				setState(703);
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

	public static class GlslTypeSpecifierContext extends ParserRuleContext {
		public GlslTypeSpecifierNonarrayContext glslTypeSpecifierNonarray() {
			return getRuleContext(GlslTypeSpecifierNonarrayContext.class,0);
		}
		public List<GlslArrayDimensionContext> glslArrayDimension() {
			return getRuleContexts(GlslArrayDimensionContext.class);
		}
		public GlslArrayDimensionContext glslArrayDimension(int i) {
			return getRuleContext(GlslArrayDimensionContext.class,i);
		}
		public GlslTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeSpecifierContext glslTypeSpecifier() throws RecognitionException {
		GlslTypeSpecifierContext _localctx = new GlslTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_glslTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			glslTypeSpecifierNonarray();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(705);
				glslArrayDimension();
				}
				}
				setState(710);
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

	public static class GlslArrayDimensionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public GlslIntegerExpressionContext glslIntegerExpression() {
			return getRuleContext(GlslIntegerExpressionContext.class,0);
		}
		public GlslArrayDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslArrayDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslArrayDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslArrayDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslArrayDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslArrayDimensionContext glslArrayDimension() throws RecognitionException {
		GlslArrayDimensionContext _localctx = new GlslArrayDimensionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_glslArrayDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LEFT_BRACKET);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC_OP) | (1L << DEC_OP) | (1L << LEFT_PAREN) | (1L << BANG) | (1L << DASH) | (1L << TILDE) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << BOOLCONSTANT) | (1L << INTCONSTANT) | (1L << UINTCONSTANT) | (1L << FLOATCONSTANT) | (1L << DOUBLECONSTANT))) != 0) || _la==STRUCT) {
				{
				setState(712);
				glslIntegerExpression();
				}
			}

			setState(715);
			match(RIGHT_BRACKET);
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

	public static class GlslTypeSpecifierNonarrayContext extends ParserRuleContext {
		public GlslStructSpecifierContext glslStructSpecifier() {
			return getRuleContext(GlslStructSpecifierContext.class,0);
		}
		public GlslTypeNameContext glslTypeName() {
			return getRuleContext(GlslTypeNameContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GLSLParser.VOID, 0); }
		public GlslTypeSpecifierNonarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeSpecifierNonarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTypeSpecifierNonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTypeSpecifierNonarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTypeSpecifierNonarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeSpecifierNonarrayContext glslTypeSpecifierNonarray() throws RecognitionException {
		GlslTypeSpecifierNonarrayContext _localctx = new GlslTypeSpecifierNonarrayContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_glslTypeSpecifierNonarray);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				glslStructSpecifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				glslTypeName();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				match(VOID);
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

	public static class GlslStructSpecifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GLSLParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslStructBodyContext glslStructBody() {
			return getRuleContext(GlslStructBodyContext.class,0);
		}
		public GlslStructSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructSpecifierContext glslStructSpecifier() throws RecognitionException {
		GlslStructSpecifierContext _localctx = new GlslStructSpecifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_glslStructSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(STRUCT);
			setState(723);
			match(IDENTIFIER);
			setState(724);
			glslStructBody();
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

	public static class GlslStructBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public List<GlslStructMemberGroupContext> glslStructMemberGroup() {
			return getRuleContexts(GlslStructMemberGroupContext.class);
		}
		public GlslStructMemberGroupContext glslStructMemberGroup(int i) {
			return getRuleContext(GlslStructMemberGroupContext.class,i);
		}
		public GlslStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructBodyContext glslStructBody() throws RecognitionException {
		GlslStructBodyContext _localctx = new GlslStructBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_glslStructBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(LEFT_BRACE);
			setState(728); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(727);
				glslStructMemberGroup();
				}
				}
				setState(730); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (IDENTIFIER - 46)) | (1L << (VOID - 46)) | (1L << (ATTRIBUTE - 46)) | (1L << (CONST - 46)) | (1L << (UNIFORM - 46)) | (1L << (VARYING - 46)) | (1L << (BUFFER - 46)) | (1L << (SHARED - 46)) | (1L << (COHERENT - 46)) | (1L << (VOLATILE - 46)) | (1L << (RESTRICT - 46)) | (1L << (READONLY - 46)) | (1L << (WRITEONLY - 46)) | (1L << (LAYOUT - 46)) | (1L << (CENTROID - 46)) | (1L << (FLAT - 46)) | (1L << (SMOOTH - 46)) | (1L << (NOPERSPECTIVE - 46)) | (1L << (PATCH - 46)) | (1L << (SAMPLE - 46)) | (1L << (SUBROUTINE - 46)) | (1L << (IN - 46)) | (1L << (OUT - 46)) | (1L << (INOUT - 46)) | (1L << (INVARIANT - 46)) | (1L << (PRECISE - 46)) | (1L << (LOWP - 46)) | (1L << (MEDIUMP - 46)) | (1L << (HIGHP - 46)) | (1L << (STRUCT - 46)))) != 0) );
			setState(732);
			match(RIGHT_BRACE);
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

	public static class GlslStructMemberGroupContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslStructMemberDeclaratorListContext glslStructMemberDeclaratorList() {
			return getRuleContext(GlslStructMemberDeclaratorListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslStructMemberGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructMemberGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructMemberGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructMemberGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberGroupContext glslStructMemberGroup() throws RecognitionException {
		GlslStructMemberGroupContext _localctx = new GlslStructMemberGroupContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_glslStructMemberGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (ATTRIBUTE - 53)) | (1L << (CONST - 53)) | (1L << (UNIFORM - 53)) | (1L << (VARYING - 53)) | (1L << (BUFFER - 53)) | (1L << (SHARED - 53)) | (1L << (COHERENT - 53)) | (1L << (VOLATILE - 53)) | (1L << (RESTRICT - 53)) | (1L << (READONLY - 53)) | (1L << (WRITEONLY - 53)) | (1L << (LAYOUT - 53)) | (1L << (CENTROID - 53)) | (1L << (FLAT - 53)) | (1L << (SMOOTH - 53)) | (1L << (NOPERSPECTIVE - 53)) | (1L << (PATCH - 53)) | (1L << (SAMPLE - 53)) | (1L << (SUBROUTINE - 53)) | (1L << (IN - 53)) | (1L << (OUT - 53)) | (1L << (INOUT - 53)) | (1L << (INVARIANT - 53)) | (1L << (PRECISE - 53)) | (1L << (LOWP - 53)) | (1L << (MEDIUMP - 53)) | (1L << (HIGHP - 53)))) != 0)) {
				{
				setState(734);
				glslTypeQualifier();
				}
			}

			setState(737);
			glslTypeSpecifier();
			setState(738);
			glslStructMemberDeclaratorList();
			setState(739);
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

	public static class GlslStructMemberDeclaratorListContext extends ParserRuleContext {
		public List<GlslStructMemberDeclaratorContext> glslStructMemberDeclarator() {
			return getRuleContexts(GlslStructMemberDeclaratorContext.class);
		}
		public GlslStructMemberDeclaratorContext glslStructMemberDeclarator(int i) {
			return getRuleContext(GlslStructMemberDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslStructMemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberDeclaratorListContext glslStructMemberDeclaratorList() throws RecognitionException {
		GlslStructMemberDeclaratorListContext _localctx = new GlslStructMemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_glslStructMemberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			glslStructMemberDeclarator();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(742);
				match(COMMA);
				setState(743);
				glslStructMemberDeclarator();
				}
				}
				setState(748);
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

	public static class GlslStructMemberDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public List<GlslArrayDimensionContext> glslArrayDimension() {
			return getRuleContexts(GlslArrayDimensionContext.class);
		}
		public GlslArrayDimensionContext glslArrayDimension(int i) {
			return getRuleContext(GlslArrayDimensionContext.class,i);
		}
		public GlslStructMemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructMemberDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructMemberDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberDeclaratorContext glslStructMemberDeclarator() throws RecognitionException {
		GlslStructMemberDeclaratorContext _localctx = new GlslStructMemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_glslStructMemberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(IDENTIFIER);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(750);
				glslArrayDimension();
				}
				}
				setState(755);
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

	public static class GlslTypeQualifierContext extends ParserRuleContext {
		public List<GlslSingleTypeQualifierContext> glslSingleTypeQualifier() {
			return getRuleContexts(GlslSingleTypeQualifierContext.class);
		}
		public GlslSingleTypeQualifierContext glslSingleTypeQualifier(int i) {
			return getRuleContext(GlslSingleTypeQualifierContext.class,i);
		}
		public GlslTypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeQualifierContext glslTypeQualifier() throws RecognitionException {
		GlslTypeQualifierContext _localctx = new GlslTypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_glslTypeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(756);
				glslSingleTypeQualifier();
				}
				}
				setState(759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (ATTRIBUTE - 53)) | (1L << (CONST - 53)) | (1L << (UNIFORM - 53)) | (1L << (VARYING - 53)) | (1L << (BUFFER - 53)) | (1L << (SHARED - 53)) | (1L << (COHERENT - 53)) | (1L << (VOLATILE - 53)) | (1L << (RESTRICT - 53)) | (1L << (READONLY - 53)) | (1L << (WRITEONLY - 53)) | (1L << (LAYOUT - 53)) | (1L << (CENTROID - 53)) | (1L << (FLAT - 53)) | (1L << (SMOOTH - 53)) | (1L << (NOPERSPECTIVE - 53)) | (1L << (PATCH - 53)) | (1L << (SAMPLE - 53)) | (1L << (SUBROUTINE - 53)) | (1L << (IN - 53)) | (1L << (OUT - 53)) | (1L << (INOUT - 53)) | (1L << (INVARIANT - 53)) | (1L << (PRECISE - 53)) | (1L << (LOWP - 53)) | (1L << (MEDIUMP - 53)) | (1L << (HIGHP - 53)))) != 0) );
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

	public static class GlslSingleTypeQualifierContext extends ParserRuleContext {
		public GlslStorageQualifierContext glslStorageQualifier() {
			return getRuleContext(GlslStorageQualifierContext.class,0);
		}
		public GlslLayoutQualifierContext glslLayoutQualifier() {
			return getRuleContext(GlslLayoutQualifierContext.class,0);
		}
		public GlslPrecisionQualifierContext glslPrecisionQualifier() {
			return getRuleContext(GlslPrecisionQualifierContext.class,0);
		}
		public GlslInterpolationQualifierContext glslInterpolationQualifier() {
			return getRuleContext(GlslInterpolationQualifierContext.class,0);
		}
		public GlslInvariantQualifierContext glslInvariantQualifier() {
			return getRuleContext(GlslInvariantQualifierContext.class,0);
		}
		public GlslPreciseQualifierContext glslPreciseQualifier() {
			return getRuleContext(GlslPreciseQualifierContext.class,0);
		}
		public GlslSingleTypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSingleTypeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSingleTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSingleTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSingleTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSingleTypeQualifierContext glslSingleTypeQualifier() throws RecognitionException {
		GlslSingleTypeQualifierContext _localctx = new GlslSingleTypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_glslSingleTypeQualifier);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTRIBUTE:
			case CONST:
			case UNIFORM:
			case VARYING:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case CENTROID:
			case PATCH:
			case SAMPLE:
			case SUBROUTINE:
			case IN:
			case OUT:
			case INOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				glslLayoutQualifier();
				}
				break;
			case LOWP:
			case MEDIUMP:
			case HIGHP:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(766);
				glslPreciseQualifier();
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

	public static class GlslInvariantQualifierContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(GLSLParser.INVARIANT, 0); }
		public GlslInvariantQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInvariantQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInvariantQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInvariantQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInvariantQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInvariantQualifierContext glslInvariantQualifier() throws RecognitionException {
		GlslInvariantQualifierContext _localctx = new GlslInvariantQualifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_glslInvariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(INVARIANT);
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

	public static class GlslInterpolationQualifierContext extends ParserRuleContext {
		public TerminalNode SMOOTH() { return getToken(GLSLParser.SMOOTH, 0); }
		public TerminalNode FLAT() { return getToken(GLSLParser.FLAT, 0); }
		public TerminalNode NOPERSPECTIVE() { return getToken(GLSLParser.NOPERSPECTIVE, 0); }
		public GlslInterpolationQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInterpolationQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInterpolationQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInterpolationQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInterpolationQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInterpolationQualifierContext glslInterpolationQualifier() throws RecognitionException {
		GlslInterpolationQualifierContext _localctx = new GlslInterpolationQualifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_glslInterpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLAT - 66)) | (1L << (SMOOTH - 66)) | (1L << (NOPERSPECTIVE - 66)))) != 0)) ) {
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

	public static class GlslLayoutQualifierContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(GLSLParser.LAYOUT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslLayoutQualifierIdListContext glslLayoutQualifierIdList() {
			return getRuleContext(GlslLayoutQualifierIdListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslLayoutQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLayoutQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslLayoutQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslLayoutQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslLayoutQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLayoutQualifierContext glslLayoutQualifier() throws RecognitionException {
		GlslLayoutQualifierContext _localctx = new GlslLayoutQualifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_glslLayoutQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(LAYOUT);
			setState(774);
			match(LEFT_PAREN);
			setState(775);
			glslLayoutQualifierIdList();
			setState(776);
			match(RIGHT_PAREN);
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

	public static class GlslLayoutQualifierIdListContext extends ParserRuleContext {
		public List<GlslLayoutQualifierIdContext> glslLayoutQualifierId() {
			return getRuleContexts(GlslLayoutQualifierIdContext.class);
		}
		public GlslLayoutQualifierIdContext glslLayoutQualifierId(int i) {
			return getRuleContext(GlslLayoutQualifierIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslLayoutQualifierIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLayoutQualifierIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslLayoutQualifierIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslLayoutQualifierIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslLayoutQualifierIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLayoutQualifierIdListContext glslLayoutQualifierIdList() throws RecognitionException {
		GlslLayoutQualifierIdListContext _localctx = new GlslLayoutQualifierIdListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_glslLayoutQualifierIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			glslLayoutQualifierId();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(779);
				match(COMMA);
				setState(780);
				glslLayoutQualifierId();
				}
				}
				setState(785);
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

	public static class GlslLayoutQualifierIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode SHARED() { return getToken(GLSLParser.SHARED, 0); }
		public GlslLayoutQualifierIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLayoutQualifierId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslLayoutQualifierId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslLayoutQualifierId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslLayoutQualifierId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLayoutQualifierIdContext glslLayoutQualifierId() throws RecognitionException {
		GlslLayoutQualifierIdContext _localctx = new GlslLayoutQualifierIdContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_glslLayoutQualifierId);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(IDENTIFIER);
				setState(788);
				match(EQUAL);
				setState(789);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(SHARED);
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

	public static class GlslPreciseQualifierContext extends ParserRuleContext {
		public TerminalNode PRECISE() { return getToken(GLSLParser.PRECISE, 0); }
		public GlslPreciseQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPreciseQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslPreciseQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslPreciseQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslPreciseQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPreciseQualifierContext glslPreciseQualifier() throws RecognitionException {
		GlslPreciseQualifierContext _localctx = new GlslPreciseQualifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_glslPreciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(PRECISE);
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

	public static class GlslStorageQualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GLSLParser.CONST, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(GLSLParser.ATTRIBUTE, 0); }
		public TerminalNode VARYING() { return getToken(GLSLParser.VARYING, 0); }
		public TerminalNode INOUT() { return getToken(GLSLParser.INOUT, 0); }
		public TerminalNode IN() { return getToken(GLSLParser.IN, 0); }
		public TerminalNode OUT() { return getToken(GLSLParser.OUT, 0); }
		public TerminalNode CENTROID() { return getToken(GLSLParser.CENTROID, 0); }
		public TerminalNode PATCH() { return getToken(GLSLParser.PATCH, 0); }
		public TerminalNode SAMPLE() { return getToken(GLSLParser.SAMPLE, 0); }
		public TerminalNode UNIFORM() { return getToken(GLSLParser.UNIFORM, 0); }
		public TerminalNode BUFFER() { return getToken(GLSLParser.BUFFER, 0); }
		public TerminalNode SHARED() { return getToken(GLSLParser.SHARED, 0); }
		public TerminalNode COHERENT() { return getToken(GLSLParser.COHERENT, 0); }
		public TerminalNode VOLATILE() { return getToken(GLSLParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(GLSLParser.RESTRICT, 0); }
		public TerminalNode READONLY() { return getToken(GLSLParser.READONLY, 0); }
		public TerminalNode WRITEONLY() { return getToken(GLSLParser.WRITEONLY, 0); }
		public TerminalNode SUBROUTINE() { return getToken(GLSLParser.SUBROUTINE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslFunctionNameListContext glslFunctionNameList() {
			return getRuleContext(GlslFunctionNameListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslStorageQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStorageQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStorageQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStorageQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStorageQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStorageQualifierContext glslStorageQualifier() throws RecognitionException {
		GlslStorageQualifierContext _localctx = new GlslStorageQualifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_glslStorageQualifier);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(797);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(798);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(799);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(800);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(801);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(802);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(803);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(804);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(805);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(806);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(807);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(808);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(809);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(810);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(811);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(812);
				match(SUBROUTINE);
				setState(813);
				match(LEFT_PAREN);
				setState(814);
				glslFunctionNameList();
				setState(815);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(817);
				match(SUBROUTINE);
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

	public static class GlslPrecisionQualifierContext extends ParserRuleContext {
		public TerminalNode HIGHP() { return getToken(GLSLParser.HIGHP, 0); }
		public TerminalNode MEDIUMP() { return getToken(GLSLParser.MEDIUMP, 0); }
		public TerminalNode LOWP() { return getToken(GLSLParser.LOWP, 0); }
		public GlslPrecisionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPrecisionQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslPrecisionQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslPrecisionQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslPrecisionQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPrecisionQualifierContext glslPrecisionQualifier() throws RecognitionException {
		GlslPrecisionQualifierContext _localctx = new GlslPrecisionQualifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_glslPrecisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (LOWP - 89)) | (1L << (MEDIUMP - 89)) | (1L << (HIGHP - 89)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return glslPostfixExpression_sempred((GlslPostfixExpressionContext)_localctx, predIndex);
		case 45:
			return glslMultiplicativeExpression_sempred((GlslMultiplicativeExpressionContext)_localctx, predIndex);
		case 46:
			return glslAdditiveExpression_sempred((GlslAdditiveExpressionContext)_localctx, predIndex);
		case 47:
			return glslShiftExpression_sempred((GlslShiftExpressionContext)_localctx, predIndex);
		case 48:
			return glslRelationalExpression_sempred((GlslRelationalExpressionContext)_localctx, predIndex);
		case 49:
			return glslEqualityExpression_sempred((GlslEqualityExpressionContext)_localctx, predIndex);
		case 50:
			return glslAndExpression_sempred((GlslAndExpressionContext)_localctx, predIndex);
		case 51:
			return glslExclusiveOrExpression_sempred((GlslExclusiveOrExpressionContext)_localctx, predIndex);
		case 52:
			return glslInclusiveOrExpression_sempred((GlslInclusiveOrExpressionContext)_localctx, predIndex);
		case 53:
			return glslLogicalAndExpression_sempred((GlslLogicalAndExpressionContext)_localctx, predIndex);
		case 54:
			return glslLogicalXorExpression_sempred((GlslLogicalXorExpressionContext)_localctx, predIndex);
		case 55:
			return glslLogicalOrExpression_sempred((GlslLogicalOrExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean glslPostfixExpression_sempred(GlslPostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslMultiplicativeExpression_sempred(GlslMultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslAdditiveExpression_sempred(GlslAdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslShiftExpression_sempred(GlslShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslRelationalExpression_sempred(GlslRelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslEqualityExpression_sempred(GlslEqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslAndExpression_sempred(GlslAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslExclusiveOrExpression_sempred(GlslExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslInclusiveOrExpression_sempred(GlslInclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalAndExpression_sempred(GlslLogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalXorExpression_sempred(GlslLogicalXorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalOrExpression_sempred(GlslLogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u0339\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u00af\n\3\r\3\16\3\u00b0\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\3\u00ba\n\3\r\3\16\3\u00bb\3\3\5\3\u00bf\n\3\3\3"+
		"\3\3\3\3\7\3\u00c4\n\3\f\3\16\3\u00c7\13\3\3\3\5\3\u00ca\n\3\3\3\3\3\5"+
		"\3\u00ce\n\3\3\3\3\3\3\3\7\3\u00d3\n\3\f\3\16\3\u00d6\13\3\5\3\u00d8\n"+
		"\3\3\3\5\3\u00db\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00e7"+
		"\n\6\f\6\16\6\u00ea\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00f4\n\b"+
		"\3\b\3\b\3\t\3\t\3\t\7\t\u00fb\n\t\f\t\16\t\u00fe\13\t\3\n\5\n\u0101\n"+
		"\n\3\n\3\n\3\n\7\n\u0106\n\n\f\n\16\n\u0109\13\n\5\n\u010b\n\n\3\13\3"+
		"\13\7\13\u010f\n\13\f\13\16\13\u0112\13\13\3\13\3\13\5\13\u0116\n\13\3"+
		"\f\5\f\u0119\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0122\n\r\f\r\16\r\u0125"+
		"\13\r\3\r\5\r\u0128\n\r\3\r\3\r\5\r\u012c\n\r\3\16\3\16\5\16\u0130\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013a\n\17\3\20\3\20\7\20"+
		"\u013e\n\20\f\20\16\20\u0141\13\20\3\20\3\20\3\21\5\21\u0146\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0158\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0162"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u016a\n\24\f\24\16\24\u016d\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0178\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0180\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u0193\n\31"+
		"\3\31\3\31\5\31\u0197\n\31\3\31\3\31\5\31\u019b\n\31\3\31\3\31\3\31\3"+
		"\32\3\32\5\32\u01a2\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01aa\n\33"+
		"\3\33\3\33\3\33\5\33\u01af\n\33\3\34\7\34\u01b2\n\34\f\34\16\34\u01b5"+
		"\13\34\3\35\3\35\5\35\u01b9\n\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!"+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u01dd\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u01ed"+
		"\n*\f*\16*\u01f0\13*\3+\3+\3+\3+\7+\u01f6\n+\f+\16+\u01f9\13+\3+\3+\3"+
		"+\3+\5+\u01ff\n+\3+\5+\u0202\n+\3,\3,\3-\3-\3-\3-\5-\u020a\n-\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u021a\n/\f/\16/\u021d\13/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0228\n\60\f\60\16\60\u022b"+
		"\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0236\n\61\f"+
		"\61\16\61\u0239\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u024a\n\62\f\62\16\62\u024d\13\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0258\n\63\f\63\16\63\u025b"+
		"\13\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0263\n\64\f\64\16\64\u0266"+
		"\13\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u026e\n\65\f\65\16\65\u0271"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0279\n\66\f\66\16\66\u027c"+
		"\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0284\n\67\f\67\16\67\u0287"+
		"\13\67\38\38\38\38\38\38\78\u028f\n8\f8\168\u0292\138\39\39\39\39\39\3"+
		"9\79\u029a\n9\f9\169\u029d\139\3:\3:\3:\3:\3:\3:\3:\5:\u02a6\n:\3;\3;"+
		"\3;\3;\3;\5;\u02ad\n;\3<\3<\3=\3=\3=\7=\u02b4\n=\f=\16=\u02b7\13=\3>\3"+
		">\3?\3?\3?\7?\u02be\n?\f?\16?\u02c1\13?\3@\3@\7@\u02c5\n@\f@\16@\u02c8"+
		"\13@\3A\3A\5A\u02cc\nA\3A\3A\3B\3B\3B\5B\u02d3\nB\3C\3C\3C\3C\3D\3D\6"+
		"D\u02db\nD\rD\16D\u02dc\3D\3D\3E\5E\u02e2\nE\3E\3E\3E\3E\3F\3F\3F\7F\u02eb"+
		"\nF\fF\16F\u02ee\13F\3G\3G\7G\u02f2\nG\fG\16G\u02f5\13G\3H\6H\u02f8\n"+
		"H\rH\16H\u02f9\3I\3I\3I\3I\3I\3I\5I\u0302\nI\3J\3J\3K\3K\3L\3L\3L\3L\3"+
		"L\3M\3M\3M\7M\u0310\nM\fM\16M\u0313\13M\3N\3N\3N\3N\3N\5N\u031a\nN\3O"+
		"\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\5P\u0335\nP\3Q\3Q\3Q\2\16R\\^`bdfhjlnpR\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\2\6\4\2\5\6#&\4\2\16\27!!\3\2DF\3\2[]\2"+
		"\u036f\2\u00a2\3\2\2\2\4\u00da\3\2\2\2\6\u00dc\3\2\2\2\b\u00df\3\2\2\2"+
		"\n\u00e3\3\2\2\2\f\u00eb\3\2\2\2\16\u00ef\3\2\2\2\20\u00f7\3\2\2\2\22"+
		"\u0100\3\2\2\2\24\u010c\3\2\2\2\26\u0118\3\2\2\2\30\u012b\3\2\2\2\32\u012f"+
		"\3\2\2\2\34\u0139\3\2\2\2\36\u013b\3\2\2\2 \u0145\3\2\2\2\"\u0157\3\2"+
		"\2\2$\u0161\3\2\2\2&\u0163\3\2\2\2(\u0177\3\2\2\2*\u017f\3\2\2\2,\u0181"+
		"\3\2\2\2.\u0187\3\2\2\2\60\u018f\3\2\2\2\62\u01a1\3\2\2\2\64\u01ae\3\2"+
		"\2\2\66\u01b3\3\2\2\28\u01b8\3\2\2\2:\u01ba\3\2\2\2<\u01bd\3\2\2\2>\u01bf"+
		"\3\2\2\2@\u01c1\3\2\2\2B\u01c3\3\2\2\2D\u01c5\3\2\2\2F\u01c7\3\2\2\2H"+
		"\u01c9\3\2\2\2J\u01cb\3\2\2\2L\u01cd\3\2\2\2N\u01cf\3\2\2\2P\u01dc\3\2"+
		"\2\2R\u01de\3\2\2\2T\u0201\3\2\2\2V\u0203\3\2\2\2X\u0209\3\2\2\2Z\u020b"+
		"\3\2\2\2\\\u020d\3\2\2\2^\u021e\3\2\2\2`\u022c\3\2\2\2b\u023a\3\2\2\2"+
		"d\u024e\3\2\2\2f\u025c\3\2\2\2h\u0267\3\2\2\2j\u0272\3\2\2\2l\u027d\3"+
		"\2\2\2n\u0288\3\2\2\2p\u0293\3\2\2\2r\u02a5\3\2\2\2t\u02ac\3\2\2\2v\u02ae"+
		"\3\2\2\2x\u02b0\3\2\2\2z\u02b8\3\2\2\2|\u02ba\3\2\2\2~\u02c2\3\2\2\2\u0080"+
		"\u02c9\3\2\2\2\u0082\u02d2\3\2\2\2\u0084\u02d4\3\2\2\2\u0086\u02d8\3\2"+
		"\2\2\u0088\u02e1\3\2\2\2\u008a\u02e7\3\2\2\2\u008c\u02ef\3\2\2\2\u008e"+
		"\u02f7\3\2\2\2\u0090\u0301\3\2\2\2\u0092\u0303\3\2\2\2\u0094\u0305\3\2"+
		"\2\2\u0096\u0307\3\2\2\2\u0098\u030c\3\2\2\2\u009a\u0319\3\2\2\2\u009c"+
		"\u031b\3\2\2\2\u009e\u0334\3\2\2\2\u00a0\u0336\3\2\2\2\u00a2\u00a3\5\66"+
		"\34\2\u00a3\u00a4\7\2\2\3\u00a4\3\3\2\2\2\u00a5\u00db\5\u008eH\2\u00a6"+
		"\u00db\5\b\5\2\u00a7\u00a8\5\u008eH\2\u00a8\u00a9\5> \2\u00a9\u00db\3"+
		"\2\2\2\u00aa\u00ab\5\u008eH\2\u00ab\u00ae\5B\"\2\u00ac\u00ad\7\37\2\2"+
		"\u00ad\u00af\5B\"\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00db\3\2\2\2\u00b2\u00b3\5\u008eH"+
		"\2\u00b3\u00b4\5@!\2\u00b4\u00b5\5\n\6\2\u00b5\u00db\3\2\2\2\u00b6\u00b7"+
		"\5\u008eH\2\u00b7\u00b9\5@!\2\u00b8\u00ba\5\u0080A\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bf\5\n\6\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00db\3\2\2\2\u00c0\u00c1\5\u008eH\2\u00c1\u00c5\5\u0084C\2\u00c2\u00c4"+
		"\5\u0080A\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2"+
		"\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca"+
		"\5\n\6\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00db\3\2\2\2\u00cb"+
		"\u00cd\5~@\2\u00cc\u00ce\5\n\6\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2"+
		"\2\u00ce\u00db\3\2\2\2\u00cf\u00d7\5\f\7\2\u00d0\u00d4\5B\"\2\u00d1\u00d3"+
		"\5\u0080A\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d0"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00db\5\16\b\2"+
		"\u00da\u00a5\3\2\2\2\u00da\u00a6\3\2\2\2\u00da\u00a7\3\2\2\2\u00da\u00aa"+
		"\3\2\2\2\u00da\u00b2\3\2\2\2\u00da\u00b6\3\2\2\2\u00da\u00c0\3\2\2\2\u00da"+
		"\u00cb\3\2\2\2\u00da\u00cf\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\5\3\2\2\2"+
		"\u00dc\u00dd\5\4\3\2\u00dd\u00de\7\"\2\2\u00de\7\3\2\2\2\u00df\u00e0\7"+
		"^\2\2\u00e0\u00e1\5\u00a0Q\2\u00e1\u00e2\5~@\2\u00e2\t\3\2\2\2\u00e3\u00e8"+
		"\5\24\13\2\u00e4\u00e5\7\37\2\2\u00e5\u00e7\5\24\13\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\13\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\u008eH\2\u00ec\u00ed\7\60"+
		"\2\2\u00ed\u00ee\5\u0086D\2\u00ee\r\3\2\2\2\u00ef\u00f0\5\26\f\2\u00f0"+
		"\u00f1\5D#\2\u00f1\u00f3\7\30\2\2\u00f2\u00f4\5\20\t\2\u00f3\u00f2\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\31\2\2\u00f6"+
		"\17\3\2\2\2\u00f7\u00fc\5\22\n\2\u00f8\u00f9\7\37\2\2\u00f9\u00fb\5\22"+
		"\n\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\21\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\5\u008e"+
		"H\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u010a\5~@\2\u0103\u0107\5B\"\2\u0104\u0106\5\u0080A\2\u0105\u0104\3\2"+
		"\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\23\3\2\2\2\u010c\u0110\5B\"\2\u010d\u010f\5\u0080A\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0115\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7!\2\2\u0114"+
		"\u0116\5\30\r\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\25\3\2\2"+
		"\2\u0117\u0119\5\u008eH\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\5~@\2\u011b\27\3\2\2\2\u011c\u012c\5t;\2\u011d"+
		"\u011e\7\34\2\2\u011e\u0123\5\30\r\2\u011f\u0120\7\37\2\2\u0120\u0122"+
		"\5\30\r\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128"+
		"\7\37\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u012a\7\35\2\2\u012a\u012c\3\2\2\2\u012b\u011c\3\2\2\2\u012b\u011d"+
		"\3\2\2\2\u012c\31\3\2\2\2\u012d\u0130\5\36\20\2\u012e\u0130\5\34\17\2"+
		"\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\33\3\2\2\2\u0131\u013a"+
		"\5\6\4\2\u0132\u013a\5 \21\2\u0133\u013a\5\"\22\2\u0134\u013a\5&\24\2"+
		"\u0135\u013a\5,\27\2\u0136\u013a\5.\30\2\u0137\u013a\5\60\31\2\u0138\u013a"+
		"\5\64\33\2\u0139\u0131\3\2\2\2\u0139\u0132\3\2\2\2\u0139\u0133\3\2\2\2"+
		"\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u0138\3\2\2\2\u013a\35\3\2\2\2\u013b\u013f\7\34\2\2\u013c"+
		"\u013e\5\32\16\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0143\7\35\2\2\u0143\37\3\2\2\2\u0144\u0146\5x=\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\"\2\2\u0148!\3"+
		"\2\2\2\u0149\u014a\7Q\2\2\u014a\u014b\7\30\2\2\u014b\u014c\5*\26\2\u014c"+
		"\u014d\7\31\2\2\u014d\u014e\5\32\16\2\u014e\u0158\3\2\2\2\u014f\u0150"+
		"\7Q\2\2\u0150\u0151\7\30\2\2\u0151\u0152\5*\26\2\u0152\u0153\7\31\2\2"+
		"\u0153\u0154\5$\23\2\u0154\u0155\7R\2\2\u0155\u0156\5\32\16\2\u0156\u0158"+
		"\3\2\2\2\u0157\u0149\3\2\2\2\u0157\u014f\3\2\2\2\u0158#\3\2\2\2\u0159"+
		"\u0162\5\36\20\2\u015a\u0162\5\6\4\2\u015b\u0162\5 \21\2\u015c\u0162\5"+
		"&\24\2\u015d\u0162\5,\27\2\u015e\u0162\5.\30\2\u015f\u0162\5\60\31\2\u0160"+
		"\u0162\5\64\33\2\u0161\u0159\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3"+
		"\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162%\3\2\2\2\u0163\u0164\7N\2\2\u0164"+
		"\u0165\7\30\2\2\u0165\u0166\5*\26\2\u0166\u0167\7\31\2\2\u0167\u016b\7"+
		"\34\2\2\u0168\u016a\5(\25\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u016f\7\35\2\2\u016f\'\3\2\2\2\u0170\u0171\7O\2\2\u0171\u0172"+
		"\5V,\2\u0172\u0173\7 \2\2\u0173\u0178\3\2\2\2\u0174\u0175\7P\2\2\u0175"+
		"\u0178\7 \2\2\u0176\u0178\5\32\16\2\u0177\u0170\3\2\2\2\u0177\u0174\3"+
		"\2\2\2\u0177\u0176\3\2\2\2\u0178)\3\2\2\2\u0179\u0180\5x=\2\u017a\u017b"+
		"\5\26\f\2\u017b\u017c\5B\"\2\u017c\u017d\7!\2\2\u017d\u017e\5\30\r\2\u017e"+
		"\u0180\3\2\2\2\u017f\u0179\3\2\2\2\u017f\u017a\3\2\2\2\u0180+\3\2\2\2"+
		"\u0181\u0182\7M\2\2\u0182\u0183\7\30\2\2\u0183\u0184\5*\26\2\u0184\u0185"+
		"\7\31\2\2\u0185\u0186\5\32\16\2\u0186-\3\2\2\2\u0187\u0188\7K\2\2\u0188"+
		"\u0189\5\32\16\2\u0189\u018a\7M\2\2\u018a\u018b\7\30\2\2\u018b\u018c\5"+
		"x=\2\u018c\u018d\7\31\2\2\u018d\u018e\7\"\2\2\u018e/\3\2\2\2\u018f\u0190"+
		"\7L\2\2\u0190\u0192\7\30\2\2\u0191\u0193\5\62\32\2\u0192\u0191\3\2\2\2"+
		"\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\7\"\2\2\u0195\u0197"+
		"\5*\26\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\7\"\2\2\u0199\u019b\5x=\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2"+
		"\2\u019b\u019c\3\2\2\2\u019c\u019d\7\31\2\2\u019d\u019e\5\32\16\2\u019e"+
		"\61\3\2\2\2\u019f\u01a2\5x=\2\u01a0\u01a2\5\4\3\2\u01a1\u019f\3\2\2\2"+
		"\u01a1\u01a0\3\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a4\7J\2\2\u01a4\u01af\7"+
		"\"\2\2\u01a5\u01a6\7I\2\2\u01a6\u01af\7\"\2\2\u01a7\u01a9\7Z\2\2\u01a8"+
		"\u01aa\5x=\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2"+
		"\2\u01ab\u01af\7\"\2\2\u01ac\u01ad\7Y\2\2\u01ad\u01af\7\"\2\2\u01ae\u01a3"+
		"\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\65\3\2\2\2\u01b0\u01b2\58\35\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2"+
		"\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\67\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b6\u01b9\5:\36\2\u01b7\u01b9\5\6\4\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b99\3\2\2\2\u01ba\u01bb\5\16\b\2\u01bb\u01bc\5\36\20"+
		"\2\u01bc;\3\2\2\2\u01bd\u01be\7\60\2\2\u01be=\3\2\2\2\u01bf\u01c0\7\60"+
		"\2\2\u01c0?\3\2\2\2\u01c1\u01c2\7\60\2\2\u01c2A\3\2\2\2\u01c3\u01c4\7"+
		"\60\2\2\u01c4C\3\2\2\2\u01c5\u01c6\7\60\2\2\u01c6E\3\2\2\2\u01c7\u01c8"+
		"\7\62\2\2\u01c8G\3\2\2\2\u01c9\u01ca\7\63\2\2\u01caI\3\2\2\2\u01cb\u01cc"+
		"\7\64\2\2\u01ccK\3\2\2\2\u01cd\u01ce\7\65\2\2\u01ceM\3\2\2\2\u01cf\u01d0"+
		"\7\66\2\2\u01d0O\3\2\2\2\u01d1\u01dd\5> \2\u01d2\u01dd\5\u0084C\2\u01d3"+
		"\u01dd\5L\'\2\u01d4\u01dd\5N(\2\u01d5\u01dd\5H%\2\u01d6\u01dd\5J&\2\u01d7"+
		"\u01dd\5F$\2\u01d8\u01d9\7\30\2\2\u01d9\u01da\5x=\2\u01da\u01db\7\31\2"+
		"\2\u01db\u01dd\3\2\2\2\u01dc\u01d1\3\2\2\2\u01dc\u01d2\3\2\2\2\u01dc\u01d3"+
		"\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dc\u01d5\3\2\2\2\u01dc\u01d6\3\2\2\2\u01dc"+
		"\u01d7\3\2\2\2\u01dc\u01d8\3\2\2\2\u01ddQ\3\2\2\2\u01de\u01df\b*\1\2\u01df"+
		"\u01e0\5P)\2\u01e0\u01ee\3\2\2\2\u01e1\u01e2\f\7\2\2\u01e2\u01ed\5T+\2"+
		"\u01e3\u01e4\f\6\2\2\u01e4\u01ed\5\u0080A\2\u01e5\u01e6\f\5\2\2\u01e6"+
		"\u01e7\7\36\2\2\u01e7\u01ed\5<\37\2\u01e8\u01e9\f\4\2\2\u01e9\u01ed\7"+
		"\5\2\2\u01ea\u01eb\f\3\2\2\u01eb\u01ed\7\6\2\2\u01ec\u01e1\3\2\2\2\u01ec"+
		"\u01e3\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"S\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7\30\2\2\u01f2\u01f7\5t;\2\u01f3"+
		"\u01f4\7\37\2\2\u01f4\u01f6\5t;\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\7\31\2\2\u01fb\u0202\3\2\2\2\u01fc\u01fe\7"+
		"\30\2\2\u01fd\u01ff\7\61\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0202\7\31\2\2\u0201\u01f1\3\2\2\2\u0201\u01fc\3"+
		"\2\2\2\u0202U\3\2\2\2\u0203\u0204\5x=\2\u0204W\3\2\2\2\u0205\u020a\5R"+
		"*\2\u0206\u0207\5Z.\2\u0207\u0208\5X-\2\u0208\u020a\3\2\2\2\u0209\u0205"+
		"\3\2\2\2\u0209\u0206\3\2\2\2\u020aY\3\2\2\2\u020b\u020c\t\2\2\2\u020c"+
		"[\3\2\2\2\u020d\u020e\b/\1\2\u020e\u020f\5X-\2\u020f\u021b\3\2\2\2\u0210"+
		"\u0211\f\5\2\2\u0211\u0212\7\'\2\2\u0212\u021a\5X-\2\u0213\u0214\f\4\2"+
		"\2\u0214\u0215\7(\2\2\u0215\u021a\5X-\2\u0216\u0217\f\3\2\2\u0217\u0218"+
		"\7)\2\2\u0218\u021a\5X-\2\u0219\u0210\3\2\2\2\u0219\u0213\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c]\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\b\60\1\2\u021f\u0220"+
		"\5\\/\2\u0220\u0229\3\2\2\2\u0221\u0222\f\4\2\2\u0222\u0223\7&\2\2\u0223"+
		"\u0228\5\\/\2\u0224\u0225\f\3\2\2\u0225\u0226\7$\2\2\u0226\u0228\5\\/"+
		"\2\u0227\u0221\3\2\2\2\u0227\u0224\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a_\3\2\2\2\u022b\u0229\3\2\2\2\u022c"+
		"\u022d\b\61\1\2\u022d\u022e\5^\60\2\u022e\u0237\3\2\2\2\u022f\u0230\f"+
		"\4\2\2\u0230\u0231\7\3\2\2\u0231\u0236\5^\60\2\u0232\u0233\f\3\2\2\u0233"+
		"\u0234\7\4\2\2\u0234\u0236\5^\60\2\u0235\u022f\3\2\2\2\u0235\u0232\3\2"+
		"\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\b\62\1\2\u023b\u023c\5`\61\2"+
		"\u023c\u024b\3\2\2\2\u023d\u023e\f\6\2\2\u023e\u023f\7*\2\2\u023f\u024a"+
		"\5`\61\2\u0240\u0241\f\5\2\2\u0241\u0242\7+\2\2\u0242\u024a\5`\61\2\u0243"+
		"\u0244\f\4\2\2\u0244\u0245\7\7\2\2\u0245\u024a\5`\61\2\u0246\u0247\f\3"+
		"\2\2\u0247\u0248\7\b\2\2\u0248\u024a\5`\61\2\u0249\u023d\3\2\2\2\u0249"+
		"\u0240\3\2\2\2\u0249\u0243\3\2\2\2\u0249\u0246\3\2\2\2\u024a\u024d\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cc\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024e\u024f\b\63\1\2\u024f\u0250\5b\62\2\u0250\u0259\3\2\2\2"+
		"\u0251\u0252\f\4\2\2\u0252\u0253\7\t\2\2\u0253\u0258\5b\62\2\u0254\u0255"+
		"\f\3\2\2\u0255\u0256\7\n\2\2\u0256\u0258\5b\62\2\u0257\u0251\3\2\2\2\u0257"+
		"\u0254\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025ae\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\b\64\1\2\u025d\u025e"+
		"\5d\63\2\u025e\u0264\3\2\2\2\u025f\u0260\f\3\2\2\u0260\u0261\7.\2\2\u0261"+
		"\u0263\5d\63\2\u0262\u025f\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265g\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268"+
		"\b\65\1\2\u0268\u0269\5f\64\2\u0269\u026f\3\2\2\2\u026a\u026b\f\3\2\2"+
		"\u026b\u026c\7-\2\2\u026c\u026e\5f\64\2\u026d\u026a\3\2\2\2\u026e\u0271"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270i\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0273\b\66\1\2\u0273\u0274\5h\65\2\u0274\u027a\3"+
		"\2\2\2\u0275\u0276\f\3\2\2\u0276\u0277\7,\2\2\u0277\u0279\5h\65\2\u0278"+
		"\u0275\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027bk\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\b\67\1\2\u027e\u027f"+
		"\5j\66\2\u027f\u0285\3\2\2\2\u0280\u0281\f\3\2\2\u0281\u0282\7\13\2\2"+
		"\u0282\u0284\5j\66\2\u0283\u0280\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286m\3\2\2\2\u0287\u0285\3\2\2\2\u0288"+
		"\u0289\b8\1\2\u0289\u028a\5l\67\2\u028a\u0290\3\2\2\2\u028b\u028c\f\3"+
		"\2\2\u028c\u028d\7\r\2\2\u028d\u028f\5l\67\2\u028e\u028b\3\2\2\2\u028f"+
		"\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291o\3\2\2\2"+
		"\u0292\u0290\3\2\2\2\u0293\u0294\b9\1\2\u0294\u0295\5n8\2\u0295\u029b"+
		"\3\2\2\2\u0296\u0297\f\3\2\2\u0297\u0298\7\f\2\2\u0298\u029a\5n8\2\u0299"+
		"\u0296\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029cq\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u02a6\5p9\2\u029f\u02a0"+
		"\5p9\2\u02a0\u02a1\7/\2\2\u02a1\u02a2\5x=\2\u02a2\u02a3\7 \2\2\u02a3\u02a4"+
		"\5t;\2\u02a4\u02a6\3\2\2\2\u02a5\u029e\3\2\2\2\u02a5\u029f\3\2\2\2\u02a6"+
		"s\3\2\2\2\u02a7\u02ad\5r:\2\u02a8\u02a9\5X-\2\u02a9\u02aa\5v<\2\u02aa"+
		"\u02ab\5t;\2\u02ab\u02ad\3\2\2\2\u02ac\u02a7\3\2\2\2\u02ac\u02a8\3\2\2"+
		"\2\u02adu\3\2\2\2\u02ae\u02af\t\3\2\2\u02afw\3\2\2\2\u02b0\u02b5\5t;\2"+
		"\u02b1\u02b2\7\37\2\2\u02b2\u02b4\5t;\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7"+
		"\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6y\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02b9\5r:\2\u02b9{\3\2\2\2\u02ba\u02bf\5D#\2\u02bb"+
		"\u02bc\7\37\2\2\u02bc\u02be\5D#\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2"+
		"\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0}\3\2\2\2\u02c1\u02bf"+
		"\3\2\2\2\u02c2\u02c6\5\u0082B\2\u02c3\u02c5\5\u0080A\2\u02c4\u02c3\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\177\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\7\32\2\2\u02ca\u02cc\5V,"+
		"\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce"+
		"\7\33\2\2\u02ce\u0081\3\2\2\2\u02cf\u02d3\5\u0084C\2\u02d0\u02d3\5@!\2"+
		"\u02d1\u02d3\7\61\2\2\u02d2\u02cf\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1"+
		"\3\2\2\2\u02d3\u0083\3\2\2\2\u02d4\u02d5\7_\2\2\u02d5\u02d6\7\60\2\2\u02d6"+
		"\u02d7\5\u0086D\2\u02d7\u0085\3\2\2\2\u02d8\u02da\7\34\2\2\u02d9\u02db"+
		"\5\u0088E\2\u02da\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2\2"+
		"\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7\35\2\2\u02df"+
		"\u0087\3\2\2\2\u02e0\u02e2\5\u008eH\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\5~@\2\u02e4\u02e5\5\u008aF\2"+
		"\u02e5\u02e6\7\"\2\2\u02e6\u0089\3\2\2\2\u02e7\u02ec\5\u008cG\2\u02e8"+
		"\u02e9\7\37\2\2\u02e9\u02eb\5\u008cG\2\u02ea\u02e8\3\2\2\2\u02eb\u02ee"+
		"\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u008b\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ef\u02f3\7\60\2\2\u02f0\u02f2\5\u0080A\2\u02f1\u02f0"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u008d\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f8\5\u0090I\2\u02f7\u02f6"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u008f\3\2\2\2\u02fb\u0302\5\u009eP\2\u02fc\u0302\5\u0096L\2\u02fd\u0302"+
		"\5\u00a0Q\2\u02fe\u0302\5\u0094K\2\u02ff\u0302\5\u0092J\2\u0300\u0302"+
		"\5\u009cO\2\u0301\u02fb\3\2\2\2\u0301\u02fc\3\2\2\2\u0301\u02fd\3\2\2"+
		"\2\u0301\u02fe\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0302\u0091"+
		"\3\2\2\2\u0303\u0304\7W\2\2\u0304\u0093\3\2\2\2\u0305\u0306\t\4\2\2\u0306"+
		"\u0095\3\2\2\2\u0307\u0308\7B\2\2\u0308\u0309\7\30\2\2\u0309\u030a\5\u0098"+
		"M\2\u030a\u030b\7\31\2\2\u030b\u0097\3\2\2\2\u030c\u0311\5\u009aN\2\u030d"+
		"\u030e\7\37\2\2\u030e\u0310\5\u009aN\2\u030f\u030d\3\2\2\2\u0310\u0313"+
		"\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0099\3\2\2\2\u0313"+
		"\u0311\3\2\2\2\u0314\u031a\7\60\2\2\u0315\u0316\7\60\2\2\u0316\u0317\7"+
		"!\2\2\u0317\u031a\5z>\2\u0318\u031a\7<\2\2\u0319\u0314\3\2\2\2\u0319\u0315"+
		"\3\2\2\2\u0319\u0318\3\2\2\2\u031a\u009b\3\2\2\2\u031b\u031c\7X\2\2\u031c"+
		"\u009d\3\2\2\2\u031d\u0335\78\2\2\u031e\u0335\7\67\2\2\u031f\u0335\7:"+
		"\2\2\u0320\u0335\7V\2\2\u0321\u0335\7T\2\2\u0322\u0335\7U\2\2\u0323\u0335"+
		"\7C\2\2\u0324\u0335\7G\2\2\u0325\u0335\7H\2\2\u0326\u0335\79\2\2\u0327"+
		"\u0335\7;\2\2\u0328\u0335\7<\2\2\u0329\u0335\7=\2\2\u032a\u0335\7>\2\2"+
		"\u032b\u0335\7?\2\2\u032c\u0335\7@\2\2\u032d\u0335\7A\2\2\u032e\u032f"+
		"\7S\2\2\u032f\u0330\7\30\2\2\u0330\u0331\5|?\2\u0331\u0332\7\31\2\2\u0332"+
		"\u0335\3\2\2\2\u0333\u0335\7S\2\2\u0334\u031d\3\2\2\2\u0334\u031e\3\2"+
		"\2\2\u0334\u031f\3\2\2\2\u0334\u0320\3\2\2\2\u0334\u0321\3\2\2\2\u0334"+
		"\u0322\3\2\2\2\u0334\u0323\3\2\2\2\u0334\u0324\3\2\2\2\u0334\u0325\3\2"+
		"\2\2\u0334\u0326\3\2\2\2\u0334\u0327\3\2\2\2\u0334\u0328\3\2\2\2\u0334"+
		"\u0329\3\2\2\2\u0334\u032a\3\2\2\2\u0334\u032b\3\2\2\2\u0334\u032c\3\2"+
		"\2\2\u0334\u032d\3\2\2\2\u0334\u032e\3\2\2\2\u0334\u0333\3\2\2\2\u0335"+
		"\u009f\3\2\2\2\u0336\u0337\t\5\2\2\u0337\u00a1\3\2\2\2O\u00b0\u00bb\u00be"+
		"\u00c5\u00c9\u00cd\u00d4\u00d7\u00da\u00e8\u00f3\u00fc\u0100\u0107\u010a"+
		"\u0110\u0115\u0118\u0123\u0127\u012b\u012f\u0139\u013f\u0145\u0157\u0161"+
		"\u016b\u0177\u017f\u0192\u0196\u019a\u01a1\u01a9\u01ae\u01b3\u01b8\u01dc"+
		"\u01ec\u01ee\u01f7\u01fe\u0201\u0209\u0219\u021b\u0227\u0229\u0235\u0237"+
		"\u0249\u024b\u0257\u0259\u0264\u026f\u027a\u0285\u0290\u029b\u02a5\u02ac"+
		"\u02b5\u02bf\u02c6\u02cb\u02d2\u02dc\u02e1\u02ec\u02f3\u02f9\u0301\u0311"+
		"\u0319\u0334";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}