package org.cakelab.glsl.lang.ast;


import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Qualifier.SubroutineQualifier;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.ast.types.Type.AssignabilityVerdict;

public class Function extends NodeImpl implements Comparable<Function> {

	public static class Key {
		String name;
		Type[] parameterTypes;

		public Key(String name, Type[] parameterTypes) {
			super();
			this.name = name;
			this.parameterTypes = parameterTypes;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + Arrays.hashCode(parameterTypes);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (!Arrays.equals(parameterTypes, other.parameterTypes))
				return false;
			return true;
		}
		
	}



	public static class Body extends ScopeImpl {
		public Body(IScope parent, ParameterDeclaration[] parameters) {
			super(parent);
			for (ParameterDeclaration p : parameters) {
				if (p.name != null) {
					addVariable(p);
					p.setScope(this);
				}
			}
		}
	}
	
	protected final Type type;
	final String name;
	final ParameterDeclaration[] parameters;
	Body body;
	
	
	@Override
	public int compareTo(Function that) {
		int result = this.name.compareTo(that.name);
		
		if (result != 0) return result;
		
		ParameterDeclaration[] this_parameters = params_or_void(this.parameters);
		ParameterDeclaration[] that_parameters = params_or_void(that.parameters);
		
		result = this_parameters.length - that_parameters.length;
		if (result != 0) return result;
		
		for (int i = 0; i < this_parameters.length; i++) {
			ParameterDeclaration p = that_parameters[i];
			result = p.type.compareTo(this_parameters[i].type);
			if (result != 0) return result;
		}
		return 0;
	}
	

	
	private static ParameterDeclaration[] params_or_void(ParameterDeclaration[] parameters) {
		if (isVoidParameterList(parameters)) {
			return ParameterDeclaration.VOID_PARAM_LIST;
		} else {
			return parameters;
		}
	}



	public Function(Interval interval, Type type, String name, ParameterDeclaration ... parameters) {
		assert (type != null) : "internal error: return type of a function cannot be null";
		assert (name != null) : "internal error: name of a function cannot be null";
		super.setInterval(interval);
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}

	public Function(Function that) {
		super(that);
		this.type = that.type;
		this.name = that.name;
		this.parameters = that.parameters;
	}



	/** Compares the given sequence of types to the types of the parameters of this function.
	 *  Considers void functions, meaning that an empty (or null) list of parameter types equals void.*/
	public Type.AssignabilityVerdict compareParameters(Type[] parameterTypes) {
		// think positive!
		Type.AssignabilityVerdict result = Type.AssignabilityVerdict.Direct;
		
		if (parameters == null || parameters.length == 0 || parameters[0].type == Type._void) {
			// short cut for void functions
			if (isVoidArgumentList(parameterTypes)) {
				result = Type.AssignabilityVerdict.NotAssignable;
			}
		} else {
			// this function has parameters (not void)
			if (parameterTypes == null || parameterTypes.length == 0) {
				// other function is void function
				result = Type.AssignabilityVerdict.NotAssignable;
			} else {
				// both have parameters
				if (parameters.length != parameterTypes.length) {
					// shortcut: functions have different number of parameters
					result = Type.AssignabilityVerdict.NotAssignable;
				} else {
					// comparison of all parameters
					for (int i = 0; i < parameters.length; i++) {
						Type.AssignabilityVerdict assignability = parameters[i].getType().assignability(parameterTypes[i]);
						if (result.betterThan(assignability)) {
							result = assignability;
							if (result.worseThan(AssignabilityVerdict.ImplictCastable)) {
								return result;
							}
						}
					}
				}
			}
		}
		return result;
	}


	
	
	public String toString() {
		String signature = type.toString() + " " + this.name + "(";
		for (int i = 0; i < parameters.length; i++) {
			ParameterDeclaration p = parameters[i]; 
			signature += p.toString();
			if (i+1 < parameters.length) {
				signature += ", ";
			}
		}
		signature += ")";
		return signature;
	}


	
	public Body createBody(IScope parentScope) {
		this.body = new Body(parentScope, parameters);
		return this.body;
	}
	
	public Value call(Value[] args) {
		throw new Error("not yet implemented");
	}



	public String getName() {
		return name;
	}



	public Type getType() {
		return type;
	}



	public Type[] getParameterTypes() {
		if (this.parameters == null || this.parameters.length == 0) return null;
		
		Type[] result = new Type[this.parameters.length];
		for (int i = 0; i < parameters.length; i++) {
			result[i] = parameters[i].type;
		}
		
		return result;
	}



	public Body getBody() {
		return body;
	}



	public static boolean isVoidArgumentList(Type[] argumentTypes) {
		return argumentTypes == null || argumentTypes.length == 0 || (argumentTypes.length == 1 && argumentTypes[0] == Type._void);
	}

	public static boolean isVoidParameterList(ParameterDeclaration[] argumentTypes) {
		return argumentTypes == null || argumentTypes.length == 0 || (argumentTypes.length == 1 && argumentTypes[0].type == Type._void);
	}



	public boolean isSubroutinePrototype() {
		if (type.hasQualifiers()) {
			for (Qualifier q : type.getQualifiers()) {
				if (q instanceof SubroutineQualifier) {
					SubroutineQualifier sub = (SubroutineQualifier) q;
					return sub.functions == null || sub.functions.length == 0;
				}
			}
		}
		return false;
	}



	
}
