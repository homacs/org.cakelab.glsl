// Fragement Shader


#version 150

#extension GL_ARB_texture_cube_map_array : enable


in usamplerCubeArray sampler;


void main() {


	vec4 coord = vec4(1,1,1,1);
	ivec3 size = textureSize(sampler, 0);
	uvec4 texel = texture(sampler, coord, 1.0f);
	uvec4 lod = textureLod(sampler, coord, 0);
	uvec4 grad = textureGrad(sampler, coord, vec3(1,0,0), vec3(1,0,0));
	
}
