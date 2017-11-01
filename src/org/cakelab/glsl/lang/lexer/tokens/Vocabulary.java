package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

public abstract class Vocabulary {
	
	public abstract HashMap<String, Integer> punctuators();
	
	public abstract Integer keyword(String text);

	public abstract Integer builtintype();
	
}
