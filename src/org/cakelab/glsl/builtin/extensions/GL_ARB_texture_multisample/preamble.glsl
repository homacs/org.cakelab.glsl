/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_texture_multisample
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 150


vec4 texelFetch(sampler2DMS sampler, ivec2 P, int sample);
ivec4 texelFetch(isampler2DMS sampler, ivec2 P, int sample);
uvec4 texelFetch(usampler2DMS sampler, ivec2 P, int sample);

vec4 texelFetch(sampler2DMSArray sampler, ivec3 P, int sample);
ivec4 texelFetch(isampler2DMSArray sampler, ivec3 P, int sample);
uvec4 texelFetch(usampler2DMSArray sampler, ivec3 P, int sample);


ivec2 textureSize(sampler2DMS sampler);
ivec2 textureSize(isampler2DMS sampler);
ivec2 textureSize(usampler2DMS sampler);

ivec3 textureSize(sampler2DMSArray sampler);
ivec3 textureSize(isampler2DMSArray sampler);
ivec3 textureSize(usampler2DMSArray sampler);



#endif // __VERSION__ < 150
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
