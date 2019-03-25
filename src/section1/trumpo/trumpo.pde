PImage mustache;
PImage friend;
void setup(){
size(600,760);
friend = loadImage("friend.jpg");

friend.resize(600,760);
mustache = loadImage("mustache.png");
}
void draw(){
background(friend);
mustache.resize(200,100);
image(mustache,mouseX,mouseY);
}