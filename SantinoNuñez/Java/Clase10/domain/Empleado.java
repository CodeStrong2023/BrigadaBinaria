package domain;

public class Empleado extends Persona {
    @Override
    public void imprimir() { //no se puede sobreescribir porque es un método constante
        System.out.println("Soy un empleado");
    }
}