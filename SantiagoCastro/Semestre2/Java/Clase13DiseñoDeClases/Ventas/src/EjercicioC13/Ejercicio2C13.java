/*SantiagoC
Ejercicio 2: Leer por teclado dos tablas de 10 numeros enteros y mesclarlas en una tercera 
de la forma: el 1° del A, el 1° del B, el 2° del A, el 2° del B, etc.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio2C13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arrayA[] = new int [10];
        int arrayB[] = new int [10];
        int arrayConcatenacion[] = new int [20];
        
        //Ciclo for para la entrada de valores al arreglo A
        for(int i = 0; i<10;i++){
            System.out.println((i+1)+". Ingrese un número para arrayA: ");
            arrayA[i] = entrada.nextInt();
        }
        //Ciclo for para la entrada de valores al arreglo
        for(int i = 0; i<10;i++){
            System.out.println((i+1)+". Ingrese un número para arrayB: ");
            arrayB[i] = entrada.nextInt();
        }
        //Guardamos los arreglos en arrayConcatenacion
        int j = 0;
        for(int i = 0; i < 10; i++){
            arrayConcatenacion[j] = arrayA[i];
            j++;
            arrayConcatenacion[j] = arrayB[i];
            j++;
        }
        
        //Mostramos arrayConcatenacion
        for(int i = 0; i < 20; i++){
            System.out.println(arrayConcatenacion[i]+" ");
        }
    }
}
