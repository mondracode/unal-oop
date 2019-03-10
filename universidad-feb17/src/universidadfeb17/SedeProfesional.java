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
public class SedeProfesional extends Sede{
    private int programas_alta_calidad;
    private SedeEducacionContinuada educacion_continuada;
    private SedeTecnologica tecnologias;

    public SedeProfesional(String nombre, String direccion, int telefono, double area_construida) {
        super(nombre, direccion, telefono, area_construida);
        this.programas_alta_calidad = 0;
        super.programas = new ArrayList<Programa>();
    }

    public double getProgramas_alta_calidad() {
        return programas_alta_calidad;
    }

    public SedeEducacionContinuada getEducacion_continuada() {
        return educacion_continuada;
    }

    public SedeTecnologica getTecnologias() {
        return tecnologias;
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

    public void setProgramas_alta_calidad(int programas_alta_calidad) {
        this.programas_alta_calidad = programas_alta_calidad;
    }

    public void setEducacion_continuada(SedeEducacionContinuada educacion_continuada) {
        this.educacion_continuada = educacion_continuada;
    }

    public void setTecnologias(SedeTecnologica tecnologias) {
        this.tecnologias = tecnologias;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }
    
}
