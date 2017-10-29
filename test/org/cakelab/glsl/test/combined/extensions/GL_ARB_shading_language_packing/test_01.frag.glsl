// Fragement Shader


#version 130

#extension GL_ARB_shading_language_packing : enable


uniform uint  a;
uniform vec2  c;
uniform vec4  d;

void main() {
	uint x;
	vec2 y;
	vec4 z;
	
	y = unpackUnorm2x16(a);
	x = packUnorm2x16(c);
	y = unpackSnorm2x16(a);
	x = packUnorm4x8(d);
	x = packSnorm2x16(c);
	z = unpackUnorm4x8(a);
	z = unpackSnorm4x8(a);
	x = packSnorm4x8(d);
}
