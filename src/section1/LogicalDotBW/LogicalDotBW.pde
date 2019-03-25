void setup(){
size(800,800);
}
void draw(){
if(mousePressed){
fill(#FFFFFF);
}
else{
fill(#000000);
}
ellipse(400,400,400,400);
if(mousePressed){
fill(#000000);
}
else{
fill(#FFFFFF);
}
ellipse(400,400,200,200);
if(mousePressed){
fill(#FFFFFF);
}
else{
fill(#000000);
}
ellipse(400,400,100,100);
}