/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
import java.util.ArrayList;

public class Cuenta {
    private int numero;
    private double saldo;
    private Fecha creacion;
    private String nombre_cliente;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numero, double saldo, Fecha creacion, String nombre_cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.creacion = creacion;
        this.nombre_cliente = nombre_cliente;
        this.movimientos = new ArrayList<Movimiento>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Fecha getCreacion() {
        return creacion;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCreacion(Fecha creacion) {
        this.creacion = creacion;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    public void crearConsignacion(double saldo, double cantidad){
        this.saldo= saldo+cantidad;
    }
    
    public void crearRetiro(double saldo, double cantidad){
        this.saldo= saldo-cantidad;
    }
}
