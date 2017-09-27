package org.cakelab.glsl.test.lang.syntax;

import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.GLSLParser.GlslInterfaceBlockStructureContext;
import org.cakelab.glsl.test.lang.TestingBase;

public class TestInterface extends TestingBase {
	public static void test() {

		testInterfaceBlock();
		

	}

	private static void testInterfaceBlock() {
		Class<? extends ParseTree> expected = GlslInterfaceBlockStructureContext.class;
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "};", expected);
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "}a;", expected);
		
		assertValid("in boo {\n"
				+ "	int a;\n"
				+ "}a;", expected);
		
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
