package Graphics;

import ch.aplu.turtle.*;

//joe.hideTurtle()	The Turtle becomes invisible. This enables it to move and draw faster
class Tu7
{
  Turtle joe = new Turtle();

  Tu7()
  {
    for (int i = 0; i < 180; i++)
    {
      if (i < 50)
        joe.forward(2);
      else
        if (i < 100)
        {
          joe.right(3.6);
          joe.forward(2);
        }
        else
          if (i < 150)
          {
            joe.hideTurtle();
            
            joe.left(3.6);
            joe.forward(2);
          }
          else
            joe.forward(20);
    }
  }

  public static void main(String[] args)
  {
    new Tu7();
  }
}