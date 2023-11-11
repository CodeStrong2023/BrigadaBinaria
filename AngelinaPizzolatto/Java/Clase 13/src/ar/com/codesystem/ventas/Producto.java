package ar.com.codesystem.ventas; 

public class Producto {
    //Atributos de la clase
    private int idProducto; 
    private String nombre; 
    private double precio; 
    private static int contadorProductos; 

    //Constructorr vacío 
    private Producto() {
        this.idProducto = ++Producto.contadorProductos; 
    }

    public Producto(String nombre, double precio){
        this(); //Llamamos al constructor vacío para el aumento de idProducto
        this.nombre = nombre; 
        this.precio = precio; 
    }
    //Getters y Setters

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Producto{" + "idProducto = " + idProducto +", " +"nombre = " + nombre+ ", " +"precio = " + precio;
    }
}