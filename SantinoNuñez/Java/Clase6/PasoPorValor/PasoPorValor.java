package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valor= 16;
        System.out.println("valor = " + valor);
        cambioValor(valor);     // Solo enviamos una copia
        System.out.println("valor = " + valor);
    }
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 24;
    }
}
