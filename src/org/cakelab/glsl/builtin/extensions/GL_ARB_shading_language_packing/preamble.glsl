/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                           GL_ARB_shading_language_packing
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 400

uint      packUnorm2x16(vec2 v);
uint      packSnorm2x16(vec2 v);
uint      packUnorm4x8(vec4 v);
uint      packSnorm4x8(vec4 v);

vec2      unpackUnorm2x16(uint v);
vec2      unpackSnorm2x16(uint v);
vec4      unpackUnorm4x8(uint v);
vec4      unpackSnorm4x8(uint v);

#endif // __VERSION__ < 400
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
