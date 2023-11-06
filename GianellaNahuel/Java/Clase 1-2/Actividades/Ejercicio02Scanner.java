package Ejercicios; 
import java.util.Scanner;

public class Ejercicio02Scanner {
    /*
    Ejercicio 2: Leer un número e indicar si es positivo o negativo.
    El proceso se repetirá hasta que se introduzca un 0 
    */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num; 
        System.out.println("Digite un número sin coma");
        num = numeros.nextInt(); 
        while (num != 0) {
            if (num<0) {
                System.out.println("El número ingresado es negativo");
            } 
            else if (num>0) {
                System.out.println("El número ingresado es positivo");
            }
            else {
                System.out.println("El número ingresado es 0");
                break; 
            }
            System.out.println("Digite otro número");
            num = numeros.nextInt(); 
        }
        numeros.close(); 
    }
}

