/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                               GL_ARB_compute_shader
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////
#if __VERSION__ < 430


#ifdef COMPUTE_SHADER

// work group dimensions
in    uvec3 gl_NumWorkGroups;
const uvec3 gl_WorkGroupSize;

// work group and invocation IDs
in    uvec3 gl_WorkGroupID;
in    uvec3 gl_LocalInvocationID;

// derived variables
in    uvec3 gl_GlobalInvocationID;
in    uint  gl_LocalInvocationIndex;

#endif // COMPUTE_SHADER




// -----------------------------------------------------------------------------------
//                           8.17 Shader Memory Control Functions
// -----------------------------------------------------------------------------------

void memoryBarrierAtomicCounter();
#ifdef HAVE_GL_ARB_shader_storage_buffer_object
void memoryBarrierBuffer();
#endif // HAVE_GL_ARB_shader_storage_buffer_object
void memoryBarrierShared();
void memoryBarrierImage();
void groupMemoryBarrier();




#ifndef HAVE_GL_ARB_shader_storage_buffer_object

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


#endif // HAVE_GL_ARB_shader_storage_buffer_object

#endif // __VERSION__ < 430


//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
