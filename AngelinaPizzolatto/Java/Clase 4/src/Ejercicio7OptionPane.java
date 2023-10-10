import javax.swing.JOptionPane;

public class Ejercicio7OptionPane {
/* Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media
*/
    public static void main(String[] args) {
        int num, contador = 0; 
        double suma = 0, media = 0; 
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número")); 
        while (num >0) {
            contador ++; 
            suma += num;
            media = (suma/contador); 
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número"));  
        }
        JOptionPane.showMessageDialog(null, "La media es: " + media);
    }
}