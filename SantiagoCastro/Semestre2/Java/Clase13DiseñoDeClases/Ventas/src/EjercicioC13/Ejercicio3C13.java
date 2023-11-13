/*SantiagoC
Ejercicio 3: Leer 5 elementos que se introduciran ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlos en 
el lugar adecuado en para que la tabla siga ordenada.
 */
package EjercicioC13;

import java.util.Scanner;

public class Ejercicio3C13 {
    public static void main(String[] args) {
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        int array[] = new int [10];
        boolean creciente = true;
        int numero,sitio_num = 0,j = 0;
        
        System.out.println("Ingrese 5 números de forma creciente");
        do{
            //Pedimos al usuario que ingrese de forma creciente los números
            for(int i = 0;i < 5;i++ ){
                System.out.println((i+1)+" .Ingrese un número");
                array[i] = entrada.nextInt();
            }
            //verificamos que se haya ingresado de manera creciente
            for(int i = 0;i < 4;i++){
                if (array[i]<array[i+1]){
                    creciente = true;
                }
                if(array[i]>array[i+1]){
                    creciente = false;
                    break;
                }
            }
            if (creciente == false){
                System.out.println("Ingrese los numeros de manera creciente");
            }  
        }while (creciente == false);
        
        //Le pedimos que ingrese los numeros a insertar
        System.out.println("Ingrese un número a insertar: ");
        numero = entrada.nextInt();
        
        //Posicion del número
        while(array[j]<numero && j<5){
            sitio_num++;
            j++;
        }
        
        for(int i = 4;i > sitio_num;i--){
            array[i+1] = array[i];
        }
        
        //Insertamos el número
        array[sitio_num] = numero;
        
        //Mostramos el arreglo
        for(int i = 0; i < 6;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
}
