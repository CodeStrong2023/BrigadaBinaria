package caja;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        Scanner entrada = new Scanner(System.in);

        //Pedimos los valores
        System.out.println("Calculadora de volumen de caja");
        System.out.println("Ingrese el ancho de la caja");
        caja1.ancho = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el alto de la caja");
        caja1.alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la profundidad de la caja");
        caja1.profundidad = Integer.parseInt(entrada.nextLine());

        // Llamamos al constructor
        int resultado = caja1.calculoCaja();
        System.out.println("El volumen de la caja es: "+ resultado);
    }
}
