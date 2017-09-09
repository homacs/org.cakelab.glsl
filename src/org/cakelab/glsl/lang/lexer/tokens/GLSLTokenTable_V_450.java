package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;
import java.util.HashSet;

import org.cakelab.glsl.GLSLParser;

public class GLSLTokenTable_V_450 extends GLSLTokenTable {

	
	
	
	public GLSLTokenTable_V_450(GLSLTokenTable base) {
		super(450, base);
		
		language.put("true", GLSLParser.BOOLCONSTANT);
		language.put("false", GLSLParser.BOOLCONSTANT);

		
		// LANGUAGE ELEMENTS
		language.put("attribute",GLSLParser.ATTRIBUTE);
		language.put("const", GLSLParser.CONST);
		language.put("uniform", GLSLParser.UNIFORM);
		language.put("varying", GLSLParser.VARYING);
		language.put("buffer", GLSLParser.BUFFER);
		language.put("shared", GLSLParser.SHARED);
		language.put("coherent", GLSLParser.COHERENT);
		language.put("volatile", GLSLParser.VOLATILE);
		language.put("restrict", GLSLParser.RESTRICT);
		language.put("readonly", GLSLParser.READONLY);
		language.put("writeonly", GLSLParser.WRITEONLY);
		
		language.put("layout", GLSLParser.LAYOUT);
		language.put("centroid", GLSLParser.CENTROID);
		language.put("flat", GLSLParser.FLAT);
		language.put("smooth", GLSLParser.SMOOTH);
		language.put("noperspective", GLSLParser.NOPERSPECTIVE);
		language.put("patch", GLSLParser.PATCH);
		language.put("sample", GLSLParser.SAMPLE);
		
		language.put("break", GLSLParser.BREAK);
		language.put("continue", GLSLParser.CONTINUE);
		language.put("do", GLSLParser.DO);
		language.put("for", GLSLParser.FOR);
		language.put("while", GLSLParser.WHILE);
		language.put("switch", GLSLParser.SWITCH);
		language.put("case", GLSLParser.CASE);
		language.put("default", GLSLParser.DEFAULT);
		language.put("if", GLSLParser.IF);
		language.put("else", GLSLParser.ELSE);
		language.put("subroutine", GLSLParser.SUBROUTINE);
		language.put("in", GLSLParser.IN);
		language.put("out", GLSLParser.OUT);
		language.put("inout", GLSLParser.INOUT);
		language.put("invariant", GLSLParser.INVARIANT);
		language.put("precise", GLSLParser.PRECISE);
		language.put("discard", GLSLParser.DISCARD);
		language.put("return", GLSLParser.RETURN);

		language.put("lowp", GLSLParser.LOWP);
		language.put("mediump", GLSLParser.MEDIUMP);
		language.put("highp", GLSLParser.HIGHP);
		language.put("precision", GLSLParser.PRECISION);
		language.put("struct", GLSLParser.STRUCT);

		
		// reserved keywords
		reserved.add("common");
		reserved.add("partition");
		reserved.add("active");
		
		reserved.add("asm");
		reserved.add("class");
		reserved.add("union");
		reserved.add("enum");
		reserved.add("typedef");
		reserved.add("template");
		reserved.add("this");
		reserved.add("resource");
		reserved.add("goto");
		reserved.add("inline");
		reserved.add("noinline");
		reserved.add("public");
		reserved.add("static");
		reserved.add("extern");
		reserved.add("external");
		reserved.add("interface");
				
		reserved.add("long");
		reserved.add("short");
		reserved.add("half");
		reserved.add("fixed");
		reserved.add("unsigned");
		reserved.add("superp");
		reserved.add("input");
		reserved.add("output");
				
		reserved.add("sizeof");
		reserved.add("cast");
		reserved.add("namespace");
		reserved.add("using");
				
		reserved.add("hvec2");
		reserved.add("hvec3");
		reserved.add("hvec4");
		reserved.add("fvec2");
		reserved.add("fvec3");
		reserved.add("fvec4");
		reserved.add("sampler3DRect");
		reserved.add("filter");

		
		// builtin types
		builtinTypes = new HashSet<String>();
		builtinTypes.add("float");
		builtinTypes.add("double");
		builtinTypes.add("int");
		builtinTypes.add("void");
		builtinTypes.add("bool");
				
		builtinTypes.add("uint");
		builtinTypes.add("atomic_uint");

		builtinTypes.add("mat2");
		builtinTypes.add("mat3");
		builtinTypes.add("mat4");
		builtinTypes.add("dmat2");
		builtinTypes.add("dmat3");
		builtinTypes.add("dmat4");
		builtinTypes.add("mat2X2");
		builtinTypes.add("mat2X3");
		builtinTypes.add("mat2X4");
		builtinTypes.add("dmat2X2");
		builtinTypes.add("dmat2X3");
		builtinTypes.add("dmat2X4");
		builtinTypes.add("mat3X2");
		builtinTypes.add("mat3X3");
		builtinTypes.add("mat3X4");
		builtinTypes.add("dmat3X2");
		builtinTypes.add("dmat3X3");
		builtinTypes.add("dmat3X4");
		builtinTypes.add("mat4X2");
		builtinTypes.add("mat4X3");
		builtinTypes.add("mat4X4");
		builtinTypes.add("dmat4X2");
		builtinTypes.add("dmat4X3");
		builtinTypes.add("dmat4X4");
		builtinTypes.add("vec2");
		builtinTypes.add("vec3");
		builtinTypes.add("vec4");
		builtinTypes.add("ivec2");
		builtinTypes.add("ivec3");
		builtinTypes.add("ivec4");
		builtinTypes.add("bvec2");
		builtinTypes.add("bvec3");
		builtinTypes.add("bvec4");
		builtinTypes.add("dvec2");
		builtinTypes.add("dvec3");
		builtinTypes.add("dvec4");
		builtinTypes.add("uvec2");
		builtinTypes.add("uvec3");
		builtinTypes.add("uvec4");
		builtinTypes.add("sampler1D");
		builtinTypes.add("sampler2D");
		builtinTypes.add("sampler3D");
		builtinTypes.add("samplerCube");
		builtinTypes.add("sampler1DShadow");
		builtinTypes.add("sampler2DShadow");
		builtinTypes.add("samplerCubeShadow");
		builtinTypes.add("sampler1DArray");
		builtinTypes.add("sampler2DArray");
		builtinTypes.add("sampler1DArrayShadow");
		builtinTypes.add("sampler2DArrayShadow");
		builtinTypes.add("isampler1D");
		builtinTypes.add("isampler2D");
		builtinTypes.add("isampler3D");
		builtinTypes.add("isamplerCube");
		builtinTypes.add("isampler1DArray");
		builtinTypes.add("isampler2DArray");
		builtinTypes.add("usampler1D");
		builtinTypes.add("usampler2D");
		builtinTypes.add("usampler3D");
		builtinTypes.add("usamplerCube");
		builtinTypes.add("usampler1DArray");
		builtinTypes.add("usampler2DArray");
		builtinTypes.add("sampler2DRect");
		builtinTypes.add("sampler2DRectShadow");
		builtinTypes.add("isampler2DRect");
		builtinTypes.add("usampler2DRect");
		builtinTypes.add("samplerBuffer");
		builtinTypes.add("isamplerBuffer");
		builtinTypes.add("usamplerBuffer");
		builtinTypes.add("sampler2DMS");
		builtinTypes.add("isampler2DMS");
		builtinTypes.add("usampler2DMS");
		builtinTypes.add("sampler2DMSArray");
		builtinTypes.add("isampler2DMSArray");
		builtinTypes.add("usampler2DMSArray");
		builtinTypes.add("samplerCubeArray");
		builtinTypes.add("samplerCubeArrayShadow");
		builtinTypes.add("isamplerCubeArray");
		builtinTypes.add("usamplerCubeArray");
		builtinTypes.add("image1D");
		builtinTypes.add("iimage1D");
		builtinTypes.add("uimage1D");
		builtinTypes.add("image2D");
		builtinTypes.add("iimage2D");
		builtinTypes.add("uimage2D");
		builtinTypes.add("image3D");
		builtinTypes.add("iimage3D");
		builtinTypes.add("uimage3D");
		builtinTypes.add("image2DRect");
		builtinTypes.add("iimage2DRect");
		builtinTypes.add("uimage2DRect");
		builtinTypes.add("imageCube");
		builtinTypes.add("iimageCube");
		builtinTypes.add("uimageCube");
		builtinTypes.add("imageBuffer");
		builtinTypes.add("iimageBuffer");
		builtinTypes.add("uimageBuffer");
		builtinTypes.add("image1DArray");
		builtinTypes.add("iimage1DArray");
		builtinTypes.add("uimage1DArray");
		builtinTypes.add("image2DArray");
		builtinTypes.add("iimage2DArray");
		builtinTypes.add("uimage2DArray");
		builtinTypes.add("imageCubeArray");
		builtinTypes.add("iimageCubeArray");
		builtinTypes.add("uimageCubeArray");
		builtinTypes.add("image2DMS");
		builtinTypes.add("iimage2DMS");
		builtinTypes.add("uimage2DMS");
		builtinTypes.add("image2DMSArray");
		builtinTypes.add("iimage2DMSArray");
		builtinTypes.add("uimage2DMSArray");
		builtinTypes.add("samplerExternalOES");
		
		
		// punctuators
		this.punctuators = new HashMap<String, Integer>();
		punctuators.put("<<", GLSLParser.LEFT_OP);
		punctuators.put(">>", GLSLParser.RIGHT_OP);
		punctuators.put("++", GLSLParser.INC_OP);
		punctuators.put("--", GLSLParser.DEC_OP);
		punctuators.put("<=", GLSLParser.LE_OP);
		punctuators.put(">=", GLSLParser.GE_OP);
		punctuators.put("==", GLSLParser.EQ_OP);
		punctuators.put("!=", GLSLParser.NE_OP);
		punctuators.put("&&", GLSLParser.AND_OP);
		punctuators.put("||", GLSLParser.OR_OP);
		punctuators.put("^^", GLSLParser.XOR_OP);
		punctuators.put("*=", GLSLParser.MUL_ASSIGN);
		punctuators.put("/=", GLSLParser.DIV_ASSIGN);
		punctuators.put("+=", GLSLParser.ADD_ASSIGN);
		punctuators.put("%=", GLSLParser.MOD_ASSIGN);
		punctuators.put("<<=", GLSLParser.LEFT_ASSIGN);
		punctuators.put(">>=", GLSLParser.RIGHT_ASSIGN);
		punctuators.put("&=", GLSLParser.AND_ASSIGN);
		punctuators.put("^=", GLSLParser.XOR_ASSIGN);
		punctuators.put("|=", GLSLParser.OR_ASSIGN);
		punctuators.put("-=", GLSLParser.SUB_ASSIGN);
		punctuators.put("(", GLSLParser.LEFT_PAREN);
		punctuators.put(")", GLSLParser.RIGHT_PAREN);
		punctuators.put("[", GLSLParser.LEFT_BRACKET);
		punctuators.put("]", GLSLParser.RIGHT_BRACKET);
		punctuators.put("{", GLSLParser.LEFT_BRACE);
		punctuators.put("}", GLSLParser.RIGHT_BRACE);
		punctuators.put(".", GLSLParser.DOT);
		punctuators.put(",", GLSLParser.COMMA);
		punctuators.put(":", GLSLParser.COLON);
		punctuators.put("=", GLSLParser.EQUAL);
		punctuators.put(";", GLSLParser.SEMICOLON);
		punctuators.put("!", GLSLParser.BANG);
		punctuators.put("-", GLSLParser.DASH);
		punctuators.put("~", GLSLParser.TILDE);
		punctuators.put("+", GLSLParser.PLUS);
		punctuators.put("*", GLSLParser.STAR);
		punctuators.put("/", GLSLParser.SLASH);
		punctuators.put("%", GLSLParser.PERCENT);
		punctuators.put("<", GLSLParser.LEFT_ANGLE);
		punctuators.put(">", GLSLParser.RIGHT_ANGLE);
		punctuators.put("|", GLSLParser.VERTICAL_BAR);
		punctuators.put("^", GLSLParser.CARET);
		punctuators.put("&", GLSLParser.AMPERSAND);
		punctuators.put("?", GLSLParser.QUESTION);

	}
}
