// Generated from grammar/GLSL.g4 by ANTLR 4.7
package org.cakelab.glsl.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ATTRIBUTE", "CONST", "UNIFORM", "VARYING", "BUFFER", "SHARED", "COHERENT", 
		"VOLATILE", "RESTRICT", "READONLY", "WRITEONLY", "ATOMIC_UINT", "LAYOUT", 
		"CENTROID", "FLAT", "SMOOTH", "NOPERSPECTIVE", "PATCH", "SAMPLE", "BREAK", 
		"CONTINUE", "DO", "FOR", "WHILE", "SWITCH", "CASE", "DEFAULT", "IF", "ELSE", 
		"SUBROUTINE", "IN", "OUT", "INOUT", "FLOAT", "DOUBLE", "INT", "VOID", 
		"BOOL", "TRUE", "FALSE", "INVARIANT", "PRECISE", "DISCARD", "RETURN", 
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
		"FLOATCONSTANT", "DOUBLECONSTANT", "FLOATRAW", "HEXFLOATRAW", "EXPONENT", 
		"BINARY_EXPONENT", "INTCONSTANT", "UINTCONSTANT", "CHARACTER_CONSTANT", 
		"PREFIXED_CHARACTER_CONSTANT", "STRING_LITERAL", "STD_HEADER_NAME", "PREFIXED_STRING_LITERAL", 
		"LEFT_OP", "RIGHT_OP", "INC_OP", "DEC_OP", "LE_OP", "GE_OP", "EQ_OP", 
		"NE_OP", "AND_OP", "OR_OP", "XOR_OP", "MUL_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", 
		"MOD_ASSIGN", "LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", 
		"OR_ASSIGN", "SUB_ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "DOT", "COMMA", "COLON", 
		"EQUAL", "SEMICOLON", "BANG", "DASH", "TILDE", "PLUS", "STAR", "SLASH", 
		"PERCENT", "LEFT_ANGLE", "RIGHT_ANGLE", "VERTICAL_BAR", "CARET", "AMPERSAND", 
		"QUESTION", "HASH", "PPOP_CONCAT", "DOTS", "DOUBLE_QUOTE", "SINGLE_QUOTE", 
		"TYPE_NAME", "FUNCTION_NAME", "IDENTIFIER", "ENCODING_PREFIX", "S_CHAR_SEQUENCE", 
		"C_CHAR_SEQUENCE", "ESCAPE_SEQUENCE", "UNIVERSAL_CHARACTER_NAME", "HEX_QUAD", 
		"SIMPLE_ESCAPE_SEQUENCE", "OCTAL_ESCAPE_SEQUENCE", "HEXADECIMAL_ESCAPE_SEQUENCE", 
		"S_CHAR", "C_CHAR", "HEXADECIMAL", "OCTAL", "DECIMAL", "OCT_NONZERO", 
		"DEC_NONZERO", "NUMBER", "ALPHA", "SIGN", "NONDIGIT", "OCTAL_DIGIT", "DIGIT", 
		"HEXADECIMAL_DIGIT"
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


		public boolean preprocessing = false;
		public void preprocessing(boolean enable) {
			preprocessing = enable;
		}
		private org.cakelab.glsl.parser.Validator validator = new org.cakelab.glsl.parser.Validator();
		public void setValidator(org.cakelab.glsl.parser.Validator validator) {
			this.validator = validator;
		}
		


	public GLSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 202:
			return PPOP_DEFINED_sempred((RuleContext)_localctx, predIndex);
		case 204:
			return CRLF_sempred((RuleContext)_localctx, predIndex);
		case 205:
			return HIDDEN_CRLF_sempred((RuleContext)_localctx, predIndex);
		case 273:
			return TYPE_NAME_sempred((RuleContext)_localctx, predIndex);
		case 274:
			return FUNCTION_NAME_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean PPOP_DEFINED_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return preprocessing;
		}
		return true;
	}
	private boolean CRLF_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return preprocessing;
		}
		return true;
	}
	private boolean HIDDEN_CRLF_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !preprocessing;
		}
		return true;
	}
	private boolean TYPE_NAME_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !preprocessing && validator.istype(getText());
		}
		return true;
	}
	private boolean FUNCTION_NAME_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !preprocessing && validator.isfunc(getText());
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0110\u0bad\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba"+
		"\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf"+
		"\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3"+
		"\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8"+
		"\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc"+
		"\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1"+
		"\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5"+
		"\4\u00d6\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da"+
		"\t\u00da\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de"+
		"\4\u00df\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3"+
		"\t\u00e3\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7"+
		"\4\u00e8\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec"+
		"\t\u00ec\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0"+
		"\4\u00f1\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5"+
		"\t\u00f5\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9"+
		"\4\u00fa\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe"+
		"\t\u00fe\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102"+
		"\4\u0103\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107"+
		"\t\u0107\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b"+
		"\4\u010c\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110"+
		"\t\u0110\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114"+
		"\4\u0115\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119"+
		"\t\u0119\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d"+
		"\4\u011e\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122"+
		"\t\u0122\4\u0123\t\u0123\4\u0124\t\u0124\4\u0125\t\u0125\4\u0126\t\u0126"+
		"\4\u0127\t\u0127\4\u0128\t\u0128\4\u0129\t\u0129\4\u012a\t\u012a\4\u012b"+
		"\t\u012b\4\u012c\t\u012c\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3"+
		"K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3"+
		"m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\3u\3u\3u\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3~\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\6\u00cd\u09c4\n\u00cd\r\u00cd"+
		"\16\u00cd\u09c5\3\u00cd\3\u00cd\3\u00ce\5\u00ce\u09cb\n\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00cf\5\u00cf\u09d1\n\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09dd"+
		"\n\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\7\u00d1\u09e7\n\u00d1\f\u00d1\16\u00d1\u09ea\13\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u09f5"+
		"\n\u00d2\f\u00d2\16\u00d2\u09f8\13\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a05"+
		"\n\u00d3\3\u00d4\3\u00d4\5\u00d4\u0a09\n\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u0a0d\n\u00d4\3\u00d4\5\u00d4\u0a10\n\u00d4\3\u00d4\3\u00d4\3\u00d5\3"+
		"\u00d5\5\u00d5\u0a16\n\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a1a\n\u00d5\5\u00d5"+
		"\u0a1c\n\u00d5\3\u00d5\5\u00d5\u0a1f\n\u00d5\3\u00d6\6\u00d6\u0a22\n\u00d6"+
		"\r\u00d6\16\u00d6\u0a23\3\u00d6\3\u00d6\7\u00d6\u0a28\n\u00d6\f\u00d6"+
		"\16\u00d6\u0a2b\13\u00d6\3\u00d6\7\u00d6\u0a2e\n\u00d6\f\u00d6\16\u00d6"+
		"\u0a31\13\u00d6\3\u00d6\3\u00d6\6\u00d6\u0a35\n\u00d6\r\u00d6\16\u00d6"+
		"\u0a36\5\u00d6\u0a39\n\u00d6\3\u00d7\3\u00d7\3\u00d7\6\u00d7\u0a3e\n\u00d7"+
		"\r\u00d7\16\u00d7\u0a3f\3\u00d7\3\u00d7\7\u00d7\u0a44\n\u00d7\f\u00d7"+
		"\16\u00d7\u0a47\13\u00d7\3\u00d7\7\u00d7\u0a4a\n\u00d7\f\u00d7\16\u00d7"+
		"\u0a4d\13\u00d7\3\u00d7\3\u00d7\6\u00d7\u0a51\n\u00d7\r\u00d7\16\u00d7"+
		"\u0a52\5\u00d7\u0a55\n\u00d7\3\u00d8\3\u00d8\5\u00d8\u0a59\n\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d9\3\u00d9\5\u00d9\u0a5f\n\u00d9\3\u00d9\3\u00d9\3\u00da"+
		"\3\u00da\5\u00da\u0a65\n\u00da\3\u00db\3\u00db\3\u00db\5\u00db\u0a6a\n"+
		"\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\5\u00dd\u0a7f\n\u00dd\3\u00de\3\u00de\5\u00de\u0a83\n"+
		"\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\5\u00e0\u0a8e\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f6"+
		"\3\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00ff"+
		"\3\u00ff\3\u0100\3\u0100\3\u0101\3\u0101\3\u0102\3\u0102\3\u0103\3\u0103"+
		"\3\u0104\3\u0104\3\u0105\3\u0105\3\u0106\3\u0106\3\u0107\3\u0107\3\u0108"+
		"\3\u0108\3\u0109\3\u0109\3\u010a\3\u010a\3\u010b\3\u010b\3\u010c\3\u010c"+
		"\3\u010d\3\u010d\3\u010e\3\u010e\3\u010f\3\u010f\3\u010f\3\u0110\3\u0110"+
		"\3\u0110\3\u0110\3\u0111\3\u0111\3\u0112\3\u0112\3\u0113\3\u0113\3\u0113"+
		"\3\u0114\3\u0114\3\u0114\3\u0115\3\u0115\3\u0115\7\u0115\u0b19\n\u0115"+
		"\f\u0115\16\u0115\u0b1c\13\u0115\3\u0116\3\u0116\3\u0116\5\u0116\u0b21"+
		"\n\u0116\3\u0117\6\u0117\u0b24\n\u0117\r\u0117\16\u0117\u0b25\3\u0118"+
		"\6\u0118\u0b29\n\u0118\r\u0118\16\u0118\u0b2a\3\u0119\3\u0119\3\u0119"+
		"\3\u0119\5\u0119\u0b31\n\u0119\3\u011a\3\u011a\3\u011a\3\u011a\3\u011a"+
		"\3\u011a\3\u011a\3\u011a\3\u011a\3\u011a\5\u011a\u0b3d\n\u011a\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c"+
		"\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c"+
		"\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\5\u011c"+
		"\u0b5a\n\u011c\3\u011d\3\u011d\3\u011d\3\u011d\5\u011d\u0b60\n\u011d\5"+
		"\u011d\u0b62\n\u011d\3\u011e\3\u011e\3\u011e\3\u011e\6\u011e\u0b68\n\u011e"+
		"\r\u011e\16\u011e\u0b69\3\u011f\3\u011f\3\u011f\3\u011f\5\u011f\u0b70"+
		"\n\u011f\3\u0120\3\u0120\3\u0120\3\u0120\5\u0120\u0b76\n\u0120\3\u0121"+
		"\3\u0121\3\u0121\6\u0121\u0b7b\n\u0121\r\u0121\16\u0121\u0b7c\3\u0122"+
		"\3\u0122\6\u0122\u0b81\n\u0122\r\u0122\16\u0122\u0b82\3\u0123\3\u0123"+
		"\3\u0123\7\u0123\u0b88\n\u0123\f\u0123\16\u0123\u0b8b\13\u0123\5\u0123"+
		"\u0b8d\n\u0123\3\u0124\3\u0124\3\u0125\3\u0125\5\u0125\u0b93\n\u0125\3"+
		"\u0126\3\u0126\3\u0126\5\u0126\u0b98\n\u0126\3\u0127\3\u0127\3\u0128\3"+
		"\u0128\3\u0129\3\u0129\5\u0129\u0ba0\n\u0129\3\u012a\3\u012a\5\u012a\u0ba4"+
		"\n\u012a\3\u012b\3\u012b\5\u012b\u0ba8\n\u012b\3\u012c\3\u012c\5\u012c"+
		"\u0bac\n\u012c\2\2\u012d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*W+Y,[-]._/a\60c\61"+
		"e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087"+
		"C\u0089D\u008bE\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099L\u009b"+
		"M\u009dN\u009fO\u00a1P\u00a3Q\u00a5R\u00a7S\u00a9T\u00abU\u00adV\u00af"+
		"W\u00b1X\u00b3Y\u00b5Z\u00b7[\u00b9\\\u00bb]\u00bd^\u00bf_\u00c1`\u00c3"+
		"a\u00c5b\u00c7c\u00c9d\u00cbe\u00cdf\u00cfg\u00d1h\u00d3i\u00d5j\u00d7"+
		"k\u00d9l\u00dbm\u00ddn\u00dfo\u00e1p\u00e3q\u00e5r\u00e7s\u00e9t\u00eb"+
		"u\u00edv\u00efw\u00f1x\u00f3y\u00f5z\u00f7{\u00f9|\u00fb}\u00fd~\u00ff"+
		"\177\u0101\u0080\u0103\u0081\u0105\u0082\u0107\u0083\u0109\u0084\u010b"+
		"\u0085\u010d\u0086\u010f\u0087\u0111\u0088\u0113\u0089\u0115\u008a\u0117"+
		"\u008b\u0119\u008c\u011b\u008d\u011d\u008e\u011f\u008f\u0121\u0090\u0123"+
		"\u0091\u0125\u0092\u0127\u0093\u0129\u0094\u012b\u0095\u012d\u0096\u012f"+
		"\u0097\u0131\u0098\u0133\u0099\u0135\u009a\u0137\u009b\u0139\u009c\u013b"+
		"\u009d\u013d\u009e\u013f\u009f\u0141\u00a0\u0143\u00a1\u0145\u00a2\u0147"+
		"\u00a3\u0149\u00a4\u014b\u00a5\u014d\u00a6\u014f\u00a7\u0151\u00a8\u0153"+
		"\u00a9\u0155\u00aa\u0157\u00ab\u0159\u00ac\u015b\u00ad\u015d\u00ae\u015f"+
		"\u00af\u0161\u00b0\u0163\u00b1\u0165\u00b2\u0167\u00b3\u0169\u00b4\u016b"+
		"\u00b5\u016d\u00b6\u016f\u00b7\u0171\u00b8\u0173\u00b9\u0175\u00ba\u0177"+
		"\u00bb\u0179\u00bc\u017b\u00bd\u017d\u00be\u017f\u00bf\u0181\u00c0\u0183"+
		"\u00c1\u0185\u00c2\u0187\u00c3\u0189\u00c4\u018b\u00c5\u018d\u00c6\u018f"+
		"\u00c7\u0191\u00c8\u0193\u00c9\u0195\u00ca\u0197\u00cb\u0199\u00cc\u019b"+
		"\u00cd\u019d\u00ce\u019f\u00cf\u01a1\u00d0\u01a3\u00d1\u01a5\u00d2\u01a7"+
		"\u00d3\u01a9\u00d4\u01ab\2\u01ad\2\u01af\2\u01b1\2\u01b3\u00d5\u01b5\u00d6"+
		"\u01b7\u00d7\u01b9\u00d8\u01bb\u00d9\u01bd\u00da\u01bf\u00db\u01c1\u00dc"+
		"\u01c3\u00dd\u01c5\u00de\u01c7\u00df\u01c9\u00e0\u01cb\u00e1\u01cd\u00e2"+
		"\u01cf\u00e3\u01d1\u00e4\u01d3\u00e5\u01d5\u00e6\u01d7\u00e7\u01d9\u00e8"+
		"\u01db\u00e9\u01dd\u00ea\u01df\u00eb\u01e1\u00ec\u01e3\u00ed\u01e5\u00ee"+
		"\u01e7\u00ef\u01e9\u00f0\u01eb\u00f1\u01ed\u00f2\u01ef\u00f3\u01f1\u00f4"+
		"\u01f3\u00f5\u01f5\u00f6\u01f7\u00f7\u01f9\u00f8\u01fb\u00f9\u01fd\u00fa"+
		"\u01ff\u00fb\u0201\u00fc\u0203\u00fd\u0205\u00fe\u0207\u00ff\u0209\u0100"+
		"\u020b\u0101\u020d\u0102\u020f\u0103\u0211\u0104\u0213\u0105\u0215\u0106"+
		"\u0217\u0107\u0219\u0108\u021b\u0109\u021d\u010a\u021f\u010b\u0221\u010c"+
		"\u0223\u010d\u0225\u010e\u0227\u010f\u0229\u0110\u022b\2\u022d\2\u022f"+
		"\2\u0231\2\u0233\2\u0235\2\u0237\2\u0239\2\u023b\2\u023d\2\u023f\2\u0241"+
		"\2\u0243\2\u0245\2\u0247\2\u0249\2\u024b\2\u024d\2\u024f\2\u0251\2\u0253"+
		"\2\u0255\2\u0257\2\3\2\24\4\2\13\13\"\"\3\2,,\3\2\61\61\3\2\f\f\4\2HH"+
		"hh\4\2NNnn\4\2ZZzz\4\2GGgg\4\2RRrr\4\2WWww\5\2NNWWww\5\2\f\f$$^^\5\2\f"+
		"\f))^^\3\2\639\3\2:;\4\2C\\c|\4\2--//\4\2CHch\2\u0bd8\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed"+
		"\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff"+
		"\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2"+
		"\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111"+
		"\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2"+
		"\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123"+
		"\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2"+
		"\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135"+
		"\3\2\2\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2"+
		"\2\2\u013f\3\2\2\2\2\u0141\3\2\2\2\2\u0143\3\2\2\2\2\u0145\3\2\2\2\2\u0147"+
		"\3\2\2\2\2\u0149\3\2\2\2\2\u014b\3\2\2\2\2\u014d\3\2\2\2\2\u014f\3\2\2"+
		"\2\2\u0151\3\2\2\2\2\u0153\3\2\2\2\2\u0155\3\2\2\2\2\u0157\3\2\2\2\2\u0159"+
		"\3\2\2\2\2\u015b\3\2\2\2\2\u015d\3\2\2\2\2\u015f\3\2\2\2\2\u0161\3\2\2"+
		"\2\2\u0163\3\2\2\2\2\u0165\3\2\2\2\2\u0167\3\2\2\2\2\u0169\3\2\2\2\2\u016b"+
		"\3\2\2\2\2\u016d\3\2\2\2\2\u016f\3\2\2\2\2\u0171\3\2\2\2\2\u0173\3\2\2"+
		"\2\2\u0175\3\2\2\2\2\u0177\3\2\2\2\2\u0179\3\2\2\2\2\u017b\3\2\2\2\2\u017d"+
		"\3\2\2\2\2\u017f\3\2\2\2\2\u0181\3\2\2\2\2\u0183\3\2\2\2\2\u0185\3\2\2"+
		"\2\2\u0187\3\2\2\2\2\u0189\3\2\2\2\2\u018b\3\2\2\2\2\u018d\3\2\2\2\2\u018f"+
		"\3\2\2\2\2\u0191\3\2\2\2\2\u0193\3\2\2\2\2\u0195\3\2\2\2\2\u0197\3\2\2"+
		"\2\2\u0199\3\2\2\2\2\u019b\3\2\2\2\2\u019d\3\2\2\2\2\u019f\3\2\2\2\2\u01a1"+
		"\3\2\2\2\2\u01a3\3\2\2\2\2\u01a5\3\2\2\2\2\u01a7\3\2\2\2\2\u01a9\3\2\2"+
		"\2\2\u01b3\3\2\2\2\2\u01b5\3\2\2\2\2\u01b7\3\2\2\2\2\u01b9\3\2\2\2\2\u01bb"+
		"\3\2\2\2\2\u01bd\3\2\2\2\2\u01bf\3\2\2\2\2\u01c1\3\2\2\2\2\u01c3\3\2\2"+
		"\2\2\u01c5\3\2\2\2\2\u01c7\3\2\2\2\2\u01c9\3\2\2\2\2\u01cb\3\2\2\2\2\u01cd"+
		"\3\2\2\2\2\u01cf\3\2\2\2\2\u01d1\3\2\2\2\2\u01d3\3\2\2\2\2\u01d5\3\2\2"+
		"\2\2\u01d7\3\2\2\2\2\u01d9\3\2\2\2\2\u01db\3\2\2\2\2\u01dd\3\2\2\2\2\u01df"+
		"\3\2\2\2\2\u01e1\3\2\2\2\2\u01e3\3\2\2\2\2\u01e5\3\2\2\2\2\u01e7\3\2\2"+
		"\2\2\u01e9\3\2\2\2\2\u01eb\3\2\2\2\2\u01ed\3\2\2\2\2\u01ef\3\2\2\2\2\u01f1"+
		"\3\2\2\2\2\u01f3\3\2\2\2\2\u01f5\3\2\2\2\2\u01f7\3\2\2\2\2\u01f9\3\2\2"+
		"\2\2\u01fb\3\2\2\2\2\u01fd\3\2\2\2\2\u01ff\3\2\2\2\2\u0201\3\2\2\2\2\u0203"+
		"\3\2\2\2\2\u0205\3\2\2\2\2\u0207\3\2\2\2\2\u0209\3\2\2\2\2\u020b\3\2\2"+
		"\2\2\u020d\3\2\2\2\2\u020f\3\2\2\2\2\u0211\3\2\2\2\2\u0213\3\2\2\2\2\u0215"+
		"\3\2\2\2\2\u0217\3\2\2\2\2\u0219\3\2\2\2\2\u021b\3\2\2\2\2\u021d\3\2\2"+
		"\2\2\u021f\3\2\2\2\2\u0221\3\2\2\2\2\u0223\3\2\2\2\2\u0225\3\2\2\2\2\u0227"+
		"\3\2\2\2\2\u0229\3\2\2\2\3\u0259\3\2\2\2\5\u0263\3\2\2\2\7\u0269\3\2\2"+
		"\2\t\u0271\3\2\2\2\13\u0279\3\2\2\2\r\u0280\3\2\2\2\17\u0287\3\2\2\2\21"+
		"\u0290\3\2\2\2\23\u0299\3\2\2\2\25\u02a2\3\2\2\2\27\u02ab\3\2\2\2\31\u02b5"+
		"\3\2\2\2\33\u02c1\3\2\2\2\35\u02c8\3\2\2\2\37\u02d1\3\2\2\2!\u02d6\3\2"+
		"\2\2#\u02dd\3\2\2\2%\u02eb\3\2\2\2\'\u02f1\3\2\2\2)\u02f8\3\2\2\2+\u02fe"+
		"\3\2\2\2-\u0307\3\2\2\2/\u030a\3\2\2\2\61\u030e\3\2\2\2\63\u0314\3\2\2"+
		"\2\65\u031b\3\2\2\2\67\u0320\3\2\2\29\u0328\3\2\2\2;\u032b\3\2\2\2=\u0330"+
		"\3\2\2\2?\u033b\3\2\2\2A\u033e\3\2\2\2C\u0342\3\2\2\2E\u0348\3\2\2\2G"+
		"\u034e\3\2\2\2I\u0355\3\2\2\2K\u0359\3\2\2\2M\u035e\3\2\2\2O\u0363\3\2"+
		"\2\2Q\u0368\3\2\2\2S\u036e\3\2\2\2U\u0378\3\2\2\2W\u0380\3\2\2\2Y\u0388"+
		"\3\2\2\2[\u038f\3\2\2\2]\u0394\3\2\2\2_\u0399\3\2\2\2a\u039e\3\2\2\2c"+
		"\u03a4\3\2\2\2e\u03aa\3\2\2\2g\u03b0\3\2\2\2i\u03b7\3\2\2\2k\u03be\3\2"+
		"\2\2m\u03c5\3\2\2\2o\u03cd\3\2\2\2q\u03d5\3\2\2\2s\u03dd\3\2\2\2u\u03e4"+
		"\3\2\2\2w\u03eb\3\2\2\2y\u03f2\3\2\2\2{\u03fa\3\2\2\2}\u0402\3\2\2\2\177"+
		"\u040a\3\2\2\2\u0081\u0411\3\2\2\2\u0083\u0418\3\2\2\2\u0085\u041f\3\2"+
		"\2\2\u0087\u0427\3\2\2\2\u0089\u042f\3\2\2\2\u008b\u0437\3\2\2\2\u008d"+
		"\u043c\3\2\2\2\u008f\u0441\3\2\2\2\u0091\u0446\3\2\2\2\u0093\u044c\3\2"+
		"\2\2\u0095\u0452\3\2\2\2\u0097\u0458\3\2\2\2\u0099\u045e\3\2\2\2\u009b"+
		"\u0464\3\2\2\2\u009d\u046a\3\2\2\2\u009f\u0470\3\2\2\2\u00a1\u0476\3\2"+
		"\2\2\u00a3\u047c\3\2\2\2\u00a5\u0481\3\2\2\2\u00a7\u0487\3\2\2\2\u00a9"+
		"\u048d\3\2\2\2\u00ab\u0493\3\2\2\2\u00ad\u0498\3\2\2\2\u00af\u04a0\3\2"+
		"\2\2\u00b1\u04a6\3\2\2\2\u00b3\u04b0\3\2\2\2\u00b5\u04ba\3\2\2\2\u00b7"+
		"\u04c4\3\2\2\2\u00b9\u04ce\3\2\2\2\u00bb\u04da\3\2\2\2\u00bd\u04ea\3\2"+
		"\2\2\u00bf\u04fa\3\2\2\2\u00c1\u050c\3\2\2\2\u00c3\u051b\3\2\2\2\u00c5"+
		"\u052a\3\2\2\2\u00c7\u053f\3\2\2\2\u00c9\u0554\3\2\2\2\u00cb\u055f\3\2"+
		"\2\2\u00cd\u056a\3\2\2\2\u00cf\u0575\3\2\2\2\u00d1\u0582\3\2\2\2\u00d3"+
		"\u0592\3\2\2\2\u00d5\u05a2\3\2\2\2\u00d7\u05ad\3\2\2\2\u00d9\u05b8\3\2"+
		"\2\2\u00db\u05c3\3\2\2\2\u00dd\u05d0\3\2\2\2\u00df\u05e0\3\2\2\2\u00e1"+
		"\u05f0\3\2\2\2\u00e3\u05fe\3\2\2\2\u00e5\u0612\3\2\2\2\u00e7\u0621\3\2"+
		"\2\2\u00e9\u0630\3\2\2\2\u00eb\u063e\3\2\2\2\u00ed\u064d\3\2\2\2\u00ef"+
		"\u065c\3\2\2\2\u00f1\u0668\3\2\2\2\u00f3\u0675\3\2\2\2\u00f5\u0682\3\2"+
		"\2\2\u00f7\u0693\3\2\2\2\u00f9\u06a5\3\2\2\2\u00fb\u06b7\3\2\2\2\u00fd"+
		"\u06c8\3\2\2\2\u00ff\u06df\3\2\2\2\u0101\u06f1\3\2\2\2\u0103\u0703\3\2"+
		"\2\2\u0105\u070b\3\2\2\2\u0107\u0714\3\2\2\2\u0109\u071d\3\2\2\2\u010b"+
		"\u0725\3\2\2\2\u010d\u072e\3\2\2\2\u010f\u0737\3\2\2\2\u0111\u073f\3\2"+
		"\2\2\u0113\u0748\3\2\2\2\u0115\u0751\3\2\2\2\u0117\u075d\3\2\2\2\u0119"+
		"\u076a\3\2\2\2\u011b\u0777\3\2\2\2\u011d\u0781\3\2\2\2\u011f\u078c\3\2"+
		"\2\2\u0121\u0797\3\2\2\2\u0123\u07a3\3\2\2\2\u0125\u07b0\3\2\2\2\u0127"+
		"\u07bd\3\2\2\2\u0129\u07ca\3\2\2\2\u012b\u07d8\3\2\2\2\u012d\u07e6\3\2"+
		"\2\2\u012f\u07f3\3\2\2\2\u0131\u0801\3\2\2\2\u0133\u080f\3\2\2\2\u0135"+
		"\u081e\3\2\2\2\u0137\u082e\3\2\2\2\u0139\u083e\3\2\2\2\u013b\u0848\3\2"+
		"\2\2\u013d\u0853\3\2\2\2\u013f\u085e\3\2\2\2\u0141\u086d\3\2\2\2\u0143"+
		"\u087d\3\2\2\2\u0145\u088d\3\2\2\2\u0147\u08a0\3\2\2\2\u0149\u08a7\3\2"+
		"\2\2\u014b\u08ae\3\2\2\2\u014d\u08b8\3\2\2\2\u014f\u08bf\3\2\2\2\u0151"+
		"\u08c3\3\2\2\2\u0153\u08c9\3\2\2\2\u0155\u08cf\3\2\2\2\u0157\u08d4\3\2"+
		"\2\2\u0159\u08dc\3\2\2\2\u015b\u08e5\3\2\2\2\u015d\u08ea\3\2\2\2\u015f"+
		"\u08f3\3\2\2\2\u0161\u08f8\3\2\2\2\u0163\u08ff\3\2\2\2\u0165\u0908\3\2"+
		"\2\2\u0167\u090f\3\2\2\2\u0169\u0916\3\2\2\2\u016b\u091d\3\2\2\2\u016d"+
		"\u0926\3\2\2\2\u016f\u0930\3\2\2\2\u0171\u0935\3\2\2\2\u0173\u093b\3\2"+
		"\2\2\u0175\u0940\3\2\2\2\u0177\u0946\3\2\2\2\u0179\u094f\3\2\2\2\u017b"+
		"\u0956\3\2\2\2\u017d\u095c\3\2\2\2\u017f\u0963\3\2\2\2\u0181\u0969\3\2"+
		"\2\2\u0183\u096f\3\2\2\2\u0185\u0975\3\2\2\2\u0187\u097b\3\2\2\2\u0189"+
		"\u0981\3\2\2\2\u018b\u0987\3\2\2\2\u018d\u0995\3\2\2\2\u018f\u099c\3\2"+
		"\2\2\u0191\u09a3\3\2\2\2\u0193\u09a8\3\2\2\2\u0195\u09b2\3\2\2\2\u0197"+
		"\u09b8\3\2\2\2\u0199\u09c3\3\2\2\2\u019b\u09ca\3\2\2\2\u019d\u09d0\3\2"+
		"\2\2\u019f\u09dc\3\2\2\2\u01a1\u09e0\3\2\2\2\u01a3\u09f0\3\2\2\2\u01a5"+
		"\u0a04\3\2\2\2\u01a7\u0a0f\3\2\2\2\u01a9\u0a1b\3\2\2\2\u01ab\u0a38\3\2"+
		"\2\2\u01ad\u0a3a\3\2\2\2\u01af\u0a56\3\2\2\2\u01b1\u0a5c\3\2\2\2\u01b3"+
		"\u0a62\3\2\2\2\u01b5\u0a66\3\2\2\2\u01b7\u0a6b\3\2\2\2\u01b9\u0a7e\3\2"+
		"\2\2\u01bb\u0a80\3\2\2\2\u01bd\u0a86\3\2\2\2\u01bf\u0a8a\3\2\2\2\u01c1"+
		"\u0a91\3\2\2\2\u01c3\u0a94\3\2\2\2\u01c5\u0a97\3\2\2\2\u01c7\u0a9a\3\2"+
		"\2\2\u01c9\u0a9d\3\2\2\2\u01cb\u0aa0\3\2\2\2\u01cd\u0aa3\3\2\2\2\u01cf"+
		"\u0aa6\3\2\2\2\u01d1\u0aa9\3\2\2\2\u01d3\u0aac\3\2\2\2\u01d5\u0aaf\3\2"+
		"\2\2\u01d7\u0ab2\3\2\2\2\u01d9\u0ab5\3\2\2\2\u01db\u0ab8\3\2\2\2\u01dd"+
		"\u0abb\3\2\2\2\u01df\u0abe\3\2\2\2\u01e1\u0ac2\3\2\2\2\u01e3\u0ac6\3\2"+
		"\2\2\u01e5\u0ac9\3\2\2\2\u01e7\u0acc\3\2\2\2\u01e9\u0acf\3\2\2\2\u01eb"+
		"\u0ad2\3\2\2\2\u01ed\u0ad4\3\2\2\2\u01ef\u0ad6\3\2\2\2\u01f1\u0ad8\3\2"+
		"\2\2\u01f3\u0ada\3\2\2\2\u01f5\u0adc\3\2\2\2\u01f7\u0ade\3\2\2\2\u01f9"+
		"\u0ae0\3\2\2\2\u01fb\u0ae2\3\2\2\2\u01fd\u0ae4\3\2\2\2\u01ff\u0ae6\3\2"+
		"\2\2\u0201\u0ae8\3\2\2\2\u0203\u0aea\3\2\2\2\u0205\u0aec\3\2\2\2\u0207"+
		"\u0aee\3\2\2\2\u0209\u0af0\3\2\2\2\u020b\u0af2\3\2\2\2\u020d\u0af4\3\2"+
		"\2\2\u020f\u0af6\3\2\2\2\u0211\u0af8\3\2\2\2\u0213\u0afa\3\2\2\2\u0215"+
		"\u0afc\3\2\2\2\u0217\u0afe\3\2\2\2\u0219\u0b00\3\2\2\2\u021b\u0b02\3\2"+
		"\2\2\u021d\u0b04\3\2\2\2\u021f\u0b07\3\2\2\2\u0221\u0b0b\3\2\2\2\u0223"+
		"\u0b0d\3\2\2\2\u0225\u0b0f\3\2\2\2\u0227\u0b12\3\2\2\2\u0229\u0b15\3\2"+
		"\2\2\u022b\u0b20\3\2\2\2\u022d\u0b23\3\2\2\2\u022f\u0b28\3\2\2\2\u0231"+
		"\u0b30\3\2\2\2\u0233\u0b3c\3\2\2\2\u0235\u0b3e\3\2\2\2\u0237\u0b59\3\2"+
		"\2\2\u0239\u0b5b\3\2\2\2\u023b\u0b63\3\2\2\2\u023d\u0b6f\3\2\2\2\u023f"+
		"\u0b75\3\2\2\2\u0241\u0b77\3\2\2\2\u0243\u0b7e\3\2\2\2\u0245\u0b8c\3\2"+
		"\2\2\u0247\u0b8e\3\2\2\2\u0249\u0b92\3\2\2\2\u024b\u0b97\3\2\2\2\u024d"+
		"\u0b99\3\2\2\2\u024f\u0b9b\3\2\2\2\u0251\u0b9f\3\2\2\2\u0253\u0ba3\3\2"+
		"\2\2\u0255\u0ba7\3\2\2\2\u0257\u0bab\3\2\2\2\u0259\u025a\7c\2\2\u025a"+
		"\u025b\7v\2\2\u025b\u025c\7v\2\2\u025c\u025d\7t\2\2\u025d\u025e\7k\2\2"+
		"\u025e\u025f\7d\2\2\u025f\u0260\7w\2\2\u0260\u0261\7v\2\2\u0261\u0262"+
		"\7g\2\2\u0262\4\3\2\2\2\u0263\u0264\7e\2\2\u0264\u0265\7q\2\2\u0265\u0266"+
		"\7p\2\2\u0266\u0267\7u\2\2\u0267\u0268\7v\2\2\u0268\6\3\2\2\2\u0269\u026a"+
		"\7w\2\2\u026a\u026b\7p\2\2\u026b\u026c\7k\2\2\u026c\u026d\7h\2\2\u026d"+
		"\u026e\7q\2\2\u026e\u026f\7t\2\2\u026f\u0270\7o\2\2\u0270\b\3\2\2\2\u0271"+
		"\u0272\7x\2\2\u0272\u0273\7c\2\2\u0273\u0274\7t\2\2\u0274\u0275\7{\2\2"+
		"\u0275\u0276\7k\2\2\u0276\u0277\7p\2\2\u0277\u0278\7i\2\2\u0278\n\3\2"+
		"\2\2\u0279\u027a\7d\2\2\u027a\u027b\7w\2\2\u027b\u027c\7h\2\2\u027c\u027d"+
		"\7h\2\2\u027d\u027e\7g\2\2\u027e\u027f\7t\2\2\u027f\f\3\2\2\2\u0280\u0281"+
		"\7u\2\2\u0281\u0282\7j\2\2\u0282\u0283\7c\2\2\u0283\u0284\7t\2\2\u0284"+
		"\u0285\7g\2\2\u0285\u0286\7f\2\2\u0286\16\3\2\2\2\u0287\u0288\7e\2\2\u0288"+
		"\u0289\7q\2\2\u0289\u028a\7j\2\2\u028a\u028b\7g\2\2\u028b\u028c\7t\2\2"+
		"\u028c\u028d\7g\2\2\u028d\u028e\7p\2\2\u028e\u028f\7v\2\2\u028f\20\3\2"+
		"\2\2\u0290\u0291\7x\2\2\u0291\u0292\7q\2\2\u0292\u0293\7n\2\2\u0293\u0294"+
		"\7c\2\2\u0294\u0295\7v\2\2\u0295\u0296\7k\2\2\u0296\u0297\7n\2\2\u0297"+
		"\u0298\7g\2\2\u0298\22\3\2\2\2\u0299\u029a\7t\2\2\u029a\u029b\7g\2\2\u029b"+
		"\u029c\7u\2\2\u029c\u029d\7v\2\2\u029d\u029e\7t\2\2\u029e\u029f\7k\2\2"+
		"\u029f\u02a0\7e\2\2\u02a0\u02a1\7v\2\2\u02a1\24\3\2\2\2\u02a2\u02a3\7"+
		"t\2\2\u02a3\u02a4\7g\2\2\u02a4\u02a5\7c\2\2\u02a5\u02a6\7f\2\2\u02a6\u02a7"+
		"\7q\2\2\u02a7\u02a8\7p\2\2\u02a8\u02a9\7n\2\2\u02a9\u02aa\7{\2\2\u02aa"+
		"\26\3\2\2\2\u02ab\u02ac\7y\2\2\u02ac\u02ad\7t\2\2\u02ad\u02ae\7k\2\2\u02ae"+
		"\u02af\7v\2\2\u02af\u02b0\7g\2\2\u02b0\u02b1\7q\2\2\u02b1\u02b2\7p\2\2"+
		"\u02b2\u02b3\7n\2\2\u02b3\u02b4\7{\2\2\u02b4\30\3\2\2\2\u02b5\u02b6\7"+
		"c\2\2\u02b6\u02b7\7v\2\2\u02b7\u02b8\7q\2\2\u02b8\u02b9\7o\2\2\u02b9\u02ba"+
		"\7k\2\2\u02ba\u02bb\7e\2\2\u02bb\u02bc\7a\2\2\u02bc\u02bd\7w\2\2\u02bd"+
		"\u02be\7k\2\2\u02be\u02bf\7p\2\2\u02bf\u02c0\7v\2\2\u02c0\32\3\2\2\2\u02c1"+
		"\u02c2\7n\2\2\u02c2\u02c3\7c\2\2\u02c3\u02c4\7{\2\2\u02c4\u02c5\7q\2\2"+
		"\u02c5\u02c6\7w\2\2\u02c6\u02c7\7v\2\2\u02c7\34\3\2\2\2\u02c8\u02c9\7"+
		"e\2\2\u02c9\u02ca\7g\2\2\u02ca\u02cb\7p\2\2\u02cb\u02cc\7v\2\2\u02cc\u02cd"+
		"\7t\2\2\u02cd\u02ce\7q\2\2\u02ce\u02cf\7k\2\2\u02cf\u02d0\7f\2\2\u02d0"+
		"\36\3\2\2\2\u02d1\u02d2\7h\2\2\u02d2\u02d3\7n\2\2\u02d3\u02d4\7c\2\2\u02d4"+
		"\u02d5\7v\2\2\u02d5 \3\2\2\2\u02d6\u02d7\7u\2\2\u02d7\u02d8\7o\2\2\u02d8"+
		"\u02d9\7q\2\2\u02d9\u02da\7q\2\2\u02da\u02db\7v\2\2\u02db\u02dc\7j\2\2"+
		"\u02dc\"\3\2\2\2\u02dd\u02de\7p\2\2\u02de\u02df\7q\2\2\u02df\u02e0\7r"+
		"\2\2\u02e0\u02e1\7g\2\2\u02e1\u02e2\7t\2\2\u02e2\u02e3\7u\2\2\u02e3\u02e4"+
		"\7r\2\2\u02e4\u02e5\7g\2\2\u02e5\u02e6\7e\2\2\u02e6\u02e7\7v\2\2\u02e7"+
		"\u02e8\7k\2\2\u02e8\u02e9\7x\2\2\u02e9\u02ea\7g\2\2\u02ea$\3\2\2\2\u02eb"+
		"\u02ec\7r\2\2\u02ec\u02ed\7c\2\2\u02ed\u02ee\7v\2\2\u02ee\u02ef\7e\2\2"+
		"\u02ef\u02f0\7j\2\2\u02f0&\3\2\2\2\u02f1\u02f2\7u\2\2\u02f2\u02f3\7c\2"+
		"\2\u02f3\u02f4\7o\2\2\u02f4\u02f5\7r\2\2\u02f5\u02f6\7n\2\2\u02f6\u02f7"+
		"\7g\2\2\u02f7(\3\2\2\2\u02f8\u02f9\7d\2\2\u02f9\u02fa\7t\2\2\u02fa\u02fb"+
		"\7g\2\2\u02fb\u02fc\7c\2\2\u02fc\u02fd\7m\2\2\u02fd*\3\2\2\2\u02fe\u02ff"+
		"\7e\2\2\u02ff\u0300\7q\2\2\u0300\u0301\7p\2\2\u0301\u0302\7v\2\2\u0302"+
		"\u0303\7k\2\2\u0303\u0304\7p\2\2\u0304\u0305\7w\2\2\u0305\u0306\7g\2\2"+
		"\u0306,\3\2\2\2\u0307\u0308\7f\2\2\u0308\u0309\7q\2\2\u0309.\3\2\2\2\u030a"+
		"\u030b\7h\2\2\u030b\u030c\7q\2\2\u030c\u030d\7t\2\2\u030d\60\3\2\2\2\u030e"+
		"\u030f\7y\2\2\u030f\u0310\7j\2\2\u0310\u0311\7k\2\2\u0311\u0312\7n\2\2"+
		"\u0312\u0313\7g\2\2\u0313\62\3\2\2\2\u0314\u0315\7u\2\2\u0315\u0316\7"+
		"y\2\2\u0316\u0317\7k\2\2\u0317\u0318\7v\2\2\u0318\u0319\7e\2\2\u0319\u031a"+
		"\7j\2\2\u031a\64\3\2\2\2\u031b\u031c\7e\2\2\u031c\u031d\7c\2\2\u031d\u031e"+
		"\7u\2\2\u031e\u031f\7g\2\2\u031f\66\3\2\2\2\u0320\u0321\7f\2\2\u0321\u0322"+
		"\7g\2\2\u0322\u0323\7h\2\2\u0323\u0324\7c\2\2\u0324\u0325\7w\2\2\u0325"+
		"\u0326\7n\2\2\u0326\u0327\7v\2\2\u03278\3\2\2\2\u0328\u0329\7k\2\2\u0329"+
		"\u032a\7h\2\2\u032a:\3\2\2\2\u032b\u032c\7g\2\2\u032c\u032d\7n\2\2\u032d"+
		"\u032e\7u\2\2\u032e\u032f\7g\2\2\u032f<\3\2\2\2\u0330\u0331\7u\2\2\u0331"+
		"\u0332\7w\2\2\u0332\u0333\7d\2\2\u0333\u0334\7t\2\2\u0334\u0335\7q\2\2"+
		"\u0335\u0336\7w\2\2\u0336\u0337\7v\2\2\u0337\u0338\7k\2\2\u0338\u0339"+
		"\7p\2\2\u0339\u033a\7g\2\2\u033a>\3\2\2\2\u033b\u033c\7k\2\2\u033c\u033d"+
		"\7p\2\2\u033d@\3\2\2\2\u033e\u033f\7q\2\2\u033f\u0340\7w\2\2\u0340\u0341"+
		"\7v\2\2\u0341B\3\2\2\2\u0342\u0343\7k\2\2\u0343\u0344\7p\2\2\u0344\u0345"+
		"\7q\2\2\u0345\u0346\7w\2\2\u0346\u0347\7v\2\2\u0347D\3\2\2\2\u0348\u0349"+
		"\7h\2\2\u0349\u034a\7n\2\2\u034a\u034b\7q\2\2\u034b\u034c\7c\2\2\u034c"+
		"\u034d\7v\2\2\u034dF\3\2\2\2\u034e\u034f\7f\2\2\u034f\u0350\7q\2\2\u0350"+
		"\u0351\7w\2\2\u0351\u0352\7d\2\2\u0352\u0353\7n\2\2\u0353\u0354\7g\2\2"+
		"\u0354H\3\2\2\2\u0355\u0356\7k\2\2\u0356\u0357\7p\2\2\u0357\u0358\7v\2"+
		"\2\u0358J\3\2\2\2\u0359\u035a\7x\2\2\u035a\u035b\7q\2\2\u035b\u035c\7"+
		"k\2\2\u035c\u035d\7f\2\2\u035dL\3\2\2\2\u035e\u035f\7d\2\2\u035f\u0360"+
		"\7q\2\2\u0360\u0361\7q\2\2\u0361\u0362\7n\2\2\u0362N\3\2\2\2\u0363\u0364"+
		"\7v\2\2\u0364\u0365\7t\2\2\u0365\u0366\7w\2\2\u0366\u0367\7g\2\2\u0367"+
		"P\3\2\2\2\u0368\u0369\7h\2\2\u0369\u036a\7c\2\2\u036a\u036b\7n\2\2\u036b"+
		"\u036c\7u\2\2\u036c\u036d\7g\2\2\u036dR\3\2\2\2\u036e\u036f\7k\2\2\u036f"+
		"\u0370\7p\2\2\u0370\u0371\7x\2\2\u0371\u0372\7c\2\2\u0372\u0373\7t\2\2"+
		"\u0373\u0374\7k\2\2\u0374\u0375\7c\2\2\u0375\u0376\7p\2\2\u0376\u0377"+
		"\7v\2\2\u0377T\3\2\2\2\u0378\u0379\7r\2\2\u0379\u037a\7t\2\2\u037a\u037b"+
		"\7g\2\2\u037b\u037c\7e\2\2\u037c\u037d\7k\2\2\u037d\u037e\7u\2\2\u037e"+
		"\u037f\7g\2\2\u037fV\3\2\2\2\u0380\u0381\7f\2\2\u0381\u0382\7k\2\2\u0382"+
		"\u0383\7u\2\2\u0383\u0384\7e\2\2\u0384\u0385\7c\2\2\u0385\u0386\7t\2\2"+
		"\u0386\u0387\7f\2\2\u0387X\3\2\2\2\u0388\u0389\7t\2\2\u0389\u038a\7g\2"+
		"\2\u038a\u038b\7v\2\2\u038b\u038c\7w\2\2\u038c\u038d\7t\2\2\u038d\u038e"+
		"\7p\2\2\u038eZ\3\2\2\2\u038f\u0390\7o\2\2\u0390\u0391\7c\2\2\u0391\u0392"+
		"\7v\2\2\u0392\u0393\7\64\2\2\u0393\\\3\2\2\2\u0394\u0395\7o\2\2\u0395"+
		"\u0396\7c\2\2\u0396\u0397\7v\2\2\u0397\u0398\7\65\2\2\u0398^\3\2\2\2\u0399"+
		"\u039a\7o\2\2\u039a\u039b\7c\2\2\u039b\u039c\7v\2\2\u039c\u039d\7\66\2"+
		"\2\u039d`\3\2\2\2\u039e\u039f\7f\2\2\u039f\u03a0\7o\2\2\u03a0\u03a1\7"+
		"c\2\2\u03a1\u03a2\7v\2\2\u03a2\u03a3\7\64\2\2\u03a3b\3\2\2\2\u03a4\u03a5"+
		"\7f\2\2\u03a5\u03a6\7o\2\2\u03a6\u03a7\7c\2\2\u03a7\u03a8\7v\2\2\u03a8"+
		"\u03a9\7\65\2\2\u03a9d\3\2\2\2\u03aa\u03ab\7f\2\2\u03ab\u03ac\7o\2\2\u03ac"+
		"\u03ad\7c\2\2\u03ad\u03ae\7v\2\2\u03ae\u03af\7\66\2\2\u03aff\3\2\2\2\u03b0"+
		"\u03b1\7o\2\2\u03b1\u03b2\7c\2\2\u03b2\u03b3\7v\2\2\u03b3\u03b4\7\64\2"+
		"\2\u03b4\u03b5\7z\2\2\u03b5\u03b6\7\64\2\2\u03b6h\3\2\2\2\u03b7\u03b8"+
		"\7o\2\2\u03b8\u03b9\7c\2\2\u03b9\u03ba\7v\2\2\u03ba\u03bb\7\64\2\2\u03bb"+
		"\u03bc\7z\2\2\u03bc\u03bd\7\65\2\2\u03bdj\3\2\2\2\u03be\u03bf\7o\2\2\u03bf"+
		"\u03c0\7c\2\2\u03c0\u03c1\7v\2\2\u03c1\u03c2\7\64\2\2\u03c2\u03c3\7z\2"+
		"\2\u03c3\u03c4\7\66\2\2\u03c4l\3\2\2\2\u03c5\u03c6\7f\2\2\u03c6\u03c7"+
		"\7o\2\2\u03c7\u03c8\7c\2\2\u03c8\u03c9\7v\2\2\u03c9\u03ca\7\64\2\2\u03ca"+
		"\u03cb\7z\2\2\u03cb\u03cc\7\64\2\2\u03ccn\3\2\2\2\u03cd\u03ce\7f\2\2\u03ce"+
		"\u03cf\7o\2\2\u03cf\u03d0\7c\2\2\u03d0\u03d1\7v\2\2\u03d1\u03d2\7\64\2"+
		"\2\u03d2\u03d3\7z\2\2\u03d3\u03d4\7\65\2\2\u03d4p\3\2\2\2\u03d5\u03d6"+
		"\7f\2\2\u03d6\u03d7\7o\2\2\u03d7\u03d8\7c\2\2\u03d8\u03d9\7v\2\2\u03d9"+
		"\u03da\7\64\2\2\u03da\u03db\7z\2\2\u03db\u03dc\7\66\2\2\u03dcr\3\2\2\2"+
		"\u03dd\u03de\7o\2\2\u03de\u03df\7c\2\2\u03df\u03e0\7v\2\2\u03e0\u03e1"+
		"\7\65\2\2\u03e1\u03e2\7z\2\2\u03e2\u03e3\7\64\2\2\u03e3t\3\2\2\2\u03e4"+
		"\u03e5\7o\2\2\u03e5\u03e6\7c\2\2\u03e6\u03e7\7v\2\2\u03e7\u03e8\7\65\2"+
		"\2\u03e8\u03e9\7z\2\2\u03e9\u03ea\7\65\2\2\u03eav\3\2\2\2\u03eb\u03ec"+
		"\7o\2\2\u03ec\u03ed\7c\2\2\u03ed\u03ee\7v\2\2\u03ee\u03ef\7\65\2\2\u03ef"+
		"\u03f0\7z\2\2\u03f0\u03f1\7\66\2\2\u03f1x\3\2\2\2\u03f2\u03f3\7f\2\2\u03f3"+
		"\u03f4\7o\2\2\u03f4\u03f5\7c\2\2\u03f5\u03f6\7v\2\2\u03f6\u03f7\7\65\2"+
		"\2\u03f7\u03f8\7z\2\2\u03f8\u03f9\7\64\2\2\u03f9z\3\2\2\2\u03fa\u03fb"+
		"\7f\2\2\u03fb\u03fc\7o\2\2\u03fc\u03fd\7c\2\2\u03fd\u03fe\7v\2\2\u03fe"+
		"\u03ff\7\65\2\2\u03ff\u0400\7z\2\2\u0400\u0401\7\65\2\2\u0401|\3\2\2\2"+
		"\u0402\u0403\7f\2\2\u0403\u0404\7o\2\2\u0404\u0405\7c\2\2\u0405\u0406"+
		"\7v\2\2\u0406\u0407\7\65\2\2\u0407\u0408\7z\2\2\u0408\u0409\7\66\2\2\u0409"+
		"~\3\2\2\2\u040a\u040b\7o\2\2\u040b\u040c\7c\2\2\u040c\u040d\7v\2\2\u040d"+
		"\u040e\7\66\2\2\u040e\u040f\7z\2\2\u040f\u0410\7\64\2\2\u0410\u0080\3"+
		"\2\2\2\u0411\u0412\7o\2\2\u0412\u0413\7c\2\2\u0413\u0414\7v\2\2\u0414"+
		"\u0415\7\66\2\2\u0415\u0416\7z\2\2\u0416\u0417\7\65\2\2\u0417\u0082\3"+
		"\2\2\2\u0418\u0419\7o\2\2\u0419\u041a\7c\2\2\u041a\u041b\7v\2\2\u041b"+
		"\u041c\7\66\2\2\u041c\u041d\7z\2\2\u041d\u041e\7\66\2\2\u041e\u0084\3"+
		"\2\2\2\u041f\u0420\7f\2\2\u0420\u0421\7o\2\2\u0421\u0422\7c\2\2\u0422"+
		"\u0423\7v\2\2\u0423\u0424\7\66\2\2\u0424\u0425\7z\2\2\u0425\u0426\7\64"+
		"\2\2\u0426\u0086\3\2\2\2\u0427\u0428\7f\2\2\u0428\u0429\7o\2\2\u0429\u042a"+
		"\7c\2\2\u042a\u042b\7v\2\2\u042b\u042c\7\66\2\2\u042c\u042d\7z\2\2\u042d"+
		"\u042e\7\65\2\2\u042e\u0088\3\2\2\2\u042f\u0430\7f\2\2\u0430\u0431\7o"+
		"\2\2\u0431\u0432\7c\2\2\u0432\u0433\7v\2\2\u0433\u0434\7\66\2\2\u0434"+
		"\u0435\7z\2\2\u0435\u0436\7\66\2\2\u0436\u008a\3\2\2\2\u0437\u0438\7x"+
		"\2\2\u0438\u0439\7g\2\2\u0439\u043a\7e\2\2\u043a\u043b\7\64\2\2\u043b"+
		"\u008c\3\2\2\2\u043c\u043d\7x\2\2\u043d\u043e\7g\2\2\u043e\u043f\7e\2"+
		"\2\u043f\u0440\7\65\2\2\u0440\u008e\3\2\2\2\u0441\u0442\7x\2\2\u0442\u0443"+
		"\7g\2\2\u0443\u0444\7e\2\2\u0444\u0445\7\66\2\2\u0445\u0090\3\2\2\2\u0446"+
		"\u0447\7k\2\2\u0447\u0448\7x\2\2\u0448\u0449\7g\2\2\u0449\u044a\7e\2\2"+
		"\u044a\u044b\7\64\2\2\u044b\u0092\3\2\2\2\u044c\u044d\7k\2\2\u044d\u044e"+
		"\7x\2\2\u044e\u044f\7g\2\2\u044f\u0450\7e\2\2\u0450\u0451\7\65\2\2\u0451"+
		"\u0094\3\2\2\2\u0452\u0453\7k\2\2\u0453\u0454\7x\2\2\u0454\u0455\7g\2"+
		"\2\u0455\u0456\7e\2\2\u0456\u0457\7\66\2\2\u0457\u0096\3\2\2\2\u0458\u0459"+
		"\7d\2\2\u0459\u045a\7x\2\2\u045a\u045b\7g\2\2\u045b\u045c\7e\2\2\u045c"+
		"\u045d\7\64\2\2\u045d\u0098\3\2\2\2\u045e\u045f\7d\2\2\u045f\u0460\7x"+
		"\2\2\u0460\u0461\7g\2\2\u0461\u0462\7e\2\2\u0462\u0463\7\65\2\2\u0463"+
		"\u009a\3\2\2\2\u0464\u0465\7d\2\2\u0465\u0466\7x\2\2\u0466\u0467\7g\2"+
		"\2\u0467\u0468\7e\2\2\u0468\u0469\7\66\2\2\u0469\u009c\3\2\2\2\u046a\u046b"+
		"\7f\2\2\u046b\u046c\7x\2\2\u046c\u046d\7g\2\2\u046d\u046e\7e\2\2\u046e"+
		"\u046f\7\64\2\2\u046f\u009e\3\2\2\2\u0470\u0471\7f\2\2\u0471\u0472\7x"+
		"\2\2\u0472\u0473\7g\2\2\u0473\u0474\7e\2\2\u0474\u0475\7\65\2\2\u0475"+
		"\u00a0\3\2\2\2\u0476\u0477\7f\2\2\u0477\u0478\7x\2\2\u0478\u0479\7g\2"+
		"\2\u0479\u047a\7e\2\2\u047a\u047b\7\66\2\2\u047b\u00a2\3\2\2\2\u047c\u047d"+
		"\7w\2\2\u047d\u047e\7k\2\2\u047e\u047f\7p\2\2\u047f\u0480\7v\2\2\u0480"+
		"\u00a4\3\2\2\2\u0481\u0482\7w\2\2\u0482\u0483\7x\2\2\u0483\u0484\7g\2"+
		"\2\u0484\u0485\7e\2\2\u0485\u0486\7\64\2\2\u0486\u00a6\3\2\2\2\u0487\u0488"+
		"\7w\2\2\u0488\u0489\7x\2\2\u0489\u048a\7g\2\2\u048a\u048b\7e\2\2\u048b"+
		"\u048c\7\65\2\2\u048c\u00a8\3\2\2\2\u048d\u048e\7w\2\2\u048e\u048f\7x"+
		"\2\2\u048f\u0490\7g\2\2\u0490\u0491\7e\2\2\u0491\u0492\7\66\2\2\u0492"+
		"\u00aa\3\2\2\2\u0493\u0494\7n\2\2\u0494\u0495\7q\2\2\u0495\u0496\7y\2"+
		"\2\u0496\u0497\7r\2\2\u0497\u00ac\3\2\2\2\u0498\u0499\7o\2\2\u0499\u049a"+
		"\7g\2\2\u049a\u049b\7f\2\2\u049b\u049c\7k\2\2\u049c\u049d\7w\2\2\u049d"+
		"\u049e\7o\2\2\u049e\u049f\7r\2\2\u049f\u00ae\3\2\2\2\u04a0\u04a1\7j\2"+
		"\2\u04a1\u04a2\7k\2\2\u04a2\u04a3\7i\2\2\u04a3\u04a4\7j\2\2\u04a4\u04a5"+
		"\7r\2\2\u04a5\u00b0\3\2\2\2\u04a6\u04a7\7r\2\2\u04a7\u04a8\7t\2\2\u04a8"+
		"\u04a9\7g\2\2\u04a9\u04aa\7e\2\2\u04aa\u04ab\7k\2\2\u04ab\u04ac\7u\2\2"+
		"\u04ac\u04ad\7k\2\2\u04ad\u04ae\7q\2\2\u04ae\u04af\7p\2\2\u04af\u00b2"+
		"\3\2\2\2\u04b0\u04b1\7u\2\2\u04b1\u04b2\7c\2\2\u04b2\u04b3\7o\2\2\u04b3"+
		"\u04b4\7r\2\2\u04b4\u04b5\7n\2\2\u04b5\u04b6\7g\2\2\u04b6\u04b7\7t\2\2"+
		"\u04b7\u04b8\7\63\2\2\u04b8\u04b9\7F\2\2\u04b9\u00b4\3\2\2\2\u04ba\u04bb"+
		"\7u\2\2\u04bb\u04bc\7c\2\2\u04bc\u04bd\7o\2\2\u04bd\u04be\7r\2\2\u04be"+
		"\u04bf\7n\2\2\u04bf\u04c0\7g\2\2\u04c0\u04c1\7t\2\2\u04c1\u04c2\7\64\2"+
		"\2\u04c2\u04c3\7F\2\2\u04c3\u00b6\3\2\2\2\u04c4\u04c5\7u\2\2\u04c5\u04c6"+
		"\7c\2\2\u04c6\u04c7\7o\2\2\u04c7\u04c8\7r\2\2\u04c8\u04c9\7n\2\2\u04c9"+
		"\u04ca\7g\2\2\u04ca\u04cb\7t\2\2\u04cb\u04cc\7\65\2\2\u04cc\u04cd\7F\2"+
		"\2\u04cd\u00b8\3\2\2\2\u04ce\u04cf\7u\2\2\u04cf\u04d0\7c\2\2\u04d0\u04d1"+
		"\7o\2\2\u04d1\u04d2\7r\2\2\u04d2\u04d3\7n\2\2\u04d3\u04d4\7g\2\2\u04d4"+
		"\u04d5\7t\2\2\u04d5\u04d6\7E\2\2\u04d6\u04d7\7w\2\2\u04d7\u04d8\7d\2\2"+
		"\u04d8\u04d9\7g\2\2\u04d9\u00ba\3\2\2\2\u04da\u04db\7u\2\2\u04db\u04dc"+
		"\7c\2\2\u04dc\u04dd\7o\2\2\u04dd\u04de\7r\2\2\u04de\u04df\7n\2\2\u04df"+
		"\u04e0\7g\2\2\u04e0\u04e1\7t\2\2\u04e1\u04e2\7\63\2\2\u04e2\u04e3\7F\2"+
		"\2\u04e3\u04e4\7U\2\2\u04e4\u04e5\7j\2\2\u04e5\u04e6\7c\2\2\u04e6\u04e7"+
		"\7f\2\2\u04e7\u04e8\7q\2\2\u04e8\u04e9\7y\2\2\u04e9\u00bc\3\2\2\2\u04ea"+
		"\u04eb\7u\2\2\u04eb\u04ec\7c\2\2\u04ec\u04ed\7o\2\2\u04ed\u04ee\7r\2\2"+
		"\u04ee\u04ef\7n\2\2\u04ef\u04f0\7g\2\2\u04f0\u04f1\7t\2\2\u04f1\u04f2"+
		"\7\64\2\2\u04f2\u04f3\7F\2\2\u04f3\u04f4\7U\2\2\u04f4\u04f5\7j\2\2\u04f5"+
		"\u04f6\7c\2\2\u04f6\u04f7\7f\2\2\u04f7\u04f8\7q\2\2\u04f8\u04f9\7y\2\2"+
		"\u04f9\u00be\3\2\2\2\u04fa\u04fb\7u\2\2\u04fb\u04fc\7c\2\2\u04fc\u04fd"+
		"\7o\2\2\u04fd\u04fe\7r\2\2\u04fe\u04ff\7n\2\2\u04ff\u0500\7g\2\2\u0500"+
		"\u0501\7t\2\2\u0501\u0502\7E\2\2\u0502\u0503\7w\2\2\u0503\u0504\7d\2\2"+
		"\u0504\u0505\7g\2\2\u0505\u0506\7U\2\2\u0506\u0507\7j\2\2\u0507\u0508"+
		"\7c\2\2\u0508\u0509\7f\2\2\u0509\u050a\7q\2\2\u050a\u050b\7y\2\2\u050b"+
		"\u00c0\3\2\2\2\u050c\u050d\7u\2\2\u050d\u050e\7c\2\2\u050e\u050f\7o\2"+
		"\2\u050f\u0510\7r\2\2\u0510\u0511\7n\2\2\u0511\u0512\7g\2\2\u0512\u0513"+
		"\7t\2\2\u0513\u0514\7\63\2\2\u0514\u0515\7F\2\2\u0515\u0516\7C\2\2\u0516"+
		"\u0517\7t\2\2\u0517\u0518\7t\2\2\u0518\u0519\7c\2\2\u0519\u051a\7{\2\2"+
		"\u051a\u00c2\3\2\2\2\u051b\u051c\7u\2\2\u051c\u051d\7c\2\2\u051d\u051e"+
		"\7o\2\2\u051e\u051f\7r\2\2\u051f\u0520\7n\2\2\u0520\u0521\7g\2\2\u0521"+
		"\u0522\7t\2\2\u0522\u0523\7\64\2\2\u0523\u0524\7F\2\2\u0524\u0525\7C\2"+
		"\2\u0525\u0526\7t\2\2\u0526\u0527\7t\2\2\u0527\u0528\7c\2\2\u0528\u0529"+
		"\7{\2\2\u0529\u00c4\3\2\2\2\u052a\u052b\7u\2\2\u052b\u052c\7c\2\2\u052c"+
		"\u052d\7o\2\2\u052d\u052e\7r\2\2\u052e\u052f\7n\2\2\u052f\u0530\7g\2\2"+
		"\u0530\u0531\7t\2\2\u0531\u0532\7\63\2\2\u0532\u0533\7F\2\2\u0533\u0534"+
		"\7C\2\2\u0534\u0535\7t\2\2\u0535\u0536\7t\2\2\u0536\u0537\7c\2\2\u0537"+
		"\u0538\7{\2\2\u0538\u0539\7U\2\2\u0539\u053a\7j\2\2\u053a\u053b\7c\2\2"+
		"\u053b\u053c\7f\2\2\u053c\u053d\7q\2\2\u053d\u053e\7y\2\2\u053e\u00c6"+
		"\3\2\2\2\u053f\u0540\7u\2\2\u0540\u0541\7c\2\2\u0541\u0542\7o\2\2\u0542"+
		"\u0543\7r\2\2\u0543\u0544\7n\2\2\u0544\u0545\7g\2\2\u0545\u0546\7t\2\2"+
		"\u0546\u0547\7\64\2\2\u0547\u0548\7F\2\2\u0548\u0549\7C\2\2\u0549\u054a"+
		"\7t\2\2\u054a\u054b\7t\2\2\u054b\u054c\7c\2\2\u054c\u054d\7{\2\2\u054d"+
		"\u054e\7U\2\2\u054e\u054f\7j\2\2\u054f\u0550\7c\2\2\u0550\u0551\7f\2\2"+
		"\u0551\u0552\7q\2\2\u0552\u0553\7y\2\2\u0553\u00c8\3\2\2\2\u0554\u0555"+
		"\7k\2\2\u0555\u0556\7u\2\2\u0556\u0557\7c\2\2\u0557\u0558\7o\2\2\u0558"+
		"\u0559\7r\2\2\u0559\u055a\7n\2\2\u055a\u055b\7g\2\2\u055b\u055c\7t\2\2"+
		"\u055c\u055d\7\63\2\2\u055d\u055e\7F\2\2\u055e\u00ca\3\2\2\2\u055f\u0560"+
		"\7k\2\2\u0560\u0561\7u\2\2\u0561\u0562\7c\2\2\u0562\u0563\7o\2\2\u0563"+
		"\u0564\7r\2\2\u0564\u0565\7n\2\2\u0565\u0566\7g\2\2\u0566\u0567\7t\2\2"+
		"\u0567\u0568\7\64\2\2\u0568\u0569\7F\2\2\u0569\u00cc\3\2\2\2\u056a\u056b"+
		"\7k\2\2\u056b\u056c\7u\2\2\u056c\u056d\7c\2\2\u056d\u056e\7o\2\2\u056e"+
		"\u056f\7r\2\2\u056f\u0570\7n\2\2\u0570\u0571\7g\2\2\u0571\u0572\7t\2\2"+
		"\u0572\u0573\7\65\2\2\u0573\u0574\7F\2\2\u0574\u00ce\3\2\2\2\u0575\u0576"+
		"\7k\2\2\u0576\u0577\7u\2\2\u0577\u0578\7c\2\2\u0578\u0579\7o\2\2\u0579"+
		"\u057a\7r\2\2\u057a\u057b\7n\2\2\u057b\u057c\7g\2\2\u057c\u057d\7t\2\2"+
		"\u057d\u057e\7E\2\2\u057e\u057f\7w\2\2\u057f\u0580\7d\2\2\u0580\u0581"+
		"\7g\2\2\u0581\u00d0\3\2\2\2\u0582\u0583\7k\2\2\u0583\u0584\7u\2\2\u0584"+
		"\u0585\7c\2\2\u0585\u0586\7o\2\2\u0586\u0587\7r\2\2\u0587\u0588\7n\2\2"+
		"\u0588\u0589\7g\2\2\u0589\u058a\7t\2\2\u058a\u058b\7\63\2\2\u058b\u058c"+
		"\7F\2\2\u058c\u058d\7C\2\2\u058d\u058e\7t\2\2\u058e\u058f\7t\2\2\u058f"+
		"\u0590\7c\2\2\u0590\u0591\7{\2\2\u0591\u00d2\3\2\2\2\u0592\u0593\7k\2"+
		"\2\u0593\u0594\7u\2\2\u0594\u0595\7c\2\2\u0595\u0596\7o\2\2\u0596\u0597"+
		"\7r\2\2\u0597\u0598\7n\2\2\u0598\u0599\7g\2\2\u0599\u059a\7t\2\2\u059a"+
		"\u059b\7\64\2\2\u059b\u059c\7F\2\2\u059c\u059d\7C\2\2\u059d\u059e\7t\2"+
		"\2\u059e\u059f\7t\2\2\u059f\u05a0\7c\2\2\u05a0\u05a1\7{\2\2\u05a1\u00d4"+
		"\3\2\2\2\u05a2\u05a3\7w\2\2\u05a3\u05a4\7u\2\2\u05a4\u05a5\7c\2\2\u05a5"+
		"\u05a6\7o\2\2\u05a6\u05a7\7r\2\2\u05a7\u05a8\7n\2\2\u05a8\u05a9\7g\2\2"+
		"\u05a9\u05aa\7t\2\2\u05aa\u05ab\7\63\2\2\u05ab\u05ac\7F\2\2\u05ac\u00d6"+
		"\3\2\2\2\u05ad\u05ae\7w\2\2\u05ae\u05af\7u\2\2\u05af\u05b0\7c\2\2\u05b0"+
		"\u05b1\7o\2\2\u05b1\u05b2\7r\2\2\u05b2\u05b3\7n\2\2\u05b3\u05b4\7g\2\2"+
		"\u05b4\u05b5\7t\2\2\u05b5\u05b6\7\64\2\2\u05b6\u05b7\7F\2\2\u05b7\u00d8"+
		"\3\2\2\2\u05b8\u05b9\7w\2\2\u05b9\u05ba\7u\2\2\u05ba\u05bb\7c\2\2\u05bb"+
		"\u05bc\7o\2\2\u05bc\u05bd\7r\2\2\u05bd\u05be\7n\2\2\u05be\u05bf\7g\2\2"+
		"\u05bf\u05c0\7t\2\2\u05c0\u05c1\7\65\2\2\u05c1\u05c2\7F\2\2\u05c2\u00da"+
		"\3\2\2\2\u05c3\u05c4\7w\2\2\u05c4\u05c5\7u\2\2\u05c5\u05c6\7c\2\2\u05c6"+
		"\u05c7\7o\2\2\u05c7\u05c8\7r\2\2\u05c8\u05c9\7n\2\2\u05c9\u05ca\7g\2\2"+
		"\u05ca\u05cb\7t\2\2\u05cb\u05cc\7E\2\2\u05cc\u05cd\7w\2\2\u05cd\u05ce"+
		"\7d\2\2\u05ce\u05cf\7g\2\2\u05cf\u00dc\3\2\2\2\u05d0\u05d1\7w\2\2\u05d1"+
		"\u05d2\7u\2\2\u05d2\u05d3\7c\2\2\u05d3\u05d4\7o\2\2\u05d4\u05d5\7r\2\2"+
		"\u05d5\u05d6\7n\2\2\u05d6\u05d7\7g\2\2\u05d7\u05d8\7t\2\2\u05d8\u05d9"+
		"\7\63\2\2\u05d9\u05da\7F\2\2\u05da\u05db\7C\2\2\u05db\u05dc\7t\2\2\u05dc"+
		"\u05dd\7t\2\2\u05dd\u05de\7c\2\2\u05de\u05df\7{\2\2\u05df\u00de\3\2\2"+
		"\2\u05e0\u05e1\7w\2\2\u05e1\u05e2\7u\2\2\u05e2\u05e3\7c\2\2\u05e3\u05e4"+
		"\7o\2\2\u05e4\u05e5\7r\2\2\u05e5\u05e6\7n\2\2\u05e6\u05e7\7g\2\2\u05e7"+
		"\u05e8\7t\2\2\u05e8\u05e9\7\64\2\2\u05e9\u05ea\7F\2\2\u05ea\u05eb\7C\2"+
		"\2\u05eb\u05ec\7t\2\2\u05ec\u05ed\7t\2\2\u05ed\u05ee\7c\2\2\u05ee\u05ef"+
		"\7{\2\2\u05ef\u00e0\3\2\2\2\u05f0\u05f1\7u\2\2\u05f1\u05f2\7c\2\2\u05f2"+
		"\u05f3\7o\2\2\u05f3\u05f4\7r\2\2\u05f4\u05f5\7n\2\2\u05f5\u05f6\7g\2\2"+
		"\u05f6\u05f7\7t\2\2\u05f7\u05f8\7\64\2\2\u05f8\u05f9\7F\2\2\u05f9\u05fa"+
		"\7T\2\2\u05fa\u05fb\7g\2\2\u05fb\u05fc\7e\2\2\u05fc\u05fd\7v\2\2\u05fd"+
		"\u00e2\3\2\2\2\u05fe\u05ff\7u\2\2\u05ff\u0600\7c\2\2\u0600\u0601\7o\2"+
		"\2\u0601\u0602\7r\2\2\u0602\u0603\7n\2\2\u0603\u0604\7g\2\2\u0604\u0605"+
		"\7t\2\2\u0605\u0606\7\64\2\2\u0606\u0607\7F\2\2\u0607\u0608\7T\2\2\u0608"+
		"\u0609\7g\2\2\u0609\u060a\7e\2\2\u060a\u060b\7v\2\2\u060b\u060c\7U\2\2"+
		"\u060c\u060d\7j\2\2\u060d\u060e\7c\2\2\u060e\u060f\7f\2\2\u060f\u0610"+
		"\7q\2\2\u0610\u0611\7y\2\2\u0611\u00e4\3\2\2\2\u0612\u0613\7k\2\2\u0613"+
		"\u0614\7u\2\2\u0614\u0615\7c\2\2\u0615\u0616\7o\2\2\u0616\u0617\7r\2\2"+
		"\u0617\u0618\7n\2\2\u0618\u0619\7g\2\2\u0619\u061a\7t\2\2\u061a\u061b"+
		"\7\64\2\2\u061b\u061c\7F\2\2\u061c\u061d\7T\2\2\u061d\u061e\7g\2\2\u061e"+
		"\u061f\7e\2\2\u061f\u0620\7v\2\2\u0620\u00e6\3\2\2\2\u0621\u0622\7w\2"+
		"\2\u0622\u0623\7u\2\2\u0623\u0624\7c\2\2\u0624\u0625\7o\2\2\u0625\u0626"+
		"\7r\2\2\u0626\u0627\7n\2\2\u0627\u0628\7g\2\2\u0628\u0629\7t\2\2\u0629"+
		"\u062a\7\64\2\2\u062a\u062b\7F\2\2\u062b\u062c\7T\2\2\u062c\u062d\7g\2"+
		"\2\u062d\u062e\7e\2\2\u062e\u062f\7v\2\2\u062f\u00e8\3\2\2\2\u0630\u0631"+
		"\7u\2\2\u0631\u0632\7c\2\2\u0632\u0633\7o\2\2\u0633\u0634\7r\2\2\u0634"+
		"\u0635\7n\2\2\u0635\u0636\7g\2\2\u0636\u0637\7t\2\2\u0637\u0638\7D\2\2"+
		"\u0638\u0639\7w\2\2\u0639\u063a\7h\2\2\u063a\u063b\7h\2\2\u063b\u063c"+
		"\7g\2\2\u063c\u063d\7t\2\2\u063d\u00ea\3\2\2\2\u063e\u063f\7k\2\2\u063f"+
		"\u0640\7u\2\2\u0640\u0641\7c\2\2\u0641\u0642\7o\2\2\u0642\u0643\7r\2\2"+
		"\u0643\u0644\7n\2\2\u0644\u0645\7g\2\2\u0645\u0646\7t\2\2\u0646\u0647"+
		"\7D\2\2\u0647\u0648\7w\2\2\u0648\u0649\7h\2\2\u0649\u064a\7h\2\2\u064a"+
		"\u064b\7g\2\2\u064b\u064c\7t\2\2\u064c\u00ec\3\2\2\2\u064d\u064e\7w\2"+
		"\2\u064e\u064f\7u\2\2\u064f\u0650\7c\2\2\u0650\u0651\7o\2\2\u0651\u0652"+
		"\7r\2\2\u0652\u0653\7n\2\2\u0653\u0654\7g\2\2\u0654\u0655\7t\2\2\u0655"+
		"\u0656\7D\2\2\u0656\u0657\7w\2\2\u0657\u0658\7h\2\2\u0658\u0659\7h\2\2"+
		"\u0659\u065a\7g\2\2\u065a\u065b\7t\2\2\u065b\u00ee\3\2\2\2\u065c\u065d"+
		"\7u\2\2\u065d\u065e\7c\2\2\u065e\u065f\7o\2\2\u065f\u0660\7r\2\2\u0660"+
		"\u0661\7n\2\2\u0661\u0662\7g\2\2\u0662\u0663\7t\2\2\u0663\u0664\7\64\2"+
		"\2\u0664\u0665\7F\2\2\u0665\u0666\7O\2\2\u0666\u0667\7U\2\2\u0667\u00f0"+
		"\3\2\2\2\u0668\u0669\7k\2\2\u0669\u066a\7u\2\2\u066a\u066b\7c\2\2\u066b"+
		"\u066c\7o\2\2\u066c\u066d\7r\2\2\u066d\u066e\7n\2\2\u066e\u066f\7g\2\2"+
		"\u066f\u0670\7t\2\2\u0670\u0671\7\64\2\2\u0671\u0672\7F\2\2\u0672\u0673"+
		"\7O\2\2\u0673\u0674\7U\2\2\u0674\u00f2\3\2\2\2\u0675\u0676\7w\2\2\u0676"+
		"\u0677\7u\2\2\u0677\u0678\7c\2\2\u0678\u0679\7o\2\2\u0679\u067a\7r\2\2"+
		"\u067a\u067b\7n\2\2\u067b\u067c\7g\2\2\u067c\u067d\7t\2\2\u067d\u067e"+
		"\7\64\2\2\u067e\u067f\7F\2\2\u067f\u0680\7O\2\2\u0680\u0681\7U\2\2\u0681"+
		"\u00f4\3\2\2\2\u0682\u0683\7u\2\2\u0683\u0684\7c\2\2\u0684\u0685\7o\2"+
		"\2\u0685\u0686\7r\2\2\u0686\u0687\7n\2\2\u0687\u0688\7g\2\2\u0688\u0689"+
		"\7t\2\2\u0689\u068a\7\64\2\2\u068a\u068b\7F\2\2\u068b\u068c\7O\2\2\u068c"+
		"\u068d\7U\2\2\u068d\u068e\7C\2\2\u068e\u068f\7t\2\2\u068f\u0690\7t\2\2"+
		"\u0690\u0691\7c\2\2\u0691\u0692\7{\2\2\u0692\u00f6\3\2\2\2\u0693\u0694"+
		"\7k\2\2\u0694\u0695\7u\2\2\u0695\u0696\7c\2\2\u0696\u0697\7o\2\2\u0697"+
		"\u0698\7r\2\2\u0698\u0699\7n\2\2\u0699\u069a\7g\2\2\u069a\u069b\7t\2\2"+
		"\u069b\u069c\7\64\2\2\u069c\u069d\7F\2\2\u069d\u069e\7O\2\2\u069e\u069f"+
		"\7U\2\2\u069f\u06a0\7C\2\2\u06a0\u06a1\7t\2\2\u06a1\u06a2\7t\2\2\u06a2"+
		"\u06a3\7c\2\2\u06a3\u06a4\7{\2\2\u06a4\u00f8\3\2\2\2\u06a5\u06a6\7w\2"+
		"\2\u06a6\u06a7\7u\2\2\u06a7\u06a8\7c\2\2\u06a8\u06a9\7o\2\2\u06a9\u06aa"+
		"\7r\2\2\u06aa\u06ab\7n\2\2\u06ab\u06ac\7g\2\2\u06ac\u06ad\7t\2\2\u06ad"+
		"\u06ae\7\64\2\2\u06ae\u06af\7F\2\2\u06af\u06b0\7O\2\2\u06b0\u06b1\7U\2"+
		"\2\u06b1\u06b2\7C\2\2\u06b2\u06b3\7t\2\2\u06b3\u06b4\7t\2\2\u06b4\u06b5"+
		"\7c\2\2\u06b5\u06b6\7{\2\2\u06b6\u00fa\3\2\2\2\u06b7\u06b8\7u\2\2\u06b8"+
		"\u06b9\7c\2\2\u06b9\u06ba\7o\2\2\u06ba\u06bb\7r\2\2\u06bb\u06bc\7n\2\2"+
		"\u06bc\u06bd\7g\2\2\u06bd\u06be\7t\2\2\u06be\u06bf\7E\2\2\u06bf\u06c0"+
		"\7w\2\2\u06c0\u06c1\7d\2\2\u06c1\u06c2\7g\2\2\u06c2\u06c3\7C\2\2\u06c3"+
		"\u06c4\7t\2\2\u06c4\u06c5\7t\2\2\u06c5\u06c6\7c\2\2\u06c6\u06c7\7{\2\2"+
		"\u06c7\u00fc\3\2\2\2\u06c8\u06c9\7u\2\2\u06c9\u06ca\7c\2\2\u06ca\u06cb"+
		"\7o\2\2\u06cb\u06cc\7r\2\2\u06cc\u06cd\7n\2\2\u06cd\u06ce\7g\2\2\u06ce"+
		"\u06cf\7t\2\2\u06cf\u06d0\7E\2\2\u06d0\u06d1\7w\2\2\u06d1\u06d2\7d\2\2"+
		"\u06d2\u06d3\7g\2\2\u06d3\u06d4\7C\2\2\u06d4\u06d5\7t\2\2\u06d5\u06d6"+
		"\7t\2\2\u06d6\u06d7\7c\2\2\u06d7\u06d8\7{\2\2\u06d8\u06d9\7U\2\2\u06d9"+
		"\u06da\7j\2\2\u06da\u06db\7c\2\2\u06db\u06dc\7f\2\2\u06dc\u06dd\7q\2\2"+
		"\u06dd\u06de\7y\2\2\u06de\u00fe\3\2\2\2\u06df\u06e0\7k\2\2\u06e0\u06e1"+
		"\7u\2\2\u06e1\u06e2\7c\2\2\u06e2\u06e3\7o\2\2\u06e3\u06e4\7r\2\2\u06e4"+
		"\u06e5\7n\2\2\u06e5\u06e6\7g\2\2\u06e6\u06e7\7t\2\2\u06e7\u06e8\7E\2\2"+
		"\u06e8\u06e9\7w\2\2\u06e9\u06ea\7d\2\2\u06ea\u06eb\7g\2\2\u06eb\u06ec"+
		"\7C\2\2\u06ec\u06ed\7t\2\2\u06ed\u06ee\7t\2\2\u06ee\u06ef\7c\2\2\u06ef"+
		"\u06f0\7{\2\2\u06f0\u0100\3\2\2\2\u06f1\u06f2\7w\2\2\u06f2\u06f3\7u\2"+
		"\2\u06f3\u06f4\7c\2\2\u06f4\u06f5\7o\2\2\u06f5\u06f6\7r\2\2\u06f6\u06f7"+
		"\7n\2\2\u06f7\u06f8\7g\2\2\u06f8\u06f9\7t\2\2\u06f9\u06fa\7E\2\2\u06fa"+
		"\u06fb\7w\2\2\u06fb\u06fc\7d\2\2\u06fc\u06fd\7g\2\2\u06fd\u06fe\7C\2\2"+
		"\u06fe\u06ff\7t\2\2\u06ff\u0700\7t\2\2\u0700\u0701\7c\2\2\u0701\u0702"+
		"\7{\2\2\u0702\u0102\3\2\2\2\u0703\u0704\7k\2\2\u0704\u0705\7o\2\2\u0705"+
		"\u0706\7c\2\2\u0706\u0707\7i\2\2\u0707\u0708\7g\2\2\u0708\u0709\7\63\2"+
		"\2\u0709\u070a\7F\2\2\u070a\u0104\3\2\2\2\u070b\u070c\7k\2\2\u070c\u070d"+
		"\7k\2\2\u070d\u070e\7o\2\2\u070e\u070f\7c\2\2\u070f\u0710\7i\2\2\u0710"+
		"\u0711\7g\2\2\u0711\u0712\7\63\2\2\u0712\u0713\7F\2\2\u0713\u0106\3\2"+
		"\2\2\u0714\u0715\7w\2\2\u0715\u0716\7k\2\2\u0716\u0717\7o\2\2\u0717\u0718"+
		"\7c\2\2\u0718\u0719\7i\2\2\u0719\u071a\7g\2\2\u071a\u071b\7\63\2\2\u071b"+
		"\u071c\7F\2\2\u071c\u0108\3\2\2\2\u071d\u071e\7k\2\2\u071e\u071f\7o\2"+
		"\2\u071f\u0720\7c\2\2\u0720\u0721\7i\2\2\u0721\u0722\7g\2\2\u0722\u0723"+
		"\7\64\2\2\u0723\u0724\7F\2\2\u0724\u010a\3\2\2\2\u0725\u0726\7k\2\2\u0726"+
		"\u0727\7k\2\2\u0727\u0728\7o\2\2\u0728\u0729\7c\2\2\u0729\u072a\7i\2\2"+
		"\u072a\u072b\7g\2\2\u072b\u072c\7\64\2\2\u072c\u072d\7F\2\2\u072d\u010c"+
		"\3\2\2\2\u072e\u072f\7w\2\2\u072f\u0730\7k\2\2\u0730\u0731\7o\2\2\u0731"+
		"\u0732\7c\2\2\u0732\u0733\7i\2\2\u0733\u0734\7g\2\2\u0734\u0735\7\64\2"+
		"\2\u0735\u0736\7F\2\2\u0736\u010e\3\2\2\2\u0737\u0738\7k\2\2\u0738\u0739"+
		"\7o\2\2\u0739\u073a\7c\2\2\u073a\u073b\7i\2\2\u073b\u073c\7g\2\2\u073c"+
		"\u073d\7\65\2\2\u073d\u073e\7F\2\2\u073e\u0110\3\2\2\2\u073f\u0740\7k"+
		"\2\2\u0740\u0741\7k\2\2\u0741\u0742\7o\2\2\u0742\u0743\7c\2\2\u0743\u0744"+
		"\7i\2\2\u0744\u0745\7g\2\2\u0745\u0746\7\65\2\2\u0746\u0747\7F\2\2\u0747"+
		"\u0112\3\2\2\2\u0748\u0749\7w\2\2\u0749\u074a\7k\2\2\u074a\u074b\7o\2"+
		"\2\u074b\u074c\7c\2\2\u074c\u074d\7i\2\2\u074d\u074e\7g\2\2\u074e\u074f"+
		"\7\65\2\2\u074f\u0750\7F\2\2\u0750\u0114\3\2\2\2\u0751\u0752\7k\2\2\u0752"+
		"\u0753\7o\2\2\u0753\u0754\7c\2\2\u0754\u0755\7i\2\2\u0755\u0756\7g\2\2"+
		"\u0756\u0757\7\64\2\2\u0757\u0758\7F\2\2\u0758\u0759\7T\2\2\u0759\u075a"+
		"\7g\2\2\u075a\u075b\7e\2\2\u075b\u075c\7v\2\2\u075c\u0116\3\2\2\2\u075d"+
		"\u075e\7k\2\2\u075e\u075f\7k\2\2\u075f\u0760\7o\2\2\u0760\u0761\7c\2\2"+
		"\u0761\u0762\7i\2\2\u0762\u0763\7g\2\2\u0763\u0764\7\64\2\2\u0764\u0765"+
		"\7F\2\2\u0765\u0766\7T\2\2\u0766\u0767\7g\2\2\u0767\u0768\7e\2\2\u0768"+
		"\u0769\7v\2\2\u0769\u0118\3\2\2\2\u076a\u076b\7w\2\2\u076b\u076c\7k\2"+
		"\2\u076c\u076d\7o\2\2\u076d\u076e\7c\2\2\u076e\u076f\7i\2\2\u076f\u0770"+
		"\7g\2\2\u0770\u0771\7\64\2\2\u0771\u0772\7F\2\2\u0772\u0773\7T\2\2\u0773"+
		"\u0774\7g\2\2\u0774\u0775\7e\2\2\u0775\u0776\7v\2\2\u0776\u011a\3\2\2"+
		"\2\u0777\u0778\7k\2\2\u0778\u0779\7o\2\2\u0779\u077a\7c\2\2\u077a\u077b"+
		"\7i\2\2\u077b\u077c\7g\2\2\u077c\u077d\7E\2\2\u077d\u077e\7w\2\2\u077e"+
		"\u077f\7d\2\2\u077f\u0780\7g\2\2\u0780\u011c\3\2\2\2\u0781\u0782\7k\2"+
		"\2\u0782\u0783\7k\2\2\u0783\u0784\7o\2\2\u0784\u0785\7c\2\2\u0785\u0786"+
		"\7i\2\2\u0786\u0787\7g\2\2\u0787\u0788\7E\2\2\u0788\u0789\7w\2\2\u0789"+
		"\u078a\7d\2\2\u078a\u078b\7g\2\2\u078b\u011e\3\2\2\2\u078c\u078d\7w\2"+
		"\2\u078d\u078e\7k\2\2\u078e\u078f\7o\2\2\u078f\u0790\7c\2\2\u0790\u0791"+
		"\7i\2\2\u0791\u0792\7g\2\2\u0792\u0793\7E\2\2\u0793\u0794\7w\2\2\u0794"+
		"\u0795\7d\2\2\u0795\u0796\7g\2\2\u0796\u0120\3\2\2\2\u0797\u0798\7k\2"+
		"\2\u0798\u0799\7o\2\2\u0799\u079a\7c\2\2\u079a\u079b\7i\2\2\u079b\u079c"+
		"\7g\2\2\u079c\u079d\7D\2\2\u079d\u079e\7w\2\2\u079e\u079f\7h\2\2\u079f"+
		"\u07a0\7h\2\2\u07a0\u07a1\7g\2\2\u07a1\u07a2\7t\2\2\u07a2\u0122\3\2\2"+
		"\2\u07a3\u07a4\7k\2\2\u07a4\u07a5\7k\2\2\u07a5\u07a6\7o\2\2\u07a6\u07a7"+
		"\7c\2\2\u07a7\u07a8\7i\2\2\u07a8\u07a9\7g\2\2\u07a9\u07aa\7D\2\2\u07aa"+
		"\u07ab\7w\2\2\u07ab\u07ac\7h\2\2\u07ac\u07ad\7h\2\2\u07ad\u07ae\7g\2\2"+
		"\u07ae\u07af\7t\2\2\u07af\u0124\3\2\2\2\u07b0\u07b1\7w\2\2\u07b1\u07b2"+
		"\7k\2\2\u07b2\u07b3\7o\2\2\u07b3\u07b4\7c\2\2\u07b4\u07b5\7i\2\2\u07b5"+
		"\u07b6\7g\2\2\u07b6\u07b7\7D\2\2\u07b7\u07b8\7w\2\2\u07b8\u07b9\7h\2\2"+
		"\u07b9\u07ba\7h\2\2\u07ba\u07bb\7g\2\2\u07bb\u07bc\7t\2\2\u07bc\u0126"+
		"\3\2\2\2\u07bd\u07be\7k\2\2\u07be\u07bf\7o\2\2\u07bf\u07c0\7c\2\2\u07c0"+
		"\u07c1\7i\2\2\u07c1\u07c2\7g\2\2\u07c2\u07c3\7\63\2\2\u07c3\u07c4\7F\2"+
		"\2\u07c4\u07c5\7C\2\2\u07c5\u07c6\7t\2\2\u07c6\u07c7\7t\2\2\u07c7\u07c8"+
		"\7c\2\2\u07c8\u07c9\7{\2\2\u07c9\u0128\3\2\2\2\u07ca\u07cb\7k\2\2\u07cb"+
		"\u07cc\7k\2\2\u07cc\u07cd\7o\2\2\u07cd\u07ce\7c\2\2\u07ce\u07cf\7i\2\2"+
		"\u07cf\u07d0\7g\2\2\u07d0\u07d1\7\63\2\2\u07d1\u07d2\7F\2\2\u07d2\u07d3"+
		"\7C\2\2\u07d3\u07d4\7t\2\2\u07d4\u07d5\7t\2\2\u07d5\u07d6\7c\2\2\u07d6"+
		"\u07d7\7{\2\2\u07d7\u012a\3\2\2\2\u07d8\u07d9\7w\2\2\u07d9\u07da\7k\2"+
		"\2\u07da\u07db\7o\2\2\u07db\u07dc\7c\2\2\u07dc\u07dd\7i\2\2\u07dd\u07de"+
		"\7g\2\2\u07de\u07df\7\63\2\2\u07df\u07e0\7F\2\2\u07e0\u07e1\7C\2\2\u07e1"+
		"\u07e2\7t\2\2\u07e2\u07e3\7t\2\2\u07e3\u07e4\7c\2\2\u07e4\u07e5\7{\2\2"+
		"\u07e5\u012c\3\2\2\2\u07e6\u07e7\7k\2\2\u07e7\u07e8\7o\2\2\u07e8\u07e9"+
		"\7c\2\2\u07e9\u07ea\7i\2\2\u07ea\u07eb\7g\2\2\u07eb\u07ec\7\64\2\2\u07ec"+
		"\u07ed\7F\2\2\u07ed\u07ee\7C\2\2\u07ee\u07ef\7t\2\2\u07ef\u07f0\7t\2\2"+
		"\u07f0\u07f1\7c\2\2\u07f1\u07f2\7{\2\2\u07f2\u012e\3\2\2\2\u07f3\u07f4"+
		"\7k\2\2\u07f4\u07f5\7k\2\2\u07f5\u07f6\7o\2\2\u07f6\u07f7\7c\2\2\u07f7"+
		"\u07f8\7i\2\2\u07f8\u07f9\7g\2\2\u07f9\u07fa\7\64\2\2\u07fa\u07fb\7F\2"+
		"\2\u07fb\u07fc\7C\2\2\u07fc\u07fd\7t\2\2\u07fd\u07fe\7t\2\2\u07fe\u07ff"+
		"\7c\2\2\u07ff\u0800\7{\2\2\u0800\u0130\3\2\2\2\u0801\u0802\7w\2\2\u0802"+
		"\u0803\7k\2\2\u0803\u0804\7o\2\2\u0804\u0805\7c\2\2\u0805\u0806\7i\2\2"+
		"\u0806\u0807\7g\2\2\u0807\u0808\7\64\2\2\u0808\u0809\7F\2\2\u0809\u080a"+
		"\7C\2\2\u080a\u080b\7t\2\2\u080b\u080c\7t\2\2\u080c\u080d\7c\2\2\u080d"+
		"\u080e\7{\2\2\u080e\u0132\3\2\2\2\u080f\u0810\7k\2\2\u0810\u0811\7o\2"+
		"\2\u0811\u0812\7c\2\2\u0812\u0813\7i\2\2\u0813\u0814\7g\2\2\u0814\u0815"+
		"\7E\2\2\u0815\u0816\7w\2\2\u0816\u0817\7d\2\2\u0817\u0818\7g\2\2\u0818"+
		"\u0819\7C\2\2\u0819\u081a\7t\2\2\u081a\u081b\7t\2\2\u081b\u081c\7c\2\2"+
		"\u081c\u081d\7{\2\2\u081d\u0134\3\2\2\2\u081e\u081f\7k\2\2\u081f\u0820"+
		"\7k\2\2\u0820\u0821\7o\2\2\u0821\u0822\7c\2\2\u0822\u0823\7i\2\2\u0823"+
		"\u0824\7g\2\2\u0824\u0825\7E\2\2\u0825\u0826\7w\2\2\u0826\u0827\7d\2\2"+
		"\u0827\u0828\7g\2\2\u0828\u0829\7C\2\2\u0829\u082a\7t\2\2\u082a\u082b"+
		"\7t\2\2\u082b\u082c\7c\2\2\u082c\u082d\7{\2\2\u082d\u0136\3\2\2\2\u082e"+
		"\u082f\7w\2\2\u082f\u0830\7k\2\2\u0830\u0831\7o\2\2\u0831\u0832\7c\2\2"+
		"\u0832\u0833\7i\2\2\u0833\u0834\7g\2\2\u0834\u0835\7E\2\2\u0835\u0836"+
		"\7w\2\2\u0836\u0837\7d\2\2\u0837\u0838\7g\2\2\u0838\u0839\7C\2\2\u0839"+
		"\u083a\7t\2\2\u083a\u083b\7t\2\2\u083b\u083c\7c\2\2\u083c\u083d\7{\2\2"+
		"\u083d\u0138\3\2\2\2\u083e\u083f\7k\2\2\u083f\u0840\7o\2\2\u0840\u0841"+
		"\7c\2\2\u0841\u0842\7i\2\2\u0842\u0843\7g\2\2\u0843\u0844\7\64\2\2\u0844"+
		"\u0845\7F\2\2\u0845\u0846\7O\2\2\u0846\u0847\7U\2\2\u0847\u013a\3\2\2"+
		"\2\u0848\u0849\7k\2\2\u0849\u084a\7k\2\2\u084a\u084b\7o\2\2\u084b\u084c"+
		"\7c\2\2\u084c\u084d\7i\2\2\u084d\u084e\7g\2\2\u084e\u084f\7\64\2\2\u084f"+
		"\u0850\7F\2\2\u0850\u0851\7O\2\2\u0851\u0852\7U\2\2\u0852\u013c\3\2\2"+
		"\2\u0853\u0854\7w\2\2\u0854\u0855\7k\2\2\u0855\u0856\7o\2\2\u0856\u0857"+
		"\7c\2\2\u0857\u0858\7i\2\2\u0858\u0859\7g\2\2\u0859\u085a\7\64\2\2\u085a"+
		"\u085b\7F\2\2\u085b\u085c\7O\2\2\u085c\u085d\7U\2\2\u085d\u013e\3\2\2"+
		"\2\u085e\u085f\7k\2\2\u085f\u0860\7o\2\2\u0860\u0861\7c\2\2\u0861\u0862"+
		"\7i\2\2\u0862\u0863\7g\2\2\u0863\u0864\7\64\2\2\u0864\u0865\7F\2\2\u0865"+
		"\u0866\7O\2\2\u0866\u0867\7U\2\2\u0867\u0868\7C\2\2\u0868\u0869\7t\2\2"+
		"\u0869\u086a\7t\2\2\u086a\u086b\7c\2\2\u086b\u086c\7{\2\2\u086c\u0140"+
		"\3\2\2\2\u086d\u086e\7k\2\2\u086e\u086f\7k\2\2\u086f\u0870\7o\2\2\u0870"+
		"\u0871\7c\2\2\u0871\u0872\7i\2\2\u0872\u0873\7g\2\2\u0873\u0874\7\64\2"+
		"\2\u0874\u0875\7F\2\2\u0875\u0876\7O\2\2\u0876\u0877\7U\2\2\u0877\u0878"+
		"\7C\2\2\u0878\u0879\7t\2\2\u0879\u087a\7t\2\2\u087a\u087b\7c\2\2\u087b"+
		"\u087c\7{\2\2\u087c\u0142\3\2\2\2\u087d\u087e\7w\2\2\u087e\u087f\7k\2"+
		"\2\u087f\u0880\7o\2\2\u0880\u0881\7c\2\2\u0881\u0882\7i\2\2\u0882\u0883"+
		"\7g\2\2\u0883\u0884\7\64\2\2\u0884\u0885\7F\2\2\u0885\u0886\7O\2\2\u0886"+
		"\u0887\7U\2\2\u0887\u0888\7C\2\2\u0888\u0889\7t\2\2\u0889\u088a\7t\2\2"+
		"\u088a\u088b\7c\2\2\u088b\u088c\7{\2\2\u088c\u0144\3\2\2\2\u088d\u088e"+
		"\7u\2\2\u088e\u088f\7c\2\2\u088f\u0890\7o\2\2\u0890\u0891\7r\2\2\u0891"+
		"\u0892\7n\2\2\u0892\u0893\7g\2\2\u0893\u0894\7t\2\2\u0894\u0895\7G\2\2"+
		"\u0895\u0896\7z\2\2\u0896\u0897\7v\2\2\u0897\u0898\7g\2\2\u0898\u0899"+
		"\7t\2\2\u0899\u089a\7p\2\2\u089a\u089b\7c\2\2\u089b\u089c\7n\2\2\u089c"+
		"\u089d\7Q\2\2\u089d\u089e\7G\2\2\u089e\u089f\7U\2\2\u089f\u0146\3\2\2"+
		"\2\u08a0\u08a1\7u\2\2\u08a1\u08a2\7v\2\2\u08a2\u08a3\7t\2\2\u08a3\u08a4"+
		"\7w\2\2\u08a4\u08a5\7e\2\2\u08a5\u08a6\7v\2\2\u08a6\u0148\3\2\2\2\u08a7"+
		"\u08a8\7e\2\2\u08a8\u08a9\7q\2\2\u08a9\u08aa\7o\2\2\u08aa\u08ab\7o\2\2"+
		"\u08ab\u08ac\7q\2\2\u08ac\u08ad\7p\2\2\u08ad\u014a\3\2\2\2\u08ae\u08af"+
		"\7r\2\2\u08af\u08b0\7c\2\2\u08b0\u08b1\7t\2\2\u08b1\u08b2\7v\2\2\u08b2"+
		"\u08b3\7k\2\2\u08b3\u08b4\7v\2\2\u08b4\u08b5\7k\2\2\u08b5\u08b6\7q\2\2"+
		"\u08b6\u08b7\7p\2\2\u08b7\u014c\3\2\2\2\u08b8\u08b9\7c\2\2\u08b9\u08ba"+
		"\7e\2\2\u08ba\u08bb\7v\2\2\u08bb\u08bc\7k\2\2\u08bc\u08bd\7x\2\2\u08bd"+
		"\u08be\7g\2\2\u08be\u014e\3\2\2\2\u08bf\u08c0\7c\2\2\u08c0\u08c1\7u\2"+
		"\2\u08c1\u08c2\7o\2\2\u08c2\u0150\3\2\2\2\u08c3\u08c4\7e\2\2\u08c4\u08c5"+
		"\7n\2\2\u08c5\u08c6\7c\2\2\u08c6\u08c7\7u\2\2\u08c7\u08c8\7u\2\2\u08c8"+
		"\u0152\3\2\2\2\u08c9\u08ca\7w\2\2\u08ca\u08cb\7p\2\2\u08cb\u08cc\7k\2"+
		"\2\u08cc\u08cd\7q\2\2\u08cd\u08ce\7p\2\2\u08ce\u0154\3\2\2\2\u08cf\u08d0"+
		"\7g\2\2\u08d0\u08d1\7p\2\2\u08d1\u08d2\7w\2\2\u08d2\u08d3\7o\2\2\u08d3"+
		"\u0156\3\2\2\2\u08d4\u08d5\7v\2\2\u08d5\u08d6\7{\2\2\u08d6\u08d7\7r\2"+
		"\2\u08d7\u08d8\7g\2\2\u08d8\u08d9\7f\2\2\u08d9\u08da\7g\2\2\u08da\u08db"+
		"\7h\2\2\u08db\u0158\3\2\2\2\u08dc\u08dd\7v\2\2\u08dd\u08de\7g\2\2\u08de"+
		"\u08df\7o\2\2\u08df\u08e0\7r\2\2\u08e0\u08e1\7n\2\2\u08e1\u08e2\7c\2\2"+
		"\u08e2\u08e3\7v\2\2\u08e3\u08e4\7g\2\2\u08e4\u015a\3\2\2\2\u08e5\u08e6"+
		"\7v\2\2\u08e6\u08e7\7j\2\2\u08e7\u08e8\7k\2\2\u08e8\u08e9\7u\2\2\u08e9"+
		"\u015c\3\2\2\2\u08ea\u08eb\7t\2\2\u08eb\u08ec\7g\2\2\u08ec\u08ed\7u\2"+
		"\2\u08ed\u08ee\7q\2\2\u08ee\u08ef\7w\2\2\u08ef\u08f0\7t\2\2\u08f0\u08f1"+
		"\7e\2\2\u08f1\u08f2\7g\2\2\u08f2\u015e\3\2\2\2\u08f3\u08f4\7i\2\2\u08f4"+
		"\u08f5\7q\2\2\u08f5\u08f6\7v\2\2\u08f6\u08f7\7q\2\2\u08f7\u0160\3\2\2"+
		"\2\u08f8\u08f9\7k\2\2\u08f9\u08fa\7p\2\2\u08fa\u08fb\7n\2\2\u08fb\u08fc"+
		"\7k\2\2\u08fc\u08fd\7p\2\2\u08fd\u08fe\7g\2\2\u08fe\u0162\3\2\2\2\u08ff"+
		"\u0900\7p\2\2\u0900\u0901\7q\2\2\u0901\u0902\7k\2\2\u0902\u0903\7p\2\2"+
		"\u0903\u0904\7n\2\2\u0904\u0905\7k\2\2\u0905\u0906\7p\2\2\u0906\u0907"+
		"\7g\2\2\u0907\u0164\3\2\2\2\u0908\u0909\7r\2\2\u0909\u090a\7w\2\2\u090a"+
		"\u090b\7d\2\2\u090b\u090c\7n\2\2\u090c\u090d\7k\2\2\u090d\u090e\7e\2\2"+
		"\u090e\u0166\3\2\2\2\u090f\u0910\7u\2\2\u0910\u0911\7v\2\2\u0911\u0912"+
		"\7c\2\2\u0912\u0913\7v\2\2\u0913\u0914\7k\2\2\u0914\u0915\7e\2\2\u0915"+
		"\u0168\3\2\2\2\u0916\u0917\7g\2\2\u0917\u0918\7z\2\2\u0918\u0919\7v\2"+
		"\2\u0919\u091a\7g\2\2\u091a\u091b\7t\2\2\u091b\u091c\7p\2\2\u091c\u016a"+
		"\3\2\2\2\u091d\u091e\7g\2\2\u091e\u091f\7z\2\2\u091f\u0920\7v\2\2\u0920"+
		"\u0921\7g\2\2\u0921\u0922\7t\2\2\u0922\u0923\7p\2\2\u0923\u0924\7c\2\2"+
		"\u0924\u0925\7n\2\2\u0925\u016c\3\2\2\2\u0926\u0927\7k\2\2\u0927\u0928"+
		"\7p\2\2\u0928\u0929\7v\2\2\u0929\u092a\7g\2\2\u092a\u092b\7t\2\2\u092b"+
		"\u092c\7h\2\2\u092c\u092d\7c\2\2\u092d\u092e\7e\2\2\u092e\u092f\7g\2\2"+
		"\u092f\u016e\3\2\2\2\u0930\u0931\7n\2\2\u0931\u0932\7q\2\2\u0932\u0933"+
		"\7p\2\2\u0933\u0934\7i\2\2\u0934\u0170\3\2\2\2\u0935\u0936\7u\2\2\u0936"+
		"\u0937\7j\2\2\u0937\u0938\7q\2\2\u0938\u0939\7t\2\2\u0939\u093a\7v\2\2"+
		"\u093a\u0172\3\2\2\2\u093b\u093c\7j\2\2\u093c\u093d\7c\2\2\u093d\u093e"+
		"\7n\2\2\u093e\u093f\7h\2\2\u093f\u0174\3\2\2\2\u0940\u0941\7h\2\2\u0941"+
		"\u0942\7k\2\2\u0942\u0943\7z\2\2\u0943\u0944\7g\2\2\u0944\u0945\7f\2\2"+
		"\u0945\u0176\3\2\2\2\u0946\u0947\7w\2\2\u0947\u0948\7p\2\2\u0948\u0949"+
		"\7u\2\2\u0949\u094a\7k\2\2\u094a\u094b\7i\2\2\u094b\u094c\7p\2\2\u094c"+
		"\u094d\7g\2\2\u094d\u094e\7f\2\2\u094e\u0178\3\2\2\2\u094f\u0950\7u\2"+
		"\2\u0950\u0951\7w\2\2\u0951\u0952\7r\2\2\u0952\u0953\7g\2\2\u0953\u0954"+
		"\7t\2\2\u0954\u0955\7r\2\2\u0955\u017a\3\2\2\2\u0956\u0957\7k\2\2\u0957"+
		"\u0958\7p\2\2\u0958\u0959\7r\2\2\u0959\u095a\7w\2\2\u095a\u095b\7v\2\2"+
		"\u095b\u017c\3\2\2\2\u095c\u095d\7q\2\2\u095d\u095e\7w\2\2\u095e\u095f"+
		"\7v\2\2\u095f\u0960\7r\2\2\u0960\u0961\7w\2\2\u0961\u0962\7v\2\2\u0962"+
		"\u017e\3\2\2\2\u0963\u0964\7j\2\2\u0964\u0965\7x\2\2\u0965\u0966\7g\2"+
		"\2\u0966\u0967\7e\2\2\u0967\u0968\7\64\2\2\u0968\u0180\3\2\2\2\u0969\u096a"+
		"\7j\2\2\u096a\u096b\7x\2\2\u096b\u096c\7g\2\2\u096c\u096d\7e\2\2\u096d"+
		"\u096e\7\65\2\2\u096e\u0182\3\2\2\2\u096f\u0970\7j\2\2\u0970\u0971\7x"+
		"\2\2\u0971\u0972\7g\2\2\u0972\u0973\7e\2\2\u0973\u0974\7\66\2\2\u0974"+
		"\u0184\3\2\2\2\u0975\u0976\7h\2\2\u0976\u0977\7x\2\2\u0977\u0978\7g\2"+
		"\2\u0978\u0979\7e\2\2\u0979\u097a\7\64\2\2\u097a\u0186\3\2\2\2\u097b\u097c"+
		"\7h\2\2\u097c\u097d\7x\2\2\u097d\u097e\7g\2\2\u097e\u097f\7e\2\2\u097f"+
		"\u0980\7\65\2\2\u0980\u0188\3\2\2\2\u0981\u0982\7h\2\2\u0982\u0983\7x"+
		"\2\2\u0983\u0984\7g\2\2\u0984\u0985\7e\2\2\u0985\u0986\7\66\2\2\u0986"+
		"\u018a\3\2\2\2\u0987\u0988\7u\2\2\u0988\u0989\7c\2\2\u0989\u098a\7o\2"+
		"\2\u098a\u098b\7r\2\2\u098b\u098c\7n\2\2\u098c\u098d\7g\2\2\u098d\u098e"+
		"\7t\2\2\u098e\u098f\7\65\2\2\u098f\u0990\7F\2\2\u0990\u0991\7T\2\2\u0991"+
		"\u0992\7g\2\2\u0992\u0993\7e\2\2\u0993\u0994\7v\2\2\u0994\u018c\3\2\2"+
		"\2\u0995\u0996\7h\2\2\u0996\u0997\7k\2\2\u0997\u0998\7n\2\2\u0998\u0999"+
		"\7v\2\2\u0999\u099a\7g\2\2\u099a\u099b\7t\2\2\u099b\u018e\3\2\2\2\u099c"+
		"\u099d\7u\2\2\u099d\u099e\7k\2\2\u099e\u099f\7|\2\2\u099f\u09a0\7g\2\2"+
		"\u09a0\u09a1\7q\2\2\u09a1\u09a2\7h\2\2\u09a2\u0190\3\2\2\2\u09a3\u09a4"+
		"\7e\2\2\u09a4\u09a5\7c\2\2\u09a5\u09a6\7u\2\2\u09a6\u09a7\7v\2\2\u09a7"+
		"\u0192\3\2\2\2\u09a8\u09a9\7p\2\2\u09a9\u09aa\7c\2\2\u09aa\u09ab\7o\2"+
		"\2\u09ab\u09ac\7g\2\2\u09ac\u09ad\7u\2\2\u09ad\u09ae\7r\2\2\u09ae\u09af"+
		"\7c\2\2\u09af\u09b0\7e\2\2\u09b0\u09b1\7g\2\2\u09b1\u0194\3\2\2\2\u09b2"+
		"\u09b3\7w\2\2\u09b3\u09b4\7u\2\2\u09b4\u09b5\7k\2\2\u09b5\u09b6\7p\2\2"+
		"\u09b6\u09b7\7i\2\2\u09b7\u0196\3\2\2\2\u09b8\u09b9\7f\2\2\u09b9\u09ba"+
		"\7g\2\2\u09ba\u09bb\7h\2\2\u09bb\u09bc\7k\2\2\u09bc\u09bd\7p\2\2\u09bd"+
		"\u09be\7g\2\2\u09be\u09bf\7f\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1\6\u00cc"+
		"\2\2\u09c1\u0198\3\2\2\2\u09c2\u09c4\t\2\2\2\u09c3\u09c2\3\2\2\2\u09c4"+
		"\u09c5\3\2\2\2\u09c5\u09c3\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\3\2"+
		"\2\2\u09c7\u09c8\b\u00cd\2\2\u09c8\u019a\3\2\2\2\u09c9\u09cb\7\17\2\2"+
		"\u09ca\u09c9\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd"+
		"\7\f\2\2\u09cd\u09ce\6\u00ce\3\2\u09ce\u019c\3\2\2\2\u09cf\u09d1\7\17"+
		"\2\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2"+
		"\u09d3\7\f\2\2\u09d3\u09d4\6\u00cf\4\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6"+
		"\b\u00cf\2\2\u09d6\u019e\3\2\2\2\u09d7\u09d8\7^\2\2\u09d8\u09dd\7\f\2"+
		"\2\u09d9\u09da\7^\2\2\u09da\u09db\7\17\2\2\u09db\u09dd\7\f\2\2\u09dc\u09d7"+
		"\3\2\2\2\u09dc\u09d9\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09df\b\u00d0\2"+
		"\2\u09df\u01a0\3\2\2\2\u09e0\u09e1\7\61\2\2\u09e1\u09e2\7,\2\2\u09e2\u09e8"+
		"\3\2\2\2\u09e3\u09e7\n\3\2\2\u09e4\u09e5\7,\2\2\u09e5\u09e7\n\4\2\2\u09e6"+
		"\u09e3\3\2\2\2\u09e6\u09e4\3\2\2\2\u09e7\u09ea\3\2\2\2\u09e8\u09e6\3\2"+
		"\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09e8\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u09eb\u09ec\7,\2\2\u09ec\u09ed\7\61\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef"+
		"\b\u00d1\2\2\u09ef\u01a2\3\2\2\2\u09f0\u09f1\7\61\2\2\u09f1\u09f2\7\61"+
		"\2\2\u09f2\u09f6\3\2\2\2\u09f3\u09f5\n\5\2\2\u09f4\u09f3\3\2\2\2\u09f5"+
		"\u09f8\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f9\3\2"+
		"\2\2\u09f8\u09f6\3\2\2\2\u09f9\u09fa\b\u00d2\2\2\u09fa\u01a4\3\2\2\2\u09fb"+
		"\u09fc\7v\2\2\u09fc\u09fd\7t\2\2\u09fd\u09fe\7w\2\2\u09fe\u0a05\7g\2\2"+
		"\u09ff\u0a00\7h\2\2\u0a00\u0a01\7c\2\2\u0a01\u0a02\7n\2\2\u0a02\u0a03"+
		"\7u\2\2\u0a03\u0a05\7g\2\2\u0a04\u09fb\3\2\2\2\u0a04\u09ff\3\2\2\2\u0a05"+
		"\u01a6\3\2\2\2\u0a06\u0a08\5\u01ab\u00d6\2\u0a07\u0a09\5\u01af\u00d8\2"+
		"\u0a08\u0a07\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a10\3\2\2\2\u0a0a\u0a0c"+
		"\5\u01ad\u00d7\2\u0a0b\u0a0d\5\u01b1\u00d9\2\u0a0c\u0a0b\3\2\2\2\u0a0c"+
		"\u0a0d\3\2\2\2\u0a0d\u0a10\3\2\2\2\u0a0e\u0a10\5\u024b\u0126\2\u0a0f\u0a06"+
		"\3\2\2\2\u0a0f\u0a0a\3\2\2\2\u0a0f\u0a0e\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11"+
		"\u0a12\t\6\2\2\u0a12\u01a8\3\2\2\2\u0a13\u0a15\5\u01ab\u00d6\2\u0a14\u0a16"+
		"\5\u01af\u00d8\2\u0a15\u0a14\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a1c\3"+
		"\2\2\2\u0a17\u0a19\5\u01ad\u00d7\2\u0a18\u0a1a\5\u01b1\u00d9\2\u0a19\u0a18"+
		"\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1c\3\2\2\2\u0a1b\u0a13\3\2\2\2\u0a1b"+
		"\u0a17\3\2\2\2\u0a1c\u0a1e\3\2\2\2\u0a1d\u0a1f\t\7\2\2\u0a1e\u0a1d\3\2"+
		"\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u01aa\3\2\2\2\u0a20\u0a22\5\u0255\u012b"+
		"\2\u0a21\u0a20\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a23\u0a24"+
		"\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0a29\7\60\2\2\u0a26\u0a28\5\u0255"+
		"\u012b\2\u0a27\u0a26\3\2\2\2\u0a28\u0a2b\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29"+
		"\u0a2a\3\2\2\2\u0a2a\u0a39\3\2\2\2\u0a2b\u0a29\3\2\2\2\u0a2c\u0a2e\5\u0255"+
		"\u012b\2\u0a2d\u0a2c\3\2\2\2\u0a2e\u0a31\3\2\2\2\u0a2f\u0a2d\3\2\2\2\u0a2f"+
		"\u0a30\3\2\2\2\u0a30\u0a32\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a32\u0a34\7\60"+
		"\2\2\u0a33\u0a35\5\u0255\u012b\2\u0a34\u0a33\3\2\2\2\u0a35\u0a36\3\2\2"+
		"\2\u0a36\u0a34\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a39\3\2\2\2\u0a38\u0a21"+
		"\3\2\2\2\u0a38\u0a2f\3\2\2\2\u0a39\u01ac\3\2\2\2\u0a3a\u0a3b\7\62\2\2"+
		"\u0a3b\u0a54\t\b\2\2\u0a3c\u0a3e\5\u0257\u012c\2\u0a3d\u0a3c\3\2\2\2\u0a3e"+
		"\u0a3f\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a41\3\2"+
		"\2\2\u0a41\u0a45\7\60\2\2\u0a42\u0a44\5\u0257\u012c\2\u0a43\u0a42\3\2"+
		"\2\2\u0a44\u0a47\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46"+
		"\u0a55\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a48\u0a4a\5\u0257\u012c\2\u0a49\u0a48"+
		"\3\2\2\2\u0a4a\u0a4d\3\2\2\2\u0a4b\u0a49\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c"+
		"\u0a4e\3\2\2\2\u0a4d\u0a4b\3\2\2\2\u0a4e\u0a50\7\60\2\2\u0a4f\u0a51\5"+
		"\u0257\u012c\2\u0a50\u0a4f\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a50\3\2"+
		"\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a55\3\2\2\2\u0a54\u0a3d\3\2\2\2\u0a54"+
		"\u0a4b\3\2\2\2\u0a55\u01ae\3\2\2\2\u0a56\u0a58\t\t\2\2\u0a57\u0a59\5\u024f"+
		"\u0128\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a"+
		"\u0a5b\5\u0245\u0123\2\u0a5b\u01b0\3\2\2\2\u0a5c\u0a5e\t\n\2\2\u0a5d\u0a5f"+
		"\5\u024f\u0128\2\u0a5e\u0a5d\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u0a60\3"+
		"\2\2\2\u0a60\u0a61\5\u0245\u0123\2\u0a61\u01b2\3\2\2\2\u0a62\u0a64\5\u024b"+
		"\u0126\2\u0a63\u0a65\t\7\2\2\u0a64\u0a63\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65"+
		"\u01b4\3\2\2\2\u0a66\u0a67\5\u024b\u0126\2\u0a67\u0a69\t\13\2\2\u0a68"+
		"\u0a6a\t\7\2\2\u0a69\u0a68\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u01b6\3\2"+
		"\2\2\u0a6b\u0a6c\7)\2\2\u0a6c\u0a6d\5\u022f\u0118\2\u0a6d\u0a6e\7)\2\2"+
		"\u0a6e\u01b8\3\2\2\2\u0a6f\u0a70\7N\2\2\u0a70\u0a71\7)\2\2\u0a71\u0a72"+
		"\5\u022f\u0118\2\u0a72\u0a73\7)\2\2\u0a73\u0a7f\3\2\2\2\u0a74\u0a75\7"+
		"w\2\2\u0a75\u0a76\7)\2\2\u0a76\u0a77\5\u022f\u0118\2\u0a77\u0a78\7)\2"+
		"\2\u0a78\u0a7f\3\2\2\2\u0a79\u0a7a\7W\2\2\u0a7a\u0a7b\7)\2\2\u0a7b\u0a7c"+
		"\5\u022f\u0118\2\u0a7c\u0a7d\7)\2\2\u0a7d\u0a7f\3\2\2\2\u0a7e\u0a6f\3"+
		"\2\2\2\u0a7e\u0a74\3\2\2\2\u0a7e\u0a79\3\2\2\2\u0a7f\u01ba\3\2\2\2\u0a80"+
		"\u0a82\7$\2\2\u0a81\u0a83\5\u022d\u0117\2\u0a82\u0a81\3\2\2\2\u0a82\u0a83"+
		"\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a85\7$\2\2\u0a85\u01bc\3\2\2\2\u0a86"+
		"\u0a87\5\u020f\u0108\2\u0a87\u0a88\5\u022d\u0117\2\u0a88\u0a89\5\u0211"+
		"\u0109\2\u0a89\u01be\3\2\2\2\u0a8a\u0a8b\5\u022b\u0116\2\u0a8b\u0a8d\7"+
		"$\2\2\u0a8c\u0a8e\5\u022d\u0117\2\u0a8d\u0a8c\3\2\2\2\u0a8d\u0a8e\3\2"+
		"\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0a90\7$\2\2\u0a90\u01c0\3\2\2\2\u0a91"+
		"\u0a92\7>\2\2\u0a92\u0a93\7>\2\2\u0a93\u01c2\3\2\2\2\u0a94\u0a95\7@\2"+
		"\2\u0a95\u0a96\7@\2\2\u0a96\u01c4\3\2\2\2\u0a97\u0a98\7-\2\2\u0a98\u0a99"+
		"\7-\2\2\u0a99\u01c6\3\2\2\2\u0a9a\u0a9b\7/\2\2\u0a9b\u0a9c\7/\2\2\u0a9c"+
		"\u01c8\3\2\2\2\u0a9d\u0a9e\7>\2\2\u0a9e\u0a9f\7?\2\2\u0a9f\u01ca\3\2\2"+
		"\2\u0aa0\u0aa1\7@\2\2\u0aa1\u0aa2\7?\2\2\u0aa2\u01cc\3\2\2\2\u0aa3\u0aa4"+
		"\7?\2\2\u0aa4\u0aa5\7?\2\2\u0aa5\u01ce\3\2\2\2\u0aa6\u0aa7\7#\2\2\u0aa7"+
		"\u0aa8\7?\2\2\u0aa8\u01d0\3\2\2\2\u0aa9\u0aaa\7(\2\2\u0aaa\u0aab\7(\2"+
		"\2\u0aab\u01d2\3\2\2\2\u0aac\u0aad\7~\2\2\u0aad\u0aae\7~\2\2\u0aae\u01d4"+
		"\3\2\2\2\u0aaf\u0ab0\7`\2\2\u0ab0\u0ab1\7`\2\2\u0ab1\u01d6\3\2\2\2\u0ab2"+
		"\u0ab3\7,\2\2\u0ab3\u0ab4\7?\2\2\u0ab4\u01d8\3\2\2\2\u0ab5\u0ab6\7^\2"+
		"\2\u0ab6\u0ab7\7?\2\2\u0ab7\u01da\3\2\2\2\u0ab8\u0ab9\7-\2\2\u0ab9\u0aba"+
		"\7?\2\2\u0aba\u01dc\3\2\2\2\u0abb\u0abc\7\'\2\2\u0abc\u0abd\7?\2\2\u0abd"+
		"\u01de\3\2\2\2\u0abe\u0abf\7>\2\2\u0abf\u0ac0\7>\2\2\u0ac0\u0ac1\7?\2"+
		"\2\u0ac1\u01e0\3\2\2\2\u0ac2\u0ac3\7@\2\2\u0ac3\u0ac4\7@\2\2\u0ac4\u0ac5"+
		"\7?\2\2\u0ac5\u01e2\3\2\2\2\u0ac6\u0ac7\7(\2\2\u0ac7\u0ac8\7?\2\2\u0ac8"+
		"\u01e4\3\2\2\2\u0ac9\u0aca\7`\2\2\u0aca\u0acb\7?\2\2\u0acb\u01e6\3\2\2"+
		"\2\u0acc\u0acd\7~\2\2\u0acd\u0ace\7?\2\2\u0ace\u01e8\3\2\2\2\u0acf\u0ad0"+
		"\7/\2\2\u0ad0\u0ad1\7?\2\2\u0ad1\u01ea\3\2\2\2\u0ad2\u0ad3\7*\2\2\u0ad3"+
		"\u01ec\3\2\2\2\u0ad4\u0ad5\7+\2\2\u0ad5\u01ee\3\2\2\2\u0ad6\u0ad7\7]\2"+
		"\2\u0ad7\u01f0\3\2\2\2\u0ad8\u0ad9\7_\2\2\u0ad9\u01f2\3\2\2\2\u0ada\u0adb"+
		"\7}\2\2\u0adb\u01f4\3\2\2\2\u0adc\u0add\7\177\2\2\u0add\u01f6\3\2\2\2"+
		"\u0ade\u0adf\7\60\2\2\u0adf\u01f8\3\2\2\2\u0ae0\u0ae1\7.\2\2\u0ae1\u01fa"+
		"\3\2\2\2\u0ae2\u0ae3\7<\2\2\u0ae3\u01fc\3\2\2\2\u0ae4\u0ae5\7?\2\2\u0ae5"+
		"\u01fe\3\2\2\2\u0ae6\u0ae7\7=\2\2\u0ae7\u0200\3\2\2\2\u0ae8\u0ae9\7#\2"+
		"\2\u0ae9\u0202\3\2\2\2\u0aea\u0aeb\7/\2\2\u0aeb\u0204\3\2\2\2\u0aec\u0aed"+
		"\7\u0080\2\2\u0aed\u0206\3\2\2\2\u0aee\u0aef\7-\2\2\u0aef\u0208\3\2\2"+
		"\2\u0af0\u0af1\7,\2\2\u0af1\u020a\3\2\2\2\u0af2\u0af3\7\61\2\2\u0af3\u020c"+
		"\3\2\2\2\u0af4\u0af5\7\'\2\2\u0af5\u020e\3\2\2\2\u0af6\u0af7\7>\2\2\u0af7"+
		"\u0210\3\2\2\2\u0af8\u0af9\7@\2\2\u0af9\u0212\3\2\2\2\u0afa\u0afb\7~\2"+
		"\2\u0afb\u0214\3\2\2\2\u0afc\u0afd\7`\2\2\u0afd\u0216\3\2\2\2\u0afe\u0aff"+
		"\7(\2\2\u0aff\u0218\3\2\2\2\u0b00\u0b01\7A\2\2\u0b01\u021a\3\2\2\2\u0b02"+
		"\u0b03\7%\2\2\u0b03\u021c\3\2\2\2\u0b04\u0b05\7%\2\2\u0b05\u0b06\7%\2"+
		"\2\u0b06\u021e\3\2\2\2\u0b07\u0b08\7\60\2\2\u0b08\u0b09\7\60\2\2\u0b09"+
		"\u0b0a\7\60\2\2\u0b0a\u0220\3\2\2\2\u0b0b\u0b0c\7$\2\2\u0b0c\u0222\3\2"+
		"\2\2\u0b0d\u0b0e\7)\2\2\u0b0e\u0224\3\2\2\2\u0b0f\u0b10\5\u0229\u0115"+
		"\2\u0b10\u0b11\6\u0113\5\2\u0b11\u0226\3\2\2\2\u0b12\u0b13\5\u0229\u0115"+
		"\2\u0b13\u0b14\6\u0114\6\2\u0b14\u0228\3\2\2\2\u0b15\u0b1a\5\u0251\u0129"+
		"\2\u0b16\u0b19\5\u0255\u012b\2\u0b17\u0b19\5\u0251\u0129\2\u0b18\u0b16"+
		"\3\2\2\2\u0b18\u0b17\3\2\2\2\u0b19\u0b1c\3\2\2\2\u0b1a\u0b18\3\2\2\2\u0b1a"+
		"\u0b1b\3\2\2\2\u0b1b\u022a\3\2\2\2\u0b1c\u0b1a\3\2\2\2\u0b1d\u0b1e\7w"+
		"\2\2\u0b1e\u0b21\7:\2\2\u0b1f\u0b21\t\f\2\2\u0b20\u0b1d\3\2\2\2\u0b20"+
		"\u0b1f\3\2\2\2\u0b21\u022c\3\2\2\2\u0b22\u0b24\5\u023d\u011f\2\u0b23\u0b22"+
		"\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u0b23\3\2\2\2\u0b25\u0b26\3\2\2\2\u0b26"+
		"\u022e\3\2\2\2\u0b27\u0b29\5\u023f\u0120\2\u0b28\u0b27\3\2\2\2\u0b29\u0b2a"+
		"\3\2\2\2\u0b2a\u0b28\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0230\3\2\2\2\u0b2c"+
		"\u0b31\5\u0237\u011c\2\u0b2d\u0b31\5\u0239\u011d\2\u0b2e\u0b31\5\u023b"+
		"\u011e\2\u0b2f\u0b31\5\u0233\u011a\2\u0b30\u0b2c\3\2\2\2\u0b30\u0b2d\3"+
		"\2\2\2\u0b30\u0b2e\3\2\2\2\u0b30\u0b2f\3\2\2\2\u0b31\u0232\3\2\2\2\u0b32"+
		"\u0b33\7^\2\2\u0b33\u0b34\7w\2\2\u0b34\u0b35\3\2\2\2\u0b35\u0b3d\5\u0235"+
		"\u011b\2\u0b36\u0b37\7^\2\2\u0b37\u0b38\7W\2\2\u0b38\u0b39\3\2\2\2\u0b39"+
		"\u0b3a\5\u0235\u011b\2\u0b3a\u0b3b\5\u0235\u011b\2\u0b3b\u0b3d\3\2\2\2"+
		"\u0b3c\u0b32\3\2\2\2\u0b3c\u0b36\3\2\2\2\u0b3d\u0234\3\2\2\2\u0b3e\u0b3f"+
		"\5\u0257\u012c\2\u0b3f\u0b40\5\u0257\u012c\2\u0b40\u0b41\5\u0257\u012c"+
		"\2\u0b41\u0b42\5\u0257\u012c\2\u0b42\u0236\3\2\2\2\u0b43\u0b44\7^\2\2"+
		"\u0b44\u0b5a\7)\2\2\u0b45\u0b46\7^\2\2\u0b46\u0b5a\7$\2\2\u0b47\u0b48"+
		"\7^\2\2\u0b48\u0b5a\7A\2\2\u0b49\u0b4a\7^\2\2\u0b4a\u0b5a\7^\2\2\u0b4b"+
		"\u0b4c\7^\2\2\u0b4c\u0b5a\7c\2\2\u0b4d\u0b4e\7^\2\2\u0b4e\u0b5a\7d\2\2"+
		"\u0b4f\u0b50\7^\2\2\u0b50\u0b5a\7h\2\2\u0b51\u0b52\7^\2\2\u0b52\u0b5a"+
		"\7p\2\2\u0b53\u0b54\7^\2\2\u0b54\u0b5a\7t\2\2\u0b55\u0b56\7^\2\2\u0b56"+
		"\u0b5a\7v\2\2\u0b57\u0b58\7^\2\2\u0b58\u0b5a\7x\2\2\u0b59\u0b43\3\2\2"+
		"\2\u0b59\u0b45\3\2\2\2\u0b59\u0b47\3\2\2\2\u0b59\u0b49\3\2\2\2\u0b59\u0b4b"+
		"\3\2\2\2\u0b59\u0b4d\3\2\2\2\u0b59\u0b4f\3\2\2\2\u0b59\u0b51\3\2\2\2\u0b59"+
		"\u0b53\3\2\2\2\u0b59\u0b55\3\2\2\2\u0b59\u0b57\3\2\2\2\u0b5a\u0238\3\2"+
		"\2\2\u0b5b\u0b5c\7^\2\2\u0b5c\u0b61\5\u0253\u012a\2\u0b5d\u0b5f\5\u0253"+
		"\u012a\2\u0b5e\u0b60\5\u0253\u012a\2\u0b5f\u0b5e\3\2\2\2\u0b5f\u0b60\3"+
		"\2\2\2\u0b60\u0b62\3\2\2\2\u0b61\u0b5d\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62"+
		"\u023a\3\2\2\2\u0b63\u0b64\7^\2\2\u0b64\u0b65\7z\2\2\u0b65\u0b67\3\2\2"+
		"\2\u0b66\u0b68\5\u0257\u012c\2\u0b67\u0b66\3\2\2\2\u0b68\u0b69\3\2\2\2"+
		"\u0b69\u0b67\3\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u023c\3\2\2\2\u0b6b\u0b70"+
		"\n\r\2\2\u0b6c\u0b70\t\2\2\2\u0b6d\u0b70\5\u019f\u00d0\2\u0b6e\u0b70\5"+
		"\u0231\u0119\2\u0b6f\u0b6b\3\2\2\2\u0b6f\u0b6c\3\2\2\2\u0b6f\u0b6d\3\2"+
		"\2\2\u0b6f\u0b6e\3\2\2\2\u0b70\u023e\3\2\2\2\u0b71\u0b76\n\16\2\2\u0b72"+
		"\u0b76\t\2\2\2\u0b73\u0b76\5\u019f\u00d0\2\u0b74\u0b76\5\u0231\u0119\2"+
		"\u0b75\u0b71\3\2\2\2\u0b75\u0b72\3\2\2\2\u0b75\u0b73\3\2\2\2\u0b75\u0b74"+
		"\3\2\2\2\u0b76\u0240\3\2\2\2\u0b77\u0b78\7\62\2\2\u0b78\u0b7a\t\b\2\2"+
		"\u0b79\u0b7b\5\u0257\u012c\2\u0b7a\u0b79\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c"+
		"\u0b7a\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0242\3\2\2\2\u0b7e\u0b80\7\62"+
		"\2\2\u0b7f\u0b81\5\u0253\u012a\2\u0b80\u0b7f\3\2\2\2\u0b81\u0b82\3\2\2"+
		"\2\u0b82\u0b80\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0244\3\2\2\2\u0b84\u0b8d"+
		"\7\62\2\2\u0b85\u0b89\5\u0249\u0125\2\u0b86\u0b88\5\u0255\u012b\2\u0b87"+
		"\u0b86\3\2\2\2\u0b88\u0b8b\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b89\u0b8a\3\2"+
		"\2\2\u0b8a\u0b8d\3\2\2\2\u0b8b\u0b89\3\2\2\2\u0b8c\u0b84\3\2\2\2\u0b8c"+
		"\u0b85\3\2\2\2\u0b8d\u0246\3\2\2\2\u0b8e\u0b8f\t\17\2\2\u0b8f\u0248\3"+
		"\2\2\2\u0b90\u0b93\5\u0247\u0124\2\u0b91\u0b93\t\20\2\2\u0b92\u0b90\3"+
		"\2\2\2\u0b92\u0b91\3\2\2\2\u0b93\u024a\3\2\2\2\u0b94\u0b98\5\u0243\u0122"+
		"\2\u0b95\u0b98\5\u0241\u0121\2\u0b96\u0b98\5\u0245\u0123\2\u0b97\u0b94"+
		"\3\2\2\2\u0b97\u0b95\3\2\2\2\u0b97\u0b96\3\2\2\2\u0b98\u024c\3\2\2\2\u0b99"+
		"\u0b9a\t\21\2\2\u0b9a\u024e\3\2\2\2\u0b9b\u0b9c\t\22\2\2\u0b9c\u0250\3"+
		"\2\2\2\u0b9d\u0ba0\5\u024d\u0127\2\u0b9e\u0ba0\7a\2\2\u0b9f\u0b9d\3\2"+
		"\2\2\u0b9f\u0b9e\3\2\2\2\u0ba0\u0252\3\2\2\2\u0ba1\u0ba4\7\62\2\2\u0ba2"+
		"\u0ba4\5\u0247\u0124\2\u0ba3\u0ba1\3\2\2\2\u0ba3\u0ba2\3\2\2\2\u0ba4\u0254"+
		"\3\2\2\2\u0ba5\u0ba8\7\62\2\2\u0ba6\u0ba8\5\u0249\u0125\2\u0ba7\u0ba5"+
		"\3\2\2\2\u0ba7\u0ba6\3\2\2\2\u0ba8\u0256\3\2\2\2\u0ba9\u0bac\5\u0255\u012b"+
		"\2\u0baa\u0bac\t\23\2\2\u0bab\u0ba9\3\2\2\2\u0bab\u0baa\3\2\2\2\u0bac"+
		"\u0258\3\2\2\2:\2\u09c5\u09ca\u09d0\u09dc\u09e6\u09e8\u09f6\u0a04\u0a08"+
		"\u0a0c\u0a0f\u0a15\u0a19\u0a1b\u0a1e\u0a23\u0a29\u0a2f\u0a36\u0a38\u0a3f"+
		"\u0a45\u0a4b\u0a52\u0a54\u0a58\u0a5e\u0a64\u0a69\u0a7e\u0a82\u0a8d\u0b18"+
		"\u0b1a\u0b20\u0b25\u0b2a\u0b30\u0b3c\u0b59\u0b5f\u0b61\u0b69\u0b6f\u0b75"+
		"\u0b7c\u0b82\u0b89\u0b8c\u0b92\u0b97\u0b9f\u0ba3\u0ba7\u0bab\3\2\3\2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}