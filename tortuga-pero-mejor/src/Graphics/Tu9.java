package turtle;

/*
 * 
void square()	A method is defined by the key word void, the method's name and the parameter brackets. If the method does not need any parameter the brackets are left empty.
     square()	The method square() is called and executed.
 * 
 * */
//Tu9.java

import ch.aplu.turtle.*;

class Tu9
{
Turtle joe = new Turtle();

Tu9()
{
 joe.hideTurtle();
 for (int k = 0; k < 10; k++)
 {
   square();
   joe.left(36);
 }
}

void square()
{
 for (int i = 0; i < 4; i++)
 {
   joe.forward(100);
   joe.right(90);
 }
}

public static void main(String[] args)
{
 new Tu9();
}
}