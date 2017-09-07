package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.error.ExpressionError;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.pp.lexer.ILexer;

public class PPHelper {
	protected PPState state;
	private boolean throwRecoveryExceptions;
	
	
	
	public PPHelper(boolean throwRecoveryExceptions, PPState state) {
		this.throwRecoveryExceptions = throwRecoveryExceptions;
		this.state = state;
	}
	
	public PPHelper(PPState state) {
		this.throwRecoveryExceptions = false;
		this.state = state;
	}
	

	public PPHelper() {
	}


	public PPState getState() {
		return state;
	}

	public void setRecoveryException(boolean enable) {
		this.throwRecoveryExceptions = enable;
	}


	public void setState(PPState state) {
		this.state = state;
	}

	protected ILexer getLexer() {
		return state.getLexer();
	}

	protected void syntaxError(Location location, String string) throws SyntaxError, Recovery {
		state.getErrorHandler().error(location, string);
		if (throwRecoveryExceptions) throw new Recovery();
	}

	protected void syntaxError(Node node, String string) throws SyntaxError, Recovery {
		state.getErrorHandler().error(node, string);
		if (throwRecoveryExceptions) throw new Recovery();
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError, Recovery {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			state.getErrorHandler().error(e.getOrigin(), e.getMessage());
			if (throwRecoveryExceptions) throw new Recovery();
		}
	}
	

	protected void syntaxWarning(Location location, String message) {
		state.getErrorHandler().warning(location, message);
	}

	protected void syntaxWarning(Interval interval, String message) {
		state.getErrorHandler().warning(interval, message);
	}


	
	
	
	
}
