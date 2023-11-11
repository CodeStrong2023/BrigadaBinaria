package ejercicios;
import java.util.Scanner;

    //EJERCICIOS DEL 1 AL 5
public class Ejercicios1 {
    public static void main(String[] args) {
/* Ejercicio 1: Leer 10 números enteros, guardarlos en un
arreglo. Debemos mostrarlos en el siguiente orden: el primero,
el último, el segundo, el penúltimo, el tercero, etc.
*/
    Scanner ejer1 = new Scanner(System.in);
    // Declarar un arreglo para almacenar los números
    int[] numeros = new int[10];
    // Leer 10 números enteros y guardarlos en el arreglo
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numeros[i] = ejer1.nextInt();
    }
    // Mostrar los números en el orden especificado
    System.out.println("Mostrando los números en el orden deseado:");
    for (int i = 0, j = 9; i <= j; i++, j--) {
        System.out.println(numeros[i]); //Se muestra el primero y así sucesivamente
        if (i != j) { //se verifica que no sea el mismo
            System.out.println(numeros[j]); //Se muestra el último y así sucesivamente
            }
        }

/* Ejercicio 2: Leer por teclado dos tablas de 10 números
 * enteros y mezclarlas en una tercera de la forma: el 1° de 
 * A, el 1° de B, el 2° de A, el 2° de B, etc.
 */
    Scanner ejer2 = new Scanner(System.in);
    //Declaramso dos arreglos para almacenar los números en las dos tablas 
    int[] tablaA = new int[10];
    int[] tablaB = new int[10];
    //Le pedimos al usuario ingresar los 10 números para la primera tabla
        System.out.println("Ingrese la primera tabla de 10 números enteros:");
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese el número #" + (i + 1) + ": ");
        tablaA[i] = ejer2.nextInt();
        }
    //Los 10 números para la segunda tabla 
    System.out.println("Ingrese la segunda tabla de 10 números enteros:");
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese el número" + (i + 1) + ": ");
        tablaB[i] = ejer2.nextInt();
        }
    //Creamos la tercera tabla para almacenar las anteriores
    int[] tablaC = new int[20];
    int iterador = 0;

    for (int i = 0; i < 10; i++) {
        //Se agrega el primer elemento de la tabla A
        tablaC[iterador++] = tablaA[i];
        //y el primero de la tabla B
        tablaC[iterador++] = tablaB[i];
        }
    //Mostramos la tabla final 
    System.out.println("La tabla resultante después de mezclar las dos tablas:");
    for (int i = 0; i < 20; i++) {
        System.out.println(tablaC[i]);
        }

/* Ejercicio 3: Leer 5 elementos numéricos que se introducirán ordenados de forma
 * creciente. Estos los guardaremos en una tabla de tamaño 10. Leer un número N
 * e insertarlo en el lugar adecuado para que la tabla continúe ordenada
 */

        Scanner ejer3 = new Scanner(System.in);
        // Declaramos una tabla de tamaño 10
        int[] tabla = new int[10];

        //Le pedimos al usuario ingresar 5 números de manera creciente
        System.out.println("Ingrese 5 números ordenados de forma creciente:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            tabla[i] = ejer3.nextInt();
        }
    
        //Le pedimos ingresar otro número para insertarlo 
        System.out.print("Ingrese un número para insertar en la tabla: ");
        int numeroN = ejer3.nextInt();

        //Definimos variable para guardar el lugar en el que se debe almacenar el número
        int indiceInsercion = 0;
        //Creamos un bucle while para encontrar el lugar en el que debe ir el número
        while (indiceInsercion < 10 && tabla[indiceInsercion] < numeroN) {
            indiceInsercion++;
        }

        //Movemos los demás números para acomodar el nuevo 
        for (int i = 9; i > indiceInsercion; i--) {
            tabla[i] = tabla[i - 1];
        }
        //Insertamos el nuevo número 
        tabla[indiceInsercion] = numeroN;

        //Mostramos la tabla final 
        System.out.println("TABLA FINAL:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

/* Ejercicio 4: Leer por teclado una tabla de 10 elementos numéricos enteros 
 * y una posición (entre 0 y 9). Eliminar el elemento situado en la posición 
 * dada sin dejar huecos
 */
        Scanner ejer4 = new Scanner(System.in);
        int[] tabla_ejer4 = new int[10];

        //El usuario ingresa los 10 números
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            tabla_ejer4[i] = ejer4.nextInt();
        }

        //Pedirle al usuario la posición a eliminar (entre 0 y 9)
        System.out.print("Ingrese una posición a eliminar (entre 0 y 9): ");
        int posicionEliminar = ejer4.nextInt();

        if (posicionEliminar >= 0 && posicionEliminar < 10) { //Verificamos que la posición se encuentre dentro del rango
            //Eliminamos el elemento 
            for (int i = posicionEliminar; i < 9; i++) {
                tabla_ejer4[i] = tabla_ejer4[i + 1];
            }
            tabla_ejer4[9] = 0; //le asignamos un 0 al índice final para no repetir valores
            // Mostramos la tabla final 
            System.out.println("TABLA FINAL:");
            for (int i = 0; i < 9; i++) {
                System.out.print(tabla_ejer4[i] + " ");
            }
            System.out.println(tabla_ejer4[9]);
        } else {
            System.out.println("Posición inválida. Debe estar entre 0 y 9.");
        }

/* Ejercicio 5: Leer 10 enteros en una tabla. Guardar en otra tabla los
 * elementos pares de la primera y a continuación los elementos impares
 */
        Scanner ejer5 = new Scanner(System.in);
        //Declaramos la primera tabla de tamaño 10
        int[] tabla_ejer5 = new int[10];

        //Le pedimos al usuario ingresar los números
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            tabla_ejer5[i] = ejer5.nextInt();
        }
        //Tablas para almacenar los números pares e impares
        int[] pares = new int[10];
        int[] impares = new int[10];
        //Contadores para los números
        int contadorPares = 0;
        int contadorImpares = 0;

        //Con un bucle y un condicional separamos los valores y los guardamos en tablas distintas
        for (int i = 0; i < 10; i++) {
            if (tabla_ejer5[i] % 2 == 0) {
                pares[contadorPares++] = tabla_ejer5[i];
            } else {
                impares[contadorImpares++] = tabla_ejer5[i];
            }
        }
        // Mostrar la tabla de elementos pares
        System.out.println("Elementos pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        // Mostrar la tabla de elementos impares
        System.out.println("Elementos impares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}