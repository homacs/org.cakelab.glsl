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
		ATTRIBUTE=1, CONST=2, UNIFORM=3, VARYING=4, BUFFER=5, SHARED=6, COHERENT=7, 
		VOLATILE=8, RESTRICT=9, READONLY=10, WRITEONLY=11, ATOMIC_UINT=12, LAYOUT=13, 
		CENTROID=14, FLAT=15, SMOOTH=16, NOPERSPECTIVE=17, PATCH=18, SAMPLE=19, 
		BREAK=20, CONTINUE=21, DO=22, FOR=23, WHILE=24, SWITCH=25, CASE=26, DEFAULT=27, 
		IF=28, ELSE=29, SUBROUTINE=30, IN=31, OUT=32, INOUT=33, FLOAT=34, DOUBLE=35, 
		INT=36, VOID=37, BOOL=38, INVARIANT=39, PRECISE=40, DISCARD=41, RETURN=42, 
		MAT2=43, MAT3=44, MAT4=45, DMAT2=46, DMAT3=47, DMAT4=48, MAT2X2=49, MAT2X3=50, 
		MAT2X4=51, DMAT2X2=52, DMAT2X3=53, DMAT2X4=54, MAT3X2=55, MAT3X3=56, MAT3X4=57, 
		DMAT3X2=58, DMAT3X3=59, DMAT3X4=60, MAT4X2=61, MAT4X3=62, MAT4X4=63, DMAT4X2=64, 
		DMAT4X3=65, DMAT4X4=66, VEC2=67, VEC3=68, VEC4=69, IVEC2=70, IVEC3=71, 
		IVEC4=72, BVEC2=73, BVEC3=74, BVEC4=75, DVEC2=76, DVEC3=77, DVEC4=78, 
		UINT=79, UVEC2=80, UVEC3=81, UVEC4=82, LOW_PRECISION=83, MEDIUM_PRECISION=84, 
		HIGH_PRECISION=85, PRECISION=86, SAMPLER1D=87, SAMPLER2D=88, SAMPLER3D=89, 
		SAMPLERCUBE=90, SAMPLER1DSHADOW=91, SAMPLER2DSHADOW=92, SAMPLERCUBESHADOW=93, 
		SAMPLER1DARRAY=94, SAMPLER2DARRAY=95, SAMPLER1DARRAYSHADOW=96, SAMPLER2DARRAYSHADOW=97, 
		ISAMPLER1D=98, ISAMPLER2D=99, ISAMPLER3D=100, ISAMPLERCUBE=101, ISAMPLER1DARRAY=102, 
		ISAMPLER2DARRAY=103, USAMPLER1D=104, USAMPLER2D=105, USAMPLER3D=106, USAMPLERCUBE=107, 
		USAMPLER1DARRAY=108, USAMPLER2DARRAY=109, SAMPLER2DRECT=110, SAMPLER2DRECTSHADOW=111, 
		ISAMPLER2DRECT=112, USAMPLER2DRECT=113, SAMPLERBUFFER=114, ISAMPLERBUFFER=115, 
		USAMPLERBUFFER=116, SAMPLER2DMS=117, ISAMPLER2DMS=118, USAMPLER2DMS=119, 
		SAMPLER2DMSARRAY=120, ISAMPLER2DMSARRAY=121, USAMPLER2DMSARRAY=122, SAMPLERCUBEARRAY=123, 
		SAMPLERCUBEARRAYSHADOW=124, ISAMPLERCUBEARRAY=125, USAMPLERCUBEARRAY=126, 
		IMAGE1D=127, IIMAGE1D=128, UIMAGE1D=129, IMAGE2D=130, IIMAGE2D=131, UIMAGE2D=132, 
		IMAGE3D=133, IIMAGE3D=134, UIMAGE3D=135, IMAGE2DRECT=136, IIMAGE2DRECT=137, 
		UIMAGE2DRECT=138, IMAGECUBE=139, IIMAGECUBE=140, UIMAGECUBE=141, IMAGEBUFFER=142, 
		IIMAGEBUFFER=143, UIMAGEBUFFER=144, IMAGE1DARRAY=145, IIMAGE1DARRAY=146, 
		UIMAGE1DARRAY=147, IMAGE2DARRAY=148, IIMAGE2DARRAY=149, UIMAGE2DARRAY=150, 
		IMAGECUBEARRAY=151, IIMAGECUBEARRAY=152, UIMAGECUBEARRAY=153, IMAGE2DMS=154, 
		IIMAGE2DMS=155, UIMAGE2DMS=156, IMAGE2DMSARRAY=157, IIMAGE2DMSARRAY=158, 
		UIMAGE2DMSARRAY=159, SAMPLEREXTERNALOES=160, STRUCT=161, COMMON=162, PARTITION=163, 
		ACTIVE=164, ASM=165, CLASS=166, UNION=167, ENUM=168, TYPEDEF=169, TEMPLATE=170, 
		THIS=171, RESOURCE=172, GOTO=173, INLINE=174, NOINLINE=175, PUBLIC=176, 
		STATIC=177, EXTERN=178, EXTERNAL=179, INTERFACE=180, LONG=181, SHORT=182, 
		HALF=183, FIXED=184, UNSIGNED=185, SUPERP=186, INPUT=187, OUTPUT=188, 
		HVEC2=189, HVEC3=190, HVEC4=191, FVEC2=192, FVEC3=193, FVEC4=194, SAMPLER3DRECT=195, 
		FILTER=196, SIZEOF=197, CAST=198, NAMESPACE=199, USING=200, WHITESPACE=201, 
		LINE_CONTINUATION=202, MULTILINE_COMMENT=203, SINGLELINE_COMMENT=204, 
		BOOLCONSTANT=205, FLOATCONSTANT=206, DOUBLECONSTANT=207, INTCONSTANT=208, 
		UINTCONSTANT=209, LEFT_OP=210, RIGHT_OP=211, INC_OP=212, DEC_OP=213, LE_OP=214, 
		GE_OP=215, EQ_OP=216, NE_OP=217, AND_OP=218, OR_OP=219, XOR_OP=220, MUL_ASSIGN=221, 
		DIV_ASSIGN=222, ADD_ASSIGN=223, MOD_ASSIGN=224, LEFT_ASSIGN=225, RIGHT_ASSIGN=226, 
		AND_ASSIGN=227, XOR_ASSIGN=228, OR_ASSIGN=229, SUB_ASSIGN=230, LEFT_PAREN=231, 
		RIGHT_PAREN=232, LEFT_BRACKET=233, RIGHT_BRACKET=234, LEFT_BRACE=235, 
		RIGHT_BRACE=236, DOT=237, COMMA=238, COLON=239, EQUAL=240, SEMICOLON=241, 
		BANG=242, DASH=243, TILDE=244, PLUS=245, STAR=246, SLASH=247, PERCENT=248, 
		LEFT_ANGLE=249, RIGHT_ANGLE=250, VERTICAL_BAR=251, CARET=252, AMPERSAND=253, 
		QUESTION=254, IDENTIFIER=255;
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
		RULE_glslTypeSpecifierNonarray = 64, RULE_glslBuiltinType = 65, RULE_glslStructSpecifier = 66, 
		RULE_glslStructBody = 67, RULE_glslStructMemberGroup = 68, RULE_glslStructMemberDeclaratorList = 69, 
		RULE_glslStructMemberDeclarator = 70, RULE_glslTypeQualifier = 71, RULE_glslSingleTypeQualifier = 72, 
		RULE_glslInvariantQualifier = 73, RULE_glslInterpolationQualifier = 74, 
		RULE_glslLayoutQualifier = 75, RULE_glslLayoutQualifierIdList = 76, RULE_glslLayoutQualifierId = 77, 
		RULE_glslPreciseQualifier = 78, RULE_glslStorageQualifier = 79, RULE_glslPrecisionQualifier = 80;
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
		"glslBuiltinType", "glslStructSpecifier", "glslStructBody", "glslStructMemberGroup", 
		"glslStructMemberDeclaratorList", "glslStructMemberDeclarator", "glslTypeQualifier", 
		"glslSingleTypeQualifier", "glslInvariantQualifier", "glslInterpolationQualifier", 
		"glslLayoutQualifier", "glslLayoutQualifierIdList", "glslLayoutQualifierId", 
		"glslPreciseQualifier", "glslStorageQualifier", "glslPrecisionQualifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'attribute'", "'const'", "'uniform'", "'varying'", "'buffer'", 
		"'shared'", "'coherent'", "'volatile'", "'restrict'", "'readonly'", "'writeonly'", 
		"'atomic_uint'", "'layout'", "'centroid'", "'flat'", "'smooth'", "'noperspective'", 
		"'patch'", "'sample'", "'break'", "'continue'", "'do'", "'for'", "'while'", 
		"'switch'", "'case'", "'default'", "'if'", "'else'", "'subroutine'", "'in'", 
		"'out'", "'inout'", "'float'", "'double'", "'int'", "'void'", "'bool'", 
		"'invariant'", "'precise'", "'discard'", "'return'", "'mat2'", "'mat3'", 
		"'mat4'", "'dmat2'", "'dmat3'", "'dmat4'", "'mat2x2'", "'mat2x3'", "'mat2x4'", 
		"'dmat2x2'", "'dmat2x3'", "'dmat2x4'", "'mat3x2'", "'mat3x3'", "'mat3x4'", 
		"'dmat3x2'", "'dmat3x3'", "'dmat3x4'", "'mat4x2'", "'mat4x3'", "'mat4x4'", 
		"'dmat4x2'", "'dmat4x3'", "'dmat4x4'", "'vec2'", "'vec3'", "'vec4'", "'ivec2'", 
		"'ivec3'", "'ivec4'", "'bvec2'", "'bvec3'", "'bvec4'", "'dvec2'", "'dvec3'", 
		"'dvec4'", "'uint'", "'uvec2'", "'uvec3'", "'uvec4'", "'lowp'", "'mediump'", 
		"'highp'", "'precision'", "'sampler1D'", "'sampler2D'", "'sampler3D'", 
		"'samplerCube'", "'sampler1DShadow'", "'sampler2DShadow'", "'samplerCubeShadow'", 
		"'sampler1DArray'", "'sampler2DArray'", "'sampler1DArrayShadow'", "'sampler2DArrayShadow'", 
		"'isampler1D'", "'isampler2D'", "'isampler3D'", "'isamplerCube'", "'isampler1DArray'", 
		"'isampler2DArray'", "'usampler1D'", "'usampler2D'", "'usampler3D'", "'usamplerCube'", 
		"'usampler1DArray'", "'usampler2DArray'", "'sampler2DRect'", "'sampler2DRectShadow'", 
		"'isampler2DRect'", "'usampler2DRect'", "'samplerBuffer'", "'isamplerBuffer'", 
		"'usamplerBuffer'", "'sampler2DMS'", "'isampler2DMS'", "'usampler2DMS'", 
		"'sampler2DMSArray'", "'isampler2DMSArray'", "'usampler2DMSArray'", "'samplerCubeArray'", 
		"'samplerCubeArrayShadow'", "'isamplerCubeArray'", "'usamplerCubeArray'", 
		"'image1D'", "'iimage1D'", "'uimage1D'", "'image2D'", "'iimage2D'", "'uimage2D'", 
		"'image3D'", "'iimage3D'", "'uimage3D'", "'image2DRect'", "'iimage2DRect'", 
		"'uimage2DRect'", "'imageCube'", "'iimageCube'", "'uimageCube'", "'imageBuffer'", 
		"'iimageBuffer'", "'uimageBuffer'", "'image1DArray'", "'iimage1DArray'", 
		"'uimage1DArray'", "'image2DArray'", "'iimage2DArray'", "'uimage2DArray'", 
		"'imageCubeArray'", "'iimageCubeArray'", "'uimageCubeArray'", "'image2DMS'", 
		"'iimage2DMS'", "'uimage2DMS'", "'image2DMSArray'", "'iimage2DMSArray'", 
		"'uimage2DMSArray'", "'samplerExternalOES'", "'struct'", "'common'", "'partition'", 
		"'active'", "'asm'", "'class'", "'union'", "'enum'", "'typedef'", "'template'", 
		"'this'", "'resource'", "'goto'", "'inline'", "'noinline'", "'public'", 
		"'static'", "'extern'", "'external'", "'interface'", "'long'", "'short'", 
		"'half'", "'fixed'", "'unsigned'", "'superp'", "'input'", "'output'", 
		"'hvec2'", "'hvec3'", "'hvec4'", "'fvec2'", "'fvec3'", "'fvec4'", "'sampler3DRect'", 
		"'filter'", "'sizeof'", "'cast'", "'namespace'", "'using'", null, null, 
		null, null, null, null, null, null, null, "'<<'", "'>>'", "'++'", "'--'", 
		"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'^^'", "'*='", "'/='", 
		"'+='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'-='", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", "'='", "';'", 
		"'!'", "'-'", "'~'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", "'|'", 
		"'^'", "'&'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ATTRIBUTE", "CONST", "UNIFORM", "VARYING", "BUFFER", "SHARED", 
		"COHERENT", "VOLATILE", "RESTRICT", "READONLY", "WRITEONLY", "ATOMIC_UINT", 
		"LAYOUT", "CENTROID", "FLAT", "SMOOTH", "NOPERSPECTIVE", "PATCH", "SAMPLE", 
		"BREAK", "CONTINUE", "DO", "FOR", "WHILE", "SWITCH", "CASE", "DEFAULT", 
		"IF", "ELSE", "SUBROUTINE", "IN", "OUT", "INOUT", "FLOAT", "DOUBLE", "INT", 
		"VOID", "BOOL", "INVARIANT", "PRECISE", "DISCARD", "RETURN", "MAT2", "MAT3", 
		"MAT4", "DMAT2", "DMAT3", "DMAT4", "MAT2X2", "MAT2X3", "MAT2X4", "DMAT2X2", 
		"DMAT2X3", "DMAT2X4", "MAT3X2", "MAT3X3", "MAT3X4", "DMAT3X2", "DMAT3X3", 
		"DMAT3X4", "MAT4X2", "MAT4X3", "MAT4X4", "DMAT4X2", "DMAT4X3", "DMAT4X4", 
		"VEC2", "VEC3", "VEC4", "IVEC2", "IVEC3", "IVEC4", "BVEC2", "BVEC3", "BVEC4", 
		"DVEC2", "DVEC3", "DVEC4", "UINT", "UVEC2", "UVEC3", "UVEC4", "LOW_PRECISION", 
		"MEDIUM_PRECISION", "HIGH_PRECISION", "PRECISION", "SAMPLER1D", "SAMPLER2D", 
		"SAMPLER3D", "SAMPLERCUBE", "SAMPLER1DSHADOW", "SAMPLER2DSHADOW", "SAMPLERCUBESHADOW", 
		"SAMPLER1DARRAY", "SAMPLER2DARRAY", "SAMPLER1DARRAYSHADOW", "SAMPLER2DARRAYSHADOW", 
		"ISAMPLER1D", "ISAMPLER2D", "ISAMPLER3D", "ISAMPLERCUBE", "ISAMPLER1DARRAY", 
		"ISAMPLER2DARRAY", "USAMPLER1D", "USAMPLER2D", "USAMPLER3D", "USAMPLERCUBE", 
		"USAMPLER1DARRAY", "USAMPLER2DARRAY", "SAMPLER2DRECT", "SAMPLER2DRECTSHADOW", 
		"ISAMPLER2DRECT", "USAMPLER2DRECT", "SAMPLERBUFFER", "ISAMPLERBUFFER", 
		"USAMPLERBUFFER", "SAMPLER2DMS", "ISAMPLER2DMS", "USAMPLER2DMS", "SAMPLER2DMSARRAY", 
		"ISAMPLER2DMSARRAY", "USAMPLER2DMSARRAY", "SAMPLERCUBEARRAY", "SAMPLERCUBEARRAYSHADOW", 
		"ISAMPLERCUBEARRAY", "USAMPLERCUBEARRAY", "IMAGE1D", "IIMAGE1D", "UIMAGE1D", 
		"IMAGE2D", "IIMAGE2D", "UIMAGE2D", "IMAGE3D", "IIMAGE3D", "UIMAGE3D", 
		"IMAGE2DRECT", "IIMAGE2DRECT", "UIMAGE2DRECT", "IMAGECUBE", "IIMAGECUBE", 
		"UIMAGECUBE", "IMAGEBUFFER", "IIMAGEBUFFER", "UIMAGEBUFFER", "IMAGE1DARRAY", 
		"IIMAGE1DARRAY", "UIMAGE1DARRAY", "IMAGE2DARRAY", "IIMAGE2DARRAY", "UIMAGE2DARRAY", 
		"IMAGECUBEARRAY", "IIMAGECUBEARRAY", "UIMAGECUBEARRAY", "IMAGE2DMS", "IIMAGE2DMS", 
		"UIMAGE2DMS", "IMAGE2DMSARRAY", "IIMAGE2DMSARRAY", "UIMAGE2DMSARRAY", 
		"SAMPLEREXTERNALOES", "STRUCT", "COMMON", "PARTITION", "ACTIVE", "ASM", 
		"CLASS", "UNION", "ENUM", "TYPEDEF", "TEMPLATE", "THIS", "RESOURCE", "GOTO", 
		"INLINE", "NOINLINE", "PUBLIC", "STATIC", "EXTERN", "EXTERNAL", "INTERFACE", 
		"LONG", "SHORT", "HALF", "FIXED", "UNSIGNED", "SUPERP", "INPUT", "OUTPUT", 
		"HVEC2", "HVEC3", "HVEC4", "FVEC2", "FVEC3", "FVEC4", "SAMPLER3DRECT", 
		"FILTER", "SIZEOF", "CAST", "NAMESPACE", "USING", "WHITESPACE", "LINE_CONTINUATION", 
		"MULTILINE_COMMENT", "SINGLELINE_COMMENT", "BOOLCONSTANT", "FLOATCONSTANT", 
		"DOUBLECONSTANT", "INTCONSTANT", "UINTCONSTANT", "LEFT_OP", "RIGHT_OP", 
		"INC_OP", "DEC_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", "AND_OP", "OR_OP", 
		"XOR_OP", "MUL_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", "MOD_ASSIGN", "LEFT_ASSIGN", 
		"RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "SUB_ASSIGN", 
		"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", 
		"RIGHT_BRACE", "DOT", "COMMA", "COLON", "EQUAL", "SEMICOLON", "BANG", 
		"DASH", "TILDE", "PLUS", "STAR", "SLASH", "PERCENT", "LEFT_ANGLE", "RIGHT_ANGLE", 
		"VERTICAL_BAR", "CARET", "AMPERSAND", "QUESTION", "IDENTIFIER"
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
			setState(162);
			glslTranslationUnit();
			setState(163);
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
		public GlslBuiltinTypeContext glslBuiltinType() {
			return getRuleContext(GlslBuiltinTypeContext.class,0);
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
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				glslTypeQualifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				glslTypePrecisionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				glslTypeQualifier();
				setState(168);
				glslIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				glslTypeQualifier();
				setState(171);
				glslVariableIdentifier();
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					glslVariableIdentifier();
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				glslTypeQualifier();
				setState(179);
				glslTypeName();
				setState(180);
				glslVariableDeclarations();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				glslTypeQualifier();
				setState(183);
				glslTypeName();
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					glslArrayDimension();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LEFT_BRACKET );
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(189);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				glslTypeQualifier();
				setState(193);
				glslBuiltinType();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(194);
					glslArrayDimension();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(200);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				glslTypeQualifier();
				setState(204);
				glslStructSpecifier();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(205);
					glslArrayDimension();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(211);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				glslTypeSpecifier();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(215);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				glslInterfaceBlockStructure();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(219);
					glslVariableIdentifier();
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LEFT_BRACKET) {
						{
						{
						setState(220);
						glslArrayDimension();
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(228);
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
			setState(231);
			glslDeclaration();
			setState(232);
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
			setState(234);
			match(PRECISION);
			setState(235);
			glslPrecisionQualifier();
			setState(236);
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
			setState(238);
			glslVariableDeclarator();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				glslVariableDeclarator();
				}
				}
				setState(245);
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
			setState(246);
			glslTypeQualifier();
			setState(247);
			match(IDENTIFIER);
			setState(248);
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
			setState(250);
			glslFullySpecifiedType();
			setState(251);
			glslFunctionName();
			setState(252);
			match(LEFT_PAREN);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(253);
				glslFunctionParameters();
				}
			}

			setState(256);
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
			setState(258);
			glslParameterDeclaration();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				glslParameterDeclaration();
				}
				}
				setState(265);
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
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0)) {
				{
				setState(266);
				glslTypeQualifier();
				}
			}

			setState(269);
			glslTypeSpecifier();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(270);
				glslVariableIdentifier();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(271);
					glslArrayDimension();
					}
					}
					setState(276);
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
			setState(279);
			glslVariableIdentifier();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(280);
				glslArrayDimension();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(286);
				match(EQUAL);
				setState(287);
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0)) {
				{
				setState(290);
				glslTypeQualifier();
				}
			}

			setState(293);
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
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case FLOAT:
			case DOUBLE:
			case INT:
			case VOID:
			case BOOL:
			case MAT2:
			case MAT3:
			case MAT4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case VEC2:
			case VEC3:
			case VEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case UINT:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case BOOLCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case INC_OP:
			case DEC_OP:
			case LEFT_PAREN:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				glslAssignmentExpression();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(LEFT_BRACE);
				setState(297);
				glslInitializer();
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(COMMA);
						setState(299);
						glslInitializer();
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(305);
					match(COMMA);
					}
				}

				setState(308);
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
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				glslCompoundStatement();
				}
				break;
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
			case ATOMIC_UINT:
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
			case FLOAT:
			case DOUBLE:
			case INT:
			case VOID:
			case BOOL:
			case INVARIANT:
			case PRECISE:
			case DISCARD:
			case RETURN:
			case MAT2:
			case MAT3:
			case MAT4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case VEC2:
			case VEC3:
			case VEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case UINT:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
			case PRECISION:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case BOOLCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case INC_OP:
			case DEC_OP:
			case LEFT_PAREN:
			case SEMICOLON:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				glslDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				glslExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				glslIfStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				glslWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				glslDoWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				glslForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
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
			setState(326);
			match(LEFT_BRACE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << IF) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (LEFT_BRACE - 205)) | (1L << (SEMICOLON - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				{
				setState(327);
				glslStatement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				setState(335);
				glslExpression();
				}
			}

			setState(338);
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
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(IF);
				setState(341);
				match(LEFT_PAREN);
				setState(342);
				glslCondition();
				setState(343);
				match(RIGHT_PAREN);
				setState(344);
				glslStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(IF);
				setState(347);
				match(LEFT_PAREN);
				setState(348);
				glslCondition();
				setState(349);
				match(RIGHT_PAREN);
				setState(350);
				glslNonIfStatement();
				setState(351);
				match(ELSE);
				setState(352);
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
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				glslCompoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				glslDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				glslExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				glslWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(361);
				glslDoWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(362);
				glslForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(363);
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
			setState(366);
			match(SWITCH);
			setState(367);
			match(LEFT_PAREN);
			setState(368);
			glslCondition();
			setState(369);
			match(RIGHT_PAREN);
			setState(370);
			match(LEFT_BRACE);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (LEFT_BRACE - 205)) | (1L << (SEMICOLON - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				{
				setState(371);
				glslSwitchSubStatement();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
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
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(CASE);
				setState(380);
				glslIntegerExpression();
				setState(381);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(DEFAULT);
				setState(384);
				match(COLON);
				}
				break;
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
			case ATOMIC_UINT:
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
			case FLOAT:
			case DOUBLE:
			case INT:
			case VOID:
			case BOOL:
			case INVARIANT:
			case PRECISE:
			case DISCARD:
			case RETURN:
			case MAT2:
			case MAT3:
			case MAT4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case VEC2:
			case VEC3:
			case VEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case UINT:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
			case PRECISION:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case BOOLCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
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
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				glslExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				glslFullySpecifiedType();
				setState(390);
				glslVariableIdentifier();
				setState(391);
				match(EQUAL);
				setState(392);
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
			setState(396);
			match(WHILE);
			setState(397);
			match(LEFT_PAREN);
			setState(398);
			glslCondition();
			setState(399);
			match(RIGHT_PAREN);
			setState(400);
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
			setState(402);
			match(DO);
			setState(403);
			glslStatement();
			setState(404);
			match(WHILE);
			setState(405);
			match(LEFT_PAREN);
			setState(406);
			glslExpression();
			setState(407);
			match(RIGHT_PAREN);
			setState(408);
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
			setState(410);
			match(FOR);
			setState(411);
			match(LEFT_PAREN);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				setState(412);
				glslForInitExpression();
				}
			}

			setState(415);
			match(SEMICOLON);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				setState(416);
				glslCondition();
				}
			}

			setState(419);
			match(SEMICOLON);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				setState(420);
				glslExpression();
				}
			}

			setState(423);
			match(RIGHT_PAREN);
			setState(424);
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
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				glslExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(CONTINUE);
				setState(431);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(BREAK);
				setState(433);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(RETURN);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
					{
					setState(435);
					glslExpression();
					}
				}

				setState(438);
				match(SEMICOLON);
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(DISCARD);
				setState(440);
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
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(443);
				glslExternalDeclaration();
				}
				}
				setState(448);
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
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				glslFunctionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
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
			setState(453);
			glslFunctionPrototype();
			setState(454);
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
			setState(456);
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
			setState(458);
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
			setState(460);
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
			setState(462);
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
			setState(464);
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
			setState(466);
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
			setState(468);
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
			setState(470);
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
			setState(472);
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
			setState(474);
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
		public GlslBuiltinTypeContext glslBuiltinType() {
			return getRuleContext(GlslBuiltinTypeContext.class,0);
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
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				glslIdentifier();
				}
				break;
			case ATOMIC_UINT:
			case FLOAT:
			case DOUBLE:
			case INT:
			case VOID:
			case BOOL:
			case MAT2:
			case MAT3:
			case MAT4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case VEC2:
			case VEC3:
			case VEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case UINT:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case SAMPLEREXTERNALOES:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				glslBuiltinType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				glslStructSpecifier();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				glslDoubleConstant();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				glslUnsignedIntegerConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 8);
				{
				setState(483);
				glslBoolConstant();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(484);
				match(LEFT_PAREN);
				setState(485);
				glslExpression();
				setState(486);
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
			setState(491);
			glslPrimaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(493);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(494);
						glslCallArguments();
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(495);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(496);
						glslArrayDimension();
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(497);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(498);
						match(DOT);
						setState(499);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(500);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(501);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(502);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(503);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(LEFT_PAREN);
				setState(510);
				glslAssignmentExpression();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(511);
					match(COMMA);
					setState(512);
					glslAssignmentExpression();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(518);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(LEFT_PAREN);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(521);
					match(VOID);
					}
				}

				setState(524);
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
			setState(527);
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
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case FLOAT:
			case DOUBLE:
			case INT:
			case VOID:
			case BOOL:
			case MAT2:
			case MAT3:
			case MAT4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case VEC2:
			case VEC3:
			case VEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case UINT:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case BOOLCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case LEFT_PAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
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
				setState(530);
				glslUnaryOperator();
				setState(531);
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
			setState(535);
			_la = _input.LA(1);
			if ( !(((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (INC_OP - 212)) | (1L << (DEC_OP - 212)) | (1L << (BANG - 212)) | (1L << (DASH - 212)) | (1L << (TILDE - 212)) | (1L << (PLUS - 212)))) != 0)) ) {
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
			setState(538);
			glslUnaryExpression();
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
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(540);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(541);
						match(STAR);
						setState(542);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(543);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(544);
						match(SLASH);
						setState(545);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(546);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(547);
						match(PERCENT);
						setState(548);
						glslUnaryExpression();
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
			setState(555);
			glslMultiplicativeExpression(0);
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
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(557);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(558);
						match(PLUS);
						setState(559);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(560);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(561);
						match(DASH);
						setState(562);
						glslMultiplicativeExpression(0);
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
			setState(569);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(577);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(571);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(572);
						match(LEFT_OP);
						setState(573);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(574);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(575);
						match(RIGHT_OP);
						setState(576);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(581);
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
			setState(583);
			glslShiftExpression(0);
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
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(585);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(586);
						match(LEFT_ANGLE);
						setState(587);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(588);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(589);
						match(RIGHT_ANGLE);
						setState(590);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(591);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(592);
						match(LE_OP);
						setState(593);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(594);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(595);
						match(GE_OP);
						setState(596);
						glslShiftExpression(0);
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
			setState(603);
			glslRelationalExpression(0);
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
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(605);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(606);
						match(EQ_OP);
						setState(607);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(608);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(609);
						match(NE_OP);
						setState(610);
						glslRelationalExpression(0);
						}
						break;
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
			setState(617);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(619);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(620);
					match(AMPERSAND);
					setState(621);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(626);
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
			setState(628);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(630);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(631);
					match(CARET);
					setState(632);
					glslAndExpression(0);
					}
					} 
				}
				setState(637);
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
			setState(639);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(641);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(642);
					match(VERTICAL_BAR);
					setState(643);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(648);
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
			setState(650);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(652);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(653);
					match(AND_OP);
					setState(654);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(659);
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
			setState(661);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(663);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(664);
					match(XOR_OP);
					setState(665);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
			setState(672);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(674);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(675);
					match(OR_OP);
					setState(676);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				glslLogicalOrExpression(0);
				setState(684);
				match(QUESTION);
				setState(685);
				glslExpression();
				setState(686);
				match(COLON);
				setState(687);
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
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				glslUnaryExpression();
				setState(693);
				glslAssignmentOperator();
				setState(694);
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
			setState(698);
			_la = _input.LA(1);
			if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (MUL_ASSIGN - 221)) | (1L << (DIV_ASSIGN - 221)) | (1L << (ADD_ASSIGN - 221)) | (1L << (MOD_ASSIGN - 221)) | (1L << (LEFT_ASSIGN - 221)) | (1L << (RIGHT_ASSIGN - 221)) | (1L << (AND_ASSIGN - 221)) | (1L << (XOR_ASSIGN - 221)) | (1L << (OR_ASSIGN - 221)) | (1L << (SUB_ASSIGN - 221)) | (1L << (EQUAL - 221)))) != 0)) ) {
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
			setState(700);
			glslAssignmentExpression();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(701);
				match(COMMA);
				setState(702);
				glslAssignmentExpression();
				}
				}
				setState(707);
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
			setState(708);
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
			setState(710);
			glslFunctionName();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(711);
				match(COMMA);
				setState(712);
				glslFunctionName();
				}
				}
				setState(717);
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
			setState(718);
			glslTypeSpecifierNonarray();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(719);
				glslArrayDimension();
				}
				}
				setState(724);
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
			setState(725);
			match(LEFT_BRACKET);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (BOOLCONSTANT - 205)) | (1L << (FLOATCONSTANT - 205)) | (1L << (DOUBLECONSTANT - 205)) | (1L << (INTCONSTANT - 205)) | (1L << (UINTCONSTANT - 205)) | (1L << (INC_OP - 205)) | (1L << (DEC_OP - 205)) | (1L << (LEFT_PAREN - 205)) | (1L << (BANG - 205)) | (1L << (DASH - 205)) | (1L << (TILDE - 205)) | (1L << (PLUS - 205)) | (1L << (IDENTIFIER - 205)))) != 0)) {
				{
				setState(726);
				glslIntegerExpression();
				}
			}

			setState(729);
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
		public GlslBuiltinTypeContext glslBuiltinType() {
			return getRuleContext(GlslBuiltinTypeContext.class,0);
		}
		public GlslStructSpecifierContext glslStructSpecifier() {
			return getRuleContext(GlslStructSpecifierContext.class,0);
		}
		public GlslTypeNameContext glslTypeName() {
			return getRuleContext(GlslTypeNameContext.class,0);
		}
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
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case FLOAT:
			case DOUBLE:
			case INT:
			case VOID:
			case BOOL:
			case MAT2:
			case MAT3:
			case MAT4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case VEC2:
			case VEC3:
			case VEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case UINT:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case SAMPLEREXTERNALOES:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				glslBuiltinType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				glslStructSpecifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
				glslTypeName();
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

	public static class GlslBuiltinTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GLSLParser.VOID, 0); }
		public TerminalNode FLOAT() { return getToken(GLSLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(GLSLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(GLSLParser.INT, 0); }
		public TerminalNode UINT() { return getToken(GLSLParser.UINT, 0); }
		public TerminalNode BOOL() { return getToken(GLSLParser.BOOL, 0); }
		public TerminalNode VEC2() { return getToken(GLSLParser.VEC2, 0); }
		public TerminalNode VEC3() { return getToken(GLSLParser.VEC3, 0); }
		public TerminalNode VEC4() { return getToken(GLSLParser.VEC4, 0); }
		public TerminalNode DVEC2() { return getToken(GLSLParser.DVEC2, 0); }
		public TerminalNode DVEC3() { return getToken(GLSLParser.DVEC3, 0); }
		public TerminalNode DVEC4() { return getToken(GLSLParser.DVEC4, 0); }
		public TerminalNode BVEC2() { return getToken(GLSLParser.BVEC2, 0); }
		public TerminalNode BVEC3() { return getToken(GLSLParser.BVEC3, 0); }
		public TerminalNode BVEC4() { return getToken(GLSLParser.BVEC4, 0); }
		public TerminalNode IVEC2() { return getToken(GLSLParser.IVEC2, 0); }
		public TerminalNode IVEC3() { return getToken(GLSLParser.IVEC3, 0); }
		public TerminalNode IVEC4() { return getToken(GLSLParser.IVEC4, 0); }
		public TerminalNode UVEC2() { return getToken(GLSLParser.UVEC2, 0); }
		public TerminalNode UVEC3() { return getToken(GLSLParser.UVEC3, 0); }
		public TerminalNode UVEC4() { return getToken(GLSLParser.UVEC4, 0); }
		public TerminalNode MAT2() { return getToken(GLSLParser.MAT2, 0); }
		public TerminalNode MAT3() { return getToken(GLSLParser.MAT3, 0); }
		public TerminalNode MAT4() { return getToken(GLSLParser.MAT4, 0); }
		public TerminalNode MAT2X2() { return getToken(GLSLParser.MAT2X2, 0); }
		public TerminalNode MAT2X3() { return getToken(GLSLParser.MAT2X3, 0); }
		public TerminalNode MAT2X4() { return getToken(GLSLParser.MAT2X4, 0); }
		public TerminalNode MAT3X2() { return getToken(GLSLParser.MAT3X2, 0); }
		public TerminalNode MAT3X3() { return getToken(GLSLParser.MAT3X3, 0); }
		public TerminalNode MAT3X4() { return getToken(GLSLParser.MAT3X4, 0); }
		public TerminalNode MAT4X2() { return getToken(GLSLParser.MAT4X2, 0); }
		public TerminalNode MAT4X3() { return getToken(GLSLParser.MAT4X3, 0); }
		public TerminalNode MAT4X4() { return getToken(GLSLParser.MAT4X4, 0); }
		public TerminalNode DMAT2() { return getToken(GLSLParser.DMAT2, 0); }
		public TerminalNode DMAT3() { return getToken(GLSLParser.DMAT3, 0); }
		public TerminalNode DMAT4() { return getToken(GLSLParser.DMAT4, 0); }
		public TerminalNode DMAT2X2() { return getToken(GLSLParser.DMAT2X2, 0); }
		public TerminalNode DMAT2X3() { return getToken(GLSLParser.DMAT2X3, 0); }
		public TerminalNode DMAT2X4() { return getToken(GLSLParser.DMAT2X4, 0); }
		public TerminalNode DMAT3X2() { return getToken(GLSLParser.DMAT3X2, 0); }
		public TerminalNode DMAT3X3() { return getToken(GLSLParser.DMAT3X3, 0); }
		public TerminalNode DMAT3X4() { return getToken(GLSLParser.DMAT3X4, 0); }
		public TerminalNode DMAT4X2() { return getToken(GLSLParser.DMAT4X2, 0); }
		public TerminalNode DMAT4X3() { return getToken(GLSLParser.DMAT4X3, 0); }
		public TerminalNode DMAT4X4() { return getToken(GLSLParser.DMAT4X4, 0); }
		public TerminalNode ATOMIC_UINT() { return getToken(GLSLParser.ATOMIC_UINT, 0); }
		public TerminalNode SAMPLER1D() { return getToken(GLSLParser.SAMPLER1D, 0); }
		public TerminalNode SAMPLER2D() { return getToken(GLSLParser.SAMPLER2D, 0); }
		public TerminalNode SAMPLER3D() { return getToken(GLSLParser.SAMPLER3D, 0); }
		public TerminalNode SAMPLERCUBE() { return getToken(GLSLParser.SAMPLERCUBE, 0); }
		public TerminalNode SAMPLER1DSHADOW() { return getToken(GLSLParser.SAMPLER1DSHADOW, 0); }
		public TerminalNode SAMPLER2DSHADOW() { return getToken(GLSLParser.SAMPLER2DSHADOW, 0); }
		public TerminalNode SAMPLERCUBESHADOW() { return getToken(GLSLParser.SAMPLERCUBESHADOW, 0); }
		public TerminalNode SAMPLER1DARRAY() { return getToken(GLSLParser.SAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER2DARRAY() { return getToken(GLSLParser.SAMPLER2DARRAY, 0); }
		public TerminalNode SAMPLER1DARRAYSHADOW() { return getToken(GLSLParser.SAMPLER1DARRAYSHADOW, 0); }
		public TerminalNode SAMPLER2DARRAYSHADOW() { return getToken(GLSLParser.SAMPLER2DARRAYSHADOW, 0); }
		public TerminalNode SAMPLERCUBEARRAY() { return getToken(GLSLParser.SAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLERCUBEARRAYSHADOW() { return getToken(GLSLParser.SAMPLERCUBEARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER1D() { return getToken(GLSLParser.ISAMPLER1D, 0); }
		public TerminalNode ISAMPLER2D() { return getToken(GLSLParser.ISAMPLER2D, 0); }
		public TerminalNode ISAMPLER3D() { return getToken(GLSLParser.ISAMPLER3D, 0); }
		public TerminalNode ISAMPLERCUBE() { return getToken(GLSLParser.ISAMPLERCUBE, 0); }
		public TerminalNode ISAMPLER1DARRAY() { return getToken(GLSLParser.ISAMPLER1DARRAY, 0); }
		public TerminalNode ISAMPLER2DARRAY() { return getToken(GLSLParser.ISAMPLER2DARRAY, 0); }
		public TerminalNode ISAMPLERCUBEARRAY() { return getToken(GLSLParser.ISAMPLERCUBEARRAY, 0); }
		public TerminalNode USAMPLER1D() { return getToken(GLSLParser.USAMPLER1D, 0); }
		public TerminalNode USAMPLER2D() { return getToken(GLSLParser.USAMPLER2D, 0); }
		public TerminalNode USAMPLER3D() { return getToken(GLSLParser.USAMPLER3D, 0); }
		public TerminalNode USAMPLERCUBE() { return getToken(GLSLParser.USAMPLERCUBE, 0); }
		public TerminalNode USAMPLER1DARRAY() { return getToken(GLSLParser.USAMPLER1DARRAY, 0); }
		public TerminalNode USAMPLER2DARRAY() { return getToken(GLSLParser.USAMPLER2DARRAY, 0); }
		public TerminalNode USAMPLERCUBEARRAY() { return getToken(GLSLParser.USAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLER2DRECT() { return getToken(GLSLParser.SAMPLER2DRECT, 0); }
		public TerminalNode SAMPLER2DRECTSHADOW() { return getToken(GLSLParser.SAMPLER2DRECTSHADOW, 0); }
		public TerminalNode ISAMPLER2DRECT() { return getToken(GLSLParser.ISAMPLER2DRECT, 0); }
		public TerminalNode USAMPLER2DRECT() { return getToken(GLSLParser.USAMPLER2DRECT, 0); }
		public TerminalNode SAMPLERBUFFER() { return getToken(GLSLParser.SAMPLERBUFFER, 0); }
		public TerminalNode ISAMPLERBUFFER() { return getToken(GLSLParser.ISAMPLERBUFFER, 0); }
		public TerminalNode USAMPLERBUFFER() { return getToken(GLSLParser.USAMPLERBUFFER, 0); }
		public TerminalNode SAMPLER2DMS() { return getToken(GLSLParser.SAMPLER2DMS, 0); }
		public TerminalNode ISAMPLER2DMS() { return getToken(GLSLParser.ISAMPLER2DMS, 0); }
		public TerminalNode USAMPLER2DMS() { return getToken(GLSLParser.USAMPLER2DMS, 0); }
		public TerminalNode SAMPLER2DMSARRAY() { return getToken(GLSLParser.SAMPLER2DMSARRAY, 0); }
		public TerminalNode ISAMPLER2DMSARRAY() { return getToken(GLSLParser.ISAMPLER2DMSARRAY, 0); }
		public TerminalNode USAMPLER2DMSARRAY() { return getToken(GLSLParser.USAMPLER2DMSARRAY, 0); }
		public TerminalNode IMAGE1D() { return getToken(GLSLParser.IMAGE1D, 0); }
		public TerminalNode IIMAGE1D() { return getToken(GLSLParser.IIMAGE1D, 0); }
		public TerminalNode UIMAGE1D() { return getToken(GLSLParser.UIMAGE1D, 0); }
		public TerminalNode IMAGE2D() { return getToken(GLSLParser.IMAGE2D, 0); }
		public TerminalNode IIMAGE2D() { return getToken(GLSLParser.IIMAGE2D, 0); }
		public TerminalNode UIMAGE2D() { return getToken(GLSLParser.UIMAGE2D, 0); }
		public TerminalNode IMAGE3D() { return getToken(GLSLParser.IMAGE3D, 0); }
		public TerminalNode IIMAGE3D() { return getToken(GLSLParser.IIMAGE3D, 0); }
		public TerminalNode UIMAGE3D() { return getToken(GLSLParser.UIMAGE3D, 0); }
		public TerminalNode IMAGE2DRECT() { return getToken(GLSLParser.IMAGE2DRECT, 0); }
		public TerminalNode IIMAGE2DRECT() { return getToken(GLSLParser.IIMAGE2DRECT, 0); }
		public TerminalNode UIMAGE2DRECT() { return getToken(GLSLParser.UIMAGE2DRECT, 0); }
		public TerminalNode IMAGECUBE() { return getToken(GLSLParser.IMAGECUBE, 0); }
		public TerminalNode IIMAGECUBE() { return getToken(GLSLParser.IIMAGECUBE, 0); }
		public TerminalNode UIMAGECUBE() { return getToken(GLSLParser.UIMAGECUBE, 0); }
		public TerminalNode IMAGEBUFFER() { return getToken(GLSLParser.IMAGEBUFFER, 0); }
		public TerminalNode IIMAGEBUFFER() { return getToken(GLSLParser.IIMAGEBUFFER, 0); }
		public TerminalNode UIMAGEBUFFER() { return getToken(GLSLParser.UIMAGEBUFFER, 0); }
		public TerminalNode IMAGE1DARRAY() { return getToken(GLSLParser.IMAGE1DARRAY, 0); }
		public TerminalNode IIMAGE1DARRAY() { return getToken(GLSLParser.IIMAGE1DARRAY, 0); }
		public TerminalNode UIMAGE1DARRAY() { return getToken(GLSLParser.UIMAGE1DARRAY, 0); }
		public TerminalNode IMAGE2DARRAY() { return getToken(GLSLParser.IMAGE2DARRAY, 0); }
		public TerminalNode IIMAGE2DARRAY() { return getToken(GLSLParser.IIMAGE2DARRAY, 0); }
		public TerminalNode UIMAGE2DARRAY() { return getToken(GLSLParser.UIMAGE2DARRAY, 0); }
		public TerminalNode IMAGECUBEARRAY() { return getToken(GLSLParser.IMAGECUBEARRAY, 0); }
		public TerminalNode IIMAGECUBEARRAY() { return getToken(GLSLParser.IIMAGECUBEARRAY, 0); }
		public TerminalNode UIMAGECUBEARRAY() { return getToken(GLSLParser.UIMAGECUBEARRAY, 0); }
		public TerminalNode IMAGE2DMS() { return getToken(GLSLParser.IMAGE2DMS, 0); }
		public TerminalNode IIMAGE2DMS() { return getToken(GLSLParser.IIMAGE2DMS, 0); }
		public TerminalNode UIMAGE2DMS() { return getToken(GLSLParser.UIMAGE2DMS, 0); }
		public TerminalNode IMAGE2DMSARRAY() { return getToken(GLSLParser.IMAGE2DMSARRAY, 0); }
		public TerminalNode IIMAGE2DMSARRAY() { return getToken(GLSLParser.IIMAGE2DMSARRAY, 0); }
		public TerminalNode UIMAGE2DMSARRAY() { return getToken(GLSLParser.UIMAGE2DMSARRAY, 0); }
		public TerminalNode SAMPLEREXTERNALOES() { return getToken(GLSLParser.SAMPLEREXTERNALOES, 0); }
		public GlslBuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslBuiltinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslBuiltinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslBuiltinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslBuiltinTypeContext glslBuiltinType() throws RecognitionException {
		GlslBuiltinTypeContext _localctx = new GlslBuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_glslBuiltinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)))) != 0)) ) {
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
		enterRule(_localctx, 132, RULE_glslStructSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(STRUCT);
			setState(739);
			match(IDENTIFIER);
			setState(740);
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
		enterRule(_localctx, 134, RULE_glslStructBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(LEFT_BRACE);
			setState(744); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(743);
				glslStructMemberGroup();
				}
				}
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==IDENTIFIER );
			setState(748);
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
		enterRule(_localctx, 136, RULE_glslStructMemberGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0)) {
				{
				setState(750);
				glslTypeQualifier();
				}
			}

			setState(753);
			glslTypeSpecifier();
			setState(754);
			glslStructMemberDeclaratorList();
			setState(755);
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
		enterRule(_localctx, 138, RULE_glslStructMemberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			glslStructMemberDeclarator();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(758);
				match(COMMA);
				setState(759);
				glslStructMemberDeclarator();
				}
				}
				setState(764);
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
		enterRule(_localctx, 140, RULE_glslStructMemberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(IDENTIFIER);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(766);
				glslArrayDimension();
				}
				}
				setState(771);
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
		enterRule(_localctx, 142, RULE_glslTypeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(772);
				glslSingleTypeQualifier();
				}
				}
				setState(775); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_glslSingleTypeQualifier);
		try {
			setState(783);
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
				setState(777);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				glslLayoutQualifier();
				}
				break;
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(781);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(782);
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
		enterRule(_localctx, 146, RULE_glslInvariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
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
		enterRule(_localctx, 148, RULE_glslInterpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE))) != 0)) ) {
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
		enterRule(_localctx, 150, RULE_glslLayoutQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(LAYOUT);
			setState(790);
			match(LEFT_PAREN);
			setState(791);
			glslLayoutQualifierIdList();
			setState(792);
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
		enterRule(_localctx, 152, RULE_glslLayoutQualifierIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			glslLayoutQualifierId();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(795);
				match(COMMA);
				setState(796);
				glslLayoutQualifierId();
				}
				}
				setState(801);
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
		enterRule(_localctx, 154, RULE_glslLayoutQualifierId);
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(IDENTIFIER);
				setState(804);
				match(EQUAL);
				setState(805);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
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
		enterRule(_localctx, 156, RULE_glslPreciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
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
		enterRule(_localctx, 158, RULE_glslStorageQualifier);
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(815);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(816);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(817);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(818);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(819);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(820);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(821);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(822);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(823);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(824);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(825);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(826);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(827);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(828);
				match(SUBROUTINE);
				setState(829);
				match(LEFT_PAREN);
				setState(830);
				glslFunctionNameList();
				setState(831);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(833);
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
		public TerminalNode HIGH_PRECISION() { return getToken(GLSLParser.HIGH_PRECISION, 0); }
		public TerminalNode MEDIUM_PRECISION() { return getToken(GLSLParser.MEDIUM_PRECISION, 0); }
		public TerminalNode LOW_PRECISION() { return getToken(GLSLParser.LOW_PRECISION, 0); }
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
		enterRule(_localctx, 160, RULE_glslPrecisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0101\u0349\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u00b1\n\3\r\3\16\3\u00b2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u00bc\n\3\r\3\16\3\u00bd\3\3\5\3\u00c1\n"+
		"\3\3\3\3\3\3\3\7\3\u00c6\n\3\f\3\16\3\u00c9\13\3\3\3\5\3\u00cc\n\3\3\3"+
		"\3\3\3\3\7\3\u00d1\n\3\f\3\16\3\u00d4\13\3\3\3\5\3\u00d7\n\3\3\3\3\3\5"+
		"\3\u00db\n\3\3\3\3\3\3\3\7\3\u00e0\n\3\f\3\16\3\u00e3\13\3\5\3\u00e5\n"+
		"\3\3\3\5\3\u00e8\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00f4"+
		"\n\6\f\6\16\6\u00f7\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0101\n\b"+
		"\3\b\3\b\3\t\3\t\3\t\7\t\u0108\n\t\f\t\16\t\u010b\13\t\3\n\5\n\u010e\n"+
		"\n\3\n\3\n\3\n\7\n\u0113\n\n\f\n\16\n\u0116\13\n\5\n\u0118\n\n\3\13\3"+
		"\13\7\13\u011c\n\13\f\13\16\13\u011f\13\13\3\13\3\13\5\13\u0123\n\13\3"+
		"\f\5\f\u0126\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u012f\n\r\f\r\16\r\u0132"+
		"\13\r\3\r\5\r\u0135\n\r\3\r\3\r\5\r\u0139\n\r\3\16\3\16\5\16\u013d\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0147\n\17\3\20\3\20\7\20"+
		"\u014b\n\20\f\20\16\20\u014e\13\20\3\20\3\20\3\21\5\21\u0153\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0165\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016f"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0177\n\24\f\24\16\24\u017a\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0185\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u018d\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u01a0\n\31"+
		"\3\31\3\31\5\31\u01a4\n\31\3\31\3\31\5\31\u01a8\n\31\3\31\3\31\3\31\3"+
		"\32\3\32\5\32\u01af\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01b7\n\33"+
		"\3\33\3\33\3\33\5\33\u01bc\n\33\3\34\7\34\u01bf\n\34\f\34\16\34\u01c2"+
		"\13\34\3\35\3\35\5\35\u01c6\n\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!"+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u01eb\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7"+
		"*\u01fb\n*\f*\16*\u01fe\13*\3+\3+\3+\3+\7+\u0204\n+\f+\16+\u0207\13+\3"+
		"+\3+\3+\3+\5+\u020d\n+\3+\5+\u0210\n+\3,\3,\3-\3-\3-\3-\5-\u0218\n-\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0228\n/\f/\16/\u022b\13/"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0236\n\60\f\60\16"+
		"\60\u0239\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0244"+
		"\n\61\f\61\16\61\u0247\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0258\n\62\f\62\16\62\u025b\13"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0266\n\63\f\63"+
		"\16\63\u0269\13\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0271\n\64\f\64"+
		"\16\64\u0274\13\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u027c\n\65\f\65"+
		"\16\65\u027f\13\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0287\n\66\f\66"+
		"\16\66\u028a\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0292\n\67\f\67"+
		"\16\67\u0295\13\67\38\38\38\38\38\38\78\u029d\n8\f8\168\u02a0\138\39\3"+
		"9\39\39\39\39\79\u02a8\n9\f9\169\u02ab\139\3:\3:\3:\3:\3:\3:\3:\5:\u02b4"+
		"\n:\3;\3;\3;\3;\3;\5;\u02bb\n;\3<\3<\3=\3=\3=\7=\u02c2\n=\f=\16=\u02c5"+
		"\13=\3>\3>\3?\3?\3?\7?\u02cc\n?\f?\16?\u02cf\13?\3@\3@\7@\u02d3\n@\f@"+
		"\16@\u02d6\13@\3A\3A\5A\u02da\nA\3A\3A\3B\3B\3B\5B\u02e1\nB\3C\3C\3D\3"+
		"D\3D\3D\3E\3E\6E\u02eb\nE\rE\16E\u02ec\3E\3E\3F\5F\u02f2\nF\3F\3F\3F\3"+
		"F\3G\3G\3G\7G\u02fb\nG\fG\16G\u02fe\13G\3H\3H\7H\u0302\nH\fH\16H\u0305"+
		"\13H\3I\6I\u0308\nI\rI\16I\u0309\3J\3J\3J\3J\3J\3J\5J\u0312\nJ\3K\3K\3"+
		"L\3L\3M\3M\3M\3M\3M\3N\3N\3N\7N\u0320\nN\fN\16N\u0323\13N\3O\3O\3O\3O"+
		"\3O\5O\u032a\nO\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0345\nQ\3R\3R\3R\2\16R\\^`bdfhjlnpS\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\2\7\4\2\u00d6\u00d7"+
		"\u00f4\u00f7\4\2\u00df\u00e8\u00f2\u00f2\6\2\16\16$(-TY\u00a2\3\2\21\23"+
		"\3\2UW\2\u0382\2\u00a4\3\2\2\2\4\u00e7\3\2\2\2\6\u00e9\3\2\2\2\b\u00ec"+
		"\3\2\2\2\n\u00f0\3\2\2\2\f\u00f8\3\2\2\2\16\u00fc\3\2\2\2\20\u0104\3\2"+
		"\2\2\22\u010d\3\2\2\2\24\u0119\3\2\2\2\26\u0125\3\2\2\2\30\u0138\3\2\2"+
		"\2\32\u013c\3\2\2\2\34\u0146\3\2\2\2\36\u0148\3\2\2\2 \u0152\3\2\2\2\""+
		"\u0164\3\2\2\2$\u016e\3\2\2\2&\u0170\3\2\2\2(\u0184\3\2\2\2*\u018c\3\2"+
		"\2\2,\u018e\3\2\2\2.\u0194\3\2\2\2\60\u019c\3\2\2\2\62\u01ae\3\2\2\2\64"+
		"\u01bb\3\2\2\2\66\u01c0\3\2\2\28\u01c5\3\2\2\2:\u01c7\3\2\2\2<\u01ca\3"+
		"\2\2\2>\u01cc\3\2\2\2@\u01ce\3\2\2\2B\u01d0\3\2\2\2D\u01d2\3\2\2\2F\u01d4"+
		"\3\2\2\2H\u01d6\3\2\2\2J\u01d8\3\2\2\2L\u01da\3\2\2\2N\u01dc\3\2\2\2P"+
		"\u01ea\3\2\2\2R\u01ec\3\2\2\2T\u020f\3\2\2\2V\u0211\3\2\2\2X\u0217\3\2"+
		"\2\2Z\u0219\3\2\2\2\\\u021b\3\2\2\2^\u022c\3\2\2\2`\u023a\3\2\2\2b\u0248"+
		"\3\2\2\2d\u025c\3\2\2\2f\u026a\3\2\2\2h\u0275\3\2\2\2j\u0280\3\2\2\2l"+
		"\u028b\3\2\2\2n\u0296\3\2\2\2p\u02a1\3\2\2\2r\u02b3\3\2\2\2t\u02ba\3\2"+
		"\2\2v\u02bc\3\2\2\2x\u02be\3\2\2\2z\u02c6\3\2\2\2|\u02c8\3\2\2\2~\u02d0"+
		"\3\2\2\2\u0080\u02d7\3\2\2\2\u0082\u02e0\3\2\2\2\u0084\u02e2\3\2\2\2\u0086"+
		"\u02e4\3\2\2\2\u0088\u02e8\3\2\2\2\u008a\u02f1\3\2\2\2\u008c\u02f7\3\2"+
		"\2\2\u008e\u02ff\3\2\2\2\u0090\u0307\3\2\2\2\u0092\u0311\3\2\2\2\u0094"+
		"\u0313\3\2\2\2\u0096\u0315\3\2\2\2\u0098\u0317\3\2\2\2\u009a\u031c\3\2"+
		"\2\2\u009c\u0329\3\2\2\2\u009e\u032b\3\2\2\2\u00a0\u0344\3\2\2\2\u00a2"+
		"\u0346\3\2\2\2\u00a4\u00a5\5\66\34\2\u00a5\u00a6\7\2\2\3\u00a6\3\3\2\2"+
		"\2\u00a7\u00e8\5\u0090I\2\u00a8\u00e8\5\b\5\2\u00a9\u00aa\5\u0090I\2\u00aa"+
		"\u00ab\5> \2\u00ab\u00e8\3\2\2\2\u00ac\u00ad\5\u0090I\2\u00ad\u00b0\5"+
		"B\"\2\u00ae\u00af\7\u00f0\2\2\u00af\u00b1\5B\"\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00e8\3\2"+
		"\2\2\u00b4\u00b5\5\u0090I\2\u00b5\u00b6\5@!\2\u00b6\u00b7\5\n\6\2\u00b7"+
		"\u00e8\3\2\2\2\u00b8\u00b9\5\u0090I\2\u00b9\u00bb\5@!\2\u00ba\u00bc\5"+
		"\u0080A\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\5\n\6\2\u00c0\u00bf"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00e8\3\2\2\2\u00c2\u00c3\5\u0090I"+
		"\2\u00c3\u00c7\5\u0084C\2\u00c4\u00c6\5\u0080A\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\5\n\6\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00e8\3\2\2\2\u00cd\u00ce\5\u0090I\2\u00ce\u00d2"+
		"\5\u0086D\2\u00cf\u00d1\5\u0080A\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d7\5\n\6\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00e8\3\2\2\2\u00d8\u00da\5~@\2\u00d9\u00db\5\n\6\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e8\3\2\2\2\u00dc\u00e4\5\f\7\2\u00dd"+
		"\u00e1\5B\"\2\u00de\u00e0\5\u0080A\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e8\5\16\b\2\u00e7\u00a7\3\2\2\2\u00e7\u00a8\3\2\2\2\u00e7"+
		"\u00a9\3\2\2\2\u00e7\u00ac\3\2\2\2\u00e7\u00b4\3\2\2\2\u00e7\u00b8\3\2"+
		"\2\2\u00e7\u00c2\3\2\2\2\u00e7\u00cd\3\2\2\2\u00e7\u00d8\3\2\2\2\u00e7"+
		"\u00dc\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\5\3\2\2\2\u00e9\u00ea\5\4\3\2"+
		"\u00ea\u00eb\7\u00f3\2\2\u00eb\7\3\2\2\2\u00ec\u00ed\7X\2\2\u00ed\u00ee"+
		"\5\u00a2R\2\u00ee\u00ef\5~@\2\u00ef\t\3\2\2\2\u00f0\u00f5\5\24\13\2\u00f1"+
		"\u00f2\7\u00f0\2\2\u00f2\u00f4\5\24\13\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\13\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\5\u0090I\2\u00f9\u00fa\7\u0101\2\2\u00fa\u00fb"+
		"\5\u0088E\2\u00fb\r\3\2\2\2\u00fc\u00fd\5\26\f\2\u00fd\u00fe\5D#\2\u00fe"+
		"\u0100\7\u00e9\2\2\u00ff\u0101\5\20\t\2\u0100\u00ff\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\u00ea\2\2\u0103\17\3\2\2\2"+
		"\u0104\u0109\5\22\n\2\u0105\u0106\7\u00f0\2\2\u0106\u0108\5\22\n\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\21\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5\u0090I\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0117\5~"+
		"@\2\u0110\u0114\5B\"\2\u0111\u0113\5\u0080A\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\23\3\2\2\2\u0119\u011d\5B\"\2\u011a\u011c\5\u0080A\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0122\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\u00f2\2\2\u0121\u0123"+
		"\5\30\r\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\25\3\2\2\2\u0124"+
		"\u0126\5\u0090I\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\5~@\2\u0128\27\3\2\2\2\u0129\u0139\5t;\2\u012a\u012b"+
		"\7\u00ed\2\2\u012b\u0130\5\30\r\2\u012c\u012d\7\u00f0\2\2\u012d\u012f"+
		"\5\30\r\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135"+
		"\7\u00f0\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0137\7\u00ee\2\2\u0137\u0139\3\2\2\2\u0138\u0129\3\2\2\2\u0138"+
		"\u012a\3\2\2\2\u0139\31\3\2\2\2\u013a\u013d\5\36\20\2\u013b\u013d\5\34"+
		"\17\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\33\3\2\2\2\u013e\u0147"+
		"\5\6\4\2\u013f\u0147\5 \21\2\u0140\u0147\5\"\22\2\u0141\u0147\5&\24\2"+
		"\u0142\u0147\5,\27\2\u0143\u0147\5.\30\2\u0144\u0147\5\60\31\2\u0145\u0147"+
		"\5\64\33\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2"+
		"\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147\35\3\2\2\2\u0148\u014c\7\u00ed\2\2"+
		"\u0149\u014b\5\32\16\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0150\7\u00ee\2\2\u0150\37\3\2\2\2\u0151\u0153\5x=\2\u0152\u0151\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\u00f3\2\2\u0155"+
		"!\3\2\2\2\u0156\u0157\7\36\2\2\u0157\u0158\7\u00e9\2\2\u0158\u0159\5*"+
		"\26\2\u0159\u015a\7\u00ea\2\2\u015a\u015b\5\32\16\2\u015b\u0165\3\2\2"+
		"\2\u015c\u015d\7\36\2\2\u015d\u015e\7\u00e9\2\2\u015e\u015f\5*\26\2\u015f"+
		"\u0160\7\u00ea\2\2\u0160\u0161\5$\23\2\u0161\u0162\7\37\2\2\u0162\u0163"+
		"\5\32\16\2\u0163\u0165\3\2\2\2\u0164\u0156\3\2\2\2\u0164\u015c\3\2\2\2"+
		"\u0165#\3\2\2\2\u0166\u016f\5\36\20\2\u0167\u016f\5\6\4\2\u0168\u016f"+
		"\5 \21\2\u0169\u016f\5&\24\2\u016a\u016f\5,\27\2\u016b\u016f\5.\30\2\u016c"+
		"\u016f\5\60\31\2\u016d\u016f\5\64\33\2\u016e\u0166\3\2\2\2\u016e\u0167"+
		"\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f%\3\2\2\2"+
		"\u0170\u0171\7\33\2\2\u0171\u0172\7\u00e9\2\2\u0172\u0173\5*\26\2\u0173"+
		"\u0174\7\u00ea\2\2\u0174\u0178\7\u00ed\2\2\u0175\u0177\5(\25\2\u0176\u0175"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7\u00ee\2\2\u017c\'\3\2"+
		"\2\2\u017d\u017e\7\34\2\2\u017e\u017f\5V,\2\u017f\u0180\7\u00f1\2\2\u0180"+
		"\u0185\3\2\2\2\u0181\u0182\7\35\2\2\u0182\u0185\7\u00f1\2\2\u0183\u0185"+
		"\5\32\16\2\u0184\u017d\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0183\3\2\2\2"+
		"\u0185)\3\2\2\2\u0186\u018d\5x=\2\u0187\u0188\5\26\f\2\u0188\u0189\5B"+
		"\"\2\u0189\u018a\7\u00f2\2\2\u018a\u018b\5\30\r\2\u018b\u018d\3\2\2\2"+
		"\u018c\u0186\3\2\2\2\u018c\u0187\3\2\2\2\u018d+\3\2\2\2\u018e\u018f\7"+
		"\32\2\2\u018f\u0190\7\u00e9\2\2\u0190\u0191\5*\26\2\u0191\u0192\7\u00ea"+
		"\2\2\u0192\u0193\5\32\16\2\u0193-\3\2\2\2\u0194\u0195\7\30\2\2\u0195\u0196"+
		"\5\32\16\2\u0196\u0197\7\32\2\2\u0197\u0198\7\u00e9\2\2\u0198\u0199\5"+
		"x=\2\u0199\u019a\7\u00ea\2\2\u019a\u019b\7\u00f3\2\2\u019b/\3\2\2\2\u019c"+
		"\u019d\7\31\2\2\u019d\u019f\7\u00e9\2\2\u019e\u01a0\5\62\32\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\7\u00f3\2"+
		"\2\u01a2\u01a4\5*\26\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a7\7\u00f3\2\2\u01a6\u01a8\5x=\2\u01a7\u01a6\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\u00ea\2\2\u01aa"+
		"\u01ab\5\32\16\2\u01ab\61\3\2\2\2\u01ac\u01af\5x=\2\u01ad\u01af\5\4\3"+
		"\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\63\3\2\2\2\u01b0\u01b1"+
		"\7\27\2\2\u01b1\u01bc\7\u00f3\2\2\u01b2\u01b3\7\26\2\2\u01b3\u01bc\7\u00f3"+
		"\2\2\u01b4\u01b6\7,\2\2\u01b5\u01b7\5x=\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bc\7\u00f3\2\2\u01b9\u01ba\7+\2"+
		"\2\u01ba\u01bc\7\u00f3\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb"+
		"\u01b4\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\65\3\2\2\2\u01bd\u01bf\58\35"+
		"\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\67\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\5:\36\2\u01c4"+
		"\u01c6\5\6\4\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c69\3\2\2\2"+
		"\u01c7\u01c8\5\16\b\2\u01c8\u01c9\5\36\20\2\u01c9;\3\2\2\2\u01ca\u01cb"+
		"\7\u0101\2\2\u01cb=\3\2\2\2\u01cc\u01cd\7\u0101\2\2\u01cd?\3\2\2\2\u01ce"+
		"\u01cf\7\u0101\2\2\u01cfA\3\2\2\2\u01d0\u01d1\7\u0101\2\2\u01d1C\3\2\2"+
		"\2\u01d2\u01d3\7\u0101\2\2\u01d3E\3\2\2\2\u01d4\u01d5\7\u00cf\2\2\u01d5"+
		"G\3\2\2\2\u01d6\u01d7\7\u00d2\2\2\u01d7I\3\2\2\2\u01d8\u01d9\7\u00d3\2"+
		"\2\u01d9K\3\2\2\2\u01da\u01db\7\u00d0\2\2\u01dbM\3\2\2\2\u01dc\u01dd\7"+
		"\u00d1\2\2\u01ddO\3\2\2\2\u01de\u01eb\5> \2\u01df\u01eb\5\u0084C\2\u01e0"+
		"\u01eb\5\u0086D\2\u01e1\u01eb\5L\'\2\u01e2\u01eb\5N(\2\u01e3\u01eb\5H"+
		"%\2\u01e4\u01eb\5J&\2\u01e5\u01eb\5F$\2\u01e6\u01e7\7\u00e9\2\2\u01e7"+
		"\u01e8\5x=\2\u01e8\u01e9\7\u00ea\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01de\3"+
		"\2\2\2\u01ea\u01df\3\2\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ea"+
		"\u01e2\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e5\3\2"+
		"\2\2\u01ea\u01e6\3\2\2\2\u01ebQ\3\2\2\2\u01ec\u01ed\b*\1\2\u01ed\u01ee"+
		"\5P)\2\u01ee\u01fc\3\2\2\2\u01ef\u01f0\f\7\2\2\u01f0\u01fb\5T+\2\u01f1"+
		"\u01f2\f\6\2\2\u01f2\u01fb\5\u0080A\2\u01f3\u01f4\f\5\2\2\u01f4\u01f5"+
		"\7\u00ef\2\2\u01f5\u01fb\5<\37\2\u01f6\u01f7\f\4\2\2\u01f7\u01fb\7\u00d6"+
		"\2\2\u01f8\u01f9\f\3\2\2\u01f9\u01fb\7\u00d7\2\2\u01fa\u01ef\3\2\2\2\u01fa"+
		"\u01f1\3\2\2\2\u01fa\u01f3\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"S\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\u00e9\2\2\u0200\u0205\5t;"+
		"\2\u0201\u0202\7\u00f0\2\2\u0202\u0204\5t;\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7\u00ea\2\2\u0209\u0210\3\2\2\2\u020a"+
		"\u020c\7\u00e9\2\2\u020b\u020d\7\'\2\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\7\u00ea\2\2\u020f\u01ff\3\2\2"+
		"\2\u020f\u020a\3\2\2\2\u0210U\3\2\2\2\u0211\u0212\5x=\2\u0212W\3\2\2\2"+
		"\u0213\u0218\5R*\2\u0214\u0215\5Z.\2\u0215\u0216\5X-\2\u0216\u0218\3\2"+
		"\2\2\u0217\u0213\3\2\2\2\u0217\u0214\3\2\2\2\u0218Y\3\2\2\2\u0219\u021a"+
		"\t\2\2\2\u021a[\3\2\2\2\u021b\u021c\b/\1\2\u021c\u021d\5X-\2\u021d\u0229"+
		"\3\2\2\2\u021e\u021f\f\5\2\2\u021f\u0220\7\u00f8\2\2\u0220\u0228\5X-\2"+
		"\u0221\u0222\f\4\2\2\u0222\u0223\7\u00f9\2\2\u0223\u0228\5X-\2\u0224\u0225"+
		"\f\3\2\2\u0225\u0226\7\u00fa\2\2\u0226\u0228\5X-\2\u0227\u021e\3\2\2\2"+
		"\u0227\u0221\3\2\2\2\u0227\u0224\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a]\3\2\2\2\u022b\u0229\3\2\2\2\u022c"+
		"\u022d\b\60\1\2\u022d\u022e\5\\/\2\u022e\u0237\3\2\2\2\u022f\u0230\f\4"+
		"\2\2\u0230\u0231\7\u00f7\2\2\u0231\u0236\5\\/\2\u0232\u0233\f\3\2\2\u0233"+
		"\u0234\7\u00f5\2\2\u0234\u0236\5\\/\2\u0235\u022f\3\2\2\2\u0235\u0232"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"_\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\b\61\1\2\u023b\u023c\5^\60\2"+
		"\u023c\u0245\3\2\2\2\u023d\u023e\f\4\2\2\u023e\u023f\7\u00d4\2\2\u023f"+
		"\u0244\5^\60\2\u0240\u0241\f\3\2\2\u0241\u0242\7\u00d5\2\2\u0242\u0244"+
		"\5^\60\2\u0243\u023d\3\2\2\2\u0243\u0240\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246a\3\2\2\2\u0247\u0245\3\2\2\2"+
		"\u0248\u0249\b\62\1\2\u0249\u024a\5`\61\2\u024a\u0259\3\2\2\2\u024b\u024c"+
		"\f\6\2\2\u024c\u024d\7\u00fb\2\2\u024d\u0258\5`\61\2\u024e\u024f\f\5\2"+
		"\2\u024f\u0250\7\u00fc\2\2\u0250\u0258\5`\61\2\u0251\u0252\f\4\2\2\u0252"+
		"\u0253\7\u00d8\2\2\u0253\u0258\5`\61\2\u0254\u0255\f\3\2\2\u0255\u0256"+
		"\7\u00d9\2\2\u0256\u0258\5`\61\2\u0257\u024b\3\2\2\2\u0257\u024e\3\2\2"+
		"\2\u0257\u0251\3\2\2\2\u0257\u0254\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025ac\3\2\2\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025d\b\63\1\2\u025d\u025e\5b\62\2\u025e\u0267\3\2\2\2\u025f\u0260\f"+
		"\4\2\2\u0260\u0261\7\u00da\2\2\u0261\u0266\5b\62\2\u0262\u0263\f\3\2\2"+
		"\u0263\u0264\7\u00db\2\2\u0264\u0266\5b\62\2\u0265\u025f\3\2\2\2\u0265"+
		"\u0262\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268e\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\b\64\1\2\u026b\u026c"+
		"\5d\63\2\u026c\u0272\3\2\2\2\u026d\u026e\f\3\2\2\u026e\u026f\7\u00ff\2"+
		"\2\u026f\u0271\5d\63\2\u0270\u026d\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273g\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0276\b\65\1\2\u0276\u0277\5f\64\2\u0277\u027d\3\2\2\2\u0278\u0279\f"+
		"\3\2\2\u0279\u027a\7\u00fe\2\2\u027a\u027c\5f\64\2\u027b\u0278\3\2\2\2"+
		"\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027ei\3"+
		"\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\b\66\1\2\u0281\u0282\5h\65\2\u0282"+
		"\u0288\3\2\2\2\u0283\u0284\f\3\2\2\u0284\u0285\7\u00fd\2\2\u0285\u0287"+
		"\5h\65\2\u0286\u0283\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289k\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\b\67\1\2"+
		"\u028c\u028d\5j\66\2\u028d\u0293\3\2\2\2\u028e\u028f\f\3\2\2\u028f\u0290"+
		"\7\u00dc\2\2\u0290\u0292\5j\66\2\u0291\u028e\3\2\2\2\u0292\u0295\3\2\2"+
		"\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294m\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0297\b8\1\2\u0297\u0298\5l\67\2\u0298\u029e\3\2\2\2\u0299"+
		"\u029a\f\3\2\2\u029a\u029b\7\u00de\2\2\u029b\u029d\5l\67\2\u029c\u0299"+
		"\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"o\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\b9\1\2\u02a2\u02a3\5n8\2\u02a3"+
		"\u02a9\3\2\2\2\u02a4\u02a5\f\3\2\2\u02a5\u02a6\7\u00dd\2\2\u02a6\u02a8"+
		"\5n8\2\u02a7\u02a4\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aaq\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02b4\5p9\2\u02ad"+
		"\u02ae\5p9\2\u02ae\u02af\7\u0100\2\2\u02af\u02b0\5x=\2\u02b0\u02b1\7\u00f1"+
		"\2\2\u02b1\u02b2\5t;\2\u02b2\u02b4\3\2\2\2\u02b3\u02ac\3\2\2\2\u02b3\u02ad"+
		"\3\2\2\2\u02b4s\3\2\2\2\u02b5\u02bb\5r:\2\u02b6\u02b7\5X-\2\u02b7\u02b8"+
		"\5v<\2\u02b8\u02b9\5t;\2\u02b9\u02bb\3\2\2\2\u02ba\u02b5\3\2\2\2\u02ba"+
		"\u02b6\3\2\2\2\u02bbu\3\2\2\2\u02bc\u02bd\t\3\2\2\u02bdw\3\2\2\2\u02be"+
		"\u02c3\5t;\2\u02bf\u02c0\7\u00f0\2\2\u02c0\u02c2\5t;\2\u02c1\u02bf\3\2"+
		"\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"y\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\5r:\2\u02c7{\3\2\2\2\u02c8\u02cd"+
		"\5D#\2\u02c9\u02ca\7\u00f0\2\2\u02ca\u02cc\5D#\2\u02cb\u02c9\3\2\2\2\u02cc"+
		"\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce}\3\2\2\2"+
		"\u02cf\u02cd\3\2\2\2\u02d0\u02d4\5\u0082B\2\u02d1\u02d3\5\u0080A\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\177\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9\7\u00eb\2\2\u02d8"+
		"\u02da\5V,\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2"+
		"\2\u02db\u02dc\7\u00ec\2\2\u02dc\u0081\3\2\2\2\u02dd\u02e1\5\u0084C\2"+
		"\u02de\u02e1\5\u0086D\2\u02df\u02e1\5@!\2\u02e0\u02dd\3\2\2\2\u02e0\u02de"+
		"\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u0083\3\2\2\2\u02e2\u02e3\t\4\2\2\u02e3"+
		"\u0085\3\2\2\2\u02e4\u02e5\7\u00a3\2\2\u02e5\u02e6\7\u0101\2\2\u02e6\u02e7"+
		"\5\u0088E\2\u02e7\u0087\3\2\2\2\u02e8\u02ea\7\u00ed\2\2\u02e9\u02eb\5"+
		"\u008aF\2\u02ea\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ea\3\2\2\2"+
		"\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\7\u00ee\2\2\u02ef"+
		"\u0089\3\2\2\2\u02f0\u02f2\5\u0090I\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\5~@\2\u02f4\u02f5\5\u008cG\2"+
		"\u02f5\u02f6\7\u00f3\2\2\u02f6\u008b\3\2\2\2\u02f7\u02fc\5\u008eH\2\u02f8"+
		"\u02f9\7\u00f0\2\2\u02f9\u02fb\5\u008eH\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u008d\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02ff\u0303\7\u0101\2\2\u0300\u0302\5\u0080A\2\u0301\u0300"+
		"\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u008f\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0308\5\u0092J\2\u0307\u0306"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u0091\3\2\2\2\u030b\u0312\5\u00a0Q\2\u030c\u0312\5\u0098M\2\u030d\u0312"+
		"\5\u00a2R\2\u030e\u0312\5\u0096L\2\u030f\u0312\5\u0094K\2\u0310\u0312"+
		"\5\u009eP\2\u0311\u030b\3\2\2\2\u0311\u030c\3\2\2\2\u0311\u030d\3\2\2"+
		"\2\u0311\u030e\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u0093"+
		"\3\2\2\2\u0313\u0314\7)\2\2\u0314\u0095\3\2\2\2\u0315\u0316\t\5\2\2\u0316"+
		"\u0097\3\2\2\2\u0317\u0318\7\17\2\2\u0318\u0319\7\u00e9\2\2\u0319\u031a"+
		"\5\u009aN\2\u031a\u031b\7\u00ea\2\2\u031b\u0099\3\2\2\2\u031c\u0321\5"+
		"\u009cO\2\u031d\u031e\7\u00f0\2\2\u031e\u0320\5\u009cO\2\u031f\u031d\3"+
		"\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u009b\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u032a\7\u0101\2\2\u0325\u0326"+
		"\7\u0101\2\2\u0326\u0327\7\u00f2\2\2\u0327\u032a\5z>\2\u0328\u032a\7\b"+
		"\2\2\u0329\u0324\3\2\2\2\u0329\u0325\3\2\2\2\u0329\u0328\3\2\2\2\u032a"+
		"\u009d\3\2\2\2\u032b\u032c\7*\2\2\u032c\u009f\3\2\2\2\u032d\u0345\7\4"+
		"\2\2\u032e\u0345\7\3\2\2\u032f\u0345\7\6\2\2\u0330\u0345\7#\2\2\u0331"+
		"\u0345\7!\2\2\u0332\u0345\7\"\2\2\u0333\u0345\7\20\2\2\u0334\u0345\7\24"+
		"\2\2\u0335\u0345\7\25\2\2\u0336\u0345\7\5\2\2\u0337\u0345\7\7\2\2\u0338"+
		"\u0345\7\b\2\2\u0339\u0345\7\t\2\2\u033a\u0345\7\n\2\2\u033b\u0345\7\13"+
		"\2\2\u033c\u0345\7\f\2\2\u033d\u0345\7\r\2\2\u033e\u033f\7 \2\2\u033f"+
		"\u0340\7\u00e9\2\2\u0340\u0341\5|?\2\u0341\u0342\7\u00ea\2\2\u0342\u0345"+
		"\3\2\2\2\u0343\u0345\7 \2\2\u0344\u032d\3\2\2\2\u0344\u032e\3\2\2\2\u0344"+
		"\u032f\3\2\2\2\u0344\u0330\3\2\2\2\u0344\u0331\3\2\2\2\u0344\u0332\3\2"+
		"\2\2\u0344\u0333\3\2\2\2\u0344\u0334\3\2\2\2\u0344\u0335\3\2\2\2\u0344"+
		"\u0336\3\2\2\2\u0344\u0337\3\2\2\2\u0344\u0338\3\2\2\2\u0344\u0339\3\2"+
		"\2\2\u0344\u033a\3\2\2\2\u0344\u033b\3\2\2\2\u0344\u033c\3\2\2\2\u0344"+
		"\u033d\3\2\2\2\u0344\u033e\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u00a1\3\2"+
		"\2\2\u0346\u0347\t\6\2\2\u0347\u00a3\3\2\2\2Q\u00b2\u00bd\u00c0\u00c7"+
		"\u00cb\u00d2\u00d6\u00da\u00e1\u00e4\u00e7\u00f5\u0100\u0109\u010d\u0114"+
		"\u0117\u011d\u0122\u0125\u0130\u0134\u0138\u013c\u0146\u014c\u0152\u0164"+
		"\u016e\u0178\u0184\u018c\u019f\u01a3\u01a7\u01ae\u01b6\u01bb\u01c0\u01c5"+
		"\u01ea\u01fa\u01fc\u0205\u020c\u020f\u0217\u0227\u0229\u0235\u0237\u0243"+
		"\u0245\u0257\u0259\u0265\u0267\u0272\u027d\u0288\u0293\u029e\u02a9\u02b3"+
		"\u02ba\u02c3\u02cd\u02d4\u02d9\u02e0\u02ec\u02f1\u02fc\u0303\u0309\u0311"+
		"\u0321\u0329\u0344";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}