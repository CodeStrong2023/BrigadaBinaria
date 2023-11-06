package Operaciones;

import javax.swing.*;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    // Metodo
    public void sumarNumeros(){
        int resultado= a+b;
        System.out.println("La suma de los números es: "+ resultado);
    }
    public int sumarConRetorno(){
        int resultado = a+b;
        return resultado;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;    
        this.b = arg2;
        return this.sumarConRetorno();
    }
}
