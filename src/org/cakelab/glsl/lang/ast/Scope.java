package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Scope {
	static class Builtin extends Scope {
		Builtin() {
			super(null);
			for (Type t : Type.BUILTIN_TYPES) {
				types.put(t.signature, t);
			}
			for (Function f : Function.BUILTIN_FUNCTIONS) {
				super.addFunction(f);
			}
		}
	}

	public static final Scope BUILTIN_SCOPE = new Builtin();
	
	protected Scope parent;
	ArrayList<Scope> children = new ArrayList<Scope>();
	
	HashMap<String, ArrayList<Function>> functions = new HashMap<String, ArrayList<Function>>();
	HashMap<String, Variable> variables = new HashMap<String, Variable>();
	HashMap<String, Type> types = new HashMap<String, Type>();
	
	
	
	public Scope(Scope parent) {
		this.parent = parent;
	}

	public Scope global() {
		Scope global = this;
		while (global.parent != null) global = global.parent;
		return global;
	}
	
	public void reset() {
		functions.clear();
		variables.clear();
		types.clear();
	}
	
	public boolean containsType(String name) {
		return types.containsKey(name);
	}
	
	public boolean containsFunction(String name) {
		return functions.containsKey(name);
	}

	public boolean containsVariable(String name) {
		return variables.containsKey(name);
	}

	public Type getType(String name) {
		return types.get(name);
	}


	public Function getFunction(String name) {
		// TODO consider function signature somehow? or associate with the group of functions?
		ArrayList<Function> group = functions.get(name);
		if (group != null) {
			return group.get(0);
		}
		else return null;
	}
	
	public void add(Scope child) {
		children.add(child);
	}

	public Scope getParent() {
		return parent;
	}

	
	private List<Function> getFunctionGroup(String name) {
		ArrayList<Function> functionGroup = functions.get(name);
		if (functionGroup == null) {
			functionGroup = new ArrayList<Function>(1);
			functions.put(name, functionGroup);
		}
		return functionGroup;
	}
	
	public void addFunction(Function func) {
		List<Function> functionGroup = getFunctionGroup(func.name);
		int i = Collections.binarySearch(functionGroup, func);
		if (i >= 0) {
			// exists
		} else {
			i = (-(i) - 1);
			functionGroup.add(i, func);
		}
	}

	public void addFunctionDefinition(Function function) {
		List<Function> group = getFunctionGroup(function.name);
		int i = Collections.binarySearch(group, function);
		if (i >= 0) {
			// exists in this scope -> ignore error here, just override
			group.set(i, function);
		} else {
			i = (-(i) - 1);
			group.add(i, function);
		}
		
	}

	
	public void addVariable(String name, Variable var) {
		variables.put(name, var);
	}

	public void addType(String name, Type type) {
		types.put(name, type);
	}

	public Variable getVariable(String identifier) {
		return variables.get(identifier);
	}

	
	public ArrayList<Scope> getChildren() {
		return children;
	}

	public Collection<Type> getTypes() {
		return types.values();
	}




}
