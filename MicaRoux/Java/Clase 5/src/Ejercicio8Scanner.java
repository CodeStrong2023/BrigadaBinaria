import java.util.Scanner;

public class Ejercicio8Scanner {
//Pedir un número N y mostrar todos los números del 1 al N
    public static void main(String[] args) {
        try (Scanner numero = new Scanner(System.in)) {
            int i, num; 
            System.out.println("Ingrese un número");
            num = numero.nextInt(); 
            for (i= 0; i <= num; i++) {
                System.out.println(i);
        }
        numero.close();
        }
    }
}
