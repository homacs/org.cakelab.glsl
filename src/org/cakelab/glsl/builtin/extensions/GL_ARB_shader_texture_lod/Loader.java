package org.cakelab.glsl.builtin.extensions.GL_ARB_shader_texture_lod;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.*;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.tokens.TNumber;

public class Loader extends GLSLExtensionLoader {

	private static final Macro HAVE_SAMPLER_RECT = GLSLBuiltinServices.createMacro("HAVE_SAMPLER_RECT", new TNumber("1"));
	
	
	@Override
	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		pp.removeDefine(HAVE_SAMPLER_RECT.getName());
		super.finishedPreprocessing(ws, pp);
	}

	@Override
	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, PPOutputSink buffer) {
		Preprocessor pp = super.setupPreprocessor(ws, resource, buffer);
		if (ws.haveBuiltinType("sampler2DRect")) {
			pp.addDefine(HAVE_SAMPLER_RECT);
		}
		return pp;
	}


	
	
}
