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
public class Programa extends Informacion{
    private String descripcion;
    private String tipo;
    public Programa(String nombre, String descripcion, int telefono, String tipo) {
        super(nombre, telefono);
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
