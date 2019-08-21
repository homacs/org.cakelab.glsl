package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.TestProvider;

public class TestComment extends TestingSyntaxBase {
	public TestComment(TestProvider tester) {
		super(tester);
	}

	public void test() {
		String source;

		// SINGLELINE_COMMENT
		
		source = "//";
		assertValid(source);

		source = "// single line comment";
		assertValid(source);
		
		source = "// single line comment\n"
				+ "// next line";
		assertValid(source);
		
		source = "// single line comment\n"
				+ "// last comment line\n";
		assertValid(source);
		
		source = "// following empty\n"
				+ "\n"
				+ "// last line\n";
		assertValid(source);
		
		source = "// following comment // another comment \n";
		assertValid(source);
		
		
		// MULTILINE_COMMENT
		
		source = "/**/";
		assertValid(source);

		source = "/* single line comment */";
		assertValid(source);
		
		source = " /* single line comment\n"
				+ " * next line */";
		assertValid(source);
		
		source = "/* single line comment\n"
				+ " last comment line*/\n";
		assertValid(source);
		
		source = "/** following empty\n"
				+ "\n"
				+ " last line*/\n";
		assertValid(source);
		
		source = "/* * /\n"
				+ " actual end */\n";
		assertValid(source);
		
		source = "/* following comment /*\n"
				+ "\n"
				+ " last line*/\n";
		assertValid(source);

		
		// MIXED COMMENT
		
		source = "/* i had a dream // that this is working */";
		assertValid(source);
		
		source = "// i had a dream /* that this is working */";
		assertValid(source);
		
	}

}
