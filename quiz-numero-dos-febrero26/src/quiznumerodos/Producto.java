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
public class Producto extends Information{
    private double numero_de_lote;
    private String cultivado_por;
    private String fabricado_por;
    private String distribuido_por;
    private String adquirido_en;
    private String codigo;
    private double precio;
    private ArrayList<MateriaPrima> componentes;

    public Producto(ArrayList<MateriaPrima> componentes, String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.componentes = componentes;
        this.cultivado_por = componentes.get(0).getCultivado_por();
    }

    public double getNumero_de_lote() {
        return numero_de_lote;
    }

    public String getCultivado_por() {
        return cultivado_por;
    }

    public String getFabricado_por() {
        return fabricado_por;
    }

    public String getDistribuido_por() {
        return distribuido_por;
    }

    public String getAdquirido_en() {
        return adquirido_en;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<MateriaPrima> getComponentes() {
        return componentes;
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

    public void setNumero_de_lote(double numero_de_lote) {
        this.numero_de_lote = numero_de_lote;
    }

    public void setCultivado_por(String cultivado_por) {
        this.cultivado_por = cultivado_por;
    }

    public void setFabricado_por(String fabricado_por) {
        this.fabricado_por = fabricado_por;
    }

    public void setDistribuido_por(String distribuido_por) {
        this.distribuido_por = distribuido_por;
    }

    public void setAdquirido_en(String adquirido_en) {
        this.adquirido_en = adquirido_en;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setComponentes(ArrayList<MateriaPrima> componentes) {
        this.componentes = componentes;
    }
    
    
    
}
