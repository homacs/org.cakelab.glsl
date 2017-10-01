package org.cakelab.glsl.lang;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.LValue;
import org.cakelab.glsl.lang.ast.Value;
import org.cakelab.glsl.lang.ast.types.Type;

public class InstructionProcessor {
	
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._int, Long.valueOf(tolong(leftBool)*tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getNativeValue())*((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getNativeValue())*((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, resultType, ((Character)left.getNativeValue())*((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getNativeValue())*((Long)right.getNativeValue()));
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
				Boolean leftBool = (Boolean)left.getNativeValue();
				Boolean rightBool = (Boolean)right.getNativeValue();
				return new Value(interval, Type._int, Long.valueOf(tolong(leftBool)/tolong(rightBool)));
			case DOUBLE:
				return new Value(interval, resultType, ((Double)left.getNativeValue())/((Double)right.getNativeValue()));
			case FLOAT:
				return new Value(interval, resultType, ((Float)left.getNativeValue())/((Float)right.getNativeValue()));
			case CHAR:
				return new Value(interval, resultType, ((Character)left.getNativeValue())/((Character)right.getNativeValue()));
			case INT:
			case UINT:
				return new Value(interval, resultType, ((Long)left.getNativeValue())/((Long)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._int, Long.valueOf(tolong(leftBool)%tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getNativeValue())%((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getNativeValue())%((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, resultType, ((Character)left.getNativeValue())%((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getNativeValue())%((Long)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._int, Long.valueOf(tolong(leftBool)+tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getNativeValue())+((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getNativeValue())+((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, resultType, ((Character)left.getNativeValue())+((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, ((Long)left.getNativeValue())+((Long)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._int, Long.valueOf(tolong(leftBool)-tolong(rightBool)));
		case DOUBLE:
			return new Value(interval, resultType, ((Double)left.getNativeValue())-((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, resultType, ((Float)left.getNativeValue())-((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, resultType, ((Character)left.getNativeValue())-((Character)right.getNativeValue()));
		case INT:
		case UINT:
			v = ((Long)left.getNativeValue())-((Long)right.getNativeValue());
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
			return new Value(interval, Type._int, Long.valueOf(-tolong((Boolean)value.getNativeValue())));
		case DOUBLE:
			return new Value(interval, resultType, -((Double)value.getNativeValue()));
		case FLOAT:
			return new Value(interval, resultType, -((Float)value.getNativeValue()));
		case CHAR:
			return new Value(interval, resultType, -((Character)value.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, resultType, -((Long)value.getNativeValue()));
		case NON_SCALAR:
		}
		throw new Error("internal error: unhandled type in arithmetic operation");
	}

	public static Value lshift(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type._int;
		int intleft = prepare_bitoperation(left);
		int intright = prepare_bitoperation(right);
		if (intright>0) return new Value(interval, resultType, Long.valueOf((intright >= 32)?0:intleft<<intright));
		else {
			intright = -intright;
			return new Value(interval, resultType, Long.valueOf((intright >= 32)?0:intleft>>>intright));
		}
	}

	public static Value rshift(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type resultType = Type._int;
		int intleft = prepare_bitoperation(left);
		int intright = prepare_bitoperation(right);
		if (intright > 0) return new Value(interval, resultType, Long.valueOf((intright >= 32)?0:intleft>>>intright));
		else {
			intright = -intright;
			return new Value(interval, resultType, Long.valueOf((intright >= 32)?0:intleft<<intright));
		}
	}

	public static Value and(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		int intleft = prepare_bitoperation(left);
		int intright = prepare_bitoperation(right);
		Type resultType = Type._int;
		return new Value(interval, resultType, Long.valueOf(intleft&intright));
	}

	public static Value xor(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		int intleft = prepare_bitoperation(left);
		int intright = prepare_bitoperation(right);
		Type resultType = Type._int;
		return new Value(interval, resultType, Long.valueOf(intleft^intright));
	}

	public static Value or(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		int intleft = prepare_bitoperation(left);
		int intright = prepare_bitoperation(right);
		Type resultType = Type._int;
		return new Value(interval, resultType, Long.valueOf(intleft|intright));
	}

	public static Value not(Value value) throws ProcessingException {
		int intvalue = prepare_bitoperation(value);
		return new Value(value.getInterval(), Type._int, Long.valueOf(~intvalue));
	}

	private static int prepare_bitoperation(Value value) throws ProcessingException {
		if (value.getType().hasKind(Type.KIND_SCALAR)) {
			Type.Rank rank = Type.Rank.of(value.getType());
			if (rank.lt(Type.Rank.UINT)) value = Type.cast(value, Type._int);
			Type type = value.getType();
			if (Type.Rank.of(type).equals(Type.Rank.UINT) || Type.Rank.of(type).equals(Type.Rank.INT)) {
				return ((Long)(value.getNativeValue())).intValue();
			}
		}
		throw new ProcessingException("bit operations undefined for " + value.getType().getName());
	}


	public static Value logEq(Value left, Value right) throws ProcessingException {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		Type maxType = Type.maxRank(left, right);
		left = Type.cast(left, maxType);
		right = Type.cast(right, maxType);
		switch(Type.Rank.of(maxType)) {
		case BOOL:
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._bool, tolong(leftBool) == tolong(rightBool));
		case CHAR:
			return new Value(interval, Type._bool, ((Character)left.getNativeValue()) == ((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getNativeValue()) == ((Long)right.getNativeValue()));
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getNativeValue()) == ((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getNativeValue()) == ((Float)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._bool, tolong(leftBool) != tolong(rightBool));
		case CHAR:
			return new Value(interval, Type._bool, ((Character)left.getNativeValue()) != ((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getNativeValue()) != ((Long)right.getNativeValue()));
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getNativeValue()) != ((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getNativeValue()) != ((Float)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._bool, tolong(leftBool) >= tolong(rightBool));
		case CHAR:
			return new Value(interval, Type._bool, ((Character)left.getNativeValue()) >= ((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getNativeValue()) >= ((Long)right.getNativeValue()));
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getNativeValue()) >= ((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getNativeValue()) >= ((Float)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._bool, tolong(leftBool) <= tolong(rightBool));
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getNativeValue()) <= ((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getNativeValue()) <= ((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, Type._bool, ((Character)left.getNativeValue()) <= ((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getNativeValue()) <= ((Long)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._bool, tolong(leftBool) > tolong(rightBool));
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getNativeValue()) > ((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getNativeValue()) > ((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, Type._bool, ((Character)left.getNativeValue()) > ((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getNativeValue()) > ((Long)right.getNativeValue()));
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
			Boolean leftBool = (Boolean)left.getNativeValue();
			Boolean rightBool = (Boolean)right.getNativeValue();
			return new Value(interval, Type._bool, tolong(leftBool) < tolong(rightBool));
		case DOUBLE:
			return new Value(interval, Type._bool, ((Double)left.getNativeValue()) < ((Double)right.getNativeValue()));
		case FLOAT:
			return new Value(interval, Type._bool, ((Float)left.getNativeValue()) < ((Float)right.getNativeValue()));
		case CHAR:
			return new Value(interval, Type._bool, ((Character)left.getNativeValue()) < ((Character)right.getNativeValue()));
		case INT:
		case UINT:
			return new Value(interval, Type._bool, ((Long)left.getNativeValue()) < ((Long)right.getNativeValue()));
		case NON_SCALAR:
			throw new ProcessingException("logical operations undefined for non-scalar types");
		}
		throw new Error("internal error: unhandled type in logical operation");
	}
	
	public static Value logAnd(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		left = Type.cast(left, Type._bool);
		right = Type.cast(right, Type._bool);
		Boolean leftBool = (Boolean)left.getNativeValue();
		Boolean rightBool = (Boolean)right.getNativeValue();
		return new Value(interval, Type._bool, leftBool && rightBool);
	}
	
	public static Value logXor(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		left = Type.cast(left, Type._bool);
		right = Type.cast(right, Type._bool);
		Boolean leftBool = (Boolean)left.getNativeValue();
		Boolean rightBool = (Boolean)right.getNativeValue();
		return new Value(interval, Type._bool, leftBool != rightBool);
	}
	
	public static Value logOr(Value left, Value right) {
		Interval interval = new Interval(left.getStart(), right.getEnd());
		left = Type.cast(left, Type._bool);
		right = Type.cast(right, Type._bool);
		Boolean leftBool = (Boolean)left.getNativeValue();
		Boolean rightBool = (Boolean)right.getNativeValue();
		return new Value(interval, Type._bool, leftBool || rightBool);
	}

	
	public static Value logNot(Value value) {
		value = Type.cast(value, Type._bool);
		Boolean bool = (Boolean)value.getNativeValue();
		return new Value(value.getInterval(), Type._bool, !bool);
	}

	

	public static boolean tobool(long value) {
		return value != 0;
	}

	public static int tolong(boolean value) {
		return value?1:0;
	}

}
