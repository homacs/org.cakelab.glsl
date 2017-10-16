// Fragement Shader


#version 150

#extension GL_ARB_shader_image_load_store : enable

layout(r32i) uniform coherent iimage1D tex;

void main() {
	ivec2 P = ivec2(1,2);
	imageAtomicAdd(tex, 2, 1);
}
