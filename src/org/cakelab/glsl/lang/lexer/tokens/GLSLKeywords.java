package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

import org.cakelab.glsl.GLSLParser;

/**
 * This is the set of mappings for keywords to GLSLParser token types. 
 * 
 * <p>
 * A GLSLTokenTable copies those mappings only, which are supported by
 * the corresponding glsl version. 
 * </p>
 * 
 * <p>
 * Keywords mapped to {@link #RESERVED_KEYWORD_TYPE} are not yet known
 * to the GLSLParser and can be added to a GLSLTokenTable as reserved 
 * keywords only.
 * </p>
 * 
 * @author homac
 *
 */
public class GLSLKeywords {
	
	public static final int RESERVED_KEYWORD_TYPE = Integer.MIN_VALUE;

	private static final HashMap<String, Integer> parserTokens = new HashMap<String, Integer>();

	private static final Integer BUILTIN_TYPE = GLSLParser.IDENTIFIER;
	
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
	
		
		
		
		parserTokens.put("bool", BUILTIN_TYPE);
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
				
		parserTokens.put("hvec2", BUILTIN_TYPE);
		parserTokens.put("hvec3", BUILTIN_TYPE);
		parserTokens.put("hvec4", BUILTIN_TYPE);
		parserTokens.put("fvec2", BUILTIN_TYPE);
		parserTokens.put("fvec3", BUILTIN_TYPE);
		parserTokens.put("fvec4", BUILTIN_TYPE);
		
		parserTokens.put("filter", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("sizeof", RESERVED_KEYWORD_TYPE);
		parserTokens.put("cast", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("namespace", RESERVED_KEYWORD_TYPE);
		parserTokens.put("using", RESERVED_KEYWORD_TYPE);
		
		parserTokens.put("row_major", RESERVED_KEYWORD_TYPE);
	
		
		
	
		
		parserTokens.put("float", BUILTIN_TYPE);
		parserTokens.put("int", BUILTIN_TYPE);
		parserTokens.put("void", GLSLParser.VOID);
		
		parserTokens.put("long", BUILTIN_TYPE);
		parserTokens.put("short", BUILTIN_TYPE);
		parserTokens.put("double", BUILTIN_TYPE);
	
		parserTokens.put("uint", BUILTIN_TYPE);
		parserTokens.put("atomic_uint", BUILTIN_TYPE);
	
		parserTokens.put("mat2", BUILTIN_TYPE);
		parserTokens.put("mat3", BUILTIN_TYPE);
		parserTokens.put("mat4", BUILTIN_TYPE);
		parserTokens.put("dmat2", BUILTIN_TYPE);
		parserTokens.put("dmat3", BUILTIN_TYPE);
		parserTokens.put("dmat4", BUILTIN_TYPE);
		parserTokens.put("mat2x2", BUILTIN_TYPE);
		parserTokens.put("mat2x3", BUILTIN_TYPE);
		parserTokens.put("mat2x4", BUILTIN_TYPE);
		parserTokens.put("dmat2x2", BUILTIN_TYPE);
		parserTokens.put("dmat2x3", BUILTIN_TYPE);
		parserTokens.put("dmat2x4", BUILTIN_TYPE);
		parserTokens.put("mat3x2", BUILTIN_TYPE);
		parserTokens.put("mat3x3", BUILTIN_TYPE);
		parserTokens.put("mat3x4", BUILTIN_TYPE);
		parserTokens.put("dmat3x2", BUILTIN_TYPE);
		parserTokens.put("dmat3x3", BUILTIN_TYPE);
		parserTokens.put("dmat3x4", BUILTIN_TYPE);
		parserTokens.put("mat4x2", BUILTIN_TYPE);
		parserTokens.put("mat4x3", BUILTIN_TYPE);
		parserTokens.put("mat4x4", BUILTIN_TYPE);
		parserTokens.put("dmat4x2", BUILTIN_TYPE);
		parserTokens.put("dmat4x3", BUILTIN_TYPE);
		parserTokens.put("dmat4x4", BUILTIN_TYPE);
		parserTokens.put("vec2", BUILTIN_TYPE);
		parserTokens.put("vec3", BUILTIN_TYPE);
		parserTokens.put("vec4", BUILTIN_TYPE);
		parserTokens.put("ivec2", BUILTIN_TYPE);
		parserTokens.put("ivec3", BUILTIN_TYPE);
		parserTokens.put("ivec4", BUILTIN_TYPE);
		parserTokens.put("bvec2", BUILTIN_TYPE);
		parserTokens.put("bvec3", BUILTIN_TYPE);
		parserTokens.put("bvec4", BUILTIN_TYPE);
		parserTokens.put("dvec2", BUILTIN_TYPE);
		parserTokens.put("dvec3", BUILTIN_TYPE);
		parserTokens.put("dvec4", BUILTIN_TYPE);
		parserTokens.put("uvec2", BUILTIN_TYPE);
		parserTokens.put("uvec3", BUILTIN_TYPE);
		parserTokens.put("uvec4", BUILTIN_TYPE);
		parserTokens.put("sampler1D", BUILTIN_TYPE);
		parserTokens.put("sampler2D", BUILTIN_TYPE);
		parserTokens.put("sampler3D", BUILTIN_TYPE);
		parserTokens.put("samplerCube", BUILTIN_TYPE);
		parserTokens.put("sampler1DShadow", BUILTIN_TYPE);
		parserTokens.put("sampler2DShadow", BUILTIN_TYPE);
		parserTokens.put("sampler3DShadow", BUILTIN_TYPE);
		parserTokens.put("sampler2DRectShadow", BUILTIN_TYPE);
		parserTokens.put("samplerCubeShadow", BUILTIN_TYPE);
		parserTokens.put("sampler1DArray", BUILTIN_TYPE);
		parserTokens.put("sampler2DArray", BUILTIN_TYPE);
		parserTokens.put("sampler1DArrayShadow", BUILTIN_TYPE);
		parserTokens.put("sampler2DArrayShadow", BUILTIN_TYPE);
		parserTokens.put("isampler1D", BUILTIN_TYPE);
		parserTokens.put("isampler2D", BUILTIN_TYPE);
		parserTokens.put("isampler3D", BUILTIN_TYPE);
		parserTokens.put("isamplerCube", BUILTIN_TYPE);
		parserTokens.put("isampler1DArray", BUILTIN_TYPE);
		parserTokens.put("isampler2DArray", BUILTIN_TYPE);
		parserTokens.put("usampler1D", BUILTIN_TYPE);
		parserTokens.put("usampler2D", BUILTIN_TYPE);
		parserTokens.put("usampler3D", BUILTIN_TYPE);
		parserTokens.put("usamplerCube", BUILTIN_TYPE);
		parserTokens.put("usampler1DArray", BUILTIN_TYPE);
		parserTokens.put("usampler2DArray", BUILTIN_TYPE);
		parserTokens.put("sampler2DRect", BUILTIN_TYPE);
		parserTokens.put("sampler3DRect", BUILTIN_TYPE);
		parserTokens.put("isampler2DRect", BUILTIN_TYPE);
		parserTokens.put("usampler2DRect", BUILTIN_TYPE);
		parserTokens.put("samplerBuffer", BUILTIN_TYPE);
		parserTokens.put("isamplerBuffer", BUILTIN_TYPE);
		parserTokens.put("usamplerBuffer", BUILTIN_TYPE);
		parserTokens.put("sampler2DMS", BUILTIN_TYPE);
		parserTokens.put("isampler2DMS", BUILTIN_TYPE);
		parserTokens.put("usampler2DMS", BUILTIN_TYPE);
		parserTokens.put("sampler2DMSArray", BUILTIN_TYPE);
		parserTokens.put("isampler2DMSArray", BUILTIN_TYPE);
		parserTokens.put("usampler2DMSArray", BUILTIN_TYPE);
		parserTokens.put("samplerCubeArray", BUILTIN_TYPE);
		parserTokens.put("samplerCubeArrayShadow", BUILTIN_TYPE);
		parserTokens.put("isamplerCubeArray", BUILTIN_TYPE);
		parserTokens.put("usamplerCubeArray", BUILTIN_TYPE);
		parserTokens.put("image1D", BUILTIN_TYPE);
		parserTokens.put("iimage1D", BUILTIN_TYPE);
		parserTokens.put("uimage1D", BUILTIN_TYPE);
		parserTokens.put("image2D", BUILTIN_TYPE);
		parserTokens.put("iimage2D", BUILTIN_TYPE);
		parserTokens.put("uimage2D", BUILTIN_TYPE);
		parserTokens.put("image3D", BUILTIN_TYPE);
		parserTokens.put("iimage3D", BUILTIN_TYPE);
		parserTokens.put("uimage3D", BUILTIN_TYPE);
		parserTokens.put("image2DRect", BUILTIN_TYPE);
		parserTokens.put("iimage2DRect", BUILTIN_TYPE);
		parserTokens.put("uimage2DRect", BUILTIN_TYPE);
		parserTokens.put("imageCube", BUILTIN_TYPE);
		parserTokens.put("iimageCube", BUILTIN_TYPE);
		parserTokens.put("uimageCube", BUILTIN_TYPE);
		parserTokens.put("imageBuffer", BUILTIN_TYPE);
		parserTokens.put("iimageBuffer", BUILTIN_TYPE);
		parserTokens.put("uimageBuffer", BUILTIN_TYPE);
		parserTokens.put("image1DArray", BUILTIN_TYPE);
		parserTokens.put("iimage1DArray", BUILTIN_TYPE);
		parserTokens.put("uimage1DArray", BUILTIN_TYPE);
		parserTokens.put("image2DArray", BUILTIN_TYPE);
		parserTokens.put("iimage2DArray", BUILTIN_TYPE);
		parserTokens.put("uimage2DArray", BUILTIN_TYPE);
		parserTokens.put("imageCubeArray", BUILTIN_TYPE);
		parserTokens.put("iimageCubeArray", BUILTIN_TYPE);
		parserTokens.put("uimageCubeArray", BUILTIN_TYPE);
		parserTokens.put("image2DMS", BUILTIN_TYPE);
		parserTokens.put("iimage2DMS", BUILTIN_TYPE);
		parserTokens.put("uimage2DMS", BUILTIN_TYPE);
		parserTokens.put("image2DMSArray", BUILTIN_TYPE);
		parserTokens.put("iimage2DMSArray", BUILTIN_TYPE);
		parserTokens.put("uimage2DMSArray", BUILTIN_TYPE);
		parserTokens.put("samplerExternalOES", BUILTIN_TYPE);
	
	
		// reserved
	
		parserTokens.put("image1DShadow", BUILTIN_TYPE);
		parserTokens.put("image2DShadow", BUILTIN_TYPE);
	
		parserTokens.put("image1DArrayShadow", BUILTIN_TYPE);
		parserTokens.put("image2DArrayShadow", BUILTIN_TYPE);


	}


	public static boolean contains(String keyword) {
		return parserTokens.containsKey(keyword);
	}






	
	
}
