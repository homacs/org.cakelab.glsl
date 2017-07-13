package org.cakelab.glsl.test.pp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Tee extends OutputStream {

	private PrintStream mirror;
	private OutputStream out;

	public Tee(OutputStream out, PrintStream mirror) {
		this.out = out;
		this.mirror = mirror;
	}

	@Override
	public void write(int b) throws IOException {
		out.write(b);
		mirror.write(b);
	}

}
