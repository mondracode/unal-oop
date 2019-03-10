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
public class SedeEducacionContinuada extends Sede{
    private String curso_mas_popular;
    
    public SedeEducacionContinuada(String nombre, String direccion, int telefono, double area_construida) {
        super(nombre, direccion, telefono, area_construida);
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

    public String getCurso_mas_popular() {
        return curso_mas_popular;
    }

    public void setCurso_mas_popular(String curso_mas_popular) {
        this.curso_mas_popular = curso_mas_popular;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }
    
    
}
