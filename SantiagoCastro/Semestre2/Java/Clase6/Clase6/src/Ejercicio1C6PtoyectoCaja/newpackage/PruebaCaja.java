
package Ejercicio1C6PtoyectoCaja.newpackage;

public class PruebaCaja {
    public static void main(String[] args) {
        int medidaAncho = 3;
        int medidaAlto = 5;
        int medidaProfundo = 6;
        
        Caja caja1 = new Caja(); //Instanciamos objeto(contructor vacio)
        //Se pasan valores
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProfundo;
        //Se llama al metodo 
        int resultado = caja1.calcularVolumen();
        //Mostramos el resultado 1
        System.out.println("Resultado volumen de la caja 1: "+resultado);
        //Se llamamos al constructor 2 con nuevos argumentos
        Caja caja2 = new Caja(5,4,7);
        //Se llama al nuevo objeto al metodo para un calculo
        System.out.println("Resultado de la caja 2: "+caja2.calcularVolumen());
        
    }
}
