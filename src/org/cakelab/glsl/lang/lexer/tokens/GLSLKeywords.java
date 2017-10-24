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
 * Keywords mapped to {@link #RESERVED_KEYWORD_TOKEN} are not yet known
 * to the GLSLParser. Unless the keyword is a new builtin type, it can 
 * be added to a GLSLTokenTable as reserved keyword only.
 * </p>
 * 
 * @author homac
 *
 */
public class GLSLKeywords {
	
	public static final Integer BUILTIN_TYPE_TOKEN = GLSLParser.IDENTIFIER;
	public static final Integer RESERVED_KEYWORD_TOKEN = Integer.MIN_VALUE;

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
	
		
		
		
		parserTokens.put("bool", BUILTIN_TYPE_TOKEN);
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
		parserTokens.put("common", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("partition", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("active", RESERVED_KEYWORD_TOKEN);
		
		parserTokens.put("resource", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("asm", RESERVED_KEYWORD_TOKEN);
	
		parserTokens.put("class", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("union", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("enum", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("typedef", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("template", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("this", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("packed", RESERVED_KEYWORD_TOKEN);
	
		parserTokens.put("goto", RESERVED_KEYWORD_TOKEN);
		
		parserTokens.put("inline", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("noinline", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("public", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("static", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("extern", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("external", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("interface", RESERVED_KEYWORD_TOKEN);
				
		parserTokens.put("half", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("fixed", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("unsigned", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("superp", RESERVED_KEYWORD_TOKEN);
	
		parserTokens.put("input", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("output", RESERVED_KEYWORD_TOKEN);
				
		parserTokens.put("hvec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("hvec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("hvec4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("fvec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("fvec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("fvec4", BUILTIN_TYPE_TOKEN);
		
		parserTokens.put("filter", RESERVED_KEYWORD_TOKEN);
		
		parserTokens.put("sizeof", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("cast", RESERVED_KEYWORD_TOKEN);
		
		parserTokens.put("namespace", RESERVED_KEYWORD_TOKEN);
		parserTokens.put("using", RESERVED_KEYWORD_TOKEN);
		
		parserTokens.put("row_major", RESERVED_KEYWORD_TOKEN);
	
		
		
	
		
		parserTokens.put("float", BUILTIN_TYPE_TOKEN);
		parserTokens.put("int", BUILTIN_TYPE_TOKEN);
		parserTokens.put("void", GLSLParser.VOID);
		
		parserTokens.put("long", BUILTIN_TYPE_TOKEN);
		parserTokens.put("short", BUILTIN_TYPE_TOKEN);
		parserTokens.put("double", BUILTIN_TYPE_TOKEN);
	
		parserTokens.put("uint", BUILTIN_TYPE_TOKEN);
		parserTokens.put("atomic_uint", BUILTIN_TYPE_TOKEN);
	
		parserTokens.put("mat2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat2x2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat2x3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat2x4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat2x2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat2x3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat2x4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat3x2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat3x3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat3x4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat3x2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat3x3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat3x4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat4x2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat4x3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("mat4x4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat4x2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat4x3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dmat4x4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("vec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("vec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("vec4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("ivec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("ivec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("ivec4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("bvec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("bvec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("bvec4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dvec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dvec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("dvec4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uvec2", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uvec3", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uvec4", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler1D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler3D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("samplerCube", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler1DShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler3DShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DRectShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("samplerCubeShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler1DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler1DArrayShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DArrayShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler1D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler2D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler3D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isamplerCube", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler1DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler2DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler1D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler2D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler3D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usamplerCube", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler1DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler2DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler3DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler2DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler2DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("samplerBuffer", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isamplerBuffer", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usamplerBuffer", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DMS", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler2DMS", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler2DMS", BUILTIN_TYPE_TOKEN);
		parserTokens.put("sampler2DMSArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isampler2DMSArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usampler2DMSArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("samplerCubeArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("samplerCubeArrayShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("isamplerCubeArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("usamplerCubeArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image1D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage1D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage1D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage2D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage2D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image3D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage3D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage3D", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage2DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage2DRect", BUILTIN_TYPE_TOKEN);
		parserTokens.put("imageCube", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimageCube", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimageCube", BUILTIN_TYPE_TOKEN);
		parserTokens.put("imageBuffer", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimageBuffer", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimageBuffer", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image1DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage1DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage1DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage2DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage2DArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("imageCubeArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimageCubeArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimageCubeArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2DMS", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage2DMS", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage2DMS", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2DMSArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("iimage2DMSArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("uimage2DMSArray", BUILTIN_TYPE_TOKEN);
		parserTokens.put("samplerExternalOES", BUILTIN_TYPE_TOKEN);
	
	
		// reserved
	
		parserTokens.put("image1DShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2DShadow", BUILTIN_TYPE_TOKEN);
	
		parserTokens.put("image1DArrayShadow", BUILTIN_TYPE_TOKEN);
		parserTokens.put("image2DArrayShadow", BUILTIN_TYPE_TOKEN);


	}


	public static boolean contains(String keyword) {
		return parserTokens.containsKey(keyword);
	}






	
	
}
