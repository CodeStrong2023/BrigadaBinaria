import java.util.Scanner;

public class Ejercicio10 {
    //Ejercicio 10: Pedir 10 números y escribir la suma total 
    //Hacerlo con la clase Scanner y JOptionPane
    public static void main(String[] args) throws Exception {
        Scanner numeros = new Scanner(System.in);
        int i, num, acumulador;
        acumulador = 0; 
        System.out.println("Digite 10 núemeros");
        for (i=1;i<=10;i++) {
            System.out.println("Digite un número");
            numero  = numeros.nextInt(); 
            suma= suma + num; 
        }
        System.out.println("La suma de todos los números ingresados es de: " + suma);
        numeros.close(); 
    }
}
