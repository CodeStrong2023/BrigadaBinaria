package Operaciones; 

public class Aritmetica { //se escriben en PascalCase
    //Atributos de la clase
    int a; 
    int b; 
    //métodos de la clase 
    public void sumarNumeros() { //se escriben en camelCase
        int resultado = (a + b); 
        System.out.println("El resultado es " + resultado);
    }
    public int sumarConRetorno() {
        int resultado = a+b; 
        return resultado; 
    }
    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1; 
        b = arg2; 
        //this.b = arg2; también se puede utilizar el operador this
        //return arg1+arg2; 
        return this.sumarConRetorno(); //solo se puede llamar a métodos que comparten la misma clase
    }
}