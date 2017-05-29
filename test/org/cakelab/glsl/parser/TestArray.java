package org.cakelab.glsl.parser;

public class TestArray extends TestBaseGLSL {
	public static void test() {

		testArrayVariableDeclaration();
		

	}

	private static void testArrayVariableDeclaration() {
		
		assertValid(p("int[] boo").glslSingleDeclaration());
		
		assertInvalid(p("int x[] boo").glslSingleDeclaration());
		
		assertValid(p("int boo[]").glslSingleDeclaration());
		
		assertValid(p("int boo[3]").glslSingleDeclaration());

		// common static initialisation
		assertValid(p("float b[] = { 3.4, 4.2, 5.0, 5.2, 1.1 }").glslSingleDeclaration());
		
		// constructor call style initialisation
		assertValid(p("float a[] = float[](3.4, 4.2, 5.0, 5.2, 1.1)").glslSingleDeclaration());
	}

}
