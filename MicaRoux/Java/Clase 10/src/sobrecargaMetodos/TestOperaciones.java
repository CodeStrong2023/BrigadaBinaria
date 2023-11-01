
package sobrecargaMetodos;

public class TestOperaciones {
    public static void main(String[] args) {
    var resultadoInt = Operaciones.sumar(76,98);
    System.out.println("Suma " + resultadoInt);

    var resultadoDouble = Operaciones.sumar(839.45,245.5);
    System.out.println("Suma " + resultadoDouble);
    
    var resultado3 = Operaciones.sumar(8,6l);
    System.out.println("Suma " + resultado3);
    }
}