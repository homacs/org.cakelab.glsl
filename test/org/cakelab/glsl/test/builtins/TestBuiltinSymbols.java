package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.TestProvider;

public class TestBuiltinSymbols extends TestBuiltinBase implements Test {
	
	public TestBuiltinSymbols(TestProvider tester) {
		super(tester);
	}

	public void test() {
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

	public void testDump() {
		
		GLSLBuiltinServices builtinServices = compiler.getBuiltinServices();
		
		GLSLBuiltin symbols;
		
		GLSLVersion version = core(420);
		
		
		
		symbols = builtinServices.getBuiltins(version, ShaderType.VERTEX_SHADER);
		symbols = builtinServices.getBuiltins(version, ShaderType.TESS_CONTROL_SHADER);
		symbols = builtinServices.getBuiltins(version, ShaderType.TESS_EVALUATION_SHADER);
		symbols = builtinServices.getBuiltins(version, ShaderType.GEOMETRY_SHADER);
		symbols = builtinServices.getBuiltins(version, ShaderType.FRAGMENT_SHADER);
		symbols = builtinServices.getBuiltins(version, ShaderType.COMPUTE_SHADER);
		symbols.dump(System.out);
	}


	public void test(GLSLVersion version) {
		
		GLSLBuiltinServices builtinServices = compiler.getBuiltinServices();
		
		
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
		builtinServices.getBuiltins(version, ShaderType.GENERIC_SHADER);
		System.out.print("compute ");
		builtinServices.getBuiltins(version, ShaderType.COMPUTE_SHADER);
		System.out.print("vertex ");
		builtinServices.getBuiltins(version, ShaderType.VERTEX_SHADER);
		
		if (hasTesselation) {
			System.out.print("tess_ctrl ");
			builtinServices.getBuiltins(version, ShaderType.TESS_CONTROL_SHADER);
			System.out.print("tess_eval ");
			builtinServices.getBuiltins(version, ShaderType.TESS_EVALUATION_SHADER);
		}

		if (hasGeometry) {
			System.out.print("geometry ");
			builtinServices.getBuiltins(version, ShaderType.GEOMETRY_SHADER);
		}
		System.out.println("fragment");
		builtinServices.getBuiltins(version, ShaderType.FRAGMENT_SHADER);
	}
}
