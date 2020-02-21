package unal.poo.practica;

import becker.robots.*;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutable {    
        public static void main (String[] args){
            Scanner lectura = new Scanner(System.in);
            ArrayList<NewRobot> robots= new ArrayList<>();
            String opcion;
            
            //creacion de la ciudad
            City ciudad = new City("Field.txt");
            ciudad.setFrameTitle("Laboratorio dos");
	    ciudad.showThingCounts(true);
            

            //carga en memoria de los archivos
            ArrayList<Estante> inventario = leerProductos();
            ArrayList<Empleado> empleados = leerEmpleados();
            
            //creacion del empleado
            NewRobot empleado = new NewRobot(ciudad, 11, 25, Direction.WEST);
            empleado.setLabel("empleado");
            empleado.setColor(Color.BLUE);
            
            //creacion del personal de envios
            NewRobot envios = new NewRobot(ciudad, 21, 25, Direction.WEST);
            envios.setColor(Color.green);
            envios.setLabel("Envíos");
            
            
            //creacion de robots
            for(int i=0; i<20; i++){
                robots.add(new NewRobot(ciudad, 2+i, 1, Direction.EAST));
                robots.get(i).setSpeed(3);
                robots.get(i).setCodigo(i);
                robots.get(i).setColor(Color.orange);
                robots.get(i).setLabel("Bot");
            }
            
            //inicio de la vista
            System.out.println("Bienvenido a La Tienda Generica");
            System.out.println("_______________________");
            while(true){
                System.out.println("Para hacer un pedido, presione 1.");
                System.out.println("Para acceder al sistema de empleados, presione 2.");
                System.out.println("Para salir, presione 0.");
                System.out.print("Digite su opción: ");
                try{
                    opcion = lectura.nextLine();
                    if(opcion.equals("1")){
                        System.out.println("_______________________");
                        hacerPedido(inventario, robots);
                    }
                    else if(opcion.equals("2")){
                        System.out.println("_______________________");
                        anadirProducto(inventario, robots);
                    }
                    else if(opcion.equals("0")){
                        System.out.println("_______________________");
                        System.out.println("Por favor cierre la interfaz gráfica.");
                        System.out.println("Gracias por preferirnos.");
                        break;
                    }
                    else{
                        throw new InputMismatchException();
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Entrada no valida.");
                    continue;
                }
            }
            robots.get(5).recogerEstante(7, robots);
        }
        
        public static boolean anadirProducto(ArrayList<Estante> inventario, ArrayList<NewRobot> robots){
            Scanner lectura = new Scanner(System.in);
            PrintStream escritura;
            bucle:
            while(true){
                l_bucle:
                try{
                escritura = new PrintStream(new FileOutputStream("inventario.dat", true));    
                System.out.println("Digite el nombre del producto.");
                System.out.print("Digite 'salir' para terminar la operacion: ");
                String nombre_prod = lectura.nextLine();
                if(nombre_prod.trim().equals("salir")){
                    break bucle;
                }
                System.out.print("Digite la categoria del producto: ");
                String categ_prod = lectura.nextLine();
                System.out.print("Digite el precio del producto: ");
                double precio_prod = lectura.nextDouble();
                for(int i=0; i<20; i++){
                    for(int j=0; j<3; j++){
                        for(int k=0; k<7; k++){
                            if("*p*".equals(inventario.get(i).getCajas().get(j).getProductos().get(k).getNombre())&& inventario.get(i).getCajas().get(j).getProductos().get(k)!=null){
                                Producto newProd = new Producto(nombre_prod, categ_prod, precio_prod);
                                newProd.setEstante_almacenamiento(i);
                                newProd.setCaja_almacenamiento(j);
                                newProd.setCasilla_almacenamiento(k);
                                inventario.get(i).getCajas().get(j).getProductos().set(k, newProd);
                                escritura.append("\n"+nombre_prod+","+categ_prod+","+(int)precio_prod+","+i+","+j+","+k+",");
                                robots.get(i).recogerEstante(i, robots);
                                System.out.println("_______________________");
                                break bucle;
                            }
                        }
                    }
                }  
                
                }
                catch(InputMismatchException e){
                    System.out.println("entrada no valida.");
                    break l_bucle;
                }
                catch(FileNotFoundException ex){
                    System.out.println("F");
                }
  
            }
            
            return false;
        }
        
        public static ArrayList<Estante> leerProductos(){
            //creacion de estantes
            ArrayList<Estante> estantes = new ArrayList<>();
            Producto placeholder = new Producto("*p*", "placeholder", 0);
            for(int i=0; i<20; i++){
                estantes.add(new Estante());
                for(int j=0; j<3; j++){
                    estantes.get(i).getCajas().add(new Caja());
                    for(int k=0; k<7; k++){
                        estantes.get(i).getCajas().get(j).getProductos().add(placeholder);
                    }    
                }
            }            
            Scanner sc;
            try{
                sc = new Scanner(new File("inventario.dat"));
                sc.useDelimiter(",");
                while(sc.hasNext()){
                    String nombre_producto = sc.next();
                    String tipo_producto = sc.next();
                    double precio = Double.parseDouble(sc.next());
                    int num_estante = Integer.parseInt(sc.next());
                    int num_caja = Integer.parseInt(sc.next());
                    int num_casilla = Integer.parseInt(sc.next());
                    estantes.get(num_estante).getCajas().get(num_caja).getProductos().set(num_casilla,new Producto(nombre_producto, tipo_producto, precio));
                }    
            }
            catch(FileNotFoundException e){
                System.out.println("Inventario no encontrado.");
            }
            return estantes;
        }
        
        public static ArrayList<Empleado> leerEmpleados(){
            Scanner sc;
            ArrayList<Empleado> empleados = new ArrayList<>();
            try{
                sc = new Scanner(new File("empleados.dat"));
                sc.useDelimiter(",");
                while(sc.hasNext()){
                    String nombre_empleado = sc.next();
                    String apellido_empleado = sc.next();
                    empleados.add(new Empleado(nombre_empleado, apellido_empleado));
                }    
            }
            catch(FileNotFoundException e){
                System.out.println("Archivo de empleados no encontrado.");
            }
            return empleados;            
        }
        public static boolean hacerPedido(ArrayList<Estante> estantes, ArrayList<NewRobot> robots){
            Scanner sc = new Scanner(System.in);
            Pedido pedido = new Pedido();
            ArrayList<Producto> inventario_unificado = new ArrayList<>();
            boolean h = false;
            inicio_ped:
            while(true){
                System.out.println("Presione 1 para ver todos los productos disponibles.");
                System.out.println("Presione 0 para salir.");
                System.out.print("Digite su opcion: ");
                try{
                    String opcion = sc.nextLine();
                    System.out.println("___");
                        if(opcion.equals("1")){
                            //esto lee el inventario estante por estante y lo unifica para facilidad de uso en el pedido
                            for(int i=0; i<estantes.size(); i++){
                                for(int j=0; j<estantes.get(i).getCajas().size(); j++){
                                    for(int k=0; k<estantes.get(i).getCajas().get(j).getProductos().size(); k++){
                                        if(!"*p*".equals(estantes.get(i).getCajas().get(j).getProductos().get(k).getNombre())){
                                            estantes.get(i).getCajas().get(j).getProductos().get(k).setEstante_almacenamiento(i);
                                            estantes.get(i).getCajas().get(j).getProductos().get(k).setCaja_almacenamiento(j);
                                            estantes.get(i).getCajas().get(j).getProductos().get(k).setCasilla_almacenamiento(k);
                                            inventario_unificado.add(estantes.get(i).getCajas().get(j).getProductos().get(k));
                                        }
                                    }
                                }
                            }
                            //
                            for(int i=0; i<inventario_unificado.size(); i++){
                                inventario_unificado.get(i).setCodigo(i+1);
                                System.out.println((i+1)+". "+inventario_unificado.get(i).getNombre());
                                System.out.println("Categoria: "+inventario_unificado.get(i).getTipo());
                                System.out.println("Precio: $"+inventario_unificado.get(i).getPrecio());
                                System.out.println("___");
                            }
                            fin_ped:
                            while(true){
                                System.out.println("Digite 0 para salir o despachar su pedido.");
                                System.out.print("Seleccione un producto para anadirlo al pedido: ");
                                try{
                                    String op = sc.nextLine();
                                    for(int i=0; i<inventario_unificado.size(); i++){
                                        if(Integer.toString(inventario_unificado.get(i).getCodigo()).trim().equals(op)){
                                            pedido.getProductos().add(inventario_unificado.get(i));
                                            System.out.print("Anadido "+inventario_unificado.get(i).getNombre()+" correctamente.");
                                            System.out.println("");
                                            System.out.println("_______________________");
                                        }
                                        else if(op.equals("0")){
                                            if(pedido.getProductos().isEmpty()){
                                                return true;
                                            }
                                            else{
                                                //generar factura y retornar
                                                double total =0;
                                                System.out.println("_______________________");
                                                System.out.println("--------FACTURA--------");
                                                System.out.println("--La tienda generica--");
                                                System.out.println("Fecha: "+pedido.getTexto_fecha());
                                                System.out.println("Productos adquiridos: ");                                                
                                                for(int m=0; m<pedido.getProductos().size(); m++){
                                                    System.out.println(pedido.getProductos().get(m).getNombre()+".....$"+pedido.getProductos().get(m).getPrecio());
                                                    total+=pedido.getProductos().get(m).getPrecio();
                                                }
                                                System.out.println("------------------------");
                                                System.out.println("TOTAL: "+total);
                                                System.out.println("------------------------");
                                                System.out.println("Gracias por preferirnos");
                                                System.out.println("_______________________");
                                                break fin_ped;
                                            }
                                        }
                                    }                                     
                                }
                                catch(InputMismatchException e){
                                    System.out.println("Entrada no valida");
                                    continue;
                                }
                            }
                            for(int i=0; i<pedido.getProductos().size(); i++){
                                if(robots.get(pedido.getProductos().get(i).getEstante_almacenamiento()).isOcupado()==false){
                                    robots.get(pedido.getProductos().get(i).getEstante_almacenamiento()).recogerEstante(pedido.getProductos().get(i).getEstante_almacenamiento(), robots);
                                }                                
                            }
                            return true;
                        }
                        else if(opcion.equals("0")){
                            break;
                        }
                        else{
                            throw new InputMismatchException();
                        }
                    }
                    catch(InputMismatchException e){
                        System.out.println("Entrada no valida.");
                        continue;
                    }                
                }
            return true;
        }
}