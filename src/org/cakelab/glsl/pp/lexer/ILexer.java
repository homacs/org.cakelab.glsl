package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public interface ILexer {
	void setRules(LexerRuleSet rules);

	Token lookahead(int n);

	Token consume(int n);

	boolean eof();

	ErrorHandler getErrorHandler();

	IScanner getInputReference();

	void dismiss();

	Token previous();

	void setVirtualLocation(String sourceIdentifier, int line);

	void setVirtualLocation(int line);

	LexerRuleSet getRules();


}
