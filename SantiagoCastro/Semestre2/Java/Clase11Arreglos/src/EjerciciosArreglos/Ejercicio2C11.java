/*
Ejercicio 2: Leer 5 numeros guardarlos en un arreglo y mostrarlos en orden inverso al introducido
 */
package EjerciciosArreglos;

import java.util.Scanner;

public class Ejercicio2C11 {
    public static void main(String[] args) {
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Creamos arreglo
        int[] arreglo = new int[5];
        //Pedimos numeros al usuario y los guardamos en el arreglo
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el numero "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }
        //Mostramos los elementos segun lo pedido
        System.out.println("Los elementos son:");
        for(int i=4 ; i>=0 ; i--){
            System.out.println(arreglo[i]);
        }
        
    }
}
