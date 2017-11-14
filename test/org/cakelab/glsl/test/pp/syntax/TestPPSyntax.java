package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.test.TestProvider;

public class TestPPSyntax {
	
	public static void test(TestProvider tester) {
		tester.test(TestNumber.class);
		tester.test(TestStringLiteral.class);
		tester.test(TestExpression.class);
		tester.test(TestDirective.class);
	}
}
