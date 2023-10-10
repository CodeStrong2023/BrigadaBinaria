package Ejercicios;
//Ejercicio 8: pedir un número N, y mostrar todos los números del 1 hasta N

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = Integer.parseInt(entrada.nextLine());

        int i = 0;
        while (i<=num) {
            System.out.println(i);
            i++;
        }
    }
}
