package org.cakelab.glsl.pp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.pp.ast.MacroInvocation;


public abstract class PreprocessedOutputSink extends PrintStream {
	
	/** 
	 * An output sink for the preprocessor, which ignores all output. 
	 * Used in cases, where the output gets invalid (e.g. after errors)
	 * or hidden (e.g. by an #if directive). 
	 */
	public static PreprocessedOutputSink DEV_NULL = new PreprocessedOutputSink() {

		@Override
		public void reportLocationSwitch(Location location) {
			// intentionally empty
		}

		@Override
		public int getPosition() {
			// intentionally empty
			return Location.POS_START;
		}

		@Override
		public int reportMacroExpansionStart() {
			// intentionally empty
			return -1;
		}

		@Override
		public void reportMacroExpansionEnd(int startOutputPos, MacroInvocation macroCall) {
			// intentionally empty
		}

		@Override
		public void reportMacroExpansion(String text, MacroInvocation expr) {
			// intentionally empty
			
		}
	};

	public PreprocessedOutputSink(OutputStream out) {
		super(out, true);
	}

	/**
	 * Constructor for {@link #DEV_NULL} only.
	 */
	private PreprocessedOutputSink() {
		super(new OutputStream(){
			@Override
			public void write(int b) throws IOException {
				// intentionally empty
			}});
	}

	/**
	 * @return current position in the output stream.
	 */
	public abstract int getPosition();
	/**
	 * Used to mark a switch of the source (e.g. column or line 
	 * skipping or switch to another source string). This information 
	 * is provided to the location map to mark the start of a new
	 * input section.
	 * @param location New location in an input stream.
	 */
	public abstract void reportLocationSwitch(Location location);
	/** 
	 * Mark the start of a section in the output stream, which 
	 * is the result of a corresponding macro invocation.
	 * @return current output stream position to be provided to {@link #reportMacroExpansionEnd(int, Expression)}.
	 */
	public abstract int reportMacroExpansionStart();
	/**
	 * Mark the end of a section in the output stream, which
	 * is the result of a corresponding macro invocation.
	 * 
	 * @param startOutputPos start of the macro call in the output stream received from {@link #reportMacroExpansionStart()} or {@link #getPosition()}.
	 * @param macroCall The macro invocation expression, which is either an instance of {@link MacroReference} or {@link CallExpression} with a macro reference.
	 */
	public abstract void reportMacroExpansionEnd(int startOutputPos, MacroInvocation macroCall);

	public abstract void reportMacroExpansion(String text, MacroInvocation expr);
	
}
