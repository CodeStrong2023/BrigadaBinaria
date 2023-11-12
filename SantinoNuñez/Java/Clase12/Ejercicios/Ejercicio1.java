package Ejercicios;
// Ejercicio1: Matriz Transpuesta
// Crear y cargar una matriz de 3x3, trasponerla y mostrarla
public class Ejercicio1 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        // Cargamos manualmente
        matriz[0][0] = 3;
        matriz[0][1] = 7;
        matriz[0][2] = 2;
        matriz[1][0] = 5;
        matriz[1][1] = 1;
        matriz[1][2] = 9;
        matriz[2][0] = 4;
        matriz[2][1] = 7;
        matriz[2][2] = 3;

        System.out.println("Matriz original");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matriz Transpuesta");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[col][fila] + " ");
            }
            System.out.println("");
        }
    }
}