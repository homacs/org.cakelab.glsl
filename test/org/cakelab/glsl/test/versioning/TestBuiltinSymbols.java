package org.cakelab.glsl.test.versioning;

import java.io.FileInputStream;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.GLSLExtension;

public class TestBuiltinSymbols extends TestBuiltinBase {
	
	
	
	public static void main(String[] args) {
		testDump();
//		testExtensionProperties();
//		testExtension(core(150), ShaderType.VERTEX_SHADER, "GL_ARB_compatibility");
		
	}

	public static void testDump() {
		GLSLBuiltin symbols;
		
		int version = 420;
		
		symbols = GLSLBuiltin.get(compatibility(version), ShaderType.VERTEX_SHADER);
		symbols = GLSLBuiltin.get(compatibility(version), ShaderType.TESS_CONTROL_SHADER);
		symbols = GLSLBuiltin.get(compatibility(version), ShaderType.TESS_EVALUATION_SHADER);
		symbols = GLSLBuiltin.get(compatibility(version), ShaderType.GEOMETRY_SHADER);
		symbols = GLSLBuiltin.get(compatibility(version), ShaderType.FRAGMENT_SHADER);
		symbols.dump(System.out);
	}

	public static void testExtensionProperties() {
		try {
			String dir = "test/" + TestBuiltinSymbols.class.getPackage().getName().replace('.', '/');
			FileInputStream props = new FileInputStream(dir + "/example.extension.properties.json");
			new GLSLExtension.Properties(props);
		} catch (Exception e) {
			throw new Error(e);
		}
	}
	
	
	public static void testExtension(GLSLVersion version, ShaderType shaderType, String ... extensions) {
		GLSLBuiltin symbols = GLSLBuiltin.get(version, shaderType);
		
		WorkingSet workingSet = symbols.createWorkingSet();
		for (String extension : extensions) {
			workingSet.enableExtension(extension);
		}
		workingSet.dump(System.out);
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
