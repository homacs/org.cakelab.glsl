package org.cakelab.glsl.test.pp.parse;

import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestMacros extends TestingPPBase {
	
	public static void main(String[] args) {
		testDefUndef();
		testReplacementList();
	}
	
	
	public static void testDefUndef() {
		assertValid("#define A", "");
		
		// it is legal (but discouraged) to redefine a macro
		assertWarning("#define A b\n"
				+ "#define A c\n", 
				"\"A\" redefined");
		
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
				+ "A()\n",
				"B\n");
		
		assertValid("#define A(x) x = 1\n"
				+ "A(B)\n"
				+ "",
				"B = 1\n");
		
		assertValid("#define A(x) # x\n"
				+ "A(B)\n"
				+ "",
				"\"B\"\n");
		
		assertValid("#define A(x) x/* whitespace */\\\n## /* whitespace */\\\n"
				+ " _type\n"
				+ "A(B)\n"
				+ "",
				"B_type\n");
		
		assertValid("#define A(x,y) x ## y\n"
				+ "A(B,_type)\n",
				"B_type\n");
		
		assertValid("#define A(x,y) x ## y\n"
				+ "#define TYPE(x) A(x,_type)\n"
				+ "TYPE(B)\n",
				"B_type\n");
		
		
		
		assertValid("#define hash_hash # ## #\n"
				+ "hash_hash\n",
				"##\n");
		
		
		assertValid("#define hash_hash # ## #\n"
				+ "#define mkstr(a) # a\n"
				+ "#define in_between(a) mkstr(a)\n"
				+ "#define join(c, d) in_between(c hash_hash d)\n"
				+ "char p[] = join(x, y);\n",
				"char p[] = \"x ## y\";\n");
		
		assertValid("#define hash_hash # ## #\n"
				+ "#define mkstr(a) # a\n"
				+ "#define in_between(a) mkstr(a)\n"
				+ "#define join(c, d) in_between(c hash_hash d)\n"
				+ "char p[] = join(x,);\n",
				"char p[] = \"x ##\";\n");
		
		assertValid("#define hash_hash # ## #\n"
				+ "#define mkstr(a) # a\n"
				+ "#define in_between(a) mkstr(a)\n"
				+ "#define join(c, d) in_between(c hash_hash d)\n"
				+ "char p[] = join(,y);\n",
				"char p[] = \"## y\";\n");
		

		assertValid("#define A(...) __VA_ARGS__\n"
				+ "A(success)\n",
				"success\n");
		
		assertValid("#define A(...) #__VA_ARGS__\n"
				+ "A(success)\n",
				"\"success\"\n");
		
		assertValid("#define A(a,b,c) a ## b ## c\n"
				+ "#define B(...) A(__VA_ARGS__)\n"
				+ "B(su, cc, ess)\n",
				"success\n");
		
		assertValid("#define A(a,b,c) a ## b ## c\n"
				+ "#define B(...) A __VA_ARGS__\n"
				+ "B((su, cc, ess))\n",
				"success\n");
		
		
		assertValid("#define A(a,b,c) a ## b ## c\n"
				+ "#define C A\n"
				+ "#define B(x, ...) C(x,__VA_ARGS__)\n"
				+ "B(su, cc, ess)\n",
				"success\n");
		
		
		
		assertWarning("#define A(__VA_ARGS__)\n", "__VA_ARGS__ can only appear in the expansion of a variadic macro");
		assertWarning("#define A __VA_ARGS__\n", "__VA_ARGS__ can only appear in the expansion of a variadic macro");

		
	}

	
	
}
