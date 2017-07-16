package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.lang.ast.Value;
import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestStringLiteral extends TestingPPBase {

	public static void test() {
		testCharacterSequence();
		testStringLiteral();
	}

	private static void testCharacterSequence() {
		assertValid(p("'v'").character_constant());
		assertValid(p("' '").character_constant());
		assertValid(p("'\t'").character_constant());
		assertValid(p("'c\\\n'").character_constant());
		assertValid(p("'\\''").character_constant());
		assertValid(p("'\"'").character_constant());

		assertValid(p("'\\''").character_constant());
		assertValid(p("'\\\"'").character_constant());
		assertValid(p("'\\?'").character_constant());
		assertValid(p("'\\\\'").character_constant());
		assertValid(p("'\\a'").character_constant());
		assertValid(p("'\\b'").character_constant());
		assertValid(p("'\\f'").character_constant());
		assertValid(p("'\\n'").character_constant());
		assertValid(p("'\\r'").character_constant());
		assertValid(p("'\\t'").character_constant());
		assertValid(p("'\\v'").character_constant());

		assertValid(p("'\\0'").character_constant());
		assertInvalid(p("'\\8'").character_constant());
		assertValid(p("'\\7'").character_constant());
		assertValid(p("'\\123'").character_constant());
		assertValid(p("'\\x0'").character_constant());
		assertValid(p("'\\xf'").character_constant());
		assertValid(p("'\\x0123'").character_constant());
		assertValid(p("'\\x4567'").character_constant());
		assertValid(p("'\\x89ab'").character_constant());
		assertValid(p("'\\xcdef'").character_constant());
		assertValid(p("'\\xABCD'").character_constant());
		assertValid(p("'\\xEFFF'").character_constant());

//		assertValid(p("L'wchar_t'").character_constant());
//		assertValid(p("u'char16_t'").character_constant());
//		assertValid(p("U'char32_t'").character_constant());
		
		
		assertInvalid(p("'\\xg'").character_constant());
		assertInvalid(p("'\\x-1'").character_constant());
		assertInvalid(p("'\\8'").character_constant());
		assertInvalid(p("'\\w'").character_constant());
		assertInvalid(p("'\n'").character_constant());
		assertInvalid(p("'''").character_constant());
//		assertInvalid(p("l'wchar_t'").character_constant());
//		assertInvalid(p("b'char16_t'").character_constant());
	}

	private static void assertValid(Value v) {
		// TODO string type testing
		assertValid(v, v.getClass());
	}

	private static void testStringLiteral() {
		assertValid(p("\"void\"").string_literal());
		assertValid(p("\"string str\"").string_literal());
		assertValid(p("\"string\tstr\"").string_literal());
		assertValid(p("\"string\\\n\"").string_literal());
		assertValid(p("\"\\\"\"").string_literal());
		assertValid(p("\"'\"").string_literal());

		assertValid(p("\"esc return \\nremaining string\"").string_literal());
		assertValid(p("\"esc \\\"\"").string_literal());
		assertValid(p("\"esc \\\"\"").string_literal());
		assertValid(p("\"esc \\?\"").string_literal());
		assertValid(p("\"esc \\\\\"").string_literal());
		assertValid(p("\"esc \\a\"").string_literal());
		assertValid(p("\"esc \\b\"").string_literal());
		assertValid(p("\"esc \\f\"").string_literal());
		assertValid(p("\"esc \\n\"").string_literal());
		assertValid(p("\"esc \\r\"").string_literal());
		assertValid(p("\"esc \\t\"").string_literal());
		assertValid(p("\"esc \\v\"").string_literal());

		assertValid(p("\"esc \\0\"").string_literal());
		assertValid(p("\"esc \\\\8\"").string_literal());
		assertValid(p("\"esc \\7\"").string_literal());
		assertValid(p("\"esc \\123\"").string_literal());
		assertValid(p("\"esc \\x0\"").string_literal());
		assertValid(p("\"esc \\xf\"").string_literal());
		assertValid(p("\"esc \\x0123456789abcdef\"").string_literal());

//		assertValid(p("L\"wchar_t\"").string_literal());
//		assertValid(p("u\"char16_t\"").string_literal());
//		assertValid(p("u8\"char16_t\"").string_literal());
//		assertValid(p("U\"char32_t\"").string_literal());
		
		
		assertInvalid(p("\"esc \\xg\"").string_literal());
		assertInvalid(p("\"missing quote ").string_literal());
		assertInvalid(p("\"esc \\x-1\"").string_literal());
		assertInvalid(p("\"esc \\8\"").string_literal());
		assertInvalid(p("\"esc \\w\"").string_literal());
		assertInvalid(p("\"no return \n allowed\"").string_literal());
		assertInvalid(p("\"\"\"").string_literal());
//		assertInvalid(p("l\"wchar_t\"").string_literal());
//		assertInvalid(p("b\"char16_t\"").string_literal());
	}

}
