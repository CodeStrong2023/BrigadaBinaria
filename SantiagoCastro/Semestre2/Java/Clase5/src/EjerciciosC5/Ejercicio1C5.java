/*
Ejercicio 1: Pedir un número N y mostrar todos los numeros del 1 al N.
 */
package EjerciciosC5;

import java.util.Scanner;

public class Ejercicio1C5 {
    public static void main(String[] args) {
        
        int numero;
        int itinerante = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.println("A continuacion se mostrarán lós numeros del 1 hasta "+numero);
        
        do{
            itinerante++;
            System.out.println(itinerante);
        }while (itinerante != numero);
        
        System.out.println("Ciclo finalizado, ya se mostraron todos los numeros");
           
    }
}
