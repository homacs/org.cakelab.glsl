package org.cakelab.glsl.test.versioning;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.GLSLBuiltin;
import org.cakelab.glsl.lang.GLSLExtension;
import org.cakelab.glsl.lang.GLSLBuiltin.ShaderType;

public class TestBuiltinSymbols extends TestBuiltinBase {
	public static void main(String[] args) {
		GLSLBuiltin symbols = GLSLBuiltin.get(core(140), ShaderType.VERTEX_SHADER);
		// symbols.dump(System.out);
		
		GLSLExtension extenion = GLSLExtension.get("ARB_compatibility", symbols.getVersion(), symbols.getShaderType());
		extenion.dump(System.out, "");
		throw new Error("add extension set to symbol table for example");
	}
	
	
	public static void test() {
		
		test(es(100));
		test(es(300));
		test(es(310));
		
		test(core(110));
		test(core(120));
		test(core(130));
		test(core(140));
		
		test(core(150));
		
		test(core(330));

		test(core(400));
		test(core(410));
		test(core(420));
		test(core(430));
		test(core(440));
		test(core(450));
		test(core(460));
		
		
		test(compatibility(150));
		
		test(compatibility(330));

		test(compatibility(400));
		test(compatibility(410));
		test(compatibility(420));
		test(compatibility(430));
		test(compatibility(440));
		test(compatibility(450));
		test(compatibility(460));
		
	}


	private static void test(GLSLVersion es) {
		for (ShaderType t : ShaderType.values()) {
			GLSLBuiltin.get(es, t);
		}
	}
}
