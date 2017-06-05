package org.cakelab.glsl.test.lang.syntax;

import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.lang.GLSLParser.GlslFunctionDefinitionContext;
import org.cakelab.glsl.lang.GLSLParser.GlslFunctionPrototypeContext;

public class TestFunction extends TestBaseGLSL {
	public static void test() {

		testFunctionDeclaration();
		
		testFunctionDefinition();

	}

	private static void testFunctionDeclaration() {
		String source;
		Class<? extends ParseTree> expected = GlslFunctionPrototypeContext.class;
		
		source = "void myfunction();\n";
		assertValid(source, expected);

		source = "void void();\n";
		assertInvalid(source, expected);

		source = "void myfunction(void);";
		assertValid(source, expected);
		
		source = "void myfunction(int);";
		assertValid(source, expected);
		
		source = "void myfunction(int a);";
		assertValid(source, expected);
		
		source = "void myfunction(int a, double b);";
		assertValid(source, expected);
		
		source = "struct myTypeA{int x;}; struct myTypeB{int y;};"
				+ "void myfunction(myTypeA, myTypeB);";
		assertValid(source, expected);
		
		source = "void myfunction(int a, double b, bool c);";
		assertValid(source, expected);
		
		source = "void myfunction(void, double b, float r);";
		assertValid(source, expected);
		
	}

	private static void testFunctionDefinition() {
		String source;
		Class<? extends ParseTree> expected = GlslFunctionDefinitionContext.class;
		
		source = "void block(){}\n";
		assertValid(source, expected);
		
		source = "void block(){\n"
				+ "int a;\n"
				+ "return a;\n"
				+ "}";
		assertValid(source, expected);
		
		source = "void block(int){\n"
				+ "int a;\n"
				+ "return a;\n"
				+ "}";
		assertValid(source, expected);
		
		source = "void block(int b){\n"
				+ "int a;\n"
				+ "return a+1;\n"
				+ "}";
		assertValid(source, expected);
		
		source = "void block(int b){\n"
				+ "int a;\n"
				+ "return a+2;\n"
				+ "";
		assertInvalid(source, expected);
	}


}
