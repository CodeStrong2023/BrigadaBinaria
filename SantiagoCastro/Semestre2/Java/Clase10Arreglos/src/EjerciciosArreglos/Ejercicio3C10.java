/*
Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion
realizar la media de los numeros positivos, la media de los negativos y contar el numero de ceros.
 */
package EjerciciosArreglos;

import java.util.Scanner;

public class Ejercicio3C10 {
    public static void main(String[] args) {
        //Creamos clase scanner
        Scanner entrada = new Scanner(System.in);
        //Creamos arreglo
        int[] arreglo = new int[5];
        //Inicializamos variables
        float positivos = 0, negativos = 0,mediaPositivos,mediaNegativos;
        int conteoNeutro = 0, conteoNegativo = 0,conteoPositivo = 0;
        //Ingresamos números y los guardamos en el arreglo
        for(int i = 0;i < 5;i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
            if (arreglo[i]>0){
                positivos += arreglo[i];
                conteoPositivo++;
            }
            else if (arreglo[i]<0){
                negativos += arreglo[i];
                conteoNegativo++;
            }
            else{
                conteoNeutro++;
            }
        }
        //Mostramos todo lo que tiene que ver con positivos
        if (conteoPositivo == 0){
            System.out.println("No hay ningun positivo");
        }
        else{
            mediaPositivos=conteoPositivo/positivos;
            System.out.println("La media de los numeros positivos es de "+mediaPositivos);
        }
        //Mostramos todo lo que tiene que ver con negativos
        if (conteoNegativo == 0){
            System.out.println("No hay ningun numero negativo");
        }
        else{
            mediaNegativos=conteoNegativo/negativos;
            System.out.println("La media de los numeros positivos es de "+mediaNegativos);
        }
        if (conteoNeutro == 0){
            System.out.println("No se ingresaron numeros neutros");
        }
        else{
            System.out.println("Se ingresaron "+conteoNeutro+" numeros neutros");
        }
                
    }
}
