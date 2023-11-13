/*SantiagoC
Ejercicio 6: Leer dos series de 10 numeros enteros que estarán ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera de forma que sigan ordenados
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio6C13 {
    public static void main(String[] args) {
        //Clase scanner y variables definidas
        Scanner entrada = new Scanner (System.in);
        int arrayA [] = new int [10];
        int arrayB [] = new int [10];
        int arrayFusion [] = new int [20];
        boolean creciente = true;
        
        
        System.out.println("Llene el primer arreglo: ");
        do{
            for (int i = 0; i < 10;i++){
                System.out.println((i+1)+"Ingrese un número para arrayA");
                arrayA[i] = entrada.nextInt();
            }
            //comprobamos si está ordenado el arreglo
            for(int i = 0;i < 4;i++){
                if (arrayA[i]<arrayA[i+1]){
                    creciente = true;
                }
                if(arrayA[i]>arrayA[i+1]){
                    creciente = false;
                    break;
                }
                if (creciente == false){
                System.out.println("Ingrese los numeros de manera creciente: ");
                }
            }
        }while(creciente == false);
        
        System.out.println("Llene el segundo arreglo: ");
        do{
            for (int i = 0; i < 10;i++){
                System.out.println((i+1)+"Ingrese un número para arrayA");
                arrayB[i] = entrada.nextInt();
            }
            //comprobamos si está ordenado el arreglo
                for(int i = 0;i < 4;i++){
                    if (arrayB[i]<arrayB[i+1]){
                        creciente = true;
                    }
                    if(arrayB[i]>arrayB[i+1]){
                        creciente = false;
                        break;
                    }
                    if (creciente == false){
                        System.out.println("Ingrese los numeros de manera creciente: ");
                    } 
                }        
        }while(creciente == false);
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < 10 && j < 10){
            if(arrayA[i]<arrayB[j]){
                arrayFusion[k] = arrayA[i];
                i++;
            }
            else{
                arrayFusion[k] = arrayB[j];
                j++;
            }
            k++;
        }
        if(i==10){
            while(j<10){
                arrayFusion[k] = arrayB[j];
                j++;
                k++;
            }
        }
        else{
            while(i<10){
                arrayFusion[k] = arrayA[i];
                i++;
                k++;
            }
        }
        System.out.println("El arreglo es: ");
        for(k = 0;k < 20;k++){
            System.out.println(arrayFusion[k]+" ");
        }
        System.out.println();
    }
}
