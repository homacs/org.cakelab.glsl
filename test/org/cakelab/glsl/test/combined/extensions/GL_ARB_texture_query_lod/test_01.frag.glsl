

#version 130

#extension GL_ARB_texture_query_lod : enable

uniform usamplerCube sampler;

vec2 lod = textureQueryLod(sampler, vec2(0,0));


void main() {
	
}
