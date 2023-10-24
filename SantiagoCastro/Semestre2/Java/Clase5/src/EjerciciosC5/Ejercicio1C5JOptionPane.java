/*
Ejercicio 1: Pedir un número N y mostrar todos los numeros del 1 al N. JOptionPane
 */
package EjerciciosC5;

import javax.swing.JOptionPane;

public class Ejercicio1C5JOptionPane {
    public static void main(String[] args) {
        
        int numero;
        int itinerante = 0;
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        JOptionPane.showMessageDialog(null,"A continuacion se mostrarán lós numeros del 1 hasta "+numero);
        
        do{
            itinerante++;
            JOptionPane.showMessageDialog(null,itinerante);
        }while (itinerante != numero);
        
        JOptionPane.showMessageDialog(null, "Ciclo finalizado, ya se mostraron todos los numeros");
    }
}
