package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.pp.GLSLPPParser.GlslppMacroContext;
import org.cakelab.glsl.pp.GLSLPPParser;
import org.cakelab.glsl.pp.GLSLPPParser.GlslppMacroArgumentsContext;

public class TestDirective extends TestBaseGLSLPP {

	public static void test() {
		testMacros();
		testConditions();
		testInclude();
		testLine();
		testError();
		testGLSLExtensions();
	}

	private static void testLine() {
		assertValid(p("#line 1\n").glslppPreprocessingFile());
		assertValid(p("#line 1 0 \n").glslppPreprocessingFile());
		assertInvalid(p("#line\n").glslppPreprocessingFile());
	}

	private static void testError() {
		assertValid(p("#error my error message 0.0: \n").glslppPreprocessingFile());
		assertValid(p("#error my error\\\n message 0.0: \n").glslppPreprocessingFile());
	}

	private static void testInclude() {
		assertValid(p("#include <stdio.glsl>\n").glslppPreprocessingFile());
		assertValid(p("\t#include <stdio.glsl>\n").glslppPreprocessingFile());
		assertValid(p("# include <stdio.glsl>\n").glslppPreprocessingFile());
		assertValid(p("#include \"stdio.glsl\"\n").glslppPreprocessingFile());
		assertValid(p("\t#include \"stdio.glsl\"\n").glslppPreprocessingFile());
		assertValid(p("# include \"stdio.glsl\"\n").glslppPreprocessingFile());
		assertInvalid(p("# include <x\\stdio.glsl>\n").glslppPreprocessingFile());
		assertValid(p("# include <x\\\\stdio.glsl>\n").glslppPreprocessingFile());
		
	}

	private static void testGLSLExtensions() {
		
		assertValid(p("#version 450 core\n").glslppPreprocessingFile());
		assertValid(p("#version 450 es\n").glslppPreprocessingFile());
		assertValid(p("#version 450 compatibility\n").glslppPreprocessingFile());
		
		assertValid(p("#pragma optimize(on)\n").glslppPreprocessingFile());
		assertValid(p("#pragma optimize(off)\n").glslppPreprocessingFile());
		
		assertValid(p("#pragma STDGL\n").glslppPreprocessingFile());
		
		assertValid(p("#extension ARB_anything : enable\n").glslppPreprocessingFile());
		assertValid(p("#extension ARB_anything :\\\n enable\n").glslppPreprocessingFile());
		assertValid(p("#extension ARB_anything :\\\r\n enable\n").glslppPreprocessingFile());
		assertInvalid(p("#extension ARB_anything : nable\n").glslppPreprocessingFile());
		assertValid(p("enable ARB_anything : nable\n").glslppPreprocessingFile());
		assertValid(p("// enable ARB_anything : nable\n").glslppPreprocessingFile());
		assertValid(p("/* enable ARB_anything : nable\n").glslppPreprocessingFile());
	}

	private static void testMacros() {
		assertValid(p(" #define A\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p(" #define A any thing making sense here\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p(" #define A\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p(" #define A\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p("# define A(x) x+x\n").glslppControlLine(), GlslppMacroArgumentsContext.class);
		assertValid(p("# define A(x,y) x+y\n").glslppControlLine(), GlslppMacroArgumentsContext.class);
		assertValid(p("#\tdefine A(x,...) x+x\n").glslppControlLine(), GlslppMacroArgumentsContext.class);
		assertValid(p("# \tdefine A(...) x+x\n").glslppControlLine(), GlslppMacroArgumentsContext.class);
		assertValid(p("# define A(x) x+x\n").glslppControlLine(), GlslppMacroArgumentsContext.class);
		assertValid(p("#define A (x)\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p("#define A\t(x)\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p("#define A\t (x)\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p("#define A \t(x)\n").glslppControlLine(), GlslppMacroContext.class);
		assertValid(p("#undef A\n").glslppControlLine());
		assertValid(p(" # 	undef A\n").glslppControlLine());
		
		
		assertValid("#define hash_hash # ## #\n");
		assertValid("#define mkstr(a) # a\n");
		assertValid("#define n_between(a) mkstr(a)\n");
		assertValid("#define join(c, d) in_between(c hash_hash d)\n");
		
		
		assertInvalid(p(" # 	undef A B\n").glslppControlLine());
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
		
		
		assertInvalid(p("#if A &&\n B\n#endif\n").glslppPreprocessingFile());
		assertInvalid(p("#if\n#endif\n").glslppPreprocessingFile());
		assertInvalid(p("#if 1\n#else\n").glslppPreprocessingFile());
		assertInvalid(p("#if 1\n#elif\n#endif\n").glslppPreprocessingFile());
		assertInvalid(p("#if 1\n#elif 0\n\n").glslppPreprocessingFile());
		assertInvalid(p("#if A\n").glslppPreprocessingFile());
	}
	

}
