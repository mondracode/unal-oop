/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangulo;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        int base=0;
        int altura=0;
        Rectangulo[] r1 = new Rectangulo [11];
        Scanner read = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
        r1[i] = new Rectangulo (base, altura);
        while (base<=0 || altura<=0){
        base = read.nextInt();
        altura = read.nextInt();
        }
        r1[i].setBase(base);
        r1[i].setAltura(altura);
        System.out.println("area es igual a " + r1[i].area (base, altura));
        System.out.println("perimetro es igual a " + r1[i].perimetro (base, altura));
        base=0;
        altura=0;
        }
    }          
}

