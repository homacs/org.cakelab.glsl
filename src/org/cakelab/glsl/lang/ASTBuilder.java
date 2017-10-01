package org.cakelab.glsl.lang;

import java.util.List;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cakelab.glsl.GLSLBaseListener;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.GLSLParser.*;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.ast.*;
import org.cakelab.glsl.lang.ast.Function.Body;
import org.cakelab.glsl.lang.ast.types.CompoundType;
import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Struct;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.pp.LocationMap;

public class ASTBuilder extends GLSLBaseListener {
	// FIXME: allow redeclaration of array dimensions of variables (see gl_TexCoord in 1.50)
	
	
	private ASTFactory factory;
	private LocationMap locations;
	private TokenStream tokens;
	private GLSLErrorHandler errorHandler;
	private SymbolTable symbolTable;
	private boolean functionDefinitionContext;
	private Function functionDefinition;
	
	
	public ASTBuilder(TokenStream tokens, LocationMap locations, SymbolTable symbolTable, GLSLErrorHandler errorHandler) {
		this.locations = locations;
		this.symbolTable = symbolTable;
		this.errorHandler = errorHandler;
		this.tokens = tokens;
		factory = new ASTFactory(symbolTable, errorHandler);
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
	public void enterGlslFunctionDefinition(GlslFunctionDefinitionContext ctx) {
		functionDefinitionContext = true;
	}

	@Override
	public void exitGlslFunctionPrototype(GlslFunctionPrototypeContext ctx) {
		
		Function f = factory.create(ctx);
		// lookup a declared function with the same name and parameter types
		Function declared = symbolTable.getFunction(f.getName(), f.getParameterTypes());
		
		if (functionDefinitionContext) {
			if (declared == null) {
				functionDefinition = f;
				symbolTable.addFunction(functionDefinition);
			} else {
				if (!f.getType().equals(declared.getType())) {
					errorHandler.error(f, "function " + f.toString() + " already declared with different return type '" + declared.getType().toString() + "'");
					functionDefinition = f;
				} else if (declared.getBody() != null) {
					errorHandler.error(f, "function " + f.toString() + " already defined (has a body)");
					functionDefinition = f;
				} else {
					functionDefinition = declared;
				}
			}
		} else {
			if (declared == null) {
				symbolTable.addFunction(f);
			} else if (!f.getType().equals(declared.getType())) {
				errorHandler.error(f, "function " + f.toString() + " already declared with different return type '" + declared.getType().toString() + "'");
			}
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


	@Override
	public void exitGlslDeclaration(GlslDeclarationContext ctx) {
		
		// most declarations have a qualifier
		List<GlslVariableIdentifierContext> variableIdentifierCtxs = getNonEmptyListOrNull(ctx.glslVariableIdentifier());
		GlslTypeQualifierContext qualifierCtx = ctx.glslTypeQualifier();
		if (qualifierCtx != null) {
			Qualifiers qualifiers = factory.create(qualifierCtx);
			//
			// glslTypeQualifier glslIdentifier (may be type or var)
			//
			String id = getText(ctx.glslIdentifier());
			if (id != null) {
				if(symbolTable.containsType(id)) {
					// -> Qualifier Type
					// add qualifier to type
					Type type = symbolTable.getType(id);
					type.addQualifiers(qualifiers);
				}
				else if (symbolTable.containsVariable(id)) 
				{
					// -> Qualifier Variable
					addQualifiersToExistingVariable(id, qualifiers);
				}
				else
				{
					// -> Qualifier Undefined Identifier
					errorHandler.error(ctx.glslIdentifier(), "undefined identifier '" + id + "'");
				}
			} else if (variableIdentifierCtxs != null) {
				// glslTypeQualifier glslVariableIdentifier (COMMA glslVariableIdentifier)+
				for (GlslVariableIdentifierContext varIdCtx : variableIdentifierCtxs) {
					id = getText(varIdCtx);
					if (symbolTable.containsVariable(id)) {
						addQualifiersToExistingVariable(id, qualifiers);
					} else {
						errorHandler.error(varIdCtx, "undefined variable");
					}
				}
			} else if (ctx.glslTypeName() != null) {
				List<GlslArrayDimensionContext> dimensions = getNonEmptyListOrNull(ctx.glslArrayDimension());
				Type type = factory.getType(ctx.glslTypeName(), false);
				addTypeIfMissing(type);
				if (dimensions == null) {
					// glslTypeQualifier glslTypeName glslVariableDeclarations
					GlslVariableDeclarationsContext varDeclsCtx = ctx.glslVariableDeclarations();
					addVariables(varDeclsCtx, type, qualifiers);
				} else {
					// glslTypeQualifier glslTypeName glslArrayDimension+ glslVariableDeclarations?
					
					// definitely array type
					type = factory.createArrayType(type, dimensions);
					
					GlslVariableDeclarationsContext varDeclsCtx = ctx.glslVariableDeclarations();
					if (varDeclsCtx != null) {
						// array variable declarations with qualifiers
						addVariables(varDeclsCtx, type, qualifiers);
					} else {
						// add qualifier to an existing type
						type.addQualifiers(qualifiers);
					}
					
				}
			} else if (ctx.glslBuiltinType() != null) {
				// glslTypeQualifier glslBuiltinType glslArrayDimension* glslVariableDeclarations?
				List<GlslArrayDimensionContext> dimensions = getNonEmptyListOrNull(ctx.glslArrayDimension());
				Type type;
				type = factory.getType(ctx.glslBuiltinType());
				if (dimensions != null) {
					type = factory.createArrayType(type, dimensions);
				}
				
				GlslVariableDeclarationsContext varDeclsCtx = ctx.glslVariableDeclarations();
				if (varDeclsCtx != null) {
					// array variable declarations with qualifiers
					addVariables(varDeclsCtx, type, qualifiers);
				} else {
					// add qualifier to an existing type
					type.addQualifiers(qualifiers);
				}
			} else if (ctx.glslStructSpecifier() != null) {
				// glslTypeQualifier glslStructSpecifier glslArrayDimension* glslVariableDeclarations?
				Type type = factory.create(ctx.glslStructSpecifier());
				addTypeIfMissing(type);
				
				List<GlslArrayDimensionContext> dimensions = getNonEmptyListOrNull(ctx.glslArrayDimension());
				if (dimensions != null) {
					type = factory.createArrayType(type, dimensions);
				}

				GlslVariableDeclarationsContext varDeclsCtx = ctx.glslVariableDeclarations();
				if (varDeclsCtx != null) {
					// array variable declarations with qualifiers
					addVariables(varDeclsCtx, type, qualifiers);
				} else {
					// add qualifier to an existing type
					type.addQualifiers(qualifiers);
				}
			} else {
				// glslTypeQualifier
				
				// Empty declaration consisting of a qualifier only.
				// Original rule set: qualifier SEMICOLON
				// Has no meaning according to GLSL specification -> we just ignore it
			}
		} else if (ctx.glslTypePrecisionDeclaration() != null) {
			// glslTypePrecisionDeclaration
			
			GlslTypePrecisionDeclarationContext precision = ctx.glslTypePrecisionDeclaration();
			Type type = factory.getType(precision.glslTypeSpecifier(), false);
			addTypeIfMissing(type);
			String pSomething = getText(precision.glslPrecisionQualifier());
			Qualifier q = Qualifier._precision(pSomething);
			type.addQualifier(q);
		} else if (ctx.glslTypeSpecifier() != null) {
			// glslTypeSpecifier glslVariableDeclarations?
			boolean typeDeclaration = ctx.glslVariableDeclarations() == null;
			Type type = factory.getType(ctx.glslTypeSpecifier(), true);
			if (typeDeclaration) {
				addTypeIfMissing(type);
			} else {
				addTypeIfMissing(type);
				addVariables(ctx.glslVariableDeclarations(), type, null);
			}
		} else if (ctx.glslInterfaceBlockStructure() != null) {
			// glslInterfaceBlockStructure (glslVariableIdentifier glslArrayDimension*)?
			InterfaceBlock block = factory.create(ctx.glslInterfaceBlockStructure());
			if (variableIdentifierCtxs != null) {
				addTypeIfMissing(block);
				for (GlslVariableIdentifierContext varIdCtx : variableIdentifierCtxs) {
					
					String id = getText(varIdCtx);
					// create qualified variable
					Variable var = new Variable(symbolTable.getScope(), block, id);
					
					symbolTable.addVariable(var);
				}
			} else {
				// all member variables global
				IScope globalScope = symbolTable.getTopLevelScope();
				for (CompoundType.Member m : block.getMembers()) {
					if (m instanceof Function || m instanceof Constructor) {
						// ignore (internal use probably);
					} else if (m instanceof Variable) {
						Variable var = (Variable)m;
						var.setScope(globalScope);
						globalScope.addVariable(var);
					} else {
						errorHandler.error(block, "internal error: unhandled interface block member type " + m.getClass().getSimpleName());
					}
				}
			}
		} else if (ctx.glslFunctionPrototype() != null) {
			// already handled in exitGlslFunctionPrototype
		} else if (containsError(ctx)) {
			// ignore declarations with errors
		} else {
			throw new Error("internal error: unhandled case in declaration context: " + ctx.getText());
		}
	}



	private boolean containsError(ParseTree ctx) {
		if (ctx == null) {
			throw new Error("internal error: unexpected null value in parse tree validation");
		} else if (ctx instanceof ErrorNode) {
			return true;
		} else if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.getChildCount(); i++) {
				if (containsError(ctx.getChild(i))) {
					return true;
				}
			}
		}
		return false;
	}


	private void addTypeIfMissing(Type type) {
		if (type instanceof InterfaceBlock) {
			InterfaceBlock block = (InterfaceBlock)type;
			if (symbolTable.containsConflictingInterface(block)) {
				errorHandler.error(block.getStart(), "interface block " + block.getKey() + " already exists");
			} else {
				symbolTable.addInterface(block);
			}
		} else {
			if (!symbolTable.containsType(type.getName())) {
				errorHandler.error(type.getStart(), "type " + type.getName() + " already exists");
			} else {
				symbolTable.addType(type);
			}
		}
	}



	private void addVariables(GlslVariableDeclarationsContext varDeclsCtx, Type type, Qualifiers qualifiers) {
		assert(!varDeclsCtx.isEmpty());
		
		for (GlslVariableDeclaratorContext varDecl : varDeclsCtx.glslVariableDeclarator()) {
			Type varType = type;
			List<GlslArrayDimensionContext> varDims = getNonEmptyListOrNull(varDecl.glslArrayDimension());
			if (varDims != null) {
				// add variable's array dimensions
				varType = factory.createArrayType(type, varDims);
			}
			
			String id = getText(varDecl.glslVariableIdentifier());
			// create qualified variable
			Variable var = new Variable(symbolTable.getScope(), varType, id, qualifiers);
			Variable declared = symbolTable.getVariable(var.getName());
			if (declared != null && declared.getScope() == var.getScope()) {
				if (var.getType().equals(declared.getType())) {
					if (var.getType().getQualifiers().equals(var.getType().getQualifiers())) {
						errorHandler.error(var, "variable already exists with the same signature: " + var.toString());
					}
				}
			}
			symbolTable.addVariable(var);
		}
	}


	private <T extends ParseTree> List<T> getNonEmptyListOrNull(List<T> list) {
		return list != null && list.size() > 0 ? list : null;
	}


	private void addQualifiersToExistingVariable(String id, Qualifiers qualifiers) {
		Variable var = symbolTable.getVariable(id);
		Type qualifiedType = Type._qualified(var.getType(), qualifiers);
		var.setType(qualifiedType);
	}


	private String getText(ParseTree item) {
		return item != null ? item.getText() : null;
	}


	public void addDeclaredVariable(String name, Variable var) {
		symbolTable.addVariable(var);
	}

	public void addDeclaredType(String name, Type type) {
		symbolTable.addType(type);
	}

	public IScope getToplevelScope() {
		return symbolTable.getTopLevelScope();
	}

	public void addDeclaredFunction(String string) {
		symbolTable.addFunction(new Function(Interval.NONE, Type._void, string));
	}




	
}
