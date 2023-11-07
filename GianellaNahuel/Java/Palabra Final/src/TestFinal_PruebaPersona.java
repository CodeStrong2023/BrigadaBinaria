package test;
import domain.Persona;
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Sofia");
        System.out.println("persona = " + persona1);
        Persona persona2 = new Persona("Julian");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);

    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
