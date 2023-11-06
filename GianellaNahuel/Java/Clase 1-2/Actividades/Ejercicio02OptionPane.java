package Ejercicios; 
import javax.swing.JOptionPane;

public class Ejercicio02OptionPane {
    public static void main(String[] args) {
        //mismo ejercicio sin clase Scanner 
        int num; 
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número sin coma")); 
        while (num != 0) {
            if (num<0) {
                System.out.println("El número ingresado es negativo");
            } 
            else if (num>0) {
                System.out.println("El número ingresado es positivo");
            }
            else {
                System.out.println("El número ingresado es 0");
                break; 
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número ")); 
        }
    }
}

