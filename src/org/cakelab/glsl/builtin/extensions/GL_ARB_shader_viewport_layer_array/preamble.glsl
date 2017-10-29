/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                         GL_ARB_shader_viewport_layer_array
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#ifdef VERTEX_SHADER
out int gl_ViewportIndex;
#endif // VERTEX_SHADER




// add gl_Layer (per standard only available in geometry shader) 
// for vertex and tesselation evaluation shaders as well
#if defined(VERTEX_SHADER) || defined(TESS_EVALUATION_SHADER)
out int gl_Layer;
#endif // defined(VERTEX_SHADER) || defined(TESS_EVALUATION_SHADER)

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
