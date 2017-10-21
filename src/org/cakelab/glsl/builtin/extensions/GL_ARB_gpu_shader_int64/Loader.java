package org.cakelab.glsl.builtin.extensions.GL_ARB_gpu_shader_int64;

import static org.cakelab.glsl.lang.ast.types.Type._bool;
import static org.cakelab.glsl.lang.ast.types.Type._double;
import static org.cakelab.glsl.lang.ast.types.Type._dvec2;
import static org.cakelab.glsl.lang.ast.types.Type._dvec3;
import static org.cakelab.glsl.lang.ast.types.Type._dvec4;
import static org.cakelab.glsl.lang.ast.types.Type._float;
import static org.cakelab.glsl.lang.ast.types.Type._int;
import static org.cakelab.glsl.lang.ast.types.Type._ivec2;
import static org.cakelab.glsl.lang.ast.types.Type._ivec3;
import static org.cakelab.glsl.lang.ast.types.Type._ivec4;
import static org.cakelab.glsl.lang.ast.types.Type._uint;
import static org.cakelab.glsl.lang.ast.types.Type._uvec2;
import static org.cakelab.glsl.lang.ast.types.Type._uvec3;
import static org.cakelab.glsl.lang.ast.types.Type._uvec4;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionSymbolTable;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.ast.types.Type.Rank;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.pp.ast.Macro;

public class Loader extends GLSLExtensionLoader {
	static Type _int64_t = new Type(Interval.NONE, "int64_t", Type.KIND_SCALAR, Rank.INT, null);
	static Type _i64vec2 = new Type(Interval.NONE, "i64vec2", Type.KIND_VECTOR, Rank.NON_SCALAR, null);
	static Type _i64vec3 = new Type(Interval.NONE, "i64vec3", Type.KIND_VECTOR, Rank.NON_SCALAR, null);
	static Type _i64vec4 = new Type(Interval.NONE, "i64vec4", Type.KIND_VECTOR, Rank.NON_SCALAR, null);
	static Type _uint64_t = new Type(Interval.NONE, "uint64_t", Type.KIND_SCALAR, Rank.UINT, null);
	static Type _u64vec2 = new Type(Interval.NONE, "u64vec2", Type.KIND_VECTOR, Rank.NON_SCALAR, null);
	static Type _u64vec3 = new Type(Interval.NONE, "u64vec3", Type.KIND_VECTOR, Rank.NON_SCALAR, null);
	static Type _u64vec4 = new Type(Interval.NONE, "u64vec4", Type.KIND_VECTOR, Rank.NON_SCALAR, null);

	static {
		// Note:
		// we add cast constructors to standard builtin types 
		// (int, bool, ...). Those will be always available from now on.
		// This cannot cause issues, when this extension is disabled, 
		// because, the added types (_int64_t) will not be available 
		// as keywords anymore.
		//
		
		addImplicitCastRules(     _int,    _int64_t, _uint64_t);
		addImplicitCastRules(    _uint,    _uint64_t);
		addImplicitCastRules( _int64_t,    _uint64_t, _double);
		addImplicitCastRules(_uint64_t,    _double);
		addImplicitCastRules(   _ivec2,    _i64vec2, _u64vec2);
		addImplicitCastRules(   _ivec3,    _i64vec3, _u64vec3);
		addImplicitCastRules(   _ivec4,    _i64vec4, _u64vec4);
		addImplicitCastRules(   _uvec2,    _u64vec2);
		addImplicitCastRules(   _uvec3,    _u64vec3);
		addImplicitCastRules(   _uvec4,    _u64vec4);
		addImplicitCastRules( _i64vec2,    _u64vec2);
		addImplicitCastRules( _i64vec3,    _u64vec3);
		addImplicitCastRules( _i64vec4,    _u64vec4);
		addImplicitCastRules( _u64vec2,    _dvec2);
		addImplicitCastRules( _u64vec3,    _dvec3);
		addImplicitCastRules( _u64vec4,    _dvec4);
		
		
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
	public GLSLExtension load(WorkingSet ws, Properties properties) throws IOException {
		Resource preambleResource;
		try {
			preambleResource = properties.getPreamble();
		} catch (IOException e1) {
			throw new Error("internal error: failed to load preamble for extension " + properties.getName(), e1);
		}
		GLSLVersion glslVersion = ws.getGLSLVersion();
		ShaderType shaderLanguage = ws.getShaderType();
		
		GLSL_ANTLR_PPOutputBuffer preprocessedPreamble = createPPOutputBuffer();

		HashMap<String, Macro> extensionMacros = preprocess(ws, preambleResource, preprocessedPreamble);

		KeywordTable addedKeywords = loadKeywordTable(properties.getName());
		GLSLExtension e = new GLSLExtension(properties, glslVersion, shaderLanguage, extensionMacros, addedKeywords);
		
		// add new built-in types to extension specific symbol table scope
		e.addType(_int64_t);
		e.addType(_i64vec2);
		e.addType(_i64vec3);
		e.addType(_i64vec4);
		e.addType(_uint64_t);
		e.addType(_u64vec2);
		e.addType(_u64vec3);
		e.addType(_u64vec4);
		
		// This is just a temporary symbol table 
		// used during parse of the preamble.
		GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, ws.getBuiltinScope());

		parseExtensionPreamble(e, ws, preprocessedPreamble, symbolTable);
		return e;
	}

	private static void addImplicitCastRules(Type sourceType, Type ... targetTypes) {
		for (Type targetType : targetTypes) {
			targetType.addImplicitCastRule(sourceType);
		}
	}


	
	
	
	
}
