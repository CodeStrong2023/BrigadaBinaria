/*SantiagoC
Ejercicio 5:Leer 10 numeros enteros en una tabla. Guardar en otra tabla los elementos 
pares de la primera y a continuacion los elementos impares.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio5C13 {
    public static void main(String[] args) {
        //clase scanner y definimos variables
        Scanner entrada = new Scanner(System.in);
        int array[] = new int [10];
        int conteo_pares = 0, conteo_impares = 0;
        
        //Llenamos el arreglo
        System.out.println("Complete el arreglo:");
        for(int i = 0;i < 10;i++){
            System.out.println("Ingrese la posicion "+(i+1)+": ");
            array [i] = entrada.nextInt();
            
            if (array[i]%2==0){
                conteo_pares++;
            }
            else{
                conteo_impares++;
            }
        }
        //Creamos arreglos pares e impares
        int arrayPar[] = new int [conteo_pares];
        int arrayImpar[] = new int [conteo_impares];
        
        conteo_pares = 0;
        conteo_impares = 0;
        
        for (int i = 0;i < 10; i++){
            if(array[i]%2==0){
                arrayPar[conteo_pares] = array[i];
                conteo_pares++;
            }
            else{
                arrayImpar[conteo_impares] = array[i];
                conteo_impares++;
            }
        }
        System.out.println("Arreglo pares");
        for(int i = 0; i < conteo_pares;i++){
            System.out.println(arrayPar[i]+" ");
        }
            
        System.out.println("Arreglo impares");
        for(int i = 0; i < conteo_impares;i++){
            System.out.println(arrayImpar[i]+" ");
        }
        System.out.println();
    }
}
