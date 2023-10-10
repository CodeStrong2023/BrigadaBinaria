package Ejercicios;

import javax.swing.*;

public class Ejercicio1_2 {
    public static void main(String[] args) {

        //Utilizamos JOptionPane

        int num,cuadrado;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (num >= 0) {
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
        System.out.println("Programa finalizado");
    }
}
