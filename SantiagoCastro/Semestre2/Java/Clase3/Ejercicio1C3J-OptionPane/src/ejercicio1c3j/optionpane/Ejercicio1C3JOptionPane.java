    /*
    Ejercicio 1: Leer numeors hasta que se introduzca un cero.
    Para cada uno indicar si es par o impar.
    Primero lo haremos con la clase Scanner
    Luego con la clase JOptionPane 
    */
package ejercicio1c3j.optionpane;

import javax.swing.JOptionPane;

public class Ejercicio1C3JOptionPane {

    public static void main(String[] args) {

        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        
        while (numero != 0){
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
            } else {
                System.out.println("El numeor " + numero + " es impar");
            }
            System.out.println("Ingrese otro numero");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
        }
        System.out.println("SALISTE DEL CICLO");
        
    }
    
}
