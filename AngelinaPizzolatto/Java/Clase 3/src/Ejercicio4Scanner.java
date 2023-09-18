import java.util.Scanner;

public class Ejercicio4Scanner {
/*
Ejercicio: Pedir números hasta que se teclee uno negativo 
y mostrar cuantos números se han introducido
Con clase Scanner
 */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num = numeros.nextInt();  
        int contador = 0; 
        while (num > 0) {
            contador++;
            System.out.println("Ingrese otro número");
            num = numeros.nextInt();
        }
        int cant_num = contador + 1; 
        System.out.println("La cantidad de números ingresados fue de: "+ (cant_num));
        numeros.close(); 
    }
}
