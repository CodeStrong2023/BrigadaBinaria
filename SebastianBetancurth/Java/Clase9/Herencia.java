package Test;

import Dominio.Cliente;
import Dominio.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Sebastian", 77000.0);
        System.out.println("Empleado1 = " + empleado1);
        
        Date fecha1 = new Date();
        
        Cliente cliente1 = new Cliente(fecha1, true, "Damian", 'M', 26, "Libertador 1");
        System.out.println("Cliente1 = " + cliente1);
    }
}
