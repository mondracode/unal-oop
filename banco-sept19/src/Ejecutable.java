
import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Mondragón G
 */
public class Ejecutable {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        Banco banco = new Banco("banco1", cuentas);
        Scanner lectura = new Scanner(System.in);
        
        Cuenta cuenta1 = new Cuenta(123, 2000, new Fecha(10, 9, 2018), "Santiago");
        Cuenta cuenta2 = new Cuenta(420, 1500, new Fecha(12,9,2018), "Fabian");
        
        cuenta1.getMovimientos().add(new Movimiento(new Fecha(17,9,2018),cuenta1.getSaldo(),200,new Tipo("Retiro")));
        cuenta1.getMovimientos().add(new Movimiento(new Fecha(14,9,2018),cuenta1.getSaldo(),250,new Tipo("Consignacion")));
        cuenta2.getMovimientos().add(new Movimiento(new Fecha(17,9,2018),cuenta2.getSaldo(),300,new Tipo("Retiro")));
        cuenta2.getMovimientos().add(new Movimiento(new Fecha(14,9,2018),cuenta2.getSaldo(),500,new Tipo("Consignacion")));
        banco.getCuentas().add(cuenta2);
        banco.getCuentas().add(cuenta1);
        
        System.out.println("Bienvenido al banco sin nombre");
        System.out.print("Para realizar una transaccion, presione 1. Para mostrar las cuentas actuales presione 2: ");
        int opcion = lectura.nextInt();
        
        if(opcion==2){
           banco.mostrarCuentas(); 
        }
        if(opcion==1){
            System.out.print("Digite el numero de cuenta: ");
            double numero = lectura.nextDouble();
            for(int i=0; i<banco.getCuentas().size(); i++){
                if(banco.getCuentas().get(i).getNumero()==numero){
                    System.out.println("Bienvenido, "+banco.getCuentas().get(i).getNombre_cliente());
                    while(true){
                        System.out.print("Para realizar una consignacion, presione 1. Para realizar un retiro, presione 2: ");
                        int tipo = lectura.nextInt();
                        if(tipo==1){
                            System.out.print("Digite la cantidad a consignar: ");
                            double cantidad = lectura.nextDouble();
                            if(cantidad>0){
                                banco.getCuentas().get(i).getMovimientos().add(new Movimiento(new Fecha(21, 9, 2018), banco.getCuentas().get(i).getSaldo(), cantidad, new Tipo("Consignacion")));
                                banco.getCuentas().get(i).crearConsignacion(banco.getCuentas().get(i).getSaldo(), cantidad);
                            }
                            else{
                                System.out.print("Cantidad no valida");
                            }

                        }
                        if(tipo==2){
                            System.out.print("Digite la cantidad a retirar: ");
                            double cantidad = lectura.nextDouble();
                            if(cantidad>0){
                                if(cantidad>banco.getCuentas().get(i).getSaldo()){
                                System.out.println("Saldo insuficiente.");
                                }
                            else{
                                banco.getCuentas().get(i).getMovimientos().add(new Movimiento(new Fecha(21, 9, 2018), banco.getCuentas().get(i).getSaldo(), cantidad, new Tipo("Retiro")));
                                banco.getCuentas().get(i).crearRetiro(banco.getCuentas().get(i).getSaldo(), cantidad);
                                }
                            }   
                        }
                        System.out.println("Transaccion completada. Su saldo actual es "+banco.getCuentas().get(i).getSaldo());
                        System.out.print("Presione 1 para realizar otra transaccion. Presione 2 para salir: ");
                        int eleccion = lectura.nextInt();
                        if(eleccion==1){
                            continue;
                        }
                        if(eleccion==2){
                            break;
                        }
                    }
                    System.out.println("Gracias por hacer uso del banco sin nombre.");    
                }
            }
        }
        
        
    }
}
