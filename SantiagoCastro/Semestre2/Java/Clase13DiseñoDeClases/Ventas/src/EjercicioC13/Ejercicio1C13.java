/*SantiagoC
Ejercicio 1: Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden:
el primero, el ultimo, el segundo, el penultimo,etc.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio1C13 {
    public static void main(String[] args) {
        //Clase scanner
        Scanner entrada = new Scanner(System.in);
        //Definimos el arreglo
        int array[] = new int [10];
        
        //Ciclo for para la entrada de valores al arreglo
        for(int i = 0; i<10;i++){
            System.out.println((i+1)+". Ingrese un número: ");
            array[i] = entrada.nextInt();
        } 
        
        //Mostramos el arreglo según lo pedido con ciclo for
        for(int i = 0; i < 5;i++){
            System.out.println((array[i])+" "); //Primer número
            System.out.println((array[9-i])+" ");//Segundo número
        }
    }
}
