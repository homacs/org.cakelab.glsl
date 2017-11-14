package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.TestAll;

public abstract class TestStatement extends TestingSyntaxBase {
	
	public void main(String[] args) {
		TestAll.checkAssertionsOn();
		test();
	}
	
	
	public void test() {
		testSimpleStatement();
		testCompoundStatement();
		testIfStatement();
		testSwitchStatement();
		testWhileStatement();
		testDoWhileStatement();
		testForStatement();
	}

	
	public void testSimpleStatement() {
		assertValid("int a;");
		assertValid(";");
		assertValid("a++;");
	}

	public void testCompoundStatement() {
		assertValid("{}");
		assertValid("{a = a++;}");
		assertValid("{ {a = a++;}}");
		assertValid("{ ; ; }");
		
	}
	
	public void testIfStatement() {
		assertValid("if(false);");
		assertValid("if (true) exit();");
		assertValid("if (1) if (2) ;");
		
		assertValid("if (1) {} else {}");
		assertValid("if (1) {} else ;");
		assertValid("if (1) ; else ;");
		assertValid("if (1) ; else if(a) ;");
		assertValid("if (1) if (2) ; else ;");
		assertValid("if (1) if (2) {} else {} else {}");
		assertValid("if (1) if (2) ; else if (3) ;");
		assertValid("if (1) { if (2) ; else if (3) ; } else ;");
	}

	public void testSwitchStatement() {
		assertValid("switch(1){}");
		assertValid("switch(1){default: return; }");
		assertValid("switch(1){case 1:switch(2){} break;}");
		assertValid("switch(1){case 1: switch(2){case 2: return; } break;}");
	}

	public void testWhileStatement() {
		assertValid("while(true);");
		assertValid("while(true){ return; }");
		assertValid("while(true) while(false){}");
		
		assertValid("while(bool a = true);");
	}

	public void testDoWhileStatement() {
		assertValid("do ; while(true);");
		assertValid("do do ; while (true); while(true);");
	}
	
	public void testForStatement() {
		assertValid("for(;;)break;");
		assertValid("for(int i = 0; i < 10; i++);");
		assertValid("for(int i = 0, j = 1; i < 10 && j > 2; i++, j++);");
		assertValid("for(;;)for(;;);");
		assertValid("for(;;)for(;;){}");
		assertValid("for(;;){for(;;){}}");
	}
}
