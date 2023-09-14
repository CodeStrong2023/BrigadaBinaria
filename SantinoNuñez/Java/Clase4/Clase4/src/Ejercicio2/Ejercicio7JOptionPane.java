package Ejercicio2;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio7JOptionPane {
    public static void main(String[] args) {
        // Ejercicio 7: pedir números hasta que se introduzca uno negativo y calcular la media

        int numero, suma = 0, conteo =0;
        float promedio = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (numero >= 0){
            suma = numero+suma;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
            conteo++;
        }

        if(conteo == 0){
            JOptionPane.showMessageDialog(null, "La divicion entre cero no es posible");
        }
        else{
            promedio = (float) suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        }
    }
}