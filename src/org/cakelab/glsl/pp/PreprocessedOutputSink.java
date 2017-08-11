package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.tokens.Token;


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
		public void println(Interval origin) {
		}

		@Override
		public void println(Token t) {
		}

	};


	void print(Token t);
	
	void println(Interval origin);

	void println(Token t);
	
	
	
}
