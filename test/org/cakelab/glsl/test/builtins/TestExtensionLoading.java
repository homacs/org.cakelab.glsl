package org.cakelab.glsl.test.builtins;

import java.io.FileInputStream;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.glsl.builtin.extensions.MockedExtension;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.builtin.extensions.VersionDependency;

public class TestExtensionLoading extends TestBuiltinBase {

	public static void main(String[] args) {
		boolean on = false;
		assert on = true;
		if (!on) throw new AssertionError("requires assertions to be on");
		test();
	}
	
	
	public static void test() {
		testMockedExtensions();
		testVersionDependency();
		testExtensionProperties();
		testExtensions();
	}
	
	private static void testMockedExtensions() {
		WorkingSet ws = testExtension(core(110), ShaderType.VERTEX_SHADER, "GL_NV_vertex_program4");

		assert (ws.getExtensions().containsExtension("GL_NV_vertex_program4"));
		assert (ws.getExtensions().getMacro("GL_NV_vertex_program4") != null);

		// using an alternative name
		ws = testExtension(core(110), ShaderType.VERTEX_SHADER, "GL_KHR_blend_equation_advanced_coherent");
		assert (ws.getExtensions().containsExtension("GL_KHR_blend_equation_advanced"));
		assert (ws.getExtensions().containsExtension("GL_KHR_blend_equation_advanced_coherent"));

	
	}


	private static void testExtensions() {
		WorkingSet ws = testExtension(core(400), ShaderType.VERTEX_SHADER, "GL_ARB_sparse_texture", "GL_ARB_sparse_texture2");
		
		ws = testExtension(core(400), ShaderType.VERTEX_SHADER, "GL_ARB_gpu_shader_int64");
		
		ws = testExtension(core(150), ShaderType.VERTEX_SHADER, "GL_ARB_gpu_shader_fp64");
		
		ws = testExtension(core(150), ShaderType.GEOMETRY_SHADER, "GL_ARB_gpu_shader5");
		ws.dump(System.out);

		// GL_ARB_sparse_texture_clamp
		ws = testExtension(core(400), ShaderType.VERTEX_SHADER, "GL_ARB_sparse_texture", "GL_ARB_sparse_texture2", "GL_ARB_sparse_texture_clamp");
		
		
		testExtension(core(110), ShaderType.VERTEX_SHADER, "GL_EXT_gpu_shader4", "GL_NV_vertex_program4", "GL_ARB_draw_instanced");
		testExtension(core(140), ShaderType.VERTEX_SHADER, "GL_ARB_draw_instanced");
		
		testExtension(core(140), ShaderType.VERTEX_SHADER, "GL_ARB_compatibility");
	}


	public static void testVersionDependency() {
		VersionDependency dependency = VersionDependency.parse(" 100 ");
		assertValid(dependency, 100);
		assertInvalid(dependency, 101,99);
		
		dependency = VersionDependency.parse(" 100 , 110 ");
		assertValid(dependency, 100, 110);
		assertInvalid(dependency, 99, 101, 109, 111);
		
		dependency = VersionDependency.parse(" [ 100 , 110 ] ");
		assertValid(dependency, 100, 101, 109, 110);
		assertInvalid(dependency, 99, 111);
		
		dependency = VersionDependency.parse(" [ 100 , 110 ] ");
		assertValid(dependency, 100, 101, 109, 110);
		assertInvalid(dependency, 99, 111);

		dependency = VersionDependency.parse(" 100 , [ 110 , 120 ] ");
		assertValid(dependency, 100, 110, 115, 120);
		assertInvalid(dependency, 99, 101, 109, 121);

		
		
		assertInvalidVersionString(null);
		assertInvalidVersionString("");
		assertInvalidVersionString(":");
		assertInvalidVersionString("[");
		assertInvalidVersionString("[100,");
		assertInvalidVersionString(",");
		assertInvalidVersionString("100,");
		assertInvalidVersionString("100,110,");
		
	}
	public static void testExtensionProperties() {
		try {
			String dir = "test/" + TestBuiltinSymbols.class.getPackage().getName().replace('.', '/');
			FileInputStream props = new FileInputStream(dir + "/example.extension.properties.json");
			Properties p = new Properties(props);
			
			assert p.getName().equals("EXT_example");
			assert p.getAlternativeNames() != null && p.getAlternativeNames()[0].equals("NV_EXT_example");
			
			assertValid(p, core(110), "EXT_dep1", "EXT_dep2_opt1");
			assertValid(p, core(110), "EXT_dep1", "EXT_dep2_opt2_opt1");
			assertValid(p, core(110), "EXT_dep1", "EXT_dep2_opt2_opt2");
			assertValid(p, core(110), "EXT_dep1", "EXT_dep2_opt3_dep1", "EXT_dep2_opt3_dep2", "EXT_dep2_opt3_dep3_opt1");
			assertValid(p, core(110), "EXT_dep1", "EXT_dep2_opt3_dep1", "EXT_dep2_opt3_dep2", "EXT_dep2_opt3_dep3_opt2");
			
			assertInvalid(p, es(100), "EXT_dep1", "EXT_dep2_opt1");
			assertInvalid(p, core(110), "EXT_dep1");
			assertInvalid(p, core(410), "EXT_dep1", "EXT_dep2_opt1");
			
		} catch (Exception e) {
			throw new Error(e);
		}
	}
	
	
	private static void assertValid(Properties p, GLSLVersion version, String ... enabled) {
		WorkingSet ws = createFakeWorkingSet(version, enabled);
		assert p.checkRequirements(ws.getGLSLVersion(), ws.getBuiltinScope());
	}

	private static void assertInvalid(Properties p, GLSLVersion version, String ... enabled) {
		WorkingSet ws = createFakeWorkingSet(version, enabled);
		try {
			assert !p.checkRequirements(ws.getGLSLVersion(), ws.getBuiltinScope());
			assert false : "expected IllegalArgumentException";
		} catch (IllegalArgumentException e) {
			// expected exception caught
		}
	}


	private static WorkingSet createFakeWorkingSet(GLSLVersion version, String ... names) {
		GLSLBuiltin builtin = getTestBuiltinSymbols(version);
		WorkingSet ws = builtin.createWorkingSet();
		GLSLExtensionSet extensions = ws.getExtensions();
		for (String name : names) {
			extensions.enable(new MockedExtension(name, ShaderType.GENERIC_SHADER, ws.getGLSLVersion()));
		}
		return ws;
	}


	public static WorkingSet testExtension(GLSLVersion version, ShaderType shaderType, String ... extensions) {
		GLSLBuiltin builtin = GLSLBuiltin.get(version, shaderType);
		
		WorkingSet workingSet = builtin.createWorkingSet();
		for (String extension : extensions) {
			workingSet.enableExtension(extension);
		}
		return workingSet;
	}
	
	
	
	
	private static void assertInvalidVersionString(String string) {
		try {
			VersionDependency.parse(string);
			assert false : "expected IllegalArgumentException";
		} catch (IllegalArgumentException e) {
		}
	}


	private static void assertValid(VersionDependency d, int ... versions) {
		for (int v : versions) {
			assert (d.check(v));
		}
	}

	private static void assertInvalid(VersionDependency d, int ... versions) {
		for (int v : versions) {
			assert (!d.check(v));
		}
	}



}
