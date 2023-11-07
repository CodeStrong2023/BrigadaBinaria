//Ejercicio  4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos  de la diagonal principal sean 1 y el resto 0
        Scanner diagonal = new Scanner(System.in); 
        int matriz2[][] = new int[7][7]; 
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i == j) {
                    matriz2[i][j] = 1;
                }
                else{
                    matriz2[i][j] = 0;
                }
            }
        }
        System.out.print("\nMATRIZ CON SU DIAGONAL DE 1\n");
    for (int i=0 ;i<7 ;i++){
        for (int j=0 ;j<7 ;j++) {
            System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
