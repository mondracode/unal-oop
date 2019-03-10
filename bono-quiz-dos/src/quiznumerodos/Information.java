/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

/**
 *
 * @author smondragon
 */
public abstract class Information {
    protected String nombre;
    protected String descripcion;
    protected int latitud;
    protected int longitud;

    public Information(String nombre, String descripcion, int latitud, int longitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    
}
