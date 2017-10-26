/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_shader_storage_buffer_object
//                                 since GLSL v 1.30
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#if __VERSION__ < 420

uint atomicAdd(inout uint mem, uint data);
int atomicAdd(inout int mem, int data);

uint atomicMin(inout uint mem, uint data);
int atomicMin(inout int mem, int data);

uint atomicMax(inout uint mem, uint data);
int atomicMax(inout int mem, int data);

uint atomicAnd(inout uint mem, uint data);
int atomicAnd(inout int mem, int data);

uint atomicOr(inout uint mem, uint data);
int atomicOr(inout int mem, int data);

uint atomicXor(inout uint mem, uint data);
int atomicXor(inout int mem, int data);

uint atomicExchange(inout uint mem, uint data);
int atomicExchange(inout int mem, int data);

uint atomicCompSwap(inout uint mem, uint compare, uint data);
int atomicCompSwap(inout int mem, int compare, int data);


#endif // __VERSION__ < 420

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
