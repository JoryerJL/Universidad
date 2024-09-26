public class Ordenamiento {
    public static void ordenamientoBurbujaBidimensional(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Convertir la matriz bidimensional a un arreglo unidimensional para simplificar el ordenamiento
        int[] arregloUnidimensional = new int[filas * columnas];
        int indice = 0;

        // Pasar los elementos de la matriz bidimensional al arreglo unidimensional
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arregloUnidimensional[indice] = matriz[i][j];
                indice++;
            }
        }

        // Aplicar el ordenamiento burbuja en el arreglo unidimensional
        for (int i = 0; i < arregloUnidimensional.length - 1; i++) {
            for (int j = 0; j < arregloUnidimensional.length - i - 1; j++) {
                if (arregloUnidimensional[j] > arregloUnidimensional[j + 1]) {
                    // Intercambiar los elementos
                    int temporal = arregloUnidimensional[j];
                    arregloUnidimensional[j] = arregloUnidimensional[j + 1];
                    arregloUnidimensional[j + 1] = temporal;
                }
            }
        }

        // Volver a pasar los elementos del arreglo unidimensional a la matriz bidimensional
        indice = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = arregloUnidimensional[indice];
                indice++;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {64, 34, 25},
            {12, 22, 11},
            {90, 45, 38}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        ordenamientoBurbujaBidimensional(matriz);

        System.out.println("Matriz ordenada:");
        imprimirMatriz(matriz);
    }
}

