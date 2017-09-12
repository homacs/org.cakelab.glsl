package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;

/** 
 * Type has a signature instead of a name.
 * Signature is the fully specified type name 
 * (e.g. 'int[]' or 'void', but not 'int[3]').
 * 
 * There is always just one type of certain 
 * signature in the same scope.
 * 
 * A qualified type is a type with one basic 
 * type and qualifiers. The basic type of a 
 * qualified type can be of non-qualified type 
 * only. Qualified types have the signature of
 * their basic type.
 * 
 * @author homac
 *
 */
public class Type extends NodeImpl implements Comparable<Type> {

	public interface QualifiedType {
		Qualifier[] qualifiers();
	}


	public static class QualifiedTypeImpl extends Type implements QualifiedType {
		private final Qualifier[] qualifiers;
		
		public QualifiedTypeImpl(Type type, Qualifier ... qualifiers) {
			super(type);
			if (type instanceof QualifiedType) {
				throw new Error("can't add qualifiers to qualified type.");
			}
			this.qualifiers = qualifiers;
		}

		@Override
		public Qualifier[] qualifiers() {
			return qualifiers;
		}

		public boolean hasQualifier(Qualifier qualifier) {
			for (Qualifier q : qualifiers) {
				if (q.equals(qualifier)) return true;
			}
			return false;
		}
		
		
		

	}
	
	public static int KIND_SCALAR = 1<<0;
	public static int KIND_ARRAY  = 1<<1;
	public static int KIND_STRUCT = 1<<2;
	public static int KIND_VECTOR = KIND_ARRAY|KIND_STRUCT;
	public static int KIND_MATRIX = KIND_ARRAY|KIND_STRUCT;
	public static int KIND_UNDEFINED = 0;
	
	/** Signature is the fully specified type name (e.g. 'int[]' or 'void' but not 'int[3]'). */
	final String signature;

	final int kind;
	
	
	Type(String signature, int kind) {
		this(Interval.NONE, signature, kind);
	}
	
	public Type(Interval interval, String signature, int kind) {
		super(interval);
		this.signature = signature;
		this.kind = kind;
	}

	
	public Type(Type that) {
		super(that);
		this.signature = that.signature;
		this.kind = that.kind;
	}

	public String getName() {
		return signature;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((signature == null) ? 0 : signature.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Type other = (Type) obj;
		if (signature == null) {
			if (other.signature != null)
				return false;
		} else if (!signature.equals(other.signature))
			return false;
		return true;
	}


	/** comparison of type basically compares their signatures. */
	@Override
	public int compareTo(Type that) {
		if (this == that) return 0;
		if (that == null) return +1;

		int result = this.signature.compareTo(that.signature);
		if (result != 0) return result;
		
		return 0;
	}
	
	
	public static Type _qualified(Type type, Qualifier ... qualifiers) {
		if (type.getClass() == Array.class) return new Array.QualifiedArrayImpl((Array)type, qualifiers);
		else if (type.getClass() == Struct.class) return new Struct.QualifiedStructImpl((Struct)type, qualifiers);
		else if (type.getClass() == InterfaceBlock.class) return new InterfaceBlock.QualifiedInterfaceBlockImpl((InterfaceBlock)type, qualifiers);
		else if (type.getClass() == Type.class) return new QualifiedTypeImpl(type, qualifiers);
		else throw new Error("unexpected type of qualified type '" + type.getClass().getCanonicalName() + "'");
	}

	/** non-glsl type, for preprocessor only */
	public static Type _char = new Type("char", KIND_SCALAR);

	
	public static Type _void = new Type("void", KIND_SCALAR);
	
	public static Type _atomic_uint = new Type("atomic_uint", KIND_SCALAR);
	
	public static Type _float = new Type("float", KIND_SCALAR);
	public static Type _double = new Type("double", KIND_SCALAR);
	public static Type _int = new Type("int", KIND_SCALAR);
	public static Type _uint = new Type("uint", KIND_SCALAR);
	public static Type _bool = new Type("bool", KIND_SCALAR);
	
	public static Type _vec2 = new Type("vec2", KIND_VECTOR);
	public static Type _vec3 = new Type("vec3", KIND_VECTOR);
	public static Type _vec4 = new Type("vec4", KIND_VECTOR);
	public static Type _dvec2 = new Type("dvec2", KIND_VECTOR);
	public static Type _dvec3 = new Type("dvec3", KIND_VECTOR);
	public static Type _dvec4 = new Type("dvec4", KIND_VECTOR);
	public static Type _bvec2 = new Type("bvec2", KIND_VECTOR);
	public static Type _bvec3 = new Type("bvec3", KIND_VECTOR);
	public static Type _bvec4 = new Type("bvec4", KIND_VECTOR);
	public static Type _ivec2 = new Type("ivec2", KIND_VECTOR);
	public static Type _ivec3 = new Type("ivec3", KIND_VECTOR);
	public static Type _ivec4 = new Type("ivec4", KIND_VECTOR);
	public static Type _uvec2 = new Type("uvec2", KIND_VECTOR);
	public static Type _uvec3 = new Type("uvec3", KIND_VECTOR);
	public static Type _uvec4 = new Type("uvec4", KIND_VECTOR);
	
	public static Type _mat2 = new Type("mat2", KIND_MATRIX);
	public static Type _mat3 = new Type("mat3", KIND_MATRIX);
	public static Type _mat4 = new Type("mat4", KIND_MATRIX);
	public static Type _mat2x2 = new Type("mat2x2", KIND_MATRIX);
	public static Type _mat2x3 = new Type("mat2x3", KIND_MATRIX);
	public static Type _mat2x4 = new Type("mat2x4", KIND_MATRIX);
	public static Type _mat3x2 = new Type("mat3x2", KIND_MATRIX);
	public static Type _mat3x3 = new Type("mat3x3", KIND_MATRIX);
	public static Type _mat3x4 = new Type("mat3x4", KIND_MATRIX);
	public static Type _mat4x2 = new Type("mat4x2", KIND_MATRIX);
	public static Type _mat4x3 = new Type("mat4x3", KIND_MATRIX);
	public static Type _mat4x4 = new Type("mat4x4", KIND_MATRIX);
	public static Type _dmat2 = new Type("dmat2", KIND_MATRIX);
	public static Type _dmat3 = new Type("dmat3", KIND_MATRIX);
	public static Type _dmat4 = new Type("dmat4", KIND_MATRIX);
	public static Type _dmat2x2 = new Type("dmat2x2", KIND_MATRIX);
	public static Type _dmat2x3 = new Type("dmat2x3", KIND_MATRIX);
	public static Type _dmat2x4 = new Type("dmat2x4", KIND_MATRIX);
	public static Type _dmat3x2 = new Type("dmat3x2", KIND_MATRIX);
	public static Type _dmat3x3 = new Type("dmat3x3", KIND_MATRIX);
	public static Type _dmat3x4 = new Type("dmat3x4", KIND_MATRIX);
	public static Type _dmat4x2 = new Type("dmat4x2", KIND_MATRIX);
	public static Type _dmat4x3 = new Type("dmat4x3", KIND_MATRIX);
	public static Type _dmat4x4 = new Type("dmat4x4", KIND_MATRIX);
	
	public static Type _sampler1D = new Type("sampler1D", KIND_STRUCT);
	public static Type _sampler2D = new Type("sampler2D", KIND_STRUCT);
	public static Type _sampler3D = new Type("sampler3D", KIND_STRUCT);
	public static Type _samplerCube = new Type("samplerCube", KIND_STRUCT);

	public static Type _sampler1DShadow = new Type("sampler1DShadow", KIND_STRUCT);
	public static Type _sampler2DShadow = new Type("sampler2DShadow", KIND_STRUCT);
	public static Type _samplerCubeShadow = new Type("samplerCubeShadow", KIND_STRUCT);
	public static Type _sampler1DArray = new Type("sampler1DArray", KIND_STRUCT);
	public static Type _sampler2DArray = new Type("sampler2DArray", KIND_STRUCT);
	public static Type _sampler1DArrayShadow = new Type("sampler1DArrayShadow", KIND_STRUCT);
	public static Type _sampler2DArrayShadow = new Type("sampler2DArrayShadow", KIND_STRUCT);
	public static Type _samplerCubeArray = new Type("samplerCubeArray", KIND_STRUCT);
	public static Type _samplerCubeArrayShadow = new Type("samplerCubeArrayShadow", KIND_STRUCT);
	
	public static Type _isampler1D = new Type("isampler1D", KIND_STRUCT);
	public static Type _isampler2D = new Type("isampler2D", KIND_STRUCT);
	public static Type _isampler3D = new Type("isampler3D", KIND_STRUCT);
	public static Type _isamplerCube = new Type("isamplerCube", KIND_STRUCT);
	public static Type _isampler1DArray = new Type("isampler1DArray", KIND_STRUCT);
	public static Type _isampler2DArray = new Type("isampler2DArray", KIND_STRUCT);
	public static Type _isamplerCubeArray = new Type("isamplerCubeArray", KIND_STRUCT);
	
	public static Type _usampler1D = new Type("usampler1D", KIND_STRUCT);
	public static Type _usampler2D = new Type("usampler2D", KIND_STRUCT);
	public static Type _usampler3D = new Type("usampler3D", KIND_STRUCT);
	public static Type _usamplerCube = new Type("usamplerCube", KIND_STRUCT);
	public static Type _usampler1DArray = new Type("usampler1DArray", KIND_STRUCT);
	public static Type _usampler2DArray = new Type("usampler2DArray", KIND_STRUCT);
	public static Type _usamplerCubeArray = new Type("usamplerCubeArray", KIND_STRUCT);
	
	public static Type _sampler2DRect = new Type("sampler2DRect", KIND_STRUCT);
	public static Type _sampler2DRectShadow = new Type("sampler2DRectShadow", KIND_STRUCT);
	public static Type _isampler2DRect = new Type("isampler2DRect", KIND_STRUCT);
	public static Type _usampler2DRect = new Type("usampler2DRect", KIND_STRUCT);

	public static Type _samplerBuffer = new Type("samplerBuffer", KIND_STRUCT);
	public static Type _isamplerBuffer = new Type("isamplerBuffer", KIND_STRUCT);
	public static Type _usamplerBuffer = new Type("usamplerBuffer", KIND_STRUCT);

	public static Type _sampler2DMS = new Type("sampler2DMS", KIND_STRUCT);
	public static Type _isampler2DMS = new Type("isampler2DMS", KIND_STRUCT);
	public static Type _usampler2DMS = new Type("usampler2DMS", KIND_STRUCT);
	
	public static Type _sampler2DMSArray = new Type("sampler2DMSArray", KIND_STRUCT);
	public static Type _isampler2DMSArray = new Type("isampler2DMSArray", KIND_STRUCT);
	public static Type _usampler2DMSArray = new Type("usampler2DMSArray", KIND_STRUCT);
	
	public static Type _image1D = new Type("image1D", KIND_STRUCT);
	public static Type _iimage1D = new Type("iimage1D", KIND_STRUCT);
	public static Type _uimage1D = new Type("uimage1D", KIND_STRUCT);

	public static Type _image2D = new Type("image2D", KIND_STRUCT);
	public static Type _iimage2D = new Type("iimage2D", KIND_STRUCT);
	public static Type _uimage2D = new Type("uimage2D", KIND_STRUCT);

	public static Type _image3D = new Type("image3D", KIND_STRUCT);
	public static Type _iimage3D = new Type("iimage3D", KIND_STRUCT);
	public static Type _uimage3D = new Type("uimage3D", KIND_STRUCT);

	
	public static Type _image2DRect = new Type("image2DRect", KIND_STRUCT);
	public static Type _iimage2DRect = new Type("iimage2DRect", KIND_STRUCT);
	public static Type _uimage2DRect = new Type("uimage2DRect", KIND_STRUCT);
	
	public static Type _imageCube = new Type("imageCube", KIND_STRUCT);
	public static Type _iimageCube = new Type("iimageCube", KIND_STRUCT);
	public static Type _uimageCube = new Type("uimageCube", KIND_STRUCT);
	
	public static Type _imageBuffer = new Type("imageBuffer", KIND_STRUCT);
	public static Type _iimageBuffer = new Type("iimageBuffer", KIND_STRUCT);
	public static Type _uimageBuffer = new Type("uimageBuffer", KIND_STRUCT);
	
	public static Type _image1DArray = new Type("image1DArray", KIND_ARRAY);
	public static Type _iimage1DArray = new Type("iimage1DArray", KIND_ARRAY);
	public static Type _uimage1DArray = new Type("uimage1DArray", KIND_ARRAY);
	
	public static Type _image2DArray = new Type("image2DArray", KIND_ARRAY);
	public static Type _iimage2DArray = new Type("iimage2DArray", KIND_ARRAY);
	public static Type _uimage2DArray = new Type("uimage2DArray", KIND_ARRAY);
	
	public static Type _imageCubeArray = new Type("imageCubeArray", KIND_ARRAY);
	public static Type _iimageCubeArray = new Type("iimageCubeArray", KIND_ARRAY);
	public static Type _uimageCubeArray = new Type("uimageCubeArray", KIND_ARRAY);
	
	public static Type _image2DMS = new Type("image2DMS", KIND_STRUCT);
	public static Type _iimage2DMS = new Type("iimage2DMS", KIND_STRUCT);
	public static Type _uimage2DMS = new Type("uimage2DMS", KIND_STRUCT);
	
	public static Type _image2DMSArray = new Type("image2DMSArray", KIND_ARRAY);
	public static Type _iimage2DMSArray = new Type("iimage2DMSArray", KIND_ARRAY);
	public static Type _uimage2DMSArray = new Type("uimage2DMSArray", KIND_ARRAY);
	
	public static Type _samplerExternalOES = new Type("samplerExternalOES", KIND_STRUCT);

	
	public static Type[] BUILTIN_TYPES = new Type[] {
			_void,
			
			_atomic_uint,
			
			_float,
			_double,
			_int,
			_uint,
			_bool,
			
			_vec2,
			_vec3,
			_vec4,
			_dvec2,
			_dvec3,
			_dvec4,
			_bvec2,
			_bvec3,
			_bvec4,
			_ivec2,
			_ivec3,
			_ivec4,
			_uvec2,
			_uvec3,
			_uvec4,
			
			_mat2,
			_mat3,
			_mat4,
			_mat2x2,
			_mat2x3,
			_mat2x4,
			_mat3x2,
			_mat3x3,
			_mat3x4,
			_mat4x2,
			_mat4x3,
			_mat4x4,
			_dmat2,
			_dmat3,
			_dmat4,
			_dmat2x2,
			_dmat2x3,
			_dmat2x4,
			_dmat3x2,
			_dmat3x3,
			_dmat3x4,
			_dmat4x2,
			_dmat4x3,
			_dmat4x4,
			
			_sampler1D,
			_sampler2D,
			_sampler3D,
			_samplerCube,

			_sampler1DShadow,
			_sampler2DShadow,
			_samplerCubeShadow,
			_sampler1DArray,
			_sampler2DArray,
			_sampler1DArrayShadow,
			_sampler2DArrayShadow,
			_samplerCubeArray,
			_samplerCubeArrayShadow,
			
			_isampler1D,
			_isampler2D,
			_isampler3D,
			_isamplerCube,
			_isampler1DArray,
			_isampler2DArray,
			_isamplerCubeArray,
			
			_usampler1D,
			_usampler2D,
			_usampler3D,
			_usamplerCube,
			_usampler1DArray,
			_usampler2DArray,
			_usamplerCubeArray,
			
			_sampler2DRect,
			_sampler2DRectShadow,
			_isampler2DRect,
			_usampler2DRect,

			_samplerBuffer,
			_isamplerBuffer,
			_usamplerBuffer,

			_sampler2DMS,
			_isampler2DMS,
			_usampler2DMS,
			
			_sampler2DMSArray,
			_isampler2DMSArray,
			_usampler2DMSArray,
			
			_image1D,
			_iimage1D,
			_uimage1D,

			_image2D,
			_iimage2D,
			_uimage2D,

			_image3D,
			_iimage3D,
			_uimage3D,

			
			_image2DRect,
			_iimage2DRect,
			_uimage2DRect,
			
			_imageCube,
			_iimageCube,
			_uimageCube,
			
			_imageBuffer,
			_iimageBuffer,
			_uimageBuffer,
			
			_image1DArray,
			_iimage1DArray,
			_uimage1DArray,
			
			_image2DArray,
			_iimage2DArray,
			_uimage2DArray,
			
			_imageCubeArray,
			_iimageCubeArray,
			_uimageCubeArray,
			
			_image2DMS,
			_iimage2DMS,
			_uimage2DMS,
			
			_image2DMSArray,
			_iimage2DMSArray,
			_uimage2DMSArray,
			
			_samplerExternalOES,

	};


	public static Type maxRank(Value v1, Value v2) {
		Rank leftRank = Rank.of(v1.type);
		Rank rightRank = Rank.of(v2.type);
		
		return leftRank.gt(rightRank) ? v1.type : v2.type;
	}
	
	public enum Rank {
		BOOL,
		CHAR,
		UINT,
		INT,
		FLOAT,
		DOUBLE,
		NON_SCALAR;
		public static Rank of(Type type) {
			if (type.equals(_char)) {
				return CHAR;
			} else if (type.equals(_bool)) {
				return BOOL;
			} else if (type.equals(_uint)) {
				return UINT;
			} else if (type.equals(_atomic_uint)) {
				return UINT;
			} else if (type.equals(_int)||type.equals(_char)) {
				return INT;
			} else if (type.equals(_float)) {
				return FLOAT;
			} else if (type.equals(_double)) {
				return DOUBLE;
			} else {
				return NON_SCALAR;
			}
		}

		public boolean gt(Rank rightRank) {
			return this.ordinal() > rightRank.ordinal();
		}

		public boolean lt(Rank i) {
			return this.ordinal() < i.ordinal();
		}
	}

	public static Value cast(Value value, Type targetType) {
		// TODO type cast exception
		Interval interval = value.getInterval();
		if (value.value == null) return new Value(interval, targetType, null);

		
		switch(Rank.of(value.type)) {
			case BOOL: 
			{
				Boolean v = (Boolean)value.value;
				int intValue = v?1:0;
				switch(Rank.of(targetType)) {
				case BOOL:
					return value;
				case CHAR:
					return new Value(interval, targetType, Character.valueOf((char)intValue));
				case DOUBLE:
					return new Value(interval, targetType, Double.valueOf(intValue));
				case FLOAT:
					return new Value(interval, targetType, Float.valueOf(intValue));
				case INT:
				case UINT:
					return new Value(interval, targetType, Long.valueOf(intValue));
				case NON_SCALAR:
					return new Value(interval, targetType, null);
				}
			}
			case CHAR:
			{
				char v = ((Character)value.value).charValue();
				switch(Rank.of(targetType)) {
				case BOOL:
					return new Value(interval, targetType, Boolean.valueOf(v != 0));
				case CHAR:
					return value;
				case DOUBLE:
					return new Value(interval, targetType, Double.valueOf(v));
				case FLOAT:
					return new Value(interval, targetType, Float.valueOf(v));
				case INT:
					return new Value(interval, targetType, Long.valueOf(v));
				case UINT:
					return value;
				case NON_SCALAR:
					return new Value(interval, targetType, null);
				}
			}
			case UINT:
			{
				Long v = (Long)value.value;
				switch(Rank.of(targetType)) {
				case BOOL:
					return new Value(interval, targetType, Boolean.valueOf(v.longValue() != 0));
				case CHAR:
					return new Value(interval, targetType, Character.valueOf((char)v.longValue()));
				case DOUBLE:
					return new Value(interval, targetType, Double.valueOf(v.longValue()));
				case FLOAT:
					return new Value(interval, targetType, Float.valueOf(v.longValue()));
				case INT:
					return new Value(interval, targetType, Long.valueOf(v.longValue()));
				case UINT:
					return value;
				case NON_SCALAR:
					return new Value(interval, targetType, null);
				}
			}
			case INT:
			{
				Long v = (Long)value.value;
				switch(Rank.of(targetType)) {
				case BOOL:
					return new Value(interval, targetType, Boolean.valueOf(v.longValue() != 0));
				case CHAR:
					return new Value(interval, targetType, Character.valueOf((char)v.longValue()));
				case DOUBLE:
					return new Value(interval, targetType, Double.valueOf(v.longValue()));
				case FLOAT:
					return new Value(interval, targetType, Float.valueOf(v.longValue()));
				case INT:
					return value;
				case UINT:
					return new Value(interval, targetType, Long.valueOf(v.longValue()));
				case NON_SCALAR:
					return new Value(interval, targetType, null);
				}
			}
			case FLOAT:
			{
				Float v = (Float)value.value;
				switch(Rank.of(targetType)) {
				case BOOL:
					return new Value(interval, targetType, Boolean.valueOf(v != 0));
				case CHAR:
					return new Value(interval, targetType, Character.valueOf((char)v.longValue()));
				case DOUBLE:
					return new Value(interval, targetType, Double.valueOf(v));
				case FLOAT:
					return value;
				case INT:
				case UINT:
					return new Value(interval, targetType, Long.valueOf(v.longValue()));
				case NON_SCALAR:
					return new Value(interval, targetType, null);
				}
			}
			case DOUBLE:
			{
				Double v = (Double)value.value;
				switch(Rank.of(targetType)) {
				case BOOL:
					return new Value(interval, targetType, Boolean.valueOf(v.longValue() != 0));
				case CHAR:
					return new Value(interval, targetType, Character.valueOf((char)v.longValue()));
				case DOUBLE:
					return value;
				case FLOAT:
					return new Value(interval, targetType, Float.valueOf(v.longValue()));
				case INT:
				case UINT:
					return new Value(interval, targetType, Long.valueOf(v.longValue()));
				case NON_SCALAR:
					return new Value(interval, targetType, null);
				}
			}
			case NON_SCALAR:
			{
				return new Value(interval, targetType, null);
			}
		}
		throw new Error("internal error: undefined type cast");
	}


	public static Type checkSign(Type type, long v) {
		Rank rank = Rank.of(type);
		if (v < 0  &&  rank == Rank.UINT) {
			if (type == _uint || type == _atomic_uint) {
				return _int;
			} else if (type instanceof QualifiedType) {
				return new QualifiedTypeImpl(_int, ((QualifiedType) type).qualifiers());
			}
		}
		return type;
	}


	public Value newInstance(Value[] arguments) {
		// TODO [interpreter]
		throw new Error("not yet supported");
	}


	public boolean hasQualifier(Qualifier qualifier) {
		return false;
	}


	public boolean hasKind(int kind) {
		return 0 != (kind|this.kind);
	}



}
