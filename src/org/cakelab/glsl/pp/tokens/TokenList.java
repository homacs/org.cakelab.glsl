package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.pp.ast.NodeList;

@SuppressWarnings("serial")
public class TokenList extends NodeList<Token> {
	private static final Filter<Token> Filter_WHITESPACE = new Filter<Token>() {

		@Override
		public boolean pass(Token obj) {
			return !(obj instanceof TWhitespace);
		}
		
	};

	public TokenList(int size) {
		super(size);
	}

	public TokenList() {
	}

	/** Removes all whitespace tokens from the start and the end, which match the given set of tokens */
	public void trim() {
		super.trimStart(Filter_WHITESPACE);
		super.trimEnd(Filter_WHITESPACE);
	}

}
