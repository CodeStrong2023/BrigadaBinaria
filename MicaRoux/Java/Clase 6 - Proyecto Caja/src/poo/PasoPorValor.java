package poo;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 20; 
        System.out.println("x = " + x);
        cambioValor(x); //esto es una copia
        System.out.println("x = " + x);
    }
    public static void cambioValor(int arg1) {
        System.out.println("arg1: " + arg1);
        arg1 = 34; //no lo muestra
    }
}
