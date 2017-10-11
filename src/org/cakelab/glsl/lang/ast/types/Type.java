package org.cakelab.glsl.lang.ast.types;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Constructor;
import org.cakelab.glsl.lang.ast.ConstructorGroup;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.ParameterDeclaration;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Qualifiers;
import org.cakelab.glsl.lang.ast.Value;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;

/** 
 * Type has a signature instead of a name.
 * Signature is the fully specified type name 
 * (e.g. 'int[]' or 'void', but not 'int[3]').
 * 
 * There is always just one declared type of a certain 
 * signature in the same scope. But there may be 
 * different instances of the declared type with 
 * different qualifiers used by variables for example.
 * 
 * Qualifiers declared for a type will be inherited by
 * all variables or functions using that type. The same 
 * goes for arrays which use a qualified type as component 
 * type.
 * 
 * @author homac
 *
 */
public class Type extends NodeImpl implements Comparable<Type> {
	private static boolean STATIC_INITIALISATION_PHASE = true;

	/** Verdict about the assignability of a value of a source type
	 * to a storage location of a target type.
	 * <p>
	 * Assignability verdicts have a natural order:
	 * </p>
	 * <pre>
	 * Direct > ImplicitCastable > ExplicitCastable > NotAssignable
	 * </pre>
	 * 
	 * @author homac
	 *
	 */
	public enum AssignabilityVerdict {
		
		/** Source and target type are identically. */
		Direct,
		
		/** Source type can be implicitly casted to target type */
		ImplictCastable,
		
		/** Types are not equal and require an explicit cast (in glsl terms, a constructor call).
		 * Means: There is a constructor, which supports instantiation of an equivalent value 
		 * of the source type in the target type representation. */
		ExplicitCastable,
		
		/** Types are completely different in memory layout 
		 * and there is no way to cast the source type to the target type. */
		NotAssignable;

		public boolean betterThan(AssignabilityVerdict that) {
			return this.ordinal() < that.ordinal();
		}
		
		public boolean worseThan(AssignabilityVerdict that) {
			return this.ordinal() > that.ordinal();
		}
		
	}

	public static final int KIND_UNDEFINED = 0;
	public static final int KIND_SCALAR = 1<<0;
	public static final int KIND_ARRAY  = 1<<1;
	public static final int KIND_STRUCT = 1<<2;
	public static final int KIND_MATRIX = KIND_ARRAY|KIND_STRUCT;
	public static final int KIND_VECTOR = KIND_MATRIX;
	
	/** Signature is the fully specified type name (e.g. 'int[]' or 'void' but not 'int[3]'). */
	protected Qualifiers qualifiers = new Qualifiers();
	private final String signature;

	private final int kind;
	private final Rank rank;
	protected ConstructorGroup constructors = new ConstructorGroup();
	
	
	Type(String signature, int kind, Rank rank) {
		this(Interval.NONE, signature, kind, rank, null);
		createStandardConstructors();
	}

	Type(String signature, int kind) {
		this(Interval.NONE, signature, kind, Rank.NON_SCALAR, null);
		assert(kind != KIND_SCALAR);
		createStandardConstructors();
	}
	
	public Type(Interval interval, String signature, int kind, Rank rank, Qualifiers qualifiers) {
		super(interval);
		this.signature = signature;
		this.kind = kind;
		this.rank = rank;
		createStandardConstructors();
		if (qualifiers != null) {
			// ignore null list
			this.qualifiers = qualifiers;
		}
	}

	
	public Type(Type that) {
		super(that);
		this.signature = that.getSignature();
		this.kind = that.getKind();
		this.qualifiers = that.qualifiers.clone();
		this.constructors = that.constructors.clone();
		this.rank = that.rank;
	}

	protected void createStandardConstructors() {
		if (STATIC_INITIALISATION_PHASE) return;
		
		if (this.equals(_void)) return;
		
		// default constructor
		addConstructor(new Constructor(Interval.NONE, this));
		// copy constructor
		addConstructor(new Constructor(Interval.NONE, this, new ParameterDeclaration(IScope.NONE, this, "value")));
		switch (this.getKind()) {
		case KIND_SCALAR:
			addConstructorNotEqual(_bool);
			addConstructorNotEqual(_char);
			addConstructorNotEqual(_int);
			addConstructorNotEqual(_uint);
			addConstructorNotEqual(_float);
			addConstructorNotEqual(_double);
			break;
		}
	}

	protected void addConstructorNotEqual(Type paramType) {
		if (!this.equals(paramType)) {
			addConstructor(createCastConstructor(this, paramType));		
		}
	}

	
	public static Constructor createCastConstructor(Type type, Type paramType) {
		return new Constructor(Interval.NONE, type, new ParameterDeclaration(IScope.NONE, paramType, "value"));
	}
	
	public void addConstructor(Constructor constructor) {
		constructors.add(constructor);
	}

	public String getName() {
		return getSignature();
	}
	
	public Value newInstance(Value[] arguments) {
		// TODO [interpreter] constructor calls
		throw new Error("not yet supported");
	}


	public boolean hasQualifier(Qualifier qualifier) {
		return qualifiers.contains(qualifier);
	}
	
	public void addQualifier(Qualifier q) {
		qualifiers.add(q);
	}

	public boolean hasQualifiers() {
		return qualifiers.size() > 0;
	}
	
	public void addQualifiers(Qualifiers qualifiers) {
		this.qualifiers.add(qualifiers);
	}

	
	public String toString() {
		String fqn = this.getSignature();
		if (!qualifiers.isEmpty()) {
			fqn = qualifiers.toString() + " " + fqn;
		}
		return fqn;
	}



	public boolean hasKind(int kind) {
		return 0 != (kind|this.getKind());
	}


	public Qualifiers getQualifiers() {
		return qualifiers;
	}

	public void setQualifiers(Qualifiers qualifiers) {
		if (qualifiers != null) {
			this.qualifiers = qualifiers;
		} else {
			this.qualifiers.clear();
		}
	}



	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Type other = (Type) obj;
		if (getSignature() == null) {
			if (other.getSignature() != null)
				return false;
		} else if (!getSignature().equals(other.getSignature())) {
			return false;
		}
		return true;
	}


	/** comparison of type basically compares their signatures. */
	@Override
	public int compareTo(Type that) {
		if (this == that) return 0;
		if (that == null) return +1;

		int result = this.getSignature().compareTo(that.getSignature());
		if (result != 0) return result;
		
		return 0;
	}
	
	public Type clone() {
		return new Type(this);
	}
	
	
	public static Type _qualified(Type type, Qualifier ... qualifiers) {
		type = type.clone();
		if (qualifiers != null && qualifiers.length > 0) {
			type.getQualifiers().add(qualifiers);
		}
		return type;
	}

	public static Type _qualified(Type type, Qualifiers qualifiers) {
		type = type.clone();
		if (qualifiers != null && qualifiers.size() > 0) {
			type.getQualifiers().add(qualifiers);
		}
		return type;
	}

	/** non-glsl type, for preprocessor only */
	public static Type _char = new Type("char", KIND_SCALAR, Rank.CHAR);

	
	public static Type _void = new Type("void", KIND_SCALAR, Rank.NON_SCALAR);
	
	public static Type _atomic_uint = new Type("atomic_uint", KIND_SCALAR, Rank.UINT);
	
	public static Type _float = new Type("float", KIND_SCALAR, Rank.FLOAT);
	public static Type _double = new Type("double", KIND_SCALAR, Rank.DOUBLE);
	public static Type _int = new Type("int", KIND_SCALAR, Rank.INT);
	public static Type _uint = new Type("uint", KIND_SCALAR, Rank.INT);
	public static Type _bool = new Type("bool", KIND_SCALAR, Rank.BOOL);
	
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
			
	};

	static {
		STATIC_INITIALISATION_PHASE = false;
		// initialise standard constructors
		for (Type t : BUILTIN_TYPES) {
			t.createStandardConstructors();
		}
	}

	public static Type maxRank(Value v1, Value v2) {
		Rank leftRank = Rank.of(v1.getType());
		Rank rightRank = Rank.of(v2.getType());
		
		return leftRank.gt(rightRank) ? v1.getType() : v2.getType();
	}
	
	// TODO: rank has to be replaced by a table which contains implicit cast rules
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
			} else if (type.equals(_int)) {
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
		if (value.getType().equals(targetType)) {
			return value;
		}
		if (value.getNativeValue() == null) {
			return new Value(interval, targetType, null);
		}
		
		switch(Rank.of(value.getType())) {
			case BOOL: 
			{
				Boolean v = (Boolean)value.getNativeValue();
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
				char v = ((Character)value.getNativeValue()).charValue();
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
				Long v = (Long)value.getNativeValue();
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
				Long v = (Long)value.getNativeValue();
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
				Float v = (Float)value.getNativeValue();
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
				Double v = (Double)value.getNativeValue();
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

	/** whether a variable of given type can be assigned to a variable of this type. 
	 * The result is a verdict about the assignability (see {@link AssignabilityVerdict} */
	public AssignabilityVerdict assignability(Type type) {
		if (type != null) {
			if (this == type || this.equals(type)) {
				return AssignabilityVerdict.Direct;
			}
			
			switch(Rank.of(this)) {
				case BOOL: 
				{
					switch(Rank.of(type)) {
					case BOOL:
					case CHAR:
					case INT:
					case UINT:
					case FLOAT:
					case DOUBLE:
						return AssignabilityVerdict.ExplicitCastable;
					case NON_SCALAR:
						return AssignabilityVerdict.NotAssignable;
					}
				}
				case CHAR:
				{
					switch(Rank.of(type)) {
					case BOOL:
					case CHAR:
					case INT:
					case UINT:
						return AssignabilityVerdict.ImplictCastable;
					case DOUBLE:
					case FLOAT:
						return AssignabilityVerdict.ExplicitCastable;
					case NON_SCALAR:
						return AssignabilityVerdict.NotAssignable;
					}
				}
				case UINT:
				{
					switch(Rank.of(type)) {
					case INT:
					case UINT:
						return AssignabilityVerdict.ImplictCastable;
					case BOOL:
					case CHAR:
					case DOUBLE:
					case FLOAT:
						return AssignabilityVerdict.ExplicitCastable;
					case NON_SCALAR:
						return AssignabilityVerdict.NotAssignable;
					}
				}
				case INT:
				{
					switch(Rank.of(type)) {
					case CHAR:
					case INT:
						return AssignabilityVerdict.ImplictCastable;
					case BOOL:
					case DOUBLE:
					case FLOAT:
					case UINT:
						return AssignabilityVerdict.ExplicitCastable;
					case NON_SCALAR:
						return AssignabilityVerdict.NotAssignable;
					}
				}
				case FLOAT:
				{
					switch(Rank.of(type)) {
					case FLOAT:
					case INT:
					case UINT:
						return AssignabilityVerdict.ImplictCastable;
					case CHAR:
					case BOOL:
					case DOUBLE:
						return AssignabilityVerdict.ExplicitCastable;
					case NON_SCALAR:
						return AssignabilityVerdict.NotAssignable;
					}
				}
				case DOUBLE:
				{
					switch(Rank.of(type)) {
					case CHAR:
					case DOUBLE:
					case FLOAT:
					case INT:
					case UINT:
						return AssignabilityVerdict.ImplictCastable;
					case BOOL:
						return AssignabilityVerdict.ExplicitCastable;
					case NON_SCALAR:
						return AssignabilityVerdict.NotAssignable;
					}
				}
				case NON_SCALAR:
				{
					if (type.hasConstructor(new Type[]{type})) {
						return AssignabilityVerdict.ExplicitCastable;
					} else {
						// has to be handled by struct or array type implementation
						return AssignabilityVerdict.NotAssignable;
					}
				}
			}
			throw new Error("internal error: undefined type cast");
		
		}
		// given type is null, should not happen but conceptually it is not assignable
		return AssignabilityVerdict.NotAssignable;
	}

	public boolean hasConstructor(Type[] argumentTypes) {
		return getConstructor(argumentTypes) != null;
	}
	/** Supposed to be overridden by struct and array types! */
	public Constructor getConstructor(Type[] argumentTypes) {
		return (Constructor) constructors.getExactMatch(argumentTypes);
	}

	public Function getMethod(Type[] argumentTypes) {
		return null;
	}

	public String getSignature() {
		return signature;
	}

	public int getKind() {
		return kind;
	}

	public void addCastConstructor(Type paramType) {
		this.addConstructor(createCastConstructor(this,paramType));
	}

	public void addImplicitCastRule(Type sourceType) {
		// TODO: implement implicit cast rules for types
	}


}
