package Operadores;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var b = 6;   // Variables locales
        var a =12;  // Memoria stack
        miMetodo(); // Llamamos al nuevo método
        Aritmetica aritmetica1 = new Aritmetica();  // constructor 1 se crea primero
                                                    // New crea un espacio en la memoria, inicializa los atributos

        aritmetica1.a =5;
        aritmetica1.b =8;
        aritmetica1.sumarNumeros();

        // Para almacenar un objeto se utiliza la memoria heap
        System.out.println("aritmetica1 a = " + aritmetica1.a);
        System.out.println("aritmetica1 b = " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(a,b);   // llamamos al construcor 2
        System.out.println("aritmetica2 a= " + aritmetica2.a);
        System.out.println("aritmetica2 b= " + aritmetica2.b);

    }

    public static void miMetodo(){
        int a = 8;  // Una variable está limitada
        System.out.println("Aquí hay otro método");
    }
}
