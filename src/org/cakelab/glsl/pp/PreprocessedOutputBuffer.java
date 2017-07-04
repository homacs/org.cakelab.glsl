package org.cakelab.glsl.pp;

import java.io.ByteArrayOutputStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;


public class PreprocessedOutputBuffer extends PreprocessedOutputSink {

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
	public void reportLocationSwitch(Location location) {
		lastLocation = new Location(location);
		locations.reportLocationSwitch(lastLocation, getPosition()+1);
	}
	
	public int reportMacroExpansionStart() {
		inMacroExpansion++;
		return getPosition();
	}
	public void reportMacroExpansionEnd(int outputStart, Expression macroCall) {
		inMacroExpansion--;
		if (macroCall != null) locations.reportMacroCall(macroCall, outputStart, getPosition());
	}
	
}
