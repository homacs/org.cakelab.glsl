// Fragement Shader


#version 150

#extension GL_ARB_shader_subroutine : enable

// the signature
subroutine vec4 colorRedBlue ();
 
// option 1
subroutine (colorRedBlue ) vec4 redColor() {

    return vec4(1.0, 0.0, 0.0, 1.0);
} 
 
// option 2
subroutine (colorRedBlue ) vec4 blueColor() {
 
    return vec4(0.0, 0.0, 1.0, 1.0);
}


subroutine uniform colorRedBlue myRedBlueSelection;

void main()
{
    color = myRedBlueSelection();
    gl_Position = pvm * position ;
}