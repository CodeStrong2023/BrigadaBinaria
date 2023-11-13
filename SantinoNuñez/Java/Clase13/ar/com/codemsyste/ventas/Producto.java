package ar.com.codemsyste.ventas;

import java.util.StringJoiner;

public class Producto {
    // Atributos de la clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    // Contador vacio
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    public Producto(String nombre, double precio){
        this(); // Llamamos al constructor vacio  para el aumento de idProducto
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }

    public Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Producto.class.getSimpleName() + "[", "]")
                .add("idProducto=" + idProducto)
                .add("nombre='" + nombre + "'")
                .add("precio=" + precio)
                .toString();
    }
}
