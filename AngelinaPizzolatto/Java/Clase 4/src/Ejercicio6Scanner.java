import java.util.Scanner;

public class Ejercicio6Scanner {
/* Ejercicio 6: Pedir números hasta que se teclee 0, 
mostrar la suma de todos los números introducidos
 */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero, suma; 
        suma = 0; 
        System.out.println("Ingrese un número");
        numero = numeros.nextInt();  
        while (numero != 0){
            suma = suma + numero;
            System.out.println("Ingrese otro número");
            numero = numeros.nextInt();  
        }
        System.out.println("La suma de todos los números es de: " + suma);
        numeros.close(); 
    }
}