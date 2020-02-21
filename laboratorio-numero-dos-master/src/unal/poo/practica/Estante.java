/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;


import java.util.ArrayList;

/**
 *
 * @author Santiago Mondragón G
 */
public class Estante{
    private ArrayList<Caja> cajas;

    public Estante() {
        this.cajas = new ArrayList<>();
        
    }   

    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }
    
}
