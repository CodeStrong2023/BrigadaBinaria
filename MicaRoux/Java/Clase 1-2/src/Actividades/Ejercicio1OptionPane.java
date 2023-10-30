package Actividades; 
import javax.swing.JOptionPane;

public class Ejercicio1OptionPane {
    /*
    Ejercicio 1: Leer un número y mostrar su cuadrado,
    repeitr el proceso hasta que se introduzca un número negativo
    */
    public static void main(String[] args) {
        //mismo ejercicio sin clase Scanner 
        int num; 
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número ")); 
            if (num>0){
            var resultado = (int)Math.pow(num,2); 
            System.out.println("El resultado de " + num + " elevado al cuadrado es " + resultado);}
            else {
                System.out.println("El número ingresado es negativo");
            }
        } while (num >0); 
    }
}
