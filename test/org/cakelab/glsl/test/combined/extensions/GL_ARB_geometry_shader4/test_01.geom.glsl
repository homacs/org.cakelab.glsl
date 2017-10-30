// based on: http://www.lighthouse3d.com/tutorials/glsl-tutorial/geometry-shader-examples/

#version 140

#extension GL_ARB_geometry_shader4 : enable

layout (triangles) in;
layout (triangle_strip, max_vertices=6) out;

layout (std140) uniform Matrices {
    mat4 projModelViewMatrix;
    mat3 normalMatrix;
};

in VertexData {
    vec2 texCoord;
    vec3 normal;
} VertexIn[];

out VertexData {
    vec2 texCoord;
    vec3 normal;
} VertexOut;



void main()
{
  for(int i = 0; i < gl_PositionIn.length(); i++)
  {
     // copy attributes
    gl_Position = projModelViewMatrix * gl_PositionIn[i];
    VertexOut.normal = normalize(normalMatrix * VertexIn[i].normal);
    VertexOut.texCoord = VertexIn[i].texCoord;
 
    // done with the vertex
    EmitVertex();
  }
  EndPrimitive();
 
  for(int i = 0; i < gl_PositionIn.length(); i++)
  {
     // copy attributes and displace copy
    gl_Position = projModelViewMatrix * (gl_PositionIn[i] + vec4(20.0, 0.0, 0.0, 0.0));
    VertexOut.normal = normalize(normalMatrix * VertexIn[i].normal);
    VertexOut.texCoord = VertexIn[i].texCoord;
 
    // done with the vertex
    EmitVertex();
  }
  EndPrimitive();
}
