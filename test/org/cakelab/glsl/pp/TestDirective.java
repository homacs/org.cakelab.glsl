package org.cakelab.glsl.pp;


public class TestDirective extends TestBaseGLSLPP {

	public static void test() {
		testGLSLExtensions();
		testMacros();
	}

	private static void testGLSLExtensions() {
		
		assertValid(p("#version 450 core\n").glslppPreprocessingFile());
		assertValid(p("#version 450 es\n").glslppPreprocessingFile());
		assertValid(p("#version 450 compatibility\n").glslppPreprocessingFile());
		
		assertValid(p("#pragma optimize(on)\n").glslppPreprocessingFile());
		assertValid(p("#pragma optimize(off)\n").glslppPreprocessingFile());
		
		assertValid(p("#pragma STDGL\n").glslppPreprocessingFile());
		
		assertValid(p("#extension ARB_irgendwas : enable\n").glslppPreprocessingFile());
		assertValid(p("#extension ARB_irgendwas :\\\n enable\n").glslppPreprocessingFile());
		assertValid(p("#extension ARB_irgendwas :\\\r\n enable\n").glslppPreprocessingFile());
		assertInvalid(p("#extension ARB_irgendwas : nable\n").glslppPreprocessingFile());
		assertValid(p("enable ARB_irgendwas : nable\n").glslppPreprocessingFile());
		assertValid(p("// enable ARB_irgendwas : nable\n").glslppPreprocessingFile());
		assertValid(p("/* enable ARB_irgendwas : nable\n").glslppPreprocessingFile());
	}

	private static void testMacros() {
		assertValid(p(" #define A\n").glslppPreprocessingFile());
		assertValid(p("# define A(x) x+x\n").glslppControlLine());
		assertValid(p("#define A (x)\n").glslppControlLine());
	}

	
	

}
