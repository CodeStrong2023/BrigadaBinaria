package Ejercicios;

import javax.swing.*;

public class Ejercicio2_2 {
    public static void main(String[] args) {

        int num, positivos, negativos;
        negativos=0;
        positivos=0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (num != 0){
            if (num > 0) {
                System.out.println("El número " + num + " es positivo");
                positivos++;
            }
            else {
                System.out.println("El número "+ num+ " es negativo");
                negativos++;
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        }
        JOptionPane.showMessageDialog(null,"Programa finalizado");
        JOptionPane.showMessageDialog(null,"La cantidad de números positivos ingresados es: "+ positivos+ "\nLa cantidad de números negativos ingresados es: "+ negativos);
    }
}
