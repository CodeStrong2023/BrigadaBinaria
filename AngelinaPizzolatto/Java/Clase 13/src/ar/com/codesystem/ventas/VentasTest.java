package ar.com.codesystem.ventas;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Buzo Lacoste", 70000.00);
        Producto producto2 = new Producto("Remera Ralph Lauren", 30000.00);

        Orden orden1 = new Orden();
        //Agregamos productos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        //Tarea
        //Crear más objetos del tipo Producto = 10
        //ROPA 
        Producto producto3 = new Producto("Zapatillas Nike", 100000.00);
        Producto producto4 = new Producto("Camisa Zara", 35000.00);
        Producto producto5 = new Producto("Sweater H&M", 34000.00);
        Producto producto6 = new Producto("Buzo Levis", 23000.00);
        Producto producto7 = new Producto("Zapatillas Dior", 90000.00);
        //ACCESORIOS 
        Producto producto8 = new Producto("Aros Swarovski", 23000.00);
        Producto producto9 = new Producto("Bufanda Dior", 90000.00);
        Producto producto10 = new Producto("Lentes Balenciaga", 130000.00);
        Producto producto11 = new Producto("Labial Givenchy", 20000.00);
        Producto producto12 = new Producto("Perfume Giorgio Armani", 75000.00);

        //Crear más objetos del tipo Orden = 2 
        Orden orden2 = new Orden(); //orden de ropa
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);

        Orden orden3 = new Orden(); //orden de accesorios
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto12);

        //Imprimimos el total de la compra por cada una de las órdenes
        System.out.println("Calculamos el total de todos los productos ROPA");
        double totalPrendas = orden2.calcularTotal();
        System.out.println("El total de todas las prendas es de: " + totalPrendas);

        System.out.println("Calculamos el total de todos los productos ACCESORIOS");
        double totalAccesorios = orden3.calcularTotal();
        System.out.println("El total de todas las prendas es de: " + totalAccesorios);
    }
}
