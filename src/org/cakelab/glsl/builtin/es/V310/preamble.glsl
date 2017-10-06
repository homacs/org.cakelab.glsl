/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL ES 3.1
//                            Open GL Shading Language 
//                                    V 3.10
//                                  ES Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////





#define __VERSION__ 310
#define GL_core_profile 1


//
// The following special macros are available only when parsing the preamble
//
#if !defined(VERTEX_SHADER)          \
 && !defined(FRAGMENT_SHADER)        \
 && !defined(COMPUTE_SHADER)         \
 && !defined(GENERIC_SHADER)
// and this error message is just a reminder when developing preambles
#error undefined or unsupported shader type!
#endif

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                            7.2 Built-In Constants
// -----------------------------------------------------------------------------------

//
// Implementation dependent constants.  The example values below
// are the minimum values allowed for these maximums.
//
const mediump int  gl_MaxVertexAttribs = 16;
const mediump int  gl_MaxVertexUniformVectors = 256;
const mediump int  gl_MaxVertexOutputVectors = 16;
const mediump int  gl_MaxFragmentInputVectors = 15;
const mediump int  gl_MaxFragmentUniformVectors = 224;
const mediump int  gl_MaxDrawBuffers = 4;
const mediump int  gl_MaxVertexTextureImageUnits = 16;
const mediump int  gl_MaxCombinedTextureImageUnits = 48;
const mediump int  gl_MaxTextureImageUnits = 16;

const mediump int  gl_MinProgramTexelOffset = -8;
const mediump int  gl_MaxProgramTexelOffset = 7;
const mediump int gl_MaxImageUnits = 4;
const mediump int gl_MaxVertexImageUniforms = 0;
const mediump int gl_MaxFragmentImageUniforms = 0;
const mediump int gl_MaxComputeImageUniforms = 4;
const mediump int gl_MaxCombinedImageUniforms = 4;
const mediump int gl_MaxCombinedShaderOutputResources = 4;
const highp ivec3 gl_MaxComputeWorkGroupCount = ivec3(65535, 65535, 65535);
const highp ivec3 gl_MaxComputeWorkGroupSize = ivec3(128, 128, 64);
const mediump int gl_MaxComputeUniformComponents = 512;
const mediump int gl_MaxComputeTextureImageUnits = 16;
const mediump int gl_MaxComputeAtomicCounters = 8;
const mediump int gl_MaxComputeAtomicCounterBuffers = 1;
const mediump int gl_MaxVertexAtomicCounters = 0;
const mediump int gl_MaxFragmentAtomicCounters = 0;
const mediump int gl_MaxCombinedAtomicCounters = 8;
const mediump int gl_MaxAtomicCounterBindings = 1;
const mediump int gl_MaxFragmentAtomicCounterBuffers = 0;
const mediump int gl_MaxVertexAtomicCounterBuffers = 0;
const mediump int gl_MaxCombinedAtomicCounterBuffers = 1;
const mediump int gl_MaxAtomicCounterBufferSize = 32;

// -----------------------------------------------------------------------------------
//                           7.1.1 Vertex Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER

in highp int gl_VertexID;
in highp int gl_InstanceID;
out highp vec4  gl_Position;
out highp float gl_PointSize;

#endif // VERTEX_SHADER





// -----------------------------------------------------------------------------------
//                           7.1.2 Fragment Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER
in  highp   vec4    gl_FragCoord;
in  bool            gl_FrontFacing;
out highp   float   gl_FragDepth;
in  mediump vec2    gl_PointCoord;
in          bool    gl_HelperInvocation;

#endif // FRAGMENT_SHADER



// -----------------------------------------------------------------------------------
//                           7.1.3 Compute Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef COMPUTE_SHADER
// work group dimensions
in    uvec3 gl_NumWorkGroups;
const uvec3 gl_WorkGroupSize;
// work group and invocation IDs
in    uvec3 gl_WorkGroupID;
in    uvec3 gl_LocalInvocationID;
// derived variables
in    uvec3 gl_GlobalInvocationID;
in    uint  gl_LocalInvocationIndex;
#endif // FRAGMENT_SHADER


// -----------------------------------------------------------------------------------
//                             7.3 Built-In Uniform State
// -----------------------------------------------------------------------------------

struct gl_DepthRangeParameters
{
    highp float near;        // n
    highp float far;         // f
    highp float diff;        // f - n
};
uniform gl_DepthRangeParameters gl_DepthRange;




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
int mix(int x, int y, bool a);
ivec2 mix(ivec2 x, ivec2 y, bvec2 a);
ivec3 mix(ivec3 x, ivec3 y, bvec3 a);
ivec4 mix(ivec4 x, ivec4 y, bvec4 a);
uint mix(uint x, uint y, bool a);
uvec2 mix(uvec2 x, uvec2 y, bvec2 a);
uvec3 mix(uvec3 x, uvec3 y, bvec3 a);
uvec4 mix(uvec4 x, uvec4 y, bvec4 a);
bool mix(bool x, bool y, bool a);
bvec2 mix(bvec2 x, bvec2 y, bvec2 a);
bvec3 mix(bvec3 x, bvec3 y, bvec3 a);
bvec4 mix(bvec4 x, bvec4 y, bvec4 a);

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


int floatBitsToInt (float value);
ivec2 floatBitsToInt (vec2 value);
ivec3 floatBitsToInt (vec3 value);
ivec4 floatBitsToInt (vec4 value);
uint floatBitsToUint (float value);
uvec2 floatBitsToUint (vec2 value);
uvec3 floatBitsToUint (vec3 value);
uvec4 floatBitsToUint (vec4 value);


float intBitsToFloat(int value);
vec2 intBitsToFloat(ivec2 value);
vec3 intBitsToFloat(ivec3 value);
vec4 intBitsToFloat(ivec4 value);
float uintBitsToFloat(uint value);
vec2 uintBitsToFloat(uvec2 value);
vec3 uintBitsToFloat(uvec3 value);
vec4 uintBitsToFloat(uvec4 value);

highp float frexp(highp float x, out highp int exp);
highp vec2 frexp(highp vec2 x, out highp ivec2 exp);
highp vec3 frexp(highp vec3 x, out highp ivec3 exp);
highp vec4 frexp(highp vec4 x, out highp ivec4 exp);

highp float ldexp(highp float x, in highp int exp);
highp vec2 ldexp(highp vec2 x, in highp ivec2 exp);
highp vec3 ldexp(highp vec3 x, in highp ivec3 exp);
highp vec4 ldexp(highp vec4 x, in highp ivec4 exp);

// -----------------------------------------------------------------------------------
//                           8.4 Floating-Point Pack and Unpack Functions
// -----------------------------------------------------------------------------------

highp   uint packSnorm2x16   (vec2 v);
highp   vec2 unpackSnorm2x16 (highp uint p);

highp   uint packUnorm2x16   (vec2 v);
highp   vec2 unpackUnorm2x16 (highp uint p);

highp   uint packHalf2x16    (mediump vec2 v);
mediump vec2 unpackHalf2x16  (highp uint v);

highp   uint packUnorm4x8    (mediump vec4 v);
mediump vec4 unpackUnorm4x8  (highp uint v);
highp   uint packSnorm4x8    (mediump vec4 v);
mediump vec4 unpackSnorm4x8  (highp uint v);

// -----------------------------------------------------------------------------------
//                           8.5 Geometric Functions
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
//                           8.6 Matrix Functions
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

float determinant(mat2 m);
float determinant(mat3 m);
float determinant(mat4 m);

mat2 inverse(mat2 m);
mat3 inverse(mat3 m);
mat4 inverse(mat4 m);



// -----------------------------------------------------------------------------------
//                           8.7 Vector Relational Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(bvec, vec) \
bvec lessThan(vec x, vec y);\
bvec lessThanEqual(vec x, vec y);\
bvec greaterThan(vec x, vec y);\
bvec greaterThanEqual(vec x, vec y);\
bvec equal(vec x, vec y);\
bvec notEqual(vec x, vec y);

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

#define GENERIC_FUNCTION_SET(bvec) \
bvec equal(bvec x, bvec y);\
bvec notEqual(bvec x, bvec y);\
bool any(bvec x);\
bool all(bvec x);\
bvec not(bvec x);

GENERIC_FUNCTION_SET(bvec2)
GENERIC_FUNCTION_SET(bvec3)
GENERIC_FUNCTION_SET(bvec4)


#undef GENERIC_FUNCTION_SET


// -----------------------------------------------------------------------------------
//                           8.8 Integer Functions
// -----------------------------------------------------------------------------------

#define GENERIC_FUNCTION_SET(PREFIX, TYPE) \
TYPE bitfieldExtract (TYPE value, int offset, int bits);\
TYPE bitfieldInsert (TYPE base, TYPE insert, int offset, int bits);\
highp TYPE bitfieldReverse (TYPE value);\
lowp TYPE bitCount (TYPE value);\
lowp TYPE findLSB (TYPE value);\
lowp TYPE findMSB (highp TYPE value);\
void PREFIX ## mulExtended (highp TYPE x, highp TYPE y, out highp TYPE msb, out highp TYPE lsb);

GENERIC_FUNCTION_SET(i, int)
GENERIC_FUNCTION_SET(i, ivec2)
GENERIC_FUNCTION_SET(i, ivec3)
GENERIC_FUNCTION_SET(i, ivec4)
GENERIC_FUNCTION_SET(u, uint)
GENERIC_FUNCTION_SET(u, uvec2)
GENERIC_FUNCTION_SET(u, uvec3)
GENERIC_FUNCTION_SET(u, uvec4)



#undef GENERIC_FUNCTION_SET


#define GENERIC_FUNCTION_SET_U(genUType) \
highp genUType uaddCarry  (highp genUType x, highp genUType y, out lowp genUType carry); \
highp genUType usubBorrow (highp genUType x, highp genUType y, out lowp genUType borrow);

GENERIC_FUNCTION_SET_U(uint)
GENERIC_FUNCTION_SET_U(uvec2)
GENERIC_FUNCTION_SET_U(uvec3)
GENERIC_FUNCTION_SET_U(uvec4)

#undef GENERIC_FUNCTION_SET_U



// -----------------------------------------------------------------------------------
//                           8.9.1 Texture Query Functions
// -----------------------------------------------------------------------------------
//   ------  textureSize(sampler, lod)   -------
highp ivec2 textureSize (sampler2D sampler, int lod);
highp ivec2 textureSize (isampler2D sampler, int lod);
highp ivec2 textureSize (usampler2D sampler, int lod);

highp ivec3 textureSize (sampler3D sampler, int lod);
highp ivec3 textureSize (isampler3D sampler, int lod);
highp ivec3 textureSize (usampler3D sampler, int lod);

highp ivec2 textureSize (samplerCube sampler, int lod);
highp ivec2 textureSize (isamplerCube sampler, int lod);
highp ivec2 textureSize (usamplerCube sampler, int lod);

highp ivec2 textureSize (sampler2DMS sampler, int lod);
highp ivec2 textureSize (isampler2DMS sampler, int lod);
highp ivec2 textureSize (usampler2DMS sampler, int lod);

highp ivec2 textureSize (sampler2DShadow sampler, int lod);

highp ivec2 textureSize (samplerCubeShadow sampler, int lod);

highp ivec3 textureSize (sampler2DArray sampler, int lod);
highp ivec3 textureSize (isampler2DArray sampler, int lod);
highp ivec3 textureSize (usampler2DArray sampler, int lod);

highp ivec3 textureSize (sampler2DArrayShadow sampler, int lod);




// -----------------------------------------------------------------------------------
//                           8.9.2 Texel Lookup Functions
// -----------------------------------------------------------------------------------

//   ------  texture(sampler, p [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
RET texture(FIRST sampler, SECOND P);\
RET texture(FIRST sampler, SECOND P, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND)

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3)

GENERIC_FUNCTION_SET(float, sampler2DShadow, vec3)
GENERIC_FUNCTION_SET(float, samplerCubeShadow, vec4)

float texture(sampler2DArrayShadow sampler, vec4 P);

#undef GENERIC_FUNCTION_SET



//   ------  textureProj(sampler, p [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
RET textureProj(FIRST sampler, SECOND P);\
RET textureProj(FIRST sampler, SECOND P, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(RET, FIRST, SECOND)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND)\

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4)

GENERIC_FUNCTION_SET(float, sampler2DShadow, vec4)

#undef GENERIC_FUNCTION_SET_I_U
#undef GENERIC_FUNCTION_SET



//   ------  textureLod(sampler, p, lod)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
RET textureLod(FIRST sampler, SECOND P, float lod);\
i ## RET textureLod(i ## FIRST sampler, SECOND P, float lod);\
u ## RET textureLod(u ## FIRST sampler, SECOND P, float lod);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3)
float textureLod(sampler2DShadow sampler, vec3 P, float lod);

#undef GENERIC_FUNCTION_SET_I_U


//   ------  textureOffset(sampler, p, offset [, bias])   -------
#define GENERIC_FUNCTION_SET(RET, FIRST, SECOND, THIRD)\
RET textureOffset(FIRST sampler, SECOND P, THIRD offset);\
RET textureOffset(FIRST sampler, SECOND P, THIRD offset, float bias);

#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(     RET,      FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(i ## RET, i ## FIRST, SECOND, THIRD)\
GENERIC_FUNCTION_SET(u ## RET, u ## FIRST, SECOND, THIRD)\

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, ivec3)

GENERIC_FUNCTION_SET(float, sampler2DShadow, vec3, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, ivec2)

#undef GENERIC_FUNCTION_SET_I_U
#undef GENERIC_FUNCTION_SET




//   ------  texelFetch(sampler, p, lod)   -------
#define GENERIC_FUNCTION_SET_I_U(FIRST, SECOND)\
vec4  texelFetch(     FIRST sampler, SECOND P, int lod);\
ivec4 texelFetch(i ## FIRST sampler, SECOND P, int lod);\
uvec4 texelFetch(u ## FIRST sampler, SECOND P, int lod);

GENERIC_FUNCTION_SET_I_U(sampler2D, ivec2)
GENERIC_FUNCTION_SET_I_U(sampler3D, ivec3)
GENERIC_FUNCTION_SET_I_U(sampler2DArray, ivec3)
GENERIC_FUNCTION_SET_I_U(sampler2DMS, ivec2)

#undef GENERIC_FUNCTION_SET_I_U


//   ------  texelFetchOffset(sampler, p, lod, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(FIRST, SECOND, FORTH)\
vec4  texelFetch(     FIRST sampler, SECOND P, int lod, FORTH offset);\
ivec4 texelFetch(i ## FIRST sampler, SECOND P, int lod, FORTH offset);\
uvec4 texelFetch(u ## FIRST sampler, SECOND P, int lod, FORTH offset);

GENERIC_FUNCTION_SET_I_U(sampler2D, ivec2, ivec2)
GENERIC_FUNCTION_SET_I_U(sampler3D, ivec3, ivec3)

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

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, ivec3)

GENERIC_FUNCTION_SET(float, sampler2DShadow, vec4, ivec2)

#undef GENERIC_FUNCTION_SET_I_U
#undef GENERIC_FUNCTION_SET



//   ------  textureLodOffset(sampler, p, lod, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, FORTH)\
     RET textureLodOffset(     FIRST sampler, SECOND P, float lod, FORTH offset);\
i ## RET textureLodOffset(i ## FIRST sampler, SECOND P, float lod, FORTH offset);\
u ## RET textureLodOffset(u ## FIRST sampler, SECOND P, float lod, FORTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, ivec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, ivec2)
float textureLodOffset(sampler2DShadow sampler, vec3 P, float lod, ivec2 offset);

#undef GENERIC_FUNCTION_SET_I_U


//   ------  textureProjLod(sampler, p, lod)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND)\
     RET textureProjLod(     FIRST sampler, SECOND P, float lod);\
i ## RET textureProjLod(i ## FIRST sampler, SECOND P, float lod);\
u ## RET textureProjLod(u ## FIRST sampler, SECOND P, float lod);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4)
float textureProjLod (sampler2DShadow sampler, vec4 P, float lod);

#undef GENERIC_FUNCTION_SET_I_U


//   ------  textureProjLodOffset(sampler, p, lod, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, FORTH)\
     RET textureProjLodOffset(     FIRST sampler, SECOND P, float lod, FORTH offset);\
i ## RET textureProjLodOffset(i ## FIRST sampler, SECOND P, float lod, FORTH offset);\
u ## RET textureProjLodOffset(u ## FIRST sampler, SECOND P, float lod, FORTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, ivec3)
float textureProjLodOffset (sampler2DShadow sampler, vec4 P, float lod, ivec2 offset);

#undef GENERIC_FUNCTION_SET_I_U




//   ------  textureGrad(sampler, P, dPdx, dPdy)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
     RET textureGrad(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
i ## RET textureGrad(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
u ## RET textureGrad(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, vec2)
float textureGrad (sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy);
float textureGrad (samplerCubeShadow sampler, vec4 P, vec3 dPdx, vec3 dPdy);
float textureGrad (sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy);

#undef GENERIC_FUNCTION_SET_I_U



//   ------  textureGradOffset(sampler, P, dPdx, dPdy, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD, FIFTH)\
     RET textureGradOffset(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
i ## RET textureGradOffset(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
u ## RET textureGradOffset(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3, vec3, ivec3)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3, vec2, ivec2)
float textureGradOffset (sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
float textureGradOffset (sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2);

#undef GENERIC_FUNCTION_SET_I_U



//   ------  textureProjGrad(sampler, P, dPdx, dPdy)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD)\
     RET textureProjGrad(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
i ## RET textureProjGrad(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);\
u ## RET textureProjGrad(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, vec3)
float textureProjGrad (sampler2DShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy);

#undef GENERIC_FUNCTION_SET_I_U




//   ------  textureProjGradOffset(sampler, P, dPdx, dPdy, offset)   -------
#define GENERIC_FUNCTION_SET_I_U(RET, FIRST, SECOND, THIRD, FIFTH)\
     RET textureProjGradOffset(     FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
i ## RET textureProjGradOffset(i ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);\
u ## RET textureProjGradOffset(u ## FIRST sampler, SECOND P, THIRD dPdx, THIRD dPdy, FIFTH offset);

GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, vec2, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, vec2, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, vec3, vec3)
float textureProjGradOffset (sampler2DShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, vec2 offset);

#undef GENERIC_FUNCTION_SET_I_U



// -----------------------------------------------------------------------------------
//                           8.9.3 Texture Gather Functions
// -----------------------------------------------------------------------------------

//   ------  textureGather(sampler, P ...)
#define GEN__textureGather(SAMPLER_TYPE, P_TYPE)                  \
     vec4 textureGather(     SAMPLER_TYPE sampler, P_TYPE P);           \
i ## vec4 textureGather(i ## SAMPLER_TYPE sampler, P_TYPE P);           \
u ## vec4 textureGather(u ## SAMPLER_TYPE sampler, P_TYPE P);           \
     vec4 textureGather(     SAMPLER_TYPE sampler, P_TYPE P, int comp); \
i ## vec4 textureGather(i ## SAMPLER_TYPE sampler, P_TYPE P, int comp); \
u ## vec4 textureGather(u ## SAMPLER_TYPE sampler, P_TYPE P, int comp);

GEN__textureGather(sampler2D,                      vec2)
GEN__textureGather(sampler2DArray,                 vec3)
GEN__textureGather(samplerCube,                    vec3)
vec4 textureGather(sampler2DShadow sampler,        vec2 P, float refZ);
vec4 textureGather(sampler2DArrayShadow sampler,   vec3 P, float refZ);
vec4 textureGather(samplerCubeShadow sampler,      vec3 P, float refZ);

#undef GEN__textureGather


//   ------  textureGatherOffset(sampler, P, .. offset)
#define GEN__textureGatherOffset(SAMPLER_TYPE, P_TYPE) \
     vec4 textureGatherOffset(     SAMPLER_TYPE sampler, P_TYPE P, ivec2 offset); \
i ## vec4 textureGatherOffset(i ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offset); \
u ## vec4 textureGatherOffset(u ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offset); \
     vec4 textureGatherOffset(     SAMPLER_TYPE sampler, P_TYPE P, ivec2 offset, int comp); \
i ## vec4 textureGatherOffset(i ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offset, int comp); \
u ## vec4 textureGatherOffset(u ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offset, int comp);

GEN__textureGatherOffset(sampler2D,                    vec2)
GEN__textureGatherOffset(sampler2DArray,               vec3)
vec4 textureGatherOffset(sampler2DShadow sampler,      vec2 P, float refZ, ivec2 offset);
vec4 textureGatherOffset(sampler2DArrayShadow sampler, vec3 P, float refZ, ivec2 offset);

#undef GEN__textureGatherOffset

// -----------------------------------------------------------------------------------
//                           8.10 Atomic-Counter Functions
// -----------------------------------------------------------------------------------
uint atomicCounterIncrement (atomic_uint c);
uint atomicCounterDecrement (atomic_uint c);
uint atomicCounter (atomic_uint c);

// -----------------------------------------------------------------------------------
//                           8.11 Atomic Memory Functions
// -----------------------------------------------------------------------------------

uint atomicAdd (inout uint mem, uint data);
int atomicAdd (inout int mem, int data);

uint atomicMin (inout uint mem, uint data);
int atomicMin (inout int mem, int data);

uint atomicMax (inout uint mem, uint data);
int atomicMax (inout int mem, int data);

uint atomicAnd (inout uint mem, uint data);
int atomicAnd (inout int mem, int data);

uint atomicOr (inout uint mem, uint data);
int atomicOr (inout int mem, int data);

uint atomicXor (inout uint mem, uint data);
int atomicXor (inout int mem, int data);

uint atomicExchange (inout uint mem, uint data);
int atomicExchange (inout int mem, int data);

uint atomicCompSwap (inout uint mem, uint compare, uint data);
int atomicCompSwap (inout int mem, int compare, int data);


// -----------------------------------------------------------------------------------
//                           8.12 Image Functions
// -----------------------------------------------------------------------------------
//   ------  imageSize(image)
#define GEN_imageSize(RETURN_TYPE, IMAGE_TYPE) \
highp RETURN_TYPE imageSize(readonly writeonly      IMAGE_TYPE image); \
highp RETURN_TYPE imageSize(readonly writeonly i ## IMAGE_TYPE image); \
highp RETURN_TYPE imageSize(readonly writeonly u ## IMAGE_TYPE image); \


GEN_imageSize(ivec2, image2D)
GEN_imageSize(ivec3, image3D)
GEN_imageSize(ivec2, imageCube)
GEN_imageSize(ivec3, image2DArray)

#undef GEN_imageSize


//   ------  imageLoad/Store(image[, data])
#define GENERIC_FUNCTION_SET_U_I(...) \
highp vec4 imageLoad (readonly __VA_ARGS__); \
void imageStore (writeonly __VA_ARGS__, vec4 data); \
highp ivec4 imageLoad (readonly  u ## __VA_ARGS__); \
void imageStore (writeonly u ## __VA_ARGS__, ivec4 data); \
highp uvec4 imageLoad (readonly  i ## __VA_ARGS__); \
void imageStore (writeonly i ## __VA_ARGS__, uvec4 data);

GENERIC_FUNCTION_SET_U_I(image2D image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(image3D image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageCube image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DArray image, ivec3 P)

#undef GENERIC_FUNCTION_SET_U_I
#undef GENERIC_FUNCTION_SET



// -----------------------------------------------------------------------------------
//                           8.13 Fragment Processing Functions
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
//                           8.14 Shader Invocation Control Functions
// -----------------------------------------------------------------------------------
void barrier();

// -----------------------------------------------------------------------------------
//                           8.15 Shader Memory Control Function
// -----------------------------------------------------------------------------------
void memoryBarrier();
void memoryBarrierAtomicCounter();
void memoryBarrierBuffer();
void memoryBarrierShared();
void memoryBarrierImage();
void groupMemoryBarrier();




