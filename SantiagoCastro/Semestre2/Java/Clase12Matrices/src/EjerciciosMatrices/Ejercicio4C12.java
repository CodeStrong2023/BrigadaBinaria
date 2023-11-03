/*
 Ejercicio 4:Crear y cargar una matriz de tamaño N x M, mostrar la fila de cada 
fila y cada columna
 */
package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio4C12 {
    public static void main(String[] args) {
        //Se crea entrada y se crean variables tipo enteras sin valores
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColumnas,sumaFilas,sumaColumnas;
        int posFila,posColumna;
        //Se piden filas y columnas 
        System.out.println("Ingrese el numero de filas: ");
        nFilas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        nColumnas = entrada.nextInt();
        //Se asigna el tamaño de la matriz
        matriz = new int [nFilas][nColumnas];
        int filas[] = new int [nFilas];
        int columnas[] = new int [nColumnas];
        //Se ingresan los valores a la matriz
        System.out.println("Ingrese los valores a la matriz: ");
        for (int i = 0;i < nFilas;i++){
            for (int j = 0;j < nColumnas; j++){
                System.out.println("Ingrese la posicion de la fila ["+i+"] y la columna ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Muestro Matriz original
        System.out.println("Matriz original:");
        for(int i = 0;i < nFilas;i++){
            for(int j = 0;j < nColumnas;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Suma de filas
        posFila=0;
        for (int i = 0; i < nFilas; i++){
            sumaFilas = 0;
            for (int j = 0; j<nColumnas; j++){
                sumaFilas += matriz [i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
        //Suma de columnas
        posColumna=0;
        for (int j = 0; j < nColumnas; j++){
            sumaColumnas = 0;
            for (int i = 0; i<nFilas; i++){
                sumaColumnas += matriz[i][j];
            }
            columnas[posColumna] = sumaColumnas;
            posColumna++;
        }  
        
        System.out.println("\nLa suma de las filas es: ");
        for (int i= 0;i < nFilas;i++){
            System.out.println(filas[i]+" - ");
        }
        System.out.println("\nLa suma de las columnas es: ");
        for (int j= 0;j < nColumnas;j++){
            System.out.println(columnas[j]+" - ");
        }
        
    }
}
