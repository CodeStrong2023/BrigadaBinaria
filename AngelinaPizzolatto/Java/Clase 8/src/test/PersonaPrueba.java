package test; 
import domain.Persona; 

public class PersonaPrueba {
    private int contador; 
    public static void main(String[] args) { //el método main es estático
        Persona persona1 = new Persona("Angelina"); 
        System.out.println("persona1 = " + persona1);
        //el contexto estático no puede acceder al contexto dinámico 
        Persona persona2 = new Persona("Sofi"); 
        System.out.println("persona2 = " + persona2);
        mostrar(persona1);
        mostrar(persona2);  
        //this.contador = 10; No se puede refernciar desde un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());

    }

    public static void mostrar(Persona persona) { //este método es dinámico
        System.out.println("persona = " + persona);
    }

    public int getContador() {
        mostrar(new Persona("Rosario")); 
        return this.contador; 
    }
    //El contexto dinámico puede entrar al estático 
}
