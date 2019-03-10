/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
import java.util.ArrayList;

public class Banco {
    private String codigo;
    private ArrayList<Cuenta> cuentas;

    public Banco(String codigo, ArrayList<Cuenta> cuentas) {
        this.codigo = codigo;
        this.cuentas = cuentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void mostrarCuentas(){
        System.out.println("Las cuentas existentes son las siguientes: ");
        for(int i=0; i<cuentas.size(); i++){
            System.out.println("Cuenta #"+(i+1));
            System.out.println("___________________");
            System.out.println("El propietario es "+cuentas.get(i).getNombre_cliente());
            System.out.println("El numero de cuenta es "+cuentas.get(i).getNumero());
            System.out.println("El saldo actual es "+cuentas.get(i).getSaldo());
            System.out.print("Esta cuenta fue creada el "+cuentas.get(i).getCreacion().getDia()+" / ");
            System.out.print(cuentas.get(i).getCreacion().getMes()+" / ");
            System.out.println(cuentas.get(i).getCreacion().getAnnio());
            System.out.println("___________________");
            System.out.println("Sus movimientos recientes son: ");
            for (int j=0; j<cuentas.get(i).getMovimientos().size(); j++){
                System.out.print(cuentas.get(i).getMovimientos().get(j).getFecha().getDia()+" / ");
                System.out.print(cuentas.get(i).getMovimientos().get(j).getFecha().getMes()+" / ");
                System.out.println(cuentas.get(i).getMovimientos().get(j).getFecha().getAnnio());
                System.out.println("La cantidad fue " + cuentas.get(i).getMovimientos().get(j).getCantidad());
                
                if(cuentas.get(i).getMovimientos().get(j).getTipo().getCodigo().equals("Consignacion")){
                    System.out.println("El saldo era " + (cuentas.get(i).getMovimientos().get(j).getSaldo()-cuentas.get(i).getMovimientos().get(j).getCantidad()));
                }
                if(cuentas.get(i).getMovimientos().get(j).getTipo().getCodigo().equals("Retiro")){
                    System.out.println("El saldo era " + (cuentas.get(i).getMovimientos().get(j).getSaldo()+cuentas.get(i).getMovimientos().get(j).getCantidad()));
                }
                
                System.out.println("La transaccion fue un(a) " + cuentas.get(i).getMovimientos().get(j).getTipo().getCodigo());
                System.out.println(" ");
            }
            
            
        }
    }
    
}
