package Rectangulo;


import Rectangulo.Rectangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class PruebaRectangulo_1 {
    public static void main(String[] args) {
        
           Rectangulo[] rec = new Rectangulo[10];
           
           for(int i=1;i<11; i++){
               rec[i-1]= new Rectangulo(i, i);
               System.out.println("Rectangulo " + (i));
               System.out.println("El perimetro es " + rec[i-1].calcularPerimetro());
               System.out.println("El area es " + rec[i-1].calcularArea());
               System.out.println("_________");
           }  
    }
}
