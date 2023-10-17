
import javax.swing.JOptionPane;

/*
Ejejrcicio 1: Pedir números hasta que se teclee 0,
mostrar la suma de todos los numeros introducidos. Con JOptionPane
 */

public class ejercicio1C4JOptionPane {
    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null,"SUMA DE NUMEROS, si ingresa 0 el ciclo termina");
        
        int numero, suma = 0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            suma += numero;
        } while(numero != 0);
        
        JOptionPane.showConfirmDialog(null,"La suma de los numeros es de "+suma);
    }
}
