package org.cakelab.glsl.lang.lexer.tokens;

import org.cakelab.glsl.builtin.GLSLExtensionSet;

public class ExtendedTokenTable implements ITokenTable {

	private GLSLExtensionSet extensions;
	private ITokenTable main;

	public ExtendedTokenTable(ITokenTable main, GLSLExtensionSet extensions) {
		this.main = main;
		this.extensions = extensions;
	}
	
	
	
	@Override
	public Integer mapPunctuator(String text) {
		Integer result = main.mapPunctuator(text);
		if (result == null) {
			result = extensions.mapPunctuator(text);
		}
		return result;
	}

	@Override
	public boolean isPunctuator(String text) {
		return main.isPunctuator(text) || extensions.isPunctuator(text);
	}

	@Override
	public boolean isLanguageKeyword(String text) {
		if (text.equals("image1D")) {
			System.out.println("DEBUG");
		}
		return main.isLanguageKeyword(text) || extensions.isLanguageKeyword(text);
	}

	/**
	 * Please note: A keyword, reserved by a specific glsl version can be a regular
	 * keyword in some extension.
	 * <br/><br/>
	 * To check whether a keyword is actually reserved in certain configuration do
	 * <pre>
	 * if (!isLanguageKeyword(text) && isReservedKeyword(text)) {
	 * 		error(text + " is reserved keyword and cannot be used");
	 * }
	 * </pre>
	 */
	@Override
	public boolean isReservedKeyword(String text) {
		return main.isReservedKeyword(text) || extensions.isReservedKeyword(text);
	}

	@Override
	public boolean isBuiltinType(String text) {
		return main.isBuiltinType(text) || extensions.isBuiltinType(text);
	}

	@Override
	public Integer mapLanguageKeyword(String text) {
		Integer result = main.mapLanguageKeyword(text);
		if (result == null) {
			result = extensions.mapLanguageKeyword(text);
		}
		return result;
	}

}
