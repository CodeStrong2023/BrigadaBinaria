package Ejercicios;

import javax.swing.*;

/*
Ejercicio 9: pedir el dia, mes y año de una fecha e indicar si la fecha es correcta,
su´poniendo que todos los meses son de 30 dias.
Clase JOptionPane
 */
public class Ejercicio9JOptionPane {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        if ((dia != 0) && (dia <= 30)){
            if ((mes != 0) && (mes <= 12)){
                if ((anio != 0) && (anio <= 2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es "+dia+"/"+mes+"/"+anio);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecto, Año incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecto, Mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecto, Día incorrecto");
        }
    }
}
