/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_shader_texture_image_samples
//                                 since GLSL v 1.50
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#ifndef __VERSION__
#error missing __VERSION__
#endif


// all functions of this extentions are available in version [450,]
#if __VERSION__ < 450

// -----------------------------------------------------------------------------------
//                           8.9.1 Texture Query Functions
// -----------------------------------------------------------------------------------

//   ------  textureSamples(sampler2DMS)
#define GEN_textureSamples(SAMPLER_TYPE) \
int textureSamples(SAMPLER_TYPE _sampler); \
int textureSamples(i ## SAMPLER_TYPE _sampler); \
int textureSamples(u ## SAMPLER_TYPE _sampler);

GEN_textureSamples(sampler2DMS)
GEN_textureSamples(sampler2DMSArray)

#undef GEN_textureSamples


// -----------------------------------------------------------------------------------
//                           8.12 Image Functions
// -----------------------------------------------------------------------------------

// types are available only through v420 or extension
//#if __VERSION__ >= 420 || defined(EXT_shader_image_load_store)

#if __VERSION__ >= 420 || defined(EXT_shader_image_load_store)


#define GEN_imageSamples(SAMPLER_TYPE) \
int imageSamples(readonly writeonly SAMPLER_TYPE image); \
int imageSamples(readonly writeonly i ## SAMPLER_TYPE image); \
int imageSamples(readonly writeonly u ## SAMPLER_TYPE image);

GEN_imageSamples(image2DMS)
GEN_imageSamples(image2DMSArray)

#undef GEN_imageSamples

#endif // __VERSION__ >= 420 || defined(EXT_shader_image_load_store)

#endif // __VERSION__ < 450

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
