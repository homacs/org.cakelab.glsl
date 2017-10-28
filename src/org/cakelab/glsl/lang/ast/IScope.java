package org.cakelab.glsl.lang.ast;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Type;

public interface IScope {
	IScope NONE = null;

	void addInterface(InterfaceBlock block);
	InterfaceBlock getInterface(Qualifier direction, String name);
	boolean containsInterface(Qualifier direction, String name);
	boolean containsInterface(InterfaceBlock block);

	Collection<InterfaceBlock> getInterfaces();

	void addType(Type type);
	boolean containsType(String name);
	Type getType(String name);
	Collection<Type> getTypes();
	
	// FIXME: Function lookup has to consider return parameter types!
	void addFunction(Function func);
	boolean containsFunction(String name);
	Function getFunction(String name, Type[] parameterTypes);
	Function getFunctionBestMatch(String name, Type[] parameterTypes);
	
	void addVariable(Variable var);
	boolean containsVariable(String name);
	Variable getVariable(String name);
	
	void add(IScope child);
	IScope getParent();
	ArrayList<IScope> getChildren();
	
	void dump(PrintStream out, String indent);
	boolean hasFunctionGroup(String ident);

}
