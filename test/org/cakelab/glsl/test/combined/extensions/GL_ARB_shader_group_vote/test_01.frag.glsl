// Fragement Shader


#version 110

#extension GL_ARB_shader_group_vote : enable

void main() {
	bool result = false;
    bool condition1, condition2;
	result = allInvocationsARB(condition2);
   	result = anyInvocationARB(condition1);
	result = allInvocationsEqualARB(result);
}
