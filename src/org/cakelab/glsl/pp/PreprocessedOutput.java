package org.cakelab.glsl.pp;

import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.tokens.TEndl;
import org.cakelab.glsl.pp.tokens.Token;

public class PreprocessedOutput implements PreprocessedOutputSink {


	PrintStream out;
	
	public PreprocessedOutput(OutputStream out) {
		this.out = new PrintStream(out, true);
	}

	@Override
	public void print(Token t) {
		out.print(t.getText());
	}
	
	@Override
	public void println(Interval interval) {
		print(new TEndl(interval, "\n"));
	}

	@Override
	public void println(Token t) {
		print(t);
		println(new Interval(t.getEnd(),t.getEnd()));
	}
	
	
}
