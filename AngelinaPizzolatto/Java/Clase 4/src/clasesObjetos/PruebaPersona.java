package clasesObjetos;
public class PruebaPersona {
    public static void main(String[] args) {
        //el método main te permite ejecutar el programa 
        //los objetos son instancias de una clase
        Persona persona1; 
        persona1 = new Persona(); //método constructor 
        persona1.nombre = "Angelina"; 
        persona1.apellido = "Pizzolatto"; 
        persona1.edad = 18; 
        persona1.obtenerInformacion(); //el método recibe los valores y los imprime

        Persona persona2 = new Persona(); 
        persona2.nombre = "Martín"; 
        persona2.apellido = "Sarmiento"; 
        persona2.edad = 25; 
        persona2.obtenerInformacion();
    }
}
