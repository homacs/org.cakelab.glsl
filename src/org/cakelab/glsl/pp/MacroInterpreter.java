package org.cakelab.glsl.pp;

import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public interface MacroInterpreter {

	TokenList macro_expand_argument(TokenList tokens);

	Token macro_join_tokens(Token left, Token right);

}
