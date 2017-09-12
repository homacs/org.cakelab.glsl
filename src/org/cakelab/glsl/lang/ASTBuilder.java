package org.cakelab.glsl.lang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cakelab.glsl.GLSLBaseListener;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLParser.GlslCompoundStatementContext;
import org.cakelab.glsl.GLSLParser.GlslFunctionDefinitionContext;
import org.cakelab.glsl.GLSLParser.GlslFunctionPrototypeContext;
import org.cakelab.glsl.GLSLParser.GlslInterfaceBlockStructureContext;
import org.cakelab.glsl.GLSLParser.GlslStructSpecifierContext;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.ast.ASTFactory;
import org.cakelab.glsl.lang.ast.CompoundStatement;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Function.Body;
import org.cakelab.glsl.lang.ast.InterfaceBlock;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Struct;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.pp.LocationMap;

public class ASTBuilder extends GLSLBaseListener {
	
	private ASTFactory factory;
	private LocationMap locations;
	private TokenStream tokens;
	private GLSLErrorHandler errorHandler;
	private SymbolTable symbolTable;
	private boolean functionDefinitionContext;
	private Function functionDefinition;
	
	
	
	public ASTBuilder(TokenStream tokens, LocationMap locations, SymbolTable symbolTable, GLSLErrorHandler errorHandler) {
		configure(tokens, locations, symbolTable, errorHandler);
	}
	
	void configure(TokenStream tokens, LocationMap locations, SymbolTable symbolTable, GLSLErrorHandler errorHandler) {
		this.locations = locations;
		this.symbolTable = symbolTable;
		this.errorHandler = errorHandler;
		this.tokens = tokens;
		factory = new ASTFactory(symbolTable, errorHandler);
		symbolTable.reset();
	}
	

	@Override
	public void exitGlslStructSpecifier(GlslStructSpecifierContext context) {
		// STRUCT IDENTIFIER? structBody
		TerminalNode ident = context.IDENTIFIER();
		String name = ident.getText();
		if (symbolTable.getScope().containsType(name)) errorHandler.error(ident, "type '" + name + "' already exists in this scope.");
		
		Struct struct = factory.create(context);
		addDeclaredType(name, struct);
	}
	
	@Override
	public void exitGlslInterfaceBlockStructure(GlslInterfaceBlockStructureContext context) {
		// qualifiers IDENTIFIER structBody
		// (second position)
		TerminalNode identifier = context.IDENTIFIER();
		String name = identifier.getText();
		if (symbolTable.getScope().containsType(name)) errorHandler.error(identifier, "type '" + name + "' already exists in this scope.");
		InterfaceBlock block = new InterfaceBlock(factory.createInterval(context), symbolTable.getScope(), name);
		addDeclaredType(name, block);
	}
	
	@Override
	public void enterGlslFunctionDefinition(GlslFunctionDefinitionContext ctx) {
		functionDefinitionContext = true;
	}

	@Override
	public void exitGlslFunctionPrototype(GlslFunctionPrototypeContext ctx) {
		if (functionDefinitionContext) {
			functionDefinition = factory.create(ctx);
			symbolTable.addFunctionDefinition(functionDefinition);
		} else {
			symbolTable.addFunction(factory.create(ctx));
		}
	}

	@Override
	public void enterGlslCompoundStatement(GlslCompoundStatementContext ctx) {
		if (functionDefinitionContext) {
			// create and enter function body
			Body body = functionDefinition.createBody(symbolTable.getScope());
			symbolTable.enterScope(body);
			
			functionDefinitionContext = false;
			functionDefinition = null;
		} else {
			symbolTable.enterScope(new CompoundStatement(symbolTable.getScope()));
		}
	}
	
	@Override
	public void exitGlslCompoundStatement(GlslCompoundStatementContext ctx) {
		symbolTable.leaveScope();
	}

	public void addDeclaredVariable(ParserRuleContext _ctx) {
		addDeclaredVariable(_ctx.getStart().getText(), null);
	}

	public void addDeclaredVariable(String name, Variable var) {
		symbolTable.addVariable(name, var);
	}

	public void addDeclaredType(String name, Type type) {
		symbolTable.addType(name, type);
	}

	public Scope getToplevelScope() {
		return symbolTable.getTopLevelScope();
	}

	public void addDeclaredFunction(String string) {
		symbolTable.addFunction(new Function(Type._void, string));
	}


	
}
