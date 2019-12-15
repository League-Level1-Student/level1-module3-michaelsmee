int x=1000;
int y=500;
int birdYVelocity = 30;
int gravity = 1; 
int upperPipeHeight = (int) random(100, 400);
int pipeGap = 300;
int lowerY = upperPipeHeight + pipeGap;
int score;

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
rect(x-=1, 0, 50,upperPipeHeight );
  teleportPipes();
  


  fill(0, 250, 0);
rect(x-=1, lowerY, 50, lowerY );
teleportPipes();

if(intersectsPipes() == true || y>=1000){
score=0;
  exit();


}
text(score,100,100);

}
void mousePressed() {

  y-=birdYVelocity;


}


void teleportPipes() {

   if(x==0){
 x=1000;
upperPipeHeight = (int) random(100, 400);
lowerY = upperPipeHeight + pipeGap;
 score+=1;
 }

}
boolean intersectsPipes() { 
         if (y < upperPipeHeight && 500 > x && 500 < (x+50)){
            return true; }
        else if (y>lowerY && 500 > x && 500 < (x+50)) {
            return true; }
        else { return false; }
}
