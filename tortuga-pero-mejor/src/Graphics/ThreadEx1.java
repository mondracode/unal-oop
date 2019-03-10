package Graphics;

//ThreadEx1.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx1 extends TurtleFrame
{
public ThreadEx1()
{
 Turtle john = new Turtle(this);
 Turtle laura = new Turtle(this);
 laura.setColor(Color.red);
 laura.setPenColor(Color.red);
 laura.setPos(0, 160);
 laura.left(90);
 draw(john);
 draw(laura);
}

private void draw(final Turtle t)
{
 new Thread()
 {
   public void run()
   {
     for (int i = 0; i < 8; i++)
       step(t);
   }
 }.start();
}


private void step(Turtle t)
{
 t.forward(20);
 t.left(90);
 t.forward(20);
 t.right(90);
}

public static void main(String[] args)
{
 new ThreadEx1();
}
}