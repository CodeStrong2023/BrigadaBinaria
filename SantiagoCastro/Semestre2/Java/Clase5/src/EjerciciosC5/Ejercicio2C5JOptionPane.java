/*
Ejercicio 2: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
suponiendo que todos los meses son de 30 días.JOptionPane
 */
package EjerciciosC5;

import javax.swing.JOptionPane;

public class Ejercicio2C5JOptionPane {
    public static void main(String[] args) {
        int dia,mes,año;
        
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));
        
        if ((dia != 0)&&(dia<=30)){
            if ((mes != 0)&&(mes <=12)){
                if ((año != 0)&&(año <=2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: "+dia+"/"+mes+"/"+año);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Año incorrecto");
                }
            
            }
            else{
                JOptionPane.showMessageDialog(null,"Mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Dia incorrecto");
        }
    }
}
