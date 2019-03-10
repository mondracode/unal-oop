package Rectangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public int calcularArea(){
        return base*altura;
    }
    
    public int calcularPerimetro(){
        return (2*base)+(2*altura);
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
