
/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.0
//                            Open GL Shading Language 
//                                    V 4.00
//                                  Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                           4.5.4 Available Precision Qualifiers
// -----------------------------------------------------------------------------------
#if    defined(VERTEX_SHADER) || defined(FRAGMENT_SHADER)
#define GL_FRAGMENT_PRECISION_HIGH 1
#endif


// -----------------------------------------------------------------------------------
//                           7.3 Built-In Constants
// -----------------------------------------------------------------------------------
//
// Implementation dependent constants.  The example values below
// are the minimum values allowed for these maximums.
//
const int  gl_MaxVertexAttribs = 16;
const int  gl_MaxVertexUniformComponents = 1024;

const int  gl_MaxVaryingComponents = 60;        // Deprecated
const int  gl_MaxVertexOutputComponents = 64;
const int  gl_MaxGeometryInputComponents = 64;
const int  gl_MaxGeometryOutputComponents = 128;
const int  gl_MaxFragmentInputComponents = 128;
const int  gl_MaxVertexTextureImageUnits = 16;
const int  gl_MaxCombinedTextureImageUnits = 80;
const int  gl_MaxTextureImageUnits = 16;

const int  gl_MaxImageUnits = 8;
const int  gl_MaxCombinedImageUnitsAndFragmentOutputs = 8;
const int  gl_MaxImageSamples = 0;
const int  gl_MaxVertexImageUniforms = 0;
const int  gl_MaxTessControlImageUniforms = 0;
const int  gl_MaxTessEvaluationImageUniforms = 0;
const int  gl_MaxGeometryImageUniforms = 0;
const int  gl_MaxFragmentImageUniforms = 0;
const int  gl_MaxCombinedImageUniforms = 0;
const int  gl_MaxFragmentUniformComponents = 1024;
const int  gl_MaxDrawBuffers = 8;
const int  gl_MaxClipDistances = 8;
const int  gl_MaxGeometryTextureImageUnits = 16;
const int  gl_MaxGeometryOutputVertices = 256;
const int  gl_MaxGeometryTotalOutputComponents = 1024;
const int  gl_MaxGeometryUniformComponents = 1024;
const int  gl_MaxGeometryVaryingComponents = 64;

const int gl_MaxTessControlInputComponents = 128;
const int gl_MaxTessControlOutputComponents = 128;
const int gl_MaxTessControlTextureImageUnits = 16;
const int gl_MaxTessControlUniformComponents = 1024;
const int gl_MaxTessControlTotalOutputComponents = 4096;
const int gl_MaxTessEvaluationInputComponents = 128;
const int gl_MaxTessEvaluationOutputComponents = 128;
const int gl_MaxTessEvaluationTextureImageUnits = 16;
const int gl_MaxTessEvaluationUniformComponents = 1024;
const int gl_MaxTessPatchComponents = 120;
const int gl_MaxPatchVertices = 32;
const int gl_MaxTessGenLevel = 64;
const int gl_MaxViewports = 16;
const int gl_MaxVertexUniformVectors = 256;
const int gl_MaxFragmentUniformVectors = 256;
const int gl_MaxVaryingVectors = 15;
const int gl_MaxVertexAtomicCounters = 0;
const int gl_MaxTessControlAtomicCounters = 0;
const int gl_MaxTessEvaluationAtomicCounters = 0;
const int gl_MaxGeometryAtomicCounters = 0;
const int gl_MaxFragmentAtomicCounters = 8;
const int gl_MaxCombinedAtomicCounters = 8;
const int gl_MaxAtomicCounterBindings = 1;
const int gl_MaxVertexAtomicCounterBuffers = 0;
const int gl_MaxTessControlAtomicCounterBuffers = 0;
const int gl_MaxTessEvaluationAtomicCounterBuffers = 0;
const int gl_MaxGeometryAtomicCounterBuffers = 0;
const int gl_MaxFragmentAtomicCounterBuffers = 1;
const int gl_MaxCombinedAtomicCounterBuffers = 1;
const int gl_MaxAtomicCounterBufferSize = 16384;
const int gl_MinProgramTexelOffset = -8;
const int gl_MaxProgramTexelOffset = 7;

// -----------------------------------------------------------------------------------
//                           7.1 Built-In Language Variables
//                           7.1.1 Compatibility Profile Built-In Language Variables
//                           7.2 Compatibility Profile Vertex Shader Built-In Inputs
// -----------------------------------------------------------------------------------

#ifdef GL_compatibility_profile
// Section 7.1.1 Compatibility Profile Built-In Language Variables
#define GL_PER_VERTEX_COMPATIBILITY_VARIABLES 	\
    vec4  gl_ClipVertex;						\
	vec4  gl_FrontColor;						\
	vec4  gl_BackColor;							\
	vec4  gl_FrontSecondaryColor;				\
	vec4  gl_BackSecondaryColor;				\
	vec4  gl_TexCoord[];						\
	float gl_FogFragCoord;

#else // not compatibility profile
#define GL_PER_VERTEX_COMPATIBILITY_VARIABLES /* empty */
#endif // GL_compatibility_profile




#if defined(VERTEX_SHADER)
//
// Vertex Shader Language
//

in  int   gl_VertexID;
in  int   gl_InstanceID;
out gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
};

#ifdef GL_compatibility_profile

in vec4  gl_Color;
in vec4  gl_SecondaryColor;
in vec3  gl_Normal;
in vec4  gl_Vertex;
in vec4  gl_MultiTexCoord0;
in vec4  gl_MultiTexCoord1;
in vec4  gl_MultiTexCoord2;
in vec4  gl_MultiTexCoord3;
in vec4  gl_MultiTexCoord4;
in vec4  gl_MultiTexCoord5;
in vec4  gl_MultiTexCoord6;
in vec4  gl_MultiTexCoord7;
in float gl_FogCoord;

#endif // GL_compatibility_profile


#elif defined(GEOMETRY_SHADER)
//
// Geometry Shader Language
//

in gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_in[];

in int gl_PrimitiveIDIn;
in int gl_InvocationID;

out gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
};
out int gl_PrimitiveID;
out int gl_Layer;



#elif defined(TESS_CONTROL_SHADER)
//
// Tesselation Control Shader Language
//

in gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_in[gl_MaxPatchVertices];

in int gl_PatchVerticesIn;
in int gl_PrimitiveID;

in int gl_InvocationID;

out gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_out[];

patch out float gl_TessLevelOuter[4];
patch out float gl_TessLevelInner[2];


#elif defined(TESS_EVALUATION_SHADER)
//
// Tesselation Evaluation Shader Language
//

in gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_in[gl_MaxPatchVertices];

in int gl_PatchVerticesIn;
in int gl_PrimitiveID;

in vec3 gl_TessCoord;

patch in float gl_TessLevelOuter[4];
patch in float gl_TessLevelInner[2];

out gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
};


#elif defined(FRAGMENT_SHADER)
//
// Fragment Shader Language
//



in  vec4  gl_FragCoord;
in  bool  gl_FrontFacing;
in  float gl_ClipDistance[];
in  vec2  gl_PointCoord;
in  int   gl_PrimitiveID;
in  int   gl_SampleID;
in  vec2  gl_SamplePosition;
in  int   gl_SampleMaskIn[]; // new

out float gl_FragDepth;
out int   gl_SampleMask[];

#endif // Shader language specific built-in variables 




#undef GL_PER_VERTEX_COMPATIBILITY_VARIABLES



// -----------------------------------------------------------------------------------
//                           7.4 Built-In Uniform State
// -----------------------------------------------------------------------------------

struct gl_DepthRangeParameters
{
    float near;        // n
    float far;         // f
    float diff;        // f - n
};
uniform gl_DepthRangeParameters gl_DepthRange;

uniform int gl_NumSamples; // new



