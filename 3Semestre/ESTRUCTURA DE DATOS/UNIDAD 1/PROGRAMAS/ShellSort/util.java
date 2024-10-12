public class util {
	// Función que implementa el algoritmo de Shell Sort
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Empezamos con un "gap" que es la mitad del tamaño del array
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Recorremos el array desde el índice gap hasta el final
            for (int i = gap; i < n; i++) {
                // Guardamos el valor actual
                int temp = arr[i];

                // Comparamos y reordenamos los elementos separados por el "gap"
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    // Desplazamos hacia adelante el valor si es mayor que temp
                    arr[j] = arr[j - gap];
                }

                // Insertamos el valor guardado en su posición correcta dentro del subgrupo
                arr[j] = temp;
				System.out.println(showMatriz(arr));
            }
        }
    }
	public static void ordenarQuicksort(float[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particion(arreglo, bajo, alto);

            ordenarQuicksort(arreglo, bajo, indicePivote - 1); 
            ordenarQuicksort(arreglo, indicePivote + 1, alto); 
        }
    }

	static float numerosRepetidos (float[] arreglo){
		float calificacionMRepi = 0;
		ordenarQuicksort(arreglo, 0, arreglo.length-1);
		int contador = 1;
		for (int i = 1; i < arreglo.length; i++){
			if (arreglo[i-1]!=arreglo[i]){
				contador++;
			}
		}
		float arregloSinRepit [] = new float [contador];
		int contadores[] = new int[contador];
		contadores[0] = 0;
		int j = 1;
		int k = 0;
		arregloSinRepit[0]=arreglo[0];
		for (int i = 1; i < arreglo.length; i++){
			if (arreglo[i-1]!=arreglo[i]){
				arregloSinRepit[j] = arreglo[i];
				j++;
			}
		}
		for (int i = 1; i < arreglo.length; i++){
			if (arreglo[i-1]==arreglo[i]){
				contadores[k]++;
			}
			else {
				k++;
				contadores[k] = 0;
                contadores[k] ++;
			}
		}
		int ubicacion = 0;
		calificacionMRepi = contadores[0];
		for (int i = 1; i < contadores.length; i++){
			if (contadores[i]>calificacionMRepi){
				ubicacion = i;
				calificacionMRepi = contadores[i];
            }
		}
		return arregloSinRepit[ubicacion]; 
	}
	static float cantidadRepetida (float[] arreglo){
		float calificacionMRepi = 0;
		ordenarQuicksort(arreglo, 0, arreglo.length-1);
		int contador = 1;
		for (int i = 1; i < arreglo.length; i++){
			if (arreglo[i-1]!=arreglo[i]){
				contador++;
			}
		}
		float arregloSinRepit [] = new float [contador];
		int contadores[] = new int[contador];
		contadores[0] = 0;
		int j = 1;
		int k = 0;
		arregloSinRepit[0]=arreglo[0];
		for (int i = 1; i < arreglo.length; i++){
			if (arreglo[i-1]!=arreglo[i]){
				arregloSinRepit[j] = arreglo[i];
				j++;
			}
		}
		for (int i = 1; i < arreglo.length; i++){
			if (arreglo[i-1]==arreglo[i]){
				contadores[k]++;
			}
			else {
				k++;
				contadores[k] = 0;
                contadores[k] ++;
			}
		}
		calificacionMRepi = contadores[0];
		for (int i = 1; i < contadores.length; i++){
			if (contadores[i]>calificacionMRepi){
				calificacionMRepi = contadores[i];
            }
		}
		return calificacionMRepi; 
	}
	private static int particion(float[] arreglo, int bajo, int alto) {
        float pivote = arreglo[alto];  
        int i = bajo - 1;  

        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                float temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }

        float temporal = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temporal;

        return i + 1;
    }

	public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }

	public static void ordenamientoBurbuja(float[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    float temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }

	static float media (float [] pMatriz) {
		float max = pMatriz.length;
		float suma = 0;
		float promedio = 0;
		for (int i = 0; i < max; i++) {
			suma += pMatriz[i];
        }
		promedio = suma / max;
		return promedio;
	}

	static float mediana (float [] pMatriz) {
		int medio = pMatriz.length/2;
		ordenamientoBurbuja(pMatriz);
		if (pMatriz.length%2 != 0) {
			return pMatriz[medio];
		} else {
			return (pMatriz[medio] + pMatriz[medio+1]) / 2.0f;
		}
	}

	static float varianza (float [] pMatriz){
		float max = pMatriz.length;
		float suma = 0;
		float promedio = media(pMatriz);
		float varianza = 0;
		for (int i = 0; i < max; i++) {
			suma += Math.pow(pMatriz[i]-promedio, 2);
        }
		varianza = suma / max;
		return varianza;
	}
	
	static String showMatriz (int [] pMatriz) {
		String matrizPrint = "[ ";
		for ( int i = 0; i<pMatriz.length; i++) {
			if (i == (pMatriz.length-1) ) {
				matrizPrint += String.format(" %3d ", pMatriz[i]);
			} else {
				matrizPrint += String.format(" %3d ,", pMatriz[i]);
			}
		}
		matrizPrint += "]";
		return matrizPrint;
	}
	
	static String showMatriz (int [][] pMatriz) {
		String matrizPrint = "";
		for ( int i=0; i<pMatriz.length;i++) {
			for( int j=0; j<pMatriz[i].length; j++ ) {
				 matrizPrint += String.format("[ %3d   ]", pMatriz[i][j]);
				if (j==(pMatriz[i].length-1)) {
					matrizPrint += "\n";
				}
			}
		}
		
		return matrizPrint;
		
	}
	
	static String Union (int [][] pMatrizA, int [][] pMatrizB) {
		String matrizPrint = "";
		matrizPrint += "UNION DE LAS MATRICES \n"
				     + "{";
		
		for ( int i=0; i<pMatrizA.length;i++) {
			for( int j=0; j<pMatrizA[i].length; j++ ) {
				matrizPrint += String.format(" %3d ,", pMatrizA[i][j]);
			}
		}
		
		for ( int i=0; i<pMatrizB.length;i++) {
			for( int j=0; j<pMatrizB[i].length; j++ ) {
				if (i == (pMatrizB.length-1) && j==(pMatrizB[i].length-1) ) {
					matrizPrint += String.format(" %3d ", pMatrizB[i][j]);
				} else {
					matrizPrint += String.format(" %3d ,", pMatrizB[i][j]);
				}
			}
		}
		matrizPrint += "}";
		
		return matrizPrint;
		
	}
	
	static void Interseccion (int[][] pMatrizA, int[][] pMatrizB ) {
		int contador=0;
		int filasA = pMatrizA.length;
		int columnasA = pMatrizA[0].length;
		int filasB = pMatrizA.length;
		int columnasB = pMatrizB[0].length;
		int m= 0;
		int [] NuevaMatrizA = new int [filasA * columnasB];
		int a=  0;
		int [] NuevaMatrizB = new int [filasB * columnasB];
		int b=  0;
		
		//CONVERSION DE ARREGLOS BIDIMENSIONALES A UNIDIMENSIONALES
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                NuevaMatrizA[a] = pMatrizA[i][j];
                a++;
            }
        }
		
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                NuevaMatrizB[b] = pMatrizB[i][j];
                b++;
            }
        }
		ordenamientoBurbuja(NuevaMatrizA);
		ordenamientoBurbuja(NuevaMatrizB);
		
		for (int i=0; i < NuevaMatrizA.length ; i++ ) {
			for (int j=0; j< NuevaMatrizB.length; j++)
				if(NuevaMatrizA[i]==NuevaMatrizB[j]) {
					j=(NuevaMatrizB.length-1);
					contador++;
				}
		}
		int [] InterseccionM = new int[contador];
		for (int i=0; i<NuevaMatrizA.length; i++ ) {
			for (int j=0; j<NuevaMatrizB.length; j++)
				if(NuevaMatrizA[i]==NuevaMatrizB[j]) {
					InterseccionM[m]= NuevaMatrizA[i];
					j=(NuevaMatrizB.length-1);
					m++;
				}
		}
		
		String matrizPrint = "";
		matrizPrint += "INTERSECCION DE LAS MATRICES \n"
				     + "{";
		for ( int i=0; i<InterseccionM.length;i++) {
			if (i == (InterseccionM.length-1)) {
				matrizPrint += String.format(" %3d ", InterseccionM[i]);
			} else {
				matrizPrint += String.format(" %3d ,", InterseccionM[i]);
			}
		}
		matrizPrint += "}";
		System.out.println(matrizPrint);
		
	}

	static void ComplementoB (int[][] pMatrizA, int[][] pMatrizB ) {
		int contador=0;
		int filasA = pMatrizA.length;
		int columnasA = pMatrizA[0].length;
		int filasB = pMatrizA.length;
		int columnasB = pMatrizB[0].length;
		int m= 0;
		int [] NuevaMatrizA = new int [filasA * columnasB];
		int a=  0;
		int [] NuevaMatrizB = new int [filasB * columnasB];
		int b=  0;
		
		//CONVERSION DE ARREGLOS BIDIMENSIONALES A UNIDIMENSIONALES
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                NuevaMatrizA[a] = pMatrizA[i][j];
                a++;
            }
        }
		
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                NuevaMatrizB[b] = pMatrizB[i][j];
                b++;
            }
        }
		ordenamientoBurbuja(NuevaMatrizA);
		ordenamientoBurbuja(NuevaMatrizB);
		
		for (int i=0; i < NuevaMatrizA.length ; i++ ) {
			for (int j=0; j< NuevaMatrizB.length; j++)
				if(NuevaMatrizA[i]==NuevaMatrizB[j]) {
					break;
				} else {
					if(j==(NuevaMatrizB.length-1)) {
						contador++;
					}
				}
		}
		int [] ComplementoM = new int[contador];
		for (int i=0; i<NuevaMatrizA.length; i++ ) {
			for (int j=0; j<NuevaMatrizB.length; j++)
				if(NuevaMatrizA[i]==NuevaMatrizB[j]) {
					ComplementoM[m]= NuevaMatrizA[i];
					break;
				} else {
					if(j==(NuevaMatrizB.length-1)) {
						ComplementoM[m]= NuevaMatrizA[i];
						m++;
					}
					
				}
		}
		
		String matrizPrint = "";
		matrizPrint += "COMPLEMENTO DE LA MATRIZ B \n"
				     + "{";
		for ( int i=0; i<ComplementoM.length;i++) {
			if (i == (ComplementoM.length-1)) {
				matrizPrint += String.format(" %3d ", ComplementoM[i]);
			} else {
				matrizPrint += String.format(" %3d ,", ComplementoM[i]);
			}
		}
		matrizPrint += "}";
		System.out.println(matrizPrint);
		
	}
	
	static void ComplementoA (int[][] pMatrizA, int[][] pMatrizB ) {
		int contador=0;
		int filasA = pMatrizA.length;
		int columnasA = pMatrizA[0].length;
		int filasB = pMatrizA.length;
		int columnasB = pMatrizB[0].length;
		int m= 0;
		int [] NuevaMatrizA = new int [filasA * columnasB];
		int a=  0;
		int [] NuevaMatrizB = new int [filasB * columnasB];
		int b=  0;
		
		//CONVERSION DE ARREGLOS BIDIMENSIONALES A UNIDIMENSIONALES
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                NuevaMatrizA[a] = pMatrizA[i][j];
                a++;
            }
        }
		
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                NuevaMatrizB[b] = pMatrizB[i][j];
                b++;
            }
        }
		ordenamientoBurbuja(NuevaMatrizA);
		ordenamientoBurbuja(NuevaMatrizB);
		
		for (int i=0; i < NuevaMatrizB.length ; i++ ) {
			for (int j=0; j< NuevaMatrizA.length; j++)
				if(NuevaMatrizB[i]==NuevaMatrizA[j]) {
					break;
				} else {
					if(j==(NuevaMatrizA.length-1)) {
						contador++;
					}
				}
		}
		int [] ComplementoM = new int[contador];
		for (int i=0; i<NuevaMatrizB.length; i++ ) {
			for (int j=0; j<NuevaMatrizA.length; j++)
				if(NuevaMatrizB[i]==NuevaMatrizA[j]) {
					ComplementoM[m]= NuevaMatrizB[i];
					break;
				} else {
					if(j==(NuevaMatrizA.length-1)) {
						ComplementoM[m]= NuevaMatrizB[i];
						m++;
					}
					
				}
		}
		
		String matrizPrint = "";
		matrizPrint += "COMPLEMENTO DE LA MATRIZ A \n"
				     + "{";
		for ( int i=0; i<ComplementoM.length;i++) {
			if (i == (ComplementoM.length-1)) {
				matrizPrint += String.format(" %3d ", ComplementoM[i]);
			} else {
				matrizPrint += String.format(" %3d ,", ComplementoM[i]);
			}
		}
		matrizPrint += "}";
		System.out.println(matrizPrint);
		
	}
	
	
}
