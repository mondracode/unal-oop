/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

import java.time.LocalDateTime;

/**
 *
 * @author smondragon
 */
public class MateriaPrima extends Information{
    private String cultivado_por;
    private LocalDateTime fecha_de_salida;
    public MateriaPrima(String nombre, String descripcion, String cultivado_por) {
        super(nombre, descripcion, 0, 0);
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

    public LocalDateTime getFecha_de_salida() {
        return fecha_de_salida;
    }

    public void setFecha_de_salida(LocalDateTime fecha_de_salida) {
        this.fecha_de_salida = fecha_de_salida;
    }
    
    
}
