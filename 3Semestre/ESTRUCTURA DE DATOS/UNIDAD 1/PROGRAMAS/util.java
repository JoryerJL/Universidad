
public class util {
	
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
