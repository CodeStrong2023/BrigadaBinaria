package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        //Una matriz es un arreglo de arreglos
        //fila - columna 
        int edades[][] = new int[3][2]; //no se pueden agregar más elementos de manera dinámica 
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 17;
        edades[1][0] = 12;
        edades[1][1] = 83;
        edades[2][0] = 6;
        edades[2][1] = 32;
        //Mostramos la matriz 
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]); 
        System.out.println("edades 2-1 = " + edades[2][1]);

        System.out.println("\nMATRIZ CON CICLO FOR");
        //Recorremos la matriz por medio de un ciclo for 
        for(int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++){
            System.out.println("Edades " + fila +"-" + col +": " + edades[fila][col]);
            }
        }
        //Sintaxis clásica
        //String frutas[][] = new String[3][2];

        //Sintaxis simplificada 
        String frutas[][] = {{"Limón", "Naranja"},{"Tomate", "Kiwi"},{"Banana","Manzana"}};
        System.out.println("\nFRUTAS");
        imprimir(frutas); 
        /*for(int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++){
            System.out.println("Frutas " + i +"-" + j +": " + frutas[i][j]);
            }
        }*/
        //Se crea una matriz de objetos
        Persona personas[][] = new Persona[2][3]; 
        //Se le asignan valores 
        personas[0][0] = new Persona("Angelina"); 
        personas[0][1] = new Persona("Juan");
        personas[0][2] = new Persona("Pablo");
        personas[1][0] = new Persona("Alicia");
        personas[1][1] = new Persona("María");
        personas[1][2] = new Persona("Antonio");
        System.out.println("\nPERSONAS");
        imprimir(personas);
    }

        //Imprimimos los nombres de las personas
    public static void imprimir(Object matriz[][]){
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
            System.out.println("Matriz " + i +"-" + j +": " + matriz[i][j]);
            }
        }
    }
}