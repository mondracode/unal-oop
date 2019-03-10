/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadfeb17;

/**
 *
 * @author Santiago Mondragón G
 */
public abstract class Informacion {
    protected String nombre;
    protected int telefono;

    public Informacion(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public double getTelefono(){
        return this.telefono;
    }
}
