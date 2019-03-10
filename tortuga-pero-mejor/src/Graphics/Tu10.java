package Graphics;

//Tu10.java
import ch.aplu.turtle.*;
import java.awt.Color;

class Tu10
{
Turtle joe = new Turtle();

Tu10()
{
 joe.hideTurtle();
 for(int i = 0; i < 36; i++)
 {
   int r = (int)(Math.random()*255); 
   int g = (int)(Math.random()*255);
   int b = (int)(Math.random()*255);
   Color c = new Color(r, g, b);
   square(c);
   joe.right(10);
 }
}

void square(Color c) // parameter
{
 joe.setPenColor(c);
 for (int i = 0; i < 4; i++)
 {
   joe.forward(100);
   joe.right(90);
 }
}

public static void main(String[] args)
{
 new Tu10();
}
}