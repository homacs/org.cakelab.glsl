package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.lang.ast.AndExpression;
import org.cakelab.glsl.lang.ast.ConditionalExpression;
import org.cakelab.glsl.lang.ast.DivExpression;
import org.cakelab.glsl.lang.ast.EqExpression;
import org.cakelab.glsl.lang.ast.ExpressionList;
import org.cakelab.glsl.lang.ast.GeExpression;
import org.cakelab.glsl.lang.ast.GtExpression;
import org.cakelab.glsl.lang.ast.LeExpression;
import org.cakelab.glsl.lang.ast.LogicalAndExpression;
import org.cakelab.glsl.lang.ast.LogicalOrExpression;
import org.cakelab.glsl.lang.ast.LogicalXorExpression;
import org.cakelab.glsl.lang.ast.LtExpression;
import org.cakelab.glsl.lang.ast.MinusExpression;
import org.cakelab.glsl.lang.ast.ModExpression;
import org.cakelab.glsl.lang.ast.MulExpression;
import org.cakelab.glsl.lang.ast.NeExpression;
import org.cakelab.glsl.lang.ast.OrExpression;
import org.cakelab.glsl.lang.ast.PlusExpression;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.ShiftLeftExpression;
import org.cakelab.glsl.lang.ast.ShiftRightExpression;
import org.cakelab.glsl.lang.ast.UnaryExpression;
import org.cakelab.glsl.lang.ast.XorExpression;
import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.TestProvider;
import org.cakelab.glsl.test.pp.TestingExprBase;

public class TestExpression extends TestingExprBase implements Test {
	
	public TestExpression(TestProvider tester) {
		super(tester);
	}



	public void test() {
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
			
		
	
	


	private void testPrimaryExpression() {
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(expr(primary).primary_expression(), PrimaryExpression.class);
		}
		
		assertError(expr("0.0").primary_expression(),"double in preprocessor expression");
	}

	

	private void testUnaryExpression() {
		assertValid(expr("+ a").unary_expression(), UnaryExpression.class);
		assertValid(expr("- a").unary_expression(), UnaryExpression.class);
		assertValid(expr("! a").unary_expression(), UnaryExpression.class);
		assertValid(expr("~ a").unary_expression(), UnaryExpression.class);
		
		assertEval(expr("!0").multiplicative_expression(null), true, UnaryExpression.class);
		assertEval(expr("!1").multiplicative_expression(null), false, UnaryExpression.class);
		assertEval(expr("!-1").multiplicative_expression(null), false, UnaryExpression.class);
		assertEval(expr("!!1").multiplicative_expression(null), true, UnaryExpression.class);
		assertEval(expr("!!0").multiplicative_expression(null), false, UnaryExpression.class);

		assertEval(expr("+a").multiplicative_expression(null), 0, UnaryExpression.class);
		assertEval(expr("!a").multiplicative_expression(null), true, UnaryExpression.class);
		
		assertEval(expr("~0").multiplicative_expression(null), 0xffffffff, UnaryExpression.class);
		assertEval(expr("~false").multiplicative_expression(null), 0xffffffff, UnaryExpression.class);
		assertEval(expr("~1").multiplicative_expression(null), 0xfffffffe, UnaryExpression.class);
		assertEval(expr("~true").multiplicative_expression(null), 0xfffffffe, UnaryExpression.class);
		
		
	}
	
	
	private void testMultiplicativeExpression() {
		assertValid(expr("a * b").multiplicative_expression(null), MulExpression.class);
		assertValid(expr("a / b").multiplicative_expression(null), DivExpression.class);
		assertValid(expr("a % b").multiplicative_expression(null), ModExpression.class);
		assertValid(expr("a * b * 1").multiplicative_expression(null), MulExpression.class);
		assertValid(expr("!a * ~b").multiplicative_expression(null), MulExpression.class);
		assertValid(expr("-a * + b").multiplicative_expression(null), MulExpression.class);
		
		assertEval(expr("1 * 0").multiplicative_expression(null), 0, MulExpression.class);
		assertEval(expr("0 * 2").multiplicative_expression(null), 0, MulExpression.class);
		assertEval(expr("2 * 1").multiplicative_expression(null), 2, MulExpression.class);
		assertEval(expr("3 * 2 * 1").multiplicative_expression(null), 6, MulExpression.class);
		assertEval(expr("2 * 1 * 0").multiplicative_expression(null), 0, MulExpression.class);
		assertEval(expr("2 * -1").multiplicative_expression(null), -2, MulExpression.class);
		assertEval(expr("2 * +1").multiplicative_expression(null), 2, MulExpression.class);
		
		assertEval(expr("4 / 2").multiplicative_expression(null), 2, DivExpression.class);
		assertEval(expr("8 / 2 / 2").multiplicative_expression(null), 2, DivExpression.class);
		assertEval(expr("8 / 2 / 2").multiplicative_expression(null), 2, DivExpression.class);
		
		
		
	}
	

	private void testAdditiveExpression() {

		assertValid(expr("a + b").additive_expression(null), PlusExpression.class);
		assertValid(expr("!a + +b").additive_expression(null), PlusExpression.class);
		assertValid(expr("-a + ~b").additive_expression(null), PlusExpression.class);
		assertValid(expr("a - b").additive_expression(null), MinusExpression.class);
		
		assertEval(expr("1 + 2 * 3").additive_expression(null), 7, PlusExpression.class);
		assertEval(expr("true + false").additive_expression(null), 1, PlusExpression.class);
		assertEval(expr("true + 1").additive_expression(null), 2, PlusExpression.class);
	}

	private void testShiftExpression() {
		assertValid(expr("a >> b").shift_expression(null), ShiftRightExpression.class);
		assertValid(expr("b << a").shift_expression(null), ShiftLeftExpression.class);
		
		assertEval(expr("1 << 0").shift_expression(null), 1, ShiftLeftExpression.class);
		assertEval(expr("1 << 1").shift_expression(null), 1 << 1, ShiftLeftExpression.class);
		assertEval(expr("true << 1").shift_expression(null), 1 << 1, ShiftLeftExpression.class);
		assertEval(expr("2 << -1").shift_expression(null), 1, ShiftLeftExpression.class);
		assertEval(expr("1 << 2 << 3").shift_expression(null), 1 << 2 << 3, ShiftLeftExpression.class);
		assertEval(expr("1 << (2 << 3)").shift_expression(null), 65536, ShiftLeftExpression.class);
		assertEval(expr("0xffffffff << 1").shift_expression(null), 0xfffffffe, ShiftLeftExpression.class);
		assertEval(expr("0xffffffff << 31").shift_expression(null), -2147483648, ShiftLeftExpression.class);
		assertEval(expr("0xffffffff << 32").shift_expression(null), 0, ShiftLeftExpression.class);
		assertEval(expr("0xffffffff >> 1").shift_expression(null), 0x7fffffff, ShiftRightExpression.class);
		assertEval(expr("1 >> 1").shift_expression(null), 0, ShiftRightExpression.class);
		assertEval(expr("1 >> 128").shift_expression(null), 0, ShiftRightExpression.class);
		assertEval(expr("'a' >> 1").shift_expression(null), 48, ShiftRightExpression.class);
		assertEval(expr("true >> 1").shift_expression(null), 0, ShiftRightExpression.class);
		
	}
	
	private void testRelationalExpression() {
		assertValid(expr("a < b").relational_expression(null), LtExpression.class);
		assertEval(expr("0 < 1").relational_expression(null), true, LtExpression.class);
		assertEval(expr("-1 < 0").relational_expression(null), true, LtExpression.class);
		assertEval(expr("'a' < 'b'").relational_expression(null), true, LtExpression.class);
		assertValid(expr("a > b").relational_expression(null), GtExpression.class);
		assertValid(expr("a <= b").relational_expression(null), LeExpression.class);
		assertValid(expr("a >= b").relational_expression(null), GeExpression.class);
	}
	
	private void testEqualityExpression() {
		assertValid(expr("a == b").equality_expression(null), EqExpression.class);
		assertValid(expr("a != b").equality_expression(null), NeExpression.class);
	}
	
	private void testAndExpression() {
		assertValid(expr("a & b").and_expression(null), AndExpression.class);
		assertEval(expr("a & b").and_expression(null), 0, AndExpression.class);
	}
	
	private void testXorExpression() {
		assertEval(expr("a ^ b").xor_expression(null), 0^0, XorExpression.class);
	}
	
	private void testOrExpression() {
		assertEval(expr("a | b").or_expression(null), 0, OrExpression.class);
		assertEval(expr("a | 1").or_expression(null), 1, OrExpression.class);
		assertEval(expr("a | true").or_expression(null), 1, OrExpression.class);
		assertEval(expr("a | 'a'").or_expression(null), 'a', OrExpression.class);
	}
	
	private void testLogicalAndExpression() {
		assertEval(expr("a && b").logical_and_expression(null), false, LogicalAndExpression.class);
		assertEval(expr("1 && 0").logical_and_expression(null), false, LogicalAndExpression.class);
	}
	
	private void testLogicalXorExpression() {
		assertEval(expr("a ^^ b").logical_xor_expression(null), false, LogicalXorExpression.class);
	}
	
	private void testLogicalOrExpression() {
		assertEval(expr("a || b").logical_or_expression(null), false, LogicalOrExpression.class);
	}
	
	private void testConditionalExpression() {
		assertEval(expr("a?a:b").conditional_expression(null), 0, ConditionalExpression.class);
	}
	
	private void testExpression() {
		assertEval(expr("0,1").expression(), 1, ExpressionList.class);
		
		assertEval(expr("0,1+2+2").expression(), 5, ExpressionList.class);
		
	}
	
	
	

}
