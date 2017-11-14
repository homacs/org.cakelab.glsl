package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.TestProvider;

public class TestGLSLSyntax {
	public static void test(TestProvider tester) {
		tester.test(TestNumber.class);
		tester.test(TestComment.class);
		tester.test(TestArray.class);
		tester.test(TestStruct.class);
		tester.test(TestInterface.class);
		tester.test(TestVariable.class);
		tester.test(TestFunction.class);
		tester.test(TestExpression.class);
		tester.test(TestStatement.class);
	}
}
