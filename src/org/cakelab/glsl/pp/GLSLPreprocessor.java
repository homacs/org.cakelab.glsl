package org.cakelab.glsl.pp;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.cakelab.glsl.parser.GLSLLexer;
import org.cakelab.glsl.pp.GLSLPPParser;

public class GLSLPreprocessor extends GLSLPPParser {

	public GLSLPreprocessor(TokenStream tokenStream) {
		super(tokenStream);
	}
	
	public static void main(String[] args) throws IOException {
		File f = new File("test_files/100.frag");
		CharStream input = CharStreams.fromPath(f.toPath());
		GLSLLexer lexer = new GLSLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GLSLPreprocessor pp = new GLSLPreprocessor(tokens);
		pp.glslppPreprocessingFile();
	}
	
}
