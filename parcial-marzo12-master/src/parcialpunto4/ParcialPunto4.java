/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpunto4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author smondragon
 */
public class ParcialPunto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Galeria galeria = new Galeria();

        //System.out.println(galeria.getArtistas().get(0).getNombre());
        while(true){
            bucle:
            try{
                Scanner lectura = new Scanner(System.in);

                System.out.println("Bienvenido a La Galeria Generica");
                System.out.println("Para registrarse, presione 1.");
                System.out.println("Para mostrar la informacion de los usuarios, presione 2.");
                System.out.println("Para conocer la suma de los valores de todas las obras, presione 3.");
                System.out.print("Para salir, presione 0: ");
                int opcion = lectura.nextInt();
                System.out.println("________________________");
                switch(opcion){
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println("Presione 1 para inscribirse como artista.");
                        System.out.println("Presione 2 para inscribirse como comprador: ");
                        int opcionn = lectura.nextInt();
                        if(opcionn==1){
                            System.out.print("Ingrese su nombre: ");
                            String nombre_art = lectura.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellido_art = lectura.next();
                            System.out.print("Digite su curriculum: ");
                            String curr_art = lectura.next();
                            System.out.print("Digite sus distinciones: ");
                            String dist_art = lectura.next();
                            galeria.getArtistas().add(new Artista(nombre_art, apellido_art, curr_art, dist_art));
                        }
                        else if(opcionn==2){
                            System.out.print("Ingrese su nombre: ");
                            String nombre_com = lectura.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellido_com = lectura.next();
                            galeria.getCompradores().add(new Comprador(nombre_com, apellido_com));
                        }
                    case 2:
                        for(int i=0; i<galeria.getCompradores().size(); i++){
                            System.out.println("Comprador # "+(i+1));
                            System.out.println("Nombre: "+galeria.getCompradores().get(i).getNombre());
                            System.out.println("Apellido: "+galeria.getCompradores().get(i).getApellido());
                        }
                        for(int i=0; i<galeria.getArtistas().size(); i++){
                            System.out.println("Artistas # "+(i+1));
                            System.out.println("Nombre: "+galeria.getArtistas().get(i).getNombre());
                            System.out.println("Apellido: "+galeria.getArtistas().get(i).getApellido());
                            System.out.println("Numero de obras: "+galeria.getArtistas().get(i).getObras().size());
                        }                    
                    case 3:
                        System.out.println("El valor total de todas las obras es "+galeria.mostrarValorTotal());
                }
            }
            catch(InputMismatchException e){
                System.out.println("Entrada no valida.");
            }
        }
    }
    
}
