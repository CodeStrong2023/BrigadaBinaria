/*
Ejercicio 2: Crear y cargar una matriz de tamaño 3x3 y tranponerla y mostrarla
 */
package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio2C12 {
    public static void main(String[] args) {
        //Creo clase scanner y la matriz
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        //Le pedimos al usuario que llene la matriz
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3; j++){
                System.out.println("Ingrese la posicion de la fila ["+i+"] y la columna ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();
        //Matriz original
        System.out.println("Matriz original:");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Matriz traspuesta
        System.out.println("Matriz traspuesta:");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println(matriz[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
