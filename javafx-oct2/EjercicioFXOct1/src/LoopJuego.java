
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private GraphicsContext lapiz;
    private Carro carro;
    
    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro(0, 100, 20, 20);
    }
    boolean is_left=false;
    @Override
    public void handle(long now){
        //carro
        lapiz.clearRect(0, 0, 300, 300);
        lapiz.setFill(Color.BLUE);
        lapiz.fillRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.strokeText("Puntaje: 100", 100, 20, 200);
        
        if(this.carro.getXref()<300 && is_left==false){
            this.carro.mover();
        }
        if(this.carro.getXref()==300-this.carro.getAncho() && is_left==false){
            is_left=true;
        }
        if(this.carro.getXref()>0 && is_left==true){
            this.carro.moverIzq();
        }
        if(this.carro.getXref()==0 && is_left==true){
            is_left=false;
        }
        
        
//        lapiz.setFill(Color.GREY);
//        lapiz.fillOval(15, 270, 30, 30);
//        lapiz.fillOval(55, 270, 30, 30);
        //semaforo
//        lapiz.setFill(Color.YELLOW);
//        lapiz.fillRect(250, 250, 10, 50);
//        lapiz.setFill(Color.BLACK);
//        lapiz.fillRect(235, 170, 40, 80);
//        lapiz.setFill(Color.RED);
//        lapiz.fillOval(248, 185, 15, 15);
//        lapiz.setFill(Color.YELLOW);
//        lapiz.fillOval(248, 205, 15, 15);
//        lapiz.setFill(Color.GREEN);
//        lapiz.fillOval(248, 225, 15, 15);
    }
}
