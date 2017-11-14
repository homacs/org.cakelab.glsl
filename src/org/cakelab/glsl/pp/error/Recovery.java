package org.cakelab.glsl.pp.error;

@SuppressWarnings("serial")
public class Recovery extends Exception {

	public Recovery() {
		super();
	}

	public Recovery(String message, Throwable cause) {
		super(message, cause);
	}

	public Recovery(Throwable cause) {
		super(cause);
	}

	public Recovery(String msg) {
		super(msg);
	}

}
