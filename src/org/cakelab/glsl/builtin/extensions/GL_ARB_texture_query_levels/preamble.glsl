/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_texture_query_levels
//                                 since GLSL v 1.30
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_texture_query_levels 1

#if __VERSION__ < 430



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

#if defined(__HAVE_CUBE_ARRAY)
GENERIC_FUNCTION_SET(samplerCubeArray)
#endif

int textureQueryLevels(sampler1DShadow);
int textureQueryLevels(sampler2DShadow);
int textureQueryLevels(samplerCubeShadow);
int textureQueryLevels(sampler1DArrayShadow);
int textureQueryLevels(sampler2DArrayShadow);

#if defined(__HAVE_CUBE_ARRAY)
int textureQueryLevels(samplerCubeArrayShadow);
#endif

#undef GENERIC_FUNCTION_SET


#endif // __VERSION__ < 450
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
