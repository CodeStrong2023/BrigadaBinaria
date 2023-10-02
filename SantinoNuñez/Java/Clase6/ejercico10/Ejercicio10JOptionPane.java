package ejercico10;

import javax.swing.*;

public class Ejercicio10JOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ingrese 10 números");
        int numero, sum = 0;
        for (int i = 1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+ i +"° número: "));
            sum = numero + sum;
        }
        JOptionPane.showMessageDialog(null,"La suma de todos los números ingresados es: "+ sum);
    }
}
