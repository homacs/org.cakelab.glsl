package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.ParserErrorHandler;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.Preprocessor;

public class TestingPPBase {

	private static String error;
	private static String warning;
	private static boolean ignoreWarning = true;

	private static Preprocessor pp;

	private static ParserErrorHandler errorHandler = new ParserErrorHandler() {


		@Override
		public boolean error(Location location, String message) {
			if (error == null && warning == null) error = location.getSourceIdentifier() + ':' + location.getLine() + ':' + location.getColumn() + ": " + message;
			return false;
		}

		@Override
		public boolean warning(Location location, String message) {
			if (warning == null && error == null && !ignoreWarning) warning = location.getSourceIdentifier() + ':' + location.getLine() + ':' + location.getColumn() + ": " + message;
			return false;
		}

		@Override
		public boolean error(Node node, String message) {
			return error(node.getStart(), message);
		}
		
	};

	public static Preprocessor p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			pp = new Preprocessor("0", new ByteArrayInputStream(source.getBytes()), out);
			pp.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return pp;
	}

	public static Preprocessor p(String source) {
		try {
			return p(source, new FileOutputStream("/dev/null"));
		} catch (Throwable e) {
			throw new Error(e);
		}
	}

	public static void assertValid(String source, String result) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		p(source, out).process();
		assertValidPostConditions();
		String output = new String(out.toByteArray());
		if (!output.equals(result)) {
			error("result differs from expected result.\nEXPECTED: " + result + "\nRECEIVED: " + output);
		}
	}

	public static void assertWarning(String source, String warningMessage) {
		ignoreWarning = false;
		p(source).process();
		if (error != null) {
			error("received error instead of warning: " + error);
		} else if (warning == null) {
			error("got no warning, expected: " + warningMessage);
		} else if (!warning.endsWith(warningMessage)) {
			error("expected warning: \"" + warningMessage + "\"\nbut got: \"" + warning + "\"");
		}
		ignoreWarning  = true;
	}
	
	public static void assertValid(String source) {
		p(source).process();
		assertValidPostConditions();
	}

	public static void assertValid(Expression expr) {
		if (expr == null) error("expected a result");
		else assertValidPostConditions();
	}

	private static boolean assertValidPostConditions() {
		if (warning != null) error("received unexpected warning: " + warning);
		if (error != null) error("received unexpected error: " + error);
		else if (!pp.atEOF()) error("preprocessor not at EOF");
		else return true;
		
		return false;
	}


	public static void assertInvalid(String source) {
		p(source).process();
		if (!assertInvalidPostConditions()) error("expected an error");
	}
	
	public static void assertInvalid(Expression expr) {
		if (expr == null || assertInvalidPostConditions()) return;
		else error("expected an error");
	}

	private static boolean assertInvalidPostConditions() {
		if (error != null || !pp.atEOF()) return true;
		return false;
	}

	
	
	public static void error(String msg) {
		System.err.println("\n");
		StackTraceElement caller = getCallSite();
		System.err.println(caller.toString() + ": " + msg);
		System.exit(-1);
	}
	
	
	private static StackTraceElement getCallSite() {
		String baseClassNamePrefix = "Testing";
		assert (TestingPPBase.class.getSimpleName().startsWith(baseClassNamePrefix)) : "need to adjust prefix of the base class names to make tests work again";
		
		for (StackTraceElement stackElem : Thread.currentThread().getStackTrace()) {
			String className = stackElem.getClassName().replaceAll("[^\\.]*\\.", "");
			if (!className.equals(Thread.class.getSimpleName())
					&& !className.startsWith(baseClassNamePrefix)) {
				return stackElem;
			}
		}
		return null;
	}

	public static String indent(int depth) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < depth; i++) result.append(' ');
		return result.toString();
	}
	



}
