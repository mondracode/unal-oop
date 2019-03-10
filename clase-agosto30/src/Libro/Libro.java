/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author Estudiante
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private int paginas;
    private int calificacion;
    
    public Libro(String nombre, String autor, int paginas, int calificacion){
        this.nombre=nombre;
        this.autor=autor;
        this.paginas=paginas;
        if(calificacion>=0&&calificacion<=10){
            this.calificacion=calificacion;
        }       
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
