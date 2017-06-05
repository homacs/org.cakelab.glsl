package org.cakelab.glsl.lang.ast;

import java.util.List;

import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.GLSLParser.GlslAdditiveExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslAndExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslArrayDimensionContext;
import org.cakelab.glsl.GLSLParser.GlslAssignmentExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslBoolConstantContext;
import org.cakelab.glsl.GLSLParser.GlslBuiltinTypeContext;
import org.cakelab.glsl.GLSLParser.GlslCallArgumentsContext;
import org.cakelab.glsl.GLSLParser.GlslConditionalExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslConstantExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslDoubleConstantContext;
import org.cakelab.glsl.GLSLParser.GlslEqualityExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslExclusiveOrExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslFieldSelectionContext;
import org.cakelab.glsl.GLSLParser.GlslFloatConstantContext;
import org.cakelab.glsl.GLSLParser.GlslIdentifierContext;
import org.cakelab.glsl.GLSLParser.GlslInclusiveOrExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslIntegerConstantContext;
import org.cakelab.glsl.GLSLParser.GlslIntegerExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslLogicalAndExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslLogicalOrExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslLogicalXorExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslMultiplicativeExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslPostfixExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslPrimaryExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslRelationalExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslShiftExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslStructSpecifierContext;
import org.cakelab.glsl.GLSLParser.GlslUnaryExpressionContext;
import org.cakelab.glsl.GLSLParser.GlslUnsignedIntegerConstantContext;

// TODO: supposed to be an interface
// TODO: supposed to be in parser package
public class ASTFactory {

	private SymbolTable symbolTable;

	public ASTFactory(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
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
			ExpressionList list = new ExpressionList();
			for (GlslAssignmentExpressionContext assign : expressions) {
				list.list.add(create(assign));
			}
			return list;
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
		if (left != null) return new ShiftExpression(create(left), create(shift.glslAdditiveExpression()));
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
			else /* SLASH */ return new DivExpression(create(left), create(mul.glslUnaryExpression()));
		} else {
			return create(mul.glslUnaryExpression());
		}
	}

	public Expression create(GlslUnaryExpressionContext unary) {
		GlslPostfixExpressionContext postfix = unary.glslPostfixExpression();
		if (postfix == null) {
			Expression operand = create(unary.glslUnaryExpression());
			int operator = unary.glslUnaryOperator().getStart().getType();
			switch(operator) {
			case GLSLParser.INC_OP: return new PrefixIncExpression(operand);
			case GLSLParser.DEC_OP: return new PrefixDecExpression(operand);
			case GLSLParser.PLUS: return new PosExpression(operand);
			case GLSLParser.DASH: return new NegExpression(operand);
			case GLSLParser.BANG: return new LogicalNotExpression(operand);
			case GLSLParser.TILDE: return new NotExpression(operand);
			default:
				String identifier = unary.glslIdentifier().getText();
				Object macro = symbolTable.resolve(identifier);
				if (macro instanceof Macro) {
					return new PPDefinedExpression(new MacroReference((Macro)macro));
				} else {
					return new PPDefinedExpression(new UndefinedIdentifier(identifier));
				}
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
			if (field != null) return new FieldSelection(operand, field.IDENTIFIER().getText());
			
			if (postfix.INC_OP()!= null) return new PostfixIncExpression(operand);
			else /* DEC_OP */ return new PostfixDecExpression(operand);
		} else {
			return create(primary);
		}
	}

	public Expression create(GlslPrimaryExpressionContext primary) {
		GlslIdentifierContext identifier = primary.glslIdentifier();
		if (identifier != null) {
			Object obj = symbolTable.resolve(identifier.getText());
			if (obj instanceof Type) {
				return new TypeReference((Type)obj);
			} else if (obj instanceof Variable) {
				return new VariableReference((Variable)obj);
			} else if (obj instanceof Function) {
				return new FunctionReference((Function)obj);
			} else {
				return new UndefinedIdentifier(identifier.getText());
			}
		}
		
		GlslBuiltinTypeContext builtinType = primary.glslBuiltinType();
		if (builtinType != null) {
			String name = builtinType.getText();
			Object obj = symbolTable.resolve(name);
			if (obj instanceof Type) {
				return new BuiltinTypeReference((Type)obj);
			} else {
				throw new RuntimeException("builtin type '" + name + "' not found in symbol table");
			}
		}
		
		GlslStructSpecifierContext struct = primary.glslStructSpecifier();
		if (struct != null)	return new TypeReference(create(struct));
		
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
		throw new Error("internal error: Unhandled branch in primary expression");
		
	}

	public Constant<Float> create(GlslFloatConstantContext value) {
		return new Constant<Float>(Float.valueOf(value.getText()));
	}

	public Constant<Double> create(GlslDoubleConstantContext value) {
		return new Constant<Double>(Double.valueOf(value.getText()));
	}

	public Constant<Long> create(GlslIntegerConstantContext value) {
		return new Constant<Long>(Long.valueOf(value.getText()), true);
	}

	public Constant<Long> create(GlslUnsignedIntegerConstantContext value) {
		return new Constant<Long>(Long.valueOf(value.getText()), false);
	}

	public Constant<Boolean> create(GlslBoolConstantContext value) {
		return new Constant<Boolean>(Boolean.valueOf(value.getText()));
	}


	public Struct create(GlslStructSpecifierContext struct) {
		// TODO Auto-generated method stub
		return null;
	}


	public Expression create(Expression operand, GlslArrayDimensionContext dim) {
		GlslIntegerExpressionContext index = dim.glslIntegerExpression();
		if (index == null) {
			throw new Error("expected an expression, which evaluates to an integer");
		} else {
			return new ArrayIndexExpression(operand, create(index.glslExpression()));
		}
	}

	public Expression create(Expression operand, GlslCallArgumentsContext args) {
		List<GlslAssignmentExpressionContext> assignments = args.glslAssignmentExpression();
		CallArguments arguments = new CallArguments();
		for (GlslAssignmentExpressionContext assign : assignments) {
			arguments.list.add(create(assign));
		}
		return new CallExpression(operand, arguments);
	}

}
