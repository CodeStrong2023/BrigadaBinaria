/*
Ejercicio 2: Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido.
Lo hacemos primero con la clase Scanner y luego con JOptionPane.
 */
package ejercicio2c3joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio2C3JOptionPane {

    public static void main(String[] args) {
        
        int cantNum = 0, numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        while (numero > 0) {
            cantNum++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        }
        System.out.println("SALIÓ DEL CICLO");
        System.out.println("Usted ingresó "+cantNum+" números");
    }
    
}
