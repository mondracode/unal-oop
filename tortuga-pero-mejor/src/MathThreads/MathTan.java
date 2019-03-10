/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathThreads;

class MathTan extends Thread {

    public double deg;
    public double res;

    public MathTan(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing tan of " + deg);
        double Deg2Rad = Math.toRadians(deg);
        res = Math.tan(Deg2Rad);
        System.out.println("Exit from MathTan. Res = " + res);
    }
}
