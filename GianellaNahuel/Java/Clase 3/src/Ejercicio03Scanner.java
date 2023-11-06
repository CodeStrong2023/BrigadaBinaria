import java.util.Scanner;

public class Ejercicio03Scanner {
/*
Ejercicio03:Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar
Con clase Scanner      
*/
    public static void main(String[] args)  {
        Scanner numeros = new Scanner(System.in); 
        System.out.println("Digite  un número");
        int numero; 
        numero = numeros.nextInt(); 
        while (numero != 0){
            if (numero % 2 == 0) {
                System.out.println("El número ingresado es par");
            }
            else {
                System.out.println("El número ingresado es impar");
            }
            System.out.println("Digite otro número");
            numero = numeros.nextInt();
        }
        numeros.close(); 
    }
}
