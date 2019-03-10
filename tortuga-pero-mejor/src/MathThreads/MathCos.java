/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathThreads;

/**
 *
 * @author Isabel-Fabian
 */
class MathCos extends Thread {

    public double deg;
    public double res;

    public MathCos(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing cos of " + deg);
        double Deg2Rad = Math.toRadians(deg);
        res = Math.cos(Deg2Rad);
        System.out.println("Exit from MathCos. Res = " + res);
    }
}
