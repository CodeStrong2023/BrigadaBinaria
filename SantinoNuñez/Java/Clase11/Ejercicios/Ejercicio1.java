package Ejercicios;

import java.util.Scanner;

// Ejercicio1: leer 5 numeros y guarda los en un arreglo, mostrar en ese orden
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        
        // Guardamos los valores
        for (int i = 0; i < 5 ; i++) {
            System.out.println((i+1)+" Ingrese un número: ");
            numeros[i] = entrada.nextInt();
        }
        // Mostramos los valores
        for (int i : numeros) {
            System.out.println(i+ " ");
        }
    }
}
