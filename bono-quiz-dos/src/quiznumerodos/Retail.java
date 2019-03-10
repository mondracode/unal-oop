/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author smondragon
 */
public class Retail extends Information{
    private ArrayList<Producto> productos;

    public Retail(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
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

    public void venderProducto(Producto p){
        p.setAdquirido_en(this.getNombre());
        p.setFecha_salida_tienda(LocalDateTime.now());
    }
    
}
