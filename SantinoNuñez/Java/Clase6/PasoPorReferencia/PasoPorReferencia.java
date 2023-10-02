package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        // Llamamos a la clase
        Persona persona1 = new Persona();
        // Para acceder a los atributos deben ser publicos en la otra clase
        persona1.nombre = "Ester";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio en el nombre es: "+ persona1.nombre);
        persona1 = cambiarElValor(persona1); // llamamos a la clase
        //Persona persona2 = null;
        Persona persona2 = new Persona(); // Llamamos al constructor
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor es: "+ persona2.nombre);
    }
    // para acceder por referencia le devemos pasar la referencia
    public static void cambiarValor(Persona persona){
        persona.nombre = "María";
    }
    public static Persona cambiarElValor(Persona persona){
        if (persona == null){
            // Si se cumple la condicion retorna null, sinó el else
            System.out.println("El valor de persona es invalido: Null");
            return null;
        }
        else{
            persona.nombre = "Monica";
            // poner el return al final, anula el resto del codigo
            return persona;
        }
    }
}
