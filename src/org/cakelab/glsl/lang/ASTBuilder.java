package org.cakelab.glsl.lang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cakelab.glsl.GLSLBaseListener;
import org.cakelab.glsl.GLSLParser.GlslFunctionPrototypeContext;
import org.cakelab.glsl.GLSLParser.GlslInterfaceBlockStructureContext;
import org.cakelab.glsl.GLSLParser.GlslStructSpecifierContext;
import org.cakelab.glsl.lang.ast.ASTFactory;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.InterfaceBlock;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Struct;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.pp.LocationMap;


public class ASTBuilder extends GLSLBaseListener {
	
	private Scope scope;
	private ASTFactory factory;
	private LocationMap locations;
	private Scope ast;
	
	
	public ASTBuilder(LocationMap locations) {
		this.locations = locations;
		reset();
	}

	public ASTBuilder() {
		// TODO [2] location map which simply maps to antlr lexer input location
		this.locations = null;
	}

	public void reset() {
		scope = new Scope(Scope.BUILTIN_SCOPE);
		ast = scope;
	}

	public void enterScope(Scope child) {
		scope.add(child);
		scope = child;
	}
	
	public void leaveScope(Scope expectedCurrent) {
		assert (expectedCurrent == scope) : "internal error: mismatch between expected and actual scope";
		scope = scope.getParent();
	}

	@Override
	public void exitGlslStructSpecifier(GlslStructSpecifierContext context) {
		// STRUCT IDENTIFIER? structBody
		String name = context.IDENTIFIER().getText();
		if (istype(name)) throw new Error("type '" + name + "' already exists.");
		
		Struct struct = factory.create(context);
		addDeclaredType(name, struct);
	}
	
	@Override
	public void exitGlslInterfaceBlockStructure(GlslInterfaceBlockStructureContext context) {
		// qualifiers IDENTIFIER structBody
		// (second position)
		String name = context.getChild(1).getText();
		if (istype(name)) throw new Error("type '" + name + "' already exists.");
		InterfaceBlock block = new InterfaceBlock(scope, name);
		addDeclaredType(name, block);
	}
	


	public void addDeclaredFunction(GlslFunctionPrototypeContext context) {
		// typeSpecifier IDENTIFIER ..
		// (second position)
		addDeclaredFunction(context.getChild(1).getText(), null);
	}
	
	public void addDeclaredFunction(String name, Function func) {
		scope.addFunction(name, func);
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

	public Scope getToplevelScope() {
		return ast;
	}


	
}
