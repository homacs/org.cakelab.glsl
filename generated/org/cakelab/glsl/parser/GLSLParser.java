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
		FILTER=196, SIZEOF=197, CAST=198, NAMESPACE=199, USING=200, PPOP_DEFINED=201, 
		WHITESPACE=202, CRLF=203, HIDDEN_CRLF=204, LINE_CONTINUATION=205, MULTILINE_COMMENT=206, 
		SINGLELINE_COMMENT=207, BOOLCONSTANT=208, FLOATCONSTANT=209, DOUBLECONSTANT=210, 
		INTCONSTANT=211, UINTCONSTANT=212, CHARACTER_CONSTANT=213, PREFIXED_CHARACTER_CONSTANT=214, 
		STRING_LITERAL=215, STD_HEADER_NAME=216, PREFIXED_STRING_LITERAL=217, 
		LEFT_OP=218, RIGHT_OP=219, INC_OP=220, DEC_OP=221, LE_OP=222, GE_OP=223, 
		EQ_OP=224, NE_OP=225, AND_OP=226, OR_OP=227, XOR_OP=228, MUL_ASSIGN=229, 
		DIV_ASSIGN=230, ADD_ASSIGN=231, MOD_ASSIGN=232, LEFT_ASSIGN=233, RIGHT_ASSIGN=234, 
		AND_ASSIGN=235, XOR_ASSIGN=236, OR_ASSIGN=237, SUB_ASSIGN=238, LEFT_PAREN=239, 
		RIGHT_PAREN=240, LEFT_BRACKET=241, RIGHT_BRACKET=242, LEFT_BRACE=243, 
		RIGHT_BRACE=244, DOT=245, COMMA=246, COLON=247, EQUAL=248, SEMICOLON=249, 
		BANG=250, DASH=251, TILDE=252, PLUS=253, STAR=254, SLASH=255, PERCENT=256, 
		LEFT_ANGLE=257, RIGHT_ANGLE=258, VERTICAL_BAR=259, CARET=260, AMPERSAND=261, 
		QUESTION=262, HASH=263, PPOP_CONCAT=264, DOTS=265, DOUBLE_QUOTE=266, SINGLE_QUOTE=267, 
		TYPE_NAME=268, FUNCTION_NAME=269, IDENTIFIER=270;
	public static final int
		RULE_glsl = 0, RULE_glslDeclaration = 1, RULE_glslBlockStructure = 2, 
		RULE_glslIdentifierList = 3, RULE_glslFunctionPrototype = 4, RULE_glslFunctionDeclarator = 5, 
		RULE_glslFunctionHeaderWithParameters = 6, RULE_glslFunctionHeader = 7, 
		RULE_glslParameterDeclarator = 8, RULE_glslParameterDeclaration = 9, RULE_glslParameterTypeSpecifier = 10, 
		RULE_glslInitDeclaratorList = 11, RULE_glslSingleDeclaration = 12, RULE_glslVariableDeclarator = 13, 
		RULE_glslFullySpecifiedType = 14, RULE_glslInitializer = 15, RULE_glslInitializerList = 16, 
		RULE_glslDeclarationStatement = 17, RULE_glslStatement = 18, RULE_glslSimpleStatement = 19, 
		RULE_glslCompoundStatement = 20, RULE_glslStatementNoNewScope = 21, RULE_glslStatementScoped = 22, 
		RULE_glslCompoundStatementNoNewScope = 23, RULE_glslStatementList = 24, 
		RULE_glslExpressionStatement = 25, RULE_glslSelectionStatement = 26, RULE_glslSelectionRestStatement = 27, 
		RULE_glslCondition = 28, RULE_glslSwitchStatement = 29, RULE_glslSwitchStatementList = 30, 
		RULE_glslCaseLabel = 31, RULE_glslIterationStatement = 32, RULE_glslForInitStatement = 33, 
		RULE_glslConditionopt = 34, RULE_glslForRestStatement = 35, RULE_glslJumpStatement = 36, 
		RULE_glslTranslationUnit = 37, RULE_glslExternalDeclaration = 38, RULE_glslFunctionDefinition = 39, 
		RULE_glslFieldSelection = 40, RULE_glslVariableIdentifier = 41, RULE_glslTypeName = 42, 
		RULE_glslFunctionName = 43, RULE_glslBoolConstant = 44, RULE_glslIntegerConstant = 45, 
		RULE_glslUnsignedIntegerConstant = 46, RULE_glslFloatConstant = 47, RULE_glslDoubleConstant = 48, 
		RULE_glslPrimaryExpression = 49, RULE_glslPostfixExpression = 50, RULE_glslConstructorCallArguments = 51, 
		RULE_glslFunctionCallArguments = 52, RULE_glslCallArguments = 53, RULE_glslIntegerExpression = 54, 
		RULE_glslUnaryExpression = 55, RULE_glslUnaryOperator = 56, RULE_glslMultiplicativeExpression = 57, 
		RULE_glslAdditiveExpression = 58, RULE_glslShiftExpression = 59, RULE_glslRelationalExpression = 60, 
		RULE_glslEqualityExpression = 61, RULE_glslAndExpression = 62, RULE_glslExclusiveOrExpression = 63, 
		RULE_glslInclusiveOrExpression = 64, RULE_glslLogicalAndExpression = 65, 
		RULE_glslLogicalXorExpression = 66, RULE_glslLogicalOrExpression = 67, 
		RULE_glslConditionalExpression = 68, RULE_glslAssignmentExpression = 69, 
		RULE_glslAssignmentOperator = 70, RULE_glslExpression = 71, RULE_glslConstantExpression = 72, 
		RULE_glslFunctionNameList = 73, RULE_glslTypeSpecifier = 74, RULE_glslArrayDimensionsList = 75, 
		RULE_glslArrayDimension = 76, RULE_glslTypeSpecifierNonarray = 77, RULE_glslBuiltinType = 78, 
		RULE_glslStructSpecifier = 79, RULE_glslStructMemberList = 80, RULE_glslStructMemberGroup = 81, 
		RULE_glslStructMemberDeclaratorList = 82, RULE_glslStructMemberDeclarator = 83, 
		RULE_glslTypeQualifier = 84, RULE_glslSingleTypeQualifier = 85, RULE_glslInvariantQualifier = 86, 
		RULE_glslInterpolationQualifier = 87, RULE_glslLayoutQualifier = 88, RULE_glslLayoutQualifierIdList = 89, 
		RULE_glslLayoutQualifierId = 90, RULE_glslPreciseQualifier = 91, RULE_glslStorageQualifier = 92, 
		RULE_glslPrecisionQualifier = 93;
	public static final String[] ruleNames = {
		"glsl", "glslDeclaration", "glslBlockStructure", "glslIdentifierList", 
		"glslFunctionPrototype", "glslFunctionDeclarator", "glslFunctionHeaderWithParameters", 
		"glslFunctionHeader", "glslParameterDeclarator", "glslParameterDeclaration", 
		"glslParameterTypeSpecifier", "glslInitDeclaratorList", "glslSingleDeclaration", 
		"glslVariableDeclarator", "glslFullySpecifiedType", "glslInitializer", 
		"glslInitializerList", "glslDeclarationStatement", "glslStatement", "glslSimpleStatement", 
		"glslCompoundStatement", "glslStatementNoNewScope", "glslStatementScoped", 
		"glslCompoundStatementNoNewScope", "glslStatementList", "glslExpressionStatement", 
		"glslSelectionStatement", "glslSelectionRestStatement", "glslCondition", 
		"glslSwitchStatement", "glslSwitchStatementList", "glslCaseLabel", "glslIterationStatement", 
		"glslForInitStatement", "glslConditionopt", "glslForRestStatement", "glslJumpStatement", 
		"glslTranslationUnit", "glslExternalDeclaration", "glslFunctionDefinition", 
		"glslFieldSelection", "glslVariableIdentifier", "glslTypeName", "glslFunctionName", 
		"glslBoolConstant", "glslIntegerConstant", "glslUnsignedIntegerConstant", 
		"glslFloatConstant", "glslDoubleConstant", "glslPrimaryExpression", "glslPostfixExpression", 
		"glslConstructorCallArguments", "glslFunctionCallArguments", "glslCallArguments", 
		"glslIntegerExpression", "glslUnaryExpression", "glslUnaryOperator", "glslMultiplicativeExpression", 
		"glslAdditiveExpression", "glslShiftExpression", "glslRelationalExpression", 
		"glslEqualityExpression", "glslAndExpression", "glslExclusiveOrExpression", 
		"glslInclusiveOrExpression", "glslLogicalAndExpression", "glslLogicalXorExpression", 
		"glslLogicalOrExpression", "glslConditionalExpression", "glslAssignmentExpression", 
		"glslAssignmentOperator", "glslExpression", "glslConstantExpression", 
		"glslFunctionNameList", "glslTypeSpecifier", "glslArrayDimensionsList", 
		"glslArrayDimension", "glslTypeSpecifierNonarray", "glslBuiltinType", 
		"glslStructSpecifier", "glslStructMemberList", "glslStructMemberGroup", 
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
		"'filter'", "'sizeof'", "'cast'", "'namespace'", "'using'", "'defined'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'<<'", "'>>'", "'++'", "'--'", "'<='", "'>='", 
		"'=='", "'!='", "'&&'", "'||'", "'^^'", "'*='", "'\\='", "'+='", "'%='", 
		"'<<='", "'>>='", "'&='", "'^='", "'|='", "'-='", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'.'", "','", "':'", "'='", "';'", "'!'", "'-'", 
		"'~'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", "'|'", "'^'", "'&'", 
		"'?'", "'#'", "'##'", "'...'", "'\"'", "'''"
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
		"FILTER", "SIZEOF", "CAST", "NAMESPACE", "USING", "PPOP_DEFINED", "WHITESPACE", 
		"CRLF", "HIDDEN_CRLF", "LINE_CONTINUATION", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", 
		"BOOLCONSTANT", "FLOATCONSTANT", "DOUBLECONSTANT", "INTCONSTANT", "UINTCONSTANT", 
		"CHARACTER_CONSTANT", "PREFIXED_CHARACTER_CONSTANT", "STRING_LITERAL", 
		"STD_HEADER_NAME", "PREFIXED_STRING_LITERAL", "LEFT_OP", "RIGHT_OP", "INC_OP", 
		"DEC_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", "AND_OP", "OR_OP", "XOR_OP", 
		"MUL_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", "MOD_ASSIGN", "LEFT_ASSIGN", 
		"RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "SUB_ASSIGN", 
		"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", 
		"RIGHT_BRACE", "DOT", "COMMA", "COLON", "EQUAL", "SEMICOLON", "BANG", 
		"DASH", "TILDE", "PLUS", "STAR", "SLASH", "PERCENT", "LEFT_ANGLE", "RIGHT_ANGLE", 
		"VERTICAL_BAR", "CARET", "AMPERSAND", "QUESTION", "HASH", "PPOP_CONCAT", 
		"DOTS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "TYPE_NAME", "FUNCTION_NAME", 
		"IDENTIFIER"
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


		public boolean preprocessing = false;
		public void preprocessing(boolean enable) {
			preprocessing = enable;
		}
		private org.cakelab.glsl.parser.Validator validator = new org.cakelab.glsl.parser.Validator();
		public void setValidator(org.cakelab.glsl.parser.Validator validator) {
			this.validator = validator;
		}
		

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
			setState(188);
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
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				glslFunctionPrototype();
				setState(191);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				glslInitDeclaratorList(0);
				setState(194);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(PRECISION);
				setState(197);
				glslPrecisionQualifier();
				setState(198);
				glslTypeSpecifier();
				setState(199);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				glslBlockStructure();
				setState(202);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				glslBlockStructure();
				setState(205);
				match(IDENTIFIER);
				setState(206);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				glslBlockStructure();
				setState(209);
				match(IDENTIFIER);
				setState(210);
				glslArrayDimensionsList();
				setState(211);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				glslTypeQualifier();
				setState(214);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				glslTypeQualifier();
				setState(217);
				match(IDENTIFIER);
				setState(218);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(220);
				glslTypeQualifier();
				setState(221);
				match(IDENTIFIER);
				setState(222);
				glslIdentifierList(0);
				setState(223);
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
		public GlslStructMemberListContext glslStructMemberList() {
			return getRuleContext(GlslStructMemberListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public TerminalNode TYPE_NAME() { return getToken(GLSLParser.TYPE_NAME, 0); }
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				glslTypeQualifier();
				setState(228);
				match(IDENTIFIER);
				setState(229);
				match(LEFT_BRACE);
				setState(230);
				glslStructMemberList();
				setState(231);
				match(RIGHT_BRACE);
				validator.addDeclaredInterfaceBlock(_localctx);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				glslTypeQualifier();
				setState(235);
				match(TYPE_NAME);
				setState(236);
				match(LEFT_BRACE);
				setState(237);
				glslStructMemberList();
				setState(238);
				match(RIGHT_BRACE);
				validator.addDeclaredInterfaceBlock(_localctx);
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
			setState(244);
			match(COMMA);
			setState(245);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslIdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslIdentifierList);
					setState(247);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(248);
					match(COMMA);
					setState(249);
					match(IDENTIFIER);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(255);
			glslFunctionDeclarator();
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				glslFunctionHeader();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
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
			setState(263);
			glslFunctionHeader();
			setState(264);
			glslParameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslFunctionHeaderWithParametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslFunctionHeaderWithParameters);
					setState(266);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(267);
					match(COMMA);
					setState(268);
					glslParameterDeclaration();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode FUNCTION_NAME() { return getToken(GLSLParser.FUNCTION_NAME, 0); }
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				glslFullySpecifiedType();
				setState(275);
				match(IDENTIFIER);
				setState(276);
				match(LEFT_PAREN);
				validator.addDeclaredFunction(_localctx);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				glslFullySpecifiedType();
				setState(280);
				match(FUNCTION_NAME);
				setState(281);
				match(LEFT_PAREN);
				validator.addDeclaredFunction(_localctx);
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

	public static class GlslParameterDeclaratorContext extends ParserRuleContext {
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
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
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				glslTypeSpecifier();
				setState(287);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				glslTypeSpecifier();
				setState(290);
				match(IDENTIFIER);
				setState(291);
				glslArrayDimensionsList();
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				glslTypeQualifier();
				setState(296);
				glslParameterDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				glslParameterDeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				glslTypeQualifier();
				setState(300);
				glslParameterTypeSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
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
			setState(305);
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
		public GlslVariableDeclaratorContext glslVariableDeclarator() {
			return getRuleContext(GlslVariableDeclaratorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
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
			setState(308);
			glslSingleDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(310);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(311);
						match(COMMA);
						setState(312);
						glslVariableDeclarator();
						}
						break;
					case 2:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(313);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(314);
						match(COMMA);
						setState(315);
						glslVariableDeclarator();
						setState(316);
						match(EQUAL);
						setState(317);
						glslInitializer();
						}
						break;
					case 3:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						match(COMMA);
						setState(321);
						glslVariableDeclarator();
						setState(322);
						glslArrayDimensionsList();
						}
						break;
					case 4:
						{
						_localctx = new GlslInitDeclaratorListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslInitDeclaratorList);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						match(COMMA);
						setState(326);
						glslVariableDeclarator();
						setState(327);
						glslArrayDimensionsList();
						setState(328);
						match(EQUAL);
						setState(329);
						glslInitializer();
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public GlslVariableDeclaratorContext glslVariableDeclarator() {
			return getRuleContext(GlslVariableDeclaratorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public GlslInitializerContext glslInitializer() {
			return getRuleContext(GlslInitializerContext.class,0);
		}
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				glslFullySpecifiedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				glslFullySpecifiedType();
				setState(338);
				glslVariableDeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				glslFullySpecifiedType();
				setState(341);
				glslVariableDeclarator();
				setState(342);
				match(EQUAL);
				setState(343);
				glslInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				glslFullySpecifiedType();
				setState(346);
				glslVariableDeclarator();
				setState(347);
				glslArrayDimensionsList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				glslFullySpecifiedType();
				setState(350);
				glslVariableDeclarator();
				setState(351);
				glslArrayDimensionsList();
				setState(352);
				match(EQUAL);
				setState(353);
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

	public static class GlslVariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 26, RULE_glslVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IDENTIFIER);
			validator.addDeclaredVariable(_ctx);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_glslFullySpecifiedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0)) {
				{
				setState(360);
				glslTypeQualifier();
				}
			}

			setState(363);
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
		enterRule(_localctx, 30, RULE_glslInitializer);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				glslAssignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(LEFT_BRACE);
				setState(367);
				glslInitializerList(0);
				setState(368);
				match(RIGHT_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(LEFT_BRACE);
				setState(371);
				glslInitializerList(0);
				setState(372);
				match(COMMA);
				setState(373);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_glslInitializerList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378);
			glslInitializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInitializerList);
					setState(380);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(381);
					match(COMMA);
					setState(382);
					glslInitializer();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 34, RULE_glslDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 36, RULE_glslStatement);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case PPOP_DEFINED:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		enterRule(_localctx, 38, RULE_glslSimpleStatement);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				glslDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				glslExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				glslSelectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				glslCaseLabel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				glslIterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
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
		enterRule(_localctx, 40, RULE_glslCompoundStatement);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(LEFT_BRACE);
				setState(404);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(LEFT_BRACE);
				setState(406);
				glslStatementList(0);
				setState(407);
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
		enterRule(_localctx, 42, RULE_glslStatementNoNewScope);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case PPOP_DEFINED:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
		enterRule(_localctx, 44, RULE_glslStatementScoped);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case PPOP_DEFINED:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
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
		enterRule(_localctx, 46, RULE_glslCompoundStatementNoNewScope);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(LEFT_BRACE);
				setState(420);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(LEFT_BRACE);
				setState(422);
				glslStatementList(0);
				setState(423);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_glslStatementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(428);
			glslStatement();
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslStatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslStatementList);
					setState(430);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(431);
					glslStatement();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 50, RULE_glslExpressionStatement);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case PPOP_DEFINED:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				glslExpression(0);
				setState(439);
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
		enterRule(_localctx, 52, RULE_glslSelectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(IF);
			setState(444);
			match(LEFT_PAREN);
			setState(445);
			glslExpression(0);
			setState(446);
			match(RIGHT_PAREN);
			setState(447);
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
		enterRule(_localctx, 54, RULE_glslSelectionRestStatement);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				glslStatementScoped();
				setState(450);
				match(ELSE);
				setState(451);
				glslStatementScoped();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
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
		enterRule(_localctx, 56, RULE_glslCondition);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				glslExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				glslFullySpecifiedType();
				setState(458);
				match(IDENTIFIER);
				setState(459);
				match(EQUAL);
				setState(460);
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
		enterRule(_localctx, 58, RULE_glslSwitchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(SWITCH);
			setState(465);
			match(LEFT_PAREN);
			setState(466);
			glslExpression(0);
			setState(467);
			match(RIGHT_PAREN);
			setState(468);
			match(LEFT_BRACE);
			setState(469);
			glslSwitchStatementList();
			setState(470);
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
		enterRule(_localctx, 60, RULE_glslSwitchStatementList);
		try {
			setState(474);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case PPOP_DEFINED:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
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
		enterRule(_localctx, 62, RULE_glslCaseLabel);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(CASE);
				setState(477);
				glslExpression(0);
				setState(478);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(DEFAULT);
				setState(481);
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
		enterRule(_localctx, 64, RULE_glslIterationStatement);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(WHILE);
				setState(485);
				match(LEFT_PAREN);
				setState(486);
				glslCondition();
				setState(487);
				match(RIGHT_PAREN);
				setState(488);
				glslStatementNoNewScope();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(DO);
				setState(491);
				glslStatement();
				setState(492);
				match(WHILE);
				setState(493);
				match(LEFT_PAREN);
				setState(494);
				glslExpression(0);
				setState(495);
				match(RIGHT_PAREN);
				setState(496);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(FOR);
				setState(499);
				match(LEFT_PAREN);
				setState(500);
				glslForInitStatement();
				setState(501);
				glslForRestStatement();
				setState(502);
				match(RIGHT_PAREN);
				setState(503);
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
		enterRule(_localctx, 66, RULE_glslForInitStatement);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				glslExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
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
		enterRule(_localctx, 68, RULE_glslConditionopt);
		try {
			setState(513);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case PPOP_DEFINED:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
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
		enterRule(_localctx, 70, RULE_glslForRestStatement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				glslConditionopt();
				setState(516);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				glslConditionopt();
				setState(519);
				match(SEMICOLON);
				setState(520);
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
		enterRule(_localctx, 72, RULE_glslJumpStatement);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(CONTINUE);
				setState(525);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(BREAK);
				setState(527);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(RETURN);
				setState(529);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(RETURN);
				setState(531);
				glslExpression(0);
				setState(532);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				match(DISCARD);
				setState(535);
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
		enterRule(_localctx, 74, RULE_glslTranslationUnit);
		int _la;
		try {
			setState(544);
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
			case SAMPLEREXTERNALOES:
			case STRUCT:
			case TYPE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(538);
					glslExternalDeclaration();
					}
					}
					setState(541); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==TYPE_NAME );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
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
		enterRule(_localctx, 76, RULE_glslExternalDeclaration);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				glslFunctionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
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
		enterRule(_localctx, 78, RULE_glslFunctionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			glslFunctionPrototype();
			setState(551);
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
		enterRule(_localctx, 80, RULE_glslFieldSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		enterRule(_localctx, 82, RULE_glslVariableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		public TerminalNode TYPE_NAME() { return getToken(GLSLParser.TYPE_NAME, 0); }
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
		enterRule(_localctx, 84, RULE_glslTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(TYPE_NAME);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FUNCTION_NAME() { return getToken(GLSLParser.FUNCTION_NAME, 0); }
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
		enterRule(_localctx, 86, RULE_glslFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(FUNCTION_NAME);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_glslBoolConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		enterRule(_localctx, 90, RULE_glslIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 92, RULE_glslUnsignedIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
		enterRule(_localctx, 94, RULE_glslFloatConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 96, RULE_glslDoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		public GlslVariableIdentifierContext glslVariableIdentifier() {
			return getRuleContext(GlslVariableIdentifierContext.class,0);
		}
		public GlslFunctionNameContext glslFunctionName() {
			return getRuleContext(GlslFunctionNameContext.class,0);
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
		enterRule(_localctx, 98, RULE_glslPrimaryExpression);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				glslVariableIdentifier();
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				glslFunctionName();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				glslDoubleConstant();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(576);
				glslUnsignedIntegerConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 7);
				{
				setState(577);
				glslBoolConstant();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(578);
				match(LEFT_PAREN);
				setState(579);
				glslExpression(0);
				setState(580);
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
		public GlslTypeSpecifierContext glslTypeSpecifier() {
			return getRuleContext(GlslTypeSpecifierContext.class,0);
		}
		public GlslConstructorCallArgumentsContext glslConstructorCallArguments() {
			return getRuleContext(GlslConstructorCallArgumentsContext.class,0);
		}
		public GlslPostfixExpressionContext glslPostfixExpression() {
			return getRuleContext(GlslPostfixExpressionContext.class,0);
		}
		public GlslFunctionCallArgumentsContext glslFunctionCallArguments() {
			return getRuleContext(GlslFunctionCallArgumentsContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public GlslIntegerExpressionContext glslIntegerExpression() {
			return getRuleContext(GlslIntegerExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_glslPostfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case LEFT_PAREN:
			case FUNCTION_NAME:
			case IDENTIFIER:
				{
				setState(585);
				glslPrimaryExpression();
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
			case STRUCT:
			case TYPE_NAME:
				{
				setState(586);
				glslTypeSpecifier();
				setState(587);
				glslConstructorCallArguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(591);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(592);
						glslFunctionCallArguments();
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(593);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(594);
						match(LEFT_BRACKET);
						setState(595);
						glslIntegerExpression();
						setState(596);
						match(RIGHT_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(598);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(599);
						match(DOT);
						setState(600);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(601);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(602);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(603);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(604);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(609);
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
		enterRule(_localctx, 102, RULE_glslConstructorCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
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
		enterRule(_localctx, 104, RULE_glslFunctionCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
		enterRule(_localctx, 106, RULE_glslCallArguments);
		int _la;
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(LEFT_PAREN);
				setState(615);
				glslAssignmentExpression();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(616);
					match(COMMA);
					setState(617);
					glslAssignmentExpression();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(623);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(LEFT_PAREN);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(626);
					match(VOID);
					}
				}

				setState(629);
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
		enterRule(_localctx, 108, RULE_glslIntegerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
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
		public TerminalNode PPOP_DEFINED() { return getToken(GLSLParser.PPOP_DEFINED, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 110, RULE_glslUnaryExpression);
		try {
			setState(649);
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				glslPostfixExpression(0);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(INC_OP);
				setState(636);
				glslUnaryExpression();
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				match(DEC_OP);
				setState(638);
				glslUnaryExpression();
				}
				break;
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				glslUnaryOperator();
				setState(640);
				glslUnaryExpression();
				}
				break;
			case PPOP_DEFINED:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				match(PPOP_DEFINED);
				setState(647);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
					{
					{
					setState(643);
					match(LEFT_PAREN);
					setState(644);
					match(IDENTIFIER);
					setState(645);
					match(RIGHT_PAREN);
					}
					}
					break;
				case IDENTIFIER:
					{
					setState(646);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 112, RULE_glslUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (BANG - 250)) | (1L << (DASH - 250)) | (1L << (TILDE - 250)) | (1L << (PLUS - 250)))) != 0)) ) {
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_glslMultiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(654);
			glslUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(665);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(656);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(657);
						match(STAR);
						setState(658);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(659);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(660);
						match(SLASH);
						setState(661);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(662);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(663);
						match(PERCENT);
						setState(664);
						glslUnaryExpression();
						}
						break;
					}
					} 
				}
				setState(669);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_glslAdditiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			glslMultiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(679);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(673);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(674);
						match(PLUS);
						setState(675);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(676);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(677);
						match(DASH);
						setState(678);
						glslMultiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(683);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_glslShiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(685);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(693);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(687);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(688);
						match(LEFT_OP);
						setState(689);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(690);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(691);
						match(RIGHT_OP);
						setState(692);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(697);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_glslRelationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			glslShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(713);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(701);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(702);
						match(LEFT_ANGLE);
						setState(703);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(704);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(705);
						match(RIGHT_ANGLE);
						setState(706);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(707);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(708);
						match(LE_OP);
						setState(709);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(710);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(711);
						match(GE_OP);
						setState(712);
						glslShiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(717);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_glslEqualityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(719);
			glslRelationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(727);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(721);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(722);
						match(EQ_OP);
						setState(723);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(724);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(725);
						match(NE_OP);
						setState(726);
						glslRelationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(731);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_glslAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(733);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(735);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(736);
					match(AMPERSAND);
					setState(737);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(742);
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_glslExclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(744);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(746);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(747);
					match(CARET);
					setState(748);
					glslAndExpression(0);
					}
					} 
				}
				setState(753);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_glslInclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(755);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(757);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(758);
					match(VERTICAL_BAR);
					setState(759);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(764);
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_glslLogicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(766);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(768);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(769);
					match(AND_OP);
					setState(770);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(775);
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_glslLogicalXorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(777);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(779);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(780);
					match(XOR_OP);
					setState(781);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(786);
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
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_glslLogicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(788);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(790);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(791);
					match(OR_OP);
					setState(792);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(797);
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
		enterRule(_localctx, 136, RULE_glslConditionalExpression);
		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				glslLogicalOrExpression(0);
				setState(800);
				match(QUESTION);
				setState(801);
				glslExpression(0);
				setState(802);
				match(COLON);
				setState(803);
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
		enterRule(_localctx, 138, RULE_glslAssignmentExpression);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				glslUnaryExpression();
				setState(809);
				glslAssignmentOperator();
				setState(810);
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
		enterRule(_localctx, 140, RULE_glslAssignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(((((_la - 229)) & ~0x3f) == 0 && ((1L << (_la - 229)) & ((1L << (MUL_ASSIGN - 229)) | (1L << (DIV_ASSIGN - 229)) | (1L << (ADD_ASSIGN - 229)) | (1L << (MOD_ASSIGN - 229)) | (1L << (LEFT_ASSIGN - 229)) | (1L << (RIGHT_ASSIGN - 229)) | (1L << (AND_ASSIGN - 229)) | (1L << (XOR_ASSIGN - 229)) | (1L << (OR_ASSIGN - 229)) | (1L << (SUB_ASSIGN - 229)) | (1L << (EQUAL - 229)))) != 0)) ) {
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_glslExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(817);
			glslAssignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExpression);
					setState(819);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(820);
					match(COMMA);
					setState(821);
					glslAssignmentExpression();
					}
					} 
				}
				setState(826);
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
		enterRule(_localctx, 144, RULE_glslConstantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
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
		enterRule(_localctx, 146, RULE_glslFunctionNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			glslFunctionName();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(830);
				match(COMMA);
				setState(831);
				glslFunctionName();
				}
				}
				setState(836);
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
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
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
		enterRule(_localctx, 148, RULE_glslTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			glslTypeSpecifierNonarray();
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(838);
				glslArrayDimensionsList();
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

	public static class GlslArrayDimensionsListContext extends ParserRuleContext {
		public List<GlslArrayDimensionContext> glslArrayDimension() {
			return getRuleContexts(GlslArrayDimensionContext.class);
		}
		public GlslArrayDimensionContext glslArrayDimension(int i) {
			return getRuleContext(GlslArrayDimensionContext.class,i);
		}
		public GlslArrayDimensionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslArrayDimensionsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslArrayDimensionsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslArrayDimensionsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslArrayDimensionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslArrayDimensionsListContext glslArrayDimensionsList() throws RecognitionException {
		GlslArrayDimensionsListContext _localctx = new GlslArrayDimensionsListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_glslArrayDimensionsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(841);
					glslArrayDimension();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(844); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class GlslArrayDimensionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
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
		enterRule(_localctx, 152, RULE_glslArrayDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(LEFT_BRACKET);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ATOMIC_UINT - 12)) | (1L << (FLOAT - 12)) | (1L << (DOUBLE - 12)) | (1L << (INT - 12)) | (1L << (VOID - 12)) | (1L << (BOOL - 12)) | (1L << (MAT2 - 12)) | (1L << (MAT3 - 12)) | (1L << (MAT4 - 12)) | (1L << (DMAT2 - 12)) | (1L << (DMAT3 - 12)) | (1L << (DMAT4 - 12)) | (1L << (MAT2X2 - 12)) | (1L << (MAT2X3 - 12)) | (1L << (MAT2X4 - 12)) | (1L << (DMAT2X2 - 12)) | (1L << (DMAT2X3 - 12)) | (1L << (DMAT2X4 - 12)) | (1L << (MAT3X2 - 12)) | (1L << (MAT3X3 - 12)) | (1L << (MAT3X4 - 12)) | (1L << (DMAT3X2 - 12)) | (1L << (DMAT3X3 - 12)) | (1L << (DMAT3X4 - 12)) | (1L << (MAT4X2 - 12)) | (1L << (MAT4X3 - 12)) | (1L << (MAT4X4 - 12)) | (1L << (DMAT4X2 - 12)) | (1L << (DMAT4X3 - 12)) | (1L << (DMAT4X4 - 12)) | (1L << (VEC2 - 12)) | (1L << (VEC3 - 12)) | (1L << (VEC4 - 12)) | (1L << (IVEC2 - 12)) | (1L << (IVEC3 - 12)) | (1L << (IVEC4 - 12)) | (1L << (BVEC2 - 12)) | (1L << (BVEC3 - 12)) | (1L << (BVEC4 - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DVEC2 - 76)) | (1L << (DVEC3 - 76)) | (1L << (DVEC4 - 76)) | (1L << (UINT - 76)) | (1L << (UVEC2 - 76)) | (1L << (UVEC3 - 76)) | (1L << (UVEC4 - 76)) | (1L << (SAMPLER1D - 76)) | (1L << (SAMPLER2D - 76)) | (1L << (SAMPLER3D - 76)) | (1L << (SAMPLERCUBE - 76)) | (1L << (SAMPLER1DSHADOW - 76)) | (1L << (SAMPLER2DSHADOW - 76)) | (1L << (SAMPLERCUBESHADOW - 76)) | (1L << (SAMPLER1DARRAY - 76)) | (1L << (SAMPLER2DARRAY - 76)) | (1L << (SAMPLER1DARRAYSHADOW - 76)) | (1L << (SAMPLER2DARRAYSHADOW - 76)) | (1L << (ISAMPLER1D - 76)) | (1L << (ISAMPLER2D - 76)) | (1L << (ISAMPLER3D - 76)) | (1L << (ISAMPLERCUBE - 76)) | (1L << (ISAMPLER1DARRAY - 76)) | (1L << (ISAMPLER2DARRAY - 76)) | (1L << (USAMPLER1D - 76)) | (1L << (USAMPLER2D - 76)) | (1L << (USAMPLER3D - 76)) | (1L << (USAMPLERCUBE - 76)) | (1L << (USAMPLER1DARRAY - 76)) | (1L << (USAMPLER2DARRAY - 76)) | (1L << (SAMPLER2DRECT - 76)) | (1L << (SAMPLER2DRECTSHADOW - 76)) | (1L << (ISAMPLER2DRECT - 76)) | (1L << (USAMPLER2DRECT - 76)) | (1L << (SAMPLERBUFFER - 76)) | (1L << (ISAMPLERBUFFER - 76)) | (1L << (USAMPLERBUFFER - 76)) | (1L << (SAMPLER2DMS - 76)) | (1L << (ISAMPLER2DMS - 76)) | (1L << (USAMPLER2DMS - 76)) | (1L << (SAMPLER2DMSARRAY - 76)) | (1L << (ISAMPLER2DMSARRAY - 76)) | (1L << (USAMPLER2DMSARRAY - 76)) | (1L << (SAMPLERCUBEARRAY - 76)) | (1L << (SAMPLERCUBEARRAYSHADOW - 76)) | (1L << (ISAMPLERCUBEARRAY - 76)) | (1L << (USAMPLERCUBEARRAY - 76)) | (1L << (IMAGE1D - 76)) | (1L << (IIMAGE1D - 76)) | (1L << (UIMAGE1D - 76)) | (1L << (IMAGE2D - 76)) | (1L << (IIMAGE2D - 76)) | (1L << (UIMAGE2D - 76)) | (1L << (IMAGE3D - 76)) | (1L << (IIMAGE3D - 76)) | (1L << (UIMAGE3D - 76)) | (1L << (IMAGE2DRECT - 76)) | (1L << (IIMAGE2DRECT - 76)) | (1L << (UIMAGE2DRECT - 76)) | (1L << (IMAGECUBE - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (IIMAGECUBE - 140)) | (1L << (UIMAGECUBE - 140)) | (1L << (IMAGEBUFFER - 140)) | (1L << (IIMAGEBUFFER - 140)) | (1L << (UIMAGEBUFFER - 140)) | (1L << (IMAGE1DARRAY - 140)) | (1L << (IIMAGE1DARRAY - 140)) | (1L << (UIMAGE1DARRAY - 140)) | (1L << (IMAGE2DARRAY - 140)) | (1L << (IIMAGE2DARRAY - 140)) | (1L << (UIMAGE2DARRAY - 140)) | (1L << (IMAGECUBEARRAY - 140)) | (1L << (IIMAGECUBEARRAY - 140)) | (1L << (UIMAGECUBEARRAY - 140)) | (1L << (IMAGE2DMS - 140)) | (1L << (IIMAGE2DMS - 140)) | (1L << (UIMAGE2DMS - 140)) | (1L << (IMAGE2DMSARRAY - 140)) | (1L << (IIMAGE2DMSARRAY - 140)) | (1L << (UIMAGE2DMSARRAY - 140)) | (1L << (SAMPLEREXTERNALOES - 140)) | (1L << (STRUCT - 140)) | (1L << (PPOP_DEFINED - 140)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (BOOLCONSTANT - 208)) | (1L << (FLOATCONSTANT - 208)) | (1L << (DOUBLECONSTANT - 208)) | (1L << (INTCONSTANT - 208)) | (1L << (UINTCONSTANT - 208)) | (1L << (INC_OP - 208)) | (1L << (DEC_OP - 208)) | (1L << (LEFT_PAREN - 208)) | (1L << (BANG - 208)) | (1L << (DASH - 208)) | (1L << (TILDE - 208)) | (1L << (PLUS - 208)) | (1L << (TYPE_NAME - 208)) | (1L << (FUNCTION_NAME - 208)) | (1L << (IDENTIFIER - 208)))) != 0)) {
				{
				setState(847);
				glslConstantExpression();
				}
			}

			setState(850);
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
		enterRule(_localctx, 154, RULE_glslTypeSpecifierNonarray);
		try {
			setState(855);
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
				setState(852);
				glslBuiltinType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				glslStructSpecifier();
				}
				break;
			case TYPE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
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
		enterRule(_localctx, 156, RULE_glslBuiltinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public GlslStructMemberListContext glslStructMemberList() {
			return getRuleContext(GlslStructMemberListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode TYPE_NAME() { return getToken(GLSLParser.TYPE_NAME, 0); }
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
		enterRule(_localctx, 158, RULE_glslStructSpecifier);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				match(STRUCT);
				setState(860);
				match(LEFT_BRACE);
				setState(861);
				glslStructMemberList();
				setState(862);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				match(STRUCT);
				setState(865);
				match(IDENTIFIER);
				setState(866);
				match(LEFT_BRACE);
				setState(867);
				glslStructMemberList();
				setState(868);
				match(RIGHT_BRACE);
				validator.addDeclaredStruct(_localctx);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(871);
				match(STRUCT);
				setState(872);
				match(TYPE_NAME);
				setState(873);
				match(LEFT_BRACE);
				setState(874);
				glslStructMemberList();
				setState(875);
				match(RIGHT_BRACE);
				validator.addDeclaredStruct(_localctx);
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

	public static class GlslStructMemberListContext extends ParserRuleContext {
		public List<GlslStructMemberGroupContext> glslStructMemberGroup() {
			return getRuleContexts(GlslStructMemberGroupContext.class);
		}
		public GlslStructMemberGroupContext glslStructMemberGroup(int i) {
			return getRuleContext(GlslStructMemberGroupContext.class,i);
		}
		public GlslStructMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslStructMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslStructMemberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslStructMemberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberListContext glslStructMemberList() throws RecognitionException {
		GlslStructMemberListContext _localctx = new GlslStructMemberListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_glslStructMemberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(880);
				glslStructMemberGroup();
				}
				}
				setState(883); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3) | (1L << MAT3X4) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << MAT4X2) | (1L << MAT4X3) | (1L << MAT4X4))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (USAMPLER2DMSARRAY - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (USAMPLERCUBEARRAY - 64)) | (1L << (IMAGE1D - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==TYPE_NAME );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_glslStructMemberGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LOW_PRECISION - 83)) | (1L << (MEDIUM_PRECISION - 83)) | (1L << (HIGH_PRECISION - 83)))) != 0)) {
				{
				setState(885);
				glslTypeQualifier();
				}
			}

			setState(888);
			glslTypeSpecifier();
			setState(889);
			glslStructMemberDeclaratorList();
			setState(890);
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
		enterRule(_localctx, 164, RULE_glslStructMemberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			glslStructMemberDeclarator();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(893);
				match(COMMA);
				setState(894);
				glslStructMemberDeclarator();
				}
				}
				setState(899);
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
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
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
		enterRule(_localctx, 166, RULE_glslStructMemberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(IDENTIFIER);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(901);
				glslArrayDimensionsList();
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
		enterRule(_localctx, 168, RULE_glslTypeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(904);
				glslSingleTypeQualifier();
				}
				}
				setState(907); 
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
		enterRule(_localctx, 170, RULE_glslSingleTypeQualifier);
		try {
			setState(915);
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
				setState(909);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				glslLayoutQualifier();
				}
				break;
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(911);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(912);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(913);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(914);
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
		enterRule(_localctx, 172, RULE_glslInvariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
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
		enterRule(_localctx, 174, RULE_glslInterpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
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
		enterRule(_localctx, 176, RULE_glslLayoutQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(LAYOUT);
			setState(922);
			match(LEFT_PAREN);
			setState(923);
			glslLayoutQualifierIdList();
			setState(924);
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
		enterRule(_localctx, 178, RULE_glslLayoutQualifierIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			glslLayoutQualifierId();
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(927);
				match(COMMA);
				setState(928);
				glslLayoutQualifierId();
				}
				}
				setState(933);
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
		enterRule(_localctx, 180, RULE_glslLayoutQualifierId);
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(IDENTIFIER);
				setState(936);
				match(EQUAL);
				setState(937);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938);
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
		enterRule(_localctx, 182, RULE_glslPreciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
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
		enterRule(_localctx, 184, RULE_glslStorageQualifier);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(946);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(947);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(948);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(949);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(950);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(951);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(952);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(953);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(954);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(955);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(956);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(957);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(958);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(959);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(960);
				match(SUBROUTINE);
				setState(961);
				match(LEFT_PAREN);
				setState(962);
				glslFunctionNameList();
				setState(963);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(965);
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
		enterRule(_localctx, 186, RULE_glslPrecisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
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
		case 3:
			return glslIdentifierList_sempred((GlslIdentifierListContext)_localctx, predIndex);
		case 6:
			return glslFunctionHeaderWithParameters_sempred((GlslFunctionHeaderWithParametersContext)_localctx, predIndex);
		case 11:
			return glslInitDeclaratorList_sempred((GlslInitDeclaratorListContext)_localctx, predIndex);
		case 16:
			return glslInitializerList_sempred((GlslInitializerListContext)_localctx, predIndex);
		case 24:
			return glslStatementList_sempred((GlslStatementListContext)_localctx, predIndex);
		case 50:
			return glslPostfixExpression_sempred((GlslPostfixExpressionContext)_localctx, predIndex);
		case 57:
			return glslMultiplicativeExpression_sempred((GlslMultiplicativeExpressionContext)_localctx, predIndex);
		case 58:
			return glslAdditiveExpression_sempred((GlslAdditiveExpressionContext)_localctx, predIndex);
		case 59:
			return glslShiftExpression_sempred((GlslShiftExpressionContext)_localctx, predIndex);
		case 60:
			return glslRelationalExpression_sempred((GlslRelationalExpressionContext)_localctx, predIndex);
		case 61:
			return glslEqualityExpression_sempred((GlslEqualityExpressionContext)_localctx, predIndex);
		case 62:
			return glslAndExpression_sempred((GlslAndExpressionContext)_localctx, predIndex);
		case 63:
			return glslExclusiveOrExpression_sempred((GlslExclusiveOrExpressionContext)_localctx, predIndex);
		case 64:
			return glslInclusiveOrExpression_sempred((GlslInclusiveOrExpressionContext)_localctx, predIndex);
		case 65:
			return glslLogicalAndExpression_sempred((GlslLogicalAndExpressionContext)_localctx, predIndex);
		case 66:
			return glslLogicalXorExpression_sempred((GlslLogicalXorExpressionContext)_localctx, predIndex);
		case 67:
			return glslLogicalOrExpression_sempred((GlslLogicalOrExpressionContext)_localctx, predIndex);
		case 71:
			return glslExpression_sempred((GlslExpressionContext)_localctx, predIndex);
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
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0110\u03cd\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00e4\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u00f4\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00fd\n\5\f\5\16"+
		"\5\u0100\13\5\3\6\3\6\3\6\3\7\3\7\5\7\u0107\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u0110\n\b\f\b\16\b\u0113\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u011f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0128\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0132\n\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u014e\n\r\f\r\16\r\u0151\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0166\n\16\3\17\3\17\3\17\3\20\5\20\u016c\n\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u017a\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0182\n\22\f\22\16\22\u0185\13\22\3\23"+
		"\3\23\3\24\3\24\5\24\u018b\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0194\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u019c\n\26\3\27\3\27\5"+
		"\27\u01a0\n\27\3\30\3\30\5\30\u01a4\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01ac\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u01b3\n\32\f\32\16\32\u01b6"+
		"\13\32\3\33\3\33\3\33\3\33\5\33\u01bc\n\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\5\35\u01c9\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01d1\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \5"+
		" \u01dd\n \3!\3!\3!\3!\3!\3!\5!\u01e5\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01fc\n\"\3"+
		"#\3#\5#\u0200\n#\3$\3$\5$\u0204\n$\3%\3%\3%\3%\3%\3%\3%\5%\u020d\n%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u021b\n&\3\'\6\'\u021e\n\'\r\'\16"+
		"\'\u021f\3\'\5\'\u0223\n\'\3(\3(\5(\u0227\n(\3)\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0249\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0250\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u0260\n\64\f\64\16\64\u0263\13\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u026d\n\67\f\67\16\67\u0270\13\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0276\n\67\3\67\5\67\u0279\n\67\38\38\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\59\u028a\n9\59\u028c\n9\3:\3:\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u029c\n;\f;\16;\u029f\13;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\7<\u02aa\n<\f<\16<\u02ad\13<\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\7=\u02b8\n=\f=\16=\u02bb\13=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\7>\u02cc\n>\f>\16>\u02cf\13>\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u02da"+
		"\n?\f?\16?\u02dd\13?\3@\3@\3@\3@\3@\3@\7@\u02e5\n@\f@\16@\u02e8\13@\3"+
		"A\3A\3A\3A\3A\3A\7A\u02f0\nA\fA\16A\u02f3\13A\3B\3B\3B\3B\3B\3B\7B\u02fb"+
		"\nB\fB\16B\u02fe\13B\3C\3C\3C\3C\3C\3C\7C\u0306\nC\fC\16C\u0309\13C\3"+
		"D\3D\3D\3D\3D\3D\7D\u0311\nD\fD\16D\u0314\13D\3E\3E\3E\3E\3E\3E\7E\u031c"+
		"\nE\fE\16E\u031f\13E\3F\3F\3F\3F\3F\3F\3F\5F\u0328\nF\3G\3G\3G\3G\3G\5"+
		"G\u032f\nG\3H\3H\3I\3I\3I\3I\3I\3I\7I\u0339\nI\fI\16I\u033c\13I\3J\3J"+
		"\3K\3K\3K\7K\u0343\nK\fK\16K\u0346\13K\3L\3L\5L\u034a\nL\3M\6M\u034d\n"+
		"M\rM\16M\u034e\3N\3N\5N\u0353\nN\3N\3N\3O\3O\3O\5O\u035a\nO\3P\3P\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0371\nQ\3R\6"+
		"R\u0374\nR\rR\16R\u0375\3S\5S\u0379\nS\3S\3S\3S\3S\3T\3T\3T\7T\u0382\n"+
		"T\fT\16T\u0385\13T\3U\3U\5U\u0389\nU\3V\6V\u038c\nV\rV\16V\u038d\3W\3"+
		"W\3W\3W\3W\3W\5W\u0396\nW\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\7[\u03a4"+
		"\n[\f[\16[\u03a7\13[\3\\\3\\\3\\\3\\\3\\\5\\\u03ae\n\\\3]\3]\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u03c9"+
		"\n^\3_\3_\3_\2\24\b\16\30\"\62ftvxz|~\u0080\u0082\u0084\u0086\u0088\u0090"+
		"`\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\2\7\3\2\u00fc\u00ff\4\2\u00e7\u00f0\u00fa\u00fa\6\2\16\16$(-TY\u00a2"+
		"\3\2\21\23\3\2UW\2\u03fa\2\u00be\3\2\2\2\4\u00e3\3\2\2\2\6\u00f3\3\2\2"+
		"\2\b\u00f5\3\2\2\2\n\u0101\3\2\2\2\f\u0106\3\2\2\2\16\u0108\3\2\2\2\20"+
		"\u011e\3\2\2\2\22\u0127\3\2\2\2\24\u0131\3\2\2\2\26\u0133\3\2\2\2\30\u0135"+
		"\3\2\2\2\32\u0165\3\2\2\2\34\u0167\3\2\2\2\36\u016b\3\2\2\2 \u0179\3\2"+
		"\2\2\"\u017b\3\2\2\2$\u0186\3\2\2\2&\u018a\3\2\2\2(\u0193\3\2\2\2*\u019b"+
		"\3\2\2\2,\u019f\3\2\2\2.\u01a3\3\2\2\2\60\u01ab\3\2\2\2\62\u01ad\3\2\2"+
		"\2\64\u01bb\3\2\2\2\66\u01bd\3\2\2\28\u01c8\3\2\2\2:\u01d0\3\2\2\2<\u01d2"+
		"\3\2\2\2>\u01dc\3\2\2\2@\u01e4\3\2\2\2B\u01fb\3\2\2\2D\u01ff\3\2\2\2F"+
		"\u0203\3\2\2\2H\u020c\3\2\2\2J\u021a\3\2\2\2L\u0222\3\2\2\2N\u0226\3\2"+
		"\2\2P\u0228\3\2\2\2R\u022b\3\2\2\2T\u022d\3\2\2\2V\u022f\3\2\2\2X\u0231"+
		"\3\2\2\2Z\u0233\3\2\2\2\\\u0235\3\2\2\2^\u0237\3\2\2\2`\u0239\3\2\2\2"+
		"b\u023b\3\2\2\2d\u0248\3\2\2\2f\u024f\3\2\2\2h\u0264\3\2\2\2j\u0266\3"+
		"\2\2\2l\u0278\3\2\2\2n\u027a\3\2\2\2p\u028b\3\2\2\2r\u028d\3\2\2\2t\u028f"+
		"\3\2\2\2v\u02a0\3\2\2\2x\u02ae\3\2\2\2z\u02bc\3\2\2\2|\u02d0\3\2\2\2~"+
		"\u02de\3\2\2\2\u0080\u02e9\3\2\2\2\u0082\u02f4\3\2\2\2\u0084\u02ff\3\2"+
		"\2\2\u0086\u030a\3\2\2\2\u0088\u0315\3\2\2\2\u008a\u0327\3\2\2\2\u008c"+
		"\u032e\3\2\2\2\u008e\u0330\3\2\2\2\u0090\u0332\3\2\2\2\u0092\u033d\3\2"+
		"\2\2\u0094\u033f\3\2\2\2\u0096\u0347\3\2\2\2\u0098\u034c\3\2\2\2\u009a"+
		"\u0350\3\2\2\2\u009c\u0359\3\2\2\2\u009e\u035b\3\2\2\2\u00a0\u0370\3\2"+
		"\2\2\u00a2\u0373\3\2\2\2\u00a4\u0378\3\2\2\2\u00a6\u037e\3\2\2\2\u00a8"+
		"\u0386\3\2\2\2\u00aa\u038b\3\2\2\2\u00ac\u0395\3\2\2\2\u00ae\u0397\3\2"+
		"\2\2\u00b0\u0399\3\2\2\2\u00b2\u039b\3\2\2\2\u00b4\u03a0\3\2\2\2\u00b6"+
		"\u03ad\3\2\2\2\u00b8\u03af\3\2\2\2\u00ba\u03c8\3\2\2\2\u00bc\u03ca\3\2"+
		"\2\2\u00be\u00bf\5L\'\2\u00bf\3\3\2\2\2\u00c0\u00c1\5\n\6\2\u00c1\u00c2"+
		"\7\u00fb\2\2\u00c2\u00e4\3\2\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5\7\u00fb"+
		"\2\2\u00c5\u00e4\3\2\2\2\u00c6\u00c7\7X\2\2\u00c7\u00c8\5\u00bc_\2\u00c8"+
		"\u00c9\5\u0096L\2\u00c9\u00ca\7\u00fb\2\2\u00ca\u00e4\3\2\2\2\u00cb\u00cc"+
		"\5\6\4\2\u00cc\u00cd\7\u00fb\2\2\u00cd\u00e4\3\2\2\2\u00ce\u00cf\5\6\4"+
		"\2\u00cf\u00d0\7\u0110\2\2\u00d0\u00d1\7\u00fb\2\2\u00d1\u00e4\3\2\2\2"+
		"\u00d2\u00d3\5\6\4\2\u00d3\u00d4\7\u0110\2\2\u00d4\u00d5\5\u0098M\2\u00d5"+
		"\u00d6\7\u00fb\2\2\u00d6\u00e4\3\2\2\2\u00d7\u00d8\5\u00aaV\2\u00d8\u00d9"+
		"\7\u00fb\2\2\u00d9\u00e4\3\2\2\2\u00da\u00db\5\u00aaV\2\u00db\u00dc\7"+
		"\u0110\2\2\u00dc\u00dd\7\u00fb\2\2\u00dd\u00e4\3\2\2\2\u00de\u00df\5\u00aa"+
		"V\2\u00df\u00e0\7\u0110\2\2\u00e0\u00e1\5\b\5\2\u00e1\u00e2\7\u00fb\2"+
		"\2\u00e2\u00e4\3\2\2\2\u00e3\u00c0\3\2\2\2\u00e3\u00c3\3\2\2\2\u00e3\u00c6"+
		"\3\2\2\2\u00e3\u00cb\3\2\2\2\u00e3\u00ce\3\2\2\2\u00e3\u00d2\3\2\2\2\u00e3"+
		"\u00d7\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4\5\3\2\2\2"+
		"\u00e5\u00e6\5\u00aaV\2\u00e6\u00e7\7\u0110\2\2\u00e7\u00e8\7\u00f5\2"+
		"\2\u00e8\u00e9\5\u00a2R\2\u00e9\u00ea\7\u00f6\2\2\u00ea\u00eb\b\4\1\2"+
		"\u00eb\u00f4\3\2\2\2\u00ec\u00ed\5\u00aaV\2\u00ed\u00ee\7\u010e\2\2\u00ee"+
		"\u00ef\7\u00f5\2\2\u00ef\u00f0\5\u00a2R\2\u00f0\u00f1\7\u00f6\2\2\u00f1"+
		"\u00f2\b\4\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00e5\3\2\2\2\u00f3\u00ec\3\2"+
		"\2\2\u00f4\7\3\2\2\2\u00f5\u00f6\b\5\1\2\u00f6\u00f7\7\u00f8\2\2\u00f7"+
		"\u00f8\7\u0110\2\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\f\3\2\2\u00fa\u00fb"+
		"\7\u00f8\2\2\u00fb\u00fd\7\u0110\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\t\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0102\5\f\7\2\u0102\u0103\7\u00f2\2\2\u0103\13\3\2\2\2"+
		"\u0104\u0107\5\20\t\2\u0105\u0107\5\16\b\2\u0106\u0104\3\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\r\3\2\2\2\u0108\u0109\b\b\1\2\u0109\u010a\5\20\t\2\u010a"+
		"\u010b\5\24\13\2\u010b\u0111\3\2\2\2\u010c\u010d\f\3\2\2\u010d\u010e\7"+
		"\u00f8\2\2\u010e\u0110\5\24\13\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2"+
		"\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\17\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7\u0110\2\2\u0116\u0117\7\u00f1"+
		"\2\2\u0117\u0118\b\t\1\2\u0118\u011f\3\2\2\2\u0119\u011a\5\36\20\2\u011a"+
		"\u011b\7\u010f\2\2\u011b\u011c\7\u00f1\2\2\u011c\u011d\b\t\1\2\u011d\u011f"+
		"\3\2\2\2\u011e\u0114\3\2\2\2\u011e\u0119\3\2\2\2\u011f\21\3\2\2\2\u0120"+
		"\u0121\5\u0096L\2\u0121\u0122\7\u0110\2\2\u0122\u0128\3\2\2\2\u0123\u0124"+
		"\5\u0096L\2\u0124\u0125\7\u0110\2\2\u0125\u0126\5\u0098M\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0120\3\2\2\2\u0127\u0123\3\2\2\2\u0128\23\3\2\2\2\u0129"+
		"\u012a\5\u00aaV\2\u012a\u012b\5\22\n\2\u012b\u0132\3\2\2\2\u012c\u0132"+
		"\5\22\n\2\u012d\u012e\5\u00aaV\2\u012e\u012f\5\26\f\2\u012f\u0132\3\2"+
		"\2\2\u0130\u0132\5\26\f\2\u0131\u0129\3\2\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u012d\3\2\2\2\u0131\u0130\3\2\2\2\u0132\25\3\2\2\2\u0133\u0134\5\u0096"+
		"L\2\u0134\27\3\2\2\2\u0135\u0136\b\r\1\2\u0136\u0137\5\32\16\2\u0137\u014f"+
		"\3\2\2\2\u0138\u0139\f\6\2\2\u0139\u013a\7\u00f8\2\2\u013a\u014e\5\34"+
		"\17\2\u013b\u013c\f\5\2\2\u013c\u013d\7\u00f8\2\2\u013d\u013e\5\34\17"+
		"\2\u013e\u013f\7\u00fa\2\2\u013f\u0140\5 \21\2\u0140\u014e\3\2\2\2\u0141"+
		"\u0142\f\4\2\2\u0142\u0143\7\u00f8\2\2\u0143\u0144\5\34\17\2\u0144\u0145"+
		"\5\u0098M\2\u0145\u014e\3\2\2\2\u0146\u0147\f\3\2\2\u0147\u0148\7\u00f8"+
		"\2\2\u0148\u0149\5\34\17\2\u0149\u014a\5\u0098M\2\u014a\u014b\7\u00fa"+
		"\2\2\u014b\u014c\5 \21\2\u014c\u014e\3\2\2\2\u014d\u0138\3\2\2\2\u014d"+
		"\u013b\3\2\2\2\u014d\u0141\3\2\2\2\u014d\u0146\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\31\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0166\5\36\20\2\u0153\u0154\5\36\20\2\u0154\u0155\5\34"+
		"\17\2\u0155\u0166\3\2\2\2\u0156\u0157\5\36\20\2\u0157\u0158\5\34\17\2"+
		"\u0158\u0159\7\u00fa\2\2\u0159\u015a\5 \21\2\u015a\u0166\3\2\2\2\u015b"+
		"\u015c\5\36\20\2\u015c\u015d\5\34\17\2\u015d\u015e\5\u0098M\2\u015e\u0166"+
		"\3\2\2\2\u015f\u0160\5\36\20\2\u0160\u0161\5\34\17\2\u0161\u0162\5\u0098"+
		"M\2\u0162\u0163\7\u00fa\2\2\u0163\u0164\5 \21\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0152\3\2\2\2\u0165\u0153\3\2\2\2\u0165\u0156\3\2\2\2\u0165\u015b\3\2"+
		"\2\2\u0165\u015f\3\2\2\2\u0166\33\3\2\2\2\u0167\u0168\7\u0110\2\2\u0168"+
		"\u0169\b\17\1\2\u0169\35\3\2\2\2\u016a\u016c\5\u00aaV\2\u016b\u016a\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\5\u0096L\2"+
		"\u016e\37\3\2\2\2\u016f\u017a\5\u008cG\2\u0170\u0171\7\u00f5\2\2\u0171"+
		"\u0172\5\"\22\2\u0172\u0173\7\u00f6\2\2\u0173\u017a\3\2\2\2\u0174\u0175"+
		"\7\u00f5\2\2\u0175\u0176\5\"\22\2\u0176\u0177\7\u00f8\2\2\u0177\u0178"+
		"\7\u00f6\2\2\u0178\u017a\3\2\2\2\u0179\u016f\3\2\2\2\u0179\u0170\3\2\2"+
		"\2\u0179\u0174\3\2\2\2\u017a!\3\2\2\2\u017b\u017c\b\22\1\2\u017c\u017d"+
		"\5 \21\2\u017d\u0183\3\2\2\2\u017e\u017f\f\3\2\2\u017f\u0180\7\u00f8\2"+
		"\2\u0180\u0182\5 \21\2\u0181\u017e\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184#\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0187\5\4\3\2\u0187%\3\2\2\2\u0188\u018b\5*\26\2\u0189\u018b\5(\25\2"+
		"\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\'\3\2\2\2\u018c\u0194\5"+
		"$\23\2\u018d\u0194\5\64\33\2\u018e\u0194\5\66\34\2\u018f\u0194\5<\37\2"+
		"\u0190\u0194\5@!\2\u0191\u0194\5B\"\2\u0192\u0194\5J&\2\u0193\u018c\3"+
		"\2\2\2\u0193\u018d\3\2\2\2\u0193\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0193"+
		"\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194)\3\2\2\2"+
		"\u0195\u0196\7\u00f5\2\2\u0196\u019c\7\u00f6\2\2\u0197\u0198\7\u00f5\2"+
		"\2\u0198\u0199\5\62\32\2\u0199\u019a\7\u00f6\2\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0195\3\2\2\2\u019b\u0197\3\2\2\2\u019c+\3\2\2\2\u019d\u01a0\5\60\31"+
		"\2\u019e\u01a0\5(\25\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0-"+
		"\3\2\2\2\u01a1\u01a4\5*\26\2\u01a2\u01a4\5(\25\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4/\3\2\2\2\u01a5\u01a6\7\u00f5\2\2\u01a6\u01ac\7\u00f6"+
		"\2\2\u01a7\u01a8\7\u00f5\2\2\u01a8\u01a9\5\62\32\2\u01a9\u01aa\7\u00f6"+
		"\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ac"+
		"\61\3\2\2\2\u01ad\u01ae\b\32\1\2\u01ae\u01af\5&\24\2\u01af\u01b4\3\2\2"+
		"\2\u01b0\u01b1\f\3\2\2\u01b1\u01b3\5&\24\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\63\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b7\u01bc\7\u00fb\2\2\u01b8\u01b9\5\u0090I\2\u01b9\u01ba"+
		"\7\u00fb\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2"+
		"\2\u01bc\65\3\2\2\2\u01bd\u01be\7\36\2\2\u01be\u01bf\7\u00f1\2\2\u01bf"+
		"\u01c0\5\u0090I\2\u01c0\u01c1\7\u00f2\2\2\u01c1\u01c2\58\35\2\u01c2\67"+
		"\3\2\2\2\u01c3\u01c4\5.\30\2\u01c4\u01c5\7\37\2\2\u01c5\u01c6\5.\30\2"+
		"\u01c6\u01c9\3\2\2\2\u01c7\u01c9\5.\30\2\u01c8\u01c3\3\2\2\2\u01c8\u01c7"+
		"\3\2\2\2\u01c99\3\2\2\2\u01ca\u01d1\5\u0090I\2\u01cb\u01cc\5\36\20\2\u01cc"+
		"\u01cd\7\u0110\2\2\u01cd\u01ce\7\u00fa\2\2\u01ce\u01cf\5 \21\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d1;\3\2\2\2\u01d2"+
		"\u01d3\7\33\2\2\u01d3\u01d4\7\u00f1\2\2\u01d4\u01d5\5\u0090I\2\u01d5\u01d6"+
		"\7\u00f2\2\2\u01d6\u01d7\7\u00f5\2\2\u01d7\u01d8\5> \2\u01d8\u01d9\7\u00f6"+
		"\2\2\u01d9=\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01dd\5\62\32\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd?\3\2\2\2\u01de\u01df\7\34\2\2\u01df"+
		"\u01e0\5\u0090I\2\u01e0\u01e1\7\u00f9\2\2\u01e1\u01e5\3\2\2\2\u01e2\u01e3"+
		"\7\35\2\2\u01e3\u01e5\7\u00f9\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5A\3\2\2\2\u01e6\u01e7\7\32\2\2\u01e7\u01e8\7\u00f1\2\2\u01e8"+
		"\u01e9\5:\36\2\u01e9\u01ea\7\u00f2\2\2\u01ea\u01eb\5,\27\2\u01eb\u01fc"+
		"\3\2\2\2\u01ec\u01ed\7\30\2\2\u01ed\u01ee\5&\24\2\u01ee\u01ef\7\32\2\2"+
		"\u01ef\u01f0\7\u00f1\2\2\u01f0\u01f1\5\u0090I\2\u01f1\u01f2\7\u00f2\2"+
		"\2\u01f2\u01f3\7\u00fb\2\2\u01f3\u01fc\3\2\2\2\u01f4\u01f5\7\31\2\2\u01f5"+
		"\u01f6\7\u00f1\2\2\u01f6\u01f7\5D#\2\u01f7\u01f8\5H%\2\u01f8\u01f9\7\u00f2"+
		"\2\2\u01f9\u01fa\5,\27\2\u01fa\u01fc\3\2\2\2\u01fb\u01e6\3\2\2\2\u01fb"+
		"\u01ec\3\2\2\2\u01fb\u01f4\3\2\2\2\u01fcC\3\2\2\2\u01fd\u0200\5\64\33"+
		"\2\u01fe\u0200\5$\23\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200E"+
		"\3\2\2\2\u0201\u0204\5:\36\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0202\3\2\2\2\u0204G\3\2\2\2\u0205\u0206\5F$\2\u0206\u0207\7\u00fb\2"+
		"\2\u0207\u020d\3\2\2\2\u0208\u0209\5F$\2\u0209\u020a\7\u00fb\2\2\u020a"+
		"\u020b\5\u0090I\2\u020b\u020d\3\2\2\2\u020c\u0205\3\2\2\2\u020c\u0208"+
		"\3\2\2\2\u020dI\3\2\2\2\u020e\u020f\7\27\2\2\u020f\u021b\7\u00fb\2\2\u0210"+
		"\u0211\7\26\2\2\u0211\u021b\7\u00fb\2\2\u0212\u0213\7,\2\2\u0213\u021b"+
		"\7\u00fb\2\2\u0214\u0215\7,\2\2\u0215\u0216\5\u0090I\2\u0216\u0217\7\u00fb"+
		"\2\2\u0217\u021b\3\2\2\2\u0218\u0219\7+\2\2\u0219\u021b\7\u00fb\2\2\u021a"+
		"\u020e\3\2\2\2\u021a\u0210\3\2\2\2\u021a\u0212\3\2\2\2\u021a\u0214\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021bK\3\2\2\2\u021c\u021e\5N(\2\u021d\u021c"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0223\3\2\2\2\u0221\u0223\7\2\2\3\u0222\u021d\3\2\2\2\u0222\u0221\3\2"+
		"\2\2\u0223M\3\2\2\2\u0224\u0227\5P)\2\u0225\u0227\5\4\3\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0225\3\2\2\2\u0227O\3\2\2\2\u0228\u0229\5\n\6\2\u0229"+
		"\u022a\5\60\31\2\u022aQ\3\2\2\2\u022b\u022c\7\u0110\2\2\u022cS\3\2\2\2"+
		"\u022d\u022e\7\u0110\2\2\u022eU\3\2\2\2\u022f\u0230\7\u010e\2\2\u0230"+
		"W\3\2\2\2\u0231\u0232\7\u010f\2\2\u0232Y\3\2\2\2\u0233\u0234\7\u00d2\2"+
		"\2\u0234[\3\2\2\2\u0235\u0236\7\u00d5\2\2\u0236]\3\2\2\2\u0237\u0238\7"+
		"\u00d6\2\2\u0238_\3\2\2\2\u0239\u023a\7\u00d3\2\2\u023aa\3\2\2\2\u023b"+
		"\u023c\7\u00d4\2\2\u023cc\3\2\2\2\u023d\u0249\5T+\2\u023e\u0249\5X-\2"+
		"\u023f\u0249\5`\61\2\u0240\u0249\5b\62\2\u0241\u0249\5\\/\2\u0242\u0249"+
		"\5^\60\2\u0243\u0249\5Z.\2\u0244\u0245\7\u00f1\2\2\u0245\u0246\5\u0090"+
		"I\2\u0246\u0247\7\u00f2\2\2\u0247\u0249\3\2\2\2\u0248\u023d\3\2\2\2\u0248"+
		"\u023e\3\2\2\2\u0248\u023f\3\2\2\2\u0248\u0240\3\2\2\2\u0248\u0241\3\2"+
		"\2\2\u0248\u0242\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244\3\2\2\2\u0249"+
		"e\3\2\2\2\u024a\u024b\b\64\1\2\u024b\u0250\5d\63\2\u024c\u024d\5\u0096"+
		"L\2\u024d\u024e\5h\65\2\u024e\u0250\3\2\2\2\u024f\u024a\3\2\2\2\u024f"+
		"\u024c\3\2\2\2\u0250\u0261\3\2\2\2\u0251\u0252\f\7\2\2\u0252\u0260\5j"+
		"\66\2\u0253\u0254\f\6\2\2\u0254\u0255\7\u00f3\2\2\u0255\u0256\5n8\2\u0256"+
		"\u0257\7\u00f4\2\2\u0257\u0260\3\2\2\2\u0258\u0259\f\5\2\2\u0259\u025a"+
		"\7\u00f7\2\2\u025a\u0260\5R*\2\u025b\u025c\f\4\2\2\u025c\u0260\7\u00de"+
		"\2\2\u025d\u025e\f\3\2\2\u025e\u0260\7\u00df\2\2\u025f\u0251\3\2\2\2\u025f"+
		"\u0253\3\2\2\2\u025f\u0258\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u025d\3\2"+
		"\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"g\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\5l\67\2\u0265i\3\2\2\2\u0266"+
		"\u0267\5l\67\2\u0267k\3\2\2\2\u0268\u0269\7\u00f1\2\2\u0269\u026e\5\u008c"+
		"G\2\u026a\u026b\7\u00f8\2\2\u026b\u026d\5\u008cG\2\u026c\u026a\3\2\2\2"+
		"\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\7\u00f2\2\2\u0272\u0279\3\2\2"+
		"\2\u0273\u0275\7\u00f1\2\2\u0274\u0276\7\'\2\2\u0275\u0274\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\7\u00f2\2\2\u0278\u0268"+
		"\3\2\2\2\u0278\u0273\3\2\2\2\u0279m\3\2\2\2\u027a\u027b\5\u0090I\2\u027b"+
		"o\3\2\2\2\u027c\u028c\5f\64\2\u027d\u027e\7\u00de\2\2\u027e\u028c\5p9"+
		"\2\u027f\u0280\7\u00df\2\2\u0280\u028c\5p9\2\u0281\u0282\5r:\2\u0282\u0283"+
		"\5p9\2\u0283\u028c\3\2\2\2\u0284\u0289\7\u00cb\2\2\u0285\u0286\7\u00f1"+
		"\2\2\u0286\u0287\7\u0110\2\2\u0287\u028a\7\u00f2\2\2\u0288\u028a\7\u0110"+
		"\2\2\u0289\u0285\3\2\2\2\u0289\u0288\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u027c\3\2\2\2\u028b\u027d\3\2\2\2\u028b\u027f\3\2\2\2\u028b\u0281\3\2"+
		"\2\2\u028b\u0284\3\2\2\2\u028cq\3\2\2\2\u028d\u028e\t\2\2\2\u028es\3\2"+
		"\2\2\u028f\u0290\b;\1\2\u0290\u0291\5p9\2\u0291\u029d\3\2\2\2\u0292\u0293"+
		"\f\5\2\2\u0293\u0294\7\u0100\2\2\u0294\u029c\5p9\2\u0295\u0296\f\4\2\2"+
		"\u0296\u0297\7\u0101\2\2\u0297\u029c\5p9\2\u0298\u0299\f\3\2\2\u0299\u029a"+
		"\7\u0102\2\2\u029a\u029c\5p9\2\u029b\u0292\3\2\2\2\u029b\u0295\3\2\2\2"+
		"\u029b\u0298\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029eu\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a1\b<\1\2\u02a1\u02a2"+
		"\5t;\2\u02a2\u02ab\3\2\2\2\u02a3\u02a4\f\4\2\2\u02a4\u02a5\7\u00ff\2\2"+
		"\u02a5\u02aa\5t;\2\u02a6\u02a7\f\3\2\2\u02a7\u02a8\7\u00fd\2\2\u02a8\u02aa"+
		"\5t;\2\u02a9\u02a3\3\2\2\2\u02a9\u02a6\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02acw\3\2\2\2\u02ad\u02ab\3\2\2\2"+
		"\u02ae\u02af\b=\1\2\u02af\u02b0\5v<\2\u02b0\u02b9\3\2\2\2\u02b1\u02b2"+
		"\f\4\2\2\u02b2\u02b3\7\u00dc\2\2\u02b3\u02b8\5v<\2\u02b4\u02b5\f\3\2\2"+
		"\u02b5\u02b6\7\u00dd\2\2\u02b6\u02b8\5v<\2\u02b7\u02b1\3\2\2\2\u02b7\u02b4"+
		"\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"y\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\b>\1\2\u02bd\u02be\5x=\2\u02be"+
		"\u02cd\3\2\2\2\u02bf\u02c0\f\6\2\2\u02c0\u02c1\7\u0103\2\2\u02c1\u02cc"+
		"\5x=\2\u02c2\u02c3\f\5\2\2\u02c3\u02c4\7\u0104\2\2\u02c4\u02cc\5x=\2\u02c5"+
		"\u02c6\f\4\2\2\u02c6\u02c7\7\u00e0\2\2\u02c7\u02cc\5x=\2\u02c8\u02c9\f"+
		"\3\2\2\u02c9\u02ca\7\u00e1\2\2\u02ca\u02cc\5x=\2\u02cb\u02bf\3\2\2\2\u02cb"+
		"\u02c2\3\2\2\2\u02cb\u02c5\3\2\2\2\u02cb\u02c8\3\2\2\2\u02cc\u02cf\3\2"+
		"\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce{\3\2\2\2\u02cf\u02cd"+
		"\3\2\2\2\u02d0\u02d1\b?\1\2\u02d1\u02d2\5z>\2\u02d2\u02db\3\2\2\2\u02d3"+
		"\u02d4\f\4\2\2\u02d4\u02d5\7\u00e2\2\2\u02d5\u02da\5z>\2\u02d6\u02d7\f"+
		"\3\2\2\u02d7\u02d8\7\u00e3\2\2\u02d8\u02da\5z>\2\u02d9\u02d3\3\2\2\2\u02d9"+
		"\u02d6\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc}\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\b@\1\2\u02df\u02e0"+
		"\5|?\2\u02e0\u02e6\3\2\2\2\u02e1\u02e2\f\3\2\2\u02e2\u02e3\7\u0107\2\2"+
		"\u02e3\u02e5\5|?\2\u02e4\u02e1\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\177\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9"+
		"\u02ea\bA\1\2\u02ea\u02eb\5~@\2\u02eb\u02f1\3\2\2\2\u02ec\u02ed\f\3\2"+
		"\2\u02ed\u02ee\7\u0106\2\2\u02ee\u02f0\5~@\2\u02ef\u02ec\3\2\2\2\u02f0"+
		"\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u0081\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\bB\1\2\u02f5\u02f6\5\u0080A\2\u02f6"+
		"\u02fc\3\2\2\2\u02f7\u02f8\f\3\2\2\u02f8\u02f9\7\u0105\2\2\u02f9\u02fb"+
		"\5\u0080A\2\u02fa\u02f7\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u0083\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0300"+
		"\bC\1\2\u0300\u0301\5\u0082B\2\u0301\u0307\3\2\2\2\u0302\u0303\f\3\2\2"+
		"\u0303\u0304\7\u00e4\2\2\u0304\u0306\5\u0082B\2\u0305\u0302\3\2\2\2\u0306"+
		"\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0085\3\2"+
		"\2\2\u0309\u0307\3\2\2\2\u030a\u030b\bD\1\2\u030b\u030c\5\u0084C\2\u030c"+
		"\u0312\3\2\2\2\u030d\u030e\f\3\2\2\u030e\u030f\7\u00e6\2\2\u030f\u0311"+
		"\5\u0084C\2\u0310\u030d\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2"+
		"\2\u0312\u0313\3\2\2\2\u0313\u0087\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0316"+
		"\bE\1\2\u0316\u0317\5\u0086D\2\u0317\u031d\3\2\2\2\u0318\u0319\f\3\2\2"+
		"\u0319\u031a\7\u00e5\2\2\u031a\u031c\5\u0086D\2\u031b\u0318\3\2\2\2\u031c"+
		"\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0089\3\2"+
		"\2\2\u031f\u031d\3\2\2\2\u0320\u0328\5\u0088E\2\u0321\u0322\5\u0088E\2"+
		"\u0322\u0323\7\u0108\2\2\u0323\u0324\5\u0090I\2\u0324\u0325\7\u00f9\2"+
		"\2\u0325\u0326\5\u008cG\2\u0326\u0328\3\2\2\2\u0327\u0320\3\2\2\2\u0327"+
		"\u0321\3\2\2\2\u0328\u008b\3\2\2\2\u0329\u032f\5\u008aF\2\u032a\u032b"+
		"\5p9\2\u032b\u032c\5\u008eH\2\u032c\u032d\5\u008cG\2\u032d\u032f\3\2\2"+
		"\2\u032e\u0329\3\2\2\2\u032e\u032a\3\2\2\2\u032f\u008d\3\2\2\2\u0330\u0331"+
		"\t\3\2\2\u0331\u008f\3\2\2\2\u0332\u0333\bI\1\2\u0333\u0334\5\u008cG\2"+
		"\u0334\u033a\3\2\2\2\u0335\u0336\f\3\2\2\u0336\u0337\7\u00f8\2\2\u0337"+
		"\u0339\5\u008cG\2\u0338\u0335\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0091\3\2\2\2\u033c\u033a\3\2\2\2\u033d"+
		"\u033e\5\u008aF\2\u033e\u0093\3\2\2\2\u033f\u0344\5X-\2\u0340\u0341\7"+
		"\u00f8\2\2\u0341\u0343\5X-\2\u0342\u0340\3\2\2\2\u0343\u0346\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0095\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0347\u0349\5\u009cO\2\u0348\u034a\5\u0098M\2\u0349\u0348\3\2\2\2"+
		"\u0349\u034a\3\2\2\2\u034a\u0097\3\2\2\2\u034b\u034d\5\u009aN\2\u034c"+
		"\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034f\u0099\3\2\2\2\u0350\u0352\7\u00f3\2\2\u0351\u0353\5\u0092J"+
		"\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355"+
		"\7\u00f4\2\2\u0355\u009b\3\2\2\2\u0356\u035a\5\u009eP\2\u0357\u035a\5"+
		"\u00a0Q\2\u0358\u035a\5V,\2\u0359\u0356\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u0358\3\2\2\2\u035a\u009d\3\2\2\2\u035b\u035c\t\4\2\2\u035c\u009f\3\2"+
		"\2\2\u035d\u035e\7\u00a3\2\2\u035e\u035f\7\u00f5\2\2\u035f\u0360\5\u00a2"+
		"R\2\u0360\u0361\7\u00f6\2\2\u0361\u0371\3\2\2\2\u0362\u0363\7\u00a3\2"+
		"\2\u0363\u0364\7\u0110\2\2\u0364\u0365\7\u00f5\2\2\u0365\u0366\5\u00a2"+
		"R\2\u0366\u0367\7\u00f6\2\2\u0367\u0368\bQ\1\2\u0368\u0371\3\2\2\2\u0369"+
		"\u036a\7\u00a3\2\2\u036a\u036b\7\u010e\2\2\u036b\u036c\7\u00f5\2\2\u036c"+
		"\u036d\5\u00a2R\2\u036d\u036e\7\u00f6\2\2\u036e\u036f\bQ\1\2\u036f\u0371"+
		"\3\2\2\2\u0370\u035d\3\2\2\2\u0370\u0362\3\2\2\2\u0370\u0369\3\2\2\2\u0371"+
		"\u00a1\3\2\2\2\u0372\u0374\5\u00a4S\2\u0373\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u00a3\3\2\2\2\u0377"+
		"\u0379\5\u00aaV\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a"+
		"\3\2\2\2\u037a\u037b\5\u0096L\2\u037b\u037c\5\u00a6T\2\u037c\u037d\7\u00fb"+
		"\2\2\u037d\u00a5\3\2\2\2\u037e\u0383\5\u00a8U\2\u037f\u0380\7\u00f8\2"+
		"\2\u0380\u0382\5\u00a8U\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u00a7\3\2\2\2\u0385\u0383\3\2"+
		"\2\2\u0386\u0388\7\u0110\2\2\u0387\u0389\5\u0098M\2\u0388\u0387\3\2\2"+
		"\2\u0388\u0389\3\2\2\2\u0389\u00a9\3\2\2\2\u038a\u038c\5\u00acW\2\u038b"+
		"\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038e\u00ab\3\2\2\2\u038f\u0396\5\u00ba^\2\u0390\u0396\5\u00b2Z\2"+
		"\u0391\u0396\5\u00bc_\2\u0392\u0396\5\u00b0Y\2\u0393\u0396\5\u00aeX\2"+
		"\u0394\u0396\5\u00b8]\2\u0395\u038f\3\2\2\2\u0395\u0390\3\2\2\2\u0395"+
		"\u0391\3\2\2\2\u0395\u0392\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0394\3\2"+
		"\2\2\u0396\u00ad\3\2\2\2\u0397\u0398\7)\2\2\u0398\u00af\3\2\2\2\u0399"+
		"\u039a\t\5\2\2\u039a\u00b1\3\2\2\2\u039b\u039c\7\17\2\2\u039c\u039d\7"+
		"\u00f1\2\2\u039d\u039e\5\u00b4[\2\u039e\u039f\7\u00f2\2\2\u039f\u00b3"+
		"\3\2\2\2\u03a0\u03a5\5\u00b6\\\2\u03a1\u03a2\7\u00f8\2\2\u03a2\u03a4\5"+
		"\u00b6\\\2\u03a3\u03a1\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2"+
		"\u03a5\u03a6\3\2\2\2\u03a6\u00b5\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03ae"+
		"\7\u0110\2\2\u03a9\u03aa\7\u0110\2\2\u03aa\u03ab\7\u00fa\2\2\u03ab\u03ae"+
		"\5\u0092J\2\u03ac\u03ae\7\b\2\2\u03ad\u03a8\3\2\2\2\u03ad\u03a9\3\2\2"+
		"\2\u03ad\u03ac\3\2\2\2\u03ae\u00b7\3\2\2\2\u03af\u03b0\7*\2\2\u03b0\u00b9"+
		"\3\2\2\2\u03b1\u03c9\7\4\2\2\u03b2\u03c9\7\3\2\2\u03b3\u03c9\7\6\2\2\u03b4"+
		"\u03c9\7#\2\2\u03b5\u03c9\7!\2\2\u03b6\u03c9\7\"\2\2\u03b7\u03c9\7\20"+
		"\2\2\u03b8\u03c9\7\24\2\2\u03b9\u03c9\7\25\2\2\u03ba\u03c9\7\5\2\2\u03bb"+
		"\u03c9\7\7\2\2\u03bc\u03c9\7\b\2\2\u03bd\u03c9\7\t\2\2\u03be\u03c9\7\n"+
		"\2\2\u03bf\u03c9\7\13\2\2\u03c0\u03c9\7\f\2\2\u03c1\u03c9\7\r\2\2\u03c2"+
		"\u03c3\7 \2\2\u03c3\u03c4\7\u00f1\2\2\u03c4\u03c5\5\u0094K\2\u03c5\u03c6"+
		"\7\u00f2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c9\7 \2\2\u03c8\u03b1\3\2\2"+
		"\2\u03c8\u03b2\3\2\2\2\u03c8\u03b3\3\2\2\2\u03c8\u03b4\3\2\2\2\u03c8\u03b5"+
		"\3\2\2\2\u03c8\u03b6\3\2\2\2\u03c8\u03b7\3\2\2\2\u03c8\u03b8\3\2\2\2\u03c8"+
		"\u03b9\3\2\2\2\u03c8\u03ba\3\2\2\2\u03c8\u03bb\3\2\2\2\u03c8\u03bc\3\2"+
		"\2\2\u03c8\u03bd\3\2\2\2\u03c8\u03be\3\2\2\2\u03c8\u03bf\3\2\2\2\u03c8"+
		"\u03c0\3\2\2\2\u03c8\u03c1\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c8\u03c7\3\2"+
		"\2\2\u03c9\u00bb\3\2\2\2\u03ca\u03cb\t\6\2\2\u03cb\u00bd\3\2\2\2O\u00e3"+
		"\u00f3\u00fe\u0106\u0111\u011e\u0127\u0131\u014d\u014f\u0165\u016b\u0179"+
		"\u0183\u018a\u0193\u019b\u019f\u01a3\u01ab\u01b4\u01bb\u01c8\u01d0\u01dc"+
		"\u01e4\u01fb\u01ff\u0203\u020c\u021a\u021f\u0222\u0226\u0248\u024f\u025f"+
		"\u0261\u026e\u0275\u0278\u0289\u028b\u029b\u029d\u02a9\u02ab\u02b7\u02b9"+
		"\u02cb\u02cd\u02d9\u02db\u02e6\u02f1\u02fc\u0307\u0312\u031d\u0327\u032e"+
		"\u033a\u0344\u0349\u034e\u0352\u0359\u0370\u0375\u0378\u0383\u0388\u038d"+
		"\u0395\u03a5\u03ad\u03c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}