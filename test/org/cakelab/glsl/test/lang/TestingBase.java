package org.cakelab.glsl.test.lang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.GLSLLexer;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLParser.GlslContext;

public class TestingBase extends TestingTools {

	public static GLSLParser p(String source) {
		CharStream input = CharStreams.fromString(source);
		GLSLLexer lexer = new GLSLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser = new GLSLParser(tokens);
		TestingTools.setup(parser, lexer);
		return (GLSLParser)parser;
	}


	@SafeVarargs
	public static void assertValid(String source, Class<? extends ParseTree> ... types) {
		ParseTree ast = p(source).glsl();
		assertValid(ast, types);
	}

	@SafeVarargs
	public static void assertInvalid(String source, Class<? extends ParseTree> ... types) {
		GlslContext ast = p(source).glsl();
		assertInvalid(ast, types);
	}


	public static String[] BUILTIN_TYPES = new String[]{
			"atomic_uint",
			
			"float",
			"double",
			"int",
			"uint",
			"bool",
			
			"vec2",
			"vec3",
			"vec4",
			"dvec2",
			"dvec3",
			"dvec4",
			"bvec2",
			"bvec3",
			"bvec4",
			"ivec2",
			"ivec3",
			"ivec4",
			"uvec2",
			"uvec3",
			"uvec4",
			
			"mat2",
			"mat3",
			"mat4",
			"mat2x2",
			"mat2x3",
			"mat2x4",
			"mat3x2",
			"mat3x3",
			"mat3x4",
			"mat4x2",
			"mat4x3",
			"mat4x4",
			"dmat2",
			"dmat3",
			"dmat4",
			"dmat2x2",
			"dmat2x3",
			"dmat2x4",
			"dmat3x2",
			"dmat3x3",
			"dmat3x4",
			"dmat4x2",
			"dmat4x3",
			"dmat4x4",
			
			"sampler1D",
			"sampler2D",
			"sampler3D",
			"samplerCube",

			"sampler1DShadow",
			"sampler2DShadow",
			"samplerCubeShadow",
			"sampler1DArray",
			"sampler2DArray",
			"sampler1DArrayShadow",
			"sampler2DArrayShadow",
			"samplerCubeArray",
			"samplerCubeArrayShadow",
			
			"isampler1D",
			"isampler2D",
			"isampler3D",
			"isamplerCube",
			"isampler1DArray",
			"isampler2DArray",
			"isamplerCubeArray",
			
			"usampler1D",
			"usampler2D",
			"usampler3D",
			"usamplerCube",
			"usampler1DArray",
			"usampler2DArray",
			"usamplerCubeArray",
			
			"sampler2DRect",
			"sampler2DRectShadow",
			"isampler2DRect",
			"usampler2DRect",

			"samplerBuffer",
			"isamplerBuffer",
			"usamplerBuffer",

			"sampler2DMS",
			"isampler2DMS",
			"usampler2DMS",
			
			"sampler2DMSArray",
			"isampler2DMSArray",
			"usampler2DMSArray",
			
			"image1D",
			"iimage1D",
			"uimage1D",

			"image2D",
			"iimage2D",
			"uimage2D",

			"image3D",
			"iimage3D",
			"uimage3D",

			
			"image2DRect",
			"iimage2DRect",
			"uimage2DRect",
			
			"imageCube",
			"iimageCube",
			"uimageCube",
			
			"imageBuffer",
			"iimageBuffer",
			"uimageBuffer",
			
			"image1DArray",
			"iimage1DArray",
			"uimage1DArray",
			
			"image2DArray",
			"iimage2DArray",
			"uimage2DArray",
			
			"imageCubeArray",
			"iimageCubeArray",
			"uimageCubeArray",
			
			"image2DMS",
			"iimage2DMS",
			"uimage2DMS",
			
			"image2DMSArray",
			"iimage2DMSArray",
			"uimage2DMSArray",
			
			"samplerExternalOES",

	};
	
	public static String[] TYPE_QUALIFIER_EXAMPLES = {
			
			"invariant",
			
			// interpolation
			"smooth",
			"flat",
			"noperspective",
			
			// layout(id, id=value, shared)
			"layout(id, id=5, shared)",
			"layout(shared)",
			
			// precise
			"precise",
			
			// precision
			"highp",
			"mediump",
			"lowp",
			
			// storage
			"const",
		    "attribute",
		    "varying",
		    "inout",
		    "in",
		    "out",
		    "centroid",
		    "patch",
		    "sample",
		    "uniform", 
		    "buffer",
		    "shared",
		    "coherent",
		    "volatile",
		    "restrict",
		    "readonly",
		    "writeonly", 
		    "subroutine",
//		    "subroutine(f1,f2,f3)" does not work without declared functions
		    
		    
	};
	
}