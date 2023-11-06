import javax.swing.JOptionPane;

public class Ejercicio04OptionPane {
/*
Ejercicio: Pedir números hasta que se teclee uno negativo 
y mostrar cuantos números se han introducido
Con la clase Scanner
 */
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "));  
        int contador = 0; 
        while (num > 0) {
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número ")); 
        }
        int cant_num = contador + 1; 
        System.out.println("La cantidad de números ingresados fue de: "+ (cant_num)); 
    }
}
