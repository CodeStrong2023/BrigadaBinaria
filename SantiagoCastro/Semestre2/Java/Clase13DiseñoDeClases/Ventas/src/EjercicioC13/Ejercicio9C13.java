/*SantiagoC
Ejercicio 9: Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben tener 0 en el centro
salvo lo de los bordes que deben ser 1. Mostrarla
 */
package EjercicioC13;

public class Ejercicio9C13 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        //Rellenamos la matriz
        System.out.println("Rellenamos la matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    matriz[i][j] = 1;
                } else if (j == 0 || j == 4) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
