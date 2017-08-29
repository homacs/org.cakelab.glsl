package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.pp.scanner.IScanner;

public class ErrorHandling {
	

	protected ErrorHandler errorHandler = new StandardErrorHandler();
	protected IScanner in;
	
	
	public ErrorHandling(IScanner in) {
		this.in = in;
	}
	
	public ErrorHandling(IScanner in, ErrorHandler handler) {
		this(in);
		errorHandler = handler;
	}

	/**
	 * Note: Error handling requires errorHandler and input to be set.
	 * @see #setErrorHandler(ErrorHandler)
	 * @see #setInputReference(IScanner)
	 */
	protected ErrorHandling() {
		
	}

	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public ErrorHandler getErrorHandler() {
		return this.errorHandler;
	}
	
	public void setInputReference(IScanner input) {
		this.in = input;
	}

	public IScanner getInputReference() {
		return this.in;
	}
	/** reports an error on the next location to be scanned */
	protected void syntaxError(String string) throws SyntaxError {
		syntaxError(in.nextLocation(), string);
	}

	protected void syntaxError(Location location, String string) throws SyntaxError {
		boolean stop = errorHandler.error(location, string);
		if (stop) {
			in.dismiss();
		}
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			boolean stop = errorHandler.error(e.getOrigin(), e.getMessage());
			if (stop) {
				in.dismiss();
			}
		}
	}
	
	protected ExpressionError expressionError(String message) {
		syntaxError(message);
		Interval interval = new Interval(in.location(), in.location());
		return new ExpressionError(interval, message);
	}


	protected boolean syntaxWarning(String string) {
		return syntaxWarning(in.location().getLineStart(), string);
	}

	protected boolean syntaxWarning(Location location, String message) {
		boolean stop = errorHandler.warning(location, message);
		if (stop) {
			in.dismiss();
		}
		return stop;
	}

	protected boolean syntaxWarning(Interval interval, String message) {
		boolean stop = errorHandler.warning(interval, message);
		if (stop) {
			in.dismiss();
		}
		return stop;
	}

	

}
