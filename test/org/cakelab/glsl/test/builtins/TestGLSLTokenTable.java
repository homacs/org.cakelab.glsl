package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.builtin.GLSLTokenTable;

public class TestGLSLTokenTable extends TestBuiltinBase {
	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		
		GLSLTokenTable.getTestTokenTable(es(100));
		GLSLTokenTable.getTestTokenTable(es(300));
		GLSLTokenTable.getTestTokenTable(es(310));
		
		GLSLTokenTable.getTestTokenTable(core(110));
		GLSLTokenTable.getTestTokenTable(core(120));
		GLSLTokenTable.getTestTokenTable(core(130));
		GLSLTokenTable.getTestTokenTable(core(140));
		GLSLTokenTable.getTestTokenTable(core(150));
		
		GLSLTokenTable.getTestTokenTable(core(330));
		
		GLSLTokenTable.getTestTokenTable(core(400));
		GLSLTokenTable.getTestTokenTable(core(410));
		GLSLTokenTable.getTestTokenTable(core(420));
		GLSLTokenTable.getTestTokenTable(core(430));
		GLSLTokenTable.getTestTokenTable(core(440));
		GLSLTokenTable.getTestTokenTable(core(450));
		GLSLTokenTable.getTestTokenTable(core(460));


		// profile only considered from 150 or above.
		// Thus, compatibility exists for those versions only.
		GLSLTokenTable.getTestTokenTable(compatibility(150));
		
		GLSLTokenTable.getTestTokenTable(compatibility(330));
		
		GLSLTokenTable.getTestTokenTable(compatibility(400));
		GLSLTokenTable.getTestTokenTable(compatibility(410));
		GLSLTokenTable.getTestTokenTable(compatibility(420));
		GLSLTokenTable.getTestTokenTable(compatibility(430));
		GLSLTokenTable.getTestTokenTable(compatibility(440));
		GLSLTokenTable.getTestTokenTable(compatibility(450));
		GLSLTokenTable.getTestTokenTable(compatibility(460));
	}

}
