package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Type;

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
	private GLSLExtensionSet extensions = new GLSLExtensionSet();
	
	/**
	 * Creates a new builtin scope with the given builtin symbols and an empty set of extensions.
	 * 
	 * @param builtinScopeSymbols
	 */
	public BuiltinScope(IScope builtinScopeSymbols) {
		this.builtins = builtinScopeSymbols;
	}

	@Override
	public boolean containsType(String name) {
		return builtins.containsType(name) || getExtensions().containsType(name);
	}

	@Override
	public boolean containsInterface(Qualifier direction, String name) {
		return builtins.containsInterface(direction, name) || getExtensions().containsInterface(direction, name);
	}

	@Override
	public boolean containsInterface(InterfaceBlock block) {
		return builtins.containsInterface(block) || getExtensions().containsInterface(block);
	}


	@Override
	public boolean containsFunction(String name) {
		return builtins.containsFunction(name) || getExtensions().containsFunction(name);
	}

	@Override
	public boolean containsVariable(String name) {
		return builtins.containsVariable(name) || getExtensions().containsVariable(name);
	}

	@Override
	public Type getType(String name) {
		Type t = null;
		
		if (builtins != null) t = builtins.getType(name);
		if (t != null) return t;
		else return getExtensions().getType(name);
	}

	@Override
	public InterfaceBlock getInterface(Qualifier direction, String name) {
		InterfaceBlock t = builtins.getInterface(direction, name);
		if (t != null) return t;
		
		return getExtensions().getInterface(direction, name);
	}

	@Override
	public Collection<InterfaceBlock> getInterfaces() {
		ArrayList<InterfaceBlock> alltypes = new ArrayList<InterfaceBlock>();
		alltypes.addAll(builtins.getInterfaces());
		alltypes.addAll(getExtensions().getInterfaces());
		
		return alltypes;
	}


	
	@Override
	public Function getFunction(String name, Type[] parameterTypes) {
		Function f = builtins.getFunction(name, parameterTypes);
		if (f != null) return f;
		return getExtensions().getFunction(name, parameterTypes);
	}

	@Override
	public Function getFunctionBestMatch(String name, Type[] parameterTypes) {
		Function f = builtins.getFunctionBestMatch(name, parameterTypes);
		if (f != null) return f;
		return getExtensions().getFunctionBestMatch(name, parameterTypes);
	}

	@Override
	public Variable getVariable(String identifier) {
		Variable v = builtins.getVariable(identifier);
		if (v != null) return v;
		return getExtensions().getVariable(identifier);
	}

	@Override
	public ArrayList<IScope> getChildren() {
		
		ArrayList<IScope> allchildren = new ArrayList<IScope>();
		allchildren.addAll(builtins.getChildren());
		allchildren.addAll(getExtensions().getChildren());

		return allchildren;
	}

	@Override
	public Collection<Type> getTypes() {
		ArrayList<Type> alltypes = new ArrayList<Type>();
		alltypes.addAll(builtins.getTypes());
		alltypes.addAll(getExtensions().getTypes());
		
		return alltypes;
	}

	@Override
	public void dump(PrintStream out, String indent) {
		out.print("builtins ");
		builtins.dump(out, indent);
		getExtensions().dump(out, indent);
	}


	@Override
	public void add(IScope child) {
		// ignore
	}


	@Override
	public IScope getParent() {
		// builtin scope does never have a parent scope
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

	public GLSLExtensionSet getExtensions() {
		return extensions;
	}

	public void setExtensions(GLSLExtensionSet extensions) {
		this.extensions = extensions;
	}




}
