package Operadores;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    // El constructor es un metodo especial
    public void sumarNumeros(){
        int resultado = a+b;
        System.out.println("resultado = " + resultado);;
    }
    public Aritmetica() {   // Constructor 1 vacio, se crea por defecto y primero que los otros
        System.out.println("Se está ejecutando el contructor 1");
    }
    // Sobrecarga de constructores
    public Aritmetica(int a,int b) {    // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando contructor 2");
    }

}