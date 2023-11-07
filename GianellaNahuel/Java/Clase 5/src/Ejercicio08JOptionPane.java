package Ejercicios;
//Ejercicio 08: pedir un número N, y mostrar todos los números del 1 al N

import javax.swing.*;

public class Ejercicio08JOptionPane{
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int i = 1;
        while (i<=numero) {
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
