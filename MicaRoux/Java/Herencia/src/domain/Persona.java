package domain; 
public class Persona { //Clase padre de Empleado
    //Atributos de Herencia
    protected String nombre;
    protected char genero; 
    protected int edad; 
    protected String direccion; //el protected se utiliza para que una clase hija pueda acceder  
    
    //Constructor vacío: es para crear objetos sin necesidad de inicializar 
    //los atributos de la clase
    public Persona() { //Constructor 1
    }
    //A esto se lo denomina recarga de constructores, ya qeu se trata del mismo constructor con diferntes parámetros
    public Persona(String nombre){ //Constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion){ //Constructor 3
        this.nombre = nombre; 
        this.genero=genero;
        this.edad= edad;
        this.direccion=direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); 
        sb.append("Persona{nombre=}").append(nombre); 
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString()); //Si borramos esta línea no muestra el espacio de memoria
        sb.append('}');
        return sb.toString(); 
    }
}