import javax.swing.JOptionPane;

public class Ejercicio4OptionPane {
/*
Ejercicio: Pedir números hasta que se teclee uno negativo 
y mostrar cuantos números se han introducido
Con clase Scanner
 */
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número "));  
        int contador = 0; 
        while (num > 0) {
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número ")); 
        }
        int cant_num = contador + 1; 
        System.out.println("La cantidad de números ingresados fue de: "+ (cant_num)); 
    }
}
