/*
Ejercicio 2: pedir un numero y calcular su factorial
Hacerlo con las dos clases Scanner y JOptionPane.
 */
package EjercicioClase7;

import java.util.Scanner;

public class Ejercicio2C7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Ingrese un numero: ");
        int num = Integer.parseInt(entrada.nextLine());
        for (int i = 1; i <= num ; i++){
            factorial *= i;
        }
        System.out.println("\nEl factorial del numero es: "+factorial);
    }
}
