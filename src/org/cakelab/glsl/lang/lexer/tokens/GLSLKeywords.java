package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

import org.cakelab.glsl.GLSLParser;

public class GLSLKeywords {
	
	public static final int RESERVED_KEYWORD_TYPE = Integer.MIN_VALUE;

	private static final HashMap<String, Integer> parserTokens = new HashMap<String, Integer>();
	
	public static void put(String text, int type) {
		parserTokens.put(text, type);
	}
	public static Integer getTokenType(String text) {
		return parserTokens.get(text);
	}

	
	static {
		
		//
		// Punctuators
		// 
	
		
		//
		// Keywords
		//
		
		
		parserTokens.put("attribute", GLSLParser.ATTRIBUTE);
		parserTokens.put("const", GLSLParser.CONST);
		parserTokens.put("uniform", GLSLParser.UNIFORM);
		parserTokens.put("varying", GLSLParser.VARYING);
		
		parserTokens.put("break", GLSLParser.BREAK);
		parserTokens.put("continue", GLSLParser.CONTINUE);
		parserTokens.put("do", GLSLParser.DO);
		parserTokens.put("for", GLSLParser.FOR);
		parserTokens.put("while", GLSLParser.WHILE);
		
		parserTokens.put("if", GLSLParser.IF);
		parserTokens.put("else", GLSLParser.ELSE);
	
		parserTokens.put("in", GLSLParser.IN);
		parserTokens.put("out", GLSLParser.OUT);
		parserTokens.put("inout", GLSLParser.INOUT);
	
		
		
		
		parserTokens.put("bool", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("true", GLSLParser.BOOLCONSTANT);
		parserTokens.put("false", GLSLParser.BOOLCONSTANT);
	
		parserTokens.put("discard", GLSLParser.DISCARD);
		parserTokens.put("return", GLSLParser.RETURN);
	
		
	
		parserTokens.put("buffer", GLSLParser.BUFFER);
		parserTokens.put("shared", GLSLParser.SHARED);
		parserTokens.put("coherent", GLSLParser.COHERENT);
		parserTokens.put("volatile", GLSLParser.VOLATILE);
		parserTokens.put("restrict", GLSLParser.RESTRICT);
		parserTokens.put("readonly", GLSLParser.READONLY);
		parserTokens.put("writeonly", GLSLParser.WRITEONLY);
		
		parserTokens.put("layout", GLSLParser.LAYOUT);
		parserTokens.put("centroid", GLSLParser.CENTROID);
		parserTokens.put("flat", GLSLParser.FLAT);
		parserTokens.put("smooth", GLSLParser.SMOOTH);
		parserTokens.put("noperspective", GLSLParser.NOPERSPECTIVE);
		parserTokens.put("patch", GLSLParser.PATCH);
		parserTokens.put("sample", GLSLParser.SAMPLE);
		
		parserTokens.put("switch", GLSLParser.SWITCH);
		parserTokens.put("case", GLSLParser.CASE);
		parserTokens.put("default", GLSLParser.DEFAULT);
		parserTokens.put("subroutine", GLSLParser.SUBROUTINE);
		parserTokens.put("invariant", GLSLParser.INVARIANT);
		parserTokens.put("precise", GLSLParser.PRECISE);
	
		parserTokens.put("lowp", GLSLParser.LOWP);
		parserTokens.put("mediump", GLSLParser.MEDIUMP);
		parserTokens.put("highp", GLSLParser.HIGHP);
		parserTokens.put("precision", GLSLParser.PRECISION);
	
		parserTokens.put("struct", GLSLParser.STRUCT);
	
		
		// reserved keywords
		parserTokens.put("common", RESERVED_KEYWORD_TYPE);
		parserTokens.put("partition", RESERVED_KEYWORD_TYPE);
		parserTokens.put("active", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("resource", RESERVED_KEYWORD_TYPE);
		parserTokens.put("asm", RESERVED_KEYWORD_TYPE);
	
		parserTokens.put("class", RESERVED_KEYWORD_TYPE);
		parserTokens.put("union", RESERVED_KEYWORD_TYPE);
		parserTokens.put("enum", RESERVED_KEYWORD_TYPE);
		parserTokens.put("typedef", RESERVED_KEYWORD_TYPE);
		parserTokens.put("template", RESERVED_KEYWORD_TYPE);
		parserTokens.put("this", RESERVED_KEYWORD_TYPE);
		parserTokens.put("packed", RESERVED_KEYWORD_TYPE);
	
		parserTokens.put("goto", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("inline", RESERVED_KEYWORD_TYPE);
		parserTokens.put("noinline", RESERVED_KEYWORD_TYPE);
		parserTokens.put("public", RESERVED_KEYWORD_TYPE);
		parserTokens.put("static", RESERVED_KEYWORD_TYPE);
		parserTokens.put("extern", RESERVED_KEYWORD_TYPE);
		parserTokens.put("external", RESERVED_KEYWORD_TYPE);
		parserTokens.put("interface", RESERVED_KEYWORD_TYPE);
				
		parserTokens.put("half", RESERVED_KEYWORD_TYPE);
		parserTokens.put("fixed", RESERVED_KEYWORD_TYPE);
		parserTokens.put("unsigned", RESERVED_KEYWORD_TYPE);
		parserTokens.put("superp", RESERVED_KEYWORD_TYPE);
	
		parserTokens.put("input", RESERVED_KEYWORD_TYPE);
		parserTokens.put("output", RESERVED_KEYWORD_TYPE);
				
		parserTokens.put("hvec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("hvec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("hvec4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("fvec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("fvec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("fvec4", GLSLParser.BUILTIN_TYPE);
		
		parserTokens.put("filter", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("sizeof", RESERVED_KEYWORD_TYPE);
		parserTokens.put("cast", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("namespace", RESERVED_KEYWORD_TYPE);
		parserTokens.put("using", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("row_major", RESERVED_KEYWORD_TYPE);
	
		
		
	
		
		parserTokens.put("float", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("int", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("void", GLSLParser.VOID);
		
		parserTokens.put("long", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("short", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("double", GLSLParser.BUILTIN_TYPE);
	
		parserTokens.put("uint", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("atomic_uint", GLSLParser.BUILTIN_TYPE);
	
		parserTokens.put("mat2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat2x2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat2x3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat2x4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat2x2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat2x3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat2x4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat3x2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat3x3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat3x4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat3x2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat3x3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat3x4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat4x2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat4x3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("mat4x4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat4x2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat4x3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dmat4x4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("vec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("vec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("vec4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("ivec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("ivec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("ivec4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("bvec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("bvec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("bvec4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dvec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dvec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("dvec4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uvec2", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uvec3", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uvec4", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler1D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler3D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("samplerCube", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler1DShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler3DShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DRectShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("samplerCubeShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler1DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler1DArrayShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DArrayShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler1D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler2D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler3D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isamplerCube", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler1DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler2DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler1D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler2D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler3D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usamplerCube", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler1DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler2DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler3DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler2DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler2DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("samplerBuffer", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isamplerBuffer", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usamplerBuffer", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DMS", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler2DMS", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler2DMS", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("sampler2DMSArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isampler2DMSArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usampler2DMSArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("samplerCubeArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("samplerCubeArrayShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("isamplerCubeArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("usamplerCubeArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image1D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage1D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage1D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage2D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage2D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image3D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage3D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage3D", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage2DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage2DRect", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("imageCube", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimageCube", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimageCube", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("imageBuffer", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimageBuffer", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimageBuffer", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image1DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage1DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage1DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage2DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage2DArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("imageCubeArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimageCubeArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimageCubeArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2DMS", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage2DMS", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage2DMS", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2DMSArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("iimage2DMSArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("uimage2DMSArray", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("samplerExternalOES", GLSLParser.BUILTIN_TYPE);
	
	
		// reserved
	
		parserTokens.put("image1DShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2DShadow", GLSLParser.BUILTIN_TYPE);
	
		parserTokens.put("image1DArrayShadow", GLSLParser.BUILTIN_TYPE);
		parserTokens.put("image2DArrayShadow", GLSLParser.BUILTIN_TYPE);


	}


	public static boolean contains(String keyword) {
		return parserTokens.containsKey(keyword);
	}






	
	
}
