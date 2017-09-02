package org.cakelab.glsl.pp.error;

public class ErrorHandlingStrategy {
	ErrorHandler errorHandler;
	ErrorRecoveryHandler errorRecoveryHandler;
	
	
	public ErrorHandlingStrategy(ErrorHandler errorHandler, ErrorRecoveryHandler errorRecoveryHandler) {
		super();
		this.errorHandler = errorHandler;
		this.errorRecoveryHandler = errorRecoveryHandler;
	}
	
	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}
	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}
	public ErrorRecoveryHandler getErrorRecoveryHandler() {
		return errorRecoveryHandler;
	}
	public void setErrorRecoveryHandler(ErrorRecoveryHandler errorRecoveryHandler) {
		this.errorRecoveryHandler = errorRecoveryHandler;
	}
	
}
