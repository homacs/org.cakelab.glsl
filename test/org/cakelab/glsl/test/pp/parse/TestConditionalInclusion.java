package org.cakelab.glsl.test.pp.parse;

import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.TestProvider;
import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestConditionalInclusion extends TestingPPBase implements Test {
	
	public TestConditionalInclusion(TestProvider tester) {
		super(tester);
	}

	public void test() {
		testConditionalInclusions();
	}
	
	public void testConditionalInclusions() {

		assertValid("#if 1\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");

		assertValid("#define A\n"
				+ "#ifdef A\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");

		assertValid("#define A\n"
				+ "#undef A\n"
				+ "#define A\n"
				+ "#ifdef A\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");

		assertValid("#define B\n"
				+ "#ifndef A\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");

		assertValid("#if A\n"
				+ "wrong\n"
				+ "#endif\n",
				"");

		assertError("#define A\n"
				+ "#if A\n"
				+ "success\n"
				+ "#endif\n",
				"#if with no expression");

		assertValid("#define A 1\n"
				+ "#if A\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");

		assertValid("#define A 0\n"
				+ "#if A\n"
				+ "wrong\n"
				+ "#endif\n",
				"");

		// conditional inclusion result tests
		
		assertValid("#if 0|\\\n1\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");
		
		assertValid("#if 0*1\n"
				+ "success\n"
				+ "#endif\n",
				"");
		
		assertValid("#if (a||b)\n"
				+ "#endif\n");
		
		assertValid("#if (a<b>c)\n"
				+ "#endif\n");
		
		assertValid("#if ( A && defined(B) )\n"
				+ "#endif\n");
		
		assertValid("#if defined(A)\n"
				+ "#endif\n");

		assertValid("#if !defined(A)\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");
		
		assertValid("#define A\n"
				+ "#if defined(A)\n"
				+ "success\n"
				+ "#endif\n",
				"success\n");
		
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

		
		assertValid("#if 0\n"
				+ "#if 1\n"
				+ "text()\n"
				+ "#endif\n"
				+ "#endif\n",
				"");
		
		assertValid("#if 1\n"
				+ "#if 1\n"
				+ "text()\n"
				+ "#endif\n"
				+ "#endif\n",
				"text()\n");
		
		assertValid("#if 0\n"
				+ "#else\n"
				+ "# if 1\n"
				+ "text()\n"
				+ "# endif\n"
				+ "#endif\n",
				"text()\n");
		
		assertValid("#if 0\n"
				+ "#elif 1\n"
				+ "# if 1\n"
				+ "text()\n"
				+ "# endif\n"
				+ "#endif\n",
				"text()\n");
		
		assertValid("#if 0\n"
				+ "#elif 1\n"
				+ "#else \n"
				+ "# if 1\n"
				+ "text()\n"
				+ "# endif\n"
				+ "#endif\n",
				"");
		
		assertValid("#if 0\n"
				+ "#else \n"
				+ "# if 0\n"
				+ "# else"
				+ "text()\n"
				+ "# endif\n"
				+ "#endif\n",
				"");
		
	}

	
	
}
