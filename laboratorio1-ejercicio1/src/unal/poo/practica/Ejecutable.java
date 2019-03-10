package unal.poo.practica;

import becker.robots.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {    
        public static void main (String[] args){
            Scanner lectura = new Scanner(System.in);
            Cliente cliente = new Cliente("Fabian");
            ArrayList<RobotAmazon> robots = new ArrayList<RobotAmazon>();
            ArrayList<Empleado> empleados = new ArrayList<Empleado>();
            ArrayList<Estante> bodega = new ArrayList<Estante>();
            ArrayList<Producto> productos = new ArrayList<Producto>();
            ArrayList<String> productos_pedidos = new ArrayList<String>();
            //creacion de la ciudad
            City ciudad = new City(18, 25);
            ciudad.setFrameTitle("Amazon");
	    ciudad.showThingCounts(true);
            //creacion de las paredes            
            for (int i = 3; i < 6; i++) {
                new Wall(ciudad, i, 5, Direction.EAST);
            }
            for (int i = 1; i < 6; i++) {
                new Wall(ciudad, 2, i, Direction.NORTH);
            }
            for (int i = 1; i < 6; i++) {
                new Wall(ciudad, 5, i, Direction.SOUTH);
            }
            for (int i = 2; i < 6; i++) {
                new Wall(ciudad, i, 1, Direction.WEST);
            }
            for(int i=7; i<17; i++){
                new Wall(ciudad, i, 1, Direction.WEST);
            }
            for(int i=7; i<11; i++){
                new Wall(ciudad, i, 17, Direction.EAST);
            }
            for(int i=12; i<17; i++){
                new Wall(ciudad, i, 17, Direction.EAST);
            }
            for(int i=12; i<18; i++){
                new Wall(ciudad, 7, i, Direction.NORTH);
            }
            for(int i=12; i<18; i++){
                new Wall(ciudad, 16, i, Direction.SOUTH);
            }            
            new Wall(ciudad, 7, 1, Direction.NORTH);
            new Wall(ciudad, 16, 1, Direction.SOUTH);
            new Wall(ciudad, 10, 18, Direction.SOUTH);
            new Wall(ciudad, 12, 18, Direction.NORTH);
            new Estante(ciudad, 11, 18, Direction.NORTH);
            //creacion de los estantes
            for(int j=2; j<6; j++){
                for(int i=5; i>0; i--){
                    bodega.add(new Estante(ciudad, j, i, Direction.EAST));
                }
            }
            //esto crea unos productos "falsos" para inicializar estantes vacios, que me dieron problemas
            //estos productos se eliminan automaticamente al agregar un producto
            for(int h=0; h<bodega.size(); h++){
                bodega.get(h).getCajas().get(0).getProductos().add(new Producto("^@^", "^@^", 0));
                bodega.get(h).getCajas().get(1).getProductos().add(new Producto("^@^", "^@^", 0));
                bodega.get(h).getCajas().get(2).getProductos().add(new Producto("^@^", "^@^", 0));
            }
            //
            //esto es el inventario inicial
            bodega.get(6).getCajas().get(1).getProductos().add(new Producto("Jabon REY", "aseo", 1400));
            bodega.get(4).getCajas().get(2).getProductos().add(new Producto("Papas Fritas Margarita", "comida", 1200));
            bodega.get(3).getCajas().get(0).getProductos().add(new Producto("Leche Alpina", "comida", 2800));
            bodega.get(8).getCajas().get(1).getProductos().add(new Producto("Salsa de Tomate Fruco", "comida", 1900));
            bodega.get(13).getCajas().get(0).getProductos().add(new Producto("Camiseta Polo Talla S", "ropa", 19900));
            bodega.get(9).getCajas().get(2).getProductos().add(new Producto("Jean Azul Talla 28", "ropa", 25900));
            bodega.get(5).getCajas().get(0).getProductos().add(new Producto("Cuaderno 100 hojas Norma", "oficina", 9900));
            bodega.get(19).getCajas().get(1).getProductos().add(new Producto("Zapatillas Deportivas Adidas", "ropa", 149900));
            bodega.get(0).getCajas().get(1).getProductos().add(new Producto("Cinturon de Cuero Velez", "ropa", 39900));
            bodega.get(7).getCajas().get(0).getProductos().add(new Producto("Reloj Digital Casio", "hogar", 89900));
            bodega.get(4).getCajas().get(2).getProductos().add(new Producto("Balon de Futbol Golty", "deportes", 29900));
            bodega.get(5).getCajas().get(0).getProductos().add(new Producto("Lavaloza Axion", "aseo", 2990));
            bodega.get(3).getCajas().get(2).getProductos().add(new Producto("Microfono Blue Snowball", "tecnologia", 149900));
            //
            //creacion de los robots
            for(int j=7; j<17; j++){
                robots.add(new RobotAmazon(ciudad, j, 1));
            }
            //creacion de empleados
            for(int i=0; i<10; i++){
                empleados.add(new Empleado(ciudad, 7+i, 12));
            }
            inicio:
            while(true){
                System.out.print("Bienvenido a Amazon, "+cliente.getNombre()+". Para realizar un pedido presione 1. Para registrar productos presione 2: ");
                int opcion = lectura.nextInt();
                //Busqueda de productos
                if(opcion==1){
                    cliente.getPedidos().add(new Pedido());
                    boolean quit = false;
                    while(!quit){
                        System.out.println("Para concluir su pedido, escriba 'salir'.");
                        System.out.print("Ingrese el nombre del producto a buscar: ");
                        String opcion3 = lectura.nextLine();
                        if(opcion3.equals("salir")){
                            quit = true;
                        }
                        else if(opcion3!=null){
                            productos_pedidos.add(opcion3);
                        }
                    }
                    System.out.println("Por favor presione Start.");   
                    for(int i=0; i<empleados.size(); i++){
                        boolean exito = empleados.get(i).ordenarBusqueda(robots, productos_pedidos, bodega, empleados);
                        if(exito==true){
                            System.out.println("Pedido completado.");
                        }
                        else{
                            continue inicio;
                        }
                        System.out.print("Para realizar otro pedido presione 1. Para salir presione 2: ");
                        int opcion2 = lectura.nextInt();
                        if(opcion2==1){
                            cliente.getPedidos().add(new Pedido());
                            productos_pedidos.clear();
                            continue inicio;
                        }
                        if(opcion2==2){
                            continue inicio;
                        }
                        else{
                            System.out.println("Producto no encontrado.");   
                        }
                    }
                }
                //registro de productos
                else if(opcion==2){
                    while(true){
                        System.out.println("Cuando haya terminado con el grupo de productos, escriba 'salir' en el nombre del producto siguiente.");
                        System.out.print("Ingrese el nombre: ");
                        String nombre = lectura.nextLine();
                        if(nombre.equals("salir")){
                            continue inicio;
                        }
                        System.out.print("Ingrese el tipo: ");
                        String tipo = lectura.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precio = lectura.nextDouble();
                        productos.add(new Producto(nombre, tipo, precio));
                    }
                }
            }
        }
}