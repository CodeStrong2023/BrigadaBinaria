import javax.swing.JOptionPane;

public class Ejercicio9OptionPane {
/*
Ejercicio 9: Pedir el día, mes y año de una fecha
e indicar si la fecha es correcta. Suponiendo que todos
los meses son de 30 días 
*/
    public static void main(String[] args) {
        int day, month, year; 
        JOptionPane.showMessageDialog(null,"Ingrese una fecha completa");
        day = Integer.parseInt(JOptionPane.showInputDialog("Día")); 
        month = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Año"));
        if ((day != 0) && (day<=30)) {
            if ((month != 0)&&(month<=12)) {
                if ((year != 0)&&(year <=2022)) {
                    String message = "La fecha ingresada es: " + day + "/" + month + "/" + year;
                    JOptionPane.showMessageDialog(null, message);
                }
                else {
                    JOptionPane.showMessageDialog(null,"El año ingresado no es correcto");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"El mes ingresado no es correcto");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"El día ingresado no es coerrecto");
        }
    }
}
