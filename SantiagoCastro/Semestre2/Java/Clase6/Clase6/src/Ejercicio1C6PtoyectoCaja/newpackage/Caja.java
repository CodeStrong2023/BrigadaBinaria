/*
Ejercicio 1: Crear un proyecto segun las especificaciones mostradas a continuacion
La formula es: volumen=ancho*alto*profundidad
 */
package Ejercicio1C6PtoyectoCaja.newpackage;

public class Caja {
 //Atributos
  int ancho;
  int alto;
  int profundo;
  //Metodos y constructores
  public Caja () { //Contructor 1, vacio
  }
  public Caja (int ancho , int alto , int profundo){ //Contructor con parametros
      this.ancho = ancho;
      this.alto = alto;
      this.profundo = profundo;
  }
  public int calcularVolumen() { //Hacemos el calculo
      return ancho*alto*profundo;
  }
    
    
}
