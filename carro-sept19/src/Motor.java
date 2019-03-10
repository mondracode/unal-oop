/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
public class Motor {
    private double serial;
    private int cilindraje;

    public Motor(double serial, int cilindraje) {

        this.serial = serial;
        this.cilindraje = cilindraje;
    }


    public double getSerial() {
        return serial;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setSerial(double serial) {
        this.serial = serial;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
