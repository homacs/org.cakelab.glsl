package org.cakelab.glsl.parser;

public class TestArray extends TestBaseGLSL {
	public static void test() {

		testArrayVariableDeclaration();
		

	}

	private static void testArrayVariableDeclaration() {
		String source;
		
		source = "int[] boo";
		assertValid(p(source).glslSingleDeclaration());
		
		source = "int x[] boo";
		assertInvalid(p(source).glslSingleDeclaration());
		
		source = "int boo[]";
		assertValid(p(source).glslSingleDeclaration());
		
		source = "int boo[3]";
		assertValid(p(source).glslSingleDeclaration());
		
	}


}
