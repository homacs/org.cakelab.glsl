package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.lang.ast.*;
import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestExpression extends TestingPPBase {
	
	public static void test() {
		testPrimaryExpression();
		testUnaryExpression();
		testMultiplicativeExpression();
		testAdditiveExpression();
		testShiftExpression();
		testRelationalExpression();
		testEqualityExpression();
		testAndExpression();
		testXorExpression();
		testOrExpression();
		testLogicalAndExpression();
		testLogicalXorExpression();
		testLogicalOrExpression();
		testConditionalExpression();
		testExpression();
	}

	
	
	static String[] PRIMARY_EXPRESSION_EXAMPLES = new String[]{
			"var",
			"(var)",
			"1",
			"1u",
			"0xf17",
			"'a'",
			"true",
			"false"
		};
		
		static String[] UNARY_OPERATORS = new String[]{
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
			
		
	
	


	private static void testPrimaryExpression() {
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(p(primary).primary_expression(), PrimaryExpression.class);
		}
		
		assertError(p("0.0").primary_expression(),"double in preprocessor expression");
	}

	

	private static void testUnaryExpression() {
		assertValid(p("+ a").unary_expression(), UnaryExpression.class);
		assertValid(p("- a").unary_expression(), UnaryExpression.class);
		assertValid(p("! a").unary_expression(), UnaryExpression.class);
		assertValid(p("~ a").unary_expression(), UnaryExpression.class);
		
		assertEval(p("!0").multiplicative_expression(null), true, UnaryExpression.class);
		assertEval(p("!1").multiplicative_expression(null), false, UnaryExpression.class);
		assertEval(p("!-1").multiplicative_expression(null), false, UnaryExpression.class);
		assertEval(p("!!1").multiplicative_expression(null), true, UnaryExpression.class);
		assertEval(p("!!0").multiplicative_expression(null), false, UnaryExpression.class);

		assertEval(p("+a").multiplicative_expression(null), 0, UnaryExpression.class);
		assertEval(p("!a").multiplicative_expression(null), true, UnaryExpression.class);
		
		assertEval(p("~0").multiplicative_expression(null), 0xffffffff, UnaryExpression.class);
		assertEval(p("~false").multiplicative_expression(null), 0xffffffff, UnaryExpression.class);
		assertEval(p("~1").multiplicative_expression(null), 0xfffffffe, UnaryExpression.class);
		assertEval(p("~true").multiplicative_expression(null), 0xfffffffe, UnaryExpression.class);
		
		
	}
	
	
	private static void testMultiplicativeExpression() {
		assertValid(p("a * b").multiplicative_expression(null), MulExpression.class);
		assertValid(p("a / b").multiplicative_expression(null), DivExpression.class);
		assertValid(p("a % b").multiplicative_expression(null), ModExpression.class);
		assertValid(p("a * b * 1").multiplicative_expression(null), MulExpression.class);
		assertValid(p("!a * ~b").multiplicative_expression(null), MulExpression.class);
		assertValid(p("-a * + b").multiplicative_expression(null), MulExpression.class);
		
		assertEval(p("1 * 0").multiplicative_expression(null), 0, MulExpression.class);
		assertEval(p("0 * 2").multiplicative_expression(null), 0, MulExpression.class);
		assertEval(p("2 * 1").multiplicative_expression(null), 2, MulExpression.class);
		assertEval(p("3 * 2 * 1").multiplicative_expression(null), 6, MulExpression.class);
		assertEval(p("2 * 1 * 0").multiplicative_expression(null), 0, MulExpression.class);
		assertEval(p("2 * -1").multiplicative_expression(null), -2, MulExpression.class);
		assertEval(p("2 * +1").multiplicative_expression(null), 2, MulExpression.class);
		
		assertEval(p("4 / 2").multiplicative_expression(null), 2, DivExpression.class);
		assertEval(p("8 / 2 / 2").multiplicative_expression(null), 2, DivExpression.class);
		assertEval(p("8 / 2 / 2").multiplicative_expression(null), 2, DivExpression.class);
		
		
		
	}
	

	private static void testAdditiveExpression() {

		assertValid(p("a + b").additive_expression(null), PlusExpression.class);
		assertValid(p("!a + +b").additive_expression(null), PlusExpression.class);
		assertValid(p("-a + ~b").additive_expression(null), PlusExpression.class);
		assertValid(p("a - b").additive_expression(null), MinusExpression.class);
		
		assertEval(p("1 + 2 * 3").additive_expression(null), 7, PlusExpression.class);
		assertEval(p("true + false").additive_expression(null), 1, PlusExpression.class);
		assertEval(p("true + 1").additive_expression(null), 2, PlusExpression.class);
	}

	private static void testShiftExpression() {
		assertValid(p("a >> b").shift_expression(null), ShiftRightExpression.class);
		assertValid(p("b << a").shift_expression(null), ShiftLeftExpression.class);
		
		assertEval(p("1 << 0").shift_expression(null), 1, ShiftLeftExpression.class);
		assertEval(p("1 << 1").shift_expression(null), 1 << 1, ShiftLeftExpression.class);
		assertEval(p("true << 1").shift_expression(null), 1 << 1, ShiftLeftExpression.class);
		assertEval(p("2 << -1").shift_expression(null), 1, ShiftLeftExpression.class);
		assertEval(p("1 << 2 << 3").shift_expression(null), 1 << 2 << 3, ShiftLeftExpression.class);
		assertEval(p("1 << (2 << 3)").shift_expression(null), 65536, ShiftLeftExpression.class);
		assertEval(p("0xffffffff << 1").shift_expression(null), 0xfffffffe, ShiftLeftExpression.class);
		assertEval(p("0xffffffff << 31").shift_expression(null), -2147483648, ShiftLeftExpression.class);
		assertEval(p("0xffffffff << 32").shift_expression(null), 0, ShiftLeftExpression.class);
		assertEval(p("0xffffffff >> 1").shift_expression(null), 0x7fffffff, ShiftRightExpression.class);
		assertEval(p("1 >> 1").shift_expression(null), 0, ShiftRightExpression.class);
		assertEval(p("1 >> 128").shift_expression(null), 0, ShiftRightExpression.class);
		assertEval(p("'a' >> 1").shift_expression(null), 48, ShiftRightExpression.class);
		assertEval(p("true >> 1").shift_expression(null), 0, ShiftRightExpression.class);
		
	}
	
	private static void testRelationalExpression() {
		assertValid(p("a < b").relational_expression(null), LtExpression.class);
		assertEval(p("0 < 1").relational_expression(null), true, LtExpression.class);
		assertEval(p("-1 < 0").relational_expression(null), true, LtExpression.class);
		assertEval(p("'a' < 'b'").relational_expression(null), true, LtExpression.class);
		assertValid(p("a > b").relational_expression(null), GtExpression.class);
		assertValid(p("a <= b").relational_expression(null), LeExpression.class);
		assertValid(p("a >= b").relational_expression(null), GeExpression.class);
	}
	
	private static void testEqualityExpression() {
		assertValid(p("a == b").equality_expression(null), EqExpression.class);
		assertValid(p("a != b").equality_expression(null), NeExpression.class);
	}
	
	private static void testAndExpression() {
		assertValid(p("a & b").and_expression(null), AndExpression.class);
		assertEval(p("a & b").and_expression(null), 0, AndExpression.class);
	}
	
	private static void testXorExpression() {
		assertEval(p("a ^ b").xor_expression(null), 0^0, XorExpression.class);
	}
	
	private static void testOrExpression() {
		assertEval(p("a | b").or_expression(null), 0, OrExpression.class);
		assertEval(p("a | 1").or_expression(null), 1, OrExpression.class);
		assertEval(p("a | true").or_expression(null), 1, OrExpression.class);
		assertEval(p("a | 'a'").or_expression(null), 'a', OrExpression.class);
	}
	
	private static void testLogicalAndExpression() {
		assertEval(p("a && b").logical_and_expression(null), false, LogicalAndExpression.class);
		assertEval(p("1 && 0").logical_and_expression(null), false, LogicalAndExpression.class);
	}
	
	private static void testLogicalXorExpression() {
		assertEval(p("a ^^ b").logical_xor_expression(null), false, LogicalXorExpression.class);
	}
	
	private static void testLogicalOrExpression() {
		assertEval(p("a || b").logical_or_expression(null), false, LogicalOrExpression.class);
	}
	
	private static void testConditionalExpression() {
		assertEval(p("a?a:b").conditional_expression(null), 0, ConditionalExpression.class);
	}
	
	private static void testExpression() {
		assertEval(p("0,1").expression(), 1, ExpressionList.class);
		
		assertEval(p("0,1+2+2").expression(), 5, ExpressionList.class);
		
	}
	
	
	

}
