/*
Ejercicio 2: pedir un numero y calcular su factorial
Hacerlo con las dos clases Scanner y JOptionPane.
 */
package EjercicioClase7;

import javax.swing.JOptionPane;

public class Ejercicio2C7JOptionPane {
    public static void main(String[] args) {
        long factorial = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for (int i = 1; i <= num ; i++){
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null,"\nEl factorial del numero es: "+factorial);
    }
}
