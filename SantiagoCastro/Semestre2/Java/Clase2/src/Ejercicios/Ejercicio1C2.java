/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio1C2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(entrada.nextLine());

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro numero:");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa a finalizado, ingresó un número negativo");
    
    }
}
