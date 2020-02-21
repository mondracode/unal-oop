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
public class Producto {
    private String nombre;
    private String tipo;
    private double precio;
    private int codigo;
    private int estante_almacenamiento;
    private int caja_almacenamiento;
    private int casilla_almacenamiento;

    public Producto(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void setEstante_almacenamiento(int estante_almacenamiento) {
        this.estante_almacenamiento = estante_almacenamiento;
    }

    public void setCaja_almacenamiento(int caja_almacenamiento) {
        this.caja_almacenamiento = caja_almacenamiento;
    }

    public void setCasilla_almacenamiento(int casilla_almacenamiento) {
        this.casilla_almacenamiento = casilla_almacenamiento;
    }

    public int getEstante_almacenamiento() {
        return estante_almacenamiento;
    }

    public int getCaja_almacenamiento() {
        return caja_almacenamiento;
    }

    public int getCasilla_almacenamiento() {
        return casilla_almacenamiento;
    }
    
     
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
