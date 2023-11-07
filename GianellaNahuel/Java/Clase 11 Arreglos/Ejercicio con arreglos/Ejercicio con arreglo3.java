* Ejercicio  3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, 
  la media de los negativos y contar el número de ceros
     */
        Scanner media = new Scanner(System.in);
        int numeros3[] = new int[5]; 
        for(int i = 0; i < numeros3.length; i++) {
            System.out.print("Digite el número " + (i + 1) + ": ");
            numeros3[i] = media.nextInt();
        }
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
               for (int numero : numeros3) {
                if (numero > 0) {
                    sumaPositivos += numero;
                    cantidadPositivos++;
                } else if (numero < 0) {
                    sumaNegativos += numero;
                    cantidadNegativos++;
                } else {
                    cantidadCeros++;
                }
            }
        double mediaPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos / cantidadNegativos : 0;
        
        System.out.println("La media de números positivos: " + mediaPositivos);
        System.out.println("La media de números negativos: " + mediaNegativos);
        System.out.println("La cantidad de ceros: " + cantidadCeros);
    }
}



