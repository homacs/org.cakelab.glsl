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



vec4	texture1DGradARB(         sampler1D sampler,
                          float P, float dPdx, float dPdy );
vec4	texture1DProjGradARB(     sampler1D sampler,
                          vec2  P, float dPdx, float dPdy );
vec4	texture1DProjGradARB(     sampler1D sampler,
                          vec4  P, float dPdx, float dPdy );

vec4	texture2DGradARB(         sampler2D sampler,
                          vec2  P, vec2  dPdx, vec2  dPdy );
vec4	texture2DProjGradARB(     sampler2D sampler,
                          vec3  P, vec2  dPdx, vec2  dPdy );
vec4	texture2DProjGradARB(     sampler2D sampler,
                          vec4  P, vec2  dPdx, vec2  dPdy );

vec4	texture3DGradARB(         sampler3D sampler,
                          vec3  P, vec3  dPdx, vec3  dPdy );
vec4	texture3DProjGradARB(     sampler3D sampler,
                          vec4  P, vec3  dPdx, vec3  dPdy );

vec4	textureCubeGradARB(       samplerCube sampler,
                          vec3  P, vec3  dPdx, vec3  dPdy );

float	shadow1DGradARB(          sampler1DShadow sampler,
                          vec3  P, float dPdx, float dPdy );
float	shadow1DProjGradARB(      sampler1DShadow sampler,
                          vec4  P, float dPdx, float dPdy );

float	shadow2DGradARB(          sampler2DShadow sampler,
                          vec3  P, vec2  dPdx, vec2  dPdy );
float	shadow2DProjGradARB(      sampler2DShadow sampler,
                          vec4  P, vec2  dPdx, vec2  dPdy );

#ifdef HAVE_SAMPLER_RECT
vec4	texture2DRectGradARB(     sampler2DRect sampler,
                          vec2  P, vec2  dPdx, vec2  dPdy );
vec4	texture2DRectProjGradARB( sampler2DRect sampler,
                          vec3  P, vec2  dPdx, vec2  dPdy );
vec4	texture2DRectProjGradARB( sampler2DRect sampler,
                          vec4  P, vec2  dPdx, vec2  dPdy );

float	shadow2DRectGradARB(      sampler2DRectShadow sampler,
                          vec3  P, vec2  dPdx, vec2  dPdy );
float	shadow2DRectProjGradARB(  sampler2DRectShadow sampler,
                          vec4  P, vec2  dPdx, vec2  dPdy );
#endif

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
