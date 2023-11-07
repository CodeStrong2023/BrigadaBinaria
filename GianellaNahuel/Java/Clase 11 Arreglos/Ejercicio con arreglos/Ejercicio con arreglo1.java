package Ejercicios_Arreglo;

import java.util.Scanner;

// Ejercicio1: leer 5 numeros , guardarlos en un arreglo,y mostrarlos en el mismo orden introducidos
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Arreglo[] = new int[5];
        
        for (int i = 0; i < 5 ; i++) {
            System.out.println((i+1)+"Digite un numero: ");
            Arreglo[i] = entrada.nextInt();
        }
        for (int i :Arreglo) {
            System.out.println(i+ " ");
        }
    }
}

