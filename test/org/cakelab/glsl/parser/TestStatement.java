package org.cakelab.glsl.parser;

import org.cakelab.glsl.TestBaseCommon;
import org.cakelab.glsl.parser.GLSLParser.*;

public class TestStatement extends TestBaseGLSL {
	
	public static void test() {
		testSimpleStatement();
		testCompoundStatement();
		testIfStatement();
		testSwitchStatement();
		testWhileStatement();
		testDoWhileStatement();
		testForStatement();
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
	
	private static void testSimpleStatement() {
		assertValid(p("int a;").glslSimpleStatement(), GlslDeclarationStatementContext.class);
		assertValid(p(";").glslSimpleStatement(), GlslExpressionStatementContext.class);
		assertValid(p("a++;").glslSimpleStatement(), GlslExpressionStatementContext.class);
	}

	private static void testCompoundStatement() {
		assertValid(p("{}").glslCompoundStatement());
		assertValid(p("{a = a++;}").glslCompoundStatement());
		assertValid(p("{ {a = a++;}}").glslCompoundStatement());
		assertValid(p("{ ; ; }").glslCompoundStatement());
		
	}
	
	private static void testIfStatement() {
		assertValid(p("if(false);").glslIfStatement());
		assertValid(p("if (true) exit();").glslIfStatement());
		assertValid(p("if (1) if (2) ;").glslIfStatement());
		
		// TODO: If statements with else branches are the only case 
		// where ANTLR suspects context sensitivity, but I 
		// really can't find the reason!
		IGNORE_CONTEXT_SENSITIVITY = true;
		assertValid(p("if (1) {} else {}").glslIfStatement());
		assertValid(p("if (1) {} else ;").glslIfStatement());
		assertValid(p("if (1) ; else ;").glslIfStatement());
		assertValid(p("if (1) ; else if(a) ;").glslIfStatement());
		assertValid(p("if (1) if (2) ; else ;").glslIfStatement());
		assertValid(p("if (1) if (2) ; else if (3) ;").glslIfStatement());
		IGNORE_CONTEXT_SENSITIVITY = false;
	}

	private static void testSwitchStatement() {
		assertValid(p("switch(1){}").glslSwitchStatement());
		assertValid(p("switch(1){default: return; }").glslSwitchStatement());
		assertValid(p("switch(1){case 1:switch(2){} break;}").glslSwitchStatement());
		assertValid(p("switch(1){case 1: switch(2){case 2: return; } break;}").glslSwitchStatement());
	}

	private static void testWhileStatement() {
		assertValid(p("while(true);").glslWhileStatement());
		assertValid(p("while(true){ return; }").glslWhileStatement());
		assertValid(p("while(true) while(false){}").glslWhileStatement());
		
		assertValid(p("while(bool a = true);").glslWhileStatement());
	}

	private static void testDoWhileStatement() {
		assertValid(p("do ; while(true);").glslDoWhileStatement());
		assertValid(p("do do ; while (true); while(true);").glslDoWhileStatement());
	}
	
	private static void testForStatement() {
		assertValid(p("for(;;)break;").glslForStatement());
		assertValid(p("for(int i = 0; i < 10; i++);").glslForStatement());
		assertValid(p("for(int i = 0, j = 1; i < 10 && j > 2; i++, j++);").glslForStatement());
		assertValid(p("for(;;)for(;;);").glslForStatement());
		assertValid(p("for(;;)for(;;){}").glslForStatement());
		assertValid(p("for(;;){for(;;){}}").glslForStatement());
	}
}
