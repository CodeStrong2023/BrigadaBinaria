package Ejercicios;

import javax.swing.*;

/*
Ejercicio 09: pedir el dia, mes y año de una fecha e indicar si la fecha es correcta,
suponiendo que todos los meses son de 30 dias.
 */
public class Ejercicio09JOptionPane {
  public static void main(String[] args) {
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
      int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
      int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
      if ((dia != 0) && (dia <= 30)){
           if ((mes != 0) && (mes <= 12)){
                if ((anio != 0) && (anio <= 2023)){
                  JOptionPane.showMessageDialog(null,"La fecha ingresada es "+dia+"/"+mes+"/"+anio);
                }
                else{
                     JOptionPane.showMessageDialog(null,"Fecha incorrecta, Año incorrecto");
                }
            }
           else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, Mes incorrecto");
            }
        }
     else{
         JOptionPane.showMessageDialog(null,"Fecha incorrecta, Día incorrecto");
        }
    }
}
