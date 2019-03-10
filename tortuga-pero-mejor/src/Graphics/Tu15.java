package turtle;

//Tu15.java
import ch.aplu.turtle.*;
import java.awt.Color;

class Tu15
{
Tu15()
{
 Turtle joe = new Turtle();  //generates Turtel joe
 Turtle luka = new Turtle(); //generates Turtle luka in a different window
 luka.setColor(Color.red);
 luka.setPenColor(Color.green);

 for (int i = 0; i < 5; i++)
 {
   square(joe);    //joe draws a square
   joe.forward(30);
   square(luka);   //luka draws a square
   luka.forward(30); 
 }
}

void square(Turtle t)
{
 for (int i = 0; i < 4; i++)
 {
   t.forward(30);
   t.right(90);
 }
}

public static void main(String[] args)
{
 new Tu15();
}
}