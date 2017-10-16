/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_shader_image_load_store
//                                 since GLSL v 1.30
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_shader_image_load_store 1

// all has been added to 420
#if __VERSION__ < 420




const int gl_MaxImageUnits = 8;
const int gl_MaxCombinedImageUnitsAndFragmentOutputs = 8;
const int gl_MaxImageSamples = 0;
const int gl_MaxVertexImageUniforms = 0;
const int gl_MaxTessControlImageUniforms = 0;
const int gl_MaxTessEvaluationImageUniforms = 0;
const int gl_MaxGeometryImageUniforms = 0;
const int gl_MaxFragmentImageUniforms = 8;
const int gl_MaxCombinedImageUniforms = 8;






// -----------------------------------------------------------------------------------
//                           8.11 Image Functions
// -----------------------------------------------------------------------------------

#define GENERIC_FUNCTION_SET_U_I(...) \
vec4 imageLoad (readonly __VA_ARGS__); \
void imageStore (writeonly __VA_ARGS__, vec4 data); \
ivec4 imageLoad (readonly  u ## __VA_ARGS__); \
void imageStore (writeonly u ## __VA_ARGS__, ivec4 data); \
uvec4 imageLoad (readonly  i ## __VA_ARGS__); \
void imageStore (writeonly i ## __VA_ARGS__, uvec4 data);


GENERIC_FUNCTION_SET_U_I(image1D image, int P)
GENERIC_FUNCTION_SET_U_I(image2D image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(image3D image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DRect image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(imageCube image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageBuffer image, int P)
GENERIC_FUNCTION_SET_U_I(image1DArray image, ivec2 )
GENERIC_FUNCTION_SET_U_I(image2DArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageCubeArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DMS image, ivec2 P, int _sample)
GENERIC_FUNCTION_SET_U_I(image2DMSArray image, ivec3 P, int _sample)



#undef GENERIC_FUNCTION_SET_U_I
#undef GENERIC_FUNCTION_SET


//   ------  imageAtomicXxx(image, ...)
#define GENERIC_FUNCTION_SET(...) \
uint imageAtomicAdd (__VA_ARGS__,uint data); \
int imageAtomicAdd (__VA_ARGS__, int data); \
uint imageAtomicMin (__VA_ARGS__,uint data); \
int imageAtomicMin (__VA_ARGS__, int data); \
uint imageAtomicMax (__VA_ARGS__,uint data); \
int imageAtomicMax (__VA_ARGS__, int data); \
uint imageAtomicAnd (__VA_ARGS__,uint data); \
int imageAtomicAnd (__VA_ARGS__, int data); \
uint imageAtomicOr (__VA_ARGS__,uint data); \
int imageAtomicOr (__VA_ARGS__, int data); \
uint imageAtomicXor (__VA_ARGS__,uint data); \
int imageAtomicXor (__VA_ARGS__, int data); \
uint imageAtomicExchange (__VA_ARGS__,uint data); \
int imageAtomicExchange (__VA_ARGS__, int data); \
float imageAtomicExchange (__VA_ARGS__, float data); \
uint imageAtomicCompSwap(__VA_ARGS__,uint compare,uint data); \
int imageAtomicCompSwap(__VA_ARGS__,int compare,int data);

//   ------  imageAtomicXxx(image, ...)
#define GENERIC_FUNCTION_SET_U_I(...) \
GENERIC_FUNCTION_SET(     __VA_ARGS__) \
GENERIC_FUNCTION_SET(i ## __VA_ARGS__) \
GENERIC_FUNCTION_SET(u ## __VA_ARGS__)


GENERIC_FUNCTION_SET_U_I(image1D image, int P)
GENERIC_FUNCTION_SET_U_I(image2D image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(image3D image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DRect image, ivec2 P)
GENERIC_FUNCTION_SET_U_I(imageCube image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageBuffer image, int P)
GENERIC_FUNCTION_SET_U_I(image1DArray image, ivec2 )
GENERIC_FUNCTION_SET_U_I(image2DArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(imageCubeArray image, ivec3 P)
GENERIC_FUNCTION_SET_U_I(image2DMS image, ivec2 P, int _sample)
GENERIC_FUNCTION_SET_U_I(image2DMSArray image, ivec3 P, int _sample)



#undef GENERIC_FUNCTION_SET_U_I
#undef GENERIC_FUNCTION_SET


// -----------------------------------------------------------------------------------
//                           8.16 Shader Memory Control Function
// -----------------------------------------------------------------------------------
void memoryBarrier();


#endif // __VERSION__ < 420
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
