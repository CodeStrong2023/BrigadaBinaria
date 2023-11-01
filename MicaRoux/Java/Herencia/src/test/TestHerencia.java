package test; 
import domain.Empleado;
import domain.Cliente;
import domain.Persona; 
import java.util.Date; 

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Lucía", 100000); 
        System.out.println("Empleado: " + empleado1);
        //Si no pasamos argumentos utiliza el de la clase padre nulos
        Cliente cliente1 = new Cliente(new Date(), true, "Ampi", 'F', 19, "Sarmiento 3404");
        System.out.println("Cliente: = " + cliente1);

        Persona persona1 = new Persona(); 
    }
}