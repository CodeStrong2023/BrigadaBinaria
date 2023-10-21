package domain;

public class Empleado extends Persona {
    //Clase hija de Persona
    //Herencia simple (solo una clase)
    private int idEmpleado; 
    private double sueldo; 
    private static int contadorEmpleado; //para incrementar

    //Constructor 1 
    public Empleado(){ //constructor vacío
         this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    public Empleado(String nombre, double sueldo) {
        //super(nombre);  podemos utilizar super o this, pero NUNCA AMBOS
        this();  //llamamos a un constructor vacío(interno)
        this.nombre = nombre; 
        this.sueldo=sueldo;
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
        StringBuilder sb = new StringBuilder(); 
        sb.append("Empleado {idEmpleado=}").append(idEmpleado); 
        sb.append(", sueldo=").append(sueldo); 
        sb.append(", ").append(super.toString()); 
        sb.append('}');
        return sb.toString(); 
    }
}
