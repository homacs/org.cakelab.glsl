package org.cakelab.glsl.pp;

import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.Interval;

public class PreprocessedOutput implements PreprocessedOutputSink {


	PrintStream out;
	
	public PreprocessedOutput(OutputStream out) {
		this.out = new PrintStream(out, true);
	}

	@Override
	public void print(Interval origin, String s) {
		out.print(s);
	}
	
	@Override
	public void println(Interval origin) {
		print(origin, "\n");
	}

	@Override
	public void println(Interval origin, String string) {
		print(origin, string);
		println(origin);
	}
	
	
}
