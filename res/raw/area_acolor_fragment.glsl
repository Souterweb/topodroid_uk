// area_acolor_fragment.glsl

precision mediump float;

varying vec4 vColor;

void main()
{
  gl_FragColor = vColor;
}