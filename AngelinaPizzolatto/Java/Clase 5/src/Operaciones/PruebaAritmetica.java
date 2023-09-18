package Operaciones;  

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica calculo1 = new Aritmetica(); 
        calculo1.a = 5; 
        calculo1.b = 3; 
        calculo1.sumarNumeros();

        int resultado = calculo1.sumarConRetorno(); 
        System.out.println("El resultado es " + resultado);

        resultado = calculo1.sumarConArgumentos(12,26);
        System.out.println("Resultado " + resultado);
    }
}
