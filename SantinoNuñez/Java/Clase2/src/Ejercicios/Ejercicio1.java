package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1: leer un número y mostrar su cuadradro,
        // repetir el proceso hasta que se ingrese un número negativo

        var entrada = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num,cuadrado;
        num = Integer.parseInt(entrada.nextLine());
        while (num >= 0) {
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Programa finalizado");
    }
}
