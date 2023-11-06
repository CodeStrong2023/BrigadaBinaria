package caja;

public class Caja { //Clase Publica caja 
    //Atributos(Caracteristicas)
    int ancho; 
    int alto; 
    int profundo; 
    //Métodos y constructores(Acciones)
    public Caja() { //constructor 1=vacío
    }
    public Caja(int ancho, int alto, int profundidad) {//constructor 2 
        this.ancho = ancho; 
        this.alto = alto; 
        this.profundo = profundidad; 
    }
    public int calcularVolumen() { //Método para calcular el volumen 
        return volumen = ancho * alto * profundo; 
    
    }
}
