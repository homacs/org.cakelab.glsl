/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL ES 2.0
//                            Open GL Shading Language 
//                                    V 1.00
//                                  ES Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////





#define __VERSION__ 100
#define GL_core_profile 1


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                            7.4 Built-In Constants
// -----------------------------------------------------------------------------------
#if defined(VERTEX_SHADER) || defined(FRAGMENT_SHADER)
//
// Implementation dependent constants.  The example values below
// are the minimum values allowed for these maximums.
//
const mediump int gl_MaxVertexAttribs = 8;           
const mediump int gl_MaxVertexUniformVectors = 128;
const mediump int gl_MaxVaryingVectors = 8;           
const mediump int gl_MaxVertexTextureImageUnits = 0;  
const mediump int gl_MaxCombinedTextureImageUnits = 8;
const mediump int gl_MaxTextureImageUnits = 8;        
const mediump int gl_MaxFragmentUniformVectors = 16;
const mediump int gl_MaxDrawBuffers = 1;               
#endif // defined(VERTEX_SHADER) || defined(FRAGMENT_SHADER)


// -----------------------------------------------------------------------------------
//                           7.1 Vertex Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
highp   vec4 gl_Position;
mediump float gl_PointSize;
#endif // VERTEX_SHADER

// -----------------------------------------------------------------------------------
//                           7.2 Fragment Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER

mediump vec4  gl_FragCoord;
        bool  gl_FrontFacing;
mediump vec4  gl_FragColor;
mediump vec4  gl_FragData[gl_MaxDrawBuffers];
mediump vec2  gl_PointCoord;

#endif // FRAGMENT_SHADER


// -----------------------------------------------------------------------------------
//                             7.5 Built-In Uniform State
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
genType atan(genType y_over_x);

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

#undef GENERIC_FUNCTION_SET


// -----------------------------------------------------------------------------------
//                           8.6 Vector Relational Functions
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
//                           8.7 Texture Lookup Functions
// -----------------------------------------------------------------------------------
vec4 texture2D(sampler2D sampler, vec2 coord);
vec4 texture2D(sampler2D sampler, vec2 coord, float bias);
vec4 texture2DProj (sampler2D sampler, vec3 coord);
vec4 texture2DProj (sampler2D sampler, vec3 coord, float bias);
vec4 texture2DProj (sampler2D sampler, vec4 coord);
vec4 texture2DProj (sampler2D sampler, vec4 coord, float bias);
vec4 texture2DLod (sampler2D sampler, vec2 coord, float lod);
vec4 texture2DProjLod (sampler2D sampler, vec3 coord, float lod);
vec4 texture2DProjLod (sampler2D sampler, vec4 coord, float lod);

vec4 textureCube(samplerCube sampler, vec3 coord);
vec4 textureCube(samplerCube sampler, vec3 coord, float bias);
vec4 textureCubeLod(samplerCube sampler, vec3 coord, float lod);












