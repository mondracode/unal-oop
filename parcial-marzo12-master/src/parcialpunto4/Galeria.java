/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpunto4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author smondragon
 */
public final class Galeria {
    private Cuenta cuenta;
    private ArrayList<Obra> obras;
    private ArrayList<Comprador> compradores;
    private ArrayList<Artista> artistas;

    public Galeria() {
        this.compradores = leerCompradores();
        this.artistas = leerArtistas();
    }
    
    public double mostrarValorTotal(){
        double valor_total=0;
        for(int i=0; i<obras.size(); i++){
            valor_total+=obras.get(i).getPrecio()+(obras.get(i).getPrecio()*0.02);
        }
        return valor_total;
    }
    
    public ArrayList<Artista> leerArtistas(){
        ArrayList<Artista> artistas = new ArrayList<>();
        ArrayList<Obra> obras = new ArrayList<>();
        Scanner sc;
        String verif ="";
        try{
            sc = new Scanner(new File("usuarios.dat"));
            sc.useDelimiter(":");
            
            while(sc.hasNext()){
                String tipo = sc.next();
                if(tipo.equals(System.getProperty("line.separator")+"Artista")|| tipo.equals("Artista")){
                    String nombre = sc.next();
                    String apellido = sc.next();
                    String curriculum = sc.next();
                    String distinciones = sc.next();
                    String verif_obras = sc.next();
                    while(verif_obras.equals(System.getProperty("line.separator")+"Obra")){
                        String nombre_obra = sc.next();
                        String desc_obra = sc.next();
                        Double precio_obra = Double.parseDouble(sc.next());
                        Obra newObra = new Obra(nombre_obra, desc_obra, precio_obra);
                        obras.add(newObra);
                    }
                }
            }
            return artistas;
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de usuarios no encontrado.");
        }
        return artistas;
    }
    
    public ArrayList<Comprador> leerCompradores(){
        ArrayList<Comprador> compradores = new ArrayList<>();
        Scanner sc;
        try{
            sc = new Scanner(new File("usuarios.dat"));
            sc.useDelimiter(":");
            while(sc.hasNext()){
                String tipo = sc.next();
                String c = "Comprador";
                String c_alt = System.getProperty("line.separator")+"Comprador";
                if(tipo.equals(c) || tipo.equals(c_alt)){
                    String nombre = sc.next();
                    String apellido = sc.next();
                    compradores.add(new Comprador(nombre, apellido));                    
                }
            }
            return compradores;
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de usuarios no encontrado.");
        }
        return compradores;
    }
    
    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
}
