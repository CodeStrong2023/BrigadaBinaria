package Ejercicios;
//Ejercicio 08: pedir un número N, y mostrar todos los números del 1 al N

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int numero = Integer.parseInt(entrada.nextLine());

        int i = 1;
        while (i<=numero) {
            System.out.println(i);
            i++;
        }
    }
}
