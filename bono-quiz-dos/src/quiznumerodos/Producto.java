/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author smondragon
 */
public class Producto extends Information{
    private double numero_de_lote;
    private String fabricado_por;
    private String distribuido_por;
    private String adquirido_en;
    private String codigo;
    private double precio;
    private ArrayList<MateriaPrima> componentes;
    private LocalDateTime fecha_entrada_fabrica;
    private LocalDateTime fecha_salida_fabrica;
    private LocalDateTime fecha_entrada_distribuidor;
    private LocalDateTime fecha_salida_distribuidor;
    private LocalDateTime fecha_entrada_tienda;
    private LocalDateTime fecha_salida_tienda;

    public Producto(ArrayList<MateriaPrima> componentes, String nombre, String descripcion) {
        super(nombre, descripcion, 0, 0);
        this.componentes = componentes;
    }

    public double getNumero_de_lote() {
        return numero_de_lote;
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

    public void setFecha_entrada_fabrica(LocalDateTime fecha_entrada_fabrica) {
        this.fecha_entrada_fabrica = fecha_entrada_fabrica;
    }

    public void setFecha_salida_fabrica(LocalDateTime fecha_salida_fabrica) {
        this.fecha_salida_fabrica = fecha_salida_fabrica;
    }

    public void setFecha_entrada_distribuidor(LocalDateTime fecha_entrada_distribuidor) {
        this.fecha_entrada_distribuidor = fecha_entrada_distribuidor;
    }

    public void setFecha_salida_distribuidor(LocalDateTime fecha_salida_distribuidor) {
        this.fecha_salida_distribuidor = fecha_salida_distribuidor;
    }

    public void setFecha_entrada_tienda(LocalDateTime fecha_entrada_tienda) {
        this.fecha_entrada_tienda = fecha_entrada_tienda;
    }

    public void setFecha_salida_tienda(LocalDateTime fecha_salida_tienda) {
        this.fecha_salida_tienda = fecha_salida_tienda;
    }
    
}
