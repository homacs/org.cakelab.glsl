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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PPINCLUDE=8, PPDEFINE=9, 
		PPUNDEF=10, PPIF=11, PPIFDEF=12, PPIFNDEF=13, PPELSE=14, PPELIF=15, PPENDIF=16, 
		PPERROR=17, PPPRAGMA=18, PPEXTENSION=19, PPVERSION=20, PPLINE=21, PPBUILTIN_LINE=22, 
		PPBUILTIN_FILE=23, PPBUILTIN_VERSION=24, ATTRIBUTE=25, CONST=26, UNIFORM=27, 
		VARYING=28, BUFFER=29, SHARED=30, COHERENT=31, VOLATILE=32, RESTRICT=33, 
		READONLY=34, WRITEONLY=35, ATOMIC_UINT=36, LAYOUT=37, CENTROID=38, FLAT=39, 
		SMOOTH=40, NOPERSPECTIVE=41, PATCH=42, SAMPLE=43, BREAK=44, CONTINUE=45, 
		DO=46, FOR=47, WHILE=48, SWITCH=49, CASE=50, DEFAULT=51, IF=52, ELSE=53, 
		SUBROUTINE=54, IN=55, OUT=56, INOUT=57, FLOAT=58, DOUBLE=59, INT=60, VOID=61, 
		BOOL=62, INVARIANT=63, PRECISE=64, DISCARD=65, RETURN=66, MAT2=67, MAT3=68, 
		MAT4=69, DMAT2=70, DMAT3=71, DMAT4=72, MAT2X2=73, MAT2X3=74, MAT2X4=75, 
		DMAT2X2=76, DMAT2X3=77, DMAT2X4=78, MAT3X2=79, MAT3X3=80, MAT3X4=81, DMAT3X2=82, 
		DMAT3X3=83, DMAT3X4=84, MAT4X2=85, MAT4X3=86, MAT4X4=87, DMAT4X2=88, DMAT4X3=89, 
		DMAT4X4=90, VEC2=91, VEC3=92, VEC4=93, IVEC2=94, IVEC3=95, IVEC4=96, BVEC2=97, 
		BVEC3=98, BVEC4=99, DVEC2=100, DVEC3=101, DVEC4=102, UINT=103, UVEC2=104, 
		UVEC3=105, UVEC4=106, LOW_PRECISION=107, MEDIUM_PRECISION=108, HIGH_PRECISION=109, 
		PRECISION=110, SAMPLER1D=111, SAMPLER2D=112, SAMPLER3D=113, SAMPLERCUBE=114, 
		SAMPLER1DSHADOW=115, SAMPLER2DSHADOW=116, SAMPLERCUBESHADOW=117, SAMPLER1DARRAY=118, 
		SAMPLER2DARRAY=119, SAMPLER1DARRAYSHADOW=120, SAMPLER2DARRAYSHADOW=121, 
		ISAMPLER1D=122, ISAMPLER2D=123, ISAMPLER3D=124, ISAMPLERCUBE=125, ISAMPLER1DARRAY=126, 
		ISAMPLER2DARRAY=127, USAMPLER1D=128, USAMPLER2D=129, USAMPLER3D=130, USAMPLERCUBE=131, 
		USAMPLER1DARRAY=132, USAMPLER2DARRAY=133, SAMPLER2DRECT=134, SAMPLER2DRECTSHADOW=135, 
		ISAMPLER2DRECT=136, USAMPLER2DRECT=137, SAMPLERBUFFER=138, ISAMPLERBUFFER=139, 
		USAMPLERBUFFER=140, SAMPLER2DMS=141, ISAMPLER2DMS=142, USAMPLER2DMS=143, 
		SAMPLER2DMSARRAY=144, ISAMPLER2DMSARRAY=145, USAMPLER2DMSARRAY=146, SAMPLERCUBEARRAY=147, 
		SAMPLERCUBEARRAYSHADOW=148, ISAMPLERCUBEARRAY=149, USAMPLERCUBEARRAY=150, 
		IMAGE1D=151, IIMAGE1D=152, UIMAGE1D=153, IMAGE2D=154, IIMAGE2D=155, UIMAGE2D=156, 
		IMAGE3D=157, IIMAGE3D=158, UIMAGE3D=159, IMAGE2DRECT=160, IIMAGE2DRECT=161, 
		UIMAGE2DRECT=162, IMAGECUBE=163, IIMAGECUBE=164, UIMAGECUBE=165, IMAGEBUFFER=166, 
		IIMAGEBUFFER=167, UIMAGEBUFFER=168, IMAGE1DARRAY=169, IIMAGE1DARRAY=170, 
		UIMAGE1DARRAY=171, IMAGE2DARRAY=172, IIMAGE2DARRAY=173, UIMAGE2DARRAY=174, 
		IMAGECUBEARRAY=175, IIMAGECUBEARRAY=176, UIMAGECUBEARRAY=177, IMAGE2DMS=178, 
		IIMAGE2DMS=179, UIMAGE2DMS=180, IMAGE2DMSARRAY=181, IIMAGE2DMSARRAY=182, 
		UIMAGE2DMSARRAY=183, SAMPLEREXTERNALOES=184, STRUCT=185, COMMON=186, PARTITION=187, 
		ACTIVE=188, ASM=189, CLASS=190, UNION=191, ENUM=192, TYPEDEF=193, TEMPLATE=194, 
		THIS=195, RESOURCE=196, GOTO=197, INLINE=198, NOINLINE=199, PUBLIC=200, 
		STATIC=201, EXTERN=202, EXTERNAL=203, INTERFACE=204, LONG=205, SHORT=206, 
		HALF=207, FIXED=208, UNSIGNED=209, SUPERP=210, INPUT=211, OUTPUT=212, 
		HVEC2=213, HVEC3=214, HVEC4=215, FVEC2=216, FVEC3=217, FVEC4=218, SAMPLER3DRECT=219, 
		FILTER=220, SIZEOF=221, CAST=222, NAMESPACE=223, USING=224, PPOP_DEFINED=225, 
		WHITESPACE=226, CRLF=227, HIDDEN_CRLF=228, LINE_CONTINUATION=229, MULTILINE_COMMENT=230, 
		SINGLELINE_COMMENT=231, BOOLCONSTANT=232, FLOATCONSTANT=233, DOUBLECONSTANT=234, 
		INTCONSTANT=235, UINTCONSTANT=236, LEFT_OP=237, RIGHT_OP=238, INC_OP=239, 
		DEC_OP=240, LE_OP=241, GE_OP=242, EQ_OP=243, NE_OP=244, AND_OP=245, OR_OP=246, 
		XOR_OP=247, MUL_ASSIGN=248, DIV_ASSIGN=249, ADD_ASSIGN=250, MOD_ASSIGN=251, 
		LEFT_ASSIGN=252, RIGHT_ASSIGN=253, AND_ASSIGN=254, XOR_ASSIGN=255, OR_ASSIGN=256, 
		SUB_ASSIGN=257, LEFT_PAREN=258, RIGHT_PAREN=259, LEFT_BRACKET=260, RIGHT_BRACKET=261, 
		LEFT_BRACE=262, RIGHT_BRACE=263, DOT=264, COMMA=265, COLON=266, EQUAL=267, 
		SEMICOLON=268, BANG=269, DASH=270, TILDE=271, PLUS=272, STAR=273, SLASH=274, 
		PERCENT=275, LEFT_ANGLE=276, RIGHT_ANGLE=277, VERTICAL_BAR=278, CARET=279, 
		AMPERSAND=280, QUESTION=281, HASH=282, PPOP_CONCAT=283, DOTS=284, DOUBLE_QUOTE=285, 
		SINGLE_QUOTE=286, CHARACTER_CONSTANT=287, PREFIXED_CHARACTER_CONSTANT=288, 
		STRING_LITERAL=289, PREFIXED_STRING_LITERAL=290, IDENTIFIER=291, OTHER=292;
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
		RULE_glslPreciseQualifier = 78, RULE_glslStorageQualifier = 79, RULE_glslPrecisionQualifier = 80, 
		RULE_glslpp = 81, RULE_glslppPreprocessingFile = 82, RULE_glslppGroup = 83, 
		RULE_glslppGroupPart = 84, RULE_glslppIfSection = 85, RULE_glslppIfGroup = 86, 
		RULE_glslppElifGroups = 87, RULE_glslppElifGroup = 88, RULE_glslppElseGroup = 89, 
		RULE_glslppEndifLine = 90, RULE_glslppControlLine = 91, RULE_glslppMacro = 92, 
		RULE_glslppMacroArguments = 93, RULE_glslppExtensionBehaviour = 94, RULE_glslppProfile = 95, 
		RULE_glslppIdentifierList = 96, RULE_glslppTextLine = 97, RULE_glslppNonDirective = 98, 
		RULE_glslppReplacementList = 99, RULE_glslppTokens = 100, RULE_glslppPreprocessingToken = 101, 
		RULE_glslppCharacterConstant = 102, RULE_glslppStringLiteral = 103, RULE_glslppHeaderName = 104, 
		RULE_glslppIdentifier = 105, RULE_glslppNumber = 106, RULE_glslppSign = 107, 
		RULE_glslppPunctuator = 108, RULE_glslppUnspecifiedToken = 109;
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
		"glslPreciseQualifier", "glslStorageQualifier", "glslPrecisionQualifier", 
		"glslpp", "glslppPreprocessingFile", "glslppGroup", "glslppGroupPart", 
		"glslppIfSection", "glslppIfGroup", "glslppElifGroups", "glslppElifGroup", 
		"glslppElseGroup", "glslppEndifLine", "glslppControlLine", "glslppMacro", 
		"glslppMacroArguments", "glslppExtensionBehaviour", "glslppProfile", "glslppIdentifierList", 
		"glslppTextLine", "glslppNonDirective", "glslppReplacementList", "glslppTokens", 
		"glslppPreprocessingToken", "glslppCharacterConstant", "glslppStringLiteral", 
		"glslppHeaderName", "glslppIdentifier", "glslppNumber", "glslppSign", 
		"glslppPunctuator", "glslppUnspecifiedToken"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'require'", "'enable'", "'warn'", "'disable'", "'core'", "'compatibility'", 
		"'es'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'__LINE__'", "'__FILE__'", "'__VERSION__'", "'attribute'", 
		"'const'", "'uniform'", "'varying'", "'buffer'", "'shared'", "'coherent'", 
		"'volatile'", "'restrict'", "'readonly'", "'writeonly'", "'atomic_uint'", 
		"'layout'", "'centroid'", "'flat'", "'smooth'", "'noperspective'", "'patch'", 
		"'sample'", "'break'", "'continue'", "'do'", "'for'", "'while'", "'switch'", 
		"'case'", "'default'", "'if'", "'else'", "'subroutine'", "'in'", "'out'", 
		"'inout'", "'float'", "'double'", "'int'", "'void'", "'bool'", "'invariant'", 
		"'precise'", "'discard'", "'return'", "'mat2'", "'mat3'", "'mat4'", "'dmat2'", 
		"'dmat3'", "'dmat4'", "'mat2x2'", "'mat2x3'", "'mat2x4'", "'dmat2x2'", 
		"'dmat2x3'", "'dmat2x4'", "'mat3x2'", "'mat3x3'", "'mat3x4'", "'dmat3x2'", 
		"'dmat3x3'", "'dmat3x4'", "'mat4x2'", "'mat4x3'", "'mat4x4'", "'dmat4x2'", 
		"'dmat4x3'", "'dmat4x4'", "'vec2'", "'vec3'", "'vec4'", "'ivec2'", "'ivec3'", 
		"'ivec4'", "'bvec2'", "'bvec3'", "'bvec4'", "'dvec2'", "'dvec3'", "'dvec4'", 
		"'uint'", "'uvec2'", "'uvec3'", "'uvec4'", "'lowp'", "'mediump'", "'highp'", 
		"'precision'", "'sampler1D'", "'sampler2D'", "'sampler3D'", "'samplerCube'", 
		"'sampler1DShadow'", "'sampler2DShadow'", "'samplerCubeShadow'", "'sampler1DArray'", 
		"'sampler2DArray'", "'sampler1DArrayShadow'", "'sampler2DArrayShadow'", 
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
		null, null, null, null, null, null, null, null, null, null, null, "'<<'", 
		"'>>'", "'++'", "'--'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
		"'^^'", "'*='", "'/='", "'+='", "'%='", "'<<='", "'>>='", "'&='", "'^='", 
		"'|='", "'-='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", 
		"':'", "'='", "';'", "'!'", "'-'", "'~'", "'+'", "'*'", "'/'", "'%'", 
		"'<'", "'>'", "'|'", "'^'", "'&'", "'?'", "'#'", "'##'", "'...'", "'\"'", 
		"'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PPINCLUDE", "PPDEFINE", 
		"PPUNDEF", "PPIF", "PPIFDEF", "PPIFNDEF", "PPELSE", "PPELIF", "PPENDIF", 
		"PPERROR", "PPPRAGMA", "PPEXTENSION", "PPVERSION", "PPLINE", "PPBUILTIN_LINE", 
		"PPBUILTIN_FILE", "PPBUILTIN_VERSION", "ATTRIBUTE", "CONST", "UNIFORM", 
		"VARYING", "BUFFER", "SHARED", "COHERENT", "VOLATILE", "RESTRICT", "READONLY", 
		"WRITEONLY", "ATOMIC_UINT", "LAYOUT", "CENTROID", "FLAT", "SMOOTH", "NOPERSPECTIVE", 
		"PATCH", "SAMPLE", "BREAK", "CONTINUE", "DO", "FOR", "WHILE", "SWITCH", 
		"CASE", "DEFAULT", "IF", "ELSE", "SUBROUTINE", "IN", "OUT", "INOUT", "FLOAT", 
		"DOUBLE", "INT", "VOID", "BOOL", "INVARIANT", "PRECISE", "DISCARD", "RETURN", 
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
		"IIMAGE2DMSARRAY", "UIMAGE2DMSARRAY", "SAMPLEREXTERNALOES", "STRUCT", 
		"COMMON", "PARTITION", "ACTIVE", "ASM", "CLASS", "UNION", "ENUM", "TYPEDEF", 
		"TEMPLATE", "THIS", "RESOURCE", "GOTO", "INLINE", "NOINLINE", "PUBLIC", 
		"STATIC", "EXTERN", "EXTERNAL", "INTERFACE", "LONG", "SHORT", "HALF", 
		"FIXED", "UNSIGNED", "SUPERP", "INPUT", "OUTPUT", "HVEC2", "HVEC3", "HVEC4", 
		"FVEC2", "FVEC3", "FVEC4", "SAMPLER3DRECT", "FILTER", "SIZEOF", "CAST", 
		"NAMESPACE", "USING", "PPOP_DEFINED", "WHITESPACE", "CRLF", "HIDDEN_CRLF", 
		"LINE_CONTINUATION", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", "BOOLCONSTANT", 
		"FLOATCONSTANT", "DOUBLECONSTANT", "INTCONSTANT", "UINTCONSTANT", "LEFT_OP", 
		"RIGHT_OP", "INC_OP", "DEC_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", "AND_OP", 
		"OR_OP", "XOR_OP", "MUL_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", "MOD_ASSIGN", 
		"LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", 
		"SUB_ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"LEFT_BRACE", "RIGHT_BRACE", "DOT", "COMMA", "COLON", "EQUAL", "SEMICOLON", 
		"BANG", "DASH", "TILDE", "PLUS", "STAR", "SLASH", "PERCENT", "LEFT_ANGLE", 
		"RIGHT_ANGLE", "VERTICAL_BAR", "CARET", "AMPERSAND", "QUESTION", "HASH", 
		"PPOP_CONCAT", "DOTS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "CHARACTER_CONSTANT", 
		"PREFIXED_CHARACTER_CONSTANT", "STRING_LITERAL", "PREFIXED_STRING_LITERAL", 
		"IDENTIFIER", "OTHER"
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


		
		
		/**
		 * This method checks whether the previous token on hidden channel
		 * equals tokenType.
		 * 
		 * The current token is always the next token to be consumed. 
		 * Thus, the previous token is always the token that was just 
		 * consumed.
		 * 
		 */
		private boolean hidden(int tokenType) {
			CommonTokenStream stream = ((CommonTokenStream)this._input);
			java.util.List<Token> tokens = stream.getHiddenTokensToLeft(stream.index());
			if (tokens != null && !tokens.isEmpty()) {
				return tokens.get(tokens.size()-1).getType() == tokenType;
			} else {
				return false;
			}
		}
		
		


		public boolean preprocessing = false;
		public void preprocessing(boolean enable) {
			preprocessing = enable;
		}

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
			setState(220);
			glslTranslationUnit();
			setState(221);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				glslTypeQualifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				glslTypePrecisionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				glslTypeQualifier();
				setState(226);
				glslIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				glslTypeQualifier();
				setState(229);
				glslVariableIdentifier();
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					match(COMMA);
					setState(231);
					glslVariableIdentifier();
					}
					}
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				glslTypeQualifier();
				setState(237);
				glslTypeName();
				setState(238);
				glslVariableDeclarations();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				glslTypeQualifier();
				setState(241);
				glslTypeName();
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					glslArrayDimension();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LEFT_BRACKET );
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(247);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				glslTypeQualifier();
				setState(251);
				glslBuiltinType();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(252);
					glslArrayDimension();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(258);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				glslTypeQualifier();
				setState(262);
				glslStructSpecifier();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(263);
					glslArrayDimension();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(269);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				glslTypeSpecifier();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(273);
					glslVariableDeclarations();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(276);
				glslInterfaceBlockStructure();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(277);
					glslVariableIdentifier();
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LEFT_BRACKET) {
						{
						{
						setState(278);
						glslArrayDimension();
						}
						}
						setState(283);
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
				setState(286);
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
			setState(289);
			glslDeclaration();
			setState(290);
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
			setState(292);
			match(PRECISION);
			setState(293);
			glslPrecisionQualifier();
			setState(294);
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
			setState(296);
			glslVariableDeclarator();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				glslVariableDeclarator();
				}
				}
				setState(303);
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
			setState(304);
			glslTypeQualifier();
			setState(305);
			match(IDENTIFIER);
			setState(306);
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
			setState(308);
			glslFullySpecifiedType();
			setState(309);
			glslFunctionName();
			setState(310);
			match(LEFT_PAREN);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(311);
				glslFunctionParameters();
				}
			}

			setState(314);
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
			setState(316);
			glslParameterDeclaration();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(317);
				match(COMMA);
				setState(318);
				glslParameterDeclaration();
				}
				}
				setState(323);
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
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)))) != 0)) {
				{
				setState(324);
				glslTypeQualifier();
				}
			}

			setState(327);
			glslTypeSpecifier();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(328);
				glslVariableIdentifier();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(329);
					glslArrayDimension();
					}
					}
					setState(334);
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
			setState(337);
			glslVariableIdentifier();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(338);
				glslArrayDimension();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(344);
				match(EQUAL);
				setState(345);
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
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)))) != 0)) {
				{
				setState(348);
				glslTypeQualifier();
				}
			}

			setState(351);
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
			setState(368);
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
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				glslAssignmentExpression();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(LEFT_BRACE);
				setState(355);
				glslInitializer();
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(356);
						match(COMMA);
						setState(357);
						glslInitializer();
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(363);
					match(COMMA);
					}
				}

				setState(366);
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
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
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
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
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
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				glslDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				glslExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				glslIfStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				glslWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				glslDoWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(380);
				glslForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(381);
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
			setState(384);
			match(LEFT_BRACE);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << IF) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (PPOP_DEFINED - 225)) | (1L << (BOOLCONSTANT - 225)) | (1L << (FLOATCONSTANT - 225)) | (1L << (DOUBLECONSTANT - 225)) | (1L << (INTCONSTANT - 225)) | (1L << (UINTCONSTANT - 225)) | (1L << (INC_OP - 225)) | (1L << (DEC_OP - 225)) | (1L << (LEFT_PAREN - 225)) | (1L << (LEFT_BRACE - 225)) | (1L << (SEMICOLON - 225)) | (1L << (BANG - 225)) | (1L << (DASH - 225)) | (1L << (TILDE - 225)) | (1L << (PLUS - 225)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(385);
				glslStatement();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
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
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (FLOAT - 36)) | (1L << (DOUBLE - 36)) | (1L << (INT - 36)) | (1L << (VOID - 36)) | (1L << (BOOL - 36)) | (1L << (MAT2 - 36)) | (1L << (MAT3 - 36)) | (1L << (MAT4 - 36)) | (1L << (DMAT2 - 36)) | (1L << (DMAT3 - 36)) | (1L << (DMAT4 - 36)) | (1L << (MAT2X2 - 36)) | (1L << (MAT2X3 - 36)) | (1L << (MAT2X4 - 36)) | (1L << (DMAT2X2 - 36)) | (1L << (DMAT2X3 - 36)) | (1L << (DMAT2X4 - 36)) | (1L << (MAT3X2 - 36)) | (1L << (MAT3X3 - 36)) | (1L << (MAT3X4 - 36)) | (1L << (DMAT3X2 - 36)) | (1L << (DMAT3X3 - 36)) | (1L << (DMAT3X4 - 36)) | (1L << (MAT4X2 - 36)) | (1L << (MAT4X3 - 36)) | (1L << (MAT4X4 - 36)) | (1L << (DMAT4X2 - 36)) | (1L << (DMAT4X3 - 36)) | (1L << (DMAT4X4 - 36)) | (1L << (VEC2 - 36)) | (1L << (VEC3 - 36)) | (1L << (VEC4 - 36)) | (1L << (IVEC2 - 36)) | (1L << (IVEC3 - 36)) | (1L << (IVEC4 - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (DVEC2 - 100)) | (1L << (DVEC3 - 100)) | (1L << (DVEC4 - 100)) | (1L << (UINT - 100)) | (1L << (UVEC2 - 100)) | (1L << (UVEC3 - 100)) | (1L << (UVEC4 - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLERCUBE - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLERCUBESHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLERCUBE - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)) | (1L << (USAMPLER3D - 100)) | (1L << (USAMPLERCUBE - 100)) | (1L << (USAMPLER1DARRAY - 100)) | (1L << (USAMPLER2DARRAY - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (USAMPLER2DRECT - 100)) | (1L << (SAMPLERBUFFER - 100)) | (1L << (ISAMPLERBUFFER - 100)) | (1L << (USAMPLERBUFFER - 100)) | (1L << (SAMPLER2DMS - 100)) | (1L << (ISAMPLER2DMS - 100)) | (1L << (USAMPLER2DMS - 100)) | (1L << (SAMPLER2DMSARRAY - 100)) | (1L << (ISAMPLER2DMSARRAY - 100)) | (1L << (USAMPLER2DMSARRAY - 100)) | (1L << (SAMPLERCUBEARRAY - 100)) | (1L << (SAMPLERCUBEARRAYSHADOW - 100)) | (1L << (ISAMPLERCUBEARRAY - 100)) | (1L << (USAMPLERCUBEARRAY - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IMAGE2DRECT - 100)) | (1L << (IIMAGE2DRECT - 100)) | (1L << (UIMAGE2DRECT - 100)) | (1L << (IMAGECUBE - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (IIMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLEREXTERNALOES - 164)) | (1L << (STRUCT - 164)) | (1L << (PPOP_DEFINED - 164)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (BOOLCONSTANT - 232)) | (1L << (FLOATCONSTANT - 232)) | (1L << (DOUBLECONSTANT - 232)) | (1L << (INTCONSTANT - 232)) | (1L << (UINTCONSTANT - 232)) | (1L << (INC_OP - 232)) | (1L << (DEC_OP - 232)) | (1L << (LEFT_PAREN - 232)) | (1L << (BANG - 232)) | (1L << (DASH - 232)) | (1L << (TILDE - 232)) | (1L << (PLUS - 232)) | (1L << (IDENTIFIER - 232)))) != 0)) {
				{
				setState(393);
				glslExpression();
				}
			}

			setState(396);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(IF);
				setState(399);
				match(LEFT_PAREN);
				setState(400);
				glslCondition();
				setState(401);
				match(RIGHT_PAREN);
				setState(402);
				glslStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(IF);
				setState(405);
				match(LEFT_PAREN);
				setState(406);
				glslCondition();
				setState(407);
				match(RIGHT_PAREN);
				setState(408);
				glslNonIfStatement();
				setState(409);
				match(ELSE);
				setState(410);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				glslCompoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				glslDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				glslExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				glslSwitchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				glslWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				glslDoWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				glslForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(421);
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
			setState(424);
			match(SWITCH);
			setState(425);
			match(LEFT_PAREN);
			setState(426);
			glslCondition();
			setState(427);
			match(RIGHT_PAREN);
			setState(428);
			match(LEFT_BRACE);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (PPOP_DEFINED - 225)) | (1L << (BOOLCONSTANT - 225)) | (1L << (FLOATCONSTANT - 225)) | (1L << (DOUBLECONSTANT - 225)) | (1L << (INTCONSTANT - 225)) | (1L << (UINTCONSTANT - 225)) | (1L << (INC_OP - 225)) | (1L << (DEC_OP - 225)) | (1L << (LEFT_PAREN - 225)) | (1L << (LEFT_BRACE - 225)) | (1L << (SEMICOLON - 225)) | (1L << (BANG - 225)) | (1L << (DASH - 225)) | (1L << (TILDE - 225)) | (1L << (PLUS - 225)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(429);
				glslSwitchSubStatement();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
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
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(CASE);
				setState(438);
				glslIntegerExpression();
				setState(439);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(DEFAULT);
				setState(442);
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
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
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
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				glslExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				glslFullySpecifiedType();
				setState(448);
				glslVariableIdentifier();
				setState(449);
				match(EQUAL);
				setState(450);
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
			setState(454);
			match(WHILE);
			setState(455);
			match(LEFT_PAREN);
			setState(456);
			glslCondition();
			setState(457);
			match(RIGHT_PAREN);
			setState(458);
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
			setState(460);
			match(DO);
			setState(461);
			glslStatement();
			setState(462);
			match(WHILE);
			setState(463);
			match(LEFT_PAREN);
			setState(464);
			glslExpression();
			setState(465);
			match(RIGHT_PAREN);
			setState(466);
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
			setState(468);
			match(FOR);
			setState(469);
			match(LEFT_PAREN);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (PPOP_DEFINED - 225)) | (1L << (BOOLCONSTANT - 225)) | (1L << (FLOATCONSTANT - 225)) | (1L << (DOUBLECONSTANT - 225)) | (1L << (INTCONSTANT - 225)) | (1L << (UINTCONSTANT - 225)) | (1L << (INC_OP - 225)) | (1L << (DEC_OP - 225)) | (1L << (LEFT_PAREN - 225)) | (1L << (BANG - 225)) | (1L << (DASH - 225)) | (1L << (TILDE - 225)) | (1L << (PLUS - 225)))) != 0) || _la==IDENTIFIER) {
				{
				setState(470);
				glslForInitExpression();
				}
			}

			setState(473);
			match(SEMICOLON);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (PPOP_DEFINED - 225)) | (1L << (BOOLCONSTANT - 225)) | (1L << (FLOATCONSTANT - 225)) | (1L << (DOUBLECONSTANT - 225)) | (1L << (INTCONSTANT - 225)) | (1L << (UINTCONSTANT - 225)) | (1L << (INC_OP - 225)) | (1L << (DEC_OP - 225)) | (1L << (LEFT_PAREN - 225)) | (1L << (BANG - 225)) | (1L << (DASH - 225)) | (1L << (TILDE - 225)) | (1L << (PLUS - 225)))) != 0) || _la==IDENTIFIER) {
				{
				setState(474);
				glslCondition();
				}
			}

			setState(477);
			match(SEMICOLON);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (FLOAT - 36)) | (1L << (DOUBLE - 36)) | (1L << (INT - 36)) | (1L << (VOID - 36)) | (1L << (BOOL - 36)) | (1L << (MAT2 - 36)) | (1L << (MAT3 - 36)) | (1L << (MAT4 - 36)) | (1L << (DMAT2 - 36)) | (1L << (DMAT3 - 36)) | (1L << (DMAT4 - 36)) | (1L << (MAT2X2 - 36)) | (1L << (MAT2X3 - 36)) | (1L << (MAT2X4 - 36)) | (1L << (DMAT2X2 - 36)) | (1L << (DMAT2X3 - 36)) | (1L << (DMAT2X4 - 36)) | (1L << (MAT3X2 - 36)) | (1L << (MAT3X3 - 36)) | (1L << (MAT3X4 - 36)) | (1L << (DMAT3X2 - 36)) | (1L << (DMAT3X3 - 36)) | (1L << (DMAT3X4 - 36)) | (1L << (MAT4X2 - 36)) | (1L << (MAT4X3 - 36)) | (1L << (MAT4X4 - 36)) | (1L << (DMAT4X2 - 36)) | (1L << (DMAT4X3 - 36)) | (1L << (DMAT4X4 - 36)) | (1L << (VEC2 - 36)) | (1L << (VEC3 - 36)) | (1L << (VEC4 - 36)) | (1L << (IVEC2 - 36)) | (1L << (IVEC3 - 36)) | (1L << (IVEC4 - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (DVEC2 - 100)) | (1L << (DVEC3 - 100)) | (1L << (DVEC4 - 100)) | (1L << (UINT - 100)) | (1L << (UVEC2 - 100)) | (1L << (UVEC3 - 100)) | (1L << (UVEC4 - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLERCUBE - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLERCUBESHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLERCUBE - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)) | (1L << (USAMPLER3D - 100)) | (1L << (USAMPLERCUBE - 100)) | (1L << (USAMPLER1DARRAY - 100)) | (1L << (USAMPLER2DARRAY - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (USAMPLER2DRECT - 100)) | (1L << (SAMPLERBUFFER - 100)) | (1L << (ISAMPLERBUFFER - 100)) | (1L << (USAMPLERBUFFER - 100)) | (1L << (SAMPLER2DMS - 100)) | (1L << (ISAMPLER2DMS - 100)) | (1L << (USAMPLER2DMS - 100)) | (1L << (SAMPLER2DMSARRAY - 100)) | (1L << (ISAMPLER2DMSARRAY - 100)) | (1L << (USAMPLER2DMSARRAY - 100)) | (1L << (SAMPLERCUBEARRAY - 100)) | (1L << (SAMPLERCUBEARRAYSHADOW - 100)) | (1L << (ISAMPLERCUBEARRAY - 100)) | (1L << (USAMPLERCUBEARRAY - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IMAGE2DRECT - 100)) | (1L << (IIMAGE2DRECT - 100)) | (1L << (UIMAGE2DRECT - 100)) | (1L << (IMAGECUBE - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (IIMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLEREXTERNALOES - 164)) | (1L << (STRUCT - 164)) | (1L << (PPOP_DEFINED - 164)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (BOOLCONSTANT - 232)) | (1L << (FLOATCONSTANT - 232)) | (1L << (DOUBLECONSTANT - 232)) | (1L << (INTCONSTANT - 232)) | (1L << (UINTCONSTANT - 232)) | (1L << (INC_OP - 232)) | (1L << (DEC_OP - 232)) | (1L << (LEFT_PAREN - 232)) | (1L << (BANG - 232)) | (1L << (DASH - 232)) | (1L << (TILDE - 232)) | (1L << (PLUS - 232)) | (1L << (IDENTIFIER - 232)))) != 0)) {
				{
				setState(478);
				glslExpression();
				}
			}

			setState(481);
			match(RIGHT_PAREN);
			setState(482);
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
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				glslExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
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
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(CONTINUE);
				setState(489);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(BREAK);
				setState(491);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(RETURN);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (FLOAT - 36)) | (1L << (DOUBLE - 36)) | (1L << (INT - 36)) | (1L << (VOID - 36)) | (1L << (BOOL - 36)) | (1L << (MAT2 - 36)) | (1L << (MAT3 - 36)) | (1L << (MAT4 - 36)) | (1L << (DMAT2 - 36)) | (1L << (DMAT3 - 36)) | (1L << (DMAT4 - 36)) | (1L << (MAT2X2 - 36)) | (1L << (MAT2X3 - 36)) | (1L << (MAT2X4 - 36)) | (1L << (DMAT2X2 - 36)) | (1L << (DMAT2X3 - 36)) | (1L << (DMAT2X4 - 36)) | (1L << (MAT3X2 - 36)) | (1L << (MAT3X3 - 36)) | (1L << (MAT3X4 - 36)) | (1L << (DMAT3X2 - 36)) | (1L << (DMAT3X3 - 36)) | (1L << (DMAT3X4 - 36)) | (1L << (MAT4X2 - 36)) | (1L << (MAT4X3 - 36)) | (1L << (MAT4X4 - 36)) | (1L << (DMAT4X2 - 36)) | (1L << (DMAT4X3 - 36)) | (1L << (DMAT4X4 - 36)) | (1L << (VEC2 - 36)) | (1L << (VEC3 - 36)) | (1L << (VEC4 - 36)) | (1L << (IVEC2 - 36)) | (1L << (IVEC3 - 36)) | (1L << (IVEC4 - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (DVEC2 - 100)) | (1L << (DVEC3 - 100)) | (1L << (DVEC4 - 100)) | (1L << (UINT - 100)) | (1L << (UVEC2 - 100)) | (1L << (UVEC3 - 100)) | (1L << (UVEC4 - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLERCUBE - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLERCUBESHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLERCUBE - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)) | (1L << (USAMPLER3D - 100)) | (1L << (USAMPLERCUBE - 100)) | (1L << (USAMPLER1DARRAY - 100)) | (1L << (USAMPLER2DARRAY - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (USAMPLER2DRECT - 100)) | (1L << (SAMPLERBUFFER - 100)) | (1L << (ISAMPLERBUFFER - 100)) | (1L << (USAMPLERBUFFER - 100)) | (1L << (SAMPLER2DMS - 100)) | (1L << (ISAMPLER2DMS - 100)) | (1L << (USAMPLER2DMS - 100)) | (1L << (SAMPLER2DMSARRAY - 100)) | (1L << (ISAMPLER2DMSARRAY - 100)) | (1L << (USAMPLER2DMSARRAY - 100)) | (1L << (SAMPLERCUBEARRAY - 100)) | (1L << (SAMPLERCUBEARRAYSHADOW - 100)) | (1L << (ISAMPLERCUBEARRAY - 100)) | (1L << (USAMPLERCUBEARRAY - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IMAGE2DRECT - 100)) | (1L << (IIMAGE2DRECT - 100)) | (1L << (UIMAGE2DRECT - 100)) | (1L << (IMAGECUBE - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (IIMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLEREXTERNALOES - 164)) | (1L << (STRUCT - 164)) | (1L << (PPOP_DEFINED - 164)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (BOOLCONSTANT - 232)) | (1L << (FLOATCONSTANT - 232)) | (1L << (DOUBLECONSTANT - 232)) | (1L << (INTCONSTANT - 232)) | (1L << (UINTCONSTANT - 232)) | (1L << (INC_OP - 232)) | (1L << (DEC_OP - 232)) | (1L << (LEFT_PAREN - 232)) | (1L << (BANG - 232)) | (1L << (DASH - 232)) | (1L << (TILDE - 232)) | (1L << (PLUS - 232)) | (1L << (IDENTIFIER - 232)))) != 0)) {
					{
					setState(493);
					glslExpression();
					}
				}

				setState(496);
				match(SEMICOLON);
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(DISCARD);
				setState(498);
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
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(501);
				glslExternalDeclaration();
				}
				}
				setState(506);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				glslFunctionDefinition();
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
			setState(511);
			glslFunctionPrototype();
			setState(512);
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
			setState(514);
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
			setState(516);
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
			setState(518);
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
			setState(520);
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
			setState(522);
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
			setState(524);
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
			setState(526);
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
			setState(528);
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
			setState(530);
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
			setState(532);
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
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
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
				setState(535);
				glslBuiltinType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				glslStructSpecifier();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(538);
				glslDoubleConstant();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(539);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 7);
				{
				setState(540);
				glslUnsignedIntegerConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 8);
				{
				setState(541);
				glslBoolConstant();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(542);
				match(LEFT_PAREN);
				setState(543);
				glslExpression();
				setState(544);
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
			setState(549);
			glslPrimaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(562);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(551);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(552);
						glslCallArguments();
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(553);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(554);
						glslArrayDimension();
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(555);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(556);
						match(DOT);
						setState(557);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(558);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(559);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(560);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(561);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(566);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(LEFT_PAREN);
				setState(568);
				glslAssignmentExpression();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(569);
					match(COMMA);
					setState(570);
					glslAssignmentExpression();
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(576);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(LEFT_PAREN);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(579);
					match(VOID);
					}
				}

				setState(582);
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
			setState(585);
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
		public TerminalNode PPOP_DEFINED() { return getToken(GLSLParser.PPOP_DEFINED, 0); }
		public GlslIdentifierContext glslIdentifier() {
			return getRuleContext(GlslIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 86, RULE_glslUnaryExpression);
		try {
			setState(599);
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
				setState(587);
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
				setState(588);
				glslUnaryOperator();
				setState(589);
				glslUnaryExpression();
				}
				break;
			case PPOP_DEFINED:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				match(PPOP_DEFINED);
				setState(597);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
					{
					{
					setState(592);
					match(LEFT_PAREN);
					setState(593);
					glslIdentifier();
					setState(594);
					match(RIGHT_PAREN);
					}
					}
					break;
				case IDENTIFIER:
					{
					setState(596);
					glslIdentifier();
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
			setState(601);
			_la = _input.LA(1);
			if ( !(((((_la - 239)) & ~0x3f) == 0 && ((1L << (_la - 239)) & ((1L << (INC_OP - 239)) | (1L << (DEC_OP - 239)) | (1L << (BANG - 239)) | (1L << (DASH - 239)) | (1L << (TILDE - 239)) | (1L << (PLUS - 239)))) != 0)) ) {
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
			setState(604);
			glslUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(606);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(607);
						match(STAR);
						setState(608);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(609);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(610);
						match(SLASH);
						setState(611);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(612);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(613);
						match(PERCENT);
						setState(614);
						glslUnaryExpression();
						}
						break;
					}
					} 
				}
				setState(619);
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
			setState(621);
			glslMultiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(629);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(623);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(624);
						match(PLUS);
						setState(625);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(626);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(627);
						match(DASH);
						setState(628);
						glslMultiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(633);
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
			setState(635);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(643);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(637);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(638);
						match(LEFT_OP);
						setState(639);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(640);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(641);
						match(RIGHT_OP);
						setState(642);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(647);
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
			setState(649);
			glslShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(663);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(651);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(652);
						match(LEFT_ANGLE);
						setState(653);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(654);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(655);
						match(RIGHT_ANGLE);
						setState(656);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(657);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(658);
						match(LE_OP);
						setState(659);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(660);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(661);
						match(GE_OP);
						setState(662);
						glslShiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(667);
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
			setState(669);
			glslRelationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(677);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(671);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(672);
						match(EQ_OP);
						setState(673);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(674);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(675);
						match(NE_OP);
						setState(676);
						glslRelationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(681);
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
			setState(683);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(685);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(686);
					match(AMPERSAND);
					setState(687);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(692);
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
			setState(694);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(696);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(697);
					match(CARET);
					setState(698);
					glslAndExpression(0);
					}
					} 
				}
				setState(703);
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
			setState(705);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(707);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(708);
					match(VERTICAL_BAR);
					setState(709);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(714);
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
			setState(716);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(718);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(719);
					match(AND_OP);
					setState(720);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(725);
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
			setState(727);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(729);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(730);
					match(XOR_OP);
					setState(731);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(736);
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
			setState(738);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(740);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(741);
					match(OR_OP);
					setState(742);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(747);
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
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				glslLogicalOrExpression(0);
				setState(750);
				match(QUESTION);
				setState(751);
				glslExpression();
				setState(752);
				match(COLON);
				setState(753);
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
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				glslUnaryExpression();
				setState(759);
				glslAssignmentOperator();
				setState(760);
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
			setState(764);
			_la = _input.LA(1);
			if ( !(((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (MUL_ASSIGN - 248)) | (1L << (DIV_ASSIGN - 248)) | (1L << (ADD_ASSIGN - 248)) | (1L << (MOD_ASSIGN - 248)) | (1L << (LEFT_ASSIGN - 248)) | (1L << (RIGHT_ASSIGN - 248)) | (1L << (AND_ASSIGN - 248)) | (1L << (XOR_ASSIGN - 248)) | (1L << (OR_ASSIGN - 248)) | (1L << (SUB_ASSIGN - 248)) | (1L << (EQUAL - 248)))) != 0)) ) {
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
			setState(766);
			glslAssignmentExpression();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(767);
				match(COMMA);
				setState(768);
				glslAssignmentExpression();
				}
				}
				setState(773);
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
			setState(774);
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
			setState(776);
			glslFunctionName();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(777);
				match(COMMA);
				setState(778);
				glslFunctionName();
				}
				}
				setState(783);
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
			setState(784);
			glslTypeSpecifierNonarray();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(785);
				glslArrayDimension();
				}
				}
				setState(790);
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
			setState(791);
			match(LEFT_BRACKET);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (FLOAT - 36)) | (1L << (DOUBLE - 36)) | (1L << (INT - 36)) | (1L << (VOID - 36)) | (1L << (BOOL - 36)) | (1L << (MAT2 - 36)) | (1L << (MAT3 - 36)) | (1L << (MAT4 - 36)) | (1L << (DMAT2 - 36)) | (1L << (DMAT3 - 36)) | (1L << (DMAT4 - 36)) | (1L << (MAT2X2 - 36)) | (1L << (MAT2X3 - 36)) | (1L << (MAT2X4 - 36)) | (1L << (DMAT2X2 - 36)) | (1L << (DMAT2X3 - 36)) | (1L << (DMAT2X4 - 36)) | (1L << (MAT3X2 - 36)) | (1L << (MAT3X3 - 36)) | (1L << (MAT3X4 - 36)) | (1L << (DMAT3X2 - 36)) | (1L << (DMAT3X3 - 36)) | (1L << (DMAT3X4 - 36)) | (1L << (MAT4X2 - 36)) | (1L << (MAT4X3 - 36)) | (1L << (MAT4X4 - 36)) | (1L << (DMAT4X2 - 36)) | (1L << (DMAT4X3 - 36)) | (1L << (DMAT4X4 - 36)) | (1L << (VEC2 - 36)) | (1L << (VEC3 - 36)) | (1L << (VEC4 - 36)) | (1L << (IVEC2 - 36)) | (1L << (IVEC3 - 36)) | (1L << (IVEC4 - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (DVEC2 - 100)) | (1L << (DVEC3 - 100)) | (1L << (DVEC4 - 100)) | (1L << (UINT - 100)) | (1L << (UVEC2 - 100)) | (1L << (UVEC3 - 100)) | (1L << (UVEC4 - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLERCUBE - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLERCUBESHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLERCUBE - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)) | (1L << (USAMPLER3D - 100)) | (1L << (USAMPLERCUBE - 100)) | (1L << (USAMPLER1DARRAY - 100)) | (1L << (USAMPLER2DARRAY - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (USAMPLER2DRECT - 100)) | (1L << (SAMPLERBUFFER - 100)) | (1L << (ISAMPLERBUFFER - 100)) | (1L << (USAMPLERBUFFER - 100)) | (1L << (SAMPLER2DMS - 100)) | (1L << (ISAMPLER2DMS - 100)) | (1L << (USAMPLER2DMS - 100)) | (1L << (SAMPLER2DMSARRAY - 100)) | (1L << (ISAMPLER2DMSARRAY - 100)) | (1L << (USAMPLER2DMSARRAY - 100)) | (1L << (SAMPLERCUBEARRAY - 100)) | (1L << (SAMPLERCUBEARRAYSHADOW - 100)) | (1L << (ISAMPLERCUBEARRAY - 100)) | (1L << (USAMPLERCUBEARRAY - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IMAGE2DRECT - 100)) | (1L << (IIMAGE2DRECT - 100)) | (1L << (UIMAGE2DRECT - 100)) | (1L << (IMAGECUBE - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (IIMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLEREXTERNALOES - 164)) | (1L << (STRUCT - 164)) | (1L << (PPOP_DEFINED - 164)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (BOOLCONSTANT - 232)) | (1L << (FLOATCONSTANT - 232)) | (1L << (DOUBLECONSTANT - 232)) | (1L << (INTCONSTANT - 232)) | (1L << (UINTCONSTANT - 232)) | (1L << (INC_OP - 232)) | (1L << (DEC_OP - 232)) | (1L << (LEFT_PAREN - 232)) | (1L << (BANG - 232)) | (1L << (DASH - 232)) | (1L << (TILDE - 232)) | (1L << (PLUS - 232)) | (1L << (IDENTIFIER - 232)))) != 0)) {
				{
				setState(792);
				glslIntegerExpression();
				}
			}

			setState(795);
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
			setState(800);
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
				setState(797);
				glslBuiltinType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				glslStructSpecifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
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
			setState(802);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MAT2 - 67)) | (1L << (MAT3 - 67)) | (1L << (MAT4 - 67)) | (1L << (DMAT2 - 67)) | (1L << (DMAT3 - 67)) | (1L << (DMAT4 - 67)) | (1L << (MAT2X2 - 67)) | (1L << (MAT2X3 - 67)) | (1L << (MAT2X4 - 67)) | (1L << (DMAT2X2 - 67)) | (1L << (DMAT2X3 - 67)) | (1L << (DMAT2X4 - 67)) | (1L << (MAT3X2 - 67)) | (1L << (MAT3X3 - 67)) | (1L << (MAT3X4 - 67)) | (1L << (DMAT3X2 - 67)) | (1L << (DMAT3X3 - 67)) | (1L << (DMAT3X4 - 67)) | (1L << (MAT4X2 - 67)) | (1L << (MAT4X3 - 67)) | (1L << (MAT4X4 - 67)) | (1L << (DMAT4X2 - 67)) | (1L << (DMAT4X3 - 67)) | (1L << (DMAT4X4 - 67)) | (1L << (VEC2 - 67)) | (1L << (VEC3 - 67)) | (1L << (VEC4 - 67)) | (1L << (IVEC2 - 67)) | (1L << (IVEC3 - 67)) | (1L << (IVEC4 - 67)) | (1L << (BVEC2 - 67)) | (1L << (BVEC3 - 67)) | (1L << (BVEC4 - 67)) | (1L << (DVEC2 - 67)) | (1L << (DVEC3 - 67)) | (1L << (DVEC4 - 67)) | (1L << (UINT - 67)) | (1L << (UVEC2 - 67)) | (1L << (UVEC3 - 67)) | (1L << (UVEC4 - 67)) | (1L << (SAMPLER1D - 67)) | (1L << (SAMPLER2D - 67)) | (1L << (SAMPLER3D - 67)) | (1L << (SAMPLERCUBE - 67)) | (1L << (SAMPLER1DSHADOW - 67)) | (1L << (SAMPLER2DSHADOW - 67)) | (1L << (SAMPLERCUBESHADOW - 67)) | (1L << (SAMPLER1DARRAY - 67)) | (1L << (SAMPLER2DARRAY - 67)) | (1L << (SAMPLER1DARRAYSHADOW - 67)) | (1L << (SAMPLER2DARRAYSHADOW - 67)) | (1L << (ISAMPLER1D - 67)) | (1L << (ISAMPLER2D - 67)) | (1L << (ISAMPLER3D - 67)) | (1L << (ISAMPLERCUBE - 67)) | (1L << (ISAMPLER1DARRAY - 67)) | (1L << (ISAMPLER2DARRAY - 67)) | (1L << (USAMPLER1D - 67)) | (1L << (USAMPLER2D - 67)) | (1L << (USAMPLER3D - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (USAMPLERCUBE - 131)) | (1L << (USAMPLER1DARRAY - 131)) | (1L << (USAMPLER2DARRAY - 131)) | (1L << (SAMPLER2DRECT - 131)) | (1L << (SAMPLER2DRECTSHADOW - 131)) | (1L << (ISAMPLER2DRECT - 131)) | (1L << (USAMPLER2DRECT - 131)) | (1L << (SAMPLERBUFFER - 131)) | (1L << (ISAMPLERBUFFER - 131)) | (1L << (USAMPLERBUFFER - 131)) | (1L << (SAMPLER2DMS - 131)) | (1L << (ISAMPLER2DMS - 131)) | (1L << (USAMPLER2DMS - 131)) | (1L << (SAMPLER2DMSARRAY - 131)) | (1L << (ISAMPLER2DMSARRAY - 131)) | (1L << (USAMPLER2DMSARRAY - 131)) | (1L << (SAMPLERCUBEARRAY - 131)) | (1L << (SAMPLERCUBEARRAYSHADOW - 131)) | (1L << (ISAMPLERCUBEARRAY - 131)) | (1L << (USAMPLERCUBEARRAY - 131)) | (1L << (IMAGE1D - 131)) | (1L << (IIMAGE1D - 131)) | (1L << (UIMAGE1D - 131)) | (1L << (IMAGE2D - 131)) | (1L << (IIMAGE2D - 131)) | (1L << (UIMAGE2D - 131)) | (1L << (IMAGE3D - 131)) | (1L << (IIMAGE3D - 131)) | (1L << (UIMAGE3D - 131)) | (1L << (IMAGE2DRECT - 131)) | (1L << (IIMAGE2DRECT - 131)) | (1L << (UIMAGE2DRECT - 131)) | (1L << (IMAGECUBE - 131)) | (1L << (IIMAGECUBE - 131)) | (1L << (UIMAGECUBE - 131)) | (1L << (IMAGEBUFFER - 131)) | (1L << (IIMAGEBUFFER - 131)) | (1L << (UIMAGEBUFFER - 131)) | (1L << (IMAGE1DARRAY - 131)) | (1L << (IIMAGE1DARRAY - 131)) | (1L << (UIMAGE1DARRAY - 131)) | (1L << (IMAGE2DARRAY - 131)) | (1L << (IIMAGE2DARRAY - 131)) | (1L << (UIMAGE2DARRAY - 131)) | (1L << (IMAGECUBEARRAY - 131)) | (1L << (IIMAGECUBEARRAY - 131)) | (1L << (UIMAGECUBEARRAY - 131)) | (1L << (IMAGE2DMS - 131)) | (1L << (IIMAGE2DMS - 131)) | (1L << (UIMAGE2DMS - 131)) | (1L << (IMAGE2DMSARRAY - 131)) | (1L << (IIMAGE2DMSARRAY - 131)) | (1L << (UIMAGE2DMSARRAY - 131)) | (1L << (SAMPLEREXTERNALOES - 131)))) != 0)) ) {
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
			setState(804);
			match(STRUCT);
			setState(805);
			match(IDENTIFIER);
			setState(806);
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
			setState(808);
			match(LEFT_BRACE);
			setState(810); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(809);
				glslStructMemberGroup();
				}
				}
				setState(812); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==IDENTIFIER );
			setState(814);
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
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)))) != 0)) {
				{
				setState(816);
				glslTypeQualifier();
				}
			}

			setState(819);
			glslTypeSpecifier();
			setState(820);
			glslStructMemberDeclaratorList();
			setState(821);
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
			setState(823);
			glslStructMemberDeclarator();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(824);
				match(COMMA);
				setState(825);
				glslStructMemberDeclarator();
				}
				}
				setState(830);
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
			setState(831);
			match(IDENTIFIER);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(832);
				glslArrayDimension();
				}
				}
				setState(837);
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
			setState(839); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(838);
				glslSingleTypeQualifier();
				}
				}
				setState(841); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(849);
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
				setState(843);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				glslLayoutQualifier();
				}
				break;
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(845);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(847);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(848);
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
			setState(851);
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
			setState(853);
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
			setState(855);
			match(LAYOUT);
			setState(856);
			match(LEFT_PAREN);
			setState(857);
			glslLayoutQualifierIdList();
			setState(858);
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
			setState(860);
			glslLayoutQualifierId();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(861);
				match(COMMA);
				setState(862);
				glslLayoutQualifierId();
				}
				}
				setState(867);
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
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(IDENTIFIER);
				setState(870);
				match(EQUAL);
				setState(871);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
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
			setState(875);
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
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(881);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(882);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(883);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(884);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(885);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(886);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(887);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(888);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(889);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(890);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(891);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(892);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(893);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(894);
				match(SUBROUTINE);
				setState(895);
				match(LEFT_PAREN);
				setState(896);
				glslFunctionNameList();
				setState(897);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(899);
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
			setState(902);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (LOW_PRECISION - 107)) | (1L << (MEDIUM_PRECISION - 107)) | (1L << (HIGH_PRECISION - 107)))) != 0)) ) {
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

	public static class GlslppContext extends ParserRuleContext {
		public GlslppPreprocessingFileContext glslppPreprocessingFile() {
			return getRuleContext(GlslppPreprocessingFileContext.class,0);
		}
		public GlslppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppContext glslpp() throws RecognitionException {
		GlslppContext _localctx = new GlslppContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_glslpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			glslppPreprocessingFile();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlslppPreprocessingFileContext extends ParserRuleContext {
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public GlslppPreprocessingFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppPreprocessingFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppPreprocessingFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppPreprocessingFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppPreprocessingFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppPreprocessingFileContext glslppPreprocessingFile() throws RecognitionException {
		GlslppPreprocessingFileContext _localctx = new GlslppPreprocessingFileContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_glslppPreprocessingFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
				{
				setState(906);
				glslppGroup();
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppGroupContext glslppGroup() throws RecognitionException {
		GlslppGroupContext _localctx = new GlslppGroupContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_glslppGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(909);
				glslppGroupPart();
				}
				}
				setState(912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppGroupPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppGroupPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppGroupPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppGroupPartContext glslppGroupPart() throws RecognitionException {
		GlslppGroupPartContext _localctx = new GlslppGroupPartContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_glslppGroupPart);
		try {
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PPIF:
			case PPIFDEF:
			case PPIFNDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				glslppIfSection();
				}
				break;
			case PPINCLUDE:
			case PPDEFINE:
			case PPUNDEF:
			case PPERROR:
			case PPPRAGMA:
			case PPEXTENSION:
			case PPVERSION:
			case PPLINE:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				glslppControlLine();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case PPBUILTIN_LINE:
			case PPBUILTIN_FILE:
			case PPBUILTIN_VERSION:
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
			case ELSE:
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
			case COMMON:
			case PARTITION:
			case ACTIVE:
			case ASM:
			case CLASS:
			case UNION:
			case ENUM:
			case TYPEDEF:
			case TEMPLATE:
			case THIS:
			case RESOURCE:
			case GOTO:
			case INLINE:
			case NOINLINE:
			case PUBLIC:
			case STATIC:
			case EXTERN:
			case EXTERNAL:
			case INTERFACE:
			case LONG:
			case SHORT:
			case HALF:
			case FIXED:
			case UNSIGNED:
			case SUPERP:
			case INPUT:
			case OUTPUT:
			case HVEC2:
			case HVEC3:
			case HVEC4:
			case FVEC2:
			case FVEC3:
			case FVEC4:
			case SAMPLER3DRECT:
			case FILTER:
			case SIZEOF:
			case CAST:
			case NAMESPACE:
			case USING:
			case PPOP_DEFINED:
			case WHITESPACE:
			case CRLF:
			case HIDDEN_CRLF:
			case LINE_CONTINUATION:
			case MULTILINE_COMMENT:
			case SINGLELINE_COMMENT:
			case BOOLCONSTANT:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case LEFT_OP:
			case RIGHT_OP:
			case INC_OP:
			case DEC_OP:
			case LE_OP:
			case GE_OP:
			case EQ_OP:
			case NE_OP:
			case AND_OP:
			case OR_OP:
			case XOR_OP:
			case MUL_ASSIGN:
			case DIV_ASSIGN:
			case ADD_ASSIGN:
			case MOD_ASSIGN:
			case LEFT_ASSIGN:
			case RIGHT_ASSIGN:
			case AND_ASSIGN:
			case XOR_ASSIGN:
			case OR_ASSIGN:
			case SUB_ASSIGN:
			case LEFT_PAREN:
			case RIGHT_PAREN:
			case LEFT_BRACKET:
			case RIGHT_BRACKET:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case DOT:
			case COMMA:
			case COLON:
			case EQUAL:
			case SEMICOLON:
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
			case STAR:
			case SLASH:
			case PERCENT:
			case LEFT_ANGLE:
			case RIGHT_ANGLE:
			case VERTICAL_BAR:
			case CARET:
			case AMPERSAND:
			case QUESTION:
			case PPOP_CONCAT:
			case DOTS:
			case DOUBLE_QUOTE:
			case SINGLE_QUOTE:
			case CHARACTER_CONSTANT:
			case PREFIXED_CHARACTER_CONSTANT:
			case STRING_LITERAL:
			case PREFIXED_STRING_LITERAL:
			case IDENTIFIER:
			case OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				glslppTextLine();
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppIfSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppIfSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppIfSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIfSectionContext glslppIfSection() throws RecognitionException {
		GlslppIfSectionContext _localctx = new GlslppIfSectionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_glslppIfSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			glslppIfGroup();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PPELIF) {
				{
				setState(920);
				glslppElifGroups();
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PPELSE) {
				{
				setState(923);
				glslppElseGroup();
				}
			}

			setState(926);
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
		public TerminalNode PPIF() { return getToken(GLSLParser.PPIF, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public TerminalNode PPIFDEF() { return getToken(GLSLParser.PPIFDEF, 0); }
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public TerminalNode PPIFNDEF() { return getToken(GLSLParser.PPIFNDEF, 0); }
		public GlslppIfGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIfGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppIfGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppIfGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppIfGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIfGroupContext glslppIfGroup() throws RecognitionException {
		GlslppIfGroupContext _localctx = new GlslppIfGroupContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_glslppIfGroup);
		int _la;
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PPIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(PPIF);
				setState(929);
				glslConstantExpression();
				setState(930);
				match(CRLF);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
					{
					setState(931);
					glslppGroup();
					}
				}

				}
				break;
			case PPIFDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(PPIFDEF);
				setState(935);
				glslppIdentifier();
				setState(936);
				match(CRLF);
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
					{
					setState(937);
					glslppGroup();
					}
				}

				}
				break;
			case PPIFNDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				match(PPIFNDEF);
				setState(941);
				glslppIdentifier();
				setState(942);
				match(CRLF);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
					{
					setState(943);
					glslppGroup();
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppElifGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppElifGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppElifGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppElifGroupsContext glslppElifGroups() throws RecognitionException {
		GlslppElifGroupsContext _localctx = new GlslppElifGroupsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_glslppElifGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(948);
				glslppElifGroup();
				}
				}
				setState(951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PPELIF );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PPELIF() { return getToken(GLSLParser.PPELIF, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public GlslppElifGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppElifGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppElifGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppElifGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppElifGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppElifGroupContext glslppElifGroup() throws RecognitionException {
		GlslppElifGroupContext _localctx = new GlslppElifGroupContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_glslppElifGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(PPELIF);
			setState(954);
			glslConstantExpression();
			setState(955);
			match(CRLF);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
				{
				setState(956);
				glslppGroup();
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

	public static class GlslppElseGroupContext extends ParserRuleContext {
		public TerminalNode PPELSE() { return getToken(GLSLParser.PPELSE, 0); }
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public GlslppElseGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppElseGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppElseGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppElseGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppElseGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppElseGroupContext glslppElseGroup() throws RecognitionException {
		GlslppElseGroupContext _localctx = new GlslppElseGroupContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_glslppElseGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(PPELSE);
			setState(960);
			match(CRLF);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
				{
				setState(961);
				glslppGroup();
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

	public static class GlslppEndifLineContext extends ParserRuleContext {
		public TerminalNode PPENDIF() { return getToken(GLSLParser.PPENDIF, 0); }
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public GlslppEndifLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppEndifLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppEndifLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppEndifLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppEndifLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppEndifLineContext glslppEndifLine() throws RecognitionException {
		GlslppEndifLineContext _localctx = new GlslppEndifLineContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_glslppEndifLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(PPENDIF);
			setState(965);
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
		public TerminalNode PPINCLUDE() { return getToken(GLSLParser.PPINCLUDE, 0); }
		public GlslppHeaderNameContext glslppHeaderName() {
			return getRuleContext(GlslppHeaderNameContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public TerminalNode PPDEFINE() { return getToken(GLSLParser.PPDEFINE, 0); }
		public GlslppMacroContext glslppMacro() {
			return getRuleContext(GlslppMacroContext.class,0);
		}
		public TerminalNode PPUNDEF() { return getToken(GLSLParser.PPUNDEF, 0); }
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public TerminalNode PPLINE() { return getToken(GLSLParser.PPLINE, 0); }
		public GlslppTokensContext glslppTokens() {
			return getRuleContext(GlslppTokensContext.class,0);
		}
		public TerminalNode PPERROR() { return getToken(GLSLParser.PPERROR, 0); }
		public TerminalNode PPPRAGMA() { return getToken(GLSLParser.PPPRAGMA, 0); }
		public TerminalNode PPEXTENSION() { return getToken(GLSLParser.PPEXTENSION, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public GlslppExtensionBehaviourContext glslppExtensionBehaviour() {
			return getRuleContext(GlslppExtensionBehaviourContext.class,0);
		}
		public TerminalNode PPVERSION() { return getToken(GLSLParser.PPVERSION, 0); }
		public GlslIntegerConstantContext glslIntegerConstant() {
			return getRuleContext(GlslIntegerConstantContext.class,0);
		}
		public GlslppProfileContext glslppProfile() {
			return getRuleContext(GlslppProfileContext.class,0);
		}
		public TerminalNode HASH() { return getToken(GLSLParser.HASH, 0); }
		public GlslppNonDirectiveContext glslppNonDirective() {
			return getRuleContext(GlslppNonDirectiveContext.class,0);
		}
		public GlslppControlLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppControlLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppControlLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppControlLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppControlLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppControlLineContext glslppControlLine() throws RecognitionException {
		GlslppControlLineContext _localctx = new GlslppControlLineContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_glslppControlLine);
		int _la;
		try {
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				match(PPINCLUDE);
				setState(968);
				glslppHeaderName();
				setState(969);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(PPDEFINE);
				setState(972);
				glslppMacro();
				setState(973);
				match(CRLF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(975);
				match(PPUNDEF);
				setState(976);
				glslppIdentifier();
				setState(977);
				match(CRLF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				match(PPLINE);
				setState(980);
				glslppTokens();
				setState(981);
				match(CRLF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(983);
				match(PPERROR);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
					{
					setState(984);
					glslppTokens();
					}
				}

				setState(987);
				match(CRLF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(988);
				match(PPPRAGMA);
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
					{
					setState(989);
					glslppTokens();
					}
				}

				setState(992);
				match(CRLF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(993);
				match(PPEXTENSION);
				setState(994);
				glslppIdentifier();
				setState(995);
				match(COLON);
				setState(996);
				glslppExtensionBehaviour();
				setState(997);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(999);
				match(PPVERSION);
				setState(1000);
				glslIntegerConstant();
				setState(1001);
				glslppProfile();
				setState(1002);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1004);
				match(HASH);
				setState(1005);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1006);
				match(HASH);
				setState(1007);
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

	public static class GlslppMacroContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslppReplacementListContext glslppReplacementList() {
			return getRuleContext(GlslppReplacementListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public GlslppMacroArgumentsContext glslppMacroArguments() {
			return getRuleContext(GlslppMacroArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public GlslppMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppMacroContext glslppMacro() throws RecognitionException {
		GlslppMacroContext _localctx = new GlslppMacroContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_glslppMacro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(IDENTIFIER);
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(1011);
				if (!( hidden(WHITESPACE))) throw new FailedPredicateException(this, " hidden(WHITESPACE)");
				setState(1012);
				glslppReplacementList();
				}
				break;
			case 2:
				{
				setState(1013);
				if (!(!hidden(WHITESPACE))) throw new FailedPredicateException(this, "!hidden(WHITESPACE)");
				setState(1014);
				match(LEFT_PAREN);
				setState(1015);
				glslppMacroArguments();
				setState(1016);
				match(RIGHT_PAREN);
				setState(1017);
				glslppReplacementList();
				}
				break;
			case 3:
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

	public static class GlslppMacroArgumentsContext extends ParserRuleContext {
		public GlslppIdentifierListContext glslppIdentifierList() {
			return getRuleContext(GlslppIdentifierListContext.class,0);
		}
		public TerminalNode DOTS() { return getToken(GLSLParser.DOTS, 0); }
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public GlslppMacroArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppMacroArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppMacroArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppMacroArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppMacroArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppMacroArgumentsContext glslppMacroArguments() throws RecognitionException {
		GlslppMacroArgumentsContext _localctx = new GlslppMacroArgumentsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_glslppMacroArguments);
		int _la;
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1022);
					glslppIdentifierList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1025);
					glslppIdentifierList();
					setState(1026);
					match(COMMA);
					}
				}

				setState(1030);
				match(DOTS);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppExtensionBehaviour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppExtensionBehaviour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppExtensionBehaviour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppExtensionBehaviourContext glslppExtensionBehaviour() throws RecognitionException {
		GlslppExtensionBehaviourContext _localctx = new GlslppExtensionBehaviourContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_glslppExtensionBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
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
		public GlslppProfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppProfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppProfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppProfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppProfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppProfileContext glslppProfile() throws RecognitionException {
		GlslppProfileContext _localctx = new GlslppProfileContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_glslppProfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public GlslppIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIdentifierListContext glslppIdentifierList() throws RecognitionException {
		GlslppIdentifierListContext _localctx = new GlslppIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_glslppIdentifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(IDENTIFIER);
			setState(1042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1038);
					match(COMMA);
					setState(1039);
					match(IDENTIFIER);
					}
					} 
				}
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
		public List<TerminalNode> CRLF() { return getTokens(GLSLParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(GLSLParser.CRLF, i);
		}
		public TerminalNode HASH() { return getToken(GLSLParser.HASH, 0); }
		public TerminalNode PPIF() { return getToken(GLSLParser.PPIF, 0); }
		public TerminalNode PPIFDEF() { return getToken(GLSLParser.PPIFDEF, 0); }
		public TerminalNode PPIFNDEF() { return getToken(GLSLParser.PPIFNDEF, 0); }
		public TerminalNode PPELIF() { return getToken(GLSLParser.PPELIF, 0); }
		public TerminalNode PPELSE() { return getToken(GLSLParser.PPELSE, 0); }
		public TerminalNode PPENDIF() { return getToken(GLSLParser.PPENDIF, 0); }
		public TerminalNode PPINCLUDE() { return getToken(GLSLParser.PPINCLUDE, 0); }
		public TerminalNode PPDEFINE() { return getToken(GLSLParser.PPDEFINE, 0); }
		public TerminalNode PPUNDEF() { return getToken(GLSLParser.PPUNDEF, 0); }
		public TerminalNode PPLINE() { return getToken(GLSLParser.PPLINE, 0); }
		public TerminalNode PPERROR() { return getToken(GLSLParser.PPERROR, 0); }
		public TerminalNode PPPRAGMA() { return getToken(GLSLParser.PPPRAGMA, 0); }
		public TerminalNode PPEXTENSION() { return getToken(GLSLParser.PPEXTENSION, 0); }
		public TerminalNode PPVERSION() { return getToken(GLSLParser.PPVERSION, 0); }
		public GlslppTextLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppTextLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppTextLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppTextLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppTextLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppTextLineContext glslppTextLine() throws RecognitionException {
		GlslppTextLineContext _localctx = new GlslppTextLineContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_glslppTextLine);
		int _la;
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE))) != 0) || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0)) {
					{
					{
					setState(1046);
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
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1052);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
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
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public GlslppTokensContext glslppTokens() {
			return getRuleContext(GlslppTokensContext.class,0);
		}
		public GlslppNonDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppNonDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppNonDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppNonDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppNonDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppNonDirectiveContext glslppNonDirective() throws RecognitionException {
		GlslppNonDirectiveContext _localctx = new GlslppNonDirectiveContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_glslppNonDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(1056);
				glslppTokens();
				}
			}

			setState(1059);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppReplacementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppReplacementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppReplacementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppReplacementListContext glslppReplacementList() throws RecognitionException {
		GlslppReplacementListContext _localctx = new GlslppReplacementListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_glslppReplacementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(1061);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppTokensContext glslppTokens() throws RecognitionException {
		GlslppTokensContext _localctx = new GlslppTokensContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_glslppTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1064);
				glslppPreprocessingToken();
				}
				}
				setState(1067); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppPreprocessingToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppPreprocessingToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppPreprocessingToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppPreprocessingTokenContext glslppPreprocessingToken() throws RecognitionException {
		GlslppPreprocessingTokenContext _localctx = new GlslppPreprocessingTokenContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_glslppPreprocessingToken);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				glslppHeaderName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				glslppIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				glslppNumber();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1072);
				glslppCharacterConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1073);
				glslppStringLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1074);
				glslppPunctuator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1075);
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
		public TerminalNode CHARACTER_CONSTANT() { return getToken(GLSLParser.CHARACTER_CONSTANT, 0); }
		public TerminalNode PREFIXED_CHARACTER_CONSTANT() { return getToken(GLSLParser.PREFIXED_CHARACTER_CONSTANT, 0); }
		public GlslppCharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppCharacterConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppCharacterConstantContext glslppCharacterConstant() throws RecognitionException {
		GlslppCharacterConstantContext _localctx = new GlslppCharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_glslppCharacterConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
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
		public TerminalNode STRING_LITERAL() { return getToken(GLSLParser.STRING_LITERAL, 0); }
		public TerminalNode PREFIXED_STRING_LITERAL() { return getToken(GLSLParser.PREFIXED_STRING_LITERAL, 0); }
		public GlslppStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppStringLiteralContext glslppStringLiteral() throws RecognitionException {
		GlslppStringLiteralContext _localctx = new GlslppStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_glslppStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
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
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLParser.LEFT_ANGLE, 0); }
		public List<TerminalNode> RIGHT_ANGLE() { return getTokens(GLSLParser.RIGHT_ANGLE); }
		public TerminalNode RIGHT_ANGLE(int i) {
			return getToken(GLSLParser.RIGHT_ANGLE, i);
		}
		public List<TerminalNode> CRLF() { return getTokens(GLSLParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(GLSLParser.CRLF, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(GLSLParser.STRING_LITERAL, 0); }
		public GlslppHeaderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppHeaderName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppHeaderName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppHeaderName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppHeaderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppHeaderNameContext glslppHeaderName() throws RecognitionException {
		GlslppHeaderNameContext _localctx = new GlslppHeaderNameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_glslppHeaderName);
		int _la;
		try {
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				match(LEFT_ANGLE);
				setState(1084); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1083);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CRLF || _la==RIGHT_ANGLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1086); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PPINCLUDE) | (1L << PPDEFINE) | (1L << PPUNDEF) | (1L << PPIF) | (1L << PPIFDEF) | (1L << PPIFNDEF) | (1L << PPELSE) | (1L << PPELIF) | (1L << PPENDIF) | (1L << PPERROR) | (1L << PPPRAGMA) | (1L << PPEXTENSION) | (1L << PPVERSION) | (1L << PPLINE) | (1L << PPBUILTIN_LINE) | (1L << PPBUILTIN_FILE) | (1L << PPBUILTIN_VERSION) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRECISE - 64)) | (1L << (DISCARD - 64)) | (1L << (RETURN - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT4 - 64)) | (1L << (DMAT2 - 64)) | (1L << (DMAT3 - 64)) | (1L << (DMAT4 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (DMAT2X2 - 64)) | (1L << (DMAT2X3 - 64)) | (1L << (DMAT2X4 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (USAMPLER1D - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (SAMPLER2DRECT - 128)) | (1L << (SAMPLER2DRECTSHADOW - 128)) | (1L << (ISAMPLER2DRECT - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (SAMPLERBUFFER - 128)) | (1L << (ISAMPLERBUFFER - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (SAMPLER2DMS - 128)) | (1L << (ISAMPLER2DMS - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (SAMPLER2DMSARRAY - 128)) | (1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (ENUM - 192)) | (1L << (TYPEDEF - 192)) | (1L << (TEMPLATE - 192)) | (1L << (THIS - 192)) | (1L << (RESOURCE - 192)) | (1L << (GOTO - 192)) | (1L << (INLINE - 192)) | (1L << (NOINLINE - 192)) | (1L << (PUBLIC - 192)) | (1L << (STATIC - 192)) | (1L << (EXTERN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (INTERFACE - 192)) | (1L << (LONG - 192)) | (1L << (SHORT - 192)) | (1L << (HALF - 192)) | (1L << (FIXED - 192)) | (1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OR_ASSIGN - 256)) | (1L << (SUB_ASSIGN - 256)) | (1L << (LEFT_PAREN - 256)) | (1L << (RIGHT_PAREN - 256)) | (1L << (LEFT_BRACKET - 256)) | (1L << (RIGHT_BRACKET - 256)) | (1L << (LEFT_BRACE - 256)) | (1L << (RIGHT_BRACE - 256)) | (1L << (DOT - 256)) | (1L << (COMMA - 256)) | (1L << (COLON - 256)) | (1L << (EQUAL - 256)) | (1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (CHARACTER_CONSTANT - 256)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (PREFIXED_STRING_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (OTHER - 256)))) != 0) );
				setState(1088);
				match(RIGHT_ANGLE);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				match(STRING_LITERAL);
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

	public static class GlslppIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public GlslppIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppIdentifierContext glslppIdentifier() throws RecognitionException {
		GlslppIdentifierContext _localctx = new GlslppIdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_glslppIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
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
		public GlslIntegerConstantContext glslIntegerConstant() {
			return getRuleContext(GlslIntegerConstantContext.class,0);
		}
		public GlslUnsignedIntegerConstantContext glslUnsignedIntegerConstant() {
			return getRuleContext(GlslUnsignedIntegerConstantContext.class,0);
		}
		public GlslDoubleConstantContext glslDoubleConstant() {
			return getRuleContext(GlslDoubleConstantContext.class,0);
		}
		public GlslFloatConstantContext glslFloatConstant() {
			return getRuleContext(GlslFloatConstantContext.class,0);
		}
		public GlslppNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppNumberContext glslppNumber() throws RecognitionException {
		GlslppNumberContext _localctx = new GlslppNumberContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_glslppNumber);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				glslUnsignedIntegerConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				glslDoubleConstant();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1097);
				glslFloatConstant();
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

	public static class GlslppSignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GLSLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLParser.DASH, 0); }
		public GlslppSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppSignContext glslppSign() throws RecognitionException {
		GlslppSignContext _localctx = new GlslppSignContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_glslppSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(1100);
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
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public TerminalNode AMPERSAND() { return getToken(GLSLParser.AMPERSAND, 0); }
		public TerminalNode STAR() { return getToken(GLSLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(GLSLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLParser.DASH, 0); }
		public TerminalNode TILDE() { return getToken(GLSLParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(GLSLParser.BANG, 0); }
		public TerminalNode SLASH() { return getToken(GLSLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GLSLParser.PERCENT, 0); }
		public TerminalNode LEFT_OP() { return getToken(GLSLParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLParser.RIGHT_OP, 0); }
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(GLSLParser.RIGHT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLParser.GE_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(GLSLParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLParser.NE_OP, 0); }
		public TerminalNode CARET() { return getToken(GLSLParser.CARET, 0); }
		public TerminalNode VERTICAL_BAR() { return getToken(GLSLParser.VERTICAL_BAR, 0); }
		public TerminalNode AND_OP() { return getToken(GLSLParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(GLSLParser.OR_OP, 0); }
		public TerminalNode QUESTION() { return getToken(GLSLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode DOTS() { return getToken(GLSLParser.DOTS, 0); }
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
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public TerminalNode HASH() { return getToken(GLSLParser.HASH, 0); }
		public TerminalNode PPOP_CONCAT() { return getToken(GLSLParser.PPOP_CONCAT, 0); }
		public GlslppPunctuatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppPunctuator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppPunctuator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppPunctuator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppPunctuator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppPunctuatorContext glslppPunctuator() throws RecognitionException {
		GlslppPunctuatorContext _localctx = new GlslppPunctuatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_glslppPunctuator);
		try {
			setState(1150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				match(LEFT_BRACKET);
				}
				break;
			case RIGHT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				match(RIGHT_BRACKET);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				match(LEFT_PAREN);
				}
				break;
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1106);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1107);
				match(LEFT_BRACE);
				}
				break;
			case RIGHT_BRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1108);
				match(RIGHT_BRACE);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1109);
				match(DOT);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 8);
				{
				setState(1110);
				match(INC_OP);
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1111);
				match(DEC_OP);
				}
				break;
			case AMPERSAND:
				enterOuterAlt(_localctx, 10);
				{
				setState(1112);
				match(AMPERSAND);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(1113);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(1114);
				match(PLUS);
				}
				break;
			case DASH:
				enterOuterAlt(_localctx, 13);
				{
				setState(1115);
				match(DASH);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1116);
				match(TILDE);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 15);
				{
				setState(1117);
				match(BANG);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 16);
				{
				setState(1118);
				match(SLASH);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 17);
				{
				setState(1119);
				match(PERCENT);
				}
				break;
			case LEFT_OP:
				enterOuterAlt(_localctx, 18);
				{
				setState(1120);
				match(LEFT_OP);
				}
				break;
			case RIGHT_OP:
				enterOuterAlt(_localctx, 19);
				{
				setState(1121);
				match(RIGHT_OP);
				}
				break;
			case LEFT_ANGLE:
				enterOuterAlt(_localctx, 20);
				{
				setState(1122);
				match(LEFT_ANGLE);
				setState(1123);
				match(RIGHT_ANGLE);
				}
				break;
			case LE_OP:
				enterOuterAlt(_localctx, 21);
				{
				setState(1124);
				match(LE_OP);
				}
				break;
			case GE_OP:
				enterOuterAlt(_localctx, 22);
				{
				setState(1125);
				match(GE_OP);
				}
				break;
			case EQ_OP:
				enterOuterAlt(_localctx, 23);
				{
				setState(1126);
				match(EQ_OP);
				}
				break;
			case NE_OP:
				enterOuterAlt(_localctx, 24);
				{
				setState(1127);
				match(NE_OP);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 25);
				{
				setState(1128);
				match(CARET);
				}
				break;
			case VERTICAL_BAR:
				enterOuterAlt(_localctx, 26);
				{
				setState(1129);
				match(VERTICAL_BAR);
				}
				break;
			case AND_OP:
				enterOuterAlt(_localctx, 27);
				{
				setState(1130);
				match(AND_OP);
				}
				break;
			case OR_OP:
				enterOuterAlt(_localctx, 28);
				{
				setState(1131);
				match(OR_OP);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 29);
				{
				setState(1132);
				match(QUESTION);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 30);
				{
				setState(1133);
				match(COLON);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 31);
				{
				setState(1134);
				match(SEMICOLON);
				}
				break;
			case DOTS:
				enterOuterAlt(_localctx, 32);
				{
				setState(1135);
				match(DOTS);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 33);
				{
				setState(1136);
				match(EQUAL);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 34);
				{
				setState(1137);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 35);
				{
				setState(1138);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 36);
				{
				setState(1139);
				match(MOD_ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 37);
				{
				setState(1140);
				match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 38);
				{
				setState(1141);
				match(SUB_ASSIGN);
				}
				break;
			case LEFT_ASSIGN:
				enterOuterAlt(_localctx, 39);
				{
				setState(1142);
				match(LEFT_ASSIGN);
				}
				break;
			case RIGHT_ASSIGN:
				enterOuterAlt(_localctx, 40);
				{
				setState(1143);
				match(RIGHT_ASSIGN);
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 41);
				{
				setState(1144);
				match(AND_ASSIGN);
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 42);
				{
				setState(1145);
				match(XOR_ASSIGN);
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 43);
				{
				setState(1146);
				match(OR_ASSIGN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 44);
				{
				setState(1147);
				match(COMMA);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 45);
				{
				setState(1148);
				match(HASH);
				}
				break;
			case PPOP_CONCAT:
				enterOuterAlt(_localctx, 46);
				{
				setState(1149);
				match(PPOP_CONCAT);
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
		public TerminalNode STRING_LITERAL() { return getToken(GLSLParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode INTCONSTANT() { return getToken(GLSLParser.INTCONSTANT, 0); }
		public TerminalNode UINTCONSTANT() { return getToken(GLSLParser.UINTCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(GLSLParser.DOUBLECONSTANT, 0); }
		public TerminalNode FLOATCONSTANT() { return getToken(GLSLParser.FLOATCONSTANT, 0); }
		public TerminalNode CHARACTER_CONSTANT() { return getToken(GLSLParser.CHARACTER_CONSTANT, 0); }
		public TerminalNode PREFIXED_CHARACTER_CONSTANT() { return getToken(GLSLParser.PREFIXED_CHARACTER_CONSTANT, 0); }
		public TerminalNode PREFIXED_STRING_LITERAL() { return getToken(GLSLParser.PREFIXED_STRING_LITERAL, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public TerminalNode AMPERSAND() { return getToken(GLSLParser.AMPERSAND, 0); }
		public TerminalNode STAR() { return getToken(GLSLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(GLSLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GLSLParser.DASH, 0); }
		public TerminalNode TILDE() { return getToken(GLSLParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(GLSLParser.BANG, 0); }
		public TerminalNode SLASH() { return getToken(GLSLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GLSLParser.PERCENT, 0); }
		public TerminalNode LEFT_OP() { return getToken(GLSLParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLParser.RIGHT_OP, 0); }
		public TerminalNode LEFT_ANGLE() { return getToken(GLSLParser.LEFT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLParser.GE_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(GLSLParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLParser.NE_OP, 0); }
		public TerminalNode CARET() { return getToken(GLSLParser.CARET, 0); }
		public TerminalNode VERTICAL_BAR() { return getToken(GLSLParser.VERTICAL_BAR, 0); }
		public TerminalNode AND_OP() { return getToken(GLSLParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(GLSLParser.OR_OP, 0); }
		public TerminalNode QUESTION() { return getToken(GLSLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode DOTS() { return getToken(GLSLParser.DOTS, 0); }
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
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public TerminalNode WHITESPACE() { return getToken(GLSLParser.WHITESPACE, 0); }
		public TerminalNode CRLF() { return getToken(GLSLParser.CRLF, 0); }
		public TerminalNode HASH() { return getToken(GLSLParser.HASH, 0); }
		public TerminalNode PPOP_CONCAT() { return getToken(GLSLParser.PPOP_CONCAT, 0); }
		public TerminalNode OTHER() { return getToken(GLSLParser.OTHER, 0); }
		public GlslppUnspecifiedTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppUnspecifiedToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterGlslppUnspecifiedToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitGlslppUnspecifiedToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitGlslppUnspecifiedToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppUnspecifiedTokenContext glslppUnspecifiedToken() throws RecognitionException {
		GlslppUnspecifiedTokenContext _localctx = new GlslppUnspecifiedTokenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_glslppUnspecifiedToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (WHITESPACE - 226)) | (1L << (CRLF - 226)) | (1L << (FLOATCONSTANT - 226)) | (1L << (DOUBLECONSTANT - 226)) | (1L << (INTCONSTANT - 226)) | (1L << (UINTCONSTANT - 226)) | (1L << (LEFT_OP - 226)) | (1L << (RIGHT_OP - 226)) | (1L << (INC_OP - 226)) | (1L << (DEC_OP - 226)) | (1L << (LE_OP - 226)) | (1L << (GE_OP - 226)) | (1L << (EQ_OP - 226)) | (1L << (NE_OP - 226)) | (1L << (AND_OP - 226)) | (1L << (OR_OP - 226)) | (1L << (MUL_ASSIGN - 226)) | (1L << (DIV_ASSIGN - 226)) | (1L << (ADD_ASSIGN - 226)) | (1L << (MOD_ASSIGN - 226)) | (1L << (LEFT_ASSIGN - 226)) | (1L << (RIGHT_ASSIGN - 226)) | (1L << (AND_ASSIGN - 226)) | (1L << (XOR_ASSIGN - 226)) | (1L << (OR_ASSIGN - 226)) | (1L << (SUB_ASSIGN - 226)) | (1L << (LEFT_PAREN - 226)) | (1L << (RIGHT_PAREN - 226)) | (1L << (LEFT_BRACKET - 226)) | (1L << (RIGHT_BRACKET - 226)) | (1L << (LEFT_BRACE - 226)) | (1L << (RIGHT_BRACE - 226)) | (1L << (DOT - 226)) | (1L << (COMMA - 226)) | (1L << (COLON - 226)) | (1L << (EQUAL - 226)) | (1L << (SEMICOLON - 226)) | (1L << (BANG - 226)) | (1L << (DASH - 226)) | (1L << (TILDE - 226)) | (1L << (PLUS - 226)) | (1L << (STAR - 226)) | (1L << (SLASH - 226)) | (1L << (PERCENT - 226)) | (1L << (LEFT_ANGLE - 226)) | (1L << (VERTICAL_BAR - 226)) | (1L << (CARET - 226)) | (1L << (AMPERSAND - 226)) | (1L << (QUESTION - 226)) | (1L << (HASH - 226)) | (1L << (PPOP_CONCAT - 226)) | (1L << (DOTS - 226)) | (1L << (CHARACTER_CONSTANT - 226)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 226)) | (1L << (STRING_LITERAL - 226)))) != 0) || ((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (PREFIXED_STRING_LITERAL - 290)) | (1L << (IDENTIFIER - 290)) | (1L << (OTHER - 290)))) != 0)) ) {
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
		case 92:
			return glslppMacro_sempred((GlslppMacroContext)_localctx, predIndex);
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
	private boolean glslppMacro_sempred(GlslppMacroContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return  hidden(WHITESPACE);
		case 25:
			return !hidden(WHITESPACE);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0126\u0485\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\6\3\u00eb\n\3\r\3\16\3\u00ec\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u00f6"+
		"\n\3\r\3\16\3\u00f7\3\3\5\3\u00fb\n\3\3\3\3\3\3\3\7\3\u0100\n\3\f\3\16"+
		"\3\u0103\13\3\3\3\5\3\u0106\n\3\3\3\3\3\3\3\7\3\u010b\n\3\f\3\16\3\u010e"+
		"\13\3\3\3\5\3\u0111\n\3\3\3\3\3\5\3\u0115\n\3\3\3\3\3\3\3\7\3\u011a\n"+
		"\3\f\3\16\3\u011d\13\3\5\3\u011f\n\3\3\3\5\3\u0122\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u012e\n\6\f\6\16\6\u0131\13\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\5\b\u013b\n\b\3\b\3\b\3\t\3\t\3\t\7\t\u0142\n\t\f"+
		"\t\16\t\u0145\13\t\3\n\5\n\u0148\n\n\3\n\3\n\3\n\7\n\u014d\n\n\f\n\16"+
		"\n\u0150\13\n\5\n\u0152\n\n\3\13\3\13\7\13\u0156\n\13\f\13\16\13\u0159"+
		"\13\13\3\13\3\13\5\13\u015d\n\13\3\f\5\f\u0160\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0169\n\r\f\r\16\r\u016c\13\r\3\r\5\r\u016f\n\r\3\r\3\r\5"+
		"\r\u0173\n\r\3\16\3\16\5\16\u0177\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0181\n\17\3\20\3\20\7\20\u0185\n\20\f\20\16\20\u0188\13"+
		"\20\3\20\3\20\3\21\5\21\u018d\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u019f\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01a9\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u01b1\n\24\f\24\16\24\u01b4\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u01bf\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u01c7\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\5\31\u01da\n\31\3\31\3\31\5\31\u01de\n\31\3"+
		"\31\3\31\5\31\u01e2\n\31\3\31\3\31\3\31\3\32\3\32\5\32\u01e9\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01f1\n\33\3\33\3\33\3\33\5\33\u01f6\n"+
		"\33\3\34\7\34\u01f9\n\34\f\34\16\34\u01fc\13\34\3\35\3\35\5\35\u0200\n"+
		"\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0225\n)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0235\n*\f*\16*\u0238\13*\3+"+
		"\3+\3+\3+\7+\u023e\n+\f+\16+\u0241\13+\3+\3+\3+\3+\5+\u0247\n+\3+\5+\u024a"+
		"\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0258\n-\5-\u025a\n-\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u026a\n/\f/\16/\u026d\13/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0278\n\60\f\60\16\60\u027b"+
		"\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0286\n\61\f"+
		"\61\16\61\u0289\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u029a\n\62\f\62\16\62\u029d\13\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u02a8\n\63\f\63\16\63\u02ab"+
		"\13\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u02b3\n\64\f\64\16\64\u02b6"+
		"\13\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u02be\n\65\f\65\16\65\u02c1"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02c9\n\66\f\66\16\66\u02cc"+
		"\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02d4\n\67\f\67\16\67\u02d7"+
		"\13\67\38\38\38\38\38\38\78\u02df\n8\f8\168\u02e2\138\39\39\39\39\39\3"+
		"9\79\u02ea\n9\f9\169\u02ed\139\3:\3:\3:\3:\3:\3:\3:\5:\u02f6\n:\3;\3;"+
		"\3;\3;\3;\5;\u02fd\n;\3<\3<\3=\3=\3=\7=\u0304\n=\f=\16=\u0307\13=\3>\3"+
		">\3?\3?\3?\7?\u030e\n?\f?\16?\u0311\13?\3@\3@\7@\u0315\n@\f@\16@\u0318"+
		"\13@\3A\3A\5A\u031c\nA\3A\3A\3B\3B\3B\5B\u0323\nB\3C\3C\3D\3D\3D\3D\3"+
		"E\3E\6E\u032d\nE\rE\16E\u032e\3E\3E\3F\5F\u0334\nF\3F\3F\3F\3F\3G\3G\3"+
		"G\7G\u033d\nG\fG\16G\u0340\13G\3H\3H\7H\u0344\nH\fH\16H\u0347\13H\3I\6"+
		"I\u034a\nI\rI\16I\u034b\3J\3J\3J\3J\3J\3J\5J\u0354\nJ\3K\3K\3L\3L\3M\3"+
		"M\3M\3M\3M\3N\3N\3N\7N\u0362\nN\fN\16N\u0365\13N\3O\3O\3O\3O\3O\5O\u036c"+
		"\nO\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\5Q\u0387\nQ\3R\3R\3S\3S\3T\5T\u038e\nT\3U\6U\u0391\nU\rU\16"+
		"U\u0392\3V\3V\3V\5V\u0398\nV\3W\3W\5W\u039c\nW\3W\5W\u039f\nW\3W\3W\3"+
		"X\3X\3X\3X\5X\u03a7\nX\3X\3X\3X\3X\5X\u03ad\nX\3X\3X\3X\3X\5X\u03b3\n"+
		"X\5X\u03b5\nX\3Y\6Y\u03b8\nY\rY\16Y\u03b9\3Z\3Z\3Z\3Z\5Z\u03c0\nZ\3[\3"+
		"[\3[\5[\u03c5\n[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\5]\u03dc\n]\3]\3]\3]\5]\u03e1\n]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u03f3\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5"+
		"^\u03ff\n^\3_\5_\u0402\n_\3_\3_\3_\5_\u0407\n_\3_\5_\u040a\n_\3`\3`\3"+
		"a\3a\3b\3b\3b\7b\u0413\nb\fb\16b\u0416\13b\3c\3c\7c\u041a\nc\fc\16c\u041d"+
		"\13c\3c\3c\5c\u0421\nc\3d\5d\u0424\nd\3d\3d\3e\5e\u0429\ne\3f\6f\u042c"+
		"\nf\rf\16f\u042d\3g\3g\3g\3g\3g\3g\3g\5g\u0437\ng\3h\3h\3i\3i\3j\3j\6"+
		"j\u043f\nj\rj\16j\u0440\3j\3j\5j\u0445\nj\3k\3k\3l\3l\3l\3l\5l\u044d\n"+
		"l\3m\5m\u0450\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\3n\3n\3n\5n\u0481\nn\3o\3o\3o\2\16R\\^`bdfhjlnpp\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\2\20\4\2\u00f1\u00f2\u010f\u0112\4\2\u00fa\u0103\u010d\u010d"+
		"\6\2&&<@Elq\u00ba\3\2)+\3\2mo\3\2\3\6\3\2\7\t\4\2\n\27\u011c\u011c\3\2"+
		"\u00e5\u00e5\3\2\u0121\u0122\3\2\u0123\u0124\4\2\u00e5\u00e5\u0117\u0117"+
		"\4\2\u0110\u0110\u0112\u0112\7\2\u00e4\u00e5\u00eb\u00f8\u00fa\u0116\u0118"+
		"\u011e\u0121\u0126\2\u0500\2\u00de\3\2\2\2\4\u0121\3\2\2\2\6\u0123\3\2"+
		"\2\2\b\u0126\3\2\2\2\n\u012a\3\2\2\2\f\u0132\3\2\2\2\16\u0136\3\2\2\2"+
		"\20\u013e\3\2\2\2\22\u0147\3\2\2\2\24\u0153\3\2\2\2\26\u015f\3\2\2\2\30"+
		"\u0172\3\2\2\2\32\u0176\3\2\2\2\34\u0180\3\2\2\2\36\u0182\3\2\2\2 \u018c"+
		"\3\2\2\2\"\u019e\3\2\2\2$\u01a8\3\2\2\2&\u01aa\3\2\2\2(\u01be\3\2\2\2"+
		"*\u01c6\3\2\2\2,\u01c8\3\2\2\2.\u01ce\3\2\2\2\60\u01d6\3\2\2\2\62\u01e8"+
		"\3\2\2\2\64\u01f5\3\2\2\2\66\u01fa\3\2\2\28\u01ff\3\2\2\2:\u0201\3\2\2"+
		"\2<\u0204\3\2\2\2>\u0206\3\2\2\2@\u0208\3\2\2\2B\u020a\3\2\2\2D\u020c"+
		"\3\2\2\2F\u020e\3\2\2\2H\u0210\3\2\2\2J\u0212\3\2\2\2L\u0214\3\2\2\2N"+
		"\u0216\3\2\2\2P\u0224\3\2\2\2R\u0226\3\2\2\2T\u0249\3\2\2\2V\u024b\3\2"+
		"\2\2X\u0259\3\2\2\2Z\u025b\3\2\2\2\\\u025d\3\2\2\2^\u026e\3\2\2\2`\u027c"+
		"\3\2\2\2b\u028a\3\2\2\2d\u029e\3\2\2\2f\u02ac\3\2\2\2h\u02b7\3\2\2\2j"+
		"\u02c2\3\2\2\2l\u02cd\3\2\2\2n\u02d8\3\2\2\2p\u02e3\3\2\2\2r\u02f5\3\2"+
		"\2\2t\u02fc\3\2\2\2v\u02fe\3\2\2\2x\u0300\3\2\2\2z\u0308\3\2\2\2|\u030a"+
		"\3\2\2\2~\u0312\3\2\2\2\u0080\u0319\3\2\2\2\u0082\u0322\3\2\2\2\u0084"+
		"\u0324\3\2\2\2\u0086\u0326\3\2\2\2\u0088\u032a\3\2\2\2\u008a\u0333\3\2"+
		"\2\2\u008c\u0339\3\2\2\2\u008e\u0341\3\2\2\2\u0090\u0349\3\2\2\2\u0092"+
		"\u0353\3\2\2\2\u0094\u0355\3\2\2\2\u0096\u0357\3\2\2\2\u0098\u0359\3\2"+
		"\2\2\u009a\u035e\3\2\2\2\u009c\u036b\3\2\2\2\u009e\u036d\3\2\2\2\u00a0"+
		"\u0386\3\2\2\2\u00a2\u0388\3\2\2\2\u00a4\u038a\3\2\2\2\u00a6\u038d\3\2"+
		"\2\2\u00a8\u0390\3\2\2\2\u00aa\u0397\3\2\2\2\u00ac\u0399\3\2\2\2\u00ae"+
		"\u03b4\3\2\2\2\u00b0\u03b7\3\2\2\2\u00b2\u03bb\3\2\2\2\u00b4\u03c1\3\2"+
		"\2\2\u00b6\u03c6\3\2\2\2\u00b8\u03f2\3\2\2\2\u00ba\u03f4\3\2\2\2\u00bc"+
		"\u0409\3\2\2\2\u00be\u040b\3\2\2\2\u00c0\u040d\3\2\2\2\u00c2\u040f\3\2"+
		"\2\2\u00c4\u0420\3\2\2\2\u00c6\u0423\3\2\2\2\u00c8\u0428\3\2\2\2\u00ca"+
		"\u042b\3\2\2\2\u00cc\u0436\3\2\2\2\u00ce\u0438\3\2\2\2\u00d0\u043a\3\2"+
		"\2\2\u00d2\u0444\3\2\2\2\u00d4\u0446\3\2\2\2\u00d6\u044c\3\2\2\2\u00d8"+
		"\u044f\3\2\2\2\u00da\u0480\3\2\2\2\u00dc\u0482\3\2\2\2\u00de\u00df\5\66"+
		"\34\2\u00df\u00e0\7\2\2\3\u00e0\3\3\2\2\2\u00e1\u0122\5\u0090I\2\u00e2"+
		"\u0122\5\b\5\2\u00e3\u00e4\5\u0090I\2\u00e4\u00e5\5> \2\u00e5\u0122\3"+
		"\2\2\2\u00e6\u00e7\5\u0090I\2\u00e7\u00ea\5B\"\2\u00e8\u00e9\7\u010b\2"+
		"\2\u00e9\u00eb\5B\"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u0122\3\2\2\2\u00ee\u00ef\5\u0090I"+
		"\2\u00ef\u00f0\5@!\2\u00f0\u00f1\5\n\6\2\u00f1\u0122\3\2\2\2\u00f2\u00f3"+
		"\5\u0090I\2\u00f3\u00f5\5@!\2\u00f4\u00f6\5\u0080A\2\u00f5\u00f4\3\2\2"+
		"\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00fb\5\n\6\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u0122\3\2\2\2\u00fc\u00fd\5\u0090I\2\u00fd\u0101\5\u0084C\2\u00fe\u0100"+
		"\5\u0080A\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106"+
		"\5\n\6\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0122\3\2\2\2\u0107"+
		"\u0108\5\u0090I\2\u0108\u010c\5\u0086D\2\u0109\u010b\5\u0080A\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\5\n\6\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0122\3\2\2\2\u0112\u0114\5~"+
		"@\2\u0113\u0115\5\n\6\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0122\3\2\2\2\u0116\u011e\5\f\7\2\u0117\u011b\5B\"\2\u0118\u011a\5\u0080"+
		"A\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0117\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u0122\5\16\b\2\u0121"+
		"\u00e1\3\2\2\2\u0121\u00e2\3\2\2\2\u0121\u00e3\3\2\2\2\u0121\u00e6\3\2"+
		"\2\2\u0121\u00ee\3\2\2\2\u0121\u00f2\3\2\2\2\u0121\u00fc\3\2\2\2\u0121"+
		"\u0107\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0116\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\5\3\2\2\2\u0123\u0124\5\4\3\2\u0124\u0125\7\u010e\2\2\u0125"+
		"\7\3\2\2\2\u0126\u0127\7p\2\2\u0127\u0128\5\u00a2R\2\u0128\u0129\5~@\2"+
		"\u0129\t\3\2\2\2\u012a\u012f\5\24\13\2\u012b\u012c\7\u010b\2\2\u012c\u012e"+
		"\5\24\13\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\13\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133"+
		"\5\u0090I\2\u0133\u0134\7\u0125\2\2\u0134\u0135\5\u0088E\2\u0135\r\3\2"+
		"\2\2\u0136\u0137\5\26\f\2\u0137\u0138\5D#\2\u0138\u013a\7\u0104\2\2\u0139"+
		"\u013b\5\20\t\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3"+
		"\2\2\2\u013c\u013d\7\u0105\2\2\u013d\17\3\2\2\2\u013e\u0143\5\22\n\2\u013f"+
		"\u0140\7\u010b\2\2\u0140\u0142\5\22\n\2\u0141\u013f\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\21\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0148\5\u0090I\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0151\5~@\2\u014a\u014e\5B\"\2\u014b"+
		"\u014d\5\u0080A\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u014a\3\2\2\2\u0151\u0152\3\2\2\2\u0152\23\3\2\2\2\u0153\u0157\5B\"\2"+
		"\u0154\u0156\5\u0080A\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015b\7\u010d\2\2\u015b\u015d\5\30\r\2\u015c\u015a\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\25\3\2\2\2\u015e\u0160\5\u0090I\2\u015f\u015e"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5~@\2\u0162"+
		"\27\3\2\2\2\u0163\u0173\5t;\2\u0164\u0165\7\u0108\2\2\u0165\u016a\5\30"+
		"\r\2\u0166\u0167\7\u010b\2\2\u0167\u0169\5\30\r\2\u0168\u0166\3\2\2\2"+
		"\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\7\u010b\2\2\u016e\u016d\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\u0109\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0163\3\2\2\2\u0172\u0164\3\2\2\2\u0173\31\3\2\2"+
		"\2\u0174\u0177\5\36\20\2\u0175\u0177\5\34\17\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\33\3\2\2\2\u0178\u0181\5\6\4\2\u0179\u0181\5 \21"+
		"\2\u017a\u0181\5\"\22\2\u017b\u0181\5&\24\2\u017c\u0181\5,\27\2\u017d"+
		"\u0181\5.\30\2\u017e\u0181\5\60\31\2\u017f\u0181\5\64\33\2\u0180\u0178"+
		"\3\2\2\2\u0180\u0179\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017b\3\2\2\2\u0180"+
		"\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2"+
		"\2\2\u0181\35\3\2\2\2\u0182\u0186\7\u0108\2\2\u0183\u0185\5\32\16\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\u0109\2\2\u018a"+
		"\37\3\2\2\2\u018b\u018d\5x=\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u018f\7\u010e\2\2\u018f!\3\2\2\2\u0190\u0191"+
		"\7\66\2\2\u0191\u0192\7\u0104\2\2\u0192\u0193\5*\26\2\u0193\u0194\7\u0105"+
		"\2\2\u0194\u0195\5\32\16\2\u0195\u019f\3\2\2\2\u0196\u0197\7\66\2\2\u0197"+
		"\u0198\7\u0104\2\2\u0198\u0199\5*\26\2\u0199\u019a\7\u0105\2\2\u019a\u019b"+
		"\5$\23\2\u019b\u019c\7\67\2\2\u019c\u019d\5\32\16\2\u019d\u019f\3\2\2"+
		"\2\u019e\u0190\3\2\2\2\u019e\u0196\3\2\2\2\u019f#\3\2\2\2\u01a0\u01a9"+
		"\5\36\20\2\u01a1\u01a9\5\6\4\2\u01a2\u01a9\5 \21\2\u01a3\u01a9\5&\24\2"+
		"\u01a4\u01a9\5,\27\2\u01a5\u01a9\5.\30\2\u01a6\u01a9\5\60\31\2\u01a7\u01a9"+
		"\5\64\33\2\u01a8\u01a0\3\2\2\2\u01a8\u01a1\3\2\2\2\u01a8\u01a2\3\2\2\2"+
		"\u01a8\u01a3\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9%\3\2\2\2\u01aa\u01ab\7\63\2\2\u01ab"+
		"\u01ac\7\u0104\2\2\u01ac\u01ad\5*\26\2\u01ad\u01ae\7\u0105\2\2\u01ae\u01b2"+
		"\7\u0108\2\2\u01af\u01b1\5(\25\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2"+
		"\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b5\u01b6\7\u0109\2\2\u01b6\'\3\2\2\2\u01b7\u01b8\7\64\2\2"+
		"\u01b8\u01b9\5V,\2\u01b9\u01ba\7\u010c\2\2\u01ba\u01bf\3\2\2\2\u01bb\u01bc"+
		"\7\65\2\2\u01bc\u01bf\7\u010c\2\2\u01bd\u01bf\5\32\16\2\u01be\u01b7\3"+
		"\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf)\3\2\2\2\u01c0\u01c7"+
		"\5x=\2\u01c1\u01c2\5\26\f\2\u01c2\u01c3\5B\"\2\u01c3\u01c4\7\u010d\2\2"+
		"\u01c4\u01c5\5\30\r\2\u01c5\u01c7\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1"+
		"\3\2\2\2\u01c7+\3\2\2\2\u01c8\u01c9\7\62\2\2\u01c9\u01ca\7\u0104\2\2\u01ca"+
		"\u01cb\5*\26\2\u01cb\u01cc\7\u0105\2\2\u01cc\u01cd\5\32\16\2\u01cd-\3"+
		"\2\2\2\u01ce\u01cf\7\60\2\2\u01cf\u01d0\5\32\16\2\u01d0\u01d1\7\62\2\2"+
		"\u01d1\u01d2\7\u0104\2\2\u01d2\u01d3\5x=\2\u01d3\u01d4\7\u0105\2\2\u01d4"+
		"\u01d5\7\u010e\2\2\u01d5/\3\2\2\2\u01d6\u01d7\7\61\2\2\u01d7\u01d9\7\u0104"+
		"\2\2\u01d8\u01da\5\62\32\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dd\7\u010e\2\2\u01dc\u01de\5*\26\2\u01dd\u01dc"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\7\u010e\2"+
		"\2\u01e0\u01e2\5x=\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e4\7\u0105\2\2\u01e4\u01e5\5\32\16\2\u01e5\61\3\2\2"+
		"\2\u01e6\u01e9\5x=\2\u01e7\u01e9\5\4\3\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\63\3\2\2\2\u01ea\u01eb\7/\2\2\u01eb\u01f6\7\u010e\2\2\u01ec"+
		"\u01ed\7.\2\2\u01ed\u01f6\7\u010e\2\2\u01ee\u01f0\7D\2\2\u01ef\u01f1\5"+
		"x=\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f6\7\u010e\2\2\u01f3\u01f4\7C\2\2\u01f4\u01f6\7\u010e\2\2\u01f5\u01ea"+
		"\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\65\3\2\2\2\u01f7\u01f9\58\35\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2"+
		"\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\67\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u0200\5:\36\2\u01fe\u0200\5\6\4\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u02009\3\2\2\2\u0201\u0202\5\16\b\2\u0202\u0203\5\36\20"+
		"\2\u0203;\3\2\2\2\u0204\u0205\7\u0125\2\2\u0205=\3\2\2\2\u0206\u0207\7"+
		"\u0125\2\2\u0207?\3\2\2\2\u0208\u0209\7\u0125\2\2\u0209A\3\2\2\2\u020a"+
		"\u020b\7\u0125\2\2\u020bC\3\2\2\2\u020c\u020d\7\u0125\2\2\u020dE\3\2\2"+
		"\2\u020e\u020f\7\u00ea\2\2\u020fG\3\2\2\2\u0210\u0211\7\u00ed\2\2\u0211"+
		"I\3\2\2\2\u0212\u0213\7\u00ee\2\2\u0213K\3\2\2\2\u0214\u0215\7\u00eb\2"+
		"\2\u0215M\3\2\2\2\u0216\u0217\7\u00ec\2\2\u0217O\3\2\2\2\u0218\u0225\5"+
		"> \2\u0219\u0225\5\u0084C\2\u021a\u0225\5\u0086D\2\u021b\u0225\5L\'\2"+
		"\u021c\u0225\5N(\2\u021d\u0225\5H%\2\u021e\u0225\5J&\2\u021f\u0225\5F"+
		"$\2\u0220\u0221\7\u0104\2\2\u0221\u0222\5x=\2\u0222\u0223\7\u0105\2\2"+
		"\u0223\u0225\3\2\2\2\u0224\u0218\3\2\2\2\u0224\u0219\3\2\2\2\u0224\u021a"+
		"\3\2\2\2\u0224\u021b\3\2\2\2\u0224\u021c\3\2\2\2\u0224\u021d\3\2\2\2\u0224"+
		"\u021e\3\2\2\2\u0224\u021f\3\2\2\2\u0224\u0220\3\2\2\2\u0225Q\3\2\2\2"+
		"\u0226\u0227\b*\1\2\u0227\u0228\5P)\2\u0228\u0236\3\2\2\2\u0229\u022a"+
		"\f\7\2\2\u022a\u0235\5T+\2\u022b\u022c\f\6\2\2\u022c\u0235\5\u0080A\2"+
		"\u022d\u022e\f\5\2\2\u022e\u022f\7\u010a\2\2\u022f\u0235\5<\37\2\u0230"+
		"\u0231\f\4\2\2\u0231\u0235\7\u00f1\2\2\u0232\u0233\f\3\2\2\u0233\u0235"+
		"\7\u00f2\2\2\u0234\u0229\3\2\2\2\u0234\u022b\3\2\2\2\u0234\u022d\3\2\2"+
		"\2\u0234\u0230\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237S\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023a\7\u0104\2\2\u023a\u023f\5t;\2\u023b\u023c\7\u010b\2\2\u023c\u023e"+
		"\5t;\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7\u0105"+
		"\2\2\u0243\u024a\3\2\2\2\u0244\u0246\7\u0104\2\2\u0245\u0247\7?\2\2\u0246"+
		"\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\7\u0105"+
		"\2\2\u0249\u0239\3\2\2\2\u0249\u0244\3\2\2\2\u024aU\3\2\2\2\u024b\u024c"+
		"\5x=\2\u024cW\3\2\2\2\u024d\u025a\5R*\2\u024e\u024f\5Z.\2\u024f\u0250"+
		"\5X-\2\u0250\u025a\3\2\2\2\u0251\u0257\7\u00e3\2\2\u0252\u0253\7\u0104"+
		"\2\2\u0253\u0254\5> \2\u0254\u0255\7\u0105\2\2\u0255\u0258\3\2\2\2\u0256"+
		"\u0258\5> \2\u0257\u0252\3\2\2\2\u0257\u0256\3\2\2\2\u0258\u025a\3\2\2"+
		"\2\u0259\u024d\3\2\2\2\u0259\u024e\3\2\2\2\u0259\u0251\3\2\2\2\u025aY"+
		"\3\2\2\2\u025b\u025c\t\2\2\2\u025c[\3\2\2\2\u025d\u025e\b/\1\2\u025e\u025f"+
		"\5X-\2\u025f\u026b\3\2\2\2\u0260\u0261\f\5\2\2\u0261\u0262\7\u0113\2\2"+
		"\u0262\u026a\5X-\2\u0263\u0264\f\4\2\2\u0264\u0265\7\u0114\2\2\u0265\u026a"+
		"\5X-\2\u0266\u0267\f\3\2\2\u0267\u0268\7\u0115\2\2\u0268\u026a\5X-\2\u0269"+
		"\u0260\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0266\3\2\2\2\u026a\u026d\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c]\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026e\u026f\b\60\1\2\u026f\u0270\5\\/\2\u0270\u0279\3\2\2\2\u0271"+
		"\u0272\f\4\2\2\u0272\u0273\7\u0112\2\2\u0273\u0278\5\\/\2\u0274\u0275"+
		"\f\3\2\2\u0275\u0276\7\u0110\2\2\u0276\u0278\5\\/\2\u0277\u0271\3\2\2"+
		"\2\u0277\u0274\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a_\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\b\61\1\2\u027d"+
		"\u027e\5^\60\2\u027e\u0287\3\2\2\2\u027f\u0280\f\4\2\2\u0280\u0281\7\u00ef"+
		"\2\2\u0281\u0286\5^\60\2\u0282\u0283\f\3\2\2\u0283\u0284\7\u00f0\2\2\u0284"+
		"\u0286\5^\60\2\u0285\u027f\3\2\2\2\u0285\u0282\3\2\2\2\u0286\u0289\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288a\3\2\2\2\u0289\u0287"+
		"\3\2\2\2\u028a\u028b\b\62\1\2\u028b\u028c\5`\61\2\u028c\u029b\3\2\2\2"+
		"\u028d\u028e\f\6\2\2\u028e\u028f\7\u0116\2\2\u028f\u029a\5`\61\2\u0290"+
		"\u0291\f\5\2\2\u0291\u0292\7\u0117\2\2\u0292\u029a\5`\61\2\u0293\u0294"+
		"\f\4\2\2\u0294\u0295\7\u00f3\2\2\u0295\u029a\5`\61\2\u0296\u0297\f\3\2"+
		"\2\u0297\u0298\7\u00f4\2\2\u0298\u029a\5`\61\2\u0299\u028d\3\2\2\2\u0299"+
		"\u0290\3\2\2\2\u0299\u0293\3\2\2\2\u0299\u0296\3\2\2\2\u029a\u029d\3\2"+
		"\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029cc\3\2\2\2\u029d\u029b"+
		"\3\2\2\2\u029e\u029f\b\63\1\2\u029f\u02a0\5b\62\2\u02a0\u02a9\3\2\2\2"+
		"\u02a1\u02a2\f\4\2\2\u02a2\u02a3\7\u00f5\2\2\u02a3\u02a8\5b\62\2\u02a4"+
		"\u02a5\f\3\2\2\u02a5\u02a6\7\u00f6\2\2\u02a6\u02a8\5b\62\2\u02a7\u02a1"+
		"\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aae\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\b\64\1\2"+
		"\u02ad\u02ae\5d\63\2\u02ae\u02b4\3\2\2\2\u02af\u02b0\f\3\2\2\u02b0\u02b1"+
		"\7\u011a\2\2\u02b1\u02b3\5d\63\2\u02b2\u02af\3\2\2\2\u02b3\u02b6\3\2\2"+
		"\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5g\3\2\2\2\u02b6\u02b4"+
		"\3\2\2\2\u02b7\u02b8\b\65\1\2\u02b8\u02b9\5f\64\2\u02b9\u02bf\3\2\2\2"+
		"\u02ba\u02bb\f\3\2\2\u02bb\u02bc\7\u0119\2\2\u02bc\u02be\5f\64\2\u02bd"+
		"\u02ba\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0i\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\b\66\1\2\u02c3\u02c4"+
		"\5h\65\2\u02c4\u02ca\3\2\2\2\u02c5\u02c6\f\3\2\2\u02c6\u02c7\7\u0118\2"+
		"\2\u02c7\u02c9\5h\65\2\u02c8\u02c5\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cbk\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd"+
		"\u02ce\b\67\1\2\u02ce\u02cf\5j\66\2\u02cf\u02d5\3\2\2\2\u02d0\u02d1\f"+
		"\3\2\2\u02d1\u02d2\7\u00f7\2\2\u02d2\u02d4\5j\66\2\u02d3\u02d0\3\2\2\2"+
		"\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6m\3"+
		"\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\b8\1\2\u02d9\u02da\5l\67\2\u02da"+
		"\u02e0\3\2\2\2\u02db\u02dc\f\3\2\2\u02dc\u02dd\7\u00f9\2\2\u02dd\u02df"+
		"\5l\67\2\u02de\u02db\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1o\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\b9\1\2\u02e4"+
		"\u02e5\5n8\2\u02e5\u02eb\3\2\2\2\u02e6\u02e7\f\3\2\2\u02e7\u02e8\7\u00f8"+
		"\2\2\u02e8\u02ea\5n8\2\u02e9\u02e6\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ecq\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee"+
		"\u02f6\5p9\2\u02ef\u02f0\5p9\2\u02f0\u02f1\7\u011b\2\2\u02f1\u02f2\5x"+
		"=\2\u02f2\u02f3\7\u010c\2\2\u02f3\u02f4\5t;\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02ee\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f6s\3\2\2\2\u02f7\u02fd\5r:\2\u02f8"+
		"\u02f9\5X-\2\u02f9\u02fa\5v<\2\u02fa\u02fb\5t;\2\u02fb\u02fd\3\2\2\2\u02fc"+
		"\u02f7\3\2\2\2\u02fc\u02f8\3\2\2\2\u02fdu\3\2\2\2\u02fe\u02ff\t\3\2\2"+
		"\u02ffw\3\2\2\2\u0300\u0305\5t;\2\u0301\u0302\7\u010b\2\2\u0302\u0304"+
		"\5t;\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306y\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0309\5r:\2\u0309"+
		"{\3\2\2\2\u030a\u030f\5D#\2\u030b\u030c\7\u010b\2\2\u030c\u030e\5D#\2"+
		"\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310}\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0316\5\u0082B\2\u0313"+
		"\u0315\5\u0080A\2\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\177\3\2\2\2\u0318\u0316\3\2\2\2\u0319"+
		"\u031b\7\u0106\2\2\u031a\u031c\5V,\2\u031b\u031a\3\2\2\2\u031b\u031c\3"+
		"\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\7\u0107\2\2\u031e\u0081\3\2\2\2"+
		"\u031f\u0323\5\u0084C\2\u0320\u0323\5\u0086D\2\u0321\u0323\5@!\2\u0322"+
		"\u031f\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2\2\2\u0323\u0083\3\2"+
		"\2\2\u0324\u0325\t\4\2\2\u0325\u0085\3\2\2\2\u0326\u0327\7\u00bb\2\2\u0327"+
		"\u0328\7\u0125\2\2\u0328\u0329\5\u0088E\2\u0329\u0087\3\2\2\2\u032a\u032c"+
		"\7\u0108\2\2\u032b\u032d\5\u008aF\2\u032c\u032b\3\2\2\2\u032d\u032e\3"+
		"\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0331\7\u0109\2\2\u0331\u0089\3\2\2\2\u0332\u0334\5\u0090I\2\u0333\u0332"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\5~@\2\u0336"+
		"\u0337\5\u008cG\2\u0337\u0338\7\u010e\2\2\u0338\u008b\3\2\2\2\u0339\u033e"+
		"\5\u008eH\2\u033a\u033b\7\u010b\2\2\u033b\u033d\5\u008eH\2\u033c\u033a"+
		"\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u008d\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0345\7\u0125\2\2\u0342\u0344"+
		"\5\u0080A\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2"+
		"\2\u0345\u0346\3\2\2\2\u0346\u008f\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u034a"+
		"\5\u0092J\2\u0349\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0349\3\2\2"+
		"\2\u034b\u034c\3\2\2\2\u034c\u0091\3\2\2\2\u034d\u0354\5\u00a0Q\2\u034e"+
		"\u0354\5\u0098M\2\u034f\u0354\5\u00a2R\2\u0350\u0354\5\u0096L\2\u0351"+
		"\u0354\5\u0094K\2\u0352\u0354\5\u009eP\2\u0353\u034d\3\2\2\2\u0353\u034e"+
		"\3\2\2\2\u0353\u034f\3\2\2\2\u0353\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353"+
		"\u0352\3\2\2\2\u0354\u0093\3\2\2\2\u0355\u0356\7A\2\2\u0356\u0095\3\2"+
		"\2\2\u0357\u0358\t\5\2\2\u0358\u0097\3\2\2\2\u0359\u035a\7\'\2\2\u035a"+
		"\u035b\7\u0104\2\2\u035b\u035c\5\u009aN\2\u035c\u035d\7\u0105\2\2\u035d"+
		"\u0099\3\2\2\2\u035e\u0363\5\u009cO\2\u035f\u0360\7\u010b\2\2\u0360\u0362"+
		"\5\u009cO\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2"+
		"\2\u0363\u0364\3\2\2\2\u0364\u009b\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u036c"+
		"\7\u0125\2\2\u0367\u0368\7\u0125\2\2\u0368\u0369\7\u010d\2\2\u0369\u036c"+
		"\5z>\2\u036a\u036c\7 \2\2\u036b\u0366\3\2\2\2\u036b\u0367\3\2\2\2\u036b"+
		"\u036a\3\2\2\2\u036c\u009d\3\2\2\2\u036d\u036e\7B\2\2\u036e\u009f\3\2"+
		"\2\2\u036f\u0387\7\34\2\2\u0370\u0387\7\33\2\2\u0371\u0387\7\36\2\2\u0372"+
		"\u0387\7;\2\2\u0373\u0387\79\2\2\u0374\u0387\7:\2\2\u0375\u0387\7(\2\2"+
		"\u0376\u0387\7,\2\2\u0377\u0387\7-\2\2\u0378\u0387\7\35\2\2\u0379\u0387"+
		"\7\37\2\2\u037a\u0387\7 \2\2\u037b\u0387\7!\2\2\u037c\u0387\7\"\2\2\u037d"+
		"\u0387\7#\2\2\u037e\u0387\7$\2\2\u037f\u0387\7%\2\2\u0380\u0381\78\2\2"+
		"\u0381\u0382\7\u0104\2\2\u0382\u0383\5|?\2\u0383\u0384\7\u0105\2\2\u0384"+
		"\u0387\3\2\2\2\u0385\u0387\78\2\2\u0386\u036f\3\2\2\2\u0386\u0370\3\2"+
		"\2\2\u0386\u0371\3\2\2\2\u0386\u0372\3\2\2\2\u0386\u0373\3\2\2\2\u0386"+
		"\u0374\3\2\2\2\u0386\u0375\3\2\2\2\u0386\u0376\3\2\2\2\u0386\u0377\3\2"+
		"\2\2\u0386\u0378\3\2\2\2\u0386\u0379\3\2\2\2\u0386\u037a\3\2\2\2\u0386"+
		"\u037b\3\2\2\2\u0386\u037c\3\2\2\2\u0386\u037d\3\2\2\2\u0386\u037e\3\2"+
		"\2\2\u0386\u037f\3\2\2\2\u0386\u0380\3\2\2\2\u0386\u0385\3\2\2\2\u0387"+
		"\u00a1\3\2\2\2\u0388\u0389\t\6\2\2\u0389\u00a3\3\2\2\2\u038a\u038b\5\u00a6"+
		"T\2\u038b\u00a5\3\2\2\2\u038c\u038e\5\u00a8U\2\u038d\u038c\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u00a7\3\2\2\2\u038f\u0391\5\u00aaV\2\u0390\u038f"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u00a9\3\2\2\2\u0394\u0398\5\u00acW\2\u0395\u0398\5\u00b8]\2\u0396\u0398"+
		"\5\u00c4c\2\u0397\u0394\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2\2"+
		"\2\u0398\u00ab\3\2\2\2\u0399\u039b\5\u00aeX\2\u039a\u039c\5\u00b0Y\2\u039b"+
		"\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039f\5\u00b4"+
		"[\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a1\5\u00b6\\\2\u03a1\u00ad\3\2\2\2\u03a2\u03a3\7\r\2\2\u03a3\u03a4"+
		"\5z>\2\u03a4\u03a6\7\u00e5\2\2\u03a5\u03a7\5\u00a8U\2\u03a6\u03a5\3\2"+
		"\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03b5\3\2\2\2\u03a8\u03a9\7\16\2\2\u03a9"+
		"\u03aa\5\u00d4k\2\u03aa\u03ac\7\u00e5\2\2\u03ab\u03ad\5\u00a8U\2\u03ac"+
		"\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b5\3\2\2\2\u03ae\u03af\7\17"+
		"\2\2\u03af\u03b0\5\u00d4k\2\u03b0\u03b2\7\u00e5\2\2\u03b1\u03b3\5\u00a8"+
		"U\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03a2\3\2\2\2\u03b4\u03a8\3\2\2\2\u03b4\u03ae\3\2\2\2\u03b5\u00af\3\2"+
		"\2\2\u03b6\u03b8\5\u00b2Z\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u00b1\3\2\2\2\u03bb\u03bc\7\21"+
		"\2\2\u03bc\u03bd\5z>\2\u03bd\u03bf\7\u00e5\2\2\u03be\u03c0\5\u00a8U\2"+
		"\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u00b3\3\2\2\2\u03c1\u03c2"+
		"\7\20\2\2\u03c2\u03c4\7\u00e5\2\2\u03c3\u03c5\5\u00a8U\2\u03c4\u03c3\3"+
		"\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u00b5\3\2\2\2\u03c6\u03c7\7\22\2\2\u03c7"+
		"\u03c8\7\u00e5\2\2\u03c8\u00b7\3\2\2\2\u03c9\u03ca\7\n\2\2\u03ca\u03cb"+
		"\5\u00d2j\2\u03cb\u03cc\7\u00e5\2\2\u03cc\u03f3\3\2\2\2\u03cd\u03ce\7"+
		"\13\2\2\u03ce\u03cf\5\u00ba^\2\u03cf\u03d0\7\u00e5\2\2\u03d0\u03f3\3\2"+
		"\2\2\u03d1\u03d2\7\f\2\2\u03d2\u03d3\5\u00d4k\2\u03d3\u03d4\7\u00e5\2"+
		"\2\u03d4\u03f3\3\2\2\2\u03d5\u03d6\7\27\2\2\u03d6\u03d7\5\u00caf\2\u03d7"+
		"\u03d8\7\u00e5\2\2\u03d8\u03f3\3\2\2\2\u03d9\u03db\7\23\2\2\u03da\u03dc"+
		"\5\u00caf\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2"+
		"\2\u03dd\u03f3\7\u00e5\2\2\u03de\u03e0\7\24\2\2\u03df\u03e1\5\u00caf\2"+
		"\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03f3"+
		"\7\u00e5\2\2\u03e3\u03e4\7\25\2\2\u03e4\u03e5\5\u00d4k\2\u03e5\u03e6\7"+
		"\u010c\2\2\u03e6\u03e7\5\u00be`\2\u03e7\u03e8\7\u00e5\2\2\u03e8\u03f3"+
		"\3\2\2\2\u03e9\u03ea\7\26\2\2\u03ea\u03eb\5H%\2\u03eb\u03ec\5\u00c0a\2"+
		"\u03ec\u03ed\7\u00e5\2\2\u03ed\u03f3\3\2\2\2\u03ee\u03ef\7\u011c\2\2\u03ef"+
		"\u03f3\7\u00e5\2\2\u03f0\u03f1\7\u011c\2\2\u03f1\u03f3\5\u00c6d\2\u03f2"+
		"\u03c9\3\2\2\2\u03f2\u03cd\3\2\2\2\u03f2\u03d1\3\2\2\2\u03f2\u03d5\3\2"+
		"\2\2\u03f2\u03d9\3\2\2\2\u03f2\u03de\3\2\2\2\u03f2\u03e3\3\2\2\2\u03f2"+
		"\u03e9\3\2\2\2\u03f2\u03ee\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u00b9\3\2"+
		"\2\2\u03f4\u03fe\7\u0125\2\2\u03f5\u03f6\6^\32\2\u03f6\u03ff\5\u00c8e"+
		"\2\u03f7\u03f8\6^\33\2\u03f8\u03f9\7\u0104\2\2\u03f9\u03fa\5\u00bc_\2"+
		"\u03fa\u03fb\7\u0105\2\2\u03fb\u03fc\5\u00c8e\2\u03fc\u03ff\3\2\2\2\u03fd"+
		"\u03ff\3\2\2\2\u03fe\u03f5\3\2\2\2\u03fe\u03f7\3\2\2\2\u03fe\u03fd\3\2"+
		"\2\2\u03ff\u00bb\3\2\2\2\u0400\u0402\5\u00c2b\2\u0401\u0400\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u040a\3\2\2\2\u0403\u0404\5\u00c2b\2\u0404\u0405"+
		"\7\u010b\2\2\u0405\u0407\3\2\2\2\u0406\u0403\3\2\2\2\u0406\u0407\3\2\2"+
		"\2\u0407\u0408\3\2\2\2\u0408\u040a\7\u011e\2\2\u0409\u0401\3\2\2\2\u0409"+
		"\u0406\3\2\2\2\u040a\u00bd\3\2\2\2\u040b\u040c\t\7\2\2\u040c\u00bf\3\2"+
		"\2\2\u040d\u040e\t\b\2\2\u040e\u00c1\3\2\2\2\u040f\u0414\7\u0125\2\2\u0410"+
		"\u0411\7\u010b\2\2\u0411\u0413\7\u0125\2\2\u0412\u0410\3\2\2\2\u0413\u0416"+
		"\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u00c3\3\2\2\2\u0416"+
		"\u0414\3\2\2\2\u0417\u041b\n\t\2\2\u0418\u041a\n\n\2\2\u0419\u0418\3\2"+
		"\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0421\7\u00e5\2\2\u041f\u0421"+
		"\7\u00e5\2\2\u0420\u0417\3\2\2\2\u0420\u041f\3\2\2\2\u0421\u00c5\3\2\2"+
		"\2\u0422\u0424\5\u00caf\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0426\7\u00e5\2\2\u0426\u00c7\3\2\2\2\u0427\u0429"+
		"\5\u00caf\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u00c9\3\2\2"+
		"\2\u042a\u042c\5\u00ccg\2\u042b\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u00cb\3\2\2\2\u042f\u0437\5\u00d2"+
		"j\2\u0430\u0437\5\u00d4k\2\u0431\u0437\5\u00d6l\2\u0432\u0437\5\u00ce"+
		"h\2\u0433\u0437\5\u00d0i\2\u0434\u0437\5\u00dan\2\u0435\u0437\5\u00dc"+
		"o\2\u0436\u042f\3\2\2\2\u0436\u0430\3\2\2\2\u0436\u0431\3\2\2\2\u0436"+
		"\u0432\3\2\2\2\u0436\u0433\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0435\3\2"+
		"\2\2\u0437\u00cd\3\2\2\2\u0438\u0439\t\13\2\2\u0439\u00cf\3\2\2\2\u043a"+
		"\u043b\t\f\2\2\u043b\u00d1\3\2\2\2\u043c\u043e\7\u0116\2\2\u043d\u043f"+
		"\n\r\2\2\u043e\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u043e\3\2\2\2\u0440"+
		"\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0445\7\u0117\2\2\u0443\u0445"+
		"\7\u0123\2\2\u0444\u043c\3\2\2\2\u0444\u0443\3\2\2\2\u0445\u00d3\3\2\2"+
		"\2\u0446\u0447\7\u0125\2\2\u0447\u00d5\3\2\2\2\u0448\u044d\5H%\2\u0449"+
		"\u044d\5J&\2\u044a\u044d\5N(\2\u044b\u044d\5L\'\2\u044c\u0448\3\2\2\2"+
		"\u044c\u0449\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044b\3\2\2\2\u044d\u00d7"+
		"\3\2\2\2\u044e\u0450\t\16\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2"+
		"\u0450\u00d9\3\2\2\2\u0451\u0481\7\u0106\2\2\u0452\u0481\7\u0107\2\2\u0453"+
		"\u0481\7\u0104\2\2\u0454\u0481\7\u0105\2\2\u0455\u0481\7\u0108\2\2\u0456"+
		"\u0481\7\u0109\2\2\u0457\u0481\7\u010a\2\2\u0458\u0481\7\u00f1\2\2\u0459"+
		"\u0481\7\u00f2\2\2\u045a\u0481\7\u011a\2\2\u045b\u0481\7\u0113\2\2\u045c"+
		"\u0481\7\u0112\2\2\u045d\u0481\7\u0110\2\2\u045e\u0481\7\u0111\2\2\u045f"+
		"\u0481\7\u010f\2\2\u0460\u0481\7\u0114\2\2\u0461\u0481\7\u0115\2\2\u0462"+
		"\u0481\7\u00ef\2\2\u0463\u0481\7\u00f0\2\2\u0464\u0465\7\u0116\2\2\u0465"+
		"\u0481\7\u0117\2\2\u0466\u0481\7\u00f3\2\2\u0467\u0481\7\u00f4\2\2\u0468"+
		"\u0481\7\u00f5\2\2\u0469\u0481\7\u00f6\2\2\u046a\u0481\7\u0119\2\2\u046b"+
		"\u0481\7\u0118\2\2\u046c\u0481\7\u00f7\2\2\u046d\u0481\7\u00f8\2\2\u046e"+
		"\u0481\7\u011b\2\2\u046f\u0481\7\u010c\2\2\u0470\u0481\7\u010e\2\2\u0471"+
		"\u0481\7\u011e\2\2\u0472\u0481\7\u010d\2\2\u0473\u0481\7\u00fa\2\2\u0474"+
		"\u0481\7\u00fb\2\2\u0475\u0481\7\u00fd\2\2\u0476\u0481\7\u00fc\2\2\u0477"+
		"\u0481\7\u0103\2\2\u0478\u0481\7\u00fe\2\2\u0479\u0481\7\u00ff\2\2\u047a"+
		"\u0481\7\u0100\2\2\u047b\u0481\7\u0101\2\2\u047c\u0481\7\u0102\2\2\u047d"+
		"\u0481\7\u010b\2\2\u047e\u0481\7\u011c\2\2\u047f\u0481\7\u011d\2\2\u0480"+
		"\u0451\3\2\2\2\u0480\u0452\3\2\2\2\u0480\u0453\3\2\2\2\u0480\u0454\3\2"+
		"\2\2\u0480\u0455\3\2\2\2\u0480\u0456\3\2\2\2\u0480\u0457\3\2\2\2\u0480"+
		"\u0458\3\2\2\2\u0480\u0459\3\2\2\2\u0480\u045a\3\2\2\2\u0480\u045b\3\2"+
		"\2\2\u0480\u045c\3\2\2\2\u0480\u045d\3\2\2\2\u0480\u045e\3\2\2\2\u0480"+
		"\u045f\3\2\2\2\u0480\u0460\3\2\2\2\u0480\u0461\3\2\2\2\u0480\u0462\3\2"+
		"\2\2\u0480\u0463\3\2\2\2\u0480\u0464\3\2\2\2\u0480\u0466\3\2\2\2\u0480"+
		"\u0467\3\2\2\2\u0480\u0468\3\2\2\2\u0480\u0469\3\2\2\2\u0480\u046a\3\2"+
		"\2\2\u0480\u046b\3\2\2\2\u0480\u046c\3\2\2\2\u0480\u046d\3\2\2\2\u0480"+
		"\u046e\3\2\2\2\u0480\u046f\3\2\2\2\u0480\u0470\3\2\2\2\u0480\u0471\3\2"+
		"\2\2\u0480\u0472\3\2\2\2\u0480\u0473\3\2\2\2\u0480\u0474\3\2\2\2\u0480"+
		"\u0475\3\2\2\2\u0480\u0476\3\2\2\2\u0480\u0477\3\2\2\2\u0480\u0478\3\2"+
		"\2\2\u0480\u0479\3\2\2\2\u0480\u047a\3\2\2\2\u0480\u047b\3\2\2\2\u0480"+
		"\u047c\3\2\2\2\u0480\u047d\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u047f\3\2"+
		"\2\2\u0481\u00db\3\2\2\2\u0482\u0483\n\17\2\2\u0483\u00dd\3\2\2\2q\u00ec"+
		"\u00f7\u00fa\u0101\u0105\u010c\u0110\u0114\u011b\u011e\u0121\u012f\u013a"+
		"\u0143\u0147\u014e\u0151\u0157\u015c\u015f\u016a\u016e\u0172\u0176\u0180"+
		"\u0186\u018c\u019e\u01a8\u01b2\u01be\u01c6\u01d9\u01dd\u01e1\u01e8\u01f0"+
		"\u01f5\u01fa\u01ff\u0224\u0234\u0236\u023f\u0246\u0249\u0257\u0259\u0269"+
		"\u026b\u0277\u0279\u0285\u0287\u0299\u029b\u02a7\u02a9\u02b4\u02bf\u02ca"+
		"\u02d5\u02e0\u02eb\u02f5\u02fc\u0305\u030f\u0316\u031b\u0322\u032e\u0333"+
		"\u033e\u0345\u034b\u0353\u0363\u036b\u0386\u038d\u0392\u0397\u039b\u039e"+
		"\u03a6\u03ac\u03b2\u03b4\u03b9\u03bf\u03c4\u03db\u03e0\u03f2\u03fe\u0401"+
		"\u0406\u0409\u0414\u041b\u0420\u0423\u0428\u042d\u0436\u0440\u0444\u044c"+
		"\u044f\u0480";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}