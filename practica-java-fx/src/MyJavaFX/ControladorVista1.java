/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author smondragon
 */
public class ControladorVista1 {
    private Vista1 vista1;
    private Modelo modelo;

    public ControladorVista1(Modelo modelo) {
        this.modelo = modelo;
        this.vista1 = new Vista1();
        this.vista1.getBoton_sig()
                .setOnAction(new EventoSiguiente());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista1.show(singleton.getStage());
    }
    //clases internas
    class EventoSiguiente implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            ControladorVista2  a = new ControladorVista2(modelo);
            a.mostrarVista();
        }
    }
}
