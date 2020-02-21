/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpunto4;

/**
 *
 * @author smondragon
 */
public class Comprador extends Persona{
    private Cuenta cuenta;

    public Comprador(String nombre, String apellido) {
        super(nombre, apellido);
        this.cuenta = new Cuenta();
    }
    
    
}
