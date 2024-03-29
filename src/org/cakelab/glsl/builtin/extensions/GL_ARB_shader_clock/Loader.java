package org.cakelab.glsl.builtin.extensions.GL_ARB_shader_clock;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.*;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.tokens.TNumber;

public class Loader extends GLSLExtensionLoader {

	

	private Macro HAVE_UINT64 = GLSLBuiltinServices.createMacro("HAVE_UINT64", new TNumber("1"));
	private Macro HAVE_UVEC = GLSLBuiltinServices.createMacro("HAVE_UVEC", new TNumber("1"));


	@Override
	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		pp.removeDefine(HAVE_UINT64.getName());
		pp.removeDefine(HAVE_UVEC.getName());
		super.finishedPreprocessing(ws, pp);
	}

	@Override
	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, PPOutputSink buffer) {
		Preprocessor pp = super.setupPreprocessor(ws, resource, buffer);
		
		if (ws.haveBuiltinType("uint64_t")) {
			pp.addDefine(HAVE_UINT64);
		}
		if (ws.haveBuiltinType("uvec2")) {
			pp.addDefine(HAVE_UVEC);
		}
		
		return pp;
	}

	
	
}
