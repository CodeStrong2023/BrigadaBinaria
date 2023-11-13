package ar.com.codesystem.ventas.test;

import ar.com.codemsyste.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalón",19000);
        Producto producto2 = new Producto("Campera",15000);

        Orden orden1 = new Orden();
        // Agregamos productos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Tarea:
        // Crear mas objetos de tipo Producto = 10
        // Crear mas objetos de tipo Orden = 2

        // Cargamos los productos
        Producto producto3 = new Producto("Vestido", 25000);
        Producto producto4 = new Producto("Zapatos deportivos", 12000);
        Producto producto5 = new Producto("Bufanda", 8000);
        Producto producto6 = new Producto("Sombrero de lana", 10000);
        Producto producto7 = new Producto("Chaqueta de cuero", 30000);
        Producto producto8 = new Producto("Calcetines de algodón", 5000);
        Producto producto9 = new Producto("Sudadera con capucha", 18000);
        Producto producto10 = new Producto("Falda plisada", 16000);
        Producto producto11 = new Producto("Gorro tejido", 7000);
        Producto producto12 = new Producto("Chaleco acolchado", 22000);

        // cargamos las orden
        System.out.println();
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto9);
        orden2.mostrarOrden();

        // Orden 3
        System.out.println();
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto4);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto12);
        orden3.mostrarOrden();


    }
}
