package org.cakelab.glsl.test.pp.syntax;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.pp.GLSLPPLexer;
import org.cakelab.glsl.pp.GLSLPPParser;
import org.cakelab.glsl.test.TestBaseCommon;

public class TestBaseGLSLPP extends TestBaseCommon {

	public static GLSLPPParser p(String source) {
		CharStream input = CharStreams.fromString(source);
		GLSLPPLexer lexer = new GLSLPPLexer(input);
		lexer.preprocessing(true);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser = new GLSLPPParser(tokens);
		setup(parser,lexer);
		error.listenTo(parser, lexer);
		return (GLSLPPParser) parser;
	}
	
	@SafeVarargs
	public static void assertValid(String source, Class<? extends ParseTree> ... types) {
		ParseTree ast;
		
		ast = p(source).glslpp();
		assertValid(ast, types);
	}

	@SafeVarargs
	public static void assertInvalid(String source, Class<? extends ParseTree> ... types) {
		ParseTree ast;
		GLSLPPParser parser = p(source);
		ast = parser.glslpp();

		assertInvalid(ast, types);
	}
}
