/*
Ejercicio 2: Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido.
Lo hacemos primero con la clase Scanner y luego con JOptionPane.
 */
package ejercicio2c3;

import java.util.Scanner;

public class Ejercicio2C3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantNum = 0, numero;
        
        System.out.println("Ingrese un número:");
        numero = Integer.parseInt(entrada.nextLine());
        
        while (numero > 0) {
            cantNum++;
            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("SALIÓ DEL CICLO");
        System.out.println("Usted ingresó "+cantNum+" números");
        
    }
    
}
