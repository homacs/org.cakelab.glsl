package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

/**
 * The vocabulary contains compiler specific mappings of tokens to token type codes for all keywords and punctuators 
 * known by its language parser.
 * <p>
 * The set of tokens understood by a language parser is supposed to be 
 * narrowed for specific language versions by use of token tables (see {@link ITokenTable}).
 * </p>
 * @author homac
 *
 */
public abstract class Vocabulary {
	
	public abstract HashMap<String, Integer> punctuators();
	
	public abstract Integer keyword(String text);

	public abstract Integer builtintype();

	public abstract String toString(int type);


	
}
