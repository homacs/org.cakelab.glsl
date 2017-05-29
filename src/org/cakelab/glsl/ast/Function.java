package org.cakelab.glsl.ast;


import static org.cakelab.glsl.ast.Type.*;
import static org.cakelab.glsl.ast.Qualifier.*;

public class Function {

	public static class Body extends Scope {
		public Body(Scope parent, Parameter[] parameters) {
			super(parent);
			for (Parameter p : parameters) {
				if (p.name != null) {
					addVariable(p.name, p);
				}
			}
		}
	}
	
	final Type type;
	final String name;
	final Parameter[] parameters;
	Body body;

	public Function(Type type, String name, Parameter ... parameters) {
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}

	public Body createBody(Scope parentScope) {
		this.body = new Body(parentScope, parameters);
		return this.body;
	}
	
	
	
	public static final Function[] BUILTIN_FUNCTIONS = {
		new Function(_float, "radians", new Parameter(_float, "degrees")),
		new Function(_vec2, "radians", new Parameter(_vec2, "degrees")),
		new Function(_vec3, "radians", new Parameter(_vec3, "degrees")),
		new Function(_vec4, "radians", new Parameter(_vec4, "degrees")),
		         
		new Function(_float, "degrees", new Parameter(_float, "radians")),
		new Function(_vec2, "degrees", new Parameter(_vec2, "radians")),
		new Function(_vec3, "degrees", new Parameter(_vec3, "radians")),
		new Function(_vec4, "degrees", new Parameter(_vec4, "radians")),
		         
		new Function(_float, "sin", new Parameter(_float, "angle")),
		new Function(_vec2, "sin", new Parameter(_vec2, "angle")),
		new Function(_vec3, "sin", new Parameter(_vec3, "angle")),
		new Function(_vec4, "sin", new Parameter(_vec4, "angle")),
		         
		new Function(_float, "cos", new Parameter(_float, "angle")),
		new Function(_vec2, "cos", new Parameter(_vec2, "angle")),
		new Function(_vec3, "cos", new Parameter(_vec3, "angle")),
		new Function(_vec4, "cos", new Parameter(_vec4, "angle")),
		         
		new Function(_float, "tan", new Parameter(_float, "angle")),
		new Function(_vec2, "tan", new Parameter(_vec2, "angle")),
		new Function(_vec3, "tan", new Parameter(_vec3, "angle")),
		new Function(_vec4, "tan", new Parameter(_vec4, "angle")),
		         
		new Function(_float, "asin", new Parameter(_float, "x")),
		new Function(_vec2, "asin", new Parameter(_vec2, "x")),
		new Function(_vec3, "asin", new Parameter(_vec3, "x")),
		new Function(_vec4, "asin", new Parameter(_vec4, "x")),
		         
		new Function(_float, "acos", new Parameter(_float, "x")),
		new Function(_vec2, "acos", new Parameter(_vec2, "x")),
		new Function(_vec3, "acos", new Parameter(_vec3, "x")),
		new Function(_vec4, "acos", new Parameter(_vec4, "x")),
		         
		new Function(_float, "atan", new Parameter(_float, "y"), new Parameter(_float, "x")),
		new Function(_vec2, "atan", new Parameter(_vec2, "y"), new Parameter(_vec2, "x")),
		new Function(_vec3, "atan", new Parameter(_vec3, "y"), new Parameter(_vec3, "x")),
		new Function(_vec4, "atan", new Parameter(_vec4, "y"), new Parameter(_vec4, "x")),
		         
		new Function(_float, "atan", new Parameter(_float, "y_over_x")),
		new Function(_vec2, "atan", new Parameter(_vec2, "y_over_x")),
		new Function(_vec3, "atan", new Parameter(_vec3, "y_over_x")),
		new Function(_vec4, "atan", new Parameter(_vec4, "y_over_x")),
		
		
		new Function(_float, "sinh", new Parameter(_float, "angle")),
		new Function(_vec2, "sinh", new Parameter(_vec2, "angle")),
		new Function(_vec3, "sinh", new Parameter(_vec3, "angle")),
		new Function(_vec4, "sinh", new Parameter(_vec4, "angle")),
		     
		new Function(_float, "cosh", new Parameter(_float, "angle")),
		new Function(_vec2, "cosh", new Parameter(_vec2, "angle")),
		new Function(_vec3, "cosh", new Parameter(_vec3, "angle")),
		new Function(_vec4, "cosh", new Parameter(_vec4, "angle")),
		     
		new Function(_float, "tanh", new Parameter(_float, "angle")),
		new Function(_vec2, "tanh", new Parameter(_vec2, "angle")),
		new Function(_vec3, "tanh", new Parameter(_vec3, "angle")),
		new Function(_vec4, "tanh", new Parameter(_vec4, "angle")),
		     
		new Function(_float, "asinh", new Parameter(_float, "x")),
		new Function(_vec2, "asinh", new Parameter(_vec2, "x")),
		new Function(_vec3, "asinh", new Parameter(_vec3, "x")),
		new Function(_vec4, "asinh", new Parameter(_vec4, "x")),
		     
		new Function(_float, "acosh", new Parameter(_float, "x")),
		new Function(_vec2, "acosh", new Parameter(_vec2, "x")),
		new Function(_vec3, "acosh", new Parameter(_vec3, "x")),
		new Function(_vec4, "acosh", new Parameter(_vec4, "x")),
		     
		new Function(_float, "atanh", new Parameter(_float, "y_over_x")),
		new Function(_vec2, "atanh", new Parameter(_vec2, "y_over_x")),
		new Function(_vec3, "atanh", new Parameter(_vec3, "y_over_x")),
		new Function(_vec4, "atanh", new Parameter(_vec4, "y_over_x")),
		
		
		new Function(_float, "pow", new Parameter(_float, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "pow", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_vec3, "pow", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_vec4, "pow", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_float, "exp", new Parameter(_float, "x")),
		new Function(_vec2, "exp", new Parameter(_vec2, "x")),
		new Function(_vec3, "exp", new Parameter(_vec3, "x")),
		new Function(_vec4, "exp", new Parameter(_vec4, "x")),
		         
		new Function(_float, "log", new Parameter(_float, "x")),
		new Function(_vec2, "log", new Parameter(_vec2, "x")),
		new Function(_vec3, "log", new Parameter(_vec3, "x")),
		new Function(_vec4, "log", new Parameter(_vec4, "x")),
		         
		new Function(_float, "exp2", new Parameter(_float, "x")),
		new Function(_vec2, "exp2", new Parameter(_vec2, "x")),
		new Function(_vec3, "exp2", new Parameter(_vec3, "x")),
		new Function(_vec4, "exp2", new Parameter(_vec4, "x")),
		         
		new Function(_float, "log2", new Parameter(_float, "x")),
		new Function(_vec2, "log2", new Parameter(_vec2, "x")),
		new Function(_vec3, "log2", new Parameter(_vec3, "x")),
		new Function(_vec4, "log2", new Parameter(_vec4, "x")),
		         
		new Function(_float, "sqrt", new Parameter(_float, "x")),
		new Function(_vec2, "sqrt", new Parameter(_vec2, "x")),
		new Function(_vec3, "sqrt", new Parameter(_vec3, "x")),
		new Function(_vec4, "sqrt", new Parameter(_vec4, "x")),
		         
		new Function(_float, "inversesqrt", new Parameter(_float, "x")),
		new Function(_vec2, "inversesqrt", new Parameter(_vec2, "x")),
		new Function(_vec3, "inversesqrt", new Parameter(_vec3, "x")),
		new Function(_vec4, "inversesqrt", new Parameter(_vec4, "x")),
		
		
		new Function(_float, "abs", new Parameter(_float, "x")),
		new Function(_vec2, "abs", new Parameter(_vec2, "x")),
		new Function(_vec3, "abs", new Parameter(_vec3, "x")),
		new Function(_vec4, "abs", new Parameter(_vec4, "x")),
		         
		new Function(_float, "sign", new Parameter(_float, "x")),
		new Function(_vec2, "sign", new Parameter(_vec2, "x")),
		new Function(_vec3, "sign", new Parameter(_vec3, "x")),
		new Function(_vec4, "sign", new Parameter(_vec4, "x")),
		         
		new Function(_float, "floor", new Parameter(_float, "x")),
		new Function(_vec2, "floor", new Parameter(_vec2, "x")),
		new Function(_vec3, "floor", new Parameter(_vec3, "x")),
		new Function(_vec4, "floor", new Parameter(_vec4, "x")),
		         
		new Function(_float, "ceil", new Parameter(_float, "x")),
		new Function(_vec2, "ceil", new Parameter(_vec2, "x")),
		new Function(_vec3, "ceil", new Parameter(_vec3, "x")),
		new Function(_vec4, "ceil", new Parameter(_vec4, "x")),
		         
		new Function(_float, "fract", new Parameter(_float, "x")),
		new Function(_vec2, "fract", new Parameter(_vec2, "x")),
		new Function(_vec3, "fract", new Parameter(_vec3, "x")),
		new Function(_vec4, "fract", new Parameter(_vec4, "x")),
		         
		new Function(_float, "mod", new Parameter(_float, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "mod", new Parameter(_vec2, "x"), new Parameter(_float, "y")),
		new Function(_vec3, "mod", new Parameter(_vec3, "x"), new Parameter(_float, "y")),
		new Function(_vec4, "mod", new Parameter(_vec4, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "mod", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_vec3, "mod", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_vec4, "mod", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_float, "min", new Parameter(_float, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "min", new Parameter(_vec2, "x"), new Parameter(_float, "y")),
		new Function(_vec3, "min", new Parameter(_vec3, "x"), new Parameter(_float, "y")),
		new Function(_vec4, "min", new Parameter(_vec4, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "min", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_vec3, "min", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_vec4, "min", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_float, "max", new Parameter(_float, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "max", new Parameter(_vec2, "x"), new Parameter(_float, "y")),
		new Function(_vec3, "max", new Parameter(_vec3, "x"), new Parameter(_float, "y")),
		new Function(_vec4, "max", new Parameter(_vec4, "x"), new Parameter(_float, "y")),
		new Function(_vec2, "max", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_vec3, "max", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_vec4, "max", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_float, "clamp", new Parameter(_float, "x"), new Parameter(_float, "minVal"), new Parameter(_float, "maxVal")),
		new Function(_vec2, "clamp", new Parameter(_vec2, "x"), new Parameter(_float, "minVal"), new Parameter(_float, "maxVal")),
		new Function(_vec3, "clamp", new Parameter(_vec3, "x"), new Parameter(_float, "minVal"), new Parameter(_float, "maxVal")),
		new Function(_vec4, "clamp", new Parameter(_vec4, "x"), new Parameter(_float, "minVal"), new Parameter(_float, "maxVal")),
		new Function(_vec2, "clamp", new Parameter(_vec2, "x"), new Parameter(_vec2, "minVal"), new Parameter(_vec2, "maxVal")),
		new Function(_vec3, "clamp", new Parameter(_vec3, "x"), new Parameter(_vec3, "minVal"), new Parameter(_vec3, "maxVal")),
		new Function(_vec4, "clamp", new Parameter(_vec4, "x"), new Parameter(_vec4, "minVal"), new Parameter(_vec4, "maxVal")),
		         
		new Function(_float, "mix", new Parameter(_float, "x"), new Parameter(_float, "y"), new Parameter(_float, "a")),
		new Function(_vec2, "mix", new Parameter(_vec2, "x"), new Parameter(_vec2, "y"), new Parameter(_float, "a")),
		new Function(_vec3, "mix", new Parameter(_vec3, "x"), new Parameter(_vec3, "y"), new Parameter(_float, "a")),
		new Function(_vec4, "mix", new Parameter(_vec4, "x"), new Parameter(_vec4, "y"), new Parameter(_float, "a")),
		new Function(_vec2, "mix", new Parameter(_vec2, "x"), new Parameter(_vec2, "y"), new Parameter(_vec2, "a")),
		new Function(_vec3, "mix", new Parameter(_vec3, "x"), new Parameter(_vec3, "y"), new Parameter(_vec3, "a")),
		new Function(_vec4, "mix", new Parameter(_vec4, "x"), new Parameter(_vec4, "y"), new Parameter(_vec4, "a")),
		
		new Function(_float, "step", new Parameter(_float, "edge"), new Parameter(_float, "x")),
		new Function(_vec2, "step", new Parameter(_vec2, "edge"), new Parameter(_vec2, "x")),
		new Function(_vec3, "step", new Parameter(_vec3, "edge"), new Parameter(_vec3, "x")),
		new Function(_vec4, "step", new Parameter(_vec4, "edge"), new Parameter(_vec4, "x")),
		new Function(_vec2, "step", new Parameter(_float, "edge"), new Parameter(_vec2, "x")),
		new Function(_vec3, "step", new Parameter(_float, "edge"), new Parameter(_vec3, "x")),
		new Function(_vec4, "step", new Parameter(_float, "edge"), new Parameter(_vec4, "x")),
		         
		new Function(_float, "smoothstep", new Parameter(_float, "edge0"), new Parameter(_float, "edge1"), new Parameter(_float, "x")),
		new Function(_vec2, "smoothstep", new Parameter(_vec2, "edge0"), new Parameter(_vec2, "edge1"), new Parameter(_vec2, "x")),
		new Function(_vec3, "smoothstep", new Parameter(_vec3, "edge0"), new Parameter(_vec3, "edge1"), new Parameter(_vec3, "x")),
		new Function(_vec4, "smoothstep", new Parameter(_vec4, "edge0"), new Parameter(_vec4, "edge1"), new Parameter(_vec4, "x")),
		new Function(_vec2, "smoothstep", new Parameter(_float, "edge0"), new Parameter(_float, "edge1"), new Parameter(_vec2, "x")),
		new Function(_vec3, "smoothstep", new Parameter(_float, "edge0"), new Parameter(_float, "edge1"), new Parameter(_vec3, "x")),
		new Function(_vec4, "smoothstep", new Parameter(_float, "edge0"), new Parameter(_float, "edge1"), new Parameter(_vec4, "x")),
		    
		new Function(_int, "abs", new Parameter(_int,"x")),
		new Function(_ivec2, "abs", new Parameter(_ivec2, "x")),
		new Function(_ivec3, "abs", new Parameter(_ivec3, "x")),
		new Function(_ivec4, "abs", new Parameter(_ivec4, "x")),
		
		new Function(_int, "sign", new Parameter(_int,"x")),
		new Function(_ivec2, "sign", new Parameter(_ivec2, "x")),
		new Function(_ivec3, "sign", new Parameter(_ivec3, "x")),
		new Function(_ivec4, "sign", new Parameter(_ivec4, "x")),
		
		new Function(_float, "trunc", new Parameter(_float, "x")),
		new Function(_vec2, "trunc", new Parameter(_vec2, "x")),
		new Function(_vec3, "trunc", new Parameter(_vec3, "x")),
		new Function(_vec4, "trunc", new Parameter(_vec4, "x")),
		         
		new Function(_float, "round", new Parameter(_float, "x")),
		new Function(_vec2, "round", new Parameter(_vec2, "x")),
		new Function(_vec3, "round", new Parameter(_vec3, "x")),
		new Function(_vec4, "round", new Parameter(_vec4, "x")),
		         
		new Function(_float, "roundEven", new Parameter(_float, "x")),
		new Function(_vec2, "roundEven", new Parameter(_vec2, "x")),
		new Function(_vec3, "roundEven", new Parameter(_vec3, "x")),
		new Function(_vec4, "roundEven", new Parameter(_vec4, "x")),
		         
		new Function(_float, "modf", new Parameter(_float,"param1"), new Parameter(_float,"param2",_out)),
		new Function(_vec2, "modf", new Parameter(_vec2,"param1"), new Parameter(_vec2,"param2",_out)),
		new Function(_vec3, "modf", new Parameter(_vec3,"param1"), new Parameter(_vec3,"param2",_out)),
		new Function(_vec4, "modf", new Parameter(_vec4,"param1"), new Parameter(_vec4,"param2",_out)),
		         
		new Function(_int, "min", new Parameter(_int,"x"), new Parameter(_int,"y")),
		new Function(_ivec2, "min", new Parameter(_ivec2, "x"), new Parameter(_int, "y")),
		new Function(_ivec3, "min", new Parameter(_ivec3, "x"), new Parameter(_int, "y")),
		new Function(_ivec4, "min", new Parameter(_ivec4, "x"), new Parameter(_int, "y")),
		new Function(_ivec2, "min", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_ivec3, "min", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_ivec4, "min", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_uint, "min", new Parameter(_uint,"x"), new Parameter(_uint,"y")),
		new Function(_uvec2, "min", new Parameter(_uvec2, "x"), new Parameter(_uint, "y")),
		new Function(_uvec3, "min", new Parameter(_uvec3, "x"), new Parameter(_uint, "y")),
		new Function(_uvec4, "min", new Parameter(_uvec4, "x"), new Parameter(_uint, "y")),
		new Function(_uvec2, "min", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_uvec3, "min", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_uvec4, "min", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		         
		new Function(_int, "max", new Parameter(_int,"x"), new Parameter(_int,"y")),
		new Function(_ivec2, "max", new Parameter(_ivec2, "x"), new Parameter(_int, "y")),
		new Function(_ivec3, "max", new Parameter(_ivec3, "x"), new Parameter(_int, "y")),
		new Function(_ivec4, "max", new Parameter(_ivec4, "x"), new Parameter(_int, "y")),
		new Function(_ivec2, "max", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_ivec3, "max", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_ivec4, "max", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		
		new Function(_uint, "max", new Parameter(_uint,"x"), new Parameter(_uint,"y")),
		new Function(_uvec2, "max", new Parameter(_uvec2, "x"), new Parameter(_uint, "y")),
		new Function(_uvec3, "max", new Parameter(_uvec3, "x"), new Parameter(_uint, "y")),
		new Function(_uvec4, "max", new Parameter(_uvec4, "x"), new Parameter(_uint, "y")),
		new Function(_uvec2, "max", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_uvec3, "max", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_uvec4, "max", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		
		new Function(_int, "clamp", new Parameter(_int, "x"), new Parameter(_int, "minVal"), new Parameter(_int, "maxVal")),
		new Function(_ivec2, "clamp", new Parameter(_ivec2, "x"), new Parameter(_int, "minVal"), new Parameter(_int, "maxVal")),
		new Function(_ivec3, "clamp", new Parameter(_ivec3, "x"), new Parameter(_int, "minVal"), new Parameter(_int, "maxVal")),
		new Function(_ivec4, "clamp", new Parameter(_ivec4, "x"), new Parameter(_int, "minVal"), new Parameter(_int, "maxVal")),
		new Function(_ivec2, "clamp", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "minVal"), new Parameter(_ivec2, "maxVal")),
		new Function(_ivec3, "clamp", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "minVal"), new Parameter(_ivec3, "maxVal")),
		new Function(_ivec4, "clamp", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "minVal"), new Parameter(_ivec4, "maxVal")),
		
		new Function(_uint, "clamp", new Parameter(_uint, "x"), new Parameter(_uint, "minVal"), new Parameter(_uint, "maxVal")),
		new Function(_uvec2, "clamp", new Parameter(_uvec2, "x"), new Parameter(_uint, "minVal"), new Parameter(_uint, "maxVal")),
		new Function(_uvec3, "clamp", new Parameter(_uvec3, "x"), new Parameter(_uint, "minVal"), new Parameter(_uint, "maxVal")),
		new Function(_uvec4, "clamp", new Parameter(_uvec4, "x"), new Parameter(_uint, "minVal"), new Parameter(_uint, "maxVal")),
		new Function(_uvec2, "clamp", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "minVal"), new Parameter(_uvec2, "maxVal")),
		new Function(_uvec3, "clamp", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "minVal"), new Parameter(_uvec3, "maxVal")),
		new Function(_uvec4, "clamp", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "minVal"), new Parameter(_uvec4, "maxVal")),
		
		new Function(_float, "mix", new Parameter(_float, "x"), new Parameter(_float, "y"), new Parameter(_bool, "a")),
		new Function(_vec2, "mix", new Parameter(_vec2, "x"), new Parameter(_vec2, "y"), new Parameter(_bvec2, "a")),
		new Function(_vec3, "mix", new Parameter(_vec3, "x"), new Parameter(_vec3, "y"), new Parameter(_bvec3, "a")),
		new Function(_vec4, "mix", new Parameter(_vec4, "x"), new Parameter(_vec4, "y"), new Parameter(_bvec4, "a")),
		
		new Function(_bool, "isnan", new Parameter(_float, "x")),
		new Function(_bvec2, "isnan", new Parameter(_vec2, "x")),
		new Function(_bvec3, "isnan", new Parameter(_vec3, "x")),
		new Function(_bvec4, "isnan", new Parameter(_vec4, "x")),
		
		new Function(_bool, "isinf", new Parameter(_float, "x")),
		new Function(_bvec2, "isinf", new Parameter(_vec2, "x")),
		new Function(_bvec3, "isinf", new Parameter(_vec3, "x")),
		new Function(_bvec4, "isinf", new Parameter(_vec4, "x")),
		
		new Function(_uint, "atomicAdd", new Parameter(_uint, "var", _coherent, _volatile, _inout), new Parameter(_uint, "value")),
		new Function(_int, "atomicAdd", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicMin", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2")),
		new Function(_int, "atomicMin", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicMax", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2")),
		new Function(_int, "atomicMax", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicAnd", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2")),
		new Function(_int, "atomicAnd", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicOr", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2")),
		new Function(_int, "atomicOr", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicXor", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2")),
		new Function(_int, "atomicXor", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicExchange", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2")),
		new Function(_int, "atomicExchange", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2")),
		
		new Function(_uint, "atomicCompSwap", new Parameter(_uint, "param1", _coherent, _volatile, _inout), new Parameter(_uint, "param2"), new Parameter(_uint, "param3")),
		new Function(_int, "atomicCompSwap", new Parameter(_int, "param1", _coherent, _volatile, _inout), new Parameter(_int, "param2"), new Parameter(_int, "param3")),
		
		new Function(_int, "mix", new Parameter(_int, "x"), new Parameter(_int, "y"), new Parameter(_bool, "a")),
		new Function(_ivec2, "mix", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y"), new Parameter(_bvec2, "a")),
		new Function(_ivec3, "mix", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y"), new Parameter(_bvec3, "a")),
		new Function(_ivec4, "mix", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y"), new Parameter(_bvec4, "a")),
		
		new Function(_uint, "mix", new Parameter(_uint, "x"), new Parameter(_uint, "y"), new Parameter(_bool, "a")),
		new Function(_uvec2, "mix", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y"), new Parameter(_bvec2, "a")),
		new Function(_uvec3, "mix", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y"), new Parameter(_bvec3, "a")),
		new Function(_uvec4, "mix", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y"), new Parameter(_bvec4, "a")),
		
		new Function(_bool, "mix", new Parameter(_bool, "x"), new Parameter(_bool, "y"), new Parameter(_bool, "a")),
		new Function(_bvec2, "mix", new Parameter(_bvec2, "x"), new Parameter(_bvec2, "y"), new Parameter(_bvec2, "a")),
		new Function(_bvec3, "mix", new Parameter(_bvec3, "x"), new Parameter(_bvec3, "y"), new Parameter(_bvec3, "a")),
		new Function(_bvec4, "mix", new Parameter(_bvec4, "x"), new Parameter(_bvec4, "y"), new Parameter(_bvec4, "a")),
		
		
		
		new Function(_int, "floatBitsToInt", new Parameter(_float, "value")),
		new Function(_ivec2, "floatBitsToInt", new Parameter(_vec2, "value")),
		new Function(_ivec3, "floatBitsToInt", new Parameter(_vec3, "value")),
		new Function(_ivec4, "floatBitsToInt", new Parameter(_vec4, "value")),
		         
		new Function(_uint, "floatBitsToUint", new Parameter(_float, "value")),
		new Function(_uvec2, "floatBitsToUint", new Parameter(_vec2, "value")),
		new Function(_uvec3, "floatBitsToUint", new Parameter(_vec3, "value")),
		new Function(_uvec4, "floatBitsToUint", new Parameter(_vec4, "value")),
		         
		new Function(_float, "intBitsToFloat", new Parameter(_int, "value")),
		new Function(_vec2, "intBitsToFloat", new Parameter(_ivec2, "value")),
		new Function(_vec3, "intBitsToFloat", new Parameter(_ivec3, "value")),
		new Function(_vec4, "intBitsToFloat", new Parameter(_ivec4, "value")),
		         
		new Function(_float, "uintBitsToFloat", new Parameter(_uint, "value")),
		new Function(_vec2, "uintBitsToFloat", new Parameter(_uvec2, "value")),
		new Function(_vec3, "uintBitsToFloat", new Parameter(_uvec3, "value")),
		new Function(_vec4, "uintBitsToFloat", new Parameter(_uvec4, "value")),
		
		new Function(_float, "fma", new Parameter(_float,"param1"), new Parameter(_float,"param2"), new Parameter(_float, "param3")),
		new Function(_vec2, "fma", new Parameter(_vec2,"param1"), new Parameter(_vec2,"param2"), new Parameter(_vec2, "param3")),
		new Function(_vec3, "fma", new Parameter(_vec3,"param1"), new Parameter(_vec3,"param2"), new Parameter(_vec3, "param3")),
		new Function(_vec4, "fma", new Parameter(_vec4,"param1"), new Parameter(_vec4,"param2"), new Parameter(_vec4, "param3")),
		
		new Function(_double, "fma", new Parameter(_double,"param1"), new Parameter(_double,"param2"), new Parameter(_double, "param3")),
		new Function(_dvec2, "fma", new Parameter(_dvec2,"param1"), new Parameter(_dvec2,"param2"), new Parameter(_dvec2, "param3")),
		new Function(_dvec3, "fma", new Parameter(_dvec3,"param1"), new Parameter(_dvec3,"param2"), new Parameter(_dvec3, "param3")),
		new Function(_dvec4, "fma", new Parameter(_dvec4,"param1"), new Parameter(_dvec4,"param2"), new Parameter(_dvec4, "param3")),
		
		new Function(_qualified(_float, _highp), "frexp", new Parameter(_float, "param1", _highp), new Parameter(_int, "param2", _out, _highp)),
		new Function(_qualified(_vec2, _highp), "frexp", new Parameter(_vec2, "param1", _highp), new Parameter(_ivec2, "param2", _out, _highp)),
		new Function(_qualified(_vec3, _highp), "frexp", new Parameter(_vec3, "param1", _highp), new Parameter(_ivec3, "param2", _out, _highp)),
		new Function(_qualified(_vec4, _highp), "frexp", new Parameter(_vec4, "param1", _highp), new Parameter(_ivec4, "param2", _out, _highp)),
		
		new Function(_qualified(_float, _highp), "ldexp", new Parameter(_float, "param1", _highp), new Parameter(_int, "param2", _out, _highp)),
		new Function(_qualified(_vec2, _highp), "ldexp", new Parameter(_vec2, "param1", _highp), new Parameter(_ivec2, "param2", _out, _highp)),
		new Function(_qualified(_vec4, _highp), "ldexp", new Parameter(_vec3, "param1", _highp), new Parameter(_ivec3, "param2", _out, _highp)),
		new Function(_qualified(_vec4, _highp), "ldexp", new Parameter(_vec4, "param1", _highp), new Parameter(_ivec4, "param2", _out, _highp)),
		
		
		new Function(_double, "frexp", new Parameter(_double,"param1"), new Parameter(_int,"param2",_out)),
		new Function(_dvec2, "frexp", new Parameter(_dvec2,"param1"), new Parameter(_ivec2,"param2",_out)),
		new Function(_dvec3, "frexp", new Parameter(_dvec3,"param1"), new Parameter(_ivec3,"param2",_out)),
		new Function(_dvec4, "frexp", new Parameter(_dvec4,"param1"), new Parameter(_ivec4,"param2",_out)),
		
		new Function(_double, "ldexp", new Parameter(_double,"param1"), new Parameter(_int,"param2")),
		new Function(_dvec2, "ldexp", new Parameter(_dvec2,"param1"), new Parameter(_ivec2,"param2")),
		new Function(_dvec3, "ldexp", new Parameter(_dvec3,"param1"), new Parameter(_ivec3,"param2")),
		new Function(_dvec4, "ldexp", new Parameter(_dvec4,"param1"), new Parameter(_ivec4,"param2")),
		
		
		new Function(_double, "packDouble2x32", new Parameter(_uvec2, "param1")),
		new Function(_uvec2, "unpackDouble2x32", new Parameter(_double, "param1")),
		
		new Function(_qualified(_uint, _highp), "packUnorm2x16", new Parameter(_vec2, "")),
		new Function(_qualified(_vec2, _highp), "unpackUnorm2x16", new Parameter(_uint, "", _highp)),
		
		new Function(_qualified(_uint, _highp), "packSnorm2x16", new Parameter(_vec2, "")),
		new Function(_qualified(_vec2, _highp), "unpackSnorm2x16", new Parameter(_uint, "", _highp)),
		new Function(_qualified(_uint, _highp), "packHalf2x16", new Parameter(_vec2, "", _mediump)),
		new Function(_qualified(_vec2, _mediump), "unpackHalf2x16", new Parameter(_uint, "", _highp)),
		
		
		new Function(_qualified(_uint, _highp), "packSnorm4x8", new Parameter(_vec4, "", _mediump)),
		new Function(_qualified(_vec4, _mediump), "unpackSnorm4x8", new Parameter(_uint, "", _highp)),
		new Function(_qualified(_uint, _highp), "packUnorm4x8", new Parameter(_vec4, "", _mediump)),
		new Function(_qualified(_vec4, _mediump), "unpackUnorm4x8", new Parameter(_uint, "", _highp)),
		
		
		new Function(_float, "length", new Parameter(_float, "x")),
		new Function(_float, "length", new Parameter(_vec2, "x")),
		new Function(_float, "length", new Parameter(_vec3, "x")),
		new Function(_float, "length", new Parameter(_vec4, "x")),
		         
		new Function(_float, "distance", new Parameter(_float, "p0"), new Parameter(_float, "p1")),
		new Function(_float, "distance", new Parameter(_vec2, "p0"), new Parameter(_vec2, "p1")),
		new Function(_float, "distance", new Parameter(_vec3, "p0"), new Parameter(_vec3, "p1")),
		new Function(_float, "distance", new Parameter(_vec4, "p0"), new Parameter(_vec4, "p1")),
		         
		new Function(_float, "dot", new Parameter(_float, "x"), new Parameter(_float, "y")),
		new Function(_float, "dot", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_float, "dot", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_float, "dot", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_vec3, "cross", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_float, "normalize", new Parameter(_float, "x")),
		new Function(_vec2, "normalize", new Parameter(_vec2, "x")),
		new Function(_vec3, "normalize", new Parameter(_vec3, "x")),
		new Function(_vec4, "normalize", new Parameter(_vec4, "x")),
		         
		new Function(_float, "faceforward", new Parameter(_float, "N"), new Parameter(_float, "I"), new Parameter(_float, "Nref")),
		new Function(_vec2, "faceforward", new Parameter(_vec2, "N"), new Parameter(_vec2, "I"), new Parameter(_vec2, "Nref")),
		new Function(_vec3, "faceforward", new Parameter(_vec3, "N"), new Parameter(_vec3, "I"), new Parameter(_vec3, "Nref")),
		new Function(_vec4, "faceforward", new Parameter(_vec4, "N"), new Parameter(_vec4, "I"), new Parameter(_vec4, "Nref")),
		         
		new Function(_float, "reflect", new Parameter(_float, "I"), new Parameter(_float, "N")),
		new Function(_vec2, "reflect", new Parameter(_vec2, "I"), new Parameter(_vec2, "N")),
		new Function(_vec3, "reflect", new Parameter(_vec3, "I"), new Parameter(_vec3, "N")),
		new Function(_vec4, "reflect", new Parameter(_vec4, "I"), new Parameter(_vec4, "N")),
		         
		new Function(_float, "refract", new Parameter(_float, "I"), new Parameter(_float, "N"), new Parameter(_float, "eta")),
		new Function(_vec2, "refract", new Parameter(_vec2, "I"), new Parameter(_vec2, "N"), new Parameter(_float, "eta")),
		new Function(_vec3, "refract", new Parameter(_vec3, "I"), new Parameter(_vec3, "N"), new Parameter(_float, "eta")),
		new Function(_vec4, "refract", new Parameter(_vec4, "I"), new Parameter(_vec4, "N"), new Parameter(_float, "eta")),
		
		
		
		new Function(_mat2, "matrixCompMult", new Parameter(_mat2, "x"), new Parameter(_mat2, "y")),
		new Function(_mat3, "matrixCompMult", new Parameter(_mat3, "x"), new Parameter(_mat3, "y")),
		new Function(_mat4, "matrixCompMult", new Parameter(_mat4, "x"), new Parameter(_mat4, "y")),
		    
		new Function(_mat2, "outerProduct", new Parameter(_vec2, "c"), new Parameter(_vec2, "r")),
		new Function(_mat3, "outerProduct", new Parameter(_vec3, "c"), new Parameter(_vec3, "r")),
		new Function(_mat4, "outerProduct", new Parameter(_vec4, "c"), new Parameter(_vec4, "r")),
		new Function(_mat2x3, "outerProduct", new Parameter(_vec3, "c"), new Parameter(_vec2, "r")),
		new Function(_mat3x2, "outerProduct", new Parameter(_vec2, "c"), new Parameter(_vec3, "r")),
		new Function(_mat2x4, "outerProduct", new Parameter(_vec4, "c"), new Parameter(_vec2, "r")),
		new Function(_mat4x2, "outerProduct", new Parameter(_vec2, "c"), new Parameter(_vec4, "r")),
		new Function(_mat3x4, "outerProduct", new Parameter(_vec4, "c"), new Parameter(_vec3, "r")),
		new Function(_mat4x3, "outerProduct", new Parameter(_vec3, "c"), new Parameter(_vec4, "r")),
		         
		new Function(_mat2, "transpose", new Parameter(_mat2, "m")),
		new Function(_mat3, "transpose", new Parameter(_mat3, "m")),
		new Function(_mat4, "transpose", new Parameter(_mat4, "m")),
		new Function(_mat2x3, "transpose", new Parameter(_mat3x2, "m")),
		new Function(_mat3x2, "transpose", new Parameter(_mat2x3, "m")),
		new Function(_mat2x4, "transpose", new Parameter(_mat4x2, "m")),
		new Function(_mat4x2, "transpose", new Parameter(_mat2x4, "m")),
		new Function(_mat3x4, "transpose", new Parameter(_mat4x3, "m")),
		new Function(_mat4x3, "transpose", new Parameter(_mat3x4, "m")),
		
		new Function(_mat2x3, "matrixCompMult", new Parameter(_mat2x3,"param1"), new Parameter(_mat2x3,"param2")),
		new Function(_mat2x4, "matrixCompMult", new Parameter(_mat2x4,"param1"), new Parameter(_mat2x4,"param2")),
		new Function(_mat3x2, "matrixCompMult", new Parameter(_mat3x2,"param1"), new Parameter(_mat3x2,"param2")),
		new Function(_mat3x4, "matrixCompMult", new Parameter(_mat3x4,"param1"), new Parameter(_mat3x4,"param2")),
		new Function(_mat4x2, "matrixCompMult", new Parameter(_mat4x2,"param1"), new Parameter(_mat4x2,"param2")),
		new Function(_mat4x3, "matrixCompMult", new Parameter(_mat4x3,"param1"), new Parameter(_mat4x3,"param2")),          
		
		new Function(_float, "determinant", new Parameter(_mat2, "m")),
		new Function(_float, "determinant", new Parameter(_mat3, "m")),
		new Function(_float, "determinant", new Parameter(_mat4, "m")),
		         
		new Function(_mat2, "inverse", new Parameter(_mat2, "m")),
		new Function(_mat3, "inverse", new Parameter(_mat3, "m")),
		new Function(_mat4, "inverse", new Parameter(_mat4, "m")),
		    
		new Function(_bvec2, "lessThan", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_bvec3, "lessThan", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_bvec4, "lessThan", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_bvec2, "lessThan", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_bvec3, "lessThan", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_bvec4, "lessThan", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_bvec2, "lessThanEqual", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_bvec3, "lessThanEqual", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_bvec4, "lessThanEqual", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_bvec2, "lessThanEqual", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_bvec3, "lessThanEqual", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_bvec4, "lessThanEqual", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_bvec2, "greaterThan", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_bvec3, "greaterThan", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_bvec4, "greaterThan", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_bvec2, "greaterThan", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_bvec3, "greaterThan", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_bvec4, "greaterThan", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_bvec2, "greaterThanEqual", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_bvec3, "greaterThanEqual", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_bvec4, "greaterThanEqual", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_bvec2, "greaterThanEqual", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_bvec3, "greaterThanEqual", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_bvec4, "greaterThanEqual", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_bvec2, "equal", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_bvec3, "equal", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_bvec4, "equal", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_bvec2, "equal", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_bvec3, "equal", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_bvec4, "equal", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_bvec2, "equal", new Parameter(_bvec2, "x"), new Parameter(_bvec2, "y")),
		new Function(_bvec3, "equal", new Parameter(_bvec3, "x"), new Parameter(_bvec3, "y")),
		new Function(_bvec4, "equal", new Parameter(_bvec4, "x"), new Parameter(_bvec4, "y")),
		         
		new Function(_bvec2, "notEqual", new Parameter(_vec2, "x"), new Parameter(_vec2, "y")),
		new Function(_bvec3, "notEqual", new Parameter(_vec3, "x"), new Parameter(_vec3, "y")),
		new Function(_bvec4, "notEqual", new Parameter(_vec4, "x"), new Parameter(_vec4, "y")),
		         
		new Function(_bvec2, "notEqual", new Parameter(_ivec2, "x"), new Parameter(_ivec2, "y")),
		new Function(_bvec3, "notEqual", new Parameter(_ivec3, "x"), new Parameter(_ivec3, "y")),
		new Function(_bvec4, "notEqual", new Parameter(_ivec4, "x"), new Parameter(_ivec4, "y")),
		         
		new Function(_bvec2, "notEqual", new Parameter(_bvec2, "x"), new Parameter(_bvec2, "y")),
		new Function(_bvec3, "notEqual", new Parameter(_bvec3, "x"), new Parameter(_bvec3, "y")),
		new Function(_bvec4, "notEqual", new Parameter(_bvec4, "x"), new Parameter(_bvec4, "y")),
		         
		new Function(_bool, "any", new Parameter(_bvec2, "x")),
		new Function(_bool, "any", new Parameter(_bvec3, "x")),
		new Function(_bool, "any", new Parameter(_bvec4, "x")),
		         
		new Function(_bool, "all", new Parameter(_bvec2, "x")),
		new Function(_bool, "all", new Parameter(_bvec3, "x")),
		new Function(_bool, "all", new Parameter(_bvec4, "x")),
		         
		new Function(_bvec2, "not", new Parameter(_bvec2, "x")),
		new Function(_bvec3, "not", new Parameter(_bvec3, "x")),
		new Function(_bvec4, "not", new Parameter(_bvec4, "x")),
		     
		new Function(_bvec2, "lessThan", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_bvec3, "lessThan", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_bvec4, "lessThan", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		     
		new Function(_bvec2, "lessThanEqual", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_bvec3, "lessThanEqual", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_bvec4, "lessThanEqual", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		     
		new Function(_bvec2, "greaterThan", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_bvec3, "greaterThan", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_bvec4, "greaterThan", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		     
		new Function(_bvec2, "greaterThanEqual", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_bvec3, "greaterThanEqual", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_bvec4, "greaterThanEqual", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		     
		new Function(_bvec2, "equal", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_bvec3, "equal", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_bvec4, "equal", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),
		
		new Function(_bvec2, "notEqual", new Parameter(_uvec2, "x"), new Parameter(_uvec2, "y")),
		new Function(_bvec3, "notEqual", new Parameter(_uvec3, "x"), new Parameter(_uvec3, "y")),
		new Function(_bvec4, "notEqual", new Parameter(_uvec4, "x"), new Parameter(_uvec4, "y")),                 
		
		new Function(_vec4, "texture2D", new Parameter(_sampler2D,"param1"), new Parameter(_vec2,"param2")),
		
		new Function(_vec4, "texture2DProj", new Parameter(_sampler2D,"param1"), new Parameter(_vec3,"param2")),
		new Function(_vec4, "texture2DProj", new Parameter(_sampler2D,"param1"), new Parameter(_vec4,"param2")),
		
		new Function(_vec4, "texture3D", new Parameter(_sampler3D,"param1"), new Parameter(_vec3,"param2")),     // OES_texture_3D, but caught by keyword check
		new Function(_vec4, "texture3DProj", new Parameter(_sampler3D,"param1"), new Parameter(_vec4,"param2")), // OES_texture_3D, but caught by keyword check
		
		new Function(_vec4, "textureCube", new Parameter(_samplerCube,"param1"), new Parameter(_vec3,"param2")),
		
		new Function(_vec4, "texture1D", new Parameter(_sampler1D,"param1"), new Parameter(_float,"param2")),
		
		new Function(_vec4, "texture1DProj", new Parameter(_sampler1D,"param1"), new Parameter(_vec2,"param2")),
		new Function(_vec4, "texture1DProj", new Parameter(_sampler1D,"param1"), new Parameter(_vec4,"param2")),
		         
		new Function(_vec4, "shadow1D", new Parameter(_sampler1DShadow,"param1"), new Parameter(_vec3,"param2")),
		new Function(_vec4, "shadow2D", new Parameter(_sampler2DShadow,"param1"), new Parameter(_vec3,"param2")),
		new Function(_vec4, "shadow1DProj", new Parameter(_sampler1DShadow,"param1"), new Parameter(_vec4,"param2")),
		new Function(_vec4, "shadow2DProj", new Parameter(_sampler2DShadow,"param1"), new Parameter(_vec4,"param2")),
		
		new Function(_vec4, "texture2DRect", new Parameter(_sampler2DRect,"param1"), new Parameter(_vec2,"param2")),          // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "texture2DRectProj", new Parameter(_sampler2DRect,"param1"), new Parameter(_vec3,"param2")),      // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "texture2DRectProj", new Parameter(_sampler2DRect,"param1"), new Parameter(_vec4,"param2")),      // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "shadow2DRect", new Parameter(_sampler2DRectShadow,"param1"), new Parameter(_vec3,"param2")),     // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "shadow2DRectProj", new Parameter(_sampler2DRectShadow,"param1"), new Parameter(_vec4,"param2")), // GL_ARB_texture_rectangle, caught by keyword check
		
		new Function(_vec4, "texture2D", new Parameter(_samplerExternalOES, "param1"), new Parameter(_vec2, "coord")),  // GL_OES_EGL_image_external, caught by keyword check
		new Function(_vec4, "texture2DProj", new Parameter(_samplerExternalOES,"param1"), new Parameter(_vec3,"param2")),    // GL_OES_EGL_image_external, caught by keyword check
		new Function(_vec4, "texture2DProj", new Parameter(_samplerExternalOES,"param1"), new Parameter(_vec4,"param2")),    // GL_OES_EGL_image_external, caught by keyword check
		new Function(_vec4, "texture2DGradEXT", new Parameter(_sampler2D,"param1"), new Parameter(_vec2,"param2"), new Parameter(_vec2, "param3"), new Parameter(_vec2, "param4")),      // GL_EXT_shader_texture_lod
		new Function(_vec4, "texture2DProjGradEXT", new Parameter(_sampler2D,"param1"), new Parameter(_vec3,"param2"), new Parameter(_vec2, "param3"), new Parameter(_vec2, "param4")),  // GL_EXT_shader_texture_lod
		new Function(_vec4, "texture2DProjGradEXT", new Parameter(_sampler2D,"param1"), new Parameter(_vec4,"param2"), new Parameter(_vec2, "param3"), new Parameter(_vec2, "param4")),  // GL_EXT_shader_texture_lod
		new Function(_vec4, "textureCubeGradEXT", new Parameter(_samplerCube,"param1"), new Parameter(_vec3,"param2"), new Parameter(_vec3, "param3"), new Parameter(_vec3, "param4")),  // GL_EXT_shader_texture_lod
		
		new Function(_float, "noise1", new Parameter(_float, "x")),
		new Function(_float, "noise1", new Parameter(_vec2, "x")),
		new Function(_float, "noise1", new Parameter(_vec3, "x")),
		new Function(_float, "noise1", new Parameter(_vec4, "x")),
		         
		new Function(_vec2, "noise2", new Parameter(_float, "x")),
		new Function(_vec2, "noise2", new Parameter(_vec2, "x")),
		new Function(_vec2, "noise2", new Parameter(_vec3, "x")),
		new Function(_vec2, "noise2", new Parameter(_vec4, "x")),
		         
		new Function(_vec3, "noise3", new Parameter(_float, "x")),
		new Function(_vec3, "noise3", new Parameter(_vec2, "x")),
		new Function(_vec3, "noise3", new Parameter(_vec3, "x")),
		new Function(_vec3, "noise3", new Parameter(_vec4, "x")),
		         
		new Function(_vec4, "noise4", new Parameter(_float, "x")),
		new Function(_vec4, "noise4", new Parameter(_vec2, "x")),
		new Function(_vec4, "noise4", new Parameter(_vec3, "x")),
		new Function(_vec4, "noise4", new Parameter(_vec4, "x")),
		         
		new Function(_uint, "atomicCounterIncrement", new Parameter(_atomic_uint, "x")),
		new Function(_uint, "atomicCounterDecrement", new Parameter(_atomic_uint, "x")),
		new Function(_uint, "atomicCounter", new Parameter(_atomic_uint, "x")),
		
		
		
		new Function(_uint, "uaddCarry", new Parameter(_uint,"param1"), new Parameter(_uint,"param2"), new Parameter(_uint, "carry",_out)),
		new Function(_uvec2, "uaddCarry", new Parameter(_uvec2,"param1"), new Parameter(_uvec2,"param2"), new Parameter(_uvec2, "carry",_out)),
		new Function(_uvec3, "uaddCarry", new Parameter(_uvec3,"param1"), new Parameter(_uvec3,"param2"), new Parameter(_uvec3, "carry",_out)),
		new Function(_uvec4, "uaddCarry", new Parameter(_uvec4,"param1"), new Parameter(_uvec4,"param2"), new Parameter(_uvec4, "carry",_out)),
		
		new Function(_uint, "usubBorrow", new Parameter(_uint,"param1"), new Parameter(_uint,"param2"), new Parameter(_uint, "borrow",_out)),
		new Function(_uvec2, "usubBorrow", new Parameter(_uvec2,"param1"), new Parameter(_uvec2,"param2"), new Parameter(_uvec2, "borrow",_out)),
		new Function(_uvec3, "usubBorrow", new Parameter(_uvec3,"param1"), new Parameter(_uvec3,"param2"), new Parameter(_uvec3, "borrow",_out)),
		new Function(_uvec4, "usubBorrow", new Parameter(_uvec4,"param1"), new Parameter(_uvec4,"param2"), new Parameter(_uvec4, "borrow",_out)),
		
		new Function(_void, "umulExtended", new Parameter(_uint,"param1"), new Parameter(_uint,"param2"), new Parameter(_uint, "param3",_out), new Parameter(_uint, "lsb", _out)),
		new Function(_void, "umulExtended", new Parameter(_uvec2,"param1"), new Parameter(_uvec2,"param2"), new Parameter(_uvec2, "param3",_out), new Parameter(_uvec2, "lsb", _out)),
		new Function(_void, "umulExtended", new Parameter(_uvec3,"param1"), new Parameter(_uvec3,"param2"), new Parameter(_uvec3, "param3",_out), new Parameter(_uvec3, "lsb", _out)),
		new Function(_void, "umulExtended", new Parameter(_uvec4,"param1"), new Parameter(_uvec4,"param2"), new Parameter(_uvec4, "param3",_out), new Parameter(_uvec4, "lsb", _out)),
		
		new Function(_void, "imulExtended", new Parameter(_int,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3",_out), new Parameter(_int, "lsb", _out)),
		new Function(_void, "imulExtended", new Parameter(_ivec2,"param1"), new Parameter(_ivec2,"param2"), new Parameter(_ivec2, "param3",_out), new Parameter(_ivec2, "lsb", _out)),
		new Function(_void, "imulExtended", new Parameter(_ivec3,"param1"), new Parameter(_ivec3,"param2"), new Parameter(_ivec3, "param3",_out), new Parameter(_ivec3, "lsb", _out)),
		new Function(_void, "imulExtended", new Parameter(_ivec4,"param1"), new Parameter(_ivec4,"param2"), new Parameter(_ivec4, "param3",_out), new Parameter(_ivec4, "lsb", _out)),
		
		new Function(_int, "bitfieldExtract", new Parameter(_int,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		new Function(_ivec2, "bitfieldExtract", new Parameter(_ivec2,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		new Function(_ivec3, "bitfieldExtract", new Parameter(_ivec3,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		new Function(_ivec4, "bitfieldExtract", new Parameter(_ivec4,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		
		new Function(_uint, "bitfieldExtract", new Parameter(_uint,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		new Function(_uvec2, "bitfieldExtract", new Parameter(_uvec2,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		new Function(_uvec3, "bitfieldExtract", new Parameter(_uvec3,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		new Function(_uvec4, "bitfieldExtract", new Parameter(_uvec4,"param1"), new Parameter(_int,"param2"), new Parameter(_int, "param3")),
		
		new Function(_int, "bitfieldInsert", new Parameter(_int, "base"), new Parameter(_int), new Parameter(_int), new Parameter(_int)),
		new Function(_ivec2, "bitfieldInsert", new Parameter(_ivec2, "base"), new Parameter(_ivec2), new Parameter(_int), new Parameter(_int)),
		new Function(_ivec3, "bitfieldInsert", new Parameter(_ivec3, "base"), new Parameter(_ivec3), new Parameter(_int), new Parameter(_int)),
		new Function(_ivec4, "bitfieldInsert", new Parameter(_ivec4, "base"), new Parameter(_ivec4), new Parameter(_int), new Parameter(_int)),
		
		new Function(_uint, "bitfieldInsert", new Parameter(_uint, "base"), new Parameter(_uint), new Parameter(_int), new Parameter(_int)),
		new Function(_uvec2, "bitfieldInsert", new Parameter(_uvec2, "base"), new Parameter(_uvec2), new Parameter(_int), new Parameter(_int)),
		new Function(_uvec3, "bitfieldInsert", new Parameter(_uvec3, "base"), new Parameter(_uvec3), new Parameter(_int), new Parameter(_int)),
		new Function(_uvec4, "bitfieldInsert", new Parameter(_uvec4, "base"), new Parameter(_uvec4), new Parameter(_int), new Parameter(_int)),
		
		new Function(_int, "bitfieldReverse", new Parameter(_int)),
		new Function(_ivec2, "bitfieldReverse", new Parameter(_ivec2)),
		new Function(_ivec3, "bitfieldReverse", new Parameter(_ivec3)),
		new Function(_ivec4, "bitfieldReverse", new Parameter(_ivec4)),
		
		new Function(_uint, "bitfieldReverse", new Parameter(_uint)),
		new Function(_uvec2, "bitfieldReverse", new Parameter(_uvec2)),
		new Function(_uvec3, "bitfieldReverse", new Parameter(_uvec3)),
		new Function(_uvec4, "bitfieldReverse", new Parameter(_uvec4)),
		
		new Function(_int, "bitCount", new Parameter(_int)),
		new Function(_ivec2, "bitCount", new Parameter(_ivec2)),
		new Function(_ivec3, "bitCount", new Parameter(_ivec3)),
		new Function(_ivec4, "bitCount", new Parameter(_ivec4)),
		
		new Function(_int, "bitCount", new Parameter(_uint)),
		new Function(_ivec2, "bitCount", new Parameter(_uvec2)),
		new Function(_ivec3, "bitCount", new Parameter(_uvec3)),
		new Function(_ivec4, "bitCount", new Parameter(_uvec4)),
		
		new Function(_int, "findLSB", new Parameter(_int)),
		new Function(_ivec2, "findLSB", new Parameter(_ivec2)),
		new Function(_ivec3, "findLSB", new Parameter(_ivec3)),
		new Function(_ivec4, "findLSB", new Parameter(_ivec4)),
		
		new Function(_int, "findLSB", new Parameter(_uint)),
		new Function(_ivec2, "findLSB", new Parameter(_uvec2)),
		new Function(_ivec3, "findLSB", new Parameter(_uvec3)),
		new Function(_ivec4, "findLSB", new Parameter(_uvec4)),
		
		new Function(_int, "findMSB", new Parameter(_int)),
		new Function(_ivec2, "findMSB", new Parameter(_ivec2)),
		new Function(_ivec3, "findMSB", new Parameter(_ivec3)),
		new Function(_ivec4, "findMSB", new Parameter(_ivec4)),
		
		new Function(_int, "findMSB", new Parameter(_uint)),
		new Function(_ivec2, "findMSB", new Parameter(_uvec2)),
		new Function(_ivec3, "findMSB", new Parameter(_uvec3)),
		new Function(_ivec4, "findMSB", new Parameter(_uvec4)),
    };
	
	
}
