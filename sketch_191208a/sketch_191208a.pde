int x=1000;
int y=500;
int birdYVelocity = 30;
int gravity = 1; 
int upperPipeHeight = (int) random(100, 400);

void setup() {
  
  size(1000,1000);  
  
}

void draw() {
  
   background(100, 200, 100);
fill(200, 0, 0);
stroke(0, 0, 0);
ellipse(500, y, 20, 20);
  y+=gravity;  
  
 
 fill(0, 250, 0);
rect(x-=1, 10, 50,upperPipeHeight );
  teleportPipes();
}



void mousePressed() {
  
  y-=birdYVelocity;
  
  
}


void teleportPipes() {
  
   if(x==0){
 x=1000;
upperPipeHeight = (int) random(100, 400);

 }

}
