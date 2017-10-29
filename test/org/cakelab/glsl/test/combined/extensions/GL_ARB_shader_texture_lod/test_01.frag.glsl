// Fragement Shader


#version 150

#extension GL_ARB_shader_texture_lod : enable


uniform sampler2D sampler;


void main() {
	vec2 P = vec2(0,0);
	vec2 dPdx = vec2(0.5, 0.3);
	vec2 dPdy = vec2(0.4, 0.2);
	vec4 result = texture2DGradARB(sampler, P, dPdx, dPdy);

}
