package test;
import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Angi"); 
        personas[1] = new Persona("Rocío");

        System.out.println("personas 0 = " + personas[0]); //muestra la dirección de memoria de los objetos
        System.out.println("personas 1 = " + personas[1]);
        for(int i = 0; i< personas.length; i++) {
            System.out.println("personas "+ i +" = " + personas[i]); 
        }

        //Sintaxis resumida para trabajar con arreglos
        String frutas[] = {"Pera", "Manzana", "Naranja", "Durazno"}; 
        for(int i = 0; i< frutas.length; i++) {
           System.out.println("frutas "+ i +" = " + frutas[i]);
        }
    }
}
