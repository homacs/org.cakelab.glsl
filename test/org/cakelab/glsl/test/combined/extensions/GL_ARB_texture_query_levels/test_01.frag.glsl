// Fragement Shader


#version 130

#extension GL_ARB_texture_query_levels : enable
uniform sampler1D sampler;

void main() {
	int i = textureQueryLevels(sampler);
}
