/*
Ejercicio 3: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0 y 100,
y luego ir pidiendo número indicando si "es mayor" o "es menor" según sea mayor o menor con respecto a N. 
El proceso termina cuadno el usuario acierte y mostramos el número de intentos hechos
 */
package ejercicio3c3;

import java.util.Scanner;

public class Ejercicio3C3 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
     int intento = 0,numero, aleatorio;
     aleatorio = (int)(Math.random()*100); //Genera un número aleatorio
     
     System.out.println("ADIVINE EL NÚMERO");
     do{
         System.out.println("Ingrese un número");
         numero = Integer.parseInt(entrada.nextLine());
         if (aleatorio > numero){
             System.out.println("El número es mayor");
         }
         else if (aleatorio < numero){
             System.out.println("El número es menor");
         }
         else{
             System.out.println("!FELICIDADES ACERTASTE EL NÚMERO¡");
         }
         intento++;
         System.out.println("Números de intentos: "+intento);
     }while(numero != aleatorio);
     
        System.out.println("Acertaste, el numero era: "+aleatorio+", tuviste "+intento+" intentos");
        
    }
}
