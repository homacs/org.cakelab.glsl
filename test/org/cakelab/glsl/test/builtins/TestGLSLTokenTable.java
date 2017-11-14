package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.test.Test;

public class TestGLSLTokenTable extends TestBuiltinBase implements Test {
	
	
	public void test() {
		
		testTokenTable(es(100));
		testTokenTable(es(300));
		testTokenTable(es(310));
		
		testTokenTable(core(110));
		testTokenTable(core(120));
		testTokenTable(core(130));
		testTokenTable(core(140));
		testTokenTable(core(150));
		
		testTokenTable(core(330));
		
		testTokenTable(core(400));
		testTokenTable(core(410));
		testTokenTable(core(420));
		testTokenTable(core(430));
		testTokenTable(core(440));
		testTokenTable(core(450));
		testTokenTable(core(460));


		// profile only considered from 150 or above.
		// Thus, compatibility exists for those versions only.
		testTokenTable(compatibility(150));
		
		testTokenTable(compatibility(330));
		
		testTokenTable(compatibility(400));
		testTokenTable(compatibility(410));
		testTokenTable(compatibility(420));
		testTokenTable(compatibility(430));
		testTokenTable(compatibility(440));
		testTokenTable(compatibility(450));
		testTokenTable(compatibility(460));
	}


	private static void testTokenTable(GLSLVersion version) {
		COMPILER.getBuiltinServices().getTestTokenTable(version);
	}

}
