/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                            Open GL Shading Language 
//                                    V 1.40
//                                 Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define __VERSION__ 140
#define GL_core_profile 1

//
// The following special macros are available only when parsing the preamble
//
#if !defined(VERTEX_SHADER) &&  !defined(FRAGMENT_SHADER) && !defined(GENERIC_SHADER)
#error undefined shader type!
#endif
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                           4.5.4 Available Precision Qualifiers
// -----------------------------------------------------------------------------------
#if defined(VERTEX_SHADER) || defined(FRAGMENT_SHADER)
#define GL_FRAGMENT_PRECISION_HIGH 1
#endif

// -----------------------------------------------------------------------------------
//                           7.4 Built-In Constants
// -----------------------------------------------------------------------------------
//
// Implementation dependent constants.  The example values below
// are the minimum values allowed for these maximums.
//
const int  gl_MaxTextureUnits = 16;
const int  gl_MaxVertexAttribs = 16;
const int  gl_MaxVertexUniformComponents = 1024;
const int  gl_MaxVaryingFloats = 64;            // Deprecated
const int  gl_MaxVaryingComponents = 64;
const int  gl_MaxVertexTextureImageUnits = 16;
const int  gl_MaxCombinedTextureImageUnits = 16;
const int  gl_MaxTextureImageUnits = 16;
const int  gl_MaxFragmentUniformComponents = 1024;
const int  gl_MaxDrawBuffers = 8;
const int  gl_MaxClipDistances = 8;




// -----------------------------------------------------------------------------------
//                           7.1 Vertex Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
out vec4  gl_Position;
out float gl_PointSize;
in  int   gl_VertexID;
out float gl_ClipDistance[];
#endif

// -----------------------------------------------------------------------------------
//                           7.2 Fragment Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER
in  vec4  gl_FragCoord;
in  bool  gl_FrontFacing;
in  float gl_ClipDistance[];
out vec4  gl_FragColor;
out vec4  gl_FragData[gl_MaxDrawBuffers];
out float gl_FragDepth;
#endif

// -----------------------------------------------------------------------------------
//                           7.5 Built-In Uniform State
// -----------------------------------------------------------------------------------
//
// Depth range in window coordinates, section 2.12.1 
//
struct gl_DepthRangeParameters
{
    float near;        // n
    float far;         // f
    float diff;        // f - n
};
uniform gl_DepthRangeParameters gl_DepthRange;

// -----------------------------------------------------------------------------------
//                           7.6 Built-In Vertex Output and Fragment Input Variables
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER
in vec2  gl_PointCoord;
#endif



/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                           8.1 Angle and Trigonometry Functions
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
genType atan(genType y_over_x);\
genType sinh(genType angle);\
genType cosh(genType angle);\
genType tanh(genType angle);\
genType asinh(genType x);\
genType acosh(genType x);\
genType atanh(genType y, genType x);

// genType is float, vec2, vec3, or vec4.
GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET

// -----------------------------------------------------------------------------------
//                           8.2 Exponential Functions
// -----------------------------------------------------------------------------------

#define GENERIC_FUNCTION_SET(genType) \
genType pow(genType x, genType y);\
genType exp(genType x);\
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
//                           8.3 Common Functions
// -----------------------------------------------------------------------------------
float abs(float x);
vec2 abs(vec2 x);
vec3 abs(vec3 x);
vec4 abs(vec4 x);
int abs(int x);
ivec2 abs(ivec2 x);
ivec3 abs(ivec3 x);
ivec4 abs(ivec4 x);

float sign(float x);
vec2 sign(vec2 x);
vec3 sign(vec3 x);
vec4 sign(vec4 x);
int sign(int x);
ivec2 sign(ivec2 x);
ivec3 sign(ivec3 x);
ivec4 sign(ivec4 x);

float floor(float x);
vec2 floor(vec2 x);
vec3 floor(vec3 x);
vec4 floor(vec4 x);

float trunc(float x);
vec2 trunc(vec2 x);
vec3 trunc(vec3 x);
vec4 trunc(vec4 x);

float round(float x);
vec2 round(vec2 x);
vec3 round(vec3 x);
vec4 round(vec4 x);

float roundEven(float x);
vec2 roundEven(vec2 x);
vec3 roundEven(vec3 x);
vec4 roundEven(vec4 x);

float ceil(float x);
vec2 ceil(vec2 x);
vec3 ceil(vec3 x);
vec4 ceil(vec4 x);

float fract(float x);
vec2 fract(vec2 x);
vec3 fract(vec3 x);
vec4 fract(vec4 x);

float mod(float x, float y);
vec2 mod(vec2 x, float y);
vec3 mod(vec3 x, float y);
vec4 mod(vec4 x, float y);
vec2 mod(vec2 x, vec2 y);
vec3 mod(vec3 x, vec3 y);
vec4 mod(vec4 x, vec4 y);

float modf(float x, out float i);
vec2 modf(vec2 x, out vec2 i);
vec3 modf(vec3 x, out vec3 i);
vec4 modf(vec4 x, out vec4 i);

float min(float x, float y);
vec2 min(vec2 x, vec2 y);
vec3 min(vec3 x, vec3 y);
vec4 min(vec4 x, vec4 y);
vec2 min(vec2 x, float y);
vec3 min(vec3 x, float y);
vec4 min(vec4 x, float y);
int min(int x, int y);
ivec2 min(ivec2 x, ivec2 y);
ivec3 min(ivec3 x, ivec3 y);
ivec4 min(ivec4 x, ivec4 y);
ivec2 min(ivec2 x, int y);
ivec3 min(ivec3 x, int y);
ivec4 min(ivec4 x, int y);
uint min(uint x, uint y);
uvec2 min(uvec2 x, uvec2 y);
uvec3 min(uvec3 x, uvec3 y);
uvec4 min(uvec4 x, uvec4 y);
uvec2 min(uvec2 x, uint y);
uvec3 min(uvec3 x, uint y);
uvec4 min(uvec4 x, uint y);

float max(float x, float y);
vec2 max(vec2 x, vec2 y);
vec3 max(vec3 x, vec3 y);
vec4 max(vec4 x, vec4 y);
vec2 max(vec2 x, float y);
vec3 max(vec3 x, float y);
vec4 max(vec4 x, float y);
int max(int x, int y);
ivec2 max(ivec2 x, ivec2 y);
ivec3 max(ivec3 x, ivec3 y);
ivec4 max(ivec4 x, ivec4 y);
ivec2 max(ivec2 x, int y);
ivec3 max(ivec3 x, int y);
ivec4 max(ivec4 x, int y);
uint max(uint x, uint y);
uvec2 max(uvec2 x, uvec2 y);
uvec3 max(uvec3 x, uvec3 y);
uvec4 max(uvec4 x, uvec4 y);
uvec2 max(uvec2 x, uint y);
uvec3 max(uvec3 x, uint y);
uvec4 max(uvec4 x, uint y);

float clamp(float x, float minVal, float maxVal);
vec2 clamp(vec2 x, vec2 minVal, vec2 maxVal);
vec3 clamp(vec3 x, vec3 minVal, vec3 maxVal);
vec4 clamp(vec4 x, vec4 minVal, vec4 maxVal);
vec2 clamp(vec2 x, float minVal, float maxVal);
vec3 clamp(vec3 x, float minVal, float maxVal);
vec4 clamp(vec4 x, float minVal, float maxVal);
int clamp(int x, int minVal, int maxVal);
ivec2 clamp(ivec2 x, ivec2 minVal, ivec2 maxVal);
ivec3 clamp(ivec3 x, ivec3 minVal, ivec3 maxVal);
ivec4 clamp(ivec4 x, ivec4 minVal, ivec4 maxVal);
ivec2 clamp(ivec2 x, int minVal, int maxVal);
ivec3 clamp(ivec3 x, int minVal, int maxVal);
ivec4 clamp(ivec4 x, int minVal, int maxVal);
uint clamp(uint x, uint minVal, uint maxVal);
uvec2 clamp(uvec2 x, uvec2 minVal, uvec2 maxVal);
uvec3 clamp(uvec3 x, uvec3 minVal, uvec3 maxVal);
uvec4 clamp(uvec4 x, uvec4 minVal, uvec4 maxVal);
uvec2 clamp(uvec2 x, uint minVal, uint maxVal);
uvec3 clamp(uvec3 x, uint minVal, uint maxVal);
uvec4 clamp(uvec4 x, uint minVal, uint maxVal);

float mix(float x, float y, float a);
vec2 mix(vec2 x, vec2 y, vec2 a);
vec3 mix(vec3 x, vec3 y, vec3 a);
vec4 mix(vec4 x, vec4 y, vec4 a);
vec2 mix(vec2 x, vec2 y, float a);
vec3 mix(vec3 x, vec3 y, float a);
vec4 mix(vec4 x, vec4 y, float a);

float mix(float x, float y, bool a);
vec2 mix(vec2 x, vec2 y, bvec2 a);
vec3 mix(vec3 x, vec3 y, bvec3 a);
vec4 mix(vec4 x, vec4 y, bvec4 a);

float step(float edge, float x);
vec2 step(vec2 edge, vec2 x);
vec3 step(vec3 edge, vec3 x);
vec4 step(vec4 edge, vec4 x);
vec2 step(float edge, vec2 x);
vec3 step(float edge, vec3 x);
vec4 step(float edge, vec4 x);

float smoothstep(float edge0, float edge1, float x);
vec2 smoothstep(vec2 edge0, vec2 edge1, vec2 x);
vec3 smoothstep(vec3 edge0, vec3 edge1, vec3 x);
vec4 smoothstep(vec4 edge0, vec4 edge1, vec4 x);
vec2 smoothstep(float edge0, float edge1, vec2 x);
vec3 smoothstep(float edge0, float edge1, vec3 x);
vec4 smoothstep(float edge0, float edge1, vec4 x);

bool isnan (float x);
bvec2 isnan (vec2 x);
bvec3 isnan (vec3 x);
bvec4 isnan (vec4 x);

bool isinf(float x);
bvec2 isinf(vec2 x);
bvec3 isinf(vec3 x);
bvec4 isinf(vec4 x);


// -----------------------------------------------------------------------------------
//                           8.4 Geometric Functions
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

GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET


// -----------------------------------------------------------------------------------
//                           8.5 Matrix Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(mat) \
mat matrixCompMult(mat x, mat y);

GENERIC_FUNCTION_SET(mat2)
GENERIC_FUNCTION_SET(mat3)
GENERIC_FUNCTION_SET(mat4)

GENERIC_FUNCTION_SET(mat2x2)
GENERIC_FUNCTION_SET(mat2x3)
GENERIC_FUNCTION_SET(mat2x4)

GENERIC_FUNCTION_SET(mat3x2)
GENERIC_FUNCTION_SET(mat3x3)
GENERIC_FUNCTION_SET(mat3x4)

GENERIC_FUNCTION_SET(mat4x2)
GENERIC_FUNCTION_SET(mat4x3)
GENERIC_FUNCTION_SET(mat4x4)

#undef GENERIC_FUNCTION_SET


mat2   outerProduct(vec2 c, vec2 r);
mat2x3 outerProduct(vec2 c, vec3 r);
mat2x4 outerProduct(vec2 c, vec4 r);
mat3x2 outerProduct(vec3 c, vec2 r);
mat3   outerProduct(vec3 c, vec3 r);
mat3x4 outerProduct(vec3 c, vec4 r);
mat4x2 outerProduct(vec4 c, vec2 r);
mat4x3 outerProduct(vec4 c, vec3 r);
mat4   outerProduct(vec4 c, vec4 r);

mat2 transpose(mat2 m);
mat3 transpose(mat3 m);
mat4 transpose(mat4 m);
mat2x3 transpose(mat3x2 m);
mat3x2 transpose(mat2x3 m);
mat2x4 transpose(mat4x2 m);
mat4x2 transpose(mat2x4 m);
mat3x4 transpose(mat4x3 m);
mat4x3 transpose(mat3x4 m);

mat2 inverse(mat2 m);
mat3 inverse(mat3 m);
mat4 inverse(mat4 m);

// -----------------------------------------------------------------------------------
//                           8.6 Vector Relational Functions
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

GENERIC_FUNCTION_SET(bvec2, uvec2)
GENERIC_FUNCTION_SET(bvec3, uvec3)
GENERIC_FUNCTION_SET(bvec4, uvec4)

#undef GENERIC_FUNCTION_SET

// -----------------------------------------------------------------------------------
//                           8.7 Texture Lookup Functions
// -----------------------------------------------------------------------------------
//   ------  textureSize(sampler, lod)   -------
int textureSize (sampler1D sampler, int lod);
int textureSize (isampler1D sampler, int lod);
int textureSize (usampler1D sampler, int lod);

ivec2 textureSize (sampler2D sampler, int lod);
ivec2 textureSize (isampler2D sampler, int lod);
ivec2 textureSize (usampler2D sampler, int lod);

ivec3 textureSize (sampler3D sampler, int lod);
ivec3 textureSize (isampler3D sampler, int lod);
ivec3 textureSize (usampler3D sampler, int lod);

ivec2 textureSize (samplerCube sampler, int lod);
ivec2 textureSize (isamplerCube sampler, int lod);
ivec2 textureSize (usamplerCube sampler, int lod);

int textureSize (sampler1DShadow sampler, int lod);

ivec2 textureSize (sampler2DShadow sampler, int lod);

ivec2 textureSize (samplerCubeShadow sampler, int lod);

ivec2 textureSize (sampler2DRect sampler);
ivec2 textureSize (isampler2DRect sampler);
ivec2 textureSize (usampler2DRect sampler);

ivec2 textureSize (sampler2DRectShadow sampler);

ivec2 textureSize (sampler1DArray sampler, int lod);
ivec2 textureSize (isampler1DArray sampler, int lod);
ivec2 textureSize (usampler1DArray sampler, int lod);

ivec3 textureSize (sampler2DArray sampler, int lod);
ivec3 textureSize (isampler2DArray sampler, int lod);
ivec3 textureSize (usampler2DArray sampler, int lod);

ivec2 textureSize (sampler1DArrayShadow sampler, int lod);

ivec3 textureSize (sampler2DArrayShadow sampler, int lod);

int textureSize(samplerBuffer sampler);
int textureSize(isamplerBuffer sampler);
int textureSize(usamplerBuffer sampler);

//   ------  texture(sampler, p [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
RET texture(FIRST sampler, SECOND P);\
RET texture(FIRST sampler, SECOND P, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND)\

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3)

GENERIC_FUNCTION_SET(float, sampler1DShadow, vec3)
GENERIC_FUNCTION_SET(float, sampler2DShadow, vec3)
GENERIC_FUNCTION_SET(float, samplerCubeShadow, vec4)

GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3)

GENERIC_FUNCTION_SET(float, sampler1DArrayShadow, vec3)
GENERIC_FUNCTION_SET(float, sampler2DArrayShadow, vec4)

vec4 texture(sampler2DRect sampler, vec2 P);
ivec4 texture(isampler2DRect sampler, vec2 P);
uvec4 texture(usampler2DRect sampler, vec2 P);
float texture(sampler2DRectShadow sampler, vec3 P);



#undef GENERIC_FUNCTION_SET


//   ------  textureProj(sampler, p [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
RET textureProj(FIRST sampler, SECOND P);\
RET textureProj(FIRST sampler, SECOND P, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND)\

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec4)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4)

GENERIC_FUNCTION_SET(float, sampler1DShadow, vec4)
GENERIC_FUNCTION_SET(float, sampler2DShadow, vec4)

vec4 textureProj(sampler2DRect sampler, vec3 P);
ivec4 textureProj(isampler2DRect sampler, vec3 P);
uvec4 textureProj(usampler2DRect sampler, vec3 P);
vec4 textureProj(sampler2DRect sampler, vec4 P);
ivec4 textureProj(isampler2DRect sampler, vec4 P);
uvec4 textureProj(usampler2DRect sampler, vec4 P);
float textureProj(sampler2DRectShadow sampler, vec4 P);

#undef GENERIC_FUNCTION_SET_I_U
#undef GENERIC_FUNCTION_SET


//   ------  textureLod(sampler, p, lod)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
RET textureLod(FIRST sampler, SECOND P, float lod);\
i ## RET textureLod(i ## FIRST sampler, SECOND P, float lod);\
u ## RET textureLod(u ## FIRST sampler, SECOND P, float lod);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3)
float textureLod(sampler1DShadow sampler, vec3 P, float lod);
float textureLod(sampler2DShadow sampler, vec3 P, float lod);
GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3)
float textureLod(sampler1DArrayShadow sampler, vec3 P, float lod);

#undef GENERIC_FUNCTION_SET_I_U

//   ------  textureOffset(sampler, p, offset [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND, THIRD)\
RET textureOffset(FIRST sampler, SECOND P, THIRD offset);\
RET textureOffset(FIRST sampler, SECOND P, THIRD offset, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(     RET,      FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND, THIRD)\

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, ivec3)

vec4 textureOffset(sampler2DRect sampler, vec2 P, ivec2 offset);
ivec4 textureOffset(isampler2DRect sampler, vec2 P, ivec2 offset);
uvec4 textureOffset(usampler2DRect sampler, vec2 P, ivec2 offset);
float textureOffset(sampler2DRectShadow sampler, vec3 P, ivec2 offset);

GENERIC_FUNCTION_SET(float, sampler1DShadow, vec3, int)
GENERIC_FUNCTION_SET(float, sampler2DShadow, vec3, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, ivec2)
GENERIC_FUNCTION_SET(float, sampler1DArrayShadow, vec3, int)

#undef GENERIC_FUNCTION_SET_I_U
#undef GENERIC_FUNCTION_SET



//   ------  texelFetch(sampler, p, lod)   -------
#define GENERIC_FUNCTION_SET_I_U(FIRST, SECOND)\
vec4  texelFetch(     FIRST sampler, SECOND P, int lod);\
ivec4 texelFetch(i ## FIRST sampler, SECOND P, int lod);\
uvec4 texelFetch(u ## FIRST sampler, SECOND P, int lod);

GENERIC_FUNCTION_SET_I_U(sampler1D, int)
GENERIC_FUNCTION_SET_I_U(sampler2D, ivec2)
GENERIC_FUNCTION_SET_I_U(sampler3D, ivec3)

vec4 texelFetch(sampler2DRect sampler, ivec2 P);
ivec4 texelFetch(isampler2DRect sampler, ivec2 P);
uvec4 texelFetch(usampler2DRect sampler, ivec2 P);

GENERIC_FUNCTION_SET_I_U(sampler1DArray, ivec2)
GENERIC_FUNCTION_SET_I_U(sampler2DArray, ivec3)

vec4 texelFetch(samplerBuffer sampler, int P);
ivec4 texelFetch(isamplerBuffer sampler, int P);
uvec4 texelFetch(usamplerBuffer sampler, int P);


#undef GENERIC_FUNCTION_SET_I_U


//   ------  texelFetchOffset(sampler, p, lod, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(FIRST, SECOND, FORTH)\
vec4  texelFetch(     FIRST sampler, SECOND P, int lod, FORTH offset);\
ivec4 texelFetch(i ## FIRST sampler, SECOND P, int lod, FORTH offset);\
uvec4 texelFetch(u ## FIRST sampler, SECOND P, int lod, FORTH offset);

GENERIC_FUNCTION_SET_I_U(sampler1D, int, int)
GENERIC_FUNCTION_SET_I_U(sampler2D, ivec2, ivec2)
GENERIC_FUNCTION_SET_I_U(sampler3D, ivec3, ivec3)

vec4 texelFetchOffset(sampler2DRect sampler, ivec2 P, ivec2 offset);
ivec4 texelFetchOffset(isampler2DRect sampler, ivec2 P, ivec2 offset);
uvec4 texelFetchOffset(usampler2DRect sampler, ivec2 P, ivec2 offset);

GENERIC_FUNCTION_SET_I_U(sampler1DArray, ivec2, int)
GENERIC_FUNCTION_SET_I_U(sampler2DArray, ivec3, ivec2)


#undef GENERIC_FUNCTION_SET_I_U



//   ------  textureProjOffset(sampler, p, offset [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND, THIRD)\
RET textureProjOffset(FIRST sampler, SECOND P, THIRD offset);\
RET textureProjOffset(FIRST sampler, SECOND P, THIRD offset, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(     RET,      FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND, THIRD)

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec2, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec4, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, ivec3)

vec4 textureProjOffset (sampler2DRect sampler, vec3 P, ivec2 offset);
ivec4 textureProjOffset (isampler2DRect sampler, vec3 P, ivec2 offset);
uvec4 textureProjOffset (usampler2DRect sampler, vec3 P, ivec2 offset);

vec4 textureProjOffset (sampler2DRect sampler, vec4 P, ivec2 offset);
ivec4 textureProjOffset (isampler2DRect sampler, vec4 P, ivec2 offset);
uvec4 textureProjOffset (usampler2DRect sampler, vec4 P, ivec2 offset);

float textureProjOffset (sampler2DRectShadow sampler, vec4 P, ivec2 offset);

GENERIC_FUNCTION_SET(float, sampler1DShadow, vec4, int)
GENERIC_FUNCTION_SET(float, sampler2DShadow, vec4, ivec2)

#undef GENERIC_FUNCTION_SET_I_U
#undef GENERIC_FUNCTION_SET


//   ------  textureLodOffset(sampler, p, lod, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, FORTH)\
     RET textureLodOffset(     FIRST sampler, SECOND P, float lod, FORTH offset);\
i ## RET textureLodOffset(i ## FIRST sampler, SECOND P, float lod, FORTH offset);\
u ## RET textureLodOffset(u ## FIRST sampler, SECOND P, float lod, FORTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, ivec3)
float textureLodOffset(sampler1DShadow sampler, vec3 P, float lod, int offset);
float textureLodOffset(sampler2DShadow sampler, vec3 P, float lod, ivec2 offset);
GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, ivec2)
float textureLodOffset(sampler1DArrayShadow sampler, vec3 P, float lod, int offset);

#undef GENERIC_FUNCTION_SET_I_U


//   ------  textureProjLod(sampler, p, lod)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
     RET textureProjLod(     FIRST sampler, SECOND P, float lod);\
i ## RET textureProjLod(i ## FIRST sampler, SECOND P, float lod);\
u ## RET textureProjLod(u ## FIRST sampler, SECOND P, float lod);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec4)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4)
float textureProjLod (sampler1DShadow sampler, vec4 P, float lod);
float textureProjLod (sampler2DShadow sampler, vec4 P, float lod);

#undef GENERIC_FUNCTION_SET_I_U

//   ------  textureProjLodOffset(sampler, p, lod, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, FORTH)\
     RET textureProjLodOffset(     FIRST sampler, SECOND P, float lod, FORTH offset);\
i ## RET textureProjLodOffset(i ## FIRST sampler, SECOND P, float lod, FORTH offset);\
u ## RET textureProjLodOffset(u ## FIRST sampler, SECOND P, float lod, FORTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec2, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec4, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, ivec3)
float textureProjLodOffset (sampler1DShadow sampler, vec4 P, float lod, int offset);
float textureProjLodOffset (sampler2DShadow sampler, vec4 P, float lod, ivec2 offset);

#undef GENERIC_FUNCTION_SET_I_U



//   ------  textureGrad(sampler, P, dPdx, dPdy)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
     RET textureGrad(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
i ## RET textureGrad(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
u ## RET textureGrad(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DRect, vec2, vec2)

float textureGrad (sampler2DRectShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy);
float textureGrad (sampler1DShadow sampler, vec3 P, float dPdx, float dPdy);
float textureGrad (sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy);
float textureGrad (samplerCubeShadow sampler, vec4 P, vec3 dPdx, vec3 dPdy);
GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, vec2)
float textureGrad (sampler1DArrayShadow sampler, vec3 P, float dPdx, float dPdy);
float textureGrad (sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy);

#undef GENERIC_FUNCTION_SET_I_U


//   ------  textureGradOffset(sampler, P, dPdx, dPdy, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD, FIFTH)\
     RET textureGradOffset(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
i ## RET textureGradOffset(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
u ## RET textureGradOffset(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float, float, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, vec3, ivec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DRect, vec2, vec2, ivec2)
float textureGradOffset (sampler2DRectShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
float textureGradOffset (sampler1DShadow sampler, vec3 P, float dPdx, float dPdy, int offset);
float textureGradOffset (sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2, float, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, vec2, ivec2)
float textureGrad (sampler1DArrayShadow sampler, vec3 P, float dPdx, float dPdy, int);
float textureGrad (sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2);

#undef GENERIC_FUNCTION_SET_I_U

//   ------  textureProjGrad(sampler, P, dPdx, dPdy)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
     RET textureProjGrad(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
i ## RET textureProjGrad(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
u ## RET textureProjGrad(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec2, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec4, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DRect, vec3, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DRect, vec4, vec2)
float textureProjGrad (sampler2DRectShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy);
float textureProjGrad (sampler1DShadow sampler, vec4 P, float dPdx, float dPdy);
float textureProjGrad (sampler2DShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy);

#undef GENERIC_FUNCTION_SET_I_U

//   ------  textureProjGradOffset(sampler, P, dPdx, dPdy, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD, FIFTH)\
     RET textureProjGradOffset(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
i ## RET textureProjGradOffset(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
u ## RET textureProjGradOffset(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec2, float, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, vec4, float, int)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, vec2, ivec2)
vec4  textureProjGradOffset( sampler2DRect sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
ivec4 textureProjGradOffset(isampler2DRect sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
uvec4 textureProjGradOffset(usampler2DRect sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
vec4  textureProjGradOffset( sampler2DRect sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
ivec4 textureProjGradOffset(isampler2DRect sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
uvec4 textureProjGradOffset(usampler2DRect sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
float textureProjGradOffset(sampler2DRectShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, vec3, ivec3)

float textureProjGradOffset (sampler1DShadow sampler, vec4 P, float dPdx, float dPdy, int offset);
float textureProjGradOffset (sampler2DShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset);

#undef GENERIC_FUNCTION_SET_I_U

//
// All deprecated texture lookup functions
// 
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
//                           8.6 Fragment Processing Functions
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER

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

#endif


// -----------------------------------------------------------------------------------
//                           8.9 Noise Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(genType) \
float noise1(genType x);\
vec2 noise2(genType x);\
vec3 noise3(genType x);\
vec4 noise4(genType x);

// genType is float, vec2, vec3, or vec4.
GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)


#undef GENERIC_FUNCTION_SET

