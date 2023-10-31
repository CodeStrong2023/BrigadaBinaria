package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3]; //no se pueden agregar más elementos de manera dinámica 
        System.out.println("edades = " + edades);

        edades[0] = 18; 
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 43; 
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 32; 
        System.out.println("edades 2 = " + edades[2]);

        //edades[3] = 8; Fuera de rango, es un error en tiempo de ejecución

        //Iteración del arreglo 
        for(int i = 0; i < edades.length; i++) {
            System.out.println("Edad y su elemento " + i +": " + edades[i]);
        }
    }
}