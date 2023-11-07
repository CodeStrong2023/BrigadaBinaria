import javax.swing.JOptionPane;

public class Ejercicio05OptionPane {
/*
Ejercicio05: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o
"es menor" según respecta a N 
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos

Con clase Option Pane 
 */
    public static void main(String[] args) {
        System.out.println("JUEGO PARA ADIVINAR NÚMEROS");
        int num, num_aleatorio, contador = 0; 
        num_aleatorio = (int)(Math.random()*100);  
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "));
        while (num != num_aleatorio) {
            contador++;  
            if (num>num_aleatorio) {
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor");
            }
            else if (num<num_aleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es menor");
            }
            else {
                JOptionPane.showMessageDialog(null, "Felicidades, adivinó el número");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número ")); 
        } 
        System.out.println("La cantidad de intentos fue de " + contador + " y su número era el " + num_aleatorio);
    }
}
