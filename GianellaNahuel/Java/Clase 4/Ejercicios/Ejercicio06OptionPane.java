import javax.swing.JOptionPane;

public class Ejercicio06OptionPane {
/* Ejercicio 06: Pedir números hasta que se teclee 0, 
mostrar la suma de todos los números introducidos
 */
    public static void main(String[] args) {
        int numero, suma; 
        suma = 0; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while (numero != 0){
            suma = suma + numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero")); 
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros es de: " + suma);
    }
}
