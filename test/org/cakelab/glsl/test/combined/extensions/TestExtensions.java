package org.cakelab.glsl.test.combined.extensions;

import java.io.IOException;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.impl.JarResourceManager;
import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.combined.TestingGLSLBase;

public class TestExtensions extends TestingGLSLBase {
	static {
		// register a resource manager to resolve paths relative to this package
		RESOURCES.register(new JarResourceManager(TestExtensions.class.getPackage()));
	}
	
	public static void main(String[] args) {
		Test.checkAssertionsOn();
		test();
	}
	
	
	public static void test() {
		_GLSL.enableInclude(false);
		testGL_ARB_gpu_shader_fp64();
		testGL_ARB_shader_texture_image_samples();
		testGL_ARB_tessellation_shader();
		testGL_ARB_derivative_control();
		testGL_ARB_shader_atomic_counter_ops();
		testGL_ARB_shader_image_size();
		testGL_ARB_shader_image_load_store();
		testGL_ARB_sample_shading();
		testGL_ARB_texture_query_levels();
		test_files();
		_GLSL.enableInclude(true);
	}


	private static void test_files() {
		assertValid(resource("GL_ARB_shader_group_vote/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_shader_draw_parameters/test_01.vert.glsl"));
		assertValid(resource("GL_ARB_shader_atomic_counters/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_shading_language_include/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_shader_viewport_layer_array/test_01.vert.glsl"));
		assertValid(resource("GL_ARB_texture_cube_map_array/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_shader_storage_buffer_object/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_shading_language_packing/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_shader_subroutine/test_01.vert.glsl"));
		assertInvalid("#extension GL_ARB_gl_spirv : enable\n"
				+ "void main() {\n"
				+ "}", ShaderType.GENERIC_SHADER, "Configure SPIR-V frontend instead.");
		assertValid(resource("GL_ARB_shader_texture_lod/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_compute_variable_group_size/test_01.comp.glsl"));
		assertValid(resource("GL_ARB_compute_shader/test_01.comp.glsl"));
		assertValid(resource("GL_ARB_shader_bit_encoding/test_01.comp.glsl"));
		assertValid(resource("GL_ARB_texture_query_lod/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_geometry_shader4/test_01.geom.glsl"));
		assertValid(resource("GL_ARB_viewport_array/test_01.geom.glsl"));
		assertValid(resource("GL_ARB_fragment_shader_interlock/test_01.frag.glsl"));
		assertValid(resource("GL_ARB_cull_distance/test_01.vert.glsl"));
		assertValid(resource("GL_ARB_texture_multisample/test_01.frag.glsl"));
	}


	private static void testGL_ARB_texture_query_levels() {
		assertValid(resource("GL_ARB_texture_query_levels/test_01.frag.glsl"),
				ShaderType.GENERIC_SHADER);
	}


	private static void testGL_ARB_sample_shading() {
		assertValid(resource("GL_ARB_sample_shading/test_01.frag.glsl"),
				ShaderType.FRAGMENT_SHADER);
	}


	private static void testGL_ARB_shader_image_load_store() {
		assertValid(resource("GL_ARB_shader_image_load_store/test_01.frag.glsl"),
				ShaderType.FRAGMENT_SHADER);
	}


	private static Resource resource(String relpath) {
		try {
			return TestingGLSLBase.RESOURCES.resolve(relpath);
		} catch (IOException e) {
			throw new AssertionError(e);
		}
	}


	private static void testGL_ARB_shader_image_size() {
		assertValid("#version 420 compatibility\n"
				+ "#extension GL_ARB_shader_image_size : enable\n"
				+ "in image1D image;\n"
				+ "void main () {\n"
				+ "     int size = imageSize(image);\n"
				+ "}\n"
				,
				ShaderType.GENERIC_SHADER);
	}


	private static void testGL_ARB_shader_atomic_counter_ops() {
		assertValid("#version 420 compatibility\n"
				+ "#extension GL_ARB_shader_atomic_counter_ops : enable\n"
				+ "atomic_uint counter;\n"
				+ "void main () {\n"
				+ "     uint result = atomicCounterSubtractARB(counter, 1u);\n"
				+ "}\n"
				,
				ShaderType.FRAGMENT_SHADER);
	}


	private static void testGL_ARB_derivative_control() {
		assertValid("#version 400 compatibility\n"
				+ "#extension GL_ARB_derivative_control : enable\n"
				+ "void main () {\n"
				+ "     float fine = dFdxFine(1.0f);\n"
				+ "}\n"
				,
				ShaderType.FRAGMENT_SHADER);
	}


	private static void testGL_ARB_tessellation_shader() {
		assertValid("#version 150 compatibility\n"
				+ "#extension GL_ARB_tessellation_shader : enable\n"
				+ "void main () {\n"
				+ "     barrier();\n"
				+ "     gl_in[gl_PrimitiveID].gl_PointSize = gl_out[gl_PrimitiveID].gl_PointSize;\n"
				+ "}\n"
				,
				ShaderType.TESS_CONTROL_SHADER);
	}


	private static void testGL_ARB_shader_texture_image_samples() {
		assertValid("#version 420\n"
				+ "#extension GL_ARB_shader_texture_image_samples : enable\n"
				+ "in sampler2DMS sampler;\n"
				+ "in image2DMS image;\n"
				+ "void main () {\n"
				+ "     int samples = textureSamples(sampler);\n"
				+ "     samples = imageSamples(image);\n"
				+ "}\n"
				,
				ShaderType.GENERIC_SHADER);
	}


	private static void testGL_ARB_gpu_shader_fp64() {
		assertValid("#version 150\n"
				+ "#extension GL_ARB_gpu_shader_fp64 : enable\n"
				+ "double d;\n",
				ShaderType.GENERIC_SHADER);
	}
	
	
	
}
