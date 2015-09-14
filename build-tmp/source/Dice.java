import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die one;
int count = 0;
public void setup()
{
	
	noLoop();
	size (400,400);
}
public void draw()
{
	background (255);
	count = 0;
	for (int x = 10; x<= 380; x+=30)
	{
		for (int y= 10; y<=300; y+=30)
		{

		Die one = new Die (x,y);
		one.roll();
		one.show();
		}
	}
	fill(0);
	text (count, 190,350);
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY, num, size;
	//variable declarations here
	Die(int x, int y) 
	{
		myX = x;
		myY = y;
		num= (int)(Math.random()*6)+1;
		size = 25;
		//variable initializations here
	}
	public void roll()
	{
		num= (int)(Math.random()*6)+1;
	}
	public void show()
	{
		fill(0);
		rect (myX,myY,size,size);
			if (num == 1)
		{
			fill (255);
			ellipse(myX+ size/2,myY+size/2, size/5, size/5);
			count = count +1;
		}
			if (num == 2)
		{
			fill (100,100,100);
			ellipse(myX+ size/2-size/6,myY+size/2, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2, size/5, size/5);
			count = count +2;
		}
			if (num == 3)
		{
			fill (100,50,150);
			ellipse(myX+ size/2-size/6,myY+size/2, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2, size/5, size/5);
			ellipse(myX+ size/2, myY + size/2-size/4, size/5, size/5);
			count = count + 3;
		}
			if (num == 4)
		{
			fill (200,200,50);
			ellipse(myX+ size/2-size/6,myY+size/2-size/5, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2-size/5, size/5, size/5);
			ellipse(myX+ size/2-size/6,myY+size/2+size/5, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2+size/5, size/5, size/5);
			count = count+4;
		}
			if (num == 5)
		{
			fill (50,200,200);
			ellipse(myX+ size/2-size/6,myY+size/2-size/5, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2-size/5, size/5, size/5);
			ellipse(myX+ size/2-size/6,myY+size/2+size/5, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2+size/5, size/5, size/5);
			ellipse(myX+ size/2,myY+size/2, size/5, size/5); 
			count = count+5;
		}
			if (num == 6)
		{ 
			fill (100,200,50);
			ellipse(myX+ size/2-size/6,myY+size/2, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2, size/5, size/5);
			ellipse(myX+ size/2-size/6,myY+size/2-size/4, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2-size/4, size/5, size/5);
			ellipse(myX+ size/2-size/6,myY+size/2+size/4, size/5, size/5);
			ellipse(myX+ size/2+size/6,myY+size/2+size/4, size/5, size/5);
			count = count+6;
		}

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
