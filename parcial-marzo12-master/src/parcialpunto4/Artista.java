/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpunto4;

import java.util.ArrayList;

/**
 *
 * @author smondragon
 */
public class Artista extends Persona{
    private String curriculum;
    private String distinciones;
    private ArrayList<Obra> obras;

    public Artista(String nombre, String apellido, String curriculum, String distinciones) {
        super(nombre, apellido);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
        this.obras = new ArrayList<>();
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
    
    
}
