package org.cakelab.glsl;

import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Type;

public interface SymbolTable {


	Scope scope();
	void  enter(Scope newScope);
	Scope leave(Scope currentScope);

	void declare(Type type);
	
	Object resolve(String identifier);
	<T> T resolve(Class<T> symbolType, String identifier);


}
