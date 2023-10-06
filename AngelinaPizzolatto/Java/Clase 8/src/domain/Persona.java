package domain; 
public class Persona {
        //Atributos
        private int idPersona; 
        private static int contadorPersona; //si el contador no es estático cada vez que creamos un objeto el contador se reinicia en 0
        private String nombre; 

        //Constructor 
        public Persona(String nombre) {
            this.nombre = nombre; 
            //Se incrementa el contador por cada objeto nuevo
            Persona.contadorPersona++; //No se usa el this
            //Se le asigna un valor nuevo a la varaiable idPersona 
            this.idPersona = Persona.contadorPersona; 
        }
        //Getters and Setters
            public int getIdPersona() {
            return this.idPersona;
        }

        public void setIdPersona(int idPersona) {
            this.idPersona = idPersona;
        }

        public static int getContadorPersona() {
            return contadorPersona;
        }

        public static void setContadorPersona(int contadorPersona) {
            Persona.contadorPersona = contadorPersona;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        @Override
        public String toString() {
            return "Persona{" + "idPersona= " + idPersona + ", nombre= " + nombre +"}";
        }
}
