/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.2
//                            Open GL Shading Language 
//                                    V 4.20
//                              Compatibility Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_compatibility_profile 1

// 
// We include updated V420 core symbols,
// add V410 compatiblity symbols,
// and then add new compatiblity symbols.
//

#include <core/V420/preamble.glsl> // (defines VERSION and prevents V410 compatiblity to include V410 core)
// note: next include will redefine GL_compatiblity_profile
#undef GL_compatibility_profile
#include <compatibility/V410/preamble.glsl>





// -----------------------------------------------------------------------------------
//                           7.3.1 Compatibility Profile Built-In Constants
//                           (changes to V410 only)
// -----------------------------------------------------------------------------------
const   int  gl_MaxVaryingFloats = 60;

// -----------------------------------------------------------------------------------
//                           7.1 Built-In Language Variables
//                           7.1.1 Compatibility Profile Built-In Language Variables
//                           7.2 Compatibility Profile Vertex Shader Built-In Inputs
// -----------------------------------------------------------------------------------

#ifdef FRAGMENT_SHADER
out vec4  gl_FragColor;                   // now removed from core
out vec4  gl_FragData[gl_MaxDrawBuffers]; // now removed from core
#endif





/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//                                      (changes only)
/////////////////////////////////////////////////////////////////////////////////////////////////


// -----------------------------------------------------------------------------------
//                           8.9.4 Compatibility Profile Texture Functions
// -----------------------------------------------------------------------------------

//
// All deprecated texture lookup functions moved to compatibility profile
// 
vec4 texture1D(sampler1D sampler, float coord);
vec4 texture1D(sampler1D sampler, float coord, float bias);
vec4 texture1DProj (sampler1D sampler, vec2 coord);
vec4 texture1DProj (sampler1D sampler, vec2 coord, float bias);
vec4 texture1DProj (sampler1D sampler, vec4 coord);
vec4 texture1DProj (sampler1D sampler, vec4 coord, float bias);
vec4 texture1DLod (sampler1D sampler, float coord, float lod);
vec4 texture1DProjLod (sampler1D sampler, vec2 coord, float lod);
vec4 texture1DProjLod (sampler1D sampler, vec4 coord, float lod);

vec4 texture2D(sampler2D sampler, vec2 coord);
vec4 texture2D(sampler2D sampler, vec2 coord, float bias);
vec4 texture2DProj (sampler2D sampler, vec3 coord);
vec4 texture2DProj (sampler2D sampler, vec3 coord, float bias);
vec4 texture2DProj (sampler2D sampler, vec4 coord);
vec4 texture2DProj (sampler2D sampler, vec4 coord, float bias);
vec4 texture2DLod (sampler2D sampler, vec2 coord, float lod);
vec4 texture2DProjLod (sampler2D sampler, vec3 coord, float lod);
vec4 texture2DProjLod (sampler2D sampler, vec4 coord, float lod);

vec4 texture3D(sampler3D sampler, vec3 coord);
vec4 texture3D(sampler3D sampler, vec3 coord, float bias);
vec4 texture3DProj (sampler3D sampler, vec4 coord);
vec4 texture3DProj (sampler3D sampler, vec4 coord, float bias);
vec4 texture3DLod (sampler3D sampler, vec3 coord, float lod);
vec4 texture3DProjLod (sampler3D sampler, vec4 coord, float lod);

vec4 textureCube(samplerCube sampler, vec3 coord);
vec4 textureCube(samplerCube sampler, vec3 coord, float bias);
vec4 textureCubeLod(samplerCube sampler, vec3 coord, float lod);

vec4 shadow1D(sampler1DShadow sampler, vec3 coord);
vec4 shadow1D(sampler1DShadow sampler, vec3 coord, float bias);
vec4 shadow2D(sampler2DShadow sampler, vec3 coord);
vec4 shadow2D(sampler2DShadow sampler, vec3 coord, float bias);
vec4 shadow1DProj(sampler1DShadow sampler, vec4 coord);
vec4 shadow1DProj(sampler1DShadow sampler, vec4 coord, float bias);
vec4 shadow2DProj(sampler2DShadow sampler, vec4 coord);
vec4 shadow2DProj(sampler2DShadow sampler, vec4 coord, float bias);
vec4 shadow1DLod(sampler1DShadow sampler, vec3 coord, float lod);
vec4 shadow2DLod(sampler2DShadow sampler, vec3 coord, float lod);
vec4 shadow1DProjLod(sampler1DShadow sampler, vec4 coord, float lod);
vec4 shadow2DProjLod(sampler2DShadow sampler, vec4 coord, float lod);





