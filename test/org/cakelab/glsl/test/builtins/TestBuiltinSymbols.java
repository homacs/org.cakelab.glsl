package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.test.Test;

public class TestBuiltinSymbols extends TestBuiltinBase {
	
	
	
	public static void main(String[] args) {
		Test.checkAssertionsOn();
		testDump();
		
		
	}

	public static void testDump() {
		GLSLBuiltin symbols;
		
		GLSLVersion version = core(420);
		
		
		
		symbols = GLSLBuiltin.getBuiltins(version, ShaderType.VERTEX_SHADER);
		symbols = GLSLBuiltin.getBuiltins(version, ShaderType.TESS_CONTROL_SHADER);
		symbols = GLSLBuiltin.getBuiltins(version, ShaderType.TESS_EVALUATION_SHADER);
		symbols = GLSLBuiltin.getBuiltins(version, ShaderType.GEOMETRY_SHADER);
		symbols = GLSLBuiltin.getBuiltins(version, ShaderType.FRAGMENT_SHADER);
		symbols = GLSLBuiltin.getBuiltins(version, ShaderType.COMPUTE_SHADER);
		symbols.dump(System.out);
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


	private static void test(GLSLVersion version) {
		
		System.out.print("\t" + version.toString() + " ... ");

		boolean hasGeometry    = false;
		boolean hasTesselation = false;
		
		switch (version.profile) {
		case compatibility:
		case core:
			hasTesselation = version.number >= 400;
			hasGeometry = version.number >= 150;
			break;
		case es:
			hasTesselation = version.number >= 320;
			hasGeometry = version.number >= 320;
			break;
		default:
			break;
		}

		System.out.print("generic ");
		GLSLBuiltin.getBuiltins(version, ShaderType.GENERIC_SHADER);
		System.out.print("compute ");
		GLSLBuiltin.getBuiltins(version, ShaderType.COMPUTE_SHADER);
		System.out.print("vertex ");
		GLSLBuiltin.getBuiltins(version, ShaderType.VERTEX_SHADER);
		
		if (hasTesselation) {
			System.out.print("tess_ctrl ");
			GLSLBuiltin.getBuiltins(version, ShaderType.TESS_CONTROL_SHADER);
			System.out.print("tess_eval ");
			GLSLBuiltin.getBuiltins(version, ShaderType.TESS_EVALUATION_SHADER);
		}

		if (hasGeometry) {
			System.out.print("geometry ");
			GLSLBuiltin.getBuiltins(version, ShaderType.GEOMETRY_SHADER);
		}
		System.out.println("fragment");
		GLSLBuiltin.getBuiltins(version, ShaderType.FRAGMENT_SHADER);
	}
}
