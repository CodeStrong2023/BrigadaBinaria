package clases;
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; 
        persona1 = new Persona(); //llamamos al constructor 
        persona1.nombre = "Gianella"; 
        persona1.apellido = "Nahuel"; 
        persona1.obtenerInformacion(); 
      
        Persona persona2 = new Persona(); 
        persona2.nombre = "agustina"; 
        persona2.apellido = "Martinez"; 
        persona2.obtenerInformacion();
    }
}
