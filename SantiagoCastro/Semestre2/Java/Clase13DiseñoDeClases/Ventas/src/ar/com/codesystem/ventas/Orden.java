//SantiagoC//
package ar.com.codesystem.ventas;

public class Orden {
    private int idOrden;
    //Se declara el arreglo
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; 
    
    //Constructor vacio
    public Orden (){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[contadorProductos++] = producto;
        }
        else{
            System.out.println("Se superoó el maximo de productos: "+Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void muestraOrden(){
        System.out.println("ID Orden: "+idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es de $"+totalOrden);
        System.out.println("Productos de la orden:");
        for (int i = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}