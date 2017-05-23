// Generated from grammar/GLSL.g4 by ANTLR 4.7
package org.cakelab.glsl.parser;
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
		INT=36, VOID=37, BOOL=38, TRUE=39, FALSE=40, INVARIANT=41, PRECISE=42, 
		DISCARD=43, RETURN=44, MAT2=45, MAT3=46, MAT4=47, DMAT2=48, DMAT3=49, 
		DMAT4=50, MAT2X2=51, MAT2X3=52, MAT2X4=53, DMAT2X2=54, DMAT2X3=55, DMAT2X4=56, 
		MAT3X2=57, MAT3X3=58, MAT3X4=59, DMAT3X2=60, DMAT3X3=61, DMAT3X4=62, MAT4X2=63, 
		MAT4X3=64, MAT4X4=65, DMAT4X2=66, DMAT4X3=67, DMAT4X4=68, VEC2=69, VEC3=70, 
		VEC4=71, IVEC2=72, IVEC3=73, IVEC4=74, BVEC2=75, BVEC3=76, BVEC4=77, DVEC2=78, 
		DVEC3=79, DVEC4=80, UINT=81, UVEC2=82, UVEC3=83, UVEC4=84, LOW_PRECISION=85, 
		MEDIUM_PRECISION=86, HIGH_PRECISION=87, PRECISION=88, SAMPLER1D=89, SAMPLER2D=90, 
		SAMPLER3D=91, SAMPLERCUBE=92, SAMPLER1DSHADOW=93, SAMPLER2DSHADOW=94, 
		SAMPLERCUBESHADOW=95, SAMPLER1DARRAY=96, SAMPLER2DARRAY=97, SAMPLER1DARRAYSHADOW=98, 
		SAMPLER2DARRAYSHADOW=99, ISAMPLER1D=100, ISAMPLER2D=101, ISAMPLER3D=102, 
		ISAMPLERCUBE=103, ISAMPLER1DARRAY=104, ISAMPLER2DARRAY=105, USAMPLER1D=106, 
		USAMPLER2D=107, USAMPLER3D=108, USAMPLERCUBE=109, USAMPLER1DARRAY=110, 
		USAMPLER2DARRAY=111, SAMPLER2DRECT=112, SAMPLER2DRECTSHADOW=113, ISAMPLER2DRECT=114, 
		USAMPLER2DRECT=115, SAMPLERBUFFER=116, ISAMPLERBUFFER=117, USAMPLERBUFFER=118, 
		SAMPLER2DMS=119, ISAMPLER2DMS=120, USAMPLER2DMS=121, SAMPLER2DMSARRAY=122, 
		ISAMPLER2DMSARRAY=123, USAMPLER2DMSARRAY=124, SAMPLERCUBEARRAY=125, SAMPLERCUBEARRAYSHADOW=126, 
		ISAMPLERCUBEARRAY=127, USAMPLERCUBEARRAY=128, IMAGE1D=129, IIMAGE1D=130, 
		UIMAGE1D=131, IMAGE2D=132, IIMAGE2D=133, UIMAGE2D=134, IMAGE3D=135, IIMAGE3D=136, 
		UIMAGE3D=137, IMAGE2DRECT=138, IIMAGE2DRECT=139, UIMAGE2DRECT=140, IMAGECUBE=141, 
		IIMAGECUBE=142, UIMAGECUBE=143, IMAGEBUFFER=144, IIMAGEBUFFER=145, UIMAGEBUFFER=146, 
		IMAGE1DARRAY=147, IIMAGE1DARRAY=148, UIMAGE1DARRAY=149, IMAGE2DARRAY=150, 
		IIMAGE2DARRAY=151, UIMAGE2DARRAY=152, IMAGECUBEARRAY=153, IIMAGECUBEARRAY=154, 
		UIMAGECUBEARRAY=155, IMAGE2DMS=156, IIMAGE2DMS=157, UIMAGE2DMS=158, IMAGE2DMSARRAY=159, 
		IIMAGE2DMSARRAY=160, UIMAGE2DMSARRAY=161, STRUCT=162, COMMON=163, PARTITION=164, 
		ACTIVE=165, ASM=166, CLASS=167, UNION=168, ENUM=169, TYPEDEF=170, TEMPLATE=171, 
		THIS=172, RESOURCE=173, GOTO=174, INLINE=175, NOINLINE=176, PUBLIC=177, 
		STATIC=178, EXTERN=179, EXTERNAL=180, INTERFACE=181, LONG=182, SHORT=183, 
		HALF=184, FIXED=185, UNSIGNED=186, SUPERP=187, INPUT=188, OUTPUT=189, 
		HVEC2=190, HVEC3=191, HVEC4=192, FVEC2=193, FVEC3=194, FVEC4=195, SAMPLER3DRECT=196, 
		FILTER=197, SIZEOF=198, CAST=199, NAMESPACE=200, USING=201, SAMPLEREXTERNALOES=202, 
		MULTILINE_COMMENT=203, SINGLELINE_COMMENT=204, BOOLCONSTANT=205, IDENTIFIER=206, 
		FLOATCONSTANT=207, DOUBLECONSTANT=208, INTCONSTANT=209, UINTCONSTANT=210, 
		LEFT_OP=211, RIGHT_OP=212, INC_OP=213, DEC_OP=214, LE_OP=215, GE_OP=216, 
		EQ_OP=217, NE_OP=218, AND_OP=219, OR_OP=220, XOR_OP=221, MUL_ASSIGN=222, 
		DIV_ASSIGN=223, ADD_ASSIGN=224, MOD_ASSIGN=225, LEFT_ASSIGN=226, RIGHT_ASSIGN=227, 
		AND_ASSIGN=228, XOR_ASSIGN=229, OR_ASSIGN=230, SUB_ASSIGN=231, LEFT_PAREN=232, 
		RIGHT_PAREN=233, LEFT_BRACKET=234, RIGHT_BRACKET=235, LEFT_BRACE=236, 
		RIGHT_BRACE=237, DOT=238, COMMA=239, COLON=240, EQUAL=241, SEMICOLON=242, 
		BANG=243, DASH=244, TILDE=245, PLUS=246, STAR=247, SLASH=248, PERCENT=249, 
		LEFT_ANGLE=250, RIGHT_ANGLE=251, VERTICAL_BAR=252, CARET=253, AMPERSAND=254, 
		QUESTION=255, WHITESPACE=256;
	public static final int
		RULE_glsl = 0, RULE_glslDeclaration = 1, RULE_glslBlockStructure = 2, 
		RULE_glslIdentifierList = 3, RULE_glslFunctionPrototype = 4, RULE_glslFunctionDeclarator = 5, 
		RULE_glslFunctionHeaderWithParameters = 6, RULE_glslFunctionHeader = 7, 
		RULE_glslParameterDeclarator = 8, RULE_glslParameterDeclaration = 9, RULE_glslParameterTypeSpecifier = 10, 
		RULE_glslInitDeclaratorList = 11, RULE_glslSingleDeclaration = 12, RULE_glslFullySpecifiedType = 13, 
		RULE_glslInitializer = 14, RULE_glslInitializerList = 15, RULE_glslDeclarationStatement = 16, 
		RULE_glslStatement = 17, RULE_glslSimpleStatement = 18, RULE_glslCompoundStatement = 19, 
		RULE_glslStatementNoNewScope = 20, RULE_glslStatementScoped = 21, RULE_glslCompoundStatementNoNewScope = 22, 
		RULE_glslStatementList = 23, RULE_glslExpressionStatement = 24, RULE_glslSelectionStatement = 25, 
		RULE_glslSelectionRestStatement = 26, RULE_glslCondition = 27, RULE_glslSwitchStatement = 28, 
		RULE_glslSwitchStatementList = 29, RULE_glslCaseLabel = 30, RULE_glslIterationStatement = 31, 
		RULE_glslForInitStatement = 32, RULE_glslConditionopt = 33, RULE_glslForRestStatement = 34, 
		RULE_glslJumpStatement = 35, RULE_glslTranslationUnit = 36, RULE_glslExternalDeclaration = 37, 
		RULE_glslFunctionDefinition = 38, RULE_glslFieldSelection = 39, RULE_glslVariableIdentifier = 40, 
		RULE_glslTypeName = 41, RULE_glslPrimaryExpression = 42, RULE_glslIntegerConstant = 43, 
		RULE_glslUnsignedIntegerConstant = 44, RULE_glslFloatConstant = 45, RULE_glslDoubleConstant = 46, 
		RULE_glslPostfixExpression = 47, RULE_glslFunctionCallArguments = 48, 
		RULE_glslConstructorCallArguments = 49, RULE_glslCallArguments = 50, RULE_glslIntegerExpression = 51, 
		RULE_glslUnaryExpression = 52, RULE_glslUnaryOperator = 53, RULE_glslMultiplicativeExpression = 54, 
		RULE_glslAdditiveExpression = 55, RULE_glslShiftExpression = 56, RULE_glslRelationalExpression = 57, 
		RULE_glslEqualityExpression = 58, RULE_glslAndExpression = 59, RULE_glslExclusiveOrExpression = 60, 
		RULE_glslInclusiveOrExpression = 61, RULE_glslLogicalAndExpression = 62, 
		RULE_glslLogicalXorExpression = 63, RULE_glslLogicalOrExpression = 64, 
		RULE_glslConditionalExpression = 65, RULE_glslAssignmentExpression = 66, 
		RULE_glslAssignmentOperator = 67, RULE_glslExpression = 68, RULE_glslConstantExpression = 69, 
		RULE_glslTypeNameList = 70, RULE_glslTypeSpecifier = 71, RULE_glslArraySpecifier = 72, 
		RULE_glslTypeSpecifierNonarray = 73, RULE_glslStructSpecifier = 74, RULE_glslStructDeclarationList = 75, 
		RULE_glslStructDeclaration = 76, RULE_glslStructDeclaratorList = 77, RULE_glslStructDeclarator = 78, 
		RULE_glslInvariantQualifier = 79, RULE_glslInterpolationQualifier = 80, 
		RULE_glslLayoutQualifier = 81, RULE_glslLayoutQualifierIdList = 82, RULE_glslLayoutQualifierId = 83, 
		RULE_glslPreciseQualifier = 84, RULE_glslTypeQualifier = 85, RULE_glslSingleTypeQualifier = 86, 
		RULE_glslStorageQualifier = 87, RULE_glslPrecisionQualifier = 88;
	public static final String[] ruleNames = {
		"glsl", "glslDeclaration", "glslBlockStructure", "glslIdentifierList", 
		"glslFunctionPrototype", "glslFunctionDeclarator", "glslFunctionHeaderWithParameters", 
		"glslFunctionHeader", "glslParameterDeclarator", "glslParameterDeclaration", 
		"glslParameterTypeSpecifier", "glslInitDeclaratorList", "glslSingleDeclaration", 
		"glslFullySpecifiedType", "glslInitializer", "glslInitializerList", "glslDeclarationStatement", 
		"glslStatement", "glslSimpleStatement", "glslCompoundStatement", "glslStatementNoNewScope", 
		"glslStatementScoped", "glslCompoundStatementNoNewScope", "glslStatementList", 
		"glslExpressionStatement", "glslSelectionStatement", "glslSelectionRestStatement", 
		"glslCondition", "glslSwitchStatement", "glslSwitchStatementList", "glslCaseLabel", 
		"glslIterationStatement", "glslForInitStatement", "glslConditionopt", 
		"glslForRestStatement", "glslJumpStatement", "glslTranslationUnit", "glslExternalDeclaration", 
		"glslFunctionDefinition", "glslFieldSelection", "glslVariableIdentifier", 
		"glslTypeName", "glslPrimaryExpression", "glslIntegerConstant", "glslUnsignedIntegerConstant", 
		"glslFloatConstant", "glslDoubleConstant", "glslPostfixExpression", "glslFunctionCallArguments", 
		"glslConstructorCallArguments", "glslCallArguments", "glslIntegerExpression", 
		"glslUnaryExpression", "glslUnaryOperator", "glslMultiplicativeExpression", 
		"glslAdditiveExpression", "glslShiftExpression", "glslRelationalExpression", 
		"glslEqualityExpression", "glslAndExpression", "glslExclusiveOrExpression", 
		"glslInclusiveOrExpression", "glslLogicalAndExpression", "glslLogicalXorExpression", 
		"glslLogicalOrExpression", "glslConditionalExpression", "glslAssignmentExpression", 
		"glslAssignmentOperator", "glslExpression", "glslConstantExpression", 
		"glslTypeNameList", "glslTypeSpecifier", "glslArraySpecifier", "glslTypeSpecifierNonarray", 
		"glslStructSpecifier", "glslStructDeclarationList", "glslStructDeclaration", 
		"glslStructDeclaratorList", "glslStructDeclarator", "glslInvariantQualifier", 
		"glslInterpolationQualifier", "glslLayoutQualifier", "glslLayoutQualifierIdList", 
		"glslLayoutQualifierId", "glslPreciseQualifier", "glslTypeQualifier", 
		"glslSingleTypeQualifier", "glslStorageQualifier", "glslPrecisionQualifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'attribute'", "'const'", "'uniform'", "'varying'", "'buffer'", 
		"'shared'", "'coherent'", "'volatile'", "'restrict'", "'readonly'", "'writeonly'", 
		"'atomic_uint'", "'layout'", "'centroid'", "'flat'", "'smooth'", "'noperspective'", 
		"'patch'", "'sample'", "'break'", "'continue'", "'do'", "'for'", "'while'", 
		"'switch'", "'case'", "'default'", "'if'", "'else'", "'subroutine'", "'in'", 
		"'out'", "'inout'", "'float'", "'double'", "'int'", "'void'", "'bool'", 
		"'true'", "'false'", "'invariant'", "'precise'", "'discard'", "'return'", 
		"'mat2'", "'mat3'", "'mat4'", "'dmat2'", "'dmat3'", "'dmat4'", "'mat2x2'", 
		"'mat2x3'", "'mat2x4'", "'dmat2x2'", "'dmat2x3'", "'dmat2x4'", "'mat3x2'", 
		"'mat3x3'", "'mat3x4'", "'dmat3x2'", "'dmat3x3'", "'dmat3x4'", "'mat4x2'", 
		"'mat4x3'", "'mat4x4'", "'dmat4x2'", "'dmat4x3'", "'dmat4x4'", "'vec2'", 
		"'vec3'", "'vec4'", "'ivec2'", "'ivec3'", "'ivec4'", "'bvec2'", "'bvec3'", 
		"'bvec4'", "'dvec2'", "'dvec3'", "'dvec4'", "'uint'", "'uvec2'", "'uvec3'", 
		"'uvec4'", "'lowp'", "'mediump'", "'highp'", "'precision'", "'sampler1D'", 
		"'sampler2D'", "'sampler3D'", "'samplerCube'", "'sampler1DShadow'", "'sampler2DShadow'", 
		"'samplerCubeShadow'", "'sampler1DArray'", "'sampler2DArray'", "'sampler1DArrayShadow'", 
		"'sampler2DArrayShadow'", "'isampler1D'", "'isampler2D'", "'isampler3D'", 
		"'isamplerCube'", "'isampler1DArray'", "'isampler2DArray'", "'usampler1D'", 
		"'usampler2D'", "'usampler3D'", "'usamplerCube'", "'usampler1DArray'", 
		"'usampler2DArray'", "'sampler2DRect'", "'sampler2DRectShadow'", "'isampler2DRect'", 
		"'usampler2DRect'", "'samplerBuffer'", "'isamplerBuffer'", "'usamplerBuffer'", 
		"'sampler2DMS'", "'isampler2DMS'", "'usampler2DMS'", "'sampler2DMSArray'", 
		"'isampler2DMSArray'", "'usampler2DMSArray'", "'samplerCubeArray'", "'samplerCubeArrayShadow'", 
		"'isamplerCubeArray'", "'usamplerCubeArray'", "'image1D'", "'iimage1D'", 
		"'uimage1D'", "'image2D'", "'iimage2D'", "'uimage2D'", "'image3D'", "'iimage3D'", 
		"'uimage3D'", "'image2DRect'", "'iimage2DRect'", "'uimage2DRect'", "'imageCube'", 
		"'iimageCube'", "'uimageCube'", "'imageBuffer'", "'iimageBuffer'", "'uimageBuffer'", 
		"'image1DArray'", "'iimage1DArray'", "'uimage1DArray'", "'image2DArray'", 
		"'iimage2DArray'", "'uimage2DArray'", "'imageCubeArray'", "'iimageCubeArray'", 
		"'uimageCubeArray'", "'image2DMS'", "'iimage2DMS'", "'uimage2DMS'", "'image2DMSArray'", 
		"'iimage2DMSArray'", "'uimage2DMSArray'", "'struct'", "'common'", "'partition'", 
		"'active'", "'asm'", "'class'", "'union'", "'enum'", "'typedef'", "'template'", 
		"'this'", "'resource'", "'goto'", "'inline'", "'noinline'", "'public'", 
		"'static'", "'extern'", "'external'", "'interface'", "'long'", "'short'", 
		"'half'", "'fixed'", "'unsigned'", "'superp'", "'input'", "'output'", 
		"'hvec2'", "'hvec3'", "'hvec4'", "'fvec2'", "'fvec3'", "'fvec4'", "'sampler3DRect'", 
		"'filter'", "'sizeof'", "'cast'", "'namespace'", "'using'", "'samplerExternalOES'", 
		null, null, null, null, null, null, null, null, "'<<'", "'>>'", "'++'", 
		"'--'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'^^'", "'*='", 
		"'\\='", "'+='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'-='", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", "'='", 
		"';'", "'!'", "'-'", "'~'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'|'", "'^'", "'&'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ATTRIBUTE", "CONST", "UNIFORM", "VARYING", "BUFFER", "SHARED", 
		"COHERENT", "VOLATILE", "RESTRICT", "READONLY", "WRITEONLY", "ATOMIC_UINT", 
		"LAYOUT", "CENTROID", "FLAT", "SMOOTH", "NOPERSPECTIVE", "PATCH", "SAMPLE", 
		"BREAK", "CONTINUE", "DO", "FOR", "WHILE", "SWITCH", "CASE", "DEFAULT", 
		"IF", "ELSE", "SUBROUTINE", "IN", "OUT", "INOUT", "FLOAT", "DOUBLE", "INT", 
		"VOID", "BOOL", "TRUE", "FALSE", "INVARIANT", "PRECISE", "DISCARD", "RETURN", 
		"MAT2", "MAT3", "MAT4", "DMAT2", "DMAT3", "DMAT4", "MAT2X2", "MAT2X3", 
		"MAT2X4", "DMAT2X2", "DMAT2X3", "DMAT2X4", "MAT3X2", "MAT3X3", "MAT3X4", 
		"DMAT3X2", "DMAT3X3", "DMAT3X4", "MAT4X2", "MAT4X3", "MAT4X4", "DMAT4X2", 
		"DMAT4X3", "DMAT4X4", "VEC2", "VEC3", "VEC4", "IVEC2", "IVEC3", "IVEC4", 
		"BVEC2", "BVEC3", "BVEC4", "DVEC2", "DVEC3", "DVEC4", "UINT", "UVEC2", 
		"UVEC3", "UVEC4", "LOW_PRECISION", "MEDIUM_PRECISION", "HIGH_PRECISION", 
		"PRECISION", "SAMPLER1D", "SAMPLER2D", "SAMPLER3D", "SAMPLERCUBE", "SAMPLER1DSHADOW", 
		"SAMPLER2DSHADOW", "SAMPLERCUBESHADOW", "SAMPLER1DARRAY", "SAMPLER2DARRAY", 
		"SAMPLER1DARRAYSHADOW", "SAMPLER2DARRAYSHADOW", "ISAMPLER1D", "ISAMPLER2D", 
		"ISAMPLER3D", "ISAMPLERCUBE", "ISAMPLER1DARRAY", "ISAMPLER2DARRAY", "USAMPLER1D", 
		"USAMPLER2D", "USAMPLER3D", "USAMPLERCUBE", "USAMPLER1DARRAY", "USAMPLER2DARRAY", 
		"SAMPLER2DRECT", "SAMPLER2DRECTSHADOW", "ISAMPLER2DRECT", "USAMPLER2DRECT", 
		"SAMPLERBUFFER", "ISAMPLERBUFFER", "USAMPLERBUFFER", "SAMPLER2DMS", "ISAMPLER2DMS", 
		"USAMPLER2DMS", "SAMPLER2DMSARRAY", "ISAMPLER2DMSARRAY", "USAMPLER2DMSARRAY", 
		"SAMPLERCUBEARRAY", "SAMPLERCUBEARRAYSHADOW", "ISAMPLERCUBEARRAY", "USAMPLERCUBEARRAY", 
		"IMAGE1D", "IIMAGE1D", "UIMAGE1D", "IMAGE2D", "IIMAGE2D", "UIMAGE2D", 
		"IMAGE3D", "IIMAGE3D", "UIMAGE3D", "IMAGE2DRECT", "IIMAGE2DRECT", "UIMAGE2DRECT", 
		"IMAGECUBE", "IIMAGECUBE", "UIMAGECUBE", "IMAGEBUFFER", "IIMAGEBUFFER", 
		"UIMAGEBUFFER", "IMAGE1DARRAY", "IIMAGE1DARRAY", "UIMAGE1DARRAY", "IMAGE2DARRAY", 
		"IIMAGE2DARRAY", "UIMAGE2DARRAY", "IMAGECUBEARRAY", "IIMAGECUBEARRAY", 
		"UIMAGECUBEARRAY", "IMAGE2DMS", "IIMAGE2DMS", "UIMAGE2DMS", "IMAGE2DMSARRAY", 
		"IIMAGE2DMSARRAY", "UIMAGE2DMSARRAY", "STRUCT", "COMMON", "PARTITION", 
		"ACTIVE", "ASM", "CLASS", "UNION", "ENUM", "TYPEDEF", "TEMPLATE", "THIS", 
		"RESOURCE", "GOTO", "INLINE", "NOINLINE", "PUBLIC", "STATIC", "EXTERN", 
		"EXTERNAL", "INTERFACE", "LONG", "SHORT", "HALF", "FIXED", "UNSIGNED", 
		"SUPERP", "INPUT", "OUTPUT", "HVEC2", "HVEC3", "HVEC4", "FVEC2", "FVEC3", 
		"FVEC4", "SAMPLER3DRECT", "FILTER", "SIZEOF", "CAST", "NAMESPACE", "USING", 
		"SAMPLEREXTERNALOES", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", "BOOLCONSTANT", 
		"IDENTIFIER", "FLOATCONSTANT", "DOUBLECONSTANT", "INTCONSTANT", "UINTCONSTANT", 
		"LEFT_OP", "RIGHT_OP", "INC_OP", "DEC_OP", "LE_OP", "GE_OP", "EQ_OP", 
		"NE_OP", "AND_OP", "OR_OP", "XOR_OP", "MUL_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", 
		"MOD_ASSIGN", "LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", 
		"OR_ASSIGN", "SUB_ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "DOT", "COMMA", "COLON", 
		"EQUAL", "SEMICOLON", "BANG", "DASH", "TILDE", "PLUS", "STAR", "SLASH", 
		"PERCENT", "LEFT_ANGLE", "RIGHT_ANGLE", "VERTICAL_BAR", "CARET", "AMPERSAND", 
		"QUESTION", "WHITESPACE"
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
			setState(178);
			glslTranslationUnit();
			}
		}
		catch (RecognitionException re) {
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
		public GlslFunctionPrototypeContext glslFunctionPrototype() {
			return getRuleContext(GlslFunctionPrototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslInitDeclaratorListContext glslInitDeclaratorList() {
			return getRuleContext(GlslInitDeclaratorListContext.class,0);
		}
		public TerminalNode PRECISION() { return getToken(GLSLParser.PRECISION, 0); }
		public GlslPrecisionQualifierContext glslPrecisionQualifier() {
			return getRuleContext(GlslPrecisionQualifierContext.class,0);
		}
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslBlockStructureContext glslBlockStructure() {
			return getRuleContext(GlslBlockStructureContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslIdentifierListContext glslIdentifierList() {
			return getRuleContext(GlslIdentifierListContext.class,0);
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
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				glslFunctionPrototype();
				setState(181);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				glslInitDeclaratorList(0);
				setState(184);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(PRECISION);
				setState(187);
				glslPrecisionQualifier();
				setState(188);
				glslTypeSpecifier();
				setState(189);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				glslBlockStructure();
				setState(192);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				glslBlockStructure();
				setState(195);
				match(IDENTIFIER);
				setState(196);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				glslBlockStructure();
				setState(199);
				match(IDENTIFIER);
				setState(200);
				glslArraySpecifier(0);
				setState(201);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				glslTypeQualifier(0);
				setState(204);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				glslTypeQualifier(0);
				setState(207);
				match(IDENTIFIER);
				setState(208);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				glslTypeQualifier(0);
				setState(211);
				match(IDENTIFIER);
				setState(212);
				glslIdentifierList(0);
				setState(213);
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

	public static class GlslBlockStructureContext extends ParserRuleContext {
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public GlslStructDeclarationListContext glslStructDeclarationList() {
			return getRuleContext(GlslStructDeclarationListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public GlslBlockStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslBlockStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslBlockStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslBlockStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslBlockStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslBlockStructureContext glslBlockStructure() throws RecognitionException {
		GlslBlockStructureContext _localctx = new GlslBlockStructureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_glslBlockStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			glslTypeQualifier(0);
			setState(218);
			match(IDENTIFIER);
			setState(219);
			match(LEFT_BRACE);
			setState(220);
			glslStructDeclarationList(0);
			setState(221);
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

	public static class GlslIdentifierListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslIdentifierListContext glslIdentifierList() {
			return getRuleContext(GlslIdentifierListContext.class,0);
		}
		public GlslIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIdentifierListContext glslIdentifierList() throws RecognitionException {
		return glslIdentifierList(0);
	}

	private GlslIdentifierListContext glslIdentifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslIdentifierListContext _localctx = new GlslIdentifierListContext(_ctx, _parentState);
		GlslIdentifierListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_glslIdentifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			match(COMMA);
			setState(225);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslIdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslIdentifierList);
					setState(227);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(228);
					match(COMMA);
					setState(229);
					match(IDENTIFIER);
					}
					} 
				}
				setState(234);
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

	public static class GlslFunctionPrototypeContext extends ParserRuleContext {
		public GlslFunctionDeclaratorContext glslFunctionDeclarator() {
			return getRuleContext(GlslFunctionDeclaratorContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 8, RULE_glslFunctionPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			glslFunctionDeclarator();
			setState(236);
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

	public static class GlslFunctionDeclaratorContext extends ParserRuleContext {
		public GlslFunctionHeaderContext glslFunctionHeader() {
			return getRuleContext(GlslFunctionHeaderContext.class,0);
		}
		public GlslFunctionHeaderWithParametersContext glslFunctionHeaderWithParameters() {
			return getRuleContext(GlslFunctionHeaderWithParametersContext.class,0);
		}
		public GlslFunctionDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionDeclaratorContext glslFunctionDeclarator() throws RecognitionException {
		GlslFunctionDeclaratorContext _localctx = new GlslFunctionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_glslFunctionDeclarator);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				glslFunctionHeader();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				glslFunctionHeaderWithParameters(0);
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

	public static class GlslFunctionHeaderWithParametersContext extends ParserRuleContext {
		public GlslFunctionHeaderContext glslFunctionHeader() {
			return getRuleContext(GlslFunctionHeaderContext.class,0);
		}
		public GlslParameterDeclarationContext glslParameterDeclaration() {
			return getRuleContext(GlslParameterDeclarationContext.class,0);
		}
		public GlslFunctionHeaderWithParametersContext glslFunctionHeaderWithParameters() {
			return getRuleContext(GlslFunctionHeaderWithParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public GlslFunctionHeaderWithParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionHeaderWithParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionHeaderWithParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionHeaderWithParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionHeaderWithParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionHeaderWithParametersContext glslFunctionHeaderWithParameters() throws RecognitionException {
		return glslFunctionHeaderWithParameters(0);
	}

	private GlslFunctionHeaderWithParametersContext glslFunctionHeaderWithParameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslFunctionHeaderWithParametersContext _localctx = new GlslFunctionHeaderWithParametersContext(_ctx, _parentState);
		GlslFunctionHeaderWithParametersContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_glslFunctionHeaderWithParameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			glslFunctionHeader();
			setState(244);
			glslParameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslFunctionHeaderWithParametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslFunctionHeaderWithParameters);
					setState(246);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(247);
					match(COMMA);
					setState(248);
					glslParameterDeclaration();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class GlslFunctionHeaderContext extends ParserRuleContext {
		public GlslFullySpecifiedTypeContext glslFullySpecifiedType() {
			return getRuleContext(GlslFullySpecifiedTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslFunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionHeaderContext glslFunctionHeader() throws RecognitionException {
		GlslFunctionHeaderContext _localctx = new GlslFunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_glslFunctionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			glslFullySpecifiedType();
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(LEFT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslParameterDeclaratorContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public GlslParameterDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslParameterDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslParameterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslParameterDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslParameterDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslParameterDeclaratorContext glslParameterDeclarator() throws RecognitionException {
		GlslParameterDeclaratorContext _localctx = new GlslParameterDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_glslParameterDeclarator);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				glslTypeSpecifier();
				setState(259);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				glslTypeSpecifier();
				setState(262);
				match(IDENTIFIER);
				setState(263);
				glslArraySpecifier(0);
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

	public static class GlslParameterDeclarationContext extends ParserRuleContext {
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslParameterDeclaratorContext glslParameterDeclarator() {
			return getRuleContext(GlslParameterDeclaratorContext.class,0);
		}
		public GlslParameterTypeSpecifierContext glslParameterTypeSpecifier() {
			return getRuleContext(GlslParameterTypeSpecifierContext.class,0);
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
		enterRule(_localctx, 18, RULE_glslParameterDeclaration);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				glslTypeQualifier(0);
				setState(268);
				glslParameterDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				glslParameterDeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				glslTypeQualifier(0);
				setState(272);
				glslParameterTypeSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				glslParameterTypeSpecifier();
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

	public static class GlslParameterTypeSpecifierContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslParameterTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslParameterTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslParameterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslParameterTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslParameterTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslParameterTypeSpecifierContext glslParameterTypeSpecifier() throws RecognitionException {
		GlslParameterTypeSpecifierContext _localctx = new GlslParameterTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_glslParameterTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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

	public static class GlslInitDeclaratorListContext extends ParserRuleContext {
		public GlslSingleDeclarationContext glslSingleDeclaration() {
			return getRuleContext(GlslSingleDeclarationContext.class,0);
		}
		public GlslInitDeclaratorListContext glslInitDeclaratorList() {
			return getRuleContext(GlslInitDeclaratorListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslInitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInitDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInitDeclaratorListContext glslInitDeclaratorList() throws RecognitionException {
		return glslInitDeclaratorList(0);
	}

	private GlslInitDeclaratorListContext glslInitDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslInitDeclaratorListContext _localctx = new GlslInitDeclaratorListContext(_ctx, _parentState);
		GlslInitDeclaratorListContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_glslInitDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			glslSingleDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(282);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(283);
						match(COMMA);
						setState(284);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(285);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(286);
						match(COMMA);
						setState(287);
						match(IDENTIFIER);
						setState(288);
						glslArraySpecifier(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						match(COMMA);
						setState(291);
						match(IDENTIFIER);
						setState(292);
						glslArraySpecifier(0);
						setState(293);
						match(EQUAL);
						setState(294);
						glslInitializer();
						}
						break;
					case 4:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(296);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(297);
						match(COMMA);
						setState(298);
						match(IDENTIFIER);
						setState(299);
						match(EQUAL);
						setState(300);
						glslInitializer();
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class GlslSingleDeclarationContext extends ParserRuleContext {
		public GlslFullySpecifiedTypeContext glslFullySpecifiedType() {
			return getRuleContext(GlslFullySpecifiedTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslSingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSingleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSingleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSingleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSingleDeclarationContext glslSingleDeclaration() throws RecognitionException {
		GlslSingleDeclarationContext _localctx = new GlslSingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_glslSingleDeclaration);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				glslFullySpecifiedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				glslFullySpecifiedType();
				setState(308);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				glslFullySpecifiedType();
				setState(311);
				match(IDENTIFIER);
				setState(312);
				glslArraySpecifier(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				glslFullySpecifiedType();
				setState(315);
				match(IDENTIFIER);
				setState(316);
				glslArraySpecifier(0);
				setState(317);
				match(EQUAL);
				setState(318);
				glslInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				glslFullySpecifiedType();
				setState(321);
				match(IDENTIFIER);
				setState(322);
				match(EQUAL);
				setState(323);
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
		enterRule(_localctx, 26, RULE_glslFullySpecifiedType);
		try {
			setState(331);
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				glslTypeSpecifier();
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
			case LAYOUT:
			case CENTROID:
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
			case PATCH:
			case SAMPLE:
			case SUBROUTINE:
			case IN:
			case OUT:
			case INOUT:
			case INVARIANT:
			case PRECISE:
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				glslTypeQualifier(0);
				setState(329);
				glslTypeSpecifier();
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

	public static class GlslInitializerContext extends ParserRuleContext {
		public GlslAssignmentExpressionContext glslAssignmentExpression() {
			return getRuleContext(GlslAssignmentExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public GlslInitializerListContext glslInitializerList() {
			return getRuleContext(GlslInitializerListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
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
		enterRule(_localctx, 28, RULE_glslInitializer);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				glslAssignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(LEFT_BRACE);
				setState(335);
				glslInitializerList(0);
				setState(336);
				match(RIGHT_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(LEFT_BRACE);
				setState(339);
				glslInitializerList(0);
				setState(340);
				match(COMMA);
				setState(341);
				match(RIGHT_BRACE);
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

	public static class GlslInitializerListContext extends ParserRuleContext {
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslInitializerListContext glslInitializerList() {
			return getRuleContext(GlslInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public GlslInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInitializerListContext glslInitializerList() throws RecognitionException {
		return glslInitializerList(0);
	}

	private GlslInitializerListContext glslInitializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslInitializerListContext _localctx = new GlslInitializerListContext(_ctx, _parentState);
		GlslInitializerListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_glslInitializerList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(346);
			glslInitializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInitializerList);
					setState(348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(349);
					match(COMMA);
					setState(350);
					glslInitializer();
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class GlslDeclarationStatementContext extends ParserRuleContext {
		public GlslDeclarationContext glslDeclaration() {
			return getRuleContext(GlslDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_glslDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			glslDeclaration();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_glslStatement);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
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
			case CASE:
			case DEFAULT:
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
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
		public GlslSelectionStatementContext glslSelectionStatement() {
			return getRuleContext(GlslSelectionStatementContext.class,0);
		}
		public GlslSwitchStatementContext glslSwitchStatement() {
			return getRuleContext(GlslSwitchStatementContext.class,0);
		}
		public GlslCaseLabelContext glslCaseLabel() {
			return getRuleContext(GlslCaseLabelContext.class,0);
		}
		public GlslIterationStatementContext glslIterationStatement() {
			return getRuleContext(GlslIterationStatementContext.class,0);
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
		enterRule(_localctx, 36, RULE_glslSimpleStatement);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				glslDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				glslExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				glslSelectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				glslCaseLabel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				glslIterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
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
		public GlslStatementListContext glslStatementList() {
			return getRuleContext(GlslStatementListContext.class,0);
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
		enterRule(_localctx, 38, RULE_glslCompoundStatement);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(LEFT_BRACE);
				setState(372);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(LEFT_BRACE);
				setState(374);
				glslStatementList(0);
				setState(375);
				match(RIGHT_BRACE);
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

	public static class GlslStatementNoNewScopeContext extends ParserRuleContext {
		public GlslCompoundStatementNoNewScopeContext glslCompoundStatementNoNewScope() {
			return getRuleContext(GlslCompoundStatementNoNewScopeContext.class,0);
		}
		public GlslSimpleStatementContext glslSimpleStatement() {
			return getRuleContext(GlslSimpleStatementContext.class,0);
		}
		public GlslStatementNoNewScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStatementNoNewScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStatementNoNewScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStatementNoNewScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStatementNoNewScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStatementNoNewScopeContext glslStatementNoNewScope() throws RecognitionException {
		GlslStatementNoNewScopeContext _localctx = new GlslStatementNoNewScopeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_glslStatementNoNewScope);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				glslCompoundStatementNoNewScope();
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
			case CASE:
			case DEFAULT:
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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

	public static class GlslStatementScopedContext extends ParserRuleContext {
		public GlslCompoundStatementContext glslCompoundStatement() {
			return getRuleContext(GlslCompoundStatementContext.class,0);
		}
		public GlslSimpleStatementContext glslSimpleStatement() {
			return getRuleContext(GlslSimpleStatementContext.class,0);
		}
		public GlslStatementScopedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStatementScoped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStatementScoped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStatementScoped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStatementScoped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStatementScopedContext glslStatementScoped() throws RecognitionException {
		GlslStatementScopedContext _localctx = new GlslStatementScopedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_glslStatementScoped);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
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
			case CASE:
			case DEFAULT:
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
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

	public static class GlslCompoundStatementNoNewScopeContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public GlslStatementListContext glslStatementList() {
			return getRuleContext(GlslStatementListContext.class,0);
		}
		public GlslCompoundStatementNoNewScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslCompoundStatementNoNewScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslCompoundStatementNoNewScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslCompoundStatementNoNewScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslCompoundStatementNoNewScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslCompoundStatementNoNewScopeContext glslCompoundStatementNoNewScope() throws RecognitionException {
		GlslCompoundStatementNoNewScopeContext _localctx = new GlslCompoundStatementNoNewScopeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_glslCompoundStatementNoNewScope);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(LEFT_BRACE);
				setState(388);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(LEFT_BRACE);
				setState(390);
				glslStatementList(0);
				setState(391);
				match(RIGHT_BRACE);
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

	public static class GlslStatementListContext extends ParserRuleContext {
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public GlslStatementListContext glslStatementList() {
			return getRuleContext(GlslStatementListContext.class,0);
		}
		public GlslStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStatementListContext glslStatementList() throws RecognitionException {
		return glslStatementList(0);
	}

	private GlslStatementListContext glslStatementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslStatementListContext _localctx = new GlslStatementListContext(_ctx, _parentState);
		GlslStatementListContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_glslStatementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396);
			glslStatement();
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslStatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslStatementList);
					setState(398);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(399);
					glslStatement();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 48, RULE_glslExpressionStatement);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(SEMICOLON);
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				glslExpression(0);
				setState(407);
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

	public static class GlslSelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GLSLParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslSelectionRestStatementContext glslSelectionRestStatement() {
			return getRuleContext(GlslSelectionRestStatementContext.class,0);
		}
		public GlslSelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSelectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSelectionStatementContext glslSelectionStatement() throws RecognitionException {
		GlslSelectionStatementContext _localctx = new GlslSelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_glslSelectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(IF);
			setState(412);
			match(LEFT_PAREN);
			setState(413);
			glslExpression(0);
			setState(414);
			match(RIGHT_PAREN);
			setState(415);
			glslSelectionRestStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslSelectionRestStatementContext extends ParserRuleContext {
		public List<GlslStatementScopedContext> glslStatementScoped() {
			return getRuleContexts(GlslStatementScopedContext.class);
		}
		public GlslStatementScopedContext glslStatementScoped(int i) {
			return getRuleContext(GlslStatementScopedContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GLSLParser.ELSE, 0); }
		public GlslSelectionRestStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSelectionRestStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSelectionRestStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSelectionRestStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSelectionRestStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSelectionRestStatementContext glslSelectionRestStatement() throws RecognitionException {
		GlslSelectionRestStatementContext _localctx = new GlslSelectionRestStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_glslSelectionRestStatement);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				glslStatementScoped();
				setState(418);
				match(ELSE);
				setState(419);
				glslStatementScoped();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				glslStatementScoped();
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

	public static class GlslConditionContext extends ParserRuleContext {
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslFullySpecifiedTypeContext glslFullySpecifiedType() {
			return getRuleContext(GlslFullySpecifiedTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 54, RULE_glslCondition);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				glslExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				glslFullySpecifiedType();
				setState(426);
				match(IDENTIFIER);
				setState(427);
				match(EQUAL);
				setState(428);
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

	public static class GlslSwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GLSLParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public GlslSwitchStatementListContext glslSwitchStatementList() {
			return getRuleContext(GlslSwitchStatementListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
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
		enterRule(_localctx, 56, RULE_glslSwitchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(SWITCH);
			setState(433);
			match(LEFT_PAREN);
			setState(434);
			glslExpression(0);
			setState(435);
			match(RIGHT_PAREN);
			setState(436);
			match(LEFT_BRACE);
			setState(437);
			glslSwitchStatementList();
			setState(438);
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

	public static class GlslSwitchStatementListContext extends ParserRuleContext {
		public GlslStatementListContext glslStatementList() {
			return getRuleContext(GlslStatementListContext.class,0);
		}
		public GlslSwitchStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslSwitchStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslSwitchStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslSwitchStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslSwitchStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSwitchStatementListContext glslSwitchStatementList() throws RecognitionException {
		GlslSwitchStatementListContext _localctx = new GlslSwitchStatementListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_glslSwitchStatementList);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
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
			case CASE:
			case DEFAULT:
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				glslStatementList(0);
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

	public static class GlslCaseLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GLSLParser.CASE, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(GLSLParser.DEFAULT, 0); }
		public GlslCaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslCaseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslCaseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslCaseLabelContext glslCaseLabel() throws RecognitionException {
		GlslCaseLabelContext _localctx = new GlslCaseLabelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_glslCaseLabel);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(CASE);
				setState(445);
				glslExpression(0);
				setState(446);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(DEFAULT);
				setState(449);
				match(COLON);
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

	public static class GlslIterationStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GLSLParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslConditionContext glslCondition() {
			return getRuleContext(GlslConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslStatementNoNewScopeContext glslStatementNoNewScope() {
			return getRuleContext(GlslStatementNoNewScopeContext.class,0);
		}
		public TerminalNode DO() { return getToken(GLSLParser.DO, 0); }
		public GlslStatementContext glslStatement() {
			return getRuleContext(GlslStatementContext.class,0);
		}
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode FOR() { return getToken(GLSLParser.FOR, 0); }
		public GlslForInitStatementContext glslForInitStatement() {
			return getRuleContext(GlslForInitStatementContext.class,0);
		}
		public GlslForRestStatementContext glslForRestStatement() {
			return getRuleContext(GlslForRestStatementContext.class,0);
		}
		public GlslIterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIterationStatementContext glslIterationStatement() throws RecognitionException {
		GlslIterationStatementContext _localctx = new GlslIterationStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_glslIterationStatement);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(WHILE);
				setState(453);
				match(LEFT_PAREN);
				setState(454);
				glslCondition();
				setState(455);
				match(RIGHT_PAREN);
				setState(456);
				glslStatementNoNewScope();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(DO);
				setState(459);
				glslStatement();
				setState(460);
				match(WHILE);
				setState(461);
				match(LEFT_PAREN);
				setState(462);
				glslExpression(0);
				setState(463);
				match(RIGHT_PAREN);
				setState(464);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(FOR);
				setState(467);
				match(LEFT_PAREN);
				setState(468);
				glslForInitStatement();
				setState(469);
				glslForRestStatement();
				setState(470);
				match(RIGHT_PAREN);
				setState(471);
				glslStatementNoNewScope();
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

	public static class GlslForInitStatementContext extends ParserRuleContext {
		public GlslExpressionStatementContext glslExpressionStatement() {
			return getRuleContext(GlslExpressionStatementContext.class,0);
		}
		public GlslDeclarationStatementContext glslDeclarationStatement() {
			return getRuleContext(GlslDeclarationStatementContext.class,0);
		}
		public GlslForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslForInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslForInitStatementContext glslForInitStatement() throws RecognitionException {
		GlslForInitStatementContext _localctx = new GlslForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_glslForInitStatement);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				glslExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
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

	public static class GlslConditionoptContext extends ParserRuleContext {
		public GlslConditionContext glslCondition() {
			return getRuleContext(GlslConditionContext.class,0);
		}
		public GlslConditionoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslConditionopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslConditionopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslConditionopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslConditionopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConditionoptContext glslConditionopt() throws RecognitionException {
		GlslConditionoptContext _localctx = new GlslConditionoptContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_glslConditionopt);
		try {
			setState(481);
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
			case ATOMIC_UINT:
			case LAYOUT:
			case CENTROID:
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
			case PATCH:
			case SAMPLE:
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				glslCondition();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
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

	public static class GlslForRestStatementContext extends ParserRuleContext {
		public GlslConditionoptContext glslConditionopt() {
			return getRuleContext(GlslConditionoptContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public GlslForRestStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslForRestStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslForRestStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslForRestStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslForRestStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslForRestStatementContext glslForRestStatement() throws RecognitionException {
		GlslForRestStatementContext _localctx = new GlslForRestStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_glslForRestStatement);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				glslConditionopt();
				setState(484);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				glslConditionopt();
				setState(487);
				match(SEMICOLON);
				setState(488);
				glslExpression(0);
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
		enterRule(_localctx, 70, RULE_glslJumpStatement);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(CONTINUE);
				setState(493);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(BREAK);
				setState(495);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(RETURN);
				setState(497);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				match(RETURN);
				setState(499);
				glslExpression(0);
				setState(500);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(DISCARD);
				setState(503);
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

	public static class GlslTranslationUnitContext extends ParserRuleContext {
		public List<GlslExternalDeclarationContext> glslExternalDeclaration() {
			return getRuleContexts(GlslExternalDeclarationContext.class);
		}
		public GlslExternalDeclarationContext glslExternalDeclaration(int i) {
			return getRuleContext(GlslExternalDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(GLSLParser.EOF, 0); }
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
		enterRule(_localctx, 72, RULE_glslTranslationUnit);
		int _la;
		try {
			setState(512);
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
			case ATOMIC_UINT:
			case LAYOUT:
			case CENTROID:
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
			case PATCH:
			case SAMPLE:
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(506);
					glslExternalDeclaration();
					}
					}
					setState(509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==SAMPLEREXTERNALOES || _la==IDENTIFIER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(EOF);
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

	public static class GlslExternalDeclarationContext extends ParserRuleContext {
		public GlslFunctionDefinitionContext glslFunctionDefinition() {
			return getRuleContext(GlslFunctionDefinitionContext.class,0);
		}
		public GlslDeclarationContext glslDeclaration() {
			return getRuleContext(GlslDeclarationContext.class,0);
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
		enterRule(_localctx, 74, RULE_glslExternalDeclaration);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				glslFunctionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
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

	public static class GlslFunctionDefinitionContext extends ParserRuleContext {
		public GlslFunctionPrototypeContext glslFunctionPrototype() {
			return getRuleContext(GlslFunctionPrototypeContext.class,0);
		}
		public GlslCompoundStatementNoNewScopeContext glslCompoundStatementNoNewScope() {
			return getRuleContext(GlslCompoundStatementNoNewScopeContext.class,0);
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
		enterRule(_localctx, 76, RULE_glslFunctionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			glslFunctionPrototype();
			setState(519);
			glslCompoundStatementNoNewScope();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_glslFieldSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 80, RULE_glslVariableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 82, RULE_glslTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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

	public static class GlslPrimaryExpressionContext extends ParserRuleContext {
		public GlslVariableIdentifierContext glslVariableIdentifier() {
			return getRuleContext(GlslVariableIdentifierContext.class,0);
		}
		public GlslIntegerConstantContext glslIntegerConstant() {
			return getRuleContext(GlslIntegerConstantContext.class,0);
		}
		public GlslUnsignedIntegerConstantContext glslUnsignedIntegerConstant() {
			return getRuleContext(GlslUnsignedIntegerConstantContext.class,0);
		}
		public GlslFloatConstantContext glslFloatConstant() {
			return getRuleContext(GlslFloatConstantContext.class,0);
		}
		public GlslDoubleConstantContext glslDoubleConstant() {
			return getRuleContext(GlslDoubleConstantContext.class,0);
		}
		public TerminalNode BOOLCONSTANT() { return getToken(GLSLParser.BOOLCONSTANT, 0); }
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
		enterRule(_localctx, 84, RULE_glslPrimaryExpression);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				glslVariableIdentifier();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				glslUnsignedIntegerConstant();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				glslDoubleConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				match(BOOLCONSTANT);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				match(LEFT_PAREN);
				setState(534);
				glslExpression(0);
				setState(535);
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
		enterRule(_localctx, 86, RULE_glslIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		enterRule(_localctx, 88, RULE_glslUnsignedIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		enterRule(_localctx, 90, RULE_glslFloatConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 92, RULE_glslDoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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

	public static class GlslPostfixExpressionContext extends ParserRuleContext {
		public GlslPrimaryExpressionContext glslPrimaryExpression() {
			return getRuleContext(GlslPrimaryExpressionContext.class,0);
		}
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslConstructorCallArgumentsContext glslConstructorCallArguments() {
			return getRuleContext(GlslConstructorCallArgumentsContext.class,0);
		}
		public GlslPostfixExpressionContext glslPostfixExpression() {
			return getRuleContext(GlslPostfixExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public GlslIntegerExpressionContext glslIntegerExpression() {
			return getRuleContext(GlslIntegerExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public GlslFunctionCallArgumentsContext glslFunctionCallArguments() {
			return getRuleContext(GlslFunctionCallArgumentsContext.class,0);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_glslPostfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(548);
				glslPrimaryExpression();
				}
				break;
			case 2:
				{
				setState(549);
				glslTypeSpecifier();
				setState(550);
				glslConstructorCallArguments();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(568);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(554);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(555);
						match(LEFT_BRACKET);
						setState(556);
						glslIntegerExpression();
						setState(557);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(559);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(560);
						glslFunctionCallArguments();
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(561);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(562);
						match(DOT);
						setState(563);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(564);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(565);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(566);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(567);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(572);
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

	public static class GlslFunctionCallArgumentsContext extends ParserRuleContext {
		public GlslCallArgumentsContext glslCallArguments() {
			return getRuleContext(GlslCallArgumentsContext.class,0);
		}
		public GlslFunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionCallArgumentsContext glslFunctionCallArguments() throws RecognitionException {
		GlslFunctionCallArgumentsContext _localctx = new GlslFunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_glslFunctionCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			glslCallArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslConstructorCallArgumentsContext extends ParserRuleContext {
		public GlslCallArgumentsContext glslCallArguments() {
			return getRuleContext(GlslCallArgumentsContext.class,0);
		}
		public GlslConstructorCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslConstructorCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslConstructorCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslConstructorCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslConstructorCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConstructorCallArgumentsContext glslConstructorCallArguments() throws RecognitionException {
		GlslConstructorCallArgumentsContext _localctx = new GlslConstructorCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_glslConstructorCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			glslCallArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
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
		enterRule(_localctx, 100, RULE_glslCallArguments);
		int _la;
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(LEFT_PAREN);
				setState(578);
				glslAssignmentExpression();
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(579);
					match(COMMA);
					setState(580);
					glslAssignmentExpression();
					}
					}
					setState(583); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(585);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(LEFT_PAREN);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(588);
					match(VOID);
					}
				}

				setState(591);
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
		enterRule(_localctx, 102, RULE_glslIntegerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			glslExpression(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public GlslUnaryExpressionContext glslUnaryExpression() {
			return getRuleContext(GlslUnaryExpressionContext.class,0);
		}
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public GlslUnaryOperatorContext glslUnaryOperator() {
			return getRuleContext(GlslUnaryOperatorContext.class,0);
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
		enterRule(_localctx, 104, RULE_glslUnaryExpression);
		try {
			setState(604);
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case BOOLCONSTANT:
			case IDENTIFIER:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				glslPostfixExpression(0);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(INC_OP);
				setState(598);
				glslUnaryExpression();
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(DEC_OP);
				setState(600);
				glslUnaryExpression();
				}
				break;
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				glslUnaryOperator();
				setState(602);
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
		enterRule(_localctx, 106, RULE_glslUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (BANG - 243)) | (1L << (DASH - 243)) | (1L << (TILDE - 243)) | (1L << (PLUS - 243)))) != 0)) ) {
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_glslMultiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(609);
			glslUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(620);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(611);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(612);
						match(STAR);
						setState(613);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(614);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(615);
						match(SLASH);
						setState(616);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(617);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(618);
						match(PERCENT);
						setState(619);
						glslUnaryExpression();
						}
						break;
					}
					} 
				}
				setState(624);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_glslAdditiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(626);
			glslMultiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(634);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(628);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(629);
						match(PLUS);
						setState(630);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(631);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(632);
						match(DASH);
						setState(633);
						glslMultiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_glslShiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(640);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(642);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(643);
						match(LEFT_OP);
						setState(644);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(645);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(646);
						match(RIGHT_OP);
						setState(647);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_glslRelationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(654);
			glslShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(656);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(657);
						match(LEFT_ANGLE);
						setState(658);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(659);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(660);
						match(RIGHT_ANGLE);
						setState(661);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(662);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(663);
						match(LE_OP);
						setState(664);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(665);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(666);
						match(GE_OP);
						setState(667);
						glslShiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_glslEqualityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(674);
			glslRelationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(676);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(677);
						match(EQ_OP);
						setState(678);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(679);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(680);
						match(NE_OP);
						setState(681);
						glslRelationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_glslAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(688);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(690);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(691);
					match(AMPERSAND);
					setState(692);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(697);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_glslExclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(701);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(702);
					match(CARET);
					setState(703);
					glslAndExpression(0);
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_glslInclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(710);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(712);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(713);
					match(VERTICAL_BAR);
					setState(714);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(719);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_glslLogicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(721);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(723);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(724);
					match(AND_OP);
					setState(725);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_glslLogicalXorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(732);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(734);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(735);
					match(XOR_OP);
					setState(736);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(741);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_glslLogicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(743);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(745);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(746);
					match(OR_OP);
					setState(747);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(752);
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
		enterRule(_localctx, 130, RULE_glslConditionalExpression);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				glslLogicalOrExpression(0);
				setState(755);
				match(QUESTION);
				setState(756);
				glslExpression(0);
				setState(757);
				match(COLON);
				setState(758);
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
		enterRule(_localctx, 132, RULE_glslAssignmentExpression);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				glslUnaryExpression();
				setState(764);
				glslAssignmentOperator();
				setState(765);
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
		enterRule(_localctx, 134, RULE_glslAssignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (MUL_ASSIGN - 222)) | (1L << (DIV_ASSIGN - 222)) | (1L << (ADD_ASSIGN - 222)) | (1L << (MOD_ASSIGN - 222)) | (1L << (LEFT_ASSIGN - 222)) | (1L << (RIGHT_ASSIGN - 222)) | (1L << (AND_ASSIGN - 222)) | (1L << (XOR_ASSIGN - 222)) | (1L << (OR_ASSIGN - 222)) | (1L << (SUB_ASSIGN - 222)) | (1L << (EQUAL - 222)))) != 0)) ) {
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
		public GlslAssignmentExpressionContext glslAssignmentExpression() {
			return getRuleContext(GlslAssignmentExpressionContext.class,0);
		}
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
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
		return glslExpression(0);
	}

	private GlslExpressionContext glslExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslExpressionContext _localctx = new GlslExpressionContext(_ctx, _parentState);
		GlslExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_glslExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(772);
			glslAssignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExpression);
					setState(774);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(775);
					match(COMMA);
					setState(776);
					glslAssignmentExpression();
					}
					} 
				}
				setState(781);
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
		enterRule(_localctx, 138, RULE_glslConstantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
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

	public static class GlslTypeNameListContext extends ParserRuleContext {
		public GlslTypeNameContext glslTypeName() {
			return getRuleContext(GlslTypeNameContext.class,0);
		}
		public GlslTypeNameListContext glslTypeNameList() {
			return getRuleContext(GlslTypeNameListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public GlslTypeNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslTypeNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslTypeNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslTypeNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeNameListContext glslTypeNameList() throws RecognitionException {
		return glslTypeNameList(0);
	}

	private GlslTypeNameListContext glslTypeNameList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslTypeNameListContext _localctx = new GlslTypeNameListContext(_ctx, _parentState);
		GlslTypeNameListContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_glslTypeNameList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(785);
			glslTypeName();
			}
			_ctx.stop = _input.LT(-1);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslTypeNameListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslTypeNameList);
					setState(787);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(788);
					match(COMMA);
					setState(789);
					glslTypeName();
					}
					} 
				}
				setState(794);
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

	public static class GlslTypeSpecifierContext extends ParserRuleContext {
		public GlslTypeSpecifierNonarrayContext glslTypeSpecifierNonarray() {
			return getRuleContext(GlslTypeSpecifierNonarrayContext.class,0);
		}
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
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
		enterRule(_localctx, 142, RULE_glslTypeSpecifier);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				glslTypeSpecifierNonarray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				glslTypeSpecifierNonarray();
				setState(797);
				glslArraySpecifier(0);
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

	public static class GlslArraySpecifierContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public GlslArraySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslArraySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslArraySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslArraySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslArraySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslArraySpecifierContext glslArraySpecifier() throws RecognitionException {
		return glslArraySpecifier(0);
	}

	private GlslArraySpecifierContext glslArraySpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslArraySpecifierContext _localctx = new GlslArraySpecifierContext(_ctx, _parentState);
		GlslArraySpecifierContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_glslArraySpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(802);
				match(LEFT_BRACKET);
				setState(803);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				{
				setState(804);
				match(LEFT_BRACKET);
				setState(805);
				glslConstantExpression();
				setState(806);
				match(RIGHT_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new GlslArraySpecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslArraySpecifier);
						setState(810);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(811);
						match(LEFT_BRACKET);
						setState(812);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new GlslArraySpecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslArraySpecifier);
						setState(813);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(814);
						match(LEFT_BRACKET);
						setState(815);
						glslConstantExpression();
						setState(816);
						match(RIGHT_BRACKET);
						}
						break;
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class GlslTypeSpecifierNonarrayContext extends ParserRuleContext {
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
		enterRule(_localctx, 146, RULE_glslTypeSpecifierNonarray);
		try {
			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(VOID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(DOUBLE);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				match(INT);
				}
				break;
			case UINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				match(UINT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(828);
				match(BOOL);
				}
				break;
			case VEC2:
				enterOuterAlt(_localctx, 7);
				{
				setState(829);
				match(VEC2);
				}
				break;
			case VEC3:
				enterOuterAlt(_localctx, 8);
				{
				setState(830);
				match(VEC3);
				}
				break;
			case VEC4:
				enterOuterAlt(_localctx, 9);
				{
				setState(831);
				match(VEC4);
				}
				break;
			case DVEC2:
				enterOuterAlt(_localctx, 10);
				{
				setState(832);
				match(DVEC2);
				}
				break;
			case DVEC3:
				enterOuterAlt(_localctx, 11);
				{
				setState(833);
				match(DVEC3);
				}
				break;
			case DVEC4:
				enterOuterAlt(_localctx, 12);
				{
				setState(834);
				match(DVEC4);
				}
				break;
			case BVEC2:
				enterOuterAlt(_localctx, 13);
				{
				setState(835);
				match(BVEC2);
				}
				break;
			case BVEC3:
				enterOuterAlt(_localctx, 14);
				{
				setState(836);
				match(BVEC3);
				}
				break;
			case BVEC4:
				enterOuterAlt(_localctx, 15);
				{
				setState(837);
				match(BVEC4);
				}
				break;
			case IVEC2:
				enterOuterAlt(_localctx, 16);
				{
				setState(838);
				match(IVEC2);
				}
				break;
			case IVEC3:
				enterOuterAlt(_localctx, 17);
				{
				setState(839);
				match(IVEC3);
				}
				break;
			case IVEC4:
				enterOuterAlt(_localctx, 18);
				{
				setState(840);
				match(IVEC4);
				}
				break;
			case UVEC2:
				enterOuterAlt(_localctx, 19);
				{
				setState(841);
				match(UVEC2);
				}
				break;
			case UVEC3:
				enterOuterAlt(_localctx, 20);
				{
				setState(842);
				match(UVEC3);
				}
				break;
			case UVEC4:
				enterOuterAlt(_localctx, 21);
				{
				setState(843);
				match(UVEC4);
				}
				break;
			case MAT2:
				enterOuterAlt(_localctx, 22);
				{
				setState(844);
				match(MAT2);
				}
				break;
			case MAT3:
				enterOuterAlt(_localctx, 23);
				{
				setState(845);
				match(MAT3);
				}
				break;
			case MAT4:
				enterOuterAlt(_localctx, 24);
				{
				setState(846);
				match(MAT4);
				}
				break;
			case MAT2X2:
				enterOuterAlt(_localctx, 25);
				{
				setState(847);
				match(MAT2X2);
				}
				break;
			case MAT2X3:
				enterOuterAlt(_localctx, 26);
				{
				setState(848);
				match(MAT2X3);
				}
				break;
			case MAT2X4:
				enterOuterAlt(_localctx, 27);
				{
				setState(849);
				match(MAT2X4);
				}
				break;
			case MAT3X2:
				enterOuterAlt(_localctx, 28);
				{
				setState(850);
				match(MAT3X2);
				}
				break;
			case MAT3X3:
				enterOuterAlt(_localctx, 29);
				{
				setState(851);
				match(MAT3X3);
				}
				break;
			case MAT3X4:
				enterOuterAlt(_localctx, 30);
				{
				setState(852);
				match(MAT3X4);
				}
				break;
			case MAT4X2:
				enterOuterAlt(_localctx, 31);
				{
				setState(853);
				match(MAT4X2);
				}
				break;
			case MAT4X3:
				enterOuterAlt(_localctx, 32);
				{
				setState(854);
				match(MAT4X3);
				}
				break;
			case MAT4X4:
				enterOuterAlt(_localctx, 33);
				{
				setState(855);
				match(MAT4X4);
				}
				break;
			case DMAT2:
				enterOuterAlt(_localctx, 34);
				{
				setState(856);
				match(DMAT2);
				}
				break;
			case DMAT3:
				enterOuterAlt(_localctx, 35);
				{
				setState(857);
				match(DMAT3);
				}
				break;
			case DMAT4:
				enterOuterAlt(_localctx, 36);
				{
				setState(858);
				match(DMAT4);
				}
				break;
			case DMAT2X2:
				enterOuterAlt(_localctx, 37);
				{
				setState(859);
				match(DMAT2X2);
				}
				break;
			case DMAT2X3:
				enterOuterAlt(_localctx, 38);
				{
				setState(860);
				match(DMAT2X3);
				}
				break;
			case DMAT2X4:
				enterOuterAlt(_localctx, 39);
				{
				setState(861);
				match(DMAT2X4);
				}
				break;
			case DMAT3X2:
				enterOuterAlt(_localctx, 40);
				{
				setState(862);
				match(DMAT3X2);
				}
				break;
			case DMAT3X3:
				enterOuterAlt(_localctx, 41);
				{
				setState(863);
				match(DMAT3X3);
				}
				break;
			case DMAT3X4:
				enterOuterAlt(_localctx, 42);
				{
				setState(864);
				match(DMAT3X4);
				}
				break;
			case DMAT4X2:
				enterOuterAlt(_localctx, 43);
				{
				setState(865);
				match(DMAT4X2);
				}
				break;
			case DMAT4X3:
				enterOuterAlt(_localctx, 44);
				{
				setState(866);
				match(DMAT4X3);
				}
				break;
			case DMAT4X4:
				enterOuterAlt(_localctx, 45);
				{
				setState(867);
				match(DMAT4X4);
				}
				break;
			case ATOMIC_UINT:
				enterOuterAlt(_localctx, 46);
				{
				setState(868);
				match(ATOMIC_UINT);
				}
				break;
			case SAMPLER1D:
				enterOuterAlt(_localctx, 47);
				{
				setState(869);
				match(SAMPLER1D);
				}
				break;
			case SAMPLER2D:
				enterOuterAlt(_localctx, 48);
				{
				setState(870);
				match(SAMPLER2D);
				}
				break;
			case SAMPLER3D:
				enterOuterAlt(_localctx, 49);
				{
				setState(871);
				match(SAMPLER3D);
				}
				break;
			case SAMPLERCUBE:
				enterOuterAlt(_localctx, 50);
				{
				setState(872);
				match(SAMPLERCUBE);
				}
				break;
			case SAMPLER1DSHADOW:
				enterOuterAlt(_localctx, 51);
				{
				setState(873);
				match(SAMPLER1DSHADOW);
				}
				break;
			case SAMPLER2DSHADOW:
				enterOuterAlt(_localctx, 52);
				{
				setState(874);
				match(SAMPLER2DSHADOW);
				}
				break;
			case SAMPLERCUBESHADOW:
				enterOuterAlt(_localctx, 53);
				{
				setState(875);
				match(SAMPLERCUBESHADOW);
				}
				break;
			case SAMPLER1DARRAY:
				enterOuterAlt(_localctx, 54);
				{
				setState(876);
				match(SAMPLER1DARRAY);
				}
				break;
			case SAMPLER2DARRAY:
				enterOuterAlt(_localctx, 55);
				{
				setState(877);
				match(SAMPLER2DARRAY);
				}
				break;
			case SAMPLER1DARRAYSHADOW:
				enterOuterAlt(_localctx, 56);
				{
				setState(878);
				match(SAMPLER1DARRAYSHADOW);
				}
				break;
			case SAMPLER2DARRAYSHADOW:
				enterOuterAlt(_localctx, 57);
				{
				setState(879);
				match(SAMPLER2DARRAYSHADOW);
				}
				break;
			case SAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 58);
				{
				setState(880);
				match(SAMPLERCUBEARRAY);
				}
				break;
			case SAMPLERCUBEARRAYSHADOW:
				enterOuterAlt(_localctx, 59);
				{
				setState(881);
				match(SAMPLERCUBEARRAYSHADOW);
				}
				break;
			case ISAMPLER1D:
				enterOuterAlt(_localctx, 60);
				{
				setState(882);
				match(ISAMPLER1D);
				}
				break;
			case ISAMPLER2D:
				enterOuterAlt(_localctx, 61);
				{
				setState(883);
				match(ISAMPLER2D);
				}
				break;
			case ISAMPLER3D:
				enterOuterAlt(_localctx, 62);
				{
				setState(884);
				match(ISAMPLER3D);
				}
				break;
			case ISAMPLERCUBE:
				enterOuterAlt(_localctx, 63);
				{
				setState(885);
				match(ISAMPLERCUBE);
				}
				break;
			case ISAMPLER1DARRAY:
				enterOuterAlt(_localctx, 64);
				{
				setState(886);
				match(ISAMPLER1DARRAY);
				}
				break;
			case ISAMPLER2DARRAY:
				enterOuterAlt(_localctx, 65);
				{
				setState(887);
				match(ISAMPLER2DARRAY);
				}
				break;
			case ISAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 66);
				{
				setState(888);
				match(ISAMPLERCUBEARRAY);
				}
				break;
			case USAMPLER1D:
				enterOuterAlt(_localctx, 67);
				{
				setState(889);
				match(USAMPLER1D);
				}
				break;
			case USAMPLER2D:
				enterOuterAlt(_localctx, 68);
				{
				setState(890);
				match(USAMPLER2D);
				}
				break;
			case USAMPLER3D:
				enterOuterAlt(_localctx, 69);
				{
				setState(891);
				match(USAMPLER3D);
				}
				break;
			case USAMPLERCUBE:
				enterOuterAlt(_localctx, 70);
				{
				setState(892);
				match(USAMPLERCUBE);
				}
				break;
			case USAMPLER1DARRAY:
				enterOuterAlt(_localctx, 71);
				{
				setState(893);
				match(USAMPLER1DARRAY);
				}
				break;
			case USAMPLER2DARRAY:
				enterOuterAlt(_localctx, 72);
				{
				setState(894);
				match(USAMPLER2DARRAY);
				}
				break;
			case USAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 73);
				{
				setState(895);
				match(USAMPLERCUBEARRAY);
				}
				break;
			case SAMPLER2DRECT:
				enterOuterAlt(_localctx, 74);
				{
				setState(896);
				match(SAMPLER2DRECT);
				}
				break;
			case SAMPLER2DRECTSHADOW:
				enterOuterAlt(_localctx, 75);
				{
				setState(897);
				match(SAMPLER2DRECTSHADOW);
				}
				break;
			case ISAMPLER2DRECT:
				enterOuterAlt(_localctx, 76);
				{
				setState(898);
				match(ISAMPLER2DRECT);
				}
				break;
			case USAMPLER2DRECT:
				enterOuterAlt(_localctx, 77);
				{
				setState(899);
				match(USAMPLER2DRECT);
				}
				break;
			case SAMPLERBUFFER:
				enterOuterAlt(_localctx, 78);
				{
				setState(900);
				match(SAMPLERBUFFER);
				}
				break;
			case ISAMPLERBUFFER:
				enterOuterAlt(_localctx, 79);
				{
				setState(901);
				match(ISAMPLERBUFFER);
				}
				break;
			case USAMPLERBUFFER:
				enterOuterAlt(_localctx, 80);
				{
				setState(902);
				match(USAMPLERBUFFER);
				}
				break;
			case SAMPLER2DMS:
				enterOuterAlt(_localctx, 81);
				{
				setState(903);
				match(SAMPLER2DMS);
				}
				break;
			case ISAMPLER2DMS:
				enterOuterAlt(_localctx, 82);
				{
				setState(904);
				match(ISAMPLER2DMS);
				}
				break;
			case USAMPLER2DMS:
				enterOuterAlt(_localctx, 83);
				{
				setState(905);
				match(USAMPLER2DMS);
				}
				break;
			case SAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 84);
				{
				setState(906);
				match(SAMPLER2DMSARRAY);
				}
				break;
			case ISAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 85);
				{
				setState(907);
				match(ISAMPLER2DMSARRAY);
				}
				break;
			case USAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 86);
				{
				setState(908);
				match(USAMPLER2DMSARRAY);
				}
				break;
			case IMAGE1D:
				enterOuterAlt(_localctx, 87);
				{
				setState(909);
				match(IMAGE1D);
				}
				break;
			case IIMAGE1D:
				enterOuterAlt(_localctx, 88);
				{
				setState(910);
				match(IIMAGE1D);
				}
				break;
			case UIMAGE1D:
				enterOuterAlt(_localctx, 89);
				{
				setState(911);
				match(UIMAGE1D);
				}
				break;
			case IMAGE2D:
				enterOuterAlt(_localctx, 90);
				{
				setState(912);
				match(IMAGE2D);
				}
				break;
			case IIMAGE2D:
				enterOuterAlt(_localctx, 91);
				{
				setState(913);
				match(IIMAGE2D);
				}
				break;
			case UIMAGE2D:
				enterOuterAlt(_localctx, 92);
				{
				setState(914);
				match(UIMAGE2D);
				}
				break;
			case IMAGE3D:
				enterOuterAlt(_localctx, 93);
				{
				setState(915);
				match(IMAGE3D);
				}
				break;
			case IIMAGE3D:
				enterOuterAlt(_localctx, 94);
				{
				setState(916);
				match(IIMAGE3D);
				}
				break;
			case UIMAGE3D:
				enterOuterAlt(_localctx, 95);
				{
				setState(917);
				match(UIMAGE3D);
				}
				break;
			case IMAGE2DRECT:
				enterOuterAlt(_localctx, 96);
				{
				setState(918);
				match(IMAGE2DRECT);
				}
				break;
			case IIMAGE2DRECT:
				enterOuterAlt(_localctx, 97);
				{
				setState(919);
				match(IIMAGE2DRECT);
				}
				break;
			case UIMAGE2DRECT:
				enterOuterAlt(_localctx, 98);
				{
				setState(920);
				match(UIMAGE2DRECT);
				}
				break;
			case IMAGECUBE:
				enterOuterAlt(_localctx, 99);
				{
				setState(921);
				match(IMAGECUBE);
				}
				break;
			case IIMAGECUBE:
				enterOuterAlt(_localctx, 100);
				{
				setState(922);
				match(IIMAGECUBE);
				}
				break;
			case UIMAGECUBE:
				enterOuterAlt(_localctx, 101);
				{
				setState(923);
				match(UIMAGECUBE);
				}
				break;
			case IMAGEBUFFER:
				enterOuterAlt(_localctx, 102);
				{
				setState(924);
				match(IMAGEBUFFER);
				}
				break;
			case IIMAGEBUFFER:
				enterOuterAlt(_localctx, 103);
				{
				setState(925);
				match(IIMAGEBUFFER);
				}
				break;
			case UIMAGEBUFFER:
				enterOuterAlt(_localctx, 104);
				{
				setState(926);
				match(UIMAGEBUFFER);
				}
				break;
			case IMAGE1DARRAY:
				enterOuterAlt(_localctx, 105);
				{
				setState(927);
				match(IMAGE1DARRAY);
				}
				break;
			case IIMAGE1DARRAY:
				enterOuterAlt(_localctx, 106);
				{
				setState(928);
				match(IIMAGE1DARRAY);
				}
				break;
			case UIMAGE1DARRAY:
				enterOuterAlt(_localctx, 107);
				{
				setState(929);
				match(UIMAGE1DARRAY);
				}
				break;
			case IMAGE2DARRAY:
				enterOuterAlt(_localctx, 108);
				{
				setState(930);
				match(IMAGE2DARRAY);
				}
				break;
			case IIMAGE2DARRAY:
				enterOuterAlt(_localctx, 109);
				{
				setState(931);
				match(IIMAGE2DARRAY);
				}
				break;
			case UIMAGE2DARRAY:
				enterOuterAlt(_localctx, 110);
				{
				setState(932);
				match(UIMAGE2DARRAY);
				}
				break;
			case IMAGECUBEARRAY:
				enterOuterAlt(_localctx, 111);
				{
				setState(933);
				match(IMAGECUBEARRAY);
				}
				break;
			case IIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 112);
				{
				setState(934);
				match(IIMAGECUBEARRAY);
				}
				break;
			case UIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 113);
				{
				setState(935);
				match(UIMAGECUBEARRAY);
				}
				break;
			case IMAGE2DMS:
				enterOuterAlt(_localctx, 114);
				{
				setState(936);
				match(IMAGE2DMS);
				}
				break;
			case IIMAGE2DMS:
				enterOuterAlt(_localctx, 115);
				{
				setState(937);
				match(IIMAGE2DMS);
				}
				break;
			case UIMAGE2DMS:
				enterOuterAlt(_localctx, 116);
				{
				setState(938);
				match(UIMAGE2DMS);
				}
				break;
			case IMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 117);
				{
				setState(939);
				match(IMAGE2DMSARRAY);
				}
				break;
			case IIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 118);
				{
				setState(940);
				match(IIMAGE2DMSARRAY);
				}
				break;
			case UIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 119);
				{
				setState(941);
				match(UIMAGE2DMSARRAY);
				}
				break;
			case SAMPLEREXTERNALOES:
				enterOuterAlt(_localctx, 120);
				{
				setState(942);
				match(SAMPLEREXTERNALOES);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 121);
				{
				setState(943);
				glslStructSpecifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 122);
				{
				setState(944);
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

	public static class GlslStructSpecifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GLSLParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public GlslStructDeclarationListContext glslStructDeclarationList() {
			return getRuleContext(GlslStructDeclarationListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
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
		enterRule(_localctx, 148, RULE_glslStructSpecifier);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(STRUCT);
				setState(948);
				match(IDENTIFIER);
				setState(949);
				match(LEFT_BRACE);
				setState(950);
				glslStructDeclarationList(0);
				setState(951);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				match(STRUCT);
				setState(954);
				match(LEFT_BRACE);
				setState(955);
				glslStructDeclarationList(0);
				setState(956);
				match(RIGHT_BRACE);
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

	public static class GlslStructDeclarationListContext extends ParserRuleContext {
		public GlslStructDeclarationContext glslStructDeclaration() {
			return getRuleContext(GlslStructDeclarationContext.class,0);
		}
		public GlslStructDeclarationListContext glslStructDeclarationList() {
			return getRuleContext(GlslStructDeclarationListContext.class,0);
		}
		public GlslStructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructDeclarationListContext glslStructDeclarationList() throws RecognitionException {
		return glslStructDeclarationList(0);
	}

	private GlslStructDeclarationListContext glslStructDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslStructDeclarationListContext _localctx = new GlslStructDeclarationListContext(_ctx, _parentState);
		GlslStructDeclarationListContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_glslStructDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(961);
			glslStructDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslStructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslStructDeclarationList);
					setState(963);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(964);
					glslStructDeclaration();
					}
					} 
				}
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class GlslStructDeclarationContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslStructDeclaratorListContext glslStructDeclaratorList() {
			return getRuleContext(GlslStructDeclaratorListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslStructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructDeclarationContext glslStructDeclaration() throws RecognitionException {
		GlslStructDeclarationContext _localctx = new GlslStructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_glslStructDeclaration);
		try {
			setState(979);
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
			case STRUCT:
			case SAMPLEREXTERNALOES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				glslTypeSpecifier();
				setState(971);
				glslStructDeclaratorList(0);
				setState(972);
				match(SEMICOLON);
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
			case LAYOUT:
			case CENTROID:
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
			case PATCH:
			case SAMPLE:
			case SUBROUTINE:
			case IN:
			case OUT:
			case INOUT:
			case INVARIANT:
			case PRECISE:
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				glslTypeQualifier(0);
				setState(975);
				glslTypeSpecifier();
				setState(976);
				glslStructDeclaratorList(0);
				setState(977);
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

	public static class GlslStructDeclaratorListContext extends ParserRuleContext {
		public GlslStructDeclaratorContext glslStructDeclarator() {
			return getRuleContext(GlslStructDeclaratorContext.class,0);
		}
		public GlslStructDeclaratorListContext glslStructDeclaratorList() {
			return getRuleContext(GlslStructDeclaratorListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public GlslStructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructDeclaratorListContext glslStructDeclaratorList() throws RecognitionException {
		return glslStructDeclaratorList(0);
	}

	private GlslStructDeclaratorListContext glslStructDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslStructDeclaratorListContext _localctx = new GlslStructDeclaratorListContext(_ctx, _parentState);
		GlslStructDeclaratorListContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_glslStructDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(982);
			glslStructDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslStructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslStructDeclaratorList);
					setState(984);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(985);
					match(COMMA);
					setState(986);
					glslStructDeclarator();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class GlslStructDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public GlslStructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructDeclaratorContext glslStructDeclarator() throws RecognitionException {
		GlslStructDeclaratorContext _localctx = new GlslStructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_glslStructDeclarator);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(IDENTIFIER);
				setState(994);
				glslArraySpecifier(0);
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
		enterRule(_localctx, 158, RULE_glslInvariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
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
		enterRule(_localctx, 160, RULE_glslInterpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
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
		enterRule(_localctx, 162, RULE_glslLayoutQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(LAYOUT);
			setState(1002);
			match(LEFT_PAREN);
			setState(1003);
			glslLayoutQualifierIdList(0);
			setState(1004);
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
		public GlslLayoutQualifierIdContext glslLayoutQualifierId() {
			return getRuleContext(GlslLayoutQualifierIdContext.class,0);
		}
		public GlslLayoutQualifierIdListContext glslLayoutQualifierIdList() {
			return getRuleContext(GlslLayoutQualifierIdListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
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
		return glslLayoutQualifierIdList(0);
	}

	private GlslLayoutQualifierIdListContext glslLayoutQualifierIdList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslLayoutQualifierIdListContext _localctx = new GlslLayoutQualifierIdListContext(_ctx, _parentState);
		GlslLayoutQualifierIdListContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_glslLayoutQualifierIdList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1007);
			glslLayoutQualifierId();
			}
			_ctx.stop = _input.LT(-1);
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLayoutQualifierIdListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLayoutQualifierIdList);
					setState(1009);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1010);
					match(COMMA);
					setState(1011);
					glslLayoutQualifierId();
					}
					} 
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		enterRule(_localctx, 166, RULE_glslLayoutQualifierId);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				match(IDENTIFIER);
				setState(1019);
				match(EQUAL);
				setState(1020);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1021);
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
		enterRule(_localctx, 168, RULE_glslPreciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
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

	public static class GlslTypeQualifierContext extends ParserRuleContext {
		public GlslSingleTypeQualifierContext glslSingleTypeQualifier() {
			return getRuleContext(GlslSingleTypeQualifierContext.class,0);
		}
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
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
		return glslTypeQualifier(0);
	}

	private GlslTypeQualifierContext glslTypeQualifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlslTypeQualifierContext _localctx = new GlslTypeQualifierContext(_ctx, _parentState);
		GlslTypeQualifierContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_glslTypeQualifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1027);
			glslSingleTypeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslTypeQualifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslTypeQualifier);
					setState(1029);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1030);
					glslSingleTypeQualifier();
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 172, RULE_glslSingleTypeQualifier);
		try {
			setState(1042);
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
				setState(1036);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				glslLayoutQualifier();
				}
				break;
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1038);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1039);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1040);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1041);
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
		public GlslTypeNameListContext glslTypeNameList() {
			return getRuleContext(GlslTypeNameListContext.class,0);
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
		enterRule(_localctx, 174, RULE_glslStorageQualifier);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1046);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1047);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1048);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1049);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1050);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1051);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1052);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1053);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1054);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1055);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1056);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1057);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1058);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1059);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1060);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1061);
				match(SUBROUTINE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1062);
				match(SUBROUTINE);
				setState(1063);
				match(LEFT_PAREN);
				setState(1064);
				glslTypeNameList(0);
				setState(1065);
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
		enterRule(_localctx, 176, RULE_glslPrecisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LOW_PRECISION - 85)) | (1L << (MEDIUM_PRECISION - 85)) | (1L << (HIGH_PRECISION - 85)))) != 0)) ) {
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
		case 3:
			return glslIdentifierList_sempred((GlslIdentifierListContext)_localctx, predIndex);
		case 6:
			return glslFunctionHeaderWithParameters_sempred((GlslFunctionHeaderWithParametersContext)_localctx, predIndex);
		case 11:
			return glslInitDeclaratorList_sempred((GlslInitDeclaratorListContext)_localctx, predIndex);
		case 15:
			return glslInitializerList_sempred((GlslInitializerListContext)_localctx, predIndex);
		case 23:
			return glslStatementList_sempred((GlslStatementListContext)_localctx, predIndex);
		case 47:
			return glslPostfixExpression_sempred((GlslPostfixExpressionContext)_localctx, predIndex);
		case 54:
			return glslMultiplicativeExpression_sempred((GlslMultiplicativeExpressionContext)_localctx, predIndex);
		case 55:
			return glslAdditiveExpression_sempred((GlslAdditiveExpressionContext)_localctx, predIndex);
		case 56:
			return glslShiftExpression_sempred((GlslShiftExpressionContext)_localctx, predIndex);
		case 57:
			return glslRelationalExpression_sempred((GlslRelationalExpressionContext)_localctx, predIndex);
		case 58:
			return glslEqualityExpression_sempred((GlslEqualityExpressionContext)_localctx, predIndex);
		case 59:
			return glslAndExpression_sempred((GlslAndExpressionContext)_localctx, predIndex);
		case 60:
			return glslExclusiveOrExpression_sempred((GlslExclusiveOrExpressionContext)_localctx, predIndex);
		case 61:
			return glslInclusiveOrExpression_sempred((GlslInclusiveOrExpressionContext)_localctx, predIndex);
		case 62:
			return glslLogicalAndExpression_sempred((GlslLogicalAndExpressionContext)_localctx, predIndex);
		case 63:
			return glslLogicalXorExpression_sempred((GlslLogicalXorExpressionContext)_localctx, predIndex);
		case 64:
			return glslLogicalOrExpression_sempred((GlslLogicalOrExpressionContext)_localctx, predIndex);
		case 68:
			return glslExpression_sempred((GlslExpressionContext)_localctx, predIndex);
		case 70:
			return glslTypeNameList_sempred((GlslTypeNameListContext)_localctx, predIndex);
		case 72:
			return glslArraySpecifier_sempred((GlslArraySpecifierContext)_localctx, predIndex);
		case 75:
			return glslStructDeclarationList_sempred((GlslStructDeclarationListContext)_localctx, predIndex);
		case 77:
			return glslStructDeclaratorList_sempred((GlslStructDeclaratorListContext)_localctx, predIndex);
		case 82:
			return glslLayoutQualifierIdList_sempred((GlslLayoutQualifierIdListContext)_localctx, predIndex);
		case 85:
			return glslTypeQualifier_sempred((GlslTypeQualifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean glslIdentifierList_sempred(GlslIdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslFunctionHeaderWithParameters_sempred(GlslFunctionHeaderWithParametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslInitDeclaratorList_sempred(GlslInitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
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
	private boolean glslInitializerList_sempred(GlslInitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslStatementList_sempred(GlslStatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslPostfixExpression_sempred(GlslPostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslMultiplicativeExpression_sempred(GlslMultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslAdditiveExpression_sempred(GlslAdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslShiftExpression_sempred(GlslShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslRelationalExpression_sempred(GlslRelationalExpressionContext _localctx, int predIndex) {
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
	private boolean glslEqualityExpression_sempred(GlslEqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslAndExpression_sempred(GlslAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslExclusiveOrExpression_sempred(GlslExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslInclusiveOrExpression_sempred(GlslInclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalAndExpression_sempred(GlslLogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalXorExpression_sempred(GlslLogicalXorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalOrExpression_sempred(GlslLogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslExpression_sempred(GlslExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslTypeNameList_sempred(GlslTypeNameListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslArraySpecifier_sempred(GlslArraySpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 2);
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslStructDeclarationList_sempred(GlslStructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslStructDeclaratorList_sempred(GlslStructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLayoutQualifierIdList_sempred(GlslLayoutQualifierIdListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslTypeQualifier_sempred(GlslTypeQualifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0102\u0432\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00da\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e9\n\5\f\5\16\5\u00ec"+
		"\13\5\3\6\3\6\3\6\3\7\3\7\5\7\u00f3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00fc\n\b\f\b\16\b\u00ff\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u010c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0116"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0130\n\r\f\r\16\r\u0133\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0148\n\16\3\17\3\17\3\17\3\17\5\17\u014e\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u015a\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0162\n\21\f\21\16\21\u0165\13\21"+
		"\3\22\3\22\3\23\3\23\5\23\u016b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0174\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u017c\n\25\3\26\3"+
		"\26\5\26\u0180\n\26\3\27\3\27\5\27\u0184\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u018c\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0193\n\31\f\31\16"+
		"\31\u0196\13\31\3\32\3\32\3\32\3\32\5\32\u019c\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u01a9\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01b1\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u01bd\n\37\3 \3 \3 \3 \3 \3 \5 \u01c5\n \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01dc\n!\3\"\3\"\5\""+
		"\u01e0\n\"\3#\3#\5#\u01e4\n#\3$\3$\3$\3$\3$\3$\3$\5$\u01ed\n$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01fb\n%\3&\6&\u01fe\n&\r&\16&\u01ff\3"+
		"&\5&\u0203\n&\3\'\3\'\5\'\u0207\n\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u021c\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u022b\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u023b\n\61\f\61\16\61\u023e\13"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\6\64\u0248\n\64\r\64\16\64"+
		"\u0249\3\64\3\64\3\64\3\64\5\64\u0250\n\64\3\64\5\64\u0253\n\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u025f\n\66\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\78\u026f\n8\f8\168\u0272\138\39\3"+
		"9\39\39\39\39\39\39\39\79\u027d\n9\f9\169\u0280\139\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\7:\u028b\n:\f:\16:\u028e\13:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\7;\u029f\n;\f;\16;\u02a2\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\7<\u02ad\n<\f<\16<\u02b0\13<\3=\3=\3=\3=\3=\3=\7=\u02b8\n=\f=\16=\u02bb"+
		"\13=\3>\3>\3>\3>\3>\3>\7>\u02c3\n>\f>\16>\u02c6\13>\3?\3?\3?\3?\3?\3?"+
		"\7?\u02ce\n?\f?\16?\u02d1\13?\3@\3@\3@\3@\3@\3@\7@\u02d9\n@\f@\16@\u02dc"+
		"\13@\3A\3A\3A\3A\3A\3A\7A\u02e4\nA\fA\16A\u02e7\13A\3B\3B\3B\3B\3B\3B"+
		"\7B\u02ef\nB\fB\16B\u02f2\13B\3C\3C\3C\3C\3C\3C\3C\5C\u02fb\nC\3D\3D\3"+
		"D\3D\3D\5D\u0302\nD\3E\3E\3F\3F\3F\3F\3F\3F\7F\u030c\nF\fF\16F\u030f\13"+
		"F\3G\3G\3H\3H\3H\3H\3H\3H\7H\u0319\nH\fH\16H\u031c\13H\3I\3I\3I\3I\5I"+
		"\u0322\nI\3J\3J\3J\3J\3J\3J\3J\5J\u032b\nJ\3J\3J\3J\3J\3J\3J\3J\3J\7J"+
		"\u0335\nJ\fJ\16J\u0338\13J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03b4\nK\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\5L\u03c1\nL\3M\3M\3M\3M\3M\7M\u03c8\nM\fM\16M\u03cb"+
		"\13M\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u03d6\nN\3O\3O\3O\3O\3O\3O\7O\u03de"+
		"\nO\fO\16O\u03e1\13O\3P\3P\3P\5P\u03e6\nP\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3"+
		"T\3T\3T\3T\3T\3T\7T\u03f7\nT\fT\16T\u03fa\13T\3U\3U\3U\3U\3U\5U\u0401"+
		"\nU\3V\3V\3W\3W\3W\3W\3W\7W\u040a\nW\fW\16W\u040d\13W\3X\3X\3X\3X\3X\3"+
		"X\5X\u0415\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\5Y\u042e\nY\3Z\3Z\3Z\2\32\b\16\30 \60`nprtvxz|~\u0080\u0082"+
		"\u008a\u008e\u0092\u0098\u009c\u00a6\u00ac[\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\2\6\3\2\u00f5\u00f8\4\2\u00e0\u00e9\u00f3\u00f3\3\2\21\23"+
		"\3\2WY\2\u04d6\2\u00b4\3\2\2\2\4\u00d9\3\2\2\2\6\u00db\3\2\2\2\b\u00e1"+
		"\3\2\2\2\n\u00ed\3\2\2\2\f\u00f2\3\2\2\2\16\u00f4\3\2\2\2\20\u0100\3\2"+
		"\2\2\22\u010b\3\2\2\2\24\u0115\3\2\2\2\26\u0117\3\2\2\2\30\u0119\3\2\2"+
		"\2\32\u0147\3\2\2\2\34\u014d\3\2\2\2\36\u0159\3\2\2\2 \u015b\3\2\2\2\""+
		"\u0166\3\2\2\2$\u016a\3\2\2\2&\u0173\3\2\2\2(\u017b\3\2\2\2*\u017f\3\2"+
		"\2\2,\u0183\3\2\2\2.\u018b\3\2\2\2\60\u018d\3\2\2\2\62\u019b\3\2\2\2\64"+
		"\u019d\3\2\2\2\66\u01a8\3\2\2\28\u01b0\3\2\2\2:\u01b2\3\2\2\2<\u01bc\3"+
		"\2\2\2>\u01c4\3\2\2\2@\u01db\3\2\2\2B\u01df\3\2\2\2D\u01e3\3\2\2\2F\u01ec"+
		"\3\2\2\2H\u01fa\3\2\2\2J\u0202\3\2\2\2L\u0206\3\2\2\2N\u0208\3\2\2\2P"+
		"\u020b\3\2\2\2R\u020d\3\2\2\2T\u020f\3\2\2\2V\u021b\3\2\2\2X\u021d\3\2"+
		"\2\2Z\u021f\3\2\2\2\\\u0221\3\2\2\2^\u0223\3\2\2\2`\u022a\3\2\2\2b\u023f"+
		"\3\2\2\2d\u0241\3\2\2\2f\u0252\3\2\2\2h\u0254\3\2\2\2j\u025e\3\2\2\2l"+
		"\u0260\3\2\2\2n\u0262\3\2\2\2p\u0273\3\2\2\2r\u0281\3\2\2\2t\u028f\3\2"+
		"\2\2v\u02a3\3\2\2\2x\u02b1\3\2\2\2z\u02bc\3\2\2\2|\u02c7\3\2\2\2~\u02d2"+
		"\3\2\2\2\u0080\u02dd\3\2\2\2\u0082\u02e8\3\2\2\2\u0084\u02fa\3\2\2\2\u0086"+
		"\u0301\3\2\2\2\u0088\u0303\3\2\2\2\u008a\u0305\3\2\2\2\u008c\u0310\3\2"+
		"\2\2\u008e\u0312\3\2\2\2\u0090\u0321\3\2\2\2\u0092\u032a\3\2\2\2\u0094"+
		"\u03b3\3\2\2\2\u0096\u03c0\3\2\2\2\u0098\u03c2\3\2\2\2\u009a\u03d5\3\2"+
		"\2\2\u009c\u03d7\3\2\2\2\u009e\u03e5\3\2\2\2\u00a0\u03e7\3\2\2\2\u00a2"+
		"\u03e9\3\2\2\2\u00a4\u03eb\3\2\2\2\u00a6\u03f0\3\2\2\2\u00a8\u0400\3\2"+
		"\2\2\u00aa\u0402\3\2\2\2\u00ac\u0404\3\2\2\2\u00ae\u0414\3\2\2\2\u00b0"+
		"\u042d\3\2\2\2\u00b2\u042f\3\2\2\2\u00b4\u00b5\5J&\2\u00b5\3\3\2\2\2\u00b6"+
		"\u00b7\5\n\6\2\u00b7\u00b8\7\u00f4\2\2\u00b8\u00da\3\2\2\2\u00b9\u00ba"+
		"\5\30\r\2\u00ba\u00bb\7\u00f4\2\2\u00bb\u00da\3\2\2\2\u00bc\u00bd\7Z\2"+
		"\2\u00bd\u00be\5\u00b2Z\2\u00be\u00bf\5\u0090I\2\u00bf\u00c0\7\u00f4\2"+
		"\2\u00c0\u00da\3\2\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c3\7\u00f4\2\2\u00c3"+
		"\u00da\3\2\2\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\7\u00d0\2\2\u00c6\u00c7"+
		"\7\u00f4\2\2\u00c7\u00da\3\2\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\7\u00d0"+
		"\2\2\u00ca\u00cb\5\u0092J\2\u00cb\u00cc\7\u00f4\2\2\u00cc\u00da\3\2\2"+
		"\2\u00cd\u00ce\5\u00acW\2\u00ce\u00cf\7\u00f4\2\2\u00cf\u00da\3\2\2\2"+
		"\u00d0\u00d1\5\u00acW\2\u00d1\u00d2\7\u00d0\2\2\u00d2\u00d3\7\u00f4\2"+
		"\2\u00d3\u00da\3\2\2\2\u00d4\u00d5\5\u00acW\2\u00d5\u00d6\7\u00d0\2\2"+
		"\u00d6\u00d7\5\b\5\2\u00d7\u00d8\7\u00f4\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00b6\3\2\2\2\u00d9\u00b9\3\2\2\2\u00d9\u00bc\3\2\2\2\u00d9\u00c1\3\2"+
		"\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9"+
		"\u00d0\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\5\3\2\2\2\u00db\u00dc\5\u00ac"+
		"W\2\u00dc\u00dd\7\u00d0\2\2\u00dd\u00de\7\u00ee\2\2\u00de\u00df\5\u0098"+
		"M\2\u00df\u00e0\7\u00ef\2\2\u00e0\7\3\2\2\2\u00e1\u00e2\b\5\1\2\u00e2"+
		"\u00e3\7\u00f1\2\2\u00e3\u00e4\7\u00d0\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6"+
		"\f\3\2\2\u00e6\u00e7\7\u00f1\2\2\u00e7\u00e9\7\u00d0\2\2\u00e8\u00e5\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\t\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5\f\7\2\u00ee\u00ef\7\u00eb"+
		"\2\2\u00ef\13\3\2\2\2\u00f0\u00f3\5\20\t\2\u00f1\u00f3\5\16\b\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\r\3\2\2\2\u00f4\u00f5\b\b\1\2"+
		"\u00f5\u00f6\5\20\t\2\u00f6\u00f7\5\24\13\2\u00f7\u00fd\3\2\2\2\u00f8"+
		"\u00f9\f\3\2\2\u00f9\u00fa\7\u00f1\2\2\u00fa\u00fc\5\24\13\2\u00fb\u00f8"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\17\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5\34\17\2\u0101\u0102\7\u00d0"+
		"\2\2\u0102\u0103\7\u00ea\2\2\u0103\21\3\2\2\2\u0104\u0105\5\u0090I\2\u0105"+
		"\u0106\7\u00d0\2\2\u0106\u010c\3\2\2\2\u0107\u0108\5\u0090I\2\u0108\u0109"+
		"\7\u00d0\2\2\u0109\u010a\5\u0092J\2\u010a\u010c\3\2\2\2\u010b\u0104\3"+
		"\2\2\2\u010b\u0107\3\2\2\2\u010c\23\3\2\2\2\u010d\u010e\5\u00acW\2\u010e"+
		"\u010f\5\22\n\2\u010f\u0116\3\2\2\2\u0110\u0116\5\22\n\2\u0111\u0112\5"+
		"\u00acW\2\u0112\u0113\5\26\f\2\u0113\u0116\3\2\2\2\u0114\u0116\5\26\f"+
		"\2\u0115\u010d\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\25\3\2\2\2\u0117\u0118\5\u0090I\2\u0118\27\3\2\2\2\u0119"+
		"\u011a\b\r\1\2\u011a\u011b\5\32\16\2\u011b\u0131\3\2\2\2\u011c\u011d\f"+
		"\6\2\2\u011d\u011e\7\u00f1\2\2\u011e\u0130\7\u00d0\2\2\u011f\u0120\f\5"+
		"\2\2\u0120\u0121\7\u00f1\2\2\u0121\u0122\7\u00d0\2\2\u0122\u0130\5\u0092"+
		"J\2\u0123\u0124\f\4\2\2\u0124\u0125\7\u00f1\2\2\u0125\u0126\7\u00d0\2"+
		"\2\u0126\u0127\5\u0092J\2\u0127\u0128\7\u00f3\2\2\u0128\u0129\5\36\20"+
		"\2\u0129\u0130\3\2\2\2\u012a\u012b\f\3\2\2\u012b\u012c\7\u00f1\2\2\u012c"+
		"\u012d\7\u00d0\2\2\u012d\u012e\7\u00f3\2\2\u012e\u0130\5\36\20\2\u012f"+
		"\u011c\3\2\2\2\u012f\u011f\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u012a\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\31\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0148\5\34\17\2\u0135\u0136\5\34"+
		"\17\2\u0136\u0137\7\u00d0\2\2\u0137\u0148\3\2\2\2\u0138\u0139\5\34\17"+
		"\2\u0139\u013a\7\u00d0\2\2\u013a\u013b\5\u0092J\2\u013b\u0148\3\2\2\2"+
		"\u013c\u013d\5\34\17\2\u013d\u013e\7\u00d0\2\2\u013e\u013f\5\u0092J\2"+
		"\u013f\u0140\7\u00f3\2\2\u0140\u0141\5\36\20\2\u0141\u0148\3\2\2\2\u0142"+
		"\u0143\5\34\17\2\u0143\u0144\7\u00d0\2\2\u0144\u0145\7\u00f3\2\2\u0145"+
		"\u0146\5\36\20\2\u0146\u0148\3\2\2\2\u0147\u0134\3\2\2\2\u0147\u0135\3"+
		"\2\2\2\u0147\u0138\3\2\2\2\u0147\u013c\3\2\2\2\u0147\u0142\3\2\2\2\u0148"+
		"\33\3\2\2\2\u0149\u014e\5\u0090I\2\u014a\u014b\5\u00acW\2\u014b\u014c"+
		"\5\u0090I\2\u014c\u014e\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2"+
		"\2\u014e\35\3\2\2\2\u014f\u015a\5\u0086D\2\u0150\u0151\7\u00ee\2\2\u0151"+
		"\u0152\5 \21\2\u0152\u0153\7\u00ef\2\2\u0153\u015a\3\2\2\2\u0154\u0155"+
		"\7\u00ee\2\2\u0155\u0156\5 \21\2\u0156\u0157\7\u00f1\2\2\u0157\u0158\7"+
		"\u00ef\2\2\u0158\u015a\3\2\2\2\u0159\u014f\3\2\2\2\u0159\u0150\3\2\2\2"+
		"\u0159\u0154\3\2\2\2\u015a\37\3\2\2\2\u015b\u015c\b\21\1\2\u015c\u015d"+
		"\5\36\20\2\u015d\u0163\3\2\2\2\u015e\u015f\f\3\2\2\u015f\u0160\7\u00f1"+
		"\2\2\u0160\u0162\5\36\20\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164!\3\2\2\2\u0165\u0163\3\2\2\2"+
		"\u0166\u0167\5\4\3\2\u0167#\3\2\2\2\u0168\u016b\5(\25\2\u0169\u016b\5"+
		"&\24\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b%\3\2\2\2\u016c\u0174"+
		"\5\"\22\2\u016d\u0174\5\62\32\2\u016e\u0174\5\64\33\2\u016f\u0174\5:\36"+
		"\2\u0170\u0174\5> \2\u0171\u0174\5@!\2\u0172\u0174\5H%\2\u0173\u016c\3"+
		"\2\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0173"+
		"\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\'\3\2\2\2"+
		"\u0175\u0176\7\u00ee\2\2\u0176\u017c\7\u00ef\2\2\u0177\u0178\7\u00ee\2"+
		"\2\u0178\u0179\5\60\31\2\u0179\u017a\7\u00ef\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0175\3\2\2\2\u017b\u0177\3\2\2\2\u017c)\3\2\2\2\u017d\u0180\5.\30\2"+
		"\u017e\u0180\5&\24\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180+\3"+
		"\2\2\2\u0181\u0184\5(\25\2\u0182\u0184\5&\24\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184-\3\2\2\2\u0185\u0186\7\u00ee\2\2\u0186\u018c\7\u00ef"+
		"\2\2\u0187\u0188\7\u00ee\2\2\u0188\u0189\5\60\31\2\u0189\u018a\7\u00ef"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0187\3\2\2\2\u018c"+
		"/\3\2\2\2\u018d\u018e\b\31\1\2\u018e\u018f\5$\23\2\u018f\u0194\3\2\2\2"+
		"\u0190\u0191\f\3\2\2\u0191\u0193\5$\23\2\u0192\u0190\3\2\2\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\61\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u019c\7\u00f4\2\2\u0198\u0199\5\u008aF\2\u0199\u019a"+
		"\7\u00f4\2\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2"+
		"\2\u019c\63\3\2\2\2\u019d\u019e\7\36\2\2\u019e\u019f\7\u00ea\2\2\u019f"+
		"\u01a0\5\u008aF\2\u01a0\u01a1\7\u00eb\2\2\u01a1\u01a2\5\66\34\2\u01a2"+
		"\65\3\2\2\2\u01a3\u01a4\5,\27\2\u01a4\u01a5\7\37\2\2\u01a5\u01a6\5,\27"+
		"\2\u01a6\u01a9\3\2\2\2\u01a7\u01a9\5,\27\2\u01a8\u01a3\3\2\2\2\u01a8\u01a7"+
		"\3\2\2\2\u01a9\67\3\2\2\2\u01aa\u01b1\5\u008aF\2\u01ab\u01ac\5\34\17\2"+
		"\u01ac\u01ad\7\u00d0\2\2\u01ad\u01ae\7\u00f3\2\2\u01ae\u01af\5\36\20\2"+
		"\u01af\u01b1\3\2\2\2\u01b0\u01aa\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b19\3"+
		"\2\2\2\u01b2\u01b3\7\33\2\2\u01b3\u01b4\7\u00ea\2\2\u01b4\u01b5\5\u008a"+
		"F\2\u01b5\u01b6\7\u00eb\2\2\u01b6\u01b7\7\u00ee\2\2\u01b7\u01b8\5<\37"+
		"\2\u01b8\u01b9\7\u00ef\2\2\u01b9;\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bd"+
		"\5\60\31\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd=\3\2\2\2\u01be"+
		"\u01bf\7\34\2\2\u01bf\u01c0\5\u008aF\2\u01c0\u01c1\7\u00f2\2\2\u01c1\u01c5"+
		"\3\2\2\2\u01c2\u01c3\7\35\2\2\u01c3\u01c5\7\u00f2\2\2\u01c4\u01be\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5?\3\2\2\2\u01c6\u01c7\7\32\2\2\u01c7\u01c8"+
		"\7\u00ea\2\2\u01c8\u01c9\58\35\2\u01c9\u01ca\7\u00eb\2\2\u01ca\u01cb\5"+
		"*\26\2\u01cb\u01dc\3\2\2\2\u01cc\u01cd\7\30\2\2\u01cd\u01ce\5$\23\2\u01ce"+
		"\u01cf\7\32\2\2\u01cf\u01d0\7\u00ea\2\2\u01d0\u01d1\5\u008aF\2\u01d1\u01d2"+
		"\7\u00eb\2\2\u01d2\u01d3\7\u00f4\2\2\u01d3\u01dc\3\2\2\2\u01d4\u01d5\7"+
		"\31\2\2\u01d5\u01d6\7\u00ea\2\2\u01d6\u01d7\5B\"\2\u01d7\u01d8\5F$\2\u01d8"+
		"\u01d9\7\u00eb\2\2\u01d9\u01da\5*\26\2\u01da\u01dc\3\2\2\2\u01db\u01c6"+
		"\3\2\2\2\u01db\u01cc\3\2\2\2\u01db\u01d4\3\2\2\2\u01dcA\3\2\2\2\u01dd"+
		"\u01e0\5\62\32\2\u01de\u01e0\5\"\22\2\u01df\u01dd\3\2\2\2\u01df\u01de"+
		"\3\2\2\2\u01e0C\3\2\2\2\u01e1\u01e4\58\35\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4E\3\2\2\2\u01e5\u01e6\5D#\2\u01e6"+
		"\u01e7\7\u00f4\2\2\u01e7\u01ed\3\2\2\2\u01e8\u01e9\5D#\2\u01e9\u01ea\7"+
		"\u00f4\2\2\u01ea\u01eb\5\u008aF\2\u01eb\u01ed\3\2\2\2\u01ec\u01e5\3\2"+
		"\2\2\u01ec\u01e8\3\2\2\2\u01edG\3\2\2\2\u01ee\u01ef\7\27\2\2\u01ef\u01fb"+
		"\7\u00f4\2\2\u01f0\u01f1\7\26\2\2\u01f1\u01fb\7\u00f4\2\2\u01f2\u01f3"+
		"\7.\2\2\u01f3\u01fb\7\u00f4\2\2\u01f4\u01f5\7.\2\2\u01f5\u01f6\5\u008a"+
		"F\2\u01f6\u01f7\7\u00f4\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01f9\7-\2\2\u01f9"+
		"\u01fb\7\u00f4\2\2\u01fa\u01ee\3\2\2\2\u01fa\u01f0\3\2\2\2\u01fa\u01f2"+
		"\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fbI\3\2\2\2\u01fc"+
		"\u01fe\5L\'\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0203\7\2\2\3\u0202"+
		"\u01fd\3\2\2\2\u0202\u0201\3\2\2\2\u0203K\3\2\2\2\u0204\u0207\5N(\2\u0205"+
		"\u0207\5\4\3\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207M\3\2\2\2"+
		"\u0208\u0209\5\n\6\2\u0209\u020a\5.\30\2\u020aO\3\2\2\2\u020b\u020c\7"+
		"\u00d0\2\2\u020cQ\3\2\2\2\u020d\u020e\7\u00d0\2\2\u020eS\3\2\2\2\u020f"+
		"\u0210\7\u00d0\2\2\u0210U\3\2\2\2\u0211\u021c\5R*\2\u0212\u021c\5X-\2"+
		"\u0213\u021c\5Z.\2\u0214\u021c\5\\/\2\u0215\u021c\5^\60\2\u0216\u021c"+
		"\7\u00cf\2\2\u0217\u0218\7\u00ea\2\2\u0218\u0219\5\u008aF\2\u0219\u021a"+
		"\7\u00eb\2\2\u021a\u021c\3\2\2\2\u021b\u0211\3\2\2\2\u021b\u0212\3\2\2"+
		"\2\u021b\u0213\3\2\2\2\u021b\u0214\3\2\2\2\u021b\u0215\3\2\2\2\u021b\u0216"+
		"\3\2\2\2\u021b\u0217\3\2\2\2\u021cW\3\2\2\2\u021d\u021e\7\u00d3\2\2\u021e"+
		"Y\3\2\2\2\u021f\u0220\7\u00d4\2\2\u0220[\3\2\2\2\u0221\u0222\7\u00d1\2"+
		"\2\u0222]\3\2\2\2\u0223\u0224\7\u00d2\2\2\u0224_\3\2\2\2\u0225\u0226\b"+
		"\61\1\2\u0226\u022b\5V,\2\u0227\u0228\5\u0090I\2\u0228\u0229\5d\63\2\u0229"+
		"\u022b\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u0227\3\2\2\2\u022b\u023c\3\2"+
		"\2\2\u022c\u022d\f\b\2\2\u022d\u022e\7\u00ec\2\2\u022e\u022f\5h\65\2\u022f"+
		"\u0230\7\u00ed\2\2\u0230\u023b\3\2\2\2\u0231\u0232\f\7\2\2\u0232\u023b"+
		"\5b\62\2\u0233\u0234\f\5\2\2\u0234\u0235\7\u00f0\2\2\u0235\u023b\5P)\2"+
		"\u0236\u0237\f\4\2\2\u0237\u023b\7\u00d7\2\2\u0238\u0239\f\3\2\2\u0239"+
		"\u023b\7\u00d8\2\2\u023a\u022c\3\2\2\2\u023a\u0231\3\2\2\2\u023a\u0233"+
		"\3\2\2\2\u023a\u0236\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023da\3\2\2\2\u023e\u023c\3\2\2\2"+
		"\u023f\u0240\5f\64\2\u0240c\3\2\2\2\u0241\u0242\5f\64\2\u0242e\3\2\2\2"+
		"\u0243\u0244\7\u00ea\2\2\u0244\u0247\5\u0086D\2\u0245\u0246\7\u00f1\2"+
		"\2\u0246\u0248\5\u0086D\2\u0247\u0245\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\u00eb"+
		"\2\2\u024c\u0253\3\2\2\2\u024d\u024f\7\u00ea\2\2\u024e\u0250\7\'\2\2\u024f"+
		"\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\7\u00eb"+
		"\2\2\u0252\u0243\3\2\2\2\u0252\u024d\3\2\2\2\u0253g\3\2\2\2\u0254\u0255"+
		"\5\u008aF\2\u0255i\3\2\2\2\u0256\u025f\5`\61\2\u0257\u0258\7\u00d7\2\2"+
		"\u0258\u025f\5j\66\2\u0259\u025a\7\u00d8\2\2\u025a\u025f\5j\66\2\u025b"+
		"\u025c\5l\67\2\u025c\u025d\5j\66\2\u025d\u025f\3\2\2\2\u025e\u0256\3\2"+
		"\2\2\u025e\u0257\3\2\2\2\u025e\u0259\3\2\2\2\u025e\u025b\3\2\2\2\u025f"+
		"k\3\2\2\2\u0260\u0261\t\2\2\2\u0261m\3\2\2\2\u0262\u0263\b8\1\2\u0263"+
		"\u0264\5j\66\2\u0264\u0270\3\2\2\2\u0265\u0266\f\5\2\2\u0266\u0267\7\u00f9"+
		"\2\2\u0267\u026f\5j\66\2\u0268\u0269\f\4\2\2\u0269\u026a\7\u00fa\2\2\u026a"+
		"\u026f\5j\66\2\u026b\u026c\f\3\2\2\u026c\u026d\7\u00fb\2\2\u026d\u026f"+
		"\5j\66\2\u026e\u0265\3\2\2\2\u026e\u0268\3\2\2\2\u026e\u026b\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271o\3\2\2\2"+
		"\u0272\u0270\3\2\2\2\u0273\u0274\b9\1\2\u0274\u0275\5n8\2\u0275\u027e"+
		"\3\2\2\2\u0276\u0277\f\4\2\2\u0277\u0278\7\u00f8\2\2\u0278\u027d\5n8\2"+
		"\u0279\u027a\f\3\2\2\u027a\u027b\7\u00f6\2\2\u027b\u027d\5n8\2\u027c\u0276"+
		"\3\2\2\2\u027c\u0279\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027fq\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\b:\1\2\u0282"+
		"\u0283\5p9\2\u0283\u028c\3\2\2\2\u0284\u0285\f\4\2\2\u0285\u0286\7\u00d5"+
		"\2\2\u0286\u028b\5p9\2\u0287\u0288\f\3\2\2\u0288\u0289\7\u00d6\2\2\u0289"+
		"\u028b\5p9\2\u028a\u0284\3\2\2\2\u028a\u0287\3\2\2\2\u028b\u028e\3\2\2"+
		"\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028ds\3\2\2\2\u028e\u028c"+
		"\3\2\2\2\u028f\u0290\b;\1\2\u0290\u0291\5r:\2\u0291\u02a0\3\2\2\2\u0292"+
		"\u0293\f\6\2\2\u0293\u0294\7\u00fc\2\2\u0294\u029f\5r:\2\u0295\u0296\f"+
		"\5\2\2\u0296\u0297\7\u00fd\2\2\u0297\u029f\5r:\2\u0298\u0299\f\4\2\2\u0299"+
		"\u029a\7\u00d9\2\2\u029a\u029f\5r:\2\u029b\u029c\f\3\2\2\u029c\u029d\7"+
		"\u00da\2\2\u029d\u029f\5r:\2\u029e\u0292\3\2\2\2\u029e\u0295\3\2\2\2\u029e"+
		"\u0298\3\2\2\2\u029e\u029b\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2"+
		"\2\2\u02a0\u02a1\3\2\2\2\u02a1u\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4"+
		"\b<\1\2\u02a4\u02a5\5t;\2\u02a5\u02ae\3\2\2\2\u02a6\u02a7\f\4\2\2\u02a7"+
		"\u02a8\7\u00db\2\2\u02a8\u02ad\5t;\2\u02a9\u02aa\f\3\2\2\u02aa\u02ab\7"+
		"\u00dc\2\2\u02ab\u02ad\5t;\2\u02ac\u02a6\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ad"+
		"\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02afw\3\2\2\2"+
		"\u02b0\u02ae\3\2\2\2\u02b1\u02b2\b=\1\2\u02b2\u02b3\5v<\2\u02b3\u02b9"+
		"\3\2\2\2\u02b4\u02b5\f\3\2\2\u02b5\u02b6\7\u0100\2\2\u02b6\u02b8\5v<\2"+
		"\u02b7\u02b4\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02bay\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\b>\1\2\u02bd\u02be"+
		"\5x=\2\u02be\u02c4\3\2\2\2\u02bf\u02c0\f\3\2\2\u02c0\u02c1\7\u00ff\2\2"+
		"\u02c1\u02c3\5x=\2\u02c2\u02bf\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2"+
		"\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5{\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02c8\b?\1\2\u02c8\u02c9\5z>\2\u02c9\u02cf\3\2\2\2\u02ca\u02cb\f\3\2"+
		"\2\u02cb\u02cc\7\u00fe\2\2\u02cc\u02ce\5z>\2\u02cd\u02ca\3\2\2\2\u02ce"+
		"\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0}\3\2\2\2"+
		"\u02d1\u02cf\3\2\2\2\u02d2\u02d3\b@\1\2\u02d3\u02d4\5|?\2\u02d4\u02da"+
		"\3\2\2\2\u02d5\u02d6\f\3\2\2\u02d6\u02d7\7\u00dd\2\2\u02d7\u02d9\5|?\2"+
		"\u02d8\u02d5\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db"+
		"\3\2\2\2\u02db\177\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\bA\1\2\u02de"+
		"\u02df\5~@\2\u02df\u02e5\3\2\2\2\u02e0\u02e1\f\3\2\2\u02e1\u02e2\7\u00df"+
		"\2\2\u02e2\u02e4\5~@\2\u02e3\u02e0\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u0081\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8"+
		"\u02e9\bB\1\2\u02e9\u02ea\5\u0080A\2\u02ea\u02f0\3\2\2\2\u02eb\u02ec\f"+
		"\3\2\2\u02ec\u02ed\7\u00de\2\2\u02ed\u02ef\5\u0080A\2\u02ee\u02eb\3\2"+
		"\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u0083\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02fb\5\u0082B\2\u02f4\u02f5"+
		"\5\u0082B\2\u02f5\u02f6\7\u0101\2\2\u02f6\u02f7\5\u008aF\2\u02f7\u02f8"+
		"\7\u00f2\2\2\u02f8\u02f9\5\u0086D\2\u02f9\u02fb\3\2\2\2\u02fa\u02f3\3"+
		"\2\2\2\u02fa\u02f4\3\2\2\2\u02fb\u0085\3\2\2\2\u02fc\u0302\5\u0084C\2"+
		"\u02fd\u02fe\5j\66\2\u02fe\u02ff\5\u0088E\2\u02ff\u0300\5\u0086D\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02fc\3\2\2\2\u0301\u02fd\3\2\2\2\u0302\u0087\3\2"+
		"\2\2\u0303\u0304\t\3\2\2\u0304\u0089\3\2\2\2\u0305\u0306\bF\1\2\u0306"+
		"\u0307\5\u0086D\2\u0307\u030d\3\2\2\2\u0308\u0309\f\3\2\2\u0309\u030a"+
		"\7\u00f1\2\2\u030a\u030c\5\u0086D\2\u030b\u0308\3\2\2\2\u030c\u030f\3"+
		"\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u008b\3\2\2\2\u030f"+
		"\u030d\3\2\2\2\u0310\u0311\5\u0084C\2\u0311\u008d\3\2\2\2\u0312\u0313"+
		"\bH\1\2\u0313\u0314\5T+\2\u0314\u031a\3\2\2\2\u0315\u0316\f\3\2\2\u0316"+
		"\u0317\7\u00f1\2\2\u0317\u0319\5T+\2\u0318\u0315\3\2\2\2\u0319\u031c\3"+
		"\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u008f\3\2\2\2\u031c"+
		"\u031a\3\2\2\2\u031d\u0322\5\u0094K\2\u031e\u031f\5\u0094K\2\u031f\u0320"+
		"\5\u0092J\2\u0320\u0322\3\2\2\2\u0321\u031d\3\2\2\2\u0321\u031e\3\2\2"+
		"\2\u0322\u0091\3\2\2\2\u0323\u0324\bJ\1\2\u0324\u0325\7\u00ec\2\2\u0325"+
		"\u032b\7\u00ed\2\2\u0326\u0327\7\u00ec\2\2\u0327\u0328\5\u008cG\2\u0328"+
		"\u0329\7\u00ed\2\2\u0329\u032b\3\2\2\2\u032a\u0323\3\2\2\2\u032a\u0326"+
		"\3\2\2\2\u032b\u0336\3\2\2\2\u032c\u032d\f\4\2\2\u032d\u032e\7\u00ec\2"+
		"\2\u032e\u0335\7\u00ed\2\2\u032f\u0330\f\3\2\2\u0330\u0331\7\u00ec\2\2"+
		"\u0331\u0332\5\u008cG\2\u0332\u0333\7\u00ed\2\2\u0333\u0335\3\2\2\2\u0334"+
		"\u032c\3\2\2\2\u0334\u032f\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0093\3\2\2\2\u0338\u0336\3\2\2\2\u0339"+
		"\u03b4\7\'\2\2\u033a\u03b4\7$\2\2\u033b\u03b4\7%\2\2\u033c\u03b4\7&\2"+
		"\2\u033d\u03b4\7S\2\2\u033e\u03b4\7(\2\2\u033f\u03b4\7G\2\2\u0340\u03b4"+
		"\7H\2\2\u0341\u03b4\7I\2\2\u0342\u03b4\7P\2\2\u0343\u03b4\7Q\2\2\u0344"+
		"\u03b4\7R\2\2\u0345\u03b4\7M\2\2\u0346\u03b4\7N\2\2\u0347\u03b4\7O\2\2"+
		"\u0348\u03b4\7J\2\2\u0349\u03b4\7K\2\2\u034a\u03b4\7L\2\2\u034b\u03b4"+
		"\7T\2\2\u034c\u03b4\7U\2\2\u034d\u03b4\7V\2\2\u034e\u03b4\7/\2\2\u034f"+
		"\u03b4\7\60\2\2\u0350\u03b4\7\61\2\2\u0351\u03b4\7\65\2\2\u0352\u03b4"+
		"\7\66\2\2\u0353\u03b4\7\67\2\2\u0354\u03b4\7;\2\2\u0355\u03b4\7<\2\2\u0356"+
		"\u03b4\7=\2\2\u0357\u03b4\7A\2\2\u0358\u03b4\7B\2\2\u0359\u03b4\7C\2\2"+
		"\u035a\u03b4\7\62\2\2\u035b\u03b4\7\63\2\2\u035c\u03b4\7\64\2\2\u035d"+
		"\u03b4\78\2\2\u035e\u03b4\79\2\2\u035f\u03b4\7:\2\2\u0360\u03b4\7>\2\2"+
		"\u0361\u03b4\7?\2\2\u0362\u03b4\7@\2\2\u0363\u03b4\7D\2\2\u0364\u03b4"+
		"\7E\2\2\u0365\u03b4\7F\2\2\u0366\u03b4\7\16\2\2\u0367\u03b4\7[\2\2\u0368"+
		"\u03b4\7\\\2\2\u0369\u03b4\7]\2\2\u036a\u03b4\7^\2\2\u036b\u03b4\7_\2"+
		"\2\u036c\u03b4\7`\2\2\u036d\u03b4\7a\2\2\u036e\u03b4\7b\2\2\u036f\u03b4"+
		"\7c\2\2\u0370\u03b4\7d\2\2\u0371\u03b4\7e\2\2\u0372\u03b4\7\177\2\2\u0373"+
		"\u03b4\7\u0080\2\2\u0374\u03b4\7f\2\2\u0375\u03b4\7g\2\2\u0376\u03b4\7"+
		"h\2\2\u0377\u03b4\7i\2\2\u0378\u03b4\7j\2\2\u0379\u03b4\7k\2\2\u037a\u03b4"+
		"\7\u0081\2\2\u037b\u03b4\7l\2\2\u037c\u03b4\7m\2\2\u037d\u03b4\7n\2\2"+
		"\u037e\u03b4\7o\2\2\u037f\u03b4\7p\2\2\u0380\u03b4\7q\2\2\u0381\u03b4"+
		"\7\u0082\2\2\u0382\u03b4\7r\2\2\u0383\u03b4\7s\2\2\u0384\u03b4\7t\2\2"+
		"\u0385\u03b4\7u\2\2\u0386\u03b4\7v\2\2\u0387\u03b4\7w\2\2\u0388\u03b4"+
		"\7x\2\2\u0389\u03b4\7y\2\2\u038a\u03b4\7z\2\2\u038b\u03b4\7{\2\2\u038c"+
		"\u03b4\7|\2\2\u038d\u03b4\7}\2\2\u038e\u03b4\7~\2\2\u038f\u03b4\7\u0083"+
		"\2\2\u0390\u03b4\7\u0084\2\2\u0391\u03b4\7\u0085\2\2\u0392\u03b4\7\u0086"+
		"\2\2\u0393\u03b4\7\u0087\2\2\u0394\u03b4\7\u0088\2\2\u0395\u03b4\7\u0089"+
		"\2\2\u0396\u03b4\7\u008a\2\2\u0397\u03b4\7\u008b\2\2\u0398\u03b4\7\u008c"+
		"\2\2\u0399\u03b4\7\u008d\2\2\u039a\u03b4\7\u008e\2\2\u039b\u03b4\7\u008f"+
		"\2\2\u039c\u03b4\7\u0090\2\2\u039d\u03b4\7\u0091\2\2\u039e\u03b4\7\u0092"+
		"\2\2\u039f\u03b4\7\u0093\2\2\u03a0\u03b4\7\u0094\2\2\u03a1\u03b4\7\u0095"+
		"\2\2\u03a2\u03b4\7\u0096\2\2\u03a3\u03b4\7\u0097\2\2\u03a4\u03b4\7\u0098"+
		"\2\2\u03a5\u03b4\7\u0099\2\2\u03a6\u03b4\7\u009a\2\2\u03a7\u03b4\7\u009b"+
		"\2\2\u03a8\u03b4\7\u009c\2\2\u03a9\u03b4\7\u009d\2\2\u03aa\u03b4\7\u009e"+
		"\2\2\u03ab\u03b4\7\u009f\2\2\u03ac\u03b4\7\u00a0\2\2\u03ad\u03b4\7\u00a1"+
		"\2\2\u03ae\u03b4\7\u00a2\2\2\u03af\u03b4\7\u00a3\2\2\u03b0\u03b4\7\u00cc"+
		"\2\2\u03b1\u03b4\5\u0096L\2\u03b2\u03b4\5T+\2\u03b3\u0339\3\2\2\2\u03b3"+
		"\u033a\3\2\2\2\u03b3\u033b\3\2\2\2\u03b3\u033c\3\2\2\2\u03b3\u033d\3\2"+
		"\2\2\u03b3\u033e\3\2\2\2\u03b3\u033f\3\2\2\2\u03b3\u0340\3\2\2\2\u03b3"+
		"\u0341\3\2\2\2\u03b3\u0342\3\2\2\2\u03b3\u0343\3\2\2\2\u03b3\u0344\3\2"+
		"\2\2\u03b3\u0345\3\2\2\2\u03b3\u0346\3\2\2\2\u03b3\u0347\3\2\2\2\u03b3"+
		"\u0348\3\2\2\2\u03b3\u0349\3\2\2\2\u03b3\u034a\3\2\2\2\u03b3\u034b\3\2"+
		"\2\2\u03b3\u034c\3\2\2\2\u03b3\u034d\3\2\2\2\u03b3\u034e\3\2\2\2\u03b3"+
		"\u034f\3\2\2\2\u03b3\u0350\3\2\2\2\u03b3\u0351\3\2\2\2\u03b3\u0352\3\2"+
		"\2\2\u03b3\u0353\3\2\2\2\u03b3\u0354\3\2\2\2\u03b3\u0355\3\2\2\2\u03b3"+
		"\u0356\3\2\2\2\u03b3\u0357\3\2\2\2\u03b3\u0358\3\2\2\2\u03b3\u0359\3\2"+
		"\2\2\u03b3\u035a\3\2\2\2\u03b3\u035b\3\2\2\2\u03b3\u035c\3\2\2\2\u03b3"+
		"\u035d\3\2\2\2\u03b3\u035e\3\2\2\2\u03b3\u035f\3\2\2\2\u03b3\u0360\3\2"+
		"\2\2\u03b3\u0361\3\2\2\2\u03b3\u0362\3\2\2\2\u03b3\u0363\3\2\2\2\u03b3"+
		"\u0364\3\2\2\2\u03b3\u0365\3\2\2\2\u03b3\u0366\3\2\2\2\u03b3\u0367\3\2"+
		"\2\2\u03b3\u0368\3\2\2\2\u03b3\u0369\3\2\2\2\u03b3\u036a\3\2\2\2\u03b3"+
		"\u036b\3\2\2\2\u03b3\u036c\3\2\2\2\u03b3\u036d\3\2\2\2\u03b3\u036e\3\2"+
		"\2\2\u03b3\u036f\3\2\2\2\u03b3\u0370\3\2\2\2\u03b3\u0371\3\2\2\2\u03b3"+
		"\u0372\3\2\2\2\u03b3\u0373\3\2\2\2\u03b3\u0374\3\2\2\2\u03b3\u0375\3\2"+
		"\2\2\u03b3\u0376\3\2\2\2\u03b3\u0377\3\2\2\2\u03b3\u0378\3\2\2\2\u03b3"+
		"\u0379\3\2\2\2\u03b3\u037a\3\2\2\2\u03b3\u037b\3\2\2\2\u03b3\u037c\3\2"+
		"\2\2\u03b3\u037d\3\2\2\2\u03b3\u037e\3\2\2\2\u03b3\u037f\3\2\2\2\u03b3"+
		"\u0380\3\2\2\2\u03b3\u0381\3\2\2\2\u03b3\u0382\3\2\2\2\u03b3\u0383\3\2"+
		"\2\2\u03b3\u0384\3\2\2\2\u03b3\u0385\3\2\2\2\u03b3\u0386\3\2\2\2\u03b3"+
		"\u0387\3\2\2\2\u03b3\u0388\3\2\2\2\u03b3\u0389\3\2\2\2\u03b3\u038a\3\2"+
		"\2\2\u03b3\u038b\3\2\2\2\u03b3\u038c\3\2\2\2\u03b3\u038d\3\2\2\2\u03b3"+
		"\u038e\3\2\2\2\u03b3\u038f\3\2\2\2\u03b3\u0390\3\2\2\2\u03b3\u0391\3\2"+
		"\2\2\u03b3\u0392\3\2\2\2\u03b3\u0393\3\2\2\2\u03b3\u0394\3\2\2\2\u03b3"+
		"\u0395\3\2\2\2\u03b3\u0396\3\2\2\2\u03b3\u0397\3\2\2\2\u03b3\u0398\3\2"+
		"\2\2\u03b3\u0399\3\2\2\2\u03b3\u039a\3\2\2\2\u03b3\u039b\3\2\2\2\u03b3"+
		"\u039c\3\2\2\2\u03b3\u039d\3\2\2\2\u03b3\u039e\3\2\2\2\u03b3\u039f\3\2"+
		"\2\2\u03b3\u03a0\3\2\2\2\u03b3\u03a1\3\2\2\2\u03b3\u03a2\3\2\2\2\u03b3"+
		"\u03a3\3\2\2\2\u03b3\u03a4\3\2\2\2\u03b3\u03a5\3\2\2\2\u03b3\u03a6\3\2"+
		"\2\2\u03b3\u03a7\3\2\2\2\u03b3\u03a8\3\2\2\2\u03b3\u03a9\3\2\2\2\u03b3"+
		"\u03aa\3\2\2\2\u03b3\u03ab\3\2\2\2\u03b3\u03ac\3\2\2\2\u03b3\u03ad\3\2"+
		"\2\2\u03b3\u03ae\3\2\2\2\u03b3\u03af\3\2\2\2\u03b3\u03b0\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b3\u03b2\3\2\2\2\u03b4\u0095\3\2\2\2\u03b5\u03b6\7\u00a4"+
		"\2\2\u03b6\u03b7\7\u00d0\2\2\u03b7\u03b8\7\u00ee\2\2\u03b8\u03b9\5\u0098"+
		"M\2\u03b9\u03ba\7\u00ef\2\2\u03ba\u03c1\3\2\2\2\u03bb\u03bc\7\u00a4\2"+
		"\2\u03bc\u03bd\7\u00ee\2\2\u03bd\u03be\5\u0098M\2\u03be\u03bf\7\u00ef"+
		"\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03b5\3\2\2\2\u03c0\u03bb\3\2\2\2\u03c1"+
		"\u0097\3\2\2\2\u03c2\u03c3\bM\1\2\u03c3\u03c4\5\u009aN\2\u03c4\u03c9\3"+
		"\2\2\2\u03c5\u03c6\f\3\2\2\u03c6\u03c8\5\u009aN\2\u03c7\u03c5\3\2\2\2"+
		"\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u0099"+
		"\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03cd\5\u0090I\2\u03cd\u03ce\5\u009c"+
		"O\2\u03ce\u03cf\7\u00f4\2\2\u03cf\u03d6\3\2\2\2\u03d0\u03d1\5\u00acW\2"+
		"\u03d1\u03d2\5\u0090I\2\u03d2\u03d3\5\u009cO\2\u03d3\u03d4\7\u00f4\2\2"+
		"\u03d4\u03d6\3\2\2\2\u03d5\u03cc\3\2\2\2\u03d5\u03d0\3\2\2\2\u03d6\u009b"+
		"\3\2\2\2\u03d7\u03d8\bO\1\2\u03d8\u03d9\5\u009eP\2\u03d9\u03df\3\2\2\2"+
		"\u03da\u03db\f\3\2\2\u03db\u03dc\7\u00f1\2\2\u03dc\u03de\5\u009eP\2\u03dd"+
		"\u03da\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2"+
		"\2\2\u03e0\u009d\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e6\7\u00d0\2\2\u03e3"+
		"\u03e4\7\u00d0\2\2\u03e4\u03e6\5\u0092J\2\u03e5\u03e2\3\2\2\2\u03e5\u03e3"+
		"\3\2\2\2\u03e6\u009f\3\2\2\2\u03e7\u03e8\7+\2\2\u03e8\u00a1\3\2\2\2\u03e9"+
		"\u03ea\t\4\2\2\u03ea\u00a3\3\2\2\2\u03eb\u03ec\7\17\2\2\u03ec\u03ed\7"+
		"\u00ea\2\2\u03ed\u03ee\5\u00a6T\2\u03ee\u03ef\7\u00eb\2\2\u03ef\u00a5"+
		"\3\2\2\2\u03f0\u03f1\bT\1\2\u03f1\u03f2\5\u00a8U\2\u03f2\u03f8\3\2\2\2"+
		"\u03f3\u03f4\f\3\2\2\u03f4\u03f5\7\u00f1\2\2\u03f5\u03f7\5\u00a8U\2\u03f6"+
		"\u03f3\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2"+
		"\2\2\u03f9\u00a7\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u0401\7\u00d0\2\2\u03fc"+
		"\u03fd\7\u00d0\2\2\u03fd\u03fe\7\u00f3\2\2\u03fe\u0401\5\u008cG\2\u03ff"+
		"\u0401\7\b\2\2\u0400\u03fb\3\2\2\2\u0400\u03fc\3\2\2\2\u0400\u03ff\3\2"+
		"\2\2\u0401\u00a9\3\2\2\2\u0402\u0403\7,\2\2\u0403\u00ab\3\2\2\2\u0404"+
		"\u0405\bW\1\2\u0405\u0406\5\u00aeX\2\u0406\u040b\3\2\2\2\u0407\u0408\f"+
		"\3\2\2\u0408\u040a\5\u00aeX\2\u0409\u0407\3\2\2\2\u040a\u040d\3\2\2\2"+
		"\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u00ad\3\2\2\2\u040d\u040b"+
		"\3\2\2\2\u040e\u0415\5\u00b0Y\2\u040f\u0415\5\u00a4S\2\u0410\u0415\5\u00b2"+
		"Z\2\u0411\u0415\5\u00a2R\2\u0412\u0415\5\u00a0Q\2\u0413\u0415\5\u00aa"+
		"V\2\u0414\u040e\3\2\2\2\u0414\u040f\3\2\2\2\u0414\u0410\3\2\2\2\u0414"+
		"\u0411\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u00af\3\2"+
		"\2\2\u0416\u042e\7\4\2\2\u0417\u042e\7\3\2\2\u0418\u042e\7\6\2\2\u0419"+
		"\u042e\7#\2\2\u041a\u042e\7!\2\2\u041b\u042e\7\"\2\2\u041c\u042e\7\20"+
		"\2\2\u041d\u042e\7\24\2\2\u041e\u042e\7\25\2\2\u041f\u042e\7\5\2\2\u0420"+
		"\u042e\7\7\2\2\u0421\u042e\7\b\2\2\u0422\u042e\7\t\2\2\u0423\u042e\7\n"+
		"\2\2\u0424\u042e\7\13\2\2\u0425\u042e\7\f\2\2\u0426\u042e\7\r\2\2\u0427"+
		"\u042e\7 \2\2\u0428\u0429\7 \2\2\u0429\u042a\7\u00ea\2\2\u042a\u042b\5"+
		"\u008eH\2\u042b\u042c\7\u00eb\2\2\u042c\u042e\3\2\2\2\u042d\u0416\3\2"+
		"\2\2\u042d\u0417\3\2\2\2\u042d\u0418\3\2\2\2\u042d\u0419\3\2\2\2\u042d"+
		"\u041a\3\2\2\2\u042d\u041b\3\2\2\2\u042d\u041c\3\2\2\2\u042d\u041d\3\2"+
		"\2\2\u042d\u041e\3\2\2\2\u042d\u041f\3\2\2\2\u042d\u0420\3\2\2\2\u042d"+
		"\u0421\3\2\2\2\u042d\u0422\3\2\2\2\u042d\u0423\3\2\2\2\u042d\u0424\3\2"+
		"\2\2\u042d\u0425\3\2\2\2\u042d\u0426\3\2\2\2\u042d\u0427\3\2\2\2\u042d"+
		"\u0428\3\2\2\2\u042e\u00b1\3\2\2\2\u042f\u0430\t\5\2\2\u0430\u00b3\3\2"+
		"\2\2M\u00d9\u00ea\u00f2\u00fd\u010b\u0115\u012f\u0131\u0147\u014d\u0159"+
		"\u0163\u016a\u0173\u017b\u017f\u0183\u018b\u0194\u019b\u01a8\u01b0\u01bc"+
		"\u01c4\u01db\u01df\u01e3\u01ec\u01fa\u01ff\u0202\u0206\u021b\u022a\u023a"+
		"\u023c\u0249\u024f\u0252\u025e\u026e\u0270\u027c\u027e\u028a\u028c\u029e"+
		"\u02a0\u02ac\u02ae\u02b9\u02c4\u02cf\u02da\u02e5\u02f0\u02fa\u0301\u030d"+
		"\u031a\u0321\u032a\u0334\u0336\u03b3\u03c0\u03c9\u03d5\u03df\u03e5\u03f8"+
		"\u0400\u040b\u0414\u042d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}