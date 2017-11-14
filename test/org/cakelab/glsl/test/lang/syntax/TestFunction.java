package org.cakelab.glsl.test.lang.syntax;

public abstract class TestFunction extends TestingSyntaxBase {
	public void test() {

		testFunctionDeclaration();
		
		testFunctionDefinition();

	}

	private void testFunctionDeclaration() {
		String source;
		
		source = "void myfunction();\n";
		assertValid(source);

		source = "void void();\n";
		assertInvalid(source);

		source = "void myfunction(void);";
		assertValid(source);
		
		source = "void myfunction(int);";
		assertValid(source);
		
		source = "void myfunction(int a);";
		assertValid(source);
		
		source = "void myfunction(int a, double b);";
		assertValid(source);
		
		source = "struct myTypeA{int x;}; struct myTypeB{int y;};"
				+ "void myfunction(myTypeA, myTypeB);";
		assertValid(source);
		
		source = "void myfunction(int a, double b, bool c);";
		assertValid(source);
		
		source = "void myfunction(void, double b, float r);";
		assertValid(source);

		
		source = "void myfunction(){};\n"
				+ "void myfunction(){};\n";
		assertInvalid(source);
		
	}

	private void testFunctionDefinition() {
		String source;
		
		source = "void block(){}\n";
		assertValid(source);
		
		source = "void block(){\n"
				+ "int a;\n"
				+ "return a;\n"
				+ "}";
		assertValid(source);
		
		source = "void block(int){\n"
				+ "int a;\n"
				+ "return a;\n"
				+ "}";
		assertValid(source);
		
		source = "void block(int b){\n"
				+ "int a;\n"
				+ "return a+1;\n"
				+ "}";
		assertValid(source);
		
		source = "void block(int b){\n"
				+ "int a;\n"
				+ "return a+2;\n"
				+ "";
		assertInvalid(source);
	}


}
