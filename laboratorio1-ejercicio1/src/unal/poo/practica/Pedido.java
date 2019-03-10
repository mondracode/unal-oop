/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Santiago Mondragón G
 */
public class Pedido {
    
    private ArrayList<Producto> productos;
    private String fecha;

    public Pedido() {
        this.productos = new ArrayList<Producto>();
        SimpleDateFormat formato_fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        this.fecha = formato_fecha.format(fecha);
    }

    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getFecha() {
        return fecha;
    }
    
    public boolean imprimirFactura(ArrayList<Producto> productitos){
        int total_compra = 0;
        System.out.println("AMAZON");
        System.out.println("______");
        System.out.print("Fecha de compra: ");
        System.out.println(this.fecha);
        System.out.println("Items comprados:");
        for(int i=0; i<productitos.size(); i++){
            System.out.println(productitos.get(i).getNombre()+"   Precio:     "+productitos.get(i).getPrecio());
            total_compra+= productitos.get(i).getPrecio();
        }
        
        System.out.println("TOTAL PAGADO: "+total_compra);
        System.out.println("Gracias por preferirnos");
        
        return true;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
}
