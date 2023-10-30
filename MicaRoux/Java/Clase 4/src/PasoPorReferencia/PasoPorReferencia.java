package pasoPorReferencia;

import clasesObjetos.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); 
        persona1.nombre = "Angi"; 
        System.out.println("persona1 = " + persona1.nombre);
        cambiarValor(persona1); 
        System.out.println("El cambio en el nombre es: " + persona1.nombre); //si agreagmos.nombre muestra el cambio de nombre
        Persona persona = new Persona(); 
        //Persona persona = null; Esto muestra que el valor del objeto es inválido 
        persona = cambiarElValor(persona); 
        System.out.println("El nuevo valor del objeto es: " + persona.nombre);
    }
    public static void cambiarValor(Persona persona2) { //parámetro por referencia
        persona2.nombre = "Martina"; //nos muestra la dirección de memoria heap
    }
    //PALABRAS RETURN Y NULL
    public static Persona cambiarElValor(Persona persona2) {
        if (persona2 == null) {
            System.out.println("Valor de persona2 inválido: Null");
            return null; 
        }
        else {
        persona2.nombre = "Rosa"; 
        return persona2; 
        }
    }
}
