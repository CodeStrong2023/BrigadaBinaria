package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {

        //  Ejercicio 3: leer numeros hasta que se introduzca un cero,
        //  para cada uno indica si es par o impar,
        //  primero lo hacemos con la clase scanner y luego con JOptionPane


        var entrada = new Scanner(System.in);
        int num, par, impar;
        par = 0;
        impar = 0;

        System.out.println("Ingrese un número");
        num = Integer.parseInt(entrada.nextLine());
        while (num != 0){
            if (num %2 ==0 ){
                System.out.println("El número "+num+ " es par");
                par++;
            }
            else{
                System.out.println("El número "+num+ " es impar");
                impar++;
            }
            num = Integer.parseInt(entrada.nextLine());

        }
        System.out.println("Programa Finalizado");
        System.out.println("Cantidad de números par ingresados = " + par);
        System.out.println("Cantidad de números impar ingresados = " + impar);
    }
}