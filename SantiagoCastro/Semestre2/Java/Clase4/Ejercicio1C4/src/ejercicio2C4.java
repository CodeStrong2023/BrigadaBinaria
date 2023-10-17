
import java.util.Scanner;

/*
Ejercicio 2: pedir numeros hasta que se introduzca uno negativo y calcular la media.
 */

public class ejercicio2C4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        
        System.out.println("Si ingresa un numero negativo el ciclo termina");
        
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(entrada.nextLine());
        
        while(numero >= 0) {
            suma += numero;
            conteo++;
            System.out.println("Ingrese otro número");
            numero = Integer.parseInt(entrada.nextLine());
            
        } 
        if (conteo == 0) {
            System.out.println("Error.La division entre 0 no existe");
        }
        else {
            promedio = (float)suma/conteo;
            System.out.println("El promedio es: "+promedio);
        }
    }
}
