/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import java.util.ArrayList;

/**
 *
 * @author Santiago Mondragón G
 */
public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<Pedido>();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
