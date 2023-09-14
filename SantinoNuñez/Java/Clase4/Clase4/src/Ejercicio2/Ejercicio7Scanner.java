package Ejercicio2;

import java.util.Scanner;

public class Ejercicio7Scanner {
    public static void main(String[] args) {
        // Ejercicio 7: pedir números hasta que se introduzca uno negativo y calcular la media

        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0, conteo =0;
        float promedio = 0;

        System.out.println("Ingrese un número");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0){
            suma = numero+suma;
            System.out.println("Ingrese otro número");
            numero = Integer.parseInt(entrada.nextLine());
            conteo++;
        }
        System.out.println(suma);
        if(conteo == 0){
            System.out.println("La divicion entre cero no es posible");
        }
        else{
            promedio = (float) suma/conteo;
            System.out.println("El promedio es: " + promedio);
        }
    }
}