package operaciones; 

public class Aritmetica { //se escriben en PascalCase
    //Atributos de la clase
    int a; 
    int b; 
    //métodos de la clase 
    //El constructor es un método especial 
    public Aritmetica() { //Constructor 1
        System.out.println("Se está ejecutando el constructor número 1");
        //en el primero se están omitiendo valores
    }
    //Sobrecarga de constructores
    public Aritmetica(int a, int b) { //Constructor 2 
        this.a = a; 
        this.b = b; 
        System.out.println("Se está ejecutando el constructor número 2");
        //en el segundo se están asignando valores (por eso utiliza parámetros)
    }
    //método
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
/*
 * INGENIERÍA DE JAVA (Engineer Java)
 * La memoria trabaja de manera dinámica 
 * stack tiene que ver con las variables locales
 * heap tiene que ver con los objetos y atributos
 */
