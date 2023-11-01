package caja;

public class Caja { //Clase caja 
    //Atributos
    int ancho; 
    int alto; 
    int profundo; 
    //Métodos y constructores 
    public Caja() { //constructor vacío
    }
    public Caja(int ancho, int alto, int profundidad) {//constructor con parámetros 
        this.ancho = ancho; 
        this.alto = alto; 
        this.profundo = profundidad; 
    }
    public int calcularVolumen() { //Método para calcular el volumen 
        var volumen = ancho * alto * profundo; 
        return volumen; 
    
    }
}
