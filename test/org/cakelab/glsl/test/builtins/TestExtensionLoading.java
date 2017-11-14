package org.cakelab.glsl.test.builtins;

import java.io.FileInputStream;

import org.cakelab.glsl.GLSLCompilerFeatures;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.glsl.builtin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.MockedExtension;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.builtin.extensions.VersionDependency;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.test.Test;

public class TestExtensionLoading extends TestBuiltinBase {

	public static void main(String[] args) {
		Test.checkAssertionsOn();
		test();
	}
	
	
	public static void test() {
		testVersionDependency();
		testExtensionProperties();
		testMockedExtensions();
		testLoading();
	}
	
	private static void testMockedExtensions() {
		WorkingSet ws = testExtension(core(110), ShaderType.VERTEX_SHADER, "GL_NV_vertex_program4");

		assert (ws.getExtensions().containsExtension("GL_NV_vertex_program4"));
		assert (ws.getExtensions().getMacro("GL_NV_vertex_program4") == null);

		// using an alternative name
		ws = testExtension(core(110), ShaderType.VERTEX_SHADER, "GL_KHR_blend_equation_advanced_coherent");
		assert (ws.getExtensions().containsExtension("GL_KHR_blend_equation_advanced"));
		assert (ws.getExtensions().containsExtension("GL_KHR_blend_equation_advanced_coherent"));
	
	}


	private static void testLoading() {
		WorkingSet ws = testExtension(core(150), ShaderType.VERTEX_SHADER, "GL_ARB_sparse_texture", "GL_ARB_sparse_texture2");
		
		ws = testExtension(core(400), ShaderType.VERTEX_SHADER, "GL_ARB_gpu_shader_int64");
		
		ws = testExtension(core(150), ShaderType.VERTEX_SHADER, "GL_ARB_gpu_shader_fp64");
		
		ws = testExtension(core(150), ShaderType.GEOMETRY_SHADER, "GL_ARB_gpu_shader5");

		ws = testExtension(core(410), ShaderType.GEOMETRY_SHADER, "GL_ARB_shader_texture_image_samples");

		ws = testExtension(compatibility(150), ShaderType.TESS_CONTROL_SHADER, "GL_ARB_tessellation_shader");

		ws = testExtension(compatibility(420), ShaderType.FRAGMENT_SHADER, "GL_ARB_derivative_control");

		ws = testExtension(compatibility(420), ShaderType.GENERIC_SHADER, "GL_ARB_shader_atomic_counter_ops");

		ws = testExtension(compatibility(420), ShaderType.GENERIC_SHADER, "GL_ARB_shader_image_size");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_image_load_store");

		ws = testExtension(core(130), ShaderType.FRAGMENT_SHADER, "GL_ARB_sample_shading");

		ws = testExtension(core(400), ShaderType.FRAGMENT_SHADER, "GL_ARB_texture_query_levels");
		
		ws = testExtension(core(150), ShaderType.FRAGMENT_SHADER, "GL_ARB_texture_gather");

		ws = testExtension(core(150), ShaderType.GENERIC_SHADER, "GL_ARB_gpu_shader_int64", "GL_ARB_shader_clock");

		ws = testExtension(core(110), ShaderType.FRAGMENT_SHADER, "GL_ARB_shader_stencil_export");

		ws = testExtension(core(110), ShaderType.FRAGMENT_SHADER, "GL_ARB_texture_rectangle");
		
		ws = testExtension(core(130), ShaderType.FRAGMENT_SHADER, "GL_ARB_gpu_shader_int64", "GL_ARB_shader_ballot");

		ws = testExtension(core(130), ShaderType.FRAGMENT_SHADER, "GL_ARB_fragment_layer_viewport");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_group_vote");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_draw_parameters");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_atomic_counters");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shading_language_include");

		ws = testExtension(core(410), ShaderType.VERTEX_SHADER, "GL_ARB_shader_viewport_layer_array");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_texture_cube_map_array");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_storage_buffer_object");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shading_language_packing");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_subroutine");

		ws = testExtension(core(400), ShaderType.GENERIC_SHADER, "GL_ARB_shader_texture_lod");

		ws = testExtension(core(430), ShaderType.COMPUTE_SHADER, "GL_ARB_compute_variable_group_size");

		ws = testExtension(core(420), ShaderType.COMPUTE_SHADER, "GL_ARB_compute_shader");

		ws = testExtension(core(130), ShaderType.GENERIC_SHADER, "GL_ARB_shader_bit_encoding");

		ws = testExtension(core(130), ShaderType.FRAGMENT_SHADER, "GL_ARB_texture_query_lod");

		ws = testExtension(core(150), ShaderType.GEOMETRY_SHADER, "GL_ARB_viewport_array");

		ws = testExtension(core(110), ShaderType.GEOMETRY_SHADER, "GL_ARB_geometry_shader4", "GL_ARB_viewport_array");

		ws = testExtension(core(110), ShaderType.GEOMETRY_SHADER, "GL_ARB_fragment_shader_interlock");

		ws = testExtension(compatibility(150), ShaderType.VERTEX_SHADER, "GL_ARB_cull_distance");

		ws = testExtension(core(130), ShaderType.FRAGMENT_SHADER, "GL_ARB_texture_multisample");
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
			assertValid(p, compatibility(110), "EXT_dep1", "EXT_dep2_opt1");
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
		
		WorkingSet ws = COMPILER.getBuiltinServices().createWorkingSet(builtin);
		
		GLSLExtensionSet extensions = ws.getExtensions();
		for (String name : names) {
			extensions.addExtension(new MockedExtension(name, ws.getShaderType(), ws.getGLSLVersion()));
		}
		return ws;
	}


	public static WorkingSet testExtension(GLSLVersion version, ShaderType shaderType, String ... extensions) {
		GLSLBuiltinServices services = COMPILER.getBuiltinServices();
		GLSLBuiltin builtin = services.getBuiltins(version, shaderType);
		WorkingSet workingSet = services.createWorkingSet(builtin);
		GLSLCompilerFeatures features = COMPILER.getFeatures();
		PPState state = new PPState(COMPILER, features, null, shaderType);
		for (String extension : extensions) {
			workingSet.enableExtension(state, extension);
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
