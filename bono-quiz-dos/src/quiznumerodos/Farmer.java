/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author smondragon
 */
public class Farmer extends Information{
    private ArrayList<MateriaPrima> materia_prima;

    public Farmer(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.materia_prima = new ArrayList<>();
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
    
    public void enviarMateriaPrima(MateriaPrima mp, Manufacturer m){
        mp.setFecha_de_salida(LocalDateTime.now());
        m.getMateria_prima().add(mp);
        
    }
    
    public void enviarTodasLasExistencias(ArrayList<MateriaPrima> mps, Manufacturer m){
        for(int i=0; i<mps.size(); i++){
            mps.get(i).setFecha_de_salida(LocalDateTime.now());
            m.getMateria_prima().add(mps.get(i));
        }
    }
}
