package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.builtin.GLSLBuiltin;

public class TestBuiltinBase {
	
	protected static final GLSLCompiler COMPILER = null;
	
	
	protected static GLSLVersion core(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.core);
	}
	protected static GLSLVersion compatibility(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.compatibility);
	}
	protected static GLSLVersion es(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.es);
	}

	public static GLSLBuiltin getTestBuiltinSymbols(GLSLVersion version) {
		return COMPILER.getBuiltinServices().getTestBuiltins(version);
	}

}
