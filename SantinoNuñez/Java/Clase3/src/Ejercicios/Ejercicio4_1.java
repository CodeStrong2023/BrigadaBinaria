package Ejercicios;

import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {

        /*
        Ejercicio 4: pedir un número hasta que se teclee uno negativo,
        y mostrar cuantos números se han introducido.
        Lo hacemos primero con Scanner y luego con JOptionPane
        */

        var entrada = new Scanner(System.in);
        int num, contador;
        contador=0;

        System.out.println("Ingrese un número");
        num = Integer.parseInt(entrada.nextLine());
        while (num >=0){
            System.out.println("Ingrese un número");
            num = Integer.parseInt(entrada.nextLine());
            contador++;
        }
        System.out.println("Programa finalizado");
        System.out.println("la cantidad de número ingresados es "+contador);
    }
}
