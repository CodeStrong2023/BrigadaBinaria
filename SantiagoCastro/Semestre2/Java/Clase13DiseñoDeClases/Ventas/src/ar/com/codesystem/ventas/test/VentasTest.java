//SantiagoC//
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Remera",7000.00);
        Producto producto2 = new Producto("Zapatillas",35000.00);
        Producto producto3 = new Producto("Medias",500.00);
        Producto producto4 = new Producto("Bermuda",8000.00);
        Producto producto5 = new Producto("Campera",15000.00);
        Producto producto6 = new Producto("Cinturon",3500.00);
        Producto producto7 = new Producto("Buzo",18000.00);
        Producto producto8 = new Producto("Gorra",3000.00);
        Producto producto9 = new Producto("Cadena",7900.00);
        Producto producto10 = new Producto("Cargo",20000.00);
        Producto producto11 = new Producto("Falda",15500.00);
        Producto producto12 = new Producto("Polera",17000.00);
        
        Orden orden1 = new Orden();
        //Se agregan los productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //Se muestra el total de la compra y los productos
        orden1.muestraOrden();
        
        Orden orden2 = new Orden();
        //Se agregan los productos al arreglo
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        //Se muesta el total y los productos de la compra
        orden2.muestraOrden();
        
        Orden orden3 = new Orden();
        //Se agregan los productos al arreglo
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto10);
        //Se muesta el total y los productos de la compra
        orden3.muestraOrden();
        
        Orden orden4 = new Orden();
        //Se agregan los productos al arreglo
        orden4.agregarProducto(producto7);
        orden4.agregarProducto(producto8);
        orden4.agregarProducto(producto9);
        orden4.agregarProducto(producto10);
         orden4.agregarProducto(producto11);
        orden4.agregarProducto(producto12);
        //Se muesta el total y los productos de la compra
        orden4.muestraOrden();
    }
}
