package org.cakelab.glsl.test.builtin;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.lang.GLSLBuiltinSymbols;

public class TestBuiltinSymbols {

	public static void main(String[] args) {
		GLSLVersion version = new GLSLVersion(null, 110, null);
		
		GLSLBuiltinSymbols symbols = GLSLBuiltinSymbols.get(version);
		
		symbols.dump(System.out);
		
	}

}
