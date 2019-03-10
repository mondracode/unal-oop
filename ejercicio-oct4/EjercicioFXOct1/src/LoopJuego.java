
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

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
    private int frame_gato;
    private int coor_gato;
    private int speed_gato;
    private int frame_fondo;
    private int speed_fondo;
    private int kk;
    private int kk2;
    private int puntaje;
    Image fondo;
    Image gato;
    Image ufo;
    Image man;
    
    public LoopJuego(GraphicsContext lapiz) {
        this.fondo = new Image("imagen/fondo.png");
        this.gato = new Image("imagen/cats.gif");
        this.ufo = new Image("imagen/ufo_1.png");
        this.man = new Image("imagen/down1.png");
        this.lapiz = lapiz;
        this.carro = new Carro(0, 100, 20, 20);
        this.puntaje = 0;
    }
    boolean is_left=false;
    @Override
    public void handle(long now){
        //carro
        lapiz.clearRect(0, 0, 300, 300);
        lapiz.drawImage(fondo, 0, 0,1024, 512);
//        lapiz.drawImage(gato, frame_gato*132, 0, 132, 80, 256, 360, 132, 80);
        //lapiz.drawImage(gato, 264, 0, 132, 80, 170, 170, 132, 80);
        lapiz.setFill(Color.BLUE);
        //lapiz.fillRect(50, 410, 30, 30);
        lapiz.strokeText("Puntaje: "+this.puntaje, 100, 20, 200);
        lapiz.drawImage(ufo, 20+kk2, 400,40, 40);
        lapiz.strokeRect(30+kk2, 100, 50, 50);
        lapiz.fillRect(200, 70, 80, 80);
        lapiz.drawImage(man, 300, 400, 30, 39);
        lapiz.drawImage(man, 500, 400, 30, 39);
        lapiz.drawImage(man, 700, 400, 30, 39);
//       
        Shape rRectangulo1 = new Rectangle(30+kk, 100, 50, 50);
        Shape rRectangulo2 = new Rectangle(200, 70, 80, 80);
        Shape ufo = new Rectangle(20+kk, 400,40, 40);
        Shape man1 = new Rectangle(300, 400, 30, 39);
        Shape man2 = new Rectangle(500, 400, 30, 39);
        Shape man3 = new Rectangle(700, 400, 30, 39);
        
        Shape interseccion = SVGPath.intersect(rRectangulo1, rRectangulo2);
        Shape interseccion_man1 = SVGPath.intersect(ufo, man1);
        Shape interseccion_man2 = SVGPath.intersect(ufo, man2);
        Shape interseccion_man3 = SVGPath.intersect(ufo, man3);


//        if(interseccion.getBoundsInLocal().getWidth()!=-1){
//            stop();
//        }
        if(interseccion_man1.getBoundsInLocal().getWidth()!=-1 || interseccion_man2.getBoundsInLocal().getWidth()!=-1 || interseccion_man3.getBoundsInLocal().getWidth()!=-1){
            puntaje+=10;
        }
        kk++;
        kk2++;
//        if(coor_gato<1024){
//            coor_gato++;
//        }
//        else{
//            coor_gato = 0;
//        }
//        if(speed_gato % 5 ==0){
//            if(frame_gato<5){
//                frame_gato++;
//            } 
//            else{
//                frame_gato = 0;
//            }
//        }
//        speed_gato++;
//        


    }
}
