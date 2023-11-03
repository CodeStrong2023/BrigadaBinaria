package Ejercicios;

import java.util.Scanner;

// Ejercicio2: leer 5 numeros y guarda los en un arreglo, mostrarlo en orden inverso
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        // Guardamos los valores
        for (int i = 0; i < 5 ; i++) {
            System.out.println((i+1)+" Ingrese un número: ");
            numeros[i] = entrada.nextInt();
        }
        // Mostramos los valores a la inversa
        for (int i=4; i>=0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
