import javax.swing.JOptionPane;

public class Ejercicio6OptionPane {
/* Ejercicio 6: Pedir números hasta que se teclee 0, 
mostrar la suma de todos los números introducidos
 */
    public static void main(String[] args) {
        int numero, suma; 
        suma = 0; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (numero != 0){
            suma = suma + numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número")); 
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números es de: " + suma);
    }
}
