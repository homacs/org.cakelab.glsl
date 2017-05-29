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
	
	
	public static void test() {
		testPrimaryExpression();
		testPostfixExpression();
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
		
		for (String postfix : POSTFIX_EXPRESSION_EXAMPLES) {
			System.out.println(postfix + ":");
			System.out.flush();
			setupMultiTest();
			assertValid(p(postfix).glslPostfixExpression());
			tearDownMultiTest();
		}
	}



}
