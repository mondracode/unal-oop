package unal.poo.practica;

import becker.robots.*;


/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Plantilla
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
            estudiante = new Robot(objetos,0, 2, Direction.EAST,10);
            
	  
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