/*
Ejerciocio 2: leer un numero e indicar si es positivo o negativo, el proceso se repetirá hasta que se introdizca un cero
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2C2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero, ya sea positivo o negativo");
        System.out.println("Si ingresa un numero neutro finalizará el ciclo");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if (numero > 0) {
                System.out.println("El número "+numero+" es positivo");
            } else{
                System.out.println("El número "+numero+" es negativo");
            }
            System.out.println("Ingrese un numero nuevamente");
            numero = Integer.parseInt(entrada.nextLine());
        } 
        System.out.println("SALISTE DEL CICLO");

    }
}
