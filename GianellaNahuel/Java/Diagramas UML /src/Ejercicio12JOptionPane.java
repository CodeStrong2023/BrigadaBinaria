import javax.swing.JOptionPane;
/*
 * Pedir un número y calcular su factorial 
 * Hacerlo con las dos clases, Scanner y JOptionPane
 */
public class Ejercicio12JOptionPane {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para obtener su factorial")); 
        int i = 1, fact = 1; 
        while (i<=numero) {
            fact = fact *i;
            i++; 
        }
        JOptionPane.showMessageDialog(null, "El factorial del numero " + numero + " es " + fact);
    }
}

