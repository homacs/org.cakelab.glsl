// Fragement Shader


#version 130
#extension GL_ARB_texture_multisample : enable


sampler2DMS sampler;

void main() {
	ivec2 P = ivec2(1,2);
	uvec4 result = texelFetch(sampler, P, 2);

}
