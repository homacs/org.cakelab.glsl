package org.cakelab.glsl.test.combined.extensions;

import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.test.combined.TestingGLSLBase;

public class TestExtensions extends TestingGLSLBase {
	public static void main(String[] args) {
		assertValid("#version 150\n"
				+ "#extension GL_ARB_gpu_shader_fp64 : enable\n"
				+ "double d;\n",
				ShaderType.GENERIC_SHADER);
	}
	
	
	
	
}
