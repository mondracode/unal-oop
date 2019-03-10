package unal.poo.practica;

import becker.robots.*;


/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Braille_1
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
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
	  
            int kk=0;
            int separador=0;
            String[] arr = new String[20];
            String palabra = "";
            
            while(kk==0){
                for(int i=0; i<6; i++){
                    //espera el cambio de columna
                    if(i==3){
                        estudiante.turnLeft();
                        estudiante.move();
                        if(estudiante.canPickThing()==true){
                            palabra+="1";
                        }
                        else{
                            palabra+="0";
                        }
                        estudiante.turnLeft();
                    }
                    //cuando no hay cambio de columna, esto se ejecuta
                    else{
                        estudiante.move();
                        if(estudiante.canPickThing()==true){
                            palabra+="1";
                        }
                        else{
                            palabra+="0";
                        }
                        
                    }
                }
                //cambia de letra y reinicia el string
                arr[separador]=palabra;
                separador++;
                palabra="";
                
                estudiante.move();
                turnRight();
                estudiante.move();
                
                //Revisa si es el final de la palabra
                if(estudiante.canPickThing()==true){
                    System.out.println("_____TRADUCTOR BRAILLE-TEXTO_____");
                    System.out.print("La palabra traducida es: ");
                    
                    //Esto traduce el conjunto de códigos leídos
                    for(int i=0; i<separador; i++){
                        System.out.print(compararLetra(arr[i]));
                    }
                    kk=1;
                }

                turnRight();
            }          
        }
        
        public static char compararLetra(String letra){
            switch(letra){
                
                case "100000": return 'a';
                case "110000": return 'b';
                case "100001": return 'c';
                case "100011": return 'd';
                case "100010": return 'e';
                case "110001": return 'f';
                case "110011": return 'g';
                case "110010": return 'h';
                case "010001": return 'i';
                case "010011": return 'j';
                case "101000": return 'k';
                case "111000": return 'l';
                case "101001": return 'm';
                case "101011": return 'n';
                case "101010": return 'o';
                case "111001": return 'p';
                case "111011": return 'q';
                case "111010": return 'r';
                case "011001": return 's';
                case "011011": return 't';
                case "101100": return 'u';
                case "111100": return 'v';
                case "010111": return 'w';
                case "101101": return 'x';
                case "101111": return 'y';
                case "101110": return 'z';
                
            }
            if(letra=="001111"){
                switch(letra){
                    case "010011" : return '0';
                    case "001110" : return '0';
                    case "100000" : return '1';
                    case "010000" : return '1';
                    case "110000" : return '2';
                    case "011000" : return '2';
                    case "100001" : return '3';
                    case "010010" : return '3';
                    case "100011" : return '4';
                    case "010110" : return '4';
                    case "100010" : return '5';
                    case "010100" : return '5';
                    case "110001" : return '6';
                    case "011010" : return '6';
                    case "110011" : return '7';
                    case "011110" : return '7';
                    case "110010" : return '8';
                    case "011100" : return '8';
                    case "010001" : return '9';
                    case "001010" : return '9';
                    
                    
                }
            }
            
            return '0';
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
