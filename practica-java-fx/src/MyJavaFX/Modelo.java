/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaFX;

/**
 *
 * @author smondragon
 */
public class Modelo {
    private int numero;
    private String nombre;
    private String apellido;
    
    public void incrementar(){
        this.numero++;
    }
    public void disminuir(){
        this.numero--;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
