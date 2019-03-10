/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

public class Rectangulo {
     private int base;
     private int altura;
     
     public Rectangulo (int base, int altura){
         this.base=base;
         this.altura=altura;
     }
     
    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    

     
    public int perimetro(int base, int altura){
    int per=(2*base)+(2*altura);
    return per;
    }
    public int area (int base, int altura){
    int ar= base*altura;
    return ar;
    }
     
    
    }
