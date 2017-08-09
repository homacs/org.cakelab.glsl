package org.cakelab.glsl.test.pp.parse;

import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestMacros extends TestingPPBase {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		TestMacros tester = new TestMacros();
		tester.testObjectMacros();
		tester.testFunctionMacros();
		tester.testStringify();
		tester.testConcatenation();
		tester.testDefUndef();
		tester.testVariadicMacros();
	}
	
	
	public void testObjectMacros() {
		assertValid("#define A", "");
		assertValid("#define A x\n"
				+ "A\n", 
				"x\n");
		
		assertValid("#define A x\n"
				+ " A\n", 
				" x\n");
		
		assertValid("#define A x\n"
				+ "A \n", 
				"x \n");
		
		assertValid("#define \tA x\n"
				+ "A\n", 
				"x\n");
		
		assertValid("#define \\\n"
				+ "A x\n"
				+ "A\n", 
				"x\n");
		
		assertValid("#define A \\\n"
				+ " x\n"
				+ "A\n", 
				"x\n");
		
		assertValid("#define A x\n"
				+ "#define B A \n"
				+ "B\n", 
				"x\n");
		
		assertValid("#define A x\n"
				+ "#define B A \n"
				+ "#define C B \n"
				+ "C\n", 
				"x\n");

		assertValid("#define A A\n"
				+ "A\n", 
				"A\n");
		
		assertValid("#define A x B\n"
				+ "#define B A \n"
				+ "#define C B \n"
				+ "C\n", 
				"x B\n");
	}

	
	public void testFunctionMacros() {
		
		assertValid("#define A() x\n"
				+ "A()\n", 
				"x\n");
		// between macro name and parameter list can be CRLF and any WHITESPACE
		assertValid("#define A() x\n"
				+ "A \n /* comment */()\n", 
				"x\n");
		
		// identifiers matching function macros but lacking a parameter list
		// are regular pp-tokens.
		assertValid("#define A() x\n"
				+ "A\n",
				"A\n");
		
		
		assertError("#define A(x,y) x\n"
				+ "A()\n",
				"macro \"A\" requires 2 arguments, but only 0 where given.");
		
		assertValid("#define A(x) x\n"
				+ "A(d)\n", 
				"d\n");
		
		assertValid("#define A(x) x\n"
				+ "#define B() y\n"
				+ "A(B())\n", 
				"y\n");
		
		assertValid("#define A(x) x\n"
				+ "#define B y\n"
				+ "A(B)\n", 
				"y\n");

		assertValid("#define A(x) x\n"
				+ "#define B() A(y)\n"
				+ "B()\n", 
				"y\n");
		
		assertValid("#define A(x) x\n"
				+ "#define B() A(y)\n"
				+ "B()\n", 
				"y\n");
		
		assertValid("#define A(x) x\n"
				+ "#define B(y) A(y)\n"
				+ "#define C() r\n"
				+ "B(C())\n", 
				"r\n");
		
		assertValid("#define A(x) A(x)\n"
				+ "A(z)\n", 
				"A(z)\n");
		
		assertValid("#define A(x) B(x)\n"
				+ "#define B(y) y + 1\n"
				+ "A(z)", 
				"z + 1");
		
		assertValid("#define A(x) B(x)\n"
				+ "#define B(y) A(y) + 1\n"
				+ "A(z)", 
				"A(z) + 1");
		
		assertValid("#define A(x) B(x)\n"
				+ "#define B(y) A(y) + 1\n"
				+ "A(z)", 
				"A(z) + 1");

		//
		// empty arguments
		//
		
		assertValid("#define A(x) x\n"
				+ "A()", 
				"");

		assertValid("#define A(x,y) x\n"
				+ "A(,)", 
				"");

		assertValid("#define A(x,y) x\n"
				+ "A(a,)", 
				"a");

		assertValid("#define A(x,y) x y\n"
				+ "A(,a)", 
				"a");

		
		
		
		
		
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
		
		// is not supposed to work, since parameter expansion occurs after parameter parsing
		assertInvalid("#define M(x,y) x+y\n"
				+ "#define A 1,0\n"
				+ "#define B M(A)\n"
				+ "B\n");
		

	}
	
	
	public void testStringify() {
		
		assertValid("#define A(x) #x\n"
				+ "A(d)\n", 
				"\"d\"\n");
		
		assertValid("#define A(x) #x\n"
				+ "#define B b\n"
				+ "A(B)\n", 
				"\"B\"\n");
		
		assertValid("#define A(x) #x\n"
				+ "A(\"B\")\n", 
				"\"\\\"B\\\"\"\n");
		
		assertValid("#define A(x) #x\n"
				+ "A(a  b)\n", 
				"\"a b\"\n");
		
		assertValid("#define A(x) #x\n"
				+ "A(a \n b)\n", 
				"\"a b\"\n");
		
		assertValid("#define A(x) #x\n"
				+ "A(\"a  b\")\n", 
				"\"\\\"a  b\\\"\"\n");
		
		assertError("#define A() #\n","# is not followed by a macro parameter");
		
		assertValid("#define A #\n"
				+ "A\n", 
				  "#\n");
		
		
		assertValid("#define A(x) #x\n"
				+ "A()", 
				"\"\"");


		
		
	}
	
	private void testConcatenation() {
		assertValid("#define A(x,y) x ## y\n"
				+ "A( succ , ess )\n", 
				"success\n");
		
		assertValid("#define A(x,y,z) x ## y ## z\n"
				+ "A( su , cc , ess )\n", 
				"success\n");
		
		assertValid("#define A(x,y,z) x ## y ## z\n"
				+ "#define B(s) s\n"
				+ "A( su , cc , B(ess) )\n", 
				"succB(ess)\n");

		assertValid("#define A(x,y,z) x ## y ## z\n"
				+ "#define B(x,y,z) A(x,y,z)\n"
				+ "#define C(s) s\n"
				+ "B( C(su) , C(cc) , C( ess ) )\n", 
				"success\n");

		assertValid("#define A(x,y,z) x ## y ## z z\n"
				+ "#define B(s) s\n"
				+ "A( su /* comment */ , cc , B(ess) )\n", 
				"succB(ess) ess\n");
		
		assertValid("#define hash_hash # ## #\n"
				+ "hash_hash\n",
				"##\n");

		assertValid("#define A(x,y) # x ## # y\n"
				+ "A(a,b)\n",
				"\"a\"\"b\"\n");
		
		assertValid("#define A(x,y) x ## y\n"
				+ "A(a,)\n",
				"a\n");
		
		assertValid("#define A(x,y) x ## y\n"
				+ "A(,a)\n",
				"a\n");
		
		
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
		

		
		assertError("#define A ##\n", "'##' cannot appear at either end of a macro expansion");
	}


	public void testDefUndef() {
		
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
		
		
		
		
		
		// it is legal (but discouraged) to redefine a macro
		assertWarning("#define A b\n"
				+ "#define A c\n", 
				"\"A\" redefined");
		
		// even this is discouraged
		assertWarning("#define A b\n"
				+ "#define A() b\n", 
				"\"A\" redefined");

		ignoreWarning = false;
		
		// but this is allowed (both params and replacement list items are equal)
		assertValid("#define A a\n"
				+ "#define A a\n");
		assertValid("#define A(a) # a ## b \"hallo\" \\\n\n"
				+ "#define A(a) # a ## b \"hallo\" \\\n\n");
		
		ignoreWarning = true;
		
	}
	
	
	public void testVariadicMacros() {

		assertError("#define A(...,x)\n", "0:1:14: missing ')'");
		
		assertValid("#define A(...) __VA_ARGS__\n"
				+ "A(success)\n",
				"success\n");
		
		assertValid("#define A(...) #__VA_ARGS__\n"
				+ "A(succ,ess)\n",
				"\"succ,ess\"\n");
		
		assertValid("#define A(x,...) x ## __VA_ARGS__\n"
				+ "A(s,ucc,ess)\n",
				"succ,ess\n");
		
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
