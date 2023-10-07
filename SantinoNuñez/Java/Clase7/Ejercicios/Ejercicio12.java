package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

/* Ejercicio 12: Pedimos un número y calculamos su factorial
hacerlo con las dos clases, Scanner y JOptionPane
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        // int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"))
        int numero = Integer.parseInt(entrada.nextLine());
        var factorial = 1;
        for (int i = 1; i<=numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial de "+numero+ " es: "+factorial);
        JOptionPane.showMessageDialog(null,"El factorial de "+numero+ " es: "+factorial);
    }
}