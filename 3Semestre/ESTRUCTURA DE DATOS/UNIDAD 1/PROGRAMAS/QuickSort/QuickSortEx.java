package QuickSort;

import javax.swing.JOptionPane;

public class QuickSortEx {

    public static void main(String[] args) {
        float calificaciones[] = new float[5];
        String input;
        int opcion;
        float calficacionRepit, repit;
        String mensaje = "CALIFICACION DE LAS 5 UNIDADES :\n";
        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            String texto = "INGRESE LA CALIFICACION DE LA UNIDAD " + contador + " : ";
            input = JOptionPane.showInputDialog(texto);
            calificaciones[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            mensaje = mensaje + "UNIDAD " + contador + " : " + calificaciones[i] + "\n";    
        }
        mensaje += String.format("----MENU DE OPERACIONES----\n"
        + "1.CALIFACACION MAS REPETIDA\n"
        + "2.CANTIDAD DE VECES REPETIDA\n"
        + "3.SALIR\n"
        );
        do {
			input = JOptionPane.showInputDialog(mensaje);
			opcion = Integer.parseInt(input);
			switch (opcion) {
			case 1: {
                calficacionRepit = util.numerosRepetidos(calificaciones);
                System.out.println("CALIFICACION MAS REPETIDA : " + calficacionRepit);
				break;
			}
			case 2: {
                repit = util.cantidadRepetida(calificaciones);
                System.out.println("CALIFICACION MAS REPETIDA : " + repit);
			    break;
			}
			case 3: {
				break;
			}
			default:
				JOptionPane.showConfirmDialog(null, "Opcion inexistente");
				break;
			}
		} while (opcion!=3);
		
	}
    
}
