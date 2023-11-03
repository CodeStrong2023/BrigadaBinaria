package Ejercicios;

import java.util.Scanner;

// Ejercicio3: Leer 5 numeros por teclado y almacenarlos en un arreglo,
//             a continuacion realizar la media de los positivos, los negativos y neutros.

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        int negativos=0,positivos=0,neutros=0,media_negativos,media_positivos;
        int conteo_neutros=0,conteo_negativos=0, conteo_positivos=0;

        // Guardamos los valores
        for (int i = 0; i < 5 ; i++) {
            System.out.println((i+1)+" Ingrese un número: ");
            numeros[i] = entrada.nextInt();
            if (numeros[i]>0) {
                positivos += numeros[i];
                conteo_positivos++;
            }
            else if (numeros[i]<0) {
                negativos += numeros[i];
                conteo_negativos++;
            }
            else {
                conteo_neutros++;
            }
        }
        // Mostramos los valores
        if (conteo_positivos == 0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else{
            media_positivos = positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_positivos);
        }
        if (conteo_negativos == 0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }
        else{
            media_negativos = negativos/conteo_negativos;
            System.out.println("La media de los numeros negativos es: "+media_negativos);
        }
        System.out.println("La cantidad de neutros es: "+conteo_neutros);
    }
}
