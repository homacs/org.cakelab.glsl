package org.cakelab.glsl.pp;

import java.io.OutputStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;

public class PreprocessedOutput extends PreprocessedOutputSink {

	public PreprocessedOutput(OutputStream out) {
		super(out);
	}

	@Override
	public int getPosition() {
		return -1;
	}

	@Override
	public void reportLocationSwitch(Location location) {
	}

	@Override
	public int reportMacroExpansionStart() {
		return 0;
	}

	@Override
	public void reportMacroExpansionEnd(int startOutputPos, Expression macroCall) {
	}

}
