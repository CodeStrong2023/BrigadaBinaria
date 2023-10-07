package Ejercicios;

import javax.swing.*;

/* Ejercicio 11: Diseñar un programa que muestre el producto de los
10 primeros números impares. hacerlo con JOptionPane
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        var producto = 1;
        for (int i = 1; i<=20; i+=2){
            producto *= i;
        }
        JOptionPane.showMessageDialog(null,"El producto de los primeros números impares es "+ producto);
    }
}
