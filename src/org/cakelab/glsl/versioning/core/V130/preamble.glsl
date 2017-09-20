/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                            Open GL Shading Language 
//                                    V 1.30
//                                 Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define __VERSION__ 130
#define GL_core_profile 1

#if !defined(VERTEX_SHADER) &&  !defined(VERTEX_SHADER) && !defined(GENERIC_SHADER)
#error undefined shader type!
#endif
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////



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
//
// The following are deprecated.
//
const int  gl_MaxClipPlanes = 8;                // deprecated
const int  gl_MaxTextureCoords = 8;             // deprecated


// -----------------------------------------------------------------------------------
//                           7.1 Vertex Shader Special Variables
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
out vec4  gl_Position;
out float gl_PointSize;
in  int   gl_VertexID;
out float gl_ClipDistance[];
out vec4  gl_ClipVertex;
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
//                           7.3 Vertex Shader Built-In  Inputs
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
in vec4  gl_Color;           // deprecated
in vec4  gl_SecondaryColor;  // deprecated
in vec3  gl_Normal;          // deprecated
in vec4  gl_Vertex;          // deprecated
in vec4  gl_MultiTexCoord0;  // deprecated
in vec4  gl_MultiTexCoord1;  // deprecated
in vec4  gl_MultiTexCoord2;  // deprecated
in vec4  gl_MultiTexCoord3;  // deprecated
in vec4  gl_MultiTexCoord4;  // deprecated
in vec4  gl_MultiTexCoord5;  // deprecated
in vec4  gl_MultiTexCoord6;  // deprecated
in vec4  gl_MultiTexCoord7;  // deprecated
in float gl_FogCoord;        // deprecated
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

uniform mat4  gl_ModelViewMatrix;
uniform mat4  gl_ProjectionMatrix;
uniform mat4  gl_ModelViewProjectionMatrix;
uniform mat4  gl_TextureMatrix[gl_MaxTextureCoords];
uniform mat3  gl_NormalMatrix;
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


uniform float gl_NormalScale;
uniform vec4  gl_ClipPlane[gl_MaxClipPlanes];

struct gl_PointParameters
 {
    float size;
    float sizeMin;
    float sizeMax;
    float fadeThresholdSize;
    float distanceConstantAttenuation;
    float distanceLinearAttenuation;
    float distanceQuadraticAttenuation;
};
uniform gl_PointParameters gl_Point;

struct gl_MaterialParameters
 {
    vec4  emission;    // Ecm
    vec4  ambient;     // Acm
    vec4  diffuse;     // Dcm
    vec4  specular;    // Scm
    float shininess;   // Srm
};
uniform gl_MaterialParameters  gl_FrontMaterial;
uniform gl_MaterialParameters  gl_BackMaterial;

//
// Deprecated.
//
struct gl_LightSourceParameters
{
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
uniform gl_LightSourceParameters  gl_LightSource
[gl_MaxLights
];
struct gl_LightModelParameters
 {
    vec4  ambient;       // Acs
};
uniform gl_LightModelParameters  gl_LightModel;
//
// Deprecated.
// Derived state from products of light and material.
//
struct gl_LightModelProducts
 {
    vec4  sceneColor;     // Derived. Ecm + Acm * Acs
};
uniform gl_LightModelProducts gl_FrontLightModelProduct;
uniform gl_LightModelProducts gl_BackLightModelProduct; 
struct gl_LightProducts
 {
    vec4  ambient;        // Acm * Acli
    vec4  diffuse;        // Dcm * Dcli
    vec4  specular;       // Scm * Scli
};
uniform gl_LightProducts gl_FrontLightProduct [gl_MaxLights];
uniform gl_LightProducts gl_BackLightProduct [gl_MaxLights];

uniform vec4  gl_TextureEnvColor [gl_MaxTextureUnits];
uniform vec4  gl_EyePlaneS [gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneT[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneR[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneQ[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneS[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneT[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneR[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneQ[gl_MaxTextureCoords];
//
// Deprecated.
//
struct gl_FogParameters
{
    vec4 color;
    float density;
    float start;
    float end;
    float scale;   // Derived:   1.0 / (end - start)
};
uniform gl_FogParameters gl_Fog;


// -----------------------------------------------------------------------------------
//                           7.6 Built-In Vertex Output and Fragment Input Variables
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
out vec4  gl_FrontColor;          // deprecated
out vec4  gl_BackColor;           // deprecated
out vec4  gl_FrontSecondaryColor; // deprecated
out vec4  gl_BackSecondaryColor;  // deprecated
out vec4  gl_TexCoord[];  // deprecated, at most will be gl_MaxTextureCoords
out float gl_FogFragCoord;// deprecated
#endif

#ifdef FRAGMENT_SHADER
in vec2  gl_PointCoord;
#endif

#ifdef VERTEX_SHADER
in float gl_FogFragCoord;      // deprecated
in vec4  gl_TexCoord[];        // deprecated
// in vec4  gl_Color;             // already defined in earlier section
// in vec4  gl_SecondaryColor;    // already defined in earlier section
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

float round(float x)
vec2 round(vec2 x)
vec3 round(vec3 x)
vec4 round(vec4 x)

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
vec4 ftransform();

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



#error unfinished preamble
