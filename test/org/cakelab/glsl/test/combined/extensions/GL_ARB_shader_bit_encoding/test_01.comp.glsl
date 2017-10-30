

#version 150 core

#extension GL_ARB_shader_bit_encoding : enable


uniform float a;
const int b = floatBitsToInt (a);


void main() {
}
