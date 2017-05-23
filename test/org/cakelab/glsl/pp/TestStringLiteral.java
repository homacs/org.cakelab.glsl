package org.cakelab.glsl.pp;

public class TestStringLiteral extends TestBaseGLSLPP {

	public static void test() {
		testCharacterSequence();
		testStringLiteral();
	}

	private static void testCharacterSequence() {
		assertValid(p("'void'").glslppCharacterConstant());
		assertValid(p("'char sequence'").glslppCharacterConstant());
		assertValid(p("'char\tsequence'").glslppCharacterConstant());
		assertValid(p("'char sequence\\\n'").glslppCharacterConstant());
		assertValid(p("'\\''").glslppCharacterConstant());
		assertValid(p("'\"'").glslppCharacterConstant());

		assertValid(p("'esc return \\nremaining char seq'").glslppCharacterConstant());
		assertValid(p("'esc \\''").glslppCharacterConstant());
		assertValid(p("'esc \\\"'").glslppCharacterConstant());
		assertValid(p("'esc \\?'").glslppCharacterConstant());
		assertValid(p("'esc \\\\'").glslppCharacterConstant());
		assertValid(p("'esc \\a'").glslppCharacterConstant());
		assertValid(p("'esc \\b'").glslppCharacterConstant());
		assertValid(p("'esc \\f'").glslppCharacterConstant());
		assertValid(p("'esc \\n'").glslppCharacterConstant());
		assertValid(p("'esc \\r'").glslppCharacterConstant());
		assertValid(p("'esc \\t'").glslppCharacterConstant());
		assertValid(p("'esc \\v'").glslppCharacterConstant());

		assertValid(p("'esc \\0'").glslppCharacterConstant());
		assertValid(p("'esc \\\\8'").glslppCharacterConstant());
		assertValid(p("'esc \\7'").glslppCharacterConstant());
		assertValid(p("'esc \\123'").glslppCharacterConstant());
		assertValid(p("'esc \\x0'").glslppCharacterConstant());
		assertValid(p("'esc \\xf'").glslppCharacterConstant());
		assertValid(p("'esc \\x0123456789abcdef'").glslppCharacterConstant());

		assertValid(p("L'wchar_t'").glslppCharacterConstant());
		assertValid(p("u'char16_t'").glslppCharacterConstant());
		assertValid(p("U'char32_t'").glslppCharacterConstant());
		
		
		assertInvalid(p("'esc \\xg'").glslppCharacterConstant());
		assertInvalid(p("'esc \\x-1'").glslppCharacterConstant());
		assertInvalid(p("'esc \\8'").glslppCharacterConstant());
		assertInvalid(p("'esc \\w'").glslppCharacterConstant());
		assertInvalid(p("'no return \n allowed'").glslppCharacterConstant());
		assertInvalid(p("'''").glslppCharacterConstant());
		assertInvalid(p("l'wchar_t'").glslppCharacterConstant());
		assertInvalid(p("b'char16_t'").glslppCharacterConstant());
	}

	private static void testStringLiteral() {
		assertValid(p("\"void\"").glslppStringLiteral());
		assertValid(p("\"string str\"").glslppStringLiteral());
		assertValid(p("\"string\tstr\"").glslppStringLiteral());
		assertValid(p("\"string\\\n\"").glslppStringLiteral());
		assertValid(p("\"\\\"\"").glslppStringLiteral());
		assertValid(p("\"'\"").glslppStringLiteral());

		assertValid(p("\"esc return \\nremaining string\"").glslppStringLiteral());
		assertValid(p("\"esc \\\"\"").glslppStringLiteral());
		assertValid(p("\"esc \\\"\"").glslppStringLiteral());
		assertValid(p("\"esc \\?\"").glslppStringLiteral());
		assertValid(p("\"esc \\\\\"").glslppStringLiteral());
		assertValid(p("\"esc \\a\"").glslppStringLiteral());
		assertValid(p("\"esc \\b\"").glslppStringLiteral());
		assertValid(p("\"esc \\f\"").glslppStringLiteral());
		assertValid(p("\"esc \\n\"").glslppStringLiteral());
		assertValid(p("\"esc \\r\"").glslppStringLiteral());
		assertValid(p("\"esc \\t\"").glslppStringLiteral());
		assertValid(p("\"esc \\v\"").glslppStringLiteral());

		assertValid(p("\"esc \\0\"").glslppStringLiteral());
		assertValid(p("\"esc \\\\8\"").glslppStringLiteral());
		assertValid(p("\"esc \\7\"").glslppStringLiteral());
		assertValid(p("\"esc \\123\"").glslppStringLiteral());
		assertValid(p("\"esc \\x0\"").glslppStringLiteral());
		assertValid(p("\"esc \\xf\"").glslppStringLiteral());
		assertValid(p("\"esc \\x0123456789abcdef\"").glslppStringLiteral());

		assertValid(p("L\"wchar_t\"").glslppStringLiteral());
		assertValid(p("u\"char16_t\"").glslppStringLiteral());
		assertValid(p("u8\"char16_t\"").glslppStringLiteral());
		assertValid(p("U\"char32_t\"").glslppStringLiteral());
		
		
		assertInvalid(p("\"esc \\xg\"").glslppStringLiteral());
		assertInvalid(p("\"missing quote ").glslppStringLiteral());
		assertInvalid(p("\"esc \\x-1\"").glslppStringLiteral());
		assertInvalid(p("\"esc \\8\"").glslppStringLiteral());
		assertInvalid(p("\"esc \\w\"").glslppStringLiteral());
		assertInvalid(p("\"no return \n allowed\"").glslppStringLiteral());
		assertInvalid(p("\"\"\"").glslppStringLiteral());
		assertInvalid(p("l\"wchar_t\"").glslppStringLiteral());
		assertInvalid(p("b\"char16_t\"").glslppStringLiteral());
	}

}
