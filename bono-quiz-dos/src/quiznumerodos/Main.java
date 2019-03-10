/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiznumerodos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author smondragon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Farmer> farmers = readFarmers();
        ArrayList<Manufacturer> manufacturers = readManufacturers();
        ArrayList<DistributionCenter> distributionCenters = readDistributionCenters();
        ArrayList<Retail> retails = readRetails();
        ArrayList<MateriaPrima> materias_primas = readMateriaPrima();
        ArrayList<Producto> productos = readProducts(materias_primas);
        
    }
    public static ArrayList<Farmer> readFarmers(){
        Scanner sc;
        ArrayList<Farmer> farmers = new ArrayList<>();
        try{
            sc = new Scanner(new File("farmers.dat"));
            sc.useDelimiter(",");
            while(sc.hasNext()){
                String nombre = sc.next().trim();
                String descripcion = sc.next();
                int latitud = Integer.parseInt(sc.next());
                int longitud = Integer.parseInt(sc.next());
                farmers.add(new Farmer(nombre,descripcion,latitud,longitud));
            }
            return farmers;
            
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de farmers no encontrado.");
            
        }
        return null;
    }
    public static ArrayList<Manufacturer> readManufacturers(){
        Scanner sc1;
        ArrayList<Manufacturer> manufacturers = new ArrayList<>();
        try{
            sc1 = new Scanner(new File("manufacturers.dat"));
            sc1.useDelimiter(",");
            while(sc1.hasNext()){
                
                String nombre = sc1.next();
                String descripcion = sc1.next();
                int la = sc1.nextInt();
                int lon1 = sc1.nextInt();
                //int latitud = Integer.parseInt(sc1.next());
                //int longitud = Integer.parseInt(sc1.next());
                manufacturers.add(new Manufacturer(nombre,descripcion,la,lon1));
            }
            return manufacturers;
            
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de manufacturers no encontrado.");
            
        }
        return null;
    }    
     public static ArrayList<DistributionCenter> readDistributionCenters(){
        Scanner sc2;
        ArrayList<DistributionCenter> distributionCenters = new ArrayList<>();
        try{
            sc2 = new Scanner(new File("distribution_centers.dat"));
            sc2.useDelimiter(",");
            while(sc2.hasNext()){
                String nombre = sc2.next();
                String descripcion = sc2.next();
                int la2 = Integer.parseInt(sc2.next());
                int lon2 = sc2.nextInt();
                distributionCenters.add(new DistributionCenter(nombre,descripcion,la2,lon2));
            }
            return distributionCenters;
            
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de centros de distribución no encontrado.");
            
        }
        return null;
    }
    public static ArrayList<Retail> readRetails(){
        Scanner sc3;
        ArrayList<Retail> retails = new ArrayList<>();
        try{
            sc3 = new Scanner(new File("retails.dat"));
            sc3.useDelimiter(",");
            while(sc3.hasNext()){
                String nombre = sc3.next().trim();
                String descripcion = sc3.next();
                int latitud = Integer.parseInt(sc3.next());
                int longitud = Integer.parseInt(sc3.next());
                retails.add(new Retail(nombre,descripcion,latitud,longitud));
            }
            return retails;
            
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de retail no encontrado.");
            
        }
        return null;
    }
    public static ArrayList<MateriaPrima> readMateriaPrima(){
        Scanner sc4;
        ArrayList<MateriaPrima> materia_prima = new ArrayList<>();
        MateriaPrima new_materia_prima;
        try{
            sc4 = new Scanner(new File("materiasprimas.dat"));
            sc4.useDelimiter(",");
            while(sc4.hasNext()){
                String nombre = sc4.next().trim();
                String descripcion = sc4.next();
                String cultivado_por = sc4.next();
                new_materia_prima = new MateriaPrima(nombre,descripcion,cultivado_por);
                materia_prima.add(new_materia_prima);
            }
            return materia_prima;
            
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de materia prima no encontrado.");
            
        }
        return null;
    }
    public static ArrayList<Producto> readProducts(ArrayList<MateriaPrima> mps){
        Scanner sc5;
        Producto new_producto;
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<MateriaPrima> componentes = new ArrayList<>();
        try{
            sc5 = new Scanner(new File("productos.dat"));
            sc5.useDelimiter(",");
            while(sc5.hasNext()){
                String fabricante = sc5.next().trim();
                String nombre = sc5.next();
                String descripcion = sc5.next();
                while(sc5.hasNext()){
                    String nombre_componente = sc5.next();
                    for(int i=0; i<mps.size(); i++){
                        if(mps.get(i).getNombre().equals(nombre_componente)){
                            componentes.add(mps.get(i));
                        }
                    }
                }
                new_producto = new Producto(componentes,nombre,descripcion);
                productos.add(new_producto);
            }
            return productos;
            
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo de productos no encontrado.");
            
        }
        return null;        
    }    
}
