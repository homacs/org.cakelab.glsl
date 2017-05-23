package org.cakelab.glsl.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.TestBaseCommon;
import org.cakelab.glsl.parser.GLSLParser.GlslContext;

public class TestBaseGLSL extends TestBaseCommon {

	public static GLSLParser p(String source) {
		CharStream input = CharStreams.fromString(source);
		GLSLLexer lexer = new GLSLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser = new GLSLParser(tokens);
		error.listenTo(parser, lexer);
		return (GLSLParser)parser;
	}

	@SafeVarargs
	public static void assertValid(String source, Class<? extends ParseTree> ... types) {
		ParseTree ast;
		ast = p(source).glsl();
		assertValid(ast, types);
	}

	@SafeVarargs
	public static void assertInvalid(String source, Class<? extends ParseTree> ... types) {
		GlslContext ast;
		GLSLParser parser = p(source);
		ast = parser.glsl();

		assertInvalid(ast, types);
	}


}
