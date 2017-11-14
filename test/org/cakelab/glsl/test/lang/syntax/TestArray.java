package org.cakelab.glsl.test.lang.syntax;

public abstract class TestArray extends TestingSyntaxBase {
	public void test() {
		testArrayVariableDeclaration();
	}

	private void testArrayVariableDeclaration() {
		
		assertValid("int[] boo;");
		
		assertInvalid("int x[] boo;");
		
		assertValid("int boo[];");
		
		assertValid("int boo[3];");

		// common static initialisation
		assertValid("float b[] = { 3.4, 4.2, 5.0, 5.2, 1.1 };");
		
		// constructor call style initialisation
		assertValid("float a[] = float[](3.4, 4.2, 5.0, 5.2, 1.1);");
	}


}
