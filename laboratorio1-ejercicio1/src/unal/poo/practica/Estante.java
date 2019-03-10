/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import java.util.ArrayList;
/**
 *
 * @author Santiago Mondragón G
 */
public class Estante extends becker.robots.Thing {
    private ArrayList<Caja> cajas;

    public Estante(City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.cajas = new ArrayList<Caja>();
        cajas.add(new Caja());
        cajas.add(new Caja());
        cajas.add(new Caja());
    }

    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }

}
