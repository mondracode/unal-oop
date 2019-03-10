/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

/**
 *
 * @author smondragon
 */
public class MateriaPrima extends Information{
    private String cultivado_por;
    public MateriaPrima(String nombre, String descripcion, int latitud, int longitud, String cultivado_por) {
        super(nombre, descripcion, latitud, longitud);
        this.cultivado_por = cultivado_por;
    }

    public String getCultivado_por() {
        return cultivado_por;
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
    
    
}
