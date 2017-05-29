package org.cakelab.glsl.parser;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.ast.Function;
import org.cakelab.glsl.ast.Type;
import org.cakelab.glsl.parser.GLSLParser.GlslBlockStructureContext;
import org.cakelab.glsl.parser.GLSLParser.GlslFunctionHeaderContext;


public class Validator {
	
	private HashMap<String, Function> declaredFunctions = new HashMap<String, Function>();
	private HashMap<String, Variable> declaredVariables = new HashMap<String, Variable>();
	private HashMap<String, Type> declaredTypes = new HashMap<String, Type>();
	private HashMap<String, Type> builtinTypes = new HashMap<String, Type>();

	
	public Validator() {
		for (String name : Type.BUILTIN_TYPES) {
			builtinTypes.put(name, null);
		}
	}

	public void reset() {
		declaredVariables.clear();
		declaredFunctions.clear();
		declaredTypes.clear();
	}



	public boolean isDeclaredType(ParseTree tree, int child) {
		if (tree == null) {
			return true;
		}
		String name = tree.getChild(child).getText();
		return declaredTypes.containsKey(name);
	}

	public void addDeclaredStruct(org.cakelab.glsl.parser.GLSLParser.GlslStructSpecifierContext context) {
		// STRUCT IDENTIFIER
		String name = context.getChild(1).getText();
		addDeclaredType(name, null);
	}
	
	public void addDeclaredInterfaceBlock(GlslBlockStructureContext context) {
		// qualifiers IDENTIFIER ..
		// (second position)
		String name = context.getChild(1).getText();
		addDeclaredType(name, null);
	}
	
	public void addDeclaredFunction(GlslFunctionHeaderContext context) {
		// typeSpecifier IDENTIFIER ..
		// (second position)
		String name = context.getChild(1).getText();
		declaredFunctions.put(name, null);
	}
	
	
	public void addDeclaredStruct(org.cakelab.glsl.pp.GLSLPPParser.GlslStructSpecifierContext context) {
		// preprocessing: ignore
	}

	/**
	 * Checks whether the following IDENTIFIER (LL(1)) is the name of a declared or builtin type.
	 * @param _ctx
	 * @return
	 */
	public boolean istype(ParserRuleContext _ctx) {
		String name = _ctx.getStart().getText();
		boolean result = 
				declaredTypes.containsKey(name)
			||
				builtinTypes.containsKey(name);
		return result;
	}

	public boolean istype(Token token) {
		String name = token.getText();
		boolean result = 
				declaredTypes.containsKey(name)
			||
				builtinTypes.containsKey(name);
		return result;
	}

	/**
	 * Checks whether the following IDENTIFIER is a function name.
	 * 
	 * @param _ctx
	 * @return
	 */
	public boolean isfunc(ParserRuleContext _ctx) {
		String name = _ctx.getStart().getText();
		boolean result = declaredFunctions.containsKey(name);
		return result;
	}


	/**
	 * Checks whether the following IDENTIFIER is a variable name.
	 * @param _ctx
	 */
	public boolean isvar(ParserRuleContext _ctx) {
		String name = _ctx.getStart().getText();
		boolean result = declaredVariables.containsKey(name);
		return result;
	}

	public void addDeclaredVariable(ParserRuleContext _ctx) {
		String name = _ctx.getStart().getText();
		
		addDeclaredVariable(name, null);
	}

	public void addDeclaredVariable(String name, Variable var) {
		declaredVariables.put(name, var);
	}

	public void addDeclaredType(String name, Type type) {
		declaredTypes.put(name, type);
	}


	
}
