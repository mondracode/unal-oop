/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadfeb17;

import java.util.ArrayList;

/**
 *
 * @author Santiago Mondragón G
 */
public class SedeTecnologica extends Sede{
    private double numero_estudiantes;

    public SedeTecnologica(String nombre, String direccion, int telefono, double area_construida) {
        super(nombre, direccion, telefono, area_construida);
        this.numero_estudiantes = 0;
    }

    public double getNumero_estudiantes() {
        return numero_estudiantes;
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

    public void setNumero_estudiantes(double numero_estudiantes) {
        this.numero_estudiantes = numero_estudiantes;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }
    
    
}
