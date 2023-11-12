package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Santino");
        personas[1] = new Persona("Sebas");
        System.out.println("persona 0 = " + personas[0]);
        System.out.println("persona 1 = " + personas[1]);

        for(int i = 0; i < personas.length; i++){
            System.out.println("personas "+i+ " = " + personas[i]);
        }
        //Trabajamos con arreglos en sintaxis resumida
        String frutas[] = {"Banana","Manzana","Pera"};
        for (int i = 0; i < frutas.length ; i++) {
            System.out.println("frutas "+i+" = " + frutas[i]);
        }
    }
}
