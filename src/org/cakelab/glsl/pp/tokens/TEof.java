package org.cakelab.glsl.pp.tokens;

public class TEof extends Token {

	public TEof() {
		super("");
	}

	public TEof(TEof that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TEof(this);
	}

}
