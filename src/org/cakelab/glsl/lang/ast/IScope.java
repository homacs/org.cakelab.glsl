package org.cakelab.glsl.lang.ast;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface IScope {

	boolean containsType(String name);
	// FIXME: Function lookup has to consider return parameter types!
	boolean containsFunction(String name);
	boolean containsVariable(String name);
	Type getType(String name);
	Function getFunction(String name);
	void add(IScope child);
	IScope getParent();
	void addFunction(Function func);
	void addVariable(String name, Variable var);
	void addType(String name, Type type);
	Variable getVariable(String identifier);
	ArrayList<IScope> getChildren();
	Collection<Type> getTypes();
	void dump(PrintStream out, String indent);
	


}
