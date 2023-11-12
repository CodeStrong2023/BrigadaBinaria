package test;

public class TesArreglos {
    public static void main(String[] args) {
        int edades[] = new int[5];  // Derecha instanciamos los elementos
        edades[0] = 12;
        System.out.println("edades = " + edades[0]);
        edades[1] = 23;
        edades[2] = 43;
        System.out.println("valores sin modificar indice 1: "+edades[1]+ " indice 2: "+edades[2]);
        edades[1] = 16;
        edades[2] = 55;
        System.out.println("valores sin modificar indice 1: "+edades[1]+ " indice 2: "+edades[2]);
        // edades[5] = 34;
        // System.out.println(edades[5]);   si se pasa del rango da error, los indices comienzan desde 0

        for(int i = 0; i < edades.length; i++){
            System.out.println("Indice "+ i +" : "+edades[i]);
        }
    }
}
