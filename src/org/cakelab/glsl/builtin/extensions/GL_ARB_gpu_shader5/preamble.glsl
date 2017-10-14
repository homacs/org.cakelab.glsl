/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_gpu_shader5
//                                 since GLSL v 1.50
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_gpu_shader5 1


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////





// -----------------------------------------------------------------------------------
//                           7.1 Vertex And Geometry Shader Special Variables
// -----------------------------------------------------------------------------------

#if __VERSION__ < 400 && defined(GEOMETRY_SHADER)

in int gl_InvocationID;

#endif // defined(GEOMETRY_SHADER)



// -----------------------------------------------------------------------------------
//                           7.2 Fragment Shader Special Variables
// -----------------------------------------------------------------------------------

#if defined(FRAGMENT_SHADER)

in int gl_SampleMaskIn[];

#endif // defined(FRAGMENT_SHADER)

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// -----------------------------------------------------------------------------------
//                           8.3 Common Functions
// -----------------------------------------------------------------------------------
#if __VERSION__ < 400

float fma (float a, float b, float c);
vec2 fma (vec2 a, vec2 b, vec2 c);
vec3 fma (vec3 a, vec3 b, vec3 c);
vec4 fma (vec4 a, vec4 b, vec4 c);

float frexp (float x, out float exp);
vec2 frexp (vec2 x, out vec2 exp);
vec3 frexp (vec3 x, out vec3 exp);
vec4 frexp (vec4 x, out vec4 exp);

float ldexp (float x, in float exp);
vec2 ldexp (vec2 x, in vec2 exp);
vec3 ldexp (vec3 x, in vec3 exp);
vec4 ldexp (vec4 x, in vec4 exp);





#define GENERIC_FUNCTION_SET(PREFIX, TYPE) \
void PREFIX ## mulExtended (TYPE x, TYPE y, out TYPE msb, out TYPE lsb);\
TYPE bitfieldExtract (TYPE value, int offset, int bits);\
TYPE bitfieldInsert (TYPE base, TYPE insert, int offset, int bits);\
TYPE bitfieldReverse (TYPE value);\
TYPE bitCount (TYPE value);\
TYPE findLSB (TYPE value);\
TYPE findMSB (TYPE value);

GENERIC_FUNCTION_SET(i, int)
GENERIC_FUNCTION_SET(i, ivec2)
GENERIC_FUNCTION_SET(i, ivec3)
GENERIC_FUNCTION_SET(i, ivec4)
GENERIC_FUNCTION_SET(u, uint)
GENERIC_FUNCTION_SET(u, uvec2)
GENERIC_FUNCTION_SET(u, uvec3)
GENERIC_FUNCTION_SET(u, uvec4)

#undef GENERIC_FUNCTION_SET



uint packUnorm2x16 (vec2 v);
uint packUnorm4x8 (vec4 v);
uint packSnorm4x8 (vec4 v);

vec2 unpackUnorm2x16 (uint p);
vec4 unpackUnorm4x8 (uint p);
vec4 unpackSnorm4x8 (uint p);

#endif // __VERSION__ < 400


#if __VERSION__ < 330


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

#endif // __VERSION__ < 330

#if __VERSION__ < 400

#define GENERIC_FUNCTION_SET_U(genUType) \
genUType uaddCarry (genUType x, genUType y, out genUType carry); \
genUType usubBorrow (genUType x, genUType y, out genUType borrow);

GENERIC_FUNCTION_SET_U(uint)
GENERIC_FUNCTION_SET_U(uvec2)
GENERIC_FUNCTION_SET_U(uvec3)
GENERIC_FUNCTION_SET_U(uvec4)

#undef GENERIC_FUNCTION_SET_U



#endif // __VERSION__ < 400


#define GEN_mulExtended_U_I(PREFIX, GTYPE) \
void PREFIX ## mulExtended(GTYPE x, GTYPE y, out GTYPE msb, out GTYPE lsb); 


GEN_mulExtended_U_I(i, int)
GEN_mulExtended_U_I(i, ivec2)
GEN_mulExtended_U_I(i, ivec3)
GEN_mulExtended_U_I(i, ivec4)

GEN_mulExtended_U_I(u, uint)
GEN_mulExtended_U_I(u, uvec2)
GEN_mulExtended_U_I(u, uvec3)
GEN_mulExtended_U_I(u, uvec4)

#undef GEN_mulExtended_U_I


// -----------------------------------------------------------------------------------
//                           8.7 Texture Lookup Functions
// -----------------------------------------------------------------------------------
#if __VERSION__ < 400
//   ------  textureGather(sampler, P ...)

// Note: Types samplerCubeArray(Shadow) do not exist until version 4.00
//       and they have not been introduced with this extension or other extensions.
//       But, in v400, those functions exist, so we don't need to add them.
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
// GEN__textureGather(samplerCubeArray,               vec4)
GEN__textureGather(sampler2DRect,                  vec3)
vec4 textureGather(sampler2DShadow sampler,        vec2 P, float refZ);
vec4 textureGather(sampler2DArrayShadow sampler,   vec3 P, float refZ);
vec4 textureGather(samplerCubeShadow sampler,      vec3 P, float refZ);
// vec4 textureGather(samplerCubeArrayShadow sampler, vec4 P, float refZ);
vec4 textureGather(sampler2DRectShadow sampler,    vec2 P, float refZ);

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
GEN__textureGatherOffset(sampler2DRect,                vec3)
vec4 textureGatherOffset(sampler2DShadow sampler,      vec2 P, float refZ, ivec2 offset);
vec4 textureGatherOffset(sampler2DArrayShadow sampler, vec3 P, float refZ, ivec2 offset);
vec4 textureGatherOffset(sampler2DRectShadow sampler,  vec2 P, float refZ, ivec2 offset);

#undef GEN__textureGatherOffset

//   ------  textureGatherOffsets(sampler, P, .. offsets)
#define GEN__textureGatherOffsets(SAMPLER_TYPE, P_TYPE) \
     vec4 textureGatherOffsets(     SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4]); \
i ## vec4 textureGatherOffsets(i ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4]); \
u ## vec4 textureGatherOffsets(u ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4]); \
     vec4 textureGatherOffsets(     SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], int comp); \
i ## vec4 textureGatherOffsets(i ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], int comp); \
u ## vec4 textureGatherOffsets(u ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], int comp);

GEN__textureGatherOffsets(sampler2D,                    vec2)
GEN__textureGatherOffsets(sampler2DArray,               vec3)
GEN__textureGatherOffsets(sampler2DRect,                vec3)
vec4 textureGatherOffsets(sampler2DShadow sampler,      vec2 P, float refZ, ivec2 offsets[4]);
vec4 textureGatherOffsets(sampler2DArrayShadow sampler, vec3 P, float refZ, ivec2 offsets[4]);
vec4 textureGatherOffsets(sampler2DRectShadow sampler,  vec2 P, float refZ, ivec2 offsets[4]);

#undef GEN__textureGatherOffsets


// -----------------------------------------------------------------------------------
//                           8.10.2 Interpolation Functions
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER

#define GEN_INTERPOLATE_FUNCTIONS(TYPE) \
TYPE interpolateAtCentroid (TYPE interpolant);\
TYPE interpolateAtSample (TYPE interpolant, int _sample);\
TYPE interpolateAtOffset (TYPE interpolant, vec2 offset);

GEN_INTERPOLATE_FUNCTIONS(float)
GEN_INTERPOLATE_FUNCTIONS(vec2)
GEN_INTERPOLATE_FUNCTIONS(vec3)
GEN_INTERPOLATE_FUNCTIONS(vec4)

#undef GEN_INTERPOLATE_FUNCTIONS
#endif // FRAGMENT_SHADER


#endif // __VERSION__ < 400



//////////////////////////////////////////////////////////////////////////////////////
//                               F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
