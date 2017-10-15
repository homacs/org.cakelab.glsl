/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_shader_image_size
//                                 since GLSL v 4.20
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_shader_image_size 1



#if __VERSION__ < 430
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


#endif // __VERSION__ < 430
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
