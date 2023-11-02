/*
Ejercicio 1: Crear otro objeto de tipo Persona, asignar valores de manera inicial
e imprimir , luego modificar sus valores y volver a imprimir
 */
package Persona;

public class Persona {
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Constructor
    public Persona(String nombre,double sueldo,boolean elimnado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public boolean isEliminado(){
        return eliminado;
    }
    public void setEliminado(boolean elimnado){
        this.eliminado = eliminado;
    }
    
}
