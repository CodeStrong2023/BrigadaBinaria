package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Ejercicio 2: Leer un número e indicar si es positivo o negativo,
        // el proceso se repite hasta ingresar el cero

        var entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num, positivos, negativos;
        negativos=0;
        positivos=0;

        num = Integer.parseInt(entrada.nextLine());
        while (num != 0){
            if (num > 0) {
                System.out.println("El número " + num + " es positivo");
                positivos++;
            }
            else {
                System.out.println("El número "+ num+ " es negativo");
                negativos++;
            }
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Programa finalizado");
        System.out.println("La cantidad de números positivos ingresados es: "+ positivos);
        System.out.println("La cantidad de números negativos ingresados es: "+ negativos);
    }
}
