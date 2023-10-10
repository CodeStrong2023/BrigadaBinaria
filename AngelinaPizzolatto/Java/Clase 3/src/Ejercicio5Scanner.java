import java.util.Scanner;

public class Ejercicio5Scanner {
/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o
"es menor" según respecta a N 
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos

Con clase Scanner
 */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("JUEGO PARA ADIVINAR NÚMEROS");
        int num, num_aleatorio, contador = 0; 
        num_aleatorio = (int)(Math.random()*100);  
        System.out.println("Ingrese un número");
            num = numeros.nextInt();
        while (num != num_aleatorio) {
            contador++;  
            if (num>num_aleatorio) {
                System.out.println("El número ingresado es mayor");
            }
            else if (num<num_aleatorio){
                System.out.println("El número ingresado es menor");
            }
            else {
                System.out.println("Felicidades, adivinó el número");
            }
            System.out.println("Ingrese nuevamente un número");
            num = numeros.nextInt();  
        } 
        System.out.println("La cantidad de intentos antes de adivinar fue de " + contador + " y su número era el " + num_aleatorio);
        numeros.close(); 
    }
}
