package ejercico10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese 10 números");
        Scanner entrada = new Scanner(System.in);
        int num, suma = 0;
        for (int i = 1; i<=10; i++){
            System.out.println("Ingrese el "+ i +"° número: ");
            num = Integer.parseInt(entrada.nextLine());
            suma = num + suma;
        }
        System.out.println("La suma de todos los números ingresados es: "+ suma);

    }
}
