/*
Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
 */
package EjerciciosArreglos;

import java.util.Scanner;

public class Ejercicio1C10 {
    public static void main(String[] args) {
        //Clase scanner 
        Scanner entrada = new Scanner(System.in);
        //Creamos arreglo
        int[] arreglo = new int[5];
        //Pedimos datos y guardamos los datos en el arreglo
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el numero "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }
        //Mostramos los elementos segun lo pedido
        System.out.println("Los elementos son:");
        for(int i:arreglo){
            System.out.println(i+" ");
        }
        
    }
}
