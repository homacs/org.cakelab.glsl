package org.cakelab.glsl.lang.lexer.tokens;


/**
 * A token table provides mappings of tokens to 
 * language parser specific token type codes.
 * <p>
 * A token table is used to narrow the set of supported tokens 
 * for a specific version of the language. Tokens that do not 
 * exist in a token table, will not be considered as valid tokens 
 * by the language parser. Thus, any phrase using a token not listed 
 * in the token table, will be considered as syntax error.
 * </p>
 * <p>
 * A token table can only contain tokens, known by the language parser.
 * Those tokens are listed in the compilers vocabulary (see {@link Vocabulary}).
 * </p>
 * <p>
 * Extensions can extend the set of supported tokens by providing their 
 * own token table (see {@link org.cakelab.glsl.builtin.extensions.KeywordTable}.
 * </p>
 * 
 * @author homac
 *
 */
public interface ITokenTable {
	public Integer mapPunctuator(String text);
	
	public boolean isPunctuator(String text);
	public boolean isLanguageKeyword(String text);
	public boolean isReservedKeyword(String text);
	// TODO: remove builtin type differentiation from token table
	public boolean isBuiltinType(String text);
	
	public Integer mapLanguageKeyword(String text);


}
