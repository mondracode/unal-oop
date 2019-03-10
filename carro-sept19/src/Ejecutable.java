/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        Persona dueno = new Persona("Santiago");
        
        ArrayList<Llanta> llantasTesla = new ArrayList<Llanta>();
        ArrayList<Llanta> llantasVW = new ArrayList<Llanta>();
        for(int i=0; i<4; i++){
            llantasTesla.add(new Llanta("Goodyear", 20));
        }
        for(int i=0; i<4; i++){
            llantasVW.add(new Llanta("Bridgestone", 17));
        }

        carros.add(new Carro("Tesla", "Model 3", 2018, "Azul"));
        carros.add(new Carro("Volkswagen", "Beetle", 1964, "Negro"));
        carros.get(0).setLlantas(llantasTesla);
        carros.get(1).setLlantas(llantasVW);
        carros.get(0).setMotor(new Motor(123123, 2200));
        carros.get(1).setMotor(new Motor(42069, 1200));
        
        dueno.setCarros(carros);
        
        dueno.mostrarCarros();
        
    }
}
