package test;

import Operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(54, 87);
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(23.4,52.1); // si es entero llama al metodo int (enteros)
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(8,9l); // metodo int no soporta long, por eso llama al metodo double
        System.out.println("resultado3 = " + resultado3);
    }
}
