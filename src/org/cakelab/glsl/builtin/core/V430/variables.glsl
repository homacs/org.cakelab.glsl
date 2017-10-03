
/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.3
//                            Open GL Shading Language 
//                                    V 4.30
//                                  Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//                                    (changes only)
/////////////////////////////////////////////////////////////////////////////////////////////////

// include all variables from previous version
#include <core/V420/variables.glsl>



// -----------------------------------------------------------------------------------
//                           7.1 Built-In Language Variables
// -----------------------------------------------------------------------------------

#ifdef COMPUTE_SHADER
// work group dimensions
in    uvec3 gl_NumWorkGroups;
const uvec3 gl_WorkGroupSize;
// work group and invocation IDs
in    uvec3 gl_WorkGroupID;
in    uvec3 gl_LocalInvocationID;
// derived variables
in    uvec3 gl_GlobalInvocationID;
in    uint  gl_LocalInvocationIndex;
#elif defined(FRAGMENT_SHADER)
in  int   gl_Layer;
in  int   gl_ViewportIndex;
#endif


// -----------------------------------------------------------------------------------
//                           7.3 Built-In Constants
// -----------------------------------------------------------------------------------
const ivec3 gl_MaxComputeWorkGroupCount = { 65535, 65535, 65535 };
const ivec3 gl_MaxComputeWorkGroupSize = { 1024, 1024, 64 };
const int gl_MaxComputeUniformComponents = 1024;
const int gl_MaxComputeTextureImageUnits = 16;
const int gl_MaxComputeImageUniforms = 8;
const int gl_MaxComputeAtomicCounters = 8;
const int gl_MaxComputeAtomicCounterBuffers = 1;













