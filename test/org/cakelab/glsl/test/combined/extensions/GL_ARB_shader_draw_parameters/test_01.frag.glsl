// Fragement Shader


#version 140

#extension GL_ARB_shader_draw_parameters : enable

#define MAX_DRAW 128

layout(binding = INDIRECTION) uniform indirection
{
    int Transform[MAX_DRAW];
} Indirection;

layout(binding = TRANSFORM0) uniform transform
{
    mat4 MVP[MAX_DRAW];
} Transform;

layout(location = POSITION) in vec3 Position;
layout(location = TEXCOORD) in vec3 Texcoord;

out gl_PerVertex
{
    vec4 gl_Position;
};

out block
{
    vec2 Texcoord;
} Out;

void main()
{
    Out.Texcoord = Texcoord.st;
    gl_Position = Transform.MVP[Indirection.Transform[gl_DrawIDARB]] *
                  vec4(Position, 1.0);
}
