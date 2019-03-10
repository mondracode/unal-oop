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

public class Persona {
    private String nombre;
    private ArrayList<Carro> carros;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void mostrarCarros(){
        System.out.println("Bienvenido, " + getNombre());
        System.out.println("Sus carros actuales son");
        for(int i=0; i<carros.size(); i++){
            System.out.println("Carro #" + (i+1));
            System.out.println("____________");
            System.out.println(" ");
            System.out.println(carros.get(i).getMarca()+" "+carros.get(i).getModelo());
            System.out.println("Modelo "+carros.get(i).getAnnio());
            System.out.println("Color "+carros.get(i).getColor());
            System.out.println("Llantas marca "+ carros.get(i).getLlantas().get(i).getMarca());
            System.out.println("cuyo diametro son "+carros.get(i).getLlantas().get(i).getDiametro()+" pulgadas");
            System.out.println("Su motor tiene el serial "+carros.get(i).getMotor().getSerial());
            System.out.println("Y tiene un cilindraje de "+carros.get(i).getMotor().getCilindraje() + " C.C.");
            System.out.println("El numero del chasis es "+carros.get(i).getChasis().getSerial());
        }
    }
}
