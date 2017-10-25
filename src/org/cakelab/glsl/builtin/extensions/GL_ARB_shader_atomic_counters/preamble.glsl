/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                          GL_ARB_shader_atomic_counters
//
//                     Built-in Macros, Variables and Functions
//
//                                requires: uint
//
/////////////////////////////////////////////////////////////////////////////////////////////////


const int gl_MaxVertexAtomicCounters = 0;          // minimum maximum
const int gl_MaxTessControlAtomicCounters = 0;     // minimum maximum
const int gl_MaxTessEvaluationAtomicCounters = 0;  // minimum maximum
const int gl_MaxGeometryAtomicCounters = 0;        // minimum maximum
const int gl_MaxFragmentAtomicCounters = 8;        // minimum maximum
const int gl_MaxCombinedAtomicCounters = 8;        // minimum maximum
const int gl_MaxAtomicCounterBindings = 1;         // minimum maximum


// -----------------------------------------------------------------------------------
//            8.10  Atomic Counter Functions
// -----------------------------------------------------------------------------------

uint atomicCounterIncrement( atomic_uint counter );
uint atomicCounterDecrement( atomic_uint counter );
uint atomicCounter ( atomic_uint counter );

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
