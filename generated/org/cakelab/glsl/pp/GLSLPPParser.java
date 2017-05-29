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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ATTRIBUTE=8, CONST=9, 
		UNIFORM=10, VARYING=11, BUFFER=12, SHARED=13, COHERENT=14, VOLATILE=15, 
		RESTRICT=16, READONLY=17, WRITEONLY=18, ATOMIC_UINT=19, LAYOUT=20, CENTROID=21, 
		FLAT=22, SMOOTH=23, NOPERSPECTIVE=24, PATCH=25, SAMPLE=26, BREAK=27, CONTINUE=28, 
		DO=29, FOR=30, WHILE=31, SWITCH=32, CASE=33, DEFAULT=34, IF=35, ELSE=36, 
		SUBROUTINE=37, IN=38, OUT=39, INOUT=40, FLOAT=41, DOUBLE=42, INT=43, VOID=44, 
		BOOL=45, INVARIANT=46, PRECISE=47, DISCARD=48, RETURN=49, MAT2=50, MAT3=51, 
		MAT4=52, DMAT2=53, DMAT3=54, DMAT4=55, MAT2X2=56, MAT2X3=57, MAT2X4=58, 
		DMAT2X2=59, DMAT2X3=60, DMAT2X4=61, MAT3X2=62, MAT3X3=63, MAT3X4=64, DMAT3X2=65, 
		DMAT3X3=66, DMAT3X4=67, MAT4X2=68, MAT4X3=69, MAT4X4=70, DMAT4X2=71, DMAT4X3=72, 
		DMAT4X4=73, VEC2=74, VEC3=75, VEC4=76, IVEC2=77, IVEC3=78, IVEC4=79, BVEC2=80, 
		BVEC3=81, BVEC4=82, DVEC2=83, DVEC3=84, DVEC4=85, UINT=86, UVEC2=87, UVEC3=88, 
		UVEC4=89, LOW_PRECISION=90, MEDIUM_PRECISION=91, HIGH_PRECISION=92, PRECISION=93, 
		SAMPLER1D=94, SAMPLER2D=95, SAMPLER3D=96, SAMPLERCUBE=97, SAMPLER1DSHADOW=98, 
		SAMPLER2DSHADOW=99, SAMPLERCUBESHADOW=100, SAMPLER1DARRAY=101, SAMPLER2DARRAY=102, 
		SAMPLER1DARRAYSHADOW=103, SAMPLER2DARRAYSHADOW=104, ISAMPLER1D=105, ISAMPLER2D=106, 
		ISAMPLER3D=107, ISAMPLERCUBE=108, ISAMPLER1DARRAY=109, ISAMPLER2DARRAY=110, 
		USAMPLER1D=111, USAMPLER2D=112, USAMPLER3D=113, USAMPLERCUBE=114, USAMPLER1DARRAY=115, 
		USAMPLER2DARRAY=116, SAMPLER2DRECT=117, SAMPLER2DRECTSHADOW=118, ISAMPLER2DRECT=119, 
		USAMPLER2DRECT=120, SAMPLERBUFFER=121, ISAMPLERBUFFER=122, USAMPLERBUFFER=123, 
		SAMPLER2DMS=124, ISAMPLER2DMS=125, USAMPLER2DMS=126, SAMPLER2DMSARRAY=127, 
		ISAMPLER2DMSARRAY=128, USAMPLER2DMSARRAY=129, SAMPLERCUBEARRAY=130, SAMPLERCUBEARRAYSHADOW=131, 
		ISAMPLERCUBEARRAY=132, USAMPLERCUBEARRAY=133, IMAGE1D=134, IIMAGE1D=135, 
		UIMAGE1D=136, IMAGE2D=137, IIMAGE2D=138, UIMAGE2D=139, IMAGE3D=140, IIMAGE3D=141, 
		UIMAGE3D=142, IMAGE2DRECT=143, IIMAGE2DRECT=144, UIMAGE2DRECT=145, IMAGECUBE=146, 
		IIMAGECUBE=147, UIMAGECUBE=148, IMAGEBUFFER=149, IIMAGEBUFFER=150, UIMAGEBUFFER=151, 
		IMAGE1DARRAY=152, IIMAGE1DARRAY=153, UIMAGE1DARRAY=154, IMAGE2DARRAY=155, 
		IIMAGE2DARRAY=156, UIMAGE2DARRAY=157, IMAGECUBEARRAY=158, IIMAGECUBEARRAY=159, 
		UIMAGECUBEARRAY=160, IMAGE2DMS=161, IIMAGE2DMS=162, UIMAGE2DMS=163, IMAGE2DMSARRAY=164, 
		IIMAGE2DMSARRAY=165, UIMAGE2DMSARRAY=166, SAMPLEREXTERNALOES=167, STRUCT=168, 
		COMMON=169, PARTITION=170, ACTIVE=171, ASM=172, CLASS=173, UNION=174, 
		ENUM=175, TYPEDEF=176, TEMPLATE=177, THIS=178, RESOURCE=179, GOTO=180, 
		INLINE=181, NOINLINE=182, PUBLIC=183, STATIC=184, EXTERN=185, EXTERNAL=186, 
		INTERFACE=187, LONG=188, SHORT=189, HALF=190, FIXED=191, UNSIGNED=192, 
		SUPERP=193, INPUT=194, OUTPUT=195, HVEC2=196, HVEC3=197, HVEC4=198, FVEC2=199, 
		FVEC3=200, FVEC4=201, SAMPLER3DRECT=202, FILTER=203, SIZEOF=204, CAST=205, 
		NAMESPACE=206, USING=207, PPOP_DEFINED=208, WHITESPACE=209, CRLF=210, 
		HIDDEN_CRLF=211, LINE_CONTINUATION=212, MULTILINE_COMMENT=213, SINGLELINE_COMMENT=214, 
		BOOLCONSTANT=215, FLOATCONSTANT=216, DOUBLECONSTANT=217, INTCONSTANT=218, 
		UINTCONSTANT=219, CHARACTER_CONSTANT=220, PREFIXED_CHARACTER_CONSTANT=221, 
		STRING_LITERAL=222, STD_HEADER_NAME=223, PREFIXED_STRING_LITERAL=224, 
		LEFT_OP=225, RIGHT_OP=226, INC_OP=227, DEC_OP=228, LE_OP=229, GE_OP=230, 
		EQ_OP=231, NE_OP=232, AND_OP=233, OR_OP=234, XOR_OP=235, MUL_ASSIGN=236, 
		DIV_ASSIGN=237, ADD_ASSIGN=238, MOD_ASSIGN=239, LEFT_ASSIGN=240, RIGHT_ASSIGN=241, 
		AND_ASSIGN=242, XOR_ASSIGN=243, OR_ASSIGN=244, SUB_ASSIGN=245, LEFT_PAREN=246, 
		RIGHT_PAREN=247, LEFT_BRACKET=248, RIGHT_BRACKET=249, LEFT_BRACE=250, 
		RIGHT_BRACE=251, DOT=252, COMMA=253, COLON=254, EQUAL=255, SEMICOLON=256, 
		BANG=257, DASH=258, TILDE=259, PLUS=260, STAR=261, SLASH=262, PERCENT=263, 
		LEFT_ANGLE=264, RIGHT_ANGLE=265, VERTICAL_BAR=266, CARET=267, AMPERSAND=268, 
		QUESTION=269, HASH=270, PPOP_CONCAT=271, DOTS=272, DOUBLE_QUOTE=273, SINGLE_QUOTE=274, 
		TYPE_NAME=275, FUNCTION_NAME=276, IDENTIFIER=277, PPINCLUDE=278, PPDEFINE=279, 
		PPUNDEF=280, PPIF=281, PPIFDEF=282, PPIFNDEF=283, PPELSE=284, PPELIF=285, 
		PPENDIF=286, PPERROR=287, PPPRAGMA=288, PPEXTENSION=289, PPVERSION=290, 
		PPLINE=291, PPBUILTIN_LINE=292, PPBUILTIN_FILE=293, PPBUILTIN_VERSION=294;
	public static final int
		RULE_glslpp = 0, RULE_glslppPreprocessingFile = 1, RULE_glslppGroup = 2, 
		RULE_glslppGroupPart = 3, RULE_glslppIfSection = 4, RULE_glslppIfGroup = 5, 
		RULE_glslppElifGroups = 6, RULE_glslppElifGroup = 7, RULE_glslppElseGroup = 8, 
		RULE_glslppEndifLine = 9, RULE_glslppControlLine = 10, RULE_glslppMacro = 11, 
		RULE_glslppMacroArguments = 12, RULE_glslppExtensionBehaviour = 13, RULE_glslppProfile = 14, 
		RULE_glslppIdentifierList = 15, RULE_glslppTextLine = 16, RULE_glslppNonDirective = 17, 
		RULE_glslppReplacementList = 18, RULE_glslppTokens = 19, RULE_glslppPreprocessingToken = 20, 
		RULE_glslppCharacterConstant = 21, RULE_glslppStringLiteral = 22, RULE_glslppHeaderName = 23, 
		RULE_glslppIdentifier = 24, RULE_glslppNumber = 25, RULE_glslppSign = 26, 
		RULE_glslppPunctuator = 27, RULE_glslppUnspecifiedToken = 28, RULE_glslFieldSelection = 29, 
		RULE_glslVariableIdentifier = 30, RULE_glslTypeName = 31, RULE_glslFunctionName = 32, 
		RULE_glslBoolConstant = 33, RULE_glslIntegerConstant = 34, RULE_glslUnsignedIntegerConstant = 35, 
		RULE_glslFloatConstant = 36, RULE_glslDoubleConstant = 37, RULE_glslPrimaryExpression = 38, 
		RULE_glslPostfixExpression = 39, RULE_glslConstructorCallArguments = 40, 
		RULE_glslFunctionCallArguments = 41, RULE_glslCallArguments = 42, RULE_glslIntegerExpression = 43, 
		RULE_glslUnaryExpression = 44, RULE_glslUnaryOperator = 45, RULE_glslMultiplicativeExpression = 46, 
		RULE_glslAdditiveExpression = 47, RULE_glslShiftExpression = 48, RULE_glslRelationalExpression = 49, 
		RULE_glslEqualityExpression = 50, RULE_glslAndExpression = 51, RULE_glslExclusiveOrExpression = 52, 
		RULE_glslInclusiveOrExpression = 53, RULE_glslLogicalAndExpression = 54, 
		RULE_glslLogicalXorExpression = 55, RULE_glslLogicalOrExpression = 56, 
		RULE_glslConditionalExpression = 57, RULE_glslAssignmentExpression = 58, 
		RULE_glslAssignmentOperator = 59, RULE_glslExpression = 60, RULE_glslConstantExpression = 61, 
		RULE_glslFunctionNameList = 62, RULE_glslTypeSpecifier = 63, RULE_glslArrayDimensionsList = 64, 
		RULE_glslArrayDimension = 65, RULE_glslTypeSpecifierNonarray = 66, RULE_glslBuiltinType = 67, 
		RULE_glslStructSpecifier = 68, RULE_glslStructMemberList = 69, RULE_glslStructMemberGroup = 70, 
		RULE_glslStructMemberDeclaratorList = 71, RULE_glslStructMemberDeclarator = 72, 
		RULE_glslTypeQualifier = 73, RULE_glslSingleTypeQualifier = 74, RULE_glslInvariantQualifier = 75, 
		RULE_glslInterpolationQualifier = 76, RULE_glslLayoutQualifier = 77, RULE_glslLayoutQualifierIdList = 78, 
		RULE_glslLayoutQualifierId = 79, RULE_glslPreciseQualifier = 80, RULE_glslStorageQualifier = 81, 
		RULE_glslPrecisionQualifier = 82;
	public static final String[] ruleNames = {
		"glslpp", "glslppPreprocessingFile", "glslppGroup", "glslppGroupPart", 
		"glslppIfSection", "glslppIfGroup", "glslppElifGroups", "glslppElifGroup", 
		"glslppElseGroup", "glslppEndifLine", "glslppControlLine", "glslppMacro", 
		"glslppMacroArguments", "glslppExtensionBehaviour", "glslppProfile", "glslppIdentifierList", 
		"glslppTextLine", "glslppNonDirective", "glslppReplacementList", "glslppTokens", 
		"glslppPreprocessingToken", "glslppCharacterConstant", "glslppStringLiteral", 
		"glslppHeaderName", "glslppIdentifier", "glslppNumber", "glslppSign", 
		"glslppPunctuator", "glslppUnspecifiedToken", "glslFieldSelection", "glslVariableIdentifier", 
		"glslTypeName", "glslFunctionName", "glslBoolConstant", "glslIntegerConstant", 
		"glslUnsignedIntegerConstant", "glslFloatConstant", "glslDoubleConstant", 
		"glslPrimaryExpression", "glslPostfixExpression", "glslConstructorCallArguments", 
		"glslFunctionCallArguments", "glslCallArguments", "glslIntegerExpression", 
		"glslUnaryExpression", "glslUnaryOperator", "glslMultiplicativeExpression", 
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
		null, "'require'", "'enable'", "'warn'", "'disable'", "'core'", "'compatibility'", 
		"'es'", "'attribute'", "'const'", "'uniform'", "'varying'", "'buffer'", 
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
		"'?'", "'#'", "'##'", "'...'", "'\"'", "'''", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'__LINE__'", "'__FILE__'", "'__VERSION__'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ATTRIBUTE", "CONST", 
		"UNIFORM", "VARYING", "BUFFER", "SHARED", "COHERENT", "VOLATILE", "RESTRICT", 
		"READONLY", "WRITEONLY", "ATOMIC_UINT", "LAYOUT", "CENTROID", "FLAT", 
		"SMOOTH", "NOPERSPECTIVE", "PATCH", "SAMPLE", "BREAK", "CONTINUE", "DO", 
		"FOR", "WHILE", "SWITCH", "CASE", "DEFAULT", "IF", "ELSE", "SUBROUTINE", 
		"IN", "OUT", "INOUT", "FLOAT", "DOUBLE", "INT", "VOID", "BOOL", "INVARIANT", 
		"PRECISE", "DISCARD", "RETURN", "MAT2", "MAT3", "MAT4", "DMAT2", "DMAT3", 
		"DMAT4", "MAT2X2", "MAT2X3", "MAT2X4", "DMAT2X2", "DMAT2X3", "DMAT2X4", 
		"MAT3X2", "MAT3X3", "MAT3X4", "DMAT3X2", "DMAT3X3", "DMAT3X4", "MAT4X2", 
		"MAT4X3", "MAT4X4", "DMAT4X2", "DMAT4X3", "DMAT4X4", "VEC2", "VEC3", "VEC4", 
		"IVEC2", "IVEC3", "IVEC4", "BVEC2", "BVEC3", "BVEC4", "DVEC2", "DVEC3", 
		"DVEC4", "UINT", "UVEC2", "UVEC3", "UVEC4", "LOW_PRECISION", "MEDIUM_PRECISION", 
		"HIGH_PRECISION", "PRECISION", "SAMPLER1D", "SAMPLER2D", "SAMPLER3D", 
		"SAMPLERCUBE", "SAMPLER1DSHADOW", "SAMPLER2DSHADOW", "SAMPLERCUBESHADOW", 
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
		"IDENTIFIER", "PPINCLUDE", "PPDEFINE", "PPUNDEF", "PPIF", "PPIFDEF", "PPIFNDEF", 
		"PPELSE", "PPELIF", "PPENDIF", "PPERROR", "PPPRAGMA", "PPEXTENSION", "PPVERSION", 
		"PPLINE", "PPBUILTIN_LINE", "PPBUILTIN_FILE", "PPBUILTIN_VERSION"
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
		private org.cakelab.glsl.parser.Validator validator = new org.cakelab.glsl.parser.Validator();
		public void setValidator(org.cakelab.glsl.parser.Validator validator) {
			this.validator = validator;
		}
		

	public GLSLPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppContext glslpp() throws RecognitionException {
		GlslppContext _localctx = new GlslppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_glslpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 2, RULE_glslppPreprocessingFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
				{
				setState(168);
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
		enterRule(_localctx, 4, RULE_glslppGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				glslppGroupPart();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_glslppGroupPart);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PPIF:
			case PPIFDEF:
			case PPIFNDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				glslppIfSection();
				}
				break;
			case HASH:
			case PPINCLUDE:
			case PPDEFINE:
			case PPUNDEF:
			case PPERROR:
			case PPPRAGMA:
			case PPEXTENSION:
			case PPVERSION:
			case PPLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
			case CHARACTER_CONSTANT:
			case PREFIXED_CHARACTER_CONSTANT:
			case STRING_LITERAL:
			case STD_HEADER_NAME:
			case PREFIXED_STRING_LITERAL:
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
			case TYPE_NAME:
			case FUNCTION_NAME:
			case IDENTIFIER:
			case PPBUILTIN_LINE:
			case PPBUILTIN_FILE:
			case PPBUILTIN_VERSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
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
		enterRule(_localctx, 8, RULE_glslppIfSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			glslppIfGroup();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PPELIF) {
				{
				setState(182);
				glslppElifGroups();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PPELSE) {
				{
				setState(185);
				glslppElseGroup();
				}
			}

			setState(188);
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
		public TerminalNode PPIF() { return getToken(GLSLPPParser.PPIF, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public GlslppGroupContext glslppGroup() {
			return getRuleContext(GlslppGroupContext.class,0);
		}
		public TerminalNode PPIFDEF() { return getToken(GLSLPPParser.PPIFDEF, 0); }
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public TerminalNode PPIFNDEF() { return getToken(GLSLPPParser.PPIFNDEF, 0); }
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
		enterRule(_localctx, 10, RULE_glslppIfGroup);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PPIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(PPIF);
				setState(191);
				glslConstantExpression();
				setState(192);
				match(CRLF);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
					{
					setState(193);
					glslppGroup();
					}
				}

				}
				break;
			case PPIFDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(PPIFDEF);
				setState(197);
				glslppIdentifier();
				setState(198);
				match(CRLF);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
					{
					setState(199);
					glslppGroup();
					}
				}

				}
				break;
			case PPIFNDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(PPIFNDEF);
				setState(203);
				glslppIdentifier();
				setState(204);
				match(CRLF);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
					{
					setState(205);
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
		enterRule(_localctx, 12, RULE_glslppElifGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				glslppElifGroup();
				}
				}
				setState(213); 
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
		public TerminalNode PPELIF() { return getToken(GLSLPPParser.PPELIF, 0); }
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
		enterRule(_localctx, 14, RULE_glslppElifGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(PPELIF);
			setState(216);
			glslConstantExpression();
			setState(217);
			match(CRLF);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
				{
				setState(218);
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
		public TerminalNode PPELSE() { return getToken(GLSLPPParser.PPELSE, 0); }
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
		enterRule(_localctx, 16, RULE_glslppElseGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PPELSE);
			setState(222);
			match(CRLF);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (CRLF - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
				{
				setState(223);
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
		public TerminalNode PPENDIF() { return getToken(GLSLPPParser.PPENDIF, 0); }
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
		enterRule(_localctx, 18, RULE_glslppEndifLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(PPENDIF);
			setState(227);
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
		public TerminalNode PPINCLUDE() { return getToken(GLSLPPParser.PPINCLUDE, 0); }
		public GlslppHeaderNameContext glslppHeaderName() {
			return getRuleContext(GlslppHeaderNameContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(GLSLPPParser.CRLF, 0); }
		public TerminalNode PPDEFINE() { return getToken(GLSLPPParser.PPDEFINE, 0); }
		public GlslppMacroContext glslppMacro() {
			return getRuleContext(GlslppMacroContext.class,0);
		}
		public TerminalNode PPUNDEF() { return getToken(GLSLPPParser.PPUNDEF, 0); }
		public GlslppIdentifierContext glslppIdentifier() {
			return getRuleContext(GlslppIdentifierContext.class,0);
		}
		public TerminalNode PPLINE() { return getToken(GLSLPPParser.PPLINE, 0); }
		public GlslppTokensContext glslppTokens() {
			return getRuleContext(GlslppTokensContext.class,0);
		}
		public TerminalNode PPERROR() { return getToken(GLSLPPParser.PPERROR, 0); }
		public TerminalNode PPPRAGMA() { return getToken(GLSLPPParser.PPPRAGMA, 0); }
		public TerminalNode PPEXTENSION() { return getToken(GLSLPPParser.PPEXTENSION, 0); }
		public TerminalNode COLON() { return getToken(GLSLPPParser.COLON, 0); }
		public GlslppExtensionBehaviourContext glslppExtensionBehaviour() {
			return getRuleContext(GlslppExtensionBehaviourContext.class,0);
		}
		public TerminalNode PPVERSION() { return getToken(GLSLPPParser.PPVERSION, 0); }
		public GlslIntegerConstantContext glslIntegerConstant() {
			return getRuleContext(GlslIntegerConstantContext.class,0);
		}
		public GlslppProfileContext glslppProfile() {
			return getRuleContext(GlslppProfileContext.class,0);
		}
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
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
		enterRule(_localctx, 20, RULE_glslppControlLine);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(PPINCLUDE);
				setState(230);
				glslppHeaderName();
				setState(231);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(PPDEFINE);
				setState(234);
				glslppMacro();
				setState(235);
				match(CRLF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(PPUNDEF);
				setState(238);
				glslppIdentifier();
				setState(239);
				match(CRLF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(PPLINE);
				setState(242);
				glslppTokens();
				setState(243);
				match(CRLF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(PPERROR);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPELSE - 256)) | (1L << (PPELIF - 256)) | (1L << (PPENDIF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
					{
					setState(246);
					glslppTokens();
					}
				}

				setState(249);
				match(CRLF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(PPPRAGMA);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPELSE - 256)) | (1L << (PPELIF - 256)) | (1L << (PPENDIF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
					{
					setState(251);
					glslppTokens();
					}
				}

				setState(254);
				match(CRLF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				match(PPEXTENSION);
				setState(256);
				glslppIdentifier();
				setState(257);
				match(COLON);
				setState(258);
				glslppExtensionBehaviour();
				setState(259);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				match(PPVERSION);
				setState(262);
				glslIntegerConstant();
				setState(263);
				glslppProfile();
				setState(264);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				match(HASH);
				setState(267);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(268);
				match(HASH);
				setState(269);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslppReplacementListContext glslppReplacementList() {
			return getRuleContext(GlslppReplacementListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public GlslppMacroArgumentsContext glslppMacroArguments() {
			return getRuleContext(GlslppMacroArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
		public GlslppMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppMacroContext glslppMacro() throws RecognitionException {
		GlslppMacroContext _localctx = new GlslppMacroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_glslppMacro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IDENTIFIER);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(273);
				if (!( hidden(WHITESPACE))) throw new FailedPredicateException(this, " hidden(WHITESPACE)");
				setState(274);
				glslppReplacementList();
				}
				break;
			case 2:
				{
				setState(275);
				if (!(!hidden(WHITESPACE))) throw new FailedPredicateException(this, "!hidden(WHITESPACE)");
				setState(276);
				match(LEFT_PAREN);
				setState(277);
				glslppMacroArguments();
				setState(278);
				match(RIGHT_PAREN);
				setState(279);
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
		public TerminalNode DOTS() { return getToken(GLSLPPParser.DOTS, 0); }
		public TerminalNode COMMA() { return getToken(GLSLPPParser.COMMA, 0); }
		public GlslppMacroArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslppMacroArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslppMacroArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslppMacroArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslppMacroArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslppMacroArgumentsContext glslppMacroArguments() throws RecognitionException {
		GlslppMacroArgumentsContext _localctx = new GlslppMacroArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_glslppMacroArguments);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(284);
					glslppIdentifierList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(287);
					glslppIdentifierList();
					setState(288);
					match(COMMA);
					}
				}

				setState(292);
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
		enterRule(_localctx, 26, RULE_glslppExtensionBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 28, RULE_glslppProfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLPPParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLPPParser.IDENTIFIER, i);
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
		enterRule(_localctx, 30, RULE_glslppIdentifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IDENTIFIER);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					match(IDENTIFIER);
					}
					} 
				}
				setState(306);
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
		public TerminalNode PPIF() { return getToken(GLSLPPParser.PPIF, 0); }
		public TerminalNode PPIFDEF() { return getToken(GLSLPPParser.PPIFDEF, 0); }
		public TerminalNode PPIFNDEF() { return getToken(GLSLPPParser.PPIFNDEF, 0); }
		public TerminalNode PPELIF() { return getToken(GLSLPPParser.PPELIF, 0); }
		public TerminalNode PPELSE() { return getToken(GLSLPPParser.PPELSE, 0); }
		public TerminalNode PPENDIF() { return getToken(GLSLPPParser.PPENDIF, 0); }
		public TerminalNode PPINCLUDE() { return getToken(GLSLPPParser.PPINCLUDE, 0); }
		public TerminalNode PPDEFINE() { return getToken(GLSLPPParser.PPDEFINE, 0); }
		public TerminalNode PPUNDEF() { return getToken(GLSLPPParser.PPUNDEF, 0); }
		public TerminalNode PPLINE() { return getToken(GLSLPPParser.PPLINE, 0); }
		public TerminalNode PPERROR() { return getToken(GLSLPPParser.PPERROR, 0); }
		public TerminalNode PPPRAGMA() { return getToken(GLSLPPParser.PPPRAGMA, 0); }
		public TerminalNode PPEXTENSION() { return getToken(GLSLPPParser.PPEXTENSION, 0); }
		public TerminalNode PPVERSION() { return getToken(GLSLPPParser.PPVERSION, 0); }
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
		enterRule(_localctx, 32, RULE_glslppTextLine);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 270)) & ~0x3f) == 0 && ((1L << (_la - 270)) & ((1L << (HASH - 270)) | (1L << (PPINCLUDE - 270)) | (1L << (PPDEFINE - 270)) | (1L << (PPUNDEF - 270)) | (1L << (PPIF - 270)) | (1L << (PPIFDEF - 270)) | (1L << (PPIFNDEF - 270)) | (1L << (PPELSE - 270)) | (1L << (PPELIF - 270)) | (1L << (PPENDIF - 270)) | (1L << (PPERROR - 270)) | (1L << (PPPRAGMA - 270)) | (1L << (PPEXTENSION - 270)) | (1L << (PPVERSION - 270)) | (1L << (PPLINE - 270)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (WHITESPACE - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPELSE - 256)) | (1L << (PPELIF - 256)) | (1L << (PPENDIF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
					{
					{
					setState(308);
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
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
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
		enterRule(_localctx, 34, RULE_glslppNonDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPELSE - 256)) | (1L << (PPELIF - 256)) | (1L << (PPENDIF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
				{
				setState(318);
				glslppTokens();
				}
			}

			setState(321);
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
		enterRule(_localctx, 36, RULE_glslppReplacementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPELSE - 256)) | (1L << (PPELIF - 256)) | (1L << (PPENDIF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0)) {
				{
				setState(323);
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
		enterRule(_localctx, 38, RULE_glslppTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				glslppPreprocessingToken();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << IF) | (1L << ELSE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << DISCARD) | (1L << RETURN) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)) | (1L << (COMMON - 128)) | (1L << (PARTITION - 128)) | (1L << (ACTIVE - 128)) | (1L << (ASM - 128)) | (1L << (CLASS - 128)) | (1L << (UNION - 128)) | (1L << (ENUM - 128)) | (1L << (TYPEDEF - 128)) | (1L << (TEMPLATE - 128)) | (1L << (THIS - 128)) | (1L << (RESOURCE - 128)) | (1L << (GOTO - 128)) | (1L << (INLINE - 128)) | (1L << (NOINLINE - 128)) | (1L << (PUBLIC - 128)) | (1L << (STATIC - 128)) | (1L << (EXTERN - 128)) | (1L << (EXTERNAL - 128)) | (1L << (INTERFACE - 128)) | (1L << (LONG - 128)) | (1L << (SHORT - 128)) | (1L << (HALF - 128)) | (1L << (FIXED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNSIGNED - 192)) | (1L << (SUPERP - 192)) | (1L << (INPUT - 192)) | (1L << (OUTPUT - 192)) | (1L << (HVEC2 - 192)) | (1L << (HVEC3 - 192)) | (1L << (HVEC4 - 192)) | (1L << (FVEC2 - 192)) | (1L << (FVEC3 - 192)) | (1L << (FVEC4 - 192)) | (1L << (SAMPLER3DRECT - 192)) | (1L << (FILTER - 192)) | (1L << (SIZEOF - 192)) | (1L << (CAST - 192)) | (1L << (NAMESPACE - 192)) | (1L << (USING - 192)) | (1L << (PPOP_DEFINED - 192)) | (1L << (HIDDEN_CRLF - 192)) | (1L << (LINE_CONTINUATION - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SINGLELINE_COMMENT - 192)) | (1L << (BOOLCONSTANT - 192)) | (1L << (FLOATCONSTANT - 192)) | (1L << (DOUBLECONSTANT - 192)) | (1L << (INTCONSTANT - 192)) | (1L << (UINTCONSTANT - 192)) | (1L << (CHARACTER_CONSTANT - 192)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (STD_HEADER_NAME - 192)) | (1L << (PREFIXED_STRING_LITERAL - 192)) | (1L << (LEFT_OP - 192)) | (1L << (RIGHT_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (DEC_OP - 192)) | (1L << (LE_OP - 192)) | (1L << (GE_OP - 192)) | (1L << (EQ_OP - 192)) | (1L << (NE_OP - 192)) | (1L << (AND_OP - 192)) | (1L << (OR_OP - 192)) | (1L << (XOR_OP - 192)) | (1L << (MUL_ASSIGN - 192)) | (1L << (DIV_ASSIGN - 192)) | (1L << (ADD_ASSIGN - 192)) | (1L << (MOD_ASSIGN - 192)) | (1L << (LEFT_ASSIGN - 192)) | (1L << (RIGHT_ASSIGN - 192)) | (1L << (AND_ASSIGN - 192)) | (1L << (XOR_ASSIGN - 192)) | (1L << (OR_ASSIGN - 192)) | (1L << (SUB_ASSIGN - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (RIGHT_PAREN - 192)) | (1L << (LEFT_BRACKET - 192)) | (1L << (RIGHT_BRACKET - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (RIGHT_BRACE - 192)) | (1L << (DOT - 192)) | (1L << (COMMA - 192)) | (1L << (COLON - 192)) | (1L << (EQUAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SEMICOLON - 256)) | (1L << (BANG - 256)) | (1L << (DASH - 256)) | (1L << (TILDE - 256)) | (1L << (PLUS - 256)) | (1L << (STAR - 256)) | (1L << (SLASH - 256)) | (1L << (PERCENT - 256)) | (1L << (LEFT_ANGLE - 256)) | (1L << (RIGHT_ANGLE - 256)) | (1L << (VERTICAL_BAR - 256)) | (1L << (CARET - 256)) | (1L << (AMPERSAND - 256)) | (1L << (QUESTION - 256)) | (1L << (HASH - 256)) | (1L << (PPOP_CONCAT - 256)) | (1L << (DOTS - 256)) | (1L << (DOUBLE_QUOTE - 256)) | (1L << (SINGLE_QUOTE - 256)) | (1L << (TYPE_NAME - 256)) | (1L << (FUNCTION_NAME - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (PPINCLUDE - 256)) | (1L << (PPDEFINE - 256)) | (1L << (PPUNDEF - 256)) | (1L << (PPIF - 256)) | (1L << (PPIFDEF - 256)) | (1L << (PPIFNDEF - 256)) | (1L << (PPELSE - 256)) | (1L << (PPELIF - 256)) | (1L << (PPENDIF - 256)) | (1L << (PPERROR - 256)) | (1L << (PPPRAGMA - 256)) | (1L << (PPEXTENSION - 256)) | (1L << (PPVERSION - 256)) | (1L << (PPLINE - 256)) | (1L << (PPBUILTIN_LINE - 256)) | (1L << (PPBUILTIN_FILE - 256)) | (1L << (PPBUILTIN_VERSION - 256)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_glslppPreprocessingToken);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				glslppHeaderName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				glslppIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				glslppNumber();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				glslppCharacterConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				glslppStringLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				glslppPunctuator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
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
		enterRule(_localctx, 42, RULE_glslppCharacterConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		enterRule(_localctx, 44, RULE_glslppStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		enterRule(_localctx, 46, RULE_glslppHeaderName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		enterRule(_localctx, 48, RULE_glslppIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 50, RULE_glslppNumber);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				glslUnsignedIntegerConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				glslDoubleConstant();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
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
		enterRule(_localctx, 52, RULE_glslppSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(354);
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
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode PPOP_CONCAT() { return getToken(GLSLPPParser.PPOP_CONCAT, 0); }
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
		enterRule(_localctx, 54, RULE_glslppPunctuator);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(LEFT_BRACKET);
				}
				break;
			case RIGHT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(RIGHT_BRACKET);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(LEFT_PAREN);
				}
				break;
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(LEFT_BRACE);
				}
				break;
			case RIGHT_BRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(RIGHT_BRACE);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(DOT);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				match(INC_OP);
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				match(DEC_OP);
				}
				break;
			case AMPERSAND:
				enterOuterAlt(_localctx, 10);
				{
				setState(366);
				match(AMPERSAND);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(367);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(368);
				match(PLUS);
				}
				break;
			case DASH:
				enterOuterAlt(_localctx, 13);
				{
				setState(369);
				match(DASH);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 14);
				{
				setState(370);
				match(TILDE);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 15);
				{
				setState(371);
				match(BANG);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 16);
				{
				setState(372);
				match(SLASH);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 17);
				{
				setState(373);
				match(PERCENT);
				}
				break;
			case LEFT_OP:
				enterOuterAlt(_localctx, 18);
				{
				setState(374);
				match(LEFT_OP);
				}
				break;
			case RIGHT_OP:
				enterOuterAlt(_localctx, 19);
				{
				setState(375);
				match(RIGHT_OP);
				}
				break;
			case LEFT_ANGLE:
				enterOuterAlt(_localctx, 20);
				{
				setState(376);
				match(LEFT_ANGLE);
				setState(377);
				match(RIGHT_ANGLE);
				}
				break;
			case LE_OP:
				enterOuterAlt(_localctx, 21);
				{
				setState(378);
				match(LE_OP);
				}
				break;
			case GE_OP:
				enterOuterAlt(_localctx, 22);
				{
				setState(379);
				match(GE_OP);
				}
				break;
			case EQ_OP:
				enterOuterAlt(_localctx, 23);
				{
				setState(380);
				match(EQ_OP);
				}
				break;
			case NE_OP:
				enterOuterAlt(_localctx, 24);
				{
				setState(381);
				match(NE_OP);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 25);
				{
				setState(382);
				match(CARET);
				}
				break;
			case VERTICAL_BAR:
				enterOuterAlt(_localctx, 26);
				{
				setState(383);
				match(VERTICAL_BAR);
				}
				break;
			case AND_OP:
				enterOuterAlt(_localctx, 27);
				{
				setState(384);
				match(AND_OP);
				}
				break;
			case OR_OP:
				enterOuterAlt(_localctx, 28);
				{
				setState(385);
				match(OR_OP);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 29);
				{
				setState(386);
				match(QUESTION);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 30);
				{
				setState(387);
				match(COLON);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 31);
				{
				setState(388);
				match(SEMICOLON);
				}
				break;
			case DOTS:
				enterOuterAlt(_localctx, 32);
				{
				setState(389);
				match(DOTS);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 33);
				{
				setState(390);
				match(EQUAL);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 34);
				{
				setState(391);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 35);
				{
				setState(392);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 36);
				{
				setState(393);
				match(MOD_ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 37);
				{
				setState(394);
				match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 38);
				{
				setState(395);
				match(SUB_ASSIGN);
				}
				break;
			case LEFT_ASSIGN:
				enterOuterAlt(_localctx, 39);
				{
				setState(396);
				match(LEFT_ASSIGN);
				}
				break;
			case RIGHT_ASSIGN:
				enterOuterAlt(_localctx, 40);
				{
				setState(397);
				match(RIGHT_ASSIGN);
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 41);
				{
				setState(398);
				match(AND_ASSIGN);
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 42);
				{
				setState(399);
				match(XOR_ASSIGN);
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 43);
				{
				setState(400);
				match(OR_ASSIGN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 44);
				{
				setState(401);
				match(COMMA);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 45);
				{
				setState(402);
				match(HASH);
				}
				break;
			case PPOP_CONCAT:
				enterOuterAlt(_localctx, 46);
				{
				setState(403);
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
		public TerminalNode HASH() { return getToken(GLSLPPParser.HASH, 0); }
		public TerminalNode PPOP_CONCAT() { return getToken(GLSLPPParser.PPOP_CONCAT, 0); }
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
		enterRule(_localctx, 56, RULE_glslppUnspecifiedToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (WHITESPACE - 209)) | (1L << (CRLF - 209)) | (1L << (FLOATCONSTANT - 209)) | (1L << (DOUBLECONSTANT - 209)) | (1L << (INTCONSTANT - 209)) | (1L << (UINTCONSTANT - 209)) | (1L << (CHARACTER_CONSTANT - 209)) | (1L << (PREFIXED_CHARACTER_CONSTANT - 209)) | (1L << (STRING_LITERAL - 209)) | (1L << (STD_HEADER_NAME - 209)) | (1L << (PREFIXED_STRING_LITERAL - 209)) | (1L << (LEFT_OP - 209)) | (1L << (RIGHT_OP - 209)) | (1L << (INC_OP - 209)) | (1L << (DEC_OP - 209)) | (1L << (LE_OP - 209)) | (1L << (GE_OP - 209)) | (1L << (EQ_OP - 209)) | (1L << (NE_OP - 209)) | (1L << (AND_OP - 209)) | (1L << (OR_OP - 209)) | (1L << (MUL_ASSIGN - 209)) | (1L << (DIV_ASSIGN - 209)) | (1L << (ADD_ASSIGN - 209)) | (1L << (MOD_ASSIGN - 209)) | (1L << (LEFT_ASSIGN - 209)) | (1L << (RIGHT_ASSIGN - 209)) | (1L << (AND_ASSIGN - 209)) | (1L << (XOR_ASSIGN - 209)) | (1L << (OR_ASSIGN - 209)) | (1L << (SUB_ASSIGN - 209)) | (1L << (LEFT_PAREN - 209)) | (1L << (RIGHT_PAREN - 209)) | (1L << (LEFT_BRACKET - 209)) | (1L << (RIGHT_BRACKET - 209)) | (1L << (LEFT_BRACE - 209)) | (1L << (RIGHT_BRACE - 209)) | (1L << (DOT - 209)) | (1L << (COMMA - 209)) | (1L << (COLON - 209)) | (1L << (EQUAL - 209)) | (1L << (SEMICOLON - 209)) | (1L << (BANG - 209)) | (1L << (DASH - 209)) | (1L << (TILDE - 209)) | (1L << (PLUS - 209)) | (1L << (STAR - 209)) | (1L << (SLASH - 209)) | (1L << (PERCENT - 209)) | (1L << (LEFT_ANGLE - 209)) | (1L << (VERTICAL_BAR - 209)) | (1L << (CARET - 209)) | (1L << (AMPERSAND - 209)) | (1L << (QUESTION - 209)) | (1L << (HASH - 209)) | (1L << (PPOP_CONCAT - 209)) | (1L << (DOTS - 209)))) != 0) || _la==IDENTIFIER) ) {
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
		enterRule(_localctx, 58, RULE_glslFieldSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		enterRule(_localctx, 60, RULE_glslVariableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		public TerminalNode TYPE_NAME() { return getToken(GLSLPPParser.TYPE_NAME, 0); }
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
		enterRule(_localctx, 62, RULE_glslTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		public TerminalNode FUNCTION_NAME() { return getToken(GLSLPPParser.FUNCTION_NAME, 0); }
		public GlslFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionNameContext glslFunctionName() throws RecognitionException {
		GlslFunctionNameContext _localctx = new GlslFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_glslFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		public TerminalNode BOOLCONSTANT() { return getToken(GLSLPPParser.BOOLCONSTANT, 0); }
		public GlslBoolConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslBoolConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslBoolConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslBoolConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslBoolConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslBoolConstantContext glslBoolConstant() throws RecognitionException {
		GlslBoolConstantContext _localctx = new GlslBoolConstantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_glslBoolConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		enterRule(_localctx, 68, RULE_glslIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		enterRule(_localctx, 70, RULE_glslUnsignedIntegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 72, RULE_glslFloatConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 74, RULE_glslDoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 76, RULE_glslPrimaryExpression);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				glslVariableIdentifier();
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				glslFunctionName();
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				glslFloatConstant();
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				glslDoubleConstant();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				glslIntegerConstant();
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				glslUnsignedIntegerConstant();
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				glslBoolConstant();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
				match(LEFT_PAREN);
				setState(434);
				glslExpression(0);
				setState(435);
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
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLPPParser.LEFT_BRACKET, 0); }
		public GlslIntegerExpressionContext glslIntegerExpression() {
			return getRuleContext(GlslIntegerExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLPPParser.RIGHT_BRACKET, 0); }
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_glslPostfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
				setState(440);
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
				setState(441);
				glslTypeSpecifier();
				setState(442);
				glslConstructorCallArguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(446);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(447);
						glslFunctionCallArguments();
						}
						break;
					case 2:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(448);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(449);
						match(LEFT_BRACKET);
						setState(450);
						glslIntegerExpression();
						setState(451);
						match(RIGHT_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(453);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(454);
						match(DOT);
						setState(455);
						glslFieldSelection();
						}
						break;
					case 4:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(456);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(457);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new GlslPostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslPostfixExpression);
						setState(458);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(459);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 80, RULE_glslConstructorCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		enterRule(_localctx, 82, RULE_glslFunctionCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 84, RULE_glslCallArguments);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(LEFT_PAREN);
				setState(470);
				glslAssignmentExpression();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(471);
					match(COMMA);
					setState(472);
					glslAssignmentExpression();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(LEFT_PAREN);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOID) {
					{
					setState(481);
					match(VOID);
					}
				}

				setState(484);
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
		enterRule(_localctx, 86, RULE_glslIntegerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		public TerminalNode PPOP_DEFINED() { return getToken(GLSLPPParser.PPOP_DEFINED, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLPPParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLPPParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 88, RULE_glslUnaryExpression);
		try {
			setState(504);
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
				setState(489);
				glslPostfixExpression(0);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(INC_OP);
				setState(491);
				glslUnaryExpression();
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(DEC_OP);
				setState(493);
				glslUnaryExpression();
				}
				break;
			case BANG:
			case DASH:
			case TILDE:
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				glslUnaryOperator();
				setState(495);
				glslUnaryExpression();
				}
				break;
			case PPOP_DEFINED:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				match(PPOP_DEFINED);
				setState(502);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
					{
					{
					setState(498);
					match(LEFT_PAREN);
					setState(499);
					match(IDENTIFIER);
					setState(500);
					match(RIGHT_PAREN);
					}
					}
					break;
				case IDENTIFIER:
					{
					setState(501);
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
		enterRule(_localctx, 90, RULE_glslUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !(((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (BANG - 257)) | (1L << (DASH - 257)) | (1L << (TILDE - 257)) | (1L << (PLUS - 257)))) != 0)) ) {
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_glslMultiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(509);
			glslUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(511);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(512);
						match(STAR);
						setState(513);
						glslUnaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(514);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(515);
						match(SLASH);
						setState(516);
						glslUnaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new GlslMultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslMultiplicativeExpression);
						setState(517);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(518);
						match(PERCENT);
						setState(519);
						glslUnaryExpression();
						}
						break;
					}
					} 
				}
				setState(524);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_glslAdditiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(526);
			glslMultiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(528);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(529);
						match(PLUS);
						setState(530);
						glslMultiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslAdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslAdditiveExpression);
						setState(531);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(532);
						match(DASH);
						setState(533);
						glslMultiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(538);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_glslShiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(540);
			glslAdditiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(548);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(542);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(543);
						match(LEFT_OP);
						setState(544);
						glslAdditiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslShiftExpression);
						setState(545);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(546);
						match(RIGHT_OP);
						setState(547);
						glslAdditiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(552);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_glslRelationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(554);
			glslShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(568);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(556);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(557);
						match(LEFT_ANGLE);
						setState(558);
						glslShiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(559);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(560);
						match(RIGHT_ANGLE);
						setState(561);
						glslShiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(562);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(563);
						match(LE_OP);
						setState(564);
						glslShiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GlslRelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslRelationalExpression);
						setState(565);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(566);
						match(GE_OP);
						setState(567);
						glslShiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(572);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_glslEqualityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(574);
			glslRelationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(582);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(576);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(577);
						match(EQ_OP);
						setState(578);
						glslRelationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlslEqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_glslEqualityExpression);
						setState(579);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(580);
						match(NE_OP);
						setState(581);
						glslRelationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(586);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_glslAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(588);
			glslEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslAndExpression);
					setState(590);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(591);
					match(AMPERSAND);
					setState(592);
					glslEqualityExpression(0);
					}
					} 
				}
				setState(597);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_glslExclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(599);
			glslAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExclusiveOrExpression);
					setState(601);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(602);
					match(CARET);
					setState(603);
					glslAndExpression(0);
					}
					} 
				}
				setState(608);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_glslInclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(610);
			glslExclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslInclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslInclusiveOrExpression);
					setState(612);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(613);
					match(VERTICAL_BAR);
					setState(614);
					glslExclusiveOrExpression(0);
					}
					} 
				}
				setState(619);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_glslLogicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(621);
			glslInclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalAndExpression);
					setState(623);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(624);
					match(AND_OP);
					setState(625);
					glslInclusiveOrExpression(0);
					}
					} 
				}
				setState(630);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_glslLogicalXorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(632);
			glslLogicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalXorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalXorExpression);
					setState(634);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(635);
					match(XOR_OP);
					setState(636);
					glslLogicalAndExpression(0);
					}
					} 
				}
				setState(641);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_glslLogicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(643);
			glslLogicalXorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslLogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslLogicalOrExpression);
					setState(645);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(646);
					match(OR_OP);
					setState(647);
					glslLogicalXorExpression(0);
					}
					} 
				}
				setState(652);
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
		enterRule(_localctx, 114, RULE_glslConditionalExpression);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				glslLogicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				glslLogicalOrExpression(0);
				setState(655);
				match(QUESTION);
				setState(656);
				glslExpression(0);
				setState(657);
				match(COLON);
				setState(658);
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
		enterRule(_localctx, 116, RULE_glslAssignmentExpression);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				glslConditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				glslUnaryExpression();
				setState(664);
				glslAssignmentOperator();
				setState(665);
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
		enterRule(_localctx, 118, RULE_glslAssignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_la = _input.LA(1);
			if ( !(((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (MUL_ASSIGN - 236)) | (1L << (DIV_ASSIGN - 236)) | (1L << (ADD_ASSIGN - 236)) | (1L << (MOD_ASSIGN - 236)) | (1L << (LEFT_ASSIGN - 236)) | (1L << (RIGHT_ASSIGN - 236)) | (1L << (AND_ASSIGN - 236)) | (1L << (XOR_ASSIGN - 236)) | (1L << (OR_ASSIGN - 236)) | (1L << (SUB_ASSIGN - 236)) | (1L << (EQUAL - 236)))) != 0)) ) {
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_glslExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(672);
			glslAssignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlslExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_glslExpression);
					setState(674);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(675);
					match(COMMA);
					setState(676);
					glslAssignmentExpression();
					}
					} 
				}
				setState(681);
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
		enterRule(_localctx, 122, RULE_glslConstantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
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
		public List<TerminalNode> COMMA() { return getTokens(GLSLPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLPPParser.COMMA, i);
		}
		public GlslFunctionNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslFunctionNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslFunctionNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslFunctionNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslFunctionNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslFunctionNameListContext glslFunctionNameList() throws RecognitionException {
		GlslFunctionNameListContext _localctx = new GlslFunctionNameListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_glslFunctionNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			glslFunctionName();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(685);
				match(COMMA);
				setState(686);
				glslFunctionName();
				}
				}
				setState(691);
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
		enterRule(_localctx, 126, RULE_glslTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			glslTypeSpecifierNonarray();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(693);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslArrayDimensionsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslArrayDimensionsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslArrayDimensionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslArrayDimensionsListContext glslArrayDimensionsList() throws RecognitionException {
		GlslArrayDimensionsListContext _localctx = new GlslArrayDimensionsListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_glslArrayDimensionsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(696);
				glslArrayDimension();
				}
				}
				setState(699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_BRACKET );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLPPParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLPPParser.RIGHT_BRACKET, 0); }
		public GlslConstantExpressionContext glslConstantExpression() {
			return getRuleContext(GlslConstantExpressionContext.class,0);
		}
		public GlslArrayDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslArrayDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslArrayDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslArrayDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslArrayDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslArrayDimensionContext glslArrayDimension() throws RecognitionException {
		GlslArrayDimensionContext _localctx = new GlslArrayDimensionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_glslArrayDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(LEFT_BRACKET);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (ATOMIC_UINT - 19)) | (1L << (FLOAT - 19)) | (1L << (DOUBLE - 19)) | (1L << (INT - 19)) | (1L << (VOID - 19)) | (1L << (BOOL - 19)) | (1L << (MAT2 - 19)) | (1L << (MAT3 - 19)) | (1L << (MAT4 - 19)) | (1L << (DMAT2 - 19)) | (1L << (DMAT3 - 19)) | (1L << (DMAT4 - 19)) | (1L << (MAT2X2 - 19)) | (1L << (MAT2X3 - 19)) | (1L << (MAT2X4 - 19)) | (1L << (DMAT2X2 - 19)) | (1L << (DMAT2X3 - 19)) | (1L << (DMAT2X4 - 19)) | (1L << (MAT3X2 - 19)) | (1L << (MAT3X3 - 19)) | (1L << (MAT3X4 - 19)) | (1L << (DMAT3X2 - 19)) | (1L << (DMAT3X3 - 19)) | (1L << (DMAT3X4 - 19)) | (1L << (MAT4X2 - 19)) | (1L << (MAT4X3 - 19)) | (1L << (MAT4X4 - 19)) | (1L << (DMAT4X2 - 19)) | (1L << (DMAT4X3 - 19)) | (1L << (DMAT4X4 - 19)) | (1L << (VEC2 - 19)) | (1L << (VEC3 - 19)) | (1L << (VEC4 - 19)) | (1L << (IVEC2 - 19)) | (1L << (IVEC3 - 19)) | (1L << (IVEC4 - 19)) | (1L << (BVEC2 - 19)) | (1L << (BVEC3 - 19)) | (1L << (BVEC4 - 19)))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (DVEC2 - 83)) | (1L << (DVEC3 - 83)) | (1L << (DVEC4 - 83)) | (1L << (UINT - 83)) | (1L << (UVEC2 - 83)) | (1L << (UVEC3 - 83)) | (1L << (UVEC4 - 83)) | (1L << (SAMPLER1D - 83)) | (1L << (SAMPLER2D - 83)) | (1L << (SAMPLER3D - 83)) | (1L << (SAMPLERCUBE - 83)) | (1L << (SAMPLER1DSHADOW - 83)) | (1L << (SAMPLER2DSHADOW - 83)) | (1L << (SAMPLERCUBESHADOW - 83)) | (1L << (SAMPLER1DARRAY - 83)) | (1L << (SAMPLER2DARRAY - 83)) | (1L << (SAMPLER1DARRAYSHADOW - 83)) | (1L << (SAMPLER2DARRAYSHADOW - 83)) | (1L << (ISAMPLER1D - 83)) | (1L << (ISAMPLER2D - 83)) | (1L << (ISAMPLER3D - 83)) | (1L << (ISAMPLERCUBE - 83)) | (1L << (ISAMPLER1DARRAY - 83)) | (1L << (ISAMPLER2DARRAY - 83)) | (1L << (USAMPLER1D - 83)) | (1L << (USAMPLER2D - 83)) | (1L << (USAMPLER3D - 83)) | (1L << (USAMPLERCUBE - 83)) | (1L << (USAMPLER1DARRAY - 83)) | (1L << (USAMPLER2DARRAY - 83)) | (1L << (SAMPLER2DRECT - 83)) | (1L << (SAMPLER2DRECTSHADOW - 83)) | (1L << (ISAMPLER2DRECT - 83)) | (1L << (USAMPLER2DRECT - 83)) | (1L << (SAMPLERBUFFER - 83)) | (1L << (ISAMPLERBUFFER - 83)) | (1L << (USAMPLERBUFFER - 83)) | (1L << (SAMPLER2DMS - 83)) | (1L << (ISAMPLER2DMS - 83)) | (1L << (USAMPLER2DMS - 83)) | (1L << (SAMPLER2DMSARRAY - 83)) | (1L << (ISAMPLER2DMSARRAY - 83)) | (1L << (USAMPLER2DMSARRAY - 83)) | (1L << (SAMPLERCUBEARRAY - 83)) | (1L << (SAMPLERCUBEARRAYSHADOW - 83)) | (1L << (ISAMPLERCUBEARRAY - 83)) | (1L << (USAMPLERCUBEARRAY - 83)) | (1L << (IMAGE1D - 83)) | (1L << (IIMAGE1D - 83)) | (1L << (UIMAGE1D - 83)) | (1L << (IMAGE2D - 83)) | (1L << (IIMAGE2D - 83)) | (1L << (UIMAGE2D - 83)) | (1L << (IMAGE3D - 83)) | (1L << (IIMAGE3D - 83)) | (1L << (UIMAGE3D - 83)) | (1L << (IMAGE2DRECT - 83)) | (1L << (IIMAGE2DRECT - 83)) | (1L << (UIMAGE2DRECT - 83)) | (1L << (IMAGECUBE - 83)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (IIMAGECUBE - 147)) | (1L << (UIMAGECUBE - 147)) | (1L << (IMAGEBUFFER - 147)) | (1L << (IIMAGEBUFFER - 147)) | (1L << (UIMAGEBUFFER - 147)) | (1L << (IMAGE1DARRAY - 147)) | (1L << (IIMAGE1DARRAY - 147)) | (1L << (UIMAGE1DARRAY - 147)) | (1L << (IMAGE2DARRAY - 147)) | (1L << (IIMAGE2DARRAY - 147)) | (1L << (UIMAGE2DARRAY - 147)) | (1L << (IMAGECUBEARRAY - 147)) | (1L << (IIMAGECUBEARRAY - 147)) | (1L << (UIMAGECUBEARRAY - 147)) | (1L << (IMAGE2DMS - 147)) | (1L << (IIMAGE2DMS - 147)) | (1L << (UIMAGE2DMS - 147)) | (1L << (IMAGE2DMSARRAY - 147)) | (1L << (IIMAGE2DMSARRAY - 147)) | (1L << (UIMAGE2DMSARRAY - 147)) | (1L << (SAMPLEREXTERNALOES - 147)) | (1L << (STRUCT - 147)) | (1L << (PPOP_DEFINED - 147)))) != 0) || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (BOOLCONSTANT - 215)) | (1L << (FLOATCONSTANT - 215)) | (1L << (DOUBLECONSTANT - 215)) | (1L << (INTCONSTANT - 215)) | (1L << (UINTCONSTANT - 215)) | (1L << (INC_OP - 215)) | (1L << (DEC_OP - 215)) | (1L << (LEFT_PAREN - 215)) | (1L << (BANG - 215)) | (1L << (DASH - 215)) | (1L << (TILDE - 215)) | (1L << (PLUS - 215)) | (1L << (TYPE_NAME - 215)) | (1L << (FUNCTION_NAME - 215)) | (1L << (IDENTIFIER - 215)))) != 0)) {
				{
				setState(702);
				glslConstantExpression();
				}
			}

			setState(705);
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
		enterRule(_localctx, 132, RULE_glslTypeSpecifierNonarray);
		try {
			setState(710);
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
				setState(707);
				glslBuiltinType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				glslStructSpecifier();
				}
				break;
			case TYPE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
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
		public GlslBuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslBuiltinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslBuiltinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslBuiltinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslBuiltinTypeContext glslBuiltinType() throws RecognitionException {
		GlslBuiltinTypeContext _localctx = new GlslBuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_glslBuiltinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)))) != 0)) ) {
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
		public TerminalNode STRUCT() { return getToken(GLSLPPParser.STRUCT, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLPPParser.LEFT_BRACE, 0); }
		public GlslStructMemberListContext glslStructMemberList() {
			return getRuleContext(GlslStructMemberListContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLPPParser.RIGHT_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public TerminalNode TYPE_NAME() { return getToken(GLSLPPParser.TYPE_NAME, 0); }
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
		enterRule(_localctx, 136, RULE_glslStructSpecifier);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(STRUCT);
				setState(715);
				match(LEFT_BRACE);
				setState(716);
				glslStructMemberList();
				setState(717);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(STRUCT);
				setState(720);
				match(IDENTIFIER);
				setState(721);
				match(LEFT_BRACE);
				setState(722);
				glslStructMemberList();
				setState(723);
				match(RIGHT_BRACE);
				validator.addDeclaredStruct(_localctx);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(STRUCT);
				setState(727);
				match(TYPE_NAME);
				setState(728);
				match(LEFT_BRACE);
				setState(729);
				glslStructMemberList();
				setState(730);
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
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructMemberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructMemberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberListContext glslStructMemberList() throws RecognitionException {
		GlslStructMemberListContext _localctx = new GlslStructMemberListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_glslStructMemberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(735);
				glslStructMemberGroup();
				}
				}
				setState(738); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << ATOMIC_UINT) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << INVARIANT) | (1L << PRECISE) | (1L << MAT2) | (1L << MAT3) | (1L << MAT4) | (1L << DMAT2) | (1L << DMAT3) | (1L << DMAT4) | (1L << MAT2X2) | (1L << MAT2X3) | (1L << MAT2X4) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << MAT3X2) | (1L << MAT3X3))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MAT3X4 - 64)) | (1L << (DMAT3X2 - 64)) | (1L << (DMAT3X3 - 64)) | (1L << (DMAT3X4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (DMAT4X2 - 64)) | (1L << (DMAT4X3 - 64)) | (1L << (DMAT4X4 - 64)) | (1L << (VEC2 - 64)) | (1L << (VEC3 - 64)) | (1L << (VEC4 - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (BVEC2 - 64)) | (1L << (BVEC3 - 64)) | (1L << (BVEC4 - 64)) | (1L << (DVEC2 - 64)) | (1L << (DVEC3 - 64)) | (1L << (DVEC4 - 64)) | (1L << (UINT - 64)) | (1L << (UVEC2 - 64)) | (1L << (UVEC3 - 64)) | (1L << (UVEC4 - 64)) | (1L << (LOW_PRECISION - 64)) | (1L << (MEDIUM_PRECISION - 64)) | (1L << (HIGH_PRECISION - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (USAMPLER1D - 64)) | (1L << (USAMPLER2D - 64)) | (1L << (USAMPLER3D - 64)) | (1L << (USAMPLERCUBE - 64)) | (1L << (USAMPLER1DARRAY - 64)) | (1L << (USAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (USAMPLER2DRECT - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (USAMPLERBUFFER - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (USAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ISAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (SAMPLERCUBEARRAY - 128)) | (1L << (SAMPLERCUBEARRAYSHADOW - 128)) | (1L << (ISAMPLERCUBEARRAY - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (IMAGE1D - 128)) | (1L << (IIMAGE1D - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (IMAGE2D - 128)) | (1L << (IIMAGE2D - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (IMAGE3D - 128)) | (1L << (IIMAGE3D - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (IMAGE2DRECT - 128)) | (1L << (IIMAGE2DRECT - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (IMAGECUBE - 128)) | (1L << (IIMAGECUBE - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (IMAGEBUFFER - 128)) | (1L << (IIMAGEBUFFER - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (IMAGE1DARRAY - 128)) | (1L << (IIMAGE1DARRAY - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (IMAGE2DARRAY - 128)) | (1L << (IIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (IMAGECUBEARRAY - 128)) | (1L << (IIMAGECUBEARRAY - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (IMAGE2DMS - 128)) | (1L << (IIMAGE2DMS - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (IMAGE2DMSARRAY - 128)) | (1L << (IIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (SAMPLEREXTERNALOES - 128)) | (1L << (STRUCT - 128)))) != 0) || _la==TYPE_NAME );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMICOLON() { return getToken(GLSLPPParser.SEMICOLON, 0); }
		public GlslTypeQualifierContext glslTypeQualifier() {
			return getRuleContext(GlslTypeQualifierContext.class,0);
		}
		public GlslStructMemberGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructMemberGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructMemberGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructMemberGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberGroupContext glslStructMemberGroup() throws RecognitionException {
		GlslStructMemberGroupContext _localctx = new GlslStructMemberGroupContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_glslStructMemberGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOW_PRECISION - 90)) | (1L << (MEDIUM_PRECISION - 90)) | (1L << (HIGH_PRECISION - 90)))) != 0)) {
				{
				setState(740);
				glslTypeQualifier();
				}
			}

			setState(743);
			glslTypeSpecifier();
			setState(744);
			glslStructMemberDeclaratorList();
			setState(745);
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
		public List<TerminalNode> COMMA() { return getTokens(GLSLPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLPPParser.COMMA, i);
		}
		public GlslStructMemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberDeclaratorListContext glslStructMemberDeclaratorList() throws RecognitionException {
		GlslStructMemberDeclaratorListContext _localctx = new GlslStructMemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_glslStructMemberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			glslStructMemberDeclarator();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(748);
				match(COMMA);
				setState(749);
				glslStructMemberDeclarator();
				}
				}
				setState(754);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLPPParser.IDENTIFIER, 0); }
		public GlslArrayDimensionsListContext glslArrayDimensionsList() {
			return getRuleContext(GlslArrayDimensionsListContext.class,0);
		}
		public GlslStructMemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glslStructMemberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).enterGlslStructMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLPPListener ) ((GLSLPPListener)listener).exitGlslStructMemberDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLPPVisitor ) return ((GLSLPPVisitor<? extends T>)visitor).visitGlslStructMemberDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlslStructMemberDeclaratorContext glslStructMemberDeclarator() throws RecognitionException {
		GlslStructMemberDeclaratorContext _localctx = new GlslStructMemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_glslStructMemberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(IDENTIFIER);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(756);
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
		GlslTypeQualifierContext _localctx = new GlslTypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_glslTypeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(759);
				glslSingleTypeQualifier();
				}
				}
				setState(762); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << CONST) | (1L << UNIFORM) | (1L << VARYING) | (1L << BUFFER) | (1L << SHARED) | (1L << COHERENT) | (1L << VOLATILE) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << LAYOUT) | (1L << CENTROID) | (1L << FLAT) | (1L << SMOOTH) | (1L << NOPERSPECTIVE) | (1L << PATCH) | (1L << SAMPLE) | (1L << SUBROUTINE) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << INVARIANT) | (1L << PRECISE))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOW_PRECISION - 90)) | (1L << (MEDIUM_PRECISION - 90)) | (1L << (HIGH_PRECISION - 90)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_glslSingleTypeQualifier);
		try {
			setState(770);
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
				setState(764);
				glslStorageQualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				glslLayoutQualifier();
				}
				break;
			case LOW_PRECISION:
			case MEDIUM_PRECISION:
			case HIGH_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				glslPrecisionQualifier();
				}
				break;
			case FLAT:
			case SMOOTH:
			case NOPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				glslInterpolationQualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				glslInvariantQualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(769);
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
		enterRule(_localctx, 150, RULE_glslInvariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
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
		enterRule(_localctx, 152, RULE_glslInterpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
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
		enterRule(_localctx, 154, RULE_glslLayoutQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(LAYOUT);
			setState(777);
			match(LEFT_PAREN);
			setState(778);
			glslLayoutQualifierIdList();
			setState(779);
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
		public List<TerminalNode> COMMA() { return getTokens(GLSLPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLPPParser.COMMA, i);
		}
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
		GlslLayoutQualifierIdListContext _localctx = new GlslLayoutQualifierIdListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_glslLayoutQualifierIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			glslLayoutQualifierId();
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(782);
				match(COMMA);
				setState(783);
				glslLayoutQualifierId();
				}
				}
				setState(788);
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
		enterRule(_localctx, 158, RULE_glslLayoutQualifierId);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(IDENTIFIER);
				setState(791);
				match(EQUAL);
				setState(792);
				glslConstantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
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
		enterRule(_localctx, 160, RULE_glslPreciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
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
		public GlslFunctionNameListContext glslFunctionNameList() {
			return getRuleContext(GlslFunctionNameListContext.class,0);
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
		enterRule(_localctx, 162, RULE_glslStorageQualifier);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(ATTRIBUTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				match(INOUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(803);
				match(OUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(804);
				match(CENTROID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(805);
				match(PATCH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(806);
				match(SAMPLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(807);
				match(UNIFORM);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(808);
				match(BUFFER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(809);
				match(SHARED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(810);
				match(COHERENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(811);
				match(VOLATILE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(812);
				match(RESTRICT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(813);
				match(READONLY);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(814);
				match(WRITEONLY);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(815);
				match(SUBROUTINE);
				setState(816);
				match(LEFT_PAREN);
				setState(817);
				glslFunctionNameList();
				setState(818);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(820);
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
		enterRule(_localctx, 164, RULE_glslPrecisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOW_PRECISION - 90)) | (1L << (MEDIUM_PRECISION - 90)) | (1L << (HIGH_PRECISION - 90)))) != 0)) ) {
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
		case 11:
			return glslppMacro_sempred((GlslppMacroContext)_localctx, predIndex);
		case 39:
			return glslPostfixExpression_sempred((GlslPostfixExpressionContext)_localctx, predIndex);
		case 46:
			return glslMultiplicativeExpression_sempred((GlslMultiplicativeExpressionContext)_localctx, predIndex);
		case 47:
			return glslAdditiveExpression_sempred((GlslAdditiveExpressionContext)_localctx, predIndex);
		case 48:
			return glslShiftExpression_sempred((GlslShiftExpressionContext)_localctx, predIndex);
		case 49:
			return glslRelationalExpression_sempred((GlslRelationalExpressionContext)_localctx, predIndex);
		case 50:
			return glslEqualityExpression_sempred((GlslEqualityExpressionContext)_localctx, predIndex);
		case 51:
			return glslAndExpression_sempred((GlslAndExpressionContext)_localctx, predIndex);
		case 52:
			return glslExclusiveOrExpression_sempred((GlslExclusiveOrExpressionContext)_localctx, predIndex);
		case 53:
			return glslInclusiveOrExpression_sempred((GlslInclusiveOrExpressionContext)_localctx, predIndex);
		case 54:
			return glslLogicalAndExpression_sempred((GlslLogicalAndExpressionContext)_localctx, predIndex);
		case 55:
			return glslLogicalXorExpression_sempred((GlslLogicalXorExpressionContext)_localctx, predIndex);
		case 56:
			return glslLogicalOrExpression_sempred((GlslLogicalOrExpressionContext)_localctx, predIndex);
		case 60:
			return glslExpression_sempred((GlslExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean glslppMacro_sempred(GlslppMacroContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  hidden(WHITESPACE);
		case 1:
			return !hidden(WHITESPACE);
		}
		return true;
	}
	private boolean glslPostfixExpression_sempred(GlslPostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslMultiplicativeExpression_sempred(GlslMultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslAdditiveExpression_sempred(GlslAdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslShiftExpression_sempred(GlslShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslRelationalExpression_sempred(GlslRelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslEqualityExpression_sempred(GlslEqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslAndExpression_sempred(GlslAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslExclusiveOrExpression_sempred(GlslExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslInclusiveOrExpression_sempred(GlslInclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalAndExpression_sempred(GlslLogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalXorExpression_sempred(GlslLogicalXorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslLogicalOrExpression_sempred(GlslLogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean glslExpression_sempred(GlslExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0128\u033c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\5\3\u00ac\n\3\3\4\6\4\u00af\n\4\r\4\16\4\u00b0\3\5\3\5\3"+
		"\5\5\5\u00b6\n\5\3\6\3\6\5\6\u00ba\n\6\3\6\5\6\u00bd\n\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7\u00c5\n\7\3\7\3\7\3\7\3\7\5\7\u00cb\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00d1\n\7\5\7\u00d3\n\7\3\b\6\b\u00d6\n\b\r\b\16\b\u00d7\3\t\3\t"+
		"\3\t\3\t\5\t\u00de\n\t\3\n\3\n\3\n\5\n\u00e3\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00fa\n\f\3\f\3\f\3\f\5\f\u00ff\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0111\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u011d\n\r\3\16\5\16\u0120\n\16\3\16\3\16\3\16\5\16"+
		"\u0125\n\16\3\16\5\16\u0128\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7"+
		"\21\u0131\n\21\f\21\16\21\u0134\13\21\3\22\3\22\7\22\u0138\n\22\f\22\16"+
		"\22\u013b\13\22\3\22\3\22\5\22\u013f\n\22\3\23\5\23\u0142\n\23\3\23\3"+
		"\23\3\24\5\24\u0147\n\24\3\25\6\25\u014a\n\25\r\25\16\25\u014b\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u0155\n\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0163\n\33\3\34\5\34\u0166\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u0197\n\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u01b8\n(\3)\3)\3)\3)\3)\5)\u01bf\n)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\7)\u01cf\n)\f)\16)\u01d2\13)\3*\3*\3+\3+\3,\3,"+
		"\3,\3,\7,\u01dc\n,\f,\16,\u01df\13,\3,\3,\3,\3,\5,\u01e5\n,\3,\5,\u01e8"+
		"\n,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01f9\n.\5.\u01fb"+
		"\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u020b\n\60\f\60\16\60\u020e\13\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\7\61\u0219\n\61\f\61\16\61\u021c\13\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0227\n\62\f\62\16\62\u022a\13\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u023b\n\63\f\63\16\63\u023e\13\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u0249\n\64\f\64\16\64\u024c\13\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u0254\n\65\f\65\16\65\u0257\13\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u025f\n\66\f\66\16\66\u0262\13\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u026a\n\67\f\67\16\67\u026d\13\67\38\38\38\3"+
		"8\38\38\78\u0275\n8\f8\168\u0278\138\39\39\39\39\39\39\79\u0280\n9\f9"+
		"\169\u0283\139\3:\3:\3:\3:\3:\3:\7:\u028b\n:\f:\16:\u028e\13:\3;\3;\3"+
		";\3;\3;\3;\3;\5;\u0297\n;\3<\3<\3<\3<\3<\5<\u029e\n<\3=\3=\3>\3>\3>\3"+
		">\3>\3>\7>\u02a8\n>\f>\16>\u02ab\13>\3?\3?\3@\3@\3@\7@\u02b2\n@\f@\16"+
		"@\u02b5\13@\3A\3A\5A\u02b9\nA\3B\6B\u02bc\nB\rB\16B\u02bd\3C\3C\5C\u02c2"+
		"\nC\3C\3C\3D\3D\3D\5D\u02c9\nD\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\5F\u02e0\nF\3G\6G\u02e3\nG\rG\16G\u02e4\3H\5"+
		"H\u02e8\nH\3H\3H\3H\3H\3I\3I\3I\7I\u02f1\nI\fI\16I\u02f4\13I\3J\3J\5J"+
		"\u02f8\nJ\3K\6K\u02fb\nK\rK\16K\u02fc\3L\3L\3L\3L\3L\3L\5L\u0305\nL\3"+
		"M\3M\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\7P\u0313\nP\fP\16P\u0316\13P\3Q\3Q"+
		"\3Q\3Q\3Q\5Q\u031d\nQ\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0338\nS\3T\3T\3T\2\17P^`bdfhjlnprzU\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\2\20\3\2\3\6\3\2\7\t\4\2\u0110\u0110\u0118\u0125\3\2\u00d4\u00d4\3\2"+
		"\u00de\u00df\4\2\u00e0\u00e0\u00e2\u00e2\3\2\u00e0\u00e1\4\2\u0104\u0104"+
		"\u0106\u0106\7\2\u00d3\u00d4\u00da\u00ec\u00ee\u010a\u010c\u0112\u0117"+
		"\u0117\3\2\u0103\u0106\4\2\u00ee\u00f7\u0101\u0101\6\2\25\25+/\64[`\u00a9"+
		"\3\2\30\32\3\2\\^\2\u0395\2\u00a8\3\2\2\2\4\u00ab\3\2\2\2\6\u00ae\3\2"+
		"\2\2\b\u00b5\3\2\2\2\n\u00b7\3\2\2\2\f\u00d2\3\2\2\2\16\u00d5\3\2\2\2"+
		"\20\u00d9\3\2\2\2\22\u00df\3\2\2\2\24\u00e4\3\2\2\2\26\u0110\3\2\2\2\30"+
		"\u0112\3\2\2\2\32\u0127\3\2\2\2\34\u0129\3\2\2\2\36\u012b\3\2\2\2 \u012d"+
		"\3\2\2\2\"\u013e\3\2\2\2$\u0141\3\2\2\2&\u0146\3\2\2\2(\u0149\3\2\2\2"+
		"*\u0154\3\2\2\2,\u0156\3\2\2\2.\u0158\3\2\2\2\60\u015a\3\2\2\2\62\u015c"+
		"\3\2\2\2\64\u0162\3\2\2\2\66\u0165\3\2\2\28\u0196\3\2\2\2:\u0198\3\2\2"+
		"\2<\u019a\3\2\2\2>\u019c\3\2\2\2@\u019e\3\2\2\2B\u01a0\3\2\2\2D\u01a2"+
		"\3\2\2\2F\u01a4\3\2\2\2H\u01a6\3\2\2\2J\u01a8\3\2\2\2L\u01aa\3\2\2\2N"+
		"\u01b7\3\2\2\2P\u01be\3\2\2\2R\u01d3\3\2\2\2T\u01d5\3\2\2\2V\u01e7\3\2"+
		"\2\2X\u01e9\3\2\2\2Z\u01fa\3\2\2\2\\\u01fc\3\2\2\2^\u01fe\3\2\2\2`\u020f"+
		"\3\2\2\2b\u021d\3\2\2\2d\u022b\3\2\2\2f\u023f\3\2\2\2h\u024d\3\2\2\2j"+
		"\u0258\3\2\2\2l\u0263\3\2\2\2n\u026e\3\2\2\2p\u0279\3\2\2\2r\u0284\3\2"+
		"\2\2t\u0296\3\2\2\2v\u029d\3\2\2\2x\u029f\3\2\2\2z\u02a1\3\2\2\2|\u02ac"+
		"\3\2\2\2~\u02ae\3\2\2\2\u0080\u02b6\3\2\2\2\u0082\u02bb\3\2\2\2\u0084"+
		"\u02bf\3\2\2\2\u0086\u02c8\3\2\2\2\u0088\u02ca\3\2\2\2\u008a\u02df\3\2"+
		"\2\2\u008c\u02e2\3\2\2\2\u008e\u02e7\3\2\2\2\u0090\u02ed\3\2\2\2\u0092"+
		"\u02f5\3\2\2\2\u0094\u02fa\3\2\2\2\u0096\u0304\3\2\2\2\u0098\u0306\3\2"+
		"\2\2\u009a\u0308\3\2\2\2\u009c\u030a\3\2\2\2\u009e\u030f\3\2\2\2\u00a0"+
		"\u031c\3\2\2\2\u00a2\u031e\3\2\2\2\u00a4\u0337\3\2\2\2\u00a6\u0339\3\2"+
		"\2\2\u00a8\u00a9\5\4\3\2\u00a9\3\3\2\2\2\u00aa\u00ac\5\6\4\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\5\3\2\2\2\u00ad\u00af\5\b\5\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\7\3\2\2\2\u00b2\u00b6\5\n\6\2\u00b3\u00b6\5\26\f\2\u00b4\u00b6"+
		"\5\"\22\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\t\3\2\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00ba\5\16\b\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\5\22\n\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\5\24\13\2\u00bf\13\3\2\2\2\u00c0\u00c1\7\u011b\2\2\u00c1\u00c2\5|?\2"+
		"\u00c2\u00c4\7\u00d4\2\2\u00c3\u00c5\5\6\4\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00d3\3\2\2\2\u00c6\u00c7\7\u011c\2\2\u00c7\u00c8"+
		"\5\62\32\2\u00c8\u00ca\7\u00d4\2\2\u00c9\u00cb\5\6\4\2\u00ca\u00c9\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d3\3\2\2\2\u00cc\u00cd\7\u011d\2\2\u00cd"+
		"\u00ce\5\62\32\2\u00ce\u00d0\7\u00d4\2\2\u00cf\u00d1\5\6\4\2\u00d0\u00cf"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c0\3\2\2\2\u00d2"+
		"\u00c6\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d3\r\3\2\2\2\u00d4\u00d6\5\20\t"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\17\3\2\2\2\u00d9\u00da\7\u011f\2\2\u00da\u00db\5|?\2\u00db"+
		"\u00dd\7\u00d4\2\2\u00dc\u00de\5\6\4\2\u00dd\u00dc\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\21\3\2\2\2\u00df\u00e0\7\u011e\2\2\u00e0\u00e2\7\u00d4"+
		"\2\2\u00e1\u00e3\5\6\4\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\23\3\2\2\2\u00e4\u00e5\7\u0120\2\2\u00e5\u00e6\7\u00d4\2\2\u00e6\25\3"+
		"\2\2\2\u00e7\u00e8\7\u0118\2\2\u00e8\u00e9\5\60\31\2\u00e9\u00ea\7\u00d4"+
		"\2\2\u00ea\u0111\3\2\2\2\u00eb\u00ec\7\u0119\2\2\u00ec\u00ed\5\30\r\2"+
		"\u00ed\u00ee\7\u00d4\2\2\u00ee\u0111\3\2\2\2\u00ef\u00f0\7\u011a\2\2\u00f0"+
		"\u00f1\5\62\32\2\u00f1\u00f2\7\u00d4\2\2\u00f2\u0111\3\2\2\2\u00f3\u00f4"+
		"\7\u0125\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\7\u00d4\2\2\u00f6\u0111\3"+
		"\2\2\2\u00f7\u00f9\7\u0121\2\2\u00f8\u00fa\5(\25\2\u00f9\u00f8\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0111\7\u00d4\2\2\u00fc"+
		"\u00fe\7\u0122\2\2\u00fd\u00ff\5(\25\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0111\7\u00d4\2\2\u0101\u0102\7\u0123"+
		"\2\2\u0102\u0103\5\62\32\2\u0103\u0104\7\u0100\2\2\u0104\u0105\5\34\17"+
		"\2\u0105\u0106\7\u00d4\2\2\u0106\u0111\3\2\2\2\u0107\u0108\7\u0124\2\2"+
		"\u0108\u0109\5F$\2\u0109\u010a\5\36\20\2\u010a\u010b\7\u00d4\2\2\u010b"+
		"\u0111\3\2\2\2\u010c\u010d\7\u0110\2\2\u010d\u0111\7\u00d4\2\2\u010e\u010f"+
		"\7\u0110\2\2\u010f\u0111\5$\23\2\u0110\u00e7\3\2\2\2\u0110\u00eb\3\2\2"+
		"\2\u0110\u00ef\3\2\2\2\u0110\u00f3\3\2\2\2\u0110\u00f7\3\2\2\2\u0110\u00fc"+
		"\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\27\3\2\2\2\u0112\u011c\7\u0117\2\2\u0113\u0114\6"+
		"\r\2\2\u0114\u011d\5&\24\2\u0115\u0116\6\r\3\2\u0116\u0117\7\u00f8\2\2"+
		"\u0117\u0118\5\32\16\2\u0118\u0119\7\u00f9\2\2\u0119\u011a\5&\24\2\u011a"+
		"\u011d\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0113\3\2\2\2\u011c\u0115\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\31\3\2\2\2\u011e\u0120\5 \21\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0128\3\2\2\2\u0121\u0122\5 \21\2\u0122"+
		"\u0123\7\u00ff\2\2\u0123\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\7\u0112\2\2\u0127\u011f\3\2\2"+
		"\2\u0127\u0124\3\2\2\2\u0128\33\3\2\2\2\u0129\u012a\t\2\2\2\u012a\35\3"+
		"\2\2\2\u012b\u012c\t\3\2\2\u012c\37\3\2\2\2\u012d\u0132\7\u0117\2\2\u012e"+
		"\u012f\7\u00ff\2\2\u012f\u0131\7\u0117\2\2\u0130\u012e\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133!\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0139\n\4\2\2\u0136\u0138\n\5\2\2\u0137\u0136\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013f\7\u00d4\2\2\u013d\u013f"+
		"\7\u00d4\2\2\u013e\u0135\3\2\2\2\u013e\u013d\3\2\2\2\u013f#\3\2\2\2\u0140"+
		"\u0142\5(\25\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\7\u00d4\2\2\u0144%\3\2\2\2\u0145\u0147\5(\25\2\u0146"+
		"\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\'\3\2\2\2\u0148\u014a\5*\26\2"+
		"\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c)\3\2\2\2\u014d\u0155\5\60\31\2\u014e\u0155\5\62\32\2\u014f"+
		"\u0155\5\64\33\2\u0150\u0155\5,\27\2\u0151\u0155\5.\30\2\u0152\u0155\5"+
		"8\35\2\u0153\u0155\5:\36\2\u0154\u014d\3\2\2\2\u0154\u014e\3\2\2\2\u0154"+
		"\u014f\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0153\3\2\2\2\u0155+\3\2\2\2\u0156\u0157\t\6\2\2\u0157-\3\2"+
		"\2\2\u0158\u0159\t\7\2\2\u0159/\3\2\2\2\u015a\u015b\t\b\2\2\u015b\61\3"+
		"\2\2\2\u015c\u015d\7\u0117\2\2\u015d\63\3\2\2\2\u015e\u0163\5F$\2\u015f"+
		"\u0163\5H%\2\u0160\u0163\5L\'\2\u0161\u0163\5J&\2\u0162\u015e\3\2\2\2"+
		"\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\65"+
		"\3\2\2\2\u0164\u0166\t\t\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\67\3\2\2\2\u0167\u0197\7\u00fa\2\2\u0168\u0197\7\u00fb\2\2\u0169\u0197"+
		"\7\u00f8\2\2\u016a\u0197\7\u00f9\2\2\u016b\u0197\7\u00fc\2\2\u016c\u0197"+
		"\7\u00fd\2\2\u016d\u0197\7\u00fe\2\2\u016e\u0197\7\u00e5\2\2\u016f\u0197"+
		"\7\u00e6\2\2\u0170\u0197\7\u010e\2\2\u0171\u0197\7\u0107\2\2\u0172\u0197"+
		"\7\u0106\2\2\u0173\u0197\7\u0104\2\2\u0174\u0197\7\u0105\2\2\u0175\u0197"+
		"\7\u0103\2\2\u0176\u0197\7\u0108\2\2\u0177\u0197\7\u0109\2\2\u0178\u0197"+
		"\7\u00e3\2\2\u0179\u0197\7\u00e4\2\2\u017a\u017b\7\u010a\2\2\u017b\u0197"+
		"\7\u010b\2\2\u017c\u0197\7\u00e7\2\2\u017d\u0197\7\u00e8\2\2\u017e\u0197"+
		"\7\u00e9\2\2\u017f\u0197\7\u00ea\2\2\u0180\u0197\7\u010d\2\2\u0181\u0197"+
		"\7\u010c\2\2\u0182\u0197\7\u00eb\2\2\u0183\u0197\7\u00ec\2\2\u0184\u0197"+
		"\7\u010f\2\2\u0185\u0197\7\u0100\2\2\u0186\u0197\7\u0102\2\2\u0187\u0197"+
		"\7\u0112\2\2\u0188\u0197\7\u0101\2\2\u0189\u0197\7\u00ee\2\2\u018a\u0197"+
		"\7\u00ef\2\2\u018b\u0197\7\u00f1\2\2\u018c\u0197\7\u00f0\2\2\u018d\u0197"+
		"\7\u00f7\2\2\u018e\u0197\7\u00f2\2\2\u018f\u0197\7\u00f3\2\2\u0190\u0197"+
		"\7\u00f4\2\2\u0191\u0197\7\u00f5\2\2\u0192\u0197\7\u00f6\2\2\u0193\u0197"+
		"\7\u00ff\2\2\u0194\u0197\7\u0110\2\2\u0195\u0197\7\u0111\2\2\u0196\u0167"+
		"\3\2\2\2\u0196\u0168\3\2\2\2\u0196\u0169\3\2\2\2\u0196\u016a\3\2\2\2\u0196"+
		"\u016b\3\2\2\2\u0196\u016c\3\2\2\2\u0196\u016d\3\2\2\2\u0196\u016e\3\2"+
		"\2\2\u0196\u016f\3\2\2\2\u0196\u0170\3\2\2\2\u0196\u0171\3\2\2\2\u0196"+
		"\u0172\3\2\2\2\u0196\u0173\3\2\2\2\u0196\u0174\3\2\2\2\u0196\u0175\3\2"+
		"\2\2\u0196\u0176\3\2\2\2\u0196\u0177\3\2\2\2\u0196\u0178\3\2\2\2\u0196"+
		"\u0179\3\2\2\2\u0196\u017a\3\2\2\2\u0196\u017c\3\2\2\2\u0196\u017d\3\2"+
		"\2\2\u0196\u017e\3\2\2\2\u0196\u017f\3\2\2\2\u0196\u0180\3\2\2\2\u0196"+
		"\u0181\3\2\2\2\u0196\u0182\3\2\2\2\u0196\u0183\3\2\2\2\u0196\u0184\3\2"+
		"\2\2\u0196\u0185\3\2\2\2\u0196\u0186\3\2\2\2\u0196\u0187\3\2\2\2\u0196"+
		"\u0188\3\2\2\2\u0196\u0189\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u018b\3\2"+
		"\2\2\u0196\u018c\3\2\2\2\u0196\u018d\3\2\2\2\u0196\u018e\3\2\2\2\u0196"+
		"\u018f\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196\u0192\3\2"+
		"\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"9\3\2\2\2\u0198\u0199\n\n\2\2\u0199;\3\2\2\2\u019a\u019b\7\u0117\2\2\u019b"+
		"=\3\2\2\2\u019c\u019d\7\u0117\2\2\u019d?\3\2\2\2\u019e\u019f\7\u0115\2"+
		"\2\u019fA\3\2\2\2\u01a0\u01a1\7\u0116\2\2\u01a1C\3\2\2\2\u01a2\u01a3\7"+
		"\u00d9\2\2\u01a3E\3\2\2\2\u01a4\u01a5\7\u00dc\2\2\u01a5G\3\2\2\2\u01a6"+
		"\u01a7\7\u00dd\2\2\u01a7I\3\2\2\2\u01a8\u01a9\7\u00da\2\2\u01a9K\3\2\2"+
		"\2\u01aa\u01ab\7\u00db\2\2\u01abM\3\2\2\2\u01ac\u01b8\5> \2\u01ad\u01b8"+
		"\5B\"\2\u01ae\u01b8\5J&\2\u01af\u01b8\5L\'\2\u01b0\u01b8\5F$\2\u01b1\u01b8"+
		"\5H%\2\u01b2\u01b8\5D#\2\u01b3\u01b4\7\u00f8\2\2\u01b4\u01b5\5z>\2\u01b5"+
		"\u01b6\7\u00f9\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01ac\3\2\2\2\u01b7\u01ad"+
		"\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7"+
		"\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8O\3\2\2\2"+
		"\u01b9\u01ba\b)\1\2\u01ba\u01bf\5N(\2\u01bb\u01bc\5\u0080A\2\u01bc\u01bd"+
		"\5R*\2\u01bd\u01bf\3\2\2\2\u01be\u01b9\3\2\2\2\u01be\u01bb\3\2\2\2\u01bf"+
		"\u01d0\3\2\2\2\u01c0\u01c1\f\7\2\2\u01c1\u01cf\5T+\2\u01c2\u01c3\f\6\2"+
		"\2\u01c3\u01c4\7\u00fa\2\2\u01c4\u01c5\5X-\2\u01c5\u01c6\7\u00fb\2\2\u01c6"+
		"\u01cf\3\2\2\2\u01c7\u01c8\f\5\2\2\u01c8\u01c9\7\u00fe\2\2\u01c9\u01cf"+
		"\5<\37\2\u01ca\u01cb\f\4\2\2\u01cb\u01cf\7\u00e5\2\2\u01cc\u01cd\f\3\2"+
		"\2\u01cd\u01cf\7\u00e6\2\2\u01ce\u01c0\3\2\2\2\u01ce\u01c2\3\2\2\2\u01ce"+
		"\u01c7\3\2\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1Q\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d3\u01d4\5V,\2\u01d4S\3\2\2\2\u01d5\u01d6\5V,\2\u01d6U\3\2"+
		"\2\2\u01d7\u01d8\7\u00f8\2\2\u01d8\u01dd\5v<\2\u01d9\u01da\7\u00ff\2\2"+
		"\u01da\u01dc\5v<\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e1\7\u00f9\2\2\u01e1\u01e8\3\2\2\2\u01e2\u01e4\7\u00f8\2\2\u01e3\u01e5"+
		"\7.\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\7\u00f9\2\2\u01e7\u01d7\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e8W\3\2"+
		"\2\2\u01e9\u01ea\5z>\2\u01eaY\3\2\2\2\u01eb\u01fb\5P)\2\u01ec\u01ed\7"+
		"\u00e5\2\2\u01ed\u01fb\5Z.\2\u01ee\u01ef\7\u00e6\2\2\u01ef\u01fb\5Z.\2"+
		"\u01f0\u01f1\5\\/\2\u01f1\u01f2\5Z.\2\u01f2\u01fb\3\2\2\2\u01f3\u01f8"+
		"\7\u00d2\2\2\u01f4\u01f5\7\u00f8\2\2\u01f5\u01f6\7\u0117\2\2\u01f6\u01f9"+
		"\7\u00f9\2\2\u01f7\u01f9\7\u0117\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f7\3"+
		"\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01eb\3\2\2\2\u01fa\u01ec\3\2\2\2\u01fa"+
		"\u01ee\3\2\2\2\u01fa\u01f0\3\2\2\2\u01fa\u01f3\3\2\2\2\u01fb[\3\2\2\2"+
		"\u01fc\u01fd\t\13\2\2\u01fd]\3\2\2\2\u01fe\u01ff\b\60\1\2\u01ff\u0200"+
		"\5Z.\2\u0200\u020c\3\2\2\2\u0201\u0202\f\5\2\2\u0202\u0203\7\u0107\2\2"+
		"\u0203\u020b\5Z.\2\u0204\u0205\f\4\2\2\u0205\u0206\7\u0108\2\2\u0206\u020b"+
		"\5Z.\2\u0207\u0208\f\3\2\2\u0208\u0209\7\u0109\2\2\u0209\u020b\5Z.\2\u020a"+
		"\u0201\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2\2\2\u020b\u020e\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d_\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020f\u0210\b\61\1\2\u0210\u0211\5^\60\2\u0211\u021a\3\2\2\2"+
		"\u0212\u0213\f\4\2\2\u0213\u0214\7\u0106\2\2\u0214\u0219\5^\60\2\u0215"+
		"\u0216\f\3\2\2\u0216\u0217\7\u0104\2\2\u0217\u0219\5^\60\2\u0218\u0212"+
		"\3\2\2\2\u0218\u0215\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021ba\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\b\62\1\2"+
		"\u021e\u021f\5`\61\2\u021f\u0228\3\2\2\2\u0220\u0221\f\4\2\2\u0221\u0222"+
		"\7\u00e3\2\2\u0222\u0227\5`\61\2\u0223\u0224\f\3\2\2\u0224\u0225\7\u00e4"+
		"\2\2\u0225\u0227\5`\61\2\u0226\u0220\3\2\2\2\u0226\u0223\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229c\3\2\2\2"+
		"\u022a\u0228\3\2\2\2\u022b\u022c\b\63\1\2\u022c\u022d\5b\62\2\u022d\u023c"+
		"\3\2\2\2\u022e\u022f\f\6\2\2\u022f\u0230\7\u010a\2\2\u0230\u023b\5b\62"+
		"\2\u0231\u0232\f\5\2\2\u0232\u0233\7\u010b\2\2\u0233\u023b\5b\62\2\u0234"+
		"\u0235\f\4\2\2\u0235\u0236\7\u00e7\2\2\u0236\u023b\5b\62\2\u0237\u0238"+
		"\f\3\2\2\u0238\u0239\7\u00e8\2\2\u0239\u023b\5b\62\2\u023a\u022e\3\2\2"+
		"\2\u023a\u0231\3\2\2\2\u023a\u0234\3\2\2\2\u023a\u0237\3\2\2\2\u023b\u023e"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023de\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023f\u0240\b\64\1\2\u0240\u0241\5d\63\2\u0241\u024a\3"+
		"\2\2\2\u0242\u0243\f\4\2\2\u0243\u0244\7\u00e9\2\2\u0244\u0249\5d\63\2"+
		"\u0245\u0246\f\3\2\2\u0246\u0247\7\u00ea\2\2\u0247\u0249\5d\63\2\u0248"+
		"\u0242\3\2\2\2\u0248\u0245\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024bg\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e"+
		"\b\65\1\2\u024e\u024f\5f\64\2\u024f\u0255\3\2\2\2\u0250\u0251\f\3\2\2"+
		"\u0251\u0252\7\u010e\2\2\u0252\u0254\5f\64\2\u0253\u0250\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256i\3\2\2\2"+
		"\u0257\u0255\3\2\2\2\u0258\u0259\b\66\1\2\u0259\u025a\5h\65\2\u025a\u0260"+
		"\3\2\2\2\u025b\u025c\f\3\2\2\u025c\u025d\7\u010d\2\2\u025d\u025f\5h\65"+
		"\2\u025e\u025b\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261k\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\b\67\1\2\u0264"+
		"\u0265\5j\66\2\u0265\u026b\3\2\2\2\u0266\u0267\f\3\2\2\u0267\u0268\7\u010c"+
		"\2\2\u0268\u026a\5j\66\2\u0269\u0266\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cm\3\2\2\2\u026d\u026b\3\2\2\2"+
		"\u026e\u026f\b8\1\2\u026f\u0270\5l\67\2\u0270\u0276\3\2\2\2\u0271\u0272"+
		"\f\3\2\2\u0272\u0273\7\u00eb\2\2\u0273\u0275\5l\67\2\u0274\u0271\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277o"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\b9\1\2\u027a\u027b\5n8\2\u027b"+
		"\u0281\3\2\2\2\u027c\u027d\f\3\2\2\u027d\u027e\7\u00ed\2\2\u027e\u0280"+
		"\5n8\2\u027f\u027c\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282q\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\b:\1\2\u0285"+
		"\u0286\5p9\2\u0286\u028c\3\2\2\2\u0287\u0288\f\3\2\2\u0288\u0289\7\u00ec"+
		"\2\2\u0289\u028b\5p9\2\u028a\u0287\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028ds\3\2\2\2\u028e\u028c\3\2\2\2\u028f"+
		"\u0297\5r:\2\u0290\u0291\5r:\2\u0291\u0292\7\u010f\2\2\u0292\u0293\5z"+
		">\2\u0293\u0294\7\u0100\2\2\u0294\u0295\5v<\2\u0295\u0297\3\2\2\2\u0296"+
		"\u028f\3\2\2\2\u0296\u0290\3\2\2\2\u0297u\3\2\2\2\u0298\u029e\5t;\2\u0299"+
		"\u029a\5Z.\2\u029a\u029b\5x=\2\u029b\u029c\5v<\2\u029c\u029e\3\2\2\2\u029d"+
		"\u0298\3\2\2\2\u029d\u0299\3\2\2\2\u029ew\3\2\2\2\u029f\u02a0\t\f\2\2"+
		"\u02a0y\3\2\2\2\u02a1\u02a2\b>\1\2\u02a2\u02a3\5v<\2\u02a3\u02a9\3\2\2"+
		"\2\u02a4\u02a5\f\3\2\2\u02a5\u02a6\7\u00ff\2\2\u02a6\u02a8\5v<\2\u02a7"+
		"\u02a4\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa{\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5t;\2\u02ad}\3\2\2"+
		"\2\u02ae\u02b3\5B\"\2\u02af\u02b0\7\u00ff\2\2\u02b0\u02b2\5B\"\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\177\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b8\5\u0086D\2\u02b7"+
		"\u02b9\5\u0082B\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u0081"+
		"\3\2\2\2\u02ba\u02bc\5\u0084C\2\u02bb\u02ba\3\2\2\2\u02bc\u02bd\3\2\2"+
		"\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u0083\3\2\2\2\u02bf\u02c1"+
		"\7\u00fa\2\2\u02c0\u02c2\5|?\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2"+
		"\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\u00fb\2\2\u02c4\u0085\3\2\2\2\u02c5"+
		"\u02c9\5\u0088E\2\u02c6\u02c9\5\u008aF\2\u02c7\u02c9\5@!\2\u02c8\u02c5"+
		"\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9\u0087\3\2\2\2\u02ca"+
		"\u02cb\t\r\2\2\u02cb\u0089\3\2\2\2\u02cc\u02cd\7\u00aa\2\2\u02cd\u02ce"+
		"\7\u00fc\2\2\u02ce\u02cf\5\u008cG\2\u02cf\u02d0\7\u00fd\2\2\u02d0\u02e0"+
		"\3\2\2\2\u02d1\u02d2\7\u00aa\2\2\u02d2\u02d3\7\u0117\2\2\u02d3\u02d4\7"+
		"\u00fc\2\2\u02d4\u02d5\5\u008cG\2\u02d5\u02d6\7\u00fd\2\2\u02d6\u02d7"+
		"\bF\1\2\u02d7\u02e0\3\2\2\2\u02d8\u02d9\7\u00aa\2\2\u02d9\u02da\7\u0115"+
		"\2\2\u02da\u02db\7\u00fc\2\2\u02db\u02dc\5\u008cG\2\u02dc\u02dd\7\u00fd"+
		"\2\2\u02dd\u02de\bF\1\2\u02de\u02e0\3\2\2\2\u02df\u02cc\3\2\2\2\u02df"+
		"\u02d1\3\2\2\2\u02df\u02d8\3\2\2\2\u02e0\u008b\3\2\2\2\u02e1\u02e3\5\u008e"+
		"H\2\u02e2\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u008d\3\2\2\2\u02e6\u02e8\5\u0094K\2\u02e7\u02e6"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\5\u0080A"+
		"\2\u02ea\u02eb\5\u0090I\2\u02eb\u02ec\7\u0102\2\2\u02ec\u008f\3\2\2\2"+
		"\u02ed\u02f2\5\u0092J\2\u02ee\u02ef\7\u00ff\2\2\u02ef\u02f1\5\u0092J\2"+
		"\u02f0\u02ee\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u0091\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f7\7\u0117\2"+
		"\2\u02f6\u02f8\5\u0082B\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u0093\3\2\2\2\u02f9\u02fb\5\u0096L\2\u02fa\u02f9\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0095\3\2\2\2\u02fe"+
		"\u0305\5\u00a4S\2\u02ff\u0305\5\u009cO\2\u0300\u0305\5\u00a6T\2\u0301"+
		"\u0305\5\u009aN\2\u0302\u0305\5\u0098M\2\u0303\u0305\5\u00a2R\2\u0304"+
		"\u02fe\3\2\2\2\u0304\u02ff\3\2\2\2\u0304\u0300\3\2\2\2\u0304\u0301\3\2"+
		"\2\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u0097\3\2\2\2\u0306"+
		"\u0307\7\60\2\2\u0307\u0099\3\2\2\2\u0308\u0309\t\16\2\2\u0309\u009b\3"+
		"\2\2\2\u030a\u030b\7\26\2\2\u030b\u030c\7\u00f8\2\2\u030c\u030d\5\u009e"+
		"P\2\u030d\u030e\7\u00f9\2\2\u030e\u009d\3\2\2\2\u030f\u0314\5\u00a0Q\2"+
		"\u0310\u0311\7\u00ff\2\2\u0311\u0313\5\u00a0Q\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u009f\3\2"+
		"\2\2\u0316\u0314\3\2\2\2\u0317\u031d\7\u0117\2\2\u0318\u0319\7\u0117\2"+
		"\2\u0319\u031a\7\u0101\2\2\u031a\u031d\5|?\2\u031b\u031d\7\17\2\2\u031c"+
		"\u0317\3\2\2\2\u031c\u0318\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u00a1\3\2"+
		"\2\2\u031e\u031f\7\61\2\2\u031f\u00a3\3\2\2\2\u0320\u0338\7\13\2\2\u0321"+
		"\u0338\7\n\2\2\u0322\u0338\7\r\2\2\u0323\u0338\7*\2\2\u0324\u0338\7(\2"+
		"\2\u0325\u0338\7)\2\2\u0326\u0338\7\27\2\2\u0327\u0338\7\33\2\2\u0328"+
		"\u0338\7\34\2\2\u0329\u0338\7\f\2\2\u032a\u0338\7\16\2\2\u032b\u0338\7"+
		"\17\2\2\u032c\u0338\7\20\2\2\u032d\u0338\7\21\2\2\u032e\u0338\7\22\2\2"+
		"\u032f\u0338\7\23\2\2\u0330\u0338\7\24\2\2\u0331\u0332\7\'\2\2\u0332\u0333"+
		"\7\u00f8\2\2\u0333\u0334\5~@\2\u0334\u0335\7\u00f9\2\2\u0335\u0338\3\2"+
		"\2\2\u0336\u0338\7\'\2\2\u0337\u0320\3\2\2\2\u0337\u0321\3\2\2\2\u0337"+
		"\u0322\3\2\2\2\u0337\u0323\3\2\2\2\u0337\u0324\3\2\2\2\u0337\u0325\3\2"+
		"\2\2\u0337\u0326\3\2\2\2\u0337\u0327\3\2\2\2\u0337\u0328\3\2\2\2\u0337"+
		"\u0329\3\2\2\2\u0337\u032a\3\2\2\2\u0337\u032b\3\2\2\2\u0337\u032c\3\2"+
		"\2\2\u0337\u032d\3\2\2\2\u0337\u032e\3\2\2\2\u0337\u032f\3\2\2\2\u0337"+
		"\u0330\3\2\2\2\u0337\u0331\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u00a5\3\2"+
		"\2\2\u0339\u033a\t\17\2\2\u033a\u00a7\3\2\2\2J\u00ab\u00b0\u00b5\u00b9"+
		"\u00bc\u00c4\u00ca\u00d0\u00d2\u00d7\u00dd\u00e2\u00f9\u00fe\u0110\u011c"+
		"\u011f\u0124\u0127\u0132\u0139\u013e\u0141\u0146\u014b\u0154\u0162\u0165"+
		"\u0196\u01b7\u01be\u01ce\u01d0\u01dd\u01e4\u01e7\u01f8\u01fa\u020a\u020c"+
		"\u0218\u021a\u0226\u0228\u023a\u023c\u0248\u024a\u0255\u0260\u026b\u0276"+
		"\u0281\u028c\u0296\u029d\u02a9\u02b3\u02b8\u02bd\u02c1\u02c8\u02df\u02e4"+
		"\u02e7\u02f2\u02f7\u02fc\u0304\u0314\u031c\u0337";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}