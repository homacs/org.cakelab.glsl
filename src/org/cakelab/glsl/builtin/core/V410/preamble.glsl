/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.1
//                            Open GL Shading Language 
//                                    V 4.10
//                                  Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#ifndef GL_core_profile

#include <core/V400/preamble.glsl>
#undef __VERSION__


#define __VERSION__ 410


// Note: all symbols of core V400 included, just added new constants and variables


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                           7.1 Built-In Language Variables
// -----------------------------------------------------------------------------------

#ifdef GEOMETRY_SHADER
out int gl_ViewportIndex;

#endif // GL_compatibility_profile


// -----------------------------------------------------------------------------------
//                           7.3 Built-In Constants
// -----------------------------------------------------------------------------------

const int gl_MaxViewports = 16;
const int gl_MaxVertexUniformVectors = 256;
const int gl_MaxFragmentUniformVectors = 256;
const int gl_MaxVaryingVectors = 15;


#endif // GL_core_profile
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
