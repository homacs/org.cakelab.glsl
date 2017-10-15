package org.cakelab.glsl.lang.lexer.tokens;

public interface ITokenTable {
	public Integer mapPunctuator(String text);
	
	public boolean isPunctuator(String text);
	public boolean isLanguageKeyword(String text);
	public boolean isReservedKeyword(String text);
	// TODO: remove builtin type differentiation from token table
	public boolean isBuiltinType(String text);
	
	public Integer mapLanguageKeyword(String text);


}
