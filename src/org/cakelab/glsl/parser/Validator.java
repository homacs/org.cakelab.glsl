package org.cakelab.glsl.parser;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cakelab.glsl.ast.Array;
import org.cakelab.glsl.ast.Expression;
import org.cakelab.glsl.ast.Function;
import org.cakelab.glsl.ast.InterfaceBlock;
import org.cakelab.glsl.ast.Qualifier;
import org.cakelab.glsl.ast.Qualifier.LayoutQualifier;
import org.cakelab.glsl.ast.Scope;
import org.cakelab.glsl.ast.Struct;
import org.cakelab.glsl.ast.Type;
import org.cakelab.glsl.ast.Variable;
import org.cakelab.glsl.parser.GLSLParser.GlslArrayDimensionContext;
import org.cakelab.glsl.parser.GLSLParser.GlslArrayDimensionsListContext;
import org.cakelab.glsl.parser.GLSLParser.GlslBlockStructureContext;
import org.cakelab.glsl.parser.GLSLParser.GlslFunctionHeaderContext;
import org.cakelab.glsl.parser.GLSLParser.GlslFunctionNameContext;
import org.cakelab.glsl.parser.GLSLParser.GlslFunctionNameListContext;
import org.cakelab.glsl.parser.GLSLParser.GlslLayoutQualifierContext;
import org.cakelab.glsl.parser.GLSLParser.GlslLayoutQualifierIdContext;
import org.cakelab.glsl.parser.GLSLParser.GlslSingleTypeQualifierContext;
import org.cakelab.glsl.parser.GLSLParser.GlslStorageQualifierContext;
import org.cakelab.glsl.parser.GLSLParser.GlslStructMemberDeclaratorContext;
import org.cakelab.glsl.parser.GLSLParser.GlslStructMemberDeclaratorListContext;
import org.cakelab.glsl.parser.GLSLParser.GlslStructMemberGroupContext;
import org.cakelab.glsl.parser.GLSLParser.GlslStructMemberListContext;
import org.cakelab.glsl.parser.GLSLParser.GlslStructSpecifierContext;
import org.cakelab.glsl.parser.GLSLParser.GlslTypeQualifierContext;
import org.cakelab.glsl.parser.GLSLParser.GlslTypeSpecifierContext;
import org.cakelab.glsl.parser.GLSLParser.GlslTypeSpecifierNonarrayContext;


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
		String name = getStructIdentifier(context);
		if (name != null && name.length() > 0) {
			if (istype(name)) throw new Error("type '" + name + "' already exists.");
			
			Struct struct = createStruct(name, context);
			addDeclaredType(name, struct);
		}
	}
	
	private Struct createStruct(String name, GlslStructSpecifierContext context) {
		Struct struct = new Struct(scope, name);
		
		GlslStructMemberListContext members = context.glslStructMemberList();
		List<GlslStructMemberGroupContext> groups = members.glslStructMemberGroup();
		for (GlslStructMemberGroupContext group : groups) {
			addMembers(struct, group);
		}
		return struct;
	}


	private void addMembers(Struct struct, GlslStructMemberGroupContext group) {
		Qualifier[] qualifiers = getQualifiers(group.glslTypeQualifier());
		Type basetype = getType(group.glslTypeSpecifier());

		List<GlslStructMemberDeclaratorContext> dcontext = group.glslStructMemberDeclaratorList().glslStructMemberDeclarator();
		for (GlslStructMemberDeclaratorContext m : dcontext) {
			String memberName = m.IDENTIFIER().getText();
			Type memberType = basetype;
			
			GlslArrayDimensionsListContext arrayDims = m.glslArrayDimensionsList();
			if (arrayDims != null) {
				memberType = createArrayType(memberType, arrayDims);
			}
			if (qualifiers != null) {
				memberType = Type._qualified(memberType, qualifiers);
			}
			struct.addMember(new Struct.Member(memberType, memberName));
		}
	}

	private Type getType(GlslTypeSpecifierContext context) {
		if (context == null) return null;
		GlslTypeSpecifierNonarrayContext basic = context.glslTypeSpecifierNonarray();
		Type type;
		String typeName = null;
		if (basic.glslBuiltinType() != null) {
			typeName = basic.glslBuiltinType().getText();
			type = scope.getType(typeName);
		} else if (basic.glslTypeName() != null) {
			typeName = basic.glslTypeName().getText();
			type = scope.getType(typeName);
		} else {
			GlslStructSpecifierContext specifier = basic.glslStructSpecifier();
			typeName = getStructIdentifier(specifier);
			if (typeName == null) typeName = "<anonymous>";
			Struct struct = createStruct(typeName, specifier);
			if (typeName != null) {
				addDeclaredType(typeName, struct);
			}
			type = struct;
		}


		if (type == null) {
			System.err.println("err");
		}


		GlslArrayDimensionsListContext arrayDims = context.glslArrayDimensionsList();
		
		if (arrayDims != null) {
			type = createArrayType(type, arrayDims);
		}
		
		
		return type;
	}

	private String getStructIdentifier(GlslStructSpecifierContext context) {
		TerminalNode ident = context.IDENTIFIER();
		if (ident == null) {
			ident = context.TYPE_NAME();
		}
		if (ident != null) {
			return ident.getText();
		} else {
			return null;
		}
	}

	private Type createArrayType(Type type, GlslArrayDimensionsListContext arrayDims) {
		List<GlslArrayDimensionContext> dcontext = arrayDims.glslArrayDimension();
		Expression[] dimensions = new Expression[dcontext.size()];
		for (int i = 0; i < dimensions.length; i++) {
			dimensions[i] = new Expression(dcontext.get(i).glslConstantExpression().getText());
		}

		type = new Array(type, dimensions);
		return type;
	}

	private Qualifier[] getQualifiers(GlslTypeQualifierContext context) {
		if (context == null) return null;
		List<GlslSingleTypeQualifierContext> qcontext = context.glslSingleTypeQualifier();
		Qualifier[] qualifiers = new Qualifier[qcontext.size()];
		for (int i = 0; i < qualifiers.length; i++) {
			qualifiers[i] = getQualifier(qcontext.get(i));
		}
		return qualifiers;
	}

	private Qualifier getQualifier(GlslSingleTypeQualifierContext context) {
		//
		// special cases need to be take care of specially!
		//
		if (context.glslStorageQualifier() != null) {
			GlslStorageQualifierContext storage = context.glslStorageQualifier();
			if (storage.SUBROUTINE() != null) {
				GlslFunctionNameListContext flist = storage.glslFunctionNameList();
				if (flist != null) {
					List<GlslFunctionNameContext> names = flist.glslFunctionName();
					Function[] function = new Function[names.size()];
					for (int i = 0; i < function.length; i++) {
						GlslFunctionNameContext n = names.get(i);
						function[i] = scope.getFunction(n.getText());
					}
					return Qualifier._subroutine();
				} else {
					return Qualifier._subroutine();
				}
			}
		} else if (context.glslLayoutQualifier() != null) {
			GlslLayoutQualifierContext layout = context.glslLayoutQualifier();
			List<GlslLayoutQualifierIdContext> ids = layout.glslLayoutQualifierIdList().glslLayoutQualifierId();
			LayoutQualifier.Parameter[] params = new LayoutQualifier.Parameter[ids.size()];
			for (int i = 0; i < ids.size(); i++) {
				GlslLayoutQualifierIdContext id = ids.get(i);
				if (id.SHARED() != null) {
					params[i] = LayoutQualifier.Parameter.SHARED;
				} else if (id.glslConstantExpression() != null){
					params[i] = new LayoutQualifier.Parameter(id.IDENTIFIER().getText(), id.glslConstantExpression().getText());
				} else {
					params[i] = new LayoutQualifier.Parameter(id.IDENTIFIER().getText());
				}
			}
			return Qualifier._layout(params);
		}
		
		//
		// all other cases refer to constants
		//
		return Qualifier.get(context.getText());
	}

	public void addDeclaredInterfaceBlock(GlslBlockStructureContext context) {
		// qualifiers IDENTIFIER ..
		// (second position)
		String name = context.getChild(1).getText();
		if (istype(name)) throw new Error("type '" + name + "' already exists.");
		InterfaceBlock block = new InterfaceBlock(scope, name);
		addDeclaredType(name, block);
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
