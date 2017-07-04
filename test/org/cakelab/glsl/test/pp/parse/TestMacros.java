package org.cakelab.glsl.test.pp.parse;

import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestMacros extends TestingPPBase {
	
	public static void main(String[] args) {
		testDefUndef();
		testReplacementList();
	}
	
	
	public static void testDefUndef() {
		assertValid("#define A", "");
		
		assertValid("#define A\n"
				+ "#ifdef A\n"
				+ "success\n"
				+ "#endif",
				"success\n");
		
		assertValid("#define B\n"
				+ "#ifndef A\n"
				+ "success\n"
				+ "#endif",
				"success\n");
		
		assertValid("#define A\n"
				+ "A\n"
				+ "",
				"\n");
		
		assertValid("#define A B\n"
				+ "A\n"
				+ "",
				"B\n");
		
		assertValid("#define A\n"
				+ "#undef A\n"
				+ "#ifndef A\n"
				+ "success\n"
				+ "#endif",
				"success\n");
		
		assertValid("#define A\n"
				+ "#undef A\n"
				+ "#define A\n"
				+ "#ifdef A\n"
				+ "success\n"
				+ "#endif",
				"success\n");
		
		assertValid("#define A\n"
				+ "#define B\n"
				+ "#undef B\n"
				+ "#ifdef A\n"
				+ "success\n"
				+ "#endif",
				"success\n");
		
	}
	
	public static void testReplacementList() {
		
		assertValid("#define A() B\n"
				+ "A()\n"
				+ "",
				"B\n");
		
		assertValid("#define A(x) x = 1\n"
				+ "A(B)\n"
				+ "",
				"B = 1\n");
		
		assertValid("#define A(x) # x\n"
				+ "A(B)\n"
				+ "",
				"\"B\"\n");
		
		assertValid("#define A(x) x ## _type\n"
				+ "A(B)\n"
				+ "",
				"B_type\n");
		
		assertValid("#define A(x,y) x ## y\n"
				+ "A(B,_type)\n",
				"B_type\n");
		
		assertValid("#define A(x,y) x ## y\n"
				+ "#define TYPE(x) A(x,_type)\n"
				+ "A(B,_type)\n",
				"B_type\n");
		
		assertValid("#define A(x,y) x ## y ## ()\n"
				+ "#define TYPE(x) A(x,_type)\n"
				+ "A(B,_type)\n",
				"B_type()\n");
		
	}

	
	
}
