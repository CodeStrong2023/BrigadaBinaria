package Ejercicios;
//Ejercicio 8: pedir un número N, y mostrar todos los números del 1 hasta N
// Clase JOptionPane
import javax.swing.*;

public class Ejercicio8JOptionPane{
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int i = 1;
        while (i<=num) {
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
