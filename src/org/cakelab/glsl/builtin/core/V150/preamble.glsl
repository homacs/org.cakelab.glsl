/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                            Open GL Shading Language 
//                                    V 1.50
//                                 Core Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define __VERSION__ 150
#define GL_core_profile 1

//
// The following special macros are available only when parsing the preamble
//
#if !defined(VERTEX_SHADER) && !defined(FRAGMENT_SHADER) && !defined(GEOMETRY_SHADER) && !defined(GENERIC_SHADER)
#error undefined shader type!
#endif


// -----------------------------------------------------------------------------------
//                           4.5.4 Available Precision Qualifiers
// -----------------------------------------------------------------------------------
#if defined(VERTEX_SHADER) || defined(FRAGMENT_SHADER) || defined(GEOMETRY_SHADER)
#define GL_FRAGMENT_PRECISION_HIGH 1
#endif

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////



// -----------------------------------------------------------------------------------
//                           7.1 Vertex and Geometry Shader Special Variables
// -----------------------------------------------------------------------------------

#ifdef VERTEX_SHADER

in  int   gl_VertexID;
in  int   gl_InstanceID;
out gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
#ifdef GL_compatibility_profile
	vec4 gl_ClipVertex;
#endif
};

#endif // VERTEX_SHADER




#ifdef GEOMETRY_SHADER

in gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
#ifdef GL_compatibility_profile
	vec4 gl_ClipVertex;
#endif
} gl_in[];

in int gl_PrimitiveIDIn;

out gl_PerVertex {
    vec4  gl_Position;
    float gl_PointSize;
    float gl_ClipDistance[];
};
out int gl_PrimitiveID;
out int gl_Layer;

#ifdef GL_compatibility_profile
out vec4 gl_ClipVertex;
#endif // GL_compatibility_profile

#endif // GEOMETRY_SHADER


