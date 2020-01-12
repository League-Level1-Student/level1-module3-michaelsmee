int x=400;
int y=600;
Car poop = new Car( 0, 50, 20, 10);
Car tyler = new Car(0,200,20,10);
Car wiltz = new Car(0,400,20,10);

void setup(){
size(800,600);



}

void draw(){
background(0,0,200); 
fill(0,200,0);
ellipse(x,y,50,50); 

if(x<0){
  exit();
}
else if(x>800){
  exit(); 
}
  else if(y<0){
   y=600;; 
  }
  else if(y>600){
   exit(); 
  }




poop.opthermove();
poop.display();
 if(intersects(poop)){
exit();
 }
 
wiltz.move();
wiltz.display();
if(intersects(wiltz)){
exit();
 }

tyler.opthermove();
tyler.display();
if(intersects(tyler)){
exit();
 }
}


void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
               y-=15;
             }
            else if(keyCode == DOWN)
            {
               y+=15;           
            }
            else if(keyCode == RIGHT)
            {
               x+=15;             
            }
            else if(keyCode == LEFT)
            {
               x-=15;           
            }
      }
}

boolean intersects(Car car) {
 if ((y > car.gety() && y < car.gety()+50) &&
                (x > car.getx() && x < car.getx()+car.getsize())) {
   return true;
  }
 else  {
  return false;
  
 }
}






class Car{
int x1;
int y1;
int size;
int speed;

public Car(int x1,int y1,int size,int speed){
  this.x1=x1;
  this.y1=y1;
  this.size=size;
  this.speed=speed;
}

int getx(){
  return this.x1;
} 

int gety(){
  return this.y1; 
}

int getsize(){
  return this.size; 
}

void display()
{
      fill(0,255,0);
      rect(x1 , y1, size, 50);
}

void move(){
 x1+=speed;
if( x1>800) {
 x1=1; 
}
}
void opthermove(){
 x1-=speed;
 if(x1<0){
   x1=800; 
}

}
}
