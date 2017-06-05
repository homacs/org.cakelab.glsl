package org.cakelab.glsl.test.lang.syntax;

public class TestArray extends TestBaseGLSL {
	public static void test() {

		testArrayVariableDeclaration();
		

	}

	private static void testArrayVariableDeclaration() {
		
		assertValid(p("int[] boo;").glslDeclarationStatement());
		
		assertInvalid(p("int x[] boo;").glslDeclarationStatement());
		
		assertValid(p("int boo[];").glslDeclarationStatement());
		
		assertValid(p("int boo[3];").glslDeclarationStatement());

		// common static initialisation
		assertValid(p("float b[] = { 3.4, 4.2, 5.0, 5.2, 1.1 };").glslDeclarationStatement());
		
		// constructor call style initialisation
		assertValid(p("float a[] = float[](3.4, 4.2, 5.0, 5.2, 1.1);").glslDeclarationStatement());
	}

}
