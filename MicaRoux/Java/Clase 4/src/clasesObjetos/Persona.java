package clasesObjetos;
public class Persona {
    //las clases son una plantilla 
    //(son un conjunto de objetos que comparten una estructura y comportamiento común) {
        //Atributos (características)
        public String nombre; 
        public String apellido; //los hacemos públicos para importarlos desde otro paquete y clase
        public int edad; 
        //Métodos de la clase (Acciones) 
        //los valores se cnocen como argumentos
        public void obtenerInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Edad: " + edad);
    }
}
