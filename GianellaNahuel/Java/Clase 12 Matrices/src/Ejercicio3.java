Package matriz_ejercicios;
import java.util.Scanner; 

public class EjerciciosMatrices {
    public static void main(String[] args) {

     //Ejercicio  3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
        Scanner transpuesta = new Scanner(System.in); 
        int matriz[][] = new int [3][3]; 
        System.out.println("rellenar la matriz");
        for (int i=0 ;i<3 ;i++) {
            for (int j=0 ;j<3 ;j++) {
                matriz[i][j] = transpuesta.nextInt();
            }
        }
        System.out.print("\nMATRIZ ORIGINAL\n");
    for (int i=0 ;i<3 ;i++){
        for (int j=0 ;j<3 ;j++) {
        System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Matriz transpuesta
    System.out.print("\nMATRIZ TRANSPUESTA\n");
    for (int i=0 ;i<3 ;i++){
        for (int j=0 ;j<3 ;j++) {
        System.out.print(matriz[j][i]+" ");
        }
        System.out.println();
    }
