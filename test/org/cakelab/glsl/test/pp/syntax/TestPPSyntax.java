package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.test.Test;

public class TestPPSyntax {
	public static void main(String[] args) {
		Test.checkAssertionsOn();
		test();
	}

	public static void test() {
		TestNumber.test();
		TestStringLiteral.test();
		TestExpression.test();
		TestDirective.test();
	}
}
