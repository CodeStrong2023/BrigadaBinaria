package operaciones;  

public class PruebaAritmetica {
    public static void main(String[] args) {
        //variables locales
        int x = 10; //Memoria stack (solo almacena la referncia del objeto)
        int y = 7;  //(dentro de un método jamás podemos pasar la inferencia del tipo var como parámetro)
        miMetodo(); //llamamos al método nuevo para mostrar por consola 
        //Utilizamos el constructor N° 1 
        Aritmetica calculo1 = new Aritmetica(); 
        calculo1.a = 5; 
        calculo1.b = 3; 
        //calculo1 = null; 
        calculo1.sumarNumeros();

        //Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = calculo1.sumarConRetorno(); 
        System.out.println("El resultado es " + resultado);

        resultado = calculo1.sumarConArgumentos(12,26);
        System.out.println("Resultado con argumentos: " + resultado);

        System.out.println("calculo1 a: " + calculo1.a);
        System.out.println("calculo1 b: " + calculo1.b);

        //Utilizamos el constructor N° 2
        Aritmetica calculo2 = new Aritmetica(5,8); 
        System.out.println("calculo2 a: " + calculo2.a);
        System.out.println("calculo2 b: " + calculo2.b);
        // calculo1 = null; esto ya no se utiliza, se hace de manera automática
        //System.gc(); método garbage collector para limpiar los residuos, es muy pesado
        Persona persona = new Persona("Angelina", "Pizzolatto");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre = " + persona.nombre);
        System.out.println("Persona apellido = " + persona.apellido);
    }
    //Creamos otro método (Modularidad)
    public static void miMetodo() {
        int a = 10; //una variable está limitada 
        System.out.println("Este es otro método");
    }
}
//Los atributos tienen un alcance superior que una variable local 

//Modularidad (creamos una nueva clase, que no puede ser pública)
class Persona{
    //Atributos 
    String nombre;  
    String apellido; 
    
    Persona(String nombre, String apellido) { //Constructor
        super(); //Llamada al constructor de la clase Padre object 
        //Imprimir imprimir = new Imprimir(); como típicamente se construye un objeto 
        new Imprimir().imprimir(this); 
        this.nombre = nombre; 
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this); 
    }
}
class Imprimir {
    public Imprimir() {
        super(); //el constructor de la clase padre, para reservar memoria
    }
    public void imprimir(Persona persona) {
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}