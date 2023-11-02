
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Santiago",26000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(),false,"Facundoo",'M',18,"Narciso Morales 777");
        System.out.println("cliente1 = " + cliente1);
    }
}
