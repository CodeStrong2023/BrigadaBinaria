package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {

        int edades[][] = new int[3][2]; // 3 filas 2 columnas
        System.out.println("edades = " + edades);
        edades[0][0] = 5;
        edades[0][1] = 3;
        edades[1][0] = 5;   // Llenado manual
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 7;

        System.out.println("Edades 0-0 = " + edades[0][0]);
        System.out.println("Edades 0-1 = " + edades[0][1]);
        System.out.println("Edades 1-0 = " + edades[1][0]);
        System.out.println("Edades 1-1 = " + edades[1][1]);
        System.out.println("Edades 2-0 = " + edades[2][0]);
        System.out.println("Edades 2-1 = " + edades[2][1]);

        System.out.println("Recorrer una matriz con ciclo for");
        for (int fila = 0; fila <edades.length ; fila++) {  // recorre filas
            for (int col = 0; col <edades[fila].length ; col++) {   // recorrer columnas
                System.out.println("Edades "+fila+ "-"+col+": "+edades[fila][col]);
            }
        }
        // Sintxis Clásica
        //String frutas[][] = new frutas[3][2];

        // Sintaxis Simplificada
        String frutas[][] = {{"Limon","Pomelo"},{"Ciruela","Kiwi"},{"Manzana","Banana"}};
        imprimir(frutas);
        /*
        for (int i = 0; i <frutas.length ; i++) {  // recorre filas
            for (int j = 0; j <frutas[i].length ; j++) {   // recorrer columnas
                System.out.println("Frutas "+ i + "-"+ j +": "+frutas[i][j]);
            }
        }
        */

        // Creamos una matriz de objetos
        Persona personas[][] = new Persona[2][3];
        // Asignamos valores
        personas[0][0] = new Persona("Santino");
        personas[0][1] = new Persona("Angelina");
        personas[0][2] = new Persona("Santiago");
        personas[1][0] = new Persona("Sebastian");
        personas[1][1] = new Persona("Nicolas");
        personas[1][2] = new Persona("Viviana");
        imprimir(personas);

    }
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i <matriz.length ; i++) {  // recorre filas
            for (int j = 0; j <matriz[i].length ; j++) {   // recorrer columnas
                System.out.println("Matriz "+ i + "-"+ j +": "+matriz[i][j]);
            }
        }
    }
}
