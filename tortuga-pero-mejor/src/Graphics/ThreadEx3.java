package Graphics;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
public ThreadEx3()
{
 Turtle john = new Turtle(this);
 Turtle laura = new Turtle(this, Color.red);
 Turtle sara = new Turtle(this, Color.green);
 john.setPos(-135, -50);
 laura.setPos(-10, -50);
 sara.setPos(115, -50);
 laura.setPenColor(Color.red);
 sara.setPenColor(Color.green);
 new TurtleThread(john).start();
 new TurtleThread(laura).start();
 new TurtleThread(sara).start();
}

private class TurtleThread extends Thread
{
 private Turtle turtle;

 private TurtleThread(Turtle turtle)
 {
   this.turtle = turtle;
 }

 public void run()
 {
   for (int i = 0; i < 9; i++)
     segment(turtle);
 }
}

private void segment(Turtle t)
{
 t.forward(140);
 t.right(160);
}

public static void main(String[] args)
{
 new ThreadEx3();
}
}