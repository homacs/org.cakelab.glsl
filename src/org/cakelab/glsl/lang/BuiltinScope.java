package org.cakelab.glsl.lang;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;

public class BuiltinScope extends Scope {

	GLSLExtensionSet extensions = new GLSLExtensionSet();
	
	public BuiltinScope() {
		super(null);
	}


	@Override
	public void reset() {
		// not supported by builtin scope
	}

	@Override
	public boolean containsType(String name) {
		return extensions.containsType(name) || super.containsType(name);
	}

	@Override
	public boolean containsFunction(String name) {
		return extensions.containsFunction(name) || super.containsFunction(name);
	}

	@Override
	public boolean containsVariable(String name) {
		return extensions.containsVariable(name) || super.containsVariable(name);
	}

	@Override
	public Type getType(String name) {
		Type t = extensions.getType(name);
		if (t != null) return t;
		
		return super.getType(name);
	}

	@Override
	public Function getFunction(String name) {
		Function f = extensions.getFunction(name);
		if (f != null) return f;
		return super.getFunction(name);
	}

	@Override
	public Variable getVariable(String identifier) {
		Variable v = extensions.getVariable(identifier);
		if (v != null) return v;
		return super.getVariable(identifier);
	}

	@Override
	public ArrayList<Scope> getChildren() {
		
		ArrayList<Scope> allchildren = new ArrayList<Scope>();
		allchildren.addAll(super.getChildren());
		allchildren.addAll(extensions.getChildren());

		return allchildren;
	}

	@Override
	public Collection<Type> getTypes() {
		ArrayList<Type> alltypes = new ArrayList<Type>();
		alltypes.addAll(super.getTypes());
		alltypes.addAll(extensions.getTypes());
		
		return alltypes;
	}

	@Override
	public void dump(PrintStream out, String indent) {
		// TODO Auto-generated method stub
		super.dump(out, indent);
	}




}
