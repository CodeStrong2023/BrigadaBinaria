/*
Ejercicio 1 CICLOS: Pedir 10 numeros y escribir la suma total.JOptionPane
 */
package Ejercicio2CiclosC6;

import javax.swing.JOptionPane;

public class Ejercicio2CiclosJOptionPane {
    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1 ; i <= 10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null,"\nLa suma de todos los numeros es de: "+suma);
    }
}
