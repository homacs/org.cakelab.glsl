package org.cakelab.glsl.builtin.extensions.GL_ARB_gpu_shader5;

import static org.cakelab.glsl.lang.ast.types.Type.*;

import java.io.IOException;

import org.cakelab.glsl.builtin.BuiltinResourceManager;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;

public class Loader extends GLSLExtensionLoader {

	static {
		
		addImplicitCastRules(     _int,      _uint, _float);
		addImplicitCastRules(     _ivec2,    _uvec2, _vec2);
		addImplicitCastRules(     _ivec3,    _uvec3, _vec3);
		addImplicitCastRules(     _ivec4,    _uvec4, _vec4);
		
		addImplicitCastRules(     _uint,     _float);
		addImplicitCastRules(     _uvec2,    _vec2);
		addImplicitCastRules(     _uvec3,    _vec3);
		addImplicitCastRules(     _uvec4,    _vec4);

	}
	
	
	
	@Override
	public GLSLExtension load(WorkingSet ws, Properties properties,
			BuiltinResourceManager builtinResourceManager) throws IOException {

		return loadRegularly(ws, properties);
	}

	private static void addImplicitCastRules(Type sourceType, Type ... targetTypes) {
		for (Type targetType : targetTypes) {
			targetType.addImplicitCastRule(sourceType);
		}
	}


	
	
	
	
}
