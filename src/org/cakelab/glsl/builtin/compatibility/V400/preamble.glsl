/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                  OpenGL 4.0
//                            Open GL Shading Language 
//                                    V 4.00
//                              Compatibility Profile
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#define GL_compatibility_profile 1

#include <core/V400/preamble.glsl>



// -----------------------------------------------------------------------------------
//                           7.1.1 Compatibility Profile Built-In Language Variables
//                           7.2 Compatibility Profile Vertex Shader Built-In Inputs
// -----------------------------------------------------------------------------------

// most of it incorporated in:  core/V400/preamble.glsl

#ifdef FRAGMENT_SHADER
in float gl_FogFragCoord; 
in vec4  gl_TexCoord[]; 
in vec4  gl_Color; 
in vec4  gl_SecondaryColor; 
#endif // FRAGMENT_SHADER


// -----------------------------------------------------------------------------------
//                           7.3.1 Compatibility Profile Built-In Constants
// -----------------------------------------------------------------------------------
const   int  gl_MaxTextureUnits = 2;
const   int  gl_MaxTextureCoords = 8;
const   int  gl_MaxClipPlanes = 8;

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
