/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_cull_distance
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 450



const int  gl_MaxCullDistances = 8;
const int  gl_MaxCombinedClipAndCullDistances = 8;

//
// Note: The remainder of the preamble is just needed to
// redeclare all gl_PerVertex in and out interfaces to contain
// the new variable:
//
//     float gl_CullDistance[]
//



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







// -----------------------------------------------------------------------------------
//                           7.1 Built-In Language Variables
// -----------------------------------------------------------------------------------


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
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
};


#elif defined(GEOMETRY_SHADER)
//
// Geometry Shader Language
//

in gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_in[];


out gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
};


#elif defined(TESS_CONTROL_SHADER)
//
// Tesselation Control Shader Language
//

in gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_in[gl_MaxPatchVertices];


out gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_out[];


#elif defined(TESS_EVALUATION_SHADER)
//
// Tesselation Evaluation Shader Language
//

in gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
} gl_in[gl_MaxPatchVertices];


out gl_PerVertex {
    vec4 gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
    float gl_CullDistance[];
    
    GL_PER_VERTEX_COMPATIBILITY_VARIABLES
};


#elif defined(FRAGMENT_SHADER)
//
// Fragment Shader Language
//

in  float gl_CullDistance[];

#endif // Shader language specific built-in variables 




#undef GL_PER_VERTEX_COMPATIBILITY_VARIABLES




#endif // __VERSION__ < 450
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
