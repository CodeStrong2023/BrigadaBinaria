package ejercicios;
import java.util.Scanner; 

public class EjerciciosMatrices {
    public static void main(String[] args) {

     //Ejercicio  3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
        Scanner transpuesta = new Scanner(System.in); 
        int matriz[][] = new int [3][3]; 
        System.out.println("Ingrese los valores para la matriz");
        for (int i=0 ;i<3 ;i++) {
            for (int j=0 ;j<3 ;j++) {
                matriz[i][j] = transpuesta.nextInt();
            }
        }
    //Mostramos la matriz tal cual 
    System.out.print("\nMATRIZ ORIGINAL\n");
    for (int i=0 ;i<3 ;i++){
        for (int j=0 ;j<3 ;j++) {
        System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Mostramos la matriz transpuesta
    System.out.print("\nMATRIZ TRANSPUESTA\n");
    for (int i=0 ;i<3 ;i++){
        for (int j=0 ;j<3 ;j++) {
        System.out.print(matriz[j][i]+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Ejercicio  4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los 
    //elementos pares estén en la diagonal principal sean 1 y el resto 0
        Scanner diagonal = new Scanner(System.in); 
        int matriz2[][] = new int[7][7]; 
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i == j) {
                    matriz2[i][j] = 1;
                }
                else{
                    matriz2[i][j] = 0;
                }
            }
        }
    //Mostramos la matriz 
    System.out.print("\nMATRIZ CON SU DIAGONAL DE 1\n");
    for (int i=0 ;i<7 ;i++){
        for (int j=0 ;j<7 ;j++) {
            System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    //Ejercicio  5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
    //de cada fila y cada columna
    Scanner suma = new Scanner(System.in);

        // Ingresar las dimensiones de la matriz (n x m)
        System.out.print("Ingrese el número de filas (n): ");
        int n = suma.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = suma.nextInt();
        int[][] matriz3 = new int[n][m];

        // El usuario carga la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz3[i][j] = suma.nextInt();
            }
        }
        //Imprimimos la matriz
        System.out.println("\nMatriz ingresada");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Calculamos la suma de cada fila
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
        // Calculamos la suma de cada columna
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }

    }
}
