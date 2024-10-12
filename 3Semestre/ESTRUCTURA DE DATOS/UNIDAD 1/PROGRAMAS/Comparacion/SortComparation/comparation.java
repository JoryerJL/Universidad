
public class comparation {
	public static void main(String[] args) {
		int calificaciones[] = {8,7,6,5,4,3,2,1};
        String mensaje =         "---------------------------------------------------------\n";
        mensaje += String.format("|                   ARREGLO INTRODUCIDO                 |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|  %10s   |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|            VUELTAS POR METODO DE ORDENAMIENTO         |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|   BURBUJA   |               %3d VUELTAS               |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|    SHELL    |               %3d VUELTAS               |\n"
        					   + "---------------------------------------------------------\n"
        					   + "|  QUICKSORT  |               %3d VUELTAS               |\n"
        					   + "---------------------------------------------------------\n",
        					   util.showMatriz(calificaciones),
        					   util.ordenamientoBurbujaVueltas(calificaciones),
        					   util.shellSortVueltas(calificaciones),
        					   util.ordenarQuicksortVueltas(calificaciones, 0, calificaciones.length-1));
        System.out.println(mensaje);
	}

}
		
	