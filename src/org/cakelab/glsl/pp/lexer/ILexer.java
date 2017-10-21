package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.tokens.Token;



/**
 * Lexers are used to turn atoms received from an instance of
 * {@link IScanner} into tokens.
 * <p>
 * Methods of the lexer always refer to tokens and not atoms (characters). 
 * Thus in methods such as {@link #lookahead(int)} and {@link #consume(int)}
 * the parameter refers to the number of tokens to look ahead or consume.
 * </p>
 * <p>
 * To interpret atoms of a scanner the lexer uses a set of rules 
 * (see {@link LexerRuleSet}). These rules do most of the work related 
 * to token recognition and instantiation. The main task of the lexer 
 * is simply to manage and deliver scanned tokens to the parser.
 * </p>
 * 
 * @author homac
 *
 */
public interface ILexer {
	void setRules(LexerRuleSet rules);

	Token lookahead(int n);

	Token consume(int n);

	boolean eof();

	void dismiss();

	Token previous();

	void setVirtualLocation(String sourceIdentifier, int line);

	void setVirtualLocation(int line);

	LexerRuleSet getRules();


}
