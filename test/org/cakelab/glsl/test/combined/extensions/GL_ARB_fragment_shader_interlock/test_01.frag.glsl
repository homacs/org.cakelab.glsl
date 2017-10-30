// Fragement Shader


#version 150
#extension GL_ARB_shader_image_load_store : enable
#extension GL_ARB_fragment_shader_interlock : enable


image1D tex;

void main() {
	beginInvocationInterlockARB();
	ivec2 P = ivec2(1,2);
	imageAtomicAdd(tex, 2, 1);
	endInvocationInterlockARB();
}
