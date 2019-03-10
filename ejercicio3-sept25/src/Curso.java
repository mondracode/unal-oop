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
public class Curso {
    private String profesor;
    private String nombre;
    private ArrayList<Nota> notas;

    public Curso(String profesor, String nombre) {
        this.profesor = profesor;
        this.nombre = nombre;
    }


    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    
}
