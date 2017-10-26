/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.5
//                            Open GL Shading Language 
//                                    V 4.50
//                                  Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#ifndef GL_core_profile
#error requires GL_core_profile to be defined
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
// double was added
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


#define GENERIC_FUNCTION_SET(genType) \
genType sqrt(genType x);\
genType inversesqrt(genType x);

GENERIC_FUNCTION_SET(double)
GENERIC_FUNCTION_SET(dvec2)
GENERIC_FUNCTION_SET(dvec3)
GENERIC_FUNCTION_SET(dvec4)

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
double abs(double x);
dvec2 abs(dvec2 x);
dvec3 abs(dvec3 x);
dvec4 abs(dvec4 x);

float sign(float x);
vec2 sign(vec2 x);
vec3 sign(vec3 x);
vec4 sign(vec4 x);
int sign(int x);
ivec2 sign(ivec2 x);
ivec3 sign(ivec3 x);
ivec4 sign(ivec4 x);
double sign(double x);
dvec2 sign(dvec2 x);
dvec3 sign(dvec3 x);
dvec4 sign(dvec4 x);

float floor(float x);
vec2 floor(vec2 x);
vec3 floor(vec3 x);
vec4 floor(vec4 x);
double floor(double x);
dvec2 floor(dvec2 x);
dvec3 floor(dvec3 x);
dvec4 floor(dvec4 x);

float trunc(float x);
vec2 trunc(vec2 x);
vec3 trunc(vec3 x);
vec4 trunc(vec4 x);
double trunc(double x);
dvec2 trunc(dvec2 x);
dvec3 trunc(dvec3 x);
dvec4 trunc(dvec4 x);

float round(float x);
vec2 round(vec2 x);
vec3 round(vec3 x);
vec4 round(vec4 x);
double round(double x);
dvec2 round(dvec2 x);
dvec3 round(dvec3 x);
dvec4 round(dvec4 x);

float roundEven(float x);
vec2 roundEven(vec2 x);
vec3 roundEven(vec3 x);
vec4 roundEven(vec4 x);
double roundEven(double x);
dvec2 roundEven(dvec2 x);
dvec3 roundEven(dvec3 x);
dvec4 roundEven(dvec4 x);

float ceil(float x);
vec2 ceil(vec2 x);
vec3 ceil(vec3 x);
vec4 ceil(vec4 x);
double ceil(double x);
dvec2 ceil(dvec2 x);
dvec3 ceil(dvec3 x);
dvec4 ceil(dvec4 x);

float fract(float x);
vec2 fract(vec2 x);
vec3 fract(vec3 x);
vec4 fract(vec4 x);
double fract(double x);
dvec2 fract(dvec2 x);
dvec3 fract(dvec3 x);
dvec4 fract(dvec4 x);

float mod(float x, float y);
vec2 mod(vec2 x, float y);
vec3 mod(vec3 x, float y);
vec4 mod(vec4 x, float y);
vec2 mod(vec2 x, vec2 y);
vec3 mod(vec3 x, vec3 y);
vec4 mod(vec4 x, vec4 y);
double mod(double x, double y);
dvec2 mod(dvec2 x, double y);
dvec3 mod(dvec3 x, double y);
dvec4 mod(dvec4 x, double y);
dvec2 mod(dvec2 x, dvec2 y);
dvec3 mod(dvec3 x, dvec3 y);
dvec4 mod(dvec4 x, dvec4 y);

float modf(float x, out float i);
vec2 modf(vec2 x, out vec2 i);
vec3 modf(vec3 x, out vec3 i);
vec4 modf(vec4 x, out vec4 i);
double modf(double x, out double i);
dvec2 modf(dvec2 x, out dvec2 i);
dvec3 modf(dvec3 x, out dvec3 i);
dvec4 modf(dvec4 x, out dvec4 i);

float min(float x, float y);
vec2 min(vec2 x, vec2 y);
vec3 min(vec3 x, vec3 y);
vec4 min(vec4 x, vec4 y);
vec2 min(vec2 x, float y);
vec3 min(vec3 x, float y);
vec4 min(vec4 x, float y);
double min(double x, double y);
dvec2 min(dvec2 x, dvec2 y);
dvec3 min(dvec3 x, dvec3 y);
dvec4 min(dvec4 x, dvec4 y);
dvec2 min(dvec2 x, double y);
dvec3 min(dvec3 x, double y);
dvec4 min(dvec4 x, double y);
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
double max(double x, double y);
dvec2 max(dvec2 x, dvec2 y);
dvec3 max(dvec3 x, dvec3 y);
dvec4 max(dvec4 x, dvec4 y);
dvec2 max(dvec2 x, double y);
dvec3 max(dvec3 x, double y);
dvec4 max(dvec4 x, double y);
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
double clamp(double x, double minVal, double maxVal);
dvec2 clamp(dvec2 x, dvec2 minVal, dvec2 maxVal);
dvec3 clamp(dvec3 x, dvec3 minVal, dvec3 maxVal);
dvec4 clamp(dvec4 x, dvec4 minVal, dvec4 maxVal);
dvec2 clamp(dvec2 x, double minVal, double maxVal);
dvec3 clamp(dvec3 x, double minVal, double maxVal);
dvec4 clamp(dvec4 x, double minVal, double maxVal);
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
double mix(double x, double y, double a);
dvec2 mix(dvec2 x, dvec2 y, dvec2 a);
dvec3 mix(dvec3 x, dvec3 y, dvec3 a);
dvec4 mix(dvec4 x, dvec4 y, dvec4 a);
dvec2 mix(dvec2 x, dvec2 y, double a);
dvec3 mix(dvec3 x, dvec3 y, double a);
dvec4 mix(dvec4 x, dvec4 y, double a);

float mix(float x, float y, bool a);
vec2 mix(vec2 x, vec2 y, bvec2 a);
vec3 mix(vec3 x, vec3 y, bvec3 a);
vec4 mix(vec4 x, vec4 y, bvec4 a);
double mix(double x, double y, bool a);
dvec2 mix(dvec2 x, dvec2 y, bvec2 a);
dvec3 mix(dvec3 x, dvec3 y, bvec3 a);
dvec4 mix(dvec4 x, dvec4 y, bvec4 a);
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
double step(double edge, double x);
dvec2 step(dvec2  edge, dvec2 x);
dvec3 step(dvec3  edge, dvec3 x);
dvec4 step(dvec4  edge, dvec4 x);
dvec2 step(double edge, dvec2 x);
dvec3 step(double edge, dvec3 x);
dvec4 step(double edge, dvec4 x);

float smoothstep(float edge0, float edge1, float x);
vec2 smoothstep(vec2 edge0, vec2 edge1, vec2 x);
vec3 smoothstep(vec3 edge0, vec3 edge1, vec3 x);
vec4 smoothstep(vec4 edge0, vec4 edge1, vec4 x);
vec2 smoothstep(float edge0, float edge1, vec2 x);
vec3 smoothstep(float edge0, float edge1, vec3 x);
vec4 smoothstep(float edge0, float edge1, vec4 x);
double smoothstep(double edge0, double edge1, double x);
dvec2 smoothstep(dvec2 edge0, dvec2 edge1, dvec2 x);
dvec3 smoothstep(dvec3 edge0, dvec3 edge1, dvec3 x);
dvec4 smoothstep(dvec4 edge0, dvec4 edge1, dvec4 x);
dvec2 smoothstep(double edge0, double edge1, vec2 x);
dvec3 smoothstep(double edge0, double edge1, vec3 x);
dvec4 smoothstep(double edge0, double edge1, vec4 x);

bool isnan (float x);
bvec2 isnan (vec2 x);
bvec3 isnan (vec3 x);
bvec4 isnan (vec4 x);
bool isnan (double x);
bvec2 isnan (dvec2 x);
bvec3 isnan (dvec3 x);
bvec4 isnan (dvec4 x);

bool isinf(float x);
bvec2 isinf(vec2 x);
bvec3 isinf(vec3 x);
bvec4 isinf(vec4 x);
bool isinf(double x);
bvec2 isinf(dvec2 x);
bvec3 isinf(dvec3 x);
bvec4 isinf(dvec4 x);

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

float fma (float a, float b, float c);
vec2 fma (vec2 a, vec2 b, vec2 c);
vec3 fma (vec3 a, vec3 b, vec3 c);
vec4 fma (vec4 a, vec4 b, vec4 c);
double fma (double a, double b, double c);
dvec2 fma (dvec2 a, dvec2 b, dvec2 c);
dvec3 fma (dvec3 a, dvec3 b, dvec3 c);
dvec4 fma (dvec4 a, dvec4 b, dvec4 c);

float frexp (float x, out float exp);
vec2 frexp (vec2 x, out vec2 exp);
vec3 frexp (vec3 x, out vec3 exp);
vec4 frexp (vec4 x, out vec4 exp);
double frexp (double x, out double exp);
dvec2 frexp (dvec2 x, out dvec2 exp);
dvec3 frexp (dvec3 x, out dvec3 exp);
dvec4 frexp (dvec4 x, out dvec4 exp);

float ldexp (float x, in float exp);
vec2 ldexp (vec2 x, in vec2 exp);
vec3 ldexp (vec3 x, in vec3 exp);
vec4 ldexp (vec4 x, in vec4 exp);
double ldexp (double x, in double exp);
dvec2 ldexp (dvec2 x, in dvec2 exp);
dvec3 ldexp (dvec3 x, in dvec3 exp);
dvec4 ldexp (dvec4 x, in dvec4 exp);




// -----------------------------------------------------------------------------------
//                           8.4 Floating-Point Pack and Unpack Functions
// -----------------------------------------------------------------------------------




uint packUnorm2x16 (vec2 v);
uint packSnorm2x16 (vec2 v);
uint packUnorm4x8 (vec4 v);
uint packSnorm4x8 (vec4 v);

vec2 unpackUnorm2x16 (uint p);
vec2 unpackSnorm2x16 (uint p);
vec4 unpackUnorm4x8 (uint p);
vec4 unpackSnorm4x8 (uint p);

double packDouble2x32 (uvec2 v);
uvec2 unpackDouble2x32 (double v);

uint packHalf2x16 (vec2 v);
vec2 unpackHalf2x16 (uint v);


// -----------------------------------------------------------------------------------
//                           8.5 Geometric Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(SCALAR_RETURN, genType) \
SCALAR_RETURN length(genType x);\
SCALAR_RETURN distance(genType p0, genType p1);\
SCALAR_RETURN dot(genType x, genType y);\
genType normalize(genType x);\
genType faceforward(genType N, genType I, genType Nref);\
genType reflect(genType I, genType N);\
genType refract(genType I, genType N, float eta);


// non generic functions
vec3 cross (vec3 x, vec3 y);
dvec3 cross(dvec3 x, dvec3 y);


GENERIC_FUNCTION_SET(float, float)
GENERIC_FUNCTION_SET(float, vec2)
GENERIC_FUNCTION_SET(float, vec3)
GENERIC_FUNCTION_SET(float, vec4)
GENERIC_FUNCTION_SET(double, double)
GENERIC_FUNCTION_SET(double, dvec2)
GENERIC_FUNCTION_SET(double, dvec3)
GENERIC_FUNCTION_SET(double, dvec4)

#undef GENERIC_FUNCTION_SET




// -----------------------------------------------------------------------------------
//                           8.6 Matrix Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(mat) \
mat matrixCompMult(mat x, mat y); \
d ## mat matrixCompMult(d ## mat x, d ## mat y);

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
dmat2   outerProduct(dvec2 c, dvec2 r);
dmat2x3 outerProduct(dvec2 c, dvec3 r);
dmat2x4 outerProduct(dvec2 c, dvec4 r);
dmat3x2 outerProduct(dvec3 c, dvec2 r);
dmat3   outerProduct(dvec3 c, dvec3 r);
dmat3x4 outerProduct(dvec3 c, dvec4 r);
dmat4x2 outerProduct(dvec4 c, dvec2 r);
dmat4x3 outerProduct(dvec4 c, dvec3 r);
dmat4   outerProduct(dvec4 c, dvec4 r);

mat2 transpose(mat2 m);
mat3 transpose(mat3 m);
mat4 transpose(mat4 m);
mat2x3 transpose(mat3x2 m);
mat3x2 transpose(mat2x3 m);
mat2x4 transpose(mat4x2 m);
mat4x2 transpose(mat2x4 m);
mat3x4 transpose(mat4x3 m);
mat4x3 transpose(mat3x4 m);
dmat2 transpose(dmat2 m);
dmat3 transpose(dmat3 m);
dmat4 transpose(dmat4 m);
dmat2x3 transpose(dmat3x2 m);
dmat3x2 transpose(dmat2x3 m);
dmat2x4 transpose(dmat4x2 m);
dmat4x2 transpose(dmat2x4 m);
dmat3x4 transpose(dmat4x3 m);
dmat4x3 transpose(dmat3x4 m);

float determinant(mat2 m);
float determinant(mat3 m);
float determinant(mat4 m);
double determinant(dmat2 m);
double determinant(dmat3 m);
double determinant(dmat4 m);

mat2 inverse(mat2 m);
mat3 inverse(mat3 m);
mat4 inverse(mat4 m);
dmat2 inverse(dmat2 m);
dmat3 inverse(dmat3 m);
dmat4 inverse(dmat4 m);



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

GENERIC_FUNCTION_SET(bvec2, dvec2)
GENERIC_FUNCTION_SET(bvec3, dvec3)
GENERIC_FUNCTION_SET(bvec4, dvec4)

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
#define GENERIC_FUNCTION_SET_U(genUType) \
genUType uaddCarry (genUType x, genUType y, out genUType carry); \
genUType usubBorrow (genUType x, genUType y, out genUType borrow);

GENERIC_FUNCTION_SET_U(uint)
GENERIC_FUNCTION_SET_U(uvec2)
GENERIC_FUNCTION_SET_U(uvec3)
GENERIC_FUNCTION_SET_U(uvec4)

#undef GENERIC_FUNCTION_SET_U


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



// -----------------------------------------------------------------------------------
//                           8.9 Texture Functions
// -----------------------------------------------------------------------------------

// -----------------------------------------------------------------------------------
//                           8.9.1 Texture Query Functions
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

ivec3 textureSize (samplerCubeArray sampler, int lod);
ivec3 textureSize (isamplerCubeArray sampler, int lod);
ivec3 textureSize (usamplerCubeArray sampler, int lod);


ivec3 textureSize (samplerCubeArrayShadow sampler, int lod);


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

ivec2 textureSize (sampler2DMS sampler);
ivec2 textureSize (isampler2DMS sampler);
ivec2 textureSize (usampler2DMS sampler);

ivec2 textureSize (sampler2DMSArray sampler);
ivec2 textureSize (isampler2DMSArray sampler);
ivec2 textureSize (usampler2DMSArray sampler);

// ------- textureQueryLevels(sampler)
#define GENERIC_FUNCTION_SET(SAMPLER_TYPE) \
int textureQueryLevels(     SAMPLER_TYPE _sampler); \
int textureQueryLevels(i ## SAMPLER_TYPE _sampler); \
int textureQueryLevels(u ## SAMPLER_TYPE _sampler);


GENERIC_FUNCTION_SET(sampler1D)
GENERIC_FUNCTION_SET(sampler2D)
GENERIC_FUNCTION_SET(sampler3D)
GENERIC_FUNCTION_SET(samplerCube)
GENERIC_FUNCTION_SET(sampler1DArray)
GENERIC_FUNCTION_SET(sampler2DArray)
GENERIC_FUNCTION_SET(samplerCubeArray)
int textureQueryLevels(sampler1DShadow);
int textureQueryLevels(sampler2DShadow);
int textureQueryLevels(samplerCubeShadow);
int textureQueryLevels(sampler1DArrayShadow);
int textureQueryLevels(sampler2DArrayShadow);
int textureQueryLevels(samplerCubeArrayShadow);

#undef GENERIC_FUNCTION_SET

//   ------  textureSamples(sampler2DMS)
#define GEN_textureSamples(SAMPLER_TYPE) \
int textureSamples(SAMPLER_TYPE _sampler); \
int textureSamples(i ## SAMPLER_TYPE _sampler); \
int textureSamples(u ## SAMPLER_TYPE _sampler);

GEN_textureSamples(sampler2DMS)
GEN_textureSamples(sampler2DMSArray)

#undef GEN_textureSamples


//   ------  textureQueryLod(sampler, P)   -------
#ifdef FRAGMENT_SHADER
#define GENERIC_textureQueryLod(SAMPLER_TYPE, P_TYPE)       \
vec2 textureQueryLod(     SAMPLER_TYPE sampler, P_TYPE P);  \
vec2 textureQueryLod(i ## SAMPLER_TYPE sampler, P_TYPE P);  \
vec2 textureQueryLod(u ## SAMPLER_TYPE sampler, P_TYPE P);  

GENERIC_textureQueryLod(sampler1D,        float)
GENERIC_textureQueryLod(sampler2D,        vec2)
GENERIC_textureQueryLod(sampler3D,        vec3)
GENERIC_textureQueryLod(samplerCube,      vec3)
GENERIC_textureQueryLod(sampler1DArray,   float)
GENERIC_textureQueryLod(sampler2DArray,   vec2)
GENERIC_textureQueryLod(samplerCubeArray, vec3)

#undef GENERIC_textureQueryLod

vec2 textureQueryLod(sampler1DShadow sampler, float P);
vec2 textureQueryLod(sampler2DShadow sampler, vec2 P);
vec2 textureQueryLod(samplerCubeShadow sampler, vec3 P);
vec2 textureQueryLod(sampler1DArrayShadow sampler, float P);
vec2 textureQueryLod(sampler2DArrayShadow sampler, vec2 P);
vec2 textureQueryLod(samplerCubeArrayShadow sampler, vec3 P);

#endif // FRAGMENT_SHADER

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

GENERIC_FUNCTION_SET_I_U(vec4, sampler1D, float)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCube, vec3)

GENERIC_FUNCTION_SET(float, sampler1DShadow, vec3)
GENERIC_FUNCTION_SET(float, sampler2DShadow, vec3)
GENERIC_FUNCTION_SET(float, samplerCubeShadow, vec4)

GENERIC_FUNCTION_SET_I_U(vec4, sampler1DArray, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DArray, vec3)
GENERIC_FUNCTION_SET_I_U(vec4, samplerCubeArray, vec4)

GENERIC_FUNCTION_SET(float, sampler1DArrayShadow, vec3)
float texture(sampler2DArrayShadow sampler, vec4 P);

vec4 texture(sampler2DRect sampler, vec2 P);
ivec4 texture(isampler2DRect sampler, vec2 P);
uvec4 texture(usampler2DRect sampler, vec2 P);
float texture(sampler2DRectShadow sampler, vec3 P);

float texture(samplerCubeArrayShadow sampler, vec4 P, float compare);
// Note: specification uses gsamplerCubeArrayShadow, but there are no integer variants of it.

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
GENERIC_FUNCTION_SET_I_U(vec4, samplerCubeArray, vec4)

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
float textureOffset (sampler2DArrayShadow sampler, vec4 P, vec2 offset);

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

// 'sample' is a keyword now!
vec4 texelFetch(sampler2DMS sampler, ivec2 P, int _sample);
ivec4 texelFetch(isampler2DMS sampler, ivec2 P, int _sample);
uvec4 texelFetch(usampler2DMS sampler, ivec2 P, int _sample);
vec4 texelFetch(sampler2DMSArray sampler, ivec3 P, int _sample);
ivec4 texelFetch(isampler2DMSArray sampler, ivec3 P, int _sample);
uvec4 texelFetch(usampler2DMSArray sampler, ivec3 P, int _sample);

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
GENERIC_FUNCTION_SET_I_U(vec4, samplerCubeArray, vec4, vec3)

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
float textureGradOffset (sampler1DArrayShadow sampler, vec3 P, float dPdx, float dPdy, int);
float textureGradOffset (sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2);

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
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec3, vec2, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2D, vec4, vec2, vec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DRect, vec3, vec2, ivec2)
GENERIC_FUNCTION_SET_I_U(vec4, sampler2DRect, vec4, vec2, ivec2)
float textureProjGradOffset(sampler2DRectShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset);
GENERIC_FUNCTION_SET_I_U(vec4, sampler3D, vec4, vec3, vec3)
float textureProjGradOffset (sampler1DShadow sampler, vec4 P, float dPdx, float dPdy, int offset);
float textureProjGradOffset (sampler2DShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, vec2 offset);

#undef GENERIC_FUNCTION_SET_I_U



// -----------------------------------------------------------------------------------
//                           8.9.3 Texture Gather Instructions
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
GEN__textureGather(samplerCubeArray,               vec4)
GEN__textureGather(sampler2DRect,                  vec3)
vec4 textureGather(sampler2DShadow sampler,        vec2 P, float refZ);
vec4 textureGather(sampler2DArrayShadow sampler,   vec3 P, float refZ);
vec4 textureGather(samplerCubeShadow sampler,      vec3 P, float refZ);
vec4 textureGather(samplerCubeArrayShadow sampler, vec4 P, float refZ);
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
//                           8.10 Atomic-Counter Functions
// -----------------------------------------------------------------------------------
uint atomicCounterIncrement (atomic_uint c);
uint atomicCounterDecrement (atomic_uint c);
uint atomicCounter (atomic_uint c);
uint atomicCounterAdd (atomic_uint c, uint data);
uint atomicCounterSubtract (atomic_uint c, uint data);
uint atomicCounterMin (atomic_uint c, uint data);
uint atomicCounterMax (atomic_uint c, uint data);
uint atomicCounterAnd (atomic_uint c, uint data);
uint atomicCounterOr (atomic_uint c, uint data);
uint atomicCounterXor (atomic_uint c, uint data);
uint atomicCounterExchange (atomic_uint c, uint data);
uint atomicCounterCompSwap (atomic_uint c, uint compare, uint data);

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
RETURN_TYPE imageSize(readonly writeonly      IMAGE_TYPE image); \
RETURN_TYPE imageSize(readonly writeonly i ## IMAGE_TYPE image); \
RETURN_TYPE imageSize(readonly writeonly u ## IMAGE_TYPE image); \


GEN_imageSize(int,   image1D)
GEN_imageSize(ivec2, image2D)
GEN_imageSize(ivec3, image3D)
GEN_imageSize(ivec2, imageCube)
GEN_imageSize(ivec3, imageCubeArray)
GEN_imageSize(ivec2, image2DRect)
GEN_imageSize(ivec2, image1DArray)
GEN_imageSize(ivec3, image2DArray)
GEN_imageSize(int,   imageBuffer)
GEN_imageSize(ivec2, image2DMS)
GEN_imageSize(ivec3, image2DMSArray)

#undef GEN_imageSize

//   ------  imageSamples(image)
#define GEN_imageSamples(SAMPLER_TYPE) \
int imageSamples(readonly writeonly SAMPLER_TYPE image); \
int imageSamples(readonly writeonly i ## SAMPLER_TYPE image); \
int imageSamples(readonly writeonly u ## SAMPLER_TYPE image);

GEN_imageSamples(image2DMS)
GEN_imageSamples(image2DMSArray)

#undef GEN_imageSamples



//   ------  imageLoad/Store(image[, data])
#define GENERIC_FUNCTION_SET_U_I(...) \
vec4 imageLoad (readonly __VA_ARGS__); \
void imageStore (writeonly __VA_ARGS__, vec4 data); \
ivec4 imageLoad (readonly  u ## __VA_ARGS__); \
void imageStore (writeonly u ## __VA_ARGS__, ivec4 data); \
uvec4 imageLoad (readonly  i ## __VA_ARGS__); \
void imageStore (writeonly i ## __VA_ARGS__, uvec4 data);


GENERIC_FUNCTION_SET_U_I(image1D image, int P)
GENERIC_FUNCTION_SET_U_I(image2D image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(image3D image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DRect image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(imageCube image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageBuffer image, int P)
GENERIC_FUNCTION_SET_U_I(image1DArray image, ivec2 )
GENERIC_FUNCTION_SET_U_I(image2DArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageCubeArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DMS image, ivec2 P, int _sample)
GENERIC_FUNCTION_SET_U_I(image2DMSArray image, ivec3 P, int _sample)



#undef GENERIC_FUNCTION_SET_U_I
#undef GENERIC_FUNCTION_SET



//   ------  imageAtomicXxx(image, ...)
#define GENERIC_FUNCTION_SET(...) \
uint imageAtomicAdd (__VA_ARGS__,uint data); \
int imageAtomicAdd (__VA_ARGS__, int data); \
uint imageAtomicMin (__VA_ARGS__,uint data); \
int imageAtomicMin (__VA_ARGS__, int data); \
uint imageAtomicMax (__VA_ARGS__,uint data); \
int imageAtomicMax (__VA_ARGS__, int data); \
uint imageAtomicAnd (__VA_ARGS__,uint data); \
int imageAtomicAnd (__VA_ARGS__, int data); \
uint imageAtomicOr (__VA_ARGS__,uint data); \
int imageAtomicOr (__VA_ARGS__, int data); \
uint imageAtomicXor (__VA_ARGS__,uint data); \
int imageAtomicXor (__VA_ARGS__, int data); \
uint imageAtomicExchange (__VA_ARGS__,uint data); \
int imageAtomicExchange (__VA_ARGS__, int data); \
float imageAtomicExchange (__VA_ARGS__, float data); \
uint imageAtomicCompSwap(__VA_ARGS__,uint compare,uint data); \
int imageAtomicCompSwap(__VA_ARGS__,int compare,int data);

#define GENERIC_FUNCTION_SET_U_I(...) \
GENERIC_FUNCTION_SET(     __VA_ARGS__) \
GENERIC_FUNCTION_SET(i ## __VA_ARGS__) \
GENERIC_FUNCTION_SET(u ## __VA_ARGS__)

GENERIC_FUNCTION_SET_U_I(image1D image, int P)
GENERIC_FUNCTION_SET_U_I(image2D image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(image3D image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DRect image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(imageCube image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageBuffer image, int P)
GENERIC_FUNCTION_SET_U_I(image1DArray image, ivec2 )
GENERIC_FUNCTION_SET_U_I(image2DArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageCubeArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DMS image, ivec2 P, int _sample)
GENERIC_FUNCTION_SET_U_I(image2DMSArray image, ivec3 P, int _sample)

#undef GENERIC_FUNCTION_SET_U_I
#undef GENERIC_FUNCTION_SET

// -----------------------------------------------------------------------------------
//                           8.13 Fragment Processing Functions
// -----------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------
//                           8.13.1 Derivative Functions
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER

#define GENERIC_FUNCTION_SET(genType) \
genType dFdx (genType p);\
genType dFdy (genType p);\
genType dFdxFine (genType p);\
genType dFdyFine (genType p);\
genType dFdxCoarse (genType p);\
genType dFdyCoarse (genType p);\
genType fwidth (genType p);\
genType fwidthFine (genType p);\
genType fwidthCoarse (genType p);

// genType is float, vec2, vec3, or vec4.
GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET

#endif // FRAGMENT_SHADER


// -----------------------------------------------------------------------------------
//                           8.13.2 Interpolation Functions
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




// -----------------------------------------------------------------------------------
//                           8.14 Noise Functions
// -----------------------------------------------------------------------------------
// all deprecated from now on

#if defined(VERTEX_SHADER) || defined(GEOMETRY_SHADER) || defined(FRAGMENT_SHADER)
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
#endif // defined(VERTEX_SHADER) || defined(GEOMETRY_SHADER) || defined(FRAGMENT_SHADER)


// -----------------------------------------------------------------------------------
//                           8.15 Geometry Shader Functions
// -----------------------------------------------------------------------------------

#ifdef GEOMETRY_SHADER

void EmitStreamVertex (int stream);
void EndStreamPrimitive(int stream);
void EmitVertex();
void EndPrimitive();

#endif // GEOMETRY_SHADER



// -----------------------------------------------------------------------------------
//                           8.16 Shader Invocation Control Functions
// -----------------------------------------------------------------------------------
void barrier();

// -----------------------------------------------------------------------------------
//                           8.17 Shader Memory Control Function
// -----------------------------------------------------------------------------------
void memoryBarrier();
void memoryBarrierAtomicCounter();
void memoryBarrierBuffer();
void memoryBarrierShared();
void memoryBarrierImage();
void groupMemoryBarrier();


// -----------------------------------------------------------------------------------
//                           8.18 Shader Invocation Group Functions
// -----------------------------------------------------------------------------------
bool anyInvocation (bool value);
bool allInvocations (bool value);
bool anyInvocationsEqual (bool value);










