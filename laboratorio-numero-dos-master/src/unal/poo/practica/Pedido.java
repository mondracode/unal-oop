/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Santiago Mondragón G
 */
public class Pedido {
    private SimpleDateFormat fecha;
    private String texto_fecha;
    private ArrayList<Producto> productos;
    
    public Pedido() {
        this.fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();
        texto_fecha = this.fecha.format(now);
        this.productos = new ArrayList<>();
    }    

    public String getTexto_fecha() {
        return texto_fecha;
    }

    public void setTexto_fecha(String texto_fecha) {
        this.texto_fecha = texto_fecha;
    }
    
    
    public void setFecha(SimpleDateFormat fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    


    
    
    
    
}
