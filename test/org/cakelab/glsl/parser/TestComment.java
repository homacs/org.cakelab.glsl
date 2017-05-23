package org.cakelab.glsl.parser;

public class TestComment extends TestBaseGLSL {
	public static void test() {
		String source;

		// SINGLELINE_COMMENT
		
		source = "//";
		assertValid(p(source).glsl());

		source = "// single line comment";
		assertValid(p(source).glsl());
		
		source = "// single line comment\n"
				+ "// next line";
		assertValid(p(source).glsl());
		
		source = "// single line comment\n"
				+ "// last comment line\n";
		assertValid(p(source).glsl());
		
		source = "// following empty\n"
				+ "\n"
				+ "// last line\n";
		assertValid(p(source).glsl());
		
		source = "// following comment // another comment \n";
		assertValid(p(source).glsl());
		
		
		// MULTILINE_COMMENT
		
		source = "/**/";
		assertValid(p(source).glsl());

		source = "/* single line comment */";
		assertValid(p(source).glsl());
		
		source = " /* single line comment\n"
				+ " * next line */";
		assertValid(p(source).glsl());
		
		source = "/* single line comment\n"
				+ " last comment line*/\n";
		assertValid(p(source).glsl());
		
		source = "/** following empty\n"
				+ "\n"
				+ " last line*/\n";
		assertValid(p(source).glsl());
		
		source = "/* * /\n"
				+ " actual end */\n";
		assertValid(p(source).glsl());
		
		source = "/* following comment /*\n"
				+ "\n"
				+ " last line*/\n";
		assertValid(p(source).glsl());

		
		// MIXED COMMENT
		
		source = "/* i had a dream // that this is working!*/";
		assertValid(p(source).glsl());
		
		source = "// i had a dream /* that this is working!*/";
		assertValid(p(source).glsl());
		
	}

}
