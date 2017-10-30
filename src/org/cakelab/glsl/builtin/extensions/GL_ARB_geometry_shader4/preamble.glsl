/////////////////////////////////////////////////////////////////////////////////////////////////
//                             
//                                Open GL Extensions 
//                                    
//                              GL_ARB_geometry_shader4
//
//                     Built-in Macros, Variables and Functions
//
/////////////////////////////////////////////////////////////////////////////////////////////////


#if __VERSION__ < 400



#if defined(GEOMETRY_SHADER)
//
// Geometry Shader Language
//


int gl_PrimitiveIDIn; // read only

varying in vec4 gl_FrontColorIn[];
varying in vec4 gl_BackColorIn[];
varying in vec4 gl_FrontSecondaryColorIn[];
varying in vec4 gl_BackSecondaryColorIn[];
varying in vec4 gl_TexCoordIn[][]; // at most will be 
                                                  // gl_MaxTextureCoords
varying in float gl_FogFragCoordIn[];
varying in vec4 gl_PositionIn[];
varying in float gl_PointSizeIn[];
varying in vec4 gl_ClipVertexIn[];

//
// add vertex shader built-in outputs
//
#if __VERSION__ < 130
vec4  gl_Position;
float gl_PointSize;
vec4  gl_ClipVertex;
#elif __VERSION__ < 150
out vec4  gl_Position;
out float gl_PointSize;
in  int   gl_VertexID;
out float gl_ClipDistance[];
out vec4  gl_ClipVertex;
#endif

varying out vec4 gl_FrontColor;
varying out vec4 gl_BackColor;
varying out vec4 gl_FrontSecondaryColor;
varying out vec4 gl_BackSecondaryColor;
varying out vec4 gl_TexCoord[]; // at most gl_MaxTextureCoords
varying out float gl_FogFragCoord;

int gl_PrimitiveID;
int gl_Layer;


void EmitVertex();   // Geometry only
void EndPrimitive(); // Geometry only





#endif // defined(GEOMETRY_SHADER)



#endif // __VERSION__ < 400
//////////////////////////////////////////////////////////////////////////////////////
//                           F I N I S H E D
//////////////////////////////////////////////////////////////////////////////////////
