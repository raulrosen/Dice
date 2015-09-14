Die one;
int count = 0;
void setup()
{
	
	noLoop();
	size (400,400);
}
void draw()
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
void mousePressed()
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
	void roll()
	{
		num= (int)(Math.random()*6)+1;
	}
	void show()
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
