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
public class ControladorVista2 {
    private Vista2 vista2;
    private Modelo modelo;
    
    public ControladorVista2(Modelo modelo) {
        this.modelo = modelo;
        this.vista2 = new Vista2();
        this.vista2.getBotonBack()
                .setOnAction(new EventoRegresar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista2.show(singleton.getStage());
    }    
    
    //clases internas
    class EventoRegresar implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            ControladorVista1 b = new ControladorVista1(modelo);
            b.mostrarVista();
        }
    }    
}
