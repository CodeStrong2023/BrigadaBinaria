package Ejercicio1;

import java.util.Scanner;

public class Ejecucion6Scanner {
    public static void main(String[] args) {
        // Ejercicio 6: pedir números hasta que se ingrese 0, y mostrar la suma te todos los núeros ingresados
        Scanner entrada = new Scanner(System.in);

        int numero, suma = 0;
        do {
            System.out.println("Ingrese un número");
            numero = Integer.parseInt(entrada.nextLine());
            suma = numero + suma;

        }while (numero != 0);
        System.out.println("La suma de todos los números ingresados es: " + suma);

    }
}
