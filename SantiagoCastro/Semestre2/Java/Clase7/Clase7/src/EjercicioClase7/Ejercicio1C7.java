/*
Ejercicio 1: Diseñar un programa que muestre el producto de los 10 primeros numeros impares.
Hacerlo con JOptionPäne 
 */
package EjercicioClase7;

import javax.swing.JOptionPane;

public class Ejercicio1C7 {
    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1 ; i <= 10 ; i+=2){
            producto*=i;
        }
        JOptionPane.showMessageDialog(null,"El producto de los numeros impares es de: "+producto);
    }
}
