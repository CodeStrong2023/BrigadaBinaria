package Ejercicios;
// Ejercicio5: Matriz sumando filas y columnas
// Crear una matriz de nxm y mostrar la suma de cada fila y columna
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int nFilas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int nCol = entrada.nextInt();

        int matriz[][] = new int[100][100];

        // Rellenamos la matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz ["+i+"] ["+j+"] = ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        // Mostramos la matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        // Sumamos filas
        for (int i = 0; i < nFilas; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFilas);
        }

        // Sumamos columnas
        for (int j = 0; j < nCol; j++) {
            int sumaColumnas = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColumnas += matriz[j][i];
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumnas);
        }
    }
}
