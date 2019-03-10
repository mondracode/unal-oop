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
public class Chasis {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    
    public void mover(int x, int y){
        this.x+=x;
        this.y+=y;
    }
}
