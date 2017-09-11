package org.cakelab.glsl.lang.lexer.tokens;

public class GLSLParserToken {

	String text;
	int type;

	public GLSLParserToken(String text, int code) {
		this.text = text;
		this.type = code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GLSLParserToken other = (GLSLParserToken) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	

}
