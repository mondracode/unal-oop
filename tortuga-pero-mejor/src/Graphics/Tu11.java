package turtle;

//Tu11.java
import ch.aplu.turtle.*;

class Tu11
{
Turtle joe = new Turtle(); //instance variable

Tu11()
{
  joe.hideTurtle();
  for (int x = -140; x < 200; x = x + 75)
  {
    joe.setPos(x, 0);
 
    flower();
  }
}

void triangle( )
{
  for (int i = 0; i < 4; i++)
  {
    joe.forward(20);
    joe.right(120);
  }
}

void flower()
{
  for (int j = 0; j < 6; j++)
  {
    triangle();
    joe.right(180);
  }
}

public static void main(String[] args)
{
  new Tu11();
}
}