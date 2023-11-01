package domain;

public class Empleado extends Persona { //extend: sirve para acceder a la clase padre Persona
    // Solo clase imples, una sola clase
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;   // Para incrementar
    // Constructor
    public Empleado(){  // Constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    public Empleado(String nombre, double sueldo) { // Constructor 2
       // super(nombre);    Podemos utilizarlo o el this, nunca los 2
        this(); // Estamos llamando al constructor vacio(llamar a un constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", Persona = ").append(nombre);
        sb.append('}');
        return sb.toString();
    }
}
