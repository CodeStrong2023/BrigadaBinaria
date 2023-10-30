package test;
import DominioEncapsulamiento.Persona;
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Santino",54000,false);
        System.out.println("persona1 = " +persona1.getNombre());
        // Modificar a traves de métodos
        persona1.setNombre("Emiliano");
        // persona1.nombre = "Emiliano"  no se puede usar, nombre es Privado
        System.out.println("persona1 nombre modificado = " +persona1.getNombre());
        System.out.println("persona1 el sueldo es = "+persona1.getSueldo());
        System.out.println("persona1 booleano = "+persona1.isEliminado());

        // Tarea: crear otro objeto tipo persona, asignar los valores de manera inicial
        // e imprimir, luego modificar sus valores y volver a imprimir

        Persona persona2 = new Persona("juan Perez",34000,true);
        System.out.println("persona2 nombre = "+persona2.getNombre());
        System.out.println("persona2 sueldo = "+persona2.getSueldo());
        System.out.println("persona2 booleano = "+persona2.isEliminado());

        //Modifico los valores
        System.out.println("valores modificados");
        persona2.setNombre("Carlos");
        persona2.setSueldo(35000);
        persona2.setEliminado(false);

        System.out.println(persona2.toString());
    }
}