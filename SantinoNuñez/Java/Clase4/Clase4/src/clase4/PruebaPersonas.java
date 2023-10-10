package clase4;
public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();   // Llamamos al constructor, sirve para acceder a los atributos
        persona1.nombre = "Santino";    // Le asignamos un valor al atributo
        persona1.apellido = "Nuñez";
        persona1.obtenerInformacion();  // Llamamos al metodo que imprime la info, recive y devuelve info

        //Creamos otro objeto
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();

        persona2.nombre = "Osbaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
    }
}
