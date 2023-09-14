package Ejercicios;

import javax.swing.*;

public class Ejercicio3_2 {
    public static void main(String[] args) {

        // Ejercicio 3 con clase JOptionPane

        int num, par, impar;
        par = 0;
        impar = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (num != 0){
            if (num %2 ==0 ){
                JOptionPane.showMessageDialog(null,"El número "+num+ " es par");
                par++;
            }
            else{
                JOptionPane.showMessageDialog(null,"El número "+num+ " es impar");
                impar++;
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        }
        JOptionPane.showMessageDialog(null,"Programa Finalizado");
        JOptionPane.showMessageDialog(null,"Cantidad de números par ingresados = " + par+ "\nCantidad de números impar ingresados = " + impar);
    }
}
