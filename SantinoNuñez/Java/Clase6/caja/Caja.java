package caja;
/*
Proyecto caja:
Ejercicio 1: crear un proyecto con las especificaciones mostradas a contnuación
La formula es: volumen = ancho * alto * profundidad
*/
public class Caja {
    // Atributos
    int ancho;
    int alto;
    int profundidad;
    public Caja(){

    }    // constructor vacio
    public Caja(int ancho,int alto,int profundidad){ // constructor con parametros
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    // Calculo
    public int calculoCaja(){
        return ancho * alto * profundidad;
    }
}
