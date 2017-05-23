// Generated from grammar/GLSLPP.g4 by ANTLR 4.7
package org.cakelab.glsl.pp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INCLUDE=5, DEFINE=6, UNDEF=7, IFDEF=8, 
		IFNDEF=9, ELIF=10, ENDIF=11, ERROR=12, PRAGMA=13, EXTENSION=14, VERSION=15, 
		LINE=16, PPOP_DEFINED=17, PPBUILTIN_LINE=18, PPBUILTIN_FILE=19, PPBUILTIN_VERSION=20, 
		CORE=21, COMPATIBILITY=22, ES=23, ATTRIBUTE=24, CONST=25, UNIFORM=26, 
		VARYING=27, BUFFER=28, SHARED=29, COHERENT=30, VOLATILE=31, RESTRICT=32, 
		READONLY=33, WRITEONLY=34, ATOMIC_UINT=35, LAYOUT=36, CENTROID=37, FLAT=38, 
		SMOOTH=39, NOPERSPECTIVE=40, PATCH=41, SAMPLE=42, BREAK=43, CONTINUE=44, 
		DO=45, FOR=46, WHILE=47, SWITCH=48, CASE=49, DEFAULT=50, IF=51, ELSE=52, 
		SUBROUTINE=53, IN=54, OUT=55, INOUT=56, FLOAT=57, DOUBLE=58, INT=59, VOID=60, 
		BOOL=61, TRUE=62, FALSE=63, INVARIANT=64, PRECISE=65, DISCARD=66, RETURN=67, 
		MAT2=68, MAT3=69, MAT4=70, DMAT2=71, DMAT3=72, DMAT4=73, MAT2X2=74, MAT2X3=75, 
		MAT2X4=76, DMAT2X2=77, DMAT2X3=78, DMAT2X4=79, MAT3X2=80, MAT3X3=81, MAT3X4=82, 
		DMAT3X2=83, DMAT3X3=84, DMAT3X4=85, MAT4X2=86, MAT4X3=87, MAT4X4=88, DMAT4X2=89, 
		DMAT4X3=90, DMAT4X4=91, VEC2=92, VEC3=93, VEC4=94, IVEC2=95, IVEC3=96, 
		IVEC4=97, BVEC2=98, BVEC3=99, BVEC4=100, DVEC2=101, DVEC3=102, DVEC4=103, 
		UINT=104, UVEC2=105, UVEC3=106, UVEC4=107, LOW_PRECISION=108, MEDIUM_PRECISION=109, 
		HIGH_PRECISION=110, PRECISION=111, SAMPLER1D=112, SAMPLER2D=113, SAMPLER3D=114, 
		SAMPLERCUBE=115, SAMPLER1DSHADOW=116, SAMPLER2DSHADOW=117, SAMPLERCUBESHADOW=118, 
		SAMPLER1DARRAY=119, SAMPLER2DARRAY=120, SAMPLER1DARRAYSHADOW=121, SAMPLER2DARRAYSHADOW=122, 
		ISAMPLER1D=123, ISAMPLER2D=124, ISAMPLER3D=125, ISAMPLERCUBE=126, ISAMPLER1DARRAY=127, 
		ISAMPLER2DARRAY=128, USAMPLER1D=129, USAMPLER2D=130, USAMPLER3D=131, USAMPLERCUBE=132, 
		USAMPLER1DARRAY=133, USAMPLER2DARRAY=134, SAMPLER2DRECT=135, SAMPLER2DRECTSHADOW=136, 
		ISAMPLER2DRECT=137, USAMPLER2DRECT=138, SAMPLERBUFFER=139, ISAMPLERBUFFER=140, 
		USAMPLERBUFFER=141, SAMPLER2DMS=142, ISAMPLER2DMS=143, USAMPLER2DMS=144, 
		SAMPLER2DMSARRAY=145, ISAMPLER2DMSARRAY=146, USAMPLER2DMSARRAY=147, SAMPLERCUBEARRAY=148, 
		SAMPLERCUBEARRAYSHADOW=149, ISAMPLERCUBEARRAY=150, USAMPLERCUBEARRAY=151, 
		IMAGE1D=152, IIMAGE1D=153, UIMAGE1D=154, IMAGE2D=155, IIMAGE2D=156, UIMAGE2D=157, 
		IMAGE3D=158, IIMAGE3D=159, UIMAGE3D=160, IMAGE2DRECT=161, IIMAGE2DRECT=162, 
		UIMAGE2DRECT=163, IMAGECUBE=164, IIMAGECUBE=165, UIMAGECUBE=166, IMAGEBUFFER=167, 
		IIMAGEBUFFER=168, UIMAGEBUFFER=169, IMAGE1DARRAY=170, IIMAGE1DARRAY=171, 
		UIMAGE1DARRAY=172, IMAGE2DARRAY=173, IIMAGE2DARRAY=174, UIMAGE2DARRAY=175, 
		IMAGECUBEARRAY=176, IIMAGECUBEARRAY=177, UIMAGECUBEARRAY=178, IMAGE2DMS=179, 
		IIMAGE2DMS=180, UIMAGE2DMS=181, IMAGE2DMSARRAY=182, IIMAGE2DMSARRAY=183, 
		UIMAGE2DMSARRAY=184, STRUCT=185, COMMON=186, PARTITION=187, ACTIVE=188, 
		ASM=189, CLASS=190, UNION=191, ENUM=192, TYPEDEF=193, TEMPLATE=194, THIS=195, 
		RESOURCE=196, GOTO=197, INLINE=198, NOINLINE=199, PUBLIC=200, STATIC=201, 
		EXTERN=202, EXTERNAL=203, INTERFACE=204, LONG=205, SHORT=206, HALF=207, 
		FIXED=208, UNSIGNED=209, SUPERP=210, INPUT=211, OUTPUT=212, HVEC2=213, 
		HVEC3=214, HVEC4=215, FVEC2=216, FVEC3=217, FVEC4=218, SAMPLER3DRECT=219, 
		FILTER=220, SIZEOF=221, CAST=222, NAMESPACE=223, USING=224, SAMPLEREXTERNALOES=225, 
		MULTILINE_COMMENT=226, SINGLELINE_COMMENT=227, BOOLCONSTANT=228, IDENTIFIER=229, 
		FLOATCONSTANT=230, DOUBLECONSTANT=231, INTCONSTANT=232, UINTCONSTANT=233, 
		LEFT_OP=234, RIGHT_OP=235, INC_OP=236, DEC_OP=237, LE_OP=238, GE_OP=239, 
		EQ_OP=240, NE_OP=241, AND_OP=242, OR_OP=243, XOR_OP=244, MUL_ASSIGN=245, 
		DIV_ASSIGN=246, ADD_ASSIGN=247, MOD_ASSIGN=248, LEFT_ASSIGN=249, RIGHT_ASSIGN=250, 
		AND_ASSIGN=251, XOR_ASSIGN=252, OR_ASSIGN=253, SUB_ASSIGN=254, LEFT_PAREN=255, 
		RIGHT_PAREN=256, LEFT_BRACKET=257, RIGHT_BRACKET=258, LEFT_BRACE=259, 
		RIGHT_BRACE=260, DOT=261, COMMA=262, COLON=263, EQUAL=264, SEMICOLON=265, 
		BANG=266, DASH=267, TILDE=268, PLUS=269, STAR=270, SLASH=271, PERCENT=272, 
		LEFT_ANGLE=273, RIGHT_ANGLE=274, VERTICAL_BAR=275, CARET=276, AMPERSAND=277, 
		QUESTION=278, HASH=279, PPOP_CONCAT=280, DOUBLE_QUOTE=281, SINGLE_QUOTE=282, 
		DOTS=283, IDENTIFIER_LEFT_PAREN=284, CRLF=285, HIDDEN_CRLF=286, WHITESPACE=287, 
		LINE_CONTINUATION=288, CHARACTER_CONSTANT=289, PREFIXED_CHARACTER_CONSTANT=290, 
		STRING_LITERAL=291, STD_HEADER_NAME=292, PREFIXED_STRING_LITERAL=293;
	public static final int
		RULE_glslppPreprocessingFile = 0, RULE_glslppGroup = 1, RULE_glslppGroupPart = 2, 
		RULE_glslppIfSection = 3, RULE_glslppIfGroup = 4, RULE_glslppElifGroups = 5, 
		RULE_glslppElifGroup = 6, RULE_glslppElseGroup = 7, RULE_glslppEndifLine = 8, 
		RULE_glslppControlLine = 9, RULE_glslppExtensionBehaviour = 10, RULE_glslppProfile = 11, 
		RULE_glslppIdentifierList = 12, RULE_glslppTextLine = 13, RULE_glslppNonDirective = 14, 
		RULE_glslppReplacementList = 15, RULE_glslppTokens = 16, RULE_glslppPreprocessingToken = 17, 
		RULE_glslppCharacterConstant = 18, RULE_glslppStringLiteral = 19, RULE_glslppHeaderName = 20, 
		RULE_glslppIdentifier = 21, RULE_glslppNumber = 22, RULE_glslppSign = 23, 
		RULE_glslppPunctuator = 24, RULE_glslppUnspecifiedToken = 25, RULE_glslFieldSelection = 26, 
		RULE_glslVariableIdentifier = 27, RULE_glslTypeName = 28, RULE_glslPrimaryExpression = 29, 
		RULE_glslIntegerConstant = 30, RULE_glslUnsignedIntegerConstant = 31, 
		RULE_glslFloatConstant = 32, RULE_glslDoubleConstant = 33, RULE_glslPostfixExpression = 34, 
		RULE_glslFunctionCallArguments = 35, RULE_glslConstructorCallArguments = 36, 
		RULE_glslCallArguments = 37, RULE_glslIntegerExpression = 38, RULE_glslUnaryExpression = 39, 
		RULE_glslUnaryOperator = 40, RULE_glslMultiplicativeExpression = 41, RULE_glslAdditiveExpression = 42, 
		RULE_glslShiftExpression = 43, RULE_glslRelationalExpression = 44, RULE_glslEqualityExpression = 45, 
		RULE_glslAndExpression = 46, RULE_glslExclusiveOrExpression = 47, RULE_glslInclusiveOrExpression = 48, 
		RULE_glslLogicalAndExpression = 49, RULE_glslLogicalXorExpression = 50, 
		RULE_glslLogicalOrExpression = 51, RULE_glslConditionalExpression = 52, 
		RULE_glslAssignmentExpression = 53, RULE_glslAssignmentOperator = 54, 
		RULE_glslExpression = 55, RULE_glslConstantExpression = 56, RULE_glslTypeNameList = 57, 
		RULE_glslTypeSpecifier = 58, RULE_glslArraySpecifier = 59, RULE_glslTypeSpecifierNonarray = 60, 
		RULE_glslStructSpecifier = 61, RULE_glslStructDeclarationList = 62, RULE_glslStructDeclaration = 63, 
		RULE_glslStructDeclaratorList = 64, RULE_glslStructDeclarator = 65, RULE_glslInvariantQualifier = 66, 
		RULE_glslInterpolationQualifier = 67, RULE_glslLayoutQualifier = 68, RULE_glslLayoutQualifierIdList = 69, 
		RULE_glslLayoutQualifierId = 70, RULE_glslPreciseQualifier = 71, RULE_glslTypeQualifier = 72, 
		RULE_glslSingleTypeQualifier = 73, RULE_glslStorageQualifier = 74, RULE_glslPrecisionQualifier = 75;
	public static final String[] ruleNames = {
		"glslppPreprocessingFile", "glslppGroup", "glslppGroupPart", "glslppIfSection", 
		"glslppIfGroup", "glslppElifGroups", "glslppElifGroup", "glslppElseGroup", 
		"glslppEndifLine", "glslppControlLine", "glslppExtensionBehaviour", "glslppProfile", 
		"glslppIdentifierList", "glslppTextLine", "glslppNonDirective", "glslppReplacementList", 
		"glslppTokens", "glslppPreprocessingToken", "glslppCharacterConstant", 
		"glslppStringLiteral", "glslppHeaderName", "glslppIdentifier", "glslppNumber", 
		"glslppSign", "glslppPunctuator", "glslppUnspecifiedToken", "glslFieldSelection", 
		"glslVariableIdentifier", "glslTypeName", "glslPrimaryExpression", "glslIntegerConstant", 
		"glslUnsignedIntegerConstant", "glslFloatConstant", "glslDoubleConstant", 
		"glslPostfixExpression", "glslFunctionCallArguments", "glslConstructorCallArguments", 
		"glslCallArguments", "glslIntegerExpression", "glslUnaryExpression", "glslUnaryOperator", 
		"glslMultiplicativeExpression", "glslAdditiveExpression", "glslShiftExpression", 
		"glslRelationalExpression", "glslEqualityExpression", "glslAndExpression", 
		"glslExclusiveOrExpression", "glslInclusiveOrExpression", "glslLogicalAndExpression", 
		"glslLogicalXorExpression", "glslLogicalOrExpression", "glslConditionalExpression", 
		"glslAssignmentExpression", "glslAssignmentOperator", "glslExpression", 
		"glslConstantExpression", "glslTypeNameList", "glslTypeSpecifier", "glslArraySpecifier", 
		"glslTypeSpecifierNonarray", "glslStructSpecifier", "glslStructDeclarationList", 
		"glslStructDeclaration", "glslStructDeclaratorList", "glslStructDeclarator", 
		"glslInvariantQualifier", "glslInterpolationQualifier", "glslLayoutQualifier", 
		"glslLayoutQualifierIdList", "glslLayoutQualifierId", "glslPreciseQualifier", 
		"glslTypeQualifier", "glslSingleTypeQualifier", "glslStorageQualifier", 
		"glslPrecisionQualifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'require'", "'enable'", "'warn'", "'disable'", "'include'", "'define'", 
		"'undef'", "'ifdef'", "'ifndef'", "'elif'", "'endif'", "'error'", "'pragma'", 
		"'extension'", "'version'", "'line'", "'defined'", "'__LINE__'", "'__FILE__'", 
		"'__VERSION__'", "'core'", "'compatibility'", "'es'", "'attribute'", "'const'", 
		"'uniform'", "'varying'", "'buffer'", "'shared'", "'coherent'", "'volatile'", 
		"'restrict'", "'readonly'", "'writeonly'", "'atomic_uint'", "'layout'", 
		"'centroid'", "'flat'", "'smooth'", "'noperspective'", "'patch'", "'sample'", 
		"'break'", "'continue'", "'do'", "'for'", "'while'", "'switch'", "'case'", 
		"'default'", "'if'", "'else'", "'subroutine'", "'in'", "'out'", "'inout'", 
		"'float'", "'double'", "'int'", "'void'", "'bool'", "'true'", "'false'", 
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
		"'uimage2DMSArray'", "'struct'", "'common'", "'partition'", "'active'", 
		"'asm'", "'class'", "'union'", "'enum'", "'typedef'", "'template'", "'this'", 
		"'resource'", "'goto'", "'inline'", "'noinline'", "'public'", "'static'", 
		"'extern'", "'external'", "'interface'", "'long'", "'short'", "'half'", 
		"'fixed'", "'unsigned'", "'superp'", "'input'", "'output'", "'hvec2'", 
		"'hvec3'", "'hvec4'", "'fvec2'", "'fvec3'", "'fvec4'", "'sampler3DRect'", 
		"'filter'", "'sizeof'", "'cast'", "'namespace'", "'using'", "'samplerExternalOES'", 
		null, null, null, null, null, null, null, null, "'<<'", "'>>'", "'++'", 
		"'--'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'^^'", "'*='", 
		"'\\='", "'+='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'-='", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", "'='", 
		"';'", "'!'", "'-'", "'~'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'|'", "'^'", "'&'", "'?'", "'#'", "'##'", "'\"'", "'''", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INCLUDE", "DEFINE", "UNDEF", "IFDEF", "IFNDEF", 
		"ELIF", "ENDIF", "ERROR", "PRAGMA", "EXTENSION", "VERSION", "LINE", "PPOP_DEFINED", 
		"PPBUILTIN_LINE", "PPBUILTIN_FILE", "PPBUILTIN_VERSION", "CORE", "COMPATIBILITY", 
		"ES", "ATTRIBUTE", "CONST", "UNIFORM", "VARYING", "BUFFER", "SHARED", 
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
		"QUESTION", "HASH", "PPOP_CONCAT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "DOTS", 
		"IDENTIFIER_LEFT_PAREN", "CRLF", "HIDDEN_CRLF", "WHITESPACE", "LINE_CONTINUATION", 
		"CHARACTER_CONSTANT", "PREFIXED_CHARACTER_CONSTANT", "STRING_LITERAL", 
		"STD_HEADER_NAME", "PREFIXED_STRING_LITERAL"
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
	public String getGrammarFileName() { return "GLSLPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public static boolean preprocessing = false;

	public GLSLPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GlslppPreprocessingFileContext extends ParserRuleContext {
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GLSLPPParser.EOF, 0); }
		public GlslppPreprocessingFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppPreprocessingFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppPreprocessingFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppPreprocessingFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppPreprocessingFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppPreprocessingFileContext glslppPreprocessingFile() throws RecognitionException {
		GlslppPreprocessingFileContext _localctx = new GlslppPreprocessingFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_glslppPreprocessingFile);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (CRLF - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (WHITESPACE - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0)) {
					{
					setState(152);
					glslppGroup();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(EOF);
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

	public static class GlslppGroupContext extends ParserRuleContext {
		public List<GlslppGroupPartContext> glslppGroupPart() {
			return getRuleContexts(GlslppGroupPartContext.class);
		}
		public GlslppGroupPartContext glslppGroupPart(int i) {
			return getRuleContext(GlslppGroupPartContext.class,i);
		}
		public GlslppGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppGroupContext glslppGroup() throws RecognitionException {
		GlslppGroupContext _localctx = new GlslppGroupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_glslppGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					glslppGroupPart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppGroupPartContext extends ParserRuleContext {
		public GlslppIfSectionContext glslppIfSection() {
			return getRuleContext(GlslppIfSectionContext.class,0);
		}
		public GlslppControlLineContext glslppControlLine() {
			return getRuleContext(GlslppControlLineContext.class,0);
		}
		public GlslppTextLineContext glslppTextLine() {
			return getRuleContext(GlslppTextLineContext.class,0);
		}
		public GlslppGroupPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppGroupPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppGroupPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppGroupPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppGroupPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppGroupPartContext glslppGroupPart() throws RecognitionException {
		GlslppGroupPartContext _localctx = new GlslppGroupPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_glslppGroupPart);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				glslppIfSection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				glslppControlLine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				glslppTextLine();
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

	public static class GlslppIfSectionContext extends ParserRuleContext {
		public GlslppIfGroupContext glslppIfGroup() {
			return getRuleContext(GlslppIfGroupContext.class,0);
		}
		public GlslppEndifLineContext glslppEndifLine() {
			return getRuleContext(GlslppEndifLineContext.class,0);
		}
		public GlslppElifGroupsContext glslppElifGroups() {
			return getRuleContext(GlslppElifGroupsContext.class,0);
		}
		public GlslppElseGroupContext glslppElseGroup() {
			return getRuleContext(GlslppElseGroupContext.class,0);
		}
		public GlslppIfSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIfSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppIfSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppIfSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppIfSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIfSectionContext glslppIfSection() throws RecognitionException {
		GlslppIfSectionContext _localctx = new GlslppIfSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_glslppIfSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			glslppIfGroup();
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(169);
				glslppElifGroups();
				}
				break;
			}
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(172);
				glslppElseGroup();
				}
				break;
			}
			setState(175);
			glslppEndifLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppIfGroupContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode IF() { return getToken(GLSLPPParser.IF, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public TerminalNode IFDEF() { return getToken(GLSLPPParser.IFDEF, 0); }
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public TerminalNode IFNDEF() { return getToken(GLSLPPParser.IFNDEF, 0); }
		public GlslppIfGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIfGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppIfGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppIfGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppIfGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIfGroupContext glslppIfGroup() throws RecognitionException {
		GlslppIfGroupContext _localctx = new GlslppIfGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_glslppIfGroup);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(HASH);
				setState(178);
				match(IF);
				setState(179);
				glslConstantExpression();
				setState(180);
				match(CRLF);
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(181);
					glslppGroup();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(HASH);
				setState(185);
				match(IFDEF);
				setState(186);
				glslppIdentifier();
				setState(187);
				match(CRLF);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(188);
					glslppGroup();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(HASH);
				setState(192);
				match(IFNDEF);
				setState(193);
				glslppIdentifier();
				setState(194);
				match(CRLF);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(195);
					glslppGroup();
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

	public static class GlslppElifGroupsContext extends ParserRuleContext {
		public List<GlslppElifGroupContext> glslppElifGroup() {
			return getRuleContexts(GlslppElifGroupContext.class);
		}
		public GlslppElifGroupContext glslppElifGroup(int i) {
			return getRuleContext(GlslppElifGroupContext.class,i);
		}
		public GlslppElifGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppElifGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppElifGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppElifGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppElifGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppElifGroupsContext glslppElifGroups() throws RecognitionException {
		GlslppElifGroupsContext _localctx = new GlslppElifGroupsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_glslppElifGroups);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200);
					glslppElifGroup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppElifGroupContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode ELIF() { return getToken(GLSLPPParser.ELIF, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public GlslppElifGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppElifGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppElifGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppElifGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppElifGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppElifGroupContext glslppElifGroup() throws RecognitionException {
		GlslppElifGroupContext _localctx = new GlslppElifGroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_glslppElifGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(HASH);
			setState(206);
			match(ELIF);
			setState(207);
			glslConstantExpression();
			setState(208);
			match(CRLF);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(209);
				glslppGroup();
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

	public static class GlslppElseGroupContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode ELSE() { return getToken(GLSLPPParser.ELSE, 0); }
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public GlslppElseGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppElseGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppElseGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppElseGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppElseGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppElseGroupContext glslppElseGroup() throws RecognitionException {
		GlslppElseGroupContext _localctx = new GlslppElseGroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_glslppElseGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(HASH);
			setState(213);
			match(ELSE);
			setState(214);
			match(CRLF);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				glslppGroup();
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

	public static class GlslppEndifLineContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode ENDIF() { return getToken(GLSLPPParser.ENDIF, 0); }
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public GlslppEndifLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppEndifLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppEndifLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppEndifLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppEndifLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppEndifLineContext glslppEndifLine() throws RecognitionException {
		GlslppEndifLineContext _localctx = new GlslppEndifLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_glslppEndifLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(HASH);
			setState(219);
			match(ENDIF);
			setState(220);
			match(CRLF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppControlLineContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode INCLUDE() { return getToken(GLSLPPParser.INCLUDE, 0); }
		public GlslppTokensContext glslppTokens() {
			return getRuleContext(GlslppTokensContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public TerminalNode DEFINE() { return getToken(GLSLPPParser.DEFINE, 0); }
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public GlslppReplacementListContext glslppReplacementList() {
			return getRuleContext(GlslppReplacementListContext.class,0);
		}
		public TerminalNode IDENTIFIER_LEFT_PAREN() { return getToken(GLSLPPParser.IDENTIFIER_LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public GlslppIdentifierListContext glslppIdentifierList() {
			return getRuleContext(GlslppIdentifierListContext.class,0);
		}
		public TerminalNode DOTS() { return getToken(GLSLPPParser.DOTS, 0); }
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public TerminalNode UNDEF() { return getToken(GLSLPPParser.UNDEF, 0); }
		public TerminalNode LINE() { return getToken(GLSLPPParser.LINE, 0); }
		public TerminalNode ERROR() { return getToken(GLSLPPParser.ERROR, 0); }
		public TerminalNode PRAGMA() { return getToken(GLSLPPParser.PRAGMA, 0); }
		public TerminalNode EXTENSION() { return getToken(GLSLPPParser.EXTENSION, 0); }
		public TerminalNode COLON() { return getToken(GLSLPPParser.COLON, 0); }
		public GlslppExtensionBehaviourContext glslppExtensionBehaviour() {
			return getRuleContext(GlslppExtensionBehaviourContext.class,0);
		}
		public TerminalNode VERSION() { return getToken(GLSLPPParser.VERSION, 0); }
		public TerminalNode INTCONSTANT() { return getToken(GLSLPPParser.INTCONSTANT, 0); }
		public GlslppProfileContext glslppProfile() {
			return getRuleContext(GlslppProfileContext.class,0);
		}
		public GlslppNonDirectiveContext glslppNonDirective() {
			return getRuleContext(GlslppNonDirectiveContext.class,0);
		}
		public GlslppControlLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppControlLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppControlLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppControlLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppControlLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppControlLineContext glslppControlLine() throws RecognitionException {
		GlslppControlLineContext _localctx = new GlslppControlLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_glslppControlLine);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(HASH);
				setState(223);
				match(INCLUDE);
				setState(224);
				glslppTokens();
				setState(225);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(HASH);
				setState(228);
				match(DEFINE);
				setState(229);
				glslppIdentifier();
				setState(230);
				glslppReplacementList();
				setState(231);
				match(CRLF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(HASH);
				setState(234);
				match(DEFINE);
				setState(235);
				match(IDENTIFIER_LEFT_PAREN);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(236);
					glslppIdentifierList();
					}
				}

				setState(239);
				match(RIGHT_PAREN);
				setState(240);
				glslppReplacementList();
				setState(241);
				match(CRLF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(HASH);
				setState(244);
				match(DEFINE);
				setState(245);
				match(IDENTIFIER_LEFT_PAREN);
				setState(246);
				match(DOTS);
				setState(247);
				match(RIGHT_PAREN);
				setState(248);
				glslppReplacementList();
				setState(249);
				match(CRLF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(HASH);
				setState(252);
				match(DEFINE);
				setState(253);
				match(IDENTIFIER_LEFT_PAREN);
				setState(254);
				glslppIdentifierList();
				setState(255);
				match(COMMA);
				setState(256);
				match(DOTS);
				setState(257);
				match(RIGHT_PAREN);
				setState(258);
				glslppReplacementList();
				setState(259);
				match(CRLF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(HASH);
				setState(262);
				match(UNDEF);
				setState(263);
				glslppIdentifier();
				setState(264);
				match(CRLF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				match(HASH);
				setState(267);
				match(LINE);
				setState(268);
				glslppTokens();
				setState(269);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				match(HASH);
				setState(272);
				match(ERROR);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0)) {
					{
					setState(273);
					glslppTokens();
					}
				}

				setState(276);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				match(HASH);
				setState(278);
				match(PRAGMA);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0)) {
					{
					setState(279);
					glslppTokens();
					}
				}

				setState(282);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				match(HASH);
				setState(284);
				match(EXTENSION);
				setState(285);
				glslppIdentifier();
				setState(286);
				match(COLON);
				setState(287);
				glslppExtensionBehaviour();
				setState(288);
				match(CRLF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(290);
				match(HASH);
				setState(291);
				match(VERSION);
				setState(292);
				match(INTCONSTANT);
				setState(293);
				glslppProfile();
				setState(294);
				match(CRLF);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(296);
				match(HASH);
				setState(297);
				match(CRLF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(298);
				match(HASH);
				setState(299);
				glslppNonDirective();
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

	public static class GlslppExtensionBehaviourContext extends ParserRuleContext {
		public GlslppExtensionBehaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppExtensionBehaviour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppExtensionBehaviour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppExtensionBehaviour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppExtensionBehaviour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppExtensionBehaviourContext glslppExtensionBehaviour() throws RecognitionException {
		GlslppExtensionBehaviourContext _localctx = new GlslppExtensionBehaviourContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_glslppExtensionBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class GlslppProfileContext extends ParserRuleContext {
		public TerminalNode CORE() { return getToken(GLSLPPParser.CORE, 0); }
		public TerminalNode COMPATIBILITY() { return getToken(GLSLPPParser.COMPATIBILITY, 0); }
		public TerminalNode ES() { return getToken(GLSLPPParser.ES, 0); }
		public GlslppProfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppProfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppProfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppProfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppProfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppProfileContext glslppProfile() throws RecognitionException {
		GlslppProfileContext _localctx = new GlslppProfileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_glslppProfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CORE) | (1L << COMPATIBILITY) | (1L << ES))) != 0)) ) {
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

	public static class GlslppIdentifierListContext extends ParserRuleContext {
		public List<GlslppIdentifierContext> glslppIdentifier() {
			return getRuleContexts(GlslppIdentifierContext.class);
		}
		public GlslppIdentifierContext glslppIdentifier(int i) {
			return getRuleContext(GlslppIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLPPParser.COMMA, i);
		}
		public GlslppIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIdentifierListContext glslppIdentifierList() throws RecognitionException {
		GlslppIdentifierListContext _localctx = new GlslppIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_glslppIdentifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			glslppIdentifier();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					glslppIdentifier();
					}
					} 
				}
				setState(313);
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
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppTextLineContext extends ParserRuleContext {
		public List<TerminalNode> CRLF() { return getTokens(GLSLPPParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(GLSLPPParser.CRLF, i);
		}
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public GlslppTextLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppTextLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppTextLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppTextLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppTextLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppTextLineContext glslppTextLine() throws RecognitionException {
		GlslppTextLineContext _localctx = new GlslppTextLineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_glslppTextLine);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (WHITESPACE - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0)) {
					{
					{
					setState(315);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CRLF) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(CRLF);
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

	public static class GlslppNonDirectiveContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public TerminalNode INCLUDE() { return getToken(GLSLPPParser.INCLUDE, 0); }
		public TerminalNode DEFINE() { return getToken(GLSLPPParser.DEFINE, 0); }
		public TerminalNode UNDEF() { return getToken(GLSLPPParser.UNDEF, 0); }
		public TerminalNode LINE() { return getToken(GLSLPPParser.LINE, 0); }
		public TerminalNode ERROR() { return getToken(GLSLPPParser.ERROR, 0); }
		public TerminalNode PRAGMA() { return getToken(GLSLPPParser.PRAGMA, 0); }
		public TerminalNode EXTENSION() { return getToken(GLSLPPParser.EXTENSION, 0); }
		public TerminalNode VERSION() { return getToken(GLSLPPParser.VERSION, 0); }
		public GlslppTokensContext glslppTokens() {
			return getRuleContext(GlslppTokensContext.class,0);
		}
		public GlslppNonDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppNonDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppNonDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppNonDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppNonDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppNonDirectiveContext glslppNonDirective() throws RecognitionException {
		GlslppNonDirectiveContext _localctx = new GlslppNonDirectiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_glslppNonDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0)) {
				{
				setState(326);
				glslppTokens();
				}
			}

			setState(329);
			match(CRLF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppReplacementListContext extends ParserRuleContext {
		public GlslppTokensContext glslppTokens() {
			return getRuleContext(GlslppTokensContext.class,0);
		}
		public GlslppReplacementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppReplacementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppReplacementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppReplacementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppReplacementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppReplacementListContext glslppReplacementList() throws RecognitionException {
		GlslppReplacementListContext _localctx = new GlslppReplacementListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_glslppReplacementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0)) {
				{
				setState(331);
				glslppTokens();
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

	public static class GlslppTokensContext extends ParserRuleContext {
		public List<GlslppPreprocessingTokenContext> glslppPreprocessingToken() {
			return getRuleContexts(GlslppPreprocessingTokenContext.class);
		}
		public GlslppPreprocessingTokenContext glslppPreprocessingToken(int i) {
			return getRuleContext(GlslppPreprocessingTokenContext.class,i);
		}
		public GlslppTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppTokensContext glslppTokens() throws RecognitionException {
		GlslppTokensContext _localctx = new GlslppTokensContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_glslppTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				glslppPreprocessingToken();
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << INCLUDE) | (1L << DEFINE) | (1L << UNDEF) | (1L << IFDEF) | (1L << IFNDEF) | (1L << ELIF) | (1L << ENDIF) | (1L << ERROR) | (1L << PRAGMA) | (1L << EXTENSION) | (1L << VERSION) | (1L << LINE) | (1L << PPOP_DEFINED) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << CORE) | (1L << COMPATIBILITY) | (1L << ES) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INVARIANT - 64)) | (1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DARRAY - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (SAMPLEREXTERNALOES - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (DOTS - 256)) | (1L << (IDENTIFIER_LEFT_PAREN - 256)) | (1L << (HIDDEN_CRLF - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (STD_HEADER_NAME - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppPreprocessingTokenContext extends ParserRuleContext {
		public GlslppHeaderNameContext glslppHeaderName() {
			return getRuleContext(GlslppHeaderNameContext.class,0);
		}
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public GlslppNumberContext glslppNumber() {
			return getRuleContext(GlslppNumberContext.class,0);
		}
		public GlslppCharacterConstantContext glslppCharacterConstant() {
			return getRuleContext(GlslppCharacterConstantContext.class,0);
		}
		public GlslppStringLiteralContext glslppStringLiteral() {
			return getRuleContext(GlslppStringLiteralContext.class,0);
		}
		public GlslppPunctuatorContext glslppPunctuator() {
			return getRuleContext(GlslppPunctuatorContext.class,0);
		}
		public GlslppUnspecifiedTokenContext glslppUnspecifiedToken() {
			return getRuleContext(GlslppUnspecifiedTokenContext.class,0);
		}
		public GlslppPreprocessingTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppPreprocessingToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppPreprocessingToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppPreprocessingToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppPreprocessingToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppPreprocessingTokenContext glslppPreprocessingToken() throws RecognitionException {
		GlslppPreprocessingTokenContext _localctx = new GlslppPreprocessingTokenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_glslppPreprocessingToken);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				glslppHeaderName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				glslppIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				glslppNumber();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				glslppCharacterConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				glslppStringLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				glslppPunctuator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				glslppUnspecifiedToken();
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

	public static class GlslppCharacterConstantContext extends ParserRuleContext {
		public TerminalNode CHARACTER_CONSTANT() { return getToken(GLSLPPParser.CHARACTER_CONSTANT, 0); }
		public TerminalNode PREFIXED_CHARACTER_CONSTANT() { return getToken(GLSLPPParser.PREFIXED_CHARACTER_CONSTANT, 0); }
		public GlslppCharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppCharacterConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppCharacterConstantContext glslppCharacterConstant() throws RecognitionException {
		GlslppCharacterConstantContext _localctx = new GlslppCharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_glslppCharacterConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==CHARACTER_CONSTANT || _la==PREFIXED_CHARACTER_CONSTANT) ) {
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

	public static class GlslppStringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GLSLPPParser.STRING_LITERAL, 0); }
		public TerminalNode PREFIXED_STRING_LITERAL() { return getToken(GLSLPPParser.PREFIXED_STRING_LITERAL, 0); }
		public GlslppStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppStringLiteralContext glslppStringLiteral() throws RecognitionException {
		GlslppStringLiteralContext _localctx = new GlslppStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_glslppStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==PREFIXED_STRING_LITERAL) ) {
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

	public static class GlslppHeaderNameContext extends ParserRuleContext {
		public TerminalNode STD_HEADER_NAME() { return getToken(GLSLPPParser.STD_HEADER_NAME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GLSLPPParser.STRING_LITERAL, 0); }
		public GlslppHeaderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppHeaderName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppHeaderName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppHeaderName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppHeaderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppHeaderNameContext glslppHeaderName() throws RecognitionException {
		GlslppHeaderNameContext _localctx = new GlslppHeaderNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_glslppHeaderName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==STD_HEADER_NAME) ) {
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

	public static class GlslppIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslppIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIdentifierContext glslppIdentifier() throws RecognitionException {
		GlslppIdentifierContext _localctx = new GlslppIdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_glslppIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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

	public static class GlslppNumberContext extends ParserRuleContext {
		public TerminalNode INTCONSTANT() { return getToken(GLSLPPParser.INTCONSTANT, 0); }
		public TerminalNode UINTCONSTANT() { return getToken(GLSLPPParser.UINTCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(GLSLPPParser.DOUBLECONSTANT, 0); }
		public TerminalNode FLOATCONSTANT() { return getToken(GLSLPPParser.FLOATCONSTANT, 0); }
		public GlslppNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppNumberContext glslppNumber() throws RecognitionException {
		GlslppNumberContext _localctx = new GlslppNumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_glslppNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !(((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (FLOATCONSTANT - 230)) | (1L << (DOUBLECONSTANT - 230)) | (1L << (INTCONSTANT - 230)) | (1L << (UINTCONSTANT - 230)))) != 0)) ) {
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

	public static class GlslppSignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GLSLPPParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLPPParser.DASH, 0); }
		public GlslppSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppSignContext glslppSign() throws RecognitionException {
		GlslppSignContext _localctx = new GlslppSignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_glslppSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(358);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class GlslppPunctuatorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode PPOP_CONCAT() { return getToken(GLSLPPParser.PPOP_CONCAT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLPPParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLPPParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLPPParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLPPParser.RIGHT_BRACE, 0); }
		public TerminalNode DOT() { return getToken(GLSLPPParser.DOT, 0); }
		public TerminalNode INC_OP() { return getToken(GLSLPPParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLPPParser.DEC_OP, 0); }
		public TerminalNode AMPERSAND() { return getToken(GLSLPPParser.AMPERSAND, 0); }
		public TerminalNode STAR() { return getToken(GLSLPPParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(GLSLPPParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLPPParser.DASH, 0); }
		public TerminalNode TILDE() { return getToken(GLSLPPParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(GLSLPPParser.BANG, 0); }
		public TerminalNode SLASH() { return getToken(GLSLPPParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GLSLPPParser.PERCENT, 0); }
		public TerminalNode LEFT_OP() { return getToken(GLSLPPParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLPPParser.RIGHT_OP, 0); }
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLPPParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(GLSLPPParser.RIGHT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLPPParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLPPParser.GE_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(GLSLPPParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLPPParser.NE_OP, 0); }
		public TerminalNode CARET() { return getToken(GLSLPPParser.CARET, 0); }
		public TerminalNode VERTICAL_BAR() { return getToken(GLSLPPParser.VERTICAL_BAR, 0); }
		public TerminalNode AND_OP() { return getToken(GLSLPPParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(GLSLPPParser.OR_OP, 0); }
		public TerminalNode QUESTION() { return getToken(GLSLPPParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GLSLPPParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLPPParser.SEMICOLON, 0); }
		public TerminalNode DOTS() { return getToken(GLSLPPParser.DOTS, 0); }
		public TerminalNode EQUAL() { return getToken(GLSLPPParser.EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GLSLPPParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GLSLPPParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GLSLPPParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GLSLPPParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GLSLPPParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(GLSLPPParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(GLSLPPParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GLSLPPParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GLSLPPParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GLSLPPParser.OR_ASSIGN, 0); }
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public GlslppPunctuatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppPunctuator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppPunctuator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppPunctuator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppPunctuator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppPunctuatorContext glslppPunctuator() throws RecognitionException {
		GlslppPunctuatorContext _localctx = new GlslppPunctuatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_glslppPunctuator);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(HASH);
				}
				break;
			case PPOP_CONCAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(PPOP_CONCAT);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(LEFT_BRACKET);
				}
				break;
			case RIGHT_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(RIGHT_BRACKET);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				match(LEFT_PAREN);
				}
				break;
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				match(LEFT_BRACE);
				}
				break;
			case RIGHT_BRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				match(RIGHT_BRACE);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 9);
				{
				setState(369);
				match(DOT);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 10);
				{
				setState(370);
				match(INC_OP);
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 11);
				{
				setState(371);
				match(DEC_OP);
				}
				break;
			case AMPERSAND:
				enterOuterAlt(_localctx, 12);
				{
				setState(372);
				match(AMPERSAND);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(373);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(374);
				match(PLUS);
				}
				break;
			case DASH:
				enterOuterAlt(_localctx, 15);
				{
				setState(375);
				match(DASH);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 16);
				{
				setState(376);
				match(TILDE);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 17);
				{
				setState(377);
				match(BANG);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 18);
				{
				setState(378);
				match(SLASH);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 19);
				{
				setState(379);
				match(PERCENT);
				}
				break;
			case LEFT_OP:
				enterOuterAlt(_localctx, 20);
				{
				setState(380);
				match(LEFT_OP);
				}
				break;
			case RIGHT_OP:
				enterOuterAlt(_localctx, 21);
				{
				setState(381);
				match(RIGHT_OP);
				}
				break;
			case LEFT_ANGLE:
				enterOuterAlt(_localctx, 22);
				{
				setState(382);
				match(LEFT_ANGLE);
				setState(383);
				match(RIGHT_ANGLE);
				}
				break;
			case LE_OP:
				enterOuterAlt(_localctx, 23);
				{
				setState(384);
				match(LE_OP);
				}
				break;
			case GE_OP:
				enterOuterAlt(_localctx, 24);
				{
				setState(385);
				match(GE_OP);
				}
				break;
			case EQ_OP:
				enterOuterAlt(_localctx, 25);
				{
				setState(386);
				match(EQ_OP);
				}
				break;
			case NE_OP:
				enterOuterAlt(_localctx, 26);
				{
				setState(387);
				match(NE_OP);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 27);
				{
				setState(388);
				match(CARET);
				}
				break;
			case VERTICAL_BAR:
				enterOuterAlt(_localctx, 28);
				{
				setState(389);
				match(VERTICAL_BAR);
				}
				break;
			case AND_OP:
				enterOuterAlt(_localctx, 29);
				{
				setState(390);
				match(AND_OP);
				}
				break;
			case OR_OP:
				enterOuterAlt(_localctx, 30);
				{
				setState(391);
				match(OR_OP);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 31);
				{
				setState(392);
				match(QUESTION);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 32);
				{
				setState(393);
				match(COLON);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 33);
				{
				setState(394);
				match(SEMICOLON);
				}
				break;
			case DOTS:
				enterOuterAlt(_localctx, 34);
				{
				setState(395);
				match(DOTS);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 35);
				{
				setState(396);
				match(EQUAL);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 36);
				{
				setState(397);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 37);
				{
				setState(398);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 38);
				{
				setState(399);
				match(MOD_ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 39);
				{
				setState(400);
				match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 40);
				{
				setState(401);
				match(SUB_ASSIGN);
				}
				break;
			case LEFT_ASSIGN:
				enterOuterAlt(_localctx, 41);
				{
				setState(402);
				match(LEFT_ASSIGN);
				}
				break;
			case RIGHT_ASSIGN:
				enterOuterAlt(_localctx, 42);
				{
				setState(403);
				match(RIGHT_ASSIGN);
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 43);
				{
				setState(404);
				match(AND_ASSIGN);
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 44);
				{
				setState(405);
				match(XOR_ASSIGN);
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 45);
				{
				setState(406);
				match(OR_ASSIGN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 46);
				{
				setState(407);
				match(COMMA);
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

	public static class GlslppUnspecifiedTokenContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GLSLPPParser.STRING_LITERAL, 0); }
		public TerminalNode STD_HEADER_NAME() { return getToken(GLSLPPParser.STD_HEADER_NAME, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public TerminalNode INTCONSTANT() { return getToken(GLSLPPParser.INTCONSTANT, 0); }
		public TerminalNode UINTCONSTANT() { return getToken(GLSLPPParser.UINTCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(GLSLPPParser.DOUBLECONSTANT, 0); }
		public TerminalNode FLOATCONSTANT() { return getToken(GLSLPPParser.FLOATCONSTANT, 0); }
		public TerminalNode CHARACTER_CONSTANT() { return getToken(GLSLPPParser.CHARACTER_CONSTANT, 0); }
		public TerminalNode PREFIXED_CHARACTER_CONSTANT() { return getToken(GLSLPPParser.PREFIXED_CHARACTER_CONSTANT, 0); }
		public TerminalNode PREFIXED_STRING_LITERAL() { return getToken(GLSLPPParser.PREFIXED_STRING_LITERAL, 0); }
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode PPOP_CONCAT() { return getToken(GLSLPPParser.PPOP_CONCAT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLPPParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLPPParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLPPParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLPPParser.RIGHT_BRACE, 0); }
		public TerminalNode DOT() { return getToken(GLSLPPParser.DOT, 0); }
		public TerminalNode INC_OP() { return getToken(GLSLPPParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLPPParser.DEC_OP, 0); }
		public TerminalNode AMPERSAND() { return getToken(GLSLPPParser.AMPERSAND, 0); }
		public TerminalNode STAR() { return getToken(GLSLPPParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(GLSLPPParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLPPParser.DASH, 0); }
		public TerminalNode TILDE() { return getToken(GLSLPPParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(GLSLPPParser.BANG, 0); }
		public TerminalNode SLASH() { return getToken(GLSLPPParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GLSLPPParser.PERCENT, 0); }
		public TerminalNode LEFT_OP() { return getToken(GLSLPPParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLPPParser.RIGHT_OP, 0); }
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLPPParser.LEFT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLPPParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLPPParser.GE_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(GLSLPPParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLPPParser.NE_OP, 0); }
		public TerminalNode CARET() { return getToken(GLSLPPParser.CARET, 0); }
		public TerminalNode VERTICAL_BAR() { return getToken(GLSLPPParser.VERTICAL_BAR, 0); }
		public TerminalNode AND_OP() { return getToken(GLSLPPParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(GLSLPPParser.OR_OP, 0); }
		public TerminalNode QUESTION() { return getToken(GLSLPPParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GLSLPPParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLPPParser.SEMICOLON, 0); }
		public TerminalNode DOTS() { return getToken(GLSLPPParser.DOTS, 0); }
		public TerminalNode EQUAL() { return getToken(GLSLPPParser.EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GLSLPPParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GLSLPPParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GLSLPPParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GLSLPPParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GLSLPPParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(GLSLPPParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(GLSLPPParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GLSLPPParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GLSLPPParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GLSLPPParser.OR_ASSIGN, 0); }
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public TerminalNode WHITESPACE() { return getToken(GLSLPPParser.WHITESPACE, 0); }
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public GlslppUnspecifiedTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppUnspecifiedToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppUnspecifiedToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppUnspecifiedToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppUnspecifiedToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppUnspecifiedTokenContext glslppUnspecifiedToken() throws RecognitionException {
		GlslppUnspecifiedTokenContext _localctx = new GlslppUnspecifiedTokenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_glslppUnspecifiedToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 229)) & ~0x3f) == 0 && ((1L << (_la - 229)) & ((1L << (IDENTIFIER - 229)) | (1L << (FLOATCONSTANT - 229)) | (1L << (DOUBLECONSTANT - 229)) | (1L << (INTCONSTANT - 229)) | (1L << (UINTCONSTANT - 229)) | (1L << (LEFT_OP - 229)) | (1L << (RIGHT_OP - 229)) | (1L << (INC_OP - 229)) | (1L << (DEC_OP - 229)) | (1L << (LE_OP - 229)) | (1L << (GE_OP - 229)) | (1L << (EQ_OP - 229)) | (1L << (NE_OP - 229)) | (1L << (AND_OP - 229)) | (1L << (OR_OP - 229)) | (1L << (MUL_ASSIGN - 229)) | (1L << (DIV_ASSIGN - 229)) | (1L << (ADD_ASSIGN - 229)) | (1L << (MOD_ASSIGN - 229)) | (1L << (LEFT_ASSIGN - 229)) | (1L << (RIGHT_ASSIGN - 229)) | (1L << (AND_ASSIGN - 229)) | (1L << (XOR_ASSIGN - 229)) | (1L << (OR_ASSIGN - 229)) | (1L << (SUB_ASSIGN - 229)) | (1L << (LEFT_PAREN - 229)) | (1L << (RIGHT_PAREN - 229)) | (1L << (LEFT_BRACKET - 229)) | (1L << (RIGHT_BRACKET - 229)) | (1L << (LEFT_BRACE - 229)) | (1L << (RIGHT_BRACE - 229)) | (1L << (DOT - 229)) | (1L << (COMMA - 229)) | (1L << (COLON - 229)) | (1L << (EQUAL - 229)) | (1L << (SEMICOLON - 229)) | (1L << (BANG - 229)) | (1L << (DASH - 229)) | (1L << (TILDE - 229)) | (1L << (PLUS - 229)) | (1L << (STAR - 229)) | (1L << (SLASH - 229)) | (1L << (PERCENT - 229)) | (1L << (LEFT_ANGLE - 229)) | (1L << (VERTICAL_BAR - 229)) | (1L << (CARET - 229)) | (1L << (AMPERSAND - 229)) | (1L << (QUESTION - 229)) | (1L << (HASH - 229)) | (1L << (PPOP_CONCAT - 229)) | (1L << (DOTS - 229)) | (1L << (CRLF - 229)) | (1L << (WHITESPACE - 229)) | (1L << (CHARACTER_CONSTANT - 229)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 229)) | (1L << (STRING_LITERAL - 229)) | (1L << (STD_HEADER_NAME - 229)))) != 0) || _la==PREFIXED_STRING_LITERAL) ) {
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

	public static class GlslFieldSelectionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslFieldSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFieldSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslFieldSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslFieldSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslFieldSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFieldSelectionContext glslFieldSelection() throws RecognitionException {
		GlslFieldSelectionContext _localctx = new GlslFieldSelectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_glslFieldSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslVariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslVariableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslVariableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslVariableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslVariableIdentifierContext glslVariableIdentifier() throws RecognitionException {
		GlslVariableIdentifierContext _localctx = new GlslVariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_glslVariableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeNameContext glslTypeName() throws RecognitionException {
		GlslTypeNameContext _localctx = new GlslTypeNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_glslTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		public TerminalNode BOOLCONSTANT() { return getToken(GLSLPPParser.BOOLCONSTANT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public GlslPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPrimaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPrimaryExpressionContext glslPrimaryExpression() throws RecognitionException {
		GlslPrimaryExpressionContext _localctx = new GlslPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_glslPrimaryExpression);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				glslVariableIdentifier();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				glslUnsignedIntegerConstant();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				glslDoubleConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				match(BOOLCONSTANT);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				match(LEFT_PAREN);
				setState(425);
				glslExpression(0);
				setState(426);
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
		public TerminalNode INTCONSTANT() { return getToken(GLSLPPParser.INTCONSTANT, 0); }
		public GlslIntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslIntegerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIntegerConstantContext glslIntegerConstant() throws RecognitionException {
		GlslIntegerConstantContext _localctx = new GlslIntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_glslIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		public TerminalNode UINTCONSTANT() { return getToken(GLSLPPParser.UINTCONSTANT, 0); }
		public GlslUnsignedIntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslUnsignedIntegerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslUnsignedIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslUnsignedIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslUnsignedIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslUnsignedIntegerConstantContext glslUnsignedIntegerConstant() throws RecognitionException {
		GlslUnsignedIntegerConstantContext _localctx = new GlslUnsignedIntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_glslUnsignedIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		public TerminalNode FLOATCONSTANT() { return getToken(GLSLPPParser.FLOATCONSTANT, 0); }
		public GlslFloatConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFloatConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslFloatConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslFloatConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslFloatConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFloatConstantContext glslFloatConstant() throws RecognitionException {
		GlslFloatConstantContext _localctx = new GlslFloatConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_glslFloatConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		public TerminalNode DOUBLECONSTANT() { return getToken(GLSLPPParser.DOUBLECONSTANT, 0); }
		public GlslDoubleConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslDoubleConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslDoubleConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslDoubleConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslDoubleConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslDoubleConstantContext glslDoubleConstant() throws RecognitionException {
		GlslDoubleConstantContext _localctx = new GlslDoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_glslDoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLPPParser.LEFT_BRACKET, 0); }
		public GlslIntegerExpressionContext glslIntegerExpression() {
			return getRuleContext(GlslIntegerExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLPPParser.RIGHT_BRACKET, 0); }
		public GlslFunctionCallArgumentsContext glslFunctionCallArguments() {
			return getRuleContext(GlslFunctionCallArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GLSLPPParser.DOT, 0); }
		public GlslFieldSelectionContext glslFieldSelection() {
			return getRuleContext(GlslFieldSelectionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(GLSLPPParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLPPParser.DEC_OP, 0); }
		public GlslPostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPostfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslPostfixExpression(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_glslPostfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(439);
				glslPrimaryExpression();
				}
				break;
			case 2:
				{
				setState(440);
				glslTypeSpecifier();
				setState(441);
				glslConstructorCallArguments();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(445);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(446);
						match(LEFT_BRACKET);
						setState(447);
						glslIntegerExpression();
						setState(448);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(450);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(451);
						glslFunctionCallArguments();
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(452);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(453);
						match(DOT);
						setState(454);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(455);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(456);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(457);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(458);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(463);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionCallArgumentsContext glslFunctionCallArguments() throws RecognitionException {
		GlslFunctionCallArgumentsContext _localctx = new GlslFunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_glslFunctionCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslConstructorCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslConstructorCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslConstructorCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConstructorCallArgumentsContext glslConstructorCallArguments() throws RecognitionException {
		GlslConstructorCallArgumentsContext _localctx = new GlslConstructorCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_glslConstructorCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public List<GlslAssignmentExpressionContext> glslAssignmentExpression() {
			return getRuleContexts(GlslAssignmentExpressionContext.class);
		}
		public GlslAssignmentExpressionContext glslAssignmentExpression(int i) {
			return getRuleContext(GlslAssignmentExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GLSLPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLPPParser.COMMA, i);
		}
		public TerminalNode VOID() { return getToken(GLSLPPParser.VOID, 0); }
		public GlslCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslCallArgumentsContext glslCallArguments() throws RecognitionException {
		GlslCallArgumentsContext _localctx = new GlslCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_glslCallArguments);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(LEFT_PAREN);
				setState(469);
				glslAssignmentExpression();
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(470);
					match(COMMA);
					setState(471);
					glslAssignmentExpression();
					}
					}
					setState(474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(476);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(LEFT_PAREN);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(479);
					match(VOID);
					}
				}

				setState(482);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslIntegerExpressionContext glslIntegerExpression() throws RecognitionException {
		GlslIntegerExpressionContext _localctx = new GlslIntegerExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_glslIntegerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		public TerminalNode INC_OP() { return getToken(GLSLPPParser.INC_OP, 0); }
		public GlslUnaryExpressionContext glslUnaryExpression() {
			return getRuleContext(GlslUnaryExpressionContext.class,0);
		}
		public TerminalNode DEC_OP() { return getToken(GLSLPPParser.DEC_OP, 0); }
		public GlslUnaryOperatorContext glslUnaryOperator() {
			return getRuleContext(GlslUnaryOperatorContext.class,0);
		}
		public GlslUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslUnaryExpressionContext glslUnaryExpression() throws RecognitionException {
		GlslUnaryExpressionContext _localctx = new GlslUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_glslUnaryExpression);
		try {
			setState(495);
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
				setState(487);
				glslPostfixExpression(0);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(INC_OP);
				setState(489);
				glslUnaryExpression();
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(DEC_OP);
				setState(491);
				glslUnaryExpression();
				}
				break;
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				glslUnaryOperator();
				setState(493);
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
		public TerminalNode PLUS() { return getToken(GLSLPPParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLPPParser.DASH, 0); }
		public TerminalNode BANG() { return getToken(GLSLPPParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(GLSLPPParser.TILDE, 0); }
		public GlslUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslUnaryOperatorContext glslUnaryOperator() throws RecognitionException {
		GlslUnaryOperatorContext _localctx = new GlslUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_glslUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (BANG - 266)) | (1L << (DASH - 266)) | (1L << (TILDE - 266)) | (1L << (PLUS - 266)))) != 0)) ) {
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
		public TerminalNode STAR() { return getToken(GLSLPPParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(GLSLPPParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GLSLPPParser.PERCENT, 0); }
		public GlslMultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslMultiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslMultiplicativeExpression(this);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_glslMultiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(500);
			glslUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(511);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(502);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(503);
						match(STAR);
						setState(504);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(505);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(506);
						match(SLASH);
						setState(507);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(508);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(509);
						match(PERCENT);
						setState(510);
						glslUnaryExpression();
						}
						break;
					}
					} 
				}
				setState(515);
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

	public static class GlslAdditiveExpressionContext extends ParserRuleContext {
		public GlslMultiplicativeExpressionContext glslMultiplicativeExpression() {
			return getRuleContext(GlslMultiplicativeExpressionContext.class,0);
		}
		public GlslAdditiveExpressionContext glslAdditiveExpression() {
			return getRuleContext(GlslAdditiveExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GLSLPPParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLPPParser.DASH, 0); }
		public GlslAdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAdditiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslAdditiveExpression(this);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_glslAdditiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(517);
			glslMultiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(519);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(520);
						match(PLUS);
						setState(521);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(522);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(523);
						match(DASH);
						setState(524);
						glslMultiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(529);
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

	public static class GlslShiftExpressionContext extends ParserRuleContext {
		public GlslAdditiveExpressionContext glslAdditiveExpression() {
			return getRuleContext(GlslAdditiveExpressionContext.class,0);
		}
		public GlslShiftExpressionContext glslShiftExpression() {
			return getRuleContext(GlslShiftExpressionContext.class,0);
		}
		public TerminalNode LEFT_OP() { return getToken(GLSLPPParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLPPParser.RIGHT_OP, 0); }
		public GlslShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslShiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslShiftExpression(this);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_glslShiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(531);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(539);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(533);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(534);
						match(LEFT_OP);
						setState(535);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(536);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(537);
						match(RIGHT_OP);
						setState(538);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(543);
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

	public static class GlslRelationalExpressionContext extends ParserRuleContext {
		public GlslShiftExpressionContext glslShiftExpression() {
			return getRuleContext(GlslShiftExpressionContext.class,0);
		}
		public GlslRelationalExpressionContext glslRelationalExpression() {
			return getRuleContext(GlslRelationalExpressionContext.class,0);
		}
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLPPParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(GLSLPPParser.RIGHT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLPPParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLPPParser.GE_OP, 0); }
		public GlslRelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslRelationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslRelationalExpression(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_glslRelationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(545);
			glslShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(559);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(547);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(548);
						match(LEFT_ANGLE);
						setState(549);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(550);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(551);
						match(RIGHT_ANGLE);
						setState(552);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(553);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(554);
						match(LE_OP);
						setState(555);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(556);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(557);
						match(GE_OP);
						setState(558);
						glslShiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(563);
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

	public static class GlslEqualityExpressionContext extends ParserRuleContext {
		public GlslRelationalExpressionContext glslRelationalExpression() {
			return getRuleContext(GlslRelationalExpressionContext.class,0);
		}
		public GlslEqualityExpressionContext glslEqualityExpression() {
			return getRuleContext(GlslEqualityExpressionContext.class,0);
		}
		public TerminalNode EQ_OP() { return getToken(GLSLPPParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLPPParser.NE_OP, 0); }
		public GlslEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslEqualityExpression(this);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_glslEqualityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(565);
			glslRelationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(573);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(567);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(568);
						match(EQ_OP);
						setState(569);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(570);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(571);
						match(NE_OP);
						setState(572);
						glslRelationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(577);
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

	public static class GlslAndExpressionContext extends ParserRuleContext {
		public GlslEqualityExpressionContext glslEqualityExpression() {
			return getRuleContext(GlslEqualityExpressionContext.class,0);
		}
		public GlslAndExpressionContext glslAndExpression() {
			return getRuleContext(GlslAndExpressionContext.class,0);
		}
		public TerminalNode AMPERSAND() { return getToken(GLSLPPParser.AMPERSAND, 0); }
		public GlslAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslAndExpression(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_glslAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(579);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(581);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(582);
					match(AMPERSAND);
					setState(583);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode CARET() { return getToken(GLSLPPParser.CARET, 0); }
		public GlslExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslExclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslExclusiveOrExpression(this);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_glslExclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(590);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(592);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(593);
					match(CARET);
					setState(594);
					glslAndExpression(0);
					}
					} 
				}
				setState(599);
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

	public static class GlslInclusiveOrExpressionContext extends ParserRuleContext {
		public GlslExclusiveOrExpressionContext glslExclusiveOrExpression() {
			return getRuleContext(GlslExclusiveOrExpressionContext.class,0);
		}
		public GlslInclusiveOrExpressionContext glslInclusiveOrExpression() {
			return getRuleContext(GlslInclusiveOrExpressionContext.class,0);
		}
		public TerminalNode VERTICAL_BAR() { return getToken(GLSLPPParser.VERTICAL_BAR, 0); }
		public GlslInclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslInclusiveOrExpression(this);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_glslInclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(601);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(603);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(604);
					match(VERTICAL_BAR);
					setState(605);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(610);
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

	public static class GlslLogicalAndExpressionContext extends ParserRuleContext {
		public GlslInclusiveOrExpressionContext glslInclusiveOrExpression() {
			return getRuleContext(GlslInclusiveOrExpressionContext.class,0);
		}
		public GlslLogicalAndExpressionContext glslLogicalAndExpression() {
			return getRuleContext(GlslLogicalAndExpressionContext.class,0);
		}
		public TerminalNode AND_OP() { return getToken(GLSLPPParser.AND_OP, 0); }
		public GlslLogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLogicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslLogicalAndExpression(this);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_glslLogicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(612);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(614);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(615);
					match(AND_OP);
					setState(616);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(621);
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

	public static class GlslLogicalXorExpressionContext extends ParserRuleContext {
		public GlslLogicalAndExpressionContext glslLogicalAndExpression() {
			return getRuleContext(GlslLogicalAndExpressionContext.class,0);
		}
		public GlslLogicalXorExpressionContext glslLogicalXorExpression() {
			return getRuleContext(GlslLogicalXorExpressionContext.class,0);
		}
		public TerminalNode XOR_OP() { return getToken(GLSLPPParser.XOR_OP, 0); }
		public GlslLogicalXorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLogicalXorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslLogicalXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslLogicalXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslLogicalXorExpression(this);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_glslLogicalXorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(623);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(625);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(626);
					match(XOR_OP);
					setState(627);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(632);
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

	public static class GlslLogicalOrExpressionContext extends ParserRuleContext {
		public GlslLogicalXorExpressionContext glslLogicalXorExpression() {
			return getRuleContext(GlslLogicalXorExpressionContext.class,0);
		}
		public GlslLogicalOrExpressionContext glslLogicalOrExpression() {
			return getRuleContext(GlslLogicalOrExpressionContext.class,0);
		}
		public TerminalNode OR_OP() { return getToken(GLSLPPParser.OR_OP, 0); }
		public GlslLogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLogicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslLogicalOrExpression(this);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_glslLogicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(634);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(636);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(637);
					match(OR_OP);
					setState(638);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(643);
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

	public static class GlslConditionalExpressionContext extends ParserRuleContext {
		public GlslLogicalOrExpressionContext glslLogicalOrExpression() {
			return getRuleContext(GlslLogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(GLSLPPParser.QUESTION, 0); }
		public GlslExpressionContext glslExpression() {
			return getRuleContext(GlslExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLPPParser.COLON, 0); }
		public GlslAssignmentExpressionContext glslAssignmentExpression() {
			return getRuleContext(GlslAssignmentExpressionContext.class,0);
		}
		public GlslConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslConditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConditionalExpressionContext glslConditionalExpression() throws RecognitionException {
		GlslConditionalExpressionContext _localctx = new GlslConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_glslConditionalExpression);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				glslLogicalOrExpression(0);
				setState(646);
				match(QUESTION);
				setState(647);
				glslExpression(0);
				setState(648);
				match(COLON);
				setState(649);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslAssignmentExpressionContext glslAssignmentExpression() throws RecognitionException {
		GlslAssignmentExpressionContext _localctx = new GlslAssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_glslAssignmentExpression);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				glslUnaryExpression();
				setState(655);
				glslAssignmentOperator();
				setState(656);
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
		public TerminalNode EQUAL() { return getToken(GLSLPPParser.EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GLSLPPParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GLSLPPParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GLSLPPParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GLSLPPParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GLSLPPParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(GLSLPPParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(GLSLPPParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GLSLPPParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GLSLPPParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GLSLPPParser.OR_ASSIGN, 0); }
		public GlslAssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslAssignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslAssignmentOperatorContext glslAssignmentOperator() throws RecognitionException {
		GlslAssignmentOperatorContext _localctx = new GlslAssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_glslAssignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_la = _input.LA(1);
			if ( !(((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (MUL_ASSIGN - 245)) | (1L << (DIV_ASSIGN - 245)) | (1L << (ADD_ASSIGN - 245)) | (1L << (MOD_ASSIGN - 245)) | (1L << (LEFT_ASSIGN - 245)) | (1L << (RIGHT_ASSIGN - 245)) | (1L << (AND_ASSIGN - 245)) | (1L << (XOR_ASSIGN - 245)) | (1L << (OR_ASSIGN - 245)) | (1L << (SUB_ASSIGN - 245)) | (1L << (EQUAL - 245)))) != 0)) ) {
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
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public GlslExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslExpression(this);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_glslExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(663);
			glslAssignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExpression);
					setState(665);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(666);
					match(COMMA);
					setState(667);
					glslAssignmentExpression();
					}
					} 
				}
				setState(672);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslConstantExpressionContext glslConstantExpression() throws RecognitionException {
		GlslConstantExpressionContext _localctx = new GlslConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_glslConstantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public GlslTypeNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslTypeNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslTypeNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslTypeNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslTypeNameList(this);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_glslTypeNameList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(676);
			glslTypeName();
			}
			_ctx.stop = _input.LT(-1);
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslTypeNameListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslTypeNameList);
					setState(678);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(679);
					match(COMMA);
					setState(680);
					glslTypeName();
					}
					} 
				}
				setState(685);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeSpecifierContext glslTypeSpecifier() throws RecognitionException {
		GlslTypeSpecifierContext _localctx = new GlslTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_glslTypeSpecifier);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				glslTypeSpecifierNonarray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				glslTypeSpecifierNonarray();
				setState(688);
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
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLPPParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLPPParser.RIGHT_BRACKET, 0); }
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslArraySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslArraySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslArraySpecifier(this);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_glslArraySpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(693);
				match(LEFT_BRACKET);
				setState(694);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				{
				setState(695);
				match(LEFT_BRACKET);
				setState(696);
				glslConstantExpression();
				setState(697);
				match(RIGHT_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(709);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new GlslArraySpecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslArraySpecifier);
						setState(701);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(702);
						match(LEFT_BRACKET);
						setState(703);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new GlslArraySpecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslArraySpecifier);
						setState(704);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(705);
						match(LEFT_BRACKET);
						setState(706);
						glslConstantExpression();
						setState(707);
						match(RIGHT_BRACKET);
						}
						break;
					}
					} 
				}
				setState(713);
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

	public static class GlslTypeSpecifierNonarrayContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GLSLPPParser.VOID, 0); }
		public TerminalNode FLOAT() { return getToken(GLSLPPParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(GLSLPPParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(GLSLPPParser.INT, 0); }
		public TerminalNode UINT() { return getToken(GLSLPPParser.UINT, 0); }
		public TerminalNode BOOL() { return getToken(GLSLPPParser.BOOL, 0); }
		public TerminalNode VEC2() { return getToken(GLSLPPParser.VEC2, 0); }
		public TerminalNode VEC3() { return getToken(GLSLPPParser.VEC3, 0); }
		public TerminalNode VEC4() { return getToken(GLSLPPParser.VEC4, 0); }
		public TerminalNode DVEC2() { return getToken(GLSLPPParser.DVEC2, 0); }
		public TerminalNode DVEC3() { return getToken(GLSLPPParser.DVEC3, 0); }
		public TerminalNode DVEC4() { return getToken(GLSLPPParser.DVEC4, 0); }
		public TerminalNode BVEC2() { return getToken(GLSLPPParser.BVEC2, 0); }
		public TerminalNode BVEC3() { return getToken(GLSLPPParser.BVEC3, 0); }
		public TerminalNode BVEC4() { return getToken(GLSLPPParser.BVEC4, 0); }
		public TerminalNode IVEC2() { return getToken(GLSLPPParser.IVEC2, 0); }
		public TerminalNode IVEC3() { return getToken(GLSLPPParser.IVEC3, 0); }
		public TerminalNode IVEC4() { return getToken(GLSLPPParser.IVEC4, 0); }
		public TerminalNode UVEC2() { return getToken(GLSLPPParser.UVEC2, 0); }
		public TerminalNode UVEC3() { return getToken(GLSLPPParser.UVEC3, 0); }
		public TerminalNode UVEC4() { return getToken(GLSLPPParser.UVEC4, 0); }
		public TerminalNode MAT2() { return getToken(GLSLPPParser.MAT2, 0); }
		public TerminalNode MAT3() { return getToken(GLSLPPParser.MAT3, 0); }
		public TerminalNode MAT4() { return getToken(GLSLPPParser.MAT4, 0); }
		public TerminalNode MAT2X2() { return getToken(GLSLPPParser.MAT2X2, 0); }
		public TerminalNode MAT2X3() { return getToken(GLSLPPParser.MAT2X3, 0); }
		public TerminalNode MAT2X4() { return getToken(GLSLPPParser.MAT2X4, 0); }
		public TerminalNode MAT3X2() { return getToken(GLSLPPParser.MAT3X2, 0); }
		public TerminalNode MAT3X3() { return getToken(GLSLPPParser.MAT3X3, 0); }
		public TerminalNode MAT3X4() { return getToken(GLSLPPParser.MAT3X4, 0); }
		public TerminalNode MAT4X2() { return getToken(GLSLPPParser.MAT4X2, 0); }
		public TerminalNode MAT4X3() { return getToken(GLSLPPParser.MAT4X3, 0); }
		public TerminalNode MAT4X4() { return getToken(GLSLPPParser.MAT4X4, 0); }
		public TerminalNode DMAT2() { return getToken(GLSLPPParser.DMAT2, 0); }
		public TerminalNode DMAT3() { return getToken(GLSLPPParser.DMAT3, 0); }
		public TerminalNode DMAT4() { return getToken(GLSLPPParser.DMAT4, 0); }
		public TerminalNode DMAT2X2() { return getToken(GLSLPPParser.DMAT2X2, 0); }
		public TerminalNode DMAT2X3() { return getToken(GLSLPPParser.DMAT2X3, 0); }
		public TerminalNode DMAT2X4() { return getToken(GLSLPPParser.DMAT2X4, 0); }
		public TerminalNode DMAT3X2() { return getToken(GLSLPPParser.DMAT3X2, 0); }
		public TerminalNode DMAT3X3() { return getToken(GLSLPPParser.DMAT3X3, 0); }
		public TerminalNode DMAT3X4() { return getToken(GLSLPPParser.DMAT3X4, 0); }
		public TerminalNode DMAT4X2() { return getToken(GLSLPPParser.DMAT4X2, 0); }
		public TerminalNode DMAT4X3() { return getToken(GLSLPPParser.DMAT4X3, 0); }
		public TerminalNode DMAT4X4() { return getToken(GLSLPPParser.DMAT4X4, 0); }
		public TerminalNode ATOMIC_UINT() { return getToken(GLSLPPParser.ATOMIC_UINT, 0); }
		public TerminalNode SAMPLER1D() { return getToken(GLSLPPParser.SAMPLER1D, 0); }
		public TerminalNode SAMPLER2D() { return getToken(GLSLPPParser.SAMPLER2D, 0); }
		public TerminalNode SAMPLER3D() { return getToken(GLSLPPParser.SAMPLER3D, 0); }
		public TerminalNode SAMPLERCUBE() { return getToken(GLSLPPParser.SAMPLERCUBE, 0); }
		public TerminalNode SAMPLER1DSHADOW() { return getToken(GLSLPPParser.SAMPLER1DSHADOW, 0); }
		public TerminalNode SAMPLER2DSHADOW() { return getToken(GLSLPPParser.SAMPLER2DSHADOW, 0); }
		public TerminalNode SAMPLERCUBESHADOW() { return getToken(GLSLPPParser.SAMPLERCUBESHADOW, 0); }
		public TerminalNode SAMPLER1DARRAY() { return getToken(GLSLPPParser.SAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER2DARRAY() { return getToken(GLSLPPParser.SAMPLER2DARRAY, 0); }
		public TerminalNode SAMPLER1DARRAYSHADOW() { return getToken(GLSLPPParser.SAMPLER1DARRAYSHADOW, 0); }
		public TerminalNode SAMPLER2DARRAYSHADOW() { return getToken(GLSLPPParser.SAMPLER2DARRAYSHADOW, 0); }
		public TerminalNode SAMPLERCUBEARRAY() { return getToken(GLSLPPParser.SAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLERCUBEARRAYSHADOW() { return getToken(GLSLPPParser.SAMPLERCUBEARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER1D() { return getToken(GLSLPPParser.ISAMPLER1D, 0); }
		public TerminalNode ISAMPLER2D() { return getToken(GLSLPPParser.ISAMPLER2D, 0); }
		public TerminalNode ISAMPLER3D() { return getToken(GLSLPPParser.ISAMPLER3D, 0); }
		public TerminalNode ISAMPLERCUBE() { return getToken(GLSLPPParser.ISAMPLERCUBE, 0); }
		public TerminalNode ISAMPLER1DARRAY() { return getToken(GLSLPPParser.ISAMPLER1DARRAY, 0); }
		public TerminalNode ISAMPLER2DARRAY() { return getToken(GLSLPPParser.ISAMPLER2DARRAY, 0); }
		public TerminalNode ISAMPLERCUBEARRAY() { return getToken(GLSLPPParser.ISAMPLERCUBEARRAY, 0); }
		public TerminalNode USAMPLER1D() { return getToken(GLSLPPParser.USAMPLER1D, 0); }
		public TerminalNode USAMPLER2D() { return getToken(GLSLPPParser.USAMPLER2D, 0); }
		public TerminalNode USAMPLER3D() { return getToken(GLSLPPParser.USAMPLER3D, 0); }
		public TerminalNode USAMPLERCUBE() { return getToken(GLSLPPParser.USAMPLERCUBE, 0); }
		public TerminalNode USAMPLER1DARRAY() { return getToken(GLSLPPParser.USAMPLER1DARRAY, 0); }
		public TerminalNode USAMPLER2DARRAY() { return getToken(GLSLPPParser.USAMPLER2DARRAY, 0); }
		public TerminalNode USAMPLERCUBEARRAY() { return getToken(GLSLPPParser.USAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLER2DRECT() { return getToken(GLSLPPParser.SAMPLER2DRECT, 0); }
		public TerminalNode SAMPLER2DRECTSHADOW() { return getToken(GLSLPPParser.SAMPLER2DRECTSHADOW, 0); }
		public TerminalNode ISAMPLER2DRECT() { return getToken(GLSLPPParser.ISAMPLER2DRECT, 0); }
		public TerminalNode USAMPLER2DRECT() { return getToken(GLSLPPParser.USAMPLER2DRECT, 0); }
		public TerminalNode SAMPLERBUFFER() { return getToken(GLSLPPParser.SAMPLERBUFFER, 0); }
		public TerminalNode ISAMPLERBUFFER() { return getToken(GLSLPPParser.ISAMPLERBUFFER, 0); }
		public TerminalNode USAMPLERBUFFER() { return getToken(GLSLPPParser.USAMPLERBUFFER, 0); }
		public TerminalNode SAMPLER2DMS() { return getToken(GLSLPPParser.SAMPLER2DMS, 0); }
		public TerminalNode ISAMPLER2DMS() { return getToken(GLSLPPParser.ISAMPLER2DMS, 0); }
		public TerminalNode USAMPLER2DMS() { return getToken(GLSLPPParser.USAMPLER2DMS, 0); }
		public TerminalNode SAMPLER2DMSARRAY() { return getToken(GLSLPPParser.SAMPLER2DMSARRAY, 0); }
		public TerminalNode ISAMPLER2DMSARRAY() { return getToken(GLSLPPParser.ISAMPLER2DMSARRAY, 0); }
		public TerminalNode USAMPLER2DMSARRAY() { return getToken(GLSLPPParser.USAMPLER2DMSARRAY, 0); }
		public TerminalNode IMAGE1D() { return getToken(GLSLPPParser.IMAGE1D, 0); }
		public TerminalNode IIMAGE1D() { return getToken(GLSLPPParser.IIMAGE1D, 0); }
		public TerminalNode UIMAGE1D() { return getToken(GLSLPPParser.UIMAGE1D, 0); }
		public TerminalNode IMAGE2D() { return getToken(GLSLPPParser.IMAGE2D, 0); }
		public TerminalNode IIMAGE2D() { return getToken(GLSLPPParser.IIMAGE2D, 0); }
		public TerminalNode UIMAGE2D() { return getToken(GLSLPPParser.UIMAGE2D, 0); }
		public TerminalNode IMAGE3D() { return getToken(GLSLPPParser.IMAGE3D, 0); }
		public TerminalNode IIMAGE3D() { return getToken(GLSLPPParser.IIMAGE3D, 0); }
		public TerminalNode UIMAGE3D() { return getToken(GLSLPPParser.UIMAGE3D, 0); }
		public TerminalNode IMAGE2DRECT() { return getToken(GLSLPPParser.IMAGE2DRECT, 0); }
		public TerminalNode IIMAGE2DRECT() { return getToken(GLSLPPParser.IIMAGE2DRECT, 0); }
		public TerminalNode UIMAGE2DRECT() { return getToken(GLSLPPParser.UIMAGE2DRECT, 0); }
		public TerminalNode IMAGECUBE() { return getToken(GLSLPPParser.IMAGECUBE, 0); }
		public TerminalNode IIMAGECUBE() { return getToken(GLSLPPParser.IIMAGECUBE, 0); }
		public TerminalNode UIMAGECUBE() { return getToken(GLSLPPParser.UIMAGECUBE, 0); }
		public TerminalNode IMAGEBUFFER() { return getToken(GLSLPPParser.IMAGEBUFFER, 0); }
		public TerminalNode IIMAGEBUFFER() { return getToken(GLSLPPParser.IIMAGEBUFFER, 0); }
		public TerminalNode UIMAGEBUFFER() { return getToken(GLSLPPParser.UIMAGEBUFFER, 0); }
		public TerminalNode IMAGE1DARRAY() { return getToken(GLSLPPParser.IMAGE1DARRAY, 0); }
		public TerminalNode IIMAGE1DARRAY() { return getToken(GLSLPPParser.IIMAGE1DARRAY, 0); }
		public TerminalNode UIMAGE1DARRAY() { return getToken(GLSLPPParser.UIMAGE1DARRAY, 0); }
		public TerminalNode IMAGE2DARRAY() { return getToken(GLSLPPParser.IMAGE2DARRAY, 0); }
		public TerminalNode IIMAGE2DARRAY() { return getToken(GLSLPPParser.IIMAGE2DARRAY, 0); }
		public TerminalNode UIMAGE2DARRAY() { return getToken(GLSLPPParser.UIMAGE2DARRAY, 0); }
		public TerminalNode IMAGECUBEARRAY() { return getToken(GLSLPPParser.IMAGECUBEARRAY, 0); }
		public TerminalNode IIMAGECUBEARRAY() { return getToken(GLSLPPParser.IIMAGECUBEARRAY, 0); }
		public TerminalNode UIMAGECUBEARRAY() { return getToken(GLSLPPParser.UIMAGECUBEARRAY, 0); }
		public TerminalNode IMAGE2DMS() { return getToken(GLSLPPParser.IMAGE2DMS, 0); }
		public TerminalNode IIMAGE2DMS() { return getToken(GLSLPPParser.IIMAGE2DMS, 0); }
		public TerminalNode UIMAGE2DMS() { return getToken(GLSLPPParser.UIMAGE2DMS, 0); }
		public TerminalNode IMAGE2DMSARRAY() { return getToken(GLSLPPParser.IMAGE2DMSARRAY, 0); }
		public TerminalNode IIMAGE2DMSARRAY() { return getToken(GLSLPPParser.IIMAGE2DMSARRAY, 0); }
		public TerminalNode UIMAGE2DMSARRAY() { return getToken(GLSLPPParser.UIMAGE2DMSARRAY, 0); }
		public TerminalNode SAMPLEREXTERNALOES() { return getToken(GLSLPPParser.SAMPLEREXTERNALOES, 0); }
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslTypeSpecifierNonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslTypeSpecifierNonarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslTypeSpecifierNonarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslTypeSpecifierNonarrayContext glslTypeSpecifierNonarray() throws RecognitionException {
		GlslTypeSpecifierNonarrayContext _localctx = new GlslTypeSpecifierNonarrayContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_glslTypeSpecifierNonarray);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(VOID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				match(DOUBLE);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(INT);
				}
				break;
			case UINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				match(UINT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				match(BOOL);
				}
				break;
			case VEC2:
				enterOuterAlt(_localctx, 7);
				{
				setState(720);
				match(VEC2);
				}
				break;
			case VEC3:
				enterOuterAlt(_localctx, 8);
				{
				setState(721);
				match(VEC3);
				}
				break;
			case VEC4:
				enterOuterAlt(_localctx, 9);
				{
				setState(722);
				match(VEC4);
				}
				break;
			case DVEC2:
				enterOuterAlt(_localctx, 10);
				{
				setState(723);
				match(DVEC2);
				}
				break;
			case DVEC3:
				enterOuterAlt(_localctx, 11);
				{
				setState(724);
				match(DVEC3);
				}
				break;
			case DVEC4:
				enterOuterAlt(_localctx, 12);
				{
				setState(725);
				match(DVEC4);
				}
				break;
			case BVEC2:
				enterOuterAlt(_localctx, 13);
				{
				setState(726);
				match(BVEC2);
				}
				break;
			case BVEC3:
				enterOuterAlt(_localctx, 14);
				{
				setState(727);
				match(BVEC3);
				}
				break;
			case BVEC4:
				enterOuterAlt(_localctx, 15);
				{
				setState(728);
				match(BVEC4);
				}
				break;
			case IVEC2:
				enterOuterAlt(_localctx, 16);
				{
				setState(729);
				match(IVEC2);
				}
				break;
			case IVEC3:
				enterOuterAlt(_localctx, 17);
				{
				setState(730);
				match(IVEC3);
				}
				break;
			case IVEC4:
				enterOuterAlt(_localctx, 18);
				{
				setState(731);
				match(IVEC4);
				}
				break;
			case UVEC2:
				enterOuterAlt(_localctx, 19);
				{
				setState(732);
				match(UVEC2);
				}
				break;
			case UVEC3:
				enterOuterAlt(_localctx, 20);
				{
				setState(733);
				match(UVEC3);
				}
				break;
			case UVEC4:
				enterOuterAlt(_localctx, 21);
				{
				setState(734);
				match(UVEC4);
				}
				break;
			case MAT2:
				enterOuterAlt(_localctx, 22);
				{
				setState(735);
				match(MAT2);
				}
				break;
			case MAT3:
				enterOuterAlt(_localctx, 23);
				{
				setState(736);
				match(MAT3);
				}
				break;
			case MAT4:
				enterOuterAlt(_localctx, 24);
				{
				setState(737);
				match(MAT4);
				}
				break;
			case MAT2X2:
				enterOuterAlt(_localctx, 25);
				{
				setState(738);
				match(MAT2X2);
				}
				break;
			case MAT2X3:
				enterOuterAlt(_localctx, 26);
				{
				setState(739);
				match(MAT2X3);
				}
				break;
			case MAT2X4:
				enterOuterAlt(_localctx, 27);
				{
				setState(740);
				match(MAT2X4);
				}
				break;
			case MAT3X2:
				enterOuterAlt(_localctx, 28);
				{
				setState(741);
				match(MAT3X2);
				}
				break;
			case MAT3X3:
				enterOuterAlt(_localctx, 29);
				{
				setState(742);
				match(MAT3X3);
				}
				break;
			case MAT3X4:
				enterOuterAlt(_localctx, 30);
				{
				setState(743);
				match(MAT3X4);
				}
				break;
			case MAT4X2:
				enterOuterAlt(_localctx, 31);
				{
				setState(744);
				match(MAT4X2);
				}
				break;
			case MAT4X3:
				enterOuterAlt(_localctx, 32);
				{
				setState(745);
				match(MAT4X3);
				}
				break;
			case MAT4X4:
				enterOuterAlt(_localctx, 33);
				{
				setState(746);
				match(MAT4X4);
				}
				break;
			case DMAT2:
				enterOuterAlt(_localctx, 34);
				{
				setState(747);
				match(DMAT2);
				}
				break;
			case DMAT3:
				enterOuterAlt(_localctx, 35);
				{
				setState(748);
				match(DMAT3);
				}
				break;
			case DMAT4:
				enterOuterAlt(_localctx, 36);
				{
				setState(749);
				match(DMAT4);
				}
				break;
			case DMAT2X2:
				enterOuterAlt(_localctx, 37);
				{
				setState(750);
				match(DMAT2X2);
				}
				break;
			case DMAT2X3:
				enterOuterAlt(_localctx, 38);
				{
				setState(751);
				match(DMAT2X3);
				}
				break;
			case DMAT2X4:
				enterOuterAlt(_localctx, 39);
				{
				setState(752);
				match(DMAT2X4);
				}
				break;
			case DMAT3X2:
				enterOuterAlt(_localctx, 40);
				{
				setState(753);
				match(DMAT3X2);
				}
				break;
			case DMAT3X3:
				enterOuterAlt(_localctx, 41);
				{
				setState(754);
				match(DMAT3X3);
				}
				break;
			case DMAT3X4:
				enterOuterAlt(_localctx, 42);
				{
				setState(755);
				match(DMAT3X4);
				}
				break;
			case DMAT4X2:
				enterOuterAlt(_localctx, 43);
				{
				setState(756);
				match(DMAT4X2);
				}
				break;
			case DMAT4X3:
				enterOuterAlt(_localctx, 44);
				{
				setState(757);
				match(DMAT4X3);
				}
				break;
			case DMAT4X4:
				enterOuterAlt(_localctx, 45);
				{
				setState(758);
				match(DMAT4X4);
				}
				break;
			case ATOMIC_UINT:
				enterOuterAlt(_localctx, 46);
				{
				setState(759);
				match(ATOMIC_UINT);
				}
				break;
			case SAMPLER1D:
				enterOuterAlt(_localctx, 47);
				{
				setState(760);
				match(SAMPLER1D);
				}
				break;
			case SAMPLER2D:
				enterOuterAlt(_localctx, 48);
				{
				setState(761);
				match(SAMPLER2D);
				}
				break;
			case SAMPLER3D:
				enterOuterAlt(_localctx, 49);
				{
				setState(762);
				match(SAMPLER3D);
				}
				break;
			case SAMPLERCUBE:
				enterOuterAlt(_localctx, 50);
				{
				setState(763);
				match(SAMPLERCUBE);
				}
				break;
			case SAMPLER1DSHADOW:
				enterOuterAlt(_localctx, 51);
				{
				setState(764);
				match(SAMPLER1DSHADOW);
				}
				break;
			case SAMPLER2DSHADOW:
				enterOuterAlt(_localctx, 52);
				{
				setState(765);
				match(SAMPLER2DSHADOW);
				}
				break;
			case SAMPLERCUBESHADOW:
				enterOuterAlt(_localctx, 53);
				{
				setState(766);
				match(SAMPLERCUBESHADOW);
				}
				break;
			case SAMPLER1DARRAY:
				enterOuterAlt(_localctx, 54);
				{
				setState(767);
				match(SAMPLER1DARRAY);
				}
				break;
			case SAMPLER2DARRAY:
				enterOuterAlt(_localctx, 55);
				{
				setState(768);
				match(SAMPLER2DARRAY);
				}
				break;
			case SAMPLER1DARRAYSHADOW:
				enterOuterAlt(_localctx, 56);
				{
				setState(769);
				match(SAMPLER1DARRAYSHADOW);
				}
				break;
			case SAMPLER2DARRAYSHADOW:
				enterOuterAlt(_localctx, 57);
				{
				setState(770);
				match(SAMPLER2DARRAYSHADOW);
				}
				break;
			case SAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 58);
				{
				setState(771);
				match(SAMPLERCUBEARRAY);
				}
				break;
			case SAMPLERCUBEARRAYSHADOW:
				enterOuterAlt(_localctx, 59);
				{
				setState(772);
				match(SAMPLERCUBEARRAYSHADOW);
				}
				break;
			case ISAMPLER1D:
				enterOuterAlt(_localctx, 60);
				{
				setState(773);
				match(ISAMPLER1D);
				}
				break;
			case ISAMPLER2D:
				enterOuterAlt(_localctx, 61);
				{
				setState(774);
				match(ISAMPLER2D);
				}
				break;
			case ISAMPLER3D:
				enterOuterAlt(_localctx, 62);
				{
				setState(775);
				match(ISAMPLER3D);
				}
				break;
			case ISAMPLERCUBE:
				enterOuterAlt(_localctx, 63);
				{
				setState(776);
				match(ISAMPLERCUBE);
				}
				break;
			case ISAMPLER1DARRAY:
				enterOuterAlt(_localctx, 64);
				{
				setState(777);
				match(ISAMPLER1DARRAY);
				}
				break;
			case ISAMPLER2DARRAY:
				enterOuterAlt(_localctx, 65);
				{
				setState(778);
				match(ISAMPLER2DARRAY);
				}
				break;
			case ISAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 66);
				{
				setState(779);
				match(ISAMPLERCUBEARRAY);
				}
				break;
			case USAMPLER1D:
				enterOuterAlt(_localctx, 67);
				{
				setState(780);
				match(USAMPLER1D);
				}
				break;
			case USAMPLER2D:
				enterOuterAlt(_localctx, 68);
				{
				setState(781);
				match(USAMPLER2D);
				}
				break;
			case USAMPLER3D:
				enterOuterAlt(_localctx, 69);
				{
				setState(782);
				match(USAMPLER3D);
				}
				break;
			case USAMPLERCUBE:
				enterOuterAlt(_localctx, 70);
				{
				setState(783);
				match(USAMPLERCUBE);
				}
				break;
			case USAMPLER1DARRAY:
				enterOuterAlt(_localctx, 71);
				{
				setState(784);
				match(USAMPLER1DARRAY);
				}
				break;
			case USAMPLER2DARRAY:
				enterOuterAlt(_localctx, 72);
				{
				setState(785);
				match(USAMPLER2DARRAY);
				}
				break;
			case USAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 73);
				{
				setState(786);
				match(USAMPLERCUBEARRAY);
				}
				break;
			case SAMPLER2DRECT:
				enterOuterAlt(_localctx, 74);
				{
				setState(787);
				match(SAMPLER2DRECT);
				}
				break;
			case SAMPLER2DRECTSHADOW:
				enterOuterAlt(_localctx, 75);
				{
				setState(788);
				match(SAMPLER2DRECTSHADOW);
				}
				break;
			case ISAMPLER2DRECT:
				enterOuterAlt(_localctx, 76);
				{
				setState(789);
				match(ISAMPLER2DRECT);
				}
				break;
			case USAMPLER2DRECT:
				enterOuterAlt(_localctx, 77);
				{
				setState(790);
				match(USAMPLER2DRECT);
				}
				break;
			case SAMPLERBUFFER:
				enterOuterAlt(_localctx, 78);
				{
				setState(791);
				match(SAMPLERBUFFER);
				}
				break;
			case ISAMPLERBUFFER:
				enterOuterAlt(_localctx, 79);
				{
				setState(792);
				match(ISAMPLERBUFFER);
				}
				break;
			case USAMPLERBUFFER:
				enterOuterAlt(_localctx, 80);
				{
				setState(793);
				match(USAMPLERBUFFER);
				}
				break;
			case SAMPLER2DMS:
				enterOuterAlt(_localctx, 81);
				{
				setState(794);
				match(SAMPLER2DMS);
				}
				break;
			case ISAMPLER2DMS:
				enterOuterAlt(_localctx, 82);
				{
				setState(795);
				match(ISAMPLER2DMS);
				}
				break;
			case USAMPLER2DMS:
				enterOuterAlt(_localctx, 83);
				{
				setState(796);
				match(USAMPLER2DMS);
				}
				break;
			case SAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 84);
				{
				setState(797);
				match(SAMPLER2DMSARRAY);
				}
				break;
			case ISAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 85);
				{
				setState(798);
				match(ISAMPLER2DMSARRAY);
				}
				break;
			case USAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 86);
				{
				setState(799);
				match(USAMPLER2DMSARRAY);
				}
				break;
			case IMAGE1D:
				enterOuterAlt(_localctx, 87);
				{
				setState(800);
				match(IMAGE1D);
				}
				break;
			case IIMAGE1D:
				enterOuterAlt(_localctx, 88);
				{
				setState(801);
				match(IIMAGE1D);
				}
				break;
			case UIMAGE1D:
				enterOuterAlt(_localctx, 89);
				{
				setState(802);
				match(UIMAGE1D);
				}
				break;
			case IMAGE2D:
				enterOuterAlt(_localctx, 90);
				{
				setState(803);
				match(IMAGE2D);
				}
				break;
			case IIMAGE2D:
				enterOuterAlt(_localctx, 91);
				{
				setState(804);
				match(IIMAGE2D);
				}
				break;
			case UIMAGE2D:
				enterOuterAlt(_localctx, 92);
				{
				setState(805);
				match(UIMAGE2D);
				}
				break;
			case IMAGE3D:
				enterOuterAlt(_localctx, 93);
				{
				setState(806);
				match(IMAGE3D);
				}
				break;
			case IIMAGE3D:
				enterOuterAlt(_localctx, 94);
				{
				setState(807);
				match(IIMAGE3D);
				}
				break;
			case UIMAGE3D:
				enterOuterAlt(_localctx, 95);
				{
				setState(808);
				match(UIMAGE3D);
				}
				break;
			case IMAGE2DRECT:
				enterOuterAlt(_localctx, 96);
				{
				setState(809);
				match(IMAGE2DRECT);
				}
				break;
			case IIMAGE2DRECT:
				enterOuterAlt(_localctx, 97);
				{
				setState(810);
				match(IIMAGE2DRECT);
				}
				break;
			case UIMAGE2DRECT:
				enterOuterAlt(_localctx, 98);
				{
				setState(811);
				match(UIMAGE2DRECT);
				}
				break;
			case IMAGECUBE:
				enterOuterAlt(_localctx, 99);
				{
				setState(812);
				match(IMAGECUBE);
				}
				break;
			case IIMAGECUBE:
				enterOuterAlt(_localctx, 100);
				{
				setState(813);
				match(IIMAGECUBE);
				}
				break;
			case UIMAGECUBE:
				enterOuterAlt(_localctx, 101);
				{
				setState(814);
				match(UIMAGECUBE);
				}
				break;
			case IMAGEBUFFER:
				enterOuterAlt(_localctx, 102);
				{
				setState(815);
				match(IMAGEBUFFER);
				}
				break;
			case IIMAGEBUFFER:
				enterOuterAlt(_localctx, 103);
				{
				setState(816);
				match(IIMAGEBUFFER);
				}
				break;
			case UIMAGEBUFFER:
				enterOuterAlt(_localctx, 104);
				{
				setState(817);
				match(UIMAGEBUFFER);
				}
				break;
			case IMAGE1DARRAY:
				enterOuterAlt(_localctx, 105);
				{
				setState(818);
				match(IMAGE1DARRAY);
				}
				break;
			case IIMAGE1DARRAY:
				enterOuterAlt(_localctx, 106);
				{
				setState(819);
				match(IIMAGE1DARRAY);
				}
				break;
			case UIMAGE1DARRAY:
				enterOuterAlt(_localctx, 107);
				{
				setState(820);
				match(UIMAGE1DARRAY);
				}
				break;
			case IMAGE2DARRAY:
				enterOuterAlt(_localctx, 108);
				{
				setState(821);
				match(IMAGE2DARRAY);
				}
				break;
			case IIMAGE2DARRAY:
				enterOuterAlt(_localctx, 109);
				{
				setState(822);
				match(IIMAGE2DARRAY);
				}
				break;
			case UIMAGE2DARRAY:
				enterOuterAlt(_localctx, 110);
				{
				setState(823);
				match(UIMAGE2DARRAY);
				}
				break;
			case IMAGECUBEARRAY:
				enterOuterAlt(_localctx, 111);
				{
				setState(824);
				match(IMAGECUBEARRAY);
				}
				break;
			case IIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 112);
				{
				setState(825);
				match(IIMAGECUBEARRAY);
				}
				break;
			case UIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 113);
				{
				setState(826);
				match(UIMAGECUBEARRAY);
				}
				break;
			case IMAGE2DMS:
				enterOuterAlt(_localctx, 114);
				{
				setState(827);
				match(IMAGE2DMS);
				}
				break;
			case IIMAGE2DMS:
				enterOuterAlt(_localctx, 115);
				{
				setState(828);
				match(IIMAGE2DMS);
				}
				break;
			case UIMAGE2DMS:
				enterOuterAlt(_localctx, 116);
				{
				setState(829);
				match(UIMAGE2DMS);
				}
				break;
			case IMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 117);
				{
				setState(830);
				match(IMAGE2DMSARRAY);
				}
				break;
			case IIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 118);
				{
				setState(831);
				match(IIMAGE2DMSARRAY);
				}
				break;
			case UIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 119);
				{
				setState(832);
				match(UIMAGE2DMSARRAY);
				}
				break;
			case SAMPLEREXTERNALOES:
				enterOuterAlt(_localctx, 120);
				{
				setState(833);
				match(SAMPLEREXTERNALOES);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 121);
				{
				setState(834);
				glslStructSpecifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 122);
				{
				setState(835);
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
		public TerminalNode STRUCT() { return getToken(GLSLPPParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLPPParser.LEFT_BRACE, 0); }
		public GlslStructDeclarationListContext glslStructDeclarationList() {
			return getRuleContext(GlslStructDeclarationListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLPPParser.RIGHT_BRACE, 0); }
		public GlslStructSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructSpecifierContext glslStructSpecifier() throws RecognitionException {
		GlslStructSpecifierContext _localctx = new GlslStructSpecifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_glslStructSpecifier);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(STRUCT);
				setState(839);
				match(IDENTIFIER);
				setState(840);
				match(LEFT_BRACE);
				setState(841);
				glslStructDeclarationList(0);
				setState(842);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				match(STRUCT);
				setState(845);
				match(LEFT_BRACE);
				setState(846);
				glslStructDeclarationList(0);
				setState(847);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructDeclarationList(this);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_glslStructDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(852);
			glslStructDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslStructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslStructDeclarationList);
					setState(854);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(855);
					glslStructDeclaration();
					}
					} 
				}
				setState(860);
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

	public static class GlslStructDeclarationContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslStructDeclaratorListContext glslStructDeclaratorList() {
			return getRuleContext(GlslStructDeclaratorListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLPPParser.SEMICOLON, 0); }
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslStructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructDeclarationContext glslStructDeclaration() throws RecognitionException {
		GlslStructDeclarationContext _localctx = new GlslStructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_glslStructDeclaration);
		try {
			setState(870);
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
				setState(861);
				glslTypeSpecifier();
				setState(862);
				glslStructDeclaratorList(0);
				setState(863);
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
				setState(865);
				glslTypeQualifier(0);
				setState(866);
				glslTypeSpecifier();
				setState(867);
				glslStructDeclaratorList(0);
				setState(868);
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
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public GlslStructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructDeclaratorList(this);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_glslStructDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(873);
			glslStructDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslStructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslStructDeclaratorList);
					setState(875);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(876);
					match(COMMA);
					setState(877);
					glslStructDeclarator();
					}
					} 
				}
				setState(882);
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

	public static class GlslStructDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslArraySpecifierContext glslArraySpecifier() {
			return getRuleContext(GlslArraySpecifierContext.class,0);
		}
		public GlslStructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructDeclaratorContext glslStructDeclarator() throws RecognitionException {
		GlslStructDeclaratorContext _localctx = new GlslStructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_glslStructDeclarator);
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				match(IDENTIFIER);
				setState(885);
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
		public TerminalNode INVARIANT() { return getToken(GLSLPPParser.INVARIANT, 0); }
		public GlslInvariantQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInvariantQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslInvariantQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslInvariantQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslInvariantQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInvariantQualifierContext glslInvariantQualifier() throws RecognitionException {
		GlslInvariantQualifierContext _localctx = new GlslInvariantQualifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_glslInvariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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
		public TerminalNode SMOOTH() { return getToken(GLSLPPParser.SMOOTH, 0); }
		public TerminalNode FLAT() { return getToken(GLSLPPParser.FLAT, 0); }
		public TerminalNode NOPERSPECTIVE() { return getToken(GLSLPPParser.NOPERSPECTIVE, 0); }
		public GlslInterpolationQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslInterpolationQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslInterpolationQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslInterpolationQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslInterpolationQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslInterpolationQualifierContext glslInterpolationQualifier() throws RecognitionException {
		GlslInterpolationQualifierContext _localctx = new GlslInterpolationQualifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_glslInterpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
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
		public TerminalNode LAYOUT() { return getToken(GLSLPPParser.LAYOUT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public GlslLayoutQualifierIdListContext glslLayoutQualifierIdList() {
			return getRuleContext(GlslLayoutQualifierIdListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public GlslLayoutQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLayoutQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslLayoutQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslLayoutQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslLayoutQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLayoutQualifierContext glslLayoutQualifier() throws RecognitionException {
		GlslLayoutQualifierContext _localctx = new GlslLayoutQualifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_glslLayoutQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(LAYOUT);
			setState(893);
			match(LEFT_PAREN);
			setState(894);
			glslLayoutQualifierIdList(0);
			setState(895);
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
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public GlslLayoutQualifierIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLayoutQualifierIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslLayoutQualifierIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslLayoutQualifierIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslLayoutQualifierIdList(this);
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_glslLayoutQualifierIdList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(898);
			glslLayoutQualifierId();
			}
			_ctx.stop = _input.LT(-1);
			setState(905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLayoutQualifierIdListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLayoutQualifierIdList);
					setState(900);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(901);
					match(COMMA);
					setState(902);
					glslLayoutQualifierId();
					}
					} 
				}
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(GLSLPPParser.EQUAL, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode SHARED() { return getToken(GLSLPPParser.SHARED, 0); }
		public GlslLayoutQualifierIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslLayoutQualifierId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslLayoutQualifierId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslLayoutQualifierId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslLayoutQualifierId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslLayoutQualifierIdContext glslLayoutQualifierId() throws RecognitionException {
		GlslLayoutQualifierIdContext _localctx = new GlslLayoutQualifierIdContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_glslLayoutQualifierId);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(IDENTIFIER);
				setState(910);
				match(EQUAL);
				setState(911);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(912);
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
		public TerminalNode PRECISE() { return getToken(GLSLPPParser.PRECISE, 0); }
		public GlslPreciseQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPreciseQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslPreciseQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslPreciseQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslPreciseQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPreciseQualifierContext glslPreciseQualifier() throws RecognitionException {
		GlslPreciseQualifierContext _localctx = new GlslPreciseQualifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_glslPreciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslTypeQualifier(this);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_glslTypeQualifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(918);
			glslSingleTypeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslTypeQualifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslTypeQualifier);
					setState(920);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(921);
					glslSingleTypeQualifier();
					}
					} 
				}
				setState(926);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslSingleTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslSingleTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslSingleTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslSingleTypeQualifierContext glslSingleTypeQualifier() throws RecognitionException {
		GlslSingleTypeQualifierContext _localctx = new GlslSingleTypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_glslSingleTypeQualifier);
		try {
			setState(933);
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
				setState(927);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				glslLayoutQualifier();
				}
				break;
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(931);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(932);
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
		public TerminalNode CONST() { return getToken(GLSLPPParser.CONST, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(GLSLPPParser.ATTRIBUTE, 0); }
		public TerminalNode VARYING() { return getToken(GLSLPPParser.VARYING, 0); }
		public TerminalNode INOUT() { return getToken(GLSLPPParser.INOUT, 0); }
		public TerminalNode IN() { return getToken(GLSLPPParser.IN, 0); }
		public TerminalNode OUT() { return getToken(GLSLPPParser.OUT, 0); }
		public TerminalNode CENTROID() { return getToken(GLSLPPParser.CENTROID, 0); }
		public TerminalNode PATCH() { return getToken(GLSLPPParser.PATCH, 0); }
		public TerminalNode SAMPLE() { return getToken(GLSLPPParser.SAMPLE, 0); }
		public TerminalNode UNIFORM() { return getToken(GLSLPPParser.UNIFORM, 0); }
		public TerminalNode BUFFER() { return getToken(GLSLPPParser.BUFFER, 0); }
		public TerminalNode SHARED() { return getToken(GLSLPPParser.SHARED, 0); }
		public TerminalNode COHERENT() { return getToken(GLSLPPParser.COHERENT, 0); }
		public TerminalNode VOLATILE() { return getToken(GLSLPPParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(GLSLPPParser.RESTRICT, 0); }
		public TerminalNode READONLY() { return getToken(GLSLPPParser.READONLY, 0); }
		public TerminalNode WRITEONLY() { return getToken(GLSLPPParser.WRITEONLY, 0); }
		public TerminalNode SUBROUTINE() { return getToken(GLSLPPParser.SUBROUTINE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public GlslTypeNameListContext glslTypeNameList() {
			return getRuleContext(GlslTypeNameListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public GlslStorageQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStorageQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStorageQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStorageQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStorageQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStorageQualifierContext glslStorageQualifier() throws RecognitionException {
		GlslStorageQualifierContext _localctx = new GlslStorageQualifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_glslStorageQualifier);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(938);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(939);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(940);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(941);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(942);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(943);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(944);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(945);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(946);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(947);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(948);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(949);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(950);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(951);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(952);
				match(SUBROUTINE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(953);
				match(SUBROUTINE);
				setState(954);
				match(LEFT_PAREN);
				setState(955);
				glslTypeNameList(0);
				setState(956);
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
		public TerminalNode HIGH_PRECISION() { return getToken(GLSLPPParser.HIGH_PRECISION, 0); }
		public TerminalNode MEDIUM_PRECISION() { return getToken(GLSLPPParser.MEDIUM_PRECISION, 0); }
		public TerminalNode LOW_PRECISION() { return getToken(GLSLPPParser.LOW_PRECISION, 0); }
		public GlslPrecisionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslPrecisionQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslPrecisionQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslPrecisionQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslPrecisionQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslPrecisionQualifierContext glslPrecisionQualifier() throws RecognitionException {
		GlslPrecisionQualifierContext _localctx = new GlslPrecisionQualifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_glslPrecisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (LOW_PRECISION - 108)) | (1L << (MEDIUM_PRECISION - 108)) | (1L << (HIGH_PRECISION - 108)))) != 0)) ) {
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
		case 34:
			return glslPostfixExpression_sempred((GlslPostfixExpressionContext)_localctx, predIndex);
		case 41:
			return glslMultiplicativeExpression_sempred((GlslMultiplicativeExpressionContext)_localctx, predIndex);
		case 42:
			return glslAdditiveExpression_sempred((GlslAdditiveExpressionContext)_localctx, predIndex);
		case 43:
			return glslShiftExpression_sempred((GlslShiftExpressionContext)_localctx, predIndex);
		case 44:
			return glslRelationalExpression_sempred((GlslRelationalExpressionContext)_localctx, predIndex);
		case 45:
			return glslEqualityExpression_sempred((GlslEqualityExpressionContext)_localctx, predIndex);
		case 46:
			return glslAndExpression_sempred((GlslAndExpressionContext)_localctx, predIndex);
		case 47:
			return glslExclusiveOrExpression_sempred((GlslExclusiveOrExpressionContext)_localctx, predIndex);
		case 48:
			return glslInclusiveOrExpression_sempred((GlslInclusiveOrExpressionContext)_localctx, predIndex);
		case 49:
			return glslLogicalAndExpression_sempred((GlslLogicalAndExpressionContext)_localctx, predIndex);
		case 50:
			return glslLogicalXorExpression_sempred((GlslLogicalXorExpressionContext)_localctx, predIndex);
		case 51:
			return glslLogicalOrExpression_sempred((GlslLogicalOrExpressionContext)_localctx, predIndex);
		case 55:
			return glslExpression_sempred((GlslExpressionContext)_localctx, predIndex);
		case 57:
			return glslTypeNameList_sempred((GlslTypeNameListContext)_localctx, predIndex);
		case 59:
			return glslArraySpecifier_sempred((GlslArraySpecifierContext)_localctx, predIndex);
		case 62:
			return glslStructDeclarationList_sempred((GlslStructDeclarationListContext)_localctx, predIndex);
		case 64:
			return glslStructDeclaratorList_sempred((GlslStructDeclaratorListContext)_localctx, predIndex);
		case 69:
			return glslLayoutQualifierIdList_sempred((GlslLayoutQualifierIdListContext)_localctx, predIndex);
		case 72:
			return glslTypeQualifier_sempred((GlslTypeQualifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean glslPostfixExpression_sempred(GlslPostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
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
	private boolean glslExpression_sempred(GlslExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslTypeNameList_sempred(GlslTypeNameListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslArraySpecifier_sempred(GlslArraySpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslStructDeclarationList_sempred(GlslStructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslStructDeclaratorList_sempred(GlslStructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLayoutQualifierIdList_sempred(GlslLayoutQualifierIdListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslTypeQualifier_sempred(GlslTypeQualifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0127\u03c5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\5\2\u009c\n\2\3\2\5\2\u009f\n\2\3\3\6"+
		"\3\u00a2\n\3\r\3\16\3\u00a3\3\4\3\4\3\4\5\4\u00a9\n\4\3\5\3\5\5\5\u00ad"+
		"\n\5\3\5\5\5\u00b0\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00b9\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00c0\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c7\n\6\5\6\u00c9"+
		"\n\6\3\7\6\7\u00cc\n\7\r\7\16\7\u00cd\3\b\3\b\3\b\3\b\3\b\5\b\u00d5\n"+
		"\b\3\t\3\t\3\t\3\t\5\t\u00db\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f0\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0115\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u011b\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012f\n\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\7\16\u0138\n\16\f\16\16\16\u013b\13\16\3\17\3\17\7\17\u013f"+
		"\n\17\f\17\16\17\u0142\13\17\3\17\3\17\5\17\u0146\n\17\3\20\3\20\5\20"+
		"\u014a\n\20\3\20\3\20\3\21\5\21\u014f\n\21\3\22\6\22\u0152\n\22\r\22\16"+
		"\22\u0153\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015d\n\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\5\31\u016a\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u019b\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01af\n\37\3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\5$\u01be\n$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\7$\u01ce\n$\f$\16$\u01d1\13$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\6\'\u01db\n\'\r\'\16\'\u01dc\3\'\3\'\3\'\3\'\5\'\u01e3\n\'"+
		"\3\'\5\'\u01e6\n\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01f2\n)\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0202\n+\f+\16+\u0205\13+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\7,\u0210\n,\f,\16,\u0213\13,\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\7-\u021e\n-\f-\16-\u0221\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\7.\u0232\n.\f.\16.\u0235\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/"+
		"\u0240\n/\f/\16/\u0243\13/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u024b\n"+
		"\60\f\60\16\60\u024e\13\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0256\n"+
		"\61\f\61\16\61\u0259\13\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0261\n"+
		"\62\f\62\16\62\u0264\13\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u026c\n"+
		"\63\f\63\16\63\u026f\13\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0277\n"+
		"\64\f\64\16\64\u027a\13\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0282\n"+
		"\65\f\65\16\65\u0285\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u028e"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u0295\n\67\38\38\39\39\39\39\39\3"+
		"9\79\u029f\n9\f9\169\u02a2\139\3:\3:\3;\3;\3;\3;\3;\3;\7;\u02ac\n;\f;"+
		"\16;\u02af\13;\3<\3<\3<\3<\5<\u02b5\n<\3=\3=\3=\3=\3=\3=\3=\5=\u02be\n"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u02c8\n=\f=\16=\u02cb\13=\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\5>\u0347\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0354\n?\3@\3@"+
		"\3@\3@\3@\7@\u035b\n@\f@\16@\u035e\13@\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0369"+
		"\nA\3B\3B\3B\3B\3B\3B\7B\u0371\nB\fB\16B\u0374\13B\3C\3C\3C\5C\u0379\n"+
		"C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\7G\u038a\nG\fG\16G\u038d"+
		"\13G\3H\3H\3H\3H\3H\5H\u0394\nH\3I\3I\3J\3J\3J\3J\3J\7J\u039d\nJ\fJ\16"+
		"J\u03a0\13J\3K\3K\3K\3K\3K\3K\5K\u03a8\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03c1\nL\3M\3M\3M\2\25FTV"+
		"XZ\\^`bdfhptx~\u0082\u008c\u0092N\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\21"+
		"\3\2\3\6\3\2\27\31\3\2\u0119\u0119\3\2\u011f\u011f\4\2\7\t\16\22\3\2\u0123"+
		"\u0124\4\2\u0125\u0125\u0127\u0127\3\2\u0125\u0126\3\2\u00e8\u00eb\4\2"+
		"\u010d\u010d\u010f\u010f\t\2\u00e7\u00f5\u00f7\u0113\u0115\u011a\u011d"+
		"\u011d\u011f\u011f\u0121\u0121\u0123\u0127\3\2\u010c\u010f\4\2\u00f7\u0100"+
		"\u010a\u010a\3\2(*\3\2np\2\u0496\2\u009e\3\2\2\2\4\u00a1\3\2\2\2\6\u00a8"+
		"\3\2\2\2\b\u00aa\3\2\2\2\n\u00c8\3\2\2\2\f\u00cb\3\2\2\2\16\u00cf\3\2"+
		"\2\2\20\u00d6\3\2\2\2\22\u00dc\3\2\2\2\24\u012e\3\2\2\2\26\u0130\3\2\2"+
		"\2\30\u0132\3\2\2\2\32\u0134\3\2\2\2\34\u0145\3\2\2\2\36\u0147\3\2\2\2"+
		" \u014e\3\2\2\2\"\u0151\3\2\2\2$\u015c\3\2\2\2&\u015e\3\2\2\2(\u0160\3"+
		"\2\2\2*\u0162\3\2\2\2,\u0164\3\2\2\2.\u0166\3\2\2\2\60\u0169\3\2\2\2\62"+
		"\u019a\3\2\2\2\64\u019c\3\2\2\2\66\u019e\3\2\2\28\u01a0\3\2\2\2:\u01a2"+
		"\3\2\2\2<\u01ae\3\2\2\2>\u01b0\3\2\2\2@\u01b2\3\2\2\2B\u01b4\3\2\2\2D"+
		"\u01b6\3\2\2\2F\u01bd\3\2\2\2H\u01d2\3\2\2\2J\u01d4\3\2\2\2L\u01e5\3\2"+
		"\2\2N\u01e7\3\2\2\2P\u01f1\3\2\2\2R\u01f3\3\2\2\2T\u01f5\3\2\2\2V\u0206"+
		"\3\2\2\2X\u0214\3\2\2\2Z\u0222\3\2\2\2\\\u0236\3\2\2\2^\u0244\3\2\2\2"+
		"`\u024f\3\2\2\2b\u025a\3\2\2\2d\u0265\3\2\2\2f\u0270\3\2\2\2h\u027b\3"+
		"\2\2\2j\u028d\3\2\2\2l\u0294\3\2\2\2n\u0296\3\2\2\2p\u0298\3\2\2\2r\u02a3"+
		"\3\2\2\2t\u02a5\3\2\2\2v\u02b4\3\2\2\2x\u02bd\3\2\2\2z\u0346\3\2\2\2|"+
		"\u0353\3\2\2\2~\u0355\3\2\2\2\u0080\u0368\3\2\2\2\u0082\u036a\3\2\2\2"+
		"\u0084\u0378\3\2\2\2\u0086\u037a\3\2\2\2\u0088\u037c\3\2\2\2\u008a\u037e"+
		"\3\2\2\2\u008c\u0383\3\2\2\2\u008e\u0393\3\2\2\2\u0090\u0395\3\2\2\2\u0092"+
		"\u0397\3\2\2\2\u0094\u03a7\3\2\2\2\u0096\u03c0\3\2\2\2\u0098\u03c2\3\2"+
		"\2\2\u009a\u009c\5\4\3\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009f\7\2\2\3\u009e\u009b\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\3\3\2\2\2\u00a0\u00a2\5\6\4\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\5\3\2\2\2\u00a5"+
		"\u00a9\5\b\5\2\u00a6\u00a9\5\24\13\2\u00a7\u00a9\5\34\17\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\7\3\2\2\2\u00aa"+
		"\u00ac\5\n\6\2\u00ab\u00ad\5\f\7\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5\20\t\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\22\n\2\u00b2\t\3\2\2"+
		"\2\u00b3\u00b4\7\u0119\2\2\u00b4\u00b5\7\65\2\2\u00b5\u00b6\5r:\2\u00b6"+
		"\u00b8\7\u011f\2\2\u00b7\u00b9\5\4\3\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00c9\3\2\2\2\u00ba\u00bb\7\u0119\2\2\u00bb\u00bc\7\n\2"+
		"\2\u00bc\u00bd\5,\27\2\u00bd\u00bf\7\u011f\2\2\u00be\u00c0\5\4\3\2\u00bf"+
		"\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00c2\7\u0119"+
		"\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\5,\27\2\u00c4\u00c6\7\u011f\2\2"+
		"\u00c5\u00c7\5\4\3\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00b3\3\2\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9"+
		"\13\3\2\2\2\u00ca\u00cc\5\16\b\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00d0"+
		"\7\u0119\2\2\u00d0\u00d1\7\f\2\2\u00d1\u00d2\5r:\2\u00d2\u00d4\7\u011f"+
		"\2\2\u00d3\u00d5\5\4\3\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\17\3\2\2\2\u00d6\u00d7\7\u0119\2\2\u00d7\u00d8\7\66\2\2\u00d8\u00da\7"+
		"\u011f\2\2\u00d9\u00db\5\4\3\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\21\3\2\2\2\u00dc\u00dd\7\u0119\2\2\u00dd\u00de\7\r\2\2\u00de\u00df"+
		"\7\u011f\2\2\u00df\23\3\2\2\2\u00e0\u00e1\7\u0119\2\2\u00e1\u00e2\7\7"+
		"\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4\7\u011f\2\2\u00e4\u012f\3\2\2\2"+
		"\u00e5\u00e6\7\u0119\2\2\u00e6\u00e7\7\b\2\2\u00e7\u00e8\5,\27\2\u00e8"+
		"\u00e9\5 \21\2\u00e9\u00ea\7\u011f\2\2\u00ea\u012f\3\2\2\2\u00eb\u00ec"+
		"\7\u0119\2\2\u00ec\u00ed\7\b\2\2\u00ed\u00ef\7\u011e\2\2\u00ee\u00f0\5"+
		"\32\16\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7\u0102\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\7\u011f\2\2\u00f4\u012f"+
		"\3\2\2\2\u00f5\u00f6\7\u0119\2\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\7\u011e"+
		"\2\2\u00f8\u00f9\7\u011d\2\2\u00f9\u00fa\7\u0102\2\2\u00fa\u00fb\5 \21"+
		"\2\u00fb\u00fc\7\u011f\2\2\u00fc\u012f\3\2\2\2\u00fd\u00fe\7\u0119\2\2"+
		"\u00fe\u00ff\7\b\2\2\u00ff\u0100\7\u011e\2\2\u0100\u0101\5\32\16\2\u0101"+
		"\u0102\7\u0108\2\2\u0102\u0103\7\u011d\2\2\u0103\u0104\7\u0102\2\2\u0104"+
		"\u0105\5 \21\2\u0105\u0106\7\u011f\2\2\u0106\u012f\3\2\2\2\u0107\u0108"+
		"\7\u0119\2\2\u0108\u0109\7\t\2\2\u0109\u010a\5,\27\2\u010a\u010b\7\u011f"+
		"\2\2\u010b\u012f\3\2\2\2\u010c\u010d\7\u0119\2\2\u010d\u010e\7\22\2\2"+
		"\u010e\u010f\5\"\22\2\u010f\u0110\7\u011f\2\2\u0110\u012f\3\2\2\2\u0111"+
		"\u0112\7\u0119\2\2\u0112\u0114\7\16\2\2\u0113\u0115\5\"\22\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u012f\7\u011f\2"+
		"\2\u0117\u0118\7\u0119\2\2\u0118\u011a\7\17\2\2\u0119\u011b\5\"\22\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u012f\7\u011f"+
		"\2\2\u011d\u011e\7\u0119\2\2\u011e\u011f\7\20\2\2\u011f\u0120\5,\27\2"+
		"\u0120\u0121\7\u0109\2\2\u0121\u0122\5\26\f\2\u0122\u0123\7\u011f\2\2"+
		"\u0123\u012f\3\2\2\2\u0124\u0125\7\u0119\2\2\u0125\u0126\7\21\2\2\u0126"+
		"\u0127\7\u00ea\2\2\u0127\u0128\5\30\r\2\u0128\u0129\7\u011f\2\2\u0129"+
		"\u012f\3\2\2\2\u012a\u012b\7\u0119\2\2\u012b\u012f\7\u011f\2\2\u012c\u012d"+
		"\7\u0119\2\2\u012d\u012f\5\36\20\2\u012e\u00e0\3\2\2\2\u012e\u00e5\3\2"+
		"\2\2\u012e\u00eb\3\2\2\2\u012e\u00f5\3\2\2\2\u012e\u00fd\3\2\2\2\u012e"+
		"\u0107\3\2\2\2\u012e\u010c\3\2\2\2\u012e\u0111\3\2\2\2\u012e\u0117\3\2"+
		"\2\2\u012e\u011d\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u012a\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\25\3\2\2\2\u0130\u0131\t\2\2\2\u0131\27\3\2\2\2\u0132"+
		"\u0133\t\3\2\2\u0133\31\3\2\2\2\u0134\u0139\5,\27\2\u0135\u0136\7\u0108"+
		"\2\2\u0136\u0138\5,\27\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\33\3\2\2\2\u013b\u0139\3\2\2"+
		"\2\u013c\u0140\n\4\2\2\u013d\u013f\n\5\2\2\u013e\u013d\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0146\7\u011f\2\2\u0144\u0146\7\u011f\2\2\u0145\u013c"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146\35\3\2\2\2\u0147\u0149\n\6\2\2\u0148"+
		"\u014a\5\"\22\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u014c\7\u011f\2\2\u014c\37\3\2\2\2\u014d\u014f\5\"\22\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f!\3\2\2\2\u0150\u0152\5$\23\2"+
		"\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154#\3\2\2\2\u0155\u015d\5*\26\2\u0156\u015d\5,\27\2\u0157"+
		"\u015d\5.\30\2\u0158\u015d\5&\24\2\u0159\u015d\5(\25\2\u015a\u015d\5\62"+
		"\32\2\u015b\u015d\5\64\33\2\u015c\u0155\3\2\2\2\u015c\u0156\3\2\2\2\u015c"+
		"\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d%\3\2\2\2\u015e\u015f\t\7\2\2\u015f\'\3"+
		"\2\2\2\u0160\u0161\t\b\2\2\u0161)\3\2\2\2\u0162\u0163\t\t\2\2\u0163+\3"+
		"\2\2\2\u0164\u0165\7\u00e7\2\2\u0165-\3\2\2\2\u0166\u0167\t\n\2\2\u0167"+
		"/\3\2\2\2\u0168\u016a\t\13\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2"+
		"\u016a\61\3\2\2\2\u016b\u019b\7\u0119\2\2\u016c\u019b\7\u011a\2\2\u016d"+
		"\u019b\7\u0103\2\2\u016e\u019b\7\u0104\2\2\u016f\u019b\7\u0101\2\2\u0170"+
		"\u019b\7\u0102\2\2\u0171\u019b\7\u0105\2\2\u0172\u019b\7\u0106\2\2\u0173"+
		"\u019b\7\u0107\2\2\u0174\u019b\7\u00ee\2\2\u0175\u019b\7\u00ef\2\2\u0176"+
		"\u019b\7\u0117\2\2\u0177\u019b\7\u0110\2\2\u0178\u019b\7\u010f\2\2\u0179"+
		"\u019b\7\u010d\2\2\u017a\u019b\7\u010e\2\2\u017b\u019b\7\u010c\2\2\u017c"+
		"\u019b\7\u0111\2\2\u017d\u019b\7\u0112\2\2\u017e\u019b\7\u00ec\2\2\u017f"+
		"\u019b\7\u00ed\2\2\u0180\u0181\7\u0113\2\2\u0181\u019b\7\u0114\2\2\u0182"+
		"\u019b\7\u00f0\2\2\u0183\u019b\7\u00f1\2\2\u0184\u019b\7\u00f2\2\2\u0185"+
		"\u019b\7\u00f3\2\2\u0186\u019b\7\u0116\2\2\u0187\u019b\7\u0115\2\2\u0188"+
		"\u019b\7\u00f4\2\2\u0189\u019b\7\u00f5\2\2\u018a\u019b\7\u0118\2\2\u018b"+
		"\u019b\7\u0109\2\2\u018c\u019b\7\u010b\2\2\u018d\u019b\7\u011d\2\2\u018e"+
		"\u019b\7\u010a\2\2\u018f\u019b\7\u00f7\2\2\u0190\u019b\7\u00f8\2\2\u0191"+
		"\u019b\7\u00fa\2\2\u0192\u019b\7\u00f9\2\2\u0193\u019b\7\u0100\2\2\u0194"+
		"\u019b\7\u00fb\2\2\u0195\u019b\7\u00fc\2\2\u0196\u019b\7\u00fd\2\2\u0197"+
		"\u019b\7\u00fe\2\2\u0198\u019b\7\u00ff\2\2\u0199\u019b\7\u0108\2\2\u019a"+
		"\u016b\3\2\2\2\u019a\u016c\3\2\2\2\u019a\u016d\3\2\2\2\u019a\u016e\3\2"+
		"\2\2\u019a\u016f\3\2\2\2\u019a\u0170\3\2\2\2\u019a\u0171\3\2\2\2\u019a"+
		"\u0172\3\2\2\2\u019a\u0173\3\2\2\2\u019a\u0174\3\2\2\2\u019a\u0175\3\2"+
		"\2\2\u019a\u0176\3\2\2\2\u019a\u0177\3\2\2\2\u019a\u0178\3\2\2\2\u019a"+
		"\u0179\3\2\2\2\u019a\u017a\3\2\2\2\u019a\u017b\3\2\2\2\u019a\u017c\3\2"+
		"\2\2\u019a\u017d\3\2\2\2\u019a\u017e\3\2\2\2\u019a\u017f\3\2\2\2\u019a"+
		"\u0180\3\2\2\2\u019a\u0182\3\2\2\2\u019a\u0183\3\2\2\2\u019a\u0184\3\2"+
		"\2\2\u019a\u0185\3\2\2\2\u019a\u0186\3\2\2\2\u019a\u0187\3\2\2\2\u019a"+
		"\u0188\3\2\2\2\u019a\u0189\3\2\2\2\u019a\u018a\3\2\2\2\u019a\u018b\3\2"+
		"\2\2\u019a\u018c\3\2\2\2\u019a\u018d\3\2\2\2\u019a\u018e\3\2\2\2\u019a"+
		"\u018f\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0192\3\2"+
		"\2\2\u019a\u0193\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0195\3\2\2\2\u019a"+
		"\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2"+
		"\2\2\u019b\63\3\2\2\2\u019c\u019d\n\f\2\2\u019d\65\3\2\2\2\u019e\u019f"+
		"\7\u00e7\2\2\u019f\67\3\2\2\2\u01a0\u01a1\7\u00e7\2\2\u01a19\3\2\2\2\u01a2"+
		"\u01a3\7\u00e7\2\2\u01a3;\3\2\2\2\u01a4\u01af\58\35\2\u01a5\u01af\5> "+
		"\2\u01a6\u01af\5@!\2\u01a7\u01af\5B\"\2\u01a8\u01af\5D#\2\u01a9\u01af"+
		"\7\u00e6\2\2\u01aa\u01ab\7\u0101\2\2\u01ab\u01ac\5p9\2\u01ac\u01ad\7\u0102"+
		"\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a4\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae"+
		"\u01a6\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01a9\3\2"+
		"\2\2\u01ae\u01aa\3\2\2\2\u01af=\3\2\2\2\u01b0\u01b1\7\u00ea\2\2\u01b1"+
		"?\3\2\2\2\u01b2\u01b3\7\u00eb\2\2\u01b3A\3\2\2\2\u01b4\u01b5\7\u00e8\2"+
		"\2\u01b5C\3\2\2\2\u01b6\u01b7\7\u00e9\2\2\u01b7E\3\2\2\2\u01b8\u01b9\b"+
		"$\1\2\u01b9\u01be\5<\37\2\u01ba\u01bb\5v<\2\u01bb\u01bc\5J&\2\u01bc\u01be"+
		"\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be\u01cf\3\2\2\2\u01bf"+
		"\u01c0\f\b\2\2\u01c0\u01c1\7\u0103\2\2\u01c1\u01c2\5N(\2\u01c2\u01c3\7"+
		"\u0104\2\2\u01c3\u01ce\3\2\2\2\u01c4\u01c5\f\7\2\2\u01c5\u01ce\5H%\2\u01c6"+
		"\u01c7\f\5\2\2\u01c7\u01c8\7\u0107\2\2\u01c8\u01ce\5\66\34\2\u01c9\u01ca"+
		"\f\4\2\2\u01ca\u01ce\7\u00ee\2\2\u01cb\u01cc\f\3\2\2\u01cc\u01ce\7\u00ef"+
		"\2\2\u01cd\u01bf\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c6\3\2\2\2\u01cd"+
		"\u01c9\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0G\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3"+
		"\5L\'\2\u01d3I\3\2\2\2\u01d4\u01d5\5L\'\2\u01d5K\3\2\2\2\u01d6\u01d7\7"+
		"\u0101\2\2\u01d7\u01da\5l\67\2\u01d8\u01d9\7\u0108\2\2\u01d9\u01db\5l"+
		"\67\2\u01da\u01d8\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7\u0102\2\2\u01df\u01e6"+
		"\3\2\2\2\u01e0\u01e2\7\u0101\2\2\u01e1\u01e3\7>\2\2\u01e2\u01e1\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\7\u0102\2\2\u01e5"+
		"\u01d6\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e6M\3\2\2\2\u01e7\u01e8\5p9\2\u01e8"+
		"O\3\2\2\2\u01e9\u01f2\5F$\2\u01ea\u01eb\7\u00ee\2\2\u01eb\u01f2\5P)\2"+
		"\u01ec\u01ed\7\u00ef\2\2\u01ed\u01f2\5P)\2\u01ee\u01ef\5R*\2\u01ef\u01f0"+
		"\5P)\2\u01f0\u01f2\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f1"+
		"\u01ec\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f2Q\3\2\2\2\u01f3\u01f4\t\r\2\2"+
		"\u01f4S\3\2\2\2\u01f5\u01f6\b+\1\2\u01f6\u01f7\5P)\2\u01f7\u0203\3\2\2"+
		"\2\u01f8\u01f9\f\5\2\2\u01f9\u01fa\7\u0110\2\2\u01fa\u0202\5P)\2\u01fb"+
		"\u01fc\f\4\2\2\u01fc\u01fd\7\u0111\2\2\u01fd\u0202\5P)\2\u01fe\u01ff\f"+
		"\3\2\2\u01ff\u0200\7\u0112\2\2\u0200\u0202\5P)\2\u0201\u01f8\3\2\2\2\u0201"+
		"\u01fb\3\2\2\2\u0201\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204U\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207"+
		"\b,\1\2\u0207\u0208\5T+\2\u0208\u0211\3\2\2\2\u0209\u020a\f\4\2\2\u020a"+
		"\u020b\7\u010f\2\2\u020b\u0210\5T+\2\u020c\u020d\f\3\2\2\u020d\u020e\7"+
		"\u010d\2\2\u020e\u0210\5T+\2\u020f\u0209\3\2\2\2\u020f\u020c\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212W\3\2\2\2"+
		"\u0213\u0211\3\2\2\2\u0214\u0215\b-\1\2\u0215\u0216\5V,\2\u0216\u021f"+
		"\3\2\2\2\u0217\u0218\f\4\2\2\u0218\u0219\7\u00ec\2\2\u0219\u021e\5V,\2"+
		"\u021a\u021b\f\3\2\2\u021b\u021c\7\u00ed\2\2\u021c\u021e\5V,\2\u021d\u0217"+
		"\3\2\2\2\u021d\u021a\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220Y\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\b.\1\2\u0223"+
		"\u0224\5X-\2\u0224\u0233\3\2\2\2\u0225\u0226\f\6\2\2\u0226\u0227\7\u0113"+
		"\2\2\u0227\u0232\5X-\2\u0228\u0229\f\5\2\2\u0229\u022a\7\u0114\2\2\u022a"+
		"\u0232\5X-\2\u022b\u022c\f\4\2\2\u022c\u022d\7\u00f0\2\2\u022d\u0232\5"+
		"X-\2\u022e\u022f\f\3\2\2\u022f\u0230\7\u00f1\2\2\u0230\u0232\5X-\2\u0231"+
		"\u0225\3\2\2\2\u0231\u0228\3\2\2\2\u0231\u022b\3\2\2\2\u0231\u022e\3\2"+
		"\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"[\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\b/\1\2\u0237\u0238\5Z.\2\u0238"+
		"\u0241\3\2\2\2\u0239\u023a\f\4\2\2\u023a\u023b\7\u00f2\2\2\u023b\u0240"+
		"\5Z.\2\u023c\u023d\f\3\2\2\u023d\u023e\7\u00f3\2\2\u023e\u0240\5Z.\2\u023f"+
		"\u0239\3\2\2\2\u023f\u023c\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242]\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245"+
		"\b\60\1\2\u0245\u0246\5\\/\2\u0246\u024c\3\2\2\2\u0247\u0248\f\3\2\2\u0248"+
		"\u0249\7\u0117\2\2\u0249\u024b\5\\/\2\u024a\u0247\3\2\2\2\u024b\u024e"+
		"\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d_\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0250\b\61\1\2\u0250\u0251\5^\60\2\u0251\u0257\3"+
		"\2\2\2\u0252\u0253\f\3\2\2\u0253\u0254\7\u0116\2\2\u0254\u0256\5^\60\2"+
		"\u0255\u0252\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\b\62\1\2\u025b"+
		"\u025c\5`\61\2\u025c\u0262\3\2\2\2\u025d\u025e\f\3\2\2\u025e\u025f\7\u0115"+
		"\2\2\u025f\u0261\5`\61\2\u0260\u025d\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263c\3\2\2\2\u0264\u0262\3\2\2\2"+
		"\u0265\u0266\b\63\1\2\u0266\u0267\5b\62\2\u0267\u026d\3\2\2\2\u0268\u0269"+
		"\f\3\2\2\u0269\u026a\7\u00f4\2\2\u026a\u026c\5b\62\2\u026b\u0268\3\2\2"+
		"\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026ee"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\b\64\1\2\u0271\u0272\5d\63\2"+
		"\u0272\u0278\3\2\2\2\u0273\u0274\f\3\2\2\u0274\u0275\7\u00f6\2\2\u0275"+
		"\u0277\5d\63\2\u0276\u0273\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279g\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c"+
		"\b\65\1\2\u027c\u027d\5f\64\2\u027d\u0283\3\2\2\2\u027e\u027f\f\3\2\2"+
		"\u027f\u0280\7\u00f5\2\2\u0280\u0282\5f\64\2\u0281\u027e\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284i\3\2\2\2"+
		"\u0285\u0283\3\2\2\2\u0286\u028e\5h\65\2\u0287\u0288\5h\65\2\u0288\u0289"+
		"\7\u0118\2\2\u0289\u028a\5p9\2\u028a\u028b\7\u0109\2\2\u028b\u028c\5l"+
		"\67\2\u028c\u028e\3\2\2\2\u028d\u0286\3\2\2\2\u028d\u0287\3\2\2\2\u028e"+
		"k\3\2\2\2\u028f\u0295\5j\66\2\u0290\u0291\5P)\2\u0291\u0292\5n8\2\u0292"+
		"\u0293\5l\67\2\u0293\u0295\3\2\2\2\u0294\u028f\3\2\2\2\u0294\u0290\3\2"+
		"\2\2\u0295m\3\2\2\2\u0296\u0297\t\16\2\2\u0297o\3\2\2\2\u0298\u0299\b"+
		"9\1\2\u0299\u029a\5l\67\2\u029a\u02a0\3\2\2\2\u029b\u029c\f\3\2\2\u029c"+
		"\u029d\7\u0108\2\2\u029d\u029f\5l\67\2\u029e\u029b\3\2\2\2\u029f\u02a2"+
		"\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1q\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a4\5j\66\2\u02a4s\3\2\2\2\u02a5\u02a6\b;\1\2\u02a6"+
		"\u02a7\5:\36\2\u02a7\u02ad\3\2\2\2\u02a8\u02a9\f\3\2\2\u02a9\u02aa\7\u0108"+
		"\2\2\u02aa\u02ac\5:\36\2\u02ab\u02a8\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02aeu\3\2\2\2\u02af\u02ad\3\2\2\2"+
		"\u02b0\u02b5\5z>\2\u02b1\u02b2\5z>\2\u02b2\u02b3\5x=\2\u02b3\u02b5\3\2"+
		"\2\2\u02b4\u02b0\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b5w\3\2\2\2\u02b6\u02b7"+
		"\b=\1\2\u02b7\u02b8\7\u0103\2\2\u02b8\u02be\7\u0104\2\2\u02b9\u02ba\7"+
		"\u0103\2\2\u02ba\u02bb\5r:\2\u02bb\u02bc\7\u0104\2\2\u02bc\u02be\3\2\2"+
		"\2\u02bd\u02b6\3\2\2\2\u02bd\u02b9\3\2\2\2\u02be\u02c9\3\2\2\2\u02bf\u02c0"+
		"\f\4\2\2\u02c0\u02c1\7\u0103\2\2\u02c1\u02c8\7\u0104\2\2\u02c2\u02c3\f"+
		"\3\2\2\u02c3\u02c4\7\u0103\2\2\u02c4\u02c5\5r:\2\u02c5\u02c6\7\u0104\2"+
		"\2\u02c6\u02c8\3\2\2\2\u02c7\u02bf\3\2\2\2\u02c7\u02c2\3\2\2\2\u02c8\u02cb"+
		"\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02cay\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cc\u0347\7>\2\2\u02cd\u0347\7;\2\2\u02ce\u0347\7<\2"+
		"\2\u02cf\u0347\7=\2\2\u02d0\u0347\7j\2\2\u02d1\u0347\7?\2\2\u02d2\u0347"+
		"\7^\2\2\u02d3\u0347\7_\2\2\u02d4\u0347\7`\2\2\u02d5\u0347\7g\2\2\u02d6"+
		"\u0347\7h\2\2\u02d7\u0347\7i\2\2\u02d8\u0347\7d\2\2\u02d9\u0347\7e\2\2"+
		"\u02da\u0347\7f\2\2\u02db\u0347\7a\2\2\u02dc\u0347\7b\2\2\u02dd\u0347"+
		"\7c\2\2\u02de\u0347\7k\2\2\u02df\u0347\7l\2\2\u02e0\u0347\7m\2\2\u02e1"+
		"\u0347\7F\2\2\u02e2\u0347\7G\2\2\u02e3\u0347\7H\2\2\u02e4\u0347\7L\2\2"+
		"\u02e5\u0347\7M\2\2\u02e6\u0347\7N\2\2\u02e7\u0347\7R\2\2\u02e8\u0347"+
		"\7S\2\2\u02e9\u0347\7T\2\2\u02ea\u0347\7X\2\2\u02eb\u0347\7Y\2\2\u02ec"+
		"\u0347\7Z\2\2\u02ed\u0347\7I\2\2\u02ee\u0347\7J\2\2\u02ef\u0347\7K\2\2"+
		"\u02f0\u0347\7O\2\2\u02f1\u0347\7P\2\2\u02f2\u0347\7Q\2\2\u02f3\u0347"+
		"\7U\2\2\u02f4\u0347\7V\2\2\u02f5\u0347\7W\2\2\u02f6\u0347\7[\2\2\u02f7"+
		"\u0347\7\\\2\2\u02f8\u0347\7]\2\2\u02f9\u0347\7%\2\2\u02fa\u0347\7r\2"+
		"\2\u02fb\u0347\7s\2\2\u02fc\u0347\7t\2\2\u02fd\u0347\7u\2\2\u02fe\u0347"+
		"\7v\2\2\u02ff\u0347\7w\2\2\u0300\u0347\7x\2\2\u0301\u0347\7y\2\2\u0302"+
		"\u0347\7z\2\2\u0303\u0347\7{\2\2\u0304\u0347\7|\2\2\u0305\u0347\7\u0096"+
		"\2\2\u0306\u0347\7\u0097\2\2\u0307\u0347\7}\2\2\u0308\u0347\7~\2\2\u0309"+
		"\u0347\7\177\2\2\u030a\u0347\7\u0080\2\2\u030b\u0347\7\u0081\2\2\u030c"+
		"\u0347\7\u0082\2\2\u030d\u0347\7\u0098\2\2\u030e\u0347\7\u0083\2\2\u030f"+
		"\u0347\7\u0084\2\2\u0310\u0347\7\u0085\2\2\u0311\u0347\7\u0086\2\2\u0312"+
		"\u0347\7\u0087\2\2\u0313\u0347\7\u0088\2\2\u0314\u0347\7\u0099\2\2\u0315"+
		"\u0347\7\u0089\2\2\u0316\u0347\7\u008a\2\2\u0317\u0347\7\u008b\2\2\u0318"+
		"\u0347\7\u008c\2\2\u0319\u0347\7\u008d\2\2\u031a\u0347\7\u008e\2\2\u031b"+
		"\u0347\7\u008f\2\2\u031c\u0347\7\u0090\2\2\u031d\u0347\7\u0091\2\2\u031e"+
		"\u0347\7\u0092\2\2\u031f\u0347\7\u0093\2\2\u0320\u0347\7\u0094\2\2\u0321"+
		"\u0347\7\u0095\2\2\u0322\u0347\7\u009a\2\2\u0323\u0347\7\u009b\2\2\u0324"+
		"\u0347\7\u009c\2\2\u0325\u0347\7\u009d\2\2\u0326\u0347\7\u009e\2\2\u0327"+
		"\u0347\7\u009f\2\2\u0328\u0347\7\u00a0\2\2\u0329\u0347\7\u00a1\2\2\u032a"+
		"\u0347\7\u00a2\2\2\u032b\u0347\7\u00a3\2\2\u032c\u0347\7\u00a4\2\2\u032d"+
		"\u0347\7\u00a5\2\2\u032e\u0347\7\u00a6\2\2\u032f\u0347\7\u00a7\2\2\u0330"+
		"\u0347\7\u00a8\2\2\u0331\u0347\7\u00a9\2\2\u0332\u0347\7\u00aa\2\2\u0333"+
		"\u0347\7\u00ab\2\2\u0334\u0347\7\u00ac\2\2\u0335\u0347\7\u00ad\2\2\u0336"+
		"\u0347\7\u00ae\2\2\u0337\u0347\7\u00af\2\2\u0338\u0347\7\u00b0\2\2\u0339"+
		"\u0347\7\u00b1\2\2\u033a\u0347\7\u00b2\2\2\u033b\u0347\7\u00b3\2\2\u033c"+
		"\u0347\7\u00b4\2\2\u033d\u0347\7\u00b5\2\2\u033e\u0347\7\u00b6\2\2\u033f"+
		"\u0347\7\u00b7\2\2\u0340\u0347\7\u00b8\2\2\u0341\u0347\7\u00b9\2\2\u0342"+
		"\u0347\7\u00ba\2\2\u0343\u0347\7\u00e3\2\2\u0344\u0347\5|?\2\u0345\u0347"+
		"\5:\36\2\u0346\u02cc\3\2\2\2\u0346\u02cd\3\2\2\2\u0346\u02ce\3\2\2\2\u0346"+
		"\u02cf\3\2\2\2\u0346\u02d0\3\2\2\2\u0346\u02d1\3\2\2\2\u0346\u02d2\3\2"+
		"\2\2\u0346\u02d3\3\2\2\2\u0346\u02d4\3\2\2\2\u0346\u02d5\3\2\2\2\u0346"+
		"\u02d6\3\2\2\2\u0346\u02d7\3\2\2\2\u0346\u02d8\3\2\2\2\u0346\u02d9\3\2"+
		"\2\2\u0346\u02da\3\2\2\2\u0346\u02db\3\2\2\2\u0346\u02dc\3\2\2\2\u0346"+
		"\u02dd\3\2\2\2\u0346\u02de\3\2\2\2\u0346\u02df\3\2\2\2\u0346\u02e0\3\2"+
		"\2\2\u0346\u02e1\3\2\2\2\u0346\u02e2\3\2\2\2\u0346\u02e3\3\2\2\2\u0346"+
		"\u02e4\3\2\2\2\u0346\u02e5\3\2\2\2\u0346\u02e6\3\2\2\2\u0346\u02e7\3\2"+
		"\2\2\u0346\u02e8\3\2\2\2\u0346\u02e9\3\2\2\2\u0346\u02ea\3\2\2\2\u0346"+
		"\u02eb\3\2\2\2\u0346\u02ec\3\2\2\2\u0346\u02ed\3\2\2\2\u0346\u02ee\3\2"+
		"\2\2\u0346\u02ef\3\2\2\2\u0346\u02f0\3\2\2\2\u0346\u02f1\3\2\2\2\u0346"+
		"\u02f2\3\2\2\2\u0346\u02f3\3\2\2\2\u0346\u02f4\3\2\2\2\u0346\u02f5\3\2"+
		"\2\2\u0346\u02f6\3\2\2\2\u0346\u02f7\3\2\2\2\u0346\u02f8\3\2\2\2\u0346"+
		"\u02f9\3\2\2\2\u0346\u02fa\3\2\2\2\u0346\u02fb\3\2\2\2\u0346\u02fc\3\2"+
		"\2\2\u0346\u02fd\3\2\2\2\u0346\u02fe\3\2\2\2\u0346\u02ff\3\2\2\2\u0346"+
		"\u0300\3\2\2\2\u0346\u0301\3\2\2\2\u0346\u0302\3\2\2\2\u0346\u0303\3\2"+
		"\2\2\u0346\u0304\3\2\2\2\u0346\u0305\3\2\2\2\u0346\u0306\3\2\2\2\u0346"+
		"\u0307\3\2\2\2\u0346\u0308\3\2\2\2\u0346\u0309\3\2\2\2\u0346\u030a\3\2"+
		"\2\2\u0346\u030b\3\2\2\2\u0346\u030c\3\2\2\2\u0346\u030d\3\2\2\2\u0346"+
		"\u030e\3\2\2\2\u0346\u030f\3\2\2\2\u0346\u0310\3\2\2\2\u0346\u0311\3\2"+
		"\2\2\u0346\u0312\3\2\2\2\u0346\u0313\3\2\2\2\u0346\u0314\3\2\2\2\u0346"+
		"\u0315\3\2\2\2\u0346\u0316\3\2\2\2\u0346\u0317\3\2\2\2\u0346\u0318\3\2"+
		"\2\2\u0346\u0319\3\2\2\2\u0346\u031a\3\2\2\2\u0346\u031b\3\2\2\2\u0346"+
		"\u031c\3\2\2\2\u0346\u031d\3\2\2\2\u0346\u031e\3\2\2\2\u0346\u031f\3\2"+
		"\2\2\u0346\u0320\3\2\2\2\u0346\u0321\3\2\2\2\u0346\u0322\3\2\2\2\u0346"+
		"\u0323\3\2\2\2\u0346\u0324\3\2\2\2\u0346\u0325\3\2\2\2\u0346\u0326\3\2"+
		"\2\2\u0346\u0327\3\2\2\2\u0346\u0328\3\2\2\2\u0346\u0329\3\2\2\2\u0346"+
		"\u032a\3\2\2\2\u0346\u032b\3\2\2\2\u0346\u032c\3\2\2\2\u0346\u032d\3\2"+
		"\2\2\u0346\u032e\3\2\2\2\u0346\u032f\3\2\2\2\u0346\u0330\3\2\2\2\u0346"+
		"\u0331\3\2\2\2\u0346\u0332\3\2\2\2\u0346\u0333\3\2\2\2\u0346\u0334\3\2"+
		"\2\2\u0346\u0335\3\2\2\2\u0346\u0336\3\2\2\2\u0346\u0337\3\2\2\2\u0346"+
		"\u0338\3\2\2\2\u0346\u0339\3\2\2\2\u0346\u033a\3\2\2\2\u0346\u033b\3\2"+
		"\2\2\u0346\u033c\3\2\2\2\u0346\u033d\3\2\2\2\u0346\u033e\3\2\2\2\u0346"+
		"\u033f\3\2\2\2\u0346\u0340\3\2\2\2\u0346\u0341\3\2\2\2\u0346\u0342\3\2"+
		"\2\2\u0346\u0343\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347"+
		"{\3\2\2\2\u0348\u0349\7\u00bb\2\2\u0349\u034a\7\u00e7\2\2\u034a\u034b"+
		"\7\u0105\2\2\u034b\u034c\5~@\2\u034c\u034d\7\u0106\2\2\u034d\u0354\3\2"+
		"\2\2\u034e\u034f\7\u00bb\2\2\u034f\u0350\7\u0105\2\2\u0350\u0351\5~@\2"+
		"\u0351\u0352\7\u0106\2\2\u0352\u0354\3\2\2\2\u0353\u0348\3\2\2\2\u0353"+
		"\u034e\3\2\2\2\u0354}\3\2\2\2\u0355\u0356\b@\1\2\u0356\u0357\5\u0080A"+
		"\2\u0357\u035c\3\2\2\2\u0358\u0359\f\3\2\2\u0359\u035b\5\u0080A\2\u035a"+
		"\u0358\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2"+
		"\2\2\u035d\177\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\5v<\2\u0360\u0361"+
		"\5\u0082B\2\u0361\u0362\7\u010b\2\2\u0362\u0369\3\2\2\2\u0363\u0364\5"+
		"\u0092J\2\u0364\u0365\5v<\2\u0365\u0366\5\u0082B\2\u0366\u0367\7\u010b"+
		"\2\2\u0367\u0369\3\2\2\2\u0368\u035f\3\2\2\2\u0368\u0363\3\2\2\2\u0369"+
		"\u0081\3\2\2\2\u036a\u036b\bB\1\2\u036b\u036c\5\u0084C\2\u036c\u0372\3"+
		"\2\2\2\u036d\u036e\f\3\2\2\u036e\u036f\7\u0108\2\2\u036f\u0371\5\u0084"+
		"C\2\u0370\u036d\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0083\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0379\7\u00e7"+
		"\2\2\u0376\u0377\7\u00e7\2\2\u0377\u0379\5x=\2\u0378\u0375\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0379\u0085\3\2\2\2\u037a\u037b\7B\2\2\u037b\u0087\3\2"+
		"\2\2\u037c\u037d\t\17\2\2\u037d\u0089\3\2\2\2\u037e\u037f\7&\2\2\u037f"+
		"\u0380\7\u0101\2\2\u0380\u0381\5\u008cG\2\u0381\u0382\7\u0102\2\2\u0382"+
		"\u008b\3\2\2\2\u0383\u0384\bG\1\2\u0384\u0385\5\u008eH\2\u0385\u038b\3"+
		"\2\2\2\u0386\u0387\f\3\2\2\u0387\u0388\7\u0108\2\2\u0388\u038a\5\u008e"+
		"H\2\u0389\u0386\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u008d\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0394\7\u00e7"+
		"\2\2\u038f\u0390\7\u00e7\2\2\u0390\u0391\7\u010a\2\2\u0391\u0394\5r:\2"+
		"\u0392\u0394\7\37\2\2\u0393\u038e\3\2\2\2\u0393\u038f\3\2\2\2\u0393\u0392"+
		"\3\2\2\2\u0394\u008f\3\2\2\2\u0395\u0396\7C\2\2\u0396\u0091\3\2\2\2\u0397"+
		"\u0398\bJ\1\2\u0398\u0399\5\u0094K\2\u0399\u039e\3\2\2\2\u039a\u039b\f"+
		"\3\2\2\u039b\u039d\5\u0094K\2\u039c\u039a\3\2\2\2\u039d\u03a0\3\2\2\2"+
		"\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u0093\3\2\2\2\u03a0\u039e"+
		"\3\2\2\2\u03a1\u03a8\5\u0096L\2\u03a2\u03a8\5\u008aF\2\u03a3\u03a8\5\u0098"+
		"M\2\u03a4\u03a8\5\u0088E\2\u03a5\u03a8\5\u0086D\2\u03a6\u03a8\5\u0090"+
		"I\2\u03a7\u03a1\3\2\2\2\u03a7\u03a2\3\2\2\2\u03a7\u03a3\3\2\2\2\u03a7"+
		"\u03a4\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u0095\3\2"+
		"\2\2\u03a9\u03c1\7\33\2\2\u03aa\u03c1\7\32\2\2\u03ab\u03c1\7\35\2\2\u03ac"+
		"\u03c1\7:\2\2\u03ad\u03c1\78\2\2\u03ae\u03c1\79\2\2\u03af\u03c1\7\'\2"+
		"\2\u03b0\u03c1\7+\2\2\u03b1\u03c1\7,\2\2\u03b2\u03c1\7\34\2\2\u03b3\u03c1"+
		"\7\36\2\2\u03b4\u03c1\7\37\2\2\u03b5\u03c1\7 \2\2\u03b6\u03c1\7!\2\2\u03b7"+
		"\u03c1\7\"\2\2\u03b8\u03c1\7#\2\2\u03b9\u03c1\7$\2\2\u03ba\u03c1\7\67"+
		"\2\2\u03bb\u03bc\7\67\2\2\u03bc\u03bd\7\u0101\2\2\u03bd\u03be\5t;\2\u03be"+
		"\u03bf\7\u0102\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03a9\3\2\2\2\u03c0\u03aa"+
		"\3\2\2\2\u03c0\u03ab\3\2\2\2\u03c0\u03ac\3\2\2\2\u03c0\u03ad\3\2\2\2\u03c0"+
		"\u03ae\3\2\2\2\u03c0\u03af\3\2\2\2\u03c0\u03b0\3\2\2\2\u03c0\u03b1\3\2"+
		"\2\2\u03c0\u03b2\3\2\2\2\u03c0\u03b3\3\2\2\2\u03c0\u03b4\3\2\2\2\u03c0"+
		"\u03b5\3\2\2\2\u03c0\u03b6\3\2\2\2\u03c0\u03b7\3\2\2\2\u03c0\u03b8\3\2"+
		"\2\2\u03c0\u03b9\3\2\2\2\u03c0\u03ba\3\2\2\2\u03c0\u03bb\3\2\2\2\u03c1"+
		"\u0097\3\2\2\2\u03c2\u03c3\t\20\2\2\u03c3\u0099\3\2\2\2G\u009b\u009e\u00a3"+
		"\u00a8\u00ac\u00af\u00b8\u00bf\u00c6\u00c8\u00cd\u00d4\u00da\u00ef\u0114"+
		"\u011a\u012e\u0139\u0140\u0145\u0149\u014e\u0153\u015c\u0169\u019a\u01ae"+
		"\u01bd\u01cd\u01cf\u01dc\u01e2\u01e5\u01f1\u0201\u0203\u020f\u0211\u021d"+
		"\u021f\u0231\u0233\u023f\u0241\u024c\u0257\u0262\u026d\u0278\u0283\u028d"+
		"\u0294\u02a0\u02ad\u02b4\u02bd\u02c7\u02c9\u0346\u0353\u035c\u0368\u0372"+
		"\u0378\u038b\u0393\u039e\u03a7\u03c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}