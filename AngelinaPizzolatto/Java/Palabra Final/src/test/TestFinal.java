package test;

import domain.Persona;

/* Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique:
 * variables: Evita cambiar le valor que almacena la variable
 * métodos: Evita que se modifique la definición o el comportamiento 
    de un método desde una subclase(hija)
 * clases : Evita que se creen clases hijas 
 Otra característica es que normalmente, cuando trabajamos con variables 
 se combina con el modificadro de acceso estático para convertir 
 una variable constante, es decir que no se puede modificar su valor, 
 un ejemplo de esto es la clase Math en la cual todos sus atributos
 son de tipo static y final, es por esto que la variable pi* se conoce 
 como una constante. 
 */

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 46547662; 
        System.out.println("miDni = " + miDni);
        //miDni = 18548853;  no se le puede reasignar un valor, ya que es una variable del tipo final (no se puede cambiar)
        //Persona.CONSTANTE_AQUI = 9; //No se modifica 
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI );

        final Persona persona1 = new Persona(); //crea el constructor vacío por default
        persona1.setNombre("Angelina");
        System.out.println("persona1 nombre: " + persona1.getNombre()); //no se puede modificar la referencia, pero si el valor del atributo
        persona1.setNombre("Martina"); 
        System.out.println("persona1 nombre: " + persona1.getNombre()); //no se puede hacer una nueva referncia para un nuevo objeto 
    } 
}
