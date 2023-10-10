package Ejercicios;

import javax.swing.*;

public class Ejercicio5_2 {
    public static void main(String[] args) {

        /*      Lo hacemos con clase JOptionPane
        Ejercicio 5: realizar un juego para adivinar un número, para ello generar un número aleatorio
        entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun el N aleatorio,
        el juego termina cuando el usuario acierta y mostramos los intentos realizados.
         */
       
        int num,intentos, aleatorio;
        intentos=0;
        aleatorio= (int)(Math.random()*100);    //Generamos el número aleatorio

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (num < aleatorio){
                JOptionPane.showMessageDialog(null,"Digite un número mayor");
            }
            else if (num > aleatorio) {
                JOptionPane.showMessageDialog(null,"Digite un número menor");
            }
            intentos++;
        }while (num != aleatorio);
        {
            JOptionPane.showMessageDialog(null, "Felicidades!!! Has adivinado el número"+"\nAdivinaste el número en "+intentos+ " intentos");
        }
    }
}
