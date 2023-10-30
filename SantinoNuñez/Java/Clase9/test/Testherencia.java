package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class Testherencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Santino", 450000);
        System.out.println("empleado1 = " + empleado1);

        Date fecha1 = new Date();
        Cliente cliente1 = new Cliente(fecha1,true,"Sofía",'F',37,"Mendoza");
        System.out.println("cliente1 = " + cliente1);
    }
}
