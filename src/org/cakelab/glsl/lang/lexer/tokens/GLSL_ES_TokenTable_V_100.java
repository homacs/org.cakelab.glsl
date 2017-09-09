package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashSet;

import org.cakelab.glsl.GLSLParser;

public class GLSL_ES_TokenTable_V_100 extends GLSLTokenTable {
	
	public GLSL_ES_TokenTable_V_100() {
		super(100);
		// LANGUAGE ELEMENTS
		language.put("attribute",GLSLParser.ATTRIBUTE);
		language.put("const", GLSLParser.CONST);
		language.put("uniform", GLSLParser.UNIFORM);
		language.put("varying", GLSLParser.VARYING);
		
		language.put("break", GLSLParser.BREAK);
		language.put("continue", GLSLParser.CONTINUE);
		language.put("do", GLSLParser.DO);
		language.put("for", GLSLParser.FOR);
		language.put("while", GLSLParser.WHILE);
		
		language.put("if", GLSLParser.IF);
		language.put("else", GLSLParser.ELSE);
	
		language.put("in", GLSLParser.IN);
		language.put("out", GLSLParser.OUT);
		language.put("inout", GLSLParser.INOUT);
		
		builtinTypes.add("float");
		builtinTypes.add("int");
		language.put("void",GLSLParser.VOID);
		builtinTypes.add("bool");
		language.put("true", GLSLParser.BOOLCONSTANT);
		language.put("false", GLSLParser.BOOLCONSTANT);
	
		language.put("lowp", GLSLParser.LOWP);
		language.put("mediump", GLSLParser.MEDIUMP);
		language.put("highp", GLSLParser.HIGHP);
		language.put("precision", GLSLParser.PRECISION);
		reserved.add("invariant");

		
		language.put("discard", GLSLParser.DISCARD);
		language.put("return", GLSLParser.RETURN);
		

		builtinTypes.add("mat2");
		builtinTypes.add("mat3");
		builtinTypes.add("mat4");
		
		builtinTypes.add("vec2");
		builtinTypes.add("vec3");
		builtinTypes.add("vec4");
		builtinTypes.add("ivec2");
		builtinTypes.add("ivec3");
		builtinTypes.add("ivec4");
		builtinTypes.add("bvec2");
		builtinTypes.add("bvec3");
		builtinTypes.add("bvec4");

		builtinTypes.add("sampler2D");
		builtinTypes.add("samplerCube");

		language.put("struct", GLSLParser.STRUCT);
	
		
		//
		// keywords, that have been reserved but not yet included in the language
		//
		reserved = new HashSet<String>();
		reserved.add("asm");
		
		reserved.add("class");
		reserved.add("union");
		reserved.add("enum");
		reserved.add("typedef");
		reserved.add("template");
		reserved.add("this");
		reserved.add("packaged");

		reserved.add("goto");
		reserved.add("switch");
		reserved.add("default");
		
		
		reserved.add("inline");
		reserved.add("noinline");
		reserved.add("volatile");
		reserved.add("public");
		reserved.add("static");
		reserved.add("extern");
		reserved.add("external");
		reserved.add("interface");
		reserved.add("flat");
				
		reserved.add("long");
		reserved.add("short");
		reserved.add("double");
		reserved.add("half");
		reserved.add("fixed");
		reserved.add("unsigned");
		reserved.add("superp");
		
		reserved.add("input");
		reserved.add("output");
				
		reserved.add("hvec2");
		reserved.add("hvec3");
		reserved.add("hvec4");
		reserved.add("dvec2");
		reserved.add("dvec3");
		reserved.add("dvec4");
		reserved.add("fvec2");
		reserved.add("fvec3");
		reserved.add("fvec4");
		
		reserved.add("sampler1D");
		reserved.add("sampler3D");
		reserved.add("sampler1DShadow");
		reserved.add("sampler3DShadow");
		reserved.add("sampler2DRect");
		reserved.add("sampler3DRect");
		reserved.add("sampler2DRectShadow");
	
		reserved.add("sizeof");
		reserved.add("cast");
		
		reserved.add("namespace");
		reserved.add("using");
		
	}
}
