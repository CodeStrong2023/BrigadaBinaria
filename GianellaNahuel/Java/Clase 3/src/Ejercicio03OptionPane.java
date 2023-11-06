import javax.swing.JOptionPane;

public class Ejercicio03OptionPane {
/*
    Leer números hasta que se introduzca un cero
    Para cada uno indicar si es par o impar
    Con clase JOptionPane     
*/ 
    public static void main(String[] args) { 
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "));  
        while (numero != 0){
            if (numero % 2 == 0) {
                System.out.println("El número ingresado es par");
            }
            else {
                System.out.println("El número ingresado es impar");
            }
            System.out.println("Digite otro número");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número ")); 
        }
    }
}
