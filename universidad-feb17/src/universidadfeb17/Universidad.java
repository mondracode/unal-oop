/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadfeb17;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Santiago Mondragón G
 */
public class Universidad extends Informacion{
    

    public String getNombre() {
        return nombre;
    }

    public Universidad(String nombre, int telefono) {
        super(nombre, telefono);
    }
    
    public ArrayList<Programa> cargarProgramas(String nombre_sede){
        ArrayList<Programa> programas = new ArrayList<>();
        Scanner pr;
        String kk;
        String objetivo = "\n"+nombre_sede;
        try{
            pr = new Scanner(new File("programas.dat"));
            pr.useDelimiter(",");
            kk=pr.next();
            while(!kk.equals(objetivo)&&pr.hasNext()){
                kk=pr.next();
            }
            while(pr.hasNext()){
                kk = pr.next();
                if(kk.equals("\n"+"p")|| kk.equals("\n"+"t")||kk.equals("\n"+"e")){
                    programas.add(leerPrograma(pr, kk));
                }
                else{
                    break;
                }
            }
            return programas;
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
       }
        return programas;
    }
    
    public Programa leerPrograma(Scanner sc, String tipo){

                String tipo_prog = tipo;
                String nombre_programa = sc.next();
                String descripcion = sc.next();
                int telefono_programa = Integer.parseInt(sc.next());

            return new Programa(nombre_programa, descripcion, telefono_programa, tipo_prog);
    }
    
    
    public  ArrayList<Sede> cargarSedes(){
        ArrayList<Sede> sedes = new ArrayList<>();
        Scanner sc;
            try{
                sc = new Scanner(new File("sedes.dat"));
                sc.useDelimiter(",");
                while(sc.hasNext()){
                    sedes.add(leerSede(sc));
                }
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
        return sedes;
    }
    public Sede leerSede(Scanner sc) {
        String sig = sc.next().trim();
            if(sig.trim().equals("profesional")) return leerSedeProfesional(sc);
            if(sig.trim().equals("tecnologica")) return leerSedeTecnologica(sc);
            return leerSedeEducacionContinuada(sc);

    }
    

    public SedeTecnologica leerSedeTecnologica(Scanner sc){
            SedeTecnologica newSedeT = null;
            String nombre = sc.next();
            String direccion = sc.next();
            int telefono = Integer.parseInt(sc.next());
            double area_construida = Double.parseDouble(sc.next());
            double numero_estudiantes = Double.parseDouble(sc.next());
            newSedeT = new SedeTecnologica(nombre, direccion, telefono, area_construida);
            newSedeT.setNumero_estudiantes(numero_estudiantes);
            newSedeT.setProgramas(cargarProgramas(nombre));
            return newSedeT;
    }

    public  SedeEducacionContinuada leerSedeEducacionContinuada(Scanner sc){
            SedeEducacionContinuada newSedeC = null;
            String nombre = sc.next();
            String direccion = sc.next();
            int telefono = Integer.parseInt(sc.next());
            double area_construida = Double.parseDouble(sc.next());
            String curso_mas_popular=sc.next();
            newSedeC = new SedeEducacionContinuada(nombre, direccion, telefono, area_construida);
            newSedeC.setCurso_mas_popular(curso_mas_popular);
            newSedeC.setProgramas(cargarProgramas(nombre));
            return newSedeC;
    }
    
    public  SedeProfesional leerSedeProfesional(Scanner sc) {
            ArrayList<Programa> programas = new ArrayList<>();
            SedeProfesional newSedeP = null;
            String nombre = sc.next();
            String direccion = sc.next();
            int telefono = Integer.parseInt(sc.next());
            double area_construida = Double.parseDouble(sc.next());
            int programas_alta_calidad = Integer.parseInt(sc.next());
            newSedeP = new SedeProfesional(nombre, direccion, telefono, area_construida);
            newSedeP.setProgramas_alta_calidad(programas_alta_calidad);
            int numero_estudiantes = Integer.parseInt(sc.next());
            newSedeP.setTecnologias(new SedeTecnologica(nombre, direccion, telefono, area_construida));
            newSedeP.getTecnologias().setNumero_estudiantes(numero_estudiantes);
            String curso_mas_popular = sc.next();
            newSedeP.setEducacion_continuada(new SedeEducacionContinuada(nombre, direccion, telefono, area_construida));
            newSedeP.getEducacion_continuada().setCurso_mas_popular(curso_mas_popular);
            newSedeP.setProgramas(cargarProgramas(nombre));
            return newSedeP;
    }
  
   
}
