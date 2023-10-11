/*
        Ejercicio 1: Leer numeors hasta que se introduzca un cero.
        Para cada uno indicar si es par o impar.
        Primero lo haremos con la clase Scanner
        Luego con la clase JOptionPane
 */
package ejercicio1c3;

import java.util.Scanner;

public class Ejercicio1C3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        System.out.println("Si ingresa cero saldrá del cilco");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
            } else {
                System.out.println("El numeor " + numero + " es impar");
            }
            System.out.println("Ingrese otro numero");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("SALISTE DEL CICLO");
    }

}
