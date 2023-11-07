import javax.swing.JOptionPane;

public class Ejercicio07OptionPane {
/* Ejercicio 07: Pedir numeros hasta que se introduzca uno negativo
y calcular la media
*/
    public static void main(String[] args) {
        int num, contador = 0; 
        double suma = 0, media = 0; 
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero")); 
        while (num >0) {
            contador ++; 
            suma += num;
            media = (suma/contador); 
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));  
        }
        JOptionPane.showMessageDialog(null, "La media es: " + media);
    }
}



