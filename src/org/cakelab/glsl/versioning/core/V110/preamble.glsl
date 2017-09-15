#define __VERSION__ 110
#define GL_core_profile 1


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////




// -----------------------------------------------------------------------------------
//                           Vertex Shader Built-In Attributes
// -----------------------------------------------------------------------------------
attribute vec4  gl_Color;
attribute vec4  gl_SecondaryColor;
attribute vec3  gl_Normal;
attribute vec4  gl_Vertex;
attribute vec4  gl_MultiTexCoord0;
attribute vec4  gl_MultiTexCoord1;
attribute vec4  gl_MultiTexCoord2;
attribute vec4  gl_MultiTexCoord3;
attribute vec4  gl_MultiTexCoord4;
attribute vec4  gl_MultiTexCoord5;
attribute vec4  gl_MultiTexCoord6;
attribute vec4  gl_MultiTexCoord7;
attribute float gl_FogCoord;

// -----------------------------------------------------------------------------------
//                            Built-In Constants
// -----------------------------------------------------------------------------------
//
// Implementation dependent constants.  The example values below
// are the minimum values allowed for these maximums.
//
const int  gl_MaxLights = 8;                    // GL 1.0
const int  gl_MaxClipPlanes = 6;                // GL 1.0
const int  gl_MaxTextureUnits = 2;              // GL 1.3
const int  gl_MaxTextureCoords = 2;             // ARB_fragment_program
const int  gl_MaxVertexAttribs = 16;            // ARB_vertex_shader
const int  gl_MaxVertexUniformComponents = 512; // ARB_vertex_shader
const int  gl_MaxVaryingFloats = 32;            // ARB_vertex_shader
const int  gl_MaxVertexTextureImageUnits = 0;   // ARB_vertex_shader
const int  gl_MaxCombinedTextureImageUnits = 2; // ARB_vertex_shader
const int  gl_MaxTextureImageUnits = 2;         // ARB_fragment_shader
const int  gl_MaxFragmentUniformComponents = 64;// ARB_fragment_shader
const int  gl_MaxDrawBuffers = 1;               // proposed ARB_draw_buffers


// -----------------------------------------------------------------------------------
//                           Vertex Shader Special Variables
// -----------------------------------------------------------------------------------
vec4  gl_Position;
float gl_PointSize;
vec4  gl_ClipVertex;

// -----------------------------------------------------------------------------------
//                           Fragment Shader Special Variables
// -----------------------------------------------------------------------------------
vec4  gl_FragCoord;
bool  gl_FrontFacing;
vec4  gl_FragColor;
vec4  gl_FragData[gl_MaxDrawBuffers];
float gl_FragDepth;

// -----------------------------------------------------------------------------------
//                           Built-In Uniform State
// -----------------------------------------------------------------------------------
//
// Matrix state. p. 31, 32, 37, 39, 40.
//
uniform mat4  gl_ModelViewMatrix;
uniform mat4  gl_ProjectionMatrix;
uniform mat4  gl_ModelViewProjectionMatrix;
uniform mat4  gl_TextureMatrix[gl_MaxTextureCoords];
//
// Derived matrix state that provides inverse and transposed versions
// of the matrices above.  Poorly conditioned matrices may result
// in unpredictable values in their inverse forms.
//
uniform mat3  gl_NormalMatrix; // transpose of the inverse of the
// upper leftmost 3x3 of gl_ModelViewMatrix
uniform mat4  gl_ModelViewMatrixInverse;
uniform mat4  gl_ProjectionMatrixInverse;
uniform mat4  gl_ModelViewProjectionMatrixInverse;
uniform mat4  gl_TextureMatrixInverse[gl_MaxTextureCoords];
uniform mat4  gl_ModelViewMatrixTranspose;
uniform mat4  gl_ProjectionMatrixTranspose;
uniform mat4  gl_ModelViewProjectionMatrixTranspose;
uniform mat4  gl_TextureMatrixTranspose[gl_MaxTextureCoords];
uniform mat4  gl_ModelViewMatrixInverseTranspose;
uniform mat4  gl_ProjectionMatrixInverseTranspose;
uniform mat4  gl_ModelViewProjectionMatrixInverseTranspose;
uniform mat4  gl_TextureMatrixInverseTranspose[gl_MaxTextureCoords];
//
// Normal scaling p. 39.
//
uniform float gl_NormalScale;
//// Depth range in window coordinates, p. 33
//
struct gl_DepthRangeParameters {
	float near;        // n
	float far;         // f
	float diff;       //f-n
};
uniform gl_DepthRangeParameters gl_DepthRange;
//
// Clip planes p. 42.
//
uniform vec4  gl_ClipPlane[gl_MaxClipPlanes];
//
// Point Size, p. 66, 67.
//
struct gl_PointParameters {
	float size;
	float sizeMin;
	float sizeMax;
	float fadeThresholdSize;
	float distanceConstantAttenuation;
	float distanceLinearAttenuation;
	float distanceQuadraticAttenuation;
};
uniform gl_PointParameters gl_Point;
//
// Material State p. 50, 55.
//
struct gl_MaterialParameters {
	vec4  emission;    // Ecm
	vec4  ambient;     // Acm
	vec4  diffuse;     // Dcm
	vec4  specular;    // Scm
	float shininess;   // Srm
};
uniform gl_MaterialParameters  gl_FrontMaterial;
uniform gl_MaterialParameters  gl_BackMaterial;
//
// Light State p 50, 53, 55.
//
struct gl_LightSourceParameters {
	vec4  ambient;             // Acli
	vec4  diffuse;             // Dcli
	vec4  specular;            // Scli
	vec4  position;            // Ppli
	vec4  halfVector;          // Derived: Hi
	vec3  spotDirection;       // Sdli
	float spotExponent;        // Srli
	float spotCutoff;          // Crli
	// (range: [0.0,90.0], 180.0)
	float spotCosCutoff;       // Derived: cos(Crli)
	// (range: [1.0,0.0],-1.0)
	float constantAttenuation; // K0
	float linearAttenuation;   // K1
	float quadraticAttenuation;// K2
};
uniform gl_LightSourceParameters  gl_LightSource[gl_MaxLights];
	struct gl_LightModelParameters {
	vec4  ambient;       // Acs
};
uniform gl_LightModelParameters  gl_LightModel;
//
// Derived state from products of light and material.
//
struct gl_LightModelProducts {
	vec4  sceneColor;     // Derived. Ecm + Acm * Acs
};
uniform gl_LightModelProducts gl_FrontLightModelProduct;
uniform gl_LightModelProducts gl_BackLightModelProduct;
struct gl_LightProducts {
	vec4  ambient;        // Acm * Acli
	vec4  diffuse;        // Dcm * Dcli
	vec4  specular;       // Scm * Scli
};
uniform gl_LightProducts gl_FrontLightProduct[gl_MaxLights];
uniform gl_LightProducts gl_BackLightProduct[gl_MaxLights];
//
// Texture Environment and Generation, p. 152, p. 40-42.
//
uniform vec4  gl_TextureEnvColor[gl_MaxTextureImageUnits];
uniform vec4  gl_EyePlaneS[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneT[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneR[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneQ[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneS[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneT[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneR[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneQ[gl_MaxTextureCoords];
//
// Fog p. 161
//
struct gl_FogParameters {
	vec4 color;
	float density;
	float start;
	float end;
	float scale;   // Derived:   1.0 / (end - start)
};
uniform gl_FogParameters gl_Fog;

// -----------------------------------------------------------------------------------
//                           Varying Variables
// -----------------------------------------------------------------------------------

varying vec4  gl_FrontColor;
varying vec4  gl_BackColor;
varying vec4  gl_FrontSecondaryColor;
varying vec4  gl_BackSecondaryColor;
varying vec4  gl_TexCoord[];  // at most will be gl_MaxTextureCoords
varying float gl_FogFragCoord;

varying vec4  gl_Color;
varying vec4  gl_SecondaryColor;
varying vec4  gl_TexCoord[];  // at most will be gl_MaxTextureCoords
varying float gl_FogFragCoord;





/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// -----------------------------------------------------------------------------------
//                           Angle and Trigonometry Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(genType) \
genType radians(genType degrees);\
genType degrees(genType radians);\
genType sin(genType angle);\
genType cos(genType angle);\
genType tan(genType angle);\
genType asin(genType x);\
genType acos(genType x);\
genType atan(genType y, genType x);\
genType atan(genType y_over_x);

// genType is float, vec2, vec3, or vec4.
GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET

// -----------------------------------------------------------------------------------
//                           Exponential Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(genType) \
genType pow (genType x, genType y);\
genType exp (genType x);\
genType log(genType x);\
genType exp2(genType x);\
genType log2(genType x);\
genType sqrt(genType x);\
genType inversesqrt(genType x);

GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET


// -----------------------------------------------------------------------------------
//                           Common Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(genType) \
genType abs(genType x);\
genType sign(genType x);\
genType floor(genType x);\
genType ceil(genType x);\
genType fract(genType x);\
genType mod(genType x, genType y);\
genType min(genType x, genType y);\
genType max(genType x, genType y);\
genType clamp(genType x, genType minVal, genType maxVal);\
genType mix(genType x, genType y, genType a);\
genType step(genType edge, genType x);\
genType smoothstep(genType edge0, genType edge1, genType x);

#define GENERIC_FUNCTION_SET_FLOAT(genType) \
genType mod(genType x, float y);\
genType min(genType x, float y);\
genType max(genType x, float y);\
genType clamp(genType x, float minVal, float maxVal);\
genType mix(genType x, genType y, float a);\
genType step(float edge, genType x);\
genType smoothstep(float edge0, float edge1, genType x);

GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET_FLOAT(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET_FLOAT(vec3)
GENERIC_FUNCTION_SET(vec4)
GENERIC_FUNCTION_SET_FLOAT(vec4)

#undef GENERIC_FUNCTION_SET_FLOAT
#undef GENERIC_FUNCTION_SET



// -----------------------------------------------------------------------------------
//                           Common Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(genType) \
float length(genType x);\
float distance(genType p0, genType p1);\
float dot(genType x, genType y);\
genType normalize(genType x);\
genType faceforward(genType N, genType I, genType Nref);\
genType reflect(genType I, genType N);\
genType refract(genType I, genType N, float eta);


// non generic functions
vec3 cross (vec3 x, vec3 y);
vec4 ftransform();

GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET



// -----------------------------------------------------------------------------------
//                           Matrix Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(mat) \
mat matrixCompMult(mat x, mat y);

GENERIC_FUNCTION_SET(mat2)
GENERIC_FUNCTION_SET(mat3)
GENERIC_FUNCTION_SET(mat4)

#undef GENERIC_FUNCTION_SET



// -----------------------------------------------------------------------------------
//                           Vector Relational Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(bvec, vec) \
bvec lessThan(vec x, vec y);\
bvec lessThanEqual(vec x, vec y);\
bvec greaterThan(vec x, vec y);\
bvec greaterThanEqual(vec x, vec y);\
bvec equal(vec x, vec y);\
bvec notEqual(vec x, vec y);\
bool any(bvec x);\
bool all(bvec x);\
bvec not(bvec x);

GENERIC_FUNCTION_SET(bvec2, vec2)
GENERIC_FUNCTION_SET(bvec3, vec3)
GENERIC_FUNCTION_SET(bvec4, vec4)

GENERIC_FUNCTION_SET(bvec2, ivec2)
GENERIC_FUNCTION_SET(bvec3, ivec3)
GENERIC_FUNCTION_SET(bvec4, ivec4)

#undef GENERIC_FUNCTION_SET




// -----------------------------------------------------------------------------------
//                           Texture Lookup Functions
// -----------------------------------------------------------------------------------
vec4 texture1D(sampler1D sampler, float coord);
vec4 texture1D(sampler1D sampler, float coord, float bias);
vec4 texture1DProj (sampler1D sampler, vec2 coord);
vec4 texture1DProj (sampler1D sampler, vec2 coord, float bias);
vec4 texture1DProj (sampler1D sampler, vec4 coord);
vec4 texture1DProj (sampler1D sampler, vec4 coord, float bias);
vec4 texture1DLod (sampler1D sampler, float coord, float lod);
vec4 texture1DProjLod (sampler1D sampler, vec2 coord, float lod);
vec4 texture1DProjLod (sampler1D sampler, vec4 coord, float lod);

vec4 texture2D(sampler2D sampler, vec2 coord);
vec4 texture2D(sampler2D sampler, vec2 coord, float bias);
vec4 texture2DProj (sampler2D sampler, vec3 coord);
vec4 texture2DProj (sampler2D sampler, vec3 coord, float bias);
vec4 texture2DProj (sampler2D sampler, vec4 coord);
vec4 texture2DProj (sampler2D sampler, vec4 coord, float bias);
vec4 texture2DLod (sampler2D sampler, vec2 coord, float lod);
vec4 texture2DProjLod (sampler2D sampler, vec3 coord, float lod);
vec4 texture2DProjLod (sampler2D sampler, vec4 coord, float lod);

vec4 texture3D(sampler3D sampler, vec3 coord);
vec4 texture3D(sampler3D sampler, vec3 coord, float bias);
vec4 texture3DProj (sampler3D sampler, vec4 coord);
vec4 texture3DProj (sampler3D sampler, vec4 coord, float bias);
vec4 texture3DLod (sampler3D sampler, vec3 coord, float lod);
vec4 texture3DProjLod (sampler3D sampler, vec4 coord, float lod);

vec4 textureCube(samplerCube sampler, vec3 coord);
vec4 textureCube(samplerCube sampler, vec3 coord, float bias);
vec4 textureCubeLod(samplerCube sampler, vec3 coord, float lod);

vec4 shadow1D(sampler1DShadow sampler, vec3 coord);
vec4 shadow1D(sampler1DShadow sampler, vec3 coord, float bias);
vec4 shadow2D(sampler2DShadow sampler, vec3 coord);
vec4 shadow2D(sampler2DShadow sampler, vec3 coord, float bias);
vec4 shadow1DProj(sampler1DShadow sampler, vec4 coord);
vec4 shadow1DProj(sampler1DShadow sampler, vec4 coord, float bias);
vec4 shadow2DProj(sampler2DShadow sampler, vec4 coord);
vec4 shadow2DProj(sampler2DShadow sampler, vec4 coord, float bias);
vec4 shadow1DLod(sampler1DShadow sampler, vec3 coord, float lod);
vec4 shadow2DLod(sampler2DShadow sampler, vec3 coord, float lod);
vec4 shadow1DProjLod(sampler1DShadow sampler, vec4 coord, float lod);
vec4 shadow2DProjLod(sampler2DShadow sampler, vec4 coord, float lod);


// -----------------------------------------------------------------------------------
//                           Vector Relational Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(genType) \
genType dFdx (genType p);\
genType dFdy (genType p);\
genType fwidth (genType p);

// genType is float, vec2, vec3, or vec4.
GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)




#undef GENERIC_FUNCTION_SET










