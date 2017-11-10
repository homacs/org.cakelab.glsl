package org.cakelab.glsl.builtin.extensions.GL_ARB_texture_gather;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;

public class Loader extends GLSLExtensionLoader {
	
	public static String requiredType = "samplerCubeArray";
	public static String CUBE_ARRAY_AVAILABLE = "__HAVE_CUBE_ARRAY";


	@Override
	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		super.finishedPreprocessing(ws, pp);
		pp.removeDefine(CUBE_ARRAY_AVAILABLE);
	}

	@Override
	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, PPOutputSink buffer) {
		Preprocessor pp = super.setupPreprocessor(ws, resource, buffer);
		if (ws.haveBuiltinType(requiredType)) {
			pp.addDefine(CUBE_ARRAY_AVAILABLE);
		}
		return pp;
	}

	
	
}
