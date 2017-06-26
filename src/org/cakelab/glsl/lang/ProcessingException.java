package org.cakelab.glsl.lang;

@SuppressWarnings("serial")
public class ProcessingException extends Exception {

	public ProcessingException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProcessingException(Throwable cause) {
		super(cause);
	}

	public ProcessingException(String error) {
		super(error);
	}

}
