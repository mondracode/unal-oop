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
public class Manufacturer extends Information{
    private ArrayList<Producto> productos;
    private ArrayList<MateriaPrima> materia_prima;

    public Manufacturer(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productos = new ArrayList<>();
        this.materia_prima = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
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
    
    public void enviarProducto(Producto p, DistributionCenter d){
        p.setFecha_salida_fabrica(LocalDateTime.now());
        p.setFabricado_por(this.getNombre());
        d.getProductos().add(p);
    }
    
    public void enviarTodasLasExistencias(ArrayList<Producto> ps, DistributionCenter d){
        for(int i=0; i<ps.size(); i++){
            ps.get(i).setFecha_salida_fabrica(LocalDateTime.now());
            ps.get(i).setFabricado_por(this.getNombre());
            d.getProductos().add(ps.get(i));
        }
    }
}
