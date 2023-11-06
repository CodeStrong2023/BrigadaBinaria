package Ejercicios; 
import java.util.Scanner;

public class Ejercicio01Scanner {
    /*
    Ejercicio 1: Leer un número y mostrar su cuadrado,
    repetir el proceso hasta que se introduzca un número negativo
    */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);  
        int num; 
        do {
            System.out.println("Digite un número para calcular su cuadrado: ");
            num = numeros.nextInt(); 
            if (num>0){
            var resultado = (int)Math.pow(num,2); 
            System.out.println("El resultado de " + num + " elevado al cuadrado es " + resultado);}
            else {
                System.out.println("El número ingresado es negativo");
            }
        } while (num >0); 
        numeros.close(); 
    }
}

