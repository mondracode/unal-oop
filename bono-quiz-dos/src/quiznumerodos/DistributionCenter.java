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
public class DistributionCenter extends Information{
    private ArrayList<Producto> productos;

    public DistributionCenter(String nombre, String descripcion, int latitud, int longitud) {
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
    
    public void venderProductos(Producto p, Retail r){
        p.setDistribuido_por(this.getNombre());
        p.setFecha_salida_distribuidor(LocalDateTime.now());
        r.getProductos().add(p);
    }
    
    public void venderTodasLasExistencias(ArrayList<Producto> productos, Retail r){
        for(int i=0; i<productos.size(); i++){
            productos.get(i).setFecha_salida_distribuidor(LocalDateTime.now());
            productos.get(i).setDistribuido_por(this.getNombre());
            r.getProductos().add(productos.get(i)); 
        }
    }
}
