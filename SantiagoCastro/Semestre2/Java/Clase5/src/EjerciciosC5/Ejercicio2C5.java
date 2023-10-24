/*
Ejercicio 2: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
suponiendo que todos los meses son de 30 días.
 */
package EjerciciosC5;

import java.util.Scanner;

public class Ejercicio2C5 {
    public static void main(String[] args) {
        
        int dia,mes,año;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el día:");
        dia = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el mes:");
        mes = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el año:");
        año = Integer.parseInt(entrada.nextLine());
        
        if ((dia != 0)&&(dia<=30)){
            if ((mes != 0)&&(mes <=12)){
                if ((año != 0)&&(año <=2023)){
                    System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+año);
                }
                else{
                    System.out.println("Año incorrecto");
                }
            
            }
            else{
                System.out.println("Mes incorrecto");
            }
        }
        else{
            System.out.println("Dia incorrecto");
        }
    }
}
