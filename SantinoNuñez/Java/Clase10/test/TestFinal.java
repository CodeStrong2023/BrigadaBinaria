package test;

import domain.Persona;

/*
PALABRA FINAL
Esta palabra tiene diferentes significado dependiendo donde se aplique:

    variables: evita cambiar el valor que almacena la variabel

    metodos: evita que se modifique la definicion o el comportamiento de un
             metodo desde una subclase (hija)

    clases: evita que se creen clases hijas

Normalmente cuando trabajamos con variables se combina con el modificador de acceso estatico
para convertir una variable en una constante, es decir que no se pueda modificar su valor,
el ejemplo de esto es la clase Math en la cual todos sus atributos son de tipo static y final,
es por esto que la variable pi* se conoce como una constante.

 */
public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 46397699;
        System.out.println("miDni = " + miDni);
        // miDni = 46367288;    Marca error porque es final, no se puede modificar

        // Persona.CONSTANTE_AQUI = 8;   No se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);
    }
}
