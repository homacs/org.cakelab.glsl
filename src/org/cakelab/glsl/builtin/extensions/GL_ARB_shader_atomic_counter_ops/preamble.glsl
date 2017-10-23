/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                           GL_ARB_shader_atomic_counter_ops
//                                 since GLSL v 4.20
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                           8.10 Atomic-Counter Functions
// -----------------------------------------------------------------------------------
uint atomicCounterAddARB (atomic_uint c, uint data);
uint atomicCounterSubtractARB (atomic_uint c, uint data);
uint atomicCounterMinARB (atomic_uint c, uint data);
uint atomicCounterMaxARB (atomic_uint c, uint data);
uint atomicCounterAndARB (atomic_uint c, uint data);
uint atomicCounterOrARB (atomic_uint c, uint data);
uint atomicCounterXorARB (atomic_uint c, uint data);
uint atomicCounterExchangeARB (atomic_uint c, uint data);
uint atomicCounterCompSwapARB (atomic_uint c, uint compare, uint data);

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
