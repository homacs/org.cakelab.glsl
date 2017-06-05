package org.cakelab.glsl.pp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.cakelab.glsl.pp.GLSLPPParser.GlslppIfGroupContext;
import org.cakelab.glsl.pp.GLSLPPParser.GlslppIfSectionContext;

public class GLSLPreprocessor extends GLSLPPBaseListener {

	private GLSLPPParser parser;
	private CommonTokenStream tokens;
	private PrintStream out;


	public GLSLPreprocessor() {
	}
	
	public void process(InputStream in, OutputStream out) throws IOException {
		CharStream input = CharStreams.fromStream(in, Charset.forName("UTF-8"));
		GLSLPPLexer lexer = new GLSLPPLexer(input);
		lexer.preprocessing(true);
		tokens = new CommonTokenStream(lexer);
		this.out = new PrintStream(out);
		parser.addParseListener(this);
		parser = new GLSLPPParser(tokens);
		parser.glslpp();
	}
	
	public static void main(String[] args) throws IOException {
		File f = new File("test_files/100.frag");
		GLSLPreprocessor pp = new GLSLPreprocessor();
		pp.process(new FileInputStream(f), new FileOutputStream("/tmp/output.glsl"));
	}

	@Override
	public void exitGlslppIfSection(GlslppIfSectionContext ctx) {
		ctx.glslppIfGroup();
	}

	@Override
	public void exitGlslppIfGroup(GlslppIfGroupContext ctx) {
		ctx.glslConstantExpression();
	}
	
	
	
}
