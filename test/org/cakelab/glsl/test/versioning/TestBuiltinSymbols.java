package org.cakelab.glsl.test.versioning;

import org.cakelab.glsl.lang.GLSLBuiltinSymbols;

public class TestBuiltinSymbols extends TestBuiltinBase {
	public static void main(String[] args) {
		GLSLBuiltinSymbols symbols = GLSLBuiltinSymbols.get(core(120));
		symbols.dump(System.out);
	}
	
	
	public static void test() {
		
		GLSLBuiltinSymbols.get(es(100));
		GLSLBuiltinSymbols.get(es(300));
		GLSLBuiltinSymbols.get(es(310));
		
		GLSLBuiltinSymbols.get(core(110));
		GLSLBuiltinSymbols.get(core(120));
		GLSLBuiltinSymbols.get(core(130));
		GLSLBuiltinSymbols.get(core(140));
		
		GLSLBuiltinSymbols.get(core(150));
		
		GLSLBuiltinSymbols.get(core(330));

		GLSLBuiltinSymbols.get(core(400));
		GLSLBuiltinSymbols.get(core(410));
		GLSLBuiltinSymbols.get(core(420));
		GLSLBuiltinSymbols.get(core(430));
		GLSLBuiltinSymbols.get(core(440));
		GLSLBuiltinSymbols.get(core(450));
		GLSLBuiltinSymbols.get(core(460));
		
		
		GLSLBuiltinSymbols.get(compatibility(150));
		
		GLSLBuiltinSymbols.get(compatibility(330));

		GLSLBuiltinSymbols.get(compatibility(400));
		GLSLBuiltinSymbols.get(compatibility(410));
		GLSLBuiltinSymbols.get(compatibility(420));
		GLSLBuiltinSymbols.get(compatibility(430));
		GLSLBuiltinSymbols.get(compatibility(440));
		GLSLBuiltinSymbols.get(compatibility(450));
		GLSLBuiltinSymbols.get(compatibility(460));
		
	}

}
