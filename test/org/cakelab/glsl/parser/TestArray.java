package org.cakelab.glsl.parser;

public class TestArray extends TestBaseGLSL {
	public static void test() {

		testArrayVariableDeclaration();
		

	}

	private static void testArrayVariableDeclaration() {
		
		assertValid(p("int[] boo;").glslDeclaration());
		
		assertInvalid(p("int x[] boo;").glslDeclaration());
		
		assertValid(p("int boo[];").glslDeclaration());
		
		assertValid(p("int boo[3];").glslDeclaration());

		// common static initialisation
		assertValid(p("float b[] = { 3.4, 4.2, 5.0, 5.2, 1.1 };").glslDeclaration());
		
		// constructor call style initialisation
		assertValid(p("float a[] = float[](3.4, 4.2, 5.0, 5.2, 1.1);").glslDeclaration());
	}

}
