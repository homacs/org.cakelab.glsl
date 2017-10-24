/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_shader_ballot
//                                 since GLSL v 1.10
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

in uint     gl_SubGroupInvocationARB;
in uint64_t gl_SubGroupEqMaskARB;
in uint64_t gl_SubGroupGeMaskARB;
in uint64_t gl_SubGroupGtMaskARB;
in uint64_t gl_SubGroupLeMaskARB;
in uint64_t gl_SubGroupLtMaskARB;



uint64_t ballotARB(bool value);

#define GEN_FUNCTIONS(SCALAR, VEC) \
SCALAR readInvocationARB(SCALAR value, uint invocationIndex);\
VEC ## 2 readInvocationARB(VEC ## 2 value, uint invocationIndex);\
VEC ## 3 readInvocationARB(VEC ## 3 value, uint invocationIndex);\
VEC ## 4 readInvocationARB(VEC ## 4 value, uint invocationIndex);\
SCALAR readFirstInvocationARB(SCALAR value);\
VEC ## 2 readFirstInvocationARB(VEC ## 2 value);\
VEC ## 3 readFirstInvocationARB(VEC ## 3 value);\
VEC ## 4 readFirstInvocationARB(VEC ## 4 value);\

GEN_FUNCTIONS(float, vec)
GEN_FUNCTIONS(int, ivec)
GEN_FUNCTIONS(uint, uvec)




//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
