package org.cakelab.glsl.test.lang.syntax;


public abstract class TestStruct extends TestingSyntaxBase {
	public void test() {
		testStructPrototype();
		testStructDefinition();
		testStructType();
	}

	public void testStructDefinition() {
		String source;
		
		// glsl: struct must have at least one member
		source = "struct boo{};";
		assertInvalid(source);
		
		// glsl: struct prototyping not supported
		source = "struct boo;";
		assertInvalid(source);
		
		source = "struct boo{"
				+ "int a;"
				+ "float b;"
				+ "bool c;"
				+ "};";
		assertValid(source);


		source = ""
				+ "struct myType {"
				+ "	bool exist;"
				+ "};"
				+ "struct boo {"
				+ " int a;"
				+ " float b;"
				+ " bool c;"
				+ " struct name {"
				+ "  myType c;"
				+ " } d[2];"
				+ "};";
		assertValid(source);
	}

	public void testStructType() {
		String source;
		
		source = "struct boo {"
				+ "  int a;"
				+ "  float b;"
				+ "  bool c;"
				+ "} x;";
		assertValid(source);

		source = "struct boo {"
				+ "  int a;"
				+ "  float b;"
				+ "  bool c;"
				+ "} x[4];";
		assertValid(source);

	}

	public void testStructPrototype() {
		String source;
		// apparently not allowed in glsl
		source = "struct boo;";
		assertInvalid(source);

	}


}
