import java.util.Scanner;

public class Ejercicio9Scanner {
/*
Ejercicio 9: Pedir el día, mes y año de una fecha
e indicar si la fecha es correcta. Suponiendo que todos
los meses son de 30 días 
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int day, month, year; 
        System.out.println("Ingrese una fecha completa");
        System.out.println("Día");
        day = input.nextInt(); 
        System.out.println("Mes");
        month = input.nextInt(); 
        System.out.println("Año");
        year = input.nextInt(); 
        if ((day != 0) && (day<=30)) {
            if ((month != 0)&&(month<=12)) {
                if ((year != 0)&&(year <=2022)) {
                    System.out.println("La fecha ingresada es: " +day+"/"+month+"/"+year);
                }
                else {
                    System.out.println("El año ingresado no es correcto");
                }
            }
            else {
                System.out.println("El mes ingresado no es correcto");
            }
        }
        else {
            System.out.println("El día ingresado no es coerrecto");
        }
        input.close(); 
    }
}
