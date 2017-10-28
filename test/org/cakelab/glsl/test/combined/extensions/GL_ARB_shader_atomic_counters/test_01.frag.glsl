// Fragement Shader


#version 150

#extension GL_ARB_shader_atomic_counters : enable

layout(binding=3, offset=4) uniform;

uniform atomic_uint                   thunderhead; // offset = 4
uniform atomic_uint                   stratogirl;  // offset = 8
layout(binding=3) uniform atomic_uint metalman;    // binding matches,
                                                   // offset = 12
layout(offset=20) uniform atomic_uint dynaguy;     // offset = 20
uniform atomic_uint                   splashdown;  // offset = 24


layout( binding=2)            uniform atomic_uint a;
layout( binding=2, offset=4 ) uniform atomic_uint b;
layout( binding=5, offset=0 ) uniform atomic_uint c;


void main() {
    uint foo = atomicCounterIncrement( a ); // get the counter value, then increment the counter
                                            // atomic operation
    uint bar = atomicCounterDecrement( b ); // decrement the counter value, then get the counter
                                            // atomic operation
    uint baz = atomicCounter( c );          // get the counter value
                                            // atomic operation
}
