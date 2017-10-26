package org.cakelab.glsl.builtin.extensions.GL_ARB_gl_spirv;

import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.Macro;

public class GLSLExtension_GL_ARB_gl_spirv extends GLSLExtension {

	// TODO SPIR-V frontend
	
	
	private static final String ERROR_CANNOT_ENABLE_DISABLE = "GL_ARB_gl_spirv does not support the preprocessor directive '#extension'.\n"
			+ "Configure SPIR-V frontend instead.";
	
	
	public GLSLExtension_GL_ARB_gl_spirv(Properties properties, GLSLVersion version, ShaderType type,
			HashMap<String, Macro> extensionMacros, KeywordTable addedKeywords) {
		super(properties, version, type, extensionMacros, addedKeywords);
		super.enabled = true;
	}

	@Override
	public void enable(PPState ws) {
		throw new Error(ERROR_CANNOT_ENABLE_DISABLE);
	}

	@Override
	public void disable(PPState ws) {
		throw new Error(ERROR_CANNOT_ENABLE_DISABLE);
	}

}
