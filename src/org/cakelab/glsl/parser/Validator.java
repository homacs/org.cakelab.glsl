package org.cakelab.glsl.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.cakelab.glsl.ast.Function;
import org.cakelab.glsl.ast.Scope;
import org.cakelab.glsl.ast.Type;
import org.cakelab.glsl.ast.Variable;
import org.cakelab.glsl.parser.GLSLParser.GlslBlockStructureContext;
import org.cakelab.glsl.parser.GLSLParser.GlslFunctionHeaderContext;


public class Validator {
	
	private Scope scope;
	
	
	public Validator() {
		reset();
	}

	public void reset() {
		scope = new Scope(Scope.BUILTIN_SCOPE);
	}

	public void enterScope(Scope child) {
		scope.add(child);
		scope = child;
	}
	
	public void leaveScope() {
		scope = scope.getParent();
	}

	public void addDeclaredStruct(org.cakelab.glsl.parser.GLSLParser.GlslStructSpecifierContext context) throws RecognitionException {
		// STRUCT IDENTIFIER
		String name = context.getChild(1).getText();
		if (istype(name)) throw new Error("type '" + name + "' already exists.");
		addDeclaredType(name, null);
	}
	
	public void addDeclaredInterfaceBlock(GlslBlockStructureContext context) {
		// qualifiers IDENTIFIER ..
		// (second position)
		String name = context.getChild(1).getText();
		if (istype(name)) throw new Error("type '" + name + "' already exists.");
		addDeclaredType(name, null);
	}
	
	public void addDeclaredFunction(GlslFunctionHeaderContext context) {
		// typeSpecifier IDENTIFIER ..
		// (second position)
		addDeclaredFunction(context.getChild(1).getText(), null);
	}
	
	public void addDeclaredFunction(String name, Function func) {
		scope.addFunction(name, func);
	}
	
	
	public void addDeclaredStruct(org.cakelab.glsl.pp.GLSLPPParser.GlslStructSpecifierContext context) {
		// preprocessing: intentionally ignored
	}

	/**
	 * Checks whether the following IDENTIFIER (LL(1)) is the name of a declared or builtin type.
	 * @param _ctx
	 * @return
	 */
	public boolean istype(ParserRuleContext _ctx) {
		return istype(_ctx.getStart().getText());
	}

	public boolean istype(String identifier) {
		boolean result = scope.containsType(identifier);
		return result;
	}

	/**
	 * Checks whether the following IDENTIFIER is a function name.
	 * 
	 * @param _ctx
	 * @return
	 */
	public boolean isfunc(String identifier) {
		boolean result = scope.containsFunction(identifier);
		return result;
	}


	/**
	 * Checks whether the following IDENTIFIER is a variable name.
	 * @param _ctx
	 */
	public boolean isvar(ParserRuleContext _ctx) {
		String name = _ctx.getStart().getText();
		boolean result = scope.containsVariable(name);
		return result;
	}

	public void addDeclaredVariable(ParserRuleContext _ctx) {
		addDeclaredVariable(_ctx.getStart().getText(), null);
	}

	public void addDeclaredVariable(String name, Variable var) {
		scope.addVariable(name, var);
	}

	public void addDeclaredType(String name, Type type) {
		scope.addType(name, type);
	}


	
}
