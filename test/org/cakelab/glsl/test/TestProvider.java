package org.cakelab.glsl.test;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.impl.DelegatingResourceManager;

public interface TestProvider {

	void test(Class<? extends Test> testType);

	GLSLCompiler getCompiler();

	DelegatingResourceManager getDelegatingResourceManager();

	TestErrorHandler getErrorHandler();

	void setPresetSymbols(SymbolTable presetSymbols);

}
