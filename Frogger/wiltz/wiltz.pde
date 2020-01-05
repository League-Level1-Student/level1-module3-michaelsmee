int x=400;
int y=600;
Car poop = new Car( 0, 50, 20, 20);
Car tyler = new Car(0,200,20,20);
Car wiltz = new Car(0,400,20,20);

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
   exit(); 
  }
  else if(y>600){
   exit(); 
  }
poop.display();
wiltz.display();
tyler.display();

poop.move();
wiltz.move();
tyler.move();
}


void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
               y-=1;
             }
            else if(keyCode == DOWN)
            {
               y+=1;           
            }
            else if(keyCode == RIGHT)
            {
               x+=1;             
            }
            else if(keyCode == LEFT)
            {
               x-=1;           
            }
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

void display()
{
      fill(0,255,0);
      rect(x1 , y1, size, 50);
}

void move(){
 x+=speed;
if( x>800) {
 x=0; 
}
}


}
