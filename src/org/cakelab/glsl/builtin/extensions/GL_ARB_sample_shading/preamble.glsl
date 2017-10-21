/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                               GL_ARB_sample_shading
//                                 since GLSL v 1.30
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_ARB_sample_shading 1





#if __VERSION__ < 400

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#ifdef FRAGMENT_SHADER

in int gl_SampleID;
in vec2 gl_SamplePosition;
out int gl_SampleMask[];

uniform int gl_NumSamples;

#endif // FRAGMENT_SHADER



#endif // __VERSION__ < 400
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////