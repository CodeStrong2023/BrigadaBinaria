
import java.util.Scanner;

/*
Ejejrcicio 1: Pedir números hasta que se teclee 0,
mostrar la suma de todos los numeros introducidos.
 */

public class ejercicio1C4 {
    public static void main(String[] args) {
        System.out.println("SUMA DE NUMEROS, si ingresa 0 el ciclo termina");
        
        int numero, suma = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un número");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        } while(numero != 0);
        
        System.out.println("La suma de los numeros es de "+suma);
        
    }
}
