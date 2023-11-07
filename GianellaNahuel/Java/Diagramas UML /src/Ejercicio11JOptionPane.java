import javax.swing.JOptionPane;

public class Ejercicio11JOptionPane {
    /*
     * Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares
     * Hacerlo con JOptionPane
     */
    public static void main(String[] args) throws Exception {
        var producto = 1; 
        for (int i=1; i<=20; i++) {
            if (i%2 != 0) {
            producto*=i;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto de los primeros 10 números pares es de: " + producto);
    }
}
