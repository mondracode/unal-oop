/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Santiago Mondragón G
 */
public class Estudiante {
    private String nombre;
    private ArrayList<Nota> notas;
    private ArrayList<Curso> cursos;
    
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<Nota>();
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
}
