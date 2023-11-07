import javax.swing.JOptionPane;

public class Ejercicio10{
        //Ejercicio 10: Pedir 10 números y escribir la suma total 
    //Hacerlo con la clase Scanner y JOptionPane
    public static void main(String[] args) throws Exception {
        int i, num, suma;
        acumulador = 0; 
        JOptionPane.showMessageDialog(null,"Digite 10 números");
        for (i=1;i<=10;i++) {
           numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número: ")); 
           suma= suma + numero; 
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números es: " + suma);
    }
}
