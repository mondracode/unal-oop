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
public class Empleado {
    private Robot robot;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;
    private int xref;
    private int yref;
    
    public Empleado(City ciudad, int x, int y) {
        this.robot = new Robot(ciudad, x, y, Direction.WEST);
        this.robot.setColor(Color.GREEN);
        this.robot.setLabel("Empleado");
        this.pedidos = new ArrayList<Pedido>();
        this.productos = new ArrayList<Producto>();
        this.xref = this.robot.getAvenue();
        this.yref = this.robot.getStreet();
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Robot getRobot() {
        return robot;
    }
    
    public boolean ordenarBusqueda(ArrayList<RobotAmazon> robots, ArrayList<String> productos_pedidos, ArrayList<Estante> bodega, ArrayList<Empleado> empleados){
        pedidos.add(new Pedido());
        int contador_robot=0;
        int fila = 0;
        int contador_pedidos=0;
            for(int i=0; i<productos_pedidos.size(); i++){
                if(robots.get(contador_robot).is_ocupado()==false){
                    Producto x = robots.get(contador_robot).consultarInventario_nombre(productos_pedidos.get((contador_robot)+(robots.size()*fila)), bodega, empleados);
                    if(x!=null){
                        productos.add(x);
                    }                                   
                }
                contador_robot++;
                if(contador_robot>9){
                    fila++;
                    contador_robot=0;
                }
            }
            
            this.pedidos.get(contador_pedidos).setProductos(productos);
            if(productos.isEmpty()==false){
                this.pedidos.get(contador_pedidos).imprimirFactura(this.productos);
                contador_robot=0;
                contador_pedidos++;
                return true;
            }
            else{
                System.out.println("Pedido vacio. Intente de nuevo.");
                return false;
            }
    }
    public boolean checkProducto(){
        while(this.robot.getDirection()!=Direction.WEST){
            this.robot.turnLeft();
        }
        this.robot.move();
        if(this.robot.canPickThing()==true){
            turnAround();
            this.robot.move();
            llevarAEnvio();
            return true;
        }
        else{
            turnAround();
            this.robot.move();
            turnAround();
        }
        return false;
    }
    
    public boolean llevarAEnvio(){
        while(this.robot.getDirection()!=Direction.EAST){
            this.robot.turnLeft();
        }
        while(this.robot.getAvenue()!=17){
            this.robot.move();
        }
        if(this.robot.getStreet()<11){
            this.robot.turnLeft();
            this.robot.turnLeft();
            this.robot.turnLeft();
            while(this.robot.getStreet()!=11){
                this.robot.move();
            }
            this.robot.turnLeft();
            this.robot.move();
            turnAround();
            while(this.robot.getAvenue()!=xref+1){
                this.robot.move();
            }
            this.robot.turnLeft();
            this.robot.turnLeft();
            this.robot.turnLeft();
            while(this.robot.getStreet()!=yref){
                this.robot.move();
            }
            this.robot.turnLeft();
            this.robot.move();
        }
        else if(this.robot.getStreet()>11){
            this.robot.turnLeft();
            while(this.robot.getStreet()!=11){
                this.robot.move();
            }
            this.robot.turnLeft();
            this.robot.turnLeft();
            this.robot.turnLeft();
            this.robot.move();
            turnAround();
            while(this.robot.getAvenue()!=xref+1){
                this.robot.move();
            }
            this.robot.turnLeft();
            while(this.robot.getStreet()!=yref){
                this.robot.move();
            }
            this.robot.turnLeft();
            this.robot.turnLeft();
            this.robot.turnLeft();
            this.robot.move();
        }
        else{
            this.robot.move();
            turnAround();
            while(this.robot.getAvenue()!=xref){
                this.robot.move();
            }
        }
        return true;
    }
    
    public void turnAround(){
        for(int i=0; i<2; i++){
            this.robot.turnLeft();
        }   
    }


}
