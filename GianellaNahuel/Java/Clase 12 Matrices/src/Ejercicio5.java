//Ejercicio  5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
de cada fila y cada columna
    Scanner suma = new Scanner(System.in);

                System.out.print("digite el número de filas (n): ");
        int n = suma.nextInt();
        System.out.print("digite el número de columnas (m): ");
        int m = suma.nextInt();
        int[][] matriz3 = new int[n][m];

        System.out.println("Digite los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz3[i][j] = suma.nextInt();
            }
        }
        System.out.println("\nMatriz ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }
