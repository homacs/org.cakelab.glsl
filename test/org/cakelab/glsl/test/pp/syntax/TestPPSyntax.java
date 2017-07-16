package org.cakelab.glsl.test.pp.syntax;

public class TestPPSyntax {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		TestNumber.test();
		TestStringLiteral.test();
		TestExpression.test();
		TestDirective.test();
	}
}
