package org.cakelab.glsl.builtin.extensions.GL_ARB_gl_spirv;

import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.SyntaxError;

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
	public void enable(PPState state) {
		error(state);
	}

	@Override
	public void disable(PPState state) {
		error(state);
	}

	
	private void error(PPState state) {
		Location loc;
		if (state.getLexer() == null) loc = Location.NONE;
		else loc = state.getLexer().previous().getStart();
		
		ErrorHandler handler = state.getErrorHandler();
		if (handler != null) handler.error(loc, ERROR_CANNOT_ENABLE_DISABLE);
		else throw new SyntaxError(loc, ERROR_CANNOT_ENABLE_DISABLE);
	}


}
