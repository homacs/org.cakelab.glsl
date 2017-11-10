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
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.builtin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.ast.types.Type.Rank;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.tokens.TNumber;

public class Loader extends GLSLExtensionLoader {
	private static final Macro HAVE_DOUBLE = GLSLBuiltinServices.createMacro("HAVE_DOUBLE", new TNumber("1"));
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
	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, PPOutputSink buffer) {
		Preprocessor pp = super.setupPreprocessor(ws, resource, buffer);
		if (ws.haveBuiltinType("double")) pp.addDefine(HAVE_DOUBLE);
		return pp;
	}



	@Override
	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		pp.removeDefine(HAVE_DOUBLE.getName());
		super.finishedPreprocessing(ws, pp);
	}


	@Override
	protected KeywordTable loadKeywordTable(String extension) throws IOException {
		// add the new keywords to hide reserved keywords
		return KeywordTable.create(vocabulary.builtintype(), "int64_t", "i64vec2", "i64vec3", "i64vec4", "uint64_t", "u64vec2", "u64vec2", "u64vec3", "u64vec4");
	}



	@Override
	protected GLSLExtension createExtension(Properties properties, GLSLVersion version, ShaderType shaderType,
			HashMap<String, Macro> extensionMacros, KeywordTable extendedKeywords) {
		GLSLExtension e = super.createExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
		
		// add new built-in types to extension specific symbol table scope
		e.addType(_int64_t);
		e.addType(_i64vec2);
		e.addType(_i64vec3);
		e.addType(_i64vec4);
		e.addType(_uint64_t);
		e.addType(_u64vec2);
		e.addType(_u64vec3);
		e.addType(_u64vec4);
		
		return e;
	}


	
	private static void addImplicitCastRules(Type sourceType, Type ... targetTypes) {
		for (Type targetType : targetTypes) {
			targetType.addImplicitCastRule(sourceType);
		}
	}
	
	
}
