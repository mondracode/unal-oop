package Graphics;

import ch.aplu.turtle.*;

class Tu6
{
  Turtle joe = new Turtle();

  Tu6()
  {
    for (int i = 0; i < 12; i++)
    {
      joe.penUp();
      

      if (i % 2 == 0)
        joe.penDown();

      joe.forward(15);
    }
  }

  public static void main(String[] args)
  {
    new Tu6();
  }
}
