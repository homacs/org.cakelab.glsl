/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_texture_gather
//                                 since GLSL v 1.30
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 400

//   ------  textureGather(sampler, P ...)
#define GEN__textureGather(SAMPLER_TYPE, P_TYPE)                  \
     vec4 textureGather(     SAMPLER_TYPE sampler, P_TYPE P);           \
i ## vec4 textureGather(i ## SAMPLER_TYPE sampler, P_TYPE P);           \
u ## vec4 textureGather(u ## SAMPLER_TYPE sampler, P_TYPE P);

GEN__textureGather(sampler2D,                      vec2)
GEN__textureGather(sampler2DArray,                 vec3)
GEN__textureGather(samplerCube,                    vec3)

#ifdef __HAVE_CUBE_ARRAY
GEN__textureGather(samplerCubeArray,               vec4)
#endif

#undef GEN__textureGather

#endif



//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
