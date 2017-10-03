/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.3
//                            Open GL Shading Language 
//                                    V 4.30
//                              Compatibility Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_compatiblity_profile 1

// include V430 core symbols and functions
#include <core/V430/preamble.glsl>



/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// -----------------------------------------------------------------------------------
//                           7.2 Compatibility Profile Vertex Shader Built-In Inputs
// -----------------------------------------------------------------------------------

// incorporated in:  core/V430/preamble.glsl



// -----------------------------------------------------------------------------------
//                           7.1.1 Compatibility Profile Built-In Language Variables
// -----------------------------------------------------------------------------------

#ifdef FRAGMENT_SHADER

in gl_PerFragment {
    in float gl_FogFragCoord; 
    in vec4  gl_TexCoord[]; 
    in vec4  gl_Color; 
    in vec4  gl_SecondaryColor; 
};

out vec4  gl_FragColor;
out vec4  gl_FragData[gl_MaxDrawBuffers];

#endif



// -----------------------------------------------------------------------------------
//                           7.3.1 Compatibility Profile Built-In Constants
// -----------------------------------------------------------------------------------
const   int  gl_MaxTextureUnits = 2;
const   int  gl_MaxTextureCoords = 8;
const   int  gl_MaxClipPlanes = 8;
const   int  gl_MaxVaryingFloats = 60;

// missing in specification:
const   int  gl_MaxLights = 8;

// -----------------------------------------------------------------------------------
//                           7.4.1 Compatibility Profile State
// -----------------------------------------------------------------------------------
//
// compatibility profile only
//
uniform mat4  gl_ModelViewMatrix;
uniform mat4  gl_ProjectionMatrix;
uniform mat4  gl_ModelViewProjectionMatrix;
uniform mat4  gl_TextureMatrix[gl_MaxTextureCoords];
//
// compatibility profile only
//
uniform mat3  gl_NormalMatrix; // transpose of the inverse of the 
                               // upper leftmost 3x3 of gl_ModelViewMatrix
uniform mat4  gl_ModelViewMatrixInverse;
uniform mat4  gl_ProjectionMatrixInverse;
uniform mat4  gl_ModelViewProjectionMatrixInverse;
uniform mat4  gl_TextureMatrixInverse[gl_MaxTextureCoords];
uniform mat4  gl_ModelViewMatrixTranspose;
uniform mat4  gl_ProjectionMatrixTranspose;
uniform mat4  gl_ModelViewProjectionMatrixTranspose;
uniform mat4  gl_TextureMatrixTranspose[gl_MaxTextureCoords];
uniform mat4  gl_ModelViewMatrixInverseTranspose;
uniform mat4  gl_ProjectionMatrixInverseTranspose;
uniform mat4  gl_ModelViewProjectionMatrixInverseTranspose;
uniform mat4  gl_TextureMatrixInverseTranspose[gl_MaxTextureCoords];
//
// compatibility profile only
//
uniform float gl_NormalScale;

//
// compatibility profile only
//
uniform vec4  gl_ClipPlane[gl_MaxClipPlanes];
//
// compatibility profile only
//
struct gl_PointParameters
 {
    float size;
    float sizeMin;
    float sizeMax;
    float fadeThresholdSize;
    float distanceConstantAttenuation;
    float distanceLinearAttenuation;
    float distanceQuadraticAttenuation;
};
uniform gl_PointParameters gl_Point;
//
// compatibility profile only
//
struct gl_MaterialParameters
 {
    vec4  emission;    // Ecm
    vec4  ambient;     // Acm
    vec4  diffuse;     // Dcm
    vec4  specular;    // Scm
    float shininess;   // Srm
};
uniform gl_MaterialParameters  gl_FrontMaterial;
uniform gl_MaterialParameters  gl_BackMaterial;

//
// compatibility profile only
//
struct gl_LightSourceParameters
{
    vec4  ambient;             // Acli
    vec4  diffuse;             // Dcli
    vec4  specular;            // Scli
    vec4  position;            // Ppli
    vec4  halfVector;          // Derived: Hi
    vec3  spotDirection;       // Sdli
    float spotExponent;        // Srli
    float spotCutoff;          // Crli
                               // (range: [0.0,90.0], 180.0)
    float spotCosCutoff;       // Derived: cos(Crli)
                               // (range: [1.0,0.0],-1.0)
    float constantAttenuation; // K0
    float linearAttenuation;   // K1
    float quadraticAttenuation;// K2
};
uniform gl_LightSourceParameters  gl_LightSource[gl_MaxLights];
struct gl_LightModelParameters
{
    vec4  ambient;       // Acs
};
uniform gl_LightModelParameters  gl_LightModel;
//
// compatibility profile only
//
// Derived state from products of light and material.
//
struct gl_LightModelProducts
{
    vec4  
sceneColor;     // Derived. Ecm + Acm * Acs
};
uniform gl_LightModelProducts gl_FrontLightModelProduct;
uniform gl_LightModelProducts gl_BackLightModelProduct; 
struct gl_LightProducts
{
    vec4  ambient;        // Acm * Acli
    vec4  diffuse;        // Dcm * Dcli
    vec4  specular;       // Scm * Scli
};
uniform gl_LightProducts gl_FrontLightProduct[gl_MaxLights];
uniform gl_LightProducts gl_BackLightProduct[gl_MaxLights];

//
// compatibility profile only
//
uniform vec4  gl_TextureEnvColor[gl_MaxTextureUnits];
uniform vec4  gl_EyePlaneS[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneT[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneR[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneQ[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneS[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneT[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneR[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneQ[gl_MaxTextureCoords];
//
// compatibility profile only
//
struct gl_FogParameters
{
    vec4 color;
    float density;
    float start;
    float end;
    float scale;   // Derived:   1.0 / (end - start)
};
uniform gl_FogParameters gl_Fog;






/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// -----------------------------------------------------------------------------------
//                           8.5 Geometric Functions
// -----------------------------------------------------------------------------------
vec4 ftransform();


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




