/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_gpu_shader_int64
//                                 since GLSL v 4.00
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////



// -----------------------------------------------------------------------------------
//                           8.3 Common Functions
// -----------------------------------------------------------------------------------
#define GEN_COMMON_FUNCTIONS(GTYPE, SCALAR_TYPE, BTYPE) \
GTYPE abs(GTYPE x); \
GTYPE sign(GTYPE x); \
GTYPE min(GTYPE x, GTYPE y);\
GTYPE min(GTYPE x, SCALAR_TYPE y); \
GTYPE max(GTYPE x, GTYPE y);\
GTYPE max(GTYPE x, SCALAR_TYPE y); \
GTYPE clamp(GTYPE x, GTYPE minVal, GTYPE maxVal); \
GTYPE clamp(GTYPE x, SCALAR_TYPE minVal, SCALAR_TYPE maxVal); \
GTYPE mix(GTYPE x, GTYPE y, BTYPE a);


GEN_COMMON_FUNCTIONS(int64_t, int64_t, bool)
GEN_COMMON_FUNCTIONS(i64vec2, int64_t, bvec2)
GEN_COMMON_FUNCTIONS(i64vec3, int64_t, bvec3)
GEN_COMMON_FUNCTIONS(i64vec4, int64_t, bvec4)

GEN_COMMON_FUNCTIONS(uint64_t, uint64_t, bool)
GEN_COMMON_FUNCTIONS(u64vec2, uint64_t, bool)
GEN_COMMON_FUNCTIONS(u64vec3, uint64_t, bool)
GEN_COMMON_FUNCTIONS(u64vec4, uint64_t, bool)


#undef GEN_COMMON_FUNCTIONS

#if HAVE_DOUBLE
int64_t doubleBitsToInt64(double value);
i64vec2 doubleBitsToInt64(dvec2 value);
i64vec3 doubleBitsToInt64(dvec3 value);
i64vec4 doubleBitsToInt64(dvec4 value);

uint64_t doubleBitsToUint64(double value);
u64vec2   doubleBitsToUint64(dvec2 value);
u64vec3   doubleBitsToUint64(dvec3 value);
u64vec4   doubleBitsToUint64(dvec4 value);

double int64BitsToDouble(int64_t value);
dvec2  int64BitsToDouble(i64vec2 value);
dvec3  int64BitsToDouble(i64vec3 value);
dvec4  int64BitsToDouble(i64vec4 value);

double uint64BitsToDouble(uint64_t value);
dvec2  uint64BitsToDouble(u64vec2 value);
dvec3  uint64BitsToDouble(u64vec3 value);
dvec4  uint64BitsToDouble(u64vec4 value);
#endif // HAVE_DOUBLE


// -----------------------------------------------------------------------------------
//                           8.4 Floating-Point Pack and Unpack Functions
// -----------------------------------------------------------------------------------
int64_t packInt2x32(ivec2 v);
uint64_t packUint2x32(uvec2 v);

ivec2 unpackInt2x32(int64_t v);
uvec2 unpackUint2x32(uint64_t v);




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

GENERIC_FUNCTION_SET(bvec2, i64vec2)
GENERIC_FUNCTION_SET(bvec3, i64vec3)
GENERIC_FUNCTION_SET(bvec4, i64vec4)

GENERIC_FUNCTION_SET(bvec2, u64vec2)
GENERIC_FUNCTION_SET(bvec3, u64vec3)
GENERIC_FUNCTION_SET(bvec4, u64vec4)


#undef GENERIC_FUNCTION_SET



//////////////////////////////////////////////////////////////////////////////////////
//                               F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
