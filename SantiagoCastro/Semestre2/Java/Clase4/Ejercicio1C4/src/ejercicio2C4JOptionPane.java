
import javax.swing.JOptionPane;

/*
 Ejercicio 2: pedir numeros hasta que se introduzca uno negativo y calcular la media.
 */

public class ejercicio2C4JOptionPane {
    public static void main(String[] args) {
        
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        
        JOptionPane.showConfirmDialog(null,"Si ingresa un numero negativo el ciclo termina");
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        while(numero >= 0) {
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
            
        } 
        if (conteo == 0) {
            JOptionPane.showConfirmDialog(null,"Error.La division entre 0 no existe");
        }
        else {
            promedio = (float)suma/conteo;
            JOptionPane.showConfirmDialog(null, "El promedio es: "+promedio);
        }
        
    }
}
