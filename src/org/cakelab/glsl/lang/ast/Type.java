package org.cakelab.glsl.lang.ast;

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
public class Type implements Comparable<Type> {

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

	}
	
	
	
	/** Signature is the fully specified type name (e.g. 'int[]' or 'void' but not 'int[3]'). */
	final String signature;
	
	
	public Type(String signature) {
		this.signature = signature;
	}

	
	public Type(Type that) {
		this.signature = that.signature;
	}

	public String getName() {
		return signature;
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

	public static Type _void = new Type("void");
	
	public static Type _atomic_uint = new Type("atomic_uint");
	
	public static Type _float = new Type("float");
	public static Type _double = new Type("double");
	public static Type _int = new Type("int");
	public static Type _uint = new Type("uint");
	public static Type _bool = new Type("bool");
	
	public static Type _vec2 = new Type("vec2");
	public static Type _vec3 = new Type("vec3");
	public static Type _vec4 = new Type("vec4");
	public static Type _dvec2 = new Type("dvec2");
	public static Type _dvec3 = new Type("dvec3");
	public static Type _dvec4 = new Type("dvec4");
	public static Type _bvec2 = new Type("bvec2");
	public static Type _bvec3 = new Type("bvec3");
	public static Type _bvec4 = new Type("bvec4");
	public static Type _ivec2 = new Type("ivec2");
	public static Type _ivec3 = new Type("ivec3");
	public static Type _ivec4 = new Type("ivec4");
	public static Type _uvec2 = new Type("uvec2");
	public static Type _uvec3 = new Type("uvec3");
	public static Type _uvec4 = new Type("uvec4");
	
	public static Type _mat2 = new Type("mat2");
	public static Type _mat3 = new Type("mat3");
	public static Type _mat4 = new Type("mat4");
	public static Type _mat2x2 = new Type("mat2x2");
	public static Type _mat2x3 = new Type("mat2x3");
	public static Type _mat2x4 = new Type("mat2x4");
	public static Type _mat3x2 = new Type("mat3x2");
	public static Type _mat3x3 = new Type("mat3x3");
	public static Type _mat3x4 = new Type("mat3x4");
	public static Type _mat4x2 = new Type("mat4x2");
	public static Type _mat4x3 = new Type("mat4x3");
	public static Type _mat4x4 = new Type("mat4x4");
	public static Type _dmat2 = new Type("dmat2");
	public static Type _dmat3 = new Type("dmat3");
	public static Type _dmat4 = new Type("dmat4");
	public static Type _dmat2x2 = new Type("dmat2x2");
	public static Type _dmat2x3 = new Type("dmat2x3");
	public static Type _dmat2x4 = new Type("dmat2x4");
	public static Type _dmat3x2 = new Type("dmat3x2");
	public static Type _dmat3x3 = new Type("dmat3x3");
	public static Type _dmat3x4 = new Type("dmat3x4");
	public static Type _dmat4x2 = new Type("dmat4x2");
	public static Type _dmat4x3 = new Type("dmat4x3");
	public static Type _dmat4x4 = new Type("dmat4x4");
	
	public static Type _sampler1D = new Type("sampler1D");
	public static Type _sampler2D = new Type("sampler2D");
	public static Type _sampler3D = new Type("sampler3D");
	public static Type _samplerCube = new Type("samplerCube");

	public static Type _sampler1DShadow = new Type("sampler1DShadow");
	public static Type _sampler2DShadow = new Type("sampler2DShadow");
	public static Type _samplerCubeShadow = new Type("samplerCubeShadow");
	public static Type _sampler1DArray = new Type("sampler1DArray");
	public static Type _sampler2DArray = new Type("sampler2DArray");
	public static Type _sampler1DArrayShadow = new Type("sampler1DArrayShadow");
	public static Type _sampler2DArrayShadow = new Type("sampler2DArrayShadow");
	public static Type _samplerCubeArray = new Type("samplerCubeArray");
	public static Type _samplerCubeArrayShadow = new Type("samplerCubeArrayShadow");
	
	public static Type _isampler1D = new Type("isampler1D");
	public static Type _isampler2D = new Type("isampler2D");
	public static Type _isampler3D = new Type("isampler3D");
	public static Type _isamplerCube = new Type("isamplerCube");
	public static Type _isampler1DArray = new Type("isampler1DArray");
	public static Type _isampler2DArray = new Type("isampler2DArray");
	public static Type _isamplerCubeArray = new Type("isamplerCubeArray");
	
	public static Type _usampler1D = new Type("usampler1D");
	public static Type _usampler2D = new Type("usampler2D");
	public static Type _usampler3D = new Type("usampler3D");
	public static Type _usamplerCube = new Type("usamplerCube");
	public static Type _usampler1DArray = new Type("usampler1DArray");
	public static Type _usampler2DArray = new Type("usampler2DArray");
	public static Type _usamplerCubeArray = new Type("usamplerCubeArray");
	
	public static Type _sampler2DRect = new Type("sampler2DRect");
	public static Type _sampler2DRectShadow = new Type("sampler2DRectShadow");
	public static Type _isampler2DRect = new Type("isampler2DRect");
	public static Type _usampler2DRect = new Type("usampler2DRect");

	public static Type _samplerBuffer = new Type("samplerBuffer");
	public static Type _isamplerBuffer = new Type("isamplerBuffer");
	public static Type _usamplerBuffer = new Type("usamplerBuffer");

	public static Type _sampler2DMS = new Type("sampler2DMS");
	public static Type _isampler2DMS = new Type("isampler2DMS");
	public static Type _usampler2DMS = new Type("usampler2DMS");
	
	public static Type _sampler2DMSArray = new Type("sampler2DMSArray");
	public static Type _isampler2DMSArray = new Type("isampler2DMSArray");
	public static Type _usampler2DMSArray = new Type("usampler2DMSArray");
	
	public static Type _image1D = new Type("image1D");
	public static Type _iimage1D = new Type("iimage1D");
	public static Type _uimage1D = new Type("uimage1D");

	public static Type _image2D = new Type("image2D");
	public static Type _iimage2D = new Type("iimage2D");
	public static Type _uimage2D = new Type("uimage2D");

	public static Type _image3D = new Type("image3D");
	public static Type _iimage3D = new Type("iimage3D");
	public static Type _uimage3D = new Type("uimage3D");

	
	public static Type _image2DRect = new Type("image2DRect");
	public static Type _iimage2DRect = new Type("iimage2DRect");
	public static Type _uimage2DRect = new Type("uimage2DRect");
	
	public static Type _imageCube = new Type("imageCube");
	public static Type _iimageCube = new Type("iimageCube");
	public static Type _uimageCube = new Type("uimageCube");
	
	public static Type _imageBuffer = new Type("imageBuffer");
	public static Type _iimageBuffer = new Type("iimageBuffer");
	public static Type _uimageBuffer = new Type("uimageBuffer");
	
	public static Type _image1DArray = new Type("image1DArray");
	public static Type _iimage1DArray = new Type("iimage1DArray");
	public static Type _uimage1DArray = new Type("uimage1DArray");
	
	public static Type _image2DArray = new Type("image2DArray");
	public static Type _iimage2DArray = new Type("iimage2DArray");
	public static Type _uimage2DArray = new Type("uimage2DArray");
	
	public static Type _imageCubeArray = new Type("imageCubeArray");
	public static Type _iimageCubeArray = new Type("iimageCubeArray");
	public static Type _uimageCubeArray = new Type("uimageCubeArray");
	
	public static Type _image2DMS = new Type("image2DMS");
	public static Type _iimage2DMS = new Type("iimage2DMS");
	public static Type _uimage2DMS = new Type("uimage2DMS");
	
	public static Type _image2DMSArray = new Type("image2DMSArray");
	public static Type _iimage2DMSArray = new Type("iimage2DMSArray");
	public static Type _uimage2DMSArray = new Type("uimage2DMSArray");
	
	public static Type _samplerExternalOES = new Type("samplerExternalOES");

	
	public static Type[] BUILTIN_TYPES = new Type[] {
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
	
}
