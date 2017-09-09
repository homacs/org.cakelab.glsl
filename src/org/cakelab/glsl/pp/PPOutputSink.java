package org.cakelab.glsl.pp;

import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;


public interface PPOutputSink {
	
	/** 
	 * An output sink for the preprocessor, which ignores all output. 
	 * Used in cases, where the output gets invalid (e.g. after errors)
	 * or hidden (e.g. by an #if directive). 
	 */
	public static PPOutputSink DEV_NULL = new PPOutputSink() {

		
		@Override
		public void print(Token t) {
		}

		@Override
		public void print(TokenList tokens) {
		}

		@Override
		public void init(PPState state) {
		}


	};

	void init(PPState state);

	void print(Token t);
	void print(TokenList tokens);
	
	
	
}
