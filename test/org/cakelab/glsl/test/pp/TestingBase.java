package org.cakelab.glsl.test.pp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.StandardErrorHandler;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.parser.Parser;

public abstract class TestingBase {

	protected static GLSLCompiler COMPILER;
	protected String error;
	protected String warning;
	protected boolean ignoreWarning = true;
	protected boolean mirrorToStdout = false;
	protected boolean usePPBuffer = true;
	
	protected Parser parser;

	protected final OutputStream DEV_NULL = new OutputStream() {
		@Override
		public void write(int b) throws IOException {
			// -> /dev/null
		}
	};

	/**
	 * Like UNIX tee. Output to two sinks (e.g. stdout and pipe).
	 * @author homac
	 *
	 */
	protected class Tee extends OutputStream {
	
		private PrintStream pipe;
		private OutputStream tee;
	
		public Tee(OutputStream tee, PrintStream pipeOut) {
			this.tee = tee;
			this.pipe = pipeOut;
		}
	
		@Override
		public void write(int b) throws IOException {
			tee.write(b);
			pipe.write(b);
		}
	}
	
	protected GLSLErrorHandler errorHandler = new StandardErrorHandler() {
		protected void printError(Location location, String message) {
			if (error == null && warning == null) error = location.getSourceIdentifier() + ':' + location.getLine() + ':' + location.getColumn() + ": " + message;
		}

		protected void printWarning(Location location, String message) {
			if (warning == null && error == null && !ignoreWarning) warning = location.getSourceIdentifier() + ':' + location.getLine() + ':' + location.getColumn() + ": " + message;
		}
		
		protected void printNote(Location location, String message) {
		}

	};

	protected OutputStream output(OutputStream out) {
		if (mirrorToStdout) return new Tee(out, System.out);
		else return out;
	}

	
	public abstract Parser p(String source, OutputStream out);
	
	public Parser p(String source) {
		try {
			return p(source, DEV_NULL);
		} catch (Throwable e) {
			throw new Error(e);
		}
	}

	public void assertValid(String source, String result) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			p(source, out).parse();
		} catch (Recovery e) {
		}
		assertValidPostConditions();
		String output = new String(out.toByteArray());
		if (!output.equals(result)) {
			error("result differs from expected result.\nEXPECTED: '" + result + "'\nRECEIVED: '" + output + "'");
		}
	}

	public void assertWarning(String source, String warningMessage) {
		ignoreWarning = false;
		try {
			p(source).parse();
		} catch (Recovery e) {
		}
		if (error != null) {
			error("received error instead of warning: " + error);
		} else if (warning == null) {
			error("got no warning, expected: " + warningMessage);
		} else if (!warning.endsWith(warningMessage)) {
			error("expected warning: \"" + warningMessage + "\"\nbut got: \"" + warning + "\"");
		}
		ignoreWarning  = true;
	}
	
	public void assertError(String source, String errorMessage) {
		try {
			p(source).parse();
		} catch (Recovery e) {
		}
		assertError(errorMessage);
	}
	public void assertError(String errorMessage) {
		if (error == null) {
			error("expected an error");
		} else if (!error.endsWith(errorMessage)) {
			error("expected error: \"" + errorMessage + "\"\nbut got: \"" + error + "\"");
		}
	}

	public void assertError(Expression e, String errorMessage) {
		if (!assertInvalidPostConditions()) error("expected an error");
		assertError(errorMessage);
	}


	public void assertValid(String source) {
		try {
			p(source).parse();
		} catch (Recovery e) {
		}
		assertValidPostConditions();
	}

	public void assertValid(Node expr) {
		assertValid(expr, expr.getClass());
	}
	
	
	public void assertValid(Node expr, Class<? extends Node> clazz) {
		if (expr == null) error("expected a result");
		else if (clazz.isInstance(expr)) assertValidPostConditions();
		else error("expected an instance of type " + clazz.getSimpleName() + " but got " + expr.getClass().getSimpleName());
	}

	protected boolean assertValidPostConditions() {
		if (warning != null) error("received unexpected warning: " + warning);
		if (error != null) error("received unexpected error: " + error);
		else if (!parser.atEOF()) error("preprocessor not at EOF");
		else return true;
		
		return false;
	}


	public void assertInvalid(String source) {
		try {
			p(source).parse();
		} catch (Recovery e) {
		}
		if (!assertInvalidPostConditions()) error("expected an error");
	}
	
	public void assertInvalid(Expression expr) {
		if (expr == null || assertInvalidPostConditions()) return;
		else error("expected an error");
	}

	public boolean assertInvalidPostConditions() {
		if (error != null || !parser.atEOF()) return true;
		return false;
	}

	public void assertEval(Expression e, int result, Class<? extends Expression> clazz) {
		assertEval(e, Long.valueOf(result), clazz);
	}
	
	public void assertEval(Expression e, boolean result, Class<? extends Expression> clazz) {
		assertEval(e, Boolean.valueOf(result), clazz);
	}
	
	public void assertEval(Expression e, Object result, Class<? extends Expression> clazz) {
		assertValid(e, clazz);
		try {
			Object value = e.eval().value().getNativeValue();
			if (!value.equals(result)) {
				error("result " + value.toString() + " does not equal " + result.toString());
			}
		} catch (EvaluationException ex) {
			error(ex.getMessage());
		}
		
	}


	
	public void error(String msg) {
		System.err.println("\n");
		StackTraceElement caller = getCallSite();
		System.err.println(caller.toString() + ": " + msg);
		System.exit(-1);
	}
	
	
	private StackTraceElement getCallSite() {
		String baseClassNamePrefix = "Testing";
		assert (TestingBase.class.getSimpleName().startsWith(baseClassNamePrefix)) : "need to adjust prefix of the base class names to make tests work again";
		
		for (StackTraceElement stackElem : Thread.currentThread().getStackTrace()) {
			String className = stackElem.getClassName().replaceAll("[^\\.]*\\.", "");
			if (!className.equals(Thread.class.getSimpleName())
					&& !className.startsWith(baseClassNamePrefix)) {
				return stackElem;
			}
		}
		return null;
	}

	public String indent(int depth) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < depth; i++) result.append(' ');
		return result.toString();
	}
	



}
