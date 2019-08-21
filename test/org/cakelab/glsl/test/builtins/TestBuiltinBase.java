package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.test.TestProvider;

public class TestBuiltinBase {
	
	protected final GLSLCompiler compiler;
	
	public TestBuiltinBase(TestProvider tester) {
		this.compiler = tester.getCompiler();
	}
	
	
	
	protected static GLSLVersion core(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.core);
	}
	protected static GLSLVersion compatibility(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.compatibility);
	}
	protected static GLSLVersion es(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.es);
	}

	public GLSLBuiltin getTestBuiltinSymbols(GLSLVersion version) {
		return compiler.getBuiltinServices().getTestBuiltins(version);
	}

}
