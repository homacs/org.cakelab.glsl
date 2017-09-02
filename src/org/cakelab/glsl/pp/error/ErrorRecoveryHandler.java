package org.cakelab.glsl.pp.error;

public interface ErrorRecoveryHandler {

	void dismiss();

	void recoverError();

	void recoverWarning();

}
