package unal.poo.practica;

import becker.robots.*;
import java.util.Scanner;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Braille_2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            //
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,100);
            
            Scanner lectura = new Scanner(System.in);

            String palabra;
            String trad[]= new String[20];
            boolean quit=false;
            int kk=0;
            
            System.out.println("_____TRADUCTOR TEXTO-BRAILLE_____");
            System.out.print("Introduzca la palabra a traducir: ");
            palabra = lectura.nextLine();
            
            while(quit==false){
                for(int i=0; i<palabra.length()+kk; i++){
                    
                    trad[i]=compararLetra(palabra.charAt(i));

                    
                    for(int j=0; j<6; j++){
                        if(j==3){
                            estudiante.turnLeft();
                            estudiante.move();
                            if(trad[i].charAt(j)=='1'){
                                estudiante.putThing();
                            }
                            
                            estudiante.turnLeft();
                        }
                        else{
                            estudiante.move();
                            if(trad[i].charAt(j)=='1'){
                                estudiante.putThing();
                            }
                        }
                    }
                    estudiante.move();
                    turnRight();
                    estudiante.move();
                    turnRight();
                    
                }
                estudiante.turnLeft();
                while(estudiante.canPickThing()==false){
                    estudiante.move();
                }
                if(estudiante.canPickThing()==true){
                    quit=true;
                }
                
            }
            
            
            
        }
        
       
        public static String compararLetra(char letra){
            
            switch(letra){
                
                case 'a' : return "100000";
                case 'b' : return "110000";
                case 'c' : return "100001";
                case 'd' : return "100011";
                case 'e' : return "100010";
                case 'f' : return "110001";
                case 'g' : return "110011";
                case 'h' : return "110010";
                case 'i' : return "010001";
                case 'j' : return "010011";
                case 'k' : return "101000";
                case 'l' : return "111000";
                case 'm' : return "101001";
                case 'n' : return "101011";
                case 'o' : return "101010";
                case 'p' : return "111001";
                case 'q' : return "111011";
                case 'r' : return "111010";
                case 's' : return "011001";
                case 't' : return "011011";
                case 'u' : return "101100";
                case 'v' : return "111100";
                case 'w' : return "010111";
                case 'x' : return "101101";
                case 'y' : return "101111";
                case 'z' : return "101110";
                case ' ' : return "000000";
                case '0' : return "010011";
                case '1' : return "100000";
                case '2' : return "110000";
                case '3' : return "100001";
                case '4' : return "100011";
                case '5' : return "100010";
                case '6' : return "110001";
                case '7' : return "110011";
                case '8' : return "110010";
                case '9' : return "010001";
            }
            
            return "001111";
        }
     
        public static void moveEstudiante(int pasos){
            for(int i=0; i<pasos; i++){
                estudiante.move();
            }
        }
        public static void turnRight(){
            for(int i=0; i<3; i++){
                estudiante.turnLeft();
            }
        }
        public static void turnAround(){
            for(int i=0; i<2; i++){
                estudiante.turnLeft();
            }
        }      
}
