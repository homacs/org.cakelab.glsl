package org.cakelab.glsl.pp;

import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

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
	public void print(TokenList tokens) {
		for (Token t : tokens) print(t);
	}
	
	
}
