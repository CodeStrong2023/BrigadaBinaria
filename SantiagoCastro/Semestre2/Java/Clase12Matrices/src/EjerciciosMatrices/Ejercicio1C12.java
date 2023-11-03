/*
Ejercicio 1: Debemos llenar una matriz manualmente de 3x2 y luego imprimir 
 */
package EjerciciosMatrices;

public class Ejercicio1C12 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        
        System.out.println("matriz 0-0 = " + matriz[0][0]);
        System.out.println("matriz 0-0 = " + matriz[0][1]);
        System.out.println("matriz 0-0 = " + matriz[1][0]);
        System.out.println("matriz 0-0 = " + matriz[1][1]);
        System.out.println("matriz 0-0 = " + matriz[2][0]);
        System.out.println("matriz 0-0 = " + matriz[2][1]);   
    }
}
