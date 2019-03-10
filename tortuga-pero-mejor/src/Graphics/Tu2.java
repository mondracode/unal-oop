package Graphics;

//Tu2.java
import ch.aplu.turtle.*;

class Tu2
{
Turtle joe = new Turtle();

Tu2()
{
 int i = 0;            //Starting value
 while (i < 4)         //Condition
 {
   joe.forward(100);   //Actions
   joe.right(90);
   i++;                //Increasing starting value
 }
}

public static void main(String[] args)
{
 new Tu2();
}
}
