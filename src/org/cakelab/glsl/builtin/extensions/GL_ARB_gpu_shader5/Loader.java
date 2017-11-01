package org.cakelab.glsl.builtin.extensions.GL_ARB_gpu_shader5;

import static org.cakelab.glsl.lang.ast.types.Type._float;
import static org.cakelab.glsl.lang.ast.types.Type._int;
import static org.cakelab.glsl.lang.ast.types.Type._ivec2;
import static org.cakelab.glsl.lang.ast.types.Type._ivec3;
import static org.cakelab.glsl.lang.ast.types.Type._ivec4;
import static org.cakelab.glsl.lang.ast.types.Type._uint;
import static org.cakelab.glsl.lang.ast.types.Type._uvec2;
import static org.cakelab.glsl.lang.ast.types.Type._uvec3;
import static org.cakelab.glsl.lang.ast.types.Type._uvec4;
import static org.cakelab.glsl.lang.ast.types.Type._vec2;
import static org.cakelab.glsl.lang.ast.types.Type._vec3;
import static org.cakelab.glsl.lang.ast.types.Type._vec4;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;

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


	private static void addImplicitCastRules(Type sourceType, Type ... targetTypes) {
		for (Type targetType : targetTypes) {
			targetType.addImplicitCastRule(sourceType);
		}
	}


	
	
	
	
}
