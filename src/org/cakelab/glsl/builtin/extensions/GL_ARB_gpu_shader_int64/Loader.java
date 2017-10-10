package org.cakelab.glsl.builtin.extensions.GL_ARB_gpu_shader_int64;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.BuiltinResourceManager;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLTokenTable;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionSymbolTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.pp.ast.Macro;

import static org.cakelab.glsl.lang.ast.types.Type.*;

import java.io.IOException;
import java.util.HashMap;

public class Loader extends GLSLExtensionLoader {
	static Type _int64_t = new Type(Interval.NONE, "int64_t", Type.KIND_SCALAR, null);
	static Type _i64vec2 = new Type(Interval.NONE, "i64vec2", Type.KIND_VECTOR, null);
	static Type _i64vec3 = new Type(Interval.NONE, "i64vec3", Type.KIND_VECTOR, null);
	static Type _i64vec4 = new Type(Interval.NONE, "i64vec4", Type.KIND_VECTOR, null);
	static Type _uint64_t = new Type(Interval.NONE, "uint64_t", Type.KIND_SCALAR, null);
	static Type _u64vec2 = new Type(Interval.NONE, "u64vec2", Type.KIND_VECTOR, null);
	static Type _u64vec3 = new Type(Interval.NONE, "u64vec3", Type.KIND_VECTOR, null);
	static Type _u64vec4 = new Type(Interval.NONE, "u64vec4", Type.KIND_VECTOR, null);

	static {
		_int.addCastConstructor(_int64_t);
		_int.addCastConstructor(_uint64_t);
		_uint.addCastConstructor(_int64_t);
		_uint.addCastConstructor(_uint64_t);
		_bool.addCastConstructor(_int64_t);
		_bool.addCastConstructor(_uint64_t);
		_float.addCastConstructor(_int64_t);
		_float.addCastConstructor(_uint64_t);
		_double.addCastConstructor(_int64_t);
		_double.addCastConstructor(_uint64_t);
		_int64_t.addCastConstructor(_int);
		_int64_t.addCastConstructor(_uint);
		_int64_t.addCastConstructor(_bool);
		_int64_t.addCastConstructor(_float);
		_int64_t.addCastConstructor(_double);
		_uint64_t.addCastConstructor(_int);
		_uint64_t.addCastConstructor(_uint);
		_uint64_t.addCastConstructor(_bool);
		_uint64_t.addCastConstructor(_float);
		_uint64_t.addCastConstructor(_double);
		_int64_t.addCastConstructor(_uint64_t);
		_uint64_t.addCastConstructor(_int64_t);
	}
	
	
	
	@Override
	public GLSLExtension load(BuiltinScope builtinScope, Properties properties, GLSLVersion version, ShaderType shaderType,
			BuiltinResourceManager builtinResourceManager) {
		Resource preamble;
		try {
			preamble = properties.getPreamble();
		} catch (IOException e1) {
			throw new Error("internal error: failed to load preamble for extension " + properties.getName(), e1);
		}
		
		
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);

		HashMap<String, Macro> extensionMacros = preprocess(preamble, version, shaderType, buffer);

		GLSLTokenTable tokenTable = GLSLTokenTable.get(version);

		GLSLExtension e = new GLSLExtension(properties, version, shaderType, extensionMacros);
		
		// add new types
		e.addType(_int64_t);
		e.addType(_i64vec2);
		e.addType(_i64vec3);
		e.addType(_i64vec4);
		e.addType(_uint64_t);
		e.addType(_u64vec2);
		e.addType(_u64vec3);
		e.addType(_u64vec4);
		
		
		GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, builtinScope);

		parse(buffer, tokenTable, symbolTable);
		return e;
	}


	
	
	
	
}
