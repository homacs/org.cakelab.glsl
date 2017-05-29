package org.cakelab.glsl.parser;

import org.antlr.v4.runtime.atn.PredictionMode;
import org.cakelab.glsl.parser.GLSLParser.GlslArrayDimensionContext;
import org.cakelab.glsl.parser.GLSLParser.GlslBuiltinTypeContext;

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
		"MyStruct[3]",
		"MyStruct(8,4)",
		"float(4f)",
		"float[](4f)",
		"var.x",
		"var++",
		"var--"
	};
	
	
	public static void test() {
		testPrimaryExpression();
		testPostfixExpression();
	}

	
	public static void setup() {
		validator.addDeclaredType("MyStruct", null);
		validator.addDeclaredVariable("var", null);
	}
	
	private static void testPrimaryExpression() {
		setup();
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(p(primary).glslPrimaryExpression());
		}
		tearDown();
	}

	private static void testPostfixExpression() {
		assertValid(p("float[](8.0f)").glslPostfixExpression(), GlslBuiltinTypeContext.class, GlslArrayDimensionContext.class);
		assertValid(p("float[](8.0f)").glslAssignmentExpression(), GlslBuiltinTypeContext.class, GlslArrayDimensionContext.class);
		tearDown();
		assertValid("int light(bool exists, int times); int lightvar = light(true, 1);");
		tearDown();
		
		setup();
		GLSLParser parser = p("MyStruct(8,4)");
//		parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
		assertValid(parser.glslPostfixExpression());
//		assertValid("MyStruct lightvar = MyStruct(1);");
//		assertValid("struct light{bool exists; int times;}; light lightvar = light(true, 1);");
		
		tearDown();
		setup();
		for (String primary : PRIMARY_EXPRESSION_EXAMPLES) {
			assertValid(p(primary).glslPostfixExpression());
		}
		tearDown();
		
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			System.out.println(postfix);
			setup();
			assertValid(p(postfix).glslPostfixExpression());
			tearDown();
		}
		tearDown();
	}



}
