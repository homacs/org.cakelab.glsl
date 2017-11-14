package org.cakelab.glsl.test.lang;

import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.test.builtins.TestBuiltinBase;

public class TestingTools extends TestBuiltinBase {

	protected SymbolTable presetSymbols = null;
	protected boolean validateIdentifiers = true;
	protected boolean autoTearDown = true;

	


	public static void error(String msg) {
		System.err.println("\n");
		StackTraceElement caller = getCallSite();
		System.err.println(caller.toString() + ": " + msg);
		System.exit(-1);
	}
	
	
	private static StackTraceElement getCallSite() {
		String baseClassNamePrefix = "Testing";
		assert (TestingTools.class.getSimpleName().startsWith(baseClassNamePrefix)) : "need to adjust prefix of the base class names to make tests work again";
		
		for (StackTraceElement stackElem : Thread.currentThread().getStackTrace()) {
			String className = stackElem.getClassName().replaceAll("[^\\.]*\\.", "");
			if (!className.equals(Thread.class.getSimpleName())
					&& !className.startsWith(baseClassNamePrefix)) {
				return stackElem;
			}
		}
		return null;
	}
	
	public void tearDown() {
		if (autoTearDown) presetSymbols = null;
	}



}
