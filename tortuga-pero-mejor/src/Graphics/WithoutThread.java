package Graphics;

//WithoutThread.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class WithoutThread
{
public WithoutThread()
{
 Turtle john = new Turtle(); 
 Turtle laura = new Turtle(john); 
 laura.setColor(Color.red);
 laura.setPenColor(Color.red);
 laura.setPos(0, 160);
 laura.left(90);
 for (int i = 0; i < 8; i++)
 {
   step(john);
   step(laura);
 }  
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
 new WithoutThread();
}
}