package org.cakelab.glsl.test.builtin;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.lang.lexer.tokens.GLSLTokenTable;

public class TestGLSLTokenTable {
	public static void main(String[] args) {
		
		GLSLTokenTable.get(es(100));
		GLSLTokenTable.get(es(300));
		GLSLTokenTable.get(es(310));
		
		GLSLTokenTable.get(core(110));
		GLSLTokenTable.get(core(120));
		GLSLTokenTable.get(core(130));
		GLSLTokenTable.get(core(140));
		GLSLTokenTable.get(core(150));
		
		GLSLTokenTable.get(core(330));
		
		GLSLTokenTable.get(core(400));
		GLSLTokenTable.get(core(410));
		GLSLTokenTable.get(core(420));
		GLSLTokenTable.get(core(430));
		GLSLTokenTable.get(core(440));
		GLSLTokenTable.get(core(450));
		GLSLTokenTable.get(core(460));


		// profile only considered from 150 or above.
		// Thus, compatibility exists for those versions only.
		GLSLTokenTable.get(compatibility(150));
		
		GLSLTokenTable.get(compatibility(330));
		
		GLSLTokenTable.get(compatibility(400));
		GLSLTokenTable.get(compatibility(410));
		GLSLTokenTable.get(compatibility(420));
		GLSLTokenTable.get(compatibility(430));
		GLSLTokenTable.get(compatibility(440));
		GLSLTokenTable.get(compatibility(450));
		GLSLTokenTable.get(compatibility(460));
	}

	private static GLSLVersion core(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.core);
	}
	private static GLSLVersion compatibility(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.compatibility);
	}
	private static GLSLVersion es(int number) {
		return new GLSLVersion(null, number, GLSLVersion.Profile.es);
	}
}
