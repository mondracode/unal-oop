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
public class Estudiante extends Informacion{
    private String apellido;
    private String colegio;
    private int annio_graduacion;

    public Estudiante(String nombre, String apellido, String colegio, int annio_graduacion, int telefono) {
        super(nombre, telefono);
        this.apellido = apellido;
        this.colegio = colegio;
        this.annio_graduacion = annio_graduacion;
    }
    
    public String getAplelido() {
        return apellido;
    }

    public String getColegio() {
        return colegio;
    }

    public int getAnnio_graduacion() {
        return annio_graduacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTelefono() {
        return telefono;
    }
    
    
}
