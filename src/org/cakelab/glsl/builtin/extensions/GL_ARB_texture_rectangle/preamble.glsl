/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_texture_rectangle
//                                 since GLSL v 1.10
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////




vec4 texture2DRect(sampler2DRect sampler, vec2 coord);
vec4 texture2DRectProj(sampler2DRect sampler, vec3 coord);
vec4 texture2DRectProj(sampler2DRect sampler, vec4 coord);
vec4 shadow2DRect(sampler2DRectShadow sampler, vec3 coord);
vec4 shadow2DRectProj(sampler2DRectShadow sampler, vec4 coord);


//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
