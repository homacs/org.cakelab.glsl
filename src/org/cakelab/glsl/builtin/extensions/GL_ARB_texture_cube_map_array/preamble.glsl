/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                             GL_ARB_texture_cube_map_array
//                                 since GLSL v 1.30
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////
#if __VERSION__ < 400

ivec3 textureSize(samplerCubeArray sampler, int lod);
ivec3 textureSize(samplerCubeArrayShadow sampler, int lod);
float texture(samplerCubeArrayShadow sampler, vec4 coord, float compare);

vec4 texture(samplerCubeArray sampler, vec4 coord);
ivec4 texture(isamplerCubeArray sampler, vec4 coord);
uvec4 texture(usamplerCubeArray sampler, vec4 coord);

vec4 texture(samplerCubeArray sampler, vec4 coord, float bias);
ivec4 texture(isamplerCubeArray sampler, vec4 coord, float bias);
uvec4 texture(usamplerCubeArray sampler, vec4 coord, float bias);

vec4 textureLod(samplerCubeArray sampler, vec4 coord, float lod);
ivec4 textureLod(isamplerCubeArray sampler, vec4 coord, float lod);
uvec4 textureLod(usamplerCubeArray sampler, vec4 coord, float lod);

vec4 textureGrad(samplerCubeArray sampler, vec4 coord, vec3 ddx, vec3 ddy);
ivec4 textureGrad(isamplerCubeArray sampler, vec4 coord, vec3 ddx, vec3 ddy);
uvec4 textureGrad(usamplerCubeArray sampler, vec4 coord, vec3 ddx, vec3 ddy);

#endif // __VERSION__ < 400

//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
