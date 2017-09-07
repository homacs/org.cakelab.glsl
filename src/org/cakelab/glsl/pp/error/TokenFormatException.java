package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.pp.tokens.Token;

@SuppressWarnings("serial")
public class TokenFormatException extends Exception {

	private Token token;

	public TokenFormatException(Token token, String message) {
		super(message);
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

}
