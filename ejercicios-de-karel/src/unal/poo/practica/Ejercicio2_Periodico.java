package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.Ejercicio1_Vuelta.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio2_Periodico
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
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
            //recorrido de ida
            turnRight();
            for(int i=0; i<2; i++){
                moveEstudiante(1);
                estudiante.turnLeft();
            }
            moveEstudiante(1);
            if(estudiante.canPickThing()==true){
                estudiante.pickThing();
            }
            turnAround();
            
            for(int j=0; j<3; j++){
                moveEstudiante(1);
                turnRight();
            }
            
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