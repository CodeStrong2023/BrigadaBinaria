package Ejercicios;

import java.util.Scanner;

/*
Ejercicio 9: pedir el dia, mes y año de una fecha e indicar si la fecha es correcta,
suponiendo que todos los meses son de 30 dias.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día");
        int dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el mes");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el año");
        int anio = Integer.parseInt(entrada.nextLine());
        if ((dia != 0) && (dia <= 30)){
            if ((mes != 0) && (mes <= 12)){
                if ((anio != 0) && (anio <= 2023)){
                    System.out.println("La fecha ingresada es "+dia+"/"+mes+"/"+anio);
                }
                else{
                    System.out.println("Fecha incorrecto, Año incorrecto");
                }
            }
            else{
                System.out.println("Fecha incorrecto, Mes incorrecto");
            }
        }
        else{
            System.out.println("Fecha incorrecto, Día incorrecto");
        }
    }
}
