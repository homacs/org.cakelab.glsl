/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_sparse_texture2
//                                 since GLSL v 1.10
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


//   ------  sparseTextureARB(sampler, p [, bias])   -------
#define GEN_sparseTextureARB(FIRST, SECOND, THIRD)\
int sparseTextureARB(FIRST sampler, SECOND P, out THIRD texel);\
int sparseTextureARB(FIRST sampler, SECOND P, out THIRD texel, float bias);

#define GEN_sparseTextureARB_I_U(FIRST, SECOND, THIRD)\
GEN_sparseTextureARB(     FIRST, SECOND,      THIRD)\
GEN_sparseTextureARB(i ## FIRST, SECOND, i ## THIRD)\
GEN_sparseTextureARB(u ## FIRST, SECOND, u ## THIRD)


GEN_sparseTextureARB_I_U(sampler2D, vec2, vec4)
GEN_sparseTextureARB_I_U(sampler3D, vec3, vec4)
GEN_sparseTextureARB_I_U(samplerCube, vec3, vec4)

GEN_sparseTextureARB(sampler2DShadow, vec3, float)
GEN_sparseTextureARB(samplerCubeShadow, vec4, float)

GEN_sparseTextureARB_I_U(sampler2DArray, vec3, vec4)
#ifdef __HAVE_CUBE_ARRAY
GEN_sparseTextureARB_I_U(samplerCubeArray, vec4, vec4)
#endif
int sparseTextureARB(sampler2DArrayShadow sampler, vec4 P, out float texel);
int sparseTextureARB(sampler2DRect sampler, vec2 P, out vec4 texel);
int sparseTextureARB(isampler2DRect sampler, vec2 P, out ivec4 texel);
int sparseTextureARB(usampler2DRect sampler, vec2 P, out uvec4 texel);
int sparseTextureARB(sampler2DRectShadow sampler, vec3 P, out float texel);
#ifdef __HAVE_CUBE_ARRAY
int sparseTextureARB(samplerCubeArrayShadow sampler, vec4 P, float compare, out float texel);
#endif

#undef GEN_sparseTextureARB
#undef GEN_sparseTextureARB_I_U

//   ------  sparseTextureLodARB(sampler, p, lod, texel)   -------
#define GEN_sparseTextureLodARB_I_U(SAMPLER_TYPE, P_TYPE)\
int sparseTextureLodARB(     SAMPLER_TYPE sampler, P_TYPE P, float lod, out  vec4 texel); \
int sparseTextureLodARB(i ## SAMPLER_TYPE sampler, P_TYPE P, float lod, out ivec4 texel); \
int sparseTextureLodARB(u ## SAMPLER_TYPE sampler, P_TYPE P, float lod, out uvec4 texel);

GEN_sparseTextureLodARB_I_U(sampler2D, vec2)
GEN_sparseTextureLodARB_I_U(sampler3D, vec3)
GEN_sparseTextureLodARB_I_U(samplerCube, vec3)
int sparseTextureLodARB(sampler2DShadow sampler, vec3 P, float lod, out float texel);
GEN_sparseTextureLodARB_I_U(sampler2DArray, vec3)
#ifdef __HAVE_CUBE_ARRAY
GEN_sparseTextureLodARB_I_U(samplerCubeArray, vec4)
#endif

#undef GEN_sparseTextureLodARB_I_U


//   ------  sparseTextureOffsetARB(sampler, p, offset, texel [,bias])   -------

#define GEN_sparseTextureOffsetARB(FIRST, SECOND, THIRD, FOURTH)\
int sparseTextureOffsetARB(FIRST sampler, SECOND P, THIRD offset, out FOURTH texel);\
int sparseTextureOffsetARB(FIRST sampler, SECOND P, THIRD offset, out FOURTH texel, float bias);

#define GEN_sparseTextureOffsetARB_I_U(FIRST, SECOND, THIRD)\
GEN_sparseTextureOffsetARB(     FIRST, SECOND, THIRD, vec4)\
GEN_sparseTextureOffsetARB(i ## FIRST, SECOND, THIRD, ivec4)\
GEN_sparseTextureOffsetARB(u ## FIRST, SECOND, THIRD, uvec4)

GEN_sparseTextureOffsetARB_I_U(sampler2D, vec2, ivec2)
GEN_sparseTextureOffsetARB_I_U(sampler3D, vec3, ivec3)
GEN_sparseTextureOffsetARB_I_U(sampler2DRect, vec2, ivec2)
int sparseTextureOffsetARB(sampler2DRectShadow sampler, vec3 P,
                                 ivec2 offset, out float texel);
GEN_sparseTextureOffsetARB(sampler2DShadow, vec3, ivec2, float)
GEN_sparseTextureOffsetARB_I_U(sampler2DArray, vec3, ivec2)

int sparseTextureOffsetARB(sampler2DArrayShadow sampler, vec4 P,
                                 ivec2 offset, out float texel);


#undef GEN_sparseTextureOffsetARB_I_U
#undef GEN_sparseTextureOffsetARB

//   ------  sparseTexelFetchARB(sampler, P, lod, texel)
#define GEN_sparseTexelFetchARB(SAMPLER_TYPE, ...) \
int sparseTexelFetchARB(     SAMPLER_TYPE sampler, __VA_ARGS__, out  vec4 texel); \
int sparseTexelFetchARB(i ## SAMPLER_TYPE sampler, __VA_ARGS__, out ivec4 texel); \
int sparseTexelFetchARB(u ## SAMPLER_TYPE sampler, __VA_ARGS__, out uvec4 texel);

GEN_sparseTexelFetchARB(sampler2D, ivec2 P, int lod)
GEN_sparseTexelFetchARB(sampler3D, ivec3 P, int lod)
GEN_sparseTexelFetchARB(sampler2DRect, ivec2 P, int lod)
GEN_sparseTexelFetchARB(sampler2DArray, ivec3 P, int lod)
GEN_sparseTexelFetchARB(sampler2DMS, ivec2 P, int _sample)
GEN_sparseTexelFetchARB(sampler2DMSArray, ivec3 P, int _sample)


#undef GEN_sparseTexelFetchARB

//   ------  sparseTexelFetchOffsetARB(sampler, P, lod, offset, texel)
#define GEN_sparseTexelFetchOffsetARB(SAMPLER_TYPE, ...) \
int sparseTexelFetchOffsetARB(     SAMPLER_TYPE sampler, __VA_ARGS__, out  vec4 texel); \
int sparseTexelFetchOffsetARB(i ## SAMPLER_TYPE sampler, __VA_ARGS__, out ivec4 texel); \
int sparseTexelFetchOffsetARB(u ## SAMPLER_TYPE sampler, __VA_ARGS__, out uvec4 texel);

GEN_sparseTexelFetchOffsetARB(sampler2D, ivec2 P, int lod, ivec2 offset)
GEN_sparseTexelFetchOffsetARB(sampler3D, ivec3 P, int lod, ivec3 offset)
GEN_sparseTexelFetchOffsetARB(sampler2DRect, ivec2 P, ivec2 offset)
GEN_sparseTexelFetchOffsetARB(sampler2DArray, ivec3 P, int lod, ivec2 offset)

#undef GEN_sparseTexelFetchOffsetARB



//   ------  sparseTextureLodOffsetARB(sampler, P, lod, offset, texel)
#define GEN_sparseTextureLodOffsetARB(SAMPLER_TYPE, ...) \
int sparseTextureLodOffsetARB(     SAMPLER_TYPE sampler, __VA_ARGS__, out  vec4 texel); \
int sparseTextureLodOffsetARB(i ## SAMPLER_TYPE sampler, __VA_ARGS__, out ivec4 texel); \
int sparseTextureLodOffsetARB(u ## SAMPLER_TYPE sampler, __VA_ARGS__, out uvec4 texel);

GEN_sparseTextureLodOffsetARB(sampler2D, vec2 P, float lod, ivec2 offset)
GEN_sparseTextureLodOffsetARB(sampler3D, vec3 P, float lod, ivec3 offset)
int sparseTextureLodOffsetARB(sampler2DShadow sampler, vec3 P, float lod, ivec2 offset, out float texel);
GEN_sparseTextureLodOffsetARB(sampler2DArray, vec3 P, float lod, ivec2 offset)

#undef GEN_sparseTextureLodOffsetARB



//   ------  sparseTextureGradARB(sampler, P, dPdx, dPdy, texel)
#define GEN_sparseTextureGradARB(SAMPLER_TYPE, P_TYPE, DP_TYPE) \
int sparseTextureGradARB(     SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, out  vec4 texel); \
int sparseTextureGradARB(i ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, out ivec4 texel); \
int sparseTextureGradARB(u ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, out uvec4 texel);

GEN_sparseTextureGradARB(sampler2D, vec2, vec2)
GEN_sparseTextureGradARB(sampler3D, vec3, vec3)
GEN_sparseTextureGradARB(samplerCube, vec3, vec3)
GEN_sparseTextureGradARB(sampler2DRect, vec2, vec2)
int sparseTextureGradARB(sampler2DRectShadow sampler, vec3 P,
                               vec2 dPdx, vec2 dPdy,
                               out float texel);
int sparseTextureGradARB(sampler2DShadow sampler, vec3 P,
                               vec2 dPdx, vec2 dPdy,
                               out float texel);
int sparseTextureGradARB(samplerCubeShadow sampler, vec4 P,
                               vec3 dPdx, vec3 dPdy,
                               out float texel);
GEN_sparseTextureGradARB(sampler2DArray, vec3, vec2)
int sparseTextureGradARB(sampler2DArrayShadow sampler, vec4 P,
                               vec2 dPdx, vec2 dPdy,
                               out float texel);
#ifdef __HAVE_CUBE_ARRAY
GEN_sparseTextureGradARB(samplerCubeArray, vec4, vec3)
#endif

#undef GEN_sparseTextureGradARB


//   ------  sparseTextureGradOffsetARB(sampler, P, dPdx, dPdy, offset, texel)
#define GEN_sparseTextureGradOffsetARB(SAMPLER_TYPE, P_TYPE, DP_TYPE, OFFSET_TYPE) \
int sparseTextureGradOffsetARB(     SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, out  vec4 texel); \
int sparseTextureGradOffsetARB(i ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, out ivec4 texel); \
int sparseTextureGradOffsetARB(u ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, out uvec4 texel);

GEN_sparseTextureGradOffsetARB(sampler2D, vec2, vec2, ivec2)
GEN_sparseTextureGradOffsetARB(sampler3D, vec3, vec3, ivec3)
GEN_sparseTextureGradOffsetARB(sampler2DRect, vec2, vec2, ivec2)
int sparseTextureGradOffsetARB(sampler2DRectShadow sampler, vec3 P,
                                     vec2 dPdx, vec2 dPdy, ivec2 offset,
                                     out float texel);
int sparseTextureGradOffsetARB(sampler2DShadow sampler, vec3 P,
                                     vec2 dPdx, vec2 dPdy, ivec2 offset,
                                     out float texel);
GEN_sparseTextureGradOffsetARB(sampler2DArray, vec3, vec2, ivec2)
int sparseTextureGradOffsetARB(sampler2DArrayShadow sampler, vec4 P,
                                     vec2 dPdx, vec2 dPdy, ivec2 offset,
                                     out float texel);

#undef GEN_sparseTextureGradOffsetARB

//   ------  sparseTextureGatherARB(sampler, P,  texel [, comp]);
#define GEN_sparseTextureGatherARB_comp(SAMPLER_TYPE, P_TYPE) \
int sparseTextureGatherARB(     SAMPLER_TYPE sampler, P_TYPE P, out  vec4 texel); \
int sparseTextureGatherARB(i ## SAMPLER_TYPE sampler, P_TYPE P, out ivec4 texel); \
int sparseTextureGatherARB(u ## SAMPLER_TYPE sampler, P_TYPE P, out uvec4 texel); \
int sparseTextureGatherARB(     SAMPLER_TYPE sampler, P_TYPE P, out  vec4 texel, int comp); \
int sparseTextureGatherARB(i ## SAMPLER_TYPE sampler, P_TYPE P, out ivec4 texel, int comp); \
int sparseTextureGatherARB(u ## SAMPLER_TYPE sampler, P_TYPE P, out uvec4 texel, int comp);

GEN_sparseTextureGatherARB_comp(sampler2D,vec2)
GEN_sparseTextureGatherARB_comp(sampler2DArray,vec3)
GEN_sparseTextureGatherARB_comp(samplerCube,vec3)
#ifdef __HAVE_CUBE_ARRAY
GEN_sparseTextureGatherARB_comp(samplerCubeArray,vec4)
#endif
GEN_sparseTextureGatherARB_comp(sampler2DRect,vec2)

int sparseTextureGatherARB(sampler2DShadow sampler, vec2 P,
                                 float refZ, out vec4 texel);
int sparseTextureGatherARB(sampler2DArrayShadow sampler, vec3 P,
                                 float refZ, out vec4 texel);
int sparseTextureGatherARB(samplerCubeShadow sampler, vec3 P,
                                 float refZ, out vec4 texel);
                                 
#ifdef __HAVE_CUBE_ARRAY
int sparseTextureGatherARB(samplerCubeArrayShadow sampler, vec4 P,
                                 float refZ, out vec4 texel);
#endif
int sparseTextureGatherARB(sampler2DRectShadow sampler, vec2 P,
                                 float refZ, out vec4 texel);


#undef GEN_sparseTextureGatherARB_comp

//   ------  sparseTextureGatherOffsetARB(sampler, P, offset, texel[, comp])
#define GEN_sparseTextureGatherOffsetARB_comp(SAMPLER_TYPE, P_TYPE, OFFSET_TYPE) \
int sparseTextureGatherOffsetARB(     SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, out  vec4 texel); \
int sparseTextureGatherOffsetARB(i ## SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, out ivec4 texel); \
int sparseTextureGatherOffsetARB(u ## SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, out uvec4 texel); \
int sparseTextureGatherOffsetARB(     SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, out  vec4 texel, int comp); \
int sparseTextureGatherOffsetARB(i ## SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, out ivec4 texel, int comp); \
int sparseTextureGatherOffsetARB(u ## SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, out uvec4 texel, int comp);

GEN_sparseTextureGatherOffsetARB_comp(sampler2D, vec2, ivec2)
GEN_sparseTextureGatherOffsetARB_comp(sampler2DArray, vec3, ivec2)
GEN_sparseTextureGatherOffsetARB_comp(sampler2DRect, vec2, ivec2)
int sparseTextureGatherOffsetARB(sampler2DShadow sampler, vec2 P,
                                       float refZ, ivec2 offset,
                                       out vec4 texel);
int sparseTextureGatherOffsetARB(sampler2DArrayShadow sampler, vec3 P,
                                       float refZ, ivec2 offset,
                                       out vec4 texel);
int sparseTextureGatherOffsetARB(sampler2DRectShadow sampler, vec2 P,
                                       float refZ, ivec2 offset,
                                       out vec4 texel);

#undef GEN_sparseTextureGatherOffsetARB_comp


//   ------  sparseTextureGatherOffsetsARB(sampler, P, offsets, texel[, comp])
#define GEN_sparseTextureGatherOffsetsARB(SAMPLER_TYPE, P_TYPE) \
int sparseTextureGatherOffsetsARB(     SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], out  vec4 texel);\
int sparseTextureGatherOffsetsARB(i ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], out ivec4 texel);\
int sparseTextureGatherOffsetsARB(u ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], out uvec4 texel);\
int sparseTextureGatherOffsetsARB(     SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], out  vec4 texel, int comp);\
int sparseTextureGatherOffsetsARB(i ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], out ivec4 texel, int comp);\
int sparseTextureGatherOffsetsARB(u ## SAMPLER_TYPE sampler, P_TYPE P, ivec2 offsets[4], out uvec4 texel, int comp);

GEN_sparseTextureGatherOffsetsARB(sampler2D,vec2)
GEN_sparseTextureGatherOffsetsARB(sampler2DArray,vec3)
GEN_sparseTextureGatherOffsetsARB(sampler2DRect,vec2)
int sparseTextureGatherOffsetsARB(sampler2DShadow sampler, vec2 P,
                                        float refZ, ivec2 offsets[4],
                                        out vec4 texel);
int sparseTextureGatherOffsetsARB(sampler2DArrayShadow sampler, vec3 P,
                                        float refZ, ivec2 offsets[4],
                                        out vec4 texel);
int sparseTextureGatherOffsetsARB(sampler2DRectShadow sampler, vec2 P,
                                        float refZ, ivec2 offsets[4],
                                        out vec4 texel);

#undef GEN_sparseTextureGatherOffsetsARB


#if __VERSION__ >= 450

//   ------  sparseImageLoadARB(image, P, texel)
#define GEN_sparseImageLoadARB(IMAGE_TYPE, ...) \
int sparseImageLoadARB(     IMAGE_TYPE image, __VA_ARGS__, out vec4 texel);\
int sparseImageLoadARB(i ## IMAGE_TYPE image, __VA_ARGS__, out ivec4 texel);\
int sparseImageLoadARB(u ## IMAGE_TYPE image, __VA_ARGS__, out uvec4 texel);

GEN_sparseImageLoadARB(image2D,ivec2 P)
GEN_sparseImageLoadARB(image3D,ivec3 P)
GEN_sparseImageLoadARB(image2DRect,ivec2 P)
GEN_sparseImageLoadARB(imageCube,ivec3 P)
GEN_sparseImageLoadARB(image2DArray,ivec3 P)
GEN_sparseImageLoadARB(imageCubeArray,ivec3 P)
GEN_sparseImageLoadARB(image2DMS, ivec2 P, int _sample)
GEN_sparseImageLoadARB(image2DMSArray, ivec3 P, int _sample)


#undef GEN_sparseImageLoadARB


#endif
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
