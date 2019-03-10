/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathThreads;

/* MathThreads.java: A program with multiple threads performing concurrent
operations. */
class MathSin extends Thread {

    public double deg;
    public double res;

    public MathSin(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing sin of " + deg);
        double Deg2Rad = Math.toRadians(deg);
        res = Math.sin(Deg2Rad);
        System.out.println("Exit from MathSin. Res = " + res);
    }
}
