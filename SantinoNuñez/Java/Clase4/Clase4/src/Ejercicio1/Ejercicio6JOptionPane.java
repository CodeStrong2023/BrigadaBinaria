package Ejercicio1;

import javax.swing.*;

public class Ejercicio6JOptionPane {
    public static void main(String[] args) {
        // Ejercicio 6: pedir números hasta que se ingrese 0, y mostrar la suma te todos los núeros ingresados

        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma = numero + suma;

        }while (numero != 0);
        JOptionPane.showMessageDialog(null,"La suma de todos los números es: " + suma);

    }
}
