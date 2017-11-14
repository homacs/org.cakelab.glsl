package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.pp.TestingExprBase;

public class TestStringLiteral extends TestingExprBase implements Test {
	// TODO [4] string testing more serious


	public void test() {
		testCharacterSequence();
		testStringLiteral();
	}

	private void testCharacterSequence() {
		assertValid(expr("'v'").character_constant());
		assertValid(expr("' '").character_constant());
		assertValid(expr("'\t'").character_constant());
		assertValid(expr("'c\\\n'").character_constant());
		assertValid(expr("'\\''").character_constant());
		assertValid(expr("'\"'").character_constant());

		assertValid(expr("'\\''").character_constant());
		assertValid(expr("'\\\"'").character_constant());
		assertValid(expr("'\\?'").character_constant());
		assertValid(expr("'\\\\'").character_constant());
		assertValid(expr("'\\a'").character_constant());
		assertValid(expr("'\\b'").character_constant());
		assertValid(expr("'\\f'").character_constant());
		assertValid(expr("'\\n'").character_constant());
		assertValid(expr("'\\r'").character_constant());
		assertValid(expr("'\\t'").character_constant());
		assertValid(expr("'\\v'").character_constant());

		assertValid(expr("'\\0'").character_constant());
		assertInvalid(expr("'\\8'").character_constant());
		assertValid(expr("'\\7'").character_constant());
		assertValid(expr("'\\123'").character_constant());
		assertValid(expr("'\\x0'").character_constant());
		assertValid(expr("'\\xf'").character_constant());
		assertValid(expr("'\\x0123'").character_constant());
		assertValid(expr("'\\x4567'").character_constant());
		assertValid(expr("'\\x89ab'").character_constant());
		assertValid(expr("'\\xcdef'").character_constant());
		assertValid(expr("'\\xABCD'").character_constant());
		assertValid(expr("'\\xEFFF'").character_constant());

//		assertValid(expr("L'wchar_t'").character_constant());
//		assertValid(expr("u'char16_t'").character_constant());
//		assertValid(expr("U'char32_t'").character_constant());
		
		
		assertInvalid(expr("'\\xg'").character_constant());
		assertInvalid(expr("'\\x-1'").character_constant());
		assertInvalid(expr("'\\8'").character_constant());
		assertInvalid(expr("'\\w'").character_constant());
		assertInvalid(expr("'\n'").character_constant());
		assertInvalid(expr("'''").character_constant());
//		assertInvalid(expr("l'wchar_t'").character_constant());
//		assertInvalid(expr("b'char16_t'").character_constant());
	}

	private void testStringLiteral() {
		assertValid(expr("\"void\"").string_literal());
		assertValid(expr("\"string str\"").string_literal());
		assertValid(expr("\"string\tstr\"").string_literal());
		assertValid(expr("\"string\\\n\"").string_literal());
		assertValid(expr("\"\\\"\"").string_literal());
		assertValid(expr("\"'\"").string_literal());

		assertValid(expr("\"esc return \\nremaining string\"").string_literal());
		assertValid(expr("\"esc \\\"\"").string_literal());
		assertValid(expr("\"esc \\\"\"").string_literal());
		assertValid(expr("\"esc \\?\"").string_literal());
		assertValid(expr("\"esc \\\\\"").string_literal());
		assertValid(expr("\"esc \\a\"").string_literal());
		assertValid(expr("\"esc \\b\"").string_literal());
		assertValid(expr("\"esc \\f\"").string_literal());
		assertValid(expr("\"esc \\n\"").string_literal());
		assertValid(expr("\"esc \\r\"").string_literal());
		assertValid(expr("\"esc \\t\"").string_literal());
		assertValid(expr("\"esc \\v\"").string_literal());

		assertValid(expr("\"esc \\0\"").string_literal());
		assertValid(expr("\"esc \\\\8\"").string_literal());
		assertValid(expr("\"esc \\7\"").string_literal());
		assertValid(expr("\"esc \\123\"").string_literal());
		assertValid(expr("\"esc \\x0\"").string_literal());
		assertValid(expr("\"esc \\xf\"").string_literal());
		assertValid(expr("\"esc \\x0123456789abcdef\"").string_literal());

//		assertValid(expr("L\"wchar_t\"").string_literal());
//		assertValid(expr("u\"char16_t\"").string_literal());
//		assertValid(expr("u8\"char16_t\"").string_literal());
//		assertValid(expr("U\"char32_t\"").string_literal());
		
		
		assertInvalid(expr("\"esc \\xg\"").string_literal());
		assertInvalid(expr("\"missing quote ").string_literal());
		assertInvalid(expr("\"esc \\x-1\"").string_literal());
		assertInvalid(expr("\"esc \\8\"").string_literal());
		assertInvalid(expr("\"esc \\w\"").string_literal());
		assertInvalid(expr("\"no return \n allowed\"").string_literal());
		assertInvalid(expr("\"\"\"").string_literal());
//		assertInvalid(expr("l\"wchar_t\"").string_literal());
//		assertInvalid(expr("b\"char16_t\"").string_literal());
	}

}
