package org.cakelab.glsl.test.versioning;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.lang.GLSLBuiltinSymbols;
import org.cakelab.glsl.lang.lexer.tokens.GLSLTokenTable;

public class TestBuiltinBase {
	protected static GLSLVersion core(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.core);
	}
	protected static GLSLVersion compatibility(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.compatibility);
	}
	protected static GLSLVersion es(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.es);
	}
	public static GLSLBuiltinSymbols getTestBuiltinSymbols(GLSLTokenTable tokens) {
		return GLSLBuiltinSymbols.getTestSymbolTable(tokens);
	}

}
