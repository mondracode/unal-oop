/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;

/**
 *
 * @author LENOVO
 */
public class Jugador {
    
     private int ancho;
    private int alto;
    private Image prota;
   

    public Jugador(int ancho, int alto, String prota)throws FileNotFoundException {
        this.ancho=ancho;
        this.alto= alto;
        FileInputStream archivo = new FileInputStream(prota);
        this.prota = new Image(archivo);
    }


    public Image getProta() {
        return prota;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
    
}
