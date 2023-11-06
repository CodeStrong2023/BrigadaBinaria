import java.util.Scanner;

public class Ejercicio04Scanner {
/*
Ejercicio: Pedir números hasta que se teclee uno negativo 
y mostrar cuantos números se han introducido
Con la clase Scanner
 */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num;
        System.out.println("Digite un número");
        num = numeros.nextInt();  
        int contador = 0; 
        while (num > 0) {
            contador++;
            System.out.println("Digite otro número");
            num = numeros.nextInt();
        }
        int cant_num = contador + 1; 
        System.out.println("La cantidad de números ingresados fue de: "+ (cant_num));
        numeros.close(); 
    }
}
