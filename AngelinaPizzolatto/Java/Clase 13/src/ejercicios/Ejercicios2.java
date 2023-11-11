package ejercicios;
import java.util.Scanner;

    //EJERCICIOS DEL 6 AL 9
public class Ejercicios2 {
    public static void main(String[] args) {
        /* Ejercicio 6: Leer dos series de 10 enteros, que estarán ordenados crecientemente
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados
 */
        Scanner ejer6 = new Scanner(System.in);
        //Tablas
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];

        System.out.println("Ingrese 10 números enteros ordenados");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            tabla1[i] = ejer6.nextInt();
        }
        //Segunda serie de números ordenados
        System.out.println("Ingrese la segunda serie de 10 enteros ordenados:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            tabla2[i] = ejer6.nextInt();
        }

        //Tercera tabla para fusionar las dos primeras
        int[] tablaFusionada = new int[20];

        int indiceTabla1 = 0;
        int indiceTabla2 = 0;
        int indiceFusionada = 0;

        //Bucle para fusionar
        while (indiceFusionada < 20) {
            if (indiceTabla1 < 10 && (indiceTabla2 == 10 || tabla1[indiceTabla1] < tabla2[indiceTabla2])) {
                tablaFusionada[indiceFusionada++] = tabla1[indiceTabla1++];
            } else {
                tablaFusionada[indiceFusionada++] = tabla2[indiceTabla2++];
            }
        }
        //Tabla final 
        System.out.println("Tabla fusionada:");
        for (int i = 0; i < 20; i++) {
            System.out.print(tablaFusionada[i] + " ");
        }
        System.out.println();

/* Ejercicio 7: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la 
 * tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje
 */
        Scanner ejer7 = new Scanner(System.in);
        //Tabla de tamaño 10 
        int[] tabla_ejer7 = new int[10];

        //El usuario ingresa 10 números enteros 
        System.out.println("Ingrese 10 enteros ordenados crecientemente:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            tabla_ejer7[i] = ejer7.nextInt();
        }
        System.out.print("Ingrese el número a buscar (N): ");
        int num = ejer7.nextInt();

        //Buscamos a num en la tabla 
        int posicion = -1;
        for (int i = 0; i < 10; i++) {
            if (tabla_ejer7[i] == num) {
                posicion = i;
                break;
            } else if (tabla_ejer7[i] > num) {
                break; 
            }
        }
        if (posicion != -1) {
            System.out.println("El número " + num + " se encuentra en la posición " + posicion + " de la tabla.");
        } else {
            System.out.println("El número " + num + " no se encuentra en la tabla.");
        }

/* Ejercicio 8: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera 
 * y transponerla en la segunda
 */
        Scanner ejer8 = new Scanner(System.in);
        //Declaramos la matrices de tamaño 5x9 y 9x5
        int[][] matriz1 = new int[5][9];
        int[][] matriz2 = new int[9][5];

        //El usuario ingresa elementos para la primera matriz
        System.out.println("Ingrese elementos para la primera matriz (5x9):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Ingrese el elemento en la posición (" + (i + 1) + ", " + (j + 1) + "): ");
                matriz1[i][j] = ejer8.nextInt();
            }
        }
        //Trasponemos la primera matriz a la segunda
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        //Mostramos la primera matriz
        System.out.println("Primera matriz (5x9):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        // Mostrar matriz transpuesta 
        System.out.println("Segunda matriz (9x5):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

/* Ejercicio 9: Crear una matriz "marco" de tamaño 5x5: todos sus elementos  
 * deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla
 */
        int[][] matrizMarco = new int[5][5];
        // Llenamos la matriz con 1 en los bordes y 0 en el interior
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    matrizMarco[i][j] = 1;
                } else {
                    matrizMarco[i][j] = 0;
                }
            }
        }
        // Mostramos la matriz
        System.out.println("MATRIZ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizMarco[i][j] + " ");
            }
            System.out.println();
        }
    }
}