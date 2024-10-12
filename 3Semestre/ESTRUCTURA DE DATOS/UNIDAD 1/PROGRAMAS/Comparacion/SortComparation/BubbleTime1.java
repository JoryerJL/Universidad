
public class BubbleTime1 {
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
    private static int particion(int[] arreglo, int bajo, int alto) {
        int pivote = arreglo[alto];  
        int i = bajo - 1;  

        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }

        int temporal = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temporal;

        return i + 1;
    }
    
    public static void ordenarQuicksort(int[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particion(arreglo, bajo, alto);
            vueltas++;
            ordenarQuicksort(arreglo, bajo, indicePivote - 1); 
            ordenarQuicksort(arreglo, indicePivote + 1, alto);
        }
    }
	static int vueltas = 0;
	public static int ordenarQuicksortVueltas(int[] arreglo, int bajo, int alto) {
		
        if (bajo < alto) {
            int indicePivote = particion(arreglo, bajo, alto);
            ordenarQuicksort(arreglo, bajo, indicePivote - 1); 
            ordenarQuicksort(arreglo, indicePivote + 1, alto);
        }
        return vueltas;
    }

    public static void main(String[] args) {
		int calificaciones[] = {8,7,6,5,4,3,2,1};
        String mensaje =         "---------------------------------------------------------\n";
        mensaje += String.format("|                   ARREGLO INTRODUCIDO                 |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|  %10s   |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|            VUELTAS POR METODO DE ORDENAMIENTO         |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|  QUICKSORT  |               %3d VUELTAS               |\n"
        					   + "---------------------------------------------------------\n",
        					   showMatriz(calificaciones),
        					   ordenarQuicksortVueltas(calificaciones, 0, calificaciones.length-1));
        System.out.println(mensaje);
	}
}
