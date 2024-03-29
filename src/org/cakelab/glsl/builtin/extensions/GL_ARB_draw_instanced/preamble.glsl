/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_draw_instanced
//                                 since GLSL v 1.10
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#ifdef VERTEX_SHADER
int gl_InstanceIDARB; // read-only

#if __VERSION__ < 150
int gl_InstanceID;    // read-only
#endif

#endif

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
