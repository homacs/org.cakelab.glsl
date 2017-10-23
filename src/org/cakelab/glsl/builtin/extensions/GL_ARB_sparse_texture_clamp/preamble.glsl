/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_sparse_texture_clamp
//                                 since GLSL v 4.50
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////



// -----------------------------------------------------------------------------------
//                           8.9.2 Texel Lookup Functions
// -----------------------------------------------------------------------------------


//   ------  sparseTextureClampARB(sampler, p, lodClamp, texel[, bias])   -------
#define GEN_sparseTextureClampARB(SAMPLER_TYPE, P_TYPE, TEXEL_TYPE) \
int sparseTextureClampARB(SAMPLER_TYPE sampler, P_TYPE P, float lodClamp, out TEXEL_TYPE texel); \
int sparseTextureClampARB(SAMPLER_TYPE sampler, P_TYPE P, float lodClamp, out TEXEL_TYPE texel, float bias);

#define GEN_sparseTextureClampARB_U_I(GSAMPLER_TYPE, P_TYPE) \
GEN_sparseTextureClampARB(     GSAMPLER_TYPE, P_TYPE,  vec4) \
GEN_sparseTextureClampARB(i ## GSAMPLER_TYPE, P_TYPE, ivec4) \
GEN_sparseTextureClampARB(u ## GSAMPLER_TYPE, P_TYPE, uvec4)

GEN_sparseTextureClampARB_U_I(sampler2D, vec2)
GEN_sparseTextureClampARB_U_I(sampler3D, vec3)
GEN_sparseTextureClampARB_U_I(samplerCube, vec3)

GEN_sparseTextureClampARB(sampler2DShadow, vec3, float)
GEN_sparseTextureClampARB(samplerCubeShadow, vec4, float)

GEN_sparseTextureClampARB_U_I(sampler2DArray, vec3)
#ifdef __HAVE_CUBE_ARRAY
GEN_sparseTextureClampARB_U_I(samplerCubeArray, vec4)
#endif    
int sparseTextureClampARB(sampler2DArrayShadow sampler, vec4 P ,                             float lodClamp, out float texel);
#ifdef __HAVE_CUBE_ARRAY
int sparseTextureClampARB(samplerCubeArrayShadow sampler, vec4 P ,                             float compare, float lodClamp ,                             out float texel);
#endif

#undef GEN_sparseTextureClampARB_U_I
#undef GEN_sparseTextureClampARB


//   ------  textureClampARB(sampler, P, lodClamp [, bias])
#define GEN_textureClampARB(RETURN_TYPE, SAMPLER_TYPE, P_TYPE) \
RETURN_TYPE textureClampARB(SAMPLER_TYPE sampler, P_TYPE P, float lodClamp); \
RETURN_TYPE textureClampARB(SAMPLER_TYPE sampler, P_TYPE P, float lodClamp, float bias);

#define GEN_textureClampARB_U_I(SAMPLER_TYPE, P_TYPE) \
GEN_textureClampARB( vec4,      SAMPLER_TYPE, P_TYPE) \
GEN_textureClampARB(ivec4, i ## SAMPLER_TYPE, P_TYPE) \
GEN_textureClampARB(uvec4, u ## SAMPLER_TYPE, P_TYPE)


GEN_textureClampARB_U_I(sampler1D, float)
GEN_textureClampARB_U_I(sampler2D, vec2)
GEN_textureClampARB_U_I(sampler3D, vec3)
GEN_textureClampARB_U_I(samplerCube, vec3)
GEN_textureClampARB(float, sampler1DShadow, vec3)
GEN_textureClampARB(float, sampler2DShadow, vec3)
GEN_textureClampARB(float, samplerCubeShadow, vec4)
GEN_textureClampARB_U_I(sampler1DArray, vec2)
GEN_textureClampARB_U_I(sampler2DArray, vec3)
#ifdef __HAVE_CUBE_ARRAY
GEN_textureClampARB_U_I(samplerCubeArray, vec4)
#endif
GEN_textureClampARB(float, sampler1DArrayShadow, vec3)
GEN_textureClampARB(float, sampler2DArrayShadow, vec4)
#ifdef __HAVE_CUBE_ARRAY
GEN_textureClampARB(float, samplerCubeArrayShadow, vec4)
#endif

#undef GEN_textureClampARB_U_I
#undef GEN_textureClampARB



//   ------  sparseTextureOffsetClampARB(gsampler2D sampler, vec2 P, offset, lodClamp, texel [, bias)

#define GEN_sparseTextureOffsetClampARB(SAMPLER_TYPE, P_TYPE, OFFSET_TYPE, TEXEL_TYPE) \
int sparseTextureOffsetClampARB(SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, float lodClamp, out TEXEL_TYPE texel); \
int sparseTextureOffsetClampARB(SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, float lodClamp, out TEXEL_TYPE texel, float bias);

#define GEN_sparseTextureOffsetClampARB_U_I(SAMPLER_TYPE, P_TYPE, OFFSET_TYPE) \
GEN_sparseTextureOffsetClampARB(     SAMPLER_TYPE, P_TYPE, OFFSET_TYPE,  vec4) \
GEN_sparseTextureOffsetClampARB(i ## SAMPLER_TYPE, P_TYPE, OFFSET_TYPE, ivec4) \
GEN_sparseTextureOffsetClampARB(u ## SAMPLER_TYPE, P_TYPE, OFFSET_TYPE, uvec4)

GEN_sparseTextureOffsetClampARB_U_I(sampler2D, vec2, ivec2)
GEN_sparseTextureOffsetClampARB_U_I(sampler3D, vec3, ivec3)
GEN_sparseTextureOffsetClampARB(sampler2DShadow, vec3, ivec2, float)
GEN_sparseTextureOffsetClampARB_U_I(sampler2DArray, vec3, ivec2)
int sparseTextureOffsetClampARB(sampler2DArrayShadow sampler, vec4 P, ivec2 offset, float lodClamp, out float texel);

#undef GEN_sparseTextureOffsetClampARB_U_I
#undef GEN_sparseTextureOffsetClampARB




//   ------  textureOffsetClampARB(sampler, P, offset, lodClamp [, bias]);
#define GEN_textureOffsetClampARB(RETURN_TYPE, SAMPLER_TYPE, P_TYPE, OFFSET_TYPE) \
RETURN_TYPE textureOffsetClampARB(SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, float lodClamp); \
RETURN_TYPE textureOffsetClampARB(SAMPLER_TYPE sampler, P_TYPE P, OFFSET_TYPE offset, float lodClamp, float bias);

#define GEN_textureOffsetClampARB_U_I(SAMPLER_TYPE, P_TYPE, OFFSET_TYPE) \
GEN_textureOffsetClampARB( vec4,      SAMPLER_TYPE, P_TYPE, OFFSET_TYPE) \
GEN_textureOffsetClampARB(ivec4, i ## SAMPLER_TYPE, P_TYPE, OFFSET_TYPE) \
GEN_textureOffsetClampARB(uvec4, u ## SAMPLER_TYPE, P_TYPE, OFFSET_TYPE)

GEN_textureOffsetClampARB_U_I(sampler1D, float, int)
GEN_textureOffsetClampARB_U_I(sampler2D, vec2, ivec2)
GEN_textureOffsetClampARB_U_I(sampler3D, vec3, ivec3)
GEN_textureOffsetClampARB(float, sampler1DShadow, vec3, int)
GEN_textureOffsetClampARB(float, sampler2DShadow, vec3, ivec2)
GEN_textureOffsetClampARB_U_I(sampler1DArray, vec2, int)
GEN_textureOffsetClampARB_U_I(sampler2DArray, vec3, ivec2)
GEN_textureOffsetClampARB(float, sampler1DArrayShadow, vec3, int)
float textureOffsetClampARB(sampler2DArrayShadow sampler, vec4 P, ivec2 offset, float lodClamp);

#undef GEN_textureOffsetClampARB_U_I
#undef GEN_textureOffsetClampARB


//   ------  sparseTextureGradClampARB(sampler, P, dPdx, dPdy, lodClamp, texel);
#define GEN_sparseTextureGradClampARB_U_I(SAMPLER_TYPE, P_TYPE, DB_TYPE) \
int sparseTextureGradClampARB(     SAMPLER_TYPE sampler, P_TYPE P, DB_TYPE dPdx, DB_TYPE dPdy, float lodClamp, out vec4 texel); \
int sparseTextureGradClampARB(i ## SAMPLER_TYPE sampler, P_TYPE P, DB_TYPE dPdx, DB_TYPE dPdy, float lodClamp, out ivec4 texel); \
int sparseTextureGradClampARB(u ## SAMPLER_TYPE sampler, P_TYPE P, DB_TYPE dPdx, DB_TYPE dPdy, float lodClamp, out uvec4 texel);

GEN_sparseTextureGradClampARB_U_I(sampler2D, vec2, vec2)
GEN_sparseTextureGradClampARB_U_I(sampler3D, vec3, vec3)
GEN_sparseTextureGradClampARB_U_I(samplerCube, vec3, vec3)
int sparseTextureGradClampARB(sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy, float lodClamp, out float texel);
int sparseTextureGradClampARB(samplerCubeShadow sampler, vec4 P, vec3 dPdx, vec3 dPdy, float lodClamp, out float texel);
GEN_sparseTextureGradClampARB_U_I(sampler2DArray, vec3, vec2)
int sparseTextureGradClampARB(sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, float lodClamp, out float texel);
#ifdef __HAVE_CUBE_ARRAY
GEN_sparseTextureGradClampARB_U_I(samplerCubeArray, vec4, vec3)
#endif

#undef GEN_sparseTextureGradClampARB_U_I


//   ------  textureGradClampARB(sampler, P, dPdx, dPdy, lodClamp);
#define GEN_textureGradClampARB_U_I(SAMPLER_TYPE, P_TYPE, DP_TYPE) \
 vec4 textureGradClampARB(     SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, float lodClamp); \
ivec4 textureGradClampARB(i ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, float lodClamp); \
uvec4 textureGradClampARB(u ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, float lodClamp);


GEN_textureGradClampARB_U_I(sampler1D, float, float)
GEN_textureGradClampARB_U_I(sampler2D, vec2, vec2)
GEN_textureGradClampARB_U_I(sampler3D, vec3, vec3)
GEN_textureGradClampARB_U_I(samplerCube, vec3, vec3)
float textureGradClampARB(sampler1DShadow sampler, vec3 P, float dPdx, float dPdy, float lodClamp);
float textureGradClampARB(sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy, float lodClamp);
float textureGradClampARB(samplerCubeShadow sampler, vec4 P, vec3 dPdx, vec3 dPdy, float lodClamp);
GEN_textureGradClampARB_U_I(sampler1DArray, vec2, float)
GEN_textureGradClampARB_U_I(sampler2DArray, vec3, vec2)
float textureGradClampARB(sampler1DArrayShadow sampler, vec3 P, float dPdx, float dPdy, float lodClamp);
float textureGradClampARB(sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, float lodClamp);
#ifdef __HAVE_CUBE_ARRAY
GEN_textureGradClampARB_U_I(samplerCubeArray, vec4, vec3)
#endif

#undef GEN_textureGradClampARB_U_I

//   ------  sparseTextureGradOffsetClampARB(sampler, P, dPdx, dPdy, offset, lodClamp, texel);
#define GEN_sparseTextureGradOffsetClampARB_I_U(SAMPLER_TYPE, P_TYPE, DP_TYPE, OFFSET_TYPE) \
int sparseTextureGradOffsetClampARB(     SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, float lodClamp, out  vec4 texel); \
int sparseTextureGradOffsetClampARB(i ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, float lodClamp, out ivec4 texel); \
int sparseTextureGradOffsetClampARB(u ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, float lodClamp, out uvec4 texel);

GEN_sparseTextureGradOffsetClampARB_I_U(sampler2D, vec2, vec2, ivec2)
GEN_sparseTextureGradOffsetClampARB_I_U(sampler3D, vec3, vec3, ivec3)
int sparseTextureGradOffsetClampARB(sampler2DShadow sampler, vec3 P, vec2 dPdx, vec2 dPdy, ivec2 offset, float lodClamp, out float texel);
GEN_sparseTextureGradOffsetClampARB_I_U(sampler2DArray, vec3, vec2, ivec2)
int sparseTextureGradOffsetClampARB(sampler2DArrayShadow sampler, vec4 P, vec2 dPdx, vec2 dPdy, ivec2 offset, float lodClamp, out float texel);

#undef GEN_sparseTextureGradOffsetClampARB_I_U

//   ------  textureGradOffsetClampARB(sampler, P, dPdx, dPdy, offset, lodClamp);
#define GEN_textureGradOffsetClampARB_U_I(SAMPLER_TYPE, P_TYPE, DP_TYPE, OFFSET_TYPE) \
 vec4 textureGradOffsetClampARB(     SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, float lodClamp); \
ivec4 textureGradOffsetClampARB(i ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, float lodClamp); \
uvec4 textureGradOffsetClampARB(u ## SAMPLER_TYPE sampler, P_TYPE P, DP_TYPE dPdx, DP_TYPE dPdy, OFFSET_TYPE offset, float lodClamp); \

GEN_textureGradOffsetClampARB_U_I(sampler1D, float, float, int)
GEN_textureGradOffsetClampARB_U_I(sampler2D, vec2, vec2, ivec2)
GEN_textureGradOffsetClampARB_U_I(sampler3D, vec3, vec3, ivec3)
      float textureGradOffsetClampARB(sampler1DShadow sampler, vec3 P ,  float dPdx, float dPdy, int offset ,  float lodClamp);
      float textureGradOffsetClampARB(sampler2DShadow sampler, vec3 P ,  vec2 dPdx, vec2 dPdy, ivec2 offset ,  float lodClamp);
GEN_textureGradOffsetClampARB_U_I(sampler1DArray, vec2, float, int)
GEN_textureGradOffsetClampARB_U_I(sampler2DArray, vec3, vec2, ivec2)
      float textureGradOffsetClampARB(sampler1DArrayShadow sampler, vec3 P ,  float dPdx, float dPdy, int offset ,  float lodClamp);
      float textureGradOffsetClampARB(sampler2DArrayShadow sampler, vec4 P ,  vec2 dPdx, vec2 dPdy, ivec2 offset ,  float lodClamp);

#undef GEN_textureGradOffsetClampARB_U_I

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
