/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    
    private Chasis chasis;
    private Llanta[] llantas;
    
    private int xref;
    private int yref;
    private int ancho;
    private int alto;

    public Carro(int xref, int yref, int ancho, int alto) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
        //Chasis chasis = new Chasis();
    }

    public int getXref() {
        return xref;
    }

    public int getYref() {
        return yref;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setXref(int xref) {
        this.xref = xref;
    }

    public void setYref(int yref) {
        this.yref = yref;
    }
    
    public void mover(){
        this.xref++;
    } 
    
    public void moverIzq(){
        this.xref--;
    }
}