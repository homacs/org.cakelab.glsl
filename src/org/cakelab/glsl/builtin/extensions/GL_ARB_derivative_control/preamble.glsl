/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_derivative_control
//                                 since GLSL v 4.00
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_derivative_control 1

#if __VERSION__ < 450

// -----------------------------------------------------------------------------------
//                           8.13.1 Derivative Functions
// -----------------------------------------------------------------------------------
#ifdef FRAGMENT_SHADER

#define GENERIC_FUNCTION_SET(genType) \
genType dFdxFine (genType p);\
genType dFdyFine (genType p);\
genType dFdxCoarse (genType p);\
genType dFdyCoarse (genType p);\
genType fwidthFine (genType p);\
genType fwidthCoarse (genType p);

// genType is float, vec2, vec3, or vec4.
GENERIC_FUNCTION_SET(float)
GENERIC_FUNCTION_SET(vec2)
GENERIC_FUNCTION_SET(vec3)
GENERIC_FUNCTION_SET(vec4)

#undef GENERIC_FUNCTION_SET

#endif // FRAGMENT_SHADER


#endif // __VERSION__ < 450
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
