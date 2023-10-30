public class For {
    public static void main(String[] args){ 
        //for normal 
        for (var iterador = 0; iterador<=6; iterador++){
            System.out.println("Iterador: "+ iterador); 
        }
        //for con break 
        for (var iterador = 0; iterador<=6; iterador++){
            if (iterador % 2 == 0){
                System.out.println("Pares: "+ iterador);
                break; //si dejamos el break solo muestra el primer número par 
            }
        }
        //for con continue 
        for (var iterador = 0; iterador<=6; iterador++){
            if (iterador % 2 != 0){
                continue; //Continúa con las iteraciones 
            }
            System.out.println("Números: "+ iterador); 
        }
        //Etiquetas Labels 
        inicio: 
        for (var iterador = 0; iterador<=6; iterador++){
            if (iterador % 2 == 0){
                System.out.println("Pares: "+ iterador);
                break inicio; //es como una redundancia en el código (se tiene el mismo resultado)
            }
        }
    }
}
