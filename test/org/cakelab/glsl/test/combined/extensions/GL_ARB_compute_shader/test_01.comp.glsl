

#version 420

#extension GL_ARB_compute_shader : enable
#extension GL_ARB_compute_variable_group_size : enable


int i = gl_WorkGroupID;
int j = gl_LocalGroupSizeARB;


void main() {
	memoryBarrierShared();
}
