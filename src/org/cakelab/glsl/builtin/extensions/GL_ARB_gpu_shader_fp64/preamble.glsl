/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_gpu_shader_fp64
//                                 since GLSL v 1.50
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////



#if __VERSION < 400


// -----------------------------------------------------------------------------------
//                           8.2 Exponential Functions
// -----------------------------------------------------------------------------------



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
double fma (double a, double b, double c);
dvec2 fma (dvec2 a, dvec2 b, dvec2 c);
dvec3 fma (dvec3 a, dvec3 b, dvec3 c);
dvec4 fma (dvec4 a, dvec4 b, dvec4 c);

double frexp (double x, out double exp);
dvec2 frexp (dvec2 x, out dvec2 exp);
dvec3 frexp (dvec3 x, out dvec3 exp);
dvec4 frexp (dvec4 x, out dvec4 exp);

double ldexp (double x, in double exp);
dvec2 ldexp (dvec2 x, in dvec2 exp);
dvec3 ldexp (dvec3 x, in dvec3 exp);
dvec4 ldexp (dvec4 x, in dvec4 exp);

double abs(double x);
dvec2 abs(dvec2 x);
dvec3 abs(dvec3 x);
dvec4 abs(dvec4 x);

double sign(double x);
dvec2 sign(dvec2 x);
dvec3 sign(dvec3 x);
dvec4 sign(dvec4 x);

double floor(double x);
dvec2 floor(dvec2 x);
dvec3 floor(dvec3 x);
dvec4 floor(dvec4 x);

double trunc(double x);
dvec2 trunc(dvec2 x);
dvec3 trunc(dvec3 x);
dvec4 trunc(dvec4 x);

double round(double x);
dvec2 round(dvec2 x);
dvec3 round(dvec3 x);
dvec4 round(dvec4 x);

double roundEven(double x);
dvec2 roundEven(dvec2 x);
dvec3 roundEven(dvec3 x);
dvec4 roundEven(dvec4 x);

double ceil(double x);
dvec2 ceil(dvec2 x);
dvec3 ceil(dvec3 x);
dvec4 ceil(dvec4 x);

double fract(double x);
dvec2 fract(dvec2 x);
dvec3 fract(dvec3 x);
dvec4 fract(dvec4 x);

double mod(double x, double y);
dvec2 mod(dvec2 x, double y);
dvec3 mod(dvec3 x, double y);
dvec4 mod(dvec4 x, double y);
dvec2 mod(dvec2 x, dvec2 y);
dvec3 mod(dvec3 x, dvec3 y);
dvec4 mod(dvec4 x, dvec4 y);

double modf(double x, out double i);
dvec2 modf(dvec2 x, out dvec2 i);
dvec3 modf(dvec3 x, out dvec3 i);
dvec4 modf(dvec4 x, out dvec4 i);

double min(double x, double y);
dvec2 min(dvec2 x, dvec2 y);
dvec3 min(dvec3 x, dvec3 y);
dvec4 min(dvec4 x, dvec4 y);
dvec2 min(dvec2 x, double y);
dvec3 min(dvec3 x, double y);
dvec4 min(dvec4 x, double y);

double max(double x, double y);
dvec2 max(dvec2 x, dvec2 y);
dvec3 max(dvec3 x, dvec3 y);
dvec4 max(dvec4 x, dvec4 y);
dvec2 max(dvec2 x, double y);
dvec3 max(dvec3 x, double y);
dvec4 max(dvec4 x, double y);

double clamp(double x, double minVal, double maxVal);
dvec2 clamp(dvec2 x, dvec2 minVal, dvec2 maxVal);
dvec3 clamp(dvec3 x, dvec3 minVal, dvec3 maxVal);
dvec4 clamp(dvec4 x, dvec4 minVal, dvec4 maxVal);
dvec2 clamp(dvec2 x, double minVal, double maxVal);
dvec3 clamp(dvec3 x, double minVal, double maxVal);
dvec4 clamp(dvec4 x, double minVal, double maxVal);

double mix(double x, double y, double a);
dvec2 mix(dvec2 x, dvec2 y, dvec2 a);
dvec3 mix(dvec3 x, dvec3 y, dvec3 a);
dvec4 mix(dvec4 x, dvec4 y, dvec4 a);
dvec2 mix(dvec2 x, dvec2 y, double a);
dvec3 mix(dvec3 x, dvec3 y, double a);
dvec4 mix(dvec4 x, dvec4 y, double a);

double mix(double x, double y, bool a);
dvec2 mix(dvec2 x, dvec2 y, bvec2 a);
dvec3 mix(dvec3 x, dvec3 y, bvec3 a);
dvec4 mix(dvec4 x, dvec4 y, bvec4 a);

double step(double edge, double x);
dvec2 step(dvec2  edge, dvec2 x);
dvec3 step(dvec3  edge, dvec3 x);
dvec4 step(dvec4  edge, dvec4 x);
dvec2 step(double edge, dvec2 x);
dvec3 step(double edge, dvec3 x);
dvec4 step(double edge, dvec4 x);

double smoothstep(double edge0, double edge1, double x);
dvec2 smoothstep(dvec2 edge0, dvec2 edge1, dvec2 x);
dvec3 smoothstep(dvec3 edge0, dvec3 edge1, dvec3 x);
dvec4 smoothstep(dvec4 edge0, dvec4 edge1, dvec4 x);
dvec2 smoothstep(double edge0, double edge1, vec2 x);
dvec3 smoothstep(double edge0, double edge1, vec3 x);
dvec4 smoothstep(double edge0, double edge1, vec4 x);

bool isnan (double x);
bvec2 isnan (dvec2 x);
bvec3 isnan (dvec3 x);
bvec4 isnan (dvec4 x);

bool isinf(double x);
bvec2 isinf(dvec2 x);
bvec3 isinf(dvec3 x);
bvec4 isinf(dvec4 x);



// -----------------------------------------------------------------------------------
//                           8.4 Floating-Point Pack and Unpack Functions
// -----------------------------------------------------------------------------------

double packDouble2x32 (uvec2 v);

uvec2 unpackDouble2x32 (double v);



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

dvec3 cross(dvec3 x, dvec3 y);

GENERIC_FUNCTION_SET(double, double)
GENERIC_FUNCTION_SET(double, dvec2)
GENERIC_FUNCTION_SET(double, dvec3)
GENERIC_FUNCTION_SET(double, dvec4)

#undef GENERIC_FUNCTION_SET



// -----------------------------------------------------------------------------------
//                           8.6 Matrix Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(mat) \
mat matrixCompMult(mat x, mat y);

GENERIC_FUNCTION_SET(dmat2)
GENERIC_FUNCTION_SET(dmat3)
GENERIC_FUNCTION_SET(dmat4)

GENERIC_FUNCTION_SET(dmat2x2)
GENERIC_FUNCTION_SET(dmat2x3)
GENERIC_FUNCTION_SET(dmat2x4)

GENERIC_FUNCTION_SET(dmat3x2)
GENERIC_FUNCTION_SET(dmat3x3)
GENERIC_FUNCTION_SET(dmat3x4)

GENERIC_FUNCTION_SET(dmat4x2)
GENERIC_FUNCTION_SET(dmat4x3)
GENERIC_FUNCTION_SET(dmat4x4)

#undef GENERIC_FUNCTION_SET


dmat2   outerProduct(dvec2 c, dvec2 r);
dmat2x3 outerProduct(dvec2 c, dvec3 r);
dmat2x4 outerProduct(dvec2 c, dvec4 r);
dmat3x2 outerProduct(dvec3 c, dvec2 r);
dmat3   outerProduct(dvec3 c, dvec3 r);
dmat3x4 outerProduct(dvec3 c, dvec4 r);
dmat4x2 outerProduct(dvec4 c, dvec2 r);
dmat4x3 outerProduct(dvec4 c, dvec3 r);
dmat4   outerProduct(dvec4 c, dvec4 r);

dmat2 transpose(dmat2 m);
dmat3 transpose(dmat3 m);
dmat4 transpose(dmat4 m);
dmat2x3 transpose(dmat3x2 m);
dmat3x2 transpose(dmat2x3 m);
dmat2x4 transpose(dmat4x2 m);
dmat4x2 transpose(dmat2x4 m);
dmat3x4 transpose(dmat4x3 m);
dmat4x3 transpose(dmat3x4 m);

double determinant(dmat2 m);
double determinant(dmat3 m);
double determinant(dmat4 m);

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

GENERIC_FUNCTION_SET(bvec2, dvec2)
GENERIC_FUNCTION_SET(bvec3, dvec3)
GENERIC_FUNCTION_SET(bvec4, dvec4)

#undef GENERIC_FUNCTION_SET




#endif // __VERSION < 400
//////////////////////////////////////////////////////////////////////////////////////
//                               F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
