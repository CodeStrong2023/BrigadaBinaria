package Ejercicios_Arreglo;

import java.util.Scanner;

// Ejercicio2: leer 5 numeros y guardarlos en un arreglo, mostrarlo en orden inverso al introducido
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Arreglo[] = new int[5];

             for (int i = 0; i < 5 ; i++) {
            System.out.println((i+1)+" Digite un número: ");
Arreglo [i] = entrada.nextInt();
        }
        for (int i=4; i>=0; i--) {
            System.out.println(Arreglo[i]);
        }
    }
}

