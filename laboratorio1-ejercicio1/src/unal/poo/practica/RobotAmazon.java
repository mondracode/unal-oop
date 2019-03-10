
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Santiago Mondragón G
 */
public class RobotAmazon {
    private Robot robot;
    private boolean ocupado;
    private int xref;
    private int yref;
    public RobotAmazon(City ciudad, int x, int y) {
        this.robot = new Robot(ciudad, x, y, Direction.EAST);
        this.robot.setColor(Color.ORANGE);
        this.robot.setLabel("Amazon");
        this.ocupado = false;
        this.xref = this.robot.getAvenue();
        this.yref = this.robot.getStreet();
    }

    public boolean is_ocupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean devolverEstante(){
        int kkk=1;
        for(int i=0; i<19; i++){
            if(this.robot.canPickThing()==true && kkk!=5){
                this.robot.move();
            }
            else if(kkk==5 && this.robot.canPickThing()==true){
                this.robot.turnLeft();
                this.robot.move();
                this.robot.turnLeft();
                while(this.robot.getAvenue()!=5){
                    this.robot.move();
                }
                this.robot.turnLeft();
                this.robot.turnLeft();
                kkk=1;
            }
            else{
                this.robot.putThing();
                salirDeBodega();
                return true;
            }
            kkk++;            
        }
        return false;
    }
    
    public void irAEmpleado(){
        
        while(this.robot.getAvenue()!=11){
            this.robot.move();
        }
        this.robot.turnLeft();
        while(this.robot.getStreet()!=5){
            this.robot.move();
        }
    }
    
    public void volverAEmpleado(){
        while(this.robot.getAvenue()!=11){
            this.robot.move();
        }
        while(this.robot.getDirection()!=Direction.SOUTH){
            this.robot.turnLeft();
        }
        while(this.robot.getStreet()!=this.yref){
            this.robot.move();
        }
        
    }
    
    public void irABodega(){
        while(this.robot.getDirection()!=Direction.NORTH){
            this.robot.turnLeft();
        } 
        while(this.robot.getStreet()!=2){
            this.robot.move();
        }
        this.robot.turnLeft();
        while(this.robot.getAvenue()!=5){
            this.robot.move();
        }
    }
    public void salirDeBodega(){
        while(this.robot.getDirection()!=Direction.EAST){
            this.robot.turnLeft();
        }
        while(this.robot.getAvenue()!=5){
            this.robot.move();
        }
        while(this.robot.getDirection()!=Direction.NORTH){
            this.robot.turnLeft();
        } 
        while(this.robot.getStreet()!=2){
            this.robot.move();
        }
        while(this.robot.getDirection()!=Direction.EAST){
            this.robot.turnLeft();
        }
        this.robot.move();
    }
    public void volverAParqueadero() {
        while(this.robot.getDirection()!=Direction.WEST){
            this.robot.turnLeft();
        }

        while(this.robot.getAvenue() != 1){
            this.robot.move();
        }
        this.robot.turnLeft();
        this.robot.turnLeft();
    }
    
    public Producto consultarInventario_nombre(String name, ArrayList<Estante> bodega, ArrayList<Empleado> empleados){
        this.ocupado = true;
        String nombre = name.replaceAll("\\s+", "");
        if(!nombre.equals(" ") && !nombre.equals("") && !nombre.equals(null)){
            while(true){
                irAEmpleado();
                irABodega();
                int kk=1;
                for(int k=0; k<19; k++){
                    for(int j=0; j<bodega.get(k).getCajas().size(); j++){
                        for(int i=0; i<bodega.get(k).getCajas().get(j).getProductos().size(); i++){
                            if(bodega.get(k).getCajas().get(j).getProductos().get(i).getNombre().replaceAll("\\s+","").toLowerCase().contains(nombre.toLowerCase())){
                                if(bodega.get(k).getCajas().get(j).getProductos().get(i).getNombre()!="^@^" && this.robot.canPickThing()==true){
                                    Producto resultado = bodega.get(k).getCajas().get(j).getProductos().get(i);
                                    this.robot.pickThing();
                                    salirDeBodega();
                                    volverAEmpleado();
                                    if(this.robot.canPickThing()==false){
                                        this.robot.putThing();  
                                    }
                                    else{
                                        this.robot.move();
                                        this.robot.putThing();
                                    }
                                    this.robot.turnLeft();
                                    this.robot.turnLeft();
                                    this.robot.turnLeft();
                                    this.robot.move();
                                    empleados.get(yref-7).checkProducto();
                                    this.robot.turnLeft();
                                    this.robot.turnLeft();
                                    this.robot.move();
                                    this.robot.turnLeft();
                                    this.robot.turnLeft();
                                    this.robot.turnLeft();
                                    //this.robot.move();
                                    bodega.get(k).getCajas().get(j).getProductos().remove(i);
                                    System.out.println("Anadido "+resultado.getNombre()+" satisfactoriamente.");
                                    this.robot.pickThing();
                                    irABodega();
                                    devolverEstante();
                                    volverAEmpleado();
                                    volverAParqueadero();
                                    return resultado;                                
                                }
                            }
                        }
                    }
                    if(kk==5){
                        this.robot.turnLeft();
                        this.robot.move();
                        this.robot.turnLeft();
                        while(this.robot.getAvenue()!=5){
                            this.robot.move();
                        }
                        this.robot.turnLeft();
                        this.robot.turnLeft();
                        kk=0;
                    }
                    else{
                        this.robot.move();
                    }
                    kk++;
                }
                System.out.println("Producto "+nombre+" no encontrado.");
                if(this.robot.getAvenue()==1 && this.robot.getStreet()==5){
                    salirDeBodega();
                    volverAEmpleado();
                    if(this.robot.canPickThing()==true){
                        this.robot.move();                  
                    }
                    volverAParqueadero();
                }
                this.ocupado = false;
                
            }
        }
        return null;
    }
    
    public boolean registrarProducto(ArrayList<Estante> bodega, Producto producto){
        this.ocupado = true;
        irAEmpleado();
        irABodega();
        while(true){
            int kk=1;
            for(int k=0; k<19; k++){
                for(int j=0; j<bodega.get(k).getCajas().size(); j++){
                    for(int i=0; i<bodega.get(k).getCajas().get(j).getProductos().size(); i++){
                        if(bodega.get(k).getCajas().get(j).getProductos().size()<7){
                            if(this.robot.canPickThing()){
                                this.robot.pickThing();
                                salirDeBodega();
                                volverAEmpleado();
                                this.robot.putThing();
                                if(bodega.get(k).getCajas().get(j).getProductos().get(i).getNombre()=="^@^"){
                                    bodega.get(k).getCajas().get(j).getProductos().add(producto);
                                    bodega.get(k).getCajas().get(j).getProductos().remove(i);
                                }
                                else{
                                    bodega.get(k).getCajas().get(j).getProductos().add(producto);
                                }
                                if(bodega.get(k).getCajas().get(j).getProductos().size()<7){
                                    volverAParqueadero();
                                }
                                else{
                                    this.robot.pickThing();
                                    irABodega();
                                        for(int y=0; y<19; y++){
                                            if(this.robot.canPickThing()==false){
                                                this.robot.putThing();
                                            }
                                            if(y%5==0){
                                                this.robot.turnLeft();
                                                this.robot.move();
                                                this.robot.turnLeft();
                                                while(this.robot.getAvenue()!=5){
                                                    this.robot.move();
                                                }
                                                this.robot.turnLeft();
                                                this.robot.turnLeft();
                                                kk=0;
                                            }
                                            else{
                                                this.robot.move();
                                            }
                                        }
                                }
                                return true;
                            }
                        }                  
                    }
                }
                if(kk==5){
                    this.robot.turnLeft();
                    this.robot.move();
                    this.robot.turnLeft();
                    while(this.robot.getAvenue()!=5){
                        this.robot.move();
                    }
                    this.robot.turnLeft();
                    this.robot.turnLeft();
                    kk=0;
                }
                else{
                    this.robot.move();
                }
                kk++;
            }
            System.out.println("Bodega llena. El producto no puede registrarse.");
            return false;
        }
    }   
}
