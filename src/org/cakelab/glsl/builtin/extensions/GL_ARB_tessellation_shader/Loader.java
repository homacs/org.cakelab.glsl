package org.cakelab.glsl.builtin.extensions.GL_ARB_tessellation_shader;

import java.io.IOException;

import org.cakelab.glsl.builtin.BuiltinResourceManager;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.Properties;

public class Loader extends GLSLExtensionLoader {
	
	@Override
	public GLSLExtension load(WorkingSet ws, Properties properties, BuiltinResourceManager builtinResourceManager) throws IOException {
		GLSLExtension e = loadRegularly(ws, properties);
		addLayoutQualifierRule("equal_spacing");
		addLayoutQualifierRule("fractional_even_spacing");
		addLayoutQualifierRule("fractional_odd_spacing");
		addLayoutQualifierRule("vertices");
		return e;
	}

	protected void addLayoutQualifierRule(String string) {
		// TODO: layout qualifier rules of extensions
	}

	
	
}
