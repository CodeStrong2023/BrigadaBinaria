import java.util.Scanner;
/*
 * Pedir un número y calcular su factorial 
 * Hacerlo con las dos clases, Scanner y JOptionPane
 */
public class Ejercicio12Scanner {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = factorial.nextInt(); 
        int i = 1, fact = 1; 
        while (i<=numero) {
            fact = fact *i;
            i++; 
        }
        System.out.println("El factorial de " + numero + " es " + fact);
        factorial.close(); 
    }
}
