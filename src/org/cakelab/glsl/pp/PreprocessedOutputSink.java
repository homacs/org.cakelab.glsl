package org.cakelab.glsl.pp;

import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;


public interface PreprocessedOutputSink {
	
	/** 
	 * An output sink for the preprocessor, which ignores all output. 
	 * Used in cases, where the output gets invalid (e.g. after errors)
	 * or hidden (e.g. by an #if directive). 
	 */
	public static PreprocessedOutputSink DEV_NULL = new PreprocessedOutputSink() {

		@Override
		public void print(Token t) {
		}

		@Override
		public void print(TokenList tokens) {
		}


	};


	void print(Token t);
	void print(TokenList tokens);
	
	
	
}
