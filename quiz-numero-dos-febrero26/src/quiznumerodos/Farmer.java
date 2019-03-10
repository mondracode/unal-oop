/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

import java.util.ArrayList;

/**
 *
 * @author smondragon
 */
public class Farmer extends Information{
    private ArrayList<MateriaPrima> materia_prima;

    public Farmer(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
    }

    public ArrayList<MateriaPrima> getMateria_prima() {
        return materia_prima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getLatitud() {
        return latitud;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public void hacerMateriaPrima(String nombre, String descripcion, int latitud, int longitud, String cultivado_por){
        
    }
    
    public void enviarMateriaPrima(MateriaPrima mp, Manufacturer m){
        m.getMateria_prima().add(mp);
    }
    
    public void enviarTodasLasExistencias(ArrayList<MateriaPrima> mps, Manufacturer m){
        for(int i=0; i<mps.size(); i++){
            m.getMateria_prima().add(mps.get(i));
        }
    }
}
