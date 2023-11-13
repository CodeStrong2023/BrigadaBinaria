/*SantiagoC
Ejercicio 7: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
Se debe mostrar la posicion en que se encuentra. Si no está, indicarlo con un mensaje.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio7C13 {
    public static void main(String[] args) {
        //Clase Scanner y definimoss arreglos y variables
        Scanner entrada = new Scanner(System.in);
        int array[] = new int [10];
        boolean creciente = true;
        int numero, numero2 = 0;
        
        //Se llena el arreglo
        do{
            for(int i = 0; i<10;i++){
            System.out.println((i+1)+". Ingrese un número para array: ");
            array[i] = entrada.nextInt();
            }
            for(int i = 0;i < 4;i++){
                if (array[i]<array[i+1]){
                    creciente = true;
                }
                if(array[i]>array[i+1]){
                    creciente = false;
                    break;
                }
                if (creciente == false){
                    System.out.println("Ingrese los numeros de manera creciente: ");
                } 
            }        
        }while(creciente == false);
        
        System.out.println("Ingrese un numero para luego buscarlo: ");
        numero = entrada.nextInt();
        
        int i = 0;
        while (i<10 && array[i]<numero){
            i++;
        }
        
        if (i==10){
            System.out.println("Numero no encontrado");
        }
        else{
            if(array[i] == numero){
                System.out.println("Numero encontrado en la posicion: "+i);
            }
            else{
                System.out.println("Numero no encontrado");
            }
        }
        System.out.println();
    }
}
