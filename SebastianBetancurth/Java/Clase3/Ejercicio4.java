/* Ejercicio 4: Pedir número hsata que se teclee uno negativo,
y mostrar cuantos números se han introducido.
Primero lo haremos con la clase Scanner
Luego con la clase JOptionPane */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        int conteo = 0;
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresado "+conteo+" números que no son negativos");
    }
