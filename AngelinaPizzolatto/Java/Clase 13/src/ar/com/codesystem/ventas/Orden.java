package ar.com.codesystem.ventas;

public class Orden {
    private int idOrden; 
    private Producto productos[]; //arreglo
    private static int contadorOrdenes; 
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor vacío 
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes; 
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto; 
        }
        else{
            System.out.println("La orden tiene límite de " + Orden.MAX_PRODUCTOS);
        }
    }
    public double calcularTotal() {
        double total = 0; //variable temporal
        for (int i=0; i < this.contadorProductos; i++){
            //Producto producto = this.productos[i]; 
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio(); 
        }
        return total; 
    }

    public void mostrarOrden() {
        System.out.print("ID Orden: " + idOrden); 
        double totalOrden = this.calcularTotal(); 
        System.out.println("\nTotal a pagar: $" + totalOrden);
        System.out.println("\nLista de productos");
        for (int i=0; i<this.contadorProductos; i++) {
            System.out.println((i+1)+". "+this.productos[i]); 
        }
    }
}