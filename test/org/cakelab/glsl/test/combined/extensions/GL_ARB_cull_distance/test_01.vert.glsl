

#version 150

#extension GL_ARB_cull_distance : enable



void main() {
	gl_CullDistance[0] = -1;
}
