package org.cakelab.glsl.parser;

import org.cakelab.glsl.TestBaseCommon;
import org.cakelab.glsl.parser.GLSLParser.GlslArrayDimensionContext;
import org.cakelab.glsl.parser.GLSLParser.GlslBuiltinTypeContext;
import org.cakelab.glsl.parser.GLSLParser.GlslCallArgumentsContext;

public class TestExpression extends TestBaseGLSL {
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
		
	
	public static void test() {
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

	
	public static void setupMultiTest() {
		autoTearDown = false;
		validator.addDeclaredType("MyStruct", null);
		validator.addDeclaredVariable("var", null);
		validator.addDeclaredFunction("func", null);
	}
	
	public static void tearDownMultiTest() {
		TestBaseCommon.tearDown();
		autoTearDown = true;
	}
	
	
	private static void testPrimaryExpression() {
		setupMultiTest();
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(p(primary).glslPrimaryExpression());
		}
		tearDownMultiTest();
	}

	private static void testPostfixExpression() {
		assertValid(p("float[](8.0f)").glslPostfixExpression(), GlslBuiltinTypeContext.class, GlslArrayDimensionContext.class);
		assertValid(p("float[](8.0f)").glslAssignmentExpression(), GlslBuiltinTypeContext.class, GlslArrayDimensionContext.class);
		assertValid("int light(bool exists, int times); int lightvar = light(true, 1);");
		
		setupMultiTest();
		assertValid(p("(func)()").glslPostfixExpression(), GlslCallArgumentsContext.class);
		assertValid(p("((func))()").glslPostfixExpression(), GlslCallArgumentsContext.class);
		assertValid(p("a.b()").glslPostfixExpression(), GlslCallArgumentsContext.class);
		assertValid(p("a.b[3](1,2)").glslPostfixExpression(), GlslCallArgumentsContext.class);
		tearDown();
		
		setupMultiTest();
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(p(primary).glslPostfixExpression());
		}
		tearDownMultiTest();
		
		setupMultiTest();
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			assertValid(p(postfix).glslPostfixExpression());
		}
		tearDownMultiTest();
	}

	private static void testUnaryExpression() {
		setupMultiTest();

		assertValid(p("++a--").glslUnaryExpression());
		
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				assertValid(p(op + primary).glslUnaryExpression());
			}
		}

		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				assertValid(p(op + postfix).glslUnaryExpression());
			}
		}
		tearDownMultiTest();
		
	}
	
	
	private static void testMultiplicativeExpression() {
		setupMultiTest();
		assertValid(p("a * ++b * +c * func()").glslMultiplicativeExpression());
		assertValid(p("a * ++b * +c-- * func()").glslMultiplicativeExpression());
		
		StringBuffer expr = new StringBuffer();
		int i = 0;
		
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				if (expr.length() > 0) expr.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				expr.append(op).append(primary);
			}
			assertValid(p(expr.toString()).glslMultiplicativeExpression());
		}

		i = 0;
		expr = new StringBuffer();
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			for (String op : UNARY_OPERATORS) {
				if (expr.length() > 0) expr.append(MUL_OPERATORS[i]);
				i = (i+1) % MUL_OPERATORS.length;
				expr.append(op).append(postfix);
			}
			assertValid(p(expr.toString()).glslMultiplicativeExpression());
		}
		tearDownMultiTest();
	}
	

	private static void testAdditiveExpression() {
		setupMultiTest();
		assertValid(p("a++ + ++ +b").glslAdditiveExpression());
		
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
			assertValid(p(expr.toString()).glslAdditiveExpression());
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
			assertValid(p(expr.toString()).glslAdditiveExpression());
		}
		
		tearDownMultiTest();
	}
	
	private static void testShiftExpression() {
		setupMultiTest();

		assertValid(p("a>>b").glslShiftExpression());
		assertValid(p("a>>b<<3").glslShiftExpression());
		assertValid(p(" 1+1 << 1*1 >> 1").glslShiftExpression());
		

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
			
			assertValid(p(expr.toString()).glslShiftExpression());
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
			assertValid(p(expr.toString()).glslShiftExpression());
		}
		
		tearDownMultiTest();
	}
	
	private static void testRelationalExpression() {
		setupMultiTest();

		assertValid(p("a < b").glslRelationalExpression());
		assertValid(p("a > b").glslRelationalExpression());
		assertValid(p("a <= b").glslRelationalExpression());
		assertValid(p("a >= b").glslRelationalExpression());
		assertValid(p("a < b<<2").glslRelationalExpression());
		assertValid(p("a < b > 2").glslRelationalExpression());
		
		tearDownMultiTest();
	}
	
	private static void testEqualityExpression() {
		setupMultiTest();

		assertValid(p("a == b").glslEqualityExpression());
		assertValid(p("a != b").glslEqualityExpression());
		assertValid(p("a <= b").glslEqualityExpression());
		assertValid(p("a >= b == 3 != 4").glslEqualityExpression());
		assertValid(p("a < b<<2 == 5").glslEqualityExpression());
		assertValid(p("a != !b").glslEqualityExpression());
		assertInvalid(p("a =! b").glslEqualityExpression());
		assertInvalid(p("a != != b").glslEqualityExpression());
		
		tearDownMultiTest();
	}
	
	private static void testAndExpression() {
		setupMultiTest();
		assertValid(p("a & b").glslAndExpression());
		assertValid(p("a & b & c").glslAndExpression());
		assertValid(p("a & b == c & d").glslAndExpression());
		tearDownMultiTest();
	}
	
	private static void testExclusiveOrExpression() {
		setupMultiTest();
		assertValid(p("a ^ b").glslExclusiveOrExpression());
		assertValid(p("a ^ b ^ c").glslExclusiveOrExpression());
		assertValid(p("a ^ b & c ^ d").glslExclusiveOrExpression());
		tearDownMultiTest();
	}
	
	private static void testInclusiveOrExpression() {
		setupMultiTest();
		assertValid(p("a | b").glslInclusiveOrExpression());
		assertValid(p("a | b ^ c").glslInclusiveOrExpression());
		assertValid(p("a | b | c & d ^ e").glslInclusiveOrExpression());
		tearDownMultiTest();
	}
	
	private static void testConditionalExpression() {
		setupMultiTest();
		assertValid(p("a || b | c").glslConditionalExpression());
		assertValid(p("a && b & c").glslConditionalExpression());
		assertValid(p("a ^^ b ^ c & d ^ e").glslConditionalExpression());
		assertValid(p("a&&b ? a : b").glslConditionalExpression());
		assertValid(p("a&&b ? a&&b ? a : b : b").glslConditionalExpression());
		assertValid(p("a&&b ? a&&b ? +a : b++ : b<<1").glslConditionalExpression());
		tearDownMultiTest();
	}
	
	private static void testAssignmentExpression() {
		setupMultiTest();
		assertValid(p("a = b").glslAssignmentExpression());
		assertValid(p("a = b | c").glslAssignmentExpression());
		assertValid(p("a = b = c").glslAssignmentExpression());
		assertValid(p("a = b == c").glslAssignmentExpression());
		assertValid(p("(a == b) = c").glslAssignmentExpression());
		
		assertValid(p("a += b | c").glslAssignmentExpression());
		assertValid(p("a -= b | c").glslAssignmentExpression());
		assertValid(p("a *= b | c").glslAssignmentExpression());
		assertValid(p("a /= b | c").glslAssignmentExpression());
		assertValid(p("a %= b | c").glslAssignmentExpression());
		assertValid(p("a ^= b | c").glslAssignmentExpression());
		assertValid(p("a |= b | c").glslAssignmentExpression());
		assertValid(p("a &= b | c").glslAssignmentExpression());
		assertValid(p("a <<= b | c").glslAssignmentExpression());
		assertValid(p("a >>= b | c").glslAssignmentExpression());
		
		assertValid(p("x = a || b | c").glslAssignmentExpression());
		assertValid(p("float[] = a && b & c").glslAssignmentExpression());
		assertValid(p("x = a ^^ b ^ c & d ^ e").glslAssignmentExpression());
		assertValid(p("(a ^^ b ^ c & d ^ e) = x").glslAssignmentExpression());
		assertValid(p("++x = x").glslAssignmentExpression());
		assertValid(p("x = a&&b ? a : b").glslAssignmentExpression());
		assertValid(p("a&&b ? a&&b ? a = b : b : b").glslAssignmentExpression());
		assertValid(p("a&&b ? a&&(b=3) ? +a : b++ : b  += 3").glslAssignmentExpression());
		tearDownMultiTest();
	}
	
	private static void testExpression() {
		setupMultiTest();
		assertValid(p("a = b").glslExpression());
		assertValid(p("a = b, c = d").glslExpression());
		assertValid(p("a = b, c = d, e = f").glslExpression());
		tearDownMultiTest();
	}
}
