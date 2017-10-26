/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                            GL_ARB_shader_bit_encoding
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 330

// -----------------------------------------------------------------------------------
//                           8.3 Common Functions 
// -----------------------------------------------------------------------------------


int floatBitsToInt (float value);
ivec2 floatBitsToInt (vec2 value);
ivec3 floatBitsToInt (vec3 value);
ivec4 floatBitsToInt (vec4 value);
#if __VERSION__ >= 130
uint floatBitsToUint (float value);
uvec2 floatBitsToUint (vec2 value);
uvec3 floatBitsToUint (vec3 value);
uvec4 floatBitsToUint (vec4 value);
#endif

float intBitsToFloat(int value);
vec2 intBitsToFloat(ivec2 value);
vec3 intBitsToFloat(ivec3 value);
vec4 intBitsToFloat(ivec4 value);
#if __VERSION__ >= 130
float uintBitsToFloat(uint value);
vec2 uintBitsToFloat(uvec2 value);
vec3 uintBitsToFloat(uvec3 value);
vec4 uintBitsToFloat(uvec4 value);
#endif

#endif // __VERSION__ < 330
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
