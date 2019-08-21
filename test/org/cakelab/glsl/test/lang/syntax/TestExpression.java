package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.TestProvider;

public class TestExpression extends TestingSyntaxBase {

	static String[] PRIMARY_EXPRESSION_EXAMPLES = new String[]{
		"var",
		"(var)",
		"1",
		"1u",
		"1.0",
		"1f"
	};
	
	static String[] POSTFIX_EXPRESSION_EXAMPLES = new String[]{
		"MyStruct[3](1,2,3)",
		"MyStruct(8,4)",
		"float(4f)",
		"float[](4f)",
		"float[1](4f)",
		"var.x",
		"var.x.y",
		"var++",
		"var--"
	};
	
	static String[] UNARY_OPERATORS = new String[]{
			"++",
			"--",
			"~",
			"!",
			"+",
			"-"
		};
		
	static String[] MUL_OPERATORS = new String[]{
			"*",
			"/",
			"%",
		};
		
	static String[] ADD_OPERATORS = new String[]{
			"+",
			"-",
		};
		
	public TestExpression(TestProvider tester) {
		super(tester);
	}

	public void test() {
		
		testPrimaryExpression();
		testPostfixExpression();
		testUnaryExpression();
		testMultiplicativeExpression();
		testAdditiveExpression();
		testShiftExpression();
		testRelationalExpression();
		testEqualityExpression();
		testAndExpression();
		testExclusiveOrExpression();
		testInclusiveOrExpression();
		testConditionalExpression();
		testAssignmentExpression();
		testExpression();
	}

	
	
	
	private void testPrimaryExpression() {
		setupMultiTest();
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(primary);
		}
		tearDownMultiTest();
	}

	private void testPostfixExpression() {
		assertValid("float[](8.0f)");
		assertValid("float[](8.0f)");
		assertValid("int light(bool exists, int times); int lightvar = light(true, 1);");
		
		setupMultiTest();
		assertValid("(func)()");
		assertValid("((func))()");
		assertValid("a.f()");
		assertValid("b.a[3](1,2)");
		tearDownMultiTest();
		
		setupMultiTest();
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(primary);
		}
		tearDownMultiTest();
		
		setupMultiTest();
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			assertValid(postfix);
		}
		tearDownMultiTest();
	}

	private void testUnaryExpression() {
		setupMultiTest();

		assertValid("++a--");
		
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				assertValid(op + primary);
			}
		}

		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				assertValid(op + postfix);
			}
		}
		tearDownMultiTest();
		
	}
	
	
	private void testMultiplicativeExpression() {
		setupMultiTest();
		assertValid("a * ++b * +c * func()");
		assertValid("a * ++b * +c-- * func()");
		
		StringBuffer expr = new StringBuffer();
		int i = 0;
		
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				if (expr.length() > 0) expr.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				expr.append(op).append(primary);
			}
			assertValid(expr.toString());
		}

		i = 0;
		expr = new StringBuffer();
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				if (expr.length() > 0) expr.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				expr.append(op).append(postfix);
			}
			assertValid(expr.toString());
		}
		tearDownMultiTest();
	}
	

	private void testAdditiveExpression() {
		setupMultiTest();
		assertValid("a++ + ++ +b");
		
		StringBuffer expr = new StringBuffer();
		int i = 0;
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			StringBuffer term = new StringBuffer();
			for (String op : UNARY_OPERATORS) {
				if (term.length() > 0) term.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				term.append(op).append(primary);
			}
			if (expr.length() > 0) expr.append(ADD_OPERATORS[i%2]);
			expr.append(term);
			assertValid(expr.toString());
		}

		i = 0;
		expr = new StringBuffer();
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			StringBuffer term = new StringBuffer();
			for (String op : UNARY_OPERATORS) {
				if (term.length() > 0) term.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				term.append(op).append(postfix);
			}
			if (expr.length() > 0) expr.append(ADD_OPERATORS[i%2]);
			expr.append(term);
			assertValid(expr.toString());
		}
		
		tearDownMultiTest();
	}
	
	private void testShiftExpression() {
		setupMultiTest();

		assertValid("a>>b");
		assertValid("a>>b<<3");
		assertValid(" 1+1 << 1*1 >> 1");
		

		StringBuffer expr = new StringBuffer();
		int i = 0;
		int j = 0;
		int k = 0;
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			StringBuffer term = new StringBuffer();
			for (String op : UNARY_OPERATORS) {
				if (term.length() > 0) term.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				term.append(op).append(primary);
			}
			if (expr.length() > 0) {
				expr.append(' ');
				if (j%2 == 0) expr.append((k/2)%2==0?"<<":">>");
				else expr.append(ADD_OPERATORS[(k/2)%2]);
				k++;
				expr.append(' ');
			}
			j++;
			expr.append(term);
			
			assertValid(expr.toString());
		}

		i = 0;
		j = 0;
		k = 0;
		expr = new StringBuffer();
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			StringBuffer term = new StringBuffer();
			for (String op : UNARY_OPERATORS) {
				if (term.length() > 0) {
					term.append(' ');
					term.append(MUL_OPERATORS[i]);
					term.append(' ');
				}
				i = (i+1) % MUL_OPERATORS.length;
				term.append(op).append(postfix);
			}
			if (expr.length() > 0) {
				expr.append(' ');
				if (j%2 == 0) expr.append((k/2)%2==0?"<<":">>");
				else expr.append(ADD_OPERATORS[(k/2)%2]);
				k++;
				expr.append(' ');
			}
			j++;
			expr.append(term);
			assertValid(expr.toString());
		}
		
		tearDownMultiTest();
	}
	
	private void testRelationalExpression() {
		setupMultiTest();

		assertValid("a < b");
		assertValid("a > b");
		assertValid("a <= b");
		assertValid("a >= b");
		assertValid("a < b<<2");
		assertValid("a < b > 2");
		
		tearDownMultiTest();
	}
	
	private void testEqualityExpression() {
		setupMultiTest();

		assertValid("a == b");
		assertValid("a != b");
		assertValid("a <= b");
		assertValid("a >= b == 3 != 4");
		assertValid("a < b<<2 == 5");
		assertValid("a != !b");
		assertInvalid("a =! b");
		assertInvalid("a != != b");
		
		tearDownMultiTest();
	}
	
	private void testAndExpression() {
		setupMultiTest();
		assertValid("a & b");
		assertValid("a & b & c");
		assertValid("a & b == c & d");
		tearDownMultiTest();
	}
	
	private void testExclusiveOrExpression() {
		setupMultiTest();
		assertValid("a ^ b");
		assertValid("a ^ b ^ c");
		assertValid("a ^ b & c ^ d");
		tearDownMultiTest();
	}
	
	private void testInclusiveOrExpression() {
		setupMultiTest();
		assertValid("a | b");
		assertValid("a | b ^ c");
		assertValid("a | b | c & d ^ e");
		tearDownMultiTest();
	}
	
	private void testConditionalExpression() {
		setupMultiTest();
		assertValid("a || b | c");
		assertValid("a && b & c");
		assertValid("a ^^ b ^ c & d ^ e");
		assertValid("a&&b ? a : b");
		assertValid("a&&b ? a&&b ? a : b : b");
		assertValid("a&&b ? a&&b ? +a : b++ : b<<1");
		tearDownMultiTest();
	}
	
	private void testAssignmentExpression() {
		setupMultiTest();
		assertValid("a = b");
		assertValid("a = b | c");
		assertValid("a = b = c");
		assertValid("a = b == c");
		assertValid("(a == b) = c");
		
		assertValid("a += b | c");
		assertValid("a -= b | c");
		assertValid("a *= b | c");
		assertValid("a /= b | c");
		assertValid("a %= b | c");
		assertValid("a ^= b | c");
		assertValid("a |= b | c");
		assertValid("a &= b | c");
		assertValid("a <<= b | c");
		assertValid("a >>= b | c");
		
		assertValid("x = a || b | c");
		assertValid("float[] = a && b & c");
		assertValid("x = a ^^ b ^ c & d ^ e");
		assertValid("(a ^^ b ^ c & d ^ e) = x");
		assertValid("++x = x");
		assertValid("x = a&&b ? a : b");
		assertValid("a&&b ? a&&b ? a = b : b : b");
		assertValid("a&&b ? a&&(b=3) ? +a : b++ : b  += 3");
		tearDownMultiTest();
	}
	
	private void testExpression() {
		setupMultiTest();
		assertValid("a = b");
		assertValid("a = b, c = d");
		assertValid("a = b, c = d, e = f");
		tearDownMultiTest();
	}
}
