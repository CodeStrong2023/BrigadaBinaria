package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {

         /*
        Ejercicio 4: pedir un número hasta que se teclee uno negativo,
        y mostrar cuantos números se han introducido.
        Lo hacemos solo con JOptionPane
        */

        int num, contador;
        contador=0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (num >=0){
            System.out.println("Ingrese un número");
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            contador++;
        }
        JOptionPane.showMessageDialog(null,"Programa finalizado");
        JOptionPane.showMessageDialog(null, "La cantidad de número ingresados es: "+contador);

    }
}
