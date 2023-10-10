import java.util.Scanner;

public class Ejercicio7Scanner {
/* Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media
*/
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num, contador = 0; 
        double suma = 0, media = 0; 
        System.out.println("Ingrese un número");
        num = numeros.nextInt();  
        while (num >0) {
            contador ++; 
            suma += num;
            media = (suma/contador); 
            System.out.println("Ingrese otro número");
            num = numeros.nextInt();  
        }
        System.out.println("La media es: " + media);
        numeros.close(); 
    }
}
