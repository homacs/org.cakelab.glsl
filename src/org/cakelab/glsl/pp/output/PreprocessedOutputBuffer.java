package org.cakelab.glsl.pp.output;

import java.io.ByteArrayOutputStream;

import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.tokens.Token;

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
public class PreprocessedOutputBuffer extends PreprocessedOutputStream {

	private ByteArrayOutputStream out;
	private LocationMap locations = new LocationMap();
	
	public PreprocessedOutputBuffer() {
		this(new ByteArrayOutputStream());
	}

	public PreprocessedOutputBuffer(ByteArrayOutputStream out) {
		super(out);
		this.out = out;
	}

	public int getPosition() {
		return out.size()-1;
	}
	
	public byte[] getData() {
		return out.toByteArray();
	}

	public LocationMap getLocations() {
		return locations;
	}

	@Override
	public void print(Token t) {
		locations.report(t, getPosition() + t.length());
		super.print(t);
	}
	
}
