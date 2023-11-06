import java.util.Scanner;

public class Ejercicio07Scanner {
/* Ejercicio 07: Pedir numeros hasta que se introduzca uno negativo
y calcular la media
*/
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num, contador = 0; 
        double suma = 0, media = 0; 
        System.out.println("Digite un número");
        num = numeros.nextInt();  
        while (num >0) {
            contador ++; 
            suma += num;
            media = (suma/contador); 
            System.out.println("Digite otro número");
            num = numeros.nextInt();  
        }
        System.out.println("La media es: " + media);
        numeros.close(); 
    }
}



