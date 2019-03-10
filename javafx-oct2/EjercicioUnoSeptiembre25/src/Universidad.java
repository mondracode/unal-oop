/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class Universidad {
    private String nombre;
    private ArrayList<Proyecto> proyectos;
    private HashMap<Integer, Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
        this.estudiantes = new HashMap<>();
    }
    
    public ArrayList<Proyecto> listarProyectos(){
        return this.proyectos;
    }
    
    public boolean adicionarProyecto(String nombre){
        return proyectos.add(new Proyecto(nombre));
    }
    
    public boolean adicionarEstudiante(Estudiante estudiante){
        return estudiantes.put(estudiante.getCodigo(), estudiante)!=null;
    }
    
    public boolean adicionarEstudianteProyecto(Estudiante estudiante, int pos){
        return proyectos.get(pos).adicionarEstudiante(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public HashMap<Integer,Estudiante> listarEstudiates(){
        return estudiantes;
    }

}
