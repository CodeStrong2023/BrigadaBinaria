/*
Ejercicio 1 CICLOS: Pedir 10 numeros y escribir la suma total
 */
package Ejercicio2CiclosC6;

import java.util.Scanner;

public class Ejercicio2Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1 ; i <= 10;i++){
            System.out.println("Ingrese un número");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("\nLa suma de todos los numeros es de: "+suma);
    }
}
