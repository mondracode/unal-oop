/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
public class Llanta {
    private String marca;
    private int diametro;

    public Llanta(String marca, int diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public int getDiametro() {
        return diametro;
    }
    
}
