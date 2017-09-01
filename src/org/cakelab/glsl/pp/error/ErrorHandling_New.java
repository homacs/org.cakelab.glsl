package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.scanner.IScanner;

public class ErrorHandling_New {
	

	protected ErrorHandler errorHandler = new StandardErrorHandler();
	protected ErrorRecoveryHandler recoveryHandler;
	
	
	public ErrorHandling_New(ErrorRecoveryHandler recoveryHandler) {
		this.recoveryHandler = recoveryHandler;
	}
	
	public ErrorHandling_New(ErrorRecoveryHandler recoveryHandler, ErrorHandler handler) {
		this(recoveryHandler);
		errorHandler = handler;
	}

	/**
	 * Note: Error handling requires errorHandler and input to be set.
	 * @see #setErrorHandler(ErrorHandler)
	 * @see #setInputReference(IScanner)
	 */
	protected ErrorHandling_New() {
		
	}

	
	public void setRecoveryHandler(ErrorRecoveryHandler recoveryHandler) {
		this.recoveryHandler = recoveryHandler;
	}
	
	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public ErrorHandler getErrorHandler() {
		return this.errorHandler;
	}

	protected void syntaxError(Location location, String string) throws SyntaxError {
		boolean stop = errorHandler.error(location, string);
		if (stop) {
			recoveryHandler.dismiss();
		}
	}

	protected void syntaxError(Node node, String string) throws SyntaxError {
		boolean stop = errorHandler.error(node, string);
		if (stop) {
			recoveryHandler.dismiss();
		}
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			boolean stop = errorHandler.error(e.getOrigin(), e.getMessage());
			if (stop) {
				recoveryHandler.dismiss();
			}
		}
	}
	
	protected ExpressionError expressionError(Interval interval, String message) {
		syntaxError(interval.getStart(), message);
		return new ExpressionError(interval, message);
	}


	protected boolean syntaxWarning(Location location, String message) {
		boolean stop = errorHandler.warning(location, message);
		if (stop) {
			recoveryHandler.dismiss();
		}
		return stop;
	}

	protected boolean syntaxWarning(Interval interval, String message) {
		boolean stop = errorHandler.warning(interval, message);
		if (stop) {
			recoveryHandler.dismiss();
		}
		return stop;
	}

	
	
	
	
}
