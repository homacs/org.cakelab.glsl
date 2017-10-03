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


#ifndef GL_core_profile
#error requires GL_core_profile to be defined
#endif

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//                                    (changes only)
/////////////////////////////////////////////////////////////////////////////////////////////////

// include all functions of previous version
#include <core/V420/functions.glsl>



// -----------------------------------------------------------------------------------
//                           8.9.1 Texture Query Functions
// -----------------------------------------------------------------------------------
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




// -----------------------------------------------------------------------------------
//                           8.9.2 Texel Lookup Functions
// -----------------------------------------------------------------------------------
float textureOffset (sampler2DArrayShadow sampler, vec4 P, vec2 offset);


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




// -----------------------------------------------------------------------------------
//                           8.17 Shader Memory Control Functions
// -----------------------------------------------------------------------------------
void memoryBarrierAtomicCounter();
void memoryBarrierBuffer();
void memoryBarrierShared();
void memoryBarrierImage();
void groupMemoryBarrier();










