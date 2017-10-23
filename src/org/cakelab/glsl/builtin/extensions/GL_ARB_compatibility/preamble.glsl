/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                                 GL_ARB_compatibility
//                                 since GLSL v 1.40
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////

//
// The following special macros are available only when parsing the preamble
//
#if !defined(VERTEX_SHADER) &&  !defined(FRAGMENT_SHADER) && !defined(GENERIC_SHADER)
#error undefined shader type!
#endif

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    V A R I A B L E S
//
/////////////////////////////////////////////////////////////////////////////////////////////////


// required constants not available in #version 100 es. 
#if __VERSION__ < 110
const int  gl_MaxTextureUnits = 2;              // GL 1.3
#endif


//
// The following were missing in the specification
//
const int  gl_MaxTextureCoords = 8;             // deprecated
const int gl_MaxLights = 8;

// -----------------------------------------------------------------------------------
//                           7.1 Vertex Shader Special Variables
// -----------------------------------------------------------------------------------
out vec4  gl_ClipVertex;
const int  gl_MaxClipPlanes = 8;
uniform vec4  gl_ClipPlane[gl_MaxClipPlanes];



// -----------------------------------------------------------------------------------
//                           7.3 Vertex Shader Built-In  Inputs
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
in vec4  gl_Color;
in vec4  gl_SecondaryColor;
in vec3  gl_Normal;
in vec4  gl_Vertex;
in vec4  gl_MultiTexCoord0;
in vec4  gl_MultiTexCoord1;
in vec4  gl_MultiTexCoord2;
in vec4  gl_MultiTexCoord3;
in vec4  gl_MultiTexCoord4;
in vec4  gl_MultiTexCoord5;
in vec4  gl_MultiTexCoord6;
in vec4  gl_MultiTexCoord7;
in float gl_FogCoord;
#endif


// -----------------------------------------------------------------------------------
//                           7.5.1 ARB_compatibility State
// -----------------------------------------------------------------------------------

uniform mat4  gl_ModelViewMatrix;
uniform mat4  gl_ProjectionMatrix;
uniform mat4  gl_ModelViewProjectionMatrix;
uniform mat4  gl_TextureMatrix[gl_MaxTextureCoords];

uniform mat3  gl_NormalMatrix;

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


uniform float gl_NormalScale;
uniform vec4  gl_ClipPlane[gl_MaxClipPlanes];

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
// Deprecated.
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
// Deprecated.
// Derived state from products of light and material.
//
struct gl_LightModelProducts
 {
    vec4  sceneColor;     // Derived. Ecm + Acm * Acs
};
uniform gl_LightModelProducts gl_FrontLightModelProduct;
uniform gl_LightModelProducts gl_BackLightModelProduct; 
struct gl_LightProducts
 {
    vec4  ambient;        // Acm * Acli
    vec4  diffuse;        // Dcm * Dcli
    vec4  specular;       // Scm * Scli
};
uniform gl_LightProducts gl_FrontLightProduct [gl_MaxLights];
uniform gl_LightProducts gl_BackLightProduct [gl_MaxLights];

uniform vec4  gl_TextureEnvColor [gl_MaxTextureUnits];
uniform vec4  gl_EyePlaneS [gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneT[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneR[gl_MaxTextureCoords];
uniform vec4  gl_EyePlaneQ[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneS[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneT[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneR[gl_MaxTextureCoords];
uniform vec4  gl_ObjectPlaneQ[gl_MaxTextureCoords];
//
// Deprecated.
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


// -----------------------------------------------------------------------------------
//                           7.6.1 ARB_compatibility Vertex Outputs and Fragment Inputs
// -----------------------------------------------------------------------------------
#ifdef VERTEX_SHADER
out vec4  gl_FrontColor;
out vec4  gl_BackColor;
out vec4  gl_FrontSecondaryColor;
out vec4  gl_BackSecondaryColor;
out vec4  gl_TexCoord[];
out float gl_FogFragCoord;
#endif

#ifdef FRAGMENT_SHADER
in float gl_FogFragCoord;
in vec4  gl_TexCoord[];
in vec4  gl_Color;
in vec4  gl_SecondaryColor;
#endif



/////////////////////////////////////////////////////////////////////////////////////////////////
//
//                           B U I L T - I N    F U N C T I O N S
//
/////////////////////////////////////////////////////////////////////////////////////////////////

// -----------------------------------------------------------------------------------
//                           8.4 Geometric Functions
// -----------------------------------------------------------------------------------
vec4 ftransform();


//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
