/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.0
//                            Open GL Shading Language 
//                                    V 4.00
//                                  Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#ifndef GL_core_profile

#define __VERSION__ 400
#define GL_core_profile 1

//
// The following special macros are available only when parsing the preamble
//
#if !defined(VERTEX_SHADER)          \
 && !defined(TESS_CONTROL_SHADER)    \
 && !defined(TESS_EVALUATION_SHADER) \
 && !defined(FRAGMENT_SHADER)        \
 && !defined(GEOMETRY_SHADER)        \
 && !defined(COMPUTE_SHADER)         \
 && !defined(GENERIC_SHADER)
// and this error message is just a reminder when developing preambles
#error undefined or unsupported shader type!
#endif



#include <core/V400/variables.glsl>

#include <core/V400/functions.glsl>




#endif // GL_core_profile
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////


