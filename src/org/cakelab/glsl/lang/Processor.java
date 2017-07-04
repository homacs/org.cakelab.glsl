package org.cakelab.glsl.lang;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.LValue;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Value;

public class Processor {
	
	public static Value load(LValue var) {
		return var.value();
	}
	
	public static void store(LValue var, Value value) throws EvaluationException {
		var.value(Type.cast(value, var.getType()));
	}
	
	
	public static Value mul(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)*tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getValue())*((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getValue())*((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())*((Long)right.getValue()));
		case NON_SCALAR:
			return new Value(interval, resultType, null);
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}
	
	public static Value div(Value left, Value right) throws ProcessingException {
		try {
			Interval interval = new Interval(left.getStart(), right.getEnd());
			Type resultType = Type.maxRank(left, right);
			left = Type.cast(left, resultType);
			right = Type.cast(right, resultType);
			switch(Type.Rank.of(resultType)) {
			case BOOL:
				Boolean leftBool = (Boolean)left.getValue();
				Boolean rightBool = (Boolean)right.getValue();
				return new Value(interval, resultType, tobool(tolong(leftBool)/tolong(rightBool)));
			case DOUBLE:
				return new Value(interval, resultType, ((Double)left.getValue())/((Double)right.getValue()));
			case FLOAT:
				return new Value(interval, resultType, ((Float)left.getValue())/((Float)right.getValue()));
			case INT:
			case UINT:
				return new Value(interval, resultType, ((Long)left.getValue())/((Long)right.getValue()));
			case NON_SCALAR:
				return new Value(interval, resultType, null);
			}
		} catch (ArithmeticException e) {
			throw new ProcessingException(e);
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value mod(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)%tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getValue())%((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getValue())%((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())%((Long)right.getValue()));
		case NON_SCALAR:
			return new Value(interval, resultType, null);
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value add(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)+tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getValue())+((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getValue())+((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())+((Long)right.getValue()));
		case NON_SCALAR:
			return new Value(interval, resultType, null);
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value sub(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		long v;
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)-tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getValue())-((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getValue())-((Float)right.getValue()));
		case INT:
		case UINT:
			v = ((Long)left.getValue())-((Long)right.getValue());
			return new Value(interval, resultType, v);
		case NON_SCALAR:
			return new Value(interval, resultType, null);
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}


	public static Value neg(Value value) throws ProcessingException {
		Interval interval = value.getInterval();
		Type resultType = value.getType();
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			throw new ProcessingException("undefined operation for type bool");
		case DOUBLE:
			return new Value(interval, resultType, -((Double)value.getValue()));
		case FLOAT:
			return new Value(interval, resultType, -((Float)value.getValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, -((Long)value.getValue()));
		case NON_SCALAR:
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value lshift(Value left, Value right) throws ProcessingException {
		// TODO [2] left shift: left must be int?
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)<<tolong(rightBool)));
		case DOUBLE:
		case FLOAT:
			throw new ProcessingException("bit operations undefined for floating point types");
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())<<((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("bit operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value rshift(Value left, Value right) throws ProcessingException {
		// TODO [2] right shift: left must be int?

		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)>>tolong(rightBool)));
		case DOUBLE:
		case FLOAT:
			throw new ProcessingException("bit operations undefined for floating point types");
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())>>((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("bit operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value and(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)&tolong(rightBool)));
		case DOUBLE:
		case FLOAT:
			throw new ProcessingException("bit operations undefined for floating point types");
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())&((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("bit operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value xor(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)^tolong(rightBool)));
		case DOUBLE:
		case FLOAT:
			throw new ProcessingException("bit operations undefined for floating point types");
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())^((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("bit operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value or(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type.maxRank(left, right);
		left = Type.cast(left, resultType);
		right = Type.cast(right, resultType);
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, resultType, tobool(tolong(leftBool)|tolong(rightBool)));
		case DOUBLE:
		case FLOAT:
			throw new ProcessingException("bit operations undefined for floating point types");
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getValue())|((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("bit operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value not(Value value) throws ProcessingException {
		Type resultType = value.getType();
		switch(Type.Rank.of(resultType)) {
		case BOOL:
			return new Value(value.getInterval(), resultType, !((Boolean)value.getValue()));
		case DOUBLE:
		case FLOAT:
			throw new ProcessingException("bit operations undefined for floating point types");
		case INT:
		case UINT:
			return new Value(value.getInterval(), resultType, ~((Long)value.getValue()));
		case NON_SCALAR:
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value logEq(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, Type._bool, leftBool == rightBool);
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getValue()) == ((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getValue()) == ((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getValue()) == ((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	
	public static Value logNe(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, Type._bool, leftBool == rightBool);
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getValue()) != ((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getValue()) != ((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getValue()) != ((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	

	public static Value logGe(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, Type._bool, leftBool == rightBool);
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getValue()) >= ((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getValue()) >= ((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getValue()) >= ((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	
	public static Value logLe(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, Type._bool, leftBool == rightBool);
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getValue()) <= ((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getValue()) <= ((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getValue()) <= ((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	
	public static Value logGt(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, Type._bool, leftBool == rightBool);
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getValue()) > ((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getValue()) > ((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getValue()) > ((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	
	public static Value logLt(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getValue();
			Boolean rightBool = (Boolean)right.getValue();
			return new Value(interval, Type._bool, leftBool == rightBool);
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getValue()) < ((Double)right.getValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getValue()) < ((Float)right.getValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getValue()) < ((Long)right.getValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	
	public static Value logAnd(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		left = Type.cast(left, Type._bool);
		right = Type.cast(right, Type._bool);
		Boolean leftBool = (Boolean)left.getValue();
		Boolean rightBool = (Boolean)right.getValue();
		return new Value(interval, Type._bool, leftBool && rightBool);
	}
	
	public static Value logXor(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		left = Type.cast(left, Type._bool);
		right = Type.cast(right, Type._bool);
		Boolean leftBool = (Boolean)left.getValue();
		Boolean rightBool = (Boolean)right.getValue();
		return new Value(interval, Type._bool, leftBool != rightBool);
	}
	
	public static Value logOr(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		left = Type.cast(left, Type._bool);
		right = Type.cast(right, Type._bool);
		Boolean leftBool = (Boolean)left.getValue();
		Boolean rightBool = (Boolean)right.getValue();
		return new Value(interval, Type._bool, leftBool || rightBool);
	}

	
	public static Value logNot(Value value) {
		value = Type.cast(value, Type._bool);
		Boolean bool = (Boolean)value.getValue();
		return new Value(value.getInterval(), Type._bool, !bool);
	}

	

	private static boolean tobool(long value) {
		return value != 0;
	}

	private static int tolong(boolean value) {
		return value?1:0;
	}

}
