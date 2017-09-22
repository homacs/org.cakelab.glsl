package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLParser.*;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.ast.Qualifier.LayoutQualifier;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;

// TODO [2] supposed to be an interface in parser package
public class ASTFactory {

	private SymbolTable symbols;
	private GLSLErrorHandler errorHandler;

	public ASTFactory(SymbolTable symbols, GLSLErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
		this.symbols = symbols;
	}
	
	
	public ConstantExpression create(GlslConstantExpressionContext ctx) {
		return new ConstantExpression(create(ctx.glslConditionalExpression()));
	}

	public Expression create(GlslConditionalExpressionContext cond) {
		GlslAssignmentExpressionContext assign = cond.glslAssignmentExpression();
		if (assign != null) return new ConditionalExpression(create(cond.glslLogicalOrExpression()), create(cond.glslExpression()), create(assign));
		else return create(cond.glslLogicalOrExpression());
	}

	public Expression create(GlslExpressionContext expr) {
		List<GlslAssignmentExpressionContext> expressions = expr.glslAssignmentExpression();
		if (expressions.size() > 1) {
			ArrayList<Expression> list = new ArrayList<Expression>();
			for (GlslAssignmentExpressionContext assign : expressions) {
				list.add(create(assign));
			}
			return new ExpressionList(list);
		} else {
			return create(expressions.get(0));
		}
	}

	public Expression create(GlslAssignmentExpressionContext assign) {
		GlslConditionalExpressionContext cond = assign.glslConditionalExpression();
		if (cond != null) return create(cond);
		else return new AssignmentExpression(create(assign.glslUnaryExpression()), assign.glslAssignmentOperator().getStart().getType(), create(assign.glslAssignmentExpression()));
	}

	public Expression create(GlslLogicalOrExpressionContext logOr) {
		GlslLogicalOrExpressionContext left = logOr.glslLogicalOrExpression();
		if (left != null) return new LogicalOrExpression(create(left), create(logOr.glslLogicalXorExpression()));
		else return create(logOr.glslLogicalXorExpression());
	}

	public Expression create(GlslLogicalXorExpressionContext logXor) {
		GlslLogicalXorExpressionContext left = logXor.glslLogicalXorExpression();
		if (left != null) return new LogicalXorExpression(create(left), create(logXor.glslLogicalAndExpression()));
		else return create(logXor.glslLogicalAndExpression());
	}

	public Expression create(GlslLogicalAndExpressionContext logAnd) {
		GlslLogicalAndExpressionContext left = logAnd.glslLogicalAndExpression();
		if (left != null) return new LogicalAndExpression(create(left), create(logAnd.glslInclusiveOrExpression()));
		else return create(logAnd.glslInclusiveOrExpression());
	}

	public Expression create(GlslInclusiveOrExpressionContext or) {
		GlslInclusiveOrExpressionContext left = or.glslInclusiveOrExpression();
		if (left != null) return new OrExpression(create(left), create(or.glslExclusiveOrExpression()));
		else return create(or.glslExclusiveOrExpression());
	}

	public Expression create(GlslExclusiveOrExpressionContext xor) {
		GlslExclusiveOrExpressionContext left = xor.glslExclusiveOrExpression();
		if (left != null) return new XorExpression(create(left), create(xor.glslAndExpression()));
		else return create(xor.glslAndExpression());
	}

	public Expression create(GlslAndExpressionContext and) {
		GlslAndExpressionContext left = and.glslAndExpression();
		if (left != null) return new AndExpression(create(left), create(and.glslEqualityExpression()));
		else return create(and.glslEqualityExpression());
	}

	public Expression create(GlslEqualityExpressionContext eq) {
		GlslEqualityExpressionContext left = eq.glslEqualityExpression();
		Expression right = create(eq.glslRelationalExpression());
		if (left != null) {
			if (eq.EQ_OP() != null) return new EqExpression(create(left), right);
			else return new NeExpression(create(left), right);
		} else return right;
	}

	public Expression create(GlslRelationalExpressionContext rel) {
		GlslRelationalExpressionContext left = rel.glslRelationalExpression();
		Expression right = create(rel.glslShiftExpression());
		if (left != null) {
			if (rel.LE_OP()!= null) return new LeExpression(create(left), right);
			if (rel.GE_OP()!= null) return new GeExpression(create(left), right);
			if (rel.LEFT_ANGLE()!= null) return new LtExpression(create(left), right);
			else /* if (rel.RIGHT_ANGLE()!= null)*/ return new GtExpression(create(left), right);
		} else return right;
	}

	public Expression create(GlslShiftExpressionContext shift) {
		GlslShiftExpressionContext left = shift.glslShiftExpression();
		if (left != null) {
			if (shift.LEFT_OP()!= null) return new ShiftLeftExpression(create(left), create(shift.glslAdditiveExpression()));
			else return new ShiftRightExpression(create(left), create(shift.glslAdditiveExpression()));
		}
		else return create(shift.glslAdditiveExpression());
	}

	public Expression create(GlslAdditiveExpressionContext add) {
		GlslAdditiveExpressionContext left = add.glslAdditiveExpression();
		if (left != null) {
			if (add.PLUS()!=null) return new PlusExpression(create(left), create(add.glslMultiplicativeExpression()));
			else /* MINUS */ return new MinusExpression(create(left), create(add.glslMultiplicativeExpression()));
		} else {
			return create(add.glslMultiplicativeExpression());
		}
	}

	public Expression create(GlslMultiplicativeExpressionContext mul) {
		GlslMultiplicativeExpressionContext left = mul.glslMultiplicativeExpression();
		if (left != null) {
			if (mul.STAR()!=null) return new MulExpression(create(left), create(mul.glslUnaryExpression()));
			else if ( mul.SLASH()!= null) return new DivExpression(create(left), create(mul.glslUnaryExpression()));
			else if (mul.PERCENT()!=null) return new ModExpression(create(left), create(mul.glslUnaryExpression()));
			else throw new Error("internal error: unhandled case in multiplicative expression");
		} else {
			return create(mul.glslUnaryExpression());
		}
	}

	public Expression create(GlslUnaryExpressionContext unary) {
		GlslPostfixExpressionContext postfix = unary.glslPostfixExpression();
		if (postfix == null) {
			Expression operand = create(unary.glslUnaryExpression());
			Location start = getStartLocation(unary.glslUnaryOperator());
			int operator = unary.glslUnaryOperator().getStart().getType();
			switch(operator) {
			case GLSLParser.INC_OP: return new PrefixIncExpression(start, operand);
			case GLSLParser.DEC_OP: return new PrefixDecExpression(start, operand);
			case GLSLParser.PLUS: return new PosExpression(start, operand);
			case GLSLParser.DASH: return new NegExpression(start, operand);
			case GLSLParser.BANG: return new LogicalNotExpression(start, operand);
			case GLSLParser.TILDE: return new NotExpression(start, operand);
			default:
				throw new Error("internal error: unhandled case in unary expression");
			}
		} else {
			return create(postfix);
		}
	}

	public Expression create(GlslPostfixExpressionContext postfix) {
		GlslPrimaryExpressionContext primary = postfix.glslPrimaryExpression();
		if (primary == null) {
			Expression operand = create(postfix.glslPostfixExpression());
			
			GlslCallArgumentsContext args = postfix.glslCallArguments();
			if (args != null) return create(operand, args);
			
			GlslArrayDimensionContext dim = postfix.glslArrayDimension();
			if (dim != null) return create(operand, dim);
			
			GlslFieldSelectionContext field = postfix.glslFieldSelection();
			if (field != null) return new FieldSelection(operand, field.IDENTIFIER().getText(), getEndLocation(postfix));
			
			if (postfix.INC_OP()!= null) return new PostfixIncExpression(operand, getEndLocation(postfix));
			else /* DEC_OP */ return new PostfixDecExpression(operand, getEndLocation(postfix));
		} else {
			return create(primary);
		}
	}

	public Expression create(GlslPrimaryExpressionContext primary) {
		GlslIdentifierContext identifier = primary.glslIdentifier();
		if (identifier != null) {
			Interval interval = createInterval(identifier);
			String id = identifier.getText();
			Variable var = symbols.getVariable(id);
			if (var != null) return new VariableReference(interval, var);

			Type type = symbols.getType(id);
			if (type != null) return new TypeReference(interval, type);
			
			Function fun = symbols.getFunction(id);
			if (fun != null) return new FunctionReference(interval, (Function)fun);
			
			
			// non of the above
			errorHandler.error(identifier, "symbol " + id + " not found");
			// FIXME: lang parser undefined identifier in expression: needs solution
			// return new UndefinedIdentifier(interval, identifier.getText());
			return null;
		}
		
		GlslBuiltinTypeContext builtinType = primary.glslBuiltinType();
		if (builtinType != null) {
			String name = builtinType.getText();
			Type type = symbols.getType(name);
			if (type != null) {
				return new BuiltinTypeReference(createInterval(builtinType), type);
			} else {
				throw new Error("internal error: builtin type '" + name + "' not found in symbol table");
			}
		}
		
		GlslStructSpecifierContext struct = primary.glslStructSpecifier();
		if (struct != null)	{
			Struct structDef = create(struct);
			return new TypeReference(createInterval(struct), structDef);
		}
		
		GlslFloatConstantContext floatConst = primary.glslFloatConstant();
		if (floatConst != null) return create(floatConst);
		
		GlslDoubleConstantContext doubleConst = primary.glslDoubleConstant();
		if (doubleConst != null) return create(doubleConst);
		
		GlslIntegerConstantContext intConst = primary.glslIntegerConstant();
		if (intConst != null) return create(intConst);
		
		GlslUnsignedIntegerConstantContext unsignedConst = primary.glslUnsignedIntegerConstant();
		if (unsignedConst != null) return create(unsignedConst);
		
		GlslBoolConstantContext boolConst = primary.glslBoolConstant();
		if (boolConst != null) return create(boolConst);
		
		if (primary.LEFT_PAREN() != null) return create(primary.glslExpression());

		// if we are still here, then we have forgotten to implement some case(es)
		throw new Error("internal error: Unhandled branch in primary expression rule");
		
	}

	public ConstantValue<Float> create(GlslFloatConstantContext value) {
		Interval interval = createInterval(value);
		return new ConstantValue<Float>(interval, Float.valueOf(value.getText()));
	}

	public ConstantValue<Double> create(GlslDoubleConstantContext value) {
		Interval interval = createInterval(value);
		return new ConstantValue<Double>(interval, Double.valueOf(value.getText()));
	}

	public ConstantValue<Long> create(GlslIntegerConstantContext value) {
		Interval interval = createInterval(value);
		return new ConstantValue<Long>(interval, Long.valueOf(value.getText()), true);
	}

	public ConstantValue<Long> create(GlslUnsignedIntegerConstantContext value) {
		Interval interval = createInterval(value);
		return new ConstantValue<Long>(interval, Long.valueOf(value.getText()), false);
	}

	public ConstantValue<Boolean> create(GlslBoolConstantContext value) {
		Interval interval = createInterval(value);
		return new ConstantValue<Boolean>(interval, Boolean.valueOf(value.getText()));
	}

	
	public Expression create(Expression operand, GlslArrayDimensionContext dim) {
		GlslIntegerExpressionContext index = dim.glslIntegerExpression();
		if (index == null) {
			throw new Error("expected an expression, which evaluates to an integer");
		} else if (operand instanceof TypeReference) {
			TypeReference ref = (TypeReference) operand;
			ref.type = createArrayType(ref.type, dim);
			return ref;
		} else {
			return new ArrayIndexExpression(operand, create(index.glslExpression()));
		}
	}

	public CallExpression create(Expression operand, GlslCallArgumentsContext args) {
		List<GlslAssignmentExpressionContext> assignments = args.glslAssignmentExpression();
		Expression[] arguments = new Expression[assignments.size()];
		for (int i = 0; i < assignments.size(); i++) {
			arguments[i] = create(assignments.get(i));
		}
		
		return new CallExpression(operand, arguments, getEndLocation(args));
	}

	

	public Struct create(GlslStructSpecifierContext context) {
		String name = context.IDENTIFIER().getText();
		Struct struct = new Struct(createInterval(context), symbols.getScope(), name, null);
		GlslStructBodyContext members = context.glslStructBody();
		addStructOrInterfaceBody(struct, members);
		return struct;
	}


	private void addStructOrInterfaceBody(Struct struct, GlslStructBodyContext members) {
		symbols.enterScope(struct.body);
		List<GlslStructMemberGroupContext> groups = members.glslStructMemberGroup();
		for (GlslStructMemberGroupContext group : groups) {
			addMembers(struct, group);
		}
		symbols.leaveScope();
	}


	public InterfaceBlock create(GlslInterfaceBlockStructureContext ctx) {
		Qualifiers qualifiers = create(ctx.glslTypeQualifier());
		String identifier = ctx.IDENTIFIER().getText();
		InterfaceBlock interfaceBlock;
		if (qualifiers != null && qualifiers.size() > 0) {
			interfaceBlock = new InterfaceBlock(createInterval(ctx), symbols.getScope(), identifier, qualifiers);
			interfaceBlock = (InterfaceBlock) Type._qualified(interfaceBlock, qualifiers);
		} else {
			interfaceBlock = new InterfaceBlock(createInterval(ctx), symbols.getScope(), identifier, null);
		}
		addStructOrInterfaceBody(interfaceBlock, ctx.glslStructBody());
		return interfaceBlock;
	}



	public void addMembers(Struct struct, GlslStructMemberGroupContext group) {
		Qualifiers qualifiers = create(group.glslTypeQualifier());
		Type basetype = getType(group.glslTypeSpecifier(), false);

		List<GlslStructMemberDeclaratorContext> dcontext = group.glslStructMemberDeclaratorList().glslStructMemberDeclarator();
		for (GlslStructMemberDeclaratorContext m : dcontext) {
			String memberName = m.IDENTIFIER().getText();
			Type memberType = basetype;
			
			List<GlslArrayDimensionContext> arrayDims = m.glslArrayDimension();
			if (empty(arrayDims)) {
				memberType = createArrayType(memberType, arrayDims);
			}
			if (qualifiers != null) {
				memberType = Type._qualified(memberType, qualifiers);
			}
			struct.addMember(new Struct.MemberVariable(memberType, memberName));
		}
	}
	
	private boolean empty(List<?> list) {
		return list != null && !list.isEmpty();
	}


	private Type create(GlslFullySpecifiedTypeContext ctx, boolean declaration) {
		return create(ctx.glslTypeQualifier(), ctx.glslTypeSpecifier(), declaration);
	}

	
	private Type create(GlslTypeQualifierContext qualifierCtx, GlslTypeSpecifierContext specifierCtx, boolean declaration) {
		Qualifiers qualifiers = create(qualifierCtx);
		Type type = getType(specifierCtx, declaration);
		if (qualifiers != null && qualifiers.size() > 0) {
			type = Type._qualified(type, qualifiers);
		}
		return type;
	}


	public Type getType(GlslTypeSpecifierContext context, boolean declaration) {
		if (context == null) return null;
		GlslTypeSpecifierNonarrayContext basic = context.glslTypeSpecifierNonarray();
		Type type;
		if (basic.glslBuiltinType() != null) {
			type = getType(basic.glslBuiltinType());
		} else if (basic.glslTypeName() != null) {
			type = getType(basic.glslTypeName(), declaration);
		} else if (basic.glslStructSpecifier() != null) {
			GlslStructSpecifierContext specifier = basic.glslStructSpecifier();
			type = create(specifier);
		} else {
			throw new Error("internal error: unhandled type specifier rule");
		}


		List<GlslArrayDimensionContext> arrayDims = context.glslArrayDimension();
		
		if (arrayDims != null && arrayDims.size() > 0) {
			type = createArrayType(type, arrayDims);
		}
		
		
		return type;
	}

	public Type getType(GlslBuiltinTypeContext glslBuiltinType) {
		String typeName;
		if (glslBuiltinType.BUILTIN_TYPE() != null) {
			typeName = glslBuiltinType.BUILTIN_TYPE().getText();
		} else if (glslBuiltinType.VOID() != null) {
			typeName = glslBuiltinType.VOID().getText();
		} else {
			throw new Error("internal error: unhandled case in built-in type context: '" + glslBuiltinType.getText() + "'");
		}
		Type type = symbols.getType(typeName);
		if (type == null) {
			System.out.println("DEBUG");
			throw new Error("internal error: built-in type '" + typeName + "' not registered");
		}
	
		return type;
	}


	public Type getType(GlslTypeNameContext ctxTypeName, boolean declaration) {
		String typeName = ctxTypeName.getText();
		Type type;
		if (declaration) {
			// this is actually not possible, because glsl does not support
			// typedefs. But we do it anyway to maintain maximum language 
			// adaptability.
			Interval interval = createInterval(ctxTypeName);
			type = new Type(interval, typeName, Type.KIND_SCALAR, null);
		} else {
			type = symbols.getType(typeName);
			if (type == null && !declaration) {
				GlslTypeNameContext typeNameCtx = ctxTypeName;
				errorHandler.error(typeNameCtx, "undefined type '" + typeName + "'");
				// add undefined type to recover from error
				Interval interval = createInterval(ctxTypeName);
				type = new Type(interval, typeName, Type.KIND_UNDEFINED, null);
			}
		}
		return type;
	}



	
	
	public Type createArrayType(Type type, List<GlslArrayDimensionContext> dcontext) {
		Expression[] dimensions = new Expression[dcontext.size()];
		for (int i = 0; i < dimensions.length; i++) {
			Expression dimSize = create(dcontext.get(i).glslIntegerExpression());
			if (dimSize == null) {
				dimSize = ConstantValue.ZERO;
			}
			dimensions[i] = dimSize;
		}
		type = new Array(createInterval(dcontext), type, dimensions);
		return type;
	}


	private Type createArrayType(Type type, GlslArrayDimensionContext dim) {
		Expression dimension = create(dim.glslIntegerExpression());
		type = new Array(new Interval(type.getStart(), dimension.getEnd()), type, dimension);
		return type;
	}

	private Expression create(GlslIntegerExpressionContext intExpr) {
		if (intExpr != null) {
			return create(intExpr.glslExpression());
		} else {
			return null;
		}
	}

	public Qualifiers create(GlslTypeQualifierContext context) {
		if (context == null) return null;
		List<GlslSingleTypeQualifierContext> qcontext = context.glslSingleTypeQualifier();
		Qualifiers qualifiers = new Qualifiers();
		for (GlslSingleTypeQualifierContext q : qcontext) {
			qualifiers.add(create(q));
		}
		return qualifiers;
	}

	private Qualifier create(GlslSingleTypeQualifierContext context) {
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
						function[i] = symbols.getFunction(n.getText());
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
		String text = getText(context);
		Qualifier qualifier = Qualifier.get(text);
		if (qualifier == null) throw new Error("internal error: unhandled qualifier '" + text + "'");
		return qualifier;
	}

	
	
	private String getText(ParseTree node) {
		return node != null ? node.getText() : null;
	}


	private Location getStartLocation(ParserRuleContext context) {
		Token start = context.getStart();
		return ((PPOutputToken)start).getPPToken().getStart();
	}

	private Location getEndLocation(ParserRuleContext context) {
		Token end = context.getStop();
		return ((PPOutputToken)end).getPPToken().getEnd();
	}

	private Interval createInterval(List<? extends ParserRuleContext> dcontext) {
		return new Interval(getStartLocation(dcontext.get(0)), getEndLocation(dcontext.get(dcontext.size()-1)));
	}

	public Interval createInterval(ParserRuleContext context) {
		return new Interval(getStartLocation(context), getEndLocation(context));
	}


	public Function create(GlslFunctionPrototypeContext ctx) {
		Type type = create(ctx.glslFullySpecifiedType(), false);
		
		String name = ctx.glslFunctionName().getText();
		ParameterDeclaration[] params = create(ctx.glslFunctionParameters());
		if (params == null) return new Function(type, name);
		else return new Function(type, name, params);
	}


	private ParameterDeclaration[] create(GlslFunctionParametersContext ctx) {
		if (ctx == null) return null;
		List<GlslParameterDeclarationContext> paramCtx = ctx.glslParameterDeclaration();
		int length = paramCtx != null ? paramCtx.size() : 0;
		ParameterDeclaration[] params = null;
		if (length > 0) {
			params = new ParameterDeclaration[length];
			int i = 0;
			for (GlslParameterDeclarationContext p : ctx.glslParameterDeclaration()) {
				Type type = create(p.glslTypeQualifier(), p.glslTypeSpecifier(), false);
				String name = getName(p.glslVariableIdentifier());
				List<GlslArrayDimensionContext> dims = p.glslArrayDimension();
				if (dims != null && !dims.isEmpty()) {
					type = createArrayType(type, dims);
				}
				ParameterDeclaration param = new ParameterDeclaration(type, name);
				params[i] = param;
				i++;
			}
		}
		return params;
	}


	private String getName(GlslVariableIdentifierContext ident) {
		return ident != null ? ident.getText() : null;
	}





}
