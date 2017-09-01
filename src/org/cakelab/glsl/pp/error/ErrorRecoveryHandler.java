package org.cakelab.glsl.pp.error;

public interface ErrorRecoveryHandler {

	void dismiss();

	void skip_to_next_line();

}
