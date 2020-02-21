/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author Santiago Mondragón G
 */
public class Cliente {
    private String nombre;
    private double fondos;

    public Cliente(String nombre, double fondos) {
        this.nombre = nombre;
        this.fondos = fondos;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
