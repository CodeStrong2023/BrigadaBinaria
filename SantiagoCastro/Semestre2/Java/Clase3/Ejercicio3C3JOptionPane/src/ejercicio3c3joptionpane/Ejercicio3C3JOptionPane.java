/*
Ejercicio 3: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0 y 100,
y luego ir pidiendo número indicando si "es mayor" o "es menor" según sea mayor o menor con respecto a N. 
El proceso termina cuadno el usuario acierte y mostramos el número de intentos hechos
*/
package ejercicio3c3joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio3C3JOptionPane {

    public static void main(String[] args) {
        int intento = 0,numero, aleatorio;
     aleatorio = (int)(Math.random()*100); //Genera un número aleatorio
     
     System.out.println("ADIVINE EL NÚMERO");
     do{
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
         if (aleatorio > numero){
             JOptionPane.showInputDialog(null,"El número es mayor");
         }
         else if (aleatorio < numero){
             JOptionPane.showInputDialog(null,"El número es menor");
         }
         else{
             JOptionPane.showInputDialog(null,"!FELICIDADES ACERTASTE EL NÚMERO¡");
         }
         intento++;
         JOptionPane.showInputDialog(null,"Números de intentos: "+intento);
     }while(numero != aleatorio);
     
        JOptionPane.showInputDialog(null,"Acertaste, el numero era: "+aleatorio+", tuviste "+intento+" intentos");
    
    } 
}
