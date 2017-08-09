package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;


public interface PreprocessedOutputSink {
	
	/** 
	 * An output sink for the preprocessor, which ignores all output. 
	 * Used in cases, where the output gets invalid (e.g. after errors)
	 * or hidden (e.g. by an #if directive). 
	 */
	public static PreprocessedOutputSink DEV_NULL = new PreprocessedOutputSink() {

		@Override
		public void print(Interval origin, String s) {
		}

		@Override
		public void println(Interval origin) {
		}

		@Override
		public void println(Interval origin, String string) {
		}

	};


	void print(Interval origin, String s);
	
	void println(Interval origin);

	void println(Interval origin, String string);
	
	
	
}
