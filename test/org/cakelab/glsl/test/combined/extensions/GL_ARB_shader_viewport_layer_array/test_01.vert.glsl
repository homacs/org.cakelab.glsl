
#version 410

#extension GL_ARB_shader_viewport_layer_array : enable

void main() {
	gl_Layer = 8;
	gl_ViewportIndex = 1;
}
