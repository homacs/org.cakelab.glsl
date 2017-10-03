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

#define __VERSION__ 450
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





/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include <core/V450/variables.glsl>


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include <core/V450/functions.glsl>










#endif // GL_core_profile
