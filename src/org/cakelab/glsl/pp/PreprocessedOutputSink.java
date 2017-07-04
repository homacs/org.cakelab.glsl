package org.cakelab.glsl.pp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;


public abstract class PreprocessedOutputSink extends PrintStream {
	public static PreprocessedOutputSink DEV_NULL = new PreprocessedOutputSink() {

		@Override
		public void reportLocationSwitch(Location location) {
			// intentionally empty
		}

		@Override
		public int getPosition() {
			// intentionally empty
			return -1;
		}

		@Override
		public int reportMacroExpansionStart() {
			// intentionally empty
			return -1;
		}

		@Override
		public void reportMacroExpansionEnd(int startOutputPos, Expression macroCall) {
			// intentionally empty
		}
	};

	public PreprocessedOutputSink(OutputStream out) {
		super(out, true);
	}

	/**
	 * Constructor for DEV_NULL only.
	 */
	private PreprocessedOutputSink() {
		super(new OutputStream(){
			@Override
			public void write(int b) throws IOException {
				// intentionally empty
			}});
	}

	public abstract int getPosition();
	public abstract void reportLocationSwitch(Location location);
	public abstract int reportMacroExpansionStart();
	public abstract void reportMacroExpansionEnd(int startOutputPos, Expression macroCall);
	
}
