package Graphics;

//ThreadEx2.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx2 extends TurtleFrame
{
public ThreadEx2()
{
 Turtle john = new Turtle(this);
 Turtle laura = new Turtle(this, Color.red);
 Turtle sara = new Turtle(this, Color.green);
 john.setPos(-100, -100);
 laura.setPos(-20, -100);
 sara.setPos(60, -100);
 laura.setPenColor(Color.red);
 sara.setPenColor(Color.green);
 draw(john);
 draw(laura);
 draw(sara);
}

private void draw(final Turtle t)
{
 new Thread()
 {
   public void run()
   {
     for (int i = 0; i < 5; i++)
       square(t);
   }
 }.start();
}

private void square(Turtle t)
{
 for (int i = 0; i < 4; i++)
   t.forward(40).right(90);
 t.forward(40);
}

public static void main(String[] args)
{
 new ThreadEx2();
}

}