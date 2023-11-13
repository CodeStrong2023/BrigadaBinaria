/*SantiagoC
Ejercicio 8: Utilizamos dos matrices de tamaños 5x9 y 9x5, cargar la primera y transponerla en la segunda.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio8C13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1 [][] = new int [5][9];
        int matriz2 [][] = new int [9][5]; 
        
        System.out.println("Digite la matriz 1: ");
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 9;j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Digite la matriz 2: ");
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 9;j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        
        //Se muestra la matriz original
        System.out.println("\nMatriz original:");
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 9;j++){
                System.out.println(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Transponemos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
