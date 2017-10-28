package org.cakelab.glsl.lang.ast.impl;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Struct;
import org.cakelab.glsl.lang.ast.types.Type;


public class ScopeImpl implements IScope {

	protected IScope parent;
	protected ArrayList<IScope> children = new ArrayList<IScope>();
	// TODO: functions, variables, types need reference to scope
	protected HashMap<String, FunctionGroup> functions = new HashMap<String, FunctionGroup>();
	protected HashMap<String, Variable> variables = new HashMap<String, Variable>();
	protected HashMap<String, Type> types = new HashMap<String, Type>();
	private HashMap<String, InterfaceBlock> interfaces = new HashMap<String, InterfaceBlock>();
	
	
	
	public ScopeImpl(IScope builtin) {
		this.parent = builtin;
	}

	@Override
	public boolean containsType(String name) {
		return types.containsKey(name);
	}
	
	@Override
	public boolean containsFunction(String name) {
		return functions.containsKey(name);
	}

	@Override
	public boolean containsVariable(String name) {
		return variables.containsKey(name);
	}

	@Override
	public Type getType(String name) {
		return types.get(name);
	}


	@Override
	public Function getFunction(String name, Type[] parameterTypes) {
		FunctionGroup group = functions.get(name);
		if (group != null) {
			return group.getExactMatch(parameterTypes);
		}
		else 
		{
			return null;
		}
	}
	
	
	@Override
	public Function getFunctionBestMatch(String name, Type[] parameterTypes) {
		FunctionGroup group = functions.get(name);
		if (group != null) {
			return group.getBestMatch(parameterTypes);
		}
		else 
		{
			return null;
		}
	}
	
	
	
	
	@Override
	public void add(IScope child) {
		children.add(child);
	}

	@Override
	public IScope getParent() {
		return parent;
	}

	
	private FunctionGroup getFunctionGroup(String name) {
		FunctionGroup functionGroup = functions.get(name);
		if (functionGroup == null) {
			functionGroup = new FunctionGroup();
			functions.put(name, functionGroup);
		}
		return functionGroup;
	}

	public boolean hasFunctionGroup(String name) {
		return functions.containsKey(name);
	}
	
	
	@Override
	public void addFunction(Function func) {
		FunctionGroup functionGroup = getFunctionGroup(func.getName());
		functionGroup.add(func);
	}

	
	@Override
	public void addVariable(Variable var) {
		variables.put(var.getName(), var);
		var.setScope(this);
	}

	@Override
	public void addType(Type type) {
		if (type instanceof InterfaceBlock) {
			throw new Error("internal error: interface blocks have to be registered through addInterface()");
		}
		types.put(type.getName(), type);
		type.setScope(this);
	}

	@Override
	public Variable getVariable(String name) {
		return variables.get(name);
	}

	
	@Override
	public ArrayList<IScope> getChildren() {
		return children;
	}

	@Override
	public Collection<Type> getTypes() {
		return types.values();
	}

	@Override
	public void addInterface(InterfaceBlock block) {
		String key = block.getKey();
		interfaces.put(key, block);
	}

	@Override
	public InterfaceBlock getInterface(Qualifier direction, String name) {
		return interfaces.get(InterfaceBlock.key(direction, name));
	}

	@Override
	public boolean containsInterface(Qualifier direction, String name) {
		return interfaces.containsKey(InterfaceBlock.key(direction, name));
	}

	@Override
	public Collection<InterfaceBlock> getInterfaces() {
		return interfaces.values();
	}

	@Override
	public boolean containsInterface(InterfaceBlock block) {
		return interfaces.containsKey(block.getKey());
	}


	@Override
	public void dump(PrintStream out, String indent) {
		out.println(indent + "{");
		String innerIndent = indent + "\t";
		for (ArrayList<Function> fg : functions.values()) {
			for (Function f : fg) {
				out.println(innerIndent + f.toString());
			}
		}
		for (Variable v : variables.values()) {
			out.println(innerIndent + v.toString());
		}
		for (Type t : types.values()) {
			out.println(innerIndent + t.toString());
			if (t instanceof Struct) {
				((Struct)t).getBody().dump(out, innerIndent);
			}
		}
		for (InterfaceBlock i : interfaces.values()) {
			out.println(innerIndent + i.toString());
			i.getBody().dump(out, innerIndent);
		}
		out.println(indent + "}");
	}



}
