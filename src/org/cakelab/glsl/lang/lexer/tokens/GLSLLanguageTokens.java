package org.cakelab.glsl.lang.lexer.tokens;

import org.cakelab.glsl.GLSLParser;

public class GLSLLanguageTokens {
	
	public static final int RESERVED_KEYWORD = Integer.MIN_VALUE;

	
	
	//
	// Punctuators
	// 
	public static final GLSLParserToken LEFT_OP = new GLSLParserToken("<<", GLSLParser.LEFT_OP);
	public static final GLSLParserToken RIGHT_OP = new GLSLParserToken(">>", GLSLParser.RIGHT_OP);
	public static final GLSLParserToken INC_OP = new GLSLParserToken("++", GLSLParser.INC_OP);
	public static final GLSLParserToken DEC_OP = new GLSLParserToken("--", GLSLParser.DEC_OP);
	public static final GLSLParserToken LE_OP = new GLSLParserToken("<=", GLSLParser.LE_OP);
	public static final GLSLParserToken GE_OP = new GLSLParserToken(">=", GLSLParser.GE_OP);
	public static final GLSLParserToken EQ_OP = new GLSLParserToken("==", GLSLParser.EQ_OP);
	public static final GLSLParserToken NE_OP = new GLSLParserToken("!=", GLSLParser.NE_OP);
	public static final GLSLParserToken AND_OP = new GLSLParserToken("&&", GLSLParser.AND_OP);
	public static final GLSLParserToken OR_OP = new GLSLParserToken("||", GLSLParser.OR_OP);
	public static final GLSLParserToken XOR_OP = new GLSLParserToken("^^", GLSLParser.XOR_OP);
	public static final GLSLParserToken MUL_ASSIGN = new GLSLParserToken("*=", GLSLParser.MUL_ASSIGN);
	public static final GLSLParserToken DIV_ASSIGN = new GLSLParserToken("/=", GLSLParser.DIV_ASSIGN);
	public static final GLSLParserToken ADD_ASSIGN = new GLSLParserToken("+=", GLSLParser.ADD_ASSIGN);
	public static final GLSLParserToken MOD_ASSIGN = new GLSLParserToken("%=", GLSLParser.MOD_ASSIGN);
	public static final GLSLParserToken LEFT_ASSIGN = new GLSLParserToken("<<=", GLSLParser.LEFT_ASSIGN);
	public static final GLSLParserToken RIGHT_ASSIGN = new GLSLParserToken(">>=", GLSLParser.RIGHT_ASSIGN);
	public static final GLSLParserToken AND_ASSIGN = new GLSLParserToken("&=", GLSLParser.AND_ASSIGN);
	public static final GLSLParserToken XOR_ASSIGN = new GLSLParserToken("^=", GLSLParser.XOR_ASSIGN);
	public static final GLSLParserToken OR_ASSIGN = new GLSLParserToken("|=", GLSLParser.OR_ASSIGN);
	public static final GLSLParserToken SUB_ASSIGN = new GLSLParserToken("-=", GLSLParser.SUB_ASSIGN);
	public static final GLSLParserToken LEFT_PAREN = new GLSLParserToken("(", GLSLParser.LEFT_PAREN);
	public static final GLSLParserToken RIGHT_PAREN = new GLSLParserToken(")", GLSLParser.RIGHT_PAREN);
	public static final GLSLParserToken LEFT_BRACKET = new GLSLParserToken("[", GLSLParser.LEFT_BRACKET);
	public static final GLSLParserToken RIGHT_BRACKET = new GLSLParserToken("]", GLSLParser.RIGHT_BRACKET);
	public static final GLSLParserToken LEFT_BRACE = new GLSLParserToken("{", GLSLParser.LEFT_BRACE);
	public static final GLSLParserToken RIGHT_BRACE = new GLSLParserToken("}", GLSLParser.RIGHT_BRACE);
	public static final GLSLParserToken DOT = new GLSLParserToken(".", GLSLParser.DOT);
	public static final GLSLParserToken COMMA = new GLSLParserToken(",", GLSLParser.COMMA);
	public static final GLSLParserToken COLON = new GLSLParserToken(":", GLSLParser.COLON);
	public static final GLSLParserToken EQUAL = new GLSLParserToken("=", GLSLParser.EQUAL);
	public static final GLSLParserToken SEMICOLON = new GLSLParserToken(";", GLSLParser.SEMICOLON);
	public static final GLSLParserToken BANG = new GLSLParserToken("!", GLSLParser.BANG);
	public static final GLSLParserToken DASH = new GLSLParserToken("-", GLSLParser.DASH);
	public static final GLSLParserToken TILDE = new GLSLParserToken("~", GLSLParser.TILDE);
	public static final GLSLParserToken PLUS = new GLSLParserToken("+", GLSLParser.PLUS);
	public static final GLSLParserToken STAR = new GLSLParserToken("*", GLSLParser.STAR);
	public static final GLSLParserToken SLASH = new GLSLParserToken("/", GLSLParser.SLASH);
	public static final GLSLParserToken PERCENT = new GLSLParserToken("%", GLSLParser.PERCENT);
	public static final GLSLParserToken LEFT_ANGLE = new GLSLParserToken("<", GLSLParser.LEFT_ANGLE);
	public static final GLSLParserToken RIGHT_ANGLE = new GLSLParserToken(">", GLSLParser.RIGHT_ANGLE);
	public static final GLSLParserToken VERTICAL_BAR = new GLSLParserToken("|", GLSLParser.VERTICAL_BAR);
	public static final GLSLParserToken CARET = new GLSLParserToken("^", GLSLParser.CARET);
	public static final GLSLParserToken AMPERSAND = new GLSLParserToken("&", GLSLParser.AMPERSAND);
	public static final GLSLParserToken QUESTION = new GLSLParserToken("?", GLSLParser.QUESTION);

	
	//
	// Keywords
	//
	
	
	public static final GLSLParserToken ATTRIBUTE = new GLSLParserToken("attribute", GLSLParser.ATTRIBUTE);
	public static final GLSLParserToken CONST = new GLSLParserToken("const", GLSLParser.CONST);
	public static final GLSLParserToken UNIFORM = new GLSLParserToken("uniform", GLSLParser.UNIFORM);
	public static final GLSLParserToken VARYING = new GLSLParserToken("varying", GLSLParser.VARYING);
	
	public static final GLSLParserToken BREAK = new GLSLParserToken("break", GLSLParser.BREAK);
	public static final GLSLParserToken CONTINUE = new GLSLParserToken("continue", GLSLParser.CONTINUE);
	public static final GLSLParserToken DO = new GLSLParserToken("do", GLSLParser.DO);
	public static final GLSLParserToken FOR = new GLSLParserToken("for", GLSLParser.FOR);
	public static final GLSLParserToken WHILE = new GLSLParserToken("while", GLSLParser.WHILE);
	
	public static final GLSLParserToken IF = new GLSLParserToken("if", GLSLParser.IF);
	public static final GLSLParserToken ELSE = new GLSLParserToken("else", GLSLParser.ELSE);

	public static final GLSLParserToken IN = new GLSLParserToken("in", GLSLParser.IN);
	public static final GLSLParserToken OUT = new GLSLParserToken("out", GLSLParser.OUT);
	public static final GLSLParserToken INOUT = new GLSLParserToken("inout", GLSLParser.INOUT);

	
	
	
	public static final GLSLParserToken BOOL = new GLSLParserToken("bool", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken TRUE = new GLSLParserToken("true", GLSLParser.BOOLCONSTANT);
	public static final GLSLParserToken FALSE = new GLSLParserToken("false", GLSLParser.BOOLCONSTANT);

	public static final GLSLParserToken DISCARD = new GLSLParserToken("discard", GLSLParser.DISCARD);
	public static final GLSLParserToken RETURN = new GLSLParserToken("return", GLSLParser.RETURN);

	

	public static final GLSLParserToken BUFFER = new GLSLParserToken("buffer", GLSLParser.BUFFER);
	public static final GLSLParserToken SHARED = new GLSLParserToken("shared", GLSLParser.SHARED);
	public static final GLSLParserToken COHERENT = new GLSLParserToken("coherent", GLSLParser.COHERENT);
	public static final GLSLParserToken VOLATILE = new GLSLParserToken("volatile", GLSLParser.VOLATILE);
	public static final GLSLParserToken RESTRICT = new GLSLParserToken("restrict", GLSLParser.RESTRICT);
	public static final GLSLParserToken READONLY = new GLSLParserToken("readonly", GLSLParser.READONLY);
	public static final GLSLParserToken WRITEONLY = new GLSLParserToken("writeonly", GLSLParser.WRITEONLY);
	
	public static final GLSLParserToken LAYOUT = new GLSLParserToken("layout", GLSLParser.LAYOUT);
	public static final GLSLParserToken CENTROID = new GLSLParserToken("centroid", GLSLParser.CENTROID);
	public static final GLSLParserToken FLAT = new GLSLParserToken("flat", GLSLParser.FLAT);
	public static final GLSLParserToken SMOOTH = new GLSLParserToken("smooth", GLSLParser.SMOOTH);
	public static final GLSLParserToken NOPERSPECTIVE = new GLSLParserToken("noperspective", GLSLParser.NOPERSPECTIVE);
	public static final GLSLParserToken PATCH = new GLSLParserToken("patch", GLSLParser.PATCH);
	public static final GLSLParserToken SAMPLE = new GLSLParserToken("sample", GLSLParser.SAMPLE);
	
	public static final GLSLParserToken SWITCH = new GLSLParserToken("switch", GLSLParser.SWITCH);
	public static final GLSLParserToken CASE = new GLSLParserToken("case", GLSLParser.CASE);
	public static final GLSLParserToken DEFAULT = new GLSLParserToken("default", GLSLParser.DEFAULT);
	public static final GLSLParserToken SUBROUTINE = new GLSLParserToken("subroutine", GLSLParser.SUBROUTINE);
	public static final GLSLParserToken INVARIANT = new GLSLParserToken("invariant", GLSLParser.INVARIANT);
	public static final GLSLParserToken PRECISE = new GLSLParserToken("precise", GLSLParser.PRECISE);

	public static final GLSLParserToken LOWP = new GLSLParserToken("lowp", GLSLParser.LOWP);
	public static final GLSLParserToken MEDIUMP = new GLSLParserToken("mediump", GLSLParser.MEDIUMP);
	public static final GLSLParserToken HIGHP = new GLSLParserToken("highp", GLSLParser.HIGHP);
	public static final GLSLParserToken PRECISION = new GLSLParserToken("precision", GLSLParser.PRECISION);

	public static final GLSLParserToken STRUCT = new GLSLParserToken("struct", GLSLParser.STRUCT);

	
	// reserved keywords
	public static final GLSLParserToken COMMON = new GLSLParserToken("common", RESERVED_KEYWORD);
	public static final GLSLParserToken PARTITION = new GLSLParserToken("partition", RESERVED_KEYWORD);
	public static final GLSLParserToken ACTIVE = new GLSLParserToken("active", RESERVED_KEYWORD);
	
	public static final GLSLParserToken RESOURCE = new GLSLParserToken("resource", RESERVED_KEYWORD);
	public static final GLSLParserToken ASM = new GLSLParserToken("asm", RESERVED_KEYWORD);

	public static final GLSLParserToken CLASS = new GLSLParserToken("class", RESERVED_KEYWORD);
	public static final GLSLParserToken UNION = new GLSLParserToken("union", RESERVED_KEYWORD);
	public static final GLSLParserToken ENUM = new GLSLParserToken("enum", RESERVED_KEYWORD);
	public static final GLSLParserToken TYPEDEF = new GLSLParserToken("typedef", RESERVED_KEYWORD);
	public static final GLSLParserToken TEMPLATE = new GLSLParserToken("template", RESERVED_KEYWORD);
	public static final GLSLParserToken THIS = new GLSLParserToken("this", RESERVED_KEYWORD);
	public static final GLSLParserToken PACKAGED = new GLSLParserToken("packaged", RESERVED_KEYWORD);

	public static final GLSLParserToken GOTO = new GLSLParserToken("goto", RESERVED_KEYWORD);
	
	public static final GLSLParserToken INLINE = new GLSLParserToken("inline", RESERVED_KEYWORD);
	public static final GLSLParserToken NOINLINE = new GLSLParserToken("noinline", RESERVED_KEYWORD);
	public static final GLSLParserToken PUBLIC = new GLSLParserToken("public", RESERVED_KEYWORD);
	public static final GLSLParserToken STATIC = new GLSLParserToken("static", RESERVED_KEYWORD);
	public static final GLSLParserToken EXTERN = new GLSLParserToken("extern", RESERVED_KEYWORD);
	public static final GLSLParserToken EXTERNAL = new GLSLParserToken("external", RESERVED_KEYWORD);
	public static final GLSLParserToken INTERFACE = new GLSLParserToken("interface", RESERVED_KEYWORD);
			
	public static final GLSLParserToken HALF = new GLSLParserToken("half", RESERVED_KEYWORD);
	public static final GLSLParserToken FIXED = new GLSLParserToken("fixed", RESERVED_KEYWORD);
	public static final GLSLParserToken UNSIGNED = new GLSLParserToken("unsigned", RESERVED_KEYWORD);
	public static final GLSLParserToken SUPERP = new GLSLParserToken("superp", RESERVED_KEYWORD);

	public static final GLSLParserToken INPUT = new GLSLParserToken("input", RESERVED_KEYWORD);
	public static final GLSLParserToken OUTPUT = new GLSLParserToken("output", RESERVED_KEYWORD);
			
	public static final GLSLParserToken HVEC2 = new GLSLParserToken("hvec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken HVEC3 = new GLSLParserToken("hvec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken HVEC4 = new GLSLParserToken("hvec4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken FVEC2 = new GLSLParserToken("fvec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken FVEC3 = new GLSLParserToken("fvec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken FVEC4 = new GLSLParserToken("fvec4", GLSLParser.BUILTIN_TYPE);
	
	public static final GLSLParserToken FILTER = new GLSLParserToken("filter", RESERVED_KEYWORD);
	
	public static final GLSLParserToken SIZEOF = new GLSLParserToken("sizeof", RESERVED_KEYWORD);
	public static final GLSLParserToken CAST = new GLSLParserToken("cast", RESERVED_KEYWORD);
	
	public static final GLSLParserToken NAMESPACE = new GLSLParserToken("namespace", RESERVED_KEYWORD);
	public static final GLSLParserToken USING = new GLSLParserToken("using", RESERVED_KEYWORD);
	
	public static final GLSLParserToken ROW_MAJOR = new GLSLParserToken("row_major", RESERVED_KEYWORD);

	
	

	
	public static final GLSLParserToken FLOAT = new GLSLParserToken("float", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken INT = new GLSLParserToken("int", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken VOID = new GLSLParserToken("void", GLSLParser.VOID);
	
	public static final GLSLParserToken LONG = new GLSLParserToken("long", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SHORT = new GLSLParserToken("short", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DOUBLE = new GLSLParserToken("double", GLSLParser.BUILTIN_TYPE);

	public static final GLSLParserToken UINT = new GLSLParserToken("uint", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ATOMIC_UINT = new GLSLParserToken("atomic_uint", GLSLParser.BUILTIN_TYPE);

	public static final GLSLParserToken MAT2 = new GLSLParserToken("mat2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT3 = new GLSLParserToken("mat3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT4 = new GLSLParserToken("mat4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT2 = new GLSLParserToken("dmat2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT3 = new GLSLParserToken("dmat3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT4 = new GLSLParserToken("dmat4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT2X2 = new GLSLParserToken("mat2X2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT2X3 = new GLSLParserToken("mat2X3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT2X4 = new GLSLParserToken("mat2X4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT2X2 = new GLSLParserToken("dmat2X2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT2X3 = new GLSLParserToken("dmat2X3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT2X4 = new GLSLParserToken("dmat2X4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT3X2 = new GLSLParserToken("mat3X2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT3X3 = new GLSLParserToken("mat3X3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT3X4 = new GLSLParserToken("mat3X4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT3X2 = new GLSLParserToken("dmat3X2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT3X3 = new GLSLParserToken("dmat3X3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT3X4 = new GLSLParserToken("dmat3X4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT4X2 = new GLSLParserToken("mat4X2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT4X3 = new GLSLParserToken("mat4X3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken MAT4X4 = new GLSLParserToken("mat4X4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT4X2 = new GLSLParserToken("dmat4X2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT4X3 = new GLSLParserToken("dmat4X3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DMAT4X4 = new GLSLParserToken("dmat4X4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken VEC2 = new GLSLParserToken("vec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken VEC3 = new GLSLParserToken("vec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken VEC4 = new GLSLParserToken("vec4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IVEC2 = new GLSLParserToken("ivec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IVEC3 = new GLSLParserToken("ivec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IVEC4 = new GLSLParserToken("ivec4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken BVEC2 = new GLSLParserToken("bvec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken BVEC3 = new GLSLParserToken("bvec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken BVEC4 = new GLSLParserToken("bvec4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DVEC2 = new GLSLParserToken("dvec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DVEC3 = new GLSLParserToken("dvec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken DVEC4 = new GLSLParserToken("dvec4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UVEC2 = new GLSLParserToken("uvec2", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UVEC3 = new GLSLParserToken("uvec3", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UVEC4 = new GLSLParserToken("uvec4", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER1D = new GLSLParserToken("sampler1D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2D = new GLSLParserToken("sampler2D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER3D = new GLSLParserToken("sampler3D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLERCUBE = new GLSLParserToken("samplerCube", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER1DSHADOW = new GLSLParserToken("sampler1DShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DSHADOW = new GLSLParserToken("sampler2DShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER3DSHADOW = new GLSLParserToken("sampler3DShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DRECTSHADOW = new GLSLParserToken("sampler2DRectShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLERCUBESHADOW = new GLSLParserToken("samplerCubeShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER1DARRAY = new GLSLParserToken("sampler1DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DARRAY = new GLSLParserToken("sampler2DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER1DARRAYSHADOW = new GLSLParserToken("sampler1DArrayShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DARRAYSHADOW = new GLSLParserToken("sampler2DArrayShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER1D = new GLSLParserToken("isampler1D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER2D = new GLSLParserToken("isampler2D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER3D = new GLSLParserToken("isampler3D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLERCUBE = new GLSLParserToken("isamplerCube", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER1DARRAY = new GLSLParserToken("isampler1DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER2DARRAY = new GLSLParserToken("isampler2DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER1D = new GLSLParserToken("usampler1D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER2D = new GLSLParserToken("usampler2D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER3D = new GLSLParserToken("usampler3D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLERCUBE = new GLSLParserToken("usamplerCube", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER1DARRAY = new GLSLParserToken("usampler1DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER2DARRAY = new GLSLParserToken("usampler2DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DRECT = new GLSLParserToken("sampler2DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER3DRECT = new GLSLParserToken("sampler3DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER2DRECT = new GLSLParserToken("isampler2DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER2DRECT = new GLSLParserToken("usampler2DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLERBUFFER = new GLSLParserToken("samplerBuffer", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLERBUFFER = new GLSLParserToken("isamplerBuffer", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLERBUFFER = new GLSLParserToken("usamplerBuffer", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DMS = new GLSLParserToken("sampler2DMS", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER2DMS = new GLSLParserToken("isampler2DMS", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER2DMS = new GLSLParserToken("usampler2DMS", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLER2DMSARRAY = new GLSLParserToken("sampler2DMSArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLER2DMSARRAY = new GLSLParserToken("isampler2DMSArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLER2DMSARRAY = new GLSLParserToken("usampler2DMSArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLERCUBEARRAY = new GLSLParserToken("samplerCubeArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLERCUBEARRAYSHADOW = new GLSLParserToken("samplerCubeArrayShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken ISAMPLERCUBEARRAY = new GLSLParserToken("isamplerCubeArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken USAMPLERCUBEARRAY = new GLSLParserToken("usamplerCubeArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE1D = new GLSLParserToken("image1D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE1D = new GLSLParserToken("iimage1D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE1D = new GLSLParserToken("uimage1D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2D = new GLSLParserToken("image2D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE2D = new GLSLParserToken("iimage2D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE2D = new GLSLParserToken("uimage2D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE3D = new GLSLParserToken("image3D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE3D = new GLSLParserToken("iimage3D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE3D = new GLSLParserToken("uimage3D", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2DRECT = new GLSLParserToken("image2DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE2DRECT = new GLSLParserToken("iimage2DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE2DRECT = new GLSLParserToken("uimage2DRect", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGECUBE = new GLSLParserToken("imageCube", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGECUBE = new GLSLParserToken("iimageCube", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGECUBE = new GLSLParserToken("uimageCube", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGEBUFFER = new GLSLParserToken("imageBuffer", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGEBUFFER = new GLSLParserToken("iimageBuffer", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGEBUFFER = new GLSLParserToken("uimageBuffer", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE1DARRAY = new GLSLParserToken("image1DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE1DARRAY = new GLSLParserToken("iimage1DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE1DARRAY = new GLSLParserToken("uimage1DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2DARRAY = new GLSLParserToken("image2DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE2DARRAY = new GLSLParserToken("iimage2DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE2DARRAY = new GLSLParserToken("uimage2DArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGECUBEARRAY = new GLSLParserToken("imageCubeArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGECUBEARRAY = new GLSLParserToken("iimageCubeArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGECUBEARRAY = new GLSLParserToken("uimageCubeArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2DMS = new GLSLParserToken("image2DMS", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE2DMS = new GLSLParserToken("iimage2DMS", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE2DMS = new GLSLParserToken("uimage2DMS", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2DMSARRAY = new GLSLParserToken("image2DMSArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IIMAGE2DMSARRAY = new GLSLParserToken("iimage2DMSArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken UIMAGE2DMSARRAY = new GLSLParserToken("uimage2DMSArray", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken SAMPLERExternalOES = new GLSLParserToken("samplerExternalOES", GLSLParser.BUILTIN_TYPE);


	// reserved

	public static final GLSLParserToken IMAGE1DSHADOW = new GLSLParserToken("image1DShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2DSHADOW = new GLSLParserToken("image2DShadow", GLSLParser.BUILTIN_TYPE);

	public static final GLSLParserToken IMAGE1DARRAYSHADOW = new GLSLParserToken("image1DArrayShadow", GLSLParser.BUILTIN_TYPE);
	public static final GLSLParserToken IMAGE2DARRAYSHADOW = new GLSLParserToken("image2DArrayShadow", GLSLParser.BUILTIN_TYPE);









	
	
}
