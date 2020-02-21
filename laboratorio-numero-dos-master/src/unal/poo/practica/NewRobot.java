/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.util.ArrayList;

/**
 *
 * @author Santiago Mondragón G
 */
public class NewRobot extends RobotSE implements Runnable{
    private boolean ocupado;
    private int codigo;
    public NewRobot(City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.ocupado = false;
    }
    
    @Override
    public void run(){
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void irAlPunto(int y, int x, ArrayList<NewRobot> robots){
        Thread hilo = new Thread(){
            public void run(){
                goTo(y, x, robots);
            }
        };
        hilo.start();
    }
    
    public void recogerEstante(int num_estante, ArrayList<NewRobot> robots){
        Thread hilo = new Thread(){
            public void run(){
                getEstante(num_estante, robots);
            }                
        };
        
        hilo.start();
    }
    
    public void goBack(int num_estante, ArrayList<NewRobot> robots){
        this.setOcupado(true);
        goTo(1,num_estante+3, robots);
        this.putThing();
        goTo(2+this.getCodigo(),2, robots);
        goTo(2+this.getCodigo(), 1, robots);
        while(!this.isFacingEast()){
            this.turnLeft();
        }
    }
    
    public void getEstante(int num_estante, ArrayList<NewRobot> robots){
        this.setOcupado(true);
        goTo(1, num_estante+3, robots);
        this.pickThing();
        goTo(11, 24, robots);
        goBack(num_estante, robots);
        this.setOcupado(false);
    }
    public void goTo(int y, int x, ArrayList<NewRobot> robots){
        int i;
        int distancia=0;

        if(x<this.getAvenue()){
            i=0;
            while(!this.isFacingWest()){
                this.turnLeft();
            }
            distancia = this.getAvenue()-x;
            while(i<distancia){
                //verificarColisiones(robots);
                if(this.frontIsClear()){
                    this.move();
                    i++;
                }
            }            
        }
        else if(x>this.getAvenue()){
            i=0;
            while(!this.isFacingEast()){
                this.turnRight();
            }
            distancia = x-this.getAvenue();
            while(i<distancia){
                //verificarColisiones(robots);
                if(this.frontIsClear()){
                    this.move();
                    i++;
                }
            }
        }
        if(y<this.getStreet()){
            i=0;
            while(!this.isFacingNorth()){
                this.turnLeft();
            }
            distancia = this.getStreet()-y;
            while(i<distancia){
                //verificarColisiones(robots);
                if(this.frontIsClear()){
                    this.move();
                    i++;
                }
            }
        }
        else if(y>this.getStreet()){
            i=0;
            while(!this.isFacingSouth()){
                this.turnRight();
            }
            distancia = y-this.getStreet();
            while(i<distancia){
                //verificarColisiones(robots);
                if(this.frontIsClear()){
                    this.move();
                    i++;
                }
            }
        }
    }
    
    public void verificarColisiones(ArrayList<NewRobot> robots){
        for(int i=0; i<robots.size(); i++){
            if(robots.get(i).getCodigo()!=this.getCodigo()){
                if(this.isFacingNorth()){
                    if((robots.get(i).isFacingSouth() && robots.get(i).getStreet()+1==this.getStreet()-1)
                    || (robots.get(i).isFacingEast() && robots.get(i).getAvenue()+1==this.getAvenue() && robots.get(i).getStreet()==this.getStreet()-1)
                    || (robots.get(i).isFacingWest() && robots.get(i).getAvenue()-1==this.getAvenue() && robots.get(i).getStreet() == this.getStreet()-1)    ){
                        try{
                            Thread.sleep(400);
                        }
                        catch(InterruptedException e){
                                System.out.println("F");
                        }
                    }
                }
                else if(this.isFacingEast()){
                    if((robots.get(i).isFacingSouth() && robots.get(i).getStreet()+1==this.getStreet() && this.getAvenue()+1==robots.get(i).getAvenue())
                    || (robots.get(i).isFacingNorth() && robots.get(i).getStreet()-1==this.getStreet() && robots.get(i).getAvenue()-1==this.getAvenue())
                    || (robots.get(i).isFacingWest() && robots.get(i).getAvenue()-1== this.getAvenue()+1)    ){
                        try{
                            Thread.sleep(400);
                        }
                        catch(InterruptedException e){
                                System.out.println("F");
                        }
                    } 
                }
                else if(this.isFacingSouth()){
                    if((robots.get(i).isFacingNorth() && robots.get(i).getStreet()-1==this.getStreet()+1)
                    || (robots.get(i).isFacingEast() && robots.get(i).getAvenue()+1==this.getAvenue() && robots.get(i).getStreet()==this.getStreet()+1)
                    || (robots.get(i).isFacingWest() && robots.get(i).getAvenue()-1==this.getAvenue() && robots.get(i).getStreet()== this.getStreet()+1)    ){
                        try{
                            Thread.sleep(400);
                        }
                        catch(InterruptedException e){
                                System.out.println("F");
                        }
                    }
                }
                else if(this.isFacingWest()){
                    if((robots.get(i).isFacingSouth() && robots.get(i).getAvenue()==this.getAvenue()-1 && this.getStreet() == robots.get(i).getStreet()-1)
                    || (robots.get(i).isFacingEast() && robots.get(i).getAvenue()+1==this.getAvenue()-1)
                    || (robots.get(i).isFacingNorth() && robots.get(i).getAvenue()==this.getAvenue()-1 && robots.get(i).getStreet()+1 == this.getStreet())    ){
                        try{
                            Thread.sleep(400);
                        }
                        catch(InterruptedException e){
                                System.out.println("F");
                        }
                    }
                }
            }
        }
    }
}
