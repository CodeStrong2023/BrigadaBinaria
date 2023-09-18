import javax.swing.JOptionPane;

public class Ejercicio8OptionPane {
    //Pedir un número N y mostrar todos los números del 1 al N
    public static void main(String[] args) {
        int i, numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un número"));
        for (i= 0; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}