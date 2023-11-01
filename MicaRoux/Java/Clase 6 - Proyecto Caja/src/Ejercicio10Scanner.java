import java.util.Scanner;

public class Ejercicio10Scanner {
    //Ejercicio 10: Pedir 10 números y escribir la suma total 
    //Hacerlo con la clase Scanner y JOptionPane
    public static void main(String[] args) throws Exception {
        //Clase Scanner 
        Scanner numeros = new Scanner(System.in);
        int i, num, acumulador;
        acumulador = 0; 
        System.out.println("Ingrese 10 núemeros");
        for (i=1;i<=10;i++) {
            System.out.println("Ingrese un número");
            num  = numeros.nextInt(); 
            acumulador= acumulador + num; 
        }
        System.out.println("La suma de todos los números ingresados es de: " + acumulador);
        numeros.close(); 
    }
}
