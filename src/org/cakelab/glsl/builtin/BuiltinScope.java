package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.InterfaceBlock;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;

/**
 * A builtin scope contains all builtin symbols of a 
 * specific version and shader type combination and 
 * all enabled extensions.
 * 
 * @author homac
 *
 */
public class BuiltinScope implements IScope {
	IScope builtins;
	GLSLExtensionSet extensions = new GLSLExtensionSet();
	
	public BuiltinScope(IScope iScope) {
		this.builtins = iScope;
	}

	@Override
	public boolean containsType(String name) {
		return builtins.containsType(name) || extensions.containsType(name);
	}

	@Override
	public boolean containsInterface(Qualifier direction, String name) {
		return builtins.containsInterface(direction, name) || extensions.containsInterface(direction, name);
	}

	@Override
	public boolean containsInterface(InterfaceBlock block) {
		return builtins.containsInterface(block) || extensions.containsInterface(block);
	}


	@Override
	public boolean containsFunction(String name) {
		return builtins.containsFunction(name) || extensions.containsFunction(name);
	}

	@Override
	public boolean containsVariable(String name) {
		return builtins.containsVariable(name) || extensions.containsVariable(name);
	}

	@Override
	public Type getType(String name) {
		Type t = builtins.getType(name);
		if (t != null) return t;
		
		return extensions.getType(name);
	}

	@Override
	public InterfaceBlock getInterface(Qualifier direction, String name) {
		InterfaceBlock t = builtins.getInterface(direction, name);
		if (t != null) return t;
		
		return extensions.getInterface(direction, name);
	}

	@Override
	public Collection<InterfaceBlock> getInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}


	
	@Override
	public Function getFunction(String name, Type[] parameterTypes) {
		Function f = builtins.getFunction(name, parameterTypes);
		if (f != null) return f;
		return extensions.getFunction(name, parameterTypes);
	}

	@Override
	public Variable getVariable(String identifier) {
		Variable v = builtins.getVariable(identifier);
		if (v != null) return v;
		return extensions.getVariable(identifier);
	}

	@Override
	public ArrayList<IScope> getChildren() {
		
		ArrayList<IScope> allchildren = new ArrayList<IScope>();
		allchildren.addAll(builtins.getChildren());
		allchildren.addAll(extensions.getChildren());

		return allchildren;
	}

	@Override
	public Collection<Type> getTypes() {
		ArrayList<Type> alltypes = new ArrayList<Type>();
		alltypes.addAll(builtins.getTypes());
		alltypes.addAll(extensions.getTypes());
		
		return alltypes;
	}

	@Override
	public void dump(PrintStream out, String indent) {
		out.print("builtins ");
		builtins.dump(out, indent);
		extensions.dump(out, indent);
	}


	@Override
	public void add(IScope child) {
		// ignore
	}


	@Override
	public IScope getParent() {
		return null;
	}


	@Override
	public void addFunction(Function func) {
		throw new Error("not supported");
	}


	@Override
	public void addVariable(Variable var) {
		throw new Error("not supported");
	}


	@Override
	public void addType(Type type) {
		throw new Error("not supported");
	}

	@Override
	public void addInterface(InterfaceBlock block) {
		throw new Error("not supported");
	}




}