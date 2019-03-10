/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathThreads;

class MathThreads {

    public static void main(String args[]) {
        MathSin st = new MathSin(45);
        MathCos ct = new MathCos(60);
        MathTan tt = new MathTan(30);
        st.start();
        ct.start();
        tt.start();
        try { // wait for completion of all thread and then sum
            st.join();
            ct.join(); //wait for completion of MathCos object
            tt.join();
            double z = st.res + ct.res + tt.res;
            System.out.println("Sum of sin, cos, tan = " + z);
        } catch (InterruptedException IntExp) {
        }
    }
}
