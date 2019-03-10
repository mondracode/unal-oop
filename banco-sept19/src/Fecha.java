/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
public class Fecha {
    private int dia;
    private int mes;
    private int annio;

    public Fecha(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnnio() {
        return annio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    
    public void mostrarFecha(){
        System.out.println(this.dia+" / " +this.mes + " / " + this.annio);
    }

}
