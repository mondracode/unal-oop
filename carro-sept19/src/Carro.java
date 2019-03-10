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

public class Carro {
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private ArrayList<Llanta> llantas;
    private Motor motor;
    private Chasis chasis;

    public Carro(String marca, String modelo, int annio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
        this.chasis = new Chasis(12233);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Llanta> getLlantas() {
        return llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLlantas(ArrayList<Llanta> llantas) {
        this.llantas = llantas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    
}
