package org.cakelab.glsl.test.lang.syntax;

public abstract class TestInterface extends TestingSyntaxBase {
	public void test() {
		testInterfaceBlock();
	}

	private void testInterfaceBlock() {
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "};");
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "}a;");
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "}a;");
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "};\n"
				+ "void main(){ a = 1;}");
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "};\n"
				+ "in boo {"
				+ "	int a;"
				+ "}x;");
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "} x;\n"
				+ "out boo {"
				+ "	int a;"
				+ "} y;");
		assertInvalid("out boo {"
				+ "	int a;"
				+ "} y, z;");
	}




}
