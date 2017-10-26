/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_texture_query_lod
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 400



//   ------  textureQueryLod(sampler, P)   -------
#ifdef FRAGMENT_SHADER
#define GENERIC_textureQueryLod(SAMPLER_TYPE, P_TYPE)       \
vec2 textureQueryLod(     SAMPLER_TYPE sampler, P_TYPE P);  \
vec2 textureQueryLod(i ## SAMPLER_TYPE sampler, P_TYPE P);  \
vec2 textureQueryLod(u ## SAMPLER_TYPE sampler, P_TYPE P);  

GENERIC_textureQueryLod(sampler1D,        float)
GENERIC_textureQueryLod(sampler2D,        vec2)
GENERIC_textureQueryLod(sampler3D,        vec3)
GENERIC_textureQueryLod(samplerCube,      vec3)
GENERIC_textureQueryLod(sampler1DArray,   float)
GENERIC_textureQueryLod(sampler2DArray,   vec2)
#ifdef HAVE_SAMPLER_CUBE_ARRAY
GENERIC_textureQueryLod(samplerCubeArray, vec3)
#endif

#undef GENERIC_textureQueryLod

vec2 textureQueryLod(sampler1DShadow sampler, float P);
vec2 textureQueryLod(sampler2DShadow sampler, vec2 P);
vec2 textureQueryLod(samplerCubeShadow sampler, vec3 P);
vec2 textureQueryLod(sampler1DArrayShadow sampler, float P);
vec2 textureQueryLod(sampler2DArrayShadow sampler, vec2 P);
#ifdef HAVE_SAMPLER_CUBE_ARRAY
vec2 textureQueryLod(samplerCubeArrayShadow sampler, vec3 P);
#endif

#endif // FRAGMENT_SHADER

#endif // __VERSION__ < 450
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
