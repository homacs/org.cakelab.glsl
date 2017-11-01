package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

import org.cakelab.glsl.GLSLParser;

public class ANTLRVocabulary extends Vocabulary {
	
	private static final Integer BUILTIN_TYPE_TOKEN = GLSLParser.IDENTIFIER;
	private static final Integer RESERVED_KEYWORD_TOKEN = Integer.MIN_VALUE;


	
	
	@SuppressWarnings("serial")
	static class Punctuators extends HashMap<String, Integer> {
		public Punctuators() {
			put("<<", GLSLParser.LEFT_OP);
			put(">>", GLSLParser.RIGHT_OP);
			put("++", GLSLParser.INC_OP);
			put("--", GLSLParser.DEC_OP);
			put("<=", GLSLParser.LE_OP);
			put(">=", GLSLParser.GE_OP);
			put("==", GLSLParser.EQ_OP);
			put("!=", GLSLParser.NE_OP);
			put("&&", GLSLParser.AND_OP);
			put("||", GLSLParser.OR_OP);
			put("^^", GLSLParser.XOR_OP);
			put("*=", GLSLParser.MUL_ASSIGN);
			put("/=", GLSLParser.DIV_ASSIGN);
			put("+=", GLSLParser.ADD_ASSIGN);
			put("%=", GLSLParser.MOD_ASSIGN);
			put("<<=", GLSLParser.LEFT_ASSIGN);
			put(">>=", GLSLParser.RIGHT_ASSIGN);
			put("&=", GLSLParser.AND_ASSIGN);
			put("^=", GLSLParser.XOR_ASSIGN);
			put("|=", GLSLParser.OR_ASSIGN);
			put("-=", GLSLParser.SUB_ASSIGN);
			put("(", GLSLParser.LEFT_PAREN);
			put(")", GLSLParser.RIGHT_PAREN);
			put("[", GLSLParser.LEFT_BRACKET);
			put("]", GLSLParser.RIGHT_BRACKET);
			put("{", GLSLParser.LEFT_BRACE);
			put("}", GLSLParser.RIGHT_BRACE);
			put(".", GLSLParser.DOT);
			put(",", GLSLParser.COMMA);
			put(":", GLSLParser.COLON);
			put("=", GLSLParser.EQUAL);
			put(";", GLSLParser.SEMICOLON);
			put("!", GLSLParser.BANG);
			put("-", GLSLParser.DASH);
			put("~", GLSLParser.TILDE);
			put("+", GLSLParser.PLUS);
			put("*", GLSLParser.STAR);
			put("/", GLSLParser.SLASH);
			put("%", GLSLParser.PERCENT);
			put("<", GLSLParser.LEFT_ANGLE);
			put(">", GLSLParser.RIGHT_ANGLE);
			put("|", GLSLParser.VERTICAL_BAR);
			put("^", GLSLParser.CARET);
			put("&", GLSLParser.AMPERSAND);
			put("?", GLSLParser.QUESTION);
		}
	}
	
	
	@SuppressWarnings("serial")
	static class Keywords extends HashMap<String, Integer> {
		
		Keywords() {
			
			put("attribute", GLSLParser.ATTRIBUTE);
			put("const", GLSLParser.CONST);
			put("uniform", GLSLParser.UNIFORM);
			put("varying", GLSLParser.VARYING);
			
			put("break", GLSLParser.BREAK);
			put("continue", GLSLParser.CONTINUE);
			put("do", GLSLParser.DO);
			put("for", GLSLParser.FOR);
			put("while", GLSLParser.WHILE);
			
			put("if", GLSLParser.IF);
			put("else", GLSLParser.ELSE);
		
			put("in", GLSLParser.IN);
			put("out", GLSLParser.OUT);
			put("inout", GLSLParser.INOUT);
		
			
			
			
			put("bool", BUILTIN_TYPE_TOKEN);
			put("true", GLSLParser.BOOLCONSTANT);
			put("false", GLSLParser.BOOLCONSTANT);
		
			put("discard", GLSLParser.DISCARD);
			put("return", GLSLParser.RETURN);
		
			
		
			put("buffer", GLSLParser.BUFFER);
			put("shared", GLSLParser.SHARED);
			put("coherent", GLSLParser.COHERENT);
			put("volatile", GLSLParser.VOLATILE);
			put("restrict", GLSLParser.RESTRICT);
			put("readonly", GLSLParser.READONLY);
			put("writeonly", GLSLParser.WRITEONLY);
			
			put("layout", GLSLParser.LAYOUT);
			put("centroid", GLSLParser.CENTROID);
			put("flat", GLSLParser.FLAT);
			put("smooth", GLSLParser.SMOOTH);
			put("noperspective", GLSLParser.NOPERSPECTIVE);
			put("patch", GLSLParser.PATCH);
			put("sample", GLSLParser.SAMPLE);
			
			put("switch", GLSLParser.SWITCH);
			put("case", GLSLParser.CASE);
			put("default", GLSLParser.DEFAULT);
			put("subroutine", GLSLParser.SUBROUTINE);
			put("invariant", GLSLParser.INVARIANT);
			put("precise", GLSLParser.PRECISE);
		
			put("lowp", GLSLParser.LOWP);
			put("mediump", GLSLParser.MEDIUMP);
			put("highp", GLSLParser.HIGHP);
			put("precision", GLSLParser.PRECISION);
		
			put("struct", GLSLParser.STRUCT);
		
			
			// reserved keywords
			put("common", RESERVED_KEYWORD_TOKEN);
			put("partition", RESERVED_KEYWORD_TOKEN);
			put("active", RESERVED_KEYWORD_TOKEN);
			
			put("resource", RESERVED_KEYWORD_TOKEN);
			put("asm", RESERVED_KEYWORD_TOKEN);
		
			put("class", RESERVED_KEYWORD_TOKEN);
			put("union", RESERVED_KEYWORD_TOKEN);
			put("enum", RESERVED_KEYWORD_TOKEN);
			put("typedef", RESERVED_KEYWORD_TOKEN);
			put("template", RESERVED_KEYWORD_TOKEN);
			put("this", RESERVED_KEYWORD_TOKEN);
			put("packed", RESERVED_KEYWORD_TOKEN);
		
			put("goto", RESERVED_KEYWORD_TOKEN);
			
			put("inline", RESERVED_KEYWORD_TOKEN);
			put("noinline", RESERVED_KEYWORD_TOKEN);
			put("public", RESERVED_KEYWORD_TOKEN);
			put("static", RESERVED_KEYWORD_TOKEN);
			put("extern", RESERVED_KEYWORD_TOKEN);
			put("external", RESERVED_KEYWORD_TOKEN);
			put("interface", RESERVED_KEYWORD_TOKEN);
					
			put("half", RESERVED_KEYWORD_TOKEN);
			put("fixed", RESERVED_KEYWORD_TOKEN);
			put("unsigned", RESERVED_KEYWORD_TOKEN);
			put("superp", RESERVED_KEYWORD_TOKEN);
		
			put("input", RESERVED_KEYWORD_TOKEN);
			put("output", RESERVED_KEYWORD_TOKEN);
					
			put("hvec2", BUILTIN_TYPE_TOKEN);
			put("hvec3", BUILTIN_TYPE_TOKEN);
			put("hvec4", BUILTIN_TYPE_TOKEN);
			put("fvec2", BUILTIN_TYPE_TOKEN);
			put("fvec3", BUILTIN_TYPE_TOKEN);
			put("fvec4", BUILTIN_TYPE_TOKEN);
			
			put("filter", RESERVED_KEYWORD_TOKEN);
			
			put("sizeof", RESERVED_KEYWORD_TOKEN);
			put("cast", RESERVED_KEYWORD_TOKEN);
			
			put("namespace", RESERVED_KEYWORD_TOKEN);
			put("using", RESERVED_KEYWORD_TOKEN);
			
			put("row_major", RESERVED_KEYWORD_TOKEN);
		
			
			
		
			
			put("float", BUILTIN_TYPE_TOKEN);
			put("int", BUILTIN_TYPE_TOKEN);
			put("void", GLSLParser.VOID);
			
			put("long", BUILTIN_TYPE_TOKEN);
			put("short", BUILTIN_TYPE_TOKEN);
			put("double", BUILTIN_TYPE_TOKEN);
		
			put("uint", BUILTIN_TYPE_TOKEN);
			put("atomic_uint", BUILTIN_TYPE_TOKEN);
		
			put("mat2", BUILTIN_TYPE_TOKEN);
			put("mat3", BUILTIN_TYPE_TOKEN);
			put("mat4", BUILTIN_TYPE_TOKEN);
			put("dmat2", BUILTIN_TYPE_TOKEN);
			put("dmat3", BUILTIN_TYPE_TOKEN);
			put("dmat4", BUILTIN_TYPE_TOKEN);
			put("mat2x2", BUILTIN_TYPE_TOKEN);
			put("mat2x3", BUILTIN_TYPE_TOKEN);
			put("mat2x4", BUILTIN_TYPE_TOKEN);
			put("dmat2x2", BUILTIN_TYPE_TOKEN);
			put("dmat2x3", BUILTIN_TYPE_TOKEN);
			put("dmat2x4", BUILTIN_TYPE_TOKEN);
			put("mat3x2", BUILTIN_TYPE_TOKEN);
			put("mat3x3", BUILTIN_TYPE_TOKEN);
			put("mat3x4", BUILTIN_TYPE_TOKEN);
			put("dmat3x2", BUILTIN_TYPE_TOKEN);
			put("dmat3x3", BUILTIN_TYPE_TOKEN);
			put("dmat3x4", BUILTIN_TYPE_TOKEN);
			put("mat4x2", BUILTIN_TYPE_TOKEN);
			put("mat4x3", BUILTIN_TYPE_TOKEN);
			put("mat4x4", BUILTIN_TYPE_TOKEN);
			put("dmat4x2", BUILTIN_TYPE_TOKEN);
			put("dmat4x3", BUILTIN_TYPE_TOKEN);
			put("dmat4x4", BUILTIN_TYPE_TOKEN);
			put("vec2", BUILTIN_TYPE_TOKEN);
			put("vec3", BUILTIN_TYPE_TOKEN);
			put("vec4", BUILTIN_TYPE_TOKEN);
			put("ivec2", BUILTIN_TYPE_TOKEN);
			put("ivec3", BUILTIN_TYPE_TOKEN);
			put("ivec4", BUILTIN_TYPE_TOKEN);
			put("bvec2", BUILTIN_TYPE_TOKEN);
			put("bvec3", BUILTIN_TYPE_TOKEN);
			put("bvec4", BUILTIN_TYPE_TOKEN);
			put("dvec2", BUILTIN_TYPE_TOKEN);
			put("dvec3", BUILTIN_TYPE_TOKEN);
			put("dvec4", BUILTIN_TYPE_TOKEN);
			put("uvec2", BUILTIN_TYPE_TOKEN);
			put("uvec3", BUILTIN_TYPE_TOKEN);
			put("uvec4", BUILTIN_TYPE_TOKEN);
			put("sampler1D", BUILTIN_TYPE_TOKEN);
			put("sampler2D", BUILTIN_TYPE_TOKEN);
			put("sampler3D", BUILTIN_TYPE_TOKEN);
			put("samplerCube", BUILTIN_TYPE_TOKEN);
			put("sampler1DShadow", BUILTIN_TYPE_TOKEN);
			put("sampler2DShadow", BUILTIN_TYPE_TOKEN);
			put("sampler3DShadow", BUILTIN_TYPE_TOKEN);
			put("sampler2DRectShadow", BUILTIN_TYPE_TOKEN);
			put("samplerCubeShadow", BUILTIN_TYPE_TOKEN);
			put("sampler1DArray", BUILTIN_TYPE_TOKEN);
			put("sampler2DArray", BUILTIN_TYPE_TOKEN);
			put("sampler1DArrayShadow", BUILTIN_TYPE_TOKEN);
			put("sampler2DArrayShadow", BUILTIN_TYPE_TOKEN);
			put("isampler1D", BUILTIN_TYPE_TOKEN);
			put("isampler2D", BUILTIN_TYPE_TOKEN);
			put("isampler3D", BUILTIN_TYPE_TOKEN);
			put("isamplerCube", BUILTIN_TYPE_TOKEN);
			put("isampler1DArray", BUILTIN_TYPE_TOKEN);
			put("isampler2DArray", BUILTIN_TYPE_TOKEN);
			put("usampler1D", BUILTIN_TYPE_TOKEN);
			put("usampler2D", BUILTIN_TYPE_TOKEN);
			put("usampler3D", BUILTIN_TYPE_TOKEN);
			put("usamplerCube", BUILTIN_TYPE_TOKEN);
			put("usampler1DArray", BUILTIN_TYPE_TOKEN);
			put("usampler2DArray", BUILTIN_TYPE_TOKEN);
			put("sampler2DRect", BUILTIN_TYPE_TOKEN);
			put("sampler3DRect", BUILTIN_TYPE_TOKEN);
			put("isampler2DRect", BUILTIN_TYPE_TOKEN);
			put("usampler2DRect", BUILTIN_TYPE_TOKEN);
			put("samplerBuffer", BUILTIN_TYPE_TOKEN);
			put("isamplerBuffer", BUILTIN_TYPE_TOKEN);
			put("usamplerBuffer", BUILTIN_TYPE_TOKEN);
			put("sampler2DMS", BUILTIN_TYPE_TOKEN);
			put("isampler2DMS", BUILTIN_TYPE_TOKEN);
			put("usampler2DMS", BUILTIN_TYPE_TOKEN);
			put("sampler2DMSArray", BUILTIN_TYPE_TOKEN);
			put("isampler2DMSArray", BUILTIN_TYPE_TOKEN);
			put("usampler2DMSArray", BUILTIN_TYPE_TOKEN);
			put("samplerCubeArray", BUILTIN_TYPE_TOKEN);
			put("samplerCubeArrayShadow", BUILTIN_TYPE_TOKEN);
			put("isamplerCubeArray", BUILTIN_TYPE_TOKEN);
			put("usamplerCubeArray", BUILTIN_TYPE_TOKEN);
			put("image1D", BUILTIN_TYPE_TOKEN);
			put("iimage1D", BUILTIN_TYPE_TOKEN);
			put("uimage1D", BUILTIN_TYPE_TOKEN);
			put("image2D", BUILTIN_TYPE_TOKEN);
			put("iimage2D", BUILTIN_TYPE_TOKEN);
			put("uimage2D", BUILTIN_TYPE_TOKEN);
			put("image3D", BUILTIN_TYPE_TOKEN);
			put("iimage3D", BUILTIN_TYPE_TOKEN);
			put("uimage3D", BUILTIN_TYPE_TOKEN);
			put("image2DRect", BUILTIN_TYPE_TOKEN);
			put("iimage2DRect", BUILTIN_TYPE_TOKEN);
			put("uimage2DRect", BUILTIN_TYPE_TOKEN);
			put("imageCube", BUILTIN_TYPE_TOKEN);
			put("iimageCube", BUILTIN_TYPE_TOKEN);
			put("uimageCube", BUILTIN_TYPE_TOKEN);
			put("imageBuffer", BUILTIN_TYPE_TOKEN);
			put("iimageBuffer", BUILTIN_TYPE_TOKEN);
			put("uimageBuffer", BUILTIN_TYPE_TOKEN);
			put("image1DArray", BUILTIN_TYPE_TOKEN);
			put("iimage1DArray", BUILTIN_TYPE_TOKEN);
			put("uimage1DArray", BUILTIN_TYPE_TOKEN);
			put("image2DArray", BUILTIN_TYPE_TOKEN);
			put("iimage2DArray", BUILTIN_TYPE_TOKEN);
			put("uimage2DArray", BUILTIN_TYPE_TOKEN);
			put("imageCubeArray", BUILTIN_TYPE_TOKEN);
			put("iimageCubeArray", BUILTIN_TYPE_TOKEN);
			put("uimageCubeArray", BUILTIN_TYPE_TOKEN);
			put("image2DMS", BUILTIN_TYPE_TOKEN);
			put("iimage2DMS", BUILTIN_TYPE_TOKEN);
			put("uimage2DMS", BUILTIN_TYPE_TOKEN);
			put("image2DMSArray", BUILTIN_TYPE_TOKEN);
			put("iimage2DMSArray", BUILTIN_TYPE_TOKEN);
			put("uimage2DMSArray", BUILTIN_TYPE_TOKEN);
			put("samplerExternalOES", BUILTIN_TYPE_TOKEN);
		
		
			// reserved
		
			put("image1DShadow", BUILTIN_TYPE_TOKEN);
			put("image2DShadow", BUILTIN_TYPE_TOKEN);
		
			put("image1DArrayShadow", BUILTIN_TYPE_TOKEN);
			put("image2DArrayShadow", BUILTIN_TYPE_TOKEN);


		}

	}
	
	
	
	
	
	private Punctuators punctuators = new Punctuators();
	private Keywords keywords = new Keywords();
	
	
	
	@Override
	public HashMap<String, Integer> punctuators() {
		return punctuators;
	}



	@Override
	public Integer keyword(String text) {
		return keywords.get(text);
	}



	@Override
	public Integer builtintype() {
		return BUILTIN_TYPE_TOKEN;
	}

	
	
	
}
