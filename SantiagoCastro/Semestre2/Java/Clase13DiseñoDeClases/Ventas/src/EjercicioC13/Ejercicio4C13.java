/* SantiagoC
Ejercicio 4: Leer por teclado una tabla de 10 elementos numericos enteros y una posicion
(entre 0 y 9). Eliminar el elemento situado en la posicion dada sin dejar huecos.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio4C13 {
    public static void main(String[] args) {
        //Clase Scanner y definimos variables
        Scanner entrada = new Scanner(System.in);
        int array[] = new int [10];
        int posicion,j = 0;
        
        //Llenamos el arreglo
        for(int i = 0;i < 10; i++){
            System.out.println((i+1)+" .Ingrese un número: ");
            array[i] = entrada.nextInt();
        }
        //Ingesamos la posicion a eliminar
        do{
            System.out.println("Elimine una posicion entre el 0 y 9 (cero y nueve)");
            posicion = entrada.nextInt();
        }while(posicion < 0 || posicion > 9);
        
        //Eliminamos la posicion
        for(int i=posicion;i<9;i++){
            array[i]= array[i+1];
        }
        
        System.out.println("Arreglo: ");
        for (int i = 0; i < 9; i++){
            System.out.println(array[i]+" - ");
        }
        System.out.println();
    }
}
