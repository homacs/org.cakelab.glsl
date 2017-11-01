package org.cakelab.glsl.builtin.extensions.GL_ARB_compute_shader;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.BuiltinLoaderHelper;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.tokens.TNumber;

public class Loader extends GLSLExtensionLoader {

	private static final Macro HAVE_GL_ARB_shader_storage_buffer_object = BuiltinLoaderHelper.createMacro("HAVE_GL_ARB_shader_storage_buffer_object", new TNumber("1"));
	
	@Override
	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		pp.removeDefine(HAVE_GL_ARB_shader_storage_buffer_object.getName());
		super.finishedPreprocessing(ws, pp);
	}

	@Override
	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, PPOutputSink buffer) {
		Preprocessor pp = super.setupPreprocessor(ws, resource, buffer);
		if (ws.getExtensions().containsExtension("GL_ARB_shader_storage_buffer_object")) {
			pp.addDefine(HAVE_GL_ARB_shader_storage_buffer_object);
		}
		return pp;
	}

	
	
	
}
