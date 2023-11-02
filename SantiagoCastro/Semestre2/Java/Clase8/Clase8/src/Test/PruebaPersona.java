/*
Ejercicio 1: Crear otro objeto de tipo Persona, asignar valores de manera inicial
e imprimir , luego modificar sus valores y volver a imprimir
 */
package Test;
//importamos la clase persona
import Persona.Persona;
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Santi",16.000,false);
        //Mostramos los valores iniciales
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Sueldo: "+persona1.getSueldo());
        System.out.println("Eliminado es: "+persona1.isEliminado());
        //Modificamos el nombre con los metodos
        persona1.setNombre("Santiago");
        //Mostramos 
        System.out.println("El nombre de persona 1 es: "+persona1.getNombre());
        //Modificamos el sueldo con los metodos
        persona1.setSueldo(20.000);
        //Mostramos 
        System.out.println("El sueldo de persona 1 es: "+persona1.getSueldo());
        //Modificamos eliminado con los metodos
        persona1.setEliminado(true);
        //Mostramos 
        System.out.println("Eliminado ahora es: "+persona1.isEliminado());
        
        //CREAMOS OTRA PERSONA
        Persona persona2 = new Persona("Emiliano",100.000,true);
        //Mostramos los valores iniciales
        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Sueldo: "+persona2.getSueldo());
        System.out.println("Eliminado es: "+persona2.isEliminado());
        //Modificamos el nombre con los metodos
        persona2.setNombre("Santino");
        //Mostramos 
        System.out.println("El nombre de persona 2 es: "+persona2.getNombre());
        //Modificamos el sueldo con los metodos
        persona2.setSueldo(70.000);
        //Mostramos 
        System.out.println("El sueldo de persona 2 es: "+persona2.getSueldo());
        //Modificamos eliminado con los metodos
        persona2.setEliminado(false);
        //Mostramos 
        System.out.println("Eliminado ahora es: "+persona2.isEliminado());
        
        
    }
}
