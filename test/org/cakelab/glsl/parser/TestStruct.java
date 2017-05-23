package org.cakelab.glsl.parser;

import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.parser.GLSLParser.GlslStructSpecifierContext;

public class TestStruct extends TestBaseGLSL {
	public static void test() {

		testStructPrototype();
		testStructDefinition();
		testStructType();
		

	}

	private static void testStructDefinition() {
		String source;
		Class<? extends ParseTree> expected = GlslStructSpecifierContext.class;
		
		// glsl: struct must have at least one member
		source = "struct boo{};";
		assertInvalid(source, expected);
		
		source = "struct boo{"
				+ "int a;"
				+ "float b;"
				+ "bool c;"
				+ "};";
		assertValid(source, expected);
		
		source = "struct boo{"
				+ " int a;"
				+ " float b;"
				+ " bool c;"
				+ " struct {"
				+ "  myType c;"
				+ " } d;"
				+ "};";
		assertValid(source, expected);
	}

	private static void testStructType() {
		String source;
		Class<? extends ParseTree> expected = GlslStructSpecifierContext.class;
		
		source = "struct boo {"
				+ "  int a;"
				+ "  float b;"
				+ "  bool c;"
				+ "} x";
		assertValid(p(source).glslSingleDeclaration(), expected);
		
	}

	private static void testStructPrototype() {
		String source;
		Class<? extends ParseTree> expected = GlslStructSpecifierContext.class;
		
		// apparently not allowed in glsl
		source = "struct boo";
		assertInvalid(p(source).glslSingleDeclaration(), expected);
		
	}


}
