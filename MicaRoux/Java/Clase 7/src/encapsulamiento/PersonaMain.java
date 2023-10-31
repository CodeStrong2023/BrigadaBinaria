package encapsulamiento;
//Encapsulamiento parte2
public class PersonaMain {
    public static void main(String[] args) {
        // Creamos una persona y le asignamos un nombre
        Persona persona1 = new Persona("Martina", 50000, true); 
        //Mostramos los datos del objeto persona1
        System.out.println("Nombre de persona1: " + persona1.getNombre());
        System.out.println("Sueldo de persona1: " + persona1.getSueldo());
        System.out.println("Boolean de persona1: " + persona1.isEliminado());
        //Cambiamos el sueldo de la persona1
        persona1.setSueldo(100000); 
        //Mostramos el nuevo valor que tiene la variable sueldo de persona1
        System.out.println("\nNuevo Sueldo de persona1: "+persona1.getSueldo());

        /*Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial e imprimir
        luego modificar sus valores y volver a imprimir */
        
        Persona persona2 = new Persona("Angelina",1000,false);
        //Mostramos los datos 
        System.out.println("\nNombre de persona2 " + persona2.getNombre());
        System.out.println("Sueldo de persona2 " + persona2.getSueldo());
        System.out.println("Boolean de persona2 " + persona2.isEliminado());
        //Modificamos los valores 
        persona2.setNombre("Ornella"); 
        persona2.setSueldo(5000); 
        persona2.setEliminado(true);
        //Mostramos los nuevos valores del objeto 
        System.out.println("\nNuevo nombre de persona2: "+persona2.getNombre());
        System.out.println("Nuevo sueldo de persona2: "+persona2.getSueldo());
        System.out.println("Nuevo boolean de persona2: "+persona2.getSueldo());

        //MÉTODO TO STRING 
        //El método to string nos permite imprimir el estado del objrto en cualquier momento
        System.out.print("\npersona1: " + persona1.toString());
        System.out.println("\npersona1 = " + persona1);

    }
}
