package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.TestProvider;

public class TestArray extends TestingSyntaxBase {
	public TestArray(TestProvider tester) {
		super(tester);
	}

	public void test() {
		testArrayVariableDeclaration();
	}

	public void testArrayVariableDeclaration() {
		
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
