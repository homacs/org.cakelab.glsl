/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 2.1
//                            Open GL Shading Language 
//                                    V 1.20
//                                 Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// include all builtin symbols of v 1.10 (core)
#include <core/V110/preamble.glsl>

// redefine version
#undef __VERSION__
#define __VERSION__ 120



/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
//                                    (changes only)
//
/////////////////////////////////////////////////////////////////////////////////////////////////



// -----------------------------------------------------------------------------------
//                           Varying Variables
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER
varying vec2 gl_PointCoord;
#endif // FRAGMENT_SHADER


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
//                                   (changes only)
//
/////////////////////////////////////////////////////////////////////////////////////////////////



// -----------------------------------------------------------------------------------
//                           Matrix Functions
// -----------------------------------------------------------------------------------
#define GENERIC_FUNCTION_SET(mat) \
mat matrixCompMult(mat x, mat y);

// adding only the new matrix types
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


mat2   transpose(mat2   m);
mat2x3 transpose(mat3x2 m);
mat2x4 transpose(mat4x2 m);

mat3x2 transpose(mat2x3 m);
mat3   transpose(mat3   m);
mat3x4 transpose(mat4x3 m);

mat4x2 transpose(mat2x4 m);
mat4x3 transpose(mat3x4 m);
mat4   transpose(mat4   m);





