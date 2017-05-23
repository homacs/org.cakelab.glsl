package org.cakelab.glsl.pp;

import org.cakelab.glsl.pp.GLSLPPParser.GlslppIdentifierContext;

public class TestSimple extends TestBaseGLSLPP {

	public static void main(String[] args) {
		
		assertValid(p("xtrue").glslppIdentifier(), GlslppIdentifierContext.class);
	}

}
