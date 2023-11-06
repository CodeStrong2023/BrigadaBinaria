package operaciones; 

public class Aritmetica { 
    int a; 
    int b; 
    public Aritmetica() { 
        System.out.println("Se está ejecutando el constructor número 1");
    }
    public Aritmetica(int a, int b) {  
        this.a = a; 
        this.b = b; 
        System.out.println("Se está ejecutando el constructor número 2");
    }
    
    public void sumarNumeros() { 
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
        
        return this.sumarConRetorno(); 
    }
}
