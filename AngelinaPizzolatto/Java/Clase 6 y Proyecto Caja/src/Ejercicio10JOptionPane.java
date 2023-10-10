import javax.swing.JOptionPane;

public class Ejercicio10JOptionPane {
        //Ejercicio 10: Pedir 10 números y escribir la suma total 
    //Hacerlo con la clase Scanner y JOptionPane
    public static void main(String[] args) throws Exception {
        //Clase Scanner 
        int i, num, acumulador;
        acumulador = 0; 
        JOptionPane.showMessageDialog(null,"Ingrese 10 números");
        for (i=1;i<=10;i++) {
           num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: ")); 
            acumulador= acumulador + num; 
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números ingresados es de: " + acumulador);
    }
}

