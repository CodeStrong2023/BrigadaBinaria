package domain;

public class Persona {
    // Atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    // Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No utilizamos el operador this
        // Asignamos un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public Persona setIdPersona(int idPersona) {
        this.idPersona = idPersona;
        return this;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
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
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}