package Ciclos;

public class For {
    public static void main(String[] args) {

        //Primer epacio define la variable
        //Segundo espacio la condicion
        //Tercer espacio el incremento o decremento de la variable

        System.out.println("Palabra break");
        //Las etiquetas se ponen en el lugar donde las necesitamos
        //usamos las etiquetas junto con break y continue

        for(var contador=0 ;contador<10 ;contador++ ){
            if(contador %2 == 0) {
                System.out.println("contador = " + contador);
                break;   // rompe la estructura
                        // Salta al siguiente codigo si la primera posicion cumple con el if
            }
        }

        System.out.println("Palabra continue");
        //Colocamos etiqueta donde la necesitamos
        inicio:
        for(var contador=0 ;contador<10 ;contador++ ){
            if(contador %2 != 0) {
                continue inicio;   // va a la siguiente iteracion
            }
            System.out.println("contador = " + contador);
        }
    }
}
