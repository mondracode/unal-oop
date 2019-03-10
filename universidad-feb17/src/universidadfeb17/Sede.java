/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadfeb17;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santiago Mondragón G
 */
public abstract class Sede extends Informacion {
    protected double area_construida;
    protected String direccion;
    protected ArrayList<Programa> programas;
    protected ArrayList<Estudiante> estudiantes;

    public Sede(String nombre, String direccion, int telefono, double area_construida) {
        super(nombre, telefono);
        this.area_construida = area_construida;
        this.direccion = direccion;
        this.programas = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    
    protected Sede darInformacion(){
        return this;
    }

    public double getArea_construida() {
        return area_construida;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTelefono() {
        return telefono;
    }
    
    
}
