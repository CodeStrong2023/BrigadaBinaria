import java.util.Scanner;

public class Ejercicio06Scanner {
/* Ejercicio 06: Pedir numeros hasta que se teclee 0, 
mostrar la suma de todos los números introducidos
 */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero, suma; 
        suma = 0; 
        System.out.println("Digite un número");
        numero = numeros.nextInt();  
        while (numero != 0){
            suma = suma + numero;
            System.out.println("Digite otro número");
            numero = numeros.nextInt();  
        }
        System.out.println("La suma de todos los números es de: " + suma);
        numeros.close(); 
    }
}
