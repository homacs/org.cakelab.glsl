package org.cakelab.glsl.test.lang.syntax;

import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.GLSLParser.GlslStructSpecifierContext;
import org.cakelab.glsl.test.lang.TestingBase;

public class TestStruct extends TestingBase {
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
		tearDown();
		
		// glsl: struct prototyping not supported
		source = "struct boo;";
		assertInvalid(source, expected);
		tearDown();
		
		source = "struct boo{"
				+ "int a;"
				+ "float b;"
				+ "bool c;"
				+ "};";
		assertValid(source, expected);

		tearDown();

		source = ""
				+ "struct myType {"
				+ "	bool exist;"
				+ "};"
				+ "struct boo {"
				+ " int a;"
				+ " float b;"
				+ " bool c;"
				+ " struct name {"
				+ "  myType c;"
				+ " } d[2];"
				+ "};";
		assertValid(source, expected);
		tearDown();
	}

	private static void testStructType() {
		String source;
		Class<? extends ParseTree> expected = GlslStructSpecifierContext.class;
		
		source = "struct boo {"
				+ "  int a;"
				+ "  float b;"
				+ "  bool c;"
				+ "} x;";
		assertValid(p(source).glslDeclarationStatement(), expected);

		source = "struct boo {"
				+ "  int a;"
				+ "  float b;"
				+ "  bool c;"
				+ "} x[4];";
		assertValid(p(source).glslDeclarationStatement(), expected);

	}

	private static void testStructPrototype() {
		String source;
		Class<? extends ParseTree> expected = GlslStructSpecifierContext.class;
		// apparently not allowed in glsl
		source = "struct boo;";
		assertInvalid(p(source).glslDeclarationStatement(), expected);

	}


}