package pasoPorReferencia;

import clasesObjetos.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); 
        persona1.nombre = "Angi"; 
        System.out.println("persona1 = " + persona1.nombre);
        cambiarValor(persona1); 
        System.out.println("El cambio en el nombre es: " + persona1.nombre); //si agreagmos.nombre muestra el cambio de nombre
    }
    public static void cambiarValor(Persona persona2) { //parámetro por referencia
        persona2.nombre = "Martina"; //nos muestra la dirección de memoria heap
    }
}
