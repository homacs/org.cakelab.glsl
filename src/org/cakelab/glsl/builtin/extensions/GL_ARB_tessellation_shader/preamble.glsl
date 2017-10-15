/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_tessellation_shader
//                                 since GLSL v 1.50
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_tessellation_shader 1


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 400

// -----------------------------------------------------------------------------------
//                           7.4 Built-In Constants
// -----------------------------------------------------------------------------------

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

 
const int gl_MaxCombinedTextureImageUnits = 80;

// -----------------------------------------------------------------------------------
//                           7.1 Built-In Language Variables
//                           7.1.1 Compatibility Profile Built-In Language Variables
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




#if defined(TESS_CONTROL_SHADER)

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
  
#elif defined (TESS_EVALUATION_SHADER)

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

#endif // defined(VERTEX_SHADER)

#undef GL_PER_VERTEX_COMPATIBILITY_VARIABLES

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// -----------------------------------------------------------------------------------
//                           8.13 Shader Invocation Control Functions
// -----------------------------------------------------------------------------------
#if defined(TESS_CONTROL_SHADER)
void barrier();
#endif // defined(TESS_CONTROL_SHADER)



#endif // __VERSION__ < 400
//////////////////////////////////////////////////////////////////////////////////////
//                               F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
