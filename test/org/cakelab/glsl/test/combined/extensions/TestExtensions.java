package org.cakelab.glsl.test.combined.extensions;

import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.combined.TestingGLSLBase;

public class TestExtensions extends TestingGLSLBase {
	public static void main(String[] args) {
		Test.checkAssertionsOn();
		test();
	}
	
	
	public static void test() {
		testGL_ARB_gpu_shader_fp64();
		testGL_ARB_shader_texture_image_samples();
		testGL_ARB_tessellation_shader();
		testGL_ARB_derivative_control();
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
