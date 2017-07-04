package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestDirective extends TestingPPBase {

	public static void test() {
		testMacros();
		testConditions();
		testInclude();
		testLine();
		testError();
		testGLSLExtensions();
	}

	private static void testLine() {
		assertValid("#line 1\n");
		assertValid("#line 1 0 \n");
		assertValid("#line 1 /* commentar */\n");
		assertValid("#line 1 // commentar \n");
		assertValid("#line 1 0 \n");
		assertInvalid("#line\n");
	}

	private static void testError() {
		// #error is supposed to produce an error message
		// so we need to invert the logic here
		assertInvalid("#error my error message 0.0: \n");
		assertInvalid("#error my error\\\n message 0.0: \n");
		assertValid("// error my error\\\n message 0.0: \n");
	}

	private static void testInclude() {
		assertValid("#include <stdio.glsl>\n");
		assertValid("\t#include <stdio.glsl>\n");
		assertValid("# include <stdio.glsl>\n");
		assertValid("#include \"stdio.glsl\"\n");
		assertValid("\t#include \"stdio.glsl\"\n");
		assertValid("# include \"stdio.glsl\"\n");
		assertValid("# include <x\\\\stdio.glsl>\n");
		
	}

	private static void testGLSLExtensions() {
		
		assertValid("#version 450 core\n");
		assertValid("#version 450 es\n");
		assertValid("#version 450 compatibility\n");
		
		assertValid("#pragma optimize(on)\n");
		assertValid("#pragma optimize(off)\n");
		
		assertValid("#pragma STDGL\n");
		
		assertValid("#extension ARB_anything : enable\n");
		assertValid("#extension ARB_anything :\\\n enable\n");
		assertValid("#extension ARB_anything :\\\r\n enable\n");
		assertInvalid("#extension ARB_anything : nable\n");
		assertValid("enable ARB_anything : enable\n");
		assertValid("// enable ARB_anything : enable\n");
		assertValid("/* enable ARB_anything : enable*/\n");
	}

	private static void testMacros() {
		assertValid(" #define A\n");
		assertValid(" #define A any thing making sense here\nA");
		assertValid(" #define A\n");
		assertValid(" #define A\n");
		assertValid("# define A(x) x+x\n");
		assertValid("# define A(x,y) x+y\n");
		assertValid("#\tdefine A(x,...) x+x\n");
		assertValid("# \tdefine A(...) x+x\n");
		assertValid("# define A(x) x+x\n");
		assertValid("#define A (x)\n");
		assertValid("#define A\t(x)\n");
		assertValid("#define A\t (x)\n");
		assertValid("#define A \t(x)\n");
		assertValid("#undef A\n");
		assertValid(" # 	undef A\n");

		
		assertValid("#define A(x) x+x\n"
				+ "#define B(x) x + y\n"
				+ "B(A(c))\n"
				);
		
		
//		assertValid("#define hash_hash # ## #\n");
//		assertValid("#define mkstr(a) # a\n");
		assertValid("#define n_between(a) mkstr(a)\n");
		assertValid("#define join(c, d) in_between(c hash_hash d)\n");
		
		
		assertInvalid(" # 	undef A B\n");
	}
	
	
	

	private static void testConditions() {

		assertValid("#if 1\n"
				+ "#endif\n");
		assertValid("#if (1|0)\n"
				+ "#endif\n");
		assertValid("#if (a||b)\n"
				+ "#endif\n");
		assertValid("#if (a<b>c)\n"
				+ "#endif\n");
		assertValid("#if ( A && defined(B) )\n"
				+ "#endif\n");
		assertValid("#if defined(A)\n"
				+ "#endif\n");
		assertValid("#if A\n"
				+ "#endif\n");
		assertValid("#if A\n"
				+ "a = b +1;\n"
				+ "#endif\n");
		assertValid("#if A\n"
				+ "#else\n"
				+ "text()\n"
				+ "more_text();\n"
				+ "#endif\n");
		assertValid("#if A\n"
				+ "#elif 0\n"
				+ "text()\n"
				+ "more_text();\n"
				+ "#endif\n");
		assertValid("#if A\n"
				+ "#elif 0\n"
				+ "text()\n"
				+ "#else\n"
				+ "#endif\n");
		
		
		assertInvalid("#if A &&\n B\n#endif\n");
		assertInvalid("#if\n#endif\n");
		assertInvalid("#if 1\n#else\n");
		assertInvalid("#if 1\n#elif\n#endif\n");
		assertInvalid("#if 1\n#elif 0\n\n");
		assertInvalid("#if A\n");

	}
	

}
