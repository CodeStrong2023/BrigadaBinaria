package domain; 

public class Persona {
    public final static int CONSTANTE_AQUI = 15; //es una constante y no se puede modificar
    private String nombre; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    public void imprimir() {
        System.out.println("Hola, soy una persona");
    }
}