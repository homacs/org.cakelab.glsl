// Fragement Shader


#version 150

#extension GL_ARB_sample_shading : enable

void main() {
	if (gl_SampleID == 1) {
		gl_SampleMask[0] = 0;
	}
}
