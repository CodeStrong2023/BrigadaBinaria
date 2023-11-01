package ejercicios;
import java.util.Scanner; 

public class Ejercicios {
    public static void main(String[] args) {
    /*
     * Ejercicio  1: Leer 5 números, guardarlos en un arreglo
     * y mostrarlos en el mismo orden introducidos 
     */
        Scanner numsOrden = new Scanner(System.in); 
        int numeros[] = new int[5]; 
        // Le pedimos al usuario ingresar 5 números y guardarlos en el arreglo
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = numsOrden.nextInt();
        }
        // Mostramos los números en el mismo orden en el que fueron introducidos
        for(int i = 0; i < numeros.length; i++) {
           System.out.println("numeros "+ i +" = " + numeros[i]);
        }

     /*
     * Ejercicio  2: Leer 5 números, guardarlos en un arreglo
     * y mostrarlos en el orden inverso al introducido
     */
        Scanner numsInv = new Scanner(System.in);
        int numeros2[] = new int[5]; 
        // Le pedimos al usuario ingresar 5 números 
        for(int i = 0; i < numeros2.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros2[i] = numsInv.nextInt();
        }
        // Mostramos los números en el orden inverso al introducido
        for(int i = numeros2.length - 1; i>= 0; i--) {
           System.out.println("numeros "+ i +" = " + numeros2[i]);
        }

     /*
     * Ejercicio  3: Leer 5 números por teclado, almacenarlos en 
     * un arreglo y a contuniación realizar la media de los 
     * números positivos, la media de los negativos y 
     * contar el número de ceros
     */
        Scanner media = new Scanner(System.in);
        int numeros3[] = new int[5]; 
        // Le pedimos al usuario ingresar 5 números 
        for(int i = 0; i < numeros3.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros3[i] = media.nextInt();
        }
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
    // Calculamos la media de números positivos, media de negativos y contar ceros
            for (int numero : numeros3) {
                if (numero > 0) {
                    sumaPositivos += numero;
                    cantidadPositivos++;
                } else if (numero < 0) {
                    sumaNegativos += numero;
                    cantidadNegativos++;
                } else {
                    cantidadCeros++;
                }
            }
        // Sacamos las medias 
        double mediaPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos / cantidadNegativos : 0;
        
        // Mostramos los resultados
        System.out.println("Media de números positivos: " + mediaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);
    }
}