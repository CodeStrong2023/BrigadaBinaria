package domain;

public class Persona {
    // Atributos de herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    // constructor vacio: crear objetos in inicializar los atributos
    public Persona(){ // Constructor 1
    }
    public Persona(String nombre){ //Constructor 2
        this.nombre = nombre;
    }   // Constructor 2

    // Sobrecarga de constructores: coinciden en nombres como en el modificador public
    // tenemos 2 o mas constructores en una misma clase
    public Persona(String nombre, char genero, int edad, String direccion) { //Constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getEdad() {
        return edad;
    }
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    public char getGenero() {
        return genero;
    }
    public Persona setGenero(char genero) {
        this.genero = genero;
        return this;
    }
    public String getNombre() {
        return nombre;
    }
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}