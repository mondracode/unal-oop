/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Ejecutable {
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta(1, 123, "S", 0);
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = lectura.nextInt();
        
        System.out.println("Ingrese la clave");
        int clave = lectura.nextInt();
        if(clave==c1.getClave()){
            System.out.println("Bienvenido");
            System.out.print("su saldo es ");
            System.out.println(c1.getSaldo());
        }
        else{
            System.out.println("Clave incorrecta");
        }
        
        c1.consignar(45);
        System.out.println(c1.getSaldo());
        
        System.out.println(Cuenta.numCuentas);
        Cuenta c2 = new Cuenta(2, 45, "V", 0);
        System.out.println(Cuenta.numCuentas);
    }
}
