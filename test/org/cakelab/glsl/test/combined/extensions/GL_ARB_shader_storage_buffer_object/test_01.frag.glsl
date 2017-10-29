// Fragement Shader


#version 150

#extension GL_ARB_shader_storage_buffer_object : enable


buffer Block {
	int lock;
	vec4 member1;
	vec4 member2;
};




void main() {
	while(0 == atomicCompSwap(lock, 0, 1));
	
	member1.x = ~member1.x;
	
	while(1 == atomicCompSwap(lock, 1, 0));
}
