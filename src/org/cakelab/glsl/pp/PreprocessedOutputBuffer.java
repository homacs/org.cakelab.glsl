package org.cakelab.glsl.pp;

import java.io.ByteArrayOutputStream;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

/**
 * A preprocessor output buffer is used as intermediate between preprocessor
 * and language parser.
 * <p>
 * The buffer maintains not only the preprocessed output, but also a location map
 * (see {@link LocationMap}) which is required by the language parser to 
 * determine the location of tokens in the original input stream, 
 * once given to the preprocessor. This is the only way to 
 * report original sources of syntax errors (to name just one purpose).
 * </p>
 * 
 * 
 * @author homac
 *
 */
public class PreprocessedOutputBuffer extends PreprocessedOutput {

	private static class Buffer extends ByteArrayOutputStream {
		
		private PreprocessedOutputBuffer listener;

		@Override
		public synchronized void write(int b) {
			if (b == '\n' && listener != null) listener.reportENDL();
			super.write(b);
		}

		@Override
		public synchronized void write(byte[] b, int off, int len) {
			for (int i = 0; i < len; i++) {
				write(b[off+i]);
			}
		}

		public void setListener(PreprocessedOutputBuffer listener) {
			this.listener = listener;
		}
		
	}

	private Buffer out;
	private LocationMap locations;
	private Location lastLocation;
	private int inMacroExpansion;
	
	public PreprocessedOutputBuffer() {
		this(new Buffer());
	}

	public PreprocessedOutputBuffer(Buffer out) {
		super(out);
		this.out = out;
		this.out.setListener(this);
	}

	public int getPosition() {
		return out.size()-1;
	}
	
	public void reportENDL() {
		// always report line ends to be able to determine line+column later
		if (!isInMacroCall()) locations.reportLineEnd(lastLocation, getPosition()+1);
	}

	private boolean isInMacroCall() {
		return inMacroExpansion != 0;
	}

	public byte[] getData() {
		return out.toByteArray();
	}

	public LocationMap getLocations() {
		return locations;
	}

	@Override
	public void print(Interval origin, String s) {
		super.print(origin, s);
	}
	
}
