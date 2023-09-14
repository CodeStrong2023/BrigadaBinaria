package Ejercicios;

import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {

        /*
        Ejercicio 5: realizar un juego para adivinar un número, para ello generar un número aleatorio
        entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun el N aleatorio,
        el juego termina cuando el usuario acierta y mostramos los intentos realizados.
         */

        var entrada = new Scanner(System.in);
        int num,intentos, aleatorio;
        intentos=0;
        aleatorio= (int)(Math.random()*100);    //Generamos el número aleatorio

        do {
            System.out.println("Digite un número:");
            num = Integer.parseInt(entrada.nextLine());
            if (num < aleatorio){
                System.out.println("Digite un número mayor");
            }
            else if (num > aleatorio) {
                System.out.println("Digite un número menor");
            }
            else {
                System.out.println("Felicidades!!! Has adivinado el número");
            }
            intentos++;
        }while (num != aleatorio);
        {
            System.out.println("Adivinaste el número en "+intentos+ " intentos");
        }
    }
}
