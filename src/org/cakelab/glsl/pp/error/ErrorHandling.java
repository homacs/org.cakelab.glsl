package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.pp.scanner.IScanner;

public class ErrorHandling {
	

	protected ErrorHandler errorHandler = new StandardErrorHandler();
	private IScanner input;
	
	
	public ErrorHandling(IScanner in) {
		this.input = in;
	}
	
	public ErrorHandling(IScanner in, ErrorHandler handler) {
		this(in);
		errorHandler = handler;
	}

	public ErrorHandling() {
	}


	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public void setInputReference(IScanner input) {
		this.input = input;
	}


	/** reports an error on the next location to be scanned */
	protected void syntaxError(String string) throws SyntaxError {
		syntaxError(input.nextLocation(), string);
	}

	protected void syntaxError(Location location, String string) throws SyntaxError {
		boolean stop = errorHandler.error(location, string);
		if (stop) {
			input.dismiss();
		}
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			boolean stop = errorHandler.error(e.getOrigin(), e.getMessage());
			if (stop) {
				input.dismiss();
			}
		}
	}
	
	protected ExpressionError expressionError(String message) {
		syntaxError(message);
		Interval interval = new Interval(input.location(), input.location());
		return new ExpressionError(interval, message);
	}


	protected boolean syntaxWarning(String string) {
		return syntaxWarning(input.location().getLineStart(), string);
	}

	protected boolean syntaxWarning(Location location, String message) {
		boolean stop = errorHandler.warning(location, message);
		if (stop) {
			input.dismiss();
		}
		return stop;
	}

	protected boolean syntaxWarning(Interval interval, String message) {
		boolean stop = errorHandler.warning(interval, message);
		if (stop) {
			input.dismiss();
		}
		return stop;
	}

	

}
