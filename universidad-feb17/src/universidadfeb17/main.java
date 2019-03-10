/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadfeb17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Santiago Mondragón G
 */
public class main {
    
    static Universidad universidad = new Universidad("Universidad Genérica de Colombia", 5550155);
    
    public static void main(String[] args){
        //cargar sedes y programas
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Bienvenido al software de la Universidad Genérica de Colombia.");
            System.out.println("Para agregar una sede, presione 1.");
            System.out.println("Para ver la información de las sedes, presione 2.");
            System.out.println("Para salir presione 0.");
            System.out.print("Digite su opción: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    agregarSede();
                }
                case 2:{
                    darInformacion();
                }
                case 0:{
                    System.exit(0);
                }
            }
        }

    }
    
    public static boolean darInformacion(){
        ArrayList<Sede> sedes = universidad.cargarSedes();
        for(int i=0; i<sedes.size(); i++){
            System.out.println("_________________");
            System.out.println("Sede # "+ (i+1)); 
            System.out.println("Nombre: "+ sedes.get(i).getNombre());
            System.out.println("Direccion: " + sedes.get(i).getDireccion());
            System.out.println("Telefono: " +sedes.get(i).getTelefono());
            System.out.println("Area construida: "+sedes.get(i).getArea_construida());
            System.out.println("____");
            System.out.println("Programas que ofrece:");
            for(int j=0;j<sedes.get(i).getProgramas().size();j++){
                if(sedes.get(i).getProgramas().get(j).getTipo().equals("\n"+"p")){
                    System.out.println("Profesional");
                }
                if(sedes.get(i).getProgramas().get(j).getTipo().equals("\n"+"t")){
                    System.out.println("Tecnologico");
                }
                if(sedes.get(i).getProgramas().get(j).getTipo().equals("\n"+"e")){
                    System.out.println("Educacion Continuada");
                }                
                System.out.println(sedes.get(i).getProgramas().get(j).getNombre());
                System.out.println(sedes.get(i).getProgramas().get(j).getDescripcion());
                System.out.println("Telefono: "+sedes.get(i).getProgramas().get(j).getTelefono());
                System.out.println("___");
            }
        }
        return true;
    }
    
    public static boolean agregarSede(){
        PrintStream salida;
        try{
        salida = new PrintStream(new FileOutputStream("sedes.dat", true));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Ingrese el tipo (1. tecnológica, 2. profesional o  3. educacion_continuada). Para salir digite 0: ");
            int opcion = sc.nextInt();
            if(opcion==0){
                return true;
            }
            if(opcion==1){
                agregarSedeTecnologica(sc,salida);
            }
            if(opcion==2){
                agregarSedeProfesional(sc, salida);
            }
            if(opcion==3){
                agregarSedeEducacionContinuada(sc, salida);
            }
        }

        }
        catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
            return false;
        }
    }
    
    public static boolean agregarSedeProfesional(Scanner sc, PrintStream salida){
            salida.append("\n");
            salida.append("profesional"+",");
            sc.nextLine();
            System.out.print("Ingrese el nombre: ");
            salida.append(sc.nextLine() + ",");
            System.out.println("");
            System.out.print("Ingrese la direccion: ");
            salida.append(sc.nextLine().toString()+",");
            System.out.println("");
            System.out.print("Ingrese el telefono: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el area construida: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el numero de programas de alta calidad: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el número de estudiantes de tecnologías. Si la sede no ofrece educación tecnológica, digite 0: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el curso de educación continuada más popular. Si la sede no ofrece educación continuada, digite \"N/A\": ");
            salida.append(sc.nextLine()+",");
            return true;   
    }
    
    public static boolean agregarSedeTecnologica(Scanner sc, PrintStream salida){
            salida.append("\n");
            salida.append("tecnologica"+",");
            sc.nextLine();
            System.out.print("Ingrese el nombre: ");
            salida.append(sc.nextLine() + ",");
            System.out.println("");
            System.out.print("Ingrese la direccion: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el telefono: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el area construida: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el número de estudiantes: ");
            salida.append(sc.nextLine()+",");
            return true;   
    }
    public static boolean agregarSedeEducacionContinuada(Scanner sc, PrintStream salida){
            salida.append("\n");
            salida.append("educacion_continuada"+",");
            sc.nextLine();
            System.out.print("Ingrese el nombre: ");
            salida.append(sc.nextLine() + ",");
            System.out.println("");
            System.out.print("Ingrese la direccion: ");
            salida.append(sc.nextLine().toString()+",");
            System.out.println("");
            System.out.print("Ingrese el telefono: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el area construida: ");
            salida.append(sc.nextLine()+",");
            System.out.println("");
            System.out.print("Ingrese el nombre del curso más popular: ");
            salida.append(sc.nextLine()+",");
            return true;   
    }    
}
