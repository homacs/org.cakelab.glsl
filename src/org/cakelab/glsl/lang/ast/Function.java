package org.cakelab.glsl.lang.ast;


import static org.cakelab.glsl.lang.ast.Qualifier.*;
import static org.cakelab.glsl.lang.ast.Type.*;

public class Function implements Comparable<Function> {

	public static class Body extends Scope {
		public Body(Scope parent, ParameterDeclaration[] parameters) {
			super(parent);
			for (ParameterDeclaration p : parameters) {
				if (p.name != null) {
					addVariable(p.name, p);
				}
			}
		}
	}
	
	final Type type;
	final String name;
	final ParameterDeclaration[] parameters;
	Body body;
	
	@Override
	public int compareTo(Function that) {
		int result = this.name.compareTo(that.name);
		
		if (result != 0) return result;
		
		result = this.parameters.length - that.parameters.length;
		if (result != 0) return result;
		
		for (int i = 0; i < parameters.length; i++) {
			ParameterDeclaration p = that.parameters[i];
			result = p.type.compareTo(parameters[i].type);
			if (result != 0) return result;
		}
		return 0;
	}
	

	
	public Function(Type type, String name, ParameterDeclaration ... parameters) {
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}

	public Body createBody(Scope parentScope) {
		this.body = new Body(parentScope, parameters);
		return this.body;
	}
	
	public Value call(Value[] args) {
		throw new Error("not yet implemented");
	}


	
	public static final Function[] BUILTIN_FUNCTIONS = {
		new Function(_float, "radians", new ParameterDeclaration(_float, "degrees")),
		new Function(_vec2, "radians", new ParameterDeclaration(_vec2, "degrees")),
		new Function(_vec3, "radians", new ParameterDeclaration(_vec3, "degrees")),
		new Function(_vec4, "radians", new ParameterDeclaration(_vec4, "degrees")),
		         
		new Function(_float, "degrees", new ParameterDeclaration(_float, "radians")),
		new Function(_vec2, "degrees", new ParameterDeclaration(_vec2, "radians")),
		new Function(_vec3, "degrees", new ParameterDeclaration(_vec3, "radians")),
		new Function(_vec4, "degrees", new ParameterDeclaration(_vec4, "radians")),
		         
		new Function(_float, "sin", new ParameterDeclaration(_float, "angle")),
		new Function(_vec2, "sin", new ParameterDeclaration(_vec2, "angle")),
		new Function(_vec3, "sin", new ParameterDeclaration(_vec3, "angle")),
		new Function(_vec4, "sin", new ParameterDeclaration(_vec4, "angle")),
		         
		new Function(_float, "cos", new ParameterDeclaration(_float, "angle")),
		new Function(_vec2, "cos", new ParameterDeclaration(_vec2, "angle")),
		new Function(_vec3, "cos", new ParameterDeclaration(_vec3, "angle")),
		new Function(_vec4, "cos", new ParameterDeclaration(_vec4, "angle")),
		         
		new Function(_float, "tan", new ParameterDeclaration(_float, "angle")),
		new Function(_vec2, "tan", new ParameterDeclaration(_vec2, "angle")),
		new Function(_vec3, "tan", new ParameterDeclaration(_vec3, "angle")),
		new Function(_vec4, "tan", new ParameterDeclaration(_vec4, "angle")),
		         
		new Function(_float, "asin", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "asin", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "asin", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "asin", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "acos", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "acos", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "acos", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "acos", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "atan", new ParameterDeclaration(_float, "y"), new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "atan", new ParameterDeclaration(_vec2, "y"), new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "atan", new ParameterDeclaration(_vec3, "y"), new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "atan", new ParameterDeclaration(_vec4, "y"), new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "atan", new ParameterDeclaration(_float, "y_over_x")),
		new Function(_vec2, "atan", new ParameterDeclaration(_vec2, "y_over_x")),
		new Function(_vec3, "atan", new ParameterDeclaration(_vec3, "y_over_x")),
		new Function(_vec4, "atan", new ParameterDeclaration(_vec4, "y_over_x")),
		
		
		new Function(_float, "sinh", new ParameterDeclaration(_float, "angle")),
		new Function(_vec2, "sinh", new ParameterDeclaration(_vec2, "angle")),
		new Function(_vec3, "sinh", new ParameterDeclaration(_vec3, "angle")),
		new Function(_vec4, "sinh", new ParameterDeclaration(_vec4, "angle")),
		     
		new Function(_float, "cosh", new ParameterDeclaration(_float, "angle")),
		new Function(_vec2, "cosh", new ParameterDeclaration(_vec2, "angle")),
		new Function(_vec3, "cosh", new ParameterDeclaration(_vec3, "angle")),
		new Function(_vec4, "cosh", new ParameterDeclaration(_vec4, "angle")),
		     
		new Function(_float, "tanh", new ParameterDeclaration(_float, "angle")),
		new Function(_vec2, "tanh", new ParameterDeclaration(_vec2, "angle")),
		new Function(_vec3, "tanh", new ParameterDeclaration(_vec3, "angle")),
		new Function(_vec4, "tanh", new ParameterDeclaration(_vec4, "angle")),
		     
		new Function(_float, "asinh", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "asinh", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "asinh", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "asinh", new ParameterDeclaration(_vec4, "x")),
		     
		new Function(_float, "acosh", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "acosh", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "acosh", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "acosh", new ParameterDeclaration(_vec4, "x")),
		     
		new Function(_float, "atanh", new ParameterDeclaration(_float, "y_over_x")),
		new Function(_vec2, "atanh", new ParameterDeclaration(_vec2, "y_over_x")),
		new Function(_vec3, "atanh", new ParameterDeclaration(_vec3, "y_over_x")),
		new Function(_vec4, "atanh", new ParameterDeclaration(_vec4, "y_over_x")),
		
		
		new Function(_float, "pow", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "pow", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_vec3, "pow", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_vec4, "pow", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_float, "exp", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "exp", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "exp", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "exp", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "log", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "log", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "log", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "log", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "exp2", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "exp2", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "exp2", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "exp2", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "log2", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "log2", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "log2", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "log2", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "sqrt", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "sqrt", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "sqrt", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "sqrt", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "inversesqrt", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "inversesqrt", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "inversesqrt", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "inversesqrt", new ParameterDeclaration(_vec4, "x")),
		
		
		new Function(_float, "abs", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "abs", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "abs", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "abs", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "sign", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "sign", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "sign", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "sign", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "floor", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "floor", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "floor", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "floor", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "ceil", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "ceil", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "ceil", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "ceil", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "fract", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "fract", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "fract", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "fract", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "mod", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "mod", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec3, "mod", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec4, "mod", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "mod", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_vec3, "mod", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_vec4, "mod", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_float, "min", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "min", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec3, "min", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec4, "min", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "min", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_vec3, "min", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_vec4, "min", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_float, "max", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "max", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec3, "max", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec4, "max", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_vec2, "max", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_vec3, "max", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_vec4, "max", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_float, "clamp", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "minVal"), new ParameterDeclaration(_float, "maxVal")),
		new Function(_vec2, "clamp", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_float, "minVal"), new ParameterDeclaration(_float, "maxVal")),
		new Function(_vec3, "clamp", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_float, "minVal"), new ParameterDeclaration(_float, "maxVal")),
		new Function(_vec4, "clamp", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_float, "minVal"), new ParameterDeclaration(_float, "maxVal")),
		new Function(_vec2, "clamp", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "minVal"), new ParameterDeclaration(_vec2, "maxVal")),
		new Function(_vec3, "clamp", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "minVal"), new ParameterDeclaration(_vec3, "maxVal")),
		new Function(_vec4, "clamp", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "minVal"), new ParameterDeclaration(_vec4, "maxVal")),
		         
		new Function(_float, "mix", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y"), new ParameterDeclaration(_float, "a")),
		new Function(_vec2, "mix", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y"), new ParameterDeclaration(_float, "a")),
		new Function(_vec3, "mix", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y"), new ParameterDeclaration(_float, "a")),
		new Function(_vec4, "mix", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y"), new ParameterDeclaration(_float, "a")),
		new Function(_vec2, "mix", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y"), new ParameterDeclaration(_vec2, "a")),
		new Function(_vec3, "mix", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y"), new ParameterDeclaration(_vec3, "a")),
		new Function(_vec4, "mix", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y"), new ParameterDeclaration(_vec4, "a")),
		
		new Function(_float, "step", new ParameterDeclaration(_float, "edge"), new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "step", new ParameterDeclaration(_vec2, "edge"), new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "step", new ParameterDeclaration(_vec3, "edge"), new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "step", new ParameterDeclaration(_vec4, "edge"), new ParameterDeclaration(_vec4, "x")),
		new Function(_vec2, "step", new ParameterDeclaration(_float, "edge"), new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "step", new ParameterDeclaration(_float, "edge"), new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "step", new ParameterDeclaration(_float, "edge"), new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "smoothstep", new ParameterDeclaration(_float, "edge0"), new ParameterDeclaration(_float, "edge1"), new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "smoothstep", new ParameterDeclaration(_vec2, "edge0"), new ParameterDeclaration(_vec2, "edge1"), new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "smoothstep", new ParameterDeclaration(_vec3, "edge0"), new ParameterDeclaration(_vec3, "edge1"), new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "smoothstep", new ParameterDeclaration(_vec4, "edge0"), new ParameterDeclaration(_vec4, "edge1"), new ParameterDeclaration(_vec4, "x")),
		new Function(_vec2, "smoothstep", new ParameterDeclaration(_float, "edge0"), new ParameterDeclaration(_float, "edge1"), new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "smoothstep", new ParameterDeclaration(_float, "edge0"), new ParameterDeclaration(_float, "edge1"), new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "smoothstep", new ParameterDeclaration(_float, "edge0"), new ParameterDeclaration(_float, "edge1"), new ParameterDeclaration(_vec4, "x")),
		    
		new Function(_int, "abs", new ParameterDeclaration(_int,"x")),
		new Function(_ivec2, "abs", new ParameterDeclaration(_ivec2, "x")),
		new Function(_ivec3, "abs", new ParameterDeclaration(_ivec3, "x")),
		new Function(_ivec4, "abs", new ParameterDeclaration(_ivec4, "x")),
		
		new Function(_int, "sign", new ParameterDeclaration(_int,"x")),
		new Function(_ivec2, "sign", new ParameterDeclaration(_ivec2, "x")),
		new Function(_ivec3, "sign", new ParameterDeclaration(_ivec3, "x")),
		new Function(_ivec4, "sign", new ParameterDeclaration(_ivec4, "x")),
		
		new Function(_float, "trunc", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "trunc", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "trunc", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "trunc", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "round", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "round", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "round", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "round", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "roundEven", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "roundEven", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "roundEven", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "roundEven", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "modf", new ParameterDeclaration(_float,"param1"), new ParameterDeclaration(_float,"param2",_out)),
		new Function(_vec2, "modf", new ParameterDeclaration(_vec2,"param1"), new ParameterDeclaration(_vec2,"param2",_out)),
		new Function(_vec3, "modf", new ParameterDeclaration(_vec3,"param1"), new ParameterDeclaration(_vec3,"param2",_out)),
		new Function(_vec4, "modf", new ParameterDeclaration(_vec4,"param1"), new ParameterDeclaration(_vec4,"param2",_out)),
		         
		new Function(_int, "min", new ParameterDeclaration(_int,"x"), new ParameterDeclaration(_int,"y")),
		new Function(_ivec2, "min", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_int, "y")),
		new Function(_ivec3, "min", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_int, "y")),
		new Function(_ivec4, "min", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_int, "y")),
		new Function(_ivec2, "min", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_ivec3, "min", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_ivec4, "min", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_uint, "min", new ParameterDeclaration(_uint,"x"), new ParameterDeclaration(_uint,"y")),
		new Function(_uvec2, "min", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uint, "y")),
		new Function(_uvec3, "min", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uint, "y")),
		new Function(_uvec4, "min", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uint, "y")),
		new Function(_uvec2, "min", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_uvec3, "min", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_uvec4, "min", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		         
		new Function(_int, "max", new ParameterDeclaration(_int,"x"), new ParameterDeclaration(_int,"y")),
		new Function(_ivec2, "max", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_int, "y")),
		new Function(_ivec3, "max", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_int, "y")),
		new Function(_ivec4, "max", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_int, "y")),
		new Function(_ivec2, "max", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_ivec3, "max", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_ivec4, "max", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		
		new Function(_uint, "max", new ParameterDeclaration(_uint,"x"), new ParameterDeclaration(_uint,"y")),
		new Function(_uvec2, "max", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uint, "y")),
		new Function(_uvec3, "max", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uint, "y")),
		new Function(_uvec4, "max", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uint, "y")),
		new Function(_uvec2, "max", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_uvec3, "max", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_uvec4, "max", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		
		new Function(_int, "clamp", new ParameterDeclaration(_int, "x"), new ParameterDeclaration(_int, "minVal"), new ParameterDeclaration(_int, "maxVal")),
		new Function(_ivec2, "clamp", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_int, "minVal"), new ParameterDeclaration(_int, "maxVal")),
		new Function(_ivec3, "clamp", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_int, "minVal"), new ParameterDeclaration(_int, "maxVal")),
		new Function(_ivec4, "clamp", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_int, "minVal"), new ParameterDeclaration(_int, "maxVal")),
		new Function(_ivec2, "clamp", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "minVal"), new ParameterDeclaration(_ivec2, "maxVal")),
		new Function(_ivec3, "clamp", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "minVal"), new ParameterDeclaration(_ivec3, "maxVal")),
		new Function(_ivec4, "clamp", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "minVal"), new ParameterDeclaration(_ivec4, "maxVal")),
		
		new Function(_uint, "clamp", new ParameterDeclaration(_uint, "x"), new ParameterDeclaration(_uint, "minVal"), new ParameterDeclaration(_uint, "maxVal")),
		new Function(_uvec2, "clamp", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uint, "minVal"), new ParameterDeclaration(_uint, "maxVal")),
		new Function(_uvec3, "clamp", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uint, "minVal"), new ParameterDeclaration(_uint, "maxVal")),
		new Function(_uvec4, "clamp", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uint, "minVal"), new ParameterDeclaration(_uint, "maxVal")),
		new Function(_uvec2, "clamp", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "minVal"), new ParameterDeclaration(_uvec2, "maxVal")),
		new Function(_uvec3, "clamp", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "minVal"), new ParameterDeclaration(_uvec3, "maxVal")),
		new Function(_uvec4, "clamp", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "minVal"), new ParameterDeclaration(_uvec4, "maxVal")),
		
		new Function(_float, "mix", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y"), new ParameterDeclaration(_bool, "a")),
		new Function(_vec2, "mix", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y"), new ParameterDeclaration(_bvec2, "a")),
		new Function(_vec3, "mix", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y"), new ParameterDeclaration(_bvec3, "a")),
		new Function(_vec4, "mix", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y"), new ParameterDeclaration(_bvec4, "a")),
		
		new Function(_bool, "isnan", new ParameterDeclaration(_float, "x")),
		new Function(_bvec2, "isnan", new ParameterDeclaration(_vec2, "x")),
		new Function(_bvec3, "isnan", new ParameterDeclaration(_vec3, "x")),
		new Function(_bvec4, "isnan", new ParameterDeclaration(_vec4, "x")),
		
		new Function(_bool, "isinf", new ParameterDeclaration(_float, "x")),
		new Function(_bvec2, "isinf", new ParameterDeclaration(_vec2, "x")),
		new Function(_bvec3, "isinf", new ParameterDeclaration(_vec3, "x")),
		new Function(_bvec4, "isinf", new ParameterDeclaration(_vec4, "x")),
		
		new Function(_uint, "atomicAdd", new ParameterDeclaration(_uint, "var", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "value")),
		new Function(_int, "atomicAdd", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicMin", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2")),
		new Function(_int, "atomicMin", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicMax", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2")),
		new Function(_int, "atomicMax", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicAnd", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2")),
		new Function(_int, "atomicAnd", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicOr", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2")),
		new Function(_int, "atomicOr", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicXor", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2")),
		new Function(_int, "atomicXor", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicExchange", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2")),
		new Function(_int, "atomicExchange", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2")),
		
		new Function(_uint, "atomicCompSwap", new ParameterDeclaration(_uint, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_uint, "param2"), new ParameterDeclaration(_uint, "param3")),
		new Function(_int, "atomicCompSwap", new ParameterDeclaration(_int, "param1", _coherent, _volatile, _inout), new ParameterDeclaration(_int, "param2"), new ParameterDeclaration(_int, "param3")),
		
		new Function(_int, "mix", new ParameterDeclaration(_int, "x"), new ParameterDeclaration(_int, "y"), new ParameterDeclaration(_bool, "a")),
		new Function(_ivec2, "mix", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y"), new ParameterDeclaration(_bvec2, "a")),
		new Function(_ivec3, "mix", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y"), new ParameterDeclaration(_bvec3, "a")),
		new Function(_ivec4, "mix", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y"), new ParameterDeclaration(_bvec4, "a")),
		
		new Function(_uint, "mix", new ParameterDeclaration(_uint, "x"), new ParameterDeclaration(_uint, "y"), new ParameterDeclaration(_bool, "a")),
		new Function(_uvec2, "mix", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y"), new ParameterDeclaration(_bvec2, "a")),
		new Function(_uvec3, "mix", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y"), new ParameterDeclaration(_bvec3, "a")),
		new Function(_uvec4, "mix", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y"), new ParameterDeclaration(_bvec4, "a")),
		
		new Function(_bool, "mix", new ParameterDeclaration(_bool, "x"), new ParameterDeclaration(_bool, "y"), new ParameterDeclaration(_bool, "a")),
		new Function(_bvec2, "mix", new ParameterDeclaration(_bvec2, "x"), new ParameterDeclaration(_bvec2, "y"), new ParameterDeclaration(_bvec2, "a")),
		new Function(_bvec3, "mix", new ParameterDeclaration(_bvec3, "x"), new ParameterDeclaration(_bvec3, "y"), new ParameterDeclaration(_bvec3, "a")),
		new Function(_bvec4, "mix", new ParameterDeclaration(_bvec4, "x"), new ParameterDeclaration(_bvec4, "y"), new ParameterDeclaration(_bvec4, "a")),
		
		
		
		new Function(_int, "floatBitsToInt", new ParameterDeclaration(_float, "value")),
		new Function(_ivec2, "floatBitsToInt", new ParameterDeclaration(_vec2, "value")),
		new Function(_ivec3, "floatBitsToInt", new ParameterDeclaration(_vec3, "value")),
		new Function(_ivec4, "floatBitsToInt", new ParameterDeclaration(_vec4, "value")),
		         
		new Function(_uint, "floatBitsToUint", new ParameterDeclaration(_float, "value")),
		new Function(_uvec2, "floatBitsToUint", new ParameterDeclaration(_vec2, "value")),
		new Function(_uvec3, "floatBitsToUint", new ParameterDeclaration(_vec3, "value")),
		new Function(_uvec4, "floatBitsToUint", new ParameterDeclaration(_vec4, "value")),
		         
		new Function(_float, "intBitsToFloat", new ParameterDeclaration(_int, "value")),
		new Function(_vec2, "intBitsToFloat", new ParameterDeclaration(_ivec2, "value")),
		new Function(_vec3, "intBitsToFloat", new ParameterDeclaration(_ivec3, "value")),
		new Function(_vec4, "intBitsToFloat", new ParameterDeclaration(_ivec4, "value")),
		         
		new Function(_float, "uintBitsToFloat", new ParameterDeclaration(_uint, "value")),
		new Function(_vec2, "uintBitsToFloat", new ParameterDeclaration(_uvec2, "value")),
		new Function(_vec3, "uintBitsToFloat", new ParameterDeclaration(_uvec3, "value")),
		new Function(_vec4, "uintBitsToFloat", new ParameterDeclaration(_uvec4, "value")),
		
		new Function(_float, "fma", new ParameterDeclaration(_float,"param1"), new ParameterDeclaration(_float,"param2"), new ParameterDeclaration(_float, "param3")),
		new Function(_vec2, "fma", new ParameterDeclaration(_vec2,"param1"), new ParameterDeclaration(_vec2,"param2"), new ParameterDeclaration(_vec2, "param3")),
		new Function(_vec3, "fma", new ParameterDeclaration(_vec3,"param1"), new ParameterDeclaration(_vec3,"param2"), new ParameterDeclaration(_vec3, "param3")),
		new Function(_vec4, "fma", new ParameterDeclaration(_vec4,"param1"), new ParameterDeclaration(_vec4,"param2"), new ParameterDeclaration(_vec4, "param3")),
		
		new Function(_double, "fma", new ParameterDeclaration(_double,"param1"), new ParameterDeclaration(_double,"param2"), new ParameterDeclaration(_double, "param3")),
		new Function(_dvec2, "fma", new ParameterDeclaration(_dvec2,"param1"), new ParameterDeclaration(_dvec2,"param2"), new ParameterDeclaration(_dvec2, "param3")),
		new Function(_dvec3, "fma", new ParameterDeclaration(_dvec3,"param1"), new ParameterDeclaration(_dvec3,"param2"), new ParameterDeclaration(_dvec3, "param3")),
		new Function(_dvec4, "fma", new ParameterDeclaration(_dvec4,"param1"), new ParameterDeclaration(_dvec4,"param2"), new ParameterDeclaration(_dvec4, "param3")),
		
		new Function(_qualified(_float, _highp), "frexp", new ParameterDeclaration(_float, "param1", _highp), new ParameterDeclaration(_int, "param2", _out, _highp)),
		new Function(_qualified(_vec2, _highp), "frexp", new ParameterDeclaration(_vec2, "param1", _highp), new ParameterDeclaration(_ivec2, "param2", _out, _highp)),
		new Function(_qualified(_vec3, _highp), "frexp", new ParameterDeclaration(_vec3, "param1", _highp), new ParameterDeclaration(_ivec3, "param2", _out, _highp)),
		new Function(_qualified(_vec4, _highp), "frexp", new ParameterDeclaration(_vec4, "param1", _highp), new ParameterDeclaration(_ivec4, "param2", _out, _highp)),
		
		new Function(_qualified(_float, _highp), "ldexp", new ParameterDeclaration(_float, "param1", _highp), new ParameterDeclaration(_int, "param2", _out, _highp)),
		new Function(_qualified(_vec2, _highp), "ldexp", new ParameterDeclaration(_vec2, "param1", _highp), new ParameterDeclaration(_ivec2, "param2", _out, _highp)),
		new Function(_qualified(_vec4, _highp), "ldexp", new ParameterDeclaration(_vec3, "param1", _highp), new ParameterDeclaration(_ivec3, "param2", _out, _highp)),
		new Function(_qualified(_vec4, _highp), "ldexp", new ParameterDeclaration(_vec4, "param1", _highp), new ParameterDeclaration(_ivec4, "param2", _out, _highp)),
		
		
		new Function(_double, "frexp", new ParameterDeclaration(_double,"param1"), new ParameterDeclaration(_int,"param2",_out)),
		new Function(_dvec2, "frexp", new ParameterDeclaration(_dvec2,"param1"), new ParameterDeclaration(_ivec2,"param2",_out)),
		new Function(_dvec3, "frexp", new ParameterDeclaration(_dvec3,"param1"), new ParameterDeclaration(_ivec3,"param2",_out)),
		new Function(_dvec4, "frexp", new ParameterDeclaration(_dvec4,"param1"), new ParameterDeclaration(_ivec4,"param2",_out)),
		
		new Function(_double, "ldexp", new ParameterDeclaration(_double,"param1"), new ParameterDeclaration(_int,"param2")),
		new Function(_dvec2, "ldexp", new ParameterDeclaration(_dvec2,"param1"), new ParameterDeclaration(_ivec2,"param2")),
		new Function(_dvec3, "ldexp", new ParameterDeclaration(_dvec3,"param1"), new ParameterDeclaration(_ivec3,"param2")),
		new Function(_dvec4, "ldexp", new ParameterDeclaration(_dvec4,"param1"), new ParameterDeclaration(_ivec4,"param2")),
		
		
		new Function(_double, "packDouble2x32", new ParameterDeclaration(_uvec2, "param1")),
		new Function(_uvec2, "unpackDouble2x32", new ParameterDeclaration(_double, "param1")),
		
		new Function(_qualified(_uint, _highp), "packUnorm2x16", new ParameterDeclaration(_vec2, "")),
		new Function(_qualified(_vec2, _highp), "unpackUnorm2x16", new ParameterDeclaration(_uint, "", _highp)),
		
		new Function(_qualified(_uint, _highp), "packSnorm2x16", new ParameterDeclaration(_vec2, "")),
		new Function(_qualified(_vec2, _highp), "unpackSnorm2x16", new ParameterDeclaration(_uint, "", _highp)),
		new Function(_qualified(_uint, _highp), "packHalf2x16", new ParameterDeclaration(_vec2, "", _mediump)),
		new Function(_qualified(_vec2, _mediump), "unpackHalf2x16", new ParameterDeclaration(_uint, "", _highp)),
		
		
		new Function(_qualified(_uint, _highp), "packSnorm4x8", new ParameterDeclaration(_vec4, "", _mediump)),
		new Function(_qualified(_vec4, _mediump), "unpackSnorm4x8", new ParameterDeclaration(_uint, "", _highp)),
		new Function(_qualified(_uint, _highp), "packUnorm4x8", new ParameterDeclaration(_vec4, "", _mediump)),
		new Function(_qualified(_vec4, _mediump), "unpackUnorm4x8", new ParameterDeclaration(_uint, "", _highp)),
		
		
		new Function(_float, "length", new ParameterDeclaration(_float, "x")),
		new Function(_float, "length", new ParameterDeclaration(_vec2, "x")),
		new Function(_float, "length", new ParameterDeclaration(_vec3, "x")),
		new Function(_float, "length", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "distance", new ParameterDeclaration(_float, "p0"), new ParameterDeclaration(_float, "p1")),
		new Function(_float, "distance", new ParameterDeclaration(_vec2, "p0"), new ParameterDeclaration(_vec2, "p1")),
		new Function(_float, "distance", new ParameterDeclaration(_vec3, "p0"), new ParameterDeclaration(_vec3, "p1")),
		new Function(_float, "distance", new ParameterDeclaration(_vec4, "p0"), new ParameterDeclaration(_vec4, "p1")),
		         
		new Function(_float, "dot", new ParameterDeclaration(_float, "x"), new ParameterDeclaration(_float, "y")),
		new Function(_float, "dot", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_float, "dot", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_float, "dot", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_vec3, "cross", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_float, "normalize", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "normalize", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "normalize", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "normalize", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_float, "faceforward", new ParameterDeclaration(_float, "N"), new ParameterDeclaration(_float, "I"), new ParameterDeclaration(_float, "Nref")),
		new Function(_vec2, "faceforward", new ParameterDeclaration(_vec2, "N"), new ParameterDeclaration(_vec2, "I"), new ParameterDeclaration(_vec2, "Nref")),
		new Function(_vec3, "faceforward", new ParameterDeclaration(_vec3, "N"), new ParameterDeclaration(_vec3, "I"), new ParameterDeclaration(_vec3, "Nref")),
		new Function(_vec4, "faceforward", new ParameterDeclaration(_vec4, "N"), new ParameterDeclaration(_vec4, "I"), new ParameterDeclaration(_vec4, "Nref")),
		         
		new Function(_float, "reflect", new ParameterDeclaration(_float, "I"), new ParameterDeclaration(_float, "N")),
		new Function(_vec2, "reflect", new ParameterDeclaration(_vec2, "I"), new ParameterDeclaration(_vec2, "N")),
		new Function(_vec3, "reflect", new ParameterDeclaration(_vec3, "I"), new ParameterDeclaration(_vec3, "N")),
		new Function(_vec4, "reflect", new ParameterDeclaration(_vec4, "I"), new ParameterDeclaration(_vec4, "N")),
		         
		new Function(_float, "refract", new ParameterDeclaration(_float, "I"), new ParameterDeclaration(_float, "N"), new ParameterDeclaration(_float, "eta")),
		new Function(_vec2, "refract", new ParameterDeclaration(_vec2, "I"), new ParameterDeclaration(_vec2, "N"), new ParameterDeclaration(_float, "eta")),
		new Function(_vec3, "refract", new ParameterDeclaration(_vec3, "I"), new ParameterDeclaration(_vec3, "N"), new ParameterDeclaration(_float, "eta")),
		new Function(_vec4, "refract", new ParameterDeclaration(_vec4, "I"), new ParameterDeclaration(_vec4, "N"), new ParameterDeclaration(_float, "eta")),
		
		
		
		new Function(_mat2, "matrixCompMult", new ParameterDeclaration(_mat2, "x"), new ParameterDeclaration(_mat2, "y")),
		new Function(_mat3, "matrixCompMult", new ParameterDeclaration(_mat3, "x"), new ParameterDeclaration(_mat3, "y")),
		new Function(_mat4, "matrixCompMult", new ParameterDeclaration(_mat4, "x"), new ParameterDeclaration(_mat4, "y")),
		    
		new Function(_mat2, "outerProduct", new ParameterDeclaration(_vec2, "c"), new ParameterDeclaration(_vec2, "r")),
		new Function(_mat3, "outerProduct", new ParameterDeclaration(_vec3, "c"), new ParameterDeclaration(_vec3, "r")),
		new Function(_mat4, "outerProduct", new ParameterDeclaration(_vec4, "c"), new ParameterDeclaration(_vec4, "r")),
		new Function(_mat2x3, "outerProduct", new ParameterDeclaration(_vec3, "c"), new ParameterDeclaration(_vec2, "r")),
		new Function(_mat3x2, "outerProduct", new ParameterDeclaration(_vec2, "c"), new ParameterDeclaration(_vec3, "r")),
		new Function(_mat2x4, "outerProduct", new ParameterDeclaration(_vec4, "c"), new ParameterDeclaration(_vec2, "r")),
		new Function(_mat4x2, "outerProduct", new ParameterDeclaration(_vec2, "c"), new ParameterDeclaration(_vec4, "r")),
		new Function(_mat3x4, "outerProduct", new ParameterDeclaration(_vec4, "c"), new ParameterDeclaration(_vec3, "r")),
		new Function(_mat4x3, "outerProduct", new ParameterDeclaration(_vec3, "c"), new ParameterDeclaration(_vec4, "r")),
		         
		new Function(_mat2, "transpose", new ParameterDeclaration(_mat2, "m")),
		new Function(_mat3, "transpose", new ParameterDeclaration(_mat3, "m")),
		new Function(_mat4, "transpose", new ParameterDeclaration(_mat4, "m")),
		new Function(_mat2x3, "transpose", new ParameterDeclaration(_mat3x2, "m")),
		new Function(_mat3x2, "transpose", new ParameterDeclaration(_mat2x3, "m")),
		new Function(_mat2x4, "transpose", new ParameterDeclaration(_mat4x2, "m")),
		new Function(_mat4x2, "transpose", new ParameterDeclaration(_mat2x4, "m")),
		new Function(_mat3x4, "transpose", new ParameterDeclaration(_mat4x3, "m")),
		new Function(_mat4x3, "transpose", new ParameterDeclaration(_mat3x4, "m")),
		
		new Function(_mat2x3, "matrixCompMult", new ParameterDeclaration(_mat2x3,"param1"), new ParameterDeclaration(_mat2x3,"param2")),
		new Function(_mat2x4, "matrixCompMult", new ParameterDeclaration(_mat2x4,"param1"), new ParameterDeclaration(_mat2x4,"param2")),
		new Function(_mat3x2, "matrixCompMult", new ParameterDeclaration(_mat3x2,"param1"), new ParameterDeclaration(_mat3x2,"param2")),
		new Function(_mat3x4, "matrixCompMult", new ParameterDeclaration(_mat3x4,"param1"), new ParameterDeclaration(_mat3x4,"param2")),
		new Function(_mat4x2, "matrixCompMult", new ParameterDeclaration(_mat4x2,"param1"), new ParameterDeclaration(_mat4x2,"param2")),
		new Function(_mat4x3, "matrixCompMult", new ParameterDeclaration(_mat4x3,"param1"), new ParameterDeclaration(_mat4x3,"param2")),          
		
		new Function(_float, "determinant", new ParameterDeclaration(_mat2, "m")),
		new Function(_float, "determinant", new ParameterDeclaration(_mat3, "m")),
		new Function(_float, "determinant", new ParameterDeclaration(_mat4, "m")),
		         
		new Function(_mat2, "inverse", new ParameterDeclaration(_mat2, "m")),
		new Function(_mat3, "inverse", new ParameterDeclaration(_mat3, "m")),
		new Function(_mat4, "inverse", new ParameterDeclaration(_mat4, "m")),
		    
		new Function(_bvec2, "lessThan", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_bvec3, "lessThan", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_bvec4, "lessThan", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_bvec2, "lessThan", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_bvec3, "lessThan", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_bvec4, "lessThan", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_bvec2, "lessThanEqual", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_bvec3, "lessThanEqual", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_bvec4, "lessThanEqual", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_bvec2, "lessThanEqual", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_bvec3, "lessThanEqual", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_bvec4, "lessThanEqual", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_bvec2, "greaterThan", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_bvec3, "greaterThan", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_bvec4, "greaterThan", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_bvec2, "greaterThan", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_bvec3, "greaterThan", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_bvec4, "greaterThan", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_bvec2, "greaterThanEqual", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_bvec3, "greaterThanEqual", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_bvec4, "greaterThanEqual", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_bvec2, "greaterThanEqual", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_bvec3, "greaterThanEqual", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_bvec4, "greaterThanEqual", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_bvec2, "equal", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_bvec3, "equal", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_bvec4, "equal", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_bvec2, "equal", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_bvec3, "equal", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_bvec4, "equal", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_bvec2, "equal", new ParameterDeclaration(_bvec2, "x"), new ParameterDeclaration(_bvec2, "y")),
		new Function(_bvec3, "equal", new ParameterDeclaration(_bvec3, "x"), new ParameterDeclaration(_bvec3, "y")),
		new Function(_bvec4, "equal", new ParameterDeclaration(_bvec4, "x"), new ParameterDeclaration(_bvec4, "y")),
		         
		new Function(_bvec2, "notEqual", new ParameterDeclaration(_vec2, "x"), new ParameterDeclaration(_vec2, "y")),
		new Function(_bvec3, "notEqual", new ParameterDeclaration(_vec3, "x"), new ParameterDeclaration(_vec3, "y")),
		new Function(_bvec4, "notEqual", new ParameterDeclaration(_vec4, "x"), new ParameterDeclaration(_vec4, "y")),
		         
		new Function(_bvec2, "notEqual", new ParameterDeclaration(_ivec2, "x"), new ParameterDeclaration(_ivec2, "y")),
		new Function(_bvec3, "notEqual", new ParameterDeclaration(_ivec3, "x"), new ParameterDeclaration(_ivec3, "y")),
		new Function(_bvec4, "notEqual", new ParameterDeclaration(_ivec4, "x"), new ParameterDeclaration(_ivec4, "y")),
		         
		new Function(_bvec2, "notEqual", new ParameterDeclaration(_bvec2, "x"), new ParameterDeclaration(_bvec2, "y")),
		new Function(_bvec3, "notEqual", new ParameterDeclaration(_bvec3, "x"), new ParameterDeclaration(_bvec3, "y")),
		new Function(_bvec4, "notEqual", new ParameterDeclaration(_bvec4, "x"), new ParameterDeclaration(_bvec4, "y")),
		         
		new Function(_bool, "any", new ParameterDeclaration(_bvec2, "x")),
		new Function(_bool, "any", new ParameterDeclaration(_bvec3, "x")),
		new Function(_bool, "any", new ParameterDeclaration(_bvec4, "x")),
		         
		new Function(_bool, "all", new ParameterDeclaration(_bvec2, "x")),
		new Function(_bool, "all", new ParameterDeclaration(_bvec3, "x")),
		new Function(_bool, "all", new ParameterDeclaration(_bvec4, "x")),
		         
		new Function(_bvec2, "not", new ParameterDeclaration(_bvec2, "x")),
		new Function(_bvec3, "not", new ParameterDeclaration(_bvec3, "x")),
		new Function(_bvec4, "not", new ParameterDeclaration(_bvec4, "x")),
		     
		new Function(_bvec2, "lessThan", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_bvec3, "lessThan", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_bvec4, "lessThan", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		     
		new Function(_bvec2, "lessThanEqual", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_bvec3, "lessThanEqual", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_bvec4, "lessThanEqual", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		     
		new Function(_bvec2, "greaterThan", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_bvec3, "greaterThan", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_bvec4, "greaterThan", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		     
		new Function(_bvec2, "greaterThanEqual", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_bvec3, "greaterThanEqual", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_bvec4, "greaterThanEqual", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		     
		new Function(_bvec2, "equal", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_bvec3, "equal", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_bvec4, "equal", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),
		
		new Function(_bvec2, "notEqual", new ParameterDeclaration(_uvec2, "x"), new ParameterDeclaration(_uvec2, "y")),
		new Function(_bvec3, "notEqual", new ParameterDeclaration(_uvec3, "x"), new ParameterDeclaration(_uvec3, "y")),
		new Function(_bvec4, "notEqual", new ParameterDeclaration(_uvec4, "x"), new ParameterDeclaration(_uvec4, "y")),                 
		
		new Function(_vec4, "texture2D", new ParameterDeclaration(_sampler2D,"param1"), new ParameterDeclaration(_vec2,"param2")),
		
		new Function(_vec4, "texture2DProj", new ParameterDeclaration(_sampler2D,"param1"), new ParameterDeclaration(_vec3,"param2")),
		new Function(_vec4, "texture2DProj", new ParameterDeclaration(_sampler2D,"param1"), new ParameterDeclaration(_vec4,"param2")),
		
		new Function(_vec4, "texture3D", new ParameterDeclaration(_sampler3D,"param1"), new ParameterDeclaration(_vec3,"param2")),     // OES_texture_3D, but caught by keyword check
		new Function(_vec4, "texture3DProj", new ParameterDeclaration(_sampler3D,"param1"), new ParameterDeclaration(_vec4,"param2")), // OES_texture_3D, but caught by keyword check
		
		new Function(_vec4, "textureCube", new ParameterDeclaration(_samplerCube,"param1"), new ParameterDeclaration(_vec3,"param2")),
		
		new Function(_vec4, "texture1D", new ParameterDeclaration(_sampler1D,"param1"), new ParameterDeclaration(_float,"param2")),
		
		new Function(_vec4, "texture1DProj", new ParameterDeclaration(_sampler1D,"param1"), new ParameterDeclaration(_vec2,"param2")),
		new Function(_vec4, "texture1DProj", new ParameterDeclaration(_sampler1D,"param1"), new ParameterDeclaration(_vec4,"param2")),
		         
		new Function(_vec4, "shadow1D", new ParameterDeclaration(_sampler1DShadow,"param1"), new ParameterDeclaration(_vec3,"param2")),
		new Function(_vec4, "shadow2D", new ParameterDeclaration(_sampler2DShadow,"param1"), new ParameterDeclaration(_vec3,"param2")),
		new Function(_vec4, "shadow1DProj", new ParameterDeclaration(_sampler1DShadow,"param1"), new ParameterDeclaration(_vec4,"param2")),
		new Function(_vec4, "shadow2DProj", new ParameterDeclaration(_sampler2DShadow,"param1"), new ParameterDeclaration(_vec4,"param2")),
		
		new Function(_vec4, "texture2DRect", new ParameterDeclaration(_sampler2DRect,"param1"), new ParameterDeclaration(_vec2,"param2")),          // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "texture2DRectProj", new ParameterDeclaration(_sampler2DRect,"param1"), new ParameterDeclaration(_vec3,"param2")),      // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "texture2DRectProj", new ParameterDeclaration(_sampler2DRect,"param1"), new ParameterDeclaration(_vec4,"param2")),      // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "shadow2DRect", new ParameterDeclaration(_sampler2DRectShadow,"param1"), new ParameterDeclaration(_vec3,"param2")),     // GL_ARB_texture_rectangle, caught by keyword check
		new Function(_vec4, "shadow2DRectProj", new ParameterDeclaration(_sampler2DRectShadow,"param1"), new ParameterDeclaration(_vec4,"param2")), // GL_ARB_texture_rectangle, caught by keyword check
		
		new Function(_vec4, "texture2D", new ParameterDeclaration(_samplerExternalOES, "param1"), new ParameterDeclaration(_vec2, "coord")),  // GL_OES_EGL_image_external, caught by keyword check
		new Function(_vec4, "texture2DProj", new ParameterDeclaration(_samplerExternalOES,"param1"), new ParameterDeclaration(_vec3,"param2")),    // GL_OES_EGL_image_external, caught by keyword check
		new Function(_vec4, "texture2DProj", new ParameterDeclaration(_samplerExternalOES,"param1"), new ParameterDeclaration(_vec4,"param2")),    // GL_OES_EGL_image_external, caught by keyword check
		new Function(_vec4, "texture2DGradEXT", new ParameterDeclaration(_sampler2D,"param1"), new ParameterDeclaration(_vec2,"param2"), new ParameterDeclaration(_vec2, "param3"), new ParameterDeclaration(_vec2, "param4")),      // GL_EXT_shader_texture_lod
		new Function(_vec4, "texture2DProjGradEXT", new ParameterDeclaration(_sampler2D,"param1"), new ParameterDeclaration(_vec3,"param2"), new ParameterDeclaration(_vec2, "param3"), new ParameterDeclaration(_vec2, "param4")),  // GL_EXT_shader_texture_lod
		new Function(_vec4, "texture2DProjGradEXT", new ParameterDeclaration(_sampler2D,"param1"), new ParameterDeclaration(_vec4,"param2"), new ParameterDeclaration(_vec2, "param3"), new ParameterDeclaration(_vec2, "param4")),  // GL_EXT_shader_texture_lod
		new Function(_vec4, "textureCubeGradEXT", new ParameterDeclaration(_samplerCube,"param1"), new ParameterDeclaration(_vec3,"param2"), new ParameterDeclaration(_vec3, "param3"), new ParameterDeclaration(_vec3, "param4")),  // GL_EXT_shader_texture_lod
		
		new Function(_float, "noise1", new ParameterDeclaration(_float, "x")),
		new Function(_float, "noise1", new ParameterDeclaration(_vec2, "x")),
		new Function(_float, "noise1", new ParameterDeclaration(_vec3, "x")),
		new Function(_float, "noise1", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_vec2, "noise2", new ParameterDeclaration(_float, "x")),
		new Function(_vec2, "noise2", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec2, "noise2", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec2, "noise2", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_vec3, "noise3", new ParameterDeclaration(_float, "x")),
		new Function(_vec3, "noise3", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec3, "noise3", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec3, "noise3", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_vec4, "noise4", new ParameterDeclaration(_float, "x")),
		new Function(_vec4, "noise4", new ParameterDeclaration(_vec2, "x")),
		new Function(_vec4, "noise4", new ParameterDeclaration(_vec3, "x")),
		new Function(_vec4, "noise4", new ParameterDeclaration(_vec4, "x")),
		         
		new Function(_uint, "atomicCounterIncrement", new ParameterDeclaration(_atomic_uint, "x")),
		new Function(_uint, "atomicCounterDecrement", new ParameterDeclaration(_atomic_uint, "x")),
		new Function(_uint, "atomicCounter", new ParameterDeclaration(_atomic_uint, "x")),
		
		
		
		new Function(_uint, "uaddCarry", new ParameterDeclaration(_uint,"param1"), new ParameterDeclaration(_uint,"param2"), new ParameterDeclaration(_uint, "carry",_out)),
		new Function(_uvec2, "uaddCarry", new ParameterDeclaration(_uvec2,"param1"), new ParameterDeclaration(_uvec2,"param2"), new ParameterDeclaration(_uvec2, "carry",_out)),
		new Function(_uvec3, "uaddCarry", new ParameterDeclaration(_uvec3,"param1"), new ParameterDeclaration(_uvec3,"param2"), new ParameterDeclaration(_uvec3, "carry",_out)),
		new Function(_uvec4, "uaddCarry", new ParameterDeclaration(_uvec4,"param1"), new ParameterDeclaration(_uvec4,"param2"), new ParameterDeclaration(_uvec4, "carry",_out)),
		
		new Function(_uint, "usubBorrow", new ParameterDeclaration(_uint,"param1"), new ParameterDeclaration(_uint,"param2"), new ParameterDeclaration(_uint, "borrow",_out)),
		new Function(_uvec2, "usubBorrow", new ParameterDeclaration(_uvec2,"param1"), new ParameterDeclaration(_uvec2,"param2"), new ParameterDeclaration(_uvec2, "borrow",_out)),
		new Function(_uvec3, "usubBorrow", new ParameterDeclaration(_uvec3,"param1"), new ParameterDeclaration(_uvec3,"param2"), new ParameterDeclaration(_uvec3, "borrow",_out)),
		new Function(_uvec4, "usubBorrow", new ParameterDeclaration(_uvec4,"param1"), new ParameterDeclaration(_uvec4,"param2"), new ParameterDeclaration(_uvec4, "borrow",_out)),
		
		new Function(_void, "umulExtended", new ParameterDeclaration(_uint,"param1"), new ParameterDeclaration(_uint,"param2"), new ParameterDeclaration(_uint, "param3",_out), new ParameterDeclaration(_uint, "lsb", _out)),
		new Function(_void, "umulExtended", new ParameterDeclaration(_uvec2,"param1"), new ParameterDeclaration(_uvec2,"param2"), new ParameterDeclaration(_uvec2, "param3",_out), new ParameterDeclaration(_uvec2, "lsb", _out)),
		new Function(_void, "umulExtended", new ParameterDeclaration(_uvec3,"param1"), new ParameterDeclaration(_uvec3,"param2"), new ParameterDeclaration(_uvec3, "param3",_out), new ParameterDeclaration(_uvec3, "lsb", _out)),
		new Function(_void, "umulExtended", new ParameterDeclaration(_uvec4,"param1"), new ParameterDeclaration(_uvec4,"param2"), new ParameterDeclaration(_uvec4, "param3",_out), new ParameterDeclaration(_uvec4, "lsb", _out)),
		
		new Function(_void, "imulExtended", new ParameterDeclaration(_int,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3",_out), new ParameterDeclaration(_int, "lsb", _out)),
		new Function(_void, "imulExtended", new ParameterDeclaration(_ivec2,"param1"), new ParameterDeclaration(_ivec2,"param2"), new ParameterDeclaration(_ivec2, "param3",_out), new ParameterDeclaration(_ivec2, "lsb", _out)),
		new Function(_void, "imulExtended", new ParameterDeclaration(_ivec3,"param1"), new ParameterDeclaration(_ivec3,"param2"), new ParameterDeclaration(_ivec3, "param3",_out), new ParameterDeclaration(_ivec3, "lsb", _out)),
		new Function(_void, "imulExtended", new ParameterDeclaration(_ivec4,"param1"), new ParameterDeclaration(_ivec4,"param2"), new ParameterDeclaration(_ivec4, "param3",_out), new ParameterDeclaration(_ivec4, "lsb", _out)),
		
		new Function(_int, "bitfieldExtract", new ParameterDeclaration(_int,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		new Function(_ivec2, "bitfieldExtract", new ParameterDeclaration(_ivec2,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		new Function(_ivec3, "bitfieldExtract", new ParameterDeclaration(_ivec3,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		new Function(_ivec4, "bitfieldExtract", new ParameterDeclaration(_ivec4,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		
		new Function(_uint, "bitfieldExtract", new ParameterDeclaration(_uint,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		new Function(_uvec2, "bitfieldExtract", new ParameterDeclaration(_uvec2,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		new Function(_uvec3, "bitfieldExtract", new ParameterDeclaration(_uvec3,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		new Function(_uvec4, "bitfieldExtract", new ParameterDeclaration(_uvec4,"param1"), new ParameterDeclaration(_int,"param2"), new ParameterDeclaration(_int, "param3")),
		
		new Function(_int, "bitfieldInsert", new ParameterDeclaration(_int, "base"), new ParameterDeclaration(_int), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		new Function(_ivec2, "bitfieldInsert", new ParameterDeclaration(_ivec2, "base"), new ParameterDeclaration(_ivec2), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		new Function(_ivec3, "bitfieldInsert", new ParameterDeclaration(_ivec3, "base"), new ParameterDeclaration(_ivec3), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		new Function(_ivec4, "bitfieldInsert", new ParameterDeclaration(_ivec4, "base"), new ParameterDeclaration(_ivec4), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		
		new Function(_uint, "bitfieldInsert", new ParameterDeclaration(_uint, "base"), new ParameterDeclaration(_uint), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		new Function(_uvec2, "bitfieldInsert", new ParameterDeclaration(_uvec2, "base"), new ParameterDeclaration(_uvec2), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		new Function(_uvec3, "bitfieldInsert", new ParameterDeclaration(_uvec3, "base"), new ParameterDeclaration(_uvec3), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		new Function(_uvec4, "bitfieldInsert", new ParameterDeclaration(_uvec4, "base"), new ParameterDeclaration(_uvec4), new ParameterDeclaration(_int), new ParameterDeclaration(_int)),
		
		new Function(_int, "bitfieldReverse", new ParameterDeclaration(_int)),
		new Function(_ivec2, "bitfieldReverse", new ParameterDeclaration(_ivec2)),
		new Function(_ivec3, "bitfieldReverse", new ParameterDeclaration(_ivec3)),
		new Function(_ivec4, "bitfieldReverse", new ParameterDeclaration(_ivec4)),
		
		new Function(_uint, "bitfieldReverse", new ParameterDeclaration(_uint)),
		new Function(_uvec2, "bitfieldReverse", new ParameterDeclaration(_uvec2)),
		new Function(_uvec3, "bitfieldReverse", new ParameterDeclaration(_uvec3)),
		new Function(_uvec4, "bitfieldReverse", new ParameterDeclaration(_uvec4)),
		
		new Function(_int, "bitCount", new ParameterDeclaration(_int)),
		new Function(_ivec2, "bitCount", new ParameterDeclaration(_ivec2)),
		new Function(_ivec3, "bitCount", new ParameterDeclaration(_ivec3)),
		new Function(_ivec4, "bitCount", new ParameterDeclaration(_ivec4)),
		
		new Function(_int, "bitCount", new ParameterDeclaration(_uint)),
		new Function(_ivec2, "bitCount", new ParameterDeclaration(_uvec2)),
		new Function(_ivec3, "bitCount", new ParameterDeclaration(_uvec3)),
		new Function(_ivec4, "bitCount", new ParameterDeclaration(_uvec4)),
		
		new Function(_int, "findLSB", new ParameterDeclaration(_int)),
		new Function(_ivec2, "findLSB", new ParameterDeclaration(_ivec2)),
		new Function(_ivec3, "findLSB", new ParameterDeclaration(_ivec3)),
		new Function(_ivec4, "findLSB", new ParameterDeclaration(_ivec4)),
		
		new Function(_int, "findLSB", new ParameterDeclaration(_uint)),
		new Function(_ivec2, "findLSB", new ParameterDeclaration(_uvec2)),
		new Function(_ivec3, "findLSB", new ParameterDeclaration(_uvec3)),
		new Function(_ivec4, "findLSB", new ParameterDeclaration(_uvec4)),
		
		new Function(_int, "findMSB", new ParameterDeclaration(_int)),
		new Function(_ivec2, "findMSB", new ParameterDeclaration(_ivec2)),
		new Function(_ivec3, "findMSB", new ParameterDeclaration(_ivec3)),
		new Function(_ivec4, "findMSB", new ParameterDeclaration(_ivec4)),
		
		new Function(_int, "findMSB", new ParameterDeclaration(_uint)),
		new Function(_ivec2, "findMSB", new ParameterDeclaration(_uvec2)),
		new Function(_ivec3, "findMSB", new ParameterDeclaration(_uvec3)),
		new Function(_ivec4, "findMSB", new ParameterDeclaration(_uvec4)),
		
		// TODO [2] list of builtin functions unfinished
    };

	
}
