/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
public class Movimiento {
    private Fecha fecha;
    private double saldo_anterior;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(Fecha fecha, double saldo_anterior, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.saldo_anterior = saldo_anterior;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
   
    public Fecha getFecha() {
        return fecha;
    }

    public double getSaldo() {
        return saldo_anterior;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setSaldo(double saldo_anterior) {
        this.saldo_anterior = saldo_anterior;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
}
